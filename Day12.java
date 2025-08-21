/*
*Day-12 Assignment Questions:*
1. Write a Java program to demonstrate multithreading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution.
‌
2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks.
‌
3. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20. Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).
‌
4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times. Use synchronization to avoid race conditions and display the final value.
‌
5. Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM machine, where create thread to check the PIN number, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.
/*

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
1. Write a Java program to demonstrate multithreading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution.
*/


class Threading extends Thread{

    public void run(){
        try 
	{
            for (int i = 0;i< 5;i++)
	    {
                Thread.sleep(500);
                System.out.println(getName());
            }
        } 
	catch (InterruptedException e) 
	{
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Threading t1 = new Threading();
        Threading t2 = new Threading();
        t1.setName("First Thread");
        t1.start();
        t2.setName("Second Thread");
        t2.start();
    }

}


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks.
*/

class TaskRunner implements Runnable{
   
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(Thread.currentThread().getName().equals("Code")){
                System.out.println("Running the first thread : "+Thread.currentThread().getName());
            }
            else{
                System.out.println("Running the second thread : "+Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TaskRunner(),"Code");
        Thread t2 = new Thread(new TaskRunner(),"Sleep");
        t1.start();
        t2.start();
    }

}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
3. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20. Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).
*/

class NumberPrint {
      private int number=1;
      private int Max =20;

      public synchronized void PrintOdd(){

        while(number <= Max){

            if(number %2 !=0){

                System.out.println("Print Odd Number :" + number);
                number++;
                 notify();
                
             } else {

                try {

                wait();
                

                } catch (InterruptedException e){

                    System.out.println(" " + e.getMessage());

                }
             }

        }
    }

        public synchronized void PrintEven(){ 

            while (number <= Max) {

                if(number %2==0){
                    System.out.println("Even Number : " +number);
                    number++;
                    notify();
                

                } else {
                    try {
                      wait();
                        
                    } catch(InterruptedException e){
                        System.out.println("" + e.getMessage());

                    }

                }
                
            }
        }

    public static void main(String[] args) {

        NumberPrint n = new NumberPrint();

        Thread t1 = new Thread (()-> n.PrintOdd());
        Thread t2 = new Thread (()-> n.PrintEven());

        t1.start();
       t2.start();

        
    }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times. Use synchronization to avoid race conditions and display the final value.
*/

class SharedCounter {
    private int count;

    public synchronized void increment(){
        count++;
    }

    public int getcount(){
        return count;
    }

    public static void main(String[] args) {
        
        SharedCounter s = new  SharedCounter();

        Runnable Task = () -> {
            for(int i=0;i<100;i++){
                s.increment();

            }
        };
        Thread t1 = new Thread(Task);
        Thread t2 = new Thread(Task);
        Thread t3 = new Thread(Task);

        t1.start();
        t2.start();
        t3.start();

        try {

            t1.join();
            t2.join();
            t3.join();
            
        } catch (InterruptedException e) {

            System.out.println(" " +e.getMessage());
           
        }
        System.out.println("Get Count Value : " + s.getcount());
    }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
5. Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM machine, where create thread to check the PIN number, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.
*/














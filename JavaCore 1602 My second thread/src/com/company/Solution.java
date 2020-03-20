package com.company;

/*

1602 my second thread
1. Create a public static class TestThread, inherited from the class Thread.
2. Create a static block inside TestThread, which displays in the console "it's a static block inside TestThread".
3. The run method should print to the console “it's a run method“.

Requirements:
1. Add the public static class TestThread to the Solution class.
2. The TestThread class must be inherited from the Thread class.
3. The TestThread class should not implement any additional interfaces.
4. Create a static block inside TestThread, which outputs to the console "it's a static block inside TestThread".
5. The run method of the TestThread class should output "it's a run method".
6. The main method should not be changed.


 */

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {

        static {
            System.out.println("it's a static block inside TestThread");
        }

        public void run() {
            System.out.println("it's a run method");

        }
    }
}




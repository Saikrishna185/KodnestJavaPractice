package com.sk.Threads;

public class DemoApp {
    public static void main(String[] args) {
        /*  Using ThreadType to create multiple Stack traces and Multiple Threads
            This one using ThreadType :- Refer to Demo One
            Another is using Thread :- Refer to Sample One
            Using multiple classes for multi-threading using Thread class - Approach-1
        */
//        Demo1 d1 = new Demo1();
//        Demo2 d2 = new Demo2();
//        Demo3 d3 = new Demo3();
//
//        d1.start();
//        d2.start();
//        d3.start();
        
        /* Using Single class for multi-threading using Thread class - Approach-2 */
        Demo demo1 =  new Demo();
        Demo demo2 = new Demo();
        Demo demo3 = new Demo();
        
        demo1.setName("Print");
        demo2.setName("Add");
        demo3.setName("Input"); // Not necessary as we put in if else condition & it comes under else condition.
        
        demo1.start();
        demo2.start();
        demo3.start();
        
    }
}

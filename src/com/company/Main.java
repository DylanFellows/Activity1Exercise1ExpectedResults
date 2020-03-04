package com.company;

public class Main {

    //Step 4
    public static void main(String[] args) {
        Class1 test = new Class1();

        String message = "Hello";
	    test.post(message);
    }

    //Step 1
    public interface interface1 {
        public void print(String message);
    }

    public interface interface2 {
        public void edit();
    }

    public interface interface3 {
        public void delete();
    }

    public interface interface4 extends interface1, interface2, interface3 {
        public void randomMethod();
    }

}

//Step 2
class Class1 implements Main.interface4{
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void randomMethod() {

    }

    //Step 3
    public void post(String msg) {
        print(msg);
    }
}

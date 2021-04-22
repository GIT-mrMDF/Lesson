package com.company;

interface HelloWorld{
    void Hello();
}
class Class1 implements HelloWorld {
    public void Hello() {
        System.out.println("Hello Class1!");
    }

}
class Class2 implements HelloWorld {
    public void Hello() {
        System.out.println("Hello Class2!");
    }

}
public class MainClass {
    public static void main(String[] args) {

        HelloWorld[] array = new HelloWorld[]{new Class1(), new Class2()};
        for(HelloWorld iter : array){
            iter.Hello();
        }
    }
}

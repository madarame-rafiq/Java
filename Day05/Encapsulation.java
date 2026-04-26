package Day05;

public class Encapsulation {

    //Encapsulation means when the attribute of a class is only accessible to the class itslef, it provides better security, if we want to acces or modify the private attribbutes we have to use getters and setters methods to do so.
    //Private attriutes, accessible only to this class.
    private int age;
    private String name;

    //Setter function, used to set the value of private attributes.
    public void setter(int age, String name){
        this.name = name;
        this.age = age;
        System.out.println("The values are set");
    }

    //Getter function, used to get/print the values of the private attributes.
    public void getter(){
        System.out.println("Name:- " + name);
        System.out.println("Age:- " + age);
    }

    public static void main(String[] args) {
        Encapsulation newObj = new Encapsulation();
        newObj.setter(19,"Rafiq");
        newObj.getter();
    }
}
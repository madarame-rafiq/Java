package Day03;

class Student {

    // attributes
    public String name;
    public int id;
    public int nos;

    //Default constructor
    public Student(){
        System.out.println("This is default constructor");
    }

    //Parameterized constructor
    public Student(String name, int id, int nos){
        System.out.println("This is parameterized constructor");
        this.name = name;
        this.id = id;
        this.nos = nos;
    }

    //Copy constructor
    public Student(Student obj){
        System.out.println("This is copy constructor");
        this.name = obj.name;
        this.id = obj.id;
        this.nos = obj.nos;
    }

    // methods
    public void sleep(){
        System.out.println(name + " is sleeping!");
    }

    public void fail(){
        System.out.println(name + " has failed");
    }

    public void pass(){
        System.out.println(name + " has passed");
    }

}

public class App {
    public static void main(String[] args) {

        //This lines creates memory for new object in heap.
        //Before the constructor even runs JVM fills heap as.   name -> null, id -> 0, nos -> 0
        //Then the construcotor runs and initialize the values.
        //s1 is stored in stack and it points to heap where actual object data is stored.
        Student s1 = new  Student("rafiq", 1, 5);

        System.out.println("Name:- " + s1.name);
        System.out.println("Id:- " + s1.id);
        System.out.println("Number of subjects:- " + s1.nos);

        Student s2 = new Student(s1);

        System.out.println("student created using copy constructor");
        System.out.println("Name:- " + s2.name);
        System.out.println("Id:- " + s2.id);
        System.out.println("Number of subjects:- " + s2.nos);

    }
}

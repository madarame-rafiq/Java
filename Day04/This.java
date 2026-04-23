package Day04;


//this keyword refers to current object in method or constructor.

//this keyword is often used to avoid confusion when the name of the attribute is same as method or constructor parameter.
public class This {
    int age;
    String name;
    String schoolName;

    public This(int age, String name){
        //Calling another constructor using "this" keyword.
        this(age, name, "Dashpur Vidhyalaya");
    }
    
    //Constructor overloading.
    //Constructor parameters has same name as attributes, this.attribute_name refers to the attribute of the current obj.
    public This(int age, String name, String schoolName){
        this.age = age;
        this.name = name;
        this.schoolName = schoolName;
    }

    public void print(){
        System.out.println("Name:- " + this.name);
        System.out.println("Age:- " + this.age);
        System.out.println("School Name:- " + this.schoolName);
    }

    public static void main(String[] args) {
        This obj = new This(19, "Rafiq");
        obj.print();
    }

}

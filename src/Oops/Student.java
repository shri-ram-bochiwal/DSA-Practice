class Students{
    int age;
    String name;

    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void display(){
        System.out.println("My name is "+name+"."+" I am "+age+" years old");
    }

    public void sayHello(String namee){
        System.out.print(name+" says hello to "+namee);
    }
}

public class Student{
    public static void main(String[] args){
        Students sts = new Students(26, "shiru");
        sts.display();
        sts.sayHello("kamal");
    }
}
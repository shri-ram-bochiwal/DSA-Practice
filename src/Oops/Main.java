class Pen{
    String type;
    String color;

    /*  
        Function which are defined in the
        class are called methods
    */  

    public void write(){
        System.out.println("Writting");
    }                                                                                    

    public void printColor(){                                   
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}


public class Main {
    public static void main(String[] args){
        Pen penObj1 = new Pen();
        Pen penObj2 = new Pen();

        penObj1.color = "blue";
        penObj2.color = "black";
        penObj1.type = "Gel";
        penObj2.type = "Ball";

        /* This will call write function and this will print type of pen */

        penObj1.write();
        penObj1.printType();
        penObj2.printType();
        penObj1.printColor();
        penObj2.printColor();
    }
}

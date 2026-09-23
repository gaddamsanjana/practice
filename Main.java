public class Main{ 
    public static void main(String[] a){ 


        Student s1 = new Student(); 
        s1.name = "Ravi"; 
        s1.display(); 


        Student s2 = new Student(); 
        s2.name = "Krishna"; 
        s2.display(); }

      static  class Student{ 
            String name; 
            void display() { 
                System.out.println("Name:" + name); 
            } 
        } 
 
    } 

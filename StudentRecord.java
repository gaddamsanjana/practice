class StudentRecord {
    String name;
    int marks;
    void display() {
        System.out.println("Name:" + name);
        System.out.println("Marks:" + marks);
    }
    public static void main(String[] args){
        StudentRecord s = new StudentRecord();
        s.name = "Rahul";
        s.marks = 85;
        s.display();
    }
}
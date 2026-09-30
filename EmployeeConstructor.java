class EmployeeConstructor {
    String name;
    int id;
    EmployeeConstructor() {
        name = "Unknown";
        id = 0;
    }
    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employrr ID : " + id);
        }
        public static void main(String[] args) {
            EmployeeConstructor e = new EmployeeConstructor();
            e.display();
        }
}
package Bai1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(12, "Nguyen Duc Khanh", 25);
        System.out.println(person);
        System.out.println(person.getPersonID());
        Sturdent sturdent = new Sturdent(15, "Nguyen Duc A", 03, 10);
        Sturdent sturdent1 = new Sturdent(25, "Nguyen Duc B", 07, 9.8);
        Sturdent sturdent2 = new Sturdent(35, "Nguyen Duc C", 06, 7.5);

        System.out.println(sturdent);
        CRUDStudent crudStudent = new CRUDStudent();
        crudStudent.addSturdent(sturdent);
        crudStudent.addSturdent(sturdent1);
        crudStudent.addSturdent(sturdent2);


        crudStudent.addSturdentToFile(sturdent, "student1.dat");
        crudStudent.addSturdentToFile(sturdent1, "student2.dat");
        crudStudent.addSturdentToFile(sturdent2, "student3.dat");

        System.out.println("Thông tin SV" + crudStudent.getStudentFromFile("student1.dat"));
        System.out.println("Thông tin SV" + crudStudent.getStudentFromFile("student2.dat"));
        System.out.println("Thông tin SV" + crudStudent.getStudentFromFile("student3.dat"));

        Sturdent[] sturdents = {sturdent, sturdent1, sturdent2};
        crudStudent.addStudentListToFile(sturdents, "List.dat");

        Sturdent[] showSturdentsList = crudStudent.getAllStudentFromFile("List.dat");
        for ( Sturdent student : showSturdentsList) {
            System.out.println(student.toString());
        }




    }
}

package Bai1;

public class Main {
    public static void main(String[] args) {
//        Person person = new Sturdent( 10 , "Nguyen van A",05, 5.5);
//        System.out.println(person.toString());
//        System.out.println(person.getPersonID());
        Sturdent sturdent = new Sturdent(15, "Nguyen Duc A", 03, 10);
        Sturdent sturdent1 = new Sturdent(25, "Nguyen Duc B", 07, 9.8);
//        Sturdent sturdent2 = new Sturdent(35, "Nguyen Duc C", 06, 7.5);
//        System.out.println(sturdent.toString());
//        System.out.println(sturdent1);

        CRUDStudent crudStudent = new CRUDStudent();
        crudStudent.addStudent(sturdent);
        crudStudent.addStudent(sturdent1);

        crudStudent.addStudentToFile(sturdent, "sinhvien.dat");

        crudStudent.addStudentToFile(sturdent1, "sinhvien.dat");

        System.out.println(crudStudent.getStudentFromFile("sinhvien.dat"));

        crudStudent.addStudentListToFile(new Sturdent[]{sturdent, sturdent1}, "sinhvien.dat");


        crudStudent.getAllStudentFromFile("sinhvien.dat");


        Sturdent[] sinhvien = crudStudent.getAllStudentFromFile("sinhvien.dat");
        for (int i = 0; i < sinhvien.length; i++) {
            System.out.println(sinhvien[i]);
        }
    }
}

package Bai1;
import java.io.*;

public class CRUDStudent {
   public Sturdent[] studentList;
   public static int numberOfStudent;
   public CRUDStudent() {
       studentList = new Sturdent[100];
       numberOfStudent = 0;
   }


    public boolean addStudent(Sturdent objStudent){
       if(numberOfStudent < studentList.length){
           studentList[numberOfStudent] = objStudent;
           numberOfStudent++;
           System.out.println("them thanh cong");
           return true;
       }
       return false;
    }


    public boolean addStudentToFile(Sturdent objStudent, String filename){

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objStudent);
            oos.close();
            fos.close();
            System.out.println("them thanh cong");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }


    public Sturdent getStudentFromFile(String filename){
       try {
           FileInputStream fis = new FileInputStream(filename);
           ObjectInputStream ois = new ObjectInputStream(fis);
           Sturdent sturdent = (Sturdent) ois.readObject();
           ois.close();
           fis.close();
           return sturdent;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
    }

    public boolean addStudentListToFile(Sturdent[] listStudent, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listStudent);
            oos.close();
            fos.close();
            System.out.println("them thanh cong");
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public Sturdent[] getAllStudentFromFile(String filename){
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Sturdent[] sturdents = (Sturdent[]) ois.readObject();


            ois.close();
            fis.close();
            return sturdents;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}

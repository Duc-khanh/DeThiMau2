package Bai1;
import java.io.*;

public class CRUDStudent {
   public Sturdent[] studentList;
   public static int numberOfStudent;
   public CRUDStudent() {
       studentList = new Sturdent[100];
       numberOfStudent = 0;
   }
   // thêm 1 hs vào ds
    public boolean addSturdent ( Sturdent objSturdent) {
        if (numberOfStudent< studentList.length){
            studentList[numberOfStudent] = objSturdent;
            numberOfStudent++;
            return true;
        }
        return false;
    }
    // lưu 1 hs với file
    public boolean addSturdentToFile(Sturdent objSturdent, String filename) {
       try ( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(filename))) {
           oos.writeObject(objSturdent);
           return true;
       } catch (IOException e) {
           e.printStackTrace();
           return false;
       }
    }
    // pt trả về 1 đối tượng sinh viên từ file
    public Sturdent getStudentFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Sturdent) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    // pt lưu danh sách sinh viên vào file
    public boolean addStudentListToFile(Sturdent[] listStudent, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(listStudent);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    // pt trả về danh sách sinh viên từ file
    public Sturdent[] getAllStudentFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Sturdent[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }




}

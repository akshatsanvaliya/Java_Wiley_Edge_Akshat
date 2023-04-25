package IOStream;

import java.io.*;
public class StudDet {
    String name;
    String gender;
    int age;
    String className;

    public StudDet(String name, String gender, int age, String className) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.className = className;
    }

    public static void main(String[] args) throws Exception {
    	StudDet student = new StudDet("Akshat", "Male", 21, "Class 12");
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Documents\\student.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeUTF(student.gender);
            objectOutputStream.writeUTF(student.name);
            objectOutputStream.writeInt(student.age);
            objectOutputStream.writeUTF(student.className);
            objectOutputStream.close();
            fos.close();
            fos.flush();
            System.out.println("Student details saved successfully!");
        } catch (IOException e) {
           System.out.println("error: " + e);
        }
    }
}
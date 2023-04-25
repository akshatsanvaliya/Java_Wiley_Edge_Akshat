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
            DataOutputStream oos = new DataOutputStream(fos);
            oos.writeUTF(student.gender);
            oos.writeUTF(student.name);
            oos.writeInt(student.age);
            oos.writeUTF(student.className);
            oos.close();
            fos.close();
            oos.flush();
            fos.flush();
            System.out.println("Student details saved successfully!");
        } catch (IOException e) {
           System.out.println("error: " + e);
        }
    }
}
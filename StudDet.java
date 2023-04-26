package IOStream;

import java.io.*;
import java.util.Scanner;
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
    	Scanner s = new Scanner(System.in); 
    	StudDet student = new StudDet("Akshat ","Male ", 21, " Class 12");

    	StudDet student1 = new StudDet("Krishna ","Male ", 21, " Class 14");

    	StudDet student2 = new StudDet("Selena ","Female ", 21, " Class 15");
    	
student.toString();
student1.toString();
student2.toString();
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Documents\\student.dat");
            DataOutputStream oos = new DataOutputStream(fos);
            oos.writeBytes(student.name);
            oos.writeBytes(student.gender.toString());
            oos.write(student.age);
            oos.writeBytes(student.className.toString()+ "\n");
            
            oos.writeBytes(student1.name);
            oos.writeBytes(student1.gender.toString());
            oos.write(student1.age);
            oos.writeBytes(student1.className.toString()+ "\n");
            
            oos.writeBytes(student2.name);
            oos.writeBytes(student2.gender.toString());
            oos.write(student2.age);
            oos.writeBytes(student2.className.toString());
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
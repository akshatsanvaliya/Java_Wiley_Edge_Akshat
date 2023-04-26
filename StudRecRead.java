package IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class StudRecRead {

		DataInputStream dis;
		 public StudRecRead(String inputFile) throws Exception{
			 dis = new DataInputStream(new FileInputStream(inputFile));
		 }
		
		 public List<StudDet> readAll() throws Exception{
			 List<StudDet> listStud= new ArrayList<>();
			 while(true) {
				 try {
					 String name = dis.readUTF();
					 String gender = dis.readUTF();
					 int age = dis.readInt();
					 String classname = dis.readUTF();
					 
					 StudDet sd = new StudDet(name, gender, age, classname);
					 listStud.add(sd);
				
					
					 System.out.println("Added Successfully");
				 }catch (Exception e) {
				 System.out.println("Error: "+ e);
				 e.printStackTrace();
				 }
				 return listStud;
			 }
		 }
	public static void main(String[] args) throws Exception {
			
	
	
	String inputFile = "C:\\Users\\Admin\\Documents\\student.dat";
	
	try {
		StudRecRead srr = new StudRecRead(inputFile);
		List<StudDet> sd = srr.readAll();
		for(StudDet sdt: sd) {
			System.out.println(sdt.name+ "\t");
			System.out.println(sdt.gender+ "\t");
			System.out.println(sdt.age+ "\t");
			System.out.println(sdt.className+ "\t");
		}
	}catch (Exception e) {
		System.out.println("Error: "+ e);
	}
	}

}

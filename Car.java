package Serialization;

import java.io.*;

public class Car implements Serializable{

	
int cid;
String Car_name;
public Car(int cid, String Car_name){
	super();
	this.Car_name = Car_name;
	this.cid= cid;
	}

}

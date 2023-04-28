package Genrics;

import java.io.Serializable;

public class Printer<T extends Animal & Serializable > {
T valtoPrint;
public  Printer(T valtoPrint) {
	super();
	this.valtoPrint = valtoPrint;
}


public void print() {
	System.out.println(valtoPrint);
}
}

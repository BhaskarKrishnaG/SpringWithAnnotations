package com.bk.java;

public class Inheritance {

	public static void main(String[] args) {
		DAO d = new MSSQLDb();
		// If we were to assign this MONGO child then we could!
		d =  new MONGODb();
		d.connectDb();
	}

}

interface DAO {
	void connectDb();
}

class MSSQLDb implements DAO {

	public void connectDb() {
		System.out.println("Connected to SQL!");
	}
}

class MONGODb implements DAO {

	public void connectDb() {
		System.out.println("Connected to MONGO!");
	}

}
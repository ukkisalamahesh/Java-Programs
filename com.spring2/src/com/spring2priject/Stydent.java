package com.spring2priject;

public class Stydent {
int roll;
String name;
float gpa;
public Stydent() {
	super();
	// TODO Auto-generated constructor stub
}
public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getGpa() {
	return gpa;
}
public void setGpa(float gpa) {
	this.gpa = gpa;
}
public Stydent(int roll, String name, float gpa) {
	super();
	System.out.println("constuctor");
	this.roll = roll;
	this.name = name;
	this.gpa = gpa;
}
@Override
public String toString() {
	return "Stydent [roll=" + roll + ", name=" + name + ", gpa=" + gpa + "]";
}
}

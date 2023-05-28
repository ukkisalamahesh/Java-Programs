package learning.com.mavenspring;

import java.util.*;

public class Trainer {
List Subjects;
Set Students;
Map batches;
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Trainer [Subjects=" + Subjects + ", Students=" + Students + ", batches=" + batches + "]";
}
public Trainer(List subjects, Set students, Map batches) {
	super();
	Subjects = subjects;
	Students = students;
	this.batches = batches;
}
public List getSubjects() {
	return Subjects;
}
public void setSubjects(List subjects) {
	Subjects = subjects;
}
public Set getStudents() {
	return Students;
}
public void setStudents(Set students) {
	Students = students;
}
public Map getBatches() {
	return batches;
}
public void setBatches(Map batches) {
	this.batches = batches;
}
}

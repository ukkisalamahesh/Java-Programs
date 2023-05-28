package Spring.com.spring2maven;

public class Student {
laptop lapi;

public Student(laptop lapi) {
	super();
	this.lapi = lapi;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public laptop getLapi() {
	return lapi;
}

public void setLapi(laptop lapi) {
	this.lapi = lapi;
}

@Override
public String toString() {
	return "Student [lapi=" + lapi + "]";
}

}

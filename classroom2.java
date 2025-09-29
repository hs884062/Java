import java.util.*;
class stu implements Comparable<stu> {
	String name;
	int rollno;

	stu(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + rollno;
	}

	@Override
	public int compareTo(stu that) {

		return this.rollno - that.rollno;
	}
}

public class classroom2 {
	public static void main(String[] args) {
		List<stu> list = new ArrayList<>();
		list.add(new stu("Rahul", 21));
		list.add(new stu("Raj", 45));
		list.add(new stu("Anany", 61));
		list.add(new stu("Shurbhi", 15));
		Collections.sort(list);
		System.out.println(list);
	}
}

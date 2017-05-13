import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {
	private int token;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getToken() {
		return token;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class Solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>(100, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getCgpa() < s2.getCgpa())
					return 1;
				else if (s1.getCgpa() > s2.getCgpa())
					return -1;
				else {
					// same cgpa
					if (!s1.getFname().equals(s2.getFname()))
						return s1.getFname().compareTo(s2.getFname());
					else {
						// same name
						return s1.getToken() - s2.getToken();
					}
				}
			}

		});

		int totalEvents = Integer.parseInt(in.nextLine());
		while (totalEvents > 0) {
			String event = in.next();

			// Complete your code
			if (event.equals("ENTER")) {
				String fname = in.next();
				Double cgpa = in.nextDouble();
				int id = Integer.parseInt(in.nextLine());

				Student student = new Student(id, fname, cgpa);
				priorityQueue.add(student);
			} else if (event.equals("SERVED")) {
				priorityQueue.poll();
			}

			totalEvents--;
		}

		if (priorityQueue.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			while (!priorityQueue.isEmpty()) {
				System.out.println(priorityQueue.poll().getFname());
			}
		}
	}
}
package com.tnsif.springcoreexample;

	public class Collage {
		private Student student;
	    public Collage() {
			System.out.println("College objected created....");
		}
	    public void setStudent(Student student) {
	    	this.student = student;
	    }
		
		public void show() {
			System.out.println("Welcome to college");
			student.display();
		}
		
}
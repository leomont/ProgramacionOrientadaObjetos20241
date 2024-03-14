package edu.ucaldas.poo.gradebook;

public class gradeBook {
	
	private String courseName;

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public gradeBook() {
		// TODO Auto-generated constructor stub
	}
	
	public String displayMessage() {
		return "Bienvenido al sistema de planillas del curso" + getCourseName();
	}
	
	

}

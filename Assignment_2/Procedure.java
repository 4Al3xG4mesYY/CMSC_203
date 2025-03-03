package patientInfo;

/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: (List the information for procedures from the patient)
 * Due: 03/03/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alexander Nguyen
*/

public class Procedure 
{
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double charges;
	
	//no parm constructor
	public Procedure()
	{
		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		charges = 0.0;
	}
	
	public Procedure(String name, String date)
	{
		procedureName = name;
		procedureDate = date;
	}
	
	public Procedure(String name, String date, String practitioner, double charges)
	{
		procedureName = name;
		procedureDate = date;
		practitionerName = practitioner;
		this.charges = charges;
	}

	public String toString()
	{
		return "\n\tProcedure: " + procedureName + "\n\tProcedureDate=" + procedureDate + "\n\tPractitioner=" + practitionerName + "\n\tCharge=" + charges;
	}
	
	//getters and setters
	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getProcedureDate() {
		return procedureDate;
	}

	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}

	public String getPracitionerName() {
		return practitionerName;
	}

	public void setPracitionerName(String pracitionerName) {
		this.practitionerName = pracitionerName;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	
}

package patientInfo;

/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: (List the information out for the Patient)
 * Due: 03/03/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alexander Nguyen
*/


public class Patient 
{
	private String firstName;
	private String middleName;
	private String lastName;
	private String city;
	private String state;
	private String zipCode;
	private String streetAddress;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyPhoneNumber;
	
		//No-parms constructor
		public Patient()
		{
			firstName = "";
			middleName = "";
			lastName = "";
			city = "";
			zipCode = "";
			phoneNumber = "";
			emergencyName = "";
			emergencyPhoneNumber = "";
		}
		
		public Patient(String first, String middle, String last)
		{
			firstName = first;
			middleName = middle;
			lastName = last;
		}
		
		public Patient(String first, String middle, String last, String address, 
				String city, String state, String zip, String phoneNumber, String eName, String ePhone)
		{
			firstName = first;
			middleName = middle;
			lastName = last;
			streetAddress = address; 
			this.city = city;
			this.state = state;
			zipCode = zip;
			this.phoneNumber = phoneNumber;
			emergencyName = eName;
			emergencyPhoneNumber = ePhone;
		}

		//Build string to be displayed
		public String buildFullName()
		{
			return firstName + " " + middleName + " " + lastName;
		}
		
		public String buildAddress()
		{
			return streetAddress + " " + city + " " + state + " " + phoneNumber;
		}
		
		public String buildEmergencyContact()
		{
			return emergencyName + " " + emergencyPhoneNumber;
		}
		
		public String toString()
		{
			return "Patient info: " + "\r\n  Name" + buildFullName() + "\n  Address: " + buildAddress() + "\n  EmergencyContact: " + buildEmergencyContact();
		}
		
		//getters and setters
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZipCode() {
			return zipCode;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

		public String getStreetAddress() {
			return streetAddress;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmergencyName() {
			return emergencyName;
		}

		public void setEmergencyName(String emergencyName) {
			this.emergencyName = emergencyName;
		}

		public String getEmergencyPhoneNumber() {
			return emergencyPhoneNumber;
		}

		public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
			this.emergencyPhoneNumber = emergencyPhoneNumber;
		}
		
}

package patientInfo;

import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: (Display the information about the patient and their procedures with their total cost)
 * Due: 03/03/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alexander Nguyen
*/

public class PatientDriverApp 
{
    public static void main(String[] args) 
    {
        Procedure p1 = new Procedure(), p2 = new Procedure(), p3 = new Procedure();
        Patient patient = new Patient();
        Scanner keyboard = new Scanner(System.in);
        
        //Patient info
        System.out.println("Enter Patient's first name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Enter Patient's middle name: ");
        String middleName = keyboard.nextLine();
        System.out.println("Enter Patient's last name: ");
        String lastName = keyboard.nextLine();
        System.out.println("Enter Patient's street address: ");
        String streetAddress = keyboard.nextLine();
        System.out.println("Enter Patient's city: ");
        String city = keyboard.nextLine();
        System.out.println("Enter Patient's state: ");
        String state = keyboard.nextLine();
        System.out.println("Enter Patient's zip code: ");
        String zipCode = keyboard.nextLine();
        System.out.println("Enter Patient's phone number");
        String phoneNumber = keyboard.nextLine();
        System.out.println("Enter Emergency contact name: ");
        String emergencyContact = keyboard.nextLine();
        System.out.println("Enter Emergency contact phone: ");
        String emergencyNumber = keyboard.nextLine();
        patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContact, emergencyNumber);
                
        for(int i = 1; i <= 3; i++)
        {
            System.out.println("Enter Procedure " + i + ":");
            String procedureName = keyboard.nextLine();
            System.out.println("Enter Date of procedure: ");
            String procedureDate = keyboard.nextLine();
            System.out.println("Enter name of practitioner: ");
            String practitionerName = keyboard.nextLine();
            System.out.println("Enter charges for procedure: ");
            double charges = keyboard.nextDouble();
            keyboard.nextLine(); // Consume the newline left after nextDouble()
            
            if(i == 1) 
            {
                p1 = new Procedure(procedureName, procedureDate, practitionerName, charges);
            }
            else if(i == 2) 
            {
                p2 = new Procedure(procedureName, procedureDate, practitionerName, charges);
            }
            else
            {
                p3 = new Procedure(procedureName, procedureDate, practitionerName, charges);
            }
        }
        
        displayPatient(patient);
        displayProcedure(p1);
        displayProcedure(p2);
        displayProcedure(p3);

        double totalCharges = calculateTotalCharges(p1, p2, p3);
        System.out.printf("\nTotal Charges: $%,.2f%n", totalCharges);

        //Display student's info
        System.out.println("Student Name: Alexander Nguyen");
        System.out.println("MC#: 21171610");
        System.out.println("Due Date: 03/03/2025");
        
        keyboard.close();
    }
    
    //display methods
    public static void displayPatient(Patient patient)
    {
        System.out.println(patient.toString());
    }
    
    public static void displayProcedure(Procedure procedure)
    {
        System.out.println(procedure.toString());
    }
    
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3)
    {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
}

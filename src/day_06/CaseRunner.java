package day_06;

public class CaseRunner {
	
	/*
     * Create CaseRunner class
     * actualCase=Covid 19
     * isTested=true
     * conclusion=Tested Negative
     * if conclusion contains "negative" print "You can go to work"
     * otherwise print "15 days quarantine"
     */
     
	// Step1: create a class object
	// Step2: use that class object and setter method to assign value
	// Step3: use that class object and getter method to get the value
	
	public static void main(String[]args) {
	// I must use setter method to assign values
	Case caseObject=new Case();
	caseObject.setActualCase("Covid 19");
	caseObject.setTested(true);
	caseObject.setConclusion("Tested Negative");
	
	System.out.println("Actual Case : " +caseObject.getActualCase());
	System.out.println("Tested : " + caseObject.isTested());
	System.out.println("Conclusion :" + caseObject.getConclusion());
	
	if(caseObject.getConclusion().toLowerCase().contains("negative")) {
		System.out.println("You can go to work");
	}else {
		System.out.println("15 days quarantina");
	}  
	Patient patient=new Patient();
	patient.setFirstName("John");
	patient.setLastName("Cash");
	System.out.println("First Name : " + patient.getFirstName());
	System.out.println("Last Name : " + patient.getLastName());
	
	// step
	patient.setCaseOptions(caseObject);
	System.out.println(patient.getCaseOptions().getActualCase());
	System.out.println(patient.getCaseOptions().isTested());
	System.out.println(patient.getCaseOptions().getConclusion());
} }

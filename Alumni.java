package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner; // import the Scanner class 


public class Alumni  implements functionalities  {

	String UserName;
	String password;
	List <String> resume; 
	int Jobstatus;
	
	protected Alumni(String userName, String password, List <String> resume) {
		UserName = userName;
		this.password = password;
		this.resume = new ArrayList<>();
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		System.out.println("first name:"); 
		Scanner myObj1 = new Scanner(System.in);
		String FirstName;
		FirstName = "<" + myObj1.nextLine() + ">.";
		
		System.out.println("Last name:"); 
		Scanner myObj2 = new Scanner(System.in);
		String LastName;
		LastName = "<" + myObj2.nextLine() + ">.";
		
		String FullName;
		FullName = FirstName + LastName + "shecode"; 
	
		this.UserName = FullName;

	}
	
	public String getPassword() {
		return password;
	}
	
	public void setFirstPassword(String password) {
	this.password = password;	
	}
	
	public void setPassword(String password) {
		System.out.println("Enter Password:"); 
		Scanner myObj3 = new Scanner(System.in);
		String PermanentPassword;
		PermanentPassword = myObj3.nextLine();
        this.password = PermanentPassword;
	}
	
	public List<String> getResume() {
		
		return resume;
	}
	
	public List<String> setResume () {
		System.out.println("Add course to resume:"); 
		Scanner courseFinished = new Scanner(System.in);
		resume.add (courseFinished.nextLine());
		return resume;
	}

	public int setJobStatus() {
	   String OfferJob = null ;
	    
	    System.out.println("Are you looking for a job?"
	    		+ " Type 1- if you're not looking for a change"
	    		+ " ,Type 2- if you're not looking but open for suggestions"
	    		+ " ,Type 3- if you're looking for a new challenge");
	    Scanner Shouldoffer = new Scanner(System.in);
		  int tempJobstatus  = Shouldoffer.nextInt(); 
		 
		  switch(tempJobstatus) {
		  case 1:
		  OfferJob = "Not looking for a change";
		  this.Jobstatus = 1;
		  break;
		  
		  case 2:
		  OfferJob = "Not looking but open for a suggestions";
		  this.Jobstatus = 2;
		  break;
		  
		  case 3:
		  OfferJob = "Looking for a new challenge";
		  this.Jobstatus = 3;
		  break;
		  
		  default:
			  System.out.println("please choose num 1, 2, or 3");
		  }

	    return this.Jobstatus;
	}


	@Override
	public void registerNewGrad() {

		    // create a string of uppercase and lowercase characters and numbers
		    String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
		    String numbers = "0123456789";

		    // combine all strings
		    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

		    // create random string builder
		    StringBuilder sb = new StringBuilder();

		    // create an object of Random class
		    Random random = new Random();

		    // specify length of random string
		    int length = 8;

		    for(int i = 0; i < length; i++) {

		      // generate random index number
		      int index = random.nextInt(alphaNumeric.length());

		      // get character specified by index
		      // from the string
		      char randomChar = alphaNumeric.charAt(index);

		      // append the character to string builder
		      sb.append(randomChar);	      
		    }
		    String temp = (String) sb.toString();
		    this.setFirstPassword(temp);
		    System.out.println("Hello new grad, for first login please type in this OPS: ");
		    System.out.println(temp);
		    
			  Scanner myObj = new Scanner(System.in);
			  String tempPassword;
			  tempPassword = myObj.nextLine(); 
			  System.out.println(tempPassword);
			  
			  if (tempPassword.equals(this.password)) {
			  
			  System.out.println("logged in");
			  this.setUserName(UserName);
			  this.setPassword(password);
			  this.setResume();
			  this.setJobStatus();
			  this.ShouldOfferJob();
			  System.out.println(this.toString());
			  }
			 
			  else {
				  System.out.println("incorrect password");
			  }
	}


	
	@Override
	public void SheCodesLogin() {
		System.out.println("For login, please enter your password");
		Scanner myObj = new Scanner(System.in);
		String PasswordFromInput;
		PasswordFromInput = myObj.nextLine(); 
		  System.out.println(PasswordFromInput);
		  
		  if (PasswordFromInput.equals(this.password)) {
		  
		System.out.println("Hi " + this.UserName + " ,you're logged in");
	    
	    System.out.println("What would you like to do?"
	    		+ " press 1 to update username"
	    		+ " press 2 to change password"
	    		+ " press 3 to add course to resume"
	    		+ " press 4 to update jobstatus");
	    Scanner MenuChoise = new Scanner(System.in);
		  int UsersChoise  = MenuChoise.nextInt(); 
		 
		  switch(UsersChoise) {
		  case 1:
		  this.setUserName(UserName);
		  break;
		  
		  case 2:
		  this.setPassword(password);;
		  break;
		  
		  case 3:
		  this.setResume();
		  break;
		  
		  case 4:
		  this.setJobStatus();
		  this.ShouldOfferJob();
		  break;
		  
		  default:
			  System.out.println("please choose num 1, 2, or 3");
		  }

		System.out.println(this.toString());
	  } 
	  else {
		  System.out.println("incorrect password");
	  }
	 }
	
	
	
	
	@Override
	public boolean ShouldOfferJob() {
	if(this.resume.size() > 1 && this.Jobstatus > 1) {
		
		System.out.println("Send Alumni Job offers");
		return true;
	}
	else {
	return false;
	}
	}

	
	@Override
	public String toString() {
System.out.println("UserID: "+ this.UserName + ", Password: " + this.password + ", resume: " + this.resume + ", JobStatus: " + this.Jobstatus );
return null ;
	}

	
}

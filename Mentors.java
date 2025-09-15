package lesson13;

import java.util.List;
import java.util.Scanner;

public class Mentors extends Alumni {

	protected Mentors(String userName, String password, List<String> resume) {
		super(userName, password, resume);
	}

	public boolean canMentor() {
        System.out.println("Which course would you like to mentor?");
		Scanner newmentor = new Scanner(System.in);
		  String mentorFor  = newmentor.nextLine(); 
		  if(this.resume.contains(mentorFor)) {
			  System.out.println("Can mentor " + mentorFor + "course.");
			  return true;
		  }
		  else{
			  System.out.println("Cannot mentor.");
			  return false;
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

		  case 5:
		  this.canMentor();
		  break;
		  
		  default:
			  System.out.println("please choose num 1, 2, 3, or 4");
		  }

		System.out.println(this.toString());
	  } 
	  else {
		  System.out.println("incorrect password");
	  }
	 }

	
}

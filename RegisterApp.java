package lesson13;

public class RegisterApp {

	public static void main(String[] args) {
   
		Alumni a = new Alumni("", "", null);
		a.registerNewGrad();
        Mentors b = new Mentors("" , "", null);
		b.registerNewGrad();
		
		while (true){
		a.SheCodesLogin();
		b.SheCodesLogin();
	}
   }

}

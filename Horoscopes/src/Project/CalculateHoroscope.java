package Project;
import java.util.Scanner;
public class CalculateHoroscope {
	public static void main(String[] args) {
		String month;
		int birthday;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a month = ");
		month = input.nextLine();
		
		System.out.print("Enter a birthday = ");
		birthday = input.nextInt();	
		
		if(month.equals("Ocak")) {
			if((birthday>=1) && (birthday<22)) {
				System.out.print("Your horoscope is Oğlak");
			}
			else if((birthday>=22) && (birthday<=31)) {
				System.out.print("Your horoscope is Kova");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Şubat")){
			if((birthday>=1) && (birthday<20)) {
				System.out.print("Your horoscope is Kova");
		    }
			else if((birthday>=20) && (birthday<=29)){
				System.out.print("Your horoscope is Balık");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Mart")){
			if((birthday>=1) && (birthday<21)) {
				System.out.print("Your horoscope is Balık");
		    }
			else if((birthday>=21) && (birthday<=31)){
				System.out.print("Your horoscope is Koç");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Nisan")){
			if((birthday>=1) && (birthday<21)) {
				System.out.print("Your horoscope is Balık");
		    }
			else if((birthday>=21) && (birthday<=30)){
				System.out.print("Your horoscope is Boğa");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Mayıs")){
			if((birthday>=1) && (birthday<22)) {
				System.out.print("Your horoscope is Boğa");
		    }
			else if((birthday>=22) && (birthday<=31)) {
				System.out.print("Your horoscope is İkizler");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Haziran")){
			if((birthday>=1) && (birthday<23)) {
				System.out.print("Your horoscope is İkizler");
		    }
			else if((birthday>=23) && (birthday<=30)){
				System.out.print("Your horoscope is Yengeç");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Temmuz")){
			if((birthday>=1) && (birthday<23)) {
				System.out.print("Your horoscope is Yengeç");
		    }
			else if((birthday>=23) && (birthday<=31)) {
				System.out.print("Your horoscope is Aslan");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Ağustos")){
			if((birthday>=1) && (birthday<23)) {
				System.out.print("Your horoscope is Aslan");
		    }
			else if((birthday>=23) && (birthday<=31)){
				System.out.print("Your horoscope is Başak");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Eylül")){
			if((birthday>=1) && (birthday<23)) {
				System.out.print("Your horoscope is Başak");
		    }
			else if((birthday>=23) && (birthday<=30)){
				System.out.print("Your horoscope is Terazi");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Ekim")){
			if((birthday>=1) && (birthday<23)) {
				System.out.print("Your horoscope is Terazi");
		    }
			else if((birthday>=23) && (birthday<=31)){
				System.out.print("Your horoscope is Akrep");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Kasım")){
			if((birthday>=1) && (birthday<22)) {
				System.out.print("Your horoscope is Akrep");
		    }
			else if((birthday>=22) && (birthday<=30)){
				System.out.print("Your horoscope is Yay");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else if(month.equals("Aralık")){
			if((birthday>=1) && (birthday<22)) {
				System.out.print("Your horoscope is Yay");
		    }
			else if((birthday>=22) && (birthday<=31)){
				System.out.print("Your horoscope is Oğlak");
			}
			else {
				System.out.println("Input Error! Please try again.");
			}
		}
		else {
			System.out.println("Input Error! Please try again.");
		}
	}
}

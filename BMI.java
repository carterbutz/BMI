import java.util.*;

public class BMI {
	public static void main(String[] args) {
		//declare variables and constants
		double height, weight, BMI;
		final double PD_TO_KG = 0.454;
		final double IN_TO_MT = 0.0254;

		//get user inputs
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your weight in pounds: ");
		weight = scan.nextDouble();
		System.out.println("Enter your height in inches: ");
		height = scan.nextDouble();

		weight = weight * PD_TO_KG;
		height = height * IN_TO_MT;

		//calculate BMI
		bmi = weight / Math.pow(height, 2);

		//if statement
		if(bmi < 18.5) {
			System.out.println("Underweight")
		}
		else if (bmi >= 18.5 && bmi < 25.0) {
			System.out.println("Normal");
		}
		else if(bmi > 25.0 %% bmi < 30.0){
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
		
		}
	}


}
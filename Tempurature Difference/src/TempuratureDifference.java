import java.io.*;
import java.util.*;
public class TempuratureDifference {
	public static void main (String[]args) throws FileNotFoundException{
	Scanner weather = new Scanner(new File ("./resources/weather.txt"));
	double [] tempuratures = new double[8];
	String tempuratureDifference = "";
	double change = 0.0;
	for(int i = 0; i<8; i++){
		tempuratures[i] = weather.nextDouble();
	}
	for(int i = 0; i<7; i++){
		change = tempuratures[i+1] - tempuratures[i];
		tempuratureDifference = tempuratures[i] + " to " + tempuratures[i+1] + ", change = " + change;
		System.out.println(tempuratureDifference);
	}
	weather.close();
	}
}

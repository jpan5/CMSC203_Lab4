import java.util.Scanner;

public class TelevisionDemo{
	
	public static void main(String[] args) {
		
		//Create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//Declare variables
		int station;
		
		//Declare and instantiate a television object
		Television bigScreen = new Television("Toshiba", 55);
		
		//Turn the power on
		bigScreen.power();
		
		//display the state of the television
		System.out.println("A " + bigScreen.getScreenSize() + " inch " + bigScreen.getManufacturer() 
		+ " has been turned on.");
		
		//Prompt the user for input and store into station
		System.out.print("What channel do you want?");
		station = keyboard.nextInt();
		
		//Change the channel on the television
		bigScreen.setChannel(station);
		
		//Increase the volume of the television
		bigScreen.increaseVolume();
		
		//Display the the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
		" Volume: " + bigScreen.getVolume());
		System.out.println("Too loud!! I am lowering the volume.");
		
		//Decrease the volume of the television
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		
		//Display the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
		" Volume: " + bigScreen.getVolume());
		System.out.println(); 
		
		//Declare and instantiate another television object
		Television portable = new Television("Sharp", 19);
		
		portable.power();
		
		//display the state of the television
		System.out.println("A " + portable.getScreenSize() + " inch " + portable.getManufacturer()
		+ " has been turned on.");
		
		//Prompt the user for input and store into station
		System.out.print("What channel do you want?");
		station = keyboard.nextInt();
		
		//Change the channel on the television
		portable.setChannel(station);
		
		//Decrease the volume of the television
		portable.decreaseVolume();
		portable.decreaseVolume();
		
		//Display the the current channel and volume of the television
		System.out.println("Channel: " + portable.getChannel() +
		" Volume: " + portable.getVolume());
		
	}
}

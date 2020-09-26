/*This program is to create a television class to work with TelevisionDemo class. This
 *class contains its brand name and screen size. It also has some basic controls. For 
 *example,there is a control to turn the power on and off, a control to change the channel,
 *and a control for the volume.
 *Programmer: Jie Pan
 *Date: 09/26/2020
 * */
public class Television {
	//constant String variable for manufacturer brand
	private final String MANUFACTURER;
	//constant integer variable for size of the screen
	private final int SCREEN_SIZE; 
	//Boolean variable for the power changes
	private boolean powerOn;
	//integer variable for channel
	private int channel;
	//integer variable for volume changes
	private int volume;
	
	//Create a constructor and assign the values to the variables.
	public Television(String brand, int size){
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel  = 2;
	}
	
	public void setChannel(int station){
		channel = station;
	}
	
	public void power() {
		if(powerOn == true) {
			powerOn = !powerOn;
		}
	}
	
	//Increase the volume by 1
	public void increaseVolume() {
		volume++;
	}
	
	//Decrease the volume by 1
	public void decreaseVolume() {
		volume--;
	}
	
	//Return channel 
	public int getChannel() {
		return channel;
	}
	
	//Return volume 
	public int getVolume() {
		return volume;
	}
	
	//Return manufacturer
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	//return size of the screen
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
}
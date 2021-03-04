package ex;

class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class SmartTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

package ex;

public class Main extends SmartTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv stv = new SmartTv();
		
		 stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.displayCaption("Hello, world!");
		stv.caption=true;
		stv.displayCaption("Hello,world!");
	}

}

package ex;

class Time{
	private int hour;
	
	public void setHour(int hour) {
		if(isNotValid(hour)) {
			return;
		}else{
			this.hour=hour;			
		}
		
	}
	
	private boolean isNotValid(int hour) {
		return hour < 0 || hour > 23;
	}
	 
	public int getHour() {
		return hour;
	}
	
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(12);
		System.out.println(t.getHour());
	}

}

package codeDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("trackCoach")
public class TrackCoach implements Coach {
	private Service s;
	
	@Autowired
	public TrackCoach(@Qualifier("hittingCoaching") Service s) {
		this.s = s;
	}

	public Service getS() {
		return s;
	}
	
	public void setS(Service s) {
		this.s = s;
	}

	@Override
	public String getDailyTraining() {
		// TODO Auto-generated method stub
		return "Track~~~Running";
	}

	@Override
	public String getdailyCoaching() {
		// TODO Auto-generated method stub
		return this.s.getdailyCoaching();
	}
}

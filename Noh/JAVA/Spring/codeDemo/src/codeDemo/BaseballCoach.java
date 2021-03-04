package codeDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("baseballCoach")
public class BaseballCoach implements Coach {
	

	private Service s;
	
	@Autowired
	public BaseballCoach(@Qualifier("hittingCoaching") Service s) {
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
		return "Daily~~Hitting";
	}
	
	@Override
	public String getdailyCoaching() {
		 return this.s.getdailyCoaching();
	}
}

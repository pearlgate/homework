package codeDemo;

import org.springframework.stereotype.Component;

@Component("runningCoaching")
public class RunningCoaching implements Service{

	@Override
	public String getdailyCoaching() {
		// TODO Auto-generated method stub
		return "hello run";
	}

}

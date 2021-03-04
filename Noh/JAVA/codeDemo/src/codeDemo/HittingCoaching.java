package codeDemo;

import org.springframework.stereotype.Component;

@Component("hittingCoaching")
public class HittingCoaching implements Service {
	
	@Override
	public String getdailyCoaching() {
		// TODO Auto-generated method stub
		return "hit homerun";
	}

}

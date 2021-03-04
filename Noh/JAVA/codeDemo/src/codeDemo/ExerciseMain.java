package codeDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExerciseMain {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);
		
		TrackCoach trackCoach = context.getBean("trackCoach", TrackCoach.class);
						
		System.out.println("Hitting practice :" + baseballCoach.getDailyTraining());
		System.out.println("Running practice :" + trackCoach.getDailyTraining());
		
//		Service service = context.getBean("hittingCoaching", HittingCoaching.class);
//		baseballCoach.setS(service);
		
		System.out.println(baseballCoach.getdailyCoaching());
		
		context.close();
	}
}

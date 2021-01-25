package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("RR getNextCall()");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("RR sendCallToAgent()");
	}

}

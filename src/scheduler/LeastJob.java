package scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("LJ getNextCall()");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("LJ sendCallToAgent()");
	}

}

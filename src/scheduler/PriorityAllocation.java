package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("PA getNextCall()");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("PA sendCallToAgent()");
	}

}

package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(IStack stack) {
		super(stack);
	}
}

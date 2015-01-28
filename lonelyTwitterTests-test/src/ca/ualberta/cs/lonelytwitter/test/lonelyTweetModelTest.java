package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import android.test.ActivityInstrumentationTestCase2;

public class lonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	
	public lonelyTweetModelTest(){
		super(LonelyTwitterActivity.class);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSampleCode(){
		
		//assertTrue("This is not true", isGreaterEqual(7,6));
		//fail("This is a failing test");
		assertEquals("5 should be equal to 5", 5,5);
	}

	private boolean isGreaterEqual(int i, int j) {
		// TODO Auto-generated method stub
		if (i>=j)
			return true;
		return false;
	}
}

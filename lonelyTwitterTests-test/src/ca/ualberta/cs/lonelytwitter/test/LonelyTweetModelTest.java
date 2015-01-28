package ca.ualberta.cs.lonelytwitter.test;


import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	
	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testEquals()
	{
		
		
		Date date = new Date();
		
		NormalTweetModel tweet1 = new NormalTweetModel("Hi", date);
		NormalTweetModel tweet2 = new NormalTweetModel("Hi", date);
		assertFalse(" Same tweets are same", tweet1.equals(tweet2));
		
	}
	

}

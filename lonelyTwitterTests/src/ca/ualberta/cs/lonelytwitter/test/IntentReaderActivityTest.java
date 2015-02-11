package ca.ualberta.cs.lonelytwitter.test;
import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTest() {
		super(IntentReaderActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void testSendText(){
		String text = "Hello World!";
		int code = IntentReaderActivity.NORMAL;
		IntentReaderActivity activity = startwithText(text,code);
		assertEquals("Is text correct?", text,activity.getText());
		
	}
	
	public void testDoubleText(){
		String text = "Hello";
		IntentReaderActivity activity = startwithText(text,
				IntentReaderActivity.DOUBLE);
		assertEquals("Double transform working?", text+text,activity.getText());		
	}
	
	public void testDisplayText(){
		String text = "Hello World";
		IntentReaderActivity activity = startwithText(text,
				IntentReaderActivity.NORMAL);
		assertEquals("correct text?", text, activity.getText());
		
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("displays correct text?", text, 
				view.getText().toString());
		
	}
	
	public void testReversetext(){
		
		String text = "Hello World";
		IntentReaderActivity activity = startwithText(text,
				IntentReaderActivity.REVERSE);
		assertEquals("reverse transform working?", new StringBuilder(text).reverse().toString(),activity.getText());
	}
	
	public void DefaultMessage(){
		
		String existingtext = null;
		int code = IntentReaderActivity.NORMAL;
		IntentReaderActivity activity = startwithText(existingtext,code);
		assertEquals("Is there any text?", existingtext,activity.getText());
		
		String DefaultText = "there is no text";
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("displays correct text?", DefaultText, 
				view.getText().toString());
		view.setText(DefaultText);
	}
	
	
	public void visibletextview(){
		IntentReaderActivity thisactivity = getActivity();
		final View checkview = thisactivity.getWindow().getDecorView();
		
		
		TextView thisview = (TextView)thisactivity.findViewById(R.id.intentText);
		ViewAsserts.assertOnScreen(checkview,thisview);
	}
	
	
	private IntentReaderActivity startwithText(String text, int code){
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, code);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}
	

}

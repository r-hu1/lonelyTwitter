package ca.ualberta.cs.lonelytwitter;

public abstract class favs extends LonelyTweetModel{
	protected String tweets;
	
	public favs(String tweets){
		super(tweets);
		this.tweets = tweets;
		
	}
}

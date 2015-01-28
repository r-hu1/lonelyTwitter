package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList; 



public class TweetListModel {
private int count;
private ArrayList<LonelyTweetModel> tweetList;

	public TweetListModel() {
		tweetList = new ArrayList<LonelyTweetModel>();
		count = 0;
		tweetList = new ArrayList<LonelyTweetModel>();
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public ArrayList<LonelyTweetModel> getTweets() {
		// TODO Auto-generated method stub
		return tweetList;
	}
	public void addTweet(LonelyTweetModel tweet){
		count++;
		tweetList.add(tweet);}

	public ArrayList<LonelyTweetModel> getTweet(LonelyTweetModel tweet){
		return tweetList; 
	}
	
}

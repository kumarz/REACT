package com.tweeter.app.service;

import java.util.ArrayList;

import com.tweeter.app.model.GetConnectionsResponse;
import com.tweeter.app.model.Message;
import com.tweeter.app.model.MostPopularUser;
import com.tweeter.app.model.User;
import com.tweeter.app.model.UsersPairedWithPopularFollowerResponse;

public interface TweeterService {
	public User getUser(String userName) throws Exception;
	public void createUser(User request) throws Exception;
	public void postMessage(Message request) throws Exception;
	public ArrayList<Message> getMessages(String userName, String textToBeSearched) throws Exception;
	public void followOrUnfollowUser(String userName, String followUserName, Boolean toFollow) throws Exception;
	public ArrayList<User> getFollowers(String userName) throws Exception;
	public ArrayList<User> getFollowingUser(String trim) throws Exception;
	public MostPopularUser getMostPouplarUser() throws Exception;
	public GetConnectionsResponse getConnections(String userName) throws Exception;
	public ArrayList<UsersPairedWithPopularFollowerResponse> getUserPairedWithMostPopularUser() throws Exception;
	public int getDistance(String userName1, String userName2) throws Exception;
}

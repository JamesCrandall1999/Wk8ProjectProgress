package com.company.models;

public class UserMovie {
    private int userID;
    private boolean isInterested;
    private int interestLevel;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public boolean isInterested() {
        return isInterested;
    }

    public void setInterested(boolean interested) {
        isInterested = interested;
    }

    public int getInterestLevel() {
        return interestLevel;
    }

    public void setInterestLevel(int interestLevel) {
        this.interestLevel = interestLevel;
    }
}

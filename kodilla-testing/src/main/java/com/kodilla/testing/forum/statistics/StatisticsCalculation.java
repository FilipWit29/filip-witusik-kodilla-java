package com.kodilla.testing.forum.statistics;

class StatisticsCalculator {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            averageNumberOfPostsPerUser = (double) numberOfPosts / numberOfUsers;
            averageNumberOfCommentsPerUser = (double) numberOfComments / numberOfUsers;
        } else {
            averageNumberOfPostsPerUser = 0;
            averageNumberOfCommentsPerUser = 0;
        }

        if (numberOfPosts > 0) {
            averageNumberOfCommentsPerPost = (double) numberOfComments / numberOfPosts;
        } else {
            averageNumberOfCommentsPerPost = 0;
        }
    }
    public void showStatistics() {
        System.out.println("Forum Statistics:");
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average posts per user: " + averageNumberOfPostsPerUser);
        System.out.println("Average comments per user: " + averageNumberOfCommentsPerUser);
        System.out.println("Average comments per post: " + averageNumberOfCommentsPerPost);
    }
}

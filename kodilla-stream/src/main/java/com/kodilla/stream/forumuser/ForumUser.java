package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String name;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(final int userID, final String name, final char gender, final LocalDate dateOfBirth, final int posts) {
        this.userID = userID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
    }

    public int getPosts() {
        return posts;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}

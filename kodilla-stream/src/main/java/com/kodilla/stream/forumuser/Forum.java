package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> users = new ArrayList<>();

    public void addUsersForum() {
        users.add(new ForumUser(1, "User1", 'M', LocalDate.of(1990, 5, 15), 3));
        users.add(new ForumUser(2, "User2", 'F', LocalDate.of(1985, 8, 20), 0));
        users.add(new ForumUser(3, "User3", 'M', LocalDate.of(2000, 3, 11), 6));
        users.add(new ForumUser(4, "User4", 'F', LocalDate.of(1978, 11, 22), 4));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(users);
    }
}
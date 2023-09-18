package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum users = new Forum();
        users.addUsersForum();
        List<ForumUser> filteredUsers = users.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> LocalDate.now().minusYears(20).isAfter(user.getDateOfBirth()))
                .filter(user -> user.getPosts() > 0)
                .collect(Collectors.toList());
                filteredUsers.forEach(System.out::println);
    }
}

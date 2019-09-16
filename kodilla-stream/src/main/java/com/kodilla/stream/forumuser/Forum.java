package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Tomek01", 'M', 1995, 01, 22, 12));
        userList.add(new ForumUser(2, "Magda91", 'F', 1991, 06, 28, 178));
        userList.add(new ForumUser(3, "Weronika", 'F', 1989, 01, 01, 0));
        userList.add(new ForumUser(4, "Michal14", 'M', 1987, 11, 30, 12));
        userList.add(new ForumUser(5, "Janek", 'M', 2002, 05, 11, 20));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}

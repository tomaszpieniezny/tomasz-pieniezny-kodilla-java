package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postCount;

    public ForumUser(final int ID, final String userName, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int postCount) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        ;
        this.postCount = postCount;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}

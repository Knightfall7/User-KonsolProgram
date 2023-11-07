package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserList userList = new UserList();

        List<User> allUsers = userList.getAllUsers();
        for (User user : allUsers) {
            System.out.println("ID: " + user.getId() + ", FirstName: " + user.getFirstName() + ", LastName: " + user.getLaStName() + ", Email : " + user.getEmail() + ", Address: " + user.getAddress());
        }


        userList.addUser(new User(1, "Markus", "Rashford", "markus@gmail.com", "Manchester"));
        userList.addUser(new User(2,"Clarion", "Masaka", "clarimasaka@hotmail.com", "Kampala"));
        userList.addUser(new User(3,"Clarin", "Gosai", "clarigoasi@hotmail.com", "Limpopo"));
        userList.addUser(new User(4,"Chandlaer", "Steven", "chansteve@hotmail.com", "Merseyside"));
        userList.addUser(new User(5,"Camry", "Nakazi", "camryka@hotmail.com", "Blackburn"));
        userList.addUser(new User(6,"David", "Gueta", "Davigueta@hotmail.com", "Luton town"));
        userList.addUser(new User(7,"Adam", "Quesedira", "AdamQues@hotmail.com", "London"));

        //userList.removeUserById(2);
        //userList.searchUserById();
        //userList.sortUsersByName();


        List<User> currentUsers = userList.getAllUsers();
        for (User user : currentUsers) {
            System.out.println("ID: " + user.getId() + ", FirstName: " + user.getFirstName() + ", LastName: " +
                    user.getLaStName() + ", Email : " + user.getEmail() + ", Address: " + user.getAddress());
        }


        System.out.println("\nUsers before sorting: ");
        userList.getAllUsers().forEach(user -> System.out.println("FirstName: " + user.getFirstName()));



        System.out.println("\nUsers after sorting: ");
        userList.getAllUsers().forEach(user -> System.out.println("Firstname: " + user.getFirstName()));

    }

}

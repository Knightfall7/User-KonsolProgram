package org.example;

import java.util.*;

public class UserList {

    /**
     * UserList class has a private instance variable called userList, which is a list of User objects.
     * The constructor initializes this list as an empty ArrayList<User>.
     * This userList will be used to store and manage User objects when instances of the UserList class are created.
     */
    private final List<User> userList;

    public  UserList() {
        userList = new ArrayList<>();
    }

    /**
     * Adds a User to the user list
     *
     * @param user to add to the user list
     */
    public void addUser(User user) {
        userList.add(user);
    }
    /**
     * This method retrieves all users from the list of users (userList)
     * Returns user list.
     */
    public List<User> getAllUsers() {
        return  userList;
    }

    /**
     * This method removes a user from the list of users (userList) based on the given userId
     *Checks if the given userId is equal to the userId.
     * Returns
     */
    public void removeUserById(int userId) {
        userList.removeIf(user -> user.getId() == userId);
        System.out.println("\nUser ID: " + userId + " successfully removed");
    }

    /**
     * This method searches for a user by their ID (in this case, the index in the list,
     * not the actual user ID) and prints their information if found. This method searches for a user by their ID
     * (in this case,the index in the list, not the actual user ID) and prints their information if found.
     */
    public void searchUserById(){
      int searchId = 2;
        User foundUser = userList.get(searchId);
        if (foundUser != null) {
            System.out.println("\nUser found ID: " + foundUser.getId() + ", FirstName: " + foundUser.getFirstName() + ", Address: " + foundUser.getAddress());
        } else {
            System.out.println("\nUser by ID: " + searchId + "not found.");
        }

    }

    /**
     * This method sorts the users based on their first names in a case-insensitive manner using a custom comparator.
     * Returns names in alphabetical order.
     */
    public void sortUsersByName() {
        userList.sort(Comparator.comparing(User::getFirstName, String.CASE_INSENSITIVE_ORDER));
    }
}


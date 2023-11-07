package org.example;

public class User {

    /**
     * These are private instance variables representing different attributes of a person,
     * such as id, firstName, laStName.
     *
     */

    private int id;
    private String firstName;
    private String laStName;
    private String email;
    private String address;

    /**
     * To create a new user by initializing.
     * @param id id for the user: unique.
     * firstName, secondName, email and Address of the User.
     */

    public User(int id, String firstName, String laStName, String email, String address) {
        this.id = id;
        this.firstName = firstName;
        this.laStName = laStName;
        this.email = email;
        this.address = address;
    }

    /**
     *
     * @return id of the User.
     */

    public int getId() {
        return id;
    }

    /**
     * Sets the int value of setId to the id variable.
     *
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the string value of getFirstName
     * @return irstName to the variable.
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the string value of setFirstName to firstName
     *
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieves the string value of getLastName
     * @return LastName to the variable.
     */
    public String getLaStName() {
        return laStName;
    }

    /**
     * Sets the string value of setLastName to lastName.
     *
     */

    public void setLaStName(String laStName) {
        this.laStName = laStName;
    }
    /**
     * Retrieves the string value of getEmail
     * @return email.
     */

    public String getEmail() {
        return email;
    }

    /**
     * Sets the string value of Email to email.
     *
     */

    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Retrieves the string value of getAddress
     * @return Address.
     */

    public String getAddress() {
        return address;
    }

    /**
     * Sets the string value of setAddress to address.
     *
     */

    public void setAddress(String address) {
        this.address = address;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", laStName='" + laStName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}



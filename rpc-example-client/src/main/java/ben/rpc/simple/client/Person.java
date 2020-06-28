/*
 * Copyright (c) 2019. All Rights Reserved.
 * Author: Ben
 * Date: 2019.9
 * Version: v1.0
 *
 */
package ben.rpc.simple.client;

public class Person {

    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

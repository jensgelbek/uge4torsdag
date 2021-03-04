
package dtos;

import entities.Person;

public class PersonDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;

    public PersonDTO( String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
  
    public PersonDTO(Person person) {
        this.id = person.getId;
    }
}
package brown.kaew.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private int age;
    private String firstname;
    private String lastname;
    private String gender;

}

package ticketreservation.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

    @Override
    public String toString() {
        return "User [name= " + name + ", email= " + email + ", password= " + password +", phone number= "+ phoneNumber +"]";
    }
}

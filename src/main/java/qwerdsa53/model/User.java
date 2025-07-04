package qwerdsa53.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String secondName;
    private String lastName;
    private LocalDate birthday;
    private LocalDate registrationDate;
    private String registrationAddress;
    private String passportNumber;
    private String passportSeries;
    private String pin;
    private BigDecimal amount;

    public User cloneWithId(Long newId) {
        User copy = new User();
        copy.setId(newId);
        copy.setFirstName(this.firstName);
        copy.setSecondName(this.secondName);
        copy.setLastName(this.lastName);
        copy.setBirthday(this.birthday);
        copy.setRegistrationDate(this.registrationDate);
        copy.setRegistrationAddress(this.registrationAddress);
        copy.setPassportNumber(this.passportNumber);
        copy.setPassportSeries(this.passportSeries);
        copy.setPin(this.pin);
        copy.setAmount(this.amount);
        return copy;
    }
}
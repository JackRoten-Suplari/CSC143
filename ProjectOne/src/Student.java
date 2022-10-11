/**
 *  Represents a single student
 *  @author      Jack Roten
 *  @version     2022-10-09
*/
public record Student(String id, String lastName, String firstName, String email, String phone) {
    public Student {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Student id must not be null or blank");
        } else if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name must not be null or blank");
        } else if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name must not be null or blank");
        } else if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email must not be null or blank");
        } else if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number must not be null or blank");
        }
    }

    public String toString() {
        return id + ", " + lastName + ", " + firstName + ", " + email + ", " + phone;
    }
}



/**
 *
 * @param id
 * @param lastName
 * @param firstName
 * @param email
 * @param phone
 */
public record Student(String course, String id, String lastName, String firstName, String email, String phone) {
    public Student {
        if (course == null){
            throw new IllegalArgumentException("Course must not be null");
        } else if (id == null) {
            throw new IllegalArgumentException("Student id must not be null");
        } else if (lastName == null) {
            throw new IllegalArgumentException("Last name must not be null");
        } else if (firstName == null) {
            throw new IllegalArgumentException("First name must not be null");
        } else if (email == null) {
            throw new IllegalArgumentException("Email must not be null");
        } else if (phone == null) {
            throw new IllegalArgumentException("Phone number must not be null");
        }
    }
    public String toString() {
        return course + ", " + id + ", " + lastName + ", " + firstName + ", " + email + ", " + phone;
    }
}



package users;

public class Student {
    private String name;
    private String email;
    private String phoneNumber;
    private String birthDate;
    private Number age;
    private String registration;

    public Student(String name, String email, String phoneNumber, String birthDate, Number age, String registration) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = age;
        if(registration.length() != 5){
            this.registration = "00000";
        }else{
            this.registration = registration;
        }

    }

    public Student(String name, String phoneNumber, String birthDate, Number age, String registration) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = age;
        this.registration = registration;
        this.email = "default@mail.com";

    }

    public Student() {
        this.name = "";
        this.phoneNumber = "";
        this.birthDate = "";
        this.age = 0;
        this.registration = "";
        this.email = "";

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Number getAge() {
        return age;
    }

    public String getRegistration() {
        return registration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public void setRegistration(String registration) {

        if(registration.length() != 5){
            this.registration = "00000";

        }else{
            this.registration = registration;
        }
    }
}

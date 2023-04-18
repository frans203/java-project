package users;

public class Parent {
    private String name;
    private String email;
    private String phoneNumber;
    private String birthDate;
    private Number age;

    public Parent(String name, String email, String phoneNumber, String birthDate, Number age) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = age;
    }

    public Parent(String name, String phoneNumber, String birthDate, Number age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = age;
        this.email = "default@default.com";
    }
    public Parent() {
        this.name = "";
        this.phoneNumber = "";
        this.birthDate = "";
        this.age = 0;
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
}

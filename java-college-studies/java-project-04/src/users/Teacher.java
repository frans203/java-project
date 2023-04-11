package users;

public class Teacher {
    private String name;
    private String email;
    private String phoneNumber;
    private String registration;
    private String subject;

    public Teacher(String name, String email, String phoneNumber, String registration, String subject) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.registration = registration;
        this.subject = subject;
    }

    public Teacher(String name, String phoneNumber, String registration, String subject) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.registration = registration;
        this.subject = subject;
        this.email = "default@default.com";
    }

    public Teacher() {
        this.name = "";
        this.registration = "";
        this.email = "";
        this.phoneNumber = "";
        this.subject="";

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

    public String getRegistration() {
        return registration;
    }

    public String getSubject() {
        return subject;
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

    public void setRegistration(String registration) {
        if(registration.length() != 5){
            this.registration = "00000";

        }else{
            this.registration = registration;
        }
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

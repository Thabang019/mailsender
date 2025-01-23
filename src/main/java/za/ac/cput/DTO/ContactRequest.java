package za.ac.cput.DTO;

public class ContactRequest {

    private String name;
    private String lastname;
    private String email;
    private String phoneNumber;
    private String message;

    public ContactRequest() {
    }

    public ContactRequest(Builder builder) {
        this.name = builder.name;
        this.lastname = builder.lastname;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.message = builder.message;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public static class Builder{
        private String name;
        private String lastname;
        private String email;
        private String phoneNumber;
        private String message;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public ContactRequest build(){
            return new ContactRequest();
        }
    }
}

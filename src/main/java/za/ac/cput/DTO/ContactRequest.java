package za.ac.cput.DTO;

public class ContactRequest {

    private String name;
    private String email;
    private String subject;
    private String message;

    public ContactRequest() {
    }

    public ContactRequest(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.subject = builder.subject;
        this.message = builder.message;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public static class Builder{
        private String name;
        private String email;
        private String subject;
        private String message;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
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

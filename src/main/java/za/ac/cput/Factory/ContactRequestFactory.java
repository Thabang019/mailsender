package za.ac.cput.Factory;

import za.ac.cput.DTO.ContactRequest;

public class ContactRequestFactory {

    public static ContactRequest createContactRequest(String name, String email, String subject, String message){
        return new ContactRequest.Builder()
                .setName(name)
                .setEmail(email)
                .setSubject(subject)
                .setMessage(message)
                .build();
    }
}

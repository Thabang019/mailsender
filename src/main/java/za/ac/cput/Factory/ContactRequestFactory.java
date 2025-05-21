package za.ac.cput.Factory;

import za.ac.cput.DTO.ContactRequest;

public class ContactRequestFactory {

    public static ContactRequest createContactRequest(String name, String lastname, String email, String phoneNumber, String message){
        return new ContactRequest.Builder()
                .setName(name)
                .setLastname(lastname)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .setMessage(message)
                .build();
    }
}

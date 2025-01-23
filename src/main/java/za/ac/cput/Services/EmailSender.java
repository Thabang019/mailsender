package za.ac.cput.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import za.ac.cput.DTO.ContactRequest;

@Service
public class EmailSender {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(ContactRequest contactRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("thabangcebo@gmail.com");
        message.setTo("thabangcebo@gmail.com");
        message.setSubject("New Message from: " + contactRequest.getName() + " " + contactRequest.getLastname());
        message.setText("Email: " + contactRequest.getEmail() + "\n\nPhone Number: " + contactRequest.getPhoneNumber() + "\n\nMessage:\n" + contactRequest.getMessage());
        mailSender.send(message);
    }
}

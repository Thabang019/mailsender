package za.ac.cput.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.DTO.ContactRequest;
import za.ac.cput.Services.EmailSender;


@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactRequestController {

    @Autowired
    private EmailSender emailService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody ContactRequest contactRequest) {
        try {
            emailService.sendEmail(contactRequest);
            return ResponseEntity.ok("Message sent successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to send message.");
        }
    }
}
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
        message.setSubject("New Message from: " + contactRequest.getName());
        message.setSubject("📧 New Contact Form Submission - " + contactRequest.getName());

        String htmlContent = """
            <html>
            <body style="font-family: Arial, sans-serif; line-height: 1.6; color: #333;">
                <div style="max-width: 600px; margin: 0 auto; padding: 20px; background-color: #f9f9f9; border-radius: 8px;">
                    
                    <div style="background: white; padding: 20px; border-radius: 6px; margin: 15px 0;">
                        <h3 style="color: #246973; margin-top: 0;">Contact Details</h3>
                        <p><strong>Name:</strong> %s</p>
                        <p><strong>Email:</strong> <a href="mailto:%s" style="color: #246973;">%s</a></p>
                    </div>
                    
                    <div style="background: white; padding: 20px; border-radius: 6px; margin: 15px 0;">
                        <h3 style="color: #246973; margin-top: 0;">Subject</h3>
                        <p style="font-size: 16px; font-weight: 500;">%s</p>
                    </div>
                    
                    <div style="background: white; padding: 20px; border-radius: 6px; margin: 15px 0;">
                        <h3 style="color: #246973; margin-top: 0;">Message</h3>
                        <div style="background: #f8f9fa; padding: 15px; border-left: 4px solid #246973; border-radius: 4px;">
                            <p style="margin: 0; white-space: pre-wrap;">%s</p>
                        </div>
                    </div>
                    
                    <div style="margin-top: 30px; padding: 15px; background: #e8f4f5; border-radius: 6px; text-align: center;">
                        <p style="margin: 0; font-size: 14px; color: #666;">
                            Sent from Portfolio Contact Form<br>
                            <small>%s</small>
                        </p>
                    </div>
                </div>
            </body>
            </html>
            """.formatted(
                contactRequest.getName(),
                contactRequest.getEmail(),
                contactRequest.getSubject(),
                contactRequest.getMessage(),
            );
        
        message.setContent(htmlContent, "text/html; charset=utf-8");
        mailSender.send(message);
    }
}

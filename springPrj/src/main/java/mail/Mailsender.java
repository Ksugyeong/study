package mail;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

public interface Mailsender {
    void send(SimpleMailMessage simpleMailMessage) throws MailException;
    void send(SimpleMailMessage[] simpleMailMessages) throws MailException;
}

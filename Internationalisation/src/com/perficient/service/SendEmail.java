package com.perficient.service;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 
 * @author suchita.sarda
 *
 */
public class SendEmail {
	/**
	 * Sending E-mail with password to guest User
	 * 
	 * @param guestEmail
	 * @param randomPass
	 * @return
	 */
	public boolean sendPasswordEmailToGuest(String guestEmail, String securePassword) {
		String emailId = "guestemail.perficient@gmail.com";
		String password = "perficient";
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emailId, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(emailId));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(guestEmail));
			message.setSubject("Password for Guset login");
			message.setText("Dear Guest,"
					+ "\nThis is Your Secure Password of Perficient E-Learning Login."
					+ "\nSecure Password : "+securePassword);
			Transport.send(message);
			System.out.println("E-Mail has been sent....");
			return true;
		} catch (MessagingException e) {
			e.printStackTrace();
			System.out.println("Failed to send E-Mail....");
			return false;
		}

		
	}
}

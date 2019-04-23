package com.arc.BaseClass

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.text.SimpleDateFormat
public class SendEmail {

	static String pattern = "yyyy-MM-dd";
	static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	static String date = simpleDateFormat.format(new Date())
	public static void sendStatusReport(int TotalTestCase, int TotalPassed, int TotalFailed, def executionTime) {
		// Recipient's email ID needs to be mentioned.
		String to = "abgupta@usgbc.com";
		String cc = "abhishekkumar@groupten.com";

		// Sender's email ID needs to be mentioned
		String from = "Abhishek";
		final String username = "ak47myself@gmail.com";//change accordingly
		final String password = "abhishek1";//change accordingly

		// Assuming you are sending email through relay.jangosmtp.net
		String host = "smtp.gmail.com";
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		// Get the Session object.
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(username, password);
					}
				});

		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));

			message.setRecipients(Message.RecipientType.CC,
					InternetAddress.parse(cc, false));
			// Set Subject: header field
			message.setSubject("Jenkins #1 build execution Report : " + date);

			// Send the actual HTML message, as big as you like
			message.setContent(
					"<head><style>table, th, td {border: 1px solid black; border-collapse: collapse;}th, td {padding: 5px;text-align: left;}</style>"+
					"</head><body>"+
					"<h2 style='color:brown'>ARC Frontend Build Execution Report</h2>"+
					"<p>Parallel build #1 has finished its execution. Here is the summary report.</p>"+
					"<table style='width:100%'>"+
					" <tr>"+
					"  <th>Host</th>"+
					" <td>Jenkins Cloud Execution</td>"+
					"</tr>"+
					"<tr>"+
					" <th>Opreating System</th>"+
					" <td> Linux 64bit</td>"+
					"</tr>"+
					"<tr>"+
					" <th>Browser</th>"+
					"<td>Firefox 64.0</td>"+
					"</tr>"+
					"<tr>"+
					" <th>Execution Mode</th>"+
					"<td>Parallel</td>"+
					" </tr>"+
					" <tr>"+
					"  <th>Build Execution Time</th>"+
					"  <td>"+executionTime +"</td>"+
					" </tr>"+

					"</table>"+
					"</br>"+
					"<p style='text-align:center'><B>Result Summary : </B></p>"+
					"<table style='width:100%'>"+
					"  <tr>"+
					"  <th>Total Testcases</th>"+
					"  <th style='color:green'>Pass status</th>"+
					"  <th style='color:red'>Fail status</th>"+
					" </tr>"+
					" <tr>"+
					"  <th>"+TotalTestCase+"</th>"+
					" <th style='color:green'>"+TotalPassed +"</th>"+
					" <th style='color:red'>"+TotalFailed +"</th>"+
					" </tr>"+
					" </table>"+

					"</body>"
					,
					"text/html");

			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}


	public static void sendStatusReport1(int TotalTestCase, int TotalPassed, int TotalFailed, long executionTime) {
		// Recipient's email ID needs to be mentioned.
		String to = "abgupta@usgbc.org";
		String cc = "abhishekkumar@groupten.com";

		// Sender's email ID needs to be mentioned
		String from = "Abhishek";
		final String username = "ak47myself@gmail.com";//change accordingly
		final String password = "abhishek1";//change accordingly

		// Assuming you are sending email through relay.jangosmtp.net
		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		// Get the Session object.
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(username, password);
					}
				});

		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));

			message.setRecipients(Message.RecipientType.CC,
					InternetAddress.parse(cc, false));
			// Set Subject: header field
			message.setSubject("Jenkins #1 build execution Report : " + date);

			// Send the actual HTML message, as big as you like
			message.setContent(
					"<head><style>table, th, td {border: 1px solid black; border-collapse: collapse;}th, td {padding: 5px;text-align: left;}</style>"+
					"</head><body>"+
					"<h2 style='color:brown'>ARC Frontend Build Execution Report</h2>"+
					"<p>Parallel build #1 has finished its execution. Here is the summary report.</p>"+
					"<table style='width:100%'>"+
					" <tr>"+
					"  <th>Host</th>"+
					" <td>Jenkins Cloud Execution</td>"+
					"</tr>"+
					"<tr>"+
					" <th>Opreating System</th>"+
					" <td> Linux 64bit</td>"+
					"</tr>"+
					"<tr>"+
					" <th>Browser</th>"+
					"<td>Firefox 64.0</td>"+
					"</tr>"+
					"<tr>"+
					" <th>Execution Mode</th>"+
					"<td>Parallel</td>"+
					" </tr>"+
					" <tr>"+
					"  <th>Build Execution Time</th>"+
					"  <td>"+executionTime +"</td>"+
					" </tr>"+

					"</table>"+
					"</br>"+
					"<p style='text-align:center'><B>Result Summary : </B></p>"+
					"<table style='width:100%'>"+
					"  <tr>"+
					"  <th>Total Testcases</th>"+
					"  <th style='color:green'>Pass status</th>"+
					"  <th style='color:red'>Fail status</th>"+
					" </tr>"+
					" <tr>"+
					"  <th>"+TotalTestCase+"</th>"+
					" <th style='color:green'>"+TotalPassed +"</th>"+
					" <th style='color:red'>"+TotalFailed +"</th>"+
					" </tr>"+
					" </table>"+

					"</body>"
					,
					"text/html");

			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}


	public static long executionTime(String endDate, String startDate){
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss")
		Date d1 = null;
		Date d2 = null;
		long diffSeconds,diffMinutes,diffHours
		try {
			d1 = format.parse(startDate);
			d2 = format.parse(endDate);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			diffSeconds = diff / 1000 % 60;
			diffMinutes = diff / (60 * 1000) % 60;
			diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return endDate +"Hrs : "+ diffMinutes +"Min : "+ diffSeconds+ "Secs"
	}

}

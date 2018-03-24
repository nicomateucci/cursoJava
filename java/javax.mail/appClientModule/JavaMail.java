import java.util.Properties;
import java.util.Scanner;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {

	public static void main(String[] args) throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		Properties props = new Properties();

		// Nombre del host de correo, es smtp.gmail.com
		props.setProperty("mail.smtp.host", "smtp.gmail.com");

		// TLS si está disponible
		props.setProperty("mail.smtp.starttls.enable", "true");

		// Puerto de gmail para envio de correos
		props.setProperty("mail.smtp.port","587");

		// Nombre del usuario
		props.setProperty("mail.smtp.user", "nico.mateucci@gmail.com");

		// Si requiere o no usuario y password para conectarse.
		props.setProperty("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props);

		// Para obtener un log de salida más extenso
		session.setDebug(true);
		
		MimeMessage message = new MimeMessage(session);

		// Quien envia el correo
		message.setFrom(new InternetAddress("nico.mateucci@gmail.com"));

		// A quien va dirigido
		message.addRecipient(Message.RecipientType.TO, new InternetAddress("nico-mateucci@hotmail.com"));

		message.setSubject("Email mandado desde ECLIPSE");
		message.setText("Si este mensaje se visualiza correctamente, el mail fue mandado con exito.");
		
		System.out.println("Quiere mandar el mail ?. 0-SI, Otro-NO");
		Scanner s = new Scanner(System.in);
		char opc = s.nextLine().charAt(0);
		if ( opc == '0')
		{
		Transport t = session.getTransport("smtp");

		// Aqui usuario y password de gmail
		String psw = "<zxc-.,m1234ASDF";
		t.connect("nico.mateucci@gmail.com", psw);
		t.sendMessage(message,message.getAllRecipients());
		t.close();
		}
		
		s.close();
	}

}

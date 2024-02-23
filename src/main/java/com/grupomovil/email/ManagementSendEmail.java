package com.grupomovil.email;

import com.grupomovil.entity.EBGm_ema;
import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class ManagementSendEmail implements Serializable {

    private static final long serialVersionUID = 1L;

    //Datos conexión
    private String smtpHost;
    private String userName;
    private String from;
    private String port;
    private String password;

    //Datos configuración 
    private Properties props;
    private Session session;
    private MimeMessage message;
    private Transport t;

    private EBGm_ema email;

    private MimeBodyPart text;
    private MimeMultipart multiParte;

    public ManagementSendEmail(String smtpHost, String userName, String password, String port, EBGm_ema email) {
        this.smtpHost = smtpHost;
        this.userName = userName;
        this.port = port;
        this.password = password;
        this.email = email;
    }

    public void preInit() {
        props = new Properties();
        props.setProperty("mail.smtp.host", smtpHost);
        props.setProperty("mail.smtp.port", port);
        props.setProperty("mail.smtp.user", userName);
        props.setProperty("mail.smtp.password", password);
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.starttls.required", "true");

        session = Session.getDefaultInstance(props);

    }

    /**
     * Configurar Envio
     *
     * @return
     */
    public boolean configureMessage() {
        try {
            message = new MimeMessage(session);
            addRecipient();
            addCc();
            addCco();
            addSubject();
            addMessage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Enviar correo
     *
     * @return
     */
    public boolean sendEmail() {
        try {
            t = session.getTransport("smtp");
            t.connect(props.getProperty("mail.smtp.host"),
                    props.getProperty("mail.smtp.user"),
                    props.getProperty("mail.smtp.password"));
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Agrega texto al cuerpo del mensaje
     */
    private void addText() throws MessagingException {
        text = new MimeBodyPart();
        String contentText = email.getMessage();
        text.setContent(contentText, "text/html; charset=utf-8;");
    }

    /**
     * Agrega el cuerpo al mensaje
     */
    private void addMessage() throws MessagingException, IOException {
        addText();
        multiParte = new MimeMultipart();
        multiParte.addBodyPart(text);
        message.addHeader("Disposition-Notification-To", from);
        message.setContent(multiParte);
    }

    /**
     * Agrega el asunto al mensaje
     */
    private void addSubject() throws MessagingException {
        message.setSubject(email.getSubject());
    }

    /**
     * Agrega los destinatarios
     */
    private void addRecipient() throws AddressException, MessagingException {
        String[] tos = email.getTo().split(";");
        for (String to : tos) {
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        }
    }

    /**
     * Agrega los destinatarios con copia
     */
    private void addCc() throws AddressException, MessagingException {
        if (email.getCc() != null && !email.getCc().isEmpty()) {
            String[] ccs = email.getCc().split(";");
            for (String cc : ccs) {
                message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));
            }
        }
    }

    /**
     * Agrega los destinatarios con copia oculta
     */
    private void addCco() throws AddressException, MessagingException {
        if (email.getCco() != null && !email.getCco().isEmpty()) {
            String[] ccos = email.getCco().split(";");
            for (String cco : ccos) {
                message.addRecipient(Message.RecipientType.BCC, new InternetAddress(cco));
            }
        }
    }

    public EBGm_ema getEmail() {
        return email;
    }

    public void setEmail(EBGm_ema email) {
        this.email = email;
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Properties getProps() {
        return props;
    }

}

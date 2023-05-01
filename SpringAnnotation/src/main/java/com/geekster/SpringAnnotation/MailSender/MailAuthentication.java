package com.geekster.SpringAnnotation.MailSender;

import com.geekster.SpringAnnotation.MailSender.MailConstants;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthentication extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(MailConstants.SENDER, "vqzhwelbargnbupj");
    }
}

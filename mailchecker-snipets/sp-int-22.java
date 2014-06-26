public class MailSenderController
{
    // ...
    @Autowired
    MailSender mailSender;
    // ...
    
    private long processRequest(MailRequest req)
    {
        for (String mailAccount : mailRequest.getMailAccounts())
        {
            // Arma el mail
            final MimeMessage mimeMessage = mailSender.createMimeMessage();
            // ...
            mailSender.sendMail(reqId, smtpId, poller, mimeMessage);
        }
    }
}
public class MailSenderController
{
    // ...
    private final MessagingTemplate template = new MessagingTemplate();

    @Autowired
    MessageChannel sendChannel;
    // ...
    
    private long processRequest(MailRequest req)
    {
        for (String mailAccount : mailRequest.getMailAccounts())
        {
      		// Arma el mail
      		final MimeMessage mimeMessage = mailSender.createMimeMessage();
      		// ...
				integrationMailSender.sendMail(reqId, smtpId, poller, mimeMessage);
		  }
    }
}

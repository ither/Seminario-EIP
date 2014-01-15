public class MailSenderController
{
    ...
    private final MessagingTemplate template = new MessagingTemplate();

    @Autowired
    MessageChannel sendChannel;
    ...
    
    private long processRequest(MailRequest req)
    {
      // Arma el mail
      final MimeMessage mimeMessage = mailSender.createMimeMessage();
      ...
      Message<MimeMessage> mailMessage = MessageBuilder.withPayload(mimeMessage)
              .setHeader(MailCheckerHeaders.REQUEST_ID, reqId)
              .setHeader(MailCheckerHeaders.MATCH_TYPE, "sent")
              .build();
      template.send(sendChannel, mailMessage);      
    }
}
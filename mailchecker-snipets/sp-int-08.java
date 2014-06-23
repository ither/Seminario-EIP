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
         mimeMessage.setHeader("X-Mailchecker", reqId);
         ...
         Message<MimeMessage> mailMessage = MessageBuilder.withPayload(mimeMessage)
         .setHeader(MailCheckerHeaders.MATCH_TYPE, "sent")
         .setHeader(MailCheckerHeaders.REQUEST_ID, reqId)
         .build();
         template.send(sendChannel, mailMessage);
    }
}
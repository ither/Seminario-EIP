public interface MailSender
{
    @Gateway(requestChannel = "requestChannel")
    public void sendMail(@Header(MailCheckerHeaders.REQUEST_ID) String reqId,
            @Header(MailCheckerHeaders.SENDER) String sender,
            @Header(MailCheckerHeaders.POLLER) String poller, MimeMessage mimeMessage);
}

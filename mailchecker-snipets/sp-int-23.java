public interface MailSender
{
    public void sendMail(String reqId, String sender, 
                String poller, MimeMessage mimeMessage);
}

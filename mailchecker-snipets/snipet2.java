public class MailCheckerAggregator
{
    @CorrelationStrategy
    public Object correlatingFor(Message<MimeMessage> message) 
    {
        return message.getHeaders().get(MailCheckerHeaders.REQUEST_ID);
    }
    
    
} 
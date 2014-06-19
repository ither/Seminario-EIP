public class MailSenderAggregator {
  ...

  @CorrelationStrategy
  public String correlateBy(MimeMessage item) {
    ...
  }

  @ReleaseStrategy
  public boolean releaseChecker(List<Message<?>> messages) {
    ...
  }

  @Aggregator
  public Object aggregatingMethod(List<Message<?>> messages) {
    ...
  }
}
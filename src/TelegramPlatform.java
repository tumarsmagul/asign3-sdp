public class TelegramPlatform implements SocialPlatform {
    @Override
    public void publish(String content) {
        System.out.println("[Telegram channel]\n" + content + "\n");
    }
}

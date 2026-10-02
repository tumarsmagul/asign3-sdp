public class InstagramPlatform implements SocialPlatform {
    @Override
    public void publish(String content) {
        System.out.println("[Instagram feed]\n" + content + "\n");
    }
}

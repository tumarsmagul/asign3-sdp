public class Main {
    public static void main(String[] args) {
        SocialPlatform telegram = new TelegramPlatform();
        SocialPlatform instagram = new InstagramPlatform();

        SmmPost educationalPost = new EducationalPost(telegram,
                "Content planning", "Plan your posts a week ahead.");
        SmmPost promotionalPost = new PromotionalPost(telegram,
                "SMM audit with a 20% discount", "Message us to book an audit.");

        educationalPost.publish();
        promotionalPost.publish();

        System.out.println(" Switching the same posts to Instagram ");
        educationalPost.setPlatform(instagram);
        promotionalPost.setPlatform(instagram);

        educationalPost.publish();
        promotionalPost.publish();
    }
}

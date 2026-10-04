public class EducationalPost extends SmmPost {
    private final String topic;
    private final String tip;

    public EducationalPost(SocialPlatform platform, String topic, String tip) {
        super(platform);
        this.topic = topic;
        this.tip = tip;
    }

    @Override
    protected String createContent() {
        return "SMM tip: " + topic + "\n" + tip;
    }
}

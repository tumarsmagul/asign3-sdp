public class PromotionalPost extends SmmPost {
    private final String offer;
    private final String callToAction;

    public PromotionalPost(SocialPlatform platform, String offer, String callToAction) {
        super(platform);
        this.offer = offer;
        this.callToAction = callToAction;
    }

    @Override
    protected String createContent() {
        return "Special offer: " + offer + "\n" + callToAction;
    }
}

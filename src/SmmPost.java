import java.util.Objects;

public abstract class SmmPost {
    private SocialPlatform platform;

    protected SmmPost(SocialPlatform platform) {
        this.platform = Objects.requireNonNull(platform, "Platform must not be null");
    }

    public void setPlatform(SocialPlatform platform) {
        this.platform = Objects.requireNonNull(platform, "Platform must not be null");
    }

    public final void publish() {
        platform.publish(createContent());
    }

    protected abstract String createContent();
}

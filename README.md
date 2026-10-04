# Assignment 3 — Bridge in SMM

This application models publishing educational and promotional social media marketing (SMM) posts on Telegram and Instagram. Publishing is simulated through console output without connecting to external APIs.

## Running the Application

Requires JDK 21. Run `Main` in IntelliJ IDEA or execute these commands from the project directory:

```sh
javac -d out src/*.java
java -cp out Main
```

## Bridge Components

| Role | Class |
| --- | --- |
| Abstraction | `SmmPost` — an abstract class holding a reference to `SocialPlatform` |
| Refined Abstraction | `EducationalPost`, `PromotionalPost` — create different types of content |
| Implementor | `SocialPlatform` — an interface declaring the `publish` operation |
| Concrete Implementor | `TelegramPlatform`, `InstagramPlatform` — display a post for the selected platform |
| Client | `Main` — creates posts with a platform and switches that platform at runtime |

In `Main`, both posts are first published on Telegram. The same objects then receive `setPlatform(instagram)` and are published on Instagram. This demonstrates all four combinations of post type and platform.

## Clean Code Principles

1. **Separation of responsibilities.** Posts create content, while platforms handle publishing. Changing a post's content does not require changing a platform.
2. **Meaningful names.** `EducationalPost`, `SocialPlatform`, and `setPlatform` clearly describe the purpose of each class or operation.
3. **Small, focused classes and methods.** Each concrete post contains only its own data and content formatting, while each platform provides a single publishing operation.
4. **Dependency on abstractions.** `SmmPost` depends on `SocialPlatform` rather than concrete platform classes. The client selects an implementation without managing its publishing details.
5. **Open for extension.** Adding a platform only requires implementing `SocialPlatform`; `SmmPost` and existing post types remain unchanged. Adding a post type likewise requires no changes to platforms.
6. **No duplicated shared logic.** Publishing delegation and platform switching belong to `SmmPost`, so post subclasses do not repeat them.


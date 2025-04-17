public class VulnerableApp {
    public static void main(String[] args) {

        // Hardcoded AWS credentials
        String awsAccessKey = "AKIAIOSFODNN7EXAMPLE";
        String awsSecretKey = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";

        // Hardcoded API keys
        String googleApiKey = "AIzaSyD-ThisIsFake-ForTest-SecretKeyOnly";
        String stripeSecretKey = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";
        String sendgridApiKey = "SG.12345_FakeSendGridApiKey_ForTesting";

        // Fake JWT secret
        String jwtSecret = "mySuperSecretJWTKeyThatShouldNotBeHere";

        // Simulated database credentials
        String dbUsername = "admin";
        String dbPassword = "SuperSecretPassword123";

        // OAuth client credentials
        String clientId = "client-id-123456789.apps.googleusercontent.com";
        String clientSecret = "client-secret-here-for-oauth-app";

        // Sample private key
        String privateKey = "-----BEGIN PRIVATE KEY-----\n"
                + "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDqFakePrivateKey\n"
                + "ThisKeyIsFakeAndForTestingOnlyDoNotUseInRealLife==\n"
                + "-----END PRIVATE KEY-----";

        // Print something
        System.out.println("Application started with secrets in source code!");
    }
}
package ExceptionHandelling;

class AppConfigException extends RuntimeException {
    public AppConfigException(String message) { super(message); }
}

public class EH07_CustomUncheckedException {
    static void loadConfig(String key) {
        if (key == null || key.isEmpty()) throw new AppConfigException("config key missing");
        System.out.println("Loaded config for key=" + key);
    }

    public static void main(String[] args) {
        try {
            loadConfig("");
        } catch (AppConfigException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

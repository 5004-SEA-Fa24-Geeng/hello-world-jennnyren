package student;

/**
 * The Greeting class models a greeting based on locality.
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * Constructor with localityID and localityName, defaults to "Hello" for greetings.
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello", "Hello", "Hello, %s!");
    }

    /**
     * Constructor with localityID, localityName, and asciiGreeting. Defaults unicodeGreeting to asciiGreeting.
     */
    public Greeting(int localityID, String localityName, String asciiGreeting) {
        this(localityID, localityName, asciiGreeting, asciiGreeting, asciiGreeting + ", %s!");
    }

    /**
     * Constructor with all fields.
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Gets the locality ID.
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Gets the locality name.
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Gets the ASCII greeting.
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Gets the Unicode greeting.
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Gets the format string.
     */
    public String getFormatStr() {
        return formatStr;
    }

    /**
     * Gets the format string, optionally returning the ASCII version if true.
     */
    public String getFormatStr(boolean useAscii) {
        return useAscii ? String.format("%s, %s!", "%s", asciiGreeting) : formatStr;
    }

    /**
     * Returns a string representation of the Greeting object.
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}

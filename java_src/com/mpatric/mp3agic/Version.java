package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class Version {
    private static final String URL = "http://github.com/mpatric/mp3agic";
    private static final String VERSION;

    public static String getUrl() {
        return URL;
    }

    static {
        String implementationVersion = Version.class.getPackage().getImplementationVersion();
        if (implementationVersion == null) {
            implementationVersion = "UNKNOWN-SNAPSHOT";
        }
        VERSION = implementationVersion;
    }

    public static String asString() {
        return getVersion() + " - " + getUrl();
    }

    public static String getVersion() {
        return VERSION;
    }
}

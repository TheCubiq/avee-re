package com.google.firebase.crashlytics.internal.ndk;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
final class ProcMapEntryParser {
    private static final Pattern MAP_REGEX = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    private ProcMapEntryParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ProcMapEntry parse(String str) {
        Matcher matcher = MAP_REGEX.matcher(str);
        if (matcher.matches()) {
            try {
                long longValue = Long.valueOf(matcher.group(1), 16).longValue();
                return new ProcMapEntry(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
            } catch (Exception unused) {
                Logger logger = Logger.getLogger();
                logger.d("Could not parse map entry: " + str);
                return null;
            }
        }
        return null;
    }
}

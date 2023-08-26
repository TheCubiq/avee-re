package christophedelory.rss;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
final class RFC822 {
    private static final DateFormat FULL_RFC822_DATETIME_FORMAT = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.US);
    private static final DateFormat FULL_RFC822_DATETIME_FORMAT_2 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm Z", Locale.US);
    private static final DateFormat COMPACT_RFC822_DATETIME_FORMAT = new SimpleDateFormat("d MMM yyyy HH:mm:ss Z", Locale.US);
    private static final DateFormat COMPACT_RFC822_DATETIME_FORMAT_2 = new SimpleDateFormat("d MMM yyyy HH:mm Z", Locale.US);
    public static final DateFormat ISO8601_DATETIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    public static String toString(Date date) {
        String format;
        synchronized (FULL_RFC822_DATETIME_FORMAT) {
            format = FULL_RFC822_DATETIME_FORMAT.format(date);
        }
        return format;
    }

    public static Date valueOf(String str) {
        Date date;
        Date date2;
        synchronized (FULL_RFC822_DATETIME_FORMAT) {
            date = null;
            try {
                date2 = FULL_RFC822_DATETIME_FORMAT.parse(str);
            } catch (ParseException unused) {
                date2 = null;
            }
        }
        if (date2 == null) {
            synchronized (FULL_RFC822_DATETIME_FORMAT_2) {
                try {
                    date2 = FULL_RFC822_DATETIME_FORMAT_2.parse(str);
                } catch (ParseException unused2) {
                    date2 = null;
                }
            }
        }
        if (date2 == null) {
            synchronized (COMPACT_RFC822_DATETIME_FORMAT) {
                try {
                    date2 = COMPACT_RFC822_DATETIME_FORMAT.parse(str);
                } catch (ParseException unused3) {
                    date2 = null;
                }
            }
        }
        if (date2 == null) {
            synchronized (COMPACT_RFC822_DATETIME_FORMAT_2) {
                try {
                    date = COMPACT_RFC822_DATETIME_FORMAT_2.parse(str);
                } catch (ParseException unused4) {
                }
            }
            return date;
        }
        return date2;
    }

    private RFC822() {
    }
}

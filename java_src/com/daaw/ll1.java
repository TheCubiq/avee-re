package com.daaw;

import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public class ll1 {
    public static final ll1 c = new ll1(null, null);
    public final Long a;
    public final TimeZone b;

    public ll1(Long l, TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    public static ll1 c() {
        return c;
    }

    public Calendar a() {
        return b(this.b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}

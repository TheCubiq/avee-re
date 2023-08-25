package com.daaw;

import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public class ll1 {

    /* renamed from: c */
    public static final ll1 f17498c = new ll1(null, null);

    /* renamed from: a */
    public final Long f17499a;

    /* renamed from: b */
    public final TimeZone f17500b;

    public ll1(Long l, TimeZone timeZone) {
        this.f17499a = l;
        this.f17500b = timeZone;
    }

    /* renamed from: c */
    public static ll1 m16875c() {
        return f17498c;
    }

    /* renamed from: a */
    public Calendar m16877a() {
        return m16876b(this.f17500b);
    }

    /* renamed from: b */
    public Calendar m16876b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f17499a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}

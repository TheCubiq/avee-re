package com.daaw;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public class tf0 {
    public static final DateFormat g = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public Date a = null;
    public Date b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = "1";

    public String a() {
        return this.c;
    }

    public String b() {
        String format;
        if (this.a != null) {
            DateFormat dateFormat = g;
            synchronized (dateFormat) {
                format = dateFormat.format(this.a);
            }
            return format;
        }
        return null;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        String format;
        if (this.b != null) {
            DateFormat dateFormat = g;
            synchronized (dateFormat) {
                format = dateFormat.format(this.b);
            }
            return format;
        }
        return null;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }
}

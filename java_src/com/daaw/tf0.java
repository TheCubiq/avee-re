package com.daaw;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public class tf0 {

    /* renamed from: g */
    public static final DateFormat f27582g = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* renamed from: a */
    public Date f27583a = null;

    /* renamed from: b */
    public Date f27584b = null;

    /* renamed from: c */
    public String f27585c = null;

    /* renamed from: d */
    public String f27586d = null;

    /* renamed from: e */
    public String f27587e = null;

    /* renamed from: f */
    public String f27588f = "1";

    /* renamed from: a */
    public String m9212a() {
        return this.f27585c;
    }

    /* renamed from: b */
    public String m9211b() {
        String format;
        if (this.f27583a != null) {
            DateFormat dateFormat = f27582g;
            synchronized (dateFormat) {
                format = dateFormat.format(this.f27583a);
            }
            return format;
        }
        return null;
    }

    /* renamed from: c */
    public String m9210c() {
        return this.f27588f;
    }

    /* renamed from: d */
    public String m9209d() {
        String format;
        if (this.f27584b != null) {
            DateFormat dateFormat = f27582g;
            synchronized (dateFormat) {
                format = dateFormat.format(this.f27584b);
            }
            return format;
        }
        return null;
    }

    /* renamed from: e */
    public String m9208e() {
        return this.f27586d;
    }

    /* renamed from: f */
    public String m9207f() {
        return this.f27587e;
    }
}

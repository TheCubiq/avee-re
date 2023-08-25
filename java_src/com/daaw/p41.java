package com.daaw;

import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class p41 {

    /* renamed from: d */
    public static final long f22580d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f22581e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final ar1 f22582a = ar1.m27138c();

    /* renamed from: b */
    public long f22583b;

    /* renamed from: c */
    public int f22584c;

    /* renamed from: c */
    public static boolean m13644c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    public static boolean m13643d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: a */
    public final synchronized long m13646a(int i) {
        if (!m13644c(i)) {
            return f22580d;
        }
        double pow = Math.pow(2.0d, this.f22584c);
        double m27136e = this.f22582a.m27136e();
        Double.isNaN(m27136e);
        return (long) Math.min(pow + m27136e, f22581e);
    }

    /* renamed from: b */
    public synchronized boolean m13645b() {
        boolean z;
        if (this.f22584c != 0) {
            z = this.f22582a.m27140a() > this.f22583b;
        }
        return z;
    }

    /* renamed from: e */
    public final synchronized void m13642e() {
        this.f22584c = 0;
    }

    /* renamed from: f */
    public synchronized void m13641f(int i) {
        if (m13643d(i)) {
            m13642e();
            return;
        }
        this.f22584c++;
        this.f22583b = this.f22582a.m27140a() + m13646a(i);
    }
}

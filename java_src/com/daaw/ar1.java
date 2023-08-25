package com.daaw;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class ar1 {

    /* renamed from: b */
    public static final long f3493b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f3494c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static ar1 f3495d;

    /* renamed from: a */
    public final InterfaceC0837bg f3496a;

    public ar1(InterfaceC0837bg interfaceC0837bg) {
        this.f3496a = interfaceC0837bg;
    }

    /* renamed from: c */
    public static ar1 m27138c() {
        return m27137d(ui1.m8116b());
    }

    /* renamed from: d */
    public static ar1 m27137d(InterfaceC0837bg interfaceC0837bg) {
        if (f3495d == null) {
            f3495d = new ar1(interfaceC0837bg);
        }
        return f3495d;
    }

    /* renamed from: g */
    public static boolean m27134g(String str) {
        return f3494c.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m27133h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m27140a() {
        return this.f3496a.mo8117a();
    }

    /* renamed from: b */
    public long m27139b() {
        return TimeUnit.MILLISECONDS.toSeconds(m27140a());
    }

    /* renamed from: e */
    public long m27136e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m27135f(kw0 kw0Var) {
        return TextUtils.isEmpty(kw0Var.mo16163b()) || kw0Var.mo16157h() + kw0Var.mo16162c() < m27139b() + f3493b;
    }
}

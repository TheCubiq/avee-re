package com.daaw;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class ar1 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static ar1 d;
    public final bg a;

    public ar1(bg bgVar) {
        this.a = bgVar;
    }

    public static ar1 c() {
        return d(ui1.b());
    }

    public static ar1 d(bg bgVar) {
        if (d == null) {
            d = new ar1(bgVar);
        }
        return d;
    }

    public static boolean g(String str) {
        return c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(kw0 kw0Var) {
        return TextUtils.isEmpty(kw0Var.b()) || kw0Var.h() + kw0Var.c() < b() + b;
    }
}

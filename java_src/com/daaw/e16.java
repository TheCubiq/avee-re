package com.daaw;

import android.content.SharedPreferences;
import android.util.Pair;
/* loaded from: classes2.dex */
public final class e16 {

    /* renamed from: a */
    public final String f8033a;

    /* renamed from: b */
    public final String f8034b;

    /* renamed from: c */
    public final String f8035c;

    /* renamed from: d */
    public final long f8036d;

    /* renamed from: e */
    public final /* synthetic */ l36 f8037e;

    public /* synthetic */ e16(l36 l36Var, String str, long j, b06 b06Var) {
        this.f8037e = l36Var;
        ry0.m10834f("health_monitor");
        ry0.m10839a(j > 0);
        this.f8033a = "health_monitor:start";
        this.f8034b = "health_monitor:count";
        this.f8035c = "health_monitor:value";
        this.f8036d = j;
    }

    /* renamed from: a */
    public final Pair m23795a() {
        long abs;
        this.f8037e.mo6991f();
        this.f8037e.mo6991f();
        long m23793c = m23793c();
        if (m23793c == 0) {
            m23792d();
            abs = 0;
        } else {
            abs = Math.abs(m23793c - this.f8037e.f25143a.mo3909b().mo15860a());
        }
        long j = this.f8036d;
        if (abs < j) {
            return null;
        }
        if (abs > j + j) {
            m23792d();
            return null;
        }
        String string = this.f8037e.m17176n().getString(this.f8035c, null);
        long j2 = this.f8037e.m17176n().getLong(this.f8034b, 0L);
        m23792d();
        return (string == null || j2 <= 0) ? l36.f17000y : new Pair(string, Long.valueOf(j2));
    }

    /* renamed from: b */
    public final void m23794b(String str, long j) {
        this.f8037e.mo6991f();
        if (m23793c() == 0) {
            m23792d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f8037e.m17176n().getLong(this.f8034b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f8037e.m17176n().edit();
            edit.putString(this.f8035c, str);
            edit.putLong(this.f8034b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f8037e.f25143a.m24045N().m24462u().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f8037e.m17176n().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f8035c, str);
        }
        edit2.putLong(this.f8034b, j3);
        edit2.apply();
    }

    /* renamed from: c */
    public final long m23793c() {
        return this.f8037e.m17176n().getLong(this.f8033a, 0L);
    }

    /* renamed from: d */
    public final void m23792d() {
        this.f8037e.mo6991f();
        long mo15860a = this.f8037e.f25143a.mo3909b().mo15860a();
        SharedPreferences.Editor edit = this.f8037e.m17176n().edit();
        edit.remove(this.f8034b);
        edit.remove(this.f8035c);
        edit.putLong(this.f8033a, mo15860a);
        edit.apply();
    }
}

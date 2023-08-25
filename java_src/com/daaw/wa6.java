package com.daaw;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzccb;
import java.util.List;
/* loaded from: classes.dex */
public final class wa6 {
    public final zzccb a;
    public final int b;

    public wa6(zzccb zzccbVar, int i) {
        this.a = zzccbVar;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final PackageInfo b() {
        return this.a.u;
    }

    public final String c() {
        return this.a.s;
    }

    public final String d() {
        return this.a.p.getString("ms");
    }

    public final String e() {
        return this.a.w;
    }

    public final List f() {
        return this.a.t;
    }

    public final boolean g() {
        return this.a.A;
    }

    public final boolean h() {
        return this.a.p.getBoolean("is_gbid");
    }

    public final boolean i() {
        return this.a.z;
    }
}

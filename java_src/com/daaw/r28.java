package com.daaw;

import android.net.Uri;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class r28 {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    @Nullable
    public final v38 i;

    public r28(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public r28(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable v38 v38Var) {
        this.a = null;
        this.b = uri;
        this.c = "";
        this.d = "";
        this.e = z;
        this.f = false;
        this.g = z3;
        this.h = false;
        this.i = null;
    }

    public final r28 a() {
        return new r28(null, this.b, this.c, this.d, this.e, false, true, false, null);
    }

    public final r28 b() {
        if (this.c.isEmpty()) {
            return new r28(null, this.b, this.c, this.d, true, false, this.g, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final j38 c(String str, double d) {
        return new l28(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final j38 d(String str, long j) {
        return new f28(this, str, Long.valueOf(j), true);
    }

    public final j38 e(String str, String str2) {
        return new o28(this, str, str2, true);
    }

    public final j38 f(String str, boolean z) {
        return new i28(this, str, Boolean.valueOf(z), true);
    }
}

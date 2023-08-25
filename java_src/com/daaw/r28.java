package com.daaw;

import android.net.Uri;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class r28 {

    /* renamed from: a */
    public final String f24789a;

    /* renamed from: b */
    public final Uri f24790b;

    /* renamed from: c */
    public final String f24791c;

    /* renamed from: d */
    public final String f24792d;

    /* renamed from: e */
    public final boolean f24793e;

    /* renamed from: f */
    public final boolean f24794f;

    /* renamed from: g */
    public final boolean f24795g;

    /* renamed from: h */
    public final boolean f24796h;
    @Nullable

    /* renamed from: i */
    public final v38 f24797i;

    public r28(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public r28(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable v38 v38Var) {
        this.f24789a = null;
        this.f24790b = uri;
        this.f24791c = "";
        this.f24792d = "";
        this.f24793e = z;
        this.f24794f = false;
        this.f24795g = z3;
        this.f24796h = false;
        this.f24797i = null;
    }

    /* renamed from: a */
    public final r28 m11828a() {
        return new r28(null, this.f24790b, this.f24791c, this.f24792d, this.f24793e, false, true, false, null);
    }

    /* renamed from: b */
    public final r28 m11827b() {
        if (this.f24791c.isEmpty()) {
            return new r28(null, this.f24790b, this.f24791c, this.f24792d, true, false, this.f24795g, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final j38 m11826c(String str, double d) {
        return new l28(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final j38 m11825d(String str, long j) {
        return new f28(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final j38 m11824e(String str, String str2) {
        return new o28(this, str, str2, true);
    }

    /* renamed from: f */
    public final j38 m11823f(String str, boolean z) {
        return new i28(this, str, Boolean.valueOf(z), true);
    }
}

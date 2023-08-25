package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
/* renamed from: com.daaw.f7 */
/* loaded from: classes.dex */
public final class C1255f7 {

    /* renamed from: e */
    public static final C1255f7 f9202e = new C1257b().m22878a();

    /* renamed from: a */
    public final int f9203a;

    /* renamed from: b */
    public final int f9204b;

    /* renamed from: c */
    public final int f9205c;

    /* renamed from: d */
    public AudioAttributes f9206d;

    /* renamed from: com.daaw.f7$b */
    /* loaded from: classes.dex */
    public static final class C1257b {

        /* renamed from: a */
        public int f9207a = 0;

        /* renamed from: b */
        public int f9208b = 0;

        /* renamed from: c */
        public int f9209c = 1;

        /* renamed from: a */
        public C1255f7 m22878a() {
            return new C1255f7(this.f9207a, this.f9208b, this.f9209c);
        }
    }

    public C1255f7(int i, int i2, int i3) {
        this.f9203a = i;
        this.f9204b = i2;
        this.f9205c = i3;
    }

    @TargetApi(21)
    /* renamed from: a */
    public AudioAttributes m22879a() {
        if (this.f9206d == null) {
            this.f9206d = new AudioAttributes.Builder().setContentType(this.f9203a).setFlags(this.f9204b).setUsage(this.f9205c).build();
        }
        return this.f9206d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1255f7.class != obj.getClass()) {
            return false;
        }
        C1255f7 c1255f7 = (C1255f7) obj;
        return this.f9203a == c1255f7.f9203a && this.f9204b == c1255f7.f9204b && this.f9205c == c1255f7.f9205c;
    }

    public int hashCode() {
        return ((((527 + this.f9203a) * 31) + this.f9204b) * 31) + this.f9205c;
    }
}

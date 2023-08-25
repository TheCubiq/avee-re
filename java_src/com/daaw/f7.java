package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
/* loaded from: classes.dex */
public final class f7 {
    public static final f7 e = new b().a();
    public final int a;
    public final int b;
    public final int c;
    public AudioAttributes d;

    /* loaded from: classes.dex */
    public static final class b {
        public int a = 0;
        public int b = 0;
        public int c = 1;

        public f7 a() {
            return new f7(this.a, this.b, this.c);
        }
    }

    public f7(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @TargetApi(21)
    public AudioAttributes a() {
        if (this.d == null) {
            this.d = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c).build();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f7.class != obj.getClass()) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return this.a == f7Var.a && this.b == f7Var.b && this.c == f7Var.c;
    }

    public int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }
}

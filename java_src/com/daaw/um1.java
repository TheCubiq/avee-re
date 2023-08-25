package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class um1 {
    public final int a;
    public final com.google.android.exoplayer2.trackselection.c[] b;
    public int c;

    public um1(com.google.android.exoplayer2.trackselection.c... cVarArr) {
        this.b = cVarArr;
        this.a = cVarArr.length;
    }

    public com.google.android.exoplayer2.trackselection.c a(int i) {
        return this.b[i];
    }

    public com.google.android.exoplayer2.trackselection.c[] b() {
        return (com.google.android.exoplayer2.trackselection.c[]) this.b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || um1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((um1) obj).b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }
}

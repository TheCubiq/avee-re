package com.daaw;

import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class mo8 {

    /* renamed from: f */
    public static final mo8 f19049f = new mo8(1, 2, 3, null);

    /* renamed from: g */
    public static final th8 f19050g = new th8() { // from class: com.daaw.om8
    };

    /* renamed from: a */
    public final int f19051a;

    /* renamed from: b */
    public final int f19052b;

    /* renamed from: c */
    public final int f19053c;

    /* renamed from: d */
    public final byte[] f19054d;

    /* renamed from: e */
    public int f19055e;

    public mo8(int i, int i2, int i3, byte[] bArr) {
        this.f19051a = i;
        this.f19052b = i2;
        this.f19053c = i3;
        this.f19054d = bArr;
    }

    @Pure
    /* renamed from: a */
    public static int m15870a(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    /* renamed from: b */
    public static int m15869b(int i) {
        if (i != 1) {
            if (i != 16) {
                if (i != 18) {
                    return (i == 6 || i == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mo8.class == obj.getClass()) {
            mo8 mo8Var = (mo8) obj;
            if (this.f19051a == mo8Var.f19051a && this.f19052b == mo8Var.f19052b && this.f19053c == mo8Var.f19053c && Arrays.equals(this.f19054d, mo8Var.f19054d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f19055e;
        if (i == 0) {
            int hashCode = ((((((this.f19051a + 527) * 31) + this.f19052b) * 31) + this.f19053c) * 31) + Arrays.hashCode(this.f19054d);
            this.f19055e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        int i = this.f19051a;
        int i2 = this.f19052b;
        int i3 = this.f19053c;
        boolean z = this.f19054d != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }
}

package com.daaw;

import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class mo8 {
    public static final mo8 f = new mo8(1, 2, 3, null);
    public static final th8 g = new th8() { // from class: com.daaw.om8
    };
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public int e;

    public mo8(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    @Pure
    public static int a(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    public static int b(int i) {
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
            if (this.a == mo8Var.a && this.b == mo8Var.b && this.c == mo8Var.c && Arrays.equals(this.d, mo8Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        boolean z = this.d != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }
}

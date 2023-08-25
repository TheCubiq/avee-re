package com.daaw;

import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class n09 {
    public static int a(k09 k09Var, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int f = k09Var.f(bArr, i + i3, i2 - i3);
            if (f == -1) {
                break;
            }
            i3 += f;
        }
        return i3;
    }

    @Pure
    public static void b(boolean z, String str) {
        if (!z) {
            throw dl3.a(str, null);
        }
    }

    public static boolean c(k09 k09Var, byte[] bArr, int i, int i2, boolean z) {
        try {
            return k09Var.h(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean d(k09 k09Var, byte[] bArr, int i, int i2) {
        try {
            ((rz8) k09Var).e(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(k09 k09Var, int i) {
        try {
            ((rz8) k09Var).l(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}

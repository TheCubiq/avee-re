package com.daaw;

import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class n09 {
    /* renamed from: a */
    public static int m15610a(k09 k09Var, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int mo5662f = k09Var.mo5662f(bArr, i + i3, i2 - i3);
            if (mo5662f == -1) {
                break;
            }
            i3 += mo5662f;
        }
        return i3;
    }

    @Pure
    /* renamed from: b */
    public static void m15609b(boolean z, String str) {
        if (!z) {
            throw dl3.m24267a(str, null);
        }
    }

    /* renamed from: c */
    public static boolean m15608c(k09 k09Var, byte[] bArr, int i, int i2, boolean z) {
        try {
            return k09Var.mo5661h(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: d */
    public static boolean m15607d(k09 k09Var, byte[] bArr, int i, int i2) {
        try {
            ((rz8) k09Var).mo5663e(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m15606e(k09 k09Var, int i) {
        try {
            ((rz8) k09Var).m10811l(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}

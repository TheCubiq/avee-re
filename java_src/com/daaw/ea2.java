package com.daaw;

import java.util.UUID;
/* loaded from: classes.dex */
public final class ea2 {
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UUID m23633a(byte[] bArr) {
        da2 da2Var;
        UUID uuid;
        ik5 ik5Var = new ik5(bArr);
        if (ik5Var.m19710l() >= 32) {
            ik5Var.m19716f(0);
            if (ik5Var.m19709m() == ik5Var.m19713i() + 4 && ik5Var.m19709m() == 1886614376) {
                int m25488a = c92.m25488a(ik5Var.m19709m());
                if (m25488a > 1) {
                    s95.m10493e("PsshAtomUtil", "Unsupported pssh version: " + m25488a);
                } else {
                    UUID uuid2 = new UUID(ik5Var.m19696z(), ik5Var.m19696z());
                    if (m25488a == 1) {
                        ik5Var.m19715g(ik5Var.m19700v() * 16);
                    }
                    int m19700v = ik5Var.m19700v();
                    if (m19700v == ik5Var.m19713i()) {
                        byte[] bArr2 = new byte[m19700v];
                        ik5Var.m19720b(bArr2, 0, m19700v);
                        da2Var = new da2(uuid2, m25488a, bArr2);
                        if (da2Var != null) {
                            return null;
                        }
                        uuid = da2Var.f6716a;
                        return uuid;
                    }
                }
            }
        }
        da2Var = null;
        if (da2Var != null) {
        }
    }
}

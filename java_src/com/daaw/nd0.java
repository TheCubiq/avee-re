package com.daaw;
/* loaded from: classes2.dex */
public class nd0 {
    /* renamed from: a */
    public static AbstractC2003l m15223a(byte[] bArr) {
        dd0 dd0Var = new dd0(bArr);
        return dd0Var.m17282e().isEmpty() ? new dd0(bArr, true) : dd0Var;
    }

    /* renamed from: b */
    public static AbstractC2003l m15222b(byte[] bArr) {
        m15221c(bArr);
        byte b = bArr[3];
        if (b != 2) {
            if (b != 3) {
                if (b == 4) {
                    return new gd0(bArr);
                }
                throw new sp1("Tag version not supported");
            }
            return new ed0(bArr);
        }
        return m15223a(bArr);
    }

    /* renamed from: c */
    public static void m15221c(byte[] bArr) {
        if (bArr.length < 10) {
            throw new xs0("Buffer too short");
        }
        if (!"ID3".equals(C3419wc.m6201c(bArr, 0, 3))) {
            throw new xs0();
        }
        byte b = bArr[3];
        if (b == 2 || b == 3 || b == 4) {
            return;
        }
        byte b2 = bArr[4];
        throw new sp1("Unsupported version 2." + ((int) b) + "." + ((int) b2));
    }
}

package com.daaw;
/* loaded from: classes2.dex */
public class nd0 {
    public static l a(byte[] bArr) {
        dd0 dd0Var = new dd0(bArr);
        return dd0Var.e().isEmpty() ? new dd0(bArr, true) : dd0Var;
    }

    public static l b(byte[] bArr) {
        c(bArr);
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
        return a(bArr);
    }

    public static void c(byte[] bArr) {
        if (bArr.length < 10) {
            throw new xs0("Buffer too short");
        }
        if (!"ID3".equals(wc.c(bArr, 0, 3))) {
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

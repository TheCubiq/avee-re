package com.daaw;

import java.security.interfaces.ECPrivateKey;
/* loaded from: classes.dex */
public final class uo7 implements k87 {
    public final ECPrivateKey a;
    public final wo7 b;
    public final String c;
    public final byte[] d;
    public final to7 e;

    public uo7(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, to7 to7Var) {
        this.a = eCPrivateKey;
        this.b = new wo7(eCPrivateKey);
        this.d = bArr;
        this.c = str;
        this.e = to7Var;
    }
}

package com.daaw;

import java.security.interfaces.ECPrivateKey;
/* loaded from: classes.dex */
public final class uo7 implements k87 {

    /* renamed from: a */
    public final ECPrivateKey f29384a;

    /* renamed from: b */
    public final wo7 f29385b;

    /* renamed from: c */
    public final String f29386c;

    /* renamed from: d */
    public final byte[] f29387d;

    /* renamed from: e */
    public final to7 f29388e;

    public uo7(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, to7 to7Var) {
        this.f29384a = eCPrivateKey;
        this.f29385b = new wo7(eCPrivateKey);
        this.f29387d = bArr;
        this.f29386c = str;
        this.f29388e = to7Var;
    }
}

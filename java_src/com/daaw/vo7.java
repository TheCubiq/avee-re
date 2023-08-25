package com.daaw;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;
/* loaded from: classes.dex */
public final class vo7 implements l87 {
    public static final byte[] f = new byte[0];
    public final bp7 a;
    public final String b;
    public final byte[] c;
    public final to7 d;
    public final int e;

    public vo7(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, to7 to7Var) {
        cp7.d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.a = new bp7(eCPublicKey);
        this.c = bArr;
        this.b = str;
        this.e = i;
        this.d = to7Var;
    }

    @Override // com.daaw.l87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ap7 a = this.a.a(this.b, this.c, bArr2, this.d.zza(), this.e);
        byte[] a2 = this.d.b(a.b()).a(bArr, f);
        byte[] a3 = a.a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}

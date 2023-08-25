package com.daaw;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;
/* loaded from: classes.dex */
public final class vo7 implements l87 {

    /* renamed from: f */
    public static final byte[] f30404f = new byte[0];

    /* renamed from: a */
    public final bp7 f30405a;

    /* renamed from: b */
    public final String f30406b;

    /* renamed from: c */
    public final byte[] f30407c;

    /* renamed from: d */
    public final to7 f30408d;

    /* renamed from: e */
    public final int f30409e;

    public vo7(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, to7 to7Var) {
        cp7.m25139d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f30405a = new bp7(eCPublicKey);
        this.f30407c = bArr;
        this.f30406b = str;
        this.f30409e = i;
        this.f30408d = to7Var;
    }

    @Override // com.daaw.l87
    /* renamed from: a */
    public final byte[] mo6966a(byte[] bArr, byte[] bArr2) {
        ap7 m25925a = this.f30405a.m25925a(this.f30406b, this.f30407c, bArr2, this.f30408d.zza(), this.f30409e);
        byte[] m12604a = this.f30408d.mo8319b(m25925a.m27228b()).m12604a(bArr, f30404f);
        byte[] m27229a = m25925a.m27229a();
        return ByteBuffer.allocate(m27229a.length + m12604a.length).put(m27229a).put(m12604a).array();
    }
}

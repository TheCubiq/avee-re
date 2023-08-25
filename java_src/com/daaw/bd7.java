package com.daaw;
/* loaded from: classes.dex */
public final class bd7 implements l87 {

    /* renamed from: e */
    public static final byte[] f4743e = new byte[0];

    /* renamed from: a */
    public final im7 f4744a;

    /* renamed from: b */
    public final cd7 f4745b;

    /* renamed from: c */
    public final yc7 f4746c;

    /* renamed from: d */
    public final xc7 f4747d;

    public bd7(im7 im7Var, cd7 cd7Var, xc7 xc7Var, yc7 yc7Var, byte[] bArr) {
        this.f4744a = im7Var;
        this.f4745b = cd7Var;
        this.f4747d = xc7Var;
        this.f4746c = yc7Var;
    }

    /* renamed from: b */
    public static bd7 m26199b(im7 im7Var) {
        if (im7Var.m19633R().m3416h()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        cm7 m19638M = im7Var.m19638M();
        return new bd7(im7Var, fd7.m22768b(m19638M), fd7.m22767c(m19638M), fd7.m22769a(m19638M), null);
    }

    @Override // com.daaw.l87
    /* renamed from: a */
    public final byte[] mo6966a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        im7 im7Var = this.f4744a;
        cd7 cd7Var = this.f4745b;
        xc7 xc7Var = this.f4747d;
        yc7 yc7Var = this.f4746c;
        dd7 mo14328a = cd7Var.mo14328a(im7Var.m19633R().m3415j());
        zc7 m2485c = zc7.m2485c(mo14328a.m24516a(), mo14328a.m24515b(), cd7Var, xc7Var, yc7Var, bArr3);
        return qo7.m12307b(m2485c.m2487a(), m2485c.m2486b(bArr, f4743e));
    }
}

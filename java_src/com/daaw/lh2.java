package com.daaw;

import java.nio.ByteBuffer;
import java.util.Date;
/* loaded from: classes.dex */
public final class lh2 extends cz7 {

    /* renamed from: A */
    public Date f17391A;

    /* renamed from: B */
    public Date f17392B;

    /* renamed from: C */
    public long f17393C;

    /* renamed from: D */
    public long f17394D;

    /* renamed from: E */
    public double f17395E;

    /* renamed from: F */
    public float f17396F;

    /* renamed from: G */
    public pz7 f17397G;

    /* renamed from: H */
    public long f17398H;

    public lh2() {
        super("mvhd");
        this.f17395E = 1.0d;
        this.f17396F = 1.0f;
        this.f17397G = pz7.f23560j;
    }

    @Override // com.daaw.az7
    /* renamed from: b */
    public final void mo16028b(ByteBuffer byteBuffer) {
        long m20793e;
        m24855f(byteBuffer);
        if (m24856e() == 1) {
            this.f17391A = kz7.m17287a(hh2.m20792f(byteBuffer));
            this.f17392B = kz7.m17287a(hh2.m20792f(byteBuffer));
            this.f17393C = hh2.m20793e(byteBuffer);
            m20793e = hh2.m20792f(byteBuffer);
        } else {
            this.f17391A = kz7.m17287a(hh2.m20793e(byteBuffer));
            this.f17392B = kz7.m17287a(hh2.m20793e(byteBuffer));
            this.f17393C = hh2.m20793e(byteBuffer);
            m20793e = hh2.m20793e(byteBuffer);
        }
        this.f17394D = m20793e;
        this.f17395E = hh2.m20796b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f17396F = ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
        hh2.m20794d(byteBuffer);
        hh2.m20793e(byteBuffer);
        hh2.m20793e(byteBuffer);
        double m20796b = hh2.m20796b(byteBuffer);
        double m20796b2 = hh2.m20796b(byteBuffer);
        double m20797a = hh2.m20797a(byteBuffer);
        this.f17397G = new pz7(m20796b, m20796b2, hh2.m20796b(byteBuffer), hh2.m20796b(byteBuffer), m20797a, hh2.m20797a(byteBuffer), hh2.m20797a(byteBuffer), hh2.m20796b(byteBuffer), hh2.m20796b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f17398H = hh2.m20793e(byteBuffer);
    }

    /* renamed from: g */
    public final long m16955g() {
        return this.f17394D;
    }

    /* renamed from: h */
    public final long m16954h() {
        return this.f17393C;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f17391A + ";modificationTime=" + this.f17392B + ";timescale=" + this.f17393C + ";duration=" + this.f17394D + ";rate=" + this.f17395E + ";volume=" + this.f17396F + ";matrix=" + this.f17397G + ";nextTrackId=" + this.f17398H + "]";
    }
}

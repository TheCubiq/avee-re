package com.daaw;

import java.nio.ByteBuffer;
import java.util.Date;
/* loaded from: classes.dex */
public final class lh2 extends cz7 {
    public Date A;
    public Date B;
    public long C;
    public long D;
    public double E;
    public float F;
    public pz7 G;
    public long H;

    public lh2() {
        super("mvhd");
        this.E = 1.0d;
        this.F = 1.0f;
        this.G = pz7.j;
    }

    @Override // com.daaw.az7
    public final void b(ByteBuffer byteBuffer) {
        long e;
        f(byteBuffer);
        if (e() == 1) {
            this.A = kz7.a(hh2.f(byteBuffer));
            this.B = kz7.a(hh2.f(byteBuffer));
            this.C = hh2.e(byteBuffer);
            e = hh2.f(byteBuffer);
        } else {
            this.A = kz7.a(hh2.e(byteBuffer));
            this.B = kz7.a(hh2.e(byteBuffer));
            this.C = hh2.e(byteBuffer);
            e = hh2.e(byteBuffer);
        }
        this.D = e;
        this.E = hh2.b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.F = ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
        hh2.d(byteBuffer);
        hh2.e(byteBuffer);
        hh2.e(byteBuffer);
        double b = hh2.b(byteBuffer);
        double b2 = hh2.b(byteBuffer);
        double a = hh2.a(byteBuffer);
        this.G = new pz7(b, b2, hh2.b(byteBuffer), hh2.b(byteBuffer), a, hh2.a(byteBuffer), hh2.a(byteBuffer), hh2.b(byteBuffer), hh2.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.H = hh2.e(byteBuffer);
    }

    public final long g() {
        return this.D;
    }

    public final long h() {
        return this.C;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.A + ";modificationTime=" + this.B + ";timescale=" + this.C + ";duration=" + this.D + ";rate=" + this.E + ";volume=" + this.F + ";matrix=" + this.G + ";nextTrackId=" + this.H + "]";
    }
}

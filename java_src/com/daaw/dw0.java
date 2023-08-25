package com.daaw;

import com.daaw.avee.comp.playback.C0729a;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class dw0 {

    /* renamed from: p */
    public static int f7919p = 5236;

    /* renamed from: h */
    public String f7927h;

    /* renamed from: i */
    public long f7928i;

    /* renamed from: a */
    public ByteBuffer f7920a = ByteBuffer.allocate(20000);

    /* renamed from: b */
    public final Object f7921b = new Object();

    /* renamed from: c */
    public int f7922c = -1;

    /* renamed from: d */
    public long f7923d = -1;

    /* renamed from: l */
    public int f7931l = 0;

    /* renamed from: n */
    public C2931sc f7933n = new C2931sc();

    /* renamed from: o */
    public byte[][] f7934o = (byte[][]) Array.newInstance(byte.class, 1, 0);

    /* renamed from: j */
    public int f7929j = 44100;

    /* renamed from: k */
    public int f7930k = 2;

    /* renamed from: e */
    public int f7924e = 0;

    /* renamed from: f */
    public a31 f7925f = null;

    /* renamed from: g */
    public int f7926g = 0;

    /* renamed from: m */
    public long f7932m = 0;

    public dw0(String str, long j) {
        this.f7927h = str;
        this.f7928i = j;
    }

    /* renamed from: a */
    public final void m23862a(int i, int i2, int i3) {
        this.f7929j = i;
        this.f7930k = i2;
        this.f7924e = hr1.m20468b(this.f7928i, i2, i3, i);
        int i4 = 0;
        this.f7926g = 0;
        a31 a31Var = this.f7925f;
        if (a31Var != null) {
            a31Var.m27724a();
        }
        do {
            a31 m27723b = a31.m27723b(this.f7927h + i4, this.f7924e + 5120);
            this.f7925f = m27723b;
            i4++;
            if (m27723b != null) {
                break;
            }
        } while (i4 < 3);
        this.f7932m = 0L;
    }

    /* renamed from: b */
    public void m23861b() {
        a31 a31Var = this.f7925f;
        if (a31Var != null) {
            a31Var.m27724a();
        }
        this.f7925f = null;
    }

    /* renamed from: c */
    public C0729a m23860c(long j, C0729a.C0737h c0737h, C0729a c0729a, int i) {
        boolean z;
        ByteBuffer m27722c;
        int i2;
        float[] fArr;
        c0729a.f3952k = false;
        c0729a.f3954m = j;
        c0729a.f3956o = 0L;
        c0729a.f3957p = Long.MAX_VALUE;
        c0729a.f3958q = Long.MIN_VALUE;
        if (this.f7925f == null) {
            return c0729a;
        }
        int i3 = this.f7929j;
        c0729a.m26739d(i3, c0737h.f3980a, c0737h.f3983d, hr1.m20467c(c0737h.f3982c, i3));
        long j2 = j + (c0737h.f3981b * 1000);
        int m20468b = hr1.m20468b(j2, this.f7930k, i, this.f7929j);
        int m20466d = hr1.m20466d(c0729a.m26741b(), this.f7930k, i);
        int m20466d2 = hr1.m20466d(c0729a.m26740c(), this.f7930k, i);
        long j3 = m20468b - this.f7931l;
        if (Math.abs(j3) < i) {
            m20468b = this.f7931l;
        } else if (j3 != 0) {
            lz1.m16363c("! readPosDelta: " + j3);
        }
        this.f7931l = m20466d2 + m20468b;
        int i4 = this.f7924e;
        int i5 = m20468b + m20466d;
        int i6 = i4 - i5;
        int max = Math.max(0, i5 - i4);
        int max2 = Math.max(0, m20466d - max);
        int i7 = m20468b + max2;
        if (i7 > this.f7926g - 10) {
            z = i6 <= f7919p;
            StringBuilder sb = new StringBuilder();
            sb.append("need read to");
            sb.append(z ? "/ignore: " : ": ");
            sb.append(i7);
            sb.append("; raf filled to: ");
            sb.append(this.f7926g);
            sb.append("; maxBytes: ");
            sb.append(this.f7924e);
            sb.append("; bytesTillEnd: ");
            sb.append(i6);
            lz1.m16363c(sb.toString());
            if (!z) {
                return c0729a;
            }
        } else {
            z = false;
        }
        synchronized (this.f7921b) {
            try {
                try {
                    a31 a31Var = this.f7925f;
                    if (a31Var == null) {
                        return c0729a;
                    }
                    if (z) {
                        this.f7920a.position(0);
                        m27722c = this.f7920a;
                    } else {
                        m27722c = a31Var.m27722c(m20468b);
                    }
                    ByteBuffer byteBuffer = m27722c;
                    if (max2 > byteBuffer.remaining()) {
                        lz1.m16363c("readSizeInBytes [" + max2 + "] > buf.remainingInBytes [" + byteBuffer.remaining() + "]");
                        i2 = byteBuffer.remaining();
                    } else {
                        i2 = max2;
                    }
                    this.f7933n.m10466b(byteBuffer, 0L, this.f7929j, this.f7930k, i2, i, this.f7934o);
                    short[] sArr = new short[2];
                    int m10464d = this.f7933n.m10464d(c0729a.f3944c, c0729a.f3943b, 0, 0, sArr, new float[1], new long[1]);
                    c0729a.f3952k = max + m10464d >= c0729a.m26741b();
                    c0729a.f3953l = m10464d;
                    c0729a.f3955n = j2 + hr1.m20465e(m10464d, c0729a.f3947f);
                    c0729a.f3945d = sArr[0];
                    c0729a.f3946e = sArr[1];
                    c0729a.f3948g = (float) Math.sqrt((1.0f / c0729a.m26741b()) * fArr[0]);
                    c0729a.f3942a = true;
                    return c0729a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: d */
    public void m23859d() {
        synchronized (this.f7921b) {
            this.f7926g = 0;
            this.f7932m = 0L;
        }
    }

    /* renamed from: e */
    public void m23858e(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4) {
        long max = Math.max(0L, j);
        if (this.f7922c == i && this.f7923d == max) {
            return;
        }
        this.f7923d = max;
        this.f7922c = i;
        if (this.f7925f == null || this.f7929j != i2 || this.f7930k != i3) {
            lz1.m16363c("createRaf");
            synchronized (this.f7921b) {
                m23862a(i2, i3, i4);
            }
        }
        if (this.f7925f == null) {
            return;
        }
        int limit = byteBuffer.limit() - byteBuffer.position();
        int m20468b = hr1.m20468b(max, this.f7930k, i4, this.f7929j) - limit;
        if (m20468b < 0) {
            lz1.m16363c("startByte: " + m20468b + "; TimeUs: " + max);
        }
        if (m20468b < 0) {
            m20468b = 0;
        }
        int position = byteBuffer.position();
        int limit2 = byteBuffer.limit();
        int m20468b2 = hr1.m20468b(500000L, this.f7930k, i4, this.f7929j);
        synchronized (this.f7921b) {
            if (this.f7925f != null) {
                long j2 = m20468b - this.f7926g;
                if (Math.abs(j2) < m20468b2) {
                    m20468b = this.f7926g;
                } else if (j2 != 0) {
                    lz1.m16363c("newDataFillDelta: " + j2);
                }
                this.f7926g = limit + m20468b;
                this.f7925f.m27721d(m20468b, byteBuffer);
            }
        }
        byteBuffer.limit(limit2);
        byteBuffer.position(position);
    }
}

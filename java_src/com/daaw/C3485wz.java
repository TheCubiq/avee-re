package com.daaw;

import com.daaw.avee.comp.playback.C0729a;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: com.daaw.wz */
/* loaded from: classes.dex */
public class C3485wz {

    /* renamed from: a */
    public boolean f31664a;

    /* renamed from: b */
    public long f31665b = 0;

    /* renamed from: c */
    public Lock f31666c = new ReentrantLock();

    /* renamed from: d */
    public LinkedList<C2931sc> f31667d = new LinkedList<>();

    /* renamed from: e */
    public volatile int f31668e = 0;

    /* renamed from: f */
    public boolean f31669f = true;

    /* renamed from: g */
    public int f31670g = -1;

    /* renamed from: h */
    public long f31671h = -1;

    /* renamed from: i */
    public long f31672i = 0;

    /* renamed from: j */
    public byte[][] f31673j = (byte[][]) Array.newInstance(byte.class, 1, 0);

    /* renamed from: a */
    public final C2931sc m5709a(int i, long j, long[] jArr, C2931sc c2931sc) {
        Iterator<C2931sc> it = this.f31667d.iterator();
        long j2 = Long.MAX_VALUE;
        C2931sc c2931sc2 = null;
        while (it.hasNext()) {
            C2931sc next = it.next();
            if (c2931sc != next && !next.m10463e()) {
                long j3 = j - next.f26068d;
                if (j3 >= -1 && j <= next.f26065a && j2 > j3) {
                    c2931sc2 = next;
                    j2 = j3;
                }
            }
        }
        if (j2 < 0) {
            j2 = 0;
        }
        jArr[0] = j2;
        return c2931sc2;
    }

    /* renamed from: b */
    public C0729a m5708b(long j, C0729a.C0737h c0737h, C0729a c0729a, boolean z) {
        float[] fArr;
        short[] sArr;
        boolean z2;
        long[] jArr;
        long j2 = j + (c0737h.f3981b * 1000);
        char c = 0;
        if (!this.f31664a) {
            c0729a.f3942a = false;
            return c0729a;
        }
        c0729a.f3952k = false;
        c0729a.f3954m = j2;
        c0729a.f3956o = this.f31665b;
        c0729a.f3957p = Long.MAX_VALUE;
        c0729a.f3958q = Long.MIN_VALUE;
        long[] jArr2 = new long[1];
        long[] jArr3 = new long[1];
        short[] sArr2 = new short[2];
        float[] fArr2 = {0.0f};
        try {
            z2 = this.f31666c.tryLock(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            z2 = false;
        } catch (Exception e) {
            e = e;
            fArr = fArr2;
            sArr = sArr2;
            lz1.m16363c("Exception: " + e.getMessage());
            c0729a.f3945d = sArr[0];
            c0729a.f3946e = sArr[1];
            c0729a.f3948g = (float) Math.sqrt((1.0f / c0729a.m26741b()) * fArr[0]);
            c0729a.f3942a = true;
            return c0729a;
        }
        if (z2) {
            try {
                if (z) {
                    try {
                        m5704f();
                        fArr = fArr2;
                        sArr = sArr2;
                    } catch (Throwable th) {
                        th = th;
                        this.f31666c.unlock();
                        throw th;
                    }
                } else {
                    fArr = fArr2;
                    sArr = sArr2;
                    try {
                        C2931sc m5709a = m5709a(0, j2, jArr2, null);
                        if (m5709a != null) {
                            int i = m5709a.f26066b;
                            jArr = jArr3;
                            c0729a.m26739d(i, c0737h.f3980a, c0737h.f3983d, hr1.m20467c(c0737h.f3982c, i));
                        } else {
                            jArr = jArr3;
                        }
                        sArr[0] = c0729a.f3945d;
                        sArr[1] = c0729a.f3946e;
                        C2931sc c2931sc = m5709a;
                        int i2 = 0;
                        int i3 = 0;
                        while (c2931sc != null) {
                            int m20467c = hr1.m20467c(jArr2[c], c2931sc.f26066b);
                            if (i2 > 0 && m20467c != 0) {
                                lz1.m16363c("t[" + i2 + "]; startFrameOffsetBuffer != 0; totalSamplesGot: " + i3 + " startFrameOffsetBuffer: " + m20467c + " startOffsetTime: " + jArr2[c]);
                            }
                            int m10464d = c2931sc.m10464d(c0729a.f3944c, c0729a.f3943b, i3, m20467c, sArr, fArr, jArr);
                            int i4 = i3 + m10464d;
                            if (i4 >= c0729a.m26741b()) {
                                this.f31672i = c2931sc.f26068d + hr1.m20465e(m20467c + m10464d, c2931sc.f26066b);
                                c0729a.f3952k = true;
                            } else {
                                C2691q6.m12749i(jArr[c] != -1);
                                int i5 = i2 + 1;
                                if (i5 < 9) {
                                    c2931sc = m5709a(i5, jArr[c], jArr2, c2931sc);
                                    i3 = i4;
                                    i2 = i5;
                                    c = 0;
                                }
                            }
                            i3 = i4;
                            break;
                        }
                        if (i3 >= c0729a.m26741b()) {
                            c0729a.f3952k = true;
                        } else if (c0729a.m26741b() > 2) {
                            lz1.m16363c("totalSamplesGot: " + i3 + " need: " + c0729a.m26741b());
                        }
                        c0729a.f3953l = i3;
                        c0729a.f3955n = j2 + hr1.m20465e(i3, c0729a.f3947f);
                    } catch (Throwable th2) {
                        th = th2;
                        this.f31666c.unlock();
                        throw th;
                    }
                }
                this.f31666c.unlock();
            } catch (Exception e2) {
                e = e2;
                lz1.m16363c("Exception: " + e.getMessage());
                c0729a.f3945d = sArr[0];
                c0729a.f3946e = sArr[1];
                c0729a.f3948g = (float) Math.sqrt((1.0f / c0729a.m26741b()) * fArr[0]);
                c0729a.f3942a = true;
                return c0729a;
            }
        } else {
            fArr = fArr2;
            sArr = sArr2;
        }
        c0729a.f3945d = sArr[0];
        c0729a.f3946e = sArr[1];
        c0729a.f3948g = (float) Math.sqrt((1.0f / c0729a.m26741b()) * fArr[0]);
        c0729a.f3942a = true;
        return c0729a;
    }

    /* renamed from: c */
    public void m5707c() {
        this.f31668e = 1;
    }

    /* renamed from: d */
    public void m5706d(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4) {
        boolean z;
        long max = Math.max(0L, j);
        if (i > 0 && this.f31670g == i && this.f31671h == max) {
            return;
        }
        this.f31671h = max;
        this.f31670g = i;
        this.f31665b = max;
        try {
            z = this.f31666c.tryLock(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (!z) {
            lz1.m16363c("thread lock timeout 1");
            return;
        }
        try {
            try {
                if (this.f31668e > 0) {
                    m5704f();
                    this.f31668e = 0;
                }
                C2931sc c2931sc = null;
                if (this.f31667d.size() > 0 && this.f31667d.size() >= 300) {
                    c2931sc = this.f31667d.removeFirst();
                }
                if (c2931sc == null) {
                    c2931sc = new C2931sc();
                }
                c2931sc.m10465c(byteBuffer, max, i2, i3, i4, this.f31673j);
                this.f31667d.addLast(c2931sc);
                this.f31664a = true;
            } catch (Exception e) {
                lz1.m16363c("Exception: " + e.getMessage());
                e.printStackTrace();
            }
        } finally {
            this.f31666c.unlock();
        }
    }

    /* renamed from: e */
    public void m5705e() {
    }

    /* renamed from: f */
    public final void m5704f() {
        Iterator<C2931sc> it = this.f31667d.iterator();
        while (it.hasNext()) {
            it.next().m10462f();
        }
    }
}

package com.daaw;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class or2 {
    public Method A;
    public int B;
    public long C;
    public long D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public long J;
    public long K;
    public long L;
    public float M;
    public qq2[] N;
    public ByteBuffer[] O;
    public ByteBuffer P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public long Y;
    public final pr2 a;
    public final vr2 b;
    public final qq2[] c;
    public final kr2 d;
    public final ConditionVariable e = new ConditionVariable(true);
    public final long[] f;
    public final gr2 g;
    public final LinkedList h;
    public AudioTrack i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public long p;
    public fq2 q;
    public fq2 r;
    public long s;
    public long t;
    public int u;
    public int v;
    public long w;
    public long x;
    public boolean y;
    public long z;

    public or2(oq2 oq2Var, qq2[] qq2VarArr, kr2 kr2Var) {
        this.d = kr2Var;
        if (pz2.a >= 18) {
            try {
                this.A = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.g = pz2.a >= 19 ? new hr2() : new gr2(null);
        pr2 pr2Var = new pr2();
        this.a = pr2Var;
        vr2 vr2Var = new vr2();
        this.b = vr2Var;
        this.c = r1;
        System.arraycopy(qq2VarArr, 0, r1, 2, 0);
        qq2[] qq2VarArr2 = {new tr2(), pr2Var, vr2Var};
        this.f = new long[10];
        this.M = 1.0f;
        this.I = 0;
        this.W = 0;
        this.r = fq2.d;
        this.T = -1;
        this.N = new qq2[0];
        this.O = new ByteBuffer[0];
        this.h = new LinkedList();
    }

    public final long a(boolean z) {
        long b;
        long j;
        long j2;
        fq2 fq2Var;
        long j3;
        long j4;
        Method method;
        StringBuilder sb;
        String str;
        if (!x() || this.I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.i.getPlayState() == 3) {
            long b2 = this.g.b();
            if (b2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.x >= 30000) {
                    long[] jArr = this.f;
                    int i = this.u;
                    jArr[i] = b2 - nanoTime;
                    this.u = (i + 1) % 10;
                    int i2 = this.v;
                    if (i2 < 10) {
                        this.v = i2 + 1;
                    }
                    this.x = nanoTime;
                    this.w = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.v;
                        if (i3 >= i4) {
                            break;
                        }
                        this.w += this.f[i3] / i4;
                        i3++;
                    }
                }
                if (!y() && nanoTime - this.z >= 500000) {
                    boolean h = this.g.h();
                    this.y = h;
                    if (h) {
                        long d = this.g.d() / 1000;
                        long c = this.g.c();
                        if (d >= this.K) {
                            if (Math.abs(d - nanoTime) > 5000000) {
                                sb = new StringBuilder();
                                str = "Spurious audio timestamp (system clock mismatch): ";
                            } else if (Math.abs(q(c) - b2) > 5000000) {
                                sb = new StringBuilder();
                                str = "Spurious audio timestamp (frame position mismatch): ";
                            }
                            sb.append(str);
                            sb.append(c);
                            sb.append(", ");
                            sb.append(d);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(b2);
                        }
                        this.y = false;
                    }
                    if (this.A != null && !this.n) {
                        try {
                            long intValue = (((Integer) method.invoke(this.i, null)).intValue() * 1000) - this.p;
                            this.L = intValue;
                            long max = Math.max(intValue, 0L);
                            this.L = max;
                            if (max > 5000000) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Ignoring impossibly large audio latency: ");
                                sb2.append(max);
                                this.L = 0L;
                            }
                        } catch (Exception unused) {
                            this.A = null;
                        }
                    }
                    this.z = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.y) {
            b = q(this.g.c() + p(nanoTime2 - (this.g.d() / 1000)));
        } else {
            b = this.v == 0 ? this.g.b() : nanoTime2 + this.w;
            if (!z) {
                b -= this.L;
            }
        }
        long j5 = this.J;
        while (!this.h.isEmpty()) {
            j2 = ((mr2) this.h.getFirst()).c;
            if (b < j2) {
                break;
            }
            mr2 mr2Var = (mr2) this.h.remove();
            fq2Var = mr2Var.a;
            this.r = fq2Var;
            j3 = mr2Var.c;
            this.t = j3;
            j4 = mr2Var.b;
            this.s = j4 - this.J;
        }
        if (this.r.a == 1.0f) {
            j = (b + this.s) - this.t;
        } else {
            if (this.h.isEmpty()) {
                vr2 vr2Var = this.b;
                if (vr2Var.f() >= 1024) {
                    j = pz2.j(b - this.t, vr2Var.e(), vr2Var.f()) + this.s;
                }
            }
            long j6 = this.s;
            double d2 = this.r.a;
            double d3 = b - this.t;
            Double.isNaN(d2);
            Double.isNaN(d3);
            j = ((long) (d2 * d3)) + j6;
        }
        return j5 + j;
    }

    public final fq2 c() {
        return this.r;
    }

    public final fq2 d(fq2 fq2Var) {
        if (this.n) {
            fq2 fq2Var2 = fq2.d;
            this.r = fq2Var2;
            return fq2Var2;
        }
        float d = this.b.d(fq2Var.a);
        this.b.c(1.0f);
        fq2 fq2Var3 = new fq2(d, 1.0f);
        fq2 fq2Var4 = this.q;
        if (fq2Var4 == null) {
            fq2Var4 = !this.h.isEmpty() ? ((mr2) this.h.getLast()).a : this.r;
        }
        if (!fq2Var3.equals(fq2Var4)) {
            if (x()) {
                this.q = fq2Var3;
            } else {
                this.r = fq2Var3;
            }
        }
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.or2.e(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void f() {
        if (this.I == 1) {
            this.I = 2;
        }
    }

    public final void g() {
        this.V = false;
        if (x()) {
            u();
            this.g.f();
        }
    }

    public final void h() {
        this.V = true;
        if (x()) {
            this.K = System.nanoTime() / 1000;
            this.i.play();
        }
    }

    public final void i() {
        if (!this.U && x() && w()) {
            this.g.e(r());
            this.U = true;
        }
    }

    public final void j() {
        k();
        qq2[] qq2VarArr = this.c;
        for (int i = 0; i < 3; i++) {
            qq2VarArr[i].zzg();
        }
        this.W = 0;
        this.V = false;
    }

    public final void k() {
        fq2 fq2Var;
        if (x()) {
            this.C = 0L;
            this.D = 0L;
            this.F = 0L;
            this.G = 0L;
            this.H = 0;
            fq2 fq2Var2 = this.q;
            if (fq2Var2 != null) {
                this.r = fq2Var2;
                this.q = null;
            } else if (!this.h.isEmpty()) {
                fq2Var = ((mr2) this.h.getLast()).a;
                this.r = fq2Var;
            }
            this.h.clear();
            this.s = 0L;
            this.t = 0L;
            this.P = null;
            this.Q = null;
            int i = 0;
            while (true) {
                qq2[] qq2VarArr = this.N;
                if (i >= qq2VarArr.length) {
                    break;
                }
                qq2 qq2Var = qq2VarArr[i];
                qq2Var.zzd();
                this.O[i] = qq2Var.zzc();
                i++;
            }
            this.U = false;
            this.T = -1;
            this.I = 0;
            this.L = 0L;
            u();
            if (this.i.getPlayState() == 3) {
                this.i.pause();
            }
            AudioTrack audioTrack = this.i;
            this.i = null;
            this.g.g(null, false);
            this.e.close();
            new er2(this, audioTrack).start();
        }
    }

    public final void l(float f) {
        if (this.M != f) {
            this.M = f;
            v();
        }
    }

    public final boolean m(ByteBuffer byteBuffer, long j) {
        int i;
        xq2 xq2Var;
        xq2 xq2Var2;
        ByteBuffer byteBuffer2 = this.P;
        az2.c(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!x()) {
            this.e.block();
            int i2 = this.W;
            int i3 = this.j;
            int i4 = this.k;
            int i5 = this.m;
            int i6 = this.o;
            this.i = i2 == 0 ? new AudioTrack(3, i3, i4, i5, i6, 1) : new AudioTrack(3, i3, i4, i5, i6, 1, i2);
            int state = this.i.getState();
            if (state != 1) {
                try {
                    this.i.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.i = null;
                    throw th;
                }
                this.i = null;
                throw new jr2(state, this.j, this.k, this.o);
            }
            int audioSessionId = this.i.getAudioSessionId();
            if (this.W != audioSessionId) {
                this.W = audioSessionId;
                xq2Var2 = ((rr2) this.d).a.Q;
                xq2Var2.b(audioSessionId);
            }
            this.g.g(this.i, y());
            v();
            this.X = false;
            if (this.V) {
                h();
            }
        }
        if (y()) {
            if (this.i.getPlayState() == 2) {
                this.X = false;
                return false;
            } else if (this.i.getPlayState() == 1 && this.g.a() != 0) {
                return false;
            }
        }
        boolean z = this.X;
        boolean n = n();
        this.X = n;
        if (z && !n && this.i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.Y;
            kr2 kr2Var = this.d;
            int i7 = this.o;
            long b = jp2.b(this.p);
            xq2Var = ((rr2) kr2Var).a.Q;
            xq2Var.c(i7, b, elapsedRealtime - j2);
        }
        if (this.P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.n && this.H == 0) {
                int i8 = this.m;
                if (i8 == 7 || i8 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i8 == 5) {
                    int i9 = nq2.d;
                    i = 1536;
                } else if (i8 != 6) {
                    throw new IllegalStateException("Unexpected audio encoding: " + i8);
                } else {
                    i = nq2.a(byteBuffer);
                }
                this.H = i;
            }
            if (this.q != null) {
                if (!w()) {
                    return false;
                }
                this.h.add(new mr2(this.q, Math.max(0L, j), q(r()), null));
                this.q = null;
                t();
            }
            if (this.I == 0) {
                this.J = Math.max(0L, j);
                this.I = 1;
            } else {
                long q = this.J + q(this.n ? this.D : this.C / this.B);
                if (this.I == 1 && Math.abs(q - j) > 200000) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Discontinuity detected [expected ");
                    sb.append(q);
                    sb.append(", got ");
                    sb.append(j);
                    sb.append("]");
                    this.I = 2;
                }
                if (this.I == 2) {
                    this.J += j - q;
                    this.I = 1;
                    ((rr2) this.d).a.W = true;
                }
            }
            if (this.n) {
                this.D += this.H;
            } else {
                this.C += byteBuffer.remaining();
            }
            this.P = byteBuffer;
        }
        if (this.n) {
            z(this.P, j);
        } else {
            s(j);
        }
        if (this.P.hasRemaining()) {
            return false;
        }
        this.P = null;
        return true;
    }

    public final boolean n() {
        if (x()) {
            if (r() > this.g.a()) {
                return true;
            }
            if (y() && this.i.getPlayState() == 2 && this.i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        return !x() || (this.U && !n());
    }

    public final long p(long j) {
        return (j * this.j) / 1000000;
    }

    public final long q(long j) {
        return (j * 1000000) / this.j;
    }

    public final long r() {
        return this.n ? this.G : this.F / this.E;
    }

    public final void s(long j) {
        ByteBuffer byteBuffer;
        int length = this.N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.O[i - 1];
            } else {
                byteBuffer = this.P;
                if (byteBuffer == null) {
                    byteBuffer = qq2.a;
                }
            }
            if (i == length) {
                z(byteBuffer, j);
            } else {
                qq2 qq2Var = this.N[i];
                qq2Var.a(byteBuffer);
                ByteBuffer zzc = qq2Var.zzc();
                this.O[i] = zzc;
                if (zzc.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    public final void t() {
        ArrayList arrayList = new ArrayList();
        qq2[] qq2VarArr = this.c;
        for (int i = 0; i < 3; i++) {
            qq2 qq2Var = qq2VarArr[i];
            if (qq2Var.zzi()) {
                arrayList.add(qq2Var);
            } else {
                qq2Var.zzd();
            }
        }
        int size = arrayList.size();
        this.N = (qq2[]) arrayList.toArray(new qq2[size]);
        this.O = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            qq2 qq2Var2 = this.N[i2];
            qq2Var2.zzd();
            this.O[i2] = qq2Var2.zzc();
        }
    }

    public final void u() {
        this.w = 0L;
        this.v = 0;
        this.u = 0;
        this.x = 0L;
        this.y = false;
        this.z = 0L;
    }

    public final void v() {
        if (x()) {
            if (pz2.a >= 21) {
                this.i.setVolume(this.M);
                return;
            }
            AudioTrack audioTrack = this.i;
            float f = this.M;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:8:0x0010). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w() {
        /*
            r9 = this;
            int r0 = r9.T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.n
            if (r0 == 0) goto Lf
            com.daaw.qq2[] r0 = r9.N
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.T = r0
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.T
            com.daaw.qq2[] r5 = r9.N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L36
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zze()
        L28:
            r9.s(r7)
            boolean r0 = r4.zzj()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.T
            int r0 = r0 + r2
            goto L10
        L36:
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L42
            r9.z(r0, r7)
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L42
            return r3
        L42:
            r9.T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.or2.w():boolean");
    }

    public final boolean x() {
        return this.i != null;
    }

    public final boolean y() {
        int i;
        return pz2.a < 23 && ((i = this.m) == 5 || i == 6);
    }

    public final boolean z(ByteBuffer byteBuffer, long j) {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                az2.c(byteBuffer2 == byteBuffer);
            } else {
                this.Q = byteBuffer;
                if (pz2.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.R;
                    if (bArr == null || bArr.length < remaining) {
                        this.R = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.R, 0, remaining);
                    byteBuffer.position(position);
                    this.S = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (pz2.a < 21) {
                int a = this.o - ((int) (this.F - (this.g.a() * this.E)));
                if (a > 0) {
                    write = this.i.write(this.R, this.S, Math.min(remaining2, a));
                    if (write > 0) {
                        this.S += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.i.write(byteBuffer, remaining2, 1);
            }
            this.Y = SystemClock.elapsedRealtime();
            if (write >= 0) {
                boolean z = this.n;
                if (!z) {
                    this.F += write;
                }
                if (write == remaining2) {
                    if (z) {
                        this.G += this.H;
                    }
                    this.Q = null;
                    return true;
                }
                return false;
            }
            throw new nr2(write);
        }
        return true;
    }
}

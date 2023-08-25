package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.daaw.o7;
import com.daaw.r7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* loaded from: classes.dex */
public final class kq implements o7 {
    public static boolean Z;
    public static boolean a0;
    public long A;
    public ByteBuffer B;
    public int C;
    public int D;
    public long E;
    public long F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public long L;
    public float M;
    public m7[] N;
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
    public final g7 a;
    public final c b;
    public final boolean c;
    public final ue d;
    public final co1 e;
    public final m7[] f;
    public final m7[] g;
    public final ConditionVariable h;
    public final r7 i;
    public final ArrayDeque<f> j;
    public o7.c k;
    public AudioTrack l;
    public AudioTrack m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public f7 t;
    public boolean u;
    public boolean v;
    public int w;
    public zw0 x;
    public zw0 y;
    public long z;

    /* loaded from: classes.dex */
    public class a extends Thread {
        public final /* synthetic */ AudioTrack p;

        public a(AudioTrack audioTrack) {
            this.p = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.p.flush();
                this.p.release();
            } finally {
                kq.this.h.open();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends Thread {
        public final /* synthetic */ AudioTrack p;

        public b(AudioTrack audioTrack) {
            this.p = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.p.release();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        long a(long j);

        zw0 b(zw0 zw0Var);

        long c();

        m7[] d();
    }

    /* loaded from: classes.dex */
    public static class d implements c {
        public final m7[] a;
        public final bd1 b;
        public final he1 c;

        public d(m7... m7VarArr) {
            m7[] m7VarArr2 = (m7[]) Arrays.copyOf(m7VarArr, m7VarArr.length + 2);
            this.a = m7VarArr2;
            bd1 bd1Var = new bd1();
            this.b = bd1Var;
            he1 he1Var = new he1();
            this.c = he1Var;
            m7VarArr2[m7VarArr.length] = bd1Var;
            m7VarArr2[m7VarArr.length + 1] = he1Var;
        }

        @Override // com.daaw.kq.c
        public long a(long j) {
            return this.c.a(j);
        }

        @Override // com.daaw.kq.c
        public zw0 b(zw0 zw0Var) {
            this.b.u(zw0Var.c);
            return new zw0(this.c.m(zw0Var.a), this.c.b(zw0Var.b), zw0Var.c);
        }

        @Override // com.daaw.kq.c
        public long c() {
            return this.b.n();
        }

        @Override // com.daaw.kq.c
        public m7[] d() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends RuntimeException {
        public e(String str) {
            super(str);
        }

        public /* synthetic */ e(String str, a aVar) {
            this(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        public final zw0 a;
        public final long b;
        public final long c;

        public f(zw0 zw0Var, long j, long j2) {
            this.a = zw0Var;
            this.b = j;
            this.c = j2;
        }

        public /* synthetic */ f(zw0 zw0Var, long j, long j2, a aVar) {
            this(zw0Var, j, j2);
        }
    }

    /* loaded from: classes.dex */
    public final class g implements r7.a {
        public g() {
        }

        public /* synthetic */ g(kq kqVar, a aVar) {
            this();
        }

        @Override // com.daaw.r7.a
        public void a(int i, long j) {
            if (kq.this.k != null) {
                kq.this.k.b(i, j, SystemClock.elapsedRealtime() - kq.this.Y);
            }
        }

        @Override // com.daaw.r7.a
        public void b(long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
        }

        @Override // com.daaw.r7.a
        public void c(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + kq.this.H() + ", " + kq.this.I();
            if (kq.a0) {
                throw new e(str, null);
            }
        }

        @Override // com.daaw.r7.a
        public void d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + kq.this.H() + ", " + kq.this.I();
            if (kq.a0) {
                throw new e(str, null);
            }
        }
    }

    public kq(g7 g7Var, c cVar, boolean z) {
        this.a = g7Var;
        this.b = (c) s6.e(cVar);
        this.c = z;
        this.h = new ConditionVariable(true);
        this.i = new r7(new g(this, null));
        ue ueVar = new ue();
        this.d = ueVar;
        co1 co1Var = new co1();
        this.e = co1Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new w41(), ueVar, co1Var);
        Collections.addAll(arrayList, cVar.d());
        this.f = (m7[]) arrayList.toArray(new m7[arrayList.size()]);
        this.g = new m7[]{new p20()};
        this.M = 1.0f;
        this.K = 0;
        this.t = f7.e;
        this.W = 0;
        this.y = zw0.e;
        this.T = -1;
        this.N = new m7[0];
        this.O = new ByteBuffer[0];
        this.j = new ArrayDeque<>();
    }

    public kq(g7 g7Var, m7[] m7VarArr) {
        this(g7Var, m7VarArr, false);
    }

    public kq(g7 g7Var, m7[] m7VarArr, boolean z) {
        this(g7Var, new d(m7VarArr), z);
    }

    public static int G(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return dv.e(byteBuffer);
        }
        if (i == 5) {
            return u.b();
        }
        if (i == 6) {
            return u.h(byteBuffer);
        }
        if (i == 14) {
            int a2 = u.a(byteBuffer);
            if (a2 == -1) {
                return 0;
            }
            return u.i(byteBuffer, a2) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i);
    }

    @TargetApi(21)
    public static void R(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    public static void S(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    @TargetApi(21)
    public static int V(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    public final AudioTrack A() {
        AudioAttributes build = this.X ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.t.a();
        AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.r).setEncoding(this.s).setSampleRate(this.q).build();
        int i = this.W;
        return new AudioTrack(build, build2, this.w, 1, i != 0 ? i : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:8:0x0010). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B() {
        /*
            r9 = this;
            int r0 = r9.T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.u
            if (r0 == 0) goto Ld
            r0 = 0
            goto L10
        Ld:
            com.daaw.m7[] r0 = r9.N
            int r0 = r0.length
        L10:
            r9.T = r0
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.T
            com.daaw.m7[] r5 = r9.N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L36
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.k()
        L28:
            r9.O(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.T
            int r0 = r0 + r2
            goto L10
        L36:
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L42
            r9.U(r0, r7)
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L42
            return r3
        L42:
            r9.T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.kq.B():boolean");
    }

    public final long C(long j) {
        return (j * this.q) / 1000000;
    }

    public final void D() {
        int i = 0;
        while (true) {
            m7[] m7VarArr = this.N;
            if (i >= m7VarArr.length) {
                return;
            }
            m7 m7Var = m7VarArr[i];
            m7Var.flush();
            this.O[i] = m7Var.f();
            i++;
        }
    }

    public final long E(long j) {
        return (j * 1000000) / this.q;
    }

    public final m7[] F() {
        return this.o ? this.g : this.f;
    }

    public final long H() {
        return this.n ? this.E / this.D : this.F;
    }

    public final long I() {
        return this.n ? this.H / this.G : this.I;
    }

    public final void J() {
        this.h.block();
        AudioTrack K = K();
        this.m = K;
        int audioSessionId = K.getAudioSessionId();
        if (Z && sq1.a < 21) {
            AudioTrack audioTrack = this.l;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                P();
            }
            if (this.l == null) {
                this.l = L(audioSessionId);
            }
        }
        if (this.W != audioSessionId) {
            this.W = audioSessionId;
            o7.c cVar = this.k;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        this.y = this.v ? this.b.b(this.y) : zw0.e;
        T();
        this.i.s(this.m, this.s, this.G, this.w);
        Q();
    }

    public final AudioTrack K() {
        AudioTrack audioTrack;
        if (sq1.a >= 21) {
            audioTrack = A();
        } else {
            int A = sq1.A(this.t.c);
            audioTrack = this.W == 0 ? new AudioTrack(A, this.q, this.r, this.s, this.w, 1) : new AudioTrack(A, this.q, this.r, this.s, this.w, 1, this.W);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new o7.b(state, this.q, this.r, this.w);
    }

    public final AudioTrack L(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    public final long M(long j) {
        return (j * 1000000) / this.p;
    }

    public final boolean N() {
        return this.m != null;
    }

    public final void O(long j) {
        ByteBuffer byteBuffer;
        int length = this.N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.O[i - 1];
            } else {
                byteBuffer = this.P;
                if (byteBuffer == null) {
                    byteBuffer = m7.a;
                }
            }
            if (i == length) {
                U(byteBuffer, j);
            } else {
                m7 m7Var = this.N[i];
                m7Var.g(byteBuffer);
                ByteBuffer f2 = m7Var.f();
                this.O[i] = f2;
                if (f2.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    public final void P() {
        AudioTrack audioTrack = this.l;
        if (audioTrack == null) {
            return;
        }
        this.l = null;
        new b(audioTrack).start();
    }

    public final void Q() {
        if (N()) {
            if (sq1.a >= 21) {
                R(this.m, this.M);
            } else {
                S(this.m, this.M);
            }
        }
    }

    public final void T() {
        m7[] F;
        ArrayList arrayList = new ArrayList();
        for (m7 m7Var : F()) {
            if (m7Var.d()) {
                arrayList.add(m7Var);
            } else {
                m7Var.flush();
            }
        }
        int size = arrayList.size();
        this.N = (m7[]) arrayList.toArray(new m7[size]);
        this.O = new ByteBuffer[size];
        D();
    }

    public final void U(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.Q;
            int i = 0;
            if (byteBuffer2 != null) {
                s6.a(byteBuffer2 == byteBuffer);
            } else {
                this.Q = byteBuffer;
                if (sq1.a < 21) {
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
            if (sq1.a < 21) {
                int c2 = this.i.c(this.H);
                if (c2 > 0) {
                    i = this.m.write(this.R, this.S, Math.min(remaining2, c2));
                    if (i > 0) {
                        this.S += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else if (this.X) {
                s6.f(j != -9223372036854775807L);
                i = W(this.m, byteBuffer, remaining2, j);
            } else {
                i = V(this.m, byteBuffer, remaining2);
            }
            this.Y = SystemClock.elapsedRealtime();
            if (i < 0) {
                throw new o7.d(i);
            }
            boolean z = this.n;
            if (z) {
                this.H += i;
            }
            if (i == remaining2) {
                if (!z) {
                    this.I += this.J;
                }
                this.Q = null;
            }
        }
    }

    @TargetApi(21)
    public final int W(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.B == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.B = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.B.putInt(1431633921);
        }
        if (this.C == 0) {
            this.B.putInt(4, i);
            this.B.putLong(8, j * 1000);
            this.B.position(0);
            this.C = i;
        }
        int remaining = this.B.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.B, remaining, 1);
            if (write < 0) {
                this.C = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int V = V(audioTrack, byteBuffer, i);
        if (V < 0) {
            this.C = 0;
            return V;
        }
        this.C -= V;
        return V;
    }

    @Override // com.daaw.o7
    public void a() {
        e();
        P();
        for (m7 m7Var : this.f) {
            m7Var.e();
        }
        for (m7 m7Var2 : this.g) {
            m7Var2.e();
        }
        this.W = 0;
        this.V = false;
    }

    @Override // com.daaw.o7
    public void b() {
        this.V = false;
        if (N() && this.i.p()) {
            this.m.pause();
        }
    }

    @Override // com.daaw.o7
    public boolean c() {
        return !N() || (this.U && !k());
    }

    @Override // com.daaw.o7
    public void e() {
        if (N()) {
            this.E = 0L;
            this.F = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0;
            zw0 zw0Var = this.x;
            if (zw0Var != null) {
                this.y = zw0Var;
                this.x = null;
            } else if (!this.j.isEmpty()) {
                this.y = this.j.getLast().a;
            }
            this.j.clear();
            this.z = 0L;
            this.A = 0L;
            this.P = null;
            this.Q = null;
            D();
            this.U = false;
            this.T = -1;
            this.B = null;
            this.C = 0;
            this.K = 0;
            if (this.i.i()) {
                this.m.pause();
            }
            AudioTrack audioTrack = this.m;
            this.m = null;
            this.i.q();
            this.h.close();
            new a(audioTrack).start();
        }
    }

    @Override // com.daaw.o7
    public zw0 f(zw0 zw0Var) {
        if (N() && !this.v) {
            zw0 zw0Var2 = zw0.e;
            this.y = zw0Var2;
            return zw0Var2;
        }
        zw0 zw0Var3 = this.x;
        if (zw0Var3 == null) {
            zw0Var3 = !this.j.isEmpty() ? this.j.getLast().a : this.y;
        }
        if (!zw0Var.equals(zw0Var3)) {
            if (N()) {
                this.x = zw0Var;
            } else {
                this.y = this.b.b(zw0Var);
            }
        }
        return this.y;
    }

    @Override // com.daaw.o7
    public zw0 h() {
        return this.y;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0135  */
    @Override // com.daaw.o7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r18, int r19, int r20, int r21, int[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.kq.i(int, int, int, int, int[], int, int):void");
    }

    @Override // com.daaw.o7
    public void j() {
        if (!this.U && N() && B()) {
            this.i.g(I());
            this.m.stop();
            this.C = 0;
            this.U = true;
        }
    }

    @Override // com.daaw.o7
    public boolean k() {
        return N() && this.i.h(I());
    }

    @Override // com.daaw.o7
    public long l(boolean z) {
        if (!N() || this.K == 0) {
            return Long.MIN_VALUE;
        }
        return this.L + y(z(Math.min(this.i.d(z), E(I()))));
    }

    @Override // com.daaw.o7
    public void m() {
        if (this.X) {
            this.X = false;
            this.W = 0;
            e();
        }
    }

    @Override // com.daaw.o7
    public void n(f7 f7Var) {
        if (this.t.equals(f7Var)) {
            return;
        }
        this.t = f7Var;
        if (this.X) {
            return;
        }
        e();
        this.W = 0;
    }

    @Override // com.daaw.o7
    public void o() {
        if (this.K == 1) {
            this.K = 2;
        }
    }

    @Override // com.daaw.o7
    public void p(float f2) {
        if (this.M != f2) {
            this.M = f2;
            Q();
        }
    }

    @Override // com.daaw.o7
    public boolean q(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBuffer2 = this.P;
        s6.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!N()) {
            J();
            if (this.V) {
                s();
            }
        }
        if (this.i.k(I())) {
            if (this.P == null) {
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                if (!this.n && this.J == 0) {
                    int G = G(this.s, byteBuffer);
                    this.J = G;
                    if (G == 0) {
                        return true;
                    }
                }
                if (this.x != null) {
                    if (!B()) {
                        return false;
                    }
                    zw0 zw0Var = this.x;
                    this.x = null;
                    this.j.add(new f(this.b.b(zw0Var), Math.max(0L, j), E(I()), null));
                    T();
                }
                if (this.K == 0) {
                    this.L = Math.max(0L, j);
                    this.K = 1;
                } else {
                    long M = this.L + M(H());
                    if (this.K == 1 && Math.abs(M - j) > 200000) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Discontinuity detected [expected ");
                        sb.append(M);
                        sb.append(", got ");
                        sb.append(j);
                        sb.append("]");
                        this.K = 2;
                    }
                    if (this.K == 2) {
                        this.L += j - M;
                        this.K = 1;
                        o7.c cVar = this.k;
                        if (cVar != null) {
                            cVar.c();
                        }
                    }
                }
                if (this.n) {
                    this.E += byteBuffer.remaining();
                } else {
                    this.F += this.J;
                }
                this.P = byteBuffer;
            }
            if (this.u) {
                O(j);
            } else {
                U(this.P, j);
            }
            if (!this.P.hasRemaining()) {
                this.P = null;
                return true;
            } else if (this.i.j(I())) {
                e();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.daaw.o7
    public void r(int i) {
        s6.f(sq1.a >= 21);
        if (this.X && this.W == i) {
            return;
        }
        this.X = true;
        this.W = i;
        e();
    }

    @Override // com.daaw.o7
    public void s() {
        this.V = true;
        if (N()) {
            this.i.t();
            this.m.play();
        }
    }

    @Override // com.daaw.o7
    public boolean t(int i) {
        if (sq1.I(i)) {
            return i != 4 || sq1.a >= 21;
        }
        g7 g7Var = this.a;
        return g7Var != null && g7Var.c(i);
    }

    @Override // com.daaw.o7
    public void u(o7.c cVar) {
        this.k = cVar;
    }

    public final long y(long j) {
        return j + E(this.b.c());
    }

    public final long z(long j) {
        long j2;
        long w;
        f fVar = null;
        while (!this.j.isEmpty() && j >= this.j.getFirst().c) {
            fVar = this.j.remove();
        }
        if (fVar != null) {
            this.y = fVar.a;
            this.A = fVar.c;
            this.z = fVar.b - this.L;
        }
        if (this.y.a == 1.0f) {
            return (j + this.z) - this.A;
        }
        if (this.j.isEmpty()) {
            j2 = this.z;
            w = this.b.a(j - this.A);
        } else {
            j2 = this.z;
            w = sq1.w(j - this.A, this.y.a);
        }
        return j2 + w;
    }
}

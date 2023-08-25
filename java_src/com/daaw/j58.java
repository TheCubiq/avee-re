package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class j58 extends gf8 {
    public static final /* synthetic */ int j0 = 0;
    public final cb8 A;
    public final long B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public aa8 G;
    public lu3 H;
    public gc3 I;
    public gc3 J;
    public f92 K;
    public f92 L;
    public AudioTrack M;
    public Object N;
    public Surface O;
    public int P;
    public int Q;
    public int R;
    public ql7 S;
    public ql7 T;
    public int U;
    public o98 V;
    public float W;
    public boolean X;
    public rn4 Y;
    public boolean Z;
    public boolean a0;
    public final fw8 b;
    public is8 b0;
    public final lu3 c;
    public ll4 c0;
    public final ds4 d;
    public gc3 d0;
    public final Context e;
    public q88 e0;
    public final ty3 f;
    public int f0;
    public final i98[] g;
    public long g0;
    public final zv8 h;
    public final x38 h0;
    public final vz4 i;
    public wt8 i0;
    public final u68 j;
    public final k65 k;
    public final CopyOnWriteArraySet l;
    public final d34 m;
    public final List n;
    public final boolean o;
    public final or8 p;
    public final fb8 q;
    public final Looper r;
    public final mw8 s;
    public final xp4 t;
    public final y48 u;
    public final d58 v;
    public final ye7 w;
    public final kj7 x;
    public final wa8 y;
    public final za8 z;

    static {
        k63.b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.daaw.lw8, com.daaw.fb8, java.lang.Object] */
    @SuppressLint({"HandlerLeak"})
    public j58(d18 d18Var, ty3 ty3Var) {
        int S;
        j58 j58Var = this;
        ds4 ds4Var = new ds4(xp4.a);
        j58Var.d = ds4Var;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = it5.e;
            s95.d("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "]");
            Context applicationContext = d18Var.a.getApplicationContext();
            j58Var.e = applicationContext;
            ?? apply = d18Var.h.apply(d18Var.b);
            j58Var.q = apply;
            j58Var.V = d18Var.j;
            j58Var.P = d18Var.k;
            j58Var.X = false;
            j58Var.B = d18Var.o;
            y48 y48Var = new y48(j58Var, null);
            j58Var.u = y48Var;
            d58 d58Var = new d58(null);
            j58Var.v = d58Var;
            Handler handler = new Handler(d18Var.i);
            i98[] a = ((gz7) d18Var.c).p.a(handler, y48Var, y48Var, y48Var, y48Var);
            j58Var.g = a;
            int length = a.length;
            zv8 zv8Var = (zv8) d18Var.e.zza();
            j58Var.h = zv8Var;
            j58Var.p = d18.a(((j08) d18Var.d).p);
            qw8 d = qw8.d(((x08) d18Var.g).p);
            j58Var.s = d;
            j58Var.o = d18Var.l;
            j58Var.G = d18Var.m;
            Looper looper = d18Var.i;
            j58Var.r = looper;
            xp4 xp4Var = d18Var.b;
            j58Var.t = xp4Var;
            j58Var.f = ty3Var;
            k65 k65Var = new k65(looper, xp4Var, new e45() { // from class: com.daaw.u38
                @Override // com.daaw.e45
                public final void a(Object obj, r32 r32Var) {
                    mv3 mv3Var = (mv3) obj;
                }
            });
            j58Var.k = k65Var;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            j58Var.l = copyOnWriteArraySet;
            j58Var.n = new ArrayList();
            j58Var.i0 = new wt8(0);
            int length2 = a.length;
            fw8 fw8Var = new fw8(new x98[2], new tv8[2], ni4.b, null);
            j58Var.b = fw8Var;
            j58Var.m = new d34();
            ls3 ls3Var = new ls3();
            ls3Var.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zv8Var.c();
            ls3Var.d(29, true);
            lu3 e = ls3Var.e();
            j58Var.c = e;
            ls3 ls3Var2 = new ls3();
            ls3Var2.b(e);
            ls3Var2.a(4);
            ls3Var2.a(10);
            j58Var.H = ls3Var2.e();
            j58Var.i = xp4Var.a(looper, null);
            x38 x38Var = new x38(j58Var);
            j58Var.h0 = x38Var;
            j58Var.e0 = q88.g(fw8Var);
            apply.R(ty3Var, looper);
            int i = it5.a;
            lh8 lh8Var = i < 31 ? new lh8() : d48.a(applicationContext, j58Var, d18Var.p);
            d78 d78Var = (d78) d18Var.f.zza();
            aa8 aa8Var = j58Var.G;
            try {
                j58Var = this;
                j58Var.j = new u68(a, zv8Var, fw8Var, d78Var, d, 0, false, apply, aa8Var, d18Var.r, d18Var.n, false, looper, xp4Var, x38Var, lh8Var, null);
                j58Var.W = 1.0f;
                gc3 gc3Var = gc3.v;
                j58Var.I = gc3Var;
                j58Var.J = gc3Var;
                j58Var.d0 = gc3Var;
                j58Var.f0 = -1;
                if (i < 21) {
                    AudioTrack audioTrack = j58Var.M;
                    if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                        j58Var.M.release();
                        j58Var.M = null;
                    }
                    if (j58Var.M == null) {
                        j58Var.M = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                    }
                    S = j58Var.M.getAudioSessionId();
                } else {
                    S = it5.S(applicationContext);
                }
                j58Var.U = S;
                j58Var.Y = rn4.b;
                j58Var.Z = true;
                Objects.requireNonNull(apply);
                k65Var.b(apply);
                d.c(new Handler(looper), apply);
                copyOnWriteArraySet.add(y48Var);
                j58Var.w = new ye7(d18Var.a, handler, y48Var);
                j58Var.x = new kj7(d18Var.a, handler, y48Var);
                it5.t(null, null);
                wa8 wa8Var = new wa8(d18Var.a, handler, y48Var);
                j58Var.y = wa8Var;
                int i2 = j58Var.V.a;
                wa8Var.f(3);
                j58Var.z = new za8(d18Var.a);
                j58Var.A = new cb8(d18Var.a);
                j58Var.b0 = M(wa8Var);
                j58Var.c0 = ll4.e;
                zv8Var.b(j58Var.V);
                j58Var.Q(1, 10, Integer.valueOf(j58Var.U));
                j58Var.Q(2, 10, Integer.valueOf(j58Var.U));
                j58Var.Q(1, 3, j58Var.V);
                j58Var.Q(2, 4, Integer.valueOf(j58Var.P));
                j58Var.Q(2, 5, 0);
                j58Var.Q(1, 9, Boolean.valueOf(j58Var.X));
                j58Var.Q(2, 7, d58Var);
                j58Var.Q(6, 8, d58Var);
                ds4Var.e();
            } catch (Throwable th) {
                th = th;
                j58Var = this;
                j58Var.d.e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int H(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    public static long J(q88 q88Var) {
        i54 i54Var = new i54();
        d34 d34Var = new d34();
        q88Var.a.n(q88Var.b.a, d34Var);
        long j = q88Var.c;
        if (j == -9223372036854775807L) {
            long j2 = q88Var.a.e(d34Var.c, i54Var, 0L).k;
            return 0L;
        }
        return j;
    }

    public static is8 M(wa8 wa8Var) {
        return new is8(0, wa8Var.b(), wa8Var.a());
    }

    public static boolean Y(q88 q88Var) {
        return q88Var.e == 3 && q88Var.l && q88Var.m == 0;
    }

    public static /* bridge */ /* synthetic */ wa8 c(j58 j58Var) {
        return j58Var.y;
    }

    public static /* bridge */ /* synthetic */ is8 d0(j58 j58Var) {
        return j58Var.b0;
    }

    public static /* bridge */ /* synthetic */ is8 e0(wa8 wa8Var) {
        return M(wa8Var);
    }

    public static /* bridge */ /* synthetic */ k65 f0(j58 j58Var) {
        return j58Var.k;
    }

    public static /* bridge */ /* synthetic */ void h(j58 j58Var, is8 is8Var) {
        j58Var.b0 = is8Var;
    }

    public static /* bridge */ /* synthetic */ void o(j58 j58Var, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        j58Var.S(surface);
        j58Var.O = surface;
    }

    public final void A(rr8 rr8Var) {
        X();
        List singletonList = Collections.singletonList(rr8Var);
        X();
        X();
        G();
        zzl();
        this.C++;
        if (!this.n.isEmpty()) {
            int size = this.n.size();
            for (int i = size - 1; i >= 0; i--) {
                this.n.remove(i);
            }
            this.i0 = this.i0.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            h88 h88Var = new h88((rr8) singletonList.get(i2), this.o);
            arrayList.add(h88Var);
            this.n.add(i2, new g58(h88Var.b, h88Var.a.I()));
        }
        this.i0 = this.i0.g(0, arrayList.size());
        c98 c98Var = new c98(this.n, this.i0, null);
        if (!c98Var.o() && c98Var.c() < 0) {
            throw new na2(c98Var, -1, -9223372036854775807L);
        }
        int g = c98Var.g(false);
        q88 N = N(this.e0, c98Var, L(c98Var, g, -9223372036854775807L));
        int i3 = N.e;
        if (g != -1 && i3 != 1) {
            i3 = (c98Var.o() || g >= c98Var.c()) ? 4 : 2;
        }
        q88 e = N.e(i3);
        this.j.Z(arrayList, g, it5.f0(-9223372036854775807L), this.i0);
        V(e, 0, 1, false, (this.e0.b.a.equals(e.b.a) || this.e0.a.o()) ? false : true, 4, I(e), -1, false);
    }

    public final void B(boolean z) {
        X();
        int b = this.x.b(z, zzh());
        U(z, b, H(z, b));
    }

    public final void C(Surface surface) {
        X();
        S(surface);
        int i = surface == null ? 0 : -1;
        P(i, i);
    }

    public final void D(float f) {
        X();
        final float A = it5.A(f, 0.0f, 1.0f);
        if (this.W == A) {
            return;
        }
        this.W = A;
        R();
        k65 k65Var = this.k;
        k65Var.d(22, new c35() { // from class: com.daaw.o38
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                float f2 = A;
                int i = j58.j0;
                ((mv3) obj).y(f2);
            }
        });
        k65Var.c();
    }

    public final void E() {
        X();
        X();
        this.x.b(zzq(), 1);
        T(false, null);
        this.Y = new rn4(y17.u(), this.e0.r);
    }

    public final int G() {
        if (this.e0.a.o()) {
            return this.f0;
        }
        q88 q88Var = this.e0;
        return q88Var.a.n(q88Var.b.a, this.m).c;
    }

    public final long I(q88 q88Var) {
        if (q88Var.a.o()) {
            return it5.f0(this.g0);
        }
        if (q88Var.b.b()) {
            return q88Var.r;
        }
        l64 l64Var = q88Var.a;
        pr8 pr8Var = q88Var.b;
        long j = q88Var.r;
        K(l64Var, pr8Var, j);
        return j;
    }

    public final long K(l64 l64Var, pr8 pr8Var, long j) {
        l64Var.n(pr8Var.a, this.m);
        return j;
    }

    public final Pair L(l64 l64Var, int i, long j) {
        if (l64Var.o()) {
            this.f0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.g0 = j;
            return null;
        }
        if (i == -1 || i >= l64Var.c()) {
            i = l64Var.g(false);
            long j2 = l64Var.e(i, this.a, 0L).k;
            j = it5.j0(0L);
        }
        return l64Var.l(this.a, this.m, i, it5.f0(j));
    }

    public final q88 N(q88 q88Var, l64 l64Var, Pair pair) {
        long j;
        q88 b;
        uo4.d(l64Var.o() || pair != null);
        l64 l64Var2 = q88Var.a;
        q88 f = q88Var.f(l64Var);
        if (l64Var.o()) {
            pr8 h = q88.h();
            long f0 = it5.f0(this.g0);
            q88 a = f.b(h, f0, f0, f0, 0L, au8.d, this.b, y17.u()).a(h);
            a.p = a.r;
            return a;
        }
        Object obj = f.b.a;
        int i = it5.a;
        boolean z = !obj.equals(pair.first);
        pr8 pr8Var = z ? new pr8(pair.first) : f.b;
        long longValue = ((Long) pair.second).longValue();
        long f02 = it5.f0(zzk());
        if (!l64Var2.o()) {
            l64Var2.n(obj, this.m);
        }
        if (z || longValue < f02) {
            uo4.f(!pr8Var.b());
            q88 a2 = f.b(pr8Var, longValue, longValue, longValue, 0L, z ? au8.d : f.h, z ? this.b : f.i, z ? y17.u() : f.j).a(pr8Var);
            a2.p = longValue;
            return a2;
        }
        if (longValue == f02) {
            int a3 = l64Var.a(f.k.a);
            if (a3 != -1 && l64Var.d(a3, this.m, false).c == l64Var.n(pr8Var.a, this.m).c) {
                return f;
            }
            l64Var.n(pr8Var.a, this.m);
            j = pr8Var.b() ? this.m.g(pr8Var.b, pr8Var.c) : this.m.d;
            b = f.b(pr8Var, f.r, f.r, f.d, j - f.r, f.h, f.i, f.j).a(pr8Var);
        } else {
            uo4.f(!pr8Var.b());
            long max = Math.max(0L, f.q - (longValue - f02));
            j = f.p;
            if (f.k.equals(f.b)) {
                j = longValue + max;
            }
            b = f.b(pr8Var, longValue, longValue, longValue, max, f.h, f.i, f.j);
        }
        b.p = j;
        return b;
    }

    public final z88 O(w88 w88Var) {
        int G = G();
        u68 u68Var = this.j;
        return new z88(u68Var, w88Var, this.e0.a, G == -1 ? 0 : G, this.t, u68Var.P());
    }

    public final void P(final int i, final int i2) {
        if (i == this.Q && i2 == this.R) {
            return;
        }
        this.Q = i;
        this.R = i2;
        k65 k65Var = this.k;
        k65Var.d(24, new c35() { // from class: com.daaw.j18
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = j58.j0;
                ((mv3) obj).v(i3, i4);
            }
        });
        k65Var.c();
    }

    public final void Q(int i, int i2, Object obj) {
        i98[] i98VarArr = this.g;
        int length = i98VarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            i98 i98Var = i98VarArr[i3];
            if (i98Var.zzb() == i) {
                z88 O = O(i98Var);
                O.f(i2);
                O.e(obj);
                O.d();
            }
        }
    }

    public final void R() {
        Q(1, 2, Float.valueOf(this.W * this.x.a()));
    }

    public final void S(Object obj) {
        boolean z;
        ArrayList<z88> arrayList = new ArrayList();
        i98[] i98VarArr = this.g;
        int length = i98VarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            i98 i98Var = i98VarArr[i];
            if (i98Var.zzb() == 2) {
                z88 O = O(i98Var);
                O.f(1);
                O.e(obj);
                O.d();
                arrayList.add(O);
            }
            i++;
        }
        Object obj2 = this.N;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (z88 z88Var : arrayList) {
                    z88Var.i(this.B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.N;
            Surface surface = this.O;
            if (obj3 == surface) {
                surface.release();
                this.O = null;
            }
        }
        this.N = obj;
        if (z) {
            T(false, vu7.d(new x68(3), 1003));
        }
    }

    public final void T(boolean z, vu7 vu7Var) {
        q88 q88Var = this.e0;
        q88 a = q88Var.a(q88Var.b);
        a.p = a.r;
        a.q = 0L;
        q88 e = a.e(1);
        if (vu7Var != null) {
            e = e.d(vu7Var);
        }
        q88 q88Var2 = e;
        this.C++;
        this.j.X();
        V(q88Var2, 0, 1, false, q88Var2.a.o() && !this.e0.a.o(), 4, I(q88Var2), -1, false);
    }

    public final void U(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        q88 q88Var = this.e0;
        if (q88Var.l == z2 && q88Var.m == i3) {
            return;
        }
        this.C++;
        q88 c = q88Var.c(z2, i3);
        this.j.W(z2, i3);
        V(c, 0, i2, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x0216, code lost:
        if (r4 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(final com.daaw.q88 r41, final int r42, final int r43, boolean r44, boolean r45, final int r46, long r47, int r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.j58.V(com.daaw.q88, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    public final void W() {
        int zzh = zzh();
        if (zzh == 2 || zzh == 3) {
            X();
            boolean z = this.e0.o;
            zzq();
            zzq();
        }
    }

    public final void X() {
        this.d.b();
        if (Thread.currentThread() != this.r.getThread()) {
            String i = it5.i("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.r.getThread().getName());
            if (this.Z) {
                throw new IllegalStateException(i);
            }
            s95.f("ExoPlayerImpl", i, this.a0 ? null : new IllegalStateException());
            this.a0 = true;
        }
    }

    @Override // com.daaw.ty3
    public final void a(int i, long j) {
        X();
        this.q.zzx();
        l64 l64Var = this.e0.a;
        if (i < 0 || (!l64Var.o() && i >= l64Var.c())) {
            throw new na2(l64Var, i, j);
        }
        this.C++;
        if (zzs()) {
            s95.e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            o68 o68Var = new o68(this.e0);
            o68Var.a(1);
            this.h0.a.u(o68Var);
            return;
        }
        int i2 = zzh() != 1 ? 2 : 1;
        int zzf = zzf();
        q88 N = N(this.e0.e(i2), l64Var, L(l64Var, i, j));
        this.j.V(l64Var, i, it5.f0(j));
        V(N, 0, 1, true, true, 1, I(N), zzf, false);
    }

    public final int a0() {
        X();
        int length = this.g.length;
        return 2;
    }

    public final vu7 b() {
        X();
        return this.e0.f;
    }

    public final long b0() {
        X();
        if (zzs()) {
            q88 q88Var = this.e0;
            return q88Var.k.equals(q88Var.b) ? it5.j0(this.e0.p) : c0();
        }
        X();
        if (this.e0.a.o()) {
            return this.g0;
        }
        q88 q88Var2 = this.e0;
        long j = 0;
        if (q88Var2.k.d != q88Var2.b.d) {
            return it5.j0(q88Var2.a.e(zzf(), this.a, 0L).l);
        }
        long j2 = q88Var2.p;
        if (this.e0.k.b()) {
            q88 q88Var3 = this.e0;
            q88Var3.a.n(q88Var3.k.a, this.m).h(this.e0.k.b);
        } else {
            j = j2;
        }
        q88 q88Var4 = this.e0;
        K(q88Var4.a, q88Var4.k, j);
        return it5.j0(j);
    }

    public final long c0() {
        long g;
        X();
        if (zzs()) {
            q88 q88Var = this.e0;
            pr8 pr8Var = q88Var.b;
            q88Var.a.n(pr8Var.a, this.m);
            g = this.m.g(pr8Var.b, pr8Var.c);
        } else {
            l64 zzn = zzn();
            if (zzn.o()) {
                return -9223372036854775807L;
            }
            g = zzn.e(zzf(), this.a, 0L).l;
        }
        return it5.j0(g);
    }

    public final void s(ob8 ob8Var) {
        fb8 fb8Var = this.q;
        Objects.requireNonNull(ob8Var);
        fb8Var.j(ob8Var);
    }

    public final /* synthetic */ void t(o68 o68Var) {
        long j;
        boolean z;
        long j2;
        int i = this.C - o68Var.c;
        this.C = i;
        boolean z2 = true;
        if (o68Var.d) {
            this.D = o68Var.e;
            this.E = true;
        }
        if (o68Var.f) {
            this.F = o68Var.g;
        }
        if (i == 0) {
            l64 l64Var = o68Var.b.a;
            if (!this.e0.a.o() && l64Var.o()) {
                this.f0 = -1;
                this.g0 = 0L;
            }
            if (!l64Var.o()) {
                List y = ((c98) l64Var).y();
                uo4.f(y.size() == this.n.size());
                for (int i2 = 0; i2 < y.size(); i2++) {
                    ((g58) this.n.get(i2)).b = (l64) y.get(i2);
                }
            }
            if (this.E) {
                if (o68Var.b.b.equals(this.e0.b) && o68Var.b.d == this.e0.r) {
                    z2 = false;
                }
                if (z2) {
                    if (l64Var.o() || o68Var.b.b.b()) {
                        j2 = o68Var.b.d;
                    } else {
                        q88 q88Var = o68Var.b;
                        pr8 pr8Var = q88Var.b;
                        j2 = q88Var.d;
                        K(l64Var, pr8Var, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.E = false;
            V(o68Var.b, 1, this.F, false, z, this.D, j, -1, false);
        }
    }

    public final /* synthetic */ void u(final o68 o68Var) {
        this.i.b(new Runnable() { // from class: com.daaw.a48
            @Override // java.lang.Runnable
            public final void run() {
                j58.this.t(o68Var);
            }
        });
    }

    public final /* synthetic */ void v(mv3 mv3Var) {
        mv3Var.G(this.H);
    }

    public final void x() {
        X();
        boolean zzq = zzq();
        int b = this.x.b(zzq, 2);
        U(zzq, b, H(zzq, b));
        q88 q88Var = this.e0;
        if (q88Var.e != 1) {
            return;
        }
        q88 d = q88Var.d(null);
        q88 e = d.e(true == d.a.o() ? 4 : 2);
        this.C++;
        this.j.U();
        V(e, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void y() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = it5.e;
        String a = k63.a();
        s95.d("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "] [" + a + "]");
        X();
        if (it5.a < 21 && (audioTrack = this.M) != null) {
            audioTrack.release();
            this.M = null;
        }
        this.y.e();
        this.x.d();
        if (!this.j.Y()) {
            k65 k65Var = this.k;
            k65Var.d(10, new c35() { // from class: com.daaw.g18
                @Override // com.daaw.c35
                public final void zza(Object obj) {
                    ((mv3) obj).E(vu7.d(new x68(1), 1003));
                }
            });
            k65Var.c();
        }
        this.k.e();
        this.i.e(null);
        this.s.b(this.q);
        q88 e = this.e0.e(1);
        this.e0 = e;
        q88 a2 = e.a(e.b);
        this.e0 = a2;
        a2.p = a2.r;
        this.e0.q = 0L;
        this.q.o();
        this.h.a();
        Surface surface = this.O;
        if (surface != null) {
            surface.release();
            this.O = null;
        }
        this.Y = rn4.b;
    }

    public final void z(ob8 ob8Var) {
        this.q.h(ob8Var);
    }

    @Override // com.daaw.ty3
    public final int zzd() {
        X();
        if (zzs()) {
            return this.e0.b.b;
        }
        return -1;
    }

    @Override // com.daaw.ty3
    public final int zze() {
        X();
        if (zzs()) {
            return this.e0.b.c;
        }
        return -1;
    }

    @Override // com.daaw.ty3
    public final int zzf() {
        X();
        int G = G();
        if (G == -1) {
            return 0;
        }
        return G;
    }

    @Override // com.daaw.ty3
    public final int zzg() {
        X();
        if (this.e0.a.o()) {
            return 0;
        }
        q88 q88Var = this.e0;
        return q88Var.a.a(q88Var.b.a);
    }

    @Override // com.daaw.ty3
    public final int zzh() {
        X();
        return this.e0.e;
    }

    @Override // com.daaw.ty3
    public final int zzi() {
        X();
        return this.e0.m;
    }

    @Override // com.daaw.ty3
    public final int zzj() {
        X();
        return 0;
    }

    @Override // com.daaw.ty3
    public final long zzk() {
        X();
        if (zzs()) {
            q88 q88Var = this.e0;
            q88Var.a.n(q88Var.b.a, this.m);
            q88 q88Var2 = this.e0;
            if (q88Var2.c == -9223372036854775807L) {
                long j = q88Var2.a.e(zzf(), this.a, 0L).k;
                return it5.j0(0L);
            }
            return it5.j0(0L) + it5.j0(this.e0.c);
        }
        return zzl();
    }

    @Override // com.daaw.ty3
    public final long zzl() {
        X();
        return it5.j0(I(this.e0));
    }

    @Override // com.daaw.ty3
    public final long zzm() {
        X();
        return it5.j0(this.e0.q);
    }

    @Override // com.daaw.ty3
    public final l64 zzn() {
        X();
        return this.e0.a;
    }

    @Override // com.daaw.ty3
    public final ni4 zzo() {
        X();
        return this.e0.i.d;
    }

    @Override // com.daaw.ty3
    public final boolean zzq() {
        X();
        return this.e0.l;
    }

    @Override // com.daaw.ty3
    public final boolean zzr() {
        X();
        return false;
    }

    @Override // com.daaw.ty3
    public final boolean zzs() {
        X();
        return this.e0.b.b();
    }
}

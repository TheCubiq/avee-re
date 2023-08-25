package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class n64 extends p24 implements qz6, ob8 {
    public static final /* synthetic */ int K = 0;
    public o24 A;
    public int B;
    public int C;
    public long D;
    public final String E;
    public final int F;
    @GuardedBy("httpDataSourcesLock")
    public final ArrayList H;
    public volatile x54 I;
    public final Context r;
    public final v54 s;
    public final rv8 t;
    public final x24 u;
    public final WeakReference v;
    public final bt8 w;
    public ga8 x;
    public ByteBuffer y;
    public boolean z;
    public final Object G = new Object();
    public final Set J = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.F1)).booleanValue() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:
        if (r7.j == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
        if (r7.o == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
        r8 = new com.daaw.b64(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
        if (r7.i <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
        r8 = new com.daaw.c64(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
        r8 = new com.daaw.d64(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
        if (r7.j == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
        r7 = new com.daaw.e64(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
        r6 = r5.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010a, code lost:
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
        if (r6.limit() <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
        r6 = new byte[r5.y.limit()];
        r5.y.get(r6);
        r7 = new com.daaw.f64(r7, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n64(android.content.Context r6, com.daaw.x24 r7, com.daaw.y24 r8) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.n64.<init>(android.content.Context, com.daaw.x24, com.daaw.y24):void");
    }

    @Override // com.daaw.qz6
    public final void D(p46 p46Var, pa6 pa6Var, boolean z, int i) {
        this.B += i;
    }

    @Override // com.daaw.p24
    public final long E() {
        if (m0()) {
            return 0L;
        }
        return this.B;
    }

    @Override // com.daaw.p24
    public final long F() {
        if (m0()) {
            return this.I.o();
        }
        synchronized (this.G) {
            while (!this.H.isEmpty()) {
                long j = this.D;
                Map zze = ((iu6) this.H.remove(0)).zze();
                long j2 = 0;
                if (zze != null) {
                    Iterator it = zze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && wx6.c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.D = j + j2;
            }
        }
        return this.D;
    }

    @Override // com.daaw.p24
    public final void G(Uri[] uriArr, String str) {
        H(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.daaw.p24
    public final void H(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        rr8 fs8Var;
        if (this.x == null) {
            return;
        }
        this.y = byteBuffer;
        this.z = z;
        int length = uriArr.length;
        if (length == 1) {
            fs8Var = j0(uriArr[0]);
        } else {
            rr8[] rr8VarArr = new rr8[length];
            for (int i = 0; i < uriArr.length; i++) {
                rr8VarArr[i] = j0(uriArr[i]);
            }
            fs8Var = new fs8(false, false, rr8VarArr);
        }
        this.x.c(fs8Var);
        this.x.m();
        p24.q.incrementAndGet();
    }

    @Override // com.daaw.p24
    public final void I() {
        ga8 ga8Var = this.x;
        if (ga8Var != null) {
            ga8Var.b(this);
            this.x.n();
            this.x = null;
            p24.q.decrementAndGet();
        }
    }

    @Override // com.daaw.p24
    public final void J(long j) {
        ga8 ga8Var = this.x;
        ga8Var.a(ga8Var.zzf(), j);
    }

    @Override // com.daaw.p24
    public final void K(int i) {
        this.s.e(i);
    }

    @Override // com.daaw.p24
    public final void L(int i) {
        this.s.f(i);
    }

    @Override // com.daaw.p24
    public final void M(o24 o24Var) {
        this.A = o24Var;
    }

    @Override // com.daaw.p24
    public final void N(int i) {
        this.s.g(i);
    }

    @Override // com.daaw.p24
    public final void O(int i) {
        this.s.h(i);
    }

    @Override // com.daaw.p24
    public final void P(boolean z) {
        this.x.d(z);
    }

    @Override // com.daaw.p24
    public final void Q(boolean z) {
        if (this.x == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.x.h();
            if (i >= 2) {
                return;
            }
            rv8 rv8Var = this.t;
            dv8 c = rv8Var.k().c();
            c.o(i, !z);
            rv8Var.p(c);
            i++;
        }
    }

    @Override // com.daaw.p24
    public final void R(int i) {
        for (WeakReference weakReference : this.J) {
            u54 u54Var = (u54) weakReference.get();
            if (u54Var != null) {
                u54Var.p(i);
            }
        }
    }

    @Override // com.daaw.p24
    public final void S(Surface surface, boolean z) {
        ga8 ga8Var = this.x;
        if (ga8Var == null) {
            return;
        }
        ga8Var.e(surface);
    }

    @Override // com.daaw.p24
    public final void T(float f, boolean z) {
        ga8 ga8Var = this.x;
        if (ga8Var == null) {
            return;
        }
        ga8Var.f(f);
    }

    @Override // com.daaw.p24
    public final void U() {
        this.x.g();
    }

    @Override // com.daaw.p24
    public final boolean V() {
        return this.x != null;
    }

    @Override // com.daaw.p24
    public final int W() {
        return this.C;
    }

    @Override // com.daaw.p24
    public final int Y() {
        return this.x.zzh();
    }

    @Override // com.daaw.qz6
    public final void a(p46 p46Var, pa6 pa6Var, boolean z) {
    }

    @Override // com.daaw.p24
    public final long a0() {
        return this.x.i();
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void b(ib8 ib8Var, int i, long j, long j2) {
    }

    @Override // com.daaw.p24
    public final long b0() {
        return this.B;
    }

    @Override // com.daaw.p24
    public final long c0() {
        if (m0() && this.I.s()) {
            return Math.min(this.B, this.I.n());
        }
        return 0L;
    }

    @Override // com.daaw.p24
    public final long d0() {
        return this.x.zzl();
    }

    @Override // com.daaw.ob8
    public final void e(ib8 ib8Var, f92 f92Var, tm7 tm7Var) {
        y24 y24Var = (y24) this.v.get();
        if (!((Boolean) zzba.zzc().b(g93.F1)).booleanValue() || y24Var == null || f92Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(f92Var.s));
        hashMap.put("bitRate", String.valueOf(f92Var.h));
        int i = f92Var.q;
        int i2 = f92Var.r;
        hashMap.put("resolution", i + "x" + i2);
        hashMap.put("videoMime", f92Var.k);
        hashMap.put("videoSampleMime", f92Var.l);
        hashMap.put("videoCodec", f92Var.i);
        y24Var.T("onMetadataEvent", hashMap);
    }

    @Override // com.daaw.p24
    public final long e0() {
        return this.x.j();
    }

    @Override // com.daaw.qz6
    public final void f(p46 p46Var, pa6 pa6Var, boolean z) {
    }

    public final /* synthetic */ p46 f0(String str, boolean z) {
        n64 n64Var = true != z ? null : this;
        x24 x24Var = this.u;
        return new q64(str, n64Var, x24Var.d, x24Var.f, x24Var.p, x24Var.q);
    }

    public final void finalize() {
        p24.p.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final /* synthetic */ p46 g0(String str, boolean z) {
        n64 n64Var = true != z ? null : this;
        x24 x24Var = this.u;
        u54 u54Var = new u54(str, n64Var, x24Var.d, x24Var.f, x24Var.i);
        this.J.add(new WeakReference(u54Var));
        return u54Var;
    }

    public final /* synthetic */ p46 h0(String str, boolean z) {
        yd6 yd6Var = new yd6();
        yd6Var.e(str);
        yd6Var.d(true != z ? null : this);
        yd6Var.b(this.u.d);
        yd6Var.c(this.u.f);
        yd6Var.a(true);
        return yd6Var.zza();
    }

    public final /* synthetic */ p46 i0(m36 m36Var) {
        return new x54(this.r, m36Var.zza(), this.E, this.F, this, new a64(this), null);
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void j(ib8 ib8Var, ql7 ql7Var) {
    }

    public final rr8 j0(Uri uri) {
        ee2 ee2Var = new ee2();
        ee2Var.b(uri);
        f53 c = ee2Var.c();
        bt8 bt8Var = this.w;
        bt8Var.a(this.u.g);
        return bt8Var.b(c);
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void k(ty3 ty3Var, lb8 lb8Var) {
    }

    public final /* synthetic */ void k0(boolean z, long j) {
        o24 o24Var = this.A;
        if (o24Var != null) {
            o24Var.e(z, j);
        }
    }

    @Override // com.daaw.qz6
    public final void l(p46 p46Var, pa6 pa6Var, boolean z) {
        if (p46Var instanceof iu6) {
            synchronized (this.G) {
                this.H.add((iu6) p46Var);
            }
        } else if (p46Var instanceof x54) {
            this.I = (x54) p46Var;
            final y24 y24Var = (y24) this.v.get();
            if (((Boolean) zzba.zzc().b(g93.F1)).booleanValue() && y24Var != null && this.I.q()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.I.s()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.I.r()));
                zzs.zza.post(new Runnable() { // from class: com.daaw.h64
                    @Override // java.lang.Runnable
                    public final void run() {
                        y24 y24Var2 = y24.this;
                        Map map = hashMap;
                        int i = n64.K;
                        y24Var2.T("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    public final /* synthetic */ i98[] l0(Handler handler, wy8 wy8Var, fj8 fj8Var, du8 du8Var, kq8 kq8Var) {
        Context context = this.r;
        jp8 jp8Var = jp8.a;
        bi8 bi8Var = bi8.c;
        hi8[] hi8VarArr = new hi8[0];
        uk8 uk8Var = new uk8();
        if (bi8Var == null) {
            Objects.requireNonNull(bi8Var, "Both parameters are null");
        }
        uk8Var.b(bi8Var);
        uk8Var.c(hi8VarArr);
        sl8 d = uk8Var.d();
        ap8 ap8Var = ap8.a;
        return new i98[]{new em8(context, ap8Var, jp8Var, false, handler, fj8Var, d), new sx8(this.r, ap8Var, jp8Var, 0L, false, handler, wy8Var, -1, 30.0f)};
    }

    public final boolean m0() {
        return this.I != null && this.I.t();
    }

    @Override // com.daaw.ob8
    public final void n(ib8 ib8Var, Object obj, long j) {
        o24 o24Var = this.A;
        if (o24Var != null) {
            o24Var.zzv();
        }
    }

    @Override // com.daaw.ob8
    public final void o(ib8 ib8Var, f92 f92Var, tm7 tm7Var) {
        y24 y24Var = (y24) this.v.get();
        if (!((Boolean) zzba.zzc().b(g93.F1)).booleanValue() || y24Var == null || f92Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", f92Var.k);
        hashMap.put("audioSampleMime", f92Var.l);
        hashMap.put("audioCodec", f92Var.i);
        y24Var.T("onMetadataEvent", hashMap);
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void p(ib8 ib8Var, nx3 nx3Var, nx3 nx3Var2, int i) {
    }

    @Override // com.daaw.ob8
    public final void q(ib8 ib8Var, int i, long j) {
        this.C += i;
    }

    @Override // com.daaw.ob8
    public final void r(ib8 ib8Var, ll4 ll4Var) {
        o24 o24Var = this.A;
        if (o24Var != null) {
            o24Var.g(ll4Var.a, ll4Var.b);
        }
    }

    @Override // com.daaw.ob8
    public final void s(ib8 ib8Var, ar8 ar8Var, lr8 lr8Var, IOException iOException, boolean z) {
        o24 o24Var = this.A;
        if (o24Var != null) {
            if (this.u.l) {
                o24Var.d("onLoadException", iOException);
            } else {
                o24Var.f("onLoadError", iOException);
            }
        }
    }

    @Override // com.daaw.ob8
    public final void u(ib8 ib8Var, int i) {
        o24 o24Var = this.A;
        if (o24Var != null) {
            o24Var.c(i);
        }
    }

    @Override // com.daaw.ob8
    public final void x(ib8 ib8Var, jn3 jn3Var) {
        o24 o24Var = this.A;
        if (o24Var != null) {
            o24Var.f("onPlayerError", jn3Var);
        }
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void y(ib8 ib8Var, lr8 lr8Var) {
    }
}

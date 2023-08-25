package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzatd;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class l44 extends p24 implements zy2, tv2, l03, dr2, lp2 {
    public static final /* synthetic */ int L = 0;
    public final WeakReference A;
    public o24 B;
    public int C;
    public int D;
    public long E;
    public final String F;
    public final int G;
    @GuardedBy("httpDataSourcesLock")
    public final ArrayList I;
    public volatile x34 J;
    public final Context r;
    public final y34 s;
    public final gq2 t;
    public final gq2 u;
    public final bx2 v;
    public final x24 w;
    public op2 x;
    public ByteBuffer y;
    public boolean z;
    public final Object H = new Object();
    public final Set K = new HashSet();

    public l44(Context context, x24 x24Var, y24 y24Var) {
        this.r = context;
        this.w = x24Var;
        this.A = new WeakReference(y24Var);
        y34 y34Var = new y34();
        this.s = y34Var;
        su2 su2Var = su2.a;
        gv6 gv6Var = zzs.zza;
        a03 a03Var = new a03(context, su2Var, 0L, gv6Var, this, -1);
        this.t = a03Var;
        sr2 sr2Var = new sr2(su2Var, null, true, gv6Var, this);
        this.u = sr2Var;
        xw2 xw2Var = new xw2(null);
        this.v = xw2Var;
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        p24.p.incrementAndGet();
        op2 a = pp2.a(new gq2[]{sr2Var, a03Var}, xw2Var, y34Var);
        this.x = a;
        a.r(this);
        this.C = 0;
        this.E = 0L;
        this.D = 0;
        this.I = new ArrayList();
        this.J = null;
        this.F = (y24Var == null || y24Var.zzt() == null) ? "" : y24Var.zzt();
        this.G = y24Var != null ? y24Var.zzh() : 0;
        if (((Boolean) zzba.zzc().b(g93.n)).booleanValue()) {
            this.x.zzg();
        }
        if (y24Var != null && y24Var.zzg() > 0) {
            this.x.q(y24Var.zzg());
        }
        if (y24Var != null && y24Var.zzf() > 0) {
            this.x.p(y24Var.zzf());
        }
        if (((Boolean) zzba.zzc().b(g93.p)).booleanValue()) {
            this.x.zzi();
            this.x.i(((Integer) zzba.zzc().b(g93.q)).intValue());
        }
    }

    @Override // com.daaw.l03
    public final void A(int i, long j) {
        this.D += i;
    }

    @Override // com.daaw.lp2
    public final void B(boolean z, int i) {
        o24 o24Var = this.B;
        if (o24Var != null) {
            o24Var.c(i);
        }
    }

    @Override // com.daaw.l03
    public final void C(Surface surface) {
        o24 o24Var = this.B;
        if (o24Var != null) {
            o24Var.zzv();
        }
    }

    @Override // com.daaw.p24
    public final long E() {
        if (l0()) {
            return 0L;
        }
        return this.C;
    }

    @Override // com.daaw.p24
    public final long F() {
        if (l0()) {
            return this.J.d();
        }
        synchronized (this.H) {
            while (!this.I.isEmpty()) {
                long j = this.E;
                Map zze = ((ty2) this.I.remove(0)).zze();
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
                this.E = j + j2;
            }
        }
        return this.E;
    }

    @Override // com.daaw.p24
    public final void G(Uri[] uriArr, String str) {
        H(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.daaw.p24
    public final void H(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        yv2 cw2Var;
        if (this.x == null) {
            return;
        }
        this.y = byteBuffer;
        this.z = z;
        int length = uriArr.length;
        if (length == 1) {
            cw2Var = m0(uriArr[0], str);
        } else {
            yv2[] yv2VarArr = new yv2[length];
            for (int i = 0; i < uriArr.length; i++) {
                yv2VarArr[i] = m0(uriArr[i], str);
            }
            cw2Var = new cw2(yv2VarArr);
        }
        this.x.m(cw2Var);
        p24.q.incrementAndGet();
    }

    @Override // com.daaw.p24
    public final void I() {
        op2 op2Var = this.x;
        if (op2Var != null) {
            op2Var.l(this);
            this.x.zzk();
            this.x = null;
            p24.q.decrementAndGet();
        }
    }

    @Override // com.daaw.p24
    public final void J(long j) {
        this.x.j(j);
    }

    @Override // com.daaw.p24
    public final void K(int i) {
        this.s.f(i);
    }

    @Override // com.daaw.p24
    public final void L(int i) {
        this.s.g(i);
    }

    @Override // com.daaw.p24
    public final void M(o24 o24Var) {
        this.B = o24Var;
    }

    @Override // com.daaw.p24
    public final void N(int i) {
        this.s.h(i);
    }

    @Override // com.daaw.p24
    public final void O(int i) {
        this.s.i(i);
    }

    @Override // com.daaw.p24
    public final void P(boolean z) {
        this.x.k(z);
    }

    @Override // com.daaw.p24
    public final void Q(boolean z) {
        if (this.x != null) {
            for (int i = 0; i < 2; i++) {
                this.v.f(i, !z);
            }
        }
    }

    @Override // com.daaw.p24
    public final void R(int i) {
        for (WeakReference weakReference : this.K) {
            v34 v34Var = (v34) weakReference.get();
            if (v34Var != null) {
                v34Var.e(i);
            }
        }
    }

    @Override // com.daaw.p24
    public final void S(Surface surface, boolean z) {
        op2 op2Var = this.x;
        if (op2Var == null) {
            return;
        }
        np2 np2Var = new np2(this.t, 1, surface);
        if (z) {
            op2Var.n(np2Var);
        } else {
            op2Var.o(np2Var);
        }
    }

    @Override // com.daaw.p24
    public final void T(float f, boolean z) {
        if (this.x == null) {
            return;
        }
        this.x.o(new np2(this.u, 2, Float.valueOf(f)));
    }

    @Override // com.daaw.p24
    public final void U() {
        this.x.zzr();
    }

    @Override // com.daaw.p24
    public final boolean V() {
        return this.x != null;
    }

    @Override // com.daaw.p24
    public final int W() {
        return this.D;
    }

    @Override // com.daaw.p24
    public final int Y() {
        return this.x.zza();
    }

    @Override // com.daaw.p24
    public final long a0() {
        return this.x.zzb();
    }

    @Override // com.daaw.p24
    public final long b0() {
        return this.C;
    }

    @Override // com.daaw.tv2
    public final void c(IOException iOException) {
        o24 o24Var = this.B;
        if (o24Var != null) {
            if (this.w.l) {
                o24Var.d("onLoadException", iOException);
            } else {
                o24Var.f("onLoadError", iOException);
            }
        }
    }

    @Override // com.daaw.p24
    public final long c0() {
        if (l0() && this.J.h()) {
            return Math.min(this.C, this.J.c());
        }
        return 0L;
    }

    @Override // com.daaw.dr2
    public final void d(zzatd zzatdVar) {
        y24 y24Var = (y24) this.A.get();
        if (!((Boolean) zzba.zzc().b(g93.F1)).booleanValue() || y24Var == null || zzatdVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzatdVar.t);
        hashMap.put("audioSampleMime", zzatdVar.u);
        hashMap.put("audioCodec", zzatdVar.r);
        y24Var.T("onMetadataEvent", hashMap);
    }

    @Override // com.daaw.p24
    public final long d0() {
        return this.x.zzc();
    }

    @Override // com.daaw.p24
    public final long e0() {
        return this.x.zzd();
    }

    public final /* synthetic */ kx2 f0(String str, boolean z) {
        l44 l44Var = true != z ? null : this;
        x24 x24Var = this.w;
        v34 v34Var = new v34(str, l44Var, x24Var.d, x24Var.f, x24Var.i);
        this.K.add(new WeakReference(v34Var));
        return v34Var;
    }

    public final void finalize() {
        p24.p.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.daaw.l03
    public final void g(int i, int i2, int i3, float f) {
        o24 o24Var = this.B;
        if (o24Var != null) {
            o24Var.g(i, i2);
        }
    }

    public final /* synthetic */ kx2 g0(String str, boolean z) {
        l44 l44Var = true != z ? null : this;
        x24 x24Var = this.w;
        return new ox2(str, null, l44Var, x24Var.d, x24Var.f, true, null);
    }

    @Override // com.daaw.lp2
    public final void h(rw2 rw2Var, dx2 dx2Var) {
    }

    public final /* synthetic */ kx2 h0(jx2 jx2Var) {
        return new x34(this.r, jx2Var.zza(), this.F, this.G, this, new h44(this), null);
    }

    @Override // com.daaw.zy2
    public final /* synthetic */ void i(Object obj, int i) {
        this.C += i;
    }

    public final /* synthetic */ void i0(boolean z, long j) {
        o24 o24Var = this.B;
        if (o24Var != null) {
            o24Var.e(z, j);
        }
    }

    public final void j0(kx2 kx2Var, int i) {
        this.C += i;
    }

    @Override // com.daaw.zy2
    /* renamed from: k0 */
    public final void w(kx2 kx2Var, mx2 mx2Var) {
        if (kx2Var instanceof ty2) {
            synchronized (this.H) {
                this.I.add((ty2) kx2Var);
            }
        } else if (kx2Var instanceof x34) {
            this.J = (x34) kx2Var;
            final y24 y24Var = (y24) this.A.get();
            if (((Boolean) zzba.zzc().b(g93.F1)).booleanValue() && y24Var != null && this.J.f()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.J.h()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.J.g()));
                zzs.zza.post(new Runnable() { // from class: com.daaw.i44
                    @Override // java.lang.Runnable
                    public final void run() {
                        y24 y24Var2 = y24.this;
                        Map map = hashMap;
                        int i = l44.L;
                        y24Var2.T("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    public final boolean l0() {
        return this.J != null && this.J.i();
    }

    @Override // com.daaw.lp2
    public final void m(kp2 kp2Var) {
        o24 o24Var = this.B;
        if (o24Var != null) {
            o24Var.f("onPlayerError", kp2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.F1)).booleanValue() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.yv2 m0(android.net.Uri r11, final java.lang.String r12) {
        /*
            r10 = this;
            com.daaw.uv2 r9 = new com.daaw.uv2
            boolean r0 = r10.z
            if (r0 == 0) goto L23
            java.nio.ByteBuffer r0 = r10.y
            int r0 = r0.limit()
            if (r0 <= 0) goto L23
            java.nio.ByteBuffer r12 = r10.y
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.y
            r0.get(r12)
            com.daaw.z34 r0 = new com.daaw.z34
            r0.<init>()
        L20:
            r2 = r0
            goto L94
        L23:
            com.daaw.y83 r0 = com.daaw.g93.O1
            com.daaw.e93 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L48
            com.daaw.y83 r0 = com.daaw.g93.F1
            com.daaw.e93 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r2.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L50
        L48:
            com.daaw.x24 r0 = r10.w
            boolean r0 = r0.j
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r1 = 0
        L50:
            com.daaw.x24 r0 = r10.w
            boolean r2 = r0.o
            if (r2 == 0) goto L5c
            com.daaw.a44 r0 = new com.daaw.a44
            r0.<init>()
            goto L6b
        L5c:
            int r0 = r0.i
            if (r0 <= 0) goto L66
            com.daaw.b44 r0 = new com.daaw.b44
            r0.<init>()
            goto L6b
        L66:
            com.daaw.c44 r0 = new com.daaw.c44
            r0.<init>()
        L6b:
            com.daaw.x24 r12 = r10.w
            boolean r12 = r12.j
            if (r12 == 0) goto L77
            com.daaw.d44 r12 = new com.daaw.d44
            r12.<init>()
            r0 = r12
        L77:
            java.nio.ByteBuffer r12 = r10.y
            if (r12 == 0) goto L20
            int r12 = r12.limit()
            if (r12 <= 0) goto L20
            java.nio.ByteBuffer r12 = r10.y
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.y
            r1.get(r12)
            com.daaw.g44 r1 = new com.daaw.g44
            r1.<init>()
            r2 = r1
        L94:
            com.daaw.y83 r12 = com.daaw.g93.m
            com.daaw.e93 r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r12 = r0.b(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La9
            com.daaw.j44 r12 = new com.daaw.ps2() { // from class: com.daaw.j44
                static {
                    /*
                        com.daaw.j44 r0 = new com.daaw.j44
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.daaw.j44) com.daaw.j44.a com.daaw.j44
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.j44.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.j44.<init>():void");
                }

                @Override // com.daaw.ps2
                public final com.daaw.ns2[] zza() {
                    /*
                        r4 = this;
                        int r0 = com.daaw.l44.L
                        r0 = 3
                        com.daaw.ns2[] r0 = new com.daaw.ns2[r0]
                        com.daaw.du2 r1 = new com.daaw.du2
                        r1.<init>()
                        r2 = 0
                        r0[r2] = r1
                        com.daaw.ft2 r1 = new com.daaw.ft2
                        r1.<init>(r2)
                        r3 = 1
                        r0[r3] = r1
                        com.daaw.zt2 r1 = new com.daaw.zt2
                        r3 = 0
                        r1.<init>(r2, r3, r3)
                        r2 = 2
                        r0[r2] = r1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.j44.zza():com.daaw.ns2[]");
                }
            }
            goto Lab
        La9:
            com.daaw.k44 r12 = new com.daaw.ps2() { // from class: com.daaw.k44
                static {
                    /*
                        com.daaw.k44 r0 = new com.daaw.k44
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.daaw.k44) com.daaw.k44.a com.daaw.k44
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.k44.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.k44.<init>():void");
                }

                @Override // com.daaw.ps2
                public final com.daaw.ns2[] zza() {
                    /*
                        r3 = this;
                        int r0 = com.daaw.l44.L
                        r0 = 2
                        com.daaw.ns2[] r0 = new com.daaw.ns2[r0]
                        com.daaw.du2 r1 = new com.daaw.du2
                        r1.<init>()
                        r2 = 0
                        r0[r2] = r1
                        com.daaw.ft2 r1 = new com.daaw.ft2
                        r1.<init>(r2)
                        r2 = 1
                        r0[r2] = r1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.k44.zza():com.daaw.ns2[]");
                }
            }
        Lab:
            r3 = r12
            com.daaw.x24 r12 = r10.w
            int r4 = r12.k
            com.daaw.gv6 r5 = com.google.android.gms.ads.internal.util.zzs.zza
            r7 = 0
            int r8 = r12.g
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.l44.m0(android.net.Uri, java.lang.String):com.daaw.yv2");
    }

    public final /* synthetic */ kx2 n0(String str, boolean z) {
        l44 l44Var = true != z ? null : this;
        x24 x24Var = this.w;
        return new p44(str, l44Var, x24Var.d, x24Var.f, x24Var.p, x24Var.q);
    }

    @Override // com.daaw.l03
    public final void t(zzatd zzatdVar) {
        y24 y24Var = (y24) this.A.get();
        if (!((Boolean) zzba.zzc().b(g93.F1)).booleanValue() || y24Var == null || zzatdVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzatdVar.A));
        hashMap.put("bitRate", String.valueOf(zzatdVar.q));
        int i = zzatdVar.y;
        int i2 = zzatdVar.z;
        hashMap.put("resolution", i + "x" + i2);
        hashMap.put("videoMime", zzatdVar.t);
        hashMap.put("videoSampleMime", zzatdVar.u);
        hashMap.put("videoCodec", zzatdVar.r);
        y24Var.T("onMetadataEvent", hashMap);
    }

    @Override // com.daaw.lp2
    public final void v(fq2 fq2Var) {
    }

    @Override // com.daaw.lp2
    public final void z(mq2 mq2Var, Object obj) {
    }

    @Override // com.daaw.lp2
    public final void zza(boolean z) {
    }

    @Override // com.daaw.lp2
    public final void zze() {
    }
}

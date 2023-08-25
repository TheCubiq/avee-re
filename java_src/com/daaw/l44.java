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

    /* renamed from: L */
    public static final /* synthetic */ int f17030L = 0;

    /* renamed from: A */
    public final WeakReference f17031A;

    /* renamed from: B */
    public o24 f17032B;

    /* renamed from: C */
    public int f17033C;

    /* renamed from: D */
    public int f17034D;

    /* renamed from: E */
    public long f17035E;

    /* renamed from: F */
    public final String f17036F;

    /* renamed from: G */
    public final int f17037G;
    @GuardedBy("httpDataSourcesLock")

    /* renamed from: I */
    public final ArrayList f17039I;

    /* renamed from: J */
    public volatile x34 f17040J;

    /* renamed from: r */
    public final Context f17042r;

    /* renamed from: s */
    public final y34 f17043s;

    /* renamed from: t */
    public final gq2 f17044t;

    /* renamed from: u */
    public final gq2 f17045u;

    /* renamed from: v */
    public final bx2 f17046v;

    /* renamed from: w */
    public final x24 f17047w;

    /* renamed from: x */
    public op2 f17048x;

    /* renamed from: y */
    public ByteBuffer f17049y;

    /* renamed from: z */
    public boolean f17050z;

    /* renamed from: H */
    public final Object f17038H = new Object();

    /* renamed from: K */
    public final Set f17041K = new HashSet();

    public l44(Context context, x24 x24Var, y24 y24Var) {
        this.f17042r = context;
        this.f17047w = x24Var;
        this.f17031A = new WeakReference(y24Var);
        y34 y34Var = new y34();
        this.f17043s = y34Var;
        su2 su2Var = su2.f26650a;
        gv6 gv6Var = zzs.zza;
        a03 a03Var = new a03(context, su2Var, 0L, gv6Var, this, -1);
        this.f17044t = a03Var;
        sr2 sr2Var = new sr2(su2Var, null, true, gv6Var, this);
        this.f17045u = sr2Var;
        xw2 xw2Var = new xw2(null);
        this.f17046v = xw2Var;
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        p24.f22538p.incrementAndGet();
        op2 m13235a = pp2.m13235a(new gq2[]{sr2Var, a03Var}, xw2Var, y34Var);
        this.f17048x = m13235a;
        m13235a.mo11086r(this);
        this.f17033C = 0;
        this.f17035E = 0L;
        this.f17034D = 0;
        this.f17039I = new ArrayList();
        this.f17040J = null;
        this.f17036F = (y24Var == null || y24Var.zzt() == null) ? "" : y24Var.zzt();
        this.f17037G = y24Var != null ? y24Var.zzh() : 0;
        if (((Boolean) zzba.zzc().m23658b(g93.f10764n)).booleanValue()) {
            this.f17048x.zzg();
        }
        if (y24Var != null && y24Var.zzg() > 0) {
            this.f17048x.mo11087q(y24Var.zzg());
        }
        if (y24Var != null && y24Var.zzf() > 0) {
            this.f17048x.mo11088p(y24Var.zzf());
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10786p)).booleanValue()) {
            this.f17048x.zzi();
            this.f17048x.mo11095i(((Integer) zzba.zzc().m23658b(g93.f10797q)).intValue());
        }
    }

    @Override // com.daaw.l03
    /* renamed from: A */
    public final void mo17156A(int i, long j) {
        this.f17034D += i;
    }

    @Override // com.daaw.lp2
    /* renamed from: B */
    public final void mo16685B(boolean z, int i) {
        o24 o24Var = this.f17032B;
        if (o24Var != null) {
            o24Var.mo9570c(i);
        }
    }

    @Override // com.daaw.l03
    /* renamed from: C */
    public final void mo17155C(Surface surface) {
        o24 o24Var = this.f17032B;
        if (o24Var != null) {
            o24Var.zzv();
        }
    }

    @Override // com.daaw.p24
    /* renamed from: E */
    public final long mo13751E() {
        if (m17146l0()) {
            return 0L;
        }
        return this.f17033C;
    }

    @Override // com.daaw.p24
    /* renamed from: F */
    public final long mo13750F() {
        if (m17146l0()) {
            return this.f17040J.m5582d();
        }
        synchronized (this.f17038H) {
            while (!this.f17039I.isEmpty()) {
                long j = this.f17035E;
                Map zze = ((ty2) this.f17039I.remove(0)).zze();
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
                                if (entry.getKey() != null && wx6.m5724c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f17035E = j + j2;
            }
        }
        return this.f17035E;
    }

    @Override // com.daaw.p24
    /* renamed from: G */
    public final void mo13749G(Uri[] uriArr, String str) {
        mo13748H(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.daaw.p24
    /* renamed from: H */
    public final void mo13748H(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        yv2 cw2Var;
        if (this.f17048x == null) {
            return;
        }
        this.f17049y = byteBuffer;
        this.f17050z = z;
        int length = uriArr.length;
        if (length == 1) {
            cw2Var = m17145m0(uriArr[0], str);
        } else {
            yv2[] yv2VarArr = new yv2[length];
            for (int i = 0; i < uriArr.length; i++) {
                yv2VarArr[i] = m17145m0(uriArr[i], str);
            }
            cw2Var = new cw2(yv2VarArr);
        }
        this.f17048x.mo11091m(cw2Var);
        p24.f22539q.incrementAndGet();
    }

    @Override // com.daaw.p24
    /* renamed from: I */
    public final void mo13747I() {
        op2 op2Var = this.f17048x;
        if (op2Var != null) {
            op2Var.mo11092l(this);
            this.f17048x.zzk();
            this.f17048x = null;
            p24.f22539q.decrementAndGet();
        }
    }

    @Override // com.daaw.p24
    /* renamed from: J */
    public final void mo13746J(long j) {
        this.f17048x.mo11094j(j);
    }

    @Override // com.daaw.p24
    /* renamed from: K */
    public final void mo13745K(int i) {
        this.f17043s.m4153f(i);
    }

    @Override // com.daaw.p24
    /* renamed from: L */
    public final void mo13744L(int i) {
        this.f17043s.m4152g(i);
    }

    @Override // com.daaw.p24
    /* renamed from: M */
    public final void mo13743M(o24 o24Var) {
        this.f17032B = o24Var;
    }

    @Override // com.daaw.p24
    /* renamed from: N */
    public final void mo13742N(int i) {
        this.f17043s.m4151h(i);
    }

    @Override // com.daaw.p24
    /* renamed from: O */
    public final void mo13741O(int i) {
        this.f17043s.m4150i(i);
    }

    @Override // com.daaw.p24
    /* renamed from: P */
    public final void mo13740P(boolean z) {
        this.f17048x.mo11093k(z);
    }

    @Override // com.daaw.p24
    /* renamed from: Q */
    public final void mo13739Q(boolean z) {
        if (this.f17048x != null) {
            for (int i = 0; i < 2; i++) {
                this.f17046v.m25764f(i, !z);
            }
        }
    }

    @Override // com.daaw.p24
    /* renamed from: R */
    public final void mo13738R(int i) {
        for (WeakReference weakReference : this.f17041K) {
            v34 v34Var = (v34) weakReference.get();
            if (v34Var != null) {
                v34Var.m7509e(i);
            }
        }
    }

    @Override // com.daaw.p24
    /* renamed from: S */
    public final void mo13737S(Surface surface, boolean z) {
        op2 op2Var = this.f17048x;
        if (op2Var == null) {
            return;
        }
        np2 np2Var = new np2(this.f17044t, 1, surface);
        if (z) {
            op2Var.mo11090n(np2Var);
        } else {
            op2Var.mo11089o(np2Var);
        }
    }

    @Override // com.daaw.p24
    /* renamed from: T */
    public final void mo13736T(float f, boolean z) {
        if (this.f17048x == null) {
            return;
        }
        this.f17048x.mo11089o(new np2(this.f17045u, 2, Float.valueOf(f)));
    }

    @Override // com.daaw.p24
    /* renamed from: U */
    public final void mo13735U() {
        this.f17048x.zzr();
    }

    @Override // com.daaw.p24
    /* renamed from: V */
    public final boolean mo13734V() {
        return this.f17048x != null;
    }

    @Override // com.daaw.p24
    /* renamed from: W */
    public final int mo13733W() {
        return this.f17034D;
    }

    @Override // com.daaw.p24
    /* renamed from: Y */
    public final int mo13731Y() {
        return this.f17048x.zza();
    }

    @Override // com.daaw.p24
    /* renamed from: a0 */
    public final long mo13729a0() {
        return this.f17048x.zzb();
    }

    @Override // com.daaw.p24
    /* renamed from: b0 */
    public final long mo13728b0() {
        return this.f17033C;
    }

    @Override // com.daaw.tv2
    /* renamed from: c */
    public final void mo8770c(IOException iOException) {
        o24 o24Var = this.f17032B;
        if (o24Var != null) {
            if (this.f17047w.f32033l) {
                o24Var.mo9569d("onLoadException", iOException);
            } else {
                o24Var.mo9567f("onLoadError", iOException);
            }
        }
    }

    @Override // com.daaw.p24
    /* renamed from: c0 */
    public final long mo13727c0() {
        if (m17146l0() && this.f17040J.m5578h()) {
            return Math.min(this.f17033C, this.f17040J.m5583c());
        }
        return 0L;
    }

    @Override // com.daaw.dr2
    /* renamed from: d */
    public final void mo17154d(zzatd zzatdVar) {
        y24 y24Var = (y24) this.f17031A.get();
        if (!((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() || y24Var == null || zzatdVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzatdVar.f36793t);
        hashMap.put("audioSampleMime", zzatdVar.f36794u);
        hashMap.put("audioCodec", zzatdVar.f36791r);
        y24Var.mo6434T("onMetadataEvent", hashMap);
    }

    @Override // com.daaw.p24
    /* renamed from: d0 */
    public final long mo13726d0() {
        return this.f17048x.zzc();
    }

    @Override // com.daaw.p24
    /* renamed from: e0 */
    public final long mo13725e0() {
        return this.f17048x.zzd();
    }

    /* renamed from: f0 */
    public final /* synthetic */ kx2 m17153f0(String str, boolean z) {
        l44 l44Var = true != z ? null : this;
        x24 x24Var = this.f17047w;
        v34 v34Var = new v34(str, l44Var, x24Var.f32025d, x24Var.f32027f, x24Var.f32030i);
        this.f17041K.add(new WeakReference(v34Var));
        return v34Var;
    }

    public final void finalize() {
        p24.f22538p.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.daaw.l03
    /* renamed from: g */
    public final void mo17152g(int i, int i2, int i3, float f) {
        o24 o24Var = this.f17032B;
        if (o24Var != null) {
            o24Var.mo9566g(i, i2);
        }
    }

    /* renamed from: g0 */
    public final /* synthetic */ kx2 m17151g0(String str, boolean z) {
        l44 l44Var = true != z ? null : this;
        x24 x24Var = this.f17047w;
        return new ox2(str, null, l44Var, x24Var.f32025d, x24Var.f32027f, true, null);
    }

    @Override // com.daaw.lp2
    /* renamed from: h */
    public final void mo16684h(rw2 rw2Var, dx2 dx2Var) {
    }

    /* renamed from: h0 */
    public final /* synthetic */ kx2 m17150h0(jx2 jx2Var) {
        return new x34(this.f17042r, jx2Var.zza(), this.f17036F, this.f17037G, this, new h44(this), null);
    }

    @Override // com.daaw.zy2
    /* renamed from: i */
    public final /* synthetic */ void mo1772i(Object obj, int i) {
        this.f17033C += i;
    }

    /* renamed from: i0 */
    public final /* synthetic */ void m17149i0(boolean z, long j) {
        o24 o24Var = this.f17032B;
        if (o24Var != null) {
            o24Var.mo9568e(z, j);
        }
    }

    /* renamed from: j0 */
    public final void m17148j0(kx2 kx2Var, int i) {
        this.f17033C += i;
    }

    @Override // com.daaw.zy2
    /* renamed from: k0 */
    public final void mo1771w(kx2 kx2Var, mx2 mx2Var) {
        if (kx2Var instanceof ty2) {
            synchronized (this.f17038H) {
                this.f17039I.add((ty2) kx2Var);
            }
        } else if (kx2Var instanceof x34) {
            this.f17040J = (x34) kx2Var;
            final y24 y24Var = (y24) this.f17031A.get();
            if (((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() && y24Var != null && this.f17040J.m5580f()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f17040J.m5578h()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f17040J.m5579g()));
                zzs.zza.post(new Runnable() { // from class: com.daaw.i44
                    @Override // java.lang.Runnable
                    public final void run() {
                        y24 y24Var2 = y24.this;
                        Map map = hashMap;
                        int i = l44.f17030L;
                        y24Var2.mo6434T("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    /* renamed from: l0 */
    public final boolean m17146l0() {
        return this.f17040J != null && this.f17040J.m5577i();
    }

    @Override // com.daaw.lp2
    /* renamed from: m */
    public final void mo16683m(kp2 kp2Var) {
        o24 o24Var = this.f17032B;
        if (o24Var != null) {
            o24Var.mo9567f("onPlayerError", kp2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10413F1)).booleanValue() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yv2 m17145m0(Uri uri, final String str) {
        final jx2 jx2Var;
        jx2 jx2Var2;
        if (!this.f17050z || this.f17049y.limit() <= 0) {
            final boolean z = true;
            if (((Boolean) zzba.zzc().m23658b(g93.f10503O1)).booleanValue()) {
            }
            if (this.f17047w.f32031j) {
                z = false;
            }
            x24 x24Var = this.f17047w;
            jx2Var = x24Var.f32036o ? new jx2() { // from class: com.daaw.a44
                @Override // com.daaw.jx2
                public final kx2 zza() {
                    return l44.this.m17144n0(str, z);
                }
            } : x24Var.f32030i > 0 ? new jx2() { // from class: com.daaw.b44
                @Override // com.daaw.jx2
                public final kx2 zza() {
                    return l44.this.m17153f0(str, z);
                }
            } : new jx2() { // from class: com.daaw.c44
                @Override // com.daaw.jx2
                public final kx2 zza() {
                    return l44.this.m17151g0(str, z);
                }
            };
            if (this.f17047w.f32031j) {
                jx2Var = new jx2() { // from class: com.daaw.d44
                    @Override // com.daaw.jx2
                    public final kx2 zza() {
                        return l44.this.m17150h0(jx2Var);
                    }
                };
            }
            ByteBuffer byteBuffer = this.f17049y;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.f17049y.limit()];
                this.f17049y.get(bArr);
                jx2Var2 = new jx2() { // from class: com.daaw.g44
                    @Override // com.daaw.jx2
                    public final kx2 zza() {
                        jx2 jx2Var3 = jx2.this;
                        byte[] bArr2 = bArr;
                        int i = l44.f17030L;
                        return new m44(new ix2(bArr2), bArr2.length, jx2Var3.zza());
                    }
                };
                ps2 ps2Var = !((Boolean) zzba.zzc().m23658b(g93.f10753m)).booleanValue() ? new ps2() { // from class: com.daaw.j44
                    @Override // com.daaw.ps2
                    public final ns2[] zza() {
                        int i = l44.f17030L;
                        return new ns2[]{new du2(), new ft2(0), new zt2(0, null, null)};
                    }
                } : new ps2() { // from class: com.daaw.k44
                    @Override // com.daaw.ps2
                    public final ns2[] zza() {
                        int i = l44.f17030L;
                        return new ns2[]{new du2(), new ft2(0)};
                    }
                };
                x24 x24Var2 = this.f17047w;
                return new uv2(uri, jx2Var2, ps2Var, x24Var2.f32032k, zzs.zza, this, null, x24Var2.f32028g);
            }
        } else {
            final byte[] bArr2 = new byte[this.f17049y.limit()];
            this.f17049y.get(bArr2);
            jx2Var = new jx2() { // from class: com.daaw.z34
                @Override // com.daaw.jx2
                public final kx2 zza() {
                    return new ix2(bArr2);
                }
            };
        }
        jx2Var2 = jx2Var;
        ps2 ps2Var2 = !((Boolean) zzba.zzc().m23658b(g93.f10753m)).booleanValue() ? new ps2() { // from class: com.daaw.j44
            @Override // com.daaw.ps2
            public final ns2[] zza() {
                int i = l44.f17030L;
                return new ns2[]{new du2(), new ft2(0), new zt2(0, null, null)};
            }
        } : new ps2() { // from class: com.daaw.k44
            @Override // com.daaw.ps2
            public final ns2[] zza() {
                int i = l44.f17030L;
                return new ns2[]{new du2(), new ft2(0)};
            }
        };
        x24 x24Var22 = this.f17047w;
        return new uv2(uri, jx2Var2, ps2Var2, x24Var22.f32032k, zzs.zza, this, null, x24Var22.f32028g);
    }

    /* renamed from: n0 */
    public final /* synthetic */ kx2 m17144n0(String str, boolean z) {
        l44 l44Var = true != z ? null : this;
        x24 x24Var = this.f17047w;
        return new p44(str, l44Var, x24Var.f32025d, x24Var.f32027f, x24Var.f32037p, x24Var.f32038q);
    }

    @Override // com.daaw.l03
    /* renamed from: t */
    public final void mo17143t(zzatd zzatdVar) {
        y24 y24Var = (y24) this.f17031A.get();
        if (!((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() || y24Var == null || zzatdVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzatdVar.f36773A));
        hashMap.put("bitRate", String.valueOf(zzatdVar.f36790q));
        int i = zzatdVar.f36798y;
        int i2 = zzatdVar.f36799z;
        hashMap.put("resolution", i + "x" + i2);
        hashMap.put("videoMime", zzatdVar.f36793t);
        hashMap.put("videoSampleMime", zzatdVar.f36794u);
        hashMap.put("videoCodec", zzatdVar.f36791r);
        y24Var.mo6434T("onMetadataEvent", hashMap);
    }

    @Override // com.daaw.lp2
    /* renamed from: v */
    public final void mo16682v(fq2 fq2Var) {
    }

    @Override // com.daaw.lp2
    /* renamed from: z */
    public final void mo16681z(mq2 mq2Var, Object obj) {
    }

    @Override // com.daaw.lp2
    public final void zza(boolean z) {
    }

    @Override // com.daaw.lp2
    public final void zze() {
    }
}

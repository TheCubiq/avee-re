package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
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

    /* renamed from: K */
    public static final /* synthetic */ int f19510K = 0;

    /* renamed from: A */
    public o24 f19511A;

    /* renamed from: B */
    public int f19512B;

    /* renamed from: C */
    public int f19513C;

    /* renamed from: D */
    public long f19514D;

    /* renamed from: E */
    public final String f19515E;

    /* renamed from: F */
    public final int f19516F;
    @GuardedBy("httpDataSourcesLock")

    /* renamed from: H */
    public final ArrayList f19518H;

    /* renamed from: I */
    public volatile x54 f19519I;

    /* renamed from: r */
    public final Context f19521r;

    /* renamed from: s */
    public final v54 f19522s;

    /* renamed from: t */
    public final rv8 f19523t;

    /* renamed from: u */
    public final x24 f19524u;

    /* renamed from: v */
    public final WeakReference f19525v;

    /* renamed from: w */
    public final bt8 f19526w;

    /* renamed from: x */
    public ga8 f19527x;

    /* renamed from: y */
    public ByteBuffer f19528y;

    /* renamed from: z */
    public boolean f19529z;

    /* renamed from: G */
    public final Object f19517G = new Object();

    /* renamed from: J */
    public final Set f19520J = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10413F1)).booleanValue() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:
        if (r7.f32031j == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
        if (r7.f32036o == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
        r8 = new com.daaw.b64(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
        if (r7.f32030i <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
        r8 = new com.daaw.c64(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
        r8 = new com.daaw.d64(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
        if (r7.f32031j == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
        r7 = new com.daaw.e64(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
        r6 = r5.f19528y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010a, code lost:
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
        if (r6.limit() <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
        r6 = new byte[r5.f19528y.limit()];
        r5.f19528y.get(r6);
        r7 = new com.daaw.f64(r7, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n64(Context context, x24 x24Var, y24 y24Var) {
        final m36 m36Var;
        this.f19521r = context;
        this.f19524u = x24Var;
        this.f19525v = new WeakReference(y24Var);
        v54 v54Var = new v54();
        this.f19522s = v54Var;
        rv8 rv8Var = new rv8(context);
        this.f19523t = rv8Var;
        if (zze.zzc()) {
            zze.zza("OfficialSimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        p24.f22538p.incrementAndGet();
        da8 da8Var = new da8(context, new g64(this), null);
        da8Var.m24577b(rv8Var);
        da8Var.m24578a(v54Var);
        ga8 m24576c = da8Var.m24576c();
        this.f19527x = m24576c;
        m24576c.m21837l(this);
        final boolean z = false;
        this.f19512B = 0;
        this.f19514D = 0L;
        this.f19513C = 0;
        this.f19518H = new ArrayList();
        this.f19519I = null;
        this.f19515E = (y24Var == null || y24Var.zzt() == null) ? "" : y24Var.zzt();
        this.f19516F = y24Var != null ? y24Var.zzh() : 0;
        final String zzc = zzt.zzp().zzc(context, y24Var.zzp().f36993p);
        if (!this.f19529z || this.f19528y.limit() <= 0) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10503O1)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.f19528y.limit()];
            this.f19528y.get(bArr);
            m36Var = new m36() { // from class: com.daaw.z54
                @Override // com.daaw.m36
                public final p46 zza() {
                    return new yy5(bArr);
                }
            };
        }
        this.f19526w = new bt8(m36Var, new at8(((Boolean) zzba.zzc().m23658b(g93.f10753m)).booleanValue() ? new q09() { // from class: com.daaw.i64
            @Override // com.daaw.q09
            /* renamed from: a */
            public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
                return p09.m13771a(this, uri, map);
            }

            @Override // com.daaw.q09
            public final j09[] zza() {
                int i = n64.f19510K;
                return new j09[]{new ca2(0), new n82(0), new x92(0, null)};
            }
        } : new q09() { // from class: com.daaw.m64
            @Override // com.daaw.q09
            /* renamed from: a */
            public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
                return p09.m13771a(this, uri, map);
            }

            @Override // com.daaw.q09
            public final j09[] zza() {
                int i = n64.f19510K;
                return new j09[]{new ca2(0), new n82(0)};
            }
        }), null);
    }

    @Override // com.daaw.qz6
    /* renamed from: D */
    public final void mo11898D(p46 p46Var, pa6 pa6Var, boolean z, int i) {
        this.f19512B += i;
    }

    @Override // com.daaw.p24
    /* renamed from: E */
    public final long mo13751E() {
        if (m15491m0()) {
            return 0L;
        }
        return this.f19512B;
    }

    @Override // com.daaw.p24
    /* renamed from: F */
    public final long mo13750F() {
        if (m15491m0()) {
            return this.f19519I.m5522o();
        }
        synchronized (this.f19517G) {
            while (!this.f19518H.isEmpty()) {
                long j = this.f19514D;
                Map zze = ((iu6) this.f19518H.remove(0)).zze();
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
                this.f19514D = j + j2;
            }
        }
        return this.f19514D;
    }

    @Override // com.daaw.p24
    /* renamed from: G */
    public final void mo13749G(Uri[] uriArr, String str) {
        mo13748H(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.daaw.p24
    /* renamed from: H */
    public final void mo13748H(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        rr8 fs8Var;
        if (this.f19527x == null) {
            return;
        }
        this.f19528y = byteBuffer;
        this.f19529z = z;
        int length = uriArr.length;
        if (length == 1) {
            fs8Var = m15494j0(uriArr[0]);
        } else {
            rr8[] rr8VarArr = new rr8[length];
            for (int i = 0; i < uriArr.length; i++) {
                rr8VarArr[i] = m15494j0(uriArr[i]);
            }
            fs8Var = new fs8(false, false, rr8VarArr);
        }
        this.f19527x.m21846c(fs8Var);
        this.f19527x.m21836m();
        p24.f22539q.incrementAndGet();
    }

    @Override // com.daaw.p24
    /* renamed from: I */
    public final void mo13747I() {
        ga8 ga8Var = this.f19527x;
        if (ga8Var != null) {
            ga8Var.m21847b(this);
            this.f19527x.m21835n();
            this.f19527x = null;
            p24.f22539q.decrementAndGet();
        }
    }

    @Override // com.daaw.p24
    /* renamed from: J */
    public final void mo13746J(long j) {
        ga8 ga8Var = this.f19527x;
        ga8Var.mo8696a(ga8Var.zzf(), j);
    }

    @Override // com.daaw.p24
    /* renamed from: K */
    public final void mo13745K(int i) {
        this.f19522s.m7402e(i);
    }

    @Override // com.daaw.p24
    /* renamed from: L */
    public final void mo13744L(int i) {
        this.f19522s.m7401f(i);
    }

    @Override // com.daaw.p24
    /* renamed from: M */
    public final void mo13743M(o24 o24Var) {
        this.f19511A = o24Var;
    }

    @Override // com.daaw.p24
    /* renamed from: N */
    public final void mo13742N(int i) {
        this.f19522s.m7400g(i);
    }

    @Override // com.daaw.p24
    /* renamed from: O */
    public final void mo13741O(int i) {
        this.f19522s.m7399h(i);
    }

    @Override // com.daaw.p24
    /* renamed from: P */
    public final void mo13740P(boolean z) {
        this.f19527x.m21845d(z);
    }

    @Override // com.daaw.p24
    /* renamed from: Q */
    public final void mo13739Q(boolean z) {
        if (this.f19527x == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.f19527x.m21841h();
            if (i >= 2) {
                return;
            }
            rv8 rv8Var = this.f19523t;
            dv8 m22238c = rv8Var.m10873k().m22238c();
            m22238c.m23873o(i, !z);
            rv8Var.m10868p(m22238c);
            i++;
        }
    }

    @Override // com.daaw.p24
    /* renamed from: R */
    public final void mo13738R(int i) {
        for (WeakReference weakReference : this.f19520J) {
            u54 u54Var = (u54) weakReference.get();
            if (u54Var != null) {
                u54Var.m8565p(i);
            }
        }
    }

    @Override // com.daaw.p24
    /* renamed from: S */
    public final void mo13737S(Surface surface, boolean z) {
        ga8 ga8Var = this.f19527x;
        if (ga8Var == null) {
            return;
        }
        ga8Var.m21844e(surface);
    }

    @Override // com.daaw.p24
    /* renamed from: T */
    public final void mo13736T(float f, boolean z) {
        ga8 ga8Var = this.f19527x;
        if (ga8Var == null) {
            return;
        }
        ga8Var.m21843f(f);
    }

    @Override // com.daaw.p24
    /* renamed from: U */
    public final void mo13735U() {
        this.f19527x.m21842g();
    }

    @Override // com.daaw.p24
    /* renamed from: V */
    public final boolean mo13734V() {
        return this.f19527x != null;
    }

    @Override // com.daaw.p24
    /* renamed from: W */
    public final int mo13733W() {
        return this.f19513C;
    }

    @Override // com.daaw.p24
    /* renamed from: Y */
    public final int mo13731Y() {
        return this.f19527x.zzh();
    }

    @Override // com.daaw.qz6
    /* renamed from: a */
    public final void mo11897a(p46 p46Var, pa6 pa6Var, boolean z) {
    }

    @Override // com.daaw.p24
    /* renamed from: a0 */
    public final long mo13729a0() {
        return this.f19527x.m21840i();
    }

    @Override // com.daaw.ob8
    /* renamed from: b */
    public final /* synthetic */ void mo14403b(ib8 ib8Var, int i, long j, long j2) {
    }

    @Override // com.daaw.p24
    /* renamed from: b0 */
    public final long mo13728b0() {
        return this.f19512B;
    }

    @Override // com.daaw.p24
    /* renamed from: c0 */
    public final long mo13727c0() {
        if (m15491m0() && this.f19519I.m5518s()) {
            return Math.min(this.f19512B, this.f19519I.m5523n());
        }
        return 0L;
    }

    @Override // com.daaw.p24
    /* renamed from: d0 */
    public final long mo13726d0() {
        return this.f19527x.zzl();
    }

    @Override // com.daaw.ob8
    /* renamed from: e */
    public final void mo14402e(ib8 ib8Var, f92 f92Var, tm7 tm7Var) {
        y24 y24Var = (y24) this.f19525v.get();
        if (!((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() || y24Var == null || f92Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(f92Var.f9282s));
        hashMap.put("bitRate", String.valueOf(f92Var.f9271h));
        int i = f92Var.f9280q;
        int i2 = f92Var.f9281r;
        hashMap.put("resolution", i + "x" + i2);
        hashMap.put("videoMime", f92Var.f9274k);
        hashMap.put("videoSampleMime", f92Var.f9275l);
        hashMap.put("videoCodec", f92Var.f9272i);
        y24Var.mo6434T("onMetadataEvent", hashMap);
    }

    @Override // com.daaw.p24
    /* renamed from: e0 */
    public final long mo13725e0() {
        return this.f19527x.m21839j();
    }

    @Override // com.daaw.qz6
    /* renamed from: f */
    public final void mo11896f(p46 p46Var, pa6 pa6Var, boolean z) {
    }

    /* renamed from: f0 */
    public final /* synthetic */ p46 m15498f0(String str, boolean z) {
        n64 n64Var = true != z ? null : this;
        x24 x24Var = this.f19524u;
        return new q64(str, n64Var, x24Var.f32025d, x24Var.f32027f, x24Var.f32037p, x24Var.f32038q);
    }

    public final void finalize() {
        p24.f22538p.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* renamed from: g0 */
    public final /* synthetic */ p46 m15497g0(String str, boolean z) {
        n64 n64Var = true != z ? null : this;
        x24 x24Var = this.f19524u;
        u54 u54Var = new u54(str, n64Var, x24Var.f32025d, x24Var.f32027f, x24Var.f32030i);
        this.f19520J.add(new WeakReference(u54Var));
        return u54Var;
    }

    /* renamed from: h0 */
    public final /* synthetic */ p46 m15496h0(String str, boolean z) {
        yd6 yd6Var = new yd6();
        yd6Var.m3842e(str);
        yd6Var.m3843d(true != z ? null : this);
        yd6Var.m3845b(this.f19524u.f32025d);
        yd6Var.m3844c(this.f19524u.f32027f);
        yd6Var.m3846a(true);
        return yd6Var.zza();
    }

    /* renamed from: i0 */
    public final /* synthetic */ p46 m15495i0(m36 m36Var) {
        return new x54(this.f19521r, m36Var.zza(), this.f19515E, this.f19516F, this, new a64(this), null);
    }

    @Override // com.daaw.ob8
    /* renamed from: j */
    public final /* synthetic */ void mo14401j(ib8 ib8Var, ql7 ql7Var) {
    }

    /* renamed from: j0 */
    public final rr8 m15494j0(Uri uri) {
        ee2 ee2Var = new ee2();
        ee2Var.m23539b(uri);
        f53 m23538c = ee2Var.m23538c();
        bt8 bt8Var = this.f19526w;
        bt8Var.m25832a(this.f19524u.f32028g);
        return bt8Var.m25831b(m23538c);
    }

    @Override // com.daaw.ob8
    /* renamed from: k */
    public final /* synthetic */ void mo14400k(ty3 ty3Var, lb8 lb8Var) {
    }

    /* renamed from: k0 */
    public final /* synthetic */ void m15493k0(boolean z, long j) {
        o24 o24Var = this.f19511A;
        if (o24Var != null) {
            o24Var.mo9568e(z, j);
        }
    }

    @Override // com.daaw.qz6
    /* renamed from: l */
    public final void mo11895l(p46 p46Var, pa6 pa6Var, boolean z) {
        if (p46Var instanceof iu6) {
            synchronized (this.f19517G) {
                this.f19518H.add((iu6) p46Var);
            }
        } else if (p46Var instanceof x54) {
            this.f19519I = (x54) p46Var;
            final y24 y24Var = (y24) this.f19525v.get();
            if (((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() && y24Var != null && this.f19519I.m5520q()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f19519I.m5518s()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f19519I.m5519r()));
                zzs.zza.post(new Runnable() { // from class: com.daaw.h64
                    @Override // java.lang.Runnable
                    public final void run() {
                        y24 y24Var2 = y24.this;
                        Map map = hashMap;
                        int i = n64.f19510K;
                        y24Var2.mo6434T("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    /* renamed from: l0 */
    public final /* synthetic */ i98[] m15492l0(Handler handler, wy8 wy8Var, fj8 fj8Var, du8 du8Var, kq8 kq8Var) {
        Context context = this.f19521r;
        jp8 jp8Var = jp8.f15322a;
        bi8 bi8Var = bi8.f4841c;
        hi8[] hi8VarArr = new hi8[0];
        uk8 uk8Var = new uk8();
        if (bi8Var == null) {
            Objects.requireNonNull(bi8Var, "Both parameters are null");
        }
        uk8Var.m8076b(bi8Var);
        uk8Var.m8075c(hi8VarArr);
        sl8 m8074d = uk8Var.m8074d();
        ap8 ap8Var = ap8.f3426a;
        return new i98[]{new em8(context, ap8Var, jp8Var, false, handler, fj8Var, m8074d), new sx8(this.f19521r, ap8Var, jp8Var, 0L, false, handler, wy8Var, -1, 30.0f)};
    }

    /* renamed from: m0 */
    public final boolean m15491m0() {
        return this.f19519I != null && this.f19519I.m5517t();
    }

    @Override // com.daaw.ob8
    /* renamed from: n */
    public final void mo14399n(ib8 ib8Var, Object obj, long j) {
        o24 o24Var = this.f19511A;
        if (o24Var != null) {
            o24Var.zzv();
        }
    }

    @Override // com.daaw.ob8
    /* renamed from: o */
    public final void mo14398o(ib8 ib8Var, f92 f92Var, tm7 tm7Var) {
        y24 y24Var = (y24) this.f19525v.get();
        if (!((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() || y24Var == null || f92Var == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", f92Var.f9274k);
        hashMap.put("audioSampleMime", f92Var.f9275l);
        hashMap.put("audioCodec", f92Var.f9272i);
        y24Var.mo6434T("onMetadataEvent", hashMap);
    }

    @Override // com.daaw.ob8
    /* renamed from: p */
    public final /* synthetic */ void mo14397p(ib8 ib8Var, nx3 nx3Var, nx3 nx3Var2, int i) {
    }

    @Override // com.daaw.ob8
    /* renamed from: q */
    public final void mo14396q(ib8 ib8Var, int i, long j) {
        this.f19513C += i;
    }

    @Override // com.daaw.ob8
    /* renamed from: r */
    public final void mo14395r(ib8 ib8Var, ll4 ll4Var) {
        o24 o24Var = this.f19511A;
        if (o24Var != null) {
            o24Var.mo9566g(ll4Var.f17522a, ll4Var.f17523b);
        }
    }

    @Override // com.daaw.ob8
    /* renamed from: s */
    public final void mo14394s(ib8 ib8Var, ar8 ar8Var, lr8 lr8Var, IOException iOException, boolean z) {
        o24 o24Var = this.f19511A;
        if (o24Var != null) {
            if (this.f19524u.f32033l) {
                o24Var.mo9569d("onLoadException", iOException);
            } else {
                o24Var.mo9567f("onLoadError", iOException);
            }
        }
    }

    @Override // com.daaw.ob8
    /* renamed from: u */
    public final void mo14393u(ib8 ib8Var, int i) {
        o24 o24Var = this.f19511A;
        if (o24Var != null) {
            o24Var.mo9570c(i);
        }
    }

    @Override // com.daaw.ob8
    /* renamed from: x */
    public final void mo14392x(ib8 ib8Var, jn3 jn3Var) {
        o24 o24Var = this.f19511A;
        if (o24Var != null) {
            o24Var.mo9567f("onPlayerError", jn3Var);
        }
    }

    @Override // com.daaw.ob8
    /* renamed from: y */
    public final /* synthetic */ void mo14391y(ib8 ib8Var, lr8 lr8Var) {
    }
}

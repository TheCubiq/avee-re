package com.daaw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class t34 extends e24 implements TextureView.SurfaceTextureListener, o24 {

    /* renamed from: A */
    public boolean f26960A;

    /* renamed from: B */
    public int f26961B;

    /* renamed from: C */
    public w24 f26962C;

    /* renamed from: D */
    public final boolean f26963D;

    /* renamed from: E */
    public boolean f26964E;

    /* renamed from: F */
    public boolean f26965F;

    /* renamed from: G */
    public int f26966G;

    /* renamed from: H */
    public int f26967H;

    /* renamed from: I */
    public float f26968I;

    /* renamed from: s */
    public final y24 f26969s;

    /* renamed from: t */
    public final z24 f26970t;

    /* renamed from: u */
    public final x24 f26971u;

    /* renamed from: v */
    public d24 f26972v;

    /* renamed from: w */
    public Surface f26973w;

    /* renamed from: x */
    public p24 f26974x;

    /* renamed from: y */
    public String f26975y;

    /* renamed from: z */
    public String[] f26976z;

    public t34(Context context, z24 z24Var, y24 y24Var, boolean z, boolean z2, x24 x24Var, Integer num) {
        super(context, num);
        this.f26961B = 1;
        this.f26969s = y24Var;
        this.f26970t = z24Var;
        this.f26963D = z;
        this.f26971u = x24Var;
        setSurfaceTextureListener(this);
        z24Var.m2964a(this);
    }

    /* renamed from: Q */
    public static String m9584Q(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    @Override // com.daaw.e24
    /* renamed from: A */
    public final void mo9600A(int i) {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            p24Var.mo13741O(i);
        }
    }

    /* renamed from: B */
    public final p24 m9599B() {
        return this.f26971u.f32034m ? new n64(this.f26969s.getContext(), this.f26971u, this.f26969s) : new l44(this.f26969s.getContext(), this.f26971u, this.f26969s);
    }

    /* renamed from: C */
    public final String m9598C() {
        return zzt.zzp().zzc(this.f26969s.getContext(), this.f26969s.zzp().f36993p);
    }

    /* renamed from: D */
    public final /* synthetic */ void m9597D(String str) {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.mo16288c("ExoPlayerAdapter error", str);
        }
    }

    /* renamed from: E */
    public final /* synthetic */ void m9596E() {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.zza();
        }
    }

    /* renamed from: F */
    public final /* synthetic */ void m9595F() {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.zzf();
        }
    }

    /* renamed from: G */
    public final /* synthetic */ void m9594G(boolean z, long j) {
        this.f26969s.mo4237m0(z, j);
    }

    /* renamed from: H */
    public final /* synthetic */ void m9593H(String str) {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.zzc("ExoPlayerAdapter exception", str);
        }
    }

    /* renamed from: I */
    public final /* synthetic */ void m9592I() {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.zzg();
        }
    }

    /* renamed from: J */
    public final /* synthetic */ void m9591J() {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.zzh();
        }
    }

    /* renamed from: K */
    public final /* synthetic */ void m9590K() {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.zzi();
        }
    }

    /* renamed from: L */
    public final /* synthetic */ void m9589L(int i, int i2) {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.mo16290a(i, i2);
        }
    }

    /* renamed from: M */
    public final /* synthetic */ void m9588M() {
        m9578W(this.f8053q.m22942a(), false);
    }

    /* renamed from: N */
    public final /* synthetic */ void m9587N(int i) {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: O */
    public final /* synthetic */ void m9586O() {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.zzd();
        }
    }

    /* renamed from: P */
    public final /* synthetic */ void m9585P() {
        d24 d24Var = this.f26972v;
        if (d24Var != null) {
            d24Var.zze();
        }
    }

    /* renamed from: R */
    public final void m9583R() {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            p24Var.mo13739Q(true);
        }
    }

    /* renamed from: S */
    public final void m9582S() {
        if (this.f26964E) {
            return;
        }
        this.f26964E = true;
        zzs.zza.post(new Runnable() { // from class: com.daaw.n34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.m9595F();
            }
        });
        zzn();
        this.f26970t.m2963b();
        if (this.f26965F) {
            mo9555r();
        }
    }

    /* renamed from: T */
    public final void m9581T(boolean z) {
        String concat;
        p24 p24Var = this.f26974x;
        if ((p24Var != null && !z) || this.f26975y == null || this.f26973w == null) {
            return;
        }
        if (z) {
            if (!m9571b0()) {
                concat = "No valid ExoPlayerAdapter exists when switch source.";
                k04.zzj(concat);
                return;
            }
            p24Var.mo13735U();
            m9579V();
        }
        if (this.f26975y.startsWith("cache:")) {
            j54 mo4244H = this.f26969s.mo4244H(this.f26975y);
            if (!(mo4244H instanceof s54)) {
                if (mo4244H instanceof p54) {
                    p54 p54Var = (p54) mo4244H;
                    String m9598C = m9598C();
                    ByteBuffer m13624x = p54Var.m13624x();
                    boolean m13623y = p54Var.m13623y();
                    String m13625v = p54Var.m13625v();
                    if (m13625v == null) {
                        concat = "Stream cache URL is null.";
                    } else {
                        p24 m9599B = m9599B();
                        this.f26974x = m9599B;
                        m9599B.mo13748H(new Uri[]{Uri.parse(m13625v)}, m9598C, m13624x, m13623y);
                    }
                } else {
                    concat = "Stream cache miss: ".concat(String.valueOf(this.f26975y));
                }
                k04.zzj(concat);
                return;
            }
            p24 m10695v = ((s54) mo4244H).m10695v();
            this.f26974x = m10695v;
            if (!m10695v.mo13734V()) {
                concat = "Precached video player has been released.";
                k04.zzj(concat);
                return;
            }
        } else {
            this.f26974x = m9599B();
            String m9598C2 = m9598C();
            Uri[] uriArr = new Uri[this.f26976z.length];
            int i = 0;
            while (true) {
                String[] strArr = this.f26976z;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.f26974x.mo13749G(uriArr, m9598C2);
        }
        this.f26974x.mo13743M(this);
        m9577X(this.f26973w, false);
        if (this.f26974x.mo13734V()) {
            int mo13731Y = this.f26974x.mo13731Y();
            this.f26961B = mo13731Y;
            if (mo13731Y == 3) {
                m9582S();
            }
        }
    }

    /* renamed from: U */
    public final void m9580U() {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            p24Var.mo13739Q(false);
        }
    }

    /* renamed from: V */
    public final void m9579V() {
        if (this.f26974x != null) {
            m9577X(null, true);
            p24 p24Var = this.f26974x;
            if (p24Var != null) {
                p24Var.mo13743M(null);
                this.f26974x.mo13747I();
                this.f26974x = null;
            }
            this.f26961B = 1;
            this.f26960A = false;
            this.f26964E = false;
            this.f26965F = false;
        }
    }

    /* renamed from: W */
    public final void m9578W(float f, boolean z) {
        p24 p24Var = this.f26974x;
        if (p24Var == null) {
            k04.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            p24Var.mo13736T(f, false);
        } catch (IOException e) {
            k04.zzk("", e);
        }
    }

    /* renamed from: X */
    public final void m9577X(Surface surface, boolean z) {
        p24 p24Var = this.f26974x;
        if (p24Var == null) {
            k04.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            p24Var.mo13737S(surface, z);
        } catch (IOException e) {
            k04.zzk("", e);
        }
    }

    /* renamed from: Y */
    public final void m9576Y() {
        m9575Z(this.f26966G, this.f26967H);
    }

    /* renamed from: Z */
    public final void m9575Z(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.f26968I != f) {
            this.f26968I = f;
            requestLayout();
        }
    }

    @Override // com.daaw.e24
    /* renamed from: a */
    public final void mo9574a(int i) {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            p24Var.mo13738R(i);
        }
    }

    /* renamed from: a0 */
    public final boolean m9573a0() {
        return m9571b0() && this.f26961B != 1;
    }

    @Override // com.daaw.e24
    /* renamed from: b */
    public final void mo9572b(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        boolean z = true;
        if (strArr == null) {
            this.f26976z = new String[]{str};
        } else {
            this.f26976z = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f26975y;
        z = (!this.f26971u.f32035n || str2 == null || str.equals(str2) || this.f26961B != 4) ? false : false;
        this.f26975y = str;
        m9581T(z);
    }

    /* renamed from: b0 */
    public final boolean m9571b0() {
        p24 p24Var = this.f26974x;
        return (p24Var == null || !p24Var.mo13734V() || this.f26960A) ? false : true;
    }

    @Override // com.daaw.o24
    /* renamed from: c */
    public final void mo9570c(int i) {
        if (this.f26961B != i) {
            this.f26961B = i;
            if (i == 3) {
                m9582S();
            } else if (i != 4) {
            } else {
                if (this.f26971u.f32022a) {
                    m9580U();
                }
                this.f26970t.m2960e();
                this.f8053q.m22940c();
                zzs.zza.post(new Runnable() { // from class: com.daaw.h34
                    @Override // java.lang.Runnable
                    public final void run() {
                        t34.this.m9596E();
                    }
                });
            }
        }
    }

    @Override // com.daaw.o24
    /* renamed from: d */
    public final void mo9569d(String str, Exception exc) {
        final String m9584Q = m9584Q("onLoadException", exc);
        k04.zzj("ExoPlayerAdapter exception: ".concat(m9584Q));
        zzt.zzo().m11903t(exc, "AdExoPlayerView.onException");
        zzs.zza.post(new Runnable() { // from class: com.daaw.i34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.m9593H(m9584Q);
            }
        });
    }

    @Override // com.daaw.o24
    /* renamed from: e */
    public final void mo9568e(final boolean z, final long j) {
        if (this.f26969s != null) {
            z04.f34309e.execute(new Runnable() { // from class: com.daaw.g34
                @Override // java.lang.Runnable
                public final void run() {
                    t34.this.m9594G(z, j);
                }
            });
        }
    }

    @Override // com.daaw.o24
    /* renamed from: f */
    public final void mo9567f(String str, Exception exc) {
        final String m9584Q = m9584Q(str, exc);
        k04.zzj("ExoPlayerAdapter error: ".concat(m9584Q));
        this.f26960A = true;
        if (this.f26971u.f32022a) {
            m9580U();
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.j34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.m9597D(m9584Q);
            }
        });
        zzt.zzo().m11903t(exc, "AdExoPlayerView.onError");
    }

    @Override // com.daaw.o24
    /* renamed from: g */
    public final void mo9566g(int i, int i2) {
        this.f26966G = i;
        this.f26967H = i2;
        m9576Y();
    }

    @Override // com.daaw.e24
    /* renamed from: h */
    public final int mo9565h() {
        if (m9573a0()) {
            return (int) this.f26974x.mo13726d0();
        }
        return 0;
    }

    @Override // com.daaw.e24
    /* renamed from: i */
    public final int mo9564i() {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            return p24Var.mo13733W();
        }
        return -1;
    }

    @Override // com.daaw.e24
    /* renamed from: j */
    public final int mo9563j() {
        if (m9573a0()) {
            return (int) this.f26974x.mo13725e0();
        }
        return 0;
    }

    @Override // com.daaw.e24
    /* renamed from: k */
    public final int mo9562k() {
        return this.f26967H;
    }

    @Override // com.daaw.e24
    /* renamed from: l */
    public final int mo9561l() {
        return this.f26966G;
    }

    @Override // com.daaw.e24
    /* renamed from: m */
    public final long mo9560m() {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            return p24Var.mo13727c0();
        }
        return -1L;
    }

    @Override // com.daaw.e24
    /* renamed from: n */
    public final long mo9559n() {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            return p24Var.mo13751E();
        }
        return -1L;
    }

    @Override // com.daaw.e24
    /* renamed from: o */
    public final long mo9558o() {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            return p24Var.mo13750F();
        }
        return -1L;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.f26968I;
        if (f != 0.0f && this.f26962C == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        w24 w24Var = this.f26962C;
        if (w24Var != null) {
            w24Var.m6578b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f26963D) {
            w24 w24Var = new w24(getContext());
            this.f26962C = w24Var;
            w24Var.m6577c(surfaceTexture, i, i2);
            this.f26962C.start();
            SurfaceTexture m6579a = this.f26962C.m6579a();
            if (m6579a != null) {
                surfaceTexture = m6579a;
            } else {
                this.f26962C.m6576d();
                this.f26962C = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f26973w = surface;
        if (this.f26974x == null) {
            m9581T(false);
        } else {
            m9577X(surface, true);
            if (!this.f26971u.f32022a) {
                m9583R();
            }
        }
        if (this.f26966G == 0 || this.f26967H == 0) {
            m9575Z(i, i2);
        } else {
            m9576Y();
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.o34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.m9591J();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo9556q();
        w24 w24Var = this.f26962C;
        if (w24Var != null) {
            w24Var.m6576d();
            this.f26962C = null;
        }
        if (this.f26974x != null) {
            m9580U();
            Surface surface = this.f26973w;
            if (surface != null) {
                surface.release();
            }
            this.f26973w = null;
            m9577X(null, true);
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.r34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.m9590K();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        w24 w24Var = this.f26962C;
        if (w24Var != null) {
            w24Var.m6578b(i, i2);
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.q34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.m9589L(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f26970t.m2959f(this);
        this.f8052p.m10750a(surfaceTexture, this.f26972v);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        zzs.zza.post(new Runnable() { // from class: com.daaw.p34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.m9587N(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.daaw.e24
    /* renamed from: p */
    public final String mo9557p() {
        return "ExoPlayer/3".concat(true != this.f26963D ? "" : " spherical");
    }

    @Override // com.daaw.e24
    /* renamed from: q */
    public final void mo9556q() {
        if (m9573a0()) {
            if (this.f26971u.f32022a) {
                m9580U();
            }
            this.f26974x.mo13740P(false);
            this.f26970t.m2960e();
            this.f8053q.m22940c();
            zzs.zza.post(new Runnable() { // from class: com.daaw.m34
                @Override // java.lang.Runnable
                public final void run() {
                    t34.this.m9586O();
                }
            });
        }
    }

    @Override // com.daaw.e24
    /* renamed from: r */
    public final void mo9555r() {
        if (!m9573a0()) {
            this.f26965F = true;
            return;
        }
        if (this.f26971u.f32022a) {
            m9583R();
        }
        this.f26974x.mo13740P(true);
        this.f26970t.m2962c();
        this.f8053q.m22941b();
        this.f8052p.m10749b();
        zzs.zza.post(new Runnable() { // from class: com.daaw.s34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.m9585P();
            }
        });
    }

    @Override // com.daaw.e24
    /* renamed from: s */
    public final void mo9554s(int i) {
        if (m9573a0()) {
            this.f26974x.mo13746J(i);
        }
    }

    @Override // com.daaw.e24
    /* renamed from: t */
    public final void mo9553t(d24 d24Var) {
        this.f26972v = d24Var;
    }

    @Override // com.daaw.e24
    /* renamed from: u */
    public final void mo9552u(String str) {
        if (str != null) {
            mo9572b(str, null);
        }
    }

    @Override // com.daaw.e24
    /* renamed from: v */
    public final void mo9551v() {
        if (m9571b0()) {
            this.f26974x.mo13735U();
            m9579V();
        }
        this.f26970t.m2960e();
        this.f8053q.m22940c();
        this.f26970t.m2961d();
    }

    @Override // com.daaw.e24
    /* renamed from: w */
    public final void mo9550w(float f, float f2) {
        w24 w24Var = this.f26962C;
        if (w24Var != null) {
            w24Var.m6575e(f, f2);
        }
    }

    @Override // com.daaw.e24
    /* renamed from: x */
    public final void mo9549x(int i) {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            p24Var.mo13745K(i);
        }
    }

    @Override // com.daaw.e24
    /* renamed from: y */
    public final void mo9548y(int i) {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            p24Var.mo13744L(i);
        }
    }

    @Override // com.daaw.e24
    /* renamed from: z */
    public final void mo9547z(int i) {
        p24 p24Var = this.f26974x;
        if (p24Var != null) {
            p24Var.mo13742N(i);
        }
    }

    @Override // com.daaw.e24, com.daaw.e34
    public final void zzn() {
        if (this.f26971u.f32034m) {
            zzs.zza.post(new Runnable() { // from class: com.daaw.l34
                @Override // java.lang.Runnable
                public final void run() {
                    t34.this.m9588M();
                }
            });
        } else {
            m9578W(this.f8053q.m22942a(), false);
        }
    }

    @Override // com.daaw.o24
    public final void zzv() {
        zzs.zza.post(new Runnable() { // from class: com.daaw.k34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.m9592I();
            }
        });
    }
}

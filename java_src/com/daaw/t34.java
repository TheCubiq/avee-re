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
    public boolean A;
    public int B;
    public w24 C;
    public final boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final y24 s;
    public final z24 t;
    public final x24 u;
    public d24 v;
    public Surface w;
    public p24 x;
    public String y;
    public String[] z;

    public t34(Context context, z24 z24Var, y24 y24Var, boolean z, boolean z2, x24 x24Var, Integer num) {
        super(context, num);
        this.B = 1;
        this.s = y24Var;
        this.t = z24Var;
        this.D = z;
        this.u = x24Var;
        setSurfaceTextureListener(this);
        z24Var.a(this);
    }

    public static String Q(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    @Override // com.daaw.e24
    public final void A(int i) {
        p24 p24Var = this.x;
        if (p24Var != null) {
            p24Var.O(i);
        }
    }

    public final p24 B() {
        return this.u.m ? new n64(this.s.getContext(), this.u, this.s) : new l44(this.s.getContext(), this.u, this.s);
    }

    public final String C() {
        return zzt.zzp().zzc(this.s.getContext(), this.s.zzp().p);
    }

    public final /* synthetic */ void D(String str) {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.c("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void E() {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.zza();
        }
    }

    public final /* synthetic */ void F() {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.zzf();
        }
    }

    public final /* synthetic */ void G(boolean z, long j) {
        this.s.m0(z, j);
    }

    public final /* synthetic */ void H(String str) {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void I() {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.zzg();
        }
    }

    public final /* synthetic */ void J() {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.zzh();
        }
    }

    public final /* synthetic */ void K() {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.zzi();
        }
    }

    public final /* synthetic */ void L(int i, int i2) {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.a(i, i2);
        }
    }

    public final /* synthetic */ void M() {
        W(this.q.a(), false);
    }

    public final /* synthetic */ void N(int i) {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.onWindowVisibilityChanged(i);
        }
    }

    public final /* synthetic */ void O() {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.zzd();
        }
    }

    public final /* synthetic */ void P() {
        d24 d24Var = this.v;
        if (d24Var != null) {
            d24Var.zze();
        }
    }

    public final void R() {
        p24 p24Var = this.x;
        if (p24Var != null) {
            p24Var.Q(true);
        }
    }

    public final void S() {
        if (this.E) {
            return;
        }
        this.E = true;
        zzs.zza.post(new Runnable() { // from class: com.daaw.n34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.F();
            }
        });
        zzn();
        this.t.b();
        if (this.F) {
            r();
        }
    }

    public final void T(boolean z) {
        String concat;
        p24 p24Var = this.x;
        if ((p24Var != null && !z) || this.y == null || this.w == null) {
            return;
        }
        if (z) {
            if (!b0()) {
                concat = "No valid ExoPlayerAdapter exists when switch source.";
                k04.zzj(concat);
                return;
            }
            p24Var.U();
            V();
        }
        if (this.y.startsWith("cache:")) {
            j54 H = this.s.H(this.y);
            if (!(H instanceof s54)) {
                if (H instanceof p54) {
                    p54 p54Var = (p54) H;
                    String C = C();
                    ByteBuffer x = p54Var.x();
                    boolean y = p54Var.y();
                    String v = p54Var.v();
                    if (v == null) {
                        concat = "Stream cache URL is null.";
                    } else {
                        p24 B = B();
                        this.x = B;
                        B.H(new Uri[]{Uri.parse(v)}, C, x, y);
                    }
                } else {
                    concat = "Stream cache miss: ".concat(String.valueOf(this.y));
                }
                k04.zzj(concat);
                return;
            }
            p24 v2 = ((s54) H).v();
            this.x = v2;
            if (!v2.V()) {
                concat = "Precached video player has been released.";
                k04.zzj(concat);
                return;
            }
        } else {
            this.x = B();
            String C2 = C();
            Uri[] uriArr = new Uri[this.z.length];
            int i = 0;
            while (true) {
                String[] strArr = this.z;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.x.G(uriArr, C2);
        }
        this.x.M(this);
        X(this.w, false);
        if (this.x.V()) {
            int Y = this.x.Y();
            this.B = Y;
            if (Y == 3) {
                S();
            }
        }
    }

    public final void U() {
        p24 p24Var = this.x;
        if (p24Var != null) {
            p24Var.Q(false);
        }
    }

    public final void V() {
        if (this.x != null) {
            X(null, true);
            p24 p24Var = this.x;
            if (p24Var != null) {
                p24Var.M(null);
                this.x.I();
                this.x = null;
            }
            this.B = 1;
            this.A = false;
            this.E = false;
            this.F = false;
        }
    }

    public final void W(float f, boolean z) {
        p24 p24Var = this.x;
        if (p24Var == null) {
            k04.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            p24Var.T(f, false);
        } catch (IOException e) {
            k04.zzk("", e);
        }
    }

    public final void X(Surface surface, boolean z) {
        p24 p24Var = this.x;
        if (p24Var == null) {
            k04.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            p24Var.S(surface, z);
        } catch (IOException e) {
            k04.zzk("", e);
        }
    }

    public final void Y() {
        Z(this.G, this.H);
    }

    public final void Z(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.I != f) {
            this.I = f;
            requestLayout();
        }
    }

    @Override // com.daaw.e24
    public final void a(int i) {
        p24 p24Var = this.x;
        if (p24Var != null) {
            p24Var.R(i);
        }
    }

    public final boolean a0() {
        return b0() && this.B != 1;
    }

    @Override // com.daaw.e24
    public final void b(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        boolean z = true;
        if (strArr == null) {
            this.z = new String[]{str};
        } else {
            this.z = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.y;
        z = (!this.u.n || str2 == null || str.equals(str2) || this.B != 4) ? false : false;
        this.y = str;
        T(z);
    }

    public final boolean b0() {
        p24 p24Var = this.x;
        return (p24Var == null || !p24Var.V() || this.A) ? false : true;
    }

    @Override // com.daaw.o24
    public final void c(int i) {
        if (this.B != i) {
            this.B = i;
            if (i == 3) {
                S();
            } else if (i != 4) {
            } else {
                if (this.u.a) {
                    U();
                }
                this.t.e();
                this.q.c();
                zzs.zza.post(new Runnable() { // from class: com.daaw.h34
                    @Override // java.lang.Runnable
                    public final void run() {
                        t34.this.E();
                    }
                });
            }
        }
    }

    @Override // com.daaw.o24
    public final void d(String str, Exception exc) {
        final String Q = Q("onLoadException", exc);
        k04.zzj("ExoPlayerAdapter exception: ".concat(Q));
        zzt.zzo().t(exc, "AdExoPlayerView.onException");
        zzs.zza.post(new Runnable() { // from class: com.daaw.i34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.H(Q);
            }
        });
    }

    @Override // com.daaw.o24
    public final void e(final boolean z, final long j) {
        if (this.s != null) {
            z04.e.execute(new Runnable() { // from class: com.daaw.g34
                @Override // java.lang.Runnable
                public final void run() {
                    t34.this.G(z, j);
                }
            });
        }
    }

    @Override // com.daaw.o24
    public final void f(String str, Exception exc) {
        final String Q = Q(str, exc);
        k04.zzj("ExoPlayerAdapter error: ".concat(Q));
        this.A = true;
        if (this.u.a) {
            U();
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.j34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.D(Q);
            }
        });
        zzt.zzo().t(exc, "AdExoPlayerView.onError");
    }

    @Override // com.daaw.o24
    public final void g(int i, int i2) {
        this.G = i;
        this.H = i2;
        Y();
    }

    @Override // com.daaw.e24
    public final int h() {
        if (a0()) {
            return (int) this.x.d0();
        }
        return 0;
    }

    @Override // com.daaw.e24
    public final int i() {
        p24 p24Var = this.x;
        if (p24Var != null) {
            return p24Var.W();
        }
        return -1;
    }

    @Override // com.daaw.e24
    public final int j() {
        if (a0()) {
            return (int) this.x.e0();
        }
        return 0;
    }

    @Override // com.daaw.e24
    public final int k() {
        return this.H;
    }

    @Override // com.daaw.e24
    public final int l() {
        return this.G;
    }

    @Override // com.daaw.e24
    public final long m() {
        p24 p24Var = this.x;
        if (p24Var != null) {
            return p24Var.c0();
        }
        return -1L;
    }

    @Override // com.daaw.e24
    public final long n() {
        p24 p24Var = this.x;
        if (p24Var != null) {
            return p24Var.E();
        }
        return -1L;
    }

    @Override // com.daaw.e24
    public final long o() {
        p24 p24Var = this.x;
        if (p24Var != null) {
            return p24Var.F();
        }
        return -1L;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.I;
        if (f != 0.0f && this.C == null) {
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
        w24 w24Var = this.C;
        if (w24Var != null) {
            w24Var.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.D) {
            w24 w24Var = new w24(getContext());
            this.C = w24Var;
            w24Var.c(surfaceTexture, i, i2);
            this.C.start();
            SurfaceTexture a = this.C.a();
            if (a != null) {
                surfaceTexture = a;
            } else {
                this.C.d();
                this.C = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.w = surface;
        if (this.x == null) {
            T(false);
        } else {
            X(surface, true);
            if (!this.u.a) {
                R();
            }
        }
        if (this.G == 0 || this.H == 0) {
            Z(i, i2);
        } else {
            Y();
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.o34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.J();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        q();
        w24 w24Var = this.C;
        if (w24Var != null) {
            w24Var.d();
            this.C = null;
        }
        if (this.x != null) {
            U();
            Surface surface = this.w;
            if (surface != null) {
                surface.release();
            }
            this.w = null;
            X(null, true);
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.r34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.K();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        w24 w24Var = this.C;
        if (w24Var != null) {
            w24Var.b(i, i2);
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.q34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.L(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.t.f(this);
        this.p.a(surfaceTexture, this.v);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        zzs.zza.post(new Runnable() { // from class: com.daaw.p34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.N(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.daaw.e24
    public final String p() {
        return "ExoPlayer/3".concat(true != this.D ? "" : " spherical");
    }

    @Override // com.daaw.e24
    public final void q() {
        if (a0()) {
            if (this.u.a) {
                U();
            }
            this.x.P(false);
            this.t.e();
            this.q.c();
            zzs.zza.post(new Runnable() { // from class: com.daaw.m34
                @Override // java.lang.Runnable
                public final void run() {
                    t34.this.O();
                }
            });
        }
    }

    @Override // com.daaw.e24
    public final void r() {
        if (!a0()) {
            this.F = true;
            return;
        }
        if (this.u.a) {
            R();
        }
        this.x.P(true);
        this.t.c();
        this.q.b();
        this.p.b();
        zzs.zza.post(new Runnable() { // from class: com.daaw.s34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.P();
            }
        });
    }

    @Override // com.daaw.e24
    public final void s(int i) {
        if (a0()) {
            this.x.J(i);
        }
    }

    @Override // com.daaw.e24
    public final void t(d24 d24Var) {
        this.v = d24Var;
    }

    @Override // com.daaw.e24
    public final void u(String str) {
        if (str != null) {
            b(str, null);
        }
    }

    @Override // com.daaw.e24
    public final void v() {
        if (b0()) {
            this.x.U();
            V();
        }
        this.t.e();
        this.q.c();
        this.t.d();
    }

    @Override // com.daaw.e24
    public final void w(float f, float f2) {
        w24 w24Var = this.C;
        if (w24Var != null) {
            w24Var.e(f, f2);
        }
    }

    @Override // com.daaw.e24
    public final void x(int i) {
        p24 p24Var = this.x;
        if (p24Var != null) {
            p24Var.K(i);
        }
    }

    @Override // com.daaw.e24
    public final void y(int i) {
        p24 p24Var = this.x;
        if (p24Var != null) {
            p24Var.L(i);
        }
    }

    @Override // com.daaw.e24
    public final void z(int i) {
        p24 p24Var = this.x;
        if (p24Var != null) {
            p24Var.N(i);
        }
    }

    @Override // com.daaw.e24, com.daaw.e34
    public final void zzn() {
        if (this.u.m) {
            zzs.zza.post(new Runnable() { // from class: com.daaw.l34
                @Override // java.lang.Runnable
                public final void run() {
                    t34.this.M();
                }
            });
        } else {
            W(this.q.a(), false);
        }
    }

    @Override // com.daaw.o24
    public final void zzv() {
        zzs.zza.post(new Runnable() { // from class: com.daaw.k34
            @Override // java.lang.Runnable
            public final void run() {
                t34.this.I();
            }
        });
    }
}

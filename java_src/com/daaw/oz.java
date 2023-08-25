package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.daaw.af1;
import com.daaw.ap;
import com.daaw.avee.comp.playback.a;
import com.daaw.avee.comp.playback.b;
import com.daaw.avee.comp.playback.e;
import com.daaw.bx0;
import com.daaw.c00;
import com.daaw.fd1;
import com.daaw.h7;
import com.daaw.jw1;
import com.daaw.mb0;
import com.daaw.mp;
import com.daaw.pw1;
import com.daaw.qq;
import com.daaw.tb0;
import com.daaw.yr;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.a;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class oz implements com.daaw.avee.comp.playback.e, b.d, SurfaceHolder.Callback {
    public e.b B;
    public h7 C;
    public g7 D;
    public String G;
    public Context q;
    public wd0 u;
    public final Object p = new Object();
    public d[] r = new d[2];
    public int s = 0;
    public int t = 1;
    public float v = 1.0f;
    public boolean w = false;
    public WeakReference<SurfaceHolder> x = new WeakReference<>(null);
    public long y = 0;
    public volatile wz z = null;
    public List<Object> A = new LinkedList();
    public mz E = new mz(this);
    public Handler F = new Handler();
    public pz H = new pz();
    public ne0 I = new a();
    public long J = 0;

    /* loaded from: classes.dex */
    public class a implements ne0 {
        public boolean a = false;

        public a() {
        }

        @Override // com.daaw.ne0
        public void a(int i) {
            if (oz.this.E != null) {
                oz.this.E.h(i);
            }
        }

        @Override // com.daaw.ne0
        public void b() {
            oz.this.B.b();
            wz wzVar = oz.this.z;
            if (wzVar != null) {
                wzVar.c();
            }
        }

        @Override // com.daaw.ne0
        public void c(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4, long j2) {
            if (this.a) {
                oz.this.H.a = this.a;
                oz.this.H.b = byteBuffer;
                oz.this.H.c = j;
                oz.this.H.d = i;
                oz.this.H.e = i2;
                oz.this.H.f = i3;
                oz.this.H.g = i4;
                oz.this.H.h = j2;
                oz.this.B.k(oz.this.H);
                oz.this.H.b = null;
            }
        }

        @Override // com.daaw.ne0
        public boolean d(int i) {
            d O = oz.this.O();
            return O != null && O.A == i;
        }

        @Override // com.daaw.ne0
        public void e(boolean z) {
            this.a = z;
        }
    }

    /* loaded from: classes.dex */
    public class b implements h7.c {
        public b() {
        }

        @Override // com.daaw.h7.c
        public void a(g7 g7Var) {
            if (!g7Var.equals(oz.this.D)) {
                oz.this.D = g7Var;
                oz.this.P();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements pw1.a {
        public c() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            oz.this.J();
        }
    }

    /* loaded from: classes.dex */
    public class d implements bx0.a, xp0, fd1.c, pk1 {
        public int A;
        public Context B;
        public com.google.android.exoplayer2.trackselection.b q;
        public wd0 s;
        public bp0 t;
        public fd1 y;
        public final lq p = new lq();
        public int u = 0;
        public float v = 1.0f;
        public float w = 0.0f;
        public float x = 0.0f;
        public float z = 0.0f;
        public mp.a r = l(true);

        public d(Context context, int i) {
            this.B = context;
            this.A = i;
        }

        @Override // com.daaw.bx0.a
        public void A(qz qzVar) {
            String message = qzVar.getMessage();
            if (message == null) {
                message = "";
            }
            String replace = message.replace("java.io.IOException:", "").replace("java.lang.IllegalStateException", "");
            if (replace.length() < 5) {
                replace = "Error " + replace;
            }
            oz.this.B.a(false, replace);
        }

        public final void B() {
            fd1 fd1Var = this.y;
            if (fd1Var != null) {
                fd1Var.a();
                this.y = null;
            }
            this.q = null;
        }

        public void C(long j) {
            fd1 fd1Var = this.y;
            if (fd1Var != null) {
                fd1Var.f(j);
            }
        }

        public void D(float f) {
            this.w = f;
            L();
        }

        public boolean E(float f) {
            boolean z;
            float f2 = this.w + f;
            this.w = f2;
            boolean z2 = true;
            if (f2 <= 0.0f) {
                this.w = 0.0f;
                z = true;
            } else {
                z = false;
            }
            if (this.w >= 1.0f) {
                this.w = 1.0f;
            } else {
                z2 = z;
            }
            L();
            return z2;
        }

        public void F(float f) {
            this.z = f;
        }

        public void G(int i) {
        }

        public boolean H(Surface surface) {
            if (this.y == null) {
                return false;
            }
            if (surface == null || !surface.isValid()) {
                this.y.I(null);
                this.y.J(null);
                return false;
            }
            this.y.I(this);
            this.y.J(surface);
            return true;
        }

        public void I(float f) {
            this.v = f;
            L();
        }

        public void J(float f) {
            this.x = f;
            L();
        }

        public void K() {
            fd1 fd1Var = this.y;
            if (fd1Var != null) {
                fd1Var.h(true);
            }
        }

        public void L() {
            Math.min(1.0f - this.x, 1.0f);
            float min = Math.min(this.x + 1.0f, 1.0f);
            fd1 fd1Var = this.y;
            if (fd1Var != null) {
                fd1Var.L(min * this.w * this.v);
            }
        }

        @Override // com.daaw.qs1
        public void b(int i, int i2, int i3, float f) {
            lz1.c("width: " + i + " height: " + i2);
            float f2 = (float) i;
            float f3 = (float) i2;
            if (i < i2) {
                f3 = f2;
                f2 = f3;
            }
            oz.this.B.i(i, i2, ((f3 > 0.0f) && ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) > 0)) ? (f2 * f) / f3 : 1.0f);
        }

        @Override // com.daaw.bx0.a
        public void c(zw0 zw0Var) {
        }

        @Override // com.daaw.bx0.a
        public void d(boolean z) {
        }

        @Override // com.daaw.bx0.a
        public void e(int i) {
        }

        @Override // com.daaw.qs1
        public void f() {
        }

        @Override // com.daaw.bx0.a
        public void g() {
        }

        @Override // com.daaw.pk1
        public void h(List<ln> list) {
        }

        public mp.a k(bn1<? super mp> bn1Var) {
            return new sq(this.B, bn1Var, n(bn1Var));
        }

        public final mp.a l(boolean z) {
            return k(z ? this.p : null);
        }

        @Override // com.daaw.bx0.a
        public void m(TrackGroupArray trackGroupArray, um1 um1Var) {
        }

        public tb0.b n(bn1<? super mp> bn1Var) {
            return new hr(oz.this.G, bn1Var);
        }

        public final bp0 o(Uri uri, int i, String str) {
            int F = sq1.F(uri, str);
            if (F != 0) {
                if (F != 1) {
                    if (F != 2) {
                        if (F == 3) {
                            return new c00.b(this.r).a(uri);
                        }
                        throw new IllegalStateException("Unsupported type: " + F);
                    }
                    return new mb0.b(this.r).b(new p10(new ob0(), t(uri))).a(uri);
                }
                return new af1.b(new yr.a(this.r), l(false)).b(new p10(new ye1(), t(uri))).a(uri);
            }
            return new ap.e(new qq.a(this.r), l(false)).b(new p10(new xo(), t(uri))).a(uri);
        }

        @Override // com.daaw.xp0
        public void p(Metadata metadata) {
        }

        public long q() {
            fd1 fd1Var = this.y;
            if (fd1Var != null) {
                long duration = fd1Var.getDuration();
                if (duration >= 0 && duration != -9223372036854775807L) {
                    return duration;
                }
                return 0L;
            }
            return 0L;
        }

        public final bp0 r(wd0 wd0Var) {
            Uri[] uriArr = {wd0Var.a()};
            String[] strArr = {""};
            int[] iArr = {wd0Var.b()};
            bp0[] bp0VarArr = new bp0[1];
            for (int i = 0; i < 1; i++) {
                bp0VarArr[i] = o(uriArr[i], iArr[i], strArr[i]);
            }
            return bp0VarArr[0];
        }

        @Override // com.daaw.bx0.a
        public void s(boolean z, int i) {
            int i2 = this.u;
            if (i2 == i) {
                return;
            }
            this.u = i;
            if (oz.this.E != null) {
                oz.this.E.i();
            }
            if (i2 != 3) {
                D(this.z);
                oz.this.B.a(true, null);
            }
            if ((i2 == 2 || i2 == 3) && i == 4) {
                u(this.y);
            }
        }

        public List<?> t(Uri uri) {
            return Collections.emptyList();
        }

        public void u(fd1 fd1Var) {
            if (fd1Var != null && oz.this.N() == fd1Var) {
                oz.this.B.o();
            }
        }

        @Override // com.daaw.bx0.a
        public void v(nl1 nl1Var, Object obj, int i) {
        }

        public void w() {
            fd1 fd1Var = this.y;
            if (fd1Var != null) {
                fd1Var.h(false);
            }
        }

        public void x(bp0 bp0Var) {
            if (this.y == null || bp0Var == null) {
                return;
            }
            oz.this.I.b();
            this.y.G(bp0Var);
        }

        public void y(wd0 wd0Var, float f, long j) {
            this.q = new DefaultTrackSelector(new a.C0095a(this.p));
            this.s = wd0Var;
            this.t = r(wd0Var);
            if (this.y == null) {
                if (Build.VERSION.SDK_INT < 21) {
                    kq.Z = true;
                }
                fd1 a = sz.a(new or0(oz.this.B, oz.this.I, this.A, this.B, 0), this.q, null);
                this.y = a;
                a.b(this);
                this.y.C(new cy(this.q));
                this.y.f(j);
            }
            D(f);
            F(f);
            oz ozVar = oz.this;
            ozVar.m(ozVar.B.n());
            this.y.f(j);
            if (this.s != null) {
                x(this.t);
            }
            D(f);
        }

        public void z() {
            bp0 bp0Var;
            fd1 fd1Var = this.y;
            if (fd1Var == null || fd1Var.k() != 1 || (bp0Var = this.t) == null) {
                return;
            }
            this.y.G(bp0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static List<Object> a = new LinkedList();
        public static jw1<Activity, CharSequence> b = new jw1().b(new a(), a);

        /* loaded from: classes.dex */
        public class a implements jw1.a<Activity, CharSequence> {
            @Override // com.daaw.jw1.a
            /* renamed from: a */
            public void c(Activity activity, CharSequence charSequence) {
            }
        }
    }

    public oz(Context context, String str, e.b bVar) {
        int i = 0;
        this.q = context;
        this.B = bVar;
        this.G = sq1.C(context, "ExoPlayerDemo");
        while (true) {
            d[] dVarArr = this.r;
            if (i >= dVarArr.length) {
                this.C = new h7(context, new b());
                ty.b.b(new c(), this.A);
                return;
            }
            dVarArr[i] = new d(context, i);
            i++;
        }
    }

    public void J() {
        synchronized (this.p) {
            wz wzVar = this.z;
            if (wzVar != null && SystemClock.elapsedRealtime() - this.y > 8000) {
                wzVar.e();
                this.z = null;
            }
        }
    }

    public void K() {
        int i = this.s;
        this.s = this.t;
        this.t = i;
    }

    public void L(int i) {
        if (i == 0) {
            lz1.c("trying to destroy currentPlayer");
            return;
        }
        int i2 = this.s;
        int i3 = this.t;
        if (i2 == i3) {
            return;
        }
        this.r[i3].B();
    }

    public d M() {
        return this.r[this.t];
    }

    public final fd1 N() {
        return O().y;
    }

    public d O() {
        return this.r[this.s];
    }

    public final void P() {
        d[] dVarArr;
        for (d dVar : this.r) {
            long j = 0;
            if (dVar.y != null) {
                j = dVar.y.o();
            }
            wd0 wd0Var = dVar.s;
            dVar.B();
            dVar.y(wd0Var, 1.0f, j);
        }
    }

    public void Q(boolean z, float f) {
        this.v = f;
        this.w = z;
        int i = 0;
        if (z) {
            d[] dVarArr = this.r;
            int length = dVarArr.length;
            while (i < length) {
                d dVar = dVarArr[i];
                if (dVar != null) {
                    dVar.I(0.0f);
                }
                i++;
            }
            return;
        }
        d[] dVarArr2 = this.r;
        int length2 = dVarArr2.length;
        while (i < length2) {
            d dVar2 = dVarArr2[i];
            if (dVar2 != null) {
                dVar2.I(f);
            }
            i++;
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void a() {
        mz mzVar = this.E;
        if (mzVar != null) {
            mzVar.j();
            this.E = null;
        }
        m(null);
        for (d dVar : this.r) {
            dVar.B();
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void b() {
        if (N() == null) {
            return;
        }
        O().w();
        this.B.a(false, null);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public void c(b.C0042b c0042b) {
        this.B.c(c0042b);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public b.c d(String str) {
        return this.B.d(str);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void e(boolean z) {
        Q(z, this.v);
        this.B.f(z);
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean f() {
        return this.w;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void g(long j) {
        this.J = j;
        O().D(1.0f);
        O().C((int) j);
    }

    @Override // com.daaw.avee.comp.playback.e
    public hx0 h() {
        if (N() == null) {
            return null;
        }
        return new hx0(O().q(), N() != null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public com.daaw.avee.comp.playback.a i(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
        if (aVar == null) {
            return null;
        }
        long j = gVar.g;
        if (j < 0) {
            j = k() * 1000;
        }
        aVar.f(j);
        return aVar;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void j(boolean z, boolean z2, float f, long j) {
        if (z) {
            if (this.s != this.t) {
                M().B();
            }
        } else if (s()) {
            K();
        }
        wd0 wd0Var = this.u;
        if (wd0Var == null || wd0Var.a() == null || this.u.a().equals(Uri.EMPTY)) {
            lz1.c("nextDataSource is null");
            if (z2) {
                start();
                return;
            } else {
                b();
                return;
            }
        }
        O().y(this.u, f, j);
        if (z2) {
            start();
        } else {
            O().w();
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public long k() {
        if (N() == null) {
            return 0L;
        }
        return N().o();
    }

    @Override // com.daaw.avee.comp.playback.e
    public long l() {
        return O().q();
    }

    @Override // com.daaw.avee.comp.playback.e
    public void m(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.x = new WeakReference<>(surfaceHolder);
            surfaceHolder.removeCallback(this);
            surfaceHolder.addCallback(this);
            surfaceCreated(surfaceHolder);
            return;
        }
        SurfaceHolder surfaceHolder2 = this.x.get();
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this);
            this.x = new WeakReference<>(null);
        }
        surfaceDestroyed(null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void n(b.c cVar) {
        mz mzVar = this.E;
        if (mzVar != null) {
            mzVar.m(cVar);
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void o() {
    }

    @Override // com.daaw.avee.comp.playback.e
    public b.C0042b p() {
        mz mzVar = this.E;
        if (mzVar != null) {
            return mzVar.d();
        }
        return null;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void q(e.b bVar) {
        this.B = bVar;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void r(wd0 wd0Var) {
        this.u = wd0Var;
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean s() {
        return N() != null && (N().k() == 2 || N().k() == 3);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void start() {
        d O = O();
        if (O.y == null) {
            return;
        }
        if (this.B.h()) {
            O.z();
            surfaceCreated(this.B.n());
            O().K();
        }
        this.B.a(false, null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void stop() {
        if (N() == null) {
            return;
        }
        N().h(false);
        this.B.a(false, null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            M().H(null);
            O().H(surfaceHolder.getSurface());
            return;
        }
        M().H(null);
        O().H(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.s != this.t) {
            M().H(null);
        }
        O().H(null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean t(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.s;
        } else {
            i2 = this.t;
            if (this.s == i2) {
                return true;
            }
        }
        d[] dVarArr = this.r;
        return dVarArr[i2] == null || dVarArr[i2].E(f);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void u(int i) {
        O().G(i);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void v() {
        if (this.s == this.t) {
            return;
        }
        L(1);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public boolean w(String str) {
        return this.B.e(str);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void x(float f) {
        d[] dVarArr;
        for (d dVar : this.r) {
            if (dVar != null) {
                dVar.J(f);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean y() {
        return (N() == null || N().k() == 4 || !N().c()) ? false : true;
    }
}

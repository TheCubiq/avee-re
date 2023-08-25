package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.daaw.C0653ap;
import com.daaw.C1508h7;
import com.daaw.C2746qq;
import com.daaw.C3738yr;
import com.daaw.InterfaceC2200mp;
import com.daaw.af1;
import com.daaw.avee.comp.playback.AbstractC0738b;
import com.daaw.avee.comp.playback.C0729a;
import com.daaw.avee.comp.playback.InterfaceC0771e;
import com.daaw.bx0;
import com.daaw.c00;
import com.daaw.fd1;
import com.daaw.jw1;
import com.daaw.mb0;
import com.daaw.pw1;
import com.daaw.tb0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AbstractC3968b;
import com.google.android.exoplayer2.trackselection.C3966a;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.daaw.oz */
/* loaded from: classes.dex */
public class SurfaceHolder$CallbackC2495oz implements InterfaceC0771e, AbstractC0738b.InterfaceC0742d, SurfaceHolder.Callback {

    /* renamed from: B */
    public InterfaceC0771e.InterfaceC0773b f22120B;

    /* renamed from: C */
    public C1508h7 f22121C;

    /* renamed from: D */
    public C1372g7 f22122D;

    /* renamed from: G */
    public String f22125G;

    /* renamed from: q */
    public Context f22130q;

    /* renamed from: u */
    public wd0 f22134u;

    /* renamed from: p */
    public final Object f22129p = new Object();

    /* renamed from: r */
    public C2499d[] f22131r = new C2499d[2];

    /* renamed from: s */
    public int f22132s = 0;

    /* renamed from: t */
    public int f22133t = 1;

    /* renamed from: v */
    public float f22135v = 1.0f;

    /* renamed from: w */
    public boolean f22136w = false;

    /* renamed from: x */
    public WeakReference<SurfaceHolder> f22137x = new WeakReference<>(null);

    /* renamed from: y */
    public long f22138y = 0;

    /* renamed from: z */
    public volatile C3485wz f22139z = null;

    /* renamed from: A */
    public List<Object> f22119A = new LinkedList();

    /* renamed from: E */
    public C2226mz f22123E = new C2226mz(this);

    /* renamed from: F */
    public Handler f22124F = new Handler();

    /* renamed from: H */
    public C2668pz f22126H = new C2668pz();

    /* renamed from: I */
    public ne0 f22127I = new C2496a();

    /* renamed from: J */
    public long f22128J = 0;

    /* renamed from: com.daaw.oz$a */
    /* loaded from: classes.dex */
    public class C2496a implements ne0 {

        /* renamed from: a */
        public boolean f22140a = false;

        public C2496a() {
        }

        @Override // com.daaw.ne0
        /* renamed from: a */
        public void mo13840a(int i) {
            if (SurfaceHolder$CallbackC2495oz.this.f22123E != null) {
                SurfaceHolder$CallbackC2495oz.this.f22123E.m26722h(i);
            }
        }

        @Override // com.daaw.ne0
        /* renamed from: b */
        public void mo13839b() {
            SurfaceHolder$CallbackC2495oz.this.f22120B.mo26656b();
            C3485wz c3485wz = SurfaceHolder$CallbackC2495oz.this.f22139z;
            if (c3485wz != null) {
                c3485wz.m5707c();
            }
        }

        @Override // com.daaw.ne0
        /* renamed from: c */
        public void mo13838c(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4, long j2) {
            if (this.f22140a) {
                SurfaceHolder$CallbackC2495oz.this.f22126H.f23539a = this.f22140a;
                SurfaceHolder$CallbackC2495oz.this.f22126H.f23540b = byteBuffer;
                SurfaceHolder$CallbackC2495oz.this.f22126H.f23541c = j;
                SurfaceHolder$CallbackC2495oz.this.f22126H.f23542d = i;
                SurfaceHolder$CallbackC2495oz.this.f22126H.f23543e = i2;
                SurfaceHolder$CallbackC2495oz.this.f22126H.f23544f = i3;
                SurfaceHolder$CallbackC2495oz.this.f22126H.f23545g = i4;
                SurfaceHolder$CallbackC2495oz.this.f22126H.f23546h = j2;
                SurfaceHolder$CallbackC2495oz.this.f22120B.mo26647k(SurfaceHolder$CallbackC2495oz.this.f22126H);
                SurfaceHolder$CallbackC2495oz.this.f22126H.f23540b = null;
            }
        }

        @Override // com.daaw.ne0
        /* renamed from: d */
        public boolean mo13837d(int i) {
            C2499d m13844O = SurfaceHolder$CallbackC2495oz.this.m13844O();
            return m13844O != null && m13844O.f22144A == i;
        }

        @Override // com.daaw.ne0
        /* renamed from: e */
        public void mo13836e(boolean z) {
            this.f22140a = z;
        }
    }

    /* renamed from: com.daaw.oz$b */
    /* loaded from: classes.dex */
    public class C2497b implements C1508h7.InterfaceC1511c {
        public C2497b() {
        }

        @Override // com.daaw.C1508h7.InterfaceC1511c
        /* renamed from: a */
        public void mo13835a(C1372g7 c1372g7) {
            if (!c1372g7.equals(SurfaceHolder$CallbackC2495oz.this.f22122D)) {
                SurfaceHolder$CallbackC2495oz.this.f22122D = c1372g7;
                SurfaceHolder$CallbackC2495oz.this.m13843P();
            }
        }
    }

    /* renamed from: com.daaw.oz$c */
    /* loaded from: classes.dex */
    public class C2498c implements pw1.InterfaceC2649a {
        public C2498c() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            SurfaceHolder$CallbackC2495oz.this.m13849J();
        }
    }

    /* renamed from: com.daaw.oz$d */
    /* loaded from: classes.dex */
    public class C2499d implements bx0.InterfaceC0893a, xp0, fd1.InterfaceC1272c, pk1 {

        /* renamed from: A */
        public int f22144A;

        /* renamed from: B */
        public Context f22145B;

        /* renamed from: q */
        public AbstractC3968b f22148q;

        /* renamed from: s */
        public wd0 f22150s;

        /* renamed from: t */
        public bp0 f22151t;

        /* renamed from: y */
        public fd1 f22156y;

        /* renamed from: p */
        public final C2106lq f22147p = new C2106lq();

        /* renamed from: u */
        public int f22152u = 0;

        /* renamed from: v */
        public float f22153v = 1.0f;

        /* renamed from: w */
        public float f22154w = 0.0f;

        /* renamed from: x */
        public float f22155x = 0.0f;

        /* renamed from: z */
        public float f22157z = 0.0f;

        /* renamed from: r */
        public InterfaceC2200mp.InterfaceC2201a f22149r = m13814l(true);

        public C2499d(Context context, int i) {
            this.f22145B = context;
            this.f22144A = i;
        }

        @Override // com.daaw.bx0.InterfaceC0893a
        /* renamed from: A */
        public void mo13834A(C2802qz c2802qz) {
            String message = c2802qz.getMessage();
            if (message == null) {
                message = "";
            }
            String replace = message.replace("java.io.IOException:", "").replace("java.lang.IllegalStateException", "");
            if (replace.length() < 5) {
                replace = "Error " + replace;
            }
            SurfaceHolder$CallbackC2495oz.this.f22120B.mo26657a(false, replace);
        }

        /* renamed from: B */
        public final void m13833B() {
            fd1 fd1Var = this.f22156y;
            if (fd1Var != null) {
                fd1Var.mo8694a();
                this.f22156y = null;
            }
            this.f22148q = null;
        }

        /* renamed from: C */
        public void m13832C(long j) {
            fd1 fd1Var = this.f22156y;
            if (fd1Var != null) {
                fd1Var.mo8689f(j);
            }
        }

        /* renamed from: D */
        public void m13831D(float f) {
            this.f22154w = f;
            m13823L();
        }

        /* renamed from: E */
        public boolean m13830E(float f) {
            boolean z;
            float f2 = this.f22154w + f;
            this.f22154w = f2;
            boolean z2 = true;
            if (f2 <= 0.0f) {
                this.f22154w = 0.0f;
                z = true;
            } else {
                z = false;
            }
            if (this.f22154w >= 1.0f) {
                this.f22154w = 1.0f;
            } else {
                z2 = z;
            }
            m13823L();
            return z2;
        }

        /* renamed from: F */
        public void m13829F(float f) {
            this.f22157z = f;
        }

        /* renamed from: G */
        public void m13828G(int i) {
        }

        /* renamed from: H */
        public boolean m13827H(Surface surface) {
            if (this.f22156y == null) {
                return false;
            }
            if (surface == null || !surface.isValid()) {
                this.f22156y.m22788I(null);
                this.f22156y.m22787J(null);
                return false;
            }
            this.f22156y.m22788I(this);
            this.f22156y.m22787J(surface);
            return true;
        }

        /* renamed from: I */
        public void m13826I(float f) {
            this.f22153v = f;
            m13823L();
        }

        /* renamed from: J */
        public void m13825J(float f) {
            this.f22155x = f;
            m13823L();
        }

        /* renamed from: K */
        public void m13824K() {
            fd1 fd1Var = this.f22156y;
            if (fd1Var != null) {
                fd1Var.mo8687h(true);
            }
        }

        /* renamed from: L */
        public void m13823L() {
            Math.min(1.0f - this.f22155x, 1.0f);
            float min = Math.min(this.f22155x + 1.0f, 1.0f);
            fd1 fd1Var = this.f22156y;
            if (fd1Var != null) {
                fd1Var.m22785L(min * this.f22154w * this.f22153v);
            }
        }

        @Override // com.daaw.qs1
        /* renamed from: b */
        public void mo12235b(int i, int i2, int i3, float f) {
            lz1.m16363c("width: " + i + " height: " + i2);
            float f2 = (float) i;
            float f3 = (float) i2;
            if (i < i2) {
                f3 = f2;
                f2 = f3;
            }
            SurfaceHolder$CallbackC2495oz.this.f22120B.mo26649i(i, i2, ((f3 > 0.0f) && ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) > 0)) ? (f2 * f) / f3 : 1.0f);
        }

        @Override // com.daaw.bx0.InterfaceC0893a
        /* renamed from: c */
        public void mo13821c(zw0 zw0Var) {
        }

        @Override // com.daaw.bx0.InterfaceC0893a
        /* renamed from: d */
        public void mo13820d(boolean z) {
        }

        @Override // com.daaw.bx0.InterfaceC0893a
        /* renamed from: e */
        public void mo13819e(int i) {
        }

        @Override // com.daaw.qs1
        /* renamed from: f */
        public void mo12234f() {
        }

        @Override // com.daaw.bx0.InterfaceC0893a
        /* renamed from: g */
        public void mo13818g() {
        }

        @Override // com.daaw.pk1
        /* renamed from: h */
        public void mo1491h(List<C2099ln> list) {
        }

        /* renamed from: k */
        public InterfaceC2200mp.InterfaceC2201a m13815k(bn1<? super InterfaceC2200mp> bn1Var) {
            return new C2965sq(this.f22145B, bn1Var, m13812n(bn1Var));
        }

        /* renamed from: l */
        public final InterfaceC2200mp.InterfaceC2201a m13814l(boolean z) {
            return m13815k(z ? this.f22147p : null);
        }

        @Override // com.daaw.bx0.InterfaceC0893a
        /* renamed from: m */
        public void mo13813m(TrackGroupArray trackGroupArray, um1 um1Var) {
        }

        /* renamed from: n */
        public tb0.InterfaceC3037b m13812n(bn1<? super InterfaceC2200mp> bn1Var) {
            return new C1607hr(SurfaceHolder$CallbackC2495oz.this.f22125G, bn1Var);
        }

        /* renamed from: o */
        public final bp0 m13811o(Uri uri, int i, String str) {
            int m10039F = sq1.m10039F(uri, str);
            if (m10039F != 0) {
                if (m10039F != 1) {
                    if (m10039F != 2) {
                        if (m10039F == 3) {
                            return new c00.C0905b(this.f22149r).m25702a(uri);
                        }
                        throw new IllegalStateException("Unsupported type: " + m10039F);
                    }
                    return new mb0.C2164b(this.f22149r).m16116b(new p10(new ob0(), m13807t(uri))).m16117a(uri);
                }
                return new af1.C0622b(new C3738yr.C3739a(this.f22149r), m13814l(false)).m27496b(new p10(new ye1(), m13807t(uri))).m27497a(uri);
            }
            return new C0653ap.C0658e(new C2746qq.C2747a(this.f22149r), m13814l(false)).m27287b(new p10(new C3561xo(), m13807t(uri))).m27288a(uri);
        }

        @Override // com.daaw.xp0
        /* renamed from: p */
        public void mo4856p(Metadata metadata) {
        }

        /* renamed from: q */
        public long m13810q() {
            fd1 fd1Var = this.f22156y;
            if (fd1Var != null) {
                long duration = fd1Var.getDuration();
                if (duration >= 0 && duration != -9223372036854775807L) {
                    return duration;
                }
                return 0L;
            }
            return 0L;
        }

        /* renamed from: r */
        public final bp0 m13809r(wd0 wd0Var) {
            Uri[] uriArr = {wd0Var.mo6166a()};
            String[] strArr = {""};
            int[] iArr = {wd0Var.mo6165b()};
            bp0[] bp0VarArr = new bp0[1];
            for (int i = 0; i < 1; i++) {
                bp0VarArr[i] = m13811o(uriArr[i], iArr[i], strArr[i]);
            }
            return bp0VarArr[0];
        }

        @Override // com.daaw.bx0.InterfaceC0893a
        /* renamed from: s */
        public void mo13808s(boolean z, int i) {
            int i2 = this.f22152u;
            if (i2 == i) {
                return;
            }
            this.f22152u = i;
            if (SurfaceHolder$CallbackC2495oz.this.f22123E != null) {
                SurfaceHolder$CallbackC2495oz.this.f22123E.m26721i();
            }
            if (i2 != 3) {
                m13831D(this.f22157z);
                SurfaceHolder$CallbackC2495oz.this.f22120B.mo26657a(true, null);
            }
            if ((i2 == 2 || i2 == 3) && i == 4) {
                m13806u(this.f22156y);
            }
        }

        /* renamed from: t */
        public List<?> m13807t(Uri uri) {
            return Collections.emptyList();
        }

        /* renamed from: u */
        public void m13806u(fd1 fd1Var) {
            if (fd1Var != null && SurfaceHolder$CallbackC2495oz.this.m13845N() == fd1Var) {
                SurfaceHolder$CallbackC2495oz.this.f22120B.mo26643o();
            }
        }

        @Override // com.daaw.bx0.InterfaceC0893a
        /* renamed from: v */
        public void mo13805v(nl1 nl1Var, Object obj, int i) {
        }

        /* renamed from: w */
        public void m13804w() {
            fd1 fd1Var = this.f22156y;
            if (fd1Var != null) {
                fd1Var.mo8687h(false);
            }
        }

        /* renamed from: x */
        public void m13803x(bp0 bp0Var) {
            if (this.f22156y == null || bp0Var == null) {
                return;
            }
            SurfaceHolder$CallbackC2495oz.this.f22127I.mo13839b();
            this.f22156y.m22790G(bp0Var);
        }

        /* renamed from: y */
        public void m13802y(wd0 wd0Var, float f, long j) {
            this.f22148q = new DefaultTrackSelector(new C3966a.C3967a(this.f22147p));
            this.f22150s = wd0Var;
            this.f22151t = m13809r(wd0Var);
            if (this.f22156y == null) {
                if (Build.VERSION.SDK_INT < 21) {
                    C1972kq.f16624Z = true;
                }
                fd1 m9698a = C2999sz.m9698a(new or0(SurfaceHolder$CallbackC2495oz.this.f22120B, SurfaceHolder$CallbackC2495oz.this.f22127I, this.f22144A, this.f22145B, 0), this.f22148q, null);
                this.f22156y = m9698a;
                m9698a.mo8693b(this);
                this.f22156y.m22794C(new C1026cy(this.f22148q));
                this.f22156y.mo8689f(j);
            }
            m13831D(f);
            m13829F(f);
            SurfaceHolder$CallbackC2495oz surfaceHolder$CallbackC2495oz = SurfaceHolder$CallbackC2495oz.this;
            surfaceHolder$CallbackC2495oz.mo6876m(surfaceHolder$CallbackC2495oz.f22120B.mo26644n());
            this.f22156y.mo8689f(j);
            if (this.f22150s != null) {
                m13803x(this.f22151t);
            }
            m13831D(f);
        }

        /* renamed from: z */
        public void m13801z() {
            bp0 bp0Var;
            fd1 fd1Var = this.f22156y;
            if (fd1Var == null || fd1Var.mo8684k() != 1 || (bp0Var = this.f22151t) == null) {
                return;
            }
            this.f22156y.m22790G(bp0Var);
        }
    }

    /* renamed from: com.daaw.oz$e */
    /* loaded from: classes.dex */
    public static class C2500e {

        /* renamed from: a */
        public static List<Object> f22158a = new LinkedList();

        /* renamed from: b */
        public static jw1<Activity, CharSequence> f22159b = new jw1().m18204b(new C2501a(), f22158a);

        /* renamed from: com.daaw.oz$e$a */
        /* loaded from: classes.dex */
        public class C2501a implements jw1.InterfaceC1885a<Activity, CharSequence> {
            @Override // com.daaw.jw1.InterfaceC1885a
            /* renamed from: a */
            public void mo13799c(Activity activity, CharSequence charSequence) {
            }
        }
    }

    public SurfaceHolder$CallbackC2495oz(Context context, String str, InterfaceC0771e.InterfaceC0773b interfaceC0773b) {
        int i = 0;
        this.f22130q = context;
        this.f22120B = interfaceC0773b;
        this.f22125G = sq1.m10042C(context, "ExoPlayerDemo");
        while (true) {
            C2499d[] c2499dArr = this.f22131r;
            if (i >= c2499dArr.length) {
                this.f22121C = new C1508h7(context, new C2497b());
                C3146ty.f28246b.m12989b(new C2498c(), this.f22119A);
                return;
            }
            c2499dArr[i] = new C2499d(context, i);
            i++;
        }
    }

    /* renamed from: J */
    public void m13849J() {
        synchronized (this.f22129p) {
            C3485wz c3485wz = this.f22139z;
            if (c3485wz != null && SystemClock.elapsedRealtime() - this.f22138y > 8000) {
                c3485wz.m5705e();
                this.f22139z = null;
            }
        }
    }

    /* renamed from: K */
    public void m13848K() {
        int i = this.f22132s;
        this.f22132s = this.f22133t;
        this.f22133t = i;
    }

    /* renamed from: L */
    public void m13847L(int i) {
        if (i == 0) {
            lz1.m16363c("trying to destroy currentPlayer");
            return;
        }
        int i2 = this.f22132s;
        int i3 = this.f22133t;
        if (i2 == i3) {
            return;
        }
        this.f22131r[i3].m13833B();
    }

    /* renamed from: M */
    public C2499d m13846M() {
        return this.f22131r[this.f22133t];
    }

    /* renamed from: N */
    public final fd1 m13845N() {
        return m13844O().f22156y;
    }

    /* renamed from: O */
    public C2499d m13844O() {
        return this.f22131r[this.f22132s];
    }

    /* renamed from: P */
    public final void m13843P() {
        C2499d[] c2499dArr;
        for (C2499d c2499d : this.f22131r) {
            long j = 0;
            if (c2499d.f22156y != null) {
                j = c2499d.f22156y.mo8680o();
            }
            wd0 wd0Var = c2499d.f22150s;
            c2499d.m13833B();
            c2499d.m13802y(wd0Var, 1.0f, j);
        }
    }

    /* renamed from: Q */
    public void m13842Q(boolean z, float f) {
        this.f22135v = f;
        this.f22136w = z;
        int i = 0;
        if (z) {
            C2499d[] c2499dArr = this.f22131r;
            int length = c2499dArr.length;
            while (i < length) {
                C2499d c2499d = c2499dArr[i];
                if (c2499d != null) {
                    c2499d.m13826I(0.0f);
                }
                i++;
            }
            return;
        }
        C2499d[] c2499dArr2 = this.f22131r;
        int length2 = c2499dArr2.length;
        while (i < length2) {
            C2499d c2499d2 = c2499dArr2[i];
            if (c2499d2 != null) {
                c2499d2.m13826I(f);
            }
            i++;
        }
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: a */
    public void mo6888a() {
        C2226mz c2226mz = this.f22123E;
        if (c2226mz != null) {
            c2226mz.m26720j();
            this.f22123E = null;
        }
        mo6876m(null);
        for (C2499d c2499d : this.f22131r) {
            c2499d.m13833B();
        }
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: b */
    public void mo6887b() {
        if (m13845N() == null) {
            return;
        }
        m13844O().m13804w();
        this.f22120B.mo26657a(false, null);
    }

    @Override // com.daaw.avee.comp.playback.AbstractC0738b.InterfaceC0742d
    /* renamed from: c */
    public void mo6886c(AbstractC0738b.C0740b c0740b) {
        this.f22120B.mo26655c(c0740b);
    }

    @Override // com.daaw.avee.comp.playback.AbstractC0738b.InterfaceC0742d
    /* renamed from: d */
    public AbstractC0738b.C0741c mo6885d(String str) {
        return this.f22120B.mo26654d(str);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: e */
    public void mo6884e(boolean z) {
        m13842Q(z, this.f22135v);
        this.f22120B.mo26652f(z);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: f */
    public boolean mo6883f() {
        return this.f22136w;
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: g */
    public void mo6882g(long j) {
        this.f22128J = j;
        m13844O().m13831D(1.0f);
        m13844O().m13832C((int) j);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: h */
    public hx0 mo6881h() {
        if (m13845N() == null) {
            return null;
        }
        return new hx0(m13844O().m13810q(), m13845N() != null);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: i */
    public C0729a mo6880i(C0729a c0729a, C0729a.C0736g c0736g) {
        if (c0729a == null) {
            return null;
        }
        long j = c0736g.f3978g;
        if (j < 0) {
            j = mo6878k() * 1000;
        }
        c0729a.m26737f(j);
        return c0729a;
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: j */
    public void mo6879j(boolean z, boolean z2, float f, long j) {
        if (z) {
            if (this.f22132s != this.f22133t) {
                m13846M().m13833B();
            }
        } else if (mo6870s()) {
            m13848K();
        }
        wd0 wd0Var = this.f22134u;
        if (wd0Var == null || wd0Var.mo6166a() == null || this.f22134u.mo6166a().equals(Uri.EMPTY)) {
            lz1.m16363c("nextDataSource is null");
            if (z2) {
                start();
                return;
            } else {
                mo6887b();
                return;
            }
        }
        m13844O().m13802y(this.f22134u, f, j);
        if (z2) {
            start();
        } else {
            m13844O().m13804w();
        }
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: k */
    public long mo6878k() {
        if (m13845N() == null) {
            return 0L;
        }
        return m13845N().mo8680o();
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: l */
    public long mo6877l() {
        return m13844O().m13810q();
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: m */
    public void mo6876m(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f22137x = new WeakReference<>(surfaceHolder);
            surfaceHolder.removeCallback(this);
            surfaceHolder.addCallback(this);
            surfaceCreated(surfaceHolder);
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f22137x.get();
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this);
            this.f22137x = new WeakReference<>(null);
        }
        surfaceDestroyed(null);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: n */
    public void mo6875n(AbstractC0738b.C0741c c0741c) {
        C2226mz c2226mz = this.f22123E;
        if (c2226mz != null) {
            c2226mz.m26717m(c0741c);
        }
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: o */
    public void mo6874o() {
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: p */
    public AbstractC0738b.C0740b mo6873p() {
        C2226mz c2226mz = this.f22123E;
        if (c2226mz != null) {
            return c2226mz.m26726d();
        }
        return null;
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: q */
    public void mo6872q(InterfaceC0771e.InterfaceC0773b interfaceC0773b) {
        this.f22120B = interfaceC0773b;
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: r */
    public void mo6871r(wd0 wd0Var) {
        this.f22134u = wd0Var;
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: s */
    public boolean mo6870s() {
        return m13845N() != null && (m13845N().mo8684k() == 2 || m13845N().mo8684k() == 3);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    public void start() {
        C2499d m13844O = m13844O();
        if (m13844O.f22156y == null) {
            return;
        }
        if (this.f22120B.mo26650h()) {
            m13844O.m13801z();
            surfaceCreated(this.f22120B.mo26644n());
            m13844O().m13824K();
        }
        this.f22120B.mo26657a(false, null);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    public void stop() {
        if (m13845N() == null) {
            return;
        }
        m13845N().mo8687h(false);
        this.f22120B.mo26657a(false, null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            m13846M().m13827H(null);
            m13844O().m13827H(surfaceHolder.getSurface());
            return;
        }
        m13846M().m13827H(null);
        m13844O().m13827H(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f22132s != this.f22133t) {
            m13846M().m13827H(null);
        }
        m13844O().m13827H(null);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: t */
    public boolean mo6869t(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f22132s;
        } else {
            i2 = this.f22133t;
            if (this.f22132s == i2) {
                return true;
            }
        }
        C2499d[] c2499dArr = this.f22131r;
        return c2499dArr[i2] == null || c2499dArr[i2].m13830E(f);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: u */
    public void mo6868u(int i) {
        m13844O().m13828G(i);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: v */
    public void mo6867v() {
        if (this.f22132s == this.f22133t) {
            return;
        }
        m13847L(1);
    }

    @Override // com.daaw.avee.comp.playback.AbstractC0738b.InterfaceC0742d
    /* renamed from: w */
    public boolean mo6866w(String str) {
        return this.f22120B.mo26653e(str);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: x */
    public void mo6865x(float f) {
        C2499d[] c2499dArr;
        for (C2499d c2499d : this.f22131r) {
            if (c2499d != null) {
                c2499d.m13825J(f);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: y */
    public boolean mo6864y() {
        return (m13845N() == null || m13845N().mo8684k() == 4 || !m13845N().mo8692c()) ? false : true;
    }
}

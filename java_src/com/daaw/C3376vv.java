package com.daaw;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
/* renamed from: com.daaw.vv */
/* loaded from: classes.dex */
public class C3376vv implements af0 {

    /* renamed from: s */
    public static final String[] f30614s = {"internalres:white", "internalres:black", "internalres:particle_circle_blur4", "internalres:vignette80", "internalres:rainbow128", "internalres:particle_blur01_more", "internalres:lens_flare", "internalres:lens_flare_2", "composition:0"};

    /* renamed from: t */
    public static final String[] f30615t = {"internalres:transparent", "internalres:white", "internalres:black", "internalres:particle_circle_blur4", "internalres:particle_blur01", "internalres:particle_blur_inv", "internalres:vignette80", "composition:0"};

    /* renamed from: u */
    public static l31<Bitmap> f30616u = new l31<>(null);

    /* renamed from: a */
    public r40<de0, C1652i2> f30617a;

    /* renamed from: b */
    public InterfaceC3378b f30618b;

    /* renamed from: c */
    public s40<y31, Bitmap, Bitmap> f30619c;

    /* renamed from: d */
    public s40<y31, Bitmap, Bitmap> f30620d;

    /* renamed from: k */
    public Object f30627k;

    /* renamed from: e */
    public qc0 f30621e = null;

    /* renamed from: f */
    public qc0 f30622f = null;

    /* renamed from: g */
    public C1652i2 f30623g = new C1652i2(Uri.EMPTY, "", "");

    /* renamed from: h */
    public String f30624h = null;

    /* renamed from: i */
    public int f30625i = 0;

    /* renamed from: j */
    public df0 f30626j = null;

    /* renamed from: l */
    public int f30628l = 0;

    /* renamed from: m */
    public boolean f30629m = false;

    /* renamed from: n */
    public int f30630n = -1;

    /* renamed from: o */
    public int f30631o = 0;

    /* renamed from: p */
    public l31<lo1<le0[], Object>> f30632p = new l31<>(null);

    /* renamed from: q */
    public boolean f30633q = false;

    /* renamed from: r */
    public ye0 f30634r = new ye0(-16711936, true, 1.0f, 1.0f);

    /* renamed from: com.daaw.vv$a */
    /* loaded from: classes.dex */
    public static class C3377a {

        /* renamed from: a */
        public int f30635a = 0;

        /* renamed from: b */
        public C0605a7 f30636b = null;

        /* renamed from: c */
        public jr1<Bitmap> f30637c = null;
    }

    /* renamed from: com.daaw.vv$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3378b {
        /* renamed from: a */
        void mo2430a();
    }

    public C3376vv(InterfaceC3378b interfaceC3378b, r40<de0, C1652i2> r40Var, s40<y31, Bitmap, Bitmap> s40Var, s40<y31, Bitmap, Bitmap> s40Var2) {
        this.f30618b = interfaceC3378b;
        this.f30617a = r40Var;
        this.f30619c = s40Var;
        this.f30620d = s40Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [T, com.daaw.x6] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.daaw.a7, T] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, com.daaw.lo1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.daaw.a7, T] */
    /* renamed from: c */
    public static boolean m6764c(l31<qc0> l31Var, l31<qc0> l31Var2, y31 y31Var, df0 df0Var, l31<lo1<le0[], Object>> l31Var3, int i, s40<y31, Bitmap, Bitmap> s40Var, s40<y31, Bitmap, Bitmap> s40Var2) {
        if (df0Var == null) {
            l31Var.f16995a = null;
            if (l31Var2 != null) {
                l31Var2.f16995a = null;
            }
            return true;
        }
        Bitmap m24431g = df0.m24431g(df0Var);
        if (m24431g == null) {
            l31Var.f16995a = null;
            if (l31Var2 != null) {
                l31Var2.f16995a = null;
            }
            return true;
        }
        if (l31Var2 != null) {
            Bitmap mo2432a = s40Var != null ? s40Var2.mo2432a(y31Var, m24431g) : null;
            if (mo2432a != null) {
                l31Var2.f16995a = new C3505x6(new vr1(mo2432a, 9729, 9729, 10497, false), true);
            } else {
                l31Var2.f16995a = null;
            }
            if (mo2432a != null && m24431g != mo2432a) {
                mo2432a.recycle();
            }
        }
        int mo23530d = df0Var.mo23530d();
        if (mo23530d > 1) {
            if (i == 0) {
                df0Var.mo23528h();
                l31Var3.f16995a = new lo1(new le0[mo23530d], new C3377a());
            }
            lo1<le0[], Object> lo1Var = l31Var3.f16995a;
            C3377a c3377a = lo1Var != null ? (C3377a) lo1Var.f17577b : null;
            if (c3377a == null) {
                return true;
            }
            if (c3377a.f30635a < mo23530d) {
                if (c3377a.f30637c == null) {
                    df0Var.mo23531a();
                    c3377a.f30637c = df0Var.mo23529e();
                }
                if (c3377a.f30637c.m18316c()) {
                    Bitmap m18317b = c3377a.f30637c.m18317b();
                    if (m18317b == null) {
                        m18317b = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
                    }
                    vr1 vr1Var = new vr1(m6745v(m18317b, 0, f30616u), 9729, 9729, 10497, false);
                    int i2 = c3377a.f30635a;
                    if (i2 == 0) {
                        le0[] le0VarArr = l31Var3.f16995a.f17576a;
                        le0VarArr[i2] = vr1Var;
                        c3377a.f30636b = new C3672y6(le0VarArr, true);
                    }
                    int i3 = c3377a.f30635a;
                    l31Var3.f16995a.f17576a[i3] = vr1Var;
                    C0605a7 c0605a7 = c3377a.f30636b;
                    if (c0605a7 != null) {
                        c0605a7.m27591k(i3, vr1Var);
                    }
                    c3377a.f30635a++;
                    c3377a.f30637c = null;
                }
                l31Var.f16995a = c3377a.f30636b;
                return false;
            }
            l31Var.f16995a = c3377a.f30636b;
            l31Var3.f16995a = null;
        } else {
            Bitmap mo2432a2 = s40Var != null ? s40Var.mo2432a(y31Var, m24431g) : m24431g;
            l31Var.f16995a = mo2432a2 != null ? new C3505x6(new vr1(m6745v(mo2432a2, 0, f30616u), 9729, 9729, 10497, false), true) : 0;
            if (mo2432a2 != null && m24431g != mo2432a2) {
                mo2432a2.recycle();
            }
        }
        return true;
    }

    /* renamed from: v */
    public static Bitmap m6745v(Bitmap bitmap, int i, l31<Bitmap> l31Var) {
        return bitmap;
    }

    /* renamed from: A */
    public void m6770A(float f) {
        ye0 ye0Var = this.f30634r;
        if (ye0Var.f33567d == f) {
            return;
        }
        ye0Var.f33567d = f;
        m6752o();
    }

    /* renamed from: B */
    public void m6769B(float f) {
        ye0 ye0Var = this.f30634r;
        if (ye0Var.f33566c == f) {
            return;
        }
        ye0Var.f33566c = f;
        m6752o();
    }

    /* renamed from: C */
    public void m6768C(String str) {
        this.f30624h = str;
        int m5082i0 = C3543xi.m5082i0(str);
        this.f30625i = m5082i0;
        if (m5082i0 > 0) {
            m6765F(null);
            return;
        }
        String str2 = this.f30624h;
        if (str2 != null && str2.length() > 0) {
            m6765F(new C1652i2(Uri.EMPTY, this.f30624h, ""));
            return;
        }
        r40<de0, C1652i2> r40Var = this.f30617a;
        m6765F(r40Var != null ? r40Var.mo5050a(null) : null);
    }

    /* renamed from: D */
    public void m6767D(int i) {
        if (this.f30630n == i) {
            return;
        }
        this.f30630n = i;
        m6752o();
    }

    /* renamed from: E */
    public void m6766E(boolean z) {
        if (this.f30629m == z) {
            return;
        }
        this.f30629m = z;
        m6752o();
    }

    /* renamed from: F */
    public void m6765F(C1652i2 c1652i2) {
        C1652i2 c1652i22;
        if (c1652i2 == null && this.f30623g == null) {
            return;
        }
        if (c1652i2 != null && (c1652i22 = this.f30623g) != null && br1.m25901h(c1652i22.f13192a.getPath(), c1652i2.f13192a.getPath()) && br1.m25901h(this.f30623g.f13193b, c1652i2.f13193b) && br1.m25901h(this.f30623g.f13194c, c1652i2.f13194c)) {
            return;
        }
        this.f30623g = c1652i2;
        m6752o();
    }

    @Override // com.daaw.af0
    /* renamed from: a */
    public void mo5908a(Object obj) {
        this.f30627k = obj;
    }

    @Override // com.daaw.af0
    /* renamed from: b */
    public void mo5907b(df0 df0Var, String str, String str2) {
        C1652i2 c1652i2 = this.f30623g;
        if (c1652i2 != null && br1.m25901h(str2, c1652i2.f13193b) && br1.m25901h(str2, this.f30623g.f13193b)) {
            m6752o();
            df0.m24433c(this.f30626j);
            this.f30626j = df0Var;
            this.f30631o = 2;
        }
    }

    /* renamed from: d */
    public void m6763d() {
        qc0 qc0Var = this.f30621e;
        if (qc0Var != null) {
            qc0Var.mo2801a();
        }
        this.f30621e = null;
    }

    /* renamed from: e */
    public void m6762e() {
        qc0 qc0Var = this.f30622f;
        if (qc0Var != null) {
            qc0Var.mo2801a();
        }
        this.f30622f = null;
    }

    /* renamed from: f */
    public boolean m6761f(y31 y31Var, df0 df0Var, int i) {
        if (df0Var == null) {
            m6763d();
            return true;
        }
        l31 l31Var = new l31(null);
        l31 l31Var2 = new l31(null);
        boolean m6764c = m6764c(l31Var, l31Var2, y31Var, df0Var, this.f30632p, i, this.f30619c, this.f30620d);
        if (this.f30621e != l31Var.f16995a) {
            m6763d();
        }
        this.f30621e = (qc0) l31Var.f16995a;
        m6762e();
        this.f30622f = (qc0) l31Var2.f16995a;
        return m6764c;
    }

    /* renamed from: g */
    public int m6760g() {
        return this.f30628l;
    }

    /* renamed from: h */
    public boolean m6759h() {
        return this.f30633q;
    }

    /* renamed from: i */
    public ye0 m6758i() {
        return this.f30634r;
    }

    /* renamed from: j */
    public String m6757j() {
        return this.f30624h;
    }

    /* renamed from: k */
    public int m6756k() {
        return this.f30630n;
    }

    /* renamed from: l */
    public boolean m6755l() {
        return this.f30629m;
    }

    /* renamed from: m */
    public qc0 m6754m(y31 y31Var) {
        int i = this.f30625i;
        if (i > 0) {
            or1 m4228B = y31Var.m4228B(i);
            return m4228B == null ? y31Var.f33263u.mo4183c() : new C3812z6(m4228B.mo7095b(), false);
        }
        return this.f30621e;
    }

    /* renamed from: n */
    public qc0 m6753n(y31 y31Var) {
        if (this.f30625i > 0) {
            return null;
        }
        return this.f30622f;
    }

    /* renamed from: o */
    public final void m6752o() {
        m6751p();
        this.f30618b.mo2430a();
    }

    /* renamed from: p */
    public void m6751p() {
        this.f30631o = 0;
    }

    /* renamed from: q */
    public boolean m6750q(y31 y31Var, RectF rectF, int i) {
        if (this.f30631o == 0) {
            df0.m24433c(this.f30626j);
            this.f30626j = null;
            this.f30631o = 1;
            C1652i2 c1652i2 = this.f30623g;
            if (c1652i2 == null) {
                m6752o();
                df0.m24433c(this.f30626j);
                this.f30626j = null;
                this.f30631o = 2;
            } else {
                y31Var.f33263u.f33285a.mo2874c(this, new C1496h2(c1652i2.f13192a, c1652i2.f13193b, c1652i2.f13194c, !this.f30629m, (int) rectF.width(), (int) rectF.height(), (int) rectF.width(), (int) rectF.height(), this.f30628l, this.f30630n, this.f30633q ? this.f30634r : null));
            }
        }
        return true;
    }

    /* renamed from: r */
    public boolean m6749r(y31 y31Var, int i) {
        if (this.f30631o == 2 && m6761f(y31Var, this.f30626j, i)) {
            this.f30631o = 3;
            df0.m24433c(this.f30626j);
            this.f30626j = null;
            return true;
        }
        return true;
    }

    /* renamed from: s */
    public void m6748s(y31 y31Var) {
        m6763d();
        m6762e();
    }

    /* renamed from: t */
    public void m6747t(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        int i = this.f30625i;
        if (i > 0) {
            vc0Var.mo5086a(i);
        }
        String str = this.f30624h;
        if ((str == null || str.length() <= 0) && this.f30625i <= 0) {
            r40<de0, C1652i2> r40Var = this.f30617a;
            m6765F(r40Var != null ? r40Var.mo5050a(de0Var) : null);
        }
    }

    /* renamed from: u */
    public void m6746u(y31 y31Var, e40 e40Var) {
        if (this.f30631o == 3 || this.f30625i > 0) {
            return;
        }
        y31Var.m4191z();
    }

    /* renamed from: w */
    public void m6744w(int i) {
        if (this.f30628l == i) {
            return;
        }
        this.f30628l = i;
        m6752o();
    }

    /* renamed from: x */
    public void m6743x(boolean z) {
        ye0 ye0Var = this.f30634r;
        if (ye0Var.f33565b == z) {
            return;
        }
        ye0Var.f33565b = z;
        m6752o();
    }

    /* renamed from: y */
    public void m6742y(int i) {
        ye0 ye0Var = this.f30634r;
        if (ye0Var.f33564a == i) {
            return;
        }
        ye0Var.f33564a = i;
        m6752o();
    }

    /* renamed from: z */
    public void m6741z(boolean z) {
        if (this.f30633q == z) {
            return;
        }
        this.f30633q = z;
        m6752o();
    }
}

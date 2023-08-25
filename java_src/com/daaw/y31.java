package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import com.daaw.avee.R;
import com.daaw.de0;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class y31 implements de0 {

    /* renamed from: d */
    public final float[] f33246d;

    /* renamed from: u */
    public final C3666c f33263u;

    /* renamed from: a */
    public final float f33243a = -10.0f;

    /* renamed from: b */
    public final float[] f33244b = new float[16];

    /* renamed from: c */
    public final float[] f33245c = new float[16];

    /* renamed from: e */
    public float f33247e = 0.0f;

    /* renamed from: f */
    public float f33248f = 0.0f;

    /* renamed from: g */
    public int f33249g = 0;

    /* renamed from: h */
    public long f33250h = 0;

    /* renamed from: i */
    public long f33251i = 0;

    /* renamed from: j */
    public long f33252j = 0;

    /* renamed from: k */
    public float f33253k = 0.0f;

    /* renamed from: l */
    public int f33254l = 2;

    /* renamed from: m */
    public int f33255m = 2;

    /* renamed from: n */
    public int f33256n = 2;

    /* renamed from: o */
    public int f33257o = 2;

    /* renamed from: p */
    public int f33258p = 0;

    /* renamed from: q */
    public int f33259q = 0;

    /* renamed from: r */
    public int f33260r = -1;

    /* renamed from: s */
    public g40 f33261s = new g40();

    /* renamed from: t */
    public e40 f33262t = null;

    /* renamed from: v */
    public List<or1> f33264v = new ArrayList();

    /* renamed from: w */
    public boolean f33265w = false;

    /* renamed from: x */
    public boolean f33266x = true;

    /* renamed from: y */
    public int f33267y = 0;

    /* renamed from: z */
    public int f33268z = 0;

    /* renamed from: A */
    public final pr1 f33238A = new pr1();

    /* renamed from: B */
    public final pr1 f33239B = new pr1();

    /* renamed from: C */
    public final pr1 f33240C = new pr1();

    /* renamed from: D */
    public final pr1 f33241D = new pr1();

    /* renamed from: E */
    public final pr1 f33242E = new pr1();

    /* renamed from: com.daaw.y31$a */
    /* loaded from: classes.dex */
    public class C3664a implements InterfaceC1240f0<y31, sr1> {
        public C3664a() {
        }

        @Override // com.daaw.InterfaceC1240f0
        /* renamed from: b */
        public void mo4189a(y31 y31Var, sr1 sr1Var) {
            sr1Var.m9964E("u_projView", false, y31.this.m4219K());
            sr1Var.m24534x("u_texture", 0);
        }
    }

    /* renamed from: com.daaw.y31$b */
    /* loaded from: classes.dex */
    public class C3665b implements InterfaceC1240f0<y31, sr1> {
        public C3665b() {
        }

        @Override // com.daaw.InterfaceC1240f0
        /* renamed from: b */
        public void mo4189a(y31 y31Var, sr1 sr1Var) {
            sr1Var.m24534x("u_texture", 0);
        }
    }

    /* renamed from: com.daaw.y31$c */
    /* loaded from: classes.dex */
    public static class C3666c implements de0.InterfaceC1077a {

        /* renamed from: A */
        public C3812z6 f33271A;

        /* renamed from: B */
        public C3812z6 f33272B;

        /* renamed from: C */
        public C3812z6 f33273C;

        /* renamed from: D */
        public C3812z6 f33274D;

        /* renamed from: E */
        public C3812z6 f33275E;

        /* renamed from: F */
        public ok0 f33276F;

        /* renamed from: G */
        public Bitmap f33277G;

        /* renamed from: H */
        public Bitmap f33278H;

        /* renamed from: I */
        public Bitmap f33279I;

        /* renamed from: J */
        public Bitmap f33280J;

        /* renamed from: K */
        public Bitmap f33281K;

        /* renamed from: L */
        public Bitmap f33282L;

        /* renamed from: M */
        public Bitmap f33283M;

        /* renamed from: N */
        public C3812z6[] f33284N = new C3812z6[5];

        /* renamed from: a */
        public final sg0 f33285a;

        /* renamed from: b */
        public final aq0 f33286b;

        /* renamed from: c */
        public sr1 f33287c;

        /* renamed from: d */
        public sr1 f33288d;

        /* renamed from: e */
        public sr1 f33289e;

        /* renamed from: f */
        public sr1 f33290f;

        /* renamed from: g */
        public sr1 f33291g;

        /* renamed from: h */
        public sr1 f33292h;

        /* renamed from: i */
        public sr1 f33293i;

        /* renamed from: j */
        public sr1 f33294j;

        /* renamed from: k */
        public sr1 f33295k;

        /* renamed from: l */
        public AbstractC3044tc f33296l;

        /* renamed from: m */
        public ue1 f33297m;

        /* renamed from: n */
        public q40 f33298n;

        /* renamed from: o */
        public qr1 f33299o;

        /* renamed from: p */
        public qr1 f33300p;

        /* renamed from: q */
        public qr1 f33301q;

        /* renamed from: r */
        public qr1 f33302r;

        /* renamed from: s */
        public qr1 f33303s;

        /* renamed from: t */
        public qr1 f33304t;

        /* renamed from: u */
        public qr1 f33305u;

        /* renamed from: v */
        public qr1 f33306v;

        /* renamed from: w */
        public qr1 f33307w;

        /* renamed from: x */
        public C3812z6 f33308x;

        /* renamed from: y */
        public C3812z6 f33309y;

        /* renamed from: z */
        public C3812z6 f33310z;

        public C3666c(y31 y31Var, sg0 sg0Var) {
            this.f33285a = sg0Var;
            this.f33286b = new aq0(y31Var);
        }

        /* renamed from: A */
        public void m4187A(Resources resources) {
            this.f33277G = BitmapFactory.decodeResource(resources, R.drawable.path_edge);
            this.f33278H = BitmapFactory.decodeResource(resources, R.drawable.circle_w_a_64);
            this.f33279I = BitmapFactory.decodeResource(resources, R.drawable.square_w_a_64);
            this.f33280J = BitmapFactory.decodeResource(resources, R.drawable.square_ysides_w_a_64);
            this.f33281K = BitmapFactory.decodeResource(resources, R.drawable.random16);
            this.f33282L = BitmapFactory.decodeResource(resources, R.drawable.ic_launcher);
            this.f33283M = BitmapFactory.decodeResource(resources, R.drawable.loading_placeholder);
        }

        /* renamed from: B */
        public void m4186B() {
            Context m23837e = dx0.m23837e();
            if (m23837e == null) {
                return;
            }
            Resources resources = m23837e.getResources();
            q40 q40Var = this.f33298n;
            if (q40Var != null) {
                q40Var.m12782b();
            }
            this.f33298n = new q40();
            vr1 vr1Var = new vr1(-1, 2, 2, 9729, 9729, 10497, false);
            vr1 vr1Var2 = new vr1(-16777216, 2, 2, 9729, 9729, 10497, false);
            C3812z6 c3812z6 = this.f33308x;
            if (c3812z6 != null) {
                c3812z6.mo2801a();
            }
            this.f33308x = new C3812z6(vr1Var, true);
            C3812z6 c3812z62 = this.f33309y;
            if (c3812z62 != null) {
                c3812z62.mo2801a();
            }
            this.f33309y = new C3812z6(vr1Var2, true);
            C3812z6 c3812z63 = this.f33310z;
            if (c3812z63 != null) {
                c3812z63.mo2801a();
            }
            this.f33310z = new C3812z6(new vr1(this.f33277G, 9729, 9729, 10497, true), true);
            C3812z6 c3812z64 = this.f33273C;
            if (c3812z64 != null) {
                c3812z64.mo2801a();
            }
            this.f33273C = new C3812z6(new vr1(this.f33278H, 9729, 9729, 10497, true), true);
            C3812z6 c3812z65 = this.f33271A;
            if (c3812z65 != null) {
                c3812z65.mo2801a();
            }
            this.f33271A = new C3812z6(new vr1(this.f33279I, 9729, 9729, 10497, true), true);
            C3812z6 c3812z66 = this.f33272B;
            if (c3812z66 != null) {
                c3812z66.mo2801a();
            }
            this.f33272B = new C3812z6(new vr1(this.f33280J, 9729, 9729, 10497, true), true);
            C3812z6 c3812z67 = this.f33274D;
            if (c3812z67 != null) {
                c3812z67.mo2801a();
            }
            this.f33274D = new C3812z6(new vr1(this.f33281K, 9729, 9729, 10497, false), true);
            C3812z6 c3812z68 = this.f33275E;
            if (c3812z68 != null) {
                c3812z68.mo2801a();
            }
            this.f33275E = new C3812z6(new vr1(this.f33283M, 9729, 9729, 10497, false), true);
            this.f33276F = new ok0(this.f33275E.mo2798d(), false);
            this.f33287c = m4177i(this.f33287c);
            sr1 m4160z = m4160z(resources, R.raw.blur_vert, R.raw.blurh_frag);
            this.f33287c = m4160z;
            C2691q6.m12752f(m4160z);
            this.f33288d = m4177i(this.f33288d);
            sr1 m4160z2 = m4160z(resources, R.raw.blur_vert, R.raw.blurv_frag);
            this.f33288d = m4160z2;
            C2691q6.m12752f(m4160z2);
            this.f33289e = m4177i(this.f33289e);
            sr1 m4160z3 = m4160z(resources, R.raw.buffer_vert, R.raw.blur_kernel_frag);
            this.f33289e = m4160z3;
            C2691q6.m12752f(m4160z3);
            this.f33290f = m4177i(this.f33290f);
            sr1 m4160z4 = m4160z(resources, R.raw.blur_vert, R.raw.blur_stack_frag);
            this.f33290f = m4160z4;
            C2691q6.m12752f(m4160z4);
            this.f33291g = m4177i(this.f33291g);
            sr1 m4160z5 = m4160z(resources, R.raw.fxaa_vert, R.raw.fxaa_frag);
            this.f33291g = m4160z5;
            C2691q6.m12752f(m4160z5);
            this.f33292h = m4177i(this.f33292h);
            sr1 m4160z6 = m4160z(resources, R.raw.buffer_vert, R.raw.buffer_frag);
            this.f33292h = m4160z6;
            C2691q6.m12752f(m4160z6);
            this.f33293i = m4177i(this.f33293i);
            sr1 m4160z7 = m4160z(resources, R.raw.buffer_fx_ligh_vert, R.raw.buffer_fx_light_frag);
            this.f33293i = m4160z7;
            C2691q6.m12752f(m4160z7);
            this.f33294j = m4177i(this.f33294j);
            sr1 m4160z8 = m4160z(resources, R.raw.buffer_rgb_split_vert, R.raw.buffer_rgb_split_frag);
            this.f33294j = m4160z8;
            C2691q6.m12752f(m4160z8);
            this.f33295k = m4177i(this.f33295k);
            sr1 m4160z9 = m4160z(resources, R.raw.buffer_motion_blur_vert, R.raw.buffer_motion_blur_frag);
            this.f33295k = m4160z9;
            C2691q6.m12752f(m4160z9);
            this.f33299o = null;
            this.f33300p = null;
            this.f33301q = null;
            this.f33302r = null;
            this.f33303s = null;
            this.f33304t = null;
            this.f33305u = null;
            this.f33306v = null;
            this.f33307w = null;
            try {
                this.f33296l = (AbstractC3044tc) br1.m25900i(this.f33296l);
                C3194uc c3194uc = new C3194uc(400);
                this.f33296l = c3194uc;
                this.f33299o = c3194uc.m9362g(this.f33292h);
                this.f33300p = this.f33296l.m9362g(this.f33292h);
                this.f33301q = this.f33296l.m9362g(this.f33293i);
                this.f33302r = this.f33296l.m9362g(this.f33294j);
                this.f33303s = this.f33296l.m9362g(this.f33295k);
                this.f33304t = this.f33296l.m9362g(m4174l());
                this.f33305u = this.f33296l.m9362g(m4173m());
                this.f33306v = this.f33296l.m9362g(m4175k());
                this.f33307w = this.f33296l.m9362g(m4172n());
            } catch (Exception e) {
                lz1.m16363c("Resources loading error: " + e.getMessage());
                qw1<String> qw1Var = C3385vy.f30703a;
                qw1Var.m12018a("Resources loading error: " + e.getMessage());
            }
            try {
                this.f33297m = new ue1(this.f33296l);
            } catch (Exception e2) {
                lz1.m16363c("Resources loading error: " + e2.getMessage());
                qw1<String> qw1Var2 = C3385vy.f30703a;
                qw1Var2.m12018a("Resources loading error: " + e2.getMessage());
            }
        }

        @Override // com.daaw.de0.InterfaceC1077a
        /* renamed from: a */
        public aq0 mo4185a() {
            return this.f33286b;
        }

        @Override // com.daaw.de0.InterfaceC1077a
        /* renamed from: b */
        public sg0 mo4184b() {
            return this.f33285a;
        }

        @Override // com.daaw.de0.InterfaceC1077a
        /* renamed from: c */
        public C3812z6 mo4183c() {
            return this.f33308x;
        }

        @Override // com.daaw.de0.InterfaceC1077a
        /* renamed from: d */
        public C3812z6 mo4182d() {
            return this.f33273C;
        }

        @Override // com.daaw.de0.InterfaceC1077a
        /* renamed from: e */
        public C3812z6 mo4181e() {
            return this.f33271A;
        }

        @Override // com.daaw.de0.InterfaceC1077a
        /* renamed from: f */
        public C3812z6 mo4180f() {
            return this.f33272B;
        }

        /* renamed from: i */
        public final sr1 m4177i(sr1 sr1Var) {
            if (sr1Var != null) {
                sr1Var.m24553e();
                return null;
            }
            return null;
        }

        /* renamed from: j */
        public sr1 m4176j() {
            return this.f33293i;
        }

        /* renamed from: k */
        public sr1 m4175k() {
            return this.f33289e;
        }

        /* renamed from: l */
        public sr1 m4174l() {
            return this.f33287c;
        }

        /* renamed from: m */
        public sr1 m4173m() {
            return this.f33288d;
        }

        /* renamed from: n */
        public sr1 m4172n() {
            return this.f33290f;
        }

        /* renamed from: o */
        public AbstractC3044tc m4171o() {
            return this.f33296l;
        }

        /* renamed from: p */
        public qr1 m4170p() {
            return this.f33303s;
        }

        /* renamed from: q */
        public qr1 m4169q() {
            return this.f33302r;
        }

        /* renamed from: r */
        public qr1 m4168r() {
            return this.f33299o;
        }

        /* renamed from: s */
        public qr1 m4167s() {
            return this.f33301q;
        }

        /* renamed from: t */
        public qr1 m4166t() {
            return this.f33300p;
        }

        /* renamed from: u */
        public qr1 m4165u() {
            return this.f33307w;
        }

        /* renamed from: v */
        public ue1 m4164v() {
            return this.f33297m;
        }

        /* renamed from: w */
        public q40 m4163w() {
            return this.f33298n;
        }

        /* renamed from: x */
        public sr1 m4162x() {
            return this.f33291g;
        }

        /* renamed from: y */
        public boolean m4161y() {
            return (this.f33296l == null || this.f33297m == null || this.f33292h == null) ? false : true;
        }

        /* renamed from: z */
        public sr1 m4160z(Resources resources, int i, int i2) {
            try {
                sr1 sr1Var = new sr1(cr1.m25063q(resources, i), cr1.m25063q(resources, i2));
                if (sr1Var.m24547k().length() != 0) {
                    lz1.m16363c(sr1Var.m24547k());
                }
                return sr1Var;
            } catch (Exception e) {
                lz1.m16363c("(" + i + "; " + i2 + ") Resources loading error: " + e.getMessage());
                return null;
            }
        }
    }

    public y31(sg0 sg0Var) {
        float[] fArr = new float[16];
        this.f33246d = fArr;
        this.f33263u = new C3666c(this, sg0Var);
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, 0.0f, -10.0f);
    }

    @Override // com.daaw.de0
    /* renamed from: A */
    public AbstractC3044tc mo2881j() {
        return this.f33263u.m4171o();
    }

    /* renamed from: B */
    public or1 m4228B(int i) {
        if (i < this.f33264v.size()) {
            return this.f33264v.get(i);
        }
        return null;
    }

    /* renamed from: C */
    public g40 m4227C() {
        return this.f33261s;
    }

    /* renamed from: D */
    public int m4226D() {
        return this.f33249g;
    }

    /* renamed from: E */
    public float m4225E() {
        return this.f33248f;
    }

    /* renamed from: F */
    public int m4224F() {
        int i = this.f33259q;
        return i < 2 ? this.f33255m : i;
    }

    /* renamed from: G */
    public int m4223G() {
        int i = this.f33258p;
        return i < 2 ? this.f33254l : i;
    }

    /* renamed from: H */
    public boolean m4222H() {
        return true;
    }

    /* renamed from: I */
    public cs1 m4221I() {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(34024, iArr, 0);
        int i = iArr[0];
        lz1.m16365a("OGL Max render buffer size: " + i);
        lz1.m16365a("fullscreen size: " + m4223G() + "; " + m4224F());
        return new cs1(Math.min(m4223G(), i), Math.min(m4224F(), i));
    }

    /* renamed from: J */
    public int m4220J() {
        return this.f33268z;
    }

    /* renamed from: K */
    public float[] m4219K() {
        return this.f33244b;
    }

    /* renamed from: L */
    public boolean m4218L(bs1 bs1Var, float f) {
        return true;
    }

    /* renamed from: M */
    public void m4217M() {
        this.f33263u.f33296l.m9351r(this);
        this.f33268z = 0;
    }

    /* renamed from: N */
    public void m4216N(int i, int i2, int i3) {
        g40 g40Var = this.f33261s;
        g40Var.f10241d = g40Var.f10242e;
        g40Var.f10242e = 0;
        g40Var.f10243f = g40Var.f10244g;
        g40Var.f10244g = 0;
        g40Var.f10245h = g40Var.f10246i;
        g40Var.f10246i = 0;
        g40Var.f10248k = g40Var.f10247j;
        g40Var.f10247j = 0;
        this.f33258p = i2;
        this.f33259q = i3;
        if (i > 0) {
            this.f33249g = i;
            this.f33251i = 0L;
            float f = i * 0.001f;
            this.f33247e = f;
            this.f33248f = f;
            g40Var.f10239b = (int) (1.0f / f);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i4 = (int) (uptimeMillis - this.f33251i);
            this.f33249g = i4;
            g40 g40Var2 = this.f33261s;
            int i5 = g40Var2.f10240c + 1;
            g40Var2.f10240c = i5;
            if (uptimeMillis - this.f33250h >= 1000) {
                g40Var2.f10239b = i5;
                g40Var2.f10240c = 0;
                this.f33250h = uptimeMillis;
            }
            this.f33251i = uptimeMillis;
            if (i4 < 0) {
                this.f33249g = 0;
            }
            if (this.f33249g > 200) {
                this.f33249g = 200;
            }
            float f2 = this.f33249g * 0.001f;
            this.f33247e = f2;
            this.f33248f = (this.f33248f * 0.5f) + (f2 * 0.5f);
        }
        long j = this.f33252j + this.f33249g;
        this.f33252j = j;
        this.f33253k = ((float) j) * 0.001f;
        this.f33261s.f10238a = 0;
        this.f33265w = this.f33263u.f33285a.mo2865l() > 0;
        this.f33266x = (this.f33263u.f33285a.mo2870g() & 1) != 0;
        m4200q();
        m4202o(null, true);
        this.f33263u.m4168r().m12272c(true, new C3664a());
        this.f33263u.m4166t().m12272c(true, new C3665b());
        m4201p(this.f33263u.m4176j());
        this.f33263u.m4176j().m9964E("u_projView", false, m4219K());
        this.f33263u.m4176j().m24534x("u_texture", 0);
        this.f33263u.m4176j().m24534x("u_texture2", 1);
        this.f33263u.m4176j().m24539s("maskadd", 0.0f);
        this.f33263u.m4176j().m24539s("maskmul", 1.0f);
        this.f33263u.m4176j().m24539s("mask_l_add", 1.0f);
        this.f33263u.m4176j().m24539s("mask_l_mul", 0.0f);
        this.f33263u.m4176j().m24539s("tex2_y_add", 0.0f);
        this.f33263u.m4176j().m24539s("tex2_y_mul", 1.0f);
        this.f33263u.m4176j().m24536v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
        this.f33263u.m4176j().m24539s("saturation", 1.0f);
        if (this.f33263u.f33276F != null) {
            this.f33263u.f33276F.m14218j(this.f33247e);
        }
        this.f33263u.f33296l.m9350s(this);
        this.f33263u.mo4185a().m27210o();
    }

    /* renamed from: O */
    public void m4215O(vk1 vk1Var) {
        this.f33263u.f33285a.mo2869h(vk1Var, this.f33261s.m21975b() > 0, "" + this.f33261s.f10238a + " / " + this.f33261s.f10243f + " / " + this.f33261s.f10245h);
    }

    /* renamed from: P */
    public void m4214P(Resources resources) {
        this.f33263u.m4187A(resources);
    }

    /* renamed from: Q */
    public boolean m4213Q(Context context, int i, int i2) {
        if (this.f33256n == i && this.f33257o == i2) {
            return false;
        }
        this.f33256n = i;
        this.f33257o = i2;
        this.f33254l = i;
        this.f33255m = i2;
        return true;
    }

    /* renamed from: R */
    public void m4212R() {
        m4207W();
        GLES20.glEnable(3042);
        this.f33263u.m4186B();
    }

    /* renamed from: S */
    public void m4211S(int i, or1 or1Var) {
        while (i >= this.f33264v.size()) {
            this.f33264v.add(null);
        }
        this.f33264v.set(i, or1Var);
    }

    /* renamed from: T */
    public void m4210T(int i) {
        int i2;
        if (i == 2) {
            i2 = 33071;
        } else if (i != 1) {
            return;
        } else {
            i2 = 33648;
        }
        GLES20.glTexParameteri(3553, 10242, i2);
        GLES20.glTexParameteri(3553, 10243, i2);
    }

    /* renamed from: U */
    public void m4209U(int i) {
        this.f33268z = i;
    }

    /* renamed from: V */
    public void m4208V() {
    }

    /* renamed from: W */
    public void m4207W() {
        this.f33260r = -1;
    }

    @Override // com.daaw.de0
    /* renamed from: a */
    public int mo2890a() {
        int i = this.f33259q;
        return i < 2 ? this.f33255m : i;
    }

    @Override // com.daaw.de0
    /* renamed from: b */
    public de0.InterfaceC1077a mo2889b() {
        return this.f33263u;
    }

    @Override // com.daaw.de0
    /* renamed from: c */
    public boolean mo2888c() {
        return this.f33266x;
    }

    @Override // com.daaw.de0
    /* renamed from: d */
    public float mo2887d() {
        return this.f33247e;
    }

    @Override // com.daaw.de0
    /* renamed from: e */
    public void mo2886e(int i) {
        if (this.f33260r == i) {
            return;
        }
        this.f33263u.f33296l.m9351r(this);
        int i2 = NativeConstants.TLS1_2_VERSION;
        if (i != 0) {
            if (i == 1) {
                i2 = NativeConstants.TLS1_VERSION;
            } else if (i == 2) {
                GLES20.glBlendFunc(1, 1);
            } else if (i == 3) {
                i2 = 0;
            } else if (i != 4) {
                if (i == 5) {
                    GLES20.glBlendFunc(NativeConstants.TLS1_1_VERSION, 1);
                }
            }
            GLES20.glBlendFunc(1, i2);
        } else {
            GLES20.glBlendFunc(NativeConstants.TLS1_1_VERSION, NativeConstants.TLS1_2_VERSION);
        }
        this.f33260r = i;
    }

    @Override // com.daaw.de0
    /* renamed from: f */
    public int mo2885f() {
        int i = this.f33258p;
        return i < 2 ? this.f33254l : i;
    }

    @Override // com.daaw.de0
    /* renamed from: g */
    public float mo2884g() {
        return this.f33253k;
    }

    @Override // com.daaw.de0
    /* renamed from: h */
    public boolean mo2883h() {
        return this.f33265w;
    }

    @Override // com.daaw.de0
    /* renamed from: i */
    public void mo2882i(e40 e40Var) {
        m4202o(e40Var, false);
    }

    /* renamed from: k */
    public void m4206k() {
        this.f33261s.f10242e++;
    }

    /* renamed from: l */
    public void m4205l() {
        this.f33261s.f10246i++;
    }

    /* renamed from: m */
    public void m4204m() {
        this.f33261s.f10247j++;
    }

    /* renamed from: n */
    public void m4203n() {
        this.f33261s.f10244g++;
    }

    /* renamed from: o */
    public void m4202o(e40 e40Var, boolean z) {
        if (z || this.f33262t != e40Var) {
            this.f33262t = e40Var;
            m4204m();
            this.f33263u.f33296l.m9351r(this);
            if (e40Var != null) {
                e40Var.mo14057c();
                Matrix.orthoM(this.f33245c, 0, 0.0f, e40Var.getWidth(), e40Var.getHeight(), 0.0f, 0.01f, 100.0f);
                Matrix.multiplyMM(this.f33244b, 0, this.f33245c, 0, this.f33246d, 0);
                return;
            }
            GLES20.glViewport(0, 0, mo2885f(), mo2890a());
            GLES20.glBindFramebuffer(36160, 0);
            Matrix.orthoM(this.f33245c, 0, 0.0f, mo2885f(), mo2890a(), 0.0f, 0.01f, 100.0f);
            Matrix.multiplyMM(this.f33244b, 0, this.f33245c, 0, this.f33246d, 0);
        }
    }

    /* renamed from: p */
    public void m4201p(dc1 dc1Var) {
        this.f33263u.f33296l.m9351r(this);
        if (dc1Var != null) {
            dc1Var.m24532z();
        }
    }

    /* renamed from: q */
    public void m4200q() {
        for (int i = 0; i < this.f33264v.size(); i++) {
            this.f33264v.set(i, null);
        }
    }

    /* renamed from: r */
    public void m4199r(pr1 pr1Var, pr1 pr1Var2) {
        Matrix.multiplyMM(pr1Var.m13202a(), 0, this.f33245c, 0, pr1Var2.m13202a(), 0);
    }

    /* renamed from: s */
    public void m4198s(pr1 pr1Var, bs1 bs1Var, e40 e40Var, float f, float f2, float f3, float f4, float f5, float f6) {
        float width;
        int height;
        if (e40Var == null) {
            width = mo2885f();
            height = mo2890a();
        } else {
            width = e40Var.getWidth();
            height = e40Var.getHeight();
        }
        float f7 = height;
        bs1Var.f5090a = width;
        bs1Var.f5091b = f7;
        this.f33241D.m13199d();
        this.f33241D.m13198e(width * f4, f7 * f5, f6);
        Matrix.perspectiveM(this.f33242E.m13202a(), 0, f, width / f7, f2, f3);
        Matrix.multiplyMM(pr1Var.m13202a(), 0, this.f33242E.m13202a(), 0, this.f33241D.m13202a(), 0);
    }

    /* renamed from: t */
    public void m4197t(bs1 bs1Var, float f, e40 e40Var, float f2, float f3) {
        double d = f;
        double tan = Math.tan(Math.toRadians(f3 * 0.5f));
        Double.isNaN(d);
        float abs = (float) Math.abs(d * tan);
        bs1Var.f5091b = abs;
        bs1Var.f5090a = abs * f2;
    }

    /* renamed from: u */
    public void m4196u(float f, float f2, int i, w31 w31Var) {
        this.f33263u.f33296l.m9354o(this, f, f2, 0.0f, mo2885f(), mo2890a(), i, bs1.m25844s(), bs1.m25846q(), w31Var, true);
    }

    /* renamed from: v */
    public void m4195v(float f, float f2, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        this.f33263u.f33296l.m9354o(this, f, f2, 0.0f, mo2885f(), mo2890a(), i, bs1Var, bs1Var2, w31Var, false);
    }

    /* renamed from: w */
    public void m4194w(int i, qc0 qc0Var, int i2) {
        this.f33263u.f33296l.m9354o(this, 0.0f, 0.0f, 0.0f, mo2885f(), mo2890a(), i, bs1.m25844s(), bs1.m25846q(), new w31(i2, qc0Var, (qr1) null, (InterfaceC1348g0<y31, sr1, w31>) null), false);
    }

    /* renamed from: x */
    public void m4193x(int i, w31 w31Var) {
        m4196u(0.0f, 0.0f, i, w31Var);
    }

    /* renamed from: y */
    public void m4192y(int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        this.f33263u.f33296l.m9354o(this, -1.0f, -1.0f, 0.0f, 2.0f, 2.0f, i, bs1Var, bs1Var2, w31Var, false);
    }

    /* renamed from: z */
    public void m4191z() {
        this.f33261s.f10238a++;
    }
}

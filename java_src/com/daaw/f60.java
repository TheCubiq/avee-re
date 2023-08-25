package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Objects;
/* loaded from: classes.dex */
public class f60<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {
    public int A;
    public q41<? super ModelType, TranscodeType> B;
    public Float C;
    public f60<?, ?, ?, TranscodeType> D;
    public Drawable F;
    public Drawable G;
    public boolean O;
    public boolean P;
    public Drawable Q;
    public int R;
    public final Class<ModelType> p;
    public final Context q;
    public final e70 r;
    public final Class<TranscodeType> s;
    public final v41 t;
    public final mj0 u;
    public cf<ModelType, DataType, ResourceType, TranscodeType> v;
    public ModelType w;
    public boolean y;
    public int z;
    public hi0 x = uw.b();
    public Float E = Float.valueOf(1.0f);
    public dz0 H = null;
    public boolean I = true;
    public g70<TranscodeType> J = vs0.d();
    public int K = -1;
    public int L = -1;
    public wt M = wt.RESULT;
    public cn1<ResourceType> N = np1.b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ o41 p;

        public a(o41 o41Var) {
            this.p = o41Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.p.isCancelled()) {
                return;
            }
            f60.this.r(this.p);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public f60(Context context, Class<ModelType> cls, ik0<ModelType, DataType, ResourceType, TranscodeType> ik0Var, Class<TranscodeType> cls2, e70 e70Var, v41 v41Var, mj0 mj0Var) {
        this.q = context;
        this.p = cls;
        this.s = cls2;
        this.r = e70Var;
        this.t = v41Var;
        this.u = mj0Var;
        this.v = ik0Var != null ? new cf<>(ik0Var) : null;
        Objects.requireNonNull(context, "Context can't be null");
        if (cls != null) {
            Objects.requireNonNull(ik0Var, "LoadProvider must not be null");
        }
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> A(cn1<ResourceType>... cn1VarArr) {
        this.O = true;
        if (cn1VarArr.length == 1) {
            this.N = cn1VarArr[0];
        } else {
            this.N = new fr0(cn1VarArr);
        }
        return this;
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> a(g70<TranscodeType> g70Var) {
        Objects.requireNonNull(g70Var, "Animation factory must not be null!");
        this.J = g70Var;
        return this;
    }

    public void b() {
    }

    public void c() {
    }

    public final l41 d(pj1<TranscodeType> pj1Var) {
        if (this.H == null) {
            this.H = dz0.NORMAL;
        }
        return e(pj1Var, null);
    }

    public final l41 e(pj1<TranscodeType> pj1Var, hl1 hl1Var) {
        hl1 hl1Var2;
        l41 u;
        l41 u2;
        f60<?, ?, ?, TranscodeType> f60Var = this.D;
        if (f60Var != null) {
            if (this.P) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (f60Var.J.equals(vs0.d())) {
                this.D.J = this.J;
            }
            f60<?, ?, ?, TranscodeType> f60Var2 = this.D;
            if (f60Var2.H == null) {
                f60Var2.H = n();
            }
            if (tq1.l(this.L, this.K)) {
                f60<?, ?, ?, TranscodeType> f60Var3 = this.D;
                if (!tq1.l(f60Var3.L, f60Var3.K)) {
                    this.D.v(this.L, this.K);
                }
            }
            hl1Var2 = new hl1(hl1Var);
            u = u(pj1Var, this.E.floatValue(), this.H, hl1Var2);
            this.P = true;
            u2 = this.D.e(pj1Var, hl1Var2);
            this.P = false;
        } else if (this.C == null) {
            return u(pj1Var, this.E.floatValue(), this.H, hl1Var);
        } else {
            hl1Var2 = new hl1(hl1Var);
            u = u(pj1Var, this.E.floatValue(), this.H, hl1Var2);
            u2 = u(pj1Var, this.C.floatValue(), n(), hl1Var2);
        }
        hl1Var2.m(u, u2);
        return hl1Var2;
    }

    @Override // 
    /* renamed from: f */
    public f60<ModelType, DataType, ResourceType, TranscodeType> clone() {
        try {
            f60<ModelType, DataType, ResourceType, TranscodeType> f60Var = (f60) super.clone();
            cf<ModelType, DataType, ResourceType, TranscodeType> cfVar = this.v;
            f60Var.v = cfVar != null ? cfVar.clone() : null;
            return f60Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> i(d51<DataType, ResourceType> d51Var) {
        cf<ModelType, DataType, ResourceType, TranscodeType> cfVar = this.v;
        if (cfVar != null) {
            cfVar.j(d51Var);
        }
        return this;
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> j(wt wtVar) {
        this.M = wtVar;
        return this;
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> k() {
        return a(vs0.d());
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> m(int i) {
        this.A = i;
        return this;
    }

    public final dz0 n() {
        dz0 dz0Var = this.H;
        return dz0Var == dz0.LOW ? dz0.NORMAL : dz0Var == dz0.NORMAL ? dz0.HIGH : dz0.IMMEDIATE;
    }

    public x50<TranscodeType> o(int i, int i2) {
        o41 o41Var = new o41(this.r.p(), i, i2);
        this.r.p().post(new a(o41Var));
        return o41Var;
    }

    public pj1<TranscodeType> p(ImageView imageView) {
        tq1.b();
        if (imageView != null) {
            if (!this.O && imageView.getScaleType() != null) {
                int i = b.a[imageView.getScaleType().ordinal()];
                if (i == 1) {
                    b();
                } else if (i == 2 || i == 3 || i == 4) {
                    c();
                }
            }
            return r(this.r.c(imageView, this.s));
        }
        throw new IllegalArgumentException("You must pass in a non null View");
    }

    public <Y extends pj1<TranscodeType>> Y r(Y y) {
        tq1.b();
        if (y != null) {
            if (this.y) {
                l41 j = y.j();
                if (j != null) {
                    j.clear();
                    this.t.c(j);
                    j.c();
                }
                l41 d = d(y);
                y.b(d);
                this.u.a(y);
                this.t.f(d);
                return y;
            }
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        throw new IllegalArgumentException("You must pass in a non null Target");
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> s(q41<? super ModelType, TranscodeType> q41Var) {
        this.B = q41Var;
        return this;
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> t(ModelType modeltype) {
        this.w = modeltype;
        this.y = true;
        return this;
    }

    public final l41 u(pj1<TranscodeType> pj1Var, float f, dz0 dz0Var, m41 m41Var) {
        return e60.v(this.v, this.w, this.x, this.q, dz0Var, pj1Var, f, this.F, this.z, this.G, this.A, this.Q, this.R, this.B, m41Var, this.r.n(), this.N, this.s, this.I, this.J, this.L, this.K, this.M);
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> v(int i, int i2) {
        if (tq1.l(i, i2)) {
            this.L = i;
            this.K = i2;
            return this;
        }
        throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> w(int i) {
        this.z = i;
        return this;
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> x(hi0 hi0Var) {
        Objects.requireNonNull(hi0Var, "Signature must not be null");
        this.x = hi0Var;
        return this;
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> y(boolean z) {
        this.I = !z;
        return this;
    }

    public f60<ModelType, DataType, ResourceType, TranscodeType> z(zw<DataType> zwVar) {
        cf<ModelType, DataType, ResourceType, TranscodeType> cfVar = this.v;
        if (cfVar != null) {
            cfVar.k(zwVar);
        }
        return this;
    }
}

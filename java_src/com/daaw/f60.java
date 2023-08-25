package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Objects;
/* loaded from: classes.dex */
public class f60<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {

    /* renamed from: A */
    public int f9144A;

    /* renamed from: B */
    public q41<? super ModelType, TranscodeType> f9145B;

    /* renamed from: C */
    public Float f9146C;

    /* renamed from: D */
    public f60<?, ?, ?, TranscodeType> f9147D;

    /* renamed from: F */
    public Drawable f9149F;

    /* renamed from: G */
    public Drawable f9150G;

    /* renamed from: O */
    public boolean f9158O;

    /* renamed from: P */
    public boolean f9159P;

    /* renamed from: Q */
    public Drawable f9160Q;

    /* renamed from: R */
    public int f9161R;

    /* renamed from: p */
    public final Class<ModelType> f9162p;

    /* renamed from: q */
    public final Context f9163q;

    /* renamed from: r */
    public final e70 f9164r;

    /* renamed from: s */
    public final Class<TranscodeType> f9165s;

    /* renamed from: t */
    public final v41 f9166t;

    /* renamed from: u */
    public final mj0 f9167u;

    /* renamed from: v */
    public C0950cf<ModelType, DataType, ResourceType, TranscodeType> f9168v;

    /* renamed from: w */
    public ModelType f9169w;

    /* renamed from: y */
    public boolean f9171y;

    /* renamed from: z */
    public int f9172z;

    /* renamed from: x */
    public hi0 f9170x = C3262uw.m7669b();

    /* renamed from: E */
    public Float f9148E = Float.valueOf(1.0f);

    /* renamed from: H */
    public dz0 f9151H = null;

    /* renamed from: I */
    public boolean f9152I = true;

    /* renamed from: J */
    public g70<TranscodeType> f9153J = vs0.m6822d();

    /* renamed from: K */
    public int f9154K = -1;

    /* renamed from: L */
    public int f9155L = -1;

    /* renamed from: M */
    public EnumC3465wt f9156M = EnumC3465wt.RESULT;

    /* renamed from: N */
    public cn1<ResourceType> f9157N = np1.m14899b();

    /* renamed from: com.daaw.f60$a */
    /* loaded from: classes.dex */
    public class RunnableC1253a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ o41 f9173p;

        public RunnableC1253a(o41 o41Var) {
            this.f9173p = o41Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9173p.isCancelled()) {
                return;
            }
            f60.this.m22906r(this.f9173p);
        }
    }

    /* renamed from: com.daaw.f60$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1254b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9175a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f9175a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9175a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9175a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9175a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public f60(Context context, Class<ModelType> cls, ik0<ModelType, DataType, ResourceType, TranscodeType> ik0Var, Class<TranscodeType> cls2, e70 e70Var, v41 v41Var, mj0 mj0Var) {
        this.f9163q = context;
        this.f9162p = cls;
        this.f9165s = cls2;
        this.f9164r = e70Var;
        this.f9166t = v41Var;
        this.f9167u = mj0Var;
        this.f9168v = ik0Var != null ? new C0950cf<>(ik0Var) : null;
        Objects.requireNonNull(context, "Context can't be null");
        if (cls != null) {
            Objects.requireNonNull(ik0Var, "LoadProvider must not be null");
        }
    }

    /* renamed from: A */
    public f60<ModelType, DataType, ResourceType, TranscodeType> mo9879A(cn1<ResourceType>... cn1VarArr) {
        this.f9158O = true;
        if (cn1VarArr.length == 1) {
            this.f9157N = cn1VarArr[0];
        } else {
            this.f9157N = new fr0(cn1VarArr);
        }
        return this;
    }

    /* renamed from: a */
    public f60<ModelType, DataType, ResourceType, TranscodeType> mo9862a(g70<TranscodeType> g70Var) {
        Objects.requireNonNull(g70Var, "Animation factory must not be null!");
        this.f9153J = g70Var;
        return this;
    }

    /* renamed from: b */
    public void mo9861b() {
    }

    /* renamed from: c */
    public void mo9860c() {
    }

    /* renamed from: d */
    public final l41 m22912d(pj1<TranscodeType> pj1Var) {
        if (this.f9151H == null) {
            this.f9151H = dz0.NORMAL;
        }
        return m22911e(pj1Var, null);
    }

    /* renamed from: e */
    public final l41 m22911e(pj1<TranscodeType> pj1Var, hl1 hl1Var) {
        hl1 hl1Var2;
        l41 m22903u;
        l41 m22903u2;
        f60<?, ?, ?, TranscodeType> f60Var = this.f9147D;
        if (f60Var != null) {
            if (this.f9159P) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (f60Var.f9153J.equals(vs0.m6822d())) {
                this.f9147D.f9153J = this.f9153J;
            }
            f60<?, ?, ?, TranscodeType> f60Var2 = this.f9147D;
            if (f60Var2.f9151H == null) {
                f60Var2.f9151H = m22908n();
            }
            if (tq1.m8859l(this.f9155L, this.f9154K)) {
                f60<?, ?, ?, TranscodeType> f60Var3 = this.f9147D;
                if (!tq1.m8859l(f60Var3.f9155L, f60Var3.f9154K)) {
                    this.f9147D.mo9855v(this.f9155L, this.f9154K);
                }
            }
            hl1Var2 = new hl1(hl1Var);
            m22903u = m22903u(pj1Var, this.f9148E.floatValue(), this.f9151H, hl1Var2);
            this.f9159P = true;
            m22903u2 = this.f9147D.m22911e(pj1Var, hl1Var2);
            this.f9159P = false;
        } else if (this.f9146C == null) {
            return m22903u(pj1Var, this.f9148E.floatValue(), this.f9151H, hl1Var);
        } else {
            hl1Var2 = new hl1(hl1Var);
            m22903u = m22903u(pj1Var, this.f9148E.floatValue(), this.f9151H, hl1Var2);
            m22903u2 = m22903u(pj1Var, this.f9146C.floatValue(), m22908n(), hl1Var2);
        }
        hl1Var2.m20640m(m22903u, m22903u2);
        return hl1Var2;
    }

    @Override // 
    /* renamed from: f */
    public f60<ModelType, DataType, ResourceType, TranscodeType> clone() {
        try {
            f60<ModelType, DataType, ResourceType, TranscodeType> f60Var = (f60) super.clone();
            C0950cf<ModelType, DataType, ResourceType, TranscodeType> c0950cf = this.f9168v;
            f60Var.f9168v = c0950cf != null ? c0950cf.clone() : null;
            return f60Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    public f60<ModelType, DataType, ResourceType, TranscodeType> mo9858i(d51<DataType, ResourceType> d51Var) {
        C0950cf<ModelType, DataType, ResourceType, TranscodeType> c0950cf = this.f9168v;
        if (c0950cf != null) {
            c0950cf.m25406j(d51Var);
        }
        return this;
    }

    /* renamed from: j */
    public f60<ModelType, DataType, ResourceType, TranscodeType> mo9857j(EnumC3465wt enumC3465wt) {
        this.f9156M = enumC3465wt;
        return this;
    }

    /* renamed from: k */
    public f60<ModelType, DataType, ResourceType, TranscodeType> m22910k() {
        return mo9862a(vs0.m6822d());
    }

    /* renamed from: m */
    public f60<ModelType, DataType, ResourceType, TranscodeType> m22909m(int i) {
        this.f9144A = i;
        return this;
    }

    /* renamed from: n */
    public final dz0 m22908n() {
        dz0 dz0Var = this.f9151H;
        return dz0Var == dz0.LOW ? dz0.NORMAL : dz0Var == dz0.NORMAL ? dz0.HIGH : dz0.IMMEDIATE;
    }

    /* renamed from: o */
    public x50<TranscodeType> m22907o(int i, int i2) {
        o41 o41Var = new o41(this.f9164r.m23679p(), i, i2);
        this.f9164r.m23679p().post(new RunnableC1253a(o41Var));
        return o41Var;
    }

    /* renamed from: p */
    public pj1<TranscodeType> mo9856p(ImageView imageView) {
        tq1.m8869b();
        if (imageView != null) {
            if (!this.f9158O && imageView.getScaleType() != null) {
                int i = C1254b.f9175a[imageView.getScaleType().ordinal()];
                if (i == 1) {
                    mo9861b();
                } else if (i == 2 || i == 3 || i == 4) {
                    mo9860c();
                }
            }
            return m22906r(this.f9164r.m23692c(imageView, this.f9165s));
        }
        throw new IllegalArgumentException("You must pass in a non null View");
    }

    /* renamed from: r */
    public <Y extends pj1<TranscodeType>> Y m22906r(Y y) {
        tq1.m8869b();
        if (y != null) {
            if (this.f9171y) {
                l41 mo3964j = y.mo3964j();
                if (mo3964j != null) {
                    mo3964j.clear();
                    this.f9166t.m7462c(mo3964j);
                    mo3964j.mo17162c();
                }
                l41 m22912d = m22912d(y);
                y.mo3968b(m22912d);
                this.f9167u.mo11891a(y);
                this.f9166t.m7459f(m22912d);
                return y;
            }
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        throw new IllegalArgumentException("You must pass in a non null Target");
    }

    /* renamed from: s */
    public f60<ModelType, DataType, ResourceType, TranscodeType> m22905s(q41<? super ModelType, TranscodeType> q41Var) {
        this.f9145B = q41Var;
        return this;
    }

    /* renamed from: t */
    public f60<ModelType, DataType, ResourceType, TranscodeType> m22904t(ModelType modeltype) {
        this.f9169w = modeltype;
        this.f9171y = true;
        return this;
    }

    /* renamed from: u */
    public final l41 m22903u(pj1<TranscodeType> pj1Var, float f, dz0 dz0Var, m41 m41Var) {
        return e60.m23706v(this.f9168v, this.f9169w, this.f9170x, this.f9163q, dz0Var, pj1Var, f, this.f9149F, this.f9172z, this.f9150G, this.f9144A, this.f9160Q, this.f9161R, this.f9145B, m41Var, this.f9164r.m23681n(), this.f9157N, this.f9165s, this.f9152I, this.f9153J, this.f9155L, this.f9154K, this.f9156M);
    }

    /* renamed from: v */
    public f60<ModelType, DataType, ResourceType, TranscodeType> mo9855v(int i, int i2) {
        if (tq1.m8859l(i, i2)) {
            this.f9155L = i;
            this.f9154K = i2;
            return this;
        }
        throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
    }

    /* renamed from: w */
    public f60<ModelType, DataType, ResourceType, TranscodeType> m22902w(int i) {
        this.f9172z = i;
        return this;
    }

    /* renamed from: x */
    public f60<ModelType, DataType, ResourceType, TranscodeType> mo9854x(hi0 hi0Var) {
        Objects.requireNonNull(hi0Var, "Signature must not be null");
        this.f9170x = hi0Var;
        return this;
    }

    /* renamed from: y */
    public f60<ModelType, DataType, ResourceType, TranscodeType> mo9853y(boolean z) {
        this.f9152I = !z;
        return this;
    }

    /* renamed from: z */
    public f60<ModelType, DataType, ResourceType, TranscodeType> m22901z(InterfaceC3911zw<DataType> interfaceC3911zw) {
        C0950cf<ModelType, DataType, ResourceType, TranscodeType> c0950cf = this.f9168v;
        if (c0950cf != null) {
            c0950cf.m25405k(interfaceC3911zw);
        }
        return this;
    }
}

package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.daaw.C1336fx;
import java.util.Queue;
/* loaded from: classes.dex */
public final class e60<A, T, Z, R> implements l41, sd1, b51 {

    /* renamed from: D */
    public static final Queue<e60<?, ?, ?, ?>> f8146D = tq1.m8867d(0);

    /* renamed from: A */
    public C1336fx.C1339c f8147A;

    /* renamed from: B */
    public long f8148B;

    /* renamed from: C */
    public EnumC1163a f8149C;

    /* renamed from: a */
    public final String f8150a = String.valueOf(hashCode());

    /* renamed from: b */
    public hi0 f8151b;

    /* renamed from: c */
    public Drawable f8152c;

    /* renamed from: d */
    public int f8153d;

    /* renamed from: e */
    public int f8154e;

    /* renamed from: f */
    public int f8155f;

    /* renamed from: g */
    public Context f8156g;

    /* renamed from: h */
    public cn1<Z> f8157h;

    /* renamed from: i */
    public ik0<A, T, Z, R> f8158i;

    /* renamed from: j */
    public m41 f8159j;

    /* renamed from: k */
    public A f8160k;

    /* renamed from: l */
    public Class<R> f8161l;

    /* renamed from: m */
    public boolean f8162m;

    /* renamed from: n */
    public dz0 f8163n;

    /* renamed from: o */
    public pj1<R> f8164o;

    /* renamed from: p */
    public q41<? super A, R> f8165p;

    /* renamed from: q */
    public float f8166q;

    /* renamed from: r */
    public C1336fx f8167r;

    /* renamed from: s */
    public g70<R> f8168s;

    /* renamed from: t */
    public int f8169t;

    /* renamed from: u */
    public int f8170u;

    /* renamed from: v */
    public EnumC3465wt f8171v;

    /* renamed from: w */
    public Drawable f8172w;

    /* renamed from: x */
    public Drawable f8173x;

    /* renamed from: y */
    public boolean f8174y;

    /* renamed from: z */
    public z41<?> f8175z;

    /* renamed from: com.daaw.e60$a */
    /* loaded from: classes.dex */
    public enum EnumC1163a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    /* renamed from: m */
    public static void m23715m(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" must not be null");
            if (str2 != null) {
                sb.append(", ");
                sb.append(str2);
            }
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: v */
    public static <A, T, Z, R> e60<A, T, Z, R> m23706v(ik0<A, T, Z, R> ik0Var, A a, hi0 hi0Var, Context context, dz0 dz0Var, pj1<R> pj1Var, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, q41<? super A, R> q41Var, m41 m41Var, C1336fx c1336fx, cn1<Z> cn1Var, Class<R> cls, boolean z, g70<R> g70Var, int i4, int i5, EnumC3465wt enumC3465wt) {
        e60<?, ?, ?, ?> poll = f8146D.poll();
        if (poll == null) {
            poll = new e60();
        }
        poll.m23711q(ik0Var, a, hi0Var, context, dz0Var, pj1Var, f, drawable, i, drawable2, i2, drawable3, i3, q41Var, m41Var, c1336fx, cn1Var, cls, z, g70Var, i4, i5, enumC3465wt);
        return poll;
    }

    @Override // com.daaw.b51
    /* renamed from: a */
    public void mo21159a(Exception exc) {
        this.f8149C = EnumC1163a.FAILED;
        q41<? super A, R> q41Var = this.f8165p;
        if (q41Var == null || !q41Var.mo12777a(exc, (A) this.f8160k, this.f8164o, m23709s())) {
            m23703y(exc);
        }
    }

    @Override // com.daaw.l41
    /* renamed from: b */
    public void mo17163b() {
        clear();
        this.f8149C = EnumC1163a.PAUSED;
    }

    @Override // com.daaw.l41
    /* renamed from: c */
    public void mo17162c() {
        this.f8158i = null;
        this.f8160k = null;
        this.f8156g = null;
        this.f8164o = null;
        this.f8172w = null;
        this.f8173x = null;
        this.f8152c = null;
        this.f8165p = null;
        this.f8159j = null;
        this.f8157h = null;
        this.f8168s = null;
        this.f8174y = false;
        this.f8147A = null;
        f8146D.offer(this);
    }

    @Override // com.daaw.l41
    public void clear() {
        tq1.m8869b();
        EnumC1163a enumC1163a = this.f8149C;
        EnumC1163a enumC1163a2 = EnumC1163a.CLEARED;
        if (enumC1163a == enumC1163a2) {
            return;
        }
        m23716l();
        z41<?> z41Var = this.f8175z;
        if (z41Var != null) {
            m23704x(z41Var);
        }
        if (m23718j()) {
            this.f8164o.mo3963k(m23712p());
        }
        this.f8149C = enumC1163a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.b51
    /* renamed from: d */
    public void mo21156d(z41<?> z41Var) {
        if (z41Var == null) {
            mo21159a(new Exception("Expected to receive a Resource<R> with an object of " + this.f8161l + " inside, but instead got null."));
            return;
        }
        Object obj = z41Var.get();
        if (obj != null && this.f8161l.isAssignableFrom(obj.getClass())) {
            if (m23717k()) {
                m23705w(z41Var, obj);
                return;
            }
            m23704x(z41Var);
            this.f8149C = EnumC1163a.COMPLETE;
            return;
        }
        m23704x(z41Var);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.f8161l);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("}");
        sb.append(" inside Resource{");
        sb.append(z41Var);
        sb.append("}.");
        sb.append(obj == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : "");
        mo21159a(new Exception(sb.toString()));
    }

    @Override // com.daaw.l41
    /* renamed from: e */
    public boolean mo17161e() {
        return mo17159i();
    }

    @Override // com.daaw.sd1
    /* renamed from: f */
    public void mo10453f(int i, int i2) {
        if (Log.isLoggable("GenericRequest", 2)) {
            m23708t("Got onSizeReady in " + jl0.m18441a(this.f8148B));
        }
        if (this.f8149C != EnumC1163a.WAITING_FOR_SIZE) {
            return;
        }
        this.f8149C = EnumC1163a.RUNNING;
        int round = Math.round(this.f8166q * i);
        int round2 = Math.round(this.f8166q * i2);
        InterfaceC1744ip<T> mo3764a = this.f8158i.mo18072f().mo3764a(this.f8160k, round, round2);
        if (mo3764a == null) {
            mo21159a(new Exception("Failed to load model: '" + this.f8160k + "'"));
            return;
        }
        i51<Z, R> mo18073b = this.f8158i.mo18073b();
        if (Log.isLoggable("GenericRequest", 2)) {
            m23708t("finished setup for calling load in " + jl0.m18441a(this.f8148B));
        }
        this.f8174y = true;
        this.f8147A = this.f8167r.m22177g(this.f8151b, round, round2, mo3764a, this.f8158i, this.f8157h, mo18073b, this.f8163n, this.f8162m, this.f8171v, this);
        this.f8174y = this.f8175z != null;
        if (Log.isLoggable("GenericRequest", 2)) {
            m23708t("finished onSizeReady in " + jl0.m18441a(this.f8148B));
        }
    }

    @Override // com.daaw.l41
    /* renamed from: g */
    public void mo17160g() {
        this.f8148B = jl0.m18440b();
        if (this.f8160k == null) {
            mo21159a(null);
            return;
        }
        this.f8149C = EnumC1163a.WAITING_FOR_SIZE;
        if (tq1.m8859l(this.f8169t, this.f8170u)) {
            mo10453f(this.f8169t, this.f8170u);
        } else {
            this.f8164o.mo13330e(this);
        }
        if (!mo17159i() && !m23710r() && m23718j()) {
            this.f8164o.mo3965i(m23712p());
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            m23708t("finished run method in " + jl0.m18441a(this.f8148B));
        }
    }

    @Override // com.daaw.l41
    /* renamed from: i */
    public boolean mo17159i() {
        return this.f8149C == EnumC1163a.COMPLETE;
    }

    @Override // com.daaw.l41
    public boolean isCancelled() {
        EnumC1163a enumC1163a = this.f8149C;
        return enumC1163a == EnumC1163a.CANCELLED || enumC1163a == EnumC1163a.CLEARED;
    }

    @Override // com.daaw.l41
    public boolean isRunning() {
        EnumC1163a enumC1163a = this.f8149C;
        return enumC1163a == EnumC1163a.RUNNING || enumC1163a == EnumC1163a.WAITING_FOR_SIZE;
    }

    /* renamed from: j */
    public final boolean m23718j() {
        m41 m41Var = this.f8159j;
        return m41Var == null || m41Var.mo16226d(this);
    }

    /* renamed from: k */
    public final boolean m23717k() {
        m41 m41Var = this.f8159j;
        return m41Var == null || m41Var.mo16224h(this);
    }

    /* renamed from: l */
    public void m23716l() {
        this.f8149C = EnumC1163a.CANCELLED;
        C1336fx.C1339c c1339c = this.f8147A;
        if (c1339c != null) {
            c1339c.m22170a();
            this.f8147A = null;
        }
    }

    /* renamed from: n */
    public final Drawable m23714n() {
        if (this.f8173x == null && this.f8155f > 0) {
            this.f8173x = this.f8156g.getResources().getDrawable(this.f8155f);
        }
        return this.f8173x;
    }

    /* renamed from: o */
    public final Drawable m23713o() {
        if (this.f8152c == null && this.f8153d > 0) {
            this.f8152c = this.f8156g.getResources().getDrawable(this.f8153d);
        }
        return this.f8152c;
    }

    /* renamed from: p */
    public final Drawable m23712p() {
        if (this.f8172w == null && this.f8154e > 0) {
            this.f8172w = this.f8156g.getResources().getDrawable(this.f8154e);
        }
        return this.f8172w;
    }

    /* renamed from: q */
    public final void m23711q(ik0<A, T, Z, R> ik0Var, A a, hi0 hi0Var, Context context, dz0 dz0Var, pj1<R> pj1Var, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, q41<? super A, R> q41Var, m41 m41Var, C1336fx c1336fx, cn1<Z> cn1Var, Class<R> cls, boolean z, g70<R> g70Var, int i4, int i5, EnumC3465wt enumC3465wt) {
        Object mo6616d;
        String str;
        String str2;
        this.f8158i = ik0Var;
        this.f8160k = a;
        this.f8151b = hi0Var;
        this.f8152c = drawable3;
        this.f8153d = i3;
        this.f8156g = context.getApplicationContext();
        this.f8163n = dz0Var;
        this.f8164o = pj1Var;
        this.f8166q = f;
        this.f8172w = drawable;
        this.f8154e = i;
        this.f8173x = drawable2;
        this.f8155f = i2;
        this.f8165p = q41Var;
        this.f8159j = m41Var;
        this.f8167r = c1336fx;
        this.f8157h = cn1Var;
        this.f8161l = cls;
        this.f8162m = z;
        this.f8168s = g70Var;
        this.f8169t = i4;
        this.f8170u = i5;
        this.f8171v = enumC3465wt;
        this.f8149C = EnumC1163a.PENDING;
        if (a != null) {
            m23715m("ModelLoader", ik0Var.mo18072f(), "try .using(ModelLoader)");
            m23715m("Transcoder", ik0Var.mo18073b(), "try .as*(Class).transcode(ResourceTranscoder)");
            m23715m("Transformation", cn1Var, "try .transform(UnitTransformation.get())");
            if (enumC3465wt.m5818b()) {
                mo6616d = ik0Var.mo6618a();
                str = "SourceEncoder";
                str2 = "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)";
            } else {
                mo6616d = ik0Var.mo6616d();
                str = "SourceDecoder";
                str2 = "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)";
            }
            m23715m(str, mo6616d, str2);
            if (enumC3465wt.m5818b() || enumC3465wt.m5819a()) {
                m23715m("CacheDecoder", ik0Var.mo6615e(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (enumC3465wt.m5819a()) {
                m23715m("Encoder", ik0Var.mo6617c(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    /* renamed from: r */
    public boolean m23710r() {
        return this.f8149C == EnumC1163a.FAILED;
    }

    /* renamed from: s */
    public final boolean m23709s() {
        m41 m41Var = this.f8159j;
        return m41Var == null || !m41Var.mo16227a();
    }

    /* renamed from: t */
    public final void m23708t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f8150a);
    }

    /* renamed from: u */
    public final void m23707u() {
        m41 m41Var = this.f8159j;
        if (m41Var != null) {
            m41Var.mo16225f(this);
        }
    }

    /* renamed from: w */
    public final void m23705w(z41<?> z41Var, R r) {
        boolean m23709s = m23709s();
        this.f8149C = EnumC1163a.COMPLETE;
        this.f8175z = z41Var;
        q41<? super A, R> q41Var = this.f8165p;
        if (q41Var == null || !q41Var.mo12776b(r, (A) this.f8160k, this.f8164o, this.f8174y, m23709s)) {
            this.f8164o.mo5506c(r, this.f8168s.mo6821a(this.f8174y, m23709s));
        }
        m23707u();
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resource ready in ");
            sb.append(jl0.m18441a(this.f8148B));
            sb.append(" size: ");
            double mo2828a = z41Var.mo2828a();
            Double.isNaN(mo2828a);
            sb.append(mo2828a * 9.5367431640625E-7d);
            sb.append(" fromCache: ");
            sb.append(this.f8174y);
            m23708t(sb.toString());
        }
    }

    /* renamed from: x */
    public final void m23704x(z41 z41Var) {
        this.f8167r.m22173k(z41Var);
        this.f8175z = null;
    }

    /* renamed from: y */
    public final void m23703y(Exception exc) {
        if (m23718j()) {
            Drawable m23713o = this.f8160k == null ? m23713o() : null;
            if (m23713o == null) {
                m23713o = m23714n();
            }
            if (m23713o == null) {
                m23713o = m23712p();
            }
            this.f8164o.mo3967g(exc, m23713o);
        }
    }
}

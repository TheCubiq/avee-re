package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.daaw.fx;
import java.util.Queue;
/* loaded from: classes.dex */
public final class e60<A, T, Z, R> implements l41, sd1, b51 {
    public static final Queue<e60<?, ?, ?, ?>> D = tq1.d(0);
    public fx.c A;
    public long B;
    public a C;
    public final String a = String.valueOf(hashCode());
    public hi0 b;
    public Drawable c;
    public int d;
    public int e;
    public int f;
    public Context g;
    public cn1<Z> h;
    public ik0<A, T, Z, R> i;
    public m41 j;
    public A k;
    public Class<R> l;
    public boolean m;
    public dz0 n;
    public pj1<R> o;
    public q41<? super A, R> p;
    public float q;
    public fx r;
    public g70<R> s;
    public int t;
    public int u;
    public wt v;
    public Drawable w;
    public Drawable x;
    public boolean y;
    public z41<?> z;

    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    public static void m(String str, Object obj, String str2) {
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

    public static <A, T, Z, R> e60<A, T, Z, R> v(ik0<A, T, Z, R> ik0Var, A a2, hi0 hi0Var, Context context, dz0 dz0Var, pj1<R> pj1Var, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, q41<? super A, R> q41Var, m41 m41Var, fx fxVar, cn1<Z> cn1Var, Class<R> cls, boolean z, g70<R> g70Var, int i4, int i5, wt wtVar) {
        e60<?, ?, ?, ?> poll = D.poll();
        if (poll == null) {
            poll = new e60();
        }
        poll.q(ik0Var, a2, hi0Var, context, dz0Var, pj1Var, f, drawable, i, drawable2, i2, drawable3, i3, q41Var, m41Var, fxVar, cn1Var, cls, z, g70Var, i4, i5, wtVar);
        return poll;
    }

    @Override // com.daaw.b51
    public void a(Exception exc) {
        this.C = a.FAILED;
        q41<? super A, R> q41Var = this.p;
        if (q41Var == null || !q41Var.a(exc, (A) this.k, this.o, s())) {
            y(exc);
        }
    }

    @Override // com.daaw.l41
    public void b() {
        clear();
        this.C = a.PAUSED;
    }

    @Override // com.daaw.l41
    public void c() {
        this.i = null;
        this.k = null;
        this.g = null;
        this.o = null;
        this.w = null;
        this.x = null;
        this.c = null;
        this.p = null;
        this.j = null;
        this.h = null;
        this.s = null;
        this.y = false;
        this.A = null;
        D.offer(this);
    }

    @Override // com.daaw.l41
    public void clear() {
        tq1.b();
        a aVar = this.C;
        a aVar2 = a.CLEARED;
        if (aVar == aVar2) {
            return;
        }
        l();
        z41<?> z41Var = this.z;
        if (z41Var != null) {
            x(z41Var);
        }
        if (j()) {
            this.o.k(p());
        }
        this.C = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.b51
    public void d(z41<?> z41Var) {
        if (z41Var == null) {
            a(new Exception("Expected to receive a Resource<R> with an object of " + this.l + " inside, but instead got null."));
            return;
        }
        Object obj = z41Var.get();
        if (obj != null && this.l.isAssignableFrom(obj.getClass())) {
            if (k()) {
                w(z41Var, obj);
                return;
            }
            x(z41Var);
            this.C = a.COMPLETE;
            return;
        }
        x(z41Var);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.l);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("}");
        sb.append(" inside Resource{");
        sb.append(z41Var);
        sb.append("}.");
        sb.append(obj == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : "");
        a(new Exception(sb.toString()));
    }

    @Override // com.daaw.l41
    public boolean e() {
        return i();
    }

    @Override // com.daaw.sd1
    public void f(int i, int i2) {
        if (Log.isLoggable("GenericRequest", 2)) {
            t("Got onSizeReady in " + jl0.a(this.B));
        }
        if (this.C != a.WAITING_FOR_SIZE) {
            return;
        }
        this.C = a.RUNNING;
        int round = Math.round(this.q * i);
        int round2 = Math.round(this.q * i2);
        ip<T> a2 = this.i.f().a(this.k, round, round2);
        if (a2 == null) {
            a(new Exception("Failed to load model: '" + this.k + "'"));
            return;
        }
        i51<Z, R> b = this.i.b();
        if (Log.isLoggable("GenericRequest", 2)) {
            t("finished setup for calling load in " + jl0.a(this.B));
        }
        this.y = true;
        this.A = this.r.g(this.b, round, round2, a2, this.i, this.h, b, this.n, this.m, this.v, this);
        this.y = this.z != null;
        if (Log.isLoggable("GenericRequest", 2)) {
            t("finished onSizeReady in " + jl0.a(this.B));
        }
    }

    @Override // com.daaw.l41
    public void g() {
        this.B = jl0.b();
        if (this.k == null) {
            a(null);
            return;
        }
        this.C = a.WAITING_FOR_SIZE;
        if (tq1.l(this.t, this.u)) {
            f(this.t, this.u);
        } else {
            this.o.e(this);
        }
        if (!i() && !r() && j()) {
            this.o.i(p());
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            t("finished run method in " + jl0.a(this.B));
        }
    }

    @Override // com.daaw.l41
    public boolean i() {
        return this.C == a.COMPLETE;
    }

    @Override // com.daaw.l41
    public boolean isCancelled() {
        a aVar = this.C;
        return aVar == a.CANCELLED || aVar == a.CLEARED;
    }

    @Override // com.daaw.l41
    public boolean isRunning() {
        a aVar = this.C;
        return aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
    }

    public final boolean j() {
        m41 m41Var = this.j;
        return m41Var == null || m41Var.d(this);
    }

    public final boolean k() {
        m41 m41Var = this.j;
        return m41Var == null || m41Var.h(this);
    }

    public void l() {
        this.C = a.CANCELLED;
        fx.c cVar = this.A;
        if (cVar != null) {
            cVar.a();
            this.A = null;
        }
    }

    public final Drawable n() {
        if (this.x == null && this.f > 0) {
            this.x = this.g.getResources().getDrawable(this.f);
        }
        return this.x;
    }

    public final Drawable o() {
        if (this.c == null && this.d > 0) {
            this.c = this.g.getResources().getDrawable(this.d);
        }
        return this.c;
    }

    public final Drawable p() {
        if (this.w == null && this.e > 0) {
            this.w = this.g.getResources().getDrawable(this.e);
        }
        return this.w;
    }

    public final void q(ik0<A, T, Z, R> ik0Var, A a2, hi0 hi0Var, Context context, dz0 dz0Var, pj1<R> pj1Var, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, q41<? super A, R> q41Var, m41 m41Var, fx fxVar, cn1<Z> cn1Var, Class<R> cls, boolean z, g70<R> g70Var, int i4, int i5, wt wtVar) {
        Object d;
        String str;
        String str2;
        this.i = ik0Var;
        this.k = a2;
        this.b = hi0Var;
        this.c = drawable3;
        this.d = i3;
        this.g = context.getApplicationContext();
        this.n = dz0Var;
        this.o = pj1Var;
        this.q = f;
        this.w = drawable;
        this.e = i;
        this.x = drawable2;
        this.f = i2;
        this.p = q41Var;
        this.j = m41Var;
        this.r = fxVar;
        this.h = cn1Var;
        this.l = cls;
        this.m = z;
        this.s = g70Var;
        this.t = i4;
        this.u = i5;
        this.v = wtVar;
        this.C = a.PENDING;
        if (a2 != null) {
            m("ModelLoader", ik0Var.f(), "try .using(ModelLoader)");
            m("Transcoder", ik0Var.b(), "try .as*(Class).transcode(ResourceTranscoder)");
            m("Transformation", cn1Var, "try .transform(UnitTransformation.get())");
            if (wtVar.b()) {
                d = ik0Var.a();
                str = "SourceEncoder";
                str2 = "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)";
            } else {
                d = ik0Var.d();
                str = "SourceDecoder";
                str2 = "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)";
            }
            m(str, d, str2);
            if (wtVar.b() || wtVar.a()) {
                m("CacheDecoder", ik0Var.e(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (wtVar.a()) {
                m("Encoder", ik0Var.c(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    public boolean r() {
        return this.C == a.FAILED;
    }

    public final boolean s() {
        m41 m41Var = this.j;
        return m41Var == null || !m41Var.a();
    }

    public final void t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.a);
    }

    public final void u() {
        m41 m41Var = this.j;
        if (m41Var != null) {
            m41Var.f(this);
        }
    }

    public final void w(z41<?> z41Var, R r) {
        boolean s = s();
        this.C = a.COMPLETE;
        this.z = z41Var;
        q41<? super A, R> q41Var = this.p;
        if (q41Var == null || !q41Var.b(r, (A) this.k, this.o, this.y, s)) {
            this.o.c(r, this.s.a(this.y, s));
        }
        u();
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resource ready in ");
            sb.append(jl0.a(this.B));
            sb.append(" size: ");
            double a2 = z41Var.a();
            Double.isNaN(a2);
            sb.append(a2 * 9.5367431640625E-7d);
            sb.append(" fromCache: ");
            sb.append(this.y);
            t(sb.toString());
        }
    }

    public final void x(z41 z41Var) {
        this.r.k(z41Var);
        this.z = null;
    }

    public final void y(Exception exc) {
        if (j()) {
            Drawable o = this.k == null ? o() : null;
            if (o == null) {
                o = n();
            }
            if (o == null) {
                o = p();
            }
            this.o.g(exc, o);
        }
    }
}

package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* loaded from: classes2.dex */
public class gc1 {
    public static final ll m = new o31(0.5f);
    public ml a;
    public ml b;
    public ml c;
    public ml d;
    public ll e;
    public ll f;
    public ll g;
    public ll h;
    public rv i;
    public rv j;
    public rv k;
    public rv l;

    /* loaded from: classes2.dex */
    public static final class b {
        public ml a;
        public ml b;
        public ml c;
        public ml d;
        public ll e;
        public ll f;
        public ll g;
        public ll h;
        public rv i;
        public rv j;
        public rv k;
        public rv l;

        public b() {
            this.a = on0.b();
            this.b = on0.b();
            this.c = on0.b();
            this.d = on0.b();
            this.e = new e(0.0f);
            this.f = new e(0.0f);
            this.g = new e(0.0f);
            this.h = new e(0.0f);
            this.i = on0.c();
            this.j = on0.c();
            this.k = on0.c();
            this.l = on0.c();
        }

        public b(gc1 gc1Var) {
            this.a = on0.b();
            this.b = on0.b();
            this.c = on0.b();
            this.d = on0.b();
            this.e = new e(0.0f);
            this.f = new e(0.0f);
            this.g = new e(0.0f);
            this.h = new e(0.0f);
            this.i = on0.c();
            this.j = on0.c();
            this.k = on0.c();
            this.l = on0.c();
            this.a = gc1Var.a;
            this.b = gc1Var.b;
            this.c = gc1Var.c;
            this.d = gc1Var.d;
            this.e = gc1Var.e;
            this.f = gc1Var.f;
            this.g = gc1Var.g;
            this.h = gc1Var.h;
            this.i = gc1Var.i;
            this.j = gc1Var.j;
            this.k = gc1Var.k;
            this.l = gc1Var.l;
        }

        public static float n(ml mlVar) {
            if (mlVar instanceof j61) {
                return ((j61) mlVar).a;
            }
            if (mlVar instanceof qo) {
                return ((qo) mlVar).a;
            }
            return -1.0f;
        }

        public b A(float f) {
            this.e = new e(f);
            return this;
        }

        public b B(ll llVar) {
            this.e = llVar;
            return this;
        }

        public b C(int i, ll llVar) {
            return D(on0.a(i)).F(llVar);
        }

        public b D(ml mlVar) {
            this.b = mlVar;
            float n = n(mlVar);
            if (n != -1.0f) {
                E(n);
            }
            return this;
        }

        public b E(float f) {
            this.f = new e(f);
            return this;
        }

        public b F(ll llVar) {
            this.f = llVar;
            return this;
        }

        public gc1 m() {
            return new gc1(this);
        }

        public b o(float f) {
            return A(f).E(f).w(f).s(f);
        }

        public b p(ll llVar) {
            return B(llVar).F(llVar).x(llVar).t(llVar);
        }

        public b q(int i, ll llVar) {
            return r(on0.a(i)).t(llVar);
        }

        public b r(ml mlVar) {
            this.d = mlVar;
            float n = n(mlVar);
            if (n != -1.0f) {
                s(n);
            }
            return this;
        }

        public b s(float f) {
            this.h = new e(f);
            return this;
        }

        public b t(ll llVar) {
            this.h = llVar;
            return this;
        }

        public b u(int i, ll llVar) {
            return v(on0.a(i)).x(llVar);
        }

        public b v(ml mlVar) {
            this.c = mlVar;
            float n = n(mlVar);
            if (n != -1.0f) {
                w(n);
            }
            return this;
        }

        public b w(float f) {
            this.g = new e(f);
            return this;
        }

        public b x(ll llVar) {
            this.g = llVar;
            return this;
        }

        public b y(int i, ll llVar) {
            return z(on0.a(i)).B(llVar);
        }

        public b z(ml mlVar) {
            this.a = mlVar;
            float n = n(mlVar);
            if (n != -1.0f) {
                A(n);
            }
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        ll a(ll llVar);
    }

    public gc1() {
        this.a = on0.b();
        this.b = on0.b();
        this.c = on0.b();
        this.d = on0.b();
        this.e = new e(0.0f);
        this.f = new e(0.0f);
        this.g = new e(0.0f);
        this.h = new e(0.0f);
        this.i = on0.c();
        this.j = on0.c();
        this.k = on0.c();
        this.l = on0.c();
    }

    public gc1(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    public static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new e(i3));
    }

    public static b d(Context context, int i, int i2, ll llVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, m21.U3);
        try {
            int i3 = obtainStyledAttributes.getInt(m21.V3, 0);
            int i4 = obtainStyledAttributes.getInt(m21.Y3, i3);
            int i5 = obtainStyledAttributes.getInt(m21.Z3, i3);
            int i6 = obtainStyledAttributes.getInt(m21.X3, i3);
            int i7 = obtainStyledAttributes.getInt(m21.W3, i3);
            ll m2 = m(obtainStyledAttributes, m21.a4, llVar);
            ll m3 = m(obtainStyledAttributes, m21.d4, m2);
            ll m4 = m(obtainStyledAttributes, m21.e4, m2);
            ll m5 = m(obtainStyledAttributes, m21.c4, m2);
            return new b().y(i4, m3).C(i5, m4).u(i6, m5).q(i7, m(obtainStyledAttributes, m21.b4, m2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new e(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, ll llVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.M2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(m21.N2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(m21.O2, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, llVar);
    }

    public static ll m(TypedArray typedArray, int i, ll llVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return llVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new e(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new o31(peekValue.getFraction(1.0f, 1.0f)) : llVar;
    }

    public rv h() {
        return this.k;
    }

    public ml i() {
        return this.d;
    }

    public ll j() {
        return this.h;
    }

    public ml k() {
        return this.c;
    }

    public ll l() {
        return this.g;
    }

    public rv n() {
        return this.l;
    }

    public rv o() {
        return this.j;
    }

    public rv p() {
        return this.i;
    }

    public ml q() {
        return this.a;
    }

    public ll r() {
        return this.e;
    }

    public ml s() {
        return this.b;
    }

    public ll t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(rv.class) && this.j.getClass().equals(rv.class) && this.i.getClass().equals(rv.class) && this.k.getClass().equals(rv.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof j61) && (this.a instanceof j61) && (this.c instanceof j61) && (this.d instanceof j61));
    }

    public b v() {
        return new b(this);
    }

    public gc1 w(float f) {
        return v().o(f).m();
    }

    public gc1 x(ll llVar) {
        return v().p(llVar).m();
    }

    public gc1 y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }
}

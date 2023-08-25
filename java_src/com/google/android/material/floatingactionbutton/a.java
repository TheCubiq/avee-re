package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.daaw.cf0;
import com.daaw.f3;
import com.daaw.fc1;
import com.daaw.gc1;
import com.daaw.i3;
import com.daaw.jc1;
import com.daaw.kf1;
import com.daaw.nn0;
import com.daaw.nu;
import com.daaw.on0;
import com.daaw.r01;
import com.daaw.rq0;
import com.daaw.tn0;
import com.daaw.ty0;
import com.daaw.xs1;
import com.daaw.z51;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class a {
    public static final TimeInterpolator E = f3.c;
    public static final int[] F = {16842919, 16842910};
    public static final int[] G = {16843623, 16842908, 16842910};
    public static final int[] H = {16842908, 16842910};
    public static final int[] I = {16843623, 16842910};
    public static final int[] J = {16842910};
    public static final int[] K = new int[0];
    public ViewTreeObserver.OnPreDrawListener D;
    public gc1 a;
    public nn0 b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public float g;
    public float h;
    public float i;
    public int j;
    public final kf1 k;
    public rq0 l;
    public rq0 m;
    public Animator n;
    public rq0 o;
    public rq0 p;
    public float q;
    public int s;
    public ArrayList<Animator.AnimatorListener> u;
    public ArrayList<Animator.AnimatorListener> v;
    public ArrayList<i> w;
    public final FloatingActionButton x;
    public final fc1 y;
    public boolean f = true;
    public float r = 1.0f;
    public int t = 0;
    public final Rect z = new Rect();
    public final RectF A = new RectF();
    public final RectF B = new RectF();
    public final Matrix C = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0101a extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ j c;

        public C0101a(boolean z, j jVar) {
            this.b = z;
            this.c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.t = 0;
            a.this.n = null;
            if (this.a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.x;
            boolean z = this.b;
            floatingActionButton.b(z ? 8 : 4, z);
            j jVar = this.c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.x.b(0, this.b);
            a.this.t = 1;
            a.this.n = animator;
            this.a = false;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ j b;

        public b(boolean z, j jVar) {
            this.a = z;
            this.b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.t = 0;
            a.this.n = null;
            j jVar = this.b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.x.b(0, this.a);
            a.this.t = 2;
            a.this.n = animator;
        }
    }

    /* loaded from: classes2.dex */
    public class c extends tn0 {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            a.this.r = f;
            return super.a(f, matrix, matrix2);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements TypeEvaluator<Float> {
        public FloatEvaluator a = new FloatEvaluator();

        public d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.F();
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class f extends l {
        public f() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            return 0.0f;
        }
    }

    /* loaded from: classes2.dex */
    public class g extends l {
        public g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            a aVar = a.this;
            return aVar.g + aVar.h;
        }
    }

    /* loaded from: classes2.dex */
    public class h extends l {
        public h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            a aVar = a.this;
            return aVar.g + aVar.i;
        }
    }

    /* loaded from: classes2.dex */
    public interface i {
        void a();

        void b();
    }

    /* loaded from: classes2.dex */
    public interface j {
        void a();

        void b();
    }

    /* loaded from: classes2.dex */
    public class k extends l {
        public k() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.l
        public float a() {
            return a.this.g;
        }
    }

    /* loaded from: classes2.dex */
    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;
        public float b;
        public float c;

        public l() {
        }

        public /* synthetic */ l(a aVar, C0101a c0101a) {
            this();
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.c0((int) this.c);
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                nn0 nn0Var = a.this.b;
                this.b = nn0Var == null ? 0.0f : nn0Var.w();
                this.c = a();
                this.a = true;
            }
            a aVar = a.this;
            float f = this.b;
            aVar.c0((int) (f + ((this.c - f) * valueAnimator.getAnimatedFraction())));
        }
    }

    public a(FloatingActionButton floatingActionButton, fc1 fc1Var) {
        this.x = floatingActionButton;
        this.y = fc1Var;
        kf1 kf1Var = new kf1();
        this.k = kf1Var;
        kf1Var.a(F, i(new h()));
        kf1Var.a(G, i(new g()));
        kf1Var.a(H, i(new g()));
        kf1Var.a(I, i(new g()));
        kf1Var.a(J, i(new k()));
        kf1Var.a(K, i(new f()));
        this.q = floatingActionButton.getRotation();
    }

    public void A() {
    }

    public void B() {
        ViewTreeObserver viewTreeObserver = this.x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.D;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.D = null;
        }
    }

    public void C(int[] iArr) {
        this.k.d(iArr);
    }

    public void D(float f2, float f3, float f4) {
        b0();
        c0(f2);
    }

    public void E(Rect rect) {
        fc1 fc1Var;
        Drawable drawable;
        ty0.g(this.d, "Didn't initialize content background");
        if (V()) {
            drawable = new InsetDrawable(this.d, rect.left, rect.top, rect.right, rect.bottom);
            fc1Var = this.y;
        } else {
            fc1Var = this.y;
            drawable = this.d;
        }
        fc1Var.b(drawable);
    }

    public void F() {
        float rotation = this.x.getRotation();
        if (this.q != rotation) {
            this.q = rotation;
            Z();
        }
    }

    public void G() {
        ArrayList<i> arrayList = this.w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void H() {
        ArrayList<i> arrayList = this.w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public boolean I() {
        return true;
    }

    public void J(ColorStateList colorStateList) {
        nn0 nn0Var = this.b;
        if (nn0Var != null) {
            nn0Var.setTintList(colorStateList);
        }
    }

    public void K(PorterDuff.Mode mode) {
        nn0 nn0Var = this.b;
        if (nn0Var != null) {
            nn0Var.setTintMode(mode);
        }
    }

    public final void L(float f2) {
        if (this.g != f2) {
            this.g = f2;
            D(f2, this.h, this.i);
        }
    }

    public void M(boolean z) {
        this.e = z;
    }

    public final void N(rq0 rq0Var) {
        this.p = rq0Var;
    }

    public final void O(float f2) {
        if (this.h != f2) {
            this.h = f2;
            D(this.g, f2, this.i);
        }
    }

    public final void P(float f2) {
        this.r = f2;
        Matrix matrix = this.C;
        g(f2, matrix);
        this.x.setImageMatrix(matrix);
    }

    public final void Q(float f2) {
        if (this.i != f2) {
            this.i = f2;
            D(this.g, this.h, f2);
        }
    }

    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            nu.o(drawable, z51.a(colorStateList));
        }
    }

    public void S(boolean z) {
        this.f = z;
        b0();
    }

    public final void T(gc1 gc1Var) {
        this.a = gc1Var;
        nn0 nn0Var = this.b;
        if (nn0Var != null) {
            nn0Var.setShapeAppearanceModel(gc1Var);
        }
        Drawable drawable = this.c;
        if (drawable instanceof jc1) {
            ((jc1) drawable).setShapeAppearanceModel(gc1Var);
        }
    }

    public final void U(rq0 rq0Var) {
        this.o = rq0Var;
    }

    public boolean V() {
        return true;
    }

    public final boolean W() {
        return xs1.V(this.x) && !this.x.isInEditMode();
    }

    public final boolean X() {
        return !this.e || this.x.getSizeDimension() >= this.j;
    }

    public void Y(j jVar, boolean z) {
        if (x()) {
            return;
        }
        Animator animator = this.n;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.x.b(0, z);
            this.x.setAlpha(1.0f);
            this.x.setScaleY(1.0f);
            this.x.setScaleX(1.0f);
            P(1.0f);
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        if (this.x.getVisibility() != 0) {
            this.x.setAlpha(0.0f);
            this.x.setScaleY(0.0f);
            this.x.setScaleX(0.0f);
            P(0.0f);
        }
        rq0 rq0Var = this.o;
        if (rq0Var == null) {
            rq0Var = l();
        }
        AnimatorSet h2 = h(rq0Var, 1.0f, 1.0f, 1.0f);
        h2.addListener(new b(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                h2.addListener(it.next());
            }
        }
        h2.start();
    }

    public void Z() {
        FloatingActionButton floatingActionButton;
        int i2;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.q % 90.0f != 0.0f) {
                i2 = 1;
                if (this.x.getLayerType() != 1) {
                    floatingActionButton = this.x;
                    floatingActionButton.setLayerType(i2, null);
                }
            } else if (this.x.getLayerType() != 0) {
                floatingActionButton = this.x;
                i2 = 0;
                floatingActionButton.setLayerType(i2, null);
            }
        }
        nn0 nn0Var = this.b;
        if (nn0Var != null) {
            nn0Var.a0((int) this.q);
        }
    }

    public final void a0() {
        P(this.r);
    }

    public final void b0() {
        Rect rect = this.z;
        r(rect);
        E(rect);
        this.y.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void c0(float f2) {
        nn0 nn0Var = this.b;
        if (nn0Var != null) {
            nn0Var.V(f2);
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    public final void d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.u == null) {
            this.u = new ArrayList<>();
        }
        this.u.add(animatorListener);
    }

    public void f(i iVar) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(iVar);
    }

    public final void g(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.x.getDrawable();
        if (drawable == null || this.s == 0) {
            return;
        }
        RectF rectF = this.A;
        RectF rectF2 = this.B;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.s;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.s;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    public final AnimatorSet h(rq0 rq0Var, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.x, View.ALPHA, f2);
        rq0Var.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.x, View.SCALE_X, f3);
        rq0Var.e("scale").a(ofFloat2);
        d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.x, View.SCALE_Y, f3);
        rq0Var.e("scale").a(ofFloat3);
        d0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f4, this.C);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.x, new cf0(), new c(), new Matrix(this.C));
        rq0Var.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        i3.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(E);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final Drawable j() {
        return this.d;
    }

    public final rq0 k() {
        if (this.m == null) {
            this.m = rq0.c(this.x.getContext(), r01.design_fab_hide_motion_spec);
        }
        return (rq0) ty0.f(this.m);
    }

    public final rq0 l() {
        if (this.l == null) {
            this.l = rq0.c(this.x.getContext(), r01.design_fab_show_motion_spec);
        }
        return (rq0) ty0.f(this.l);
    }

    public float m() {
        return this.g;
    }

    public boolean n() {
        return this.e;
    }

    public final rq0 o() {
        return this.p;
    }

    public float p() {
        return this.h;
    }

    public final ViewTreeObserver.OnPreDrawListener q() {
        if (this.D == null) {
            this.D = new e();
        }
        return this.D;
    }

    public void r(Rect rect) {
        int sizeDimension = this.e ? (this.j - this.x.getSizeDimension()) / 2 : 0;
        float m = this.f ? m() + this.i : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(m));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(m * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public float s() {
        return this.i;
    }

    public final gc1 t() {
        return this.a;
    }

    public final rq0 u() {
        return this.o;
    }

    public void v(j jVar, boolean z) {
        if (w()) {
            return;
        }
        Animator animator = this.n;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.x.b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.b();
                return;
            }
            return;
        }
        rq0 rq0Var = this.p;
        if (rq0Var == null) {
            rq0Var = k();
        }
        AnimatorSet h2 = h(rq0Var, 0.0f, 0.0f, 0.0f);
        h2.addListener(new C0101a(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                h2.addListener(it.next());
            }
        }
        h2.start();
    }

    public boolean w() {
        return this.x.getVisibility() == 0 ? this.t == 1 : this.t != 2;
    }

    public boolean x() {
        return this.x.getVisibility() != 0 ? this.t == 2 : this.t != 1;
    }

    public void y() {
        this.k.c();
    }

    public void z() {
        nn0 nn0Var = this.b;
        if (nn0Var != null) {
            on0.f(this.x, nn0Var);
        }
        if (I()) {
            this.x.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}

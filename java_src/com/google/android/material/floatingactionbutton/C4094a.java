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
import com.daaw.C1247f3;
import com.daaw.C1653i3;
import com.daaw.C2366nu;
import com.daaw.cf0;
import com.daaw.fc1;
import com.daaw.gc1;
import com.daaw.jc1;
import com.daaw.kf1;
import com.daaw.nn0;
import com.daaw.on0;
import com.daaw.r01;
import com.daaw.rq0;
import com.daaw.tn0;
import com.daaw.ty0;
import com.daaw.xs1;
import com.daaw.z51;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes2.dex */
public class C4094a {

    /* renamed from: E */
    public static final TimeInterpolator f37568E = C1247f3.f9053c;

    /* renamed from: F */
    public static final int[] f37569F = {16842919, 16842910};

    /* renamed from: G */
    public static final int[] f37570G = {16843623, 16842908, 16842910};

    /* renamed from: H */
    public static final int[] f37571H = {16842908, 16842910};

    /* renamed from: I */
    public static final int[] f37572I = {16843623, 16842910};

    /* renamed from: J */
    public static final int[] f37573J = {16842910};

    /* renamed from: K */
    public static final int[] f37574K = new int[0];

    /* renamed from: D */
    public ViewTreeObserver.OnPreDrawListener f37578D;

    /* renamed from: a */
    public gc1 f37579a;

    /* renamed from: b */
    public nn0 f37580b;

    /* renamed from: c */
    public Drawable f37581c;

    /* renamed from: d */
    public Drawable f37582d;

    /* renamed from: e */
    public boolean f37583e;

    /* renamed from: g */
    public float f37585g;

    /* renamed from: h */
    public float f37586h;

    /* renamed from: i */
    public float f37587i;

    /* renamed from: j */
    public int f37588j;

    /* renamed from: k */
    public final kf1 f37589k;

    /* renamed from: l */
    public rq0 f37590l;

    /* renamed from: m */
    public rq0 f37591m;

    /* renamed from: n */
    public Animator f37592n;

    /* renamed from: o */
    public rq0 f37593o;

    /* renamed from: p */
    public rq0 f37594p;

    /* renamed from: q */
    public float f37595q;

    /* renamed from: s */
    public int f37597s;

    /* renamed from: u */
    public ArrayList<Animator.AnimatorListener> f37599u;

    /* renamed from: v */
    public ArrayList<Animator.AnimatorListener> f37600v;

    /* renamed from: w */
    public ArrayList<InterfaceC4103i> f37601w;

    /* renamed from: x */
    public final FloatingActionButton f37602x;

    /* renamed from: y */
    public final fc1 f37603y;

    /* renamed from: f */
    public boolean f37584f = true;

    /* renamed from: r */
    public float f37596r = 1.0f;

    /* renamed from: t */
    public int f37598t = 0;

    /* renamed from: z */
    public final Rect f37604z = new Rect();

    /* renamed from: A */
    public final RectF f37575A = new RectF();

    /* renamed from: B */
    public final RectF f37576B = new RectF();

    /* renamed from: C */
    public final Matrix f37577C = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes2.dex */
    public class C4095a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f37605a;

        /* renamed from: b */
        public final /* synthetic */ boolean f37606b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC4104j f37607c;

        public C4095a(boolean z, InterfaceC4104j interfaceC4104j) {
            this.f37606b = z;
            this.f37607c = interfaceC4104j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f37605a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4094a.this.f37598t = 0;
            C4094a.this.f37592n = null;
            if (this.f37605a) {
                return;
            }
            FloatingActionButton floatingActionButton = C4094a.this.f37602x;
            boolean z = this.f37606b;
            floatingActionButton.m20389b(z ? 8 : 4, z);
            InterfaceC4104j interfaceC4104j = this.f37607c;
            if (interfaceC4104j != null) {
                interfaceC4104j.mo370b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4094a.this.f37602x.m20389b(0, this.f37606b);
            C4094a.this.f37598t = 1;
            C4094a.this.f37592n = animator;
            this.f37605a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: classes2.dex */
    public class C4096b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f37609a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4104j f37610b;

        public C4096b(boolean z, InterfaceC4104j interfaceC4104j) {
            this.f37609a = z;
            this.f37610b = interfaceC4104j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4094a.this.f37598t = 0;
            C4094a.this.f37592n = null;
            InterfaceC4104j interfaceC4104j = this.f37610b;
            if (interfaceC4104j != null) {
                interfaceC4104j.mo371a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4094a.this.f37602x.m20389b(0, this.f37609a);
            C4094a.this.f37598t = 2;
            C4094a.this.f37592n = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* loaded from: classes2.dex */
    public class C4097c extends tn0 {
        public C4097c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C4094a.this.f37596r = f;
            return super.mo375a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* loaded from: classes2.dex */
    public class C4098d implements TypeEvaluator<Float> {

        /* renamed from: a */
        public FloatEvaluator f37613a = new FloatEvaluator();

        public C4098d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f37613a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnPreDrawListenerC4099e implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC4099e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C4094a.this.m426F();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* loaded from: classes2.dex */
    public class C4100f extends AbstractC4106l {
        public C4100f() {
            super(C4094a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4094a.AbstractC4106l
        /* renamed from: a */
        public float mo369a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* loaded from: classes2.dex */
    public class C4101g extends AbstractC4106l {
        public C4101g() {
            super(C4094a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4094a.AbstractC4106l
        /* renamed from: a */
        public float mo369a() {
            C4094a c4094a = C4094a.this;
            return c4094a.f37585g + c4094a.f37586h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* loaded from: classes2.dex */
    public class C4102h extends AbstractC4106l {
        public C4102h() {
            super(C4094a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4094a.AbstractC4106l
        /* renamed from: a */
        public float mo369a() {
            C4094a c4094a = C4094a.this;
            return c4094a.f37585g + c4094a.f37587i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* loaded from: classes2.dex */
    public interface InterfaceC4103i {
        /* renamed from: a */
        void mo373a();

        /* renamed from: b */
        void mo372b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$j */
    /* loaded from: classes2.dex */
    public interface InterfaceC4104j {
        /* renamed from: a */
        void mo371a();

        /* renamed from: b */
        void mo370b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$k */
    /* loaded from: classes2.dex */
    public class C4105k extends AbstractC4106l {
        public C4105k() {
            super(C4094a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4094a.AbstractC4106l
        /* renamed from: a */
        public float mo369a() {
            return C4094a.this.f37585g;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$l */
    /* loaded from: classes2.dex */
    public abstract class AbstractC4106l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f37620a;

        /* renamed from: b */
        public float f37621b;

        /* renamed from: c */
        public float f37622c;

        public AbstractC4106l() {
        }

        public /* synthetic */ AbstractC4106l(C4094a c4094a, C4095a c4095a) {
            this();
        }

        /* renamed from: a */
        public abstract float mo369a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4094a.this.m400c0((int) this.f37622c);
            this.f37620a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f37620a) {
                nn0 nn0Var = C4094a.this.f37580b;
                this.f37621b = nn0Var == null ? 0.0f : nn0Var.m14964w();
                this.f37622c = mo369a();
                this.f37620a = true;
            }
            C4094a c4094a = C4094a.this;
            float f = this.f37621b;
            c4094a.m400c0((int) (f + ((this.f37622c - f) * valueAnimator.getAnimatedFraction())));
        }
    }

    public C4094a(FloatingActionButton floatingActionButton, fc1 fc1Var) {
        this.f37602x = floatingActionButton;
        this.f37603y = fc1Var;
        kf1 kf1Var = new kf1();
        this.f37589k = kf1Var;
        kf1Var.m17767a(f37569F, m393i(new C4102h()));
        kf1Var.m17767a(f37570G, m393i(new C4101g()));
        kf1Var.m17767a(f37571H, m393i(new C4101g()));
        kf1Var.m17767a(f37572I, m393i(new C4101g()));
        kf1Var.m17767a(f37573J, m393i(new C4105k()));
        kf1Var.m17767a(f37574K, m393i(new C4100f()));
        this.f37595q = floatingActionButton.getRotation();
    }

    /* renamed from: A */
    public void mo431A() {
    }

    /* renamed from: B */
    public void m430B() {
        ViewTreeObserver viewTreeObserver = this.f37602x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f37578D;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f37578D = null;
        }
    }

    /* renamed from: C */
    public void mo429C(int[] iArr) {
        this.f37589k.m17764d(iArr);
    }

    /* renamed from: D */
    public void mo428D(float f, float f2, float f3) {
        m402b0();
        m400c0(f);
    }

    /* renamed from: E */
    public void m427E(Rect rect) {
        fc1 fc1Var;
        Drawable drawable;
        ty0.m8698g(this.f37582d, "Didn't initialize content background");
        if (mo410V()) {
            drawable = new InsetDrawable(this.f37582d, rect.left, rect.top, rect.right, rect.bottom);
            fc1Var = this.f37603y;
        } else {
            fc1Var = this.f37603y;
            drawable = this.f37582d;
        }
        fc1Var.mo433b(drawable);
    }

    /* renamed from: F */
    public void m426F() {
        float rotation = this.f37602x.getRotation();
        if (this.f37595q != rotation) {
            this.f37595q = rotation;
            mo406Z();
        }
    }

    /* renamed from: G */
    public void m425G() {
        ArrayList<InterfaceC4103i> arrayList = this.f37601w;
        if (arrayList != null) {
            Iterator<InterfaceC4103i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo372b();
            }
        }
    }

    /* renamed from: H */
    public void m424H() {
        ArrayList<InterfaceC4103i> arrayList = this.f37601w;
        if (arrayList != null) {
            Iterator<InterfaceC4103i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo373a();
            }
        }
    }

    /* renamed from: I */
    public boolean mo423I() {
        return true;
    }

    /* renamed from: J */
    public void m422J(ColorStateList colorStateList) {
        nn0 nn0Var = this.f37580b;
        if (nn0Var != null) {
            nn0Var.setTintList(colorStateList);
        }
    }

    /* renamed from: K */
    public void m421K(PorterDuff.Mode mode) {
        nn0 nn0Var = this.f37580b;
        if (nn0Var != null) {
            nn0Var.setTintMode(mode);
        }
    }

    /* renamed from: L */
    public final void m420L(float f) {
        if (this.f37585g != f) {
            this.f37585g = f;
            mo428D(f, this.f37586h, this.f37587i);
        }
    }

    /* renamed from: M */
    public void m419M(boolean z) {
        this.f37583e = z;
    }

    /* renamed from: N */
    public final void m418N(rq0 rq0Var) {
        this.f37594p = rq0Var;
    }

    /* renamed from: O */
    public final void m417O(float f) {
        if (this.f37586h != f) {
            this.f37586h = f;
            mo428D(this.f37585g, f, this.f37587i);
        }
    }

    /* renamed from: P */
    public final void m416P(float f) {
        this.f37596r = f;
        Matrix matrix = this.f37577C;
        m395g(f, matrix);
        this.f37602x.setImageMatrix(matrix);
    }

    /* renamed from: Q */
    public final void m415Q(float f) {
        if (this.f37587i != f) {
            this.f37587i = f;
            mo428D(this.f37585g, this.f37586h, f);
        }
    }

    /* renamed from: R */
    public void mo414R(ColorStateList colorStateList) {
        Drawable drawable = this.f37581c;
        if (drawable != null) {
            C2366nu.m14812o(drawable, z51.m2812a(colorStateList));
        }
    }

    /* renamed from: S */
    public void m413S(boolean z) {
        this.f37584f = z;
        m402b0();
    }

    /* renamed from: T */
    public final void m412T(gc1 gc1Var) {
        this.f37579a = gc1Var;
        nn0 nn0Var = this.f37580b;
        if (nn0Var != null) {
            nn0Var.setShapeAppearanceModel(gc1Var);
        }
        Drawable drawable = this.f37581c;
        if (drawable instanceof jc1) {
            ((jc1) drawable).setShapeAppearanceModel(gc1Var);
        }
    }

    /* renamed from: U */
    public final void m411U(rq0 rq0Var) {
        this.f37593o = rq0Var;
    }

    /* renamed from: V */
    public boolean mo410V() {
        return true;
    }

    /* renamed from: W */
    public final boolean m409W() {
        return xs1.m4742V(this.f37602x) && !this.f37602x.isInEditMode();
    }

    /* renamed from: X */
    public final boolean m408X() {
        return !this.f37583e || this.f37602x.getSizeDimension() >= this.f37588j;
    }

    /* renamed from: Y */
    public void m407Y(InterfaceC4104j interfaceC4104j, boolean z) {
        if (m378x()) {
            return;
        }
        Animator animator = this.f37592n;
        if (animator != null) {
            animator.cancel();
        }
        if (!m409W()) {
            this.f37602x.m20389b(0, z);
            this.f37602x.setAlpha(1.0f);
            this.f37602x.setScaleY(1.0f);
            this.f37602x.setScaleX(1.0f);
            m416P(1.0f);
            if (interfaceC4104j != null) {
                interfaceC4104j.mo371a();
                return;
            }
            return;
        }
        if (this.f37602x.getVisibility() != 0) {
            this.f37602x.setAlpha(0.0f);
            this.f37602x.setScaleY(0.0f);
            this.f37602x.setScaleX(0.0f);
            m416P(0.0f);
        }
        rq0 rq0Var = this.f37593o;
        if (rq0Var == null) {
            rq0Var = m390l();
        }
        AnimatorSet m394h = m394h(rq0Var, 1.0f, 1.0f, 1.0f);
        m394h.addListener(new C4096b(z, interfaceC4104j));
        ArrayList<Animator.AnimatorListener> arrayList = this.f37599u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m394h.addListener(it.next());
            }
        }
        m394h.start();
    }

    /* renamed from: Z */
    public void mo406Z() {
        FloatingActionButton floatingActionButton;
        int i;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f37595q % 90.0f != 0.0f) {
                i = 1;
                if (this.f37602x.getLayerType() != 1) {
                    floatingActionButton = this.f37602x;
                    floatingActionButton.setLayerType(i, null);
                }
            } else if (this.f37602x.getLayerType() != 0) {
                floatingActionButton = this.f37602x;
                i = 0;
                floatingActionButton.setLayerType(i, null);
            }
        }
        nn0 nn0Var = this.f37580b;
        if (nn0Var != null) {
            nn0Var.m14993a0((int) this.f37595q);
        }
    }

    /* renamed from: a0 */
    public final void m404a0() {
        m416P(this.f37596r);
    }

    /* renamed from: b0 */
    public final void m402b0() {
        Rect rect = this.f37604z;
        mo384r(rect);
        m427E(rect);
        this.f37603y.mo434a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: c0 */
    public void m400c0(float f) {
        nn0 nn0Var = this.f37580b;
        if (nn0Var != null) {
            nn0Var.m14998V(f);
        }
    }

    /* renamed from: d */
    public void m399d(Animator.AnimatorListener animatorListener) {
        if (this.f37600v == null) {
            this.f37600v = new ArrayList<>();
        }
        this.f37600v.add(animatorListener);
    }

    /* renamed from: d0 */
    public final void m398d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C4098d());
    }

    /* renamed from: e */
    public void m397e(Animator.AnimatorListener animatorListener) {
        if (this.f37599u == null) {
            this.f37599u = new ArrayList<>();
        }
        this.f37599u.add(animatorListener);
    }

    /* renamed from: f */
    public void m396f(InterfaceC4103i interfaceC4103i) {
        if (this.f37601w == null) {
            this.f37601w = new ArrayList<>();
        }
        this.f37601w.add(interfaceC4103i);
    }

    /* renamed from: g */
    public final void m395g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f37602x.getDrawable();
        if (drawable == null || this.f37597s == 0) {
            return;
        }
        RectF rectF = this.f37575A;
        RectF rectF2 = this.f37576B;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f37597s;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f37597s;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    /* renamed from: h */
    public final AnimatorSet m394h(rq0 rq0Var, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f37602x, View.ALPHA, f);
        rq0Var.m11067e("opacity").m10052a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f37602x, View.SCALE_X, f2);
        rq0Var.m11067e("scale").m10052a(ofFloat2);
        m398d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f37602x, View.SCALE_Y, f2);
        rq0Var.m11067e("scale").m10052a(ofFloat3);
        m398d0(ofFloat3);
        arrayList.add(ofFloat3);
        m395g(f3, this.f37577C);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f37602x, new cf0(), new C4097c(), new Matrix(this.f37577C));
        rq0Var.m11067e("iconScale").m10052a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1653i3.m20165a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i */
    public final ValueAnimator m393i(AbstractC4106l abstractC4106l) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f37568E);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC4106l);
        valueAnimator.addUpdateListener(abstractC4106l);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: j */
    public final Drawable m392j() {
        return this.f37582d;
    }

    /* renamed from: k */
    public final rq0 m391k() {
        if (this.f37591m == null) {
            this.f37591m = rq0.m11069c(this.f37602x.getContext(), r01.design_fab_hide_motion_spec);
        }
        return (rq0) ty0.m8699f(this.f37591m);
    }

    /* renamed from: l */
    public final rq0 m390l() {
        if (this.f37590l == null) {
            this.f37590l = rq0.m11069c(this.f37602x.getContext(), r01.design_fab_show_motion_spec);
        }
        return (rq0) ty0.m8699f(this.f37590l);
    }

    /* renamed from: m */
    public float mo389m() {
        return this.f37585g;
    }

    /* renamed from: n */
    public boolean m388n() {
        return this.f37583e;
    }

    /* renamed from: o */
    public final rq0 m387o() {
        return this.f37594p;
    }

    /* renamed from: p */
    public float m386p() {
        return this.f37586h;
    }

    /* renamed from: q */
    public final ViewTreeObserver.OnPreDrawListener m385q() {
        if (this.f37578D == null) {
            this.f37578D = new ViewTreeObserver$OnPreDrawListenerC4099e();
        }
        return this.f37578D;
    }

    /* renamed from: r */
    public void mo384r(Rect rect) {
        int sizeDimension = this.f37583e ? (this.f37588j - this.f37602x.getSizeDimension()) / 2 : 0;
        float mo389m = this.f37584f ? mo389m() + this.f37587i : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(mo389m));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(mo389m * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: s */
    public float m383s() {
        return this.f37587i;
    }

    /* renamed from: t */
    public final gc1 m382t() {
        return this.f37579a;
    }

    /* renamed from: u */
    public final rq0 m381u() {
        return this.f37593o;
    }

    /* renamed from: v */
    public void m380v(InterfaceC4104j interfaceC4104j, boolean z) {
        if (m379w()) {
            return;
        }
        Animator animator = this.f37592n;
        if (animator != null) {
            animator.cancel();
        }
        if (!m409W()) {
            this.f37602x.m20389b(z ? 8 : 4, z);
            if (interfaceC4104j != null) {
                interfaceC4104j.mo370b();
                return;
            }
            return;
        }
        rq0 rq0Var = this.f37594p;
        if (rq0Var == null) {
            rq0Var = m391k();
        }
        AnimatorSet m394h = m394h(rq0Var, 0.0f, 0.0f, 0.0f);
        m394h.addListener(new C4095a(z, interfaceC4104j));
        ArrayList<Animator.AnimatorListener> arrayList = this.f37600v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m394h.addListener(it.next());
            }
        }
        m394h.start();
    }

    /* renamed from: w */
    public boolean m379w() {
        return this.f37602x.getVisibility() == 0 ? this.f37598t == 1 : this.f37598t != 2;
    }

    /* renamed from: x */
    public boolean m378x() {
        return this.f37602x.getVisibility() != 0 ? this.f37598t == 2 : this.f37598t != 1;
    }

    /* renamed from: y */
    public void mo377y() {
        this.f37589k.m17765c();
    }

    /* renamed from: z */
    public void m376z() {
        nn0 nn0Var = this.f37580b;
        if (nn0Var != null) {
            on0.m14140f(this.f37602x, nn0Var);
        }
        if (mo423I()) {
            this.f37602x.getViewTreeObserver().addOnPreDrawListener(m385q());
        }
    }
}

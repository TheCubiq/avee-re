package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
/* renamed from: com.daaw.te */
/* loaded from: classes.dex */
public class C3059te extends in1 {

    /* renamed from: b0 */
    public static final String[] f27518b0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: c0 */
    public static final Property<Drawable, PointF> f27519c0 = new C3061b(PointF.class, "boundsOrigin");

    /* renamed from: d0 */
    public static final Property<C3070k, PointF> f27520d0 = new C3062c(PointF.class, "topLeft");

    /* renamed from: e0 */
    public static final Property<C3070k, PointF> f27521e0 = new C3063d(PointF.class, "bottomRight");

    /* renamed from: f0 */
    public static final Property<View, PointF> f27522f0 = new C3064e(PointF.class, "bottomRight");

    /* renamed from: g0 */
    public static final Property<View, PointF> f27523g0 = new C3065f(PointF.class, "topLeft");

    /* renamed from: h0 */
    public static final Property<View, PointF> f27524h0 = new C3066g(PointF.class, "position");

    /* renamed from: i0 */
    public static j31 f27525i0 = new j31();

    /* renamed from: Y */
    public int[] f27526Y = new int[2];

    /* renamed from: Z */
    public boolean f27527Z = false;

    /* renamed from: a0 */
    public boolean f27528a0 = false;

    /* renamed from: com.daaw.te$a */
    /* loaded from: classes.dex */
    public class C3060a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f27529a;

        /* renamed from: b */
        public final /* synthetic */ BitmapDrawable f27530b;

        /* renamed from: c */
        public final /* synthetic */ View f27531c;

        /* renamed from: d */
        public final /* synthetic */ float f27532d;

        public C3060a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f27529a = viewGroup;
            this.f27530b = bitmapDrawable;
            this.f27531c = view;
            this.f27532d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gu1.m21228b(this.f27529a).mo10958b(this.f27530b);
            gu1.m21223g(this.f27531c, this.f27532d);
        }
    }

    /* renamed from: com.daaw.te$b */
    /* loaded from: classes.dex */
    public static class C3061b extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f27534a;

        public C3061b(Class cls, String str) {
            super(cls, str);
            this.f27534a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f27534a);
            Rect rect = this.f27534a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f27534a);
            this.f27534a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f27534a);
        }
    }

    /* renamed from: com.daaw.te$c */
    /* loaded from: classes.dex */
    public static class C3062c extends Property<C3070k, PointF> {
        public C3062c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C3070k c3070k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C3070k c3070k, PointF pointF) {
            c3070k.m9238c(pointF);
        }
    }

    /* renamed from: com.daaw.te$d */
    /* loaded from: classes.dex */
    public static class C3063d extends Property<C3070k, PointF> {
        public C3063d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C3070k c3070k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C3070k c3070k, PointF pointF) {
            c3070k.m9240a(pointF);
        }
    }

    /* renamed from: com.daaw.te$e */
    /* loaded from: classes.dex */
    public static class C3064e extends Property<View, PointF> {
        public C3064e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            gu1.m21224f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: com.daaw.te$f */
    /* loaded from: classes.dex */
    public static class C3065f extends Property<View, PointF> {
        public C3065f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            gu1.m21224f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: com.daaw.te$g */
    /* loaded from: classes.dex */
    public static class C3066g extends Property<View, PointF> {
        public C3066g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            gu1.m21224f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: com.daaw.te$h */
    /* loaded from: classes.dex */
    public class C3067h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C3070k f27535a;
        private C3070k mViewBounds;

        public C3067h(C3070k c3070k) {
            this.f27535a = c3070k;
            this.mViewBounds = c3070k;
        }
    }

    /* renamed from: com.daaw.te$i */
    /* loaded from: classes.dex */
    public class C3068i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f27537a;

        /* renamed from: b */
        public final /* synthetic */ View f27538b;

        /* renamed from: c */
        public final /* synthetic */ Rect f27539c;

        /* renamed from: d */
        public final /* synthetic */ int f27540d;

        /* renamed from: e */
        public final /* synthetic */ int f27541e;

        /* renamed from: f */
        public final /* synthetic */ int f27542f;

        /* renamed from: g */
        public final /* synthetic */ int f27543g;

        public C3068i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f27538b = view;
            this.f27539c = rect;
            this.f27540d = i;
            this.f27541e = i2;
            this.f27542f = i3;
            this.f27543g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27537a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f27537a) {
                return;
            }
            xs1.m4688y0(this.f27538b, this.f27539c);
            gu1.m21224f(this.f27538b, this.f27540d, this.f27541e, this.f27542f, this.f27543g);
        }
    }

    /* renamed from: com.daaw.te$j */
    /* loaded from: classes.dex */
    public class C3069j extends jn1 {

        /* renamed from: a */
        public boolean f27545a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f27546b;

        public C3069j(ViewGroup viewGroup) {
            this.f27546b = viewGroup;
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: a */
        public void mo9244a(in1 in1Var) {
            if (!this.f27545a) {
                et1.m23199c(this.f27546b, false);
            }
            in1Var.mo15921T(this);
        }

        @Override // com.daaw.jn1, com.daaw.in1.InterfaceC1729f
        /* renamed from: b */
        public void mo9243b(in1 in1Var) {
            et1.m23199c(this.f27546b, false);
        }

        @Override // com.daaw.jn1, com.daaw.in1.InterfaceC1729f
        /* renamed from: c */
        public void mo9242c(in1 in1Var) {
            et1.m23199c(this.f27546b, false);
            this.f27545a = true;
        }

        @Override // com.daaw.jn1, com.daaw.in1.InterfaceC1729f
        /* renamed from: e */
        public void mo9241e(in1 in1Var) {
            et1.m23199c(this.f27546b, true);
        }
    }

    /* renamed from: com.daaw.te$k */
    /* loaded from: classes.dex */
    public static class C3070k {

        /* renamed from: a */
        public int f27548a;

        /* renamed from: b */
        public int f27549b;

        /* renamed from: c */
        public int f27550c;

        /* renamed from: d */
        public int f27551d;

        /* renamed from: e */
        public View f27552e;

        /* renamed from: f */
        public int f27553f;

        /* renamed from: g */
        public int f27554g;

        public C3070k(View view) {
            this.f27552e = view;
        }

        /* renamed from: a */
        public void m9240a(PointF pointF) {
            this.f27550c = Math.round(pointF.x);
            this.f27551d = Math.round(pointF.y);
            int i = this.f27554g + 1;
            this.f27554g = i;
            if (this.f27553f == i) {
                m9239b();
            }
        }

        /* renamed from: b */
        public final void m9239b() {
            gu1.m21224f(this.f27552e, this.f27548a, this.f27549b, this.f27550c, this.f27551d);
            this.f27553f = 0;
            this.f27554g = 0;
        }

        /* renamed from: c */
        public void m9238c(PointF pointF) {
            this.f27548a = Math.round(pointF.x);
            this.f27549b = Math.round(pointF.y);
            int i = this.f27553f + 1;
            this.f27553f = i;
            if (i == this.f27554g) {
                m9239b();
            }
        }
    }

    @Override // com.daaw.in1
    /* renamed from: H */
    public String[] mo9262H() {
        return f27518b0;
    }

    /* renamed from: g0 */
    public final void m9261g0(on1 on1Var) {
        View view = on1Var.f21676b;
        if (!xs1.m4742V(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        on1Var.f21675a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        on1Var.f21675a.put("android:changeBounds:parent", on1Var.f21676b.getParent());
        if (this.f27528a0) {
            on1Var.f21676b.getLocationInWindow(this.f27526Y);
            on1Var.f21675a.put("android:changeBounds:windowX", Integer.valueOf(this.f27526Y[0]));
            on1Var.f21675a.put("android:changeBounds:windowY", Integer.valueOf(this.f27526Y[1]));
        }
        if (this.f27527Z) {
            on1Var.f21675a.put("android:changeBounds:clip", xs1.m4693w(view));
        }
    }

    /* renamed from: h0 */
    public final boolean m9260h0(View view, View view2) {
        if (this.f27528a0) {
            on1 m19595x = m19595x(view, true);
            if (m19595x == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == m19595x.f21676b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.daaw.in1
    /* renamed from: i */
    public void mo9259i(on1 on1Var) {
        m9261g0(on1Var);
    }

    @Override // com.daaw.in1
    /* renamed from: m */
    public void mo9258m(on1 on1Var) {
        m9261g0(on1Var);
    }

    @Override // com.daaw.in1
    /* renamed from: r */
    public Animator mo9257r(ViewGroup viewGroup, on1 on1Var, on1 on1Var2) {
        int i;
        View view;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m14955c;
        Path mo19592a;
        Property<View, PointF> property;
        if (on1Var == null || on1Var2 == null) {
            return null;
        }
        Map<String, Object> map = on1Var.f21675a;
        Map<String, Object> map2 = on1Var2.f21675a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = on1Var2.f21676b;
        if (!m9260h0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) on1Var.f21675a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) on1Var.f21675a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) on1Var2.f21675a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) on1Var2.f21675a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f27526Y);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float m21227c = gu1.m21227c(view2);
            gu1.m21223g(view2, 0.0f);
            gu1.m21228b(viewGroup).mo10959a(bitmapDrawable);
            aw0 m19593z = m19593z();
            int[] iArr = this.f27526Y;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, rz0.m10822a(f27519c0, m19593z.mo19592a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new C3060a(viewGroup, bitmapDrawable, view2, m21227c));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) on1Var.f21675a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) on1Var2.f21675a.get("android:changeBounds:bounds");
        int i3 = rect2.left;
        int i4 = rect3.left;
        int i5 = rect2.top;
        int i6 = rect3.top;
        int i7 = rect2.right;
        int i8 = rect3.right;
        int i9 = rect2.bottom;
        int i10 = rect3.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect4 = (Rect) on1Var.f21675a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) on1Var2.f21675a.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i = 0;
        } else {
            i = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        if (i > 0) {
            if (this.f27527Z) {
                view = view2;
                gu1.m21224f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator m17443a = (i3 == i4 && i5 == i6) ? null : kt0.m17443a(view, f27524h0, m19593z().mo19592a(i3, i5, i4, i6));
                if (rect4 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
                if (rect.equals(rect6)) {
                    objectAnimator = null;
                } else {
                    xs1.m4688y0(view, rect);
                    j31 j31Var = f27525i0;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", j31Var, objArr);
                    ofObject.addListener(new C3068i(view, rect5, i4, i6, i8, i10));
                    objectAnimator = ofObject;
                }
                m14955c = nn1.m14955c(m17443a, objectAnimator);
            } else {
                view = view2;
                gu1.m21224f(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        mo19592a = m19593z().mo19592a(i3, i5, i4, i6);
                        property = f27524h0;
                    } else {
                        C3070k c3070k = new C3070k(view);
                        ObjectAnimator m17443a2 = kt0.m17443a(c3070k, f27520d0, m19593z().mo19592a(i3, i5, i4, i6));
                        ObjectAnimator m17443a3 = kt0.m17443a(c3070k, f27521e0, m19593z().mo19592a(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(m17443a2, m17443a3);
                        animatorSet.addListener(new C3067h(c3070k));
                        m14955c = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    mo19592a = m19593z().mo19592a(i7, i9, i8, i10);
                    property = f27522f0;
                } else {
                    mo19592a = m19593z().mo19592a(i3, i5, i4, i6);
                    property = f27523g0;
                }
                m14955c = kt0.m17443a(view, property, mo19592a);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                et1.m23199c(viewGroup4, true);
                mo15915a(new C3069j(viewGroup4));
            }
            return m14955c;
        }
        return null;
    }
}

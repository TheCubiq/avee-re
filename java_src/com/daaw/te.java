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
/* loaded from: classes.dex */
public class te extends in1 {
    public static final String[] b0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> c0 = new b(PointF.class, "boundsOrigin");
    public static final Property<k, PointF> d0 = new c(PointF.class, "topLeft");
    public static final Property<k, PointF> e0 = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> f0 = new e(PointF.class, "bottomRight");
    public static final Property<View, PointF> g0 = new f(PointF.class, "topLeft");
    public static final Property<View, PointF> h0 = new g(PointF.class, "position");
    public static j31 i0 = new j31();
    public int[] Y = new int[2];
    public boolean Z = false;
    public boolean a0 = false;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ BitmapDrawable b;
        public final /* synthetic */ View c;
        public final /* synthetic */ float d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.a = viewGroup;
            this.b = bitmapDrawable;
            this.c = view;
            this.d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gu1.b(this.a).b(this.b);
            gu1.g(this.c, this.d);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<Drawable, PointF> {
        public Rect a;

        public b(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
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
            gu1.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
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
            gu1.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public static class g extends Property<View, PointF> {
        public g(Class cls, String str) {
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
            gu1.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ k a;
        private k mViewBounds;

        public h(k kVar) {
            this.a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    public class i extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Rect c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.b = view;
            this.c = rect;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            xs1.y0(this.b, this.c);
            gu1.f(this.b, this.d, this.e, this.f, this.g);
        }
    }

    /* loaded from: classes.dex */
    public class j extends jn1 {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public j(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // com.daaw.in1.f
        public void a(in1 in1Var) {
            if (!this.a) {
                et1.c(this.b, false);
            }
            in1Var.T(this);
        }

        @Override // com.daaw.jn1, com.daaw.in1.f
        public void b(in1 in1Var) {
            et1.c(this.b, false);
        }

        @Override // com.daaw.jn1, com.daaw.in1.f
        public void c(in1 in1Var) {
            et1.c(this.b, false);
            this.a = true;
        }

        @Override // com.daaw.jn1, com.daaw.in1.f
        public void e(in1 in1Var) {
            et1.c(this.b, true);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;

        public k(View view) {
            this.e = view;
        }

        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        public final void b() {
            gu1.f(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    @Override // com.daaw.in1
    public String[] H() {
        return b0;
    }

    public final void g0(on1 on1Var) {
        View view = on1Var.b;
        if (!xs1.V(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        on1Var.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        on1Var.a.put("android:changeBounds:parent", on1Var.b.getParent());
        if (this.a0) {
            on1Var.b.getLocationInWindow(this.Y);
            on1Var.a.put("android:changeBounds:windowX", Integer.valueOf(this.Y[0]));
            on1Var.a.put("android:changeBounds:windowY", Integer.valueOf(this.Y[1]));
        }
        if (this.Z) {
            on1Var.a.put("android:changeBounds:clip", xs1.w(view));
        }
    }

    public final boolean h0(View view, View view2) {
        if (this.a0) {
            on1 x = x(view, true);
            if (x == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == x.b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.daaw.in1
    public void i(on1 on1Var) {
        g0(on1Var);
    }

    @Override // com.daaw.in1
    public void m(on1 on1Var) {
        g0(on1Var);
    }

    @Override // com.daaw.in1
    public Animator r(ViewGroup viewGroup, on1 on1Var, on1 on1Var2) {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c2;
        Path a2;
        Property<View, PointF> property;
        if (on1Var == null || on1Var2 == null) {
            return null;
        }
        Map<String, Object> map = on1Var.a;
        Map<String, Object> map2 = on1Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = on1Var2.b;
        if (!h0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) on1Var.a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) on1Var.a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) on1Var2.a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) on1Var2.a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.Y);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c3 = gu1.c(view2);
            gu1.g(view2, 0.0f);
            gu1.b(viewGroup).a(bitmapDrawable);
            aw0 z = z();
            int[] iArr = this.Y;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, rz0.a(c0, z.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c3));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) on1Var.a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) on1Var2.a.get("android:changeBounds:bounds");
        int i4 = rect2.left;
        int i5 = rect3.left;
        int i6 = rect2.top;
        int i7 = rect3.top;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = rect2.bottom;
        int i11 = rect3.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect4 = (Rect) on1Var.a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) on1Var2.a.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 > 0) {
            if (this.Z) {
                view = view2;
                gu1.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                ObjectAnimator a3 = (i4 == i5 && i6 == i7) ? null : kt0.a(view, h0, z().a(i4, i6, i5, i7));
                if (rect4 == null) {
                    i3 = 0;
                    rect = new Rect(0, 0, i12, i13);
                } else {
                    i3 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
                if (rect.equals(rect6)) {
                    objectAnimator = null;
                } else {
                    xs1.y0(view, rect);
                    j31 j31Var = i0;
                    Object[] objArr = new Object[2];
                    objArr[i3] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", j31Var, objArr);
                    ofObject.addListener(new i(view, rect5, i5, i7, i9, i11));
                    objectAnimator = ofObject;
                }
                c2 = nn1.c(a3, objectAnimator);
            } else {
                view = view2;
                gu1.f(view, i4, i6, i8, i10);
                if (i2 == 2) {
                    if (i12 == i14 && i13 == i15) {
                        a2 = z().a(i4, i6, i5, i7);
                        property = h0;
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a4 = kt0.a(kVar, d0, z().a(i4, i6, i5, i7));
                        ObjectAnimator a5 = kt0.a(kVar, e0, z().a(i8, i10, i9, i11));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a4, a5);
                        animatorSet.addListener(new h(kVar));
                        c2 = animatorSet;
                    }
                } else if (i4 == i5 && i6 == i7) {
                    a2 = z().a(i8, i10, i9, i11);
                    property = f0;
                } else {
                    a2 = z().a(i4, i6, i5, i7);
                    property = g0;
                }
                c2 = kt0.a(view, property, a2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                et1.c(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return c2;
        }
        return null;
    }
}

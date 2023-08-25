package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.df;
import com.daaw.en1;
import com.daaw.f3;
import com.daaw.fn1;
import com.daaw.i3;
import com.daaw.jy0;
import com.daaw.m11;
import com.daaw.mf;
import com.daaw.mu;
import com.daaw.of;
import com.daaw.pf;
import com.daaw.rn0;
import com.daaw.rq0;
import com.daaw.sq0;
import com.daaw.xs1;
import com.daaw.z5;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.setVisibility(4);
            this.c.setAlpha(1.0f);
            this.c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ pf a;
        public final /* synthetic */ Drawable b;

        public c(pf pfVar, Drawable drawable) {
            this.a = pfVar;
            this.b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(this.b);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ pf a;

        public d(pf pfVar) {
            this.a = pfVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            pf.e revealInfo = this.a.getRevealInfo();
            revealInfo.c = Float.MAX_VALUE;
            this.a.setRevealInfo(revealInfo);
        }
    }

    /* loaded from: classes2.dex */
    public static class e {
        public rq0 a;
        public jy0 b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet J(View view, View view2, boolean z, boolean z2) {
        e e0 = e0(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.d;
        c0(view, view2, z, z2, e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view, view2, z, e0, arrayList);
        Z(view, view2, z, z2, e0, arrayList, arrayList2);
        Y(view, view2, z, z2, e0, width, height, arrayList, arrayList2);
        V(view, view2, z, z2, e0, arrayList, arrayList2);
        U(view, view2, z, z2, e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        i3.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    public final ViewGroup K(View view) {
        View findViewById = view.findViewById(m11.mtrl_child_content_container);
        return findViewById != null ? f0(findViewById) : ((view instanceof fn1) || (view instanceof en1)) ? f0(((ViewGroup) view).getChildAt(0)) : f0(view);
    }

    public final void L(View view, e eVar, sq0 sq0Var, sq0 sq0Var2, float f, float f2, float f3, float f4, RectF rectF) {
        float S = S(eVar, sq0Var, f, f3);
        float S2 = S(eVar, sq0Var2, f2, f4);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.g, this.h);
    }

    public final Pair<sq0, sq0> N(float f, float f2, boolean z, e eVar) {
        sq0 e2;
        rq0 rq0Var;
        String str;
        if (f == 0.0f || f2 == 0.0f) {
            e2 = eVar.a.e("translationXLinear");
            rq0Var = eVar.a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            e2 = eVar.a.e("translationXCurveDownwards");
            rq0Var = eVar.a;
            str = "translationYCurveDownwards";
        } else {
            e2 = eVar.a.e("translationXCurveUpwards");
            rq0Var = eVar.a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(e2, rq0Var.e(str));
    }

    public final float O(View view, View view2, jy0 jy0Var) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jy0Var), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float P(View view, View view2, jy0 jy0Var) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jy0Var));
        return rectF.centerY() - rectF2.top;
    }

    public final float Q(View view, View view2, jy0 jy0Var) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        int i = jy0Var.a & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jy0Var.b;
        } else {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f = centerX - centerX2;
        return f + jy0Var.b;
    }

    public final float R(View view, View view2, jy0 jy0Var) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        int i = jy0Var.a & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jy0Var.c;
        } else {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f = centerY - centerY2;
        return f + jy0Var.c;
    }

    public final float S(e eVar, sq0 sq0Var, float f, float f2) {
        long c2 = sq0Var.c();
        long d2 = sq0Var.d();
        sq0 e2 = eVar.a.e("expansion");
        return f3.a(f, f2, sq0Var.e().getInterpolation(((float) (((e2.c() + e2.d()) + 17) - c2)) / ((float) d2)));
    }

    public final void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void U(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof pf) && of.a == 0) || (K = K(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    df.a.set(K, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(K, df.a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(K, df.a, 0.0f);
            }
            eVar.a.e("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    public final void V(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof pf) {
            pf pfVar = (pf) view2;
            int d0 = d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    pfVar.setCircularRevealScrimColor(d0);
                }
                ofInt = ObjectAnimator.ofInt(pfVar, pf.d.a, i);
            } else {
                ofInt = ObjectAnimator.ofInt(pfVar, pf.d.a, d0);
            }
            ofInt.setEvaluator(z5.b());
            eVar.a.e("color").a(ofInt);
            list.add(ofInt);
        }
    }

    public final void W(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.b);
        float R = R(view, view2, eVar.b);
        Pair<sq0, sq0> N = N(Q, R, z, eVar);
        sq0 sq0Var = (sq0) N.first;
        sq0 sq0Var2 = (sq0) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        sq0Var.a(ofFloat);
        sq0Var2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    public final void X(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float y = xs1.y(view2) - xs1.y(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-y);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -y);
        }
        eVar.a.e("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    public final void Y(View view, View view2, boolean z, boolean z2, e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof pf) {
            pf pfVar = (pf) view2;
            float O = O(view, view2, eVar.b);
            float P = P(view, view2, eVar.b);
            ((FloatingActionButton) view).i(this.c);
            float width = this.c.width() / 2.0f;
            sq0 e2 = eVar.a.e("expansion");
            if (z) {
                if (!z2) {
                    pfVar.setRevealInfo(new pf.e(O, P, width));
                }
                if (z2) {
                    width = pfVar.getRevealInfo().c;
                }
                animator = mf.a(pfVar, O, P, rn0.b(O, P, 0.0f, 0.0f, f, f2));
                animator.addListener(new d(pfVar));
                b0(view2, e2.c(), (int) O, (int) P, width, list);
            } else {
                float f3 = pfVar.getRevealInfo().c;
                Animator a2 = mf.a(pfVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                b0(view2, e2.c(), i, i2, f3, list);
                a0(view2, e2.c(), e2.d(), eVar.a.f(), i, i2, width, list);
                animator = a2;
            }
            e2.a(animator);
            list.add(animator);
            list2.add(mf.b(pfVar));
        }
    }

    public final void Z(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof pf) && (view instanceof ImageView)) {
            pf pfVar = (pf) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, mu.b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, mu.b, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.a.e("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(pfVar, drawable));
        }
    }

    public final void a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    public final void b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    public final void c0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float Q = Q(view, view2, eVar.b);
        float R = R(view, view2, eVar.b);
        Pair<sq0, sq0> N = N(Q, R, z, eVar);
        sq0 sq0Var = (sq0) N.first;
        sq0 sq0Var2 = (sq0) N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-Q);
                view2.setTranslationY(-R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            L(view2, eVar, sq0Var, sq0Var2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -R);
        }
        sq0Var.a(ofFloat);
        sq0Var2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public final int d0(View view) {
        ColorStateList u = xs1.u(view);
        if (u != null) {
            return u.getColorForState(view.getDrawableState(), u.getDefaultColor());
        }
        return 0;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public abstract e e0(Context context, boolean z);

    public final ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }
}

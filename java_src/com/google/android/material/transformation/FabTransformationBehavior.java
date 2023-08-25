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
import com.daaw.C1079df;
import com.daaw.C1247f3;
import com.daaw.C1653i3;
import com.daaw.C2172mf;
import com.daaw.C2212mu;
import com.daaw.C2434of;
import com.daaw.C3811z5;
import com.daaw.InterfaceC2544pf;
import com.daaw.en1;
import com.daaw.fn1;
import com.daaw.jy0;
import com.daaw.m11;
import com.daaw.rn0;
import com.daaw.rq0;
import com.daaw.sq0;
import com.daaw.xs1;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f37880c;

    /* renamed from: d */
    public final RectF f37881d;

    /* renamed from: e */
    public final RectF f37882e;

    /* renamed from: f */
    public final int[] f37883f;

    /* renamed from: g */
    public float f37884g;

    /* renamed from: h */
    public float f37885h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes2.dex */
    public class C4173a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f37886a;

        /* renamed from: b */
        public final /* synthetic */ View f37887b;

        /* renamed from: c */
        public final /* synthetic */ View f37888c;

        public C4173a(boolean z, View view, View view2) {
            this.f37886a = z;
            this.f37887b = view;
            this.f37888c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f37886a) {
                return;
            }
            this.f37887b.setVisibility(4);
            this.f37888c.setAlpha(1.0f);
            this.f37888c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f37886a) {
                this.f37887b.setVisibility(0);
                this.f37888c.setAlpha(0.0f);
                this.f37888c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes2.dex */
    public class C4174b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f37890a;

        public C4174b(View view) {
            this.f37890a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f37890a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes2.dex */
    public class C4175c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2544pf f37892a;

        /* renamed from: b */
        public final /* synthetic */ Drawable f37893b;

        public C4175c(InterfaceC2544pf interfaceC2544pf, Drawable drawable) {
            this.f37892a = interfaceC2544pf;
            this.f37893b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f37892a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f37892a.setCircularRevealOverlayDrawable(this.f37893b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes2.dex */
    public class C4176d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2544pf f37895a;

        public C4176d(InterfaceC2544pf interfaceC2544pf) {
            this.f37895a = interfaceC2544pf;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC2544pf.C2549e revealInfo = this.f37895a.getRevealInfo();
            revealInfo.f22887c = Float.MAX_VALUE;
            this.f37895a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes2.dex */
    public static class C4177e {

        /* renamed from: a */
        public rq0 f37897a;

        /* renamed from: b */
        public jy0 f37898b;
    }

    public FabTransformationBehavior() {
        this.f37880c = new Rect();
        this.f37881d = new RectF();
        this.f37882e = new RectF();
        this.f37883f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37880c = new Rect();
        this.f37881d = new RectF();
        this.f37882e = new RectF();
        this.f37883f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    public AnimatorSet mo101J(View view, View view2, boolean z, boolean z2) {
        C4177e mo97e0 = mo97e0(view2.getContext(), z);
        if (z) {
            this.f37884g = view.getTranslationX();
            this.f37885h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m111X(view, view2, z, z2, mo97e0, arrayList, arrayList2);
        }
        RectF rectF = this.f37881d;
        m106c0(view, view2, z, z2, mo97e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m112W(view, view2, z, mo97e0, arrayList);
        m109Z(view, view2, z, z2, mo97e0, arrayList, arrayList2);
        m110Y(view, view2, z, z2, mo97e0, width, height, arrayList, arrayList2);
        m113V(view, view2, z, z2, mo97e0, arrayList, arrayList2);
        m114U(view, view2, z, z2, mo97e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C1653i3.m20165a(animatorSet, arrayList);
        animatorSet.addListener(new C4173a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: K */
    public final ViewGroup m124K(View view) {
        View findViewById = view.findViewById(m11.mtrl_child_content_container);
        return findViewById != null ? m104f0(findViewById) : ((view instanceof fn1) || (view instanceof en1)) ? m104f0(((ViewGroup) view).getChildAt(0)) : m104f0(view);
    }

    /* renamed from: L */
    public final void m123L(View view, C4177e c4177e, sq0 sq0Var, sq0 sq0Var2, float f, float f2, float f3, float f4, RectF rectF) {
        float m116S = m116S(c4177e, sq0Var, f, f3);
        float m116S2 = m116S(c4177e, sq0Var2, f2, f4);
        Rect rect = this.f37880c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f37881d;
        rectF2.set(rect);
        RectF rectF3 = this.f37882e;
        m115T(view, rectF3);
        rectF3.offset(m116S, m116S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    public final void m122M(View view, RectF rectF) {
        m115T(view, rectF);
        rectF.offset(this.f37884g, this.f37885h);
    }

    /* renamed from: N */
    public final Pair<sq0, sq0> m121N(float f, float f2, boolean z, C4177e c4177e) {
        sq0 m11067e;
        rq0 rq0Var;
        String str;
        if (f == 0.0f || f2 == 0.0f) {
            m11067e = c4177e.f37897a.m11067e("translationXLinear");
            rq0Var = c4177e.f37897a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            m11067e = c4177e.f37897a.m11067e("translationXCurveDownwards");
            rq0Var = c4177e.f37897a;
            str = "translationYCurveDownwards";
        } else {
            m11067e = c4177e.f37897a.m11067e("translationXCurveUpwards");
            rq0Var = c4177e.f37897a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(m11067e, rq0Var.m11067e(str));
    }

    /* renamed from: O */
    public final float m120O(View view, View view2, jy0 jy0Var) {
        RectF rectF = this.f37881d;
        RectF rectF2 = this.f37882e;
        m122M(view, rectF);
        m115T(view2, rectF2);
        rectF2.offset(-m118Q(view, view2, jy0Var), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    public final float m119P(View view, View view2, jy0 jy0Var) {
        RectF rectF = this.f37881d;
        RectF rectF2 = this.f37882e;
        m122M(view, rectF);
        m115T(view2, rectF2);
        rectF2.offset(0.0f, -m117R(view, view2, jy0Var));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    public final float m118Q(View view, View view2, jy0 jy0Var) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.f37881d;
        RectF rectF2 = this.f37882e;
        m122M(view, rectF);
        m115T(view2, rectF2);
        int i = jy0Var.f15505a & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jy0Var.f15506b;
        } else {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f = centerX - centerX2;
        return f + jy0Var.f15506b;
    }

    /* renamed from: R */
    public final float m117R(View view, View view2, jy0 jy0Var) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.f37881d;
        RectF rectF2 = this.f37882e;
        m122M(view, rectF);
        m115T(view2, rectF2);
        int i = jy0Var.f15505a & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jy0Var.f15507c;
        } else {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f = centerY - centerY2;
        return f + jy0Var.f15507c;
    }

    /* renamed from: S */
    public final float m116S(C4177e c4177e, sq0 sq0Var, float f, float f2) {
        long m10050c = sq0Var.m10050c();
        long m10049d = sq0Var.m10049d();
        sq0 m11067e = c4177e.f37897a.m11067e("expansion");
        return C1247f3.m22951a(f, f2, sq0Var.m10048e().getInterpolation(((float) (((m11067e.m10050c() + m11067e.m10049d()) + 17) - m10050c)) / ((float) m10049d)));
    }

    /* renamed from: T */
    public final void m115T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f37883f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    public final void m114U(View view, View view2, boolean z, boolean z2, C4177e c4177e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup m124K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof InterfaceC2544pf) && C2434of.f21530a == 0) || (m124K = m124K(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C1079df.f7025a.set(m124K, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(m124K, C1079df.f7025a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(m124K, C1079df.f7025a, 0.0f);
            }
            c4177e.f37897a.m11067e("contentFade").m10052a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* renamed from: V */
    public final void m113V(View view, View view2, boolean z, boolean z2, C4177e c4177e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof InterfaceC2544pf) {
            InterfaceC2544pf interfaceC2544pf = (InterfaceC2544pf) view2;
            int m105d0 = m105d0(view);
            int i = 16777215 & m105d0;
            if (z) {
                if (!z2) {
                    interfaceC2544pf.setCircularRevealScrimColor(m105d0);
                }
                ofInt = ObjectAnimator.ofInt(interfaceC2544pf, InterfaceC2544pf.C2548d.f22884a, i);
            } else {
                ofInt = ObjectAnimator.ofInt(interfaceC2544pf, InterfaceC2544pf.C2548d.f22884a, m105d0);
            }
            ofInt.setEvaluator(C3811z5.m2814b());
            c4177e.f37897a.m11067e("color").m10052a(ofInt);
            list.add(ofInt);
        }
    }

    /* renamed from: W */
    public final void m112W(View view, View view2, boolean z, C4177e c4177e, List<Animator> list) {
        float m118Q = m118Q(view, view2, c4177e.f37898b);
        float m117R = m117R(view, view2, c4177e.f37898b);
        Pair<sq0, sq0> m121N = m121N(m118Q, m117R, z, c4177e);
        sq0 sq0Var = (sq0) m121N.first;
        sq0 sq0Var2 = (sq0) m121N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m118Q = this.f37884g;
        }
        fArr[0] = m118Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            m117R = this.f37885h;
        }
        fArr2[0] = m117R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        sq0Var.m10052a(ofFloat);
        sq0Var2.m10052a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    public final void m111X(View view, View view2, boolean z, boolean z2, C4177e c4177e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float m4689y = xs1.m4689y(view2) - xs1.m4689y(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m4689y);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -m4689y);
        }
        c4177e.f37897a.m11067e("elevation").m10052a(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: Y */
    public final void m110Y(View view, View view2, boolean z, boolean z2, C4177e c4177e, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof InterfaceC2544pf) {
            InterfaceC2544pf interfaceC2544pf = (InterfaceC2544pf) view2;
            float m120O = m120O(view, view2, c4177e.f37898b);
            float m119P = m119P(view, view2, c4177e.f37898b);
            ((FloatingActionButton) view).m458i(this.f37880c);
            float width = this.f37880c.width() / 2.0f;
            sq0 m11067e = c4177e.f37897a.m11067e("expansion");
            if (z) {
                if (!z2) {
                    interfaceC2544pf.setRevealInfo(new InterfaceC2544pf.C2549e(m120O, m119P, width));
                }
                if (z2) {
                    width = interfaceC2544pf.getRevealInfo().f22887c;
                }
                animator = C2172mf.m16047a(interfaceC2544pf, m120O, m119P, rn0.m11159b(m120O, m119P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C4176d(interfaceC2544pf));
                m107b0(view2, m11067e.m10050c(), (int) m120O, (int) m119P, width, list);
            } else {
                float f3 = interfaceC2544pf.getRevealInfo().f22887c;
                Animator m16047a = C2172mf.m16047a(interfaceC2544pf, m120O, m119P, width);
                int i = (int) m120O;
                int i2 = (int) m119P;
                m107b0(view2, m11067e.m10050c(), i, i2, f3, list);
                m108a0(view2, m11067e.m10050c(), m11067e.m10049d(), c4177e.f37897a.m11066f(), i, i2, width, list);
                animator = m16047a;
            }
            m11067e.m10052a(animator);
            list.add(animator);
            list2.add(C2172mf.m16046b(interfaceC2544pf));
        }
    }

    /* renamed from: Z */
    public final void m109Z(View view, View view2, boolean z, boolean z2, C4177e c4177e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC2544pf) && (view instanceof ImageView)) {
            InterfaceC2544pf interfaceC2544pf = (InterfaceC2544pf) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, C2212mu.f19151b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, C2212mu.f19151b, 255);
            }
            ofInt.addUpdateListener(new C4174b(view2));
            c4177e.f37897a.m11067e("iconFade").m10052a(ofInt);
            list.add(ofInt);
            list2.add(new C4175c(interfaceC2544pf, drawable));
        }
    }

    /* renamed from: a0 */
    public final void m108a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
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

    /* renamed from: b0 */
    public final void m107b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    /* renamed from: c0 */
    public final void m106c0(View view, View view2, boolean z, boolean z2, C4177e c4177e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m118Q = m118Q(view, view2, c4177e.f37898b);
        float m117R = m117R(view, view2, c4177e.f37898b);
        Pair<sq0, sq0> m121N = m121N(m118Q, m117R, z, c4177e);
        sq0 sq0Var = (sq0) m121N.first;
        sq0 sq0Var2 = (sq0) m121N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m118Q);
                view2.setTranslationY(-m117R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m123L(view2, c4177e, sq0Var, sq0Var2, -m118Q, -m117R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m118Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -m117R);
        }
        sq0Var.m10052a(ofFloat);
        sq0Var2.m10052a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d0 */
    public final int m105d0(View view) {
        ColorStateList m4697u = xs1.m4697u(view);
        if (m4697u != null) {
            return m4697u.getColorForState(view.getDrawableState(), m4697u.getDefaultColor());
        }
        return 0;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: e */
    public boolean mo99e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: e0 */
    public abstract C4177e mo97e0(Context context, boolean z);

    /* renamed from: f0 */
    public final ViewGroup m104f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: g */
    public void mo103g(CoordinatorLayout.C0197f c0197f) {
        if (c0197f.f1143h == 0) {
            c0197f.f1143h = 80;
        }
    }
}

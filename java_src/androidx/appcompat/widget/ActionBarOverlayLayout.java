package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC0091i;
import com.daaw.InterfaceC1605hq;
import com.daaw.InterfaceC1745iq;
import com.daaw.gg0;
import com.daaw.gs0;
import com.daaw.hs0;
import com.daaw.hu1;
import com.daaw.is0;
import com.daaw.js0;
import com.daaw.o11;
import com.daaw.px1;
import com.daaw.x01;
import com.daaw.xs1;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1605hq, is0, gs0, hs0 {

    /* renamed from: U */
    public static final int[] f489U = {x01.actionBarSize, 16842841};

    /* renamed from: A */
    public int f490A;

    /* renamed from: B */
    public int f491B;

    /* renamed from: C */
    public final Rect f492C;

    /* renamed from: D */
    public final Rect f493D;

    /* renamed from: E */
    public final Rect f494E;

    /* renamed from: F */
    public final Rect f495F;

    /* renamed from: G */
    public final Rect f496G;

    /* renamed from: H */
    public final Rect f497H;

    /* renamed from: I */
    public final Rect f498I;

    /* renamed from: J */
    public px1 f499J;

    /* renamed from: K */
    public px1 f500K;

    /* renamed from: L */
    public px1 f501L;

    /* renamed from: M */
    public px1 f502M;

    /* renamed from: N */
    public InterfaceC0104d f503N;

    /* renamed from: O */
    public OverScroller f504O;

    /* renamed from: P */
    public ViewPropertyAnimator f505P;

    /* renamed from: Q */
    public final AnimatorListenerAdapter f506Q;

    /* renamed from: R */
    public final Runnable f507R;

    /* renamed from: S */
    public final Runnable f508S;

    /* renamed from: T */
    public final js0 f509T;

    /* renamed from: p */
    public int f510p;

    /* renamed from: q */
    public int f511q;

    /* renamed from: r */
    public ContentFrameLayout f512r;

    /* renamed from: s */
    public ActionBarContainer f513s;

    /* renamed from: t */
    public InterfaceC1745iq f514t;

    /* renamed from: u */
    public Drawable f515u;

    /* renamed from: v */
    public boolean f516v;

    /* renamed from: w */
    public boolean f517w;

    /* renamed from: x */
    public boolean f518x;

    /* renamed from: y */
    public boolean f519y;

    /* renamed from: z */
    public boolean f520z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    public class C0101a extends AnimatorListenerAdapter {
        public C0101a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f505P = null;
            actionBarOverlayLayout.f520z = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f505P = null;
            actionBarOverlayLayout.f520z = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    public class RunnableC0102b implements Runnable {
        public RunnableC0102b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m30147u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f505P = actionBarOverlayLayout.f513s.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f506Q);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    public class RunnableC0103c implements Runnable {
        public RunnableC0103c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m30147u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f505P = actionBarOverlayLayout.f513s.animate().translationY(-ActionBarOverlayLayout.this.f513s.getHeight()).setListener(ActionBarOverlayLayout.this.f506Q);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0104d {
        /* renamed from: a */
        void mo15703a();

        /* renamed from: b */
        void mo15702b();

        /* renamed from: c */
        void mo15701c(boolean z);

        /* renamed from: d */
        void mo15700d();

        /* renamed from: e */
        void mo15699e();

        void onWindowVisibilityChanged(int i);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0105e extends ViewGroup.MarginLayoutParams {
        public C0105e(int i, int i2) {
            super(i, i2);
        }

        public C0105e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0105e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f511q = 0;
        this.f492C = new Rect();
        this.f493D = new Rect();
        this.f494E = new Rect();
        this.f495F = new Rect();
        this.f496G = new Rect();
        this.f497H = new Rect();
        this.f498I = new Rect();
        px1 px1Var = px1.f23475b;
        this.f499J = px1Var;
        this.f500K = px1Var;
        this.f501L = px1Var;
        this.f502M = px1Var;
        this.f506Q = new C0101a();
        this.f507R = new RunnableC0102b();
        this.f508S = new RunnableC0103c();
        m30146v(context);
        this.f509T = new js0(this);
    }

    /* renamed from: A */
    public final void m30154A() {
        m30147u();
        this.f507R.run();
    }

    /* renamed from: B */
    public final boolean m30153B(float f) {
        this.f504O.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f504O.getFinalY() > this.f513s.getHeight();
    }

    @Override // com.daaw.InterfaceC1605hq
    /* renamed from: a */
    public void mo20513a(Menu menu, InterfaceC0091i.InterfaceC0092a interfaceC0092a) {
        m30142z();
        this.f514t.mo19528a(menu, interfaceC0092a);
    }

    @Override // com.daaw.InterfaceC1605hq
    /* renamed from: b */
    public boolean mo20512b() {
        m30142z();
        return this.f514t.mo19527b();
    }

    @Override // com.daaw.InterfaceC1605hq
    /* renamed from: c */
    public void mo20511c() {
        m30142z();
        this.f514t.mo19526c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0105e;
    }

    @Override // com.daaw.InterfaceC1605hq
    /* renamed from: d */
    public boolean mo20510d() {
        m30142z();
        return this.f514t.mo19525d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f515u == null || this.f516v) {
            return;
        }
        int bottom = this.f513s.getVisibility() == 0 ? (int) (this.f513s.getBottom() + this.f513s.getTranslationY() + 0.5f) : 0;
        this.f515u.setBounds(0, bottom, getWidth(), this.f515u.getIntrinsicHeight() + bottom);
        this.f515u.draw(canvas);
    }

    @Override // com.daaw.InterfaceC1605hq
    /* renamed from: e */
    public boolean mo20509e() {
        m30142z();
        return this.f514t.mo19524e();
    }

    @Override // com.daaw.InterfaceC1605hq
    /* renamed from: f */
    public boolean mo20508f() {
        m30142z();
        return this.f514t.mo19523f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        m30142z();
        boolean m30151q = m30151q(this.f513s, rect, true, true, false, true);
        this.f495F.set(rect);
        hu1.m20418a(this, this.f495F, this.f492C);
        if (!this.f496G.equals(this.f495F)) {
            this.f496G.set(this.f495F);
            m30151q = true;
        }
        if (!this.f493D.equals(this.f492C)) {
            this.f493D.set(this.f492C);
            m30151q = true;
        }
        if (m30151q) {
            requestLayout();
        }
        return true;
    }

    @Override // com.daaw.InterfaceC1605hq
    /* renamed from: g */
    public boolean mo20507g() {
        m30142z();
        return this.f514t.mo19522g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0105e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f513s;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f509T.m18279a();
    }

    public CharSequence getTitle() {
        m30142z();
        return this.f514t.getTitle();
    }

    @Override // com.daaw.InterfaceC1605hq
    /* renamed from: h */
    public void mo20506h(int i) {
        m30142z();
        if (i == 2) {
            this.f514t.mo19506w();
        } else if (i == 5) {
            this.f514t.mo19505x();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // com.daaw.InterfaceC1605hq
    /* renamed from: i */
    public void mo20505i() {
        m30142z();
        this.f514t.mo19521h();
    }

    @Override // com.daaw.hs0
    /* renamed from: j */
    public void mo20442j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo21299k(view, i, i2, i3, i4, i5);
    }

    @Override // com.daaw.gs0
    /* renamed from: k */
    public void mo21299k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // com.daaw.gs0
    /* renamed from: l */
    public boolean mo21298l(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // com.daaw.gs0
    /* renamed from: m */
    public void mo21297m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // com.daaw.gs0
    /* renamed from: n */
    public void mo21296n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // com.daaw.gs0
    /* renamed from: o */
    public void mo21295o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m30142z();
        px1 m12937x = px1.m12937x(windowInsets, this);
        boolean m30151q = m30151q(this.f513s, new Rect(m12937x.m12951j(), m12937x.m12949l(), m12937x.m12950k(), m12937x.m12952i()), true, true, false, true);
        xs1.m4723h(this, m12937x, this.f492C);
        Rect rect = this.f492C;
        px1 m12947n = m12937x.m12947n(rect.left, rect.top, rect.right, rect.bottom);
        this.f499J = m12947n;
        boolean z = true;
        if (!this.f500K.equals(m12947n)) {
            this.f500K = this.f499J;
            m30151q = true;
        }
        if (this.f493D.equals(this.f492C)) {
            z = m30151q;
        } else {
            this.f493D.set(this.f492C);
        }
        if (z) {
            requestLayout();
        }
        return m12937x.m12960a().m12958c().m12959b().m12939v();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m30146v(getContext());
        xs1.m4708o0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m30147u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0105e c0105e = (C0105e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0105e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0105e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        px1 m12935a;
        m30142z();
        measureChildWithMargins(this.f513s, i, 0, i2, 0);
        C0105e c0105e = (C0105e) this.f513s.getLayoutParams();
        int max = Math.max(0, this.f513s.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0105e).leftMargin + ((ViewGroup.MarginLayoutParams) c0105e).rightMargin);
        int max2 = Math.max(0, this.f513s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0105e).topMargin + ((ViewGroup.MarginLayoutParams) c0105e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f513s.getMeasuredState());
        boolean z = (xs1.m4749O(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f510p;
            if (this.f518x && this.f513s.getTabContainer() != null) {
                measuredHeight += this.f510p;
            }
        } else {
            measuredHeight = this.f513s.getVisibility() != 8 ? this.f513s.getMeasuredHeight() : 0;
        }
        this.f494E.set(this.f492C);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            this.f501L = this.f499J;
        } else {
            this.f497H.set(this.f495F);
        }
        if (!this.f517w && !z) {
            Rect rect = this.f494E;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i3 >= 21) {
                m12935a = this.f501L.m12947n(0, measuredHeight, 0, 0);
                this.f501L = m12935a;
            }
        } else if (i3 >= 21) {
            m12935a = new px1.C2652b(this.f501L).m12933c(gg0.m21660b(this.f501L.m12951j(), this.f501L.m12949l() + measuredHeight, this.f501L.m12950k(), this.f501L.m12952i() + 0)).m12935a();
            this.f501L = m12935a;
        } else {
            Rect rect2 = this.f497H;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m30151q(this.f512r, this.f494E, true, true, true, true);
        if (i3 >= 21 && !this.f502M.equals(this.f501L)) {
            px1 px1Var = this.f501L;
            this.f502M = px1Var;
            xs1.m4721i(this.f512r, px1Var);
        } else if (i3 < 21 && !this.f498I.equals(this.f497H)) {
            this.f498I.set(this.f497H);
            this.f512r.m30062a(this.f497H);
        }
        measureChildWithMargins(this.f512r, i, 0, i2, 0);
        C0105e c0105e2 = (C0105e) this.f512r.getLayoutParams();
        int max3 = Math.max(max, this.f512r.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0105e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0105e2).rightMargin);
        int max4 = Math.max(max2, this.f512r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0105e2).topMargin + ((ViewGroup.MarginLayoutParams) c0105e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f512r.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f519y && z) {
            if (m30153B(f2)) {
                m30152p();
            } else {
                m30154A();
            }
            this.f520z = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f490A + i2;
        this.f490A = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f509T.m18278b(view, view2, i);
        this.f490A = getActionBarHideOffset();
        m30147u();
        InterfaceC0104d interfaceC0104d = this.f503N;
        if (interfaceC0104d != null) {
            interfaceC0104d.mo15699e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f513s.getVisibility() != 0) {
            return false;
        }
        return this.f519y;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onStopNestedScroll(View view) {
        if (this.f519y && !this.f520z) {
            if (this.f490A <= this.f513s.getHeight()) {
                m30143y();
            } else {
                m30144x();
            }
        }
        InterfaceC0104d interfaceC0104d = this.f503N;
        if (interfaceC0104d != null) {
            interfaceC0104d.mo15702b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m30142z();
        int i2 = this.f491B ^ i;
        this.f491B = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0104d interfaceC0104d = this.f503N;
        if (interfaceC0104d != null) {
            interfaceC0104d.mo15701c(!z2);
            if (z || !z2) {
                this.f503N.mo15703a();
            } else {
                this.f503N.mo15700d();
            }
        }
        if ((i2 & 256) == 0 || this.f503N == null) {
            return;
        }
        xs1.m4708o0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f511q = i;
        InterfaceC0104d interfaceC0104d = this.f503N;
        if (interfaceC0104d != null) {
            interfaceC0104d.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: p */
    public final void m30152p() {
        m30147u();
        this.f508S.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m30151q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C0105e c0105e = (C0105e) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) c0105e).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) c0105e).leftMargin = i2;
                z5 = true;
                if (z2) {
                    int i3 = ((ViewGroup.MarginLayoutParams) c0105e).topMargin;
                    int i4 = rect.top;
                    if (i3 != i4) {
                        ((ViewGroup.MarginLayoutParams) c0105e).topMargin = i4;
                        z5 = true;
                    }
                }
                if (z4) {
                    int i5 = ((ViewGroup.MarginLayoutParams) c0105e).rightMargin;
                    int i6 = rect.right;
                    if (i5 != i6) {
                        ((ViewGroup.MarginLayoutParams) c0105e).rightMargin = i6;
                        z5 = true;
                    }
                }
                if (z3) {
                    int i7 = ((ViewGroup.MarginLayoutParams) c0105e).bottomMargin;
                    int i8 = rect.bottom;
                    if (i7 != i8) {
                        ((ViewGroup.MarginLayoutParams) c0105e).bottomMargin = i8;
                        return true;
                    }
                }
                return z5;
            }
        }
        z5 = false;
        if (z2) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    /* renamed from: r */
    public C0105e generateDefaultLayoutParams() {
        return new C0105e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s */
    public C0105e generateLayoutParams(AttributeSet attributeSet) {
        return new C0105e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        m30147u();
        this.f513s.setTranslationY(-Math.max(0, Math.min(i, this.f513s.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0104d interfaceC0104d) {
        this.f503N = interfaceC0104d;
        if (getWindowToken() != null) {
            this.f503N.onWindowVisibilityChanged(this.f511q);
            int i = this.f491B;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                xs1.m4708o0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f518x = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f519y) {
            this.f519y = z;
            if (z) {
                return;
            }
            m30147u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m30142z();
        this.f514t.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m30142z();
        this.f514t.setIcon(drawable);
    }

    public void setLogo(int i) {
        m30142z();
        this.f514t.mo19514o(i);
    }

    public void setOverlayMode(boolean z) {
        this.f517w = z;
        this.f516v = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // com.daaw.InterfaceC1605hq
    public void setWindowCallback(Window.Callback callback) {
        m30142z();
        this.f514t.setWindowCallback(callback);
    }

    @Override // com.daaw.InterfaceC1605hq
    public void setWindowTitle(CharSequence charSequence) {
        m30142z();
        this.f514t.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final InterfaceC1745iq m30148t(View view) {
        if (view instanceof InterfaceC1745iq) {
            return (InterfaceC1745iq) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: u */
    public void m30147u() {
        removeCallbacks(this.f507R);
        removeCallbacks(this.f508S);
        ViewPropertyAnimator viewPropertyAnimator = this.f505P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: v */
    public final void m30146v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f489U);
        this.f510p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f515u = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f516v = context.getApplicationInfo().targetSdkVersion < 19;
        this.f504O = new OverScroller(context);
    }

    /* renamed from: w */
    public boolean m30145w() {
        return this.f517w;
    }

    /* renamed from: x */
    public final void m30144x() {
        m30147u();
        postDelayed(this.f508S, 600L);
    }

    /* renamed from: y */
    public final void m30143y() {
        m30147u();
        postDelayed(this.f507R, 600L);
    }

    /* renamed from: z */
    public void m30142z() {
        if (this.f512r == null) {
            this.f512r = (ContentFrameLayout) findViewById(o11.action_bar_activity_content);
            this.f513s = (ActionBarContainer) findViewById(o11.action_bar_container);
            this.f514t = m30148t(findViewById(o11.action_bar));
        }
    }
}

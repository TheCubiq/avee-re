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
import androidx.appcompat.view.menu.i;
import com.daaw.gg0;
import com.daaw.gs0;
import com.daaw.hq;
import com.daaw.hs0;
import com.daaw.hu1;
import com.daaw.iq;
import com.daaw.is0;
import com.daaw.js0;
import com.daaw.o11;
import com.daaw.px1;
import com.daaw.x01;
import com.daaw.xs1;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements hq, is0, gs0, hs0 {
    public static final int[] U = {x01.actionBarSize, 16842841};
    public int A;
    public int B;
    public final Rect C;
    public final Rect D;
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public final Rect H;
    public final Rect I;
    public px1 J;
    public px1 K;
    public px1 L;
    public px1 M;
    public d N;
    public OverScroller O;
    public ViewPropertyAnimator P;
    public final AnimatorListenerAdapter Q;
    public final Runnable R;
    public final Runnable S;
    public final js0 T;
    public int p;
    public int q;
    public ContentFrameLayout r;
    public ActionBarContainer s;
    public iq t;
    public Drawable u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.P = null;
            actionBarOverlayLayout.z = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.P = null;
            actionBarOverlayLayout.z = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.P = actionBarOverlayLayout.s.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.Q);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.P = actionBarOverlayLayout.s.animate().translationY(-ActionBarOverlayLayout.this.s.getHeight()).setListener(ActionBarOverlayLayout.this.Q);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(boolean z);

        void d();

        void e();

        void onWindowVisibilityChanged(int i);
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i, int i2) {
            super(i, i2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 0;
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        this.H = new Rect();
        this.I = new Rect();
        px1 px1Var = px1.b;
        this.J = px1Var;
        this.K = px1Var;
        this.L = px1Var;
        this.M = px1Var;
        this.Q = new a();
        this.R = new b();
        this.S = new c();
        v(context);
        this.T = new js0(this);
    }

    public final void A() {
        u();
        this.R.run();
    }

    public final boolean B(float f) {
        this.O.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.O.getFinalY() > this.s.getHeight();
    }

    @Override // com.daaw.hq
    public void a(Menu menu, i.a aVar) {
        z();
        this.t.a(menu, aVar);
    }

    @Override // com.daaw.hq
    public boolean b() {
        z();
        return this.t.b();
    }

    @Override // com.daaw.hq
    public void c() {
        z();
        this.t.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // com.daaw.hq
    public boolean d() {
        z();
        return this.t.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.u == null || this.v) {
            return;
        }
        int bottom = this.s.getVisibility() == 0 ? (int) (this.s.getBottom() + this.s.getTranslationY() + 0.5f) : 0;
        this.u.setBounds(0, bottom, getWidth(), this.u.getIntrinsicHeight() + bottom);
        this.u.draw(canvas);
    }

    @Override // com.daaw.hq
    public boolean e() {
        z();
        return this.t.e();
    }

    @Override // com.daaw.hq
    public boolean f() {
        z();
        return this.t.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean q = q(this.s, rect, true, true, false, true);
        this.F.set(rect);
        hu1.a(this, this.F, this.C);
        if (!this.G.equals(this.F)) {
            this.G.set(this.F);
            q = true;
        }
        if (!this.D.equals(this.C)) {
            this.D.set(this.C);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    @Override // com.daaw.hq
    public boolean g() {
        z();
        return this.t.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.s;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.T.a();
    }

    public CharSequence getTitle() {
        z();
        return this.t.getTitle();
    }

    @Override // com.daaw.hq
    public void h(int i) {
        z();
        if (i == 2) {
            this.t.w();
        } else if (i == 5) {
            this.t.x();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // com.daaw.hq
    public void i() {
        z();
        this.t.h();
    }

    @Override // com.daaw.hs0
    public void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        k(view, i, i2, i3, i4, i5);
    }

    @Override // com.daaw.gs0
    public void k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // com.daaw.gs0
    public boolean l(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // com.daaw.gs0
    public void m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // com.daaw.gs0
    public void n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // com.daaw.gs0
    public void o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        px1 x = px1.x(windowInsets, this);
        boolean q = q(this.s, new Rect(x.j(), x.l(), x.k(), x.i()), true, true, false, true);
        xs1.h(this, x, this.C);
        Rect rect = this.C;
        px1 n = x.n(rect.left, rect.top, rect.right, rect.bottom);
        this.J = n;
        boolean z = true;
        if (!this.K.equals(n)) {
            this.K = this.J;
            q = true;
        }
        if (this.D.equals(this.C)) {
            z = q;
        } else {
            this.D.set(this.C);
        }
        if (z) {
            requestLayout();
        }
        return x.a().c().b().v();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        xs1.o0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        px1 a2;
        z();
        measureChildWithMargins(this.s, i, 0, i2, 0);
        e eVar = (e) this.s.getLayoutParams();
        int max = Math.max(0, this.s.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.s.getMeasuredState());
        boolean z = (xs1.O(this) & 256) != 0;
        if (z) {
            measuredHeight = this.p;
            if (this.x && this.s.getTabContainer() != null) {
                measuredHeight += this.p;
            }
        } else {
            measuredHeight = this.s.getVisibility() != 8 ? this.s.getMeasuredHeight() : 0;
        }
        this.E.set(this.C);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            this.L = this.J;
        } else {
            this.H.set(this.F);
        }
        if (!this.w && !z) {
            Rect rect = this.E;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i3 >= 21) {
                a2 = this.L.n(0, measuredHeight, 0, 0);
                this.L = a2;
            }
        } else if (i3 >= 21) {
            a2 = new px1.b(this.L).c(gg0.b(this.L.j(), this.L.l() + measuredHeight, this.L.k(), this.L.i() + 0)).a();
            this.L = a2;
        } else {
            Rect rect2 = this.H;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        q(this.r, this.E, true, true, true, true);
        if (i3 >= 21 && !this.M.equals(this.L)) {
            px1 px1Var = this.L;
            this.M = px1Var;
            xs1.i(this.r, px1Var);
        } else if (i3 < 21 && !this.I.equals(this.H)) {
            this.I.set(this.H);
            this.r.a(this.H);
        }
        measureChildWithMargins(this.r, i, 0, i2, 0);
        e eVar2 = (e) this.r.getLayoutParams();
        int max3 = Math.max(max, this.r.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.r.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.y && z) {
            if (B(f2)) {
                p();
            } else {
                A();
            }
            this.z = true;
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
        int i5 = this.A + i2;
        this.A = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.T.b(view, view2, i);
        this.A = getActionBarHideOffset();
        u();
        d dVar = this.N;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.s.getVisibility() != 0) {
            return false;
        }
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onStopNestedScroll(View view) {
        if (this.y && !this.z) {
            if (this.A <= this.s.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.N;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        z();
        int i2 = this.B ^ i;
        this.B = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.N;
        if (dVar != null) {
            dVar.c(!z2);
            if (z || !z2) {
                this.N.a();
            } else {
                this.N.d();
            }
        }
        if ((i2 & 256) == 0 || this.N == null) {
            return;
        }
        xs1.o0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.q = i;
        d dVar = this.N;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i);
        }
    }

    public final void p() {
        u();
        this.S.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        u();
        this.s.setTranslationY(-Math.max(0, Math.min(i, this.s.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.N = dVar;
        if (getWindowToken() != null) {
            this.N.onWindowVisibilityChanged(this.q);
            int i = this.B;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                xs1.o0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.x = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.y) {
            this.y = z;
            if (z) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        z();
        this.t.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.t.setIcon(drawable);
    }

    public void setLogo(int i) {
        z();
        this.t.o(i);
    }

    public void setOverlayMode(boolean z) {
        this.w = z;
        this.v = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // com.daaw.hq
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.t.setWindowCallback(callback);
    }

    @Override // com.daaw.hq
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.t.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final iq t(View view) {
        if (view instanceof iq) {
            return (iq) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void u() {
        removeCallbacks(this.R);
        removeCallbacks(this.S);
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(U);
        this.p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.u = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.v = context.getApplicationInfo().targetSdkVersion < 19;
        this.O = new OverScroller(context);
    }

    public boolean w() {
        return this.w;
    }

    public final void x() {
        u();
        postDelayed(this.S, 600L);
    }

    public final void y() {
        u();
        postDelayed(this.R, 600L);
    }

    public void z() {
        if (this.r == null) {
            this.r = (ContentFrameLayout) findViewById(o11.action_bar_activity_content);
            this.s = (ActionBarContainer) findViewById(o11.action_bar_container);
            this.t = t(findViewById(o11.action_bar));
        }
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.C0086g;
import androidx.appcompat.view.menu.InterfaceC0091i;
import androidx.appcompat.view.menu.InterfaceC0093j;
import androidx.appcompat.widget.C0164b;
import com.daaw.hu1;
/* loaded from: classes.dex */
public class ActionMenuView extends C0164b implements C0082e.InterfaceC0084b, InterfaceC0093j {

    /* renamed from: E */
    public C0082e f554E;

    /* renamed from: F */
    public Context f555F;

    /* renamed from: G */
    public int f556G;

    /* renamed from: H */
    public boolean f557H;

    /* renamed from: I */
    public ActionMenuPresenter f558I;

    /* renamed from: J */
    public InterfaceC0091i.InterfaceC0092a f559J;

    /* renamed from: K */
    public C0082e.InterfaceC0083a f560K;

    /* renamed from: L */
    public boolean f561L;

    /* renamed from: M */
    public int f562M;

    /* renamed from: N */
    public int f563N;

    /* renamed from: O */
    public int f564O;

    /* renamed from: P */
    public InterfaceC0118e f565P;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0114a {
        /* renamed from: a */
        boolean mo30096a();

        /* renamed from: b */
        boolean mo30095b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0115b implements InterfaceC0091i.InterfaceC0092a {
        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: b */
        public void mo24218b(C0082e c0082e, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: c */
        public boolean mo24217c(C0082e c0082e) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0116c extends C0164b.C0165a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f566a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f567b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f568c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f569d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f570e;

        /* renamed from: f */
        public boolean f571f;

        public C0116c(int i, int i2) {
            super(i, i2);
            this.f566a = false;
        }

        public C0116c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0116c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0116c(C0116c c0116c) {
            super(c0116c);
            this.f566a = c0116c.f566a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0117d implements C0082e.InterfaceC0083a {
        public C0117d() {
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: a */
        public boolean mo330a(C0082e c0082e, MenuItem menuItem) {
            InterfaceC0118e interfaceC0118e = ActionMenuView.this.f565P;
            return interfaceC0118e != null && interfaceC0118e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: b */
        public void mo329b(C0082e c0082e) {
            C0082e.InterfaceC0083a interfaceC0083a = ActionMenuView.this.f560K;
            if (interfaceC0083a != null) {
                interfaceC0083a.mo329b(c0082e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0118e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f563N = (int) (56.0f * f);
        this.f564O = (int) (f * 4.0f);
        this.f555F = context;
        this.f556G = 0;
    }

    /* renamed from: L */
    public static int m30102L(View view, int i, int i2, int i3, int i4) {
        C0116c c0116c = (C0116c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m30298f();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        c0116c.f569d = (c0116c.f566a || !z2) ? false : false;
        c0116c.f567b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: B */
    public void m30112B() {
        ActionMenuPresenter actionMenuPresenter = this.f558I;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m30141A();
        }
    }

    @Override // androidx.appcompat.widget.C0164b
    /* renamed from: C */
    public C0116c mo29932m() {
        C0116c c0116c = new C0116c(-2, -2);
        ((LinearLayout.LayoutParams) c0116c).gravity = 16;
        return c0116c;
    }

    @Override // androidx.appcompat.widget.C0164b
    /* renamed from: D */
    public C0116c mo29931n(AttributeSet attributeSet) {
        return new C0116c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.C0164b
    /* renamed from: E */
    public C0116c mo29930o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            C0116c c0116c = layoutParams instanceof C0116c ? new C0116c((C0116c) layoutParams) : new C0116c(layoutParams);
            if (((LinearLayout.LayoutParams) c0116c).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0116c).gravity = 16;
            }
            return c0116c;
        }
        return mo29932m();
    }

    /* renamed from: F */
    public C0116c m30108F() {
        C0116c mo29932m = mo29932m();
        mo29932m.f566a = true;
        return mo29932m;
    }

    /* renamed from: G */
    public boolean m30107G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0114a)) {
            z = false | ((InterfaceC0114a) childAt).mo30096a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0114a)) ? z : z | ((InterfaceC0114a) childAt2).mo30095b();
    }

    /* renamed from: H */
    public boolean m30106H() {
        ActionMenuPresenter actionMenuPresenter = this.f558I;
        return actionMenuPresenter != null && actionMenuPresenter.m30138D();
    }

    /* renamed from: I */
    public boolean m30105I() {
        ActionMenuPresenter actionMenuPresenter = this.f558I;
        return actionMenuPresenter != null && actionMenuPresenter.m30136F();
    }

    /* renamed from: J */
    public boolean m30104J() {
        ActionMenuPresenter actionMenuPresenter = this.f558I;
        return actionMenuPresenter != null && actionMenuPresenter.m30135G();
    }

    /* renamed from: K */
    public boolean m30103K() {
        return this.f557H;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* renamed from: M */
    public final void m30101M(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f563N;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z5) {
                    int i19 = this.f564O;
                    i6 = i18;
                    r14 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    r14 = 0;
                }
                C0116c c0116c = (C0116c) childAt.getLayoutParams();
                c0116c.f571f = r14;
                c0116c.f568c = r14;
                c0116c.f567b = r14;
                c0116c.f569d = r14;
                ((LinearLayout.LayoutParams) c0116c).leftMargin = r14;
                ((LinearLayout.LayoutParams) c0116c).rightMargin = r14;
                c0116c.f570e = z5 && ((ActionMenuItemView) childAt).m30298f();
                int m30102L = m30102L(childAt, i11, c0116c.f566a ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, m30102L);
                if (c0116c.f569d) {
                    i16++;
                }
                if (c0116c.f566a) {
                    z4 = true;
                }
                i9 -= m30102L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (m30102L == 1) {
                    j |= 1 << i13;
                    i12 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i20 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i16 > 0 && i9 > 0) {
            int i21 = 0;
            int i22 = 0;
            int i23 = Integer.MAX_VALUE;
            long j2 = 0;
            while (i22 < childCount) {
                boolean z8 = z7;
                C0116c c0116c2 = (C0116c) getChildAt(i22).getLayoutParams();
                int i24 = i12;
                if (c0116c2.f569d) {
                    int i25 = c0116c2.f567b;
                    if (i25 < i23) {
                        j2 = 1 << i22;
                        i23 = i25;
                        i21 = 1;
                    } else if (i25 == i23) {
                        i21++;
                        j2 |= 1 << i22;
                    }
                }
                i22++;
                i12 = i24;
                z7 = z8;
            }
            z = z7;
            i5 = i12;
            j |= j2;
            if (i21 > i9) {
                i3 = mode;
                i4 = i7;
                break;
            }
            int i26 = i23 + 1;
            int i27 = 0;
            while (i27 < childCount) {
                View childAt2 = getChildAt(i27);
                C0116c c0116c3 = (C0116c) childAt2.getLayoutParams();
                int i28 = i7;
                int i29 = mode;
                long j3 = 1 << i27;
                if ((j2 & j3) == 0) {
                    if (c0116c3.f567b == i26) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && c0116c3.f570e && i9 == 1) {
                        int i30 = this.f564O;
                        z3 = z6;
                        childAt2.setPadding(i30 + i11, 0, i30, 0);
                    } else {
                        z3 = z6;
                    }
                    c0116c3.f567b++;
                    c0116c3.f571f = true;
                    i9--;
                }
                i27++;
                mode = i29;
                i7 = i28;
                z6 = z3;
            }
            i12 = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i7;
        z = z7;
        i5 = i12;
        boolean z9 = !z4 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z9 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((C0116c) getChildAt(0).getLayoutParams()).f570e) {
                    bitCount -= 0.5f;
                }
                int i31 = childCount - 1;
                if ((j & (1 << i31)) != 0 && !((C0116c) getChildAt(i31).getLayoutParams()).f570e) {
                    bitCount -= 0.5f;
                }
            }
            int i32 = bitCount > 0.0f ? (int) ((i9 * i11) / bitCount) : 0;
            z2 = z;
            for (int i33 = 0; i33 < childCount; i33++) {
                if ((j & (1 << i33)) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0116c c0116c4 = (C0116c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0116c4.f568c = i32;
                        c0116c4.f571f = true;
                        if (i33 == 0 && !c0116c4.f570e) {
                            ((LinearLayout.LayoutParams) c0116c4).leftMargin = (-i32) / 2;
                        }
                    } else if (c0116c4.f566a) {
                        c0116c4.f568c = i32;
                        c0116c4.f571f = true;
                        ((LinearLayout.LayoutParams) c0116c4).rightMargin = (-i32) / 2;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c0116c4).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c0116c4).rightMargin = i32 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i34 = 0; i34 < childCount; i34++) {
                View childAt4 = getChildAt(i34);
                C0116c c0116c5 = (C0116c) childAt4.getLayoutParams();
                if (c0116c5.f571f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0116c5.f567b * i11) + c0116c5.f568c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i20);
    }

    /* renamed from: N */
    public C0082e m30100N() {
        return this.f554E;
    }

    /* renamed from: O */
    public void m30099O(InterfaceC0091i.InterfaceC0092a interfaceC0092a, C0082e.InterfaceC0083a interfaceC0083a) {
        this.f559J = interfaceC0092a;
        this.f560K = interfaceC0083a;
    }

    /* renamed from: P */
    public boolean m30098P() {
        ActionMenuPresenter actionMenuPresenter = this.f558I;
        return actionMenuPresenter != null && actionMenuPresenter.m30129M();
    }

    @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0084b
    /* renamed from: a */
    public boolean mo30097a(C0086g c0086g) {
        return this.f554E.m30259N(c0086g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j
    /* renamed from: b */
    public void mo347b(C0082e c0082e) {
        this.f554E = c0082e;
    }

    @Override // androidx.appcompat.widget.C0164b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0116c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f554E == null) {
            Context context = getContext();
            C0082e c0082e = new C0082e(context);
            this.f554E = c0082e;
            c0082e.mo30169V(new C0117d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f558I = actionMenuPresenter;
            actionMenuPresenter.m30130L(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f558I;
            InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f559J;
            if (interfaceC0092a == null) {
                interfaceC0092a = new C0115b();
            }
            actionMenuPresenter2.mo30174g(interfaceC0092a);
            this.f554E.m30243c(this.f558I, this.f555F);
            this.f558I.m30132J(this);
        }
        return this.f554E;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f558I.m30139C();
    }

    public int getPopupTheme() {
        return this.f556G;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f558I;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo25024c(false);
            if (this.f558I.m30135G()) {
                this.f558I.m30138D();
                this.f558I.m30129M();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m30112B();
    }

    @Override // androidx.appcompat.widget.C0164b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f561L) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean m20417b = hu1.m20417b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0116c c0116c = (C0116c) childAt.getLayoutParams();
                if (c0116c.f566a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m30107G(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m20417b) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0116c).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0116c).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0116c).leftMargin) + ((LinearLayout.LayoutParams) c0116c).rightMargin;
                    m30107G(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (m20417b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0116c c0116c2 = (C0116c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0116c2.f566a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0116c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0116c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0116c c0116c3 = (C0116c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0116c3.f566a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0116c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((LinearLayout.LayoutParams) c0116c3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.C0164b, android.view.View
    public void onMeasure(int i, int i2) {
        C0082e c0082e;
        boolean z = this.f561L;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f561L = z2;
        if (z != z2) {
            this.f562M = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f561L && (c0082e = this.f554E) != null && size != this.f562M) {
            this.f562M = size;
            c0082e.mo24014M(true);
        }
        int childCount = getChildCount();
        if (this.f561L && childCount > 0) {
            m30101M(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0116c c0116c = (C0116c) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) c0116c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0116c).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f558I.m30133I(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0118e interfaceC0118e) {
        this.f565P = interfaceC0118e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f558I.m30131K(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f557H = z;
    }

    public void setPopupTheme(int i) {
        if (this.f556G != i) {
            this.f556G = i;
            if (i == 0) {
                this.f555F = getContext();
            } else {
                this.f555F = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f558I = actionMenuPresenter;
        actionMenuPresenter.m30132J(this);
    }
}

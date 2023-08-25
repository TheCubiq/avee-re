package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.daaw.g80;
import com.daaw.hu1;
import com.daaw.ul1;
import com.daaw.x21;
import com.daaw.xs1;
/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public class C0164b extends ViewGroup {

    /* renamed from: A */
    public int f804A;

    /* renamed from: B */
    public int f805B;

    /* renamed from: C */
    public int f806C;

    /* renamed from: D */
    public int f807D;

    /* renamed from: p */
    public boolean f808p;

    /* renamed from: q */
    public int f809q;

    /* renamed from: r */
    public int f810r;

    /* renamed from: s */
    public int f811s;

    /* renamed from: t */
    public int f812t;

    /* renamed from: u */
    public int f813u;

    /* renamed from: v */
    public float f814v;

    /* renamed from: w */
    public boolean f815w;

    /* renamed from: x */
    public int[] f816x;

    /* renamed from: y */
    public int[] f817y;

    /* renamed from: z */
    public Drawable f818z;

    /* renamed from: androidx.appcompat.widget.b$a */
    /* loaded from: classes.dex */
    public static class C0165a extends LinearLayout.LayoutParams {
        public C0165a(int i, int i2) {
            super(i, i2);
        }

        public C0165a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0165a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C0164b(Context context) {
        this(context, null);
    }

    public C0164b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0164b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f808p = true;
        this.f809q = -1;
        this.f810r = 0;
        this.f812t = 8388659;
        int[] iArr = x21.f31884a1;
        ul1 m8037v = ul1.m8037v(context, attributeSet, iArr, i, 0);
        xs1.m4706p0(this, context, iArr, attributeSet, m8037v.m8041r(), i, 0);
        int m8048k = m8037v.m8048k(x21.f31894c1, -1);
        if (m8048k >= 0) {
            setOrientation(m8048k);
        }
        int m8048k2 = m8037v.m8048k(x21.f31889b1, -1);
        if (m8048k2 >= 0) {
            setGravity(m8048k2);
        }
        boolean m8058a = m8037v.m8058a(x21.f31899d1, true);
        if (!m8058a) {
            setBaselineAligned(m8058a);
        }
        this.f814v = m8037v.m8050i(x21.f31909f1, -1.0f);
        this.f809q = m8037v.m8048k(x21.f31904e1, -1);
        this.f815w = m8037v.m8058a(x21.f31924i1, false);
        setDividerDrawable(m8037v.m8052g(x21.f31914g1));
        this.f806C = m8037v.m8048k(x21.f31929j1, 0);
        this.f807D = m8037v.m8053f(x21.f31919h1, 0);
        m8037v.m8036w();
    }

    /* renamed from: A */
    public final void m29939A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0165a;
    }

    /* renamed from: g */
    public void m29938g(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean m20417b = hu1.m20417b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View m29926s = m29926s(i2);
            if (m29926s != null && m29926s.getVisibility() != 8 && m29925t(i2)) {
                C0165a c0165a = (C0165a) m29926s.getLayoutParams();
                m29935j(canvas, m20417b ? m29926s.getRight() + ((LinearLayout.LayoutParams) c0165a).rightMargin : (m29926s.getLeft() - ((LinearLayout.LayoutParams) c0165a).leftMargin) - this.f804A);
            }
        }
        if (m29925t(virtualChildCount)) {
            View m29926s2 = m29926s(virtualChildCount - 1);
            if (m29926s2 != null) {
                C0165a c0165a2 = (C0165a) m29926s2.getLayoutParams();
                if (m20417b) {
                    left = m29926s2.getLeft();
                    i = ((LinearLayout.LayoutParams) c0165a2).leftMargin;
                    right = (left - i) - this.f804A;
                } else {
                    right = m29926s2.getRight() + ((LinearLayout.LayoutParams) c0165a2).rightMargin;
                }
            } else if (m20417b) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i = getPaddingRight();
                right = (left - i) - this.f804A;
            }
            m29935j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f809q < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f809q;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f809q == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.f810r;
            if (this.f811s == 1 && (i = this.f812t & 112) != 48) {
                if (i == 16) {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f813u) / 2;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f813u;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((C0165a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f809q;
    }

    public Drawable getDividerDrawable() {
        return this.f818z;
    }

    public int getDividerPadding() {
        return this.f807D;
    }

    public int getDividerWidth() {
        return this.f804A;
    }

    public int getGravity() {
        return this.f812t;
    }

    public int getOrientation() {
        return this.f811s;
    }

    public int getShowDividers() {
        return this.f806C;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f814v;
    }

    /* renamed from: h */
    public void m29937h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m29926s = m29926s(i);
            if (m29926s != null && m29926s.getVisibility() != 8 && m29925t(i)) {
                m29936i(canvas, (m29926s.getTop() - ((LinearLayout.LayoutParams) ((C0165a) m29926s.getLayoutParams())).topMargin) - this.f805B);
            }
        }
        if (m29925t(virtualChildCount)) {
            View m29926s2 = m29926s(virtualChildCount - 1);
            m29936i(canvas, m29926s2 == null ? (getHeight() - getPaddingBottom()) - this.f805B : m29926s2.getBottom() + ((LinearLayout.LayoutParams) ((C0165a) m29926s2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: i */
    public void m29936i(Canvas canvas, int i) {
        this.f818z.setBounds(getPaddingLeft() + this.f807D, i, (getWidth() - getPaddingRight()) - this.f807D, this.f805B + i);
        this.f818z.draw(canvas);
    }

    /* renamed from: j */
    public void m29935j(Canvas canvas, int i) {
        this.f818z.setBounds(i, getPaddingTop() + this.f807D, this.f804A + i, (getHeight() - getPaddingBottom()) - this.f807D);
        this.f818z.draw(canvas);
    }

    /* renamed from: k */
    public final void m29934k(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m29926s = m29926s(i3);
            if (m29926s.getVisibility() != 8) {
                C0165a c0165a = (C0165a) m29926s.getLayoutParams();
                if (((LinearLayout.LayoutParams) c0165a).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c0165a).width;
                    ((LinearLayout.LayoutParams) c0165a).width = m29926s.getMeasuredWidth();
                    measureChildWithMargins(m29926s, i2, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) c0165a).width = i4;
                }
            }
        }
    }

    /* renamed from: l */
    public final void m29933l(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m29926s = m29926s(i3);
            if (m29926s.getVisibility() != 8) {
                C0165a c0165a = (C0165a) m29926s.getLayoutParams();
                if (((LinearLayout.LayoutParams) c0165a).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c0165a).height;
                    ((LinearLayout.LayoutParams) c0165a).height = m29926s.getMeasuredHeight();
                    measureChildWithMargins(m29926s, makeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) c0165a).height = i4;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0165a generateDefaultLayoutParams() {
        int i = this.f811s;
        if (i == 0) {
            return new C0165a(-2, -2);
        }
        if (i == 1) {
            return new C0165a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C0165a generateLayoutParams(AttributeSet attributeSet) {
        return new C0165a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C0165a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0165a(layoutParams);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f818z == null) {
            return;
        }
        if (this.f811s == 1) {
            m29937h(canvas);
        } else {
            m29938g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f811s == 1) {
            m29923v(i, i2, i3, i4);
        } else {
            m29924u(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f811s == 1) {
            m29919z(i, i2);
        } else {
            m29921x(i, i2);
        }
    }

    /* renamed from: p */
    public int m29929p(View view, int i) {
        return 0;
    }

    /* renamed from: q */
    public int m29928q(View view) {
        return 0;
    }

    /* renamed from: r */
    public int m29927r(View view) {
        return 0;
    }

    /* renamed from: s */
    public View m29926s(int i) {
        return getChildAt(i);
    }

    public void setBaselineAligned(boolean z) {
        this.f808p = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f809q = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f818z) {
            return;
        }
        this.f818z = drawable;
        if (drawable != null) {
            this.f804A = drawable.getIntrinsicWidth();
            this.f805B = drawable.getIntrinsicHeight();
        } else {
            this.f804A = 0;
            this.f805B = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f807D = i;
    }

    public void setGravity(int i) {
        if (this.f812t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f812t = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f812t;
        if ((8388615 & i3) != i2) {
            this.f812t = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f815w = z;
    }

    public void setOrientation(int i) {
        if (this.f811s != i) {
            this.f811s = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f806C) {
            requestLayout();
        }
        this.f806C = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f812t;
        if ((i3 & 112) != i2) {
            this.f812t = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f814v = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public boolean m29925t(int i) {
        if (i == 0) {
            return (this.f806C & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f806C & 4) != 0;
        } else if ((this.f806C & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29924u(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean m20417b = hu1.m20417b(this);
        int paddingTop = getPaddingTop();
        int i14 = i4 - i2;
        int paddingBottom = i14 - getPaddingBottom();
        int paddingBottom2 = (i14 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i15 = this.f812t;
        int i16 = i15 & 112;
        boolean z = this.f808p;
        int[] iArr = this.f816x;
        int[] iArr2 = this.f817y;
        int m21894b = g80.m21894b(8388615 & i15, xs1.m4768E(this));
        int paddingLeft = m21894b != 1 ? m21894b != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f813u : getPaddingLeft() + (((i3 - i) - this.f813u) / 2);
        if (m20417b) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i17 = 0;
        while (i17 < virtualChildCount) {
            int i18 = i5 + (i6 * i17);
            View m29926s = m29926s(i18);
            if (m29926s == null) {
                paddingLeft += m29920y(i18);
            } else if (m29926s.getVisibility() != 8) {
                int measuredWidth = m29926s.getMeasuredWidth();
                int measuredHeight = m29926s.getMeasuredHeight();
                C0165a c0165a = (C0165a) m29926s.getLayoutParams();
                int i19 = i17;
                if (z) {
                    i7 = virtualChildCount;
                    if (((LinearLayout.LayoutParams) c0165a).height != -1) {
                        i8 = m29926s.getBaseline();
                        i9 = ((LinearLayout.LayoutParams) c0165a).gravity;
                        if (i9 < 0) {
                            i9 = i16;
                        }
                        i10 = i9 & 112;
                        i11 = i16;
                        if (i10 != 16) {
                            i12 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + ((LinearLayout.LayoutParams) c0165a).topMargin) - ((LinearLayout.LayoutParams) c0165a).bottomMargin;
                        } else if (i10 == 48) {
                            i12 = ((LinearLayout.LayoutParams) c0165a).topMargin + paddingTop;
                            if (i8 != -1) {
                                i12 += iArr[1] - i8;
                            }
                        } else if (i10 != 80) {
                            i12 = paddingTop;
                        } else {
                            i12 = (paddingBottom - measuredHeight) - ((LinearLayout.LayoutParams) c0165a).bottomMargin;
                            if (i8 != -1) {
                                i12 -= iArr2[2] - (m29926s.getMeasuredHeight() - i8);
                            }
                        }
                        if (m29925t(i18)) {
                            paddingLeft += this.f804A;
                        }
                        int i20 = ((LinearLayout.LayoutParams) c0165a).leftMargin + paddingLeft;
                        i13 = paddingTop;
                        m29939A(m29926s, i20 + m29928q(m29926s), i12, measuredWidth, measuredHeight);
                        i17 = i19 + m29929p(m29926s, i18);
                        paddingLeft = i20 + measuredWidth + ((LinearLayout.LayoutParams) c0165a).rightMargin + m29927r(m29926s);
                        i17++;
                        virtualChildCount = i7;
                        i16 = i11;
                        paddingTop = i13;
                    }
                } else {
                    i7 = virtualChildCount;
                }
                i8 = -1;
                i9 = ((LinearLayout.LayoutParams) c0165a).gravity;
                if (i9 < 0) {
                }
                i10 = i9 & 112;
                i11 = i16;
                if (i10 != 16) {
                }
                if (m29925t(i18)) {
                }
                int i202 = ((LinearLayout.LayoutParams) c0165a).leftMargin + paddingLeft;
                i13 = paddingTop;
                m29939A(m29926s, i202 + m29928q(m29926s), i12, measuredWidth, measuredHeight);
                i17 = i19 + m29929p(m29926s, i18);
                paddingLeft = i202 + measuredWidth + ((LinearLayout.LayoutParams) c0165a).rightMargin + m29927r(m29926s);
                i17++;
                virtualChildCount = i7;
                i16 = i11;
                paddingTop = i13;
            }
            i13 = paddingTop;
            i7 = virtualChildCount;
            i11 = i16;
            i17++;
            virtualChildCount = i7;
            i16 = i11;
            paddingTop = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29923v(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f812t;
        int i9 = i8 & 112;
        int i10 = i8 & 8388615;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f813u : getPaddingTop() + (((i4 - i2) - this.f813u) / 2);
        int i11 = 0;
        while (i11 < virtualChildCount) {
            View m29926s = m29926s(i11);
            if (m29926s == null) {
                paddingTop += m29920y(i11);
            } else if (m29926s.getVisibility() != 8) {
                int measuredWidth = m29926s.getMeasuredWidth();
                int measuredHeight = m29926s.getMeasuredHeight();
                C0165a c0165a = (C0165a) m29926s.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) c0165a).gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                int m21894b = g80.m21894b(i12, xs1.m4768E(this)) & 7;
                if (m21894b == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0165a).leftMargin;
                } else if (m21894b != 5) {
                    i6 = ((LinearLayout.LayoutParams) c0165a).leftMargin + paddingLeft;
                    int i13 = i6;
                    if (m29925t(i11)) {
                        paddingTop += this.f805B;
                    }
                    int i14 = paddingTop + ((LinearLayout.LayoutParams) c0165a).topMargin;
                    m29939A(m29926s, i13, i14 + m29928q(m29926s), measuredWidth, measuredHeight);
                    i11 += m29929p(m29926s, i11);
                    paddingTop = i14 + measuredHeight + ((LinearLayout.LayoutParams) c0165a).bottomMargin + m29927r(m29926s);
                } else {
                    i5 = paddingRight - measuredWidth;
                }
                i6 = i5 - ((LinearLayout.LayoutParams) c0165a).rightMargin;
                int i132 = i6;
                if (m29925t(i11)) {
                }
                int i142 = paddingTop + ((LinearLayout.LayoutParams) c0165a).topMargin;
                m29939A(m29926s, i132, i142 + m29928q(m29926s), measuredWidth, measuredHeight);
                i11 += m29929p(m29926s, i11);
                paddingTop = i142 + measuredHeight + ((LinearLayout.LayoutParams) c0165a).bottomMargin + m29927r(m29926s);
            }
            i11++;
        }
    }

    /* renamed from: w */
    public void m29922w(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x03a1, code lost:
        if (r8 > 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03ac, code lost:
        if (r8 < 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03ae, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03af, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29921x(int i, int i2) {
        int[] iArr;
        int i3;
        int max;
        int i4;
        int i5;
        int max2;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        boolean z;
        int baseline;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        View view;
        int max3;
        int i15;
        boolean z4;
        int measuredHeight;
        int m29929p;
        int baseline2;
        int i16;
        this.f813u = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.f816x == null || this.f817y == null) {
            this.f816x = new int[4];
            this.f817y = new int[4];
        }
        int[] iArr2 = this.f816x;
        int[] iArr3 = this.f817y;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z5 = this.f808p;
        boolean z6 = this.f815w;
        int i17 = 1073741824;
        boolean z7 = mode == 1073741824;
        float f2 = 0.0f;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z8 = false;
        int i23 = 0;
        boolean z9 = true;
        boolean z10 = false;
        while (true) {
            iArr = iArr3;
            if (i18 >= virtualChildCount) {
                break;
            }
            View m29926s = m29926s(i18);
            if (m29926s == null) {
                this.f813u += m29920y(i18);
            } else if (m29926s.getVisibility() == 8) {
                i18 += m29929p(m29926s, i18);
            } else {
                if (m29925t(i18)) {
                    this.f813u += this.f804A;
                }
                C0165a c0165a = (C0165a) m29926s.getLayoutParams();
                float f3 = ((LinearLayout.LayoutParams) c0165a).weight;
                float f4 = f2 + f3;
                if (mode == i17 && ((LinearLayout.LayoutParams) c0165a).width == 0 && f3 > 0.0f) {
                    int i24 = this.f813u;
                    this.f813u = z7 ? i24 + ((LinearLayout.LayoutParams) c0165a).leftMargin + ((LinearLayout.LayoutParams) c0165a).rightMargin : Math.max(i24, ((LinearLayout.LayoutParams) c0165a).leftMargin + i24 + ((LinearLayout.LayoutParams) c0165a).rightMargin);
                    if (z5) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        m29926s.measure(makeMeasureSpec, makeMeasureSpec);
                        i14 = i18;
                        z2 = z6;
                        z3 = z5;
                        view = m29926s;
                    } else {
                        i14 = i18;
                        z2 = z6;
                        z3 = z5;
                        view = m29926s;
                        i15 = 1073741824;
                        z8 = true;
                        if (mode2 == i15 && ((LinearLayout.LayoutParams) c0165a).height == -1) {
                            z4 = true;
                            z10 = true;
                        } else {
                            z4 = false;
                        }
                        int i25 = ((LinearLayout.LayoutParams) c0165a).topMargin + ((LinearLayout.LayoutParams) c0165a).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i25;
                        i23 = View.combineMeasuredStates(i23, view.getMeasuredState());
                        if (z3 && (baseline2 = view.getBaseline()) != -1) {
                            i16 = ((LinearLayout.LayoutParams) c0165a).gravity;
                            if (i16 < 0) {
                                i16 = this.f812t;
                            }
                            int i26 = (((i16 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i26] = Math.max(iArr2[i26], baseline2);
                            iArr[i26] = Math.max(iArr[i26], measuredHeight - baseline2);
                        }
                        i20 = Math.max(i20, measuredHeight);
                        z9 = !z9 && ((LinearLayout.LayoutParams) c0165a).height == -1;
                        if (((LinearLayout.LayoutParams) c0165a).weight <= 0.0f) {
                            if (!z4) {
                                i25 = measuredHeight;
                            }
                            i22 = Math.max(i22, i25);
                        } else {
                            int i27 = i22;
                            if (!z4) {
                                i25 = measuredHeight;
                            }
                            i21 = Math.max(i21, i25);
                            i22 = i27;
                        }
                        int i28 = i14;
                        m29929p = m29929p(view, i28) + i28;
                        f2 = f4;
                        i18 = m29929p + 1;
                        iArr3 = iArr;
                        z6 = z2;
                        z5 = z3;
                        i17 = 1073741824;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) c0165a).width != 0 || f3 <= 0.0f) {
                        i13 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) c0165a).width = -2;
                        i13 = 0;
                    }
                    i14 = i18;
                    int i29 = i13;
                    z2 = z6;
                    z3 = z5;
                    m29922w(m29926s, i14, i, f4 == 0.0f ? this.f813u : 0, i2, 0);
                    if (i29 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) c0165a).width = i29;
                    }
                    int measuredWidth = m29926s.getMeasuredWidth();
                    if (z7) {
                        view = m29926s;
                        max3 = this.f813u + ((LinearLayout.LayoutParams) c0165a).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) c0165a).rightMargin + m29927r(view);
                    } else {
                        view = m29926s;
                        int i30 = this.f813u;
                        max3 = Math.max(i30, i30 + measuredWidth + ((LinearLayout.LayoutParams) c0165a).leftMargin + ((LinearLayout.LayoutParams) c0165a).rightMargin + m29927r(view));
                    }
                    this.f813u = max3;
                    if (z2) {
                        i19 = Math.max(measuredWidth, i19);
                    }
                }
                i15 = 1073741824;
                if (mode2 == i15) {
                }
                z4 = false;
                int i252 = ((LinearLayout.LayoutParams) c0165a).topMargin + ((LinearLayout.LayoutParams) c0165a).bottomMargin;
                measuredHeight = view.getMeasuredHeight() + i252;
                i23 = View.combineMeasuredStates(i23, view.getMeasuredState());
                if (z3) {
                    i16 = ((LinearLayout.LayoutParams) c0165a).gravity;
                    if (i16 < 0) {
                    }
                    int i262 = (((i16 & 112) >> 4) & (-2)) >> 1;
                    iArr2[i262] = Math.max(iArr2[i262], baseline2);
                    iArr[i262] = Math.max(iArr[i262], measuredHeight - baseline2);
                }
                i20 = Math.max(i20, measuredHeight);
                if (z9) {
                }
                if (((LinearLayout.LayoutParams) c0165a).weight <= 0.0f) {
                }
                int i282 = i14;
                m29929p = m29929p(view, i282) + i282;
                f2 = f4;
                i18 = m29929p + 1;
                iArr3 = iArr;
                z6 = z2;
                z5 = z3;
                i17 = 1073741824;
            }
            m29929p = i18;
            z2 = z6;
            z3 = z5;
            i18 = m29929p + 1;
            iArr3 = iArr;
            z6 = z2;
            z5 = z3;
            i17 = 1073741824;
        }
        boolean z11 = z6;
        boolean z12 = z5;
        int i31 = i20;
        int i32 = i21;
        int i33 = i22;
        int i34 = i23;
        if (this.f813u > 0 && m29925t(virtualChildCount)) {
            this.f813u += this.f804A;
        }
        if (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            max = i31;
            i3 = i34;
        } else {
            i3 = i34;
            max = Math.max(i31, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z11 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f813u = 0;
            int i35 = 0;
            while (i35 < virtualChildCount) {
                View m29926s2 = m29926s(i35);
                if (m29926s2 == null) {
                    this.f813u += m29920y(i35);
                } else if (m29926s2.getVisibility() == 8) {
                    i35 += m29929p(m29926s2, i35);
                } else {
                    C0165a c0165a2 = (C0165a) m29926s2.getLayoutParams();
                    int i36 = this.f813u;
                    if (z7) {
                        this.f813u = i36 + ((LinearLayout.LayoutParams) c0165a2).leftMargin + i19 + ((LinearLayout.LayoutParams) c0165a2).rightMargin + m29927r(m29926s2);
                    } else {
                        i12 = max;
                        this.f813u = Math.max(i36, i36 + i19 + ((LinearLayout.LayoutParams) c0165a2).leftMargin + ((LinearLayout.LayoutParams) c0165a2).rightMargin + m29927r(m29926s2));
                        i35++;
                        max = i12;
                    }
                }
                i12 = max;
                i35++;
                max = i12;
            }
        }
        int i37 = max;
        int paddingLeft = this.f813u + getPaddingLeft() + getPaddingRight();
        this.f813u = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i38 = (16777215 & resolveSizeAndState) - this.f813u;
        if (z8 || (i38 != 0 && f2 > 0.0f)) {
            float f5 = this.f814v;
            if (f5 > 0.0f) {
                f2 = f5;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f813u = 0;
            int i39 = i32;
            int i40 = i3;
            int i41 = -1;
            int i42 = 0;
            while (i42 < virtualChildCount) {
                View m29926s3 = m29926s(i42);
                if (m29926s3 == null || m29926s3.getVisibility() == 8) {
                    i7 = i38;
                    i8 = virtualChildCount;
                } else {
                    C0165a c0165a3 = (C0165a) m29926s3.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c0165a3).weight;
                    if (f6 > 0.0f) {
                        int i43 = (int) ((i38 * f6) / f2);
                        float f7 = f2 - f6;
                        int i44 = i38 - i43;
                        i8 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) c0165a3).topMargin + ((LinearLayout.LayoutParams) c0165a3).bottomMargin, ((LinearLayout.LayoutParams) c0165a3).height);
                        if (((LinearLayout.LayoutParams) c0165a3).width == 0) {
                            i11 = 1073741824;
                            if (mode == 1073741824) {
                            }
                        } else {
                            i11 = 1073741824;
                        }
                        i43 = m29926s3.getMeasuredWidth() + i43;
                    } else {
                        i7 = i38;
                        i8 = virtualChildCount;
                    }
                    int i45 = this.f813u;
                    if (z7) {
                        this.f813u = i45 + m29926s3.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0165a3).leftMargin + ((LinearLayout.LayoutParams) c0165a3).rightMargin + m29927r(m29926s3);
                        f = f2;
                    } else {
                        f = f2;
                        this.f813u = Math.max(i45, m29926s3.getMeasuredWidth() + i45 + ((LinearLayout.LayoutParams) c0165a3).leftMargin + ((LinearLayout.LayoutParams) c0165a3).rightMargin + m29927r(m29926s3));
                    }
                    boolean z13 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) c0165a3).height == -1;
                    int i46 = ((LinearLayout.LayoutParams) c0165a3).topMargin + ((LinearLayout.LayoutParams) c0165a3).bottomMargin;
                    int measuredHeight2 = m29926s3.getMeasuredHeight() + i46;
                    i41 = Math.max(i41, measuredHeight2);
                    if (!z13) {
                        i46 = measuredHeight2;
                    }
                    int max4 = Math.max(i39, i46);
                    if (z9) {
                        i9 = -1;
                        if (((LinearLayout.LayoutParams) c0165a3).height == -1) {
                            z = true;
                            if (z12 && (baseline = m29926s3.getBaseline()) != i9) {
                                i10 = ((LinearLayout.LayoutParams) c0165a3).gravity;
                                if (i10 < 0) {
                                    i10 = this.f812t;
                                }
                                int i47 = (((i10 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i47] = Math.max(iArr2[i47], baseline);
                                iArr[i47] = Math.max(iArr[i47], measuredHeight2 - baseline);
                            }
                            z9 = z;
                            i39 = max4;
                            f2 = f;
                        }
                    } else {
                        i9 = -1;
                    }
                    z = false;
                    if (z12) {
                        i10 = ((LinearLayout.LayoutParams) c0165a3).gravity;
                        if (i10 < 0) {
                        }
                        int i472 = (((i10 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i472] = Math.max(iArr2[i472], baseline);
                        iArr[i472] = Math.max(iArr[i472], measuredHeight2 - baseline);
                    }
                    z9 = z;
                    i39 = max4;
                    f2 = f;
                }
                i42++;
                i38 = i7;
                virtualChildCount = i8;
            }
            i4 = i2;
            i5 = virtualChildCount;
            this.f813u += getPaddingLeft() + getPaddingRight();
            max2 = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i41 : Math.max(i41, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            i6 = i39;
            i3 = i40;
        } else {
            i6 = Math.max(i32, i33);
            if (z11 && mode != 1073741824) {
                for (int i48 = 0; i48 < virtualChildCount; i48++) {
                    View m29926s4 = m29926s(i48);
                    if (m29926s4 != null && m29926s4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0165a) m29926s4.getLayoutParams())).weight > 0.0f) {
                        m29926s4.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(m29926s4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = i2;
            i5 = virtualChildCount;
            max2 = i37;
        }
        if (z9 || mode2 == 1073741824) {
            i6 = max2;
        }
        setMeasuredDimension(resolveSizeAndState | (i3 & (-16777216)), View.resolveSizeAndState(Math.max(i6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i4, i3 << 16));
        if (z10) {
            m29934k(i5, i);
        }
    }

    /* renamed from: y */
    public int m29920y(int i) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ce, code lost:
        if (r15 > 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d9, code lost:
        if (r15 < 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02db, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02dc, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0319  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29919z(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int max;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        View view;
        int max2;
        boolean z2;
        int max3;
        this.f813u = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i19 = this.f809q;
        boolean z3 = this.f815w;
        float f = 0.0f;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (true) {
            int i26 = 8;
            int i27 = i23;
            if (i25 >= virtualChildCount) {
                int i28 = i20;
                int i29 = i22;
                int i30 = i24;
                int i31 = virtualChildCount;
                int i32 = mode2;
                int i33 = i21;
                if (this.f813u > 0) {
                    i3 = i31;
                    if (m29925t(i3)) {
                        this.f813u += this.f805B;
                    }
                } else {
                    i3 = i31;
                }
                if (z3 && (i32 == Integer.MIN_VALUE || i32 == 0)) {
                    this.f813u = 0;
                    int i34 = 0;
                    while (i34 < i3) {
                        View m29926s = m29926s(i34);
                        if (m29926s == null) {
                            max = this.f813u + m29920y(i34);
                        } else if (m29926s.getVisibility() == i26) {
                            i34 += m29929p(m29926s, i34);
                            i34++;
                            i26 = 8;
                        } else {
                            C0165a c0165a = (C0165a) m29926s.getLayoutParams();
                            int i35 = this.f813u;
                            max = Math.max(i35, i35 + i29 + ((LinearLayout.LayoutParams) c0165a).topMargin + ((LinearLayout.LayoutParams) c0165a).bottomMargin + m29927r(m29926s));
                        }
                        this.f813u = max;
                        i34++;
                        i26 = 8;
                    }
                }
                int paddingTop = this.f813u + getPaddingTop() + getPaddingBottom();
                this.f813u = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i36 = (16777215 & resolveSizeAndState) - this.f813u;
                if (z4 || (i36 != 0 && f > 0.0f)) {
                    float f2 = this.f814v;
                    if (f2 > 0.0f) {
                        f = f2;
                    }
                    this.f813u = 0;
                    int i37 = i36;
                    int i38 = i30;
                    i4 = i28;
                    int i39 = 0;
                    while (i39 < i3) {
                        View m29926s2 = m29926s(i39);
                        if (m29926s2.getVisibility() == 8) {
                            i7 = i37;
                        } else {
                            C0165a c0165a2 = (C0165a) m29926s2.getLayoutParams();
                            float f3 = ((LinearLayout.LayoutParams) c0165a2).weight;
                            if (f3 > 0.0f) {
                                int i40 = (int) ((i37 * f3) / f);
                                float f4 = f - f3;
                                i7 = i37 - i40;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) c0165a2).leftMargin + ((LinearLayout.LayoutParams) c0165a2).rightMargin, ((LinearLayout.LayoutParams) c0165a2).width);
                                if (((LinearLayout.LayoutParams) c0165a2).height == 0) {
                                    i10 = 1073741824;
                                    if (i32 == 1073741824) {
                                    }
                                } else {
                                    i10 = 1073741824;
                                }
                                i40 = m29926s2.getMeasuredHeight() + i40;
                            } else {
                                i7 = i37;
                            }
                            int i41 = ((LinearLayout.LayoutParams) c0165a2).leftMargin + ((LinearLayout.LayoutParams) c0165a2).rightMargin;
                            int measuredWidth = m29926s2.getMeasuredWidth() + i41;
                            i33 = Math.max(i33, measuredWidth);
                            float f5 = f;
                            if (mode != 1073741824) {
                                i8 = i4;
                                i9 = -1;
                                if (((LinearLayout.LayoutParams) c0165a2).width == -1) {
                                    z = true;
                                    if (!z) {
                                        i41 = measuredWidth;
                                    }
                                    int max4 = Math.max(i38, i41);
                                    boolean z7 = !z5 && ((LinearLayout.LayoutParams) c0165a2).width == i9;
                                    int i42 = this.f813u;
                                    this.f813u = Math.max(i42, m29926s2.getMeasuredHeight() + i42 + ((LinearLayout.LayoutParams) c0165a2).topMargin + ((LinearLayout.LayoutParams) c0165a2).bottomMargin + m29927r(m29926s2));
                                    z5 = z7;
                                    i4 = i8;
                                    i38 = max4;
                                    f = f5;
                                }
                            } else {
                                i8 = i4;
                                i9 = -1;
                            }
                            z = false;
                            if (!z) {
                            }
                            int max42 = Math.max(i38, i41);
                            if (z5) {
                            }
                            int i422 = this.f813u;
                            this.f813u = Math.max(i422, m29926s2.getMeasuredHeight() + i422 + ((LinearLayout.LayoutParams) c0165a2).topMargin + ((LinearLayout.LayoutParams) c0165a2).bottomMargin + m29927r(m29926s2));
                            z5 = z7;
                            i4 = i8;
                            i38 = max42;
                            f = f5;
                        }
                        i39++;
                        i37 = i7;
                    }
                    i5 = i;
                    this.f813u += getPaddingTop() + getPaddingBottom();
                    i6 = i38;
                } else {
                    i6 = Math.max(i30, i27);
                    if (z3 && i32 != 1073741824) {
                        for (int i43 = 0; i43 < i3; i43++) {
                            View m29926s3 = m29926s(i43);
                            if (m29926s3 != null && m29926s3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0165a) m29926s3.getLayoutParams())).weight > 0.0f) {
                                m29926s3.measure(View.MeasureSpec.makeMeasureSpec(m29926s3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                            }
                        }
                    }
                    i5 = i;
                    i4 = i28;
                }
                if (z5 || mode == 1073741824) {
                    i6 = i33;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i5, i4), resolveSizeAndState);
                if (z6) {
                    m29933l(i3, i2);
                    return;
                }
                return;
            }
            View m29926s4 = m29926s(i25);
            if (m29926s4 == null) {
                this.f813u += m29920y(i25);
                i14 = virtualChildCount;
                i15 = mode2;
                i23 = i27;
            } else {
                int i44 = i20;
                if (m29926s4.getVisibility() == 8) {
                    i25 += m29929p(m29926s4, i25);
                    i14 = virtualChildCount;
                    i23 = i27;
                    i20 = i44;
                    i15 = mode2;
                } else {
                    if (m29925t(i25)) {
                        this.f813u += this.f805B;
                    }
                    C0165a c0165a3 = (C0165a) m29926s4.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c0165a3).weight;
                    float f7 = f + f6;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) c0165a3).height == 0 && f6 > 0.0f) {
                        int i45 = this.f813u;
                        this.f813u = Math.max(i45, ((LinearLayout.LayoutParams) c0165a3).topMargin + i45 + ((LinearLayout.LayoutParams) c0165a3).bottomMargin);
                        max2 = i22;
                        view = m29926s4;
                        i17 = i24;
                        i12 = i44;
                        i13 = i21;
                        z4 = true;
                        i14 = virtualChildCount;
                        i15 = mode2;
                        i16 = i27;
                        i18 = i25;
                    } else {
                        int i46 = i21;
                        if (((LinearLayout.LayoutParams) c0165a3).height != 0 || f6 <= 0.0f) {
                            i11 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c0165a3).height = -2;
                            i11 = 0;
                        }
                        i12 = i44;
                        int i47 = i11;
                        i13 = i46;
                        int i48 = i22;
                        i14 = virtualChildCount;
                        i15 = mode2;
                        i16 = i27;
                        i17 = i24;
                        i18 = i25;
                        m29922w(m29926s4, i25, i, 0, i2, f7 == 0.0f ? this.f813u : 0);
                        if (i47 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c0165a3).height = i47;
                        }
                        int measuredHeight = m29926s4.getMeasuredHeight();
                        int i49 = this.f813u;
                        view = m29926s4;
                        this.f813u = Math.max(i49, i49 + measuredHeight + ((LinearLayout.LayoutParams) c0165a3).topMargin + ((LinearLayout.LayoutParams) c0165a3).bottomMargin + m29927r(view));
                        max2 = z3 ? Math.max(measuredHeight, i48) : i48;
                    }
                    if (i19 >= 0 && i19 == i18 + 1) {
                        this.f810r = this.f813u;
                    }
                    if (i18 < i19 && ((LinearLayout.LayoutParams) c0165a3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) c0165a3).width != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z6 = true;
                    }
                    int i50 = ((LinearLayout.LayoutParams) c0165a3).leftMargin + ((LinearLayout.LayoutParams) c0165a3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i50;
                    int max5 = Math.max(i13, measuredWidth2);
                    int combineMeasuredStates = View.combineMeasuredStates(i12, view.getMeasuredState());
                    z5 = z5 && ((LinearLayout.LayoutParams) c0165a3).width == -1;
                    if (((LinearLayout.LayoutParams) c0165a3).weight > 0.0f) {
                        if (!z2) {
                            i50 = measuredWidth2;
                        }
                        i23 = Math.max(i16, i50);
                        max3 = i17;
                    } else {
                        if (!z2) {
                            i50 = measuredWidth2;
                        }
                        max3 = Math.max(i17, i50);
                        i23 = i16;
                    }
                    i22 = max2;
                    f = f7;
                    i24 = max3;
                    i20 = combineMeasuredStates;
                    i25 = m29929p(view, i18) + i18;
                    i21 = max5;
                }
            }
            i25++;
            mode2 = i15;
            virtualChildCount = i14;
        }
    }
}

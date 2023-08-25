package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.daaw.zu */
/* loaded from: classes.dex */
public class C3899zu extends ListView {

    /* renamed from: A */
    public dk0 f35522A;

    /* renamed from: B */
    public RunnableC3905f f35523B;

    /* renamed from: p */
    public final Rect f35524p;

    /* renamed from: q */
    public int f35525q;

    /* renamed from: r */
    public int f35526r;

    /* renamed from: s */
    public int f35527s;

    /* renamed from: t */
    public int f35528t;

    /* renamed from: u */
    public int f35529u;

    /* renamed from: v */
    public C3903d f35530v;

    /* renamed from: w */
    public boolean f35531w;

    /* renamed from: x */
    public boolean f35532x;

    /* renamed from: y */
    public boolean f35533y;

    /* renamed from: z */
    public ut1 f35534z;

    /* renamed from: com.daaw.zu$a */
    /* loaded from: classes.dex */
    public static class C3900a {
        /* renamed from: a */
        public static void m1881a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: com.daaw.zu$b */
    /* loaded from: classes.dex */
    public static class C3901b {

        /* renamed from: a */
        public static Method f35535a;

        /* renamed from: b */
        public static Method f35536b;

        /* renamed from: c */
        public static Method f35537c;

        /* renamed from: d */
        public static boolean f35538d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f35535a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f35536b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f35537c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f35538d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public static boolean m1880a() {
            return f35538d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        public static void m1879b(C3899zu c3899zu, int i, View view) {
            try {
                f35535a.invoke(c3899zu, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f35536b.invoke(c3899zu, Integer.valueOf(i));
                f35537c.invoke(c3899zu, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.daaw.zu$c */
    /* loaded from: classes.dex */
    public static class C3902c {
        /* renamed from: a */
        public static boolean m1878a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* renamed from: b */
        public static void m1877b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: com.daaw.zu$d */
    /* loaded from: classes.dex */
    public static class C3903d extends C3594xu {

        /* renamed from: q */
        public boolean f35539q;

        public C3903d(Drawable drawable) {
            super(drawable);
            this.f35539q = true;
        }

        /* renamed from: c */
        public void m1876c(boolean z) {
            this.f35539q = z;
        }

        @Override // com.daaw.C3594xu, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f35539q) {
                super.draw(canvas);
            }
        }

        @Override // com.daaw.C3594xu, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f35539q) {
                super.setHotspot(f, f2);
            }
        }

        @Override // com.daaw.C3594xu, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f35539q) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // com.daaw.C3594xu, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f35539q) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // com.daaw.C3594xu, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f35539q) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: com.daaw.zu$e */
    /* loaded from: classes.dex */
    public static class C3904e {

        /* renamed from: a */
        public static final Field f35540a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f35540a = field;
        }

        /* renamed from: a */
        public static boolean m1875a(AbsListView absListView) {
            Field field = f35540a;
            if (field != null) {
                try {
                    return field.getBoolean(absListView);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static void m1874b(AbsListView absListView, boolean z) {
            Field field = f35540a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.daaw.zu$f */
    /* loaded from: classes.dex */
    public class RunnableC3905f implements Runnable {
        public RunnableC3905f() {
        }

        /* renamed from: a */
        public void m1873a() {
            C3899zu c3899zu = C3899zu.this;
            c3899zu.f35523B = null;
            c3899zu.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m1872b() {
            C3899zu.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C3899zu c3899zu = C3899zu.this;
            c3899zu.f35523B = null;
            c3899zu.drawableStateChanged();
        }
    }

    public C3899zu(Context context, boolean z) {
        super(context, null, x01.dropDownListViewStyle);
        this.f35524p = new Rect();
        this.f35525q = 0;
        this.f35526r = 0;
        this.f35527s = 0;
        this.f35528t = 0;
        this.f35532x = z;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z) {
        C3903d c3903d = this.f35530v;
        if (c3903d != null) {
            c3903d.m1876c(z);
        }
    }

    /* renamed from: a */
    public final void m1894a() {
        this.f35533y = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f35529u - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ut1 ut1Var = this.f35534z;
        if (ut1Var != null) {
            ut1Var.m7733c();
            this.f35534z = null;
        }
    }

    /* renamed from: b */
    public final void m1893b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    public final void m1892c(Canvas canvas) {
        Drawable selector;
        if (this.f35524p.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f35524p);
        selector.draw(canvas);
    }

    /* renamed from: d */
    public int mo1891d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m1892c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f35523B != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m1882m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1890e(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = false;
        } else if (actionMasked == 2) {
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                m1886i(childAt, pointToPosition, x, y);
                if (actionMasked == 1) {
                    m1893b(childAt, pointToPosition);
                }
                z2 = false;
                z = true;
                if (z) {
                }
                m1894a();
                if (z) {
                }
                return z;
            }
            z2 = true;
            if (z || z2) {
                m1894a();
            }
            if (z) {
                if (this.f35522A == null) {
                    this.f35522A = new dk0(this);
                }
                this.f35522A.m6502m(true);
                this.f35522A.onTouch(this, motionEvent);
            } else {
                dk0 dk0Var = this.f35522A;
                if (dk0Var != null) {
                    dk0Var.m6502m(false);
                }
            }
            return z;
        }
        z2 = false;
        z = false;
        if (z) {
        }
        m1894a();
        if (z) {
        }
        return z;
    }

    /* renamed from: f */
    public final void m1889f(int i, View view) {
        Rect rect = this.f35524p;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f35525q;
        rect.top -= this.f35526r;
        rect.right += this.f35527s;
        rect.bottom += this.f35528t;
        boolean m1885j = m1885j();
        if (view.isEnabled() != m1885j) {
            m1884k(!m1885j);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    /* renamed from: g */
    public final void m1888g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m1889f(i, view);
        if (z) {
            Rect rect = this.f35524p;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C2366nu.m14816k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    public final void m1887h(int i, View view, float f, float f2) {
        m1888g(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        C2366nu.m14816k(selector, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f35532x || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f35532x || super.hasWindowFocus();
    }

    /* renamed from: i */
    public final void m1886i(View view, int i, float f, float f2) {
        View childAt;
        this.f35533y = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            C3900a.m1881a(this, f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f35529u;
        if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f35529u = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (i2 >= 21) {
            C3900a.m1881a(view, left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1887h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f35532x || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f35532x && this.f35531w) || super.isInTouchMode();
    }

    /* renamed from: j */
    public final boolean m1885j() {
        return Build.VERSION.SDK_INT >= 33 ? C3902c.m1878a(this) : C3904e.m1875a(this);
    }

    /* renamed from: k */
    public final void m1884k(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            C3902c.m1877b(this, z);
        } else {
            C3904e.m1874b(this, z);
        }
    }

    /* renamed from: l */
    public final boolean m1883l() {
        return this.f35533y;
    }

    /* renamed from: m */
    public final void m1882m() {
        Drawable selector = getSelector();
        if (selector != null && m1883l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f35523B = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f35523B == null) {
            RunnableC3905f runnableC3905f = new RunnableC3905f();
            this.f35523B = runnableC3905f;
            runnableC3905f.m1872b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C3901b.m1880a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        C3901b.m1879b(this, pointToPosition, childAt);
                    }
                }
                m1882m();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f35529u = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC3905f runnableC3905f = this.f35523B;
        if (runnableC3905f != null) {
            runnableC3905f.m1873a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f35531w = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C3903d c3903d = drawable != null ? new C3903d(drawable) : null;
        this.f35530v = c3903d;
        super.setSelector(c3903d);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f35525q = rect.left;
        this.f35526r = rect.top;
        this.f35527s = rect.right;
        this.f35528t = rect.bottom;
    }
}

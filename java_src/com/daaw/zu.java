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
/* loaded from: classes.dex */
public class zu extends ListView {
    public dk0 A;
    public f B;
    public final Rect p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public d v;
    public boolean w;
    public boolean x;
    public boolean y;
    public ut1 z;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Method a;
        public static Method b;
        public static Method c;
        public static boolean d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public static boolean a() {
            return d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void b(zu zuVar, int i, View view) {
            try {
                a.invoke(zuVar, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                b.invoke(zuVar, Integer.valueOf(i));
                c.invoke(zuVar, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends xu {
        public boolean q;

        public d(Drawable drawable) {
            super(drawable);
            this.q = true;
        }

        public void c(boolean z) {
            this.q = z;
        }

        @Override // com.daaw.xu, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.q) {
                super.draw(canvas);
            }
        }

        @Override // com.daaw.xu, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.q) {
                super.setHotspot(f, f2);
            }
        }

        @Override // com.daaw.xu, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.q) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // com.daaw.xu, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.q) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // com.daaw.xu, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.q) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static final Field a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            a = field;
        }

        public static boolean a(AbsListView absListView) {
            Field field = a;
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

        public static void b(AbsListView absListView, boolean z) {
            Field field = a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        public void a() {
            zu zuVar = zu.this;
            zuVar.B = null;
            zuVar.removeCallbacks(this);
        }

        public void b() {
            zu.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            zu zuVar = zu.this;
            zuVar.B = null;
            zuVar.drawableStateChanged();
        }
    }

    public zu(Context context, boolean z) {
        super(context, null, x01.dropDownListViewStyle);
        this.p = new Rect();
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.x = z;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z) {
        d dVar = this.v;
        if (dVar != null) {
            dVar.c(z);
        }
    }

    public final void a() {
        this.y = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.u - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ut1 ut1Var = this.z;
        if (ut1Var != null) {
            ut1Var.c();
            this.z = null;
        }
    }

    public final void b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.p.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.p);
        selector.draw(canvas);
    }

    public int d(int i, int i2, int i3, int i4, int i5) {
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
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.B != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            com.daaw.dk0 r9 = r7.A
            if (r9 != 0) goto L5a
            com.daaw.dk0 r9 = new com.daaw.dk0
            r9.<init>(r7)
            r7.A = r9
        L5a:
            com.daaw.dk0 r9 = r7.A
            r9.m(r2)
            com.daaw.dk0 r9 = r7.A
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            com.daaw.dk0 r8 = r7.A
            if (r8 == 0) goto L6c
            r8.m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zu.e(android.view.MotionEvent, int):boolean");
    }

    public final void f(int i, View view) {
        Rect rect = this.p;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.q;
        rect.top -= this.r;
        rect.right += this.s;
        rect.bottom += this.t;
        boolean j = j();
        if (view.isEnabled() != j) {
            k(!j);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        f(i, view);
        if (z) {
            Rect rect = this.p;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            nu.k(selector, exactCenterX, exactCenterY);
        }
    }

    public final void h(int i, View view, float f2, float f3) {
        g(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        nu.k(selector, f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.x || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.x || super.hasWindowFocus();
    }

    public final void i(View view, int i, float f2, float f3) {
        View childAt;
        this.y = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            a.a(this, f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.u;
        if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.u = i;
        float left = f2 - view.getLeft();
        float top = f3 - view.getTop();
        if (i2 >= 21) {
            a.a(view, left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.x || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.x && this.w) || super.isInTouchMode();
    }

    public final boolean j() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    public final void k(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z);
        } else {
            e.b(this, z);
        }
    }

    public final boolean l() {
        return this.y;
    }

    public final void m() {
        Drawable selector = getSelector();
        if (selector != null && l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.B = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.B == null) {
            f fVar = new f();
            this.B = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !b.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, pointToPosition, childAt);
                    }
                }
                m();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.u = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.B;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.w = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.v = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.q = rect.left;
        this.r = rect.top;
        this.s = rect.right;
        this.t = rect.bottom;
    }
}

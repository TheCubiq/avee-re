package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.daaw.j0;
import com.daaw.o11;
import com.daaw.x21;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean p;
    public View q;
    public View r;
    public View s;
    public Drawable t;
    public Drawable u;
    public Drawable v;
    public boolean w;
    public boolean x;
    public int y;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        xs1.v0(this, new j0(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a);
        this.t = obtainStyledAttributes.getDrawable(x21.b);
        this.u = obtainStyledAttributes.getDrawable(x21.d);
        this.y = obtainStyledAttributes.getDimensionPixelSize(x21.j, -1);
        boolean z = true;
        if (getId() == o11.split_action_bar) {
            this.w = true;
            this.v = obtainStyledAttributes.getDrawable(x21.c);
        }
        obtainStyledAttributes.recycle();
        if (!this.w ? this.t != null || this.u != null : this.v != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.t;
        if (drawable != null && drawable.isStateful()) {
            this.t.setState(getDrawableState());
        }
        Drawable drawable2 = this.u;
        if (drawable2 != null && drawable2.isStateful()) {
            this.u.setState(getDrawableState());
        }
        Drawable drawable3 = this.v;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.v.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.v;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.r = findViewById(o11.action_bar);
        this.s = findViewById(o11.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.p || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.q;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.w) {
            Drawable drawable3 = this.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.t != null) {
                if (this.r.getVisibility() == 0) {
                    drawable2 = this.t;
                    left = this.r.getLeft();
                    top = this.r.getTop();
                    right = this.r.getRight();
                    view = this.r;
                } else {
                    View view3 = this.s;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.t.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.t;
                        left = this.s.getLeft();
                        top = this.s.getTop();
                        right = this.s.getRight();
                        view = this.s;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.x = z4;
            if (!z4 || (drawable = this.u) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.y
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.r
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.q
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.r
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.r
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.s
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.s
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.q
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.t);
        }
        this.t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.r;
            if (view != null) {
                this.t.setBounds(view.getLeft(), this.r.getTop(), this.r.getRight(), this.r.getBottom());
            }
        }
        boolean z = true;
        if (!this.w ? this.t != null || this.u != null : this.v != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            a.a(this);
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.v;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.v);
        }
        this.v = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.w && (drawable2 = this.v) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.w ? !(this.t != null || this.u != null) : this.v == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            a.a(this);
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.u;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.u);
        }
        this.u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.x && (drawable2 = this.u) != null) {
                drawable2.setBounds(this.q.getLeft(), this.q.getTop(), this.q.getRight(), this.q.getBottom());
            }
        }
        boolean z = true;
        if (!this.w ? this.t != null || this.u != null : this.v != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            a.a(this);
        }
    }

    public void setTabContainer(c cVar) {
        View view = this.q;
        if (view != null) {
            removeView(view);
        }
        this.q = cVar;
        if (cVar != null) {
            addView(cVar);
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            cVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.p = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.u;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.v;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.t && !this.w) || (drawable == this.u && this.x) || ((drawable == this.v && this.w) || super.verifyDrawable(drawable));
    }
}

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
import com.daaw.C1774j0;
import com.daaw.o11;
import com.daaw.x21;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: p */
    public boolean f465p;

    /* renamed from: q */
    public View f466q;

    /* renamed from: r */
    public View f467r;

    /* renamed from: s */
    public View f468s;

    /* renamed from: t */
    public Drawable f469t;

    /* renamed from: u */
    public Drawable f470u;

    /* renamed from: v */
    public Drawable f471v;

    /* renamed from: w */
    public boolean f472w;

    /* renamed from: x */
    public boolean f473x;

    /* renamed from: y */
    public int f474y;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    /* loaded from: classes.dex */
    public static class C0099a {
        /* renamed from: a */
        public static void m30161a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        xs1.m4694v0(this, new C1774j0(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.f31882a);
        this.f469t = obtainStyledAttributes.getDrawable(x21.f31887b);
        this.f470u = obtainStyledAttributes.getDrawable(x21.f31897d);
        this.f474y = obtainStyledAttributes.getDimensionPixelSize(x21.f31927j, -1);
        boolean z = true;
        if (getId() == o11.split_action_bar) {
            this.f472w = true;
            this.f471v = obtainStyledAttributes.getDrawable(x21.f31892c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f472w ? this.f469t != null || this.f470u != null : this.f471v != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int m30163a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m30162b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f469t;
        if (drawable != null && drawable.isStateful()) {
            this.f469t.setState(getDrawableState());
        }
        Drawable drawable2 = this.f470u;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f470u.setState(getDrawableState());
        }
        Drawable drawable3 = this.f471v;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f471v.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f466q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f469t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f470u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f471v;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f467r = findViewById(o11.action_bar);
        this.f468s = findViewById(o11.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f465p || super.onInterceptTouchEvent(motionEvent);
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
        View view2 = this.f466q;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f472w) {
            Drawable drawable3 = this.f471v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f469t != null) {
                if (this.f467r.getVisibility() == 0) {
                    drawable2 = this.f469t;
                    left = this.f467r.getLeft();
                    top = this.f467r.getTop();
                    right = this.f467r.getRight();
                    view = this.f467r;
                } else {
                    View view3 = this.f468s;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f469t.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f469t;
                        left = this.f468s.getLeft();
                        top = this.f468s.getTop();
                        right = this.f468s.getRight();
                        view = this.f468s;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f473x = z4;
            if (!z4 || (drawable = this.f470u) == null) {
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
    */
    public void onMeasure(int i, int i2) {
        int i3;
        View view;
        int i4;
        if (this.f467r == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.f474y) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f467r == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view2 = this.f466q;
        if (view2 == null || view2.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!m30162b(this.f467r)) {
            view = this.f467r;
        } else if (m30162b(this.f468s)) {
            i3 = 0;
            setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m30163a(this.f466q), mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
        } else {
            view = this.f468s;
        }
        i3 = m30163a(view);
        setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m30163a(this.f466q), mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f469t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f469t);
        }
        this.f469t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f467r;
            if (view != null) {
                this.f469t.setBounds(view.getLeft(), this.f467r.getTop(), this.f467r.getRight(), this.f467r.getBottom());
            }
        }
        boolean z = true;
        if (!this.f472w ? this.f469t != null || this.f470u != null : this.f471v != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0099a.m30161a(this);
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f471v;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f471v);
        }
        this.f471v = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f472w && (drawable2 = this.f471v) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f472w ? !(this.f469t != null || this.f470u != null) : this.f471v == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0099a.m30161a(this);
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f470u;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f470u);
        }
        this.f470u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f473x && (drawable2 = this.f470u) != null) {
                drawable2.setBounds(this.f466q.getLeft(), this.f466q.getTop(), this.f466q.getRight(), this.f466q.getBottom());
            }
        }
        boolean z = true;
        if (!this.f472w ? this.f469t != null || this.f470u != null : this.f471v != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0099a.m30161a(this);
        }
    }

    public void setTabContainer(C0166c c0166c) {
        View view = this.f466q;
        if (view != null) {
            removeView(view);
        }
        this.f466q = c0166c;
        if (c0166c != null) {
            addView(c0166c);
            ViewGroup.LayoutParams layoutParams = c0166c.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0166c.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f465p = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f469t;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f470u;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f471v;
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
        return (drawable == this.f469t && !this.f472w) || (drawable == this.f470u && this.f473x) || ((drawable == this.f471v && this.f472w) || super.verifyDrawable(drawable));
    }
}

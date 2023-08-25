package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import com.daaw.em1;
import com.daaw.l30;
import com.daaw.vc1;
import com.daaw.w4;
import com.daaw.x21;
/* loaded from: classes.dex */
public class ActionMenuItemView extends w4 implements j.a, View.OnClickListener, ActionMenuView.a {
    public b A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public g v;
    public CharSequence w;
    public Drawable x;
    public e.b y;
    public l30 z;

    /* loaded from: classes.dex */
    public class a extends l30 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // com.daaw.l30
        public vc1 b() {
            b bVar = ActionMenuItemView.this.A;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // com.daaw.l30
        public boolean c() {
            vc1 b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.y;
            return bVar != null && bVar.a(actionMenuItemView.v) && (b = b()) != null && b.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract vc1 a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.B = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.v, i, 0);
        this.D = obtainStyledAttributes.getDimensionPixelSize(x21.w, 0);
        obtainStyledAttributes.recycle();
        this.F = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.E = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.v.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void e(g gVar, int i) {
        this.v = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.z == null) {
            this.z = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.v;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.w);
        if (this.x != null && (!this.v.B() || (!this.B && !this.C))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.w : null);
        CharSequence contentDescription = this.v.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.v.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.v.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            em1.a(this, z3 ? null : this.v.getTitle());
        } else {
            em1.a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.y;
        if (bVar != null) {
            bVar.a(this.v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B = g();
        h();
    }

    @Override // com.daaw.w4, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean f = f();
        if (f && (i3 = this.E) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.D) : this.D;
        if (mode != 1073741824 && this.D > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (f || this.x == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.x.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l30 l30Var;
        if (this.v.hasSubMenu() && (l30Var = this.z) != null && l30Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.C != z) {
            this.C = z;
            g gVar = this.v;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.x = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.F;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.y = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.E = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.A = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.w = charSequence;
        h();
    }
}

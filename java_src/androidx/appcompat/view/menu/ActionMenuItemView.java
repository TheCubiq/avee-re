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
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.InterfaceC0093j;
import androidx.appcompat.widget.ActionMenuView;
import com.daaw.C3397w4;
import com.daaw.em1;
import com.daaw.l30;
import com.daaw.vc1;
import com.daaw.x21;
/* loaded from: classes.dex */
public class ActionMenuItemView extends C3397w4 implements InterfaceC0093j.InterfaceC0094a, View.OnClickListener, ActionMenuView.InterfaceC0114a {

    /* renamed from: A */
    public AbstractC0071b f267A;

    /* renamed from: B */
    public boolean f268B;

    /* renamed from: C */
    public boolean f269C;

    /* renamed from: D */
    public int f270D;

    /* renamed from: E */
    public int f271E;

    /* renamed from: F */
    public int f272F;

    /* renamed from: v */
    public C0086g f273v;

    /* renamed from: w */
    public CharSequence f274w;

    /* renamed from: x */
    public Drawable f275x;

    /* renamed from: y */
    public C0082e.InterfaceC0084b f276y;

    /* renamed from: z */
    public l30 f277z;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    public class C0070a extends l30 {
        public C0070a() {
            super(ActionMenuItemView.this);
        }

        @Override // com.daaw.l30
        /* renamed from: b */
        public vc1 mo17188b() {
            AbstractC0071b abstractC0071b = ActionMenuItemView.this.f267A;
            if (abstractC0071b != null) {
                return abstractC0071b.mo30114a();
            }
            return null;
        }

        @Override // com.daaw.l30
        /* renamed from: c */
        public boolean mo17187c() {
            vc1 mo17188b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0082e.InterfaceC0084b interfaceC0084b = actionMenuItemView.f276y;
            return interfaceC0084b != null && interfaceC0084b.mo30097a(actionMenuItemView.f273v) && (mo17188b = mo17188b()) != null && mo17188b.mo7286a();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0071b {
        /* renamed from: a */
        public abstract vc1 mo30114a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f268B = m30297g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.f31987v, i, 0);
        this.f270D = obtainStyledAttributes.getDimensionPixelSize(x21.f31992w, 0);
        obtainStyledAttributes.recycle();
        this.f272F = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f271E = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0114a
    /* renamed from: a */
    public boolean mo30096a() {
        return m30298f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0114a
    /* renamed from: b */
    public boolean mo30095b() {
        return m30298f() && this.f273v.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j.InterfaceC0094a
    /* renamed from: d */
    public boolean mo349d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j.InterfaceC0094a
    /* renamed from: e */
    public void mo348e(C0086g c0086g, int i) {
        this.f273v = c0086g;
        setIcon(c0086g.getIcon());
        setTitle(c0086g.m30207i(this));
        setId(c0086g.getItemId());
        setVisibility(c0086g.isVisible() ? 0 : 8);
        setEnabled(c0086g.isEnabled());
        if (c0086g.hasSubMenu() && this.f277z == null) {
            this.f277z = new C0070a();
        }
    }

    /* renamed from: f */
    public boolean m30298f() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: g */
    public final boolean m30297g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j.InterfaceC0094a
    public C0086g getItemData() {
        return this.f273v;
    }

    /* renamed from: h */
    public final void m30296h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f274w);
        if (this.f275x != null && (!this.f273v.m30214B() || (!this.f268B && !this.f269C))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f274w : null);
        CharSequence contentDescription = this.f273v.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f273v.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f273v.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            em1.m23375a(this, z3 ? null : this.f273v.getTitle());
        } else {
            em1.m23375a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0082e.InterfaceC0084b interfaceC0084b = this.f276y;
        if (interfaceC0084b != null) {
            interfaceC0084b.mo30097a(this.f273v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f268B = m30297g();
        m30296h();
    }

    @Override // com.daaw.C3397w4, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean m30298f = m30298f();
        if (m30298f && (i3 = this.f271E) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f270D) : this.f270D;
        if (mode != 1073741824 && this.f270D > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m30298f || this.f275x == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f275x.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l30 l30Var;
        if (this.f273v.hasSubMenu() && (l30Var = this.f277z) != null && l30Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f269C != z) {
            this.f269C = z;
            C0086g c0086g = this.f273v;
            if (c0086g != null) {
                c0086g.m30213c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f275x = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f272F;
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
        m30296h();
    }

    public void setItemInvoker(C0082e.InterfaceC0084b interfaceC0084b) {
        this.f276y = interfaceC0084b;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f271E = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0071b abstractC0071b) {
        this.f267A = abstractC0071b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f274w = charSequence;
        m30296h();
    }
}

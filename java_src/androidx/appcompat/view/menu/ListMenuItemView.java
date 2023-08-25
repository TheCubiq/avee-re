package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0093j;
import com.daaw.c21;
import com.daaw.o11;
import com.daaw.ul1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0093j.InterfaceC0094a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A */
    public Context f282A;

    /* renamed from: B */
    public boolean f283B;

    /* renamed from: C */
    public Drawable f284C;

    /* renamed from: D */
    public boolean f285D;

    /* renamed from: E */
    public LayoutInflater f286E;

    /* renamed from: F */
    public boolean f287F;

    /* renamed from: p */
    public C0086g f288p;

    /* renamed from: q */
    public ImageView f289q;

    /* renamed from: r */
    public RadioButton f290r;

    /* renamed from: s */
    public TextView f291s;

    /* renamed from: t */
    public CheckBox f292t;

    /* renamed from: u */
    public TextView f293u;

    /* renamed from: v */
    public ImageView f294v;

    /* renamed from: w */
    public ImageView f295w;

    /* renamed from: x */
    public LinearLayout f296x;

    /* renamed from: y */
    public Drawable f297y;

    /* renamed from: z */
    public int f298z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        ul1 m8037v = ul1.m8037v(getContext(), attributeSet, x21.f31855T1, i, 0);
        this.f297y = m8037v.m8052g(x21.f31864V1);
        this.f298z = m8037v.m8045n(x21.f31860U1, -1);
        this.f283B = m8037v.m8058a(x21.f31868W1, false);
        this.f282A = context;
        this.f284C = m8037v.m8052g(x21.f31872X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, x01.dropDownListViewStyle, 0);
        this.f285D = obtainStyledAttributes.hasValue(0);
        m8037v.m8036w();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f286E == null) {
            this.f286E = LayoutInflater.from(getContext());
        }
        return this.f286E;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f294v;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void m30295a(View view) {
        m30294b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f295w;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f295w.getLayoutParams();
        rect.top += this.f295w.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final void m30294b(View view, int i) {
        LinearLayout linearLayout = this.f296x;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    public final void m30293c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(c21.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f292t = checkBox;
        m30295a(checkBox);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j.InterfaceC0094a
    /* renamed from: d */
    public boolean mo349d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j.InterfaceC0094a
    /* renamed from: e */
    public void mo348e(C0086g c0086g, int i) {
        this.f288p = c0086g;
        setVisibility(c0086g.isVisible() ? 0 : 8);
        setTitle(c0086g.m30207i(this));
        setCheckable(c0086g.isCheckable());
        m30290h(c0086g.m30215A(), c0086g.m30209g());
        setIcon(c0086g.getIcon());
        setEnabled(c0086g.isEnabled());
        setSubMenuArrowVisible(c0086g.hasSubMenu());
        setContentDescription(c0086g.getContentDescription());
    }

    /* renamed from: f */
    public final void m30292f() {
        ImageView imageView = (ImageView) getInflater().inflate(c21.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f289q = imageView;
        m30294b(imageView, 0);
    }

    /* renamed from: g */
    public final void m30291g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(c21.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f290r = radioButton;
        m30295a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j.InterfaceC0094a
    public C0086g getItemData() {
        return this.f288p;
    }

    /* renamed from: h */
    public void m30290h(boolean z, char c) {
        int i = (z && this.f288p.m30215A()) ? 0 : 8;
        if (i == 0) {
            this.f293u.setText(this.f288p.m30208h());
        }
        if (this.f293u.getVisibility() != i) {
            this.f293u.setVisibility(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        xs1.m4694v0(this, this.f297y);
        TextView textView = (TextView) findViewById(o11.title);
        this.f291s = textView;
        int i = this.f298z;
        if (i != -1) {
            textView.setTextAppearance(this.f282A, i);
        }
        this.f293u = (TextView) findViewById(o11.shortcut);
        ImageView imageView = (ImageView) findViewById(o11.submenuarrow);
        this.f294v = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f284C);
        }
        this.f295w = (ImageView) findViewById(o11.group_divider);
        this.f296x = (LinearLayout) findViewById(o11.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f289q != null && this.f283B) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f289q.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f290r == null && this.f292t == null) {
            return;
        }
        if (this.f288p.m30203m()) {
            if (this.f290r == null) {
                m30291g();
            }
            compoundButton = this.f290r;
            compoundButton2 = this.f292t;
        } else {
            if (this.f292t == null) {
                m30293c();
            }
            compoundButton = this.f292t;
            compoundButton2 = this.f290r;
        }
        if (z) {
            compoundButton.setChecked(this.f288p.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f292t;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f290r;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f288p.m30203m()) {
            if (this.f290r == null) {
                m30291g();
            }
            compoundButton = this.f290r;
        } else {
            if (this.f292t == null) {
                m30293c();
            }
            compoundButton = this.f292t;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f287F = z;
        this.f283B = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f295w;
        if (imageView != null) {
            imageView.setVisibility((this.f285D || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f288p.m30190z() || this.f287F;
        if (z || this.f283B) {
            ImageView imageView = this.f289q;
            if (imageView == null && drawable == null && !this.f283B) {
                return;
            }
            if (imageView == null) {
                m30292f();
            }
            if (drawable == null && !this.f283B) {
                this.f289q.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f289q;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f289q.getVisibility() != 0) {
                this.f289q.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f291s.setText(charSequence);
            if (this.f291s.getVisibility() == 0) {
                return;
            }
            textView = this.f291s;
            i = 0;
        } else {
            i = 8;
            if (this.f291s.getVisibility() == 8) {
                return;
            }
            textView = this.f291s;
        }
        textView.setVisibility(i);
    }
}

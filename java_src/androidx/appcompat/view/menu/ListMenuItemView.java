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
import androidx.appcompat.view.menu.j;
import com.daaw.c21;
import com.daaw.o11;
import com.daaw.ul1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {
    public Context A;
    public boolean B;
    public Drawable C;
    public boolean D;
    public LayoutInflater E;
    public boolean F;
    public g p;
    public ImageView q;
    public RadioButton r;
    public TextView s;
    public CheckBox t;
    public TextView u;
    public ImageView v;
    public ImageView w;
    public LinearLayout x;
    public Drawable y;
    public int z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        ul1 v = ul1.v(getContext(), attributeSet, x21.T1, i, 0);
        this.y = v.g(x21.V1);
        this.z = v.n(x21.U1, -1);
        this.B = v.a(x21.W1, false);
        this.A = context;
        this.C = v.g(x21.X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, x01.dropDownListViewStyle, 0);
        this.D = obtainStyledAttributes.hasValue(0);
        v.w();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.E == null) {
            this.E = LayoutInflater.from(getContext());
        }
        return this.E;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.v;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.w;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.w.getLayoutParams();
        rect.top += this.w.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i) {
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public final void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(c21.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.t = checkBox;
        a(checkBox);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void e(g gVar, int i) {
        this.p = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(c21.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.q = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(c21.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.r = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.p;
    }

    public void h(boolean z, char c) {
        int i = (z && this.p.A()) ? 0 : 8;
        if (i == 0) {
            this.u.setText(this.p.h());
        }
        if (this.u.getVisibility() != i) {
            this.u.setVisibility(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        xs1.v0(this, this.y);
        TextView textView = (TextView) findViewById(o11.title);
        this.s = textView;
        int i = this.z;
        if (i != -1) {
            textView.setTextAppearance(this.A, i);
        }
        this.u = (TextView) findViewById(o11.shortcut);
        ImageView imageView = (ImageView) findViewById(o11.submenuarrow);
        this.v = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.C);
        }
        this.w = (ImageView) findViewById(o11.group_divider);
        this.x = (LinearLayout) findViewById(o11.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.q != null && this.B) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.q.getLayoutParams();
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
        if (!z && this.r == null && this.t == null) {
            return;
        }
        if (this.p.m()) {
            if (this.r == null) {
                g();
            }
            compoundButton = this.r;
            compoundButton2 = this.t;
        } else {
            if (this.t == null) {
                c();
            }
            compoundButton = this.t;
            compoundButton2 = this.r;
        }
        if (z) {
            compoundButton.setChecked(this.p.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.t;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.r;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.p.m()) {
            if (this.r == null) {
                g();
            }
            compoundButton = this.r;
        } else {
            if (this.t == null) {
                c();
            }
            compoundButton = this.t;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.F = z;
        this.B = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.w;
        if (imageView != null) {
            imageView.setVisibility((this.D || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.p.z() || this.F;
        if (z || this.B) {
            ImageView imageView = this.q;
            if (imageView == null && drawable == null && !this.B) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.B) {
                this.q.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.q;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.q.getVisibility() != 0) {
                this.q.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.s.setText(charSequence);
            if (this.s.getVisibility() == 0) {
                return;
            }
            textView = this.s;
            i = 0;
        } else {
            i = 8;
            if (this.s.getVisibility() == 8) {
                return;
            }
            textView = this.s;
        }
        textView.setVisibility(i);
    }
}

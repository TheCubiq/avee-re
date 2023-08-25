package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public class fn0 extends q3 {
    public final ck0 t;
    public final AccessibilityManager u;
    public final Rect v;

    /* loaded from: classes2.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            fn0 fn0Var = fn0.this;
            fn0.this.f(i < 0 ? fn0Var.t.v() : fn0Var.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = fn0.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = fn0.this.t.y();
                    i = fn0.this.t.x();
                    j = fn0.this.t.w();
                }
                onItemClickListener.onItemClick(fn0.this.t.k(), view, i, j);
            }
            fn0.this.t.dismiss();
        }
    }

    public fn0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.a);
    }

    public fn0(Context context, AttributeSet attributeSet, int i) {
        super(qn0.c(context, attributeSet, i, 0), attributeSet, i);
        this.v = new Rect();
        Context context2 = getContext();
        TypedArray h = xk1.h(context2, attributeSet, m21.L1, i, k21.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = m21.M1;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.u = (AccessibilityManager) context2.getSystemService("accessibility");
        ck0 ck0Var = new ck0(context2);
        this.t = ck0Var;
        ck0Var.J(true);
        ck0Var.D(this);
        ck0Var.I(2);
        ck0Var.p(getAdapter());
        ck0Var.L(new a());
        h.recycle();
    }

    public final TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout d = d();
        int i = 0;
        if (adapter == null || d == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.t.x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, d);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable i3 = this.t.i();
        if (i3 != null) {
            i3.getPadding(this.v);
            Rect rect = this.v;
            i2 += rect.left + rect.right;
        }
        return i2 + d.getEndIconView().getMeasuredWidth();
    }

    public final <T extends ListAdapter & Filterable> void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout d = d();
        return (d == null || !d.O()) ? super.getHint() : d.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d = d();
        if (d != null && d.O() && super.getHint() == null && xm0.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.t.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.u;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.t.h();
        }
    }
}

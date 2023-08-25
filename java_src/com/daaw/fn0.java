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
public class fn0 extends C2682q3 {

    /* renamed from: t */
    public final ck0 f9704t;

    /* renamed from: u */
    public final AccessibilityManager f9705u;

    /* renamed from: v */
    public final Rect f9706v;

    /* renamed from: com.daaw.fn0$a */
    /* loaded from: classes2.dex */
    public class C1308a implements AdapterView.OnItemClickListener {
        public C1308a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            fn0 fn0Var = fn0.this;
            fn0.this.m22478f(i < 0 ? fn0Var.f9704t.m25266v() : fn0Var.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = fn0.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = fn0.this.f9704t.m25263y();
                    i = fn0.this.f9704t.m25264x();
                    j = fn0.this.f9704t.m25265w();
                }
                onItemClickListener.onItemClick(fn0.this.f9704t.mo7284k(), view, i, j);
            }
            fn0.this.f9704t.dismiss();
        }
    }

    public fn0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.f30747a);
    }

    public fn0(Context context, AttributeSet attributeSet, int i) {
        super(qn0.m12324c(context, attributeSet, i, 0), attributeSet, i);
        this.f9706v = new Rect();
        Context context2 = getContext();
        TypedArray m5026h = xk1.m5026h(context2, attributeSet, m21.f18086L1, i, k21.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = m21.f18093M1;
        if (m5026h.hasValue(i2) && m5026h.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f9705u = (AccessibilityManager) context2.getSystemService("accessibility");
        ck0 ck0Var = new ck0(context2);
        this.f9704t = ck0Var;
        ck0Var.m25285J(true);
        ck0Var.m25291D(this);
        ck0Var.m25286I(2);
        ck0Var.mo25271p(getAdapter());
        ck0Var.m25283L(new C1308a());
        m5026h.recycle();
    }

    /* renamed from: d */
    public final TextInputLayout m22480d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final int m22479e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m22480d = m22480d();
        int i = 0;
        if (adapter == null || m22480d == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f9704t.m25264x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, m22480d);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable m25274i = this.f9704t.m25274i();
        if (m25274i != null) {
            m25274i.getPadding(this.f9706v);
            Rect rect = this.f9706v;
            i2 += rect.left + rect.right;
        }
        return i2 + m22480d.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: f */
    public final <T extends ListAdapter & Filterable> void m22478f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m22480d = m22480d();
        return (m22480d == null || !m22480d.m300O()) ? super.getHint() : m22480d.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m22480d = m22480d();
        if (m22480d != null && m22480d.m300O() && super.getHint() == null && xm0.m5007a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m22479e()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f9704t.mo25271p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f9705u;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f9704t.mo7285h();
        }
    }
}

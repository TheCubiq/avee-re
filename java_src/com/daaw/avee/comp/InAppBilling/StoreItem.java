package com.daaw.avee.comp.InAppBilling;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.daaw.C3412wb;
import com.daaw.C3866zk;
import com.daaw.avee.R;
import com.daaw.kz0;
import com.daaw.nc0;
/* loaded from: classes.dex */
public class StoreItem extends FrameLayout {

    /* renamed from: p */
    public RadioButton f3810p;

    /* renamed from: q */
    public TextView f3811q;

    /* renamed from: r */
    public TextView f3812r;

    /* renamed from: s */
    public TextView f3813s;

    /* renamed from: t */
    public String f3814t;

    public StoreItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoreItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26856c();
    }

    /* renamed from: a */
    public static int m26858a(String str) {
        str.hashCode();
        return !str.equals("M") ? !str.equals("Y") ? R.plurals.store_subscription_interval_unknown : R.plurals.store_subscription_interval_y : R.plurals.store_subscription_interval_m;
    }

    /* renamed from: d */
    public static void m26855d(TextView textView, String str) {
        int parseInt = Integer.parseInt(str.substring(1, str.length() - 1));
        String substring = str.substring(str.length() - 1);
        textView.setText(textView.getContext().getResources().getQuantityString(m26858a(substring), parseInt, Integer.valueOf(parseInt), substring));
    }

    private boolean getIsPurchased() {
        return nc0.f19997o.m5753a(this.f3814t, Boolean.FALSE).booleanValue();
    }

    /* renamed from: b */
    public void m26857b() {
        TextView textView;
        int i;
        if (getIsPurchased()) {
            this.f3813s.setText(R.string.store_owned);
            this.f3813s.setTextColor(C3866zk.m2180c(getContext(), R.color.text_color_m1));
            this.f3813s.setTextSize(14.0f);
            textView = this.f3813s;
            i = 0;
        } else if (!this.f3813s.getText().equals(getResources().getText(R.string.store_owned))) {
            return;
        } else {
            textView = this.f3813s;
            i = 4;
        }
        textView.setVisibility(i);
    }

    /* renamed from: c */
    public final void m26856c() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.store_item, (ViewGroup) this, true);
        this.f3810p = (RadioButton) inflate.findViewById(R.id.button);
        this.f3811q = (TextView) inflate.findViewById(R.id.price_tv);
        this.f3812r = (TextView) inflate.findViewById(R.id.interval_tv);
        this.f3813s = (TextView) inflate.findViewById(R.id.tag_tv);
    }

    /* renamed from: e */
    public void m26854e() {
        if (getIsPurchased()) {
            return;
        }
        this.f3813s.setText(R.string.store_most_popular);
        this.f3813s.setTextSize(10.0f);
        this.f3813s.setVisibility(0);
    }

    public String getSku() {
        return this.f3814t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3810p = null;
        this.f3811q = null;
        this.f3812r = null;
        this.f3813s = null;
    }

    public void setChecked(boolean z) {
        this.f3810p.setChecked(z);
    }

    public void setDetails(kz0 kz0Var) {
        if (kz0Var == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f3814t = kz0Var.m17311b();
        kz0.C1999b m6241m = C3412wb.m6241m(kz0Var);
        if (m6241m != null) {
            this.f3811q.setText(m6241m.m17304b().replace(" ", " "));
            m26855d(this.f3812r, m6241m.m17305a());
        }
    }
}

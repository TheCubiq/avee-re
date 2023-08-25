package com.daaw.avee.comp.InAppBilling;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.kz0;
import com.daaw.nc0;
import com.daaw.wb;
import com.daaw.zk;
/* loaded from: classes.dex */
public class StoreItem extends FrameLayout {
    public RadioButton p;
    public TextView q;
    public TextView r;
    public TextView s;
    public String t;

    public StoreItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoreItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public static int a(String str) {
        str.hashCode();
        return !str.equals("M") ? !str.equals("Y") ? R.plurals.store_subscription_interval_unknown : R.plurals.store_subscription_interval_y : R.plurals.store_subscription_interval_m;
    }

    public static void d(TextView textView, String str) {
        int parseInt = Integer.parseInt(str.substring(1, str.length() - 1));
        String substring = str.substring(str.length() - 1);
        textView.setText(textView.getContext().getResources().getQuantityString(a(substring), parseInt, Integer.valueOf(parseInt), substring));
    }

    private boolean getIsPurchased() {
        return nc0.o.a(this.t, Boolean.FALSE).booleanValue();
    }

    public void b() {
        TextView textView;
        int i;
        if (getIsPurchased()) {
            this.s.setText(R.string.store_owned);
            this.s.setTextColor(zk.c(getContext(), R.color.text_color_m1));
            this.s.setTextSize(14.0f);
            textView = this.s;
            i = 0;
        } else if (!this.s.getText().equals(getResources().getText(R.string.store_owned))) {
            return;
        } else {
            textView = this.s;
            i = 4;
        }
        textView.setVisibility(i);
    }

    public final void c() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.store_item, (ViewGroup) this, true);
        this.p = (RadioButton) inflate.findViewById(R.id.button);
        this.q = (TextView) inflate.findViewById(R.id.price_tv);
        this.r = (TextView) inflate.findViewById(R.id.interval_tv);
        this.s = (TextView) inflate.findViewById(R.id.tag_tv);
    }

    public void e() {
        if (getIsPurchased()) {
            return;
        }
        this.s.setText(R.string.store_most_popular);
        this.s.setTextSize(10.0f);
        this.s.setVisibility(0);
    }

    public String getSku() {
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    public void setChecked(boolean z) {
        this.p.setChecked(z);
    }

    public void setDetails(kz0 kz0Var) {
        if (kz0Var == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.t = kz0Var.b();
        kz0.b m = wb.m(kz0Var);
        if (m != null) {
            this.q.setText(m.b().replace(" ", " "));
            d(this.r, m.a());
        }
    }
}

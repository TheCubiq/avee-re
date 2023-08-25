package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class d30 extends ma implements wc0.a {
    public TextView u;
    public TextView v;
    public String w;

    public d30(Context context, ViewGroup viewGroup) {
        super(gr1.p(context).inflate(R.layout.footer_queue_item, viewGroup, false), 1, true);
        this.w = null;
        View view = this.a;
        this.u = (TextView) view.findViewById(R.id.textInfo);
        this.v = (TextView) view.findViewById(R.id.textInfoItems);
    }

    @Override // com.daaw.ma, com.daaw.eb
    public void O(wc0 wc0Var, int i) {
        super.O(wc0Var, i);
        this.u.setText("");
        this.v.setText("");
        wc0Var.n(new WeakReference<>(this));
        P();
    }

    public final void P() {
    }

    @Override // com.daaw.wc0.a
    public void a(String str) {
        this.w = str;
    }

    @Override // com.daaw.wc0.a
    public void b(int i, int i2, boolean z, boolean z2) {
        String str = "";
        if (z) {
            this.u.setText(R.string.searching);
            if (i >= 0) {
                str = this.v.getResources().getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i, Integer.valueOf(i));
            }
        } else if (i != 0) {
            this.u.setText("");
            this.v.setText(this.v.getResources().getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i, Integer.valueOf(i)));
            return;
        } else {
            this.u.setText(R.string.nothing_to_show);
        }
        this.v.setText(str);
    }
}

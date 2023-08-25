package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class c30 extends ma implements wc0.a {
    public boolean A;
    public TextView u;
    public TextView v;
    public String w;
    public int x;
    public int y;
    public boolean z;

    public c30(Context context, ViewGroup viewGroup, int i) {
        super(gr1.p(context).inflate(i == 2 ? R.layout.footer_library_item : R.layout.footer_item, viewGroup, false), 1, true);
        this.w = null;
        this.x = 0;
        this.y = 0;
        this.z = false;
        this.A = false;
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

    public final void Q() {
        TextView textView;
        int i;
        String str = this.w;
        String str2 = "";
        if (str != null) {
            this.u.setText(str);
            this.v.setText("");
            return;
        }
        if (this.A) {
            textView = this.u;
            i = R.string.loading;
        } else if (this.z) {
            this.u.setText(R.string.searching);
            if (this.x >= 0) {
                Resources resources = this.v.getResources();
                int i2 = this.x;
                str2 = resources.getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i2, Integer.valueOf(i2));
            }
            this.v.setText(str2);
        } else if (this.x != 0) {
            this.u.setText("");
            Resources resources2 = this.v.getResources();
            int i3 = this.x;
            this.v.setText(resources2.getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i3, Integer.valueOf(i3)));
            return;
        } else {
            textView = this.u;
            i = R.string.nothing_to_show;
        }
        textView.setText(i);
        this.v.setText(str2);
    }

    @Override // com.daaw.wc0.a
    public void a(String str) {
        this.w = str;
        Q();
    }

    @Override // com.daaw.wc0.a
    public void b(int i, int i2, boolean z, boolean z2) {
        this.x = i;
        this.y = i2;
        this.z = z;
        this.A = z2;
        Q();
    }
}

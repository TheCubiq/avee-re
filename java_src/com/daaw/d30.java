package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class d30 extends AbstractC2161ma implements wc0.InterfaceC3420a {

    /* renamed from: u */
    public TextView f6437u;

    /* renamed from: v */
    public TextView f6438v;

    /* renamed from: w */
    public String f6439w;

    public d30(Context context, ViewGroup viewGroup) {
        super(gr1.m21319p(context).inflate(R.layout.footer_queue_item, viewGroup, false), 1, true);
        this.f6439w = null;
        View view = this.f1947a;
        this.f6437u = (TextView) view.findViewById(R.id.textInfo);
        this.f6438v = (TextView) view.findViewById(R.id.textInfoItems);
    }

    @Override // com.daaw.AbstractC2161ma, com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(wc0 wc0Var, int i) {
        super.mo4018O(wc0Var, i);
        this.f6437u.setText("");
        this.f6438v.setText("");
        wc0Var.mo3665n(new WeakReference<>(this));
        m24732P();
    }

    /* renamed from: P */
    public final void m24732P() {
    }

    @Override // com.daaw.wc0.InterfaceC3420a
    /* renamed from: a */
    public void mo6190a(String str) {
        this.f6439w = str;
    }

    @Override // com.daaw.wc0.InterfaceC3420a
    /* renamed from: b */
    public void mo6189b(int i, int i2, boolean z, boolean z2) {
        String str = "";
        if (z) {
            this.f6437u.setText(R.string.searching);
            if (i >= 0) {
                str = this.f6438v.getResources().getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i, Integer.valueOf(i));
            }
        } else if (i != 0) {
            this.f6437u.setText("");
            this.f6438v.setText(this.f6438v.getResources().getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i, Integer.valueOf(i)));
            return;
        } else {
            this.f6437u.setText(R.string.nothing_to_show);
        }
        this.f6438v.setText(str);
    }
}

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
public class c30 extends AbstractC2161ma implements wc0.InterfaceC3420a {

    /* renamed from: A */
    public boolean f5431A;

    /* renamed from: u */
    public TextView f5432u;

    /* renamed from: v */
    public TextView f5433v;

    /* renamed from: w */
    public String f5434w;

    /* renamed from: x */
    public int f5435x;

    /* renamed from: y */
    public int f5436y;

    /* renamed from: z */
    public boolean f5437z;

    public c30(Context context, ViewGroup viewGroup, int i) {
        super(gr1.m21319p(context).inflate(i == 2 ? R.layout.footer_library_item : R.layout.footer_item, viewGroup, false), 1, true);
        this.f5434w = null;
        this.f5435x = 0;
        this.f5436y = 0;
        this.f5437z = false;
        this.f5431A = false;
        View view = this.f1947a;
        this.f5432u = (TextView) view.findViewById(R.id.textInfo);
        this.f5433v = (TextView) view.findViewById(R.id.textInfoItems);
    }

    @Override // com.daaw.AbstractC2161ma, com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(wc0 wc0Var, int i) {
        super.mo4018O(wc0Var, i);
        this.f5432u.setText("");
        this.f5433v.setText("");
        wc0Var.mo3665n(new WeakReference<>(this));
        m25653P();
    }

    /* renamed from: P */
    public final void m25653P() {
    }

    /* renamed from: Q */
    public final void m25652Q() {
        TextView textView;
        int i;
        String str = this.f5434w;
        String str2 = "";
        if (str != null) {
            this.f5432u.setText(str);
            this.f5433v.setText("");
            return;
        }
        if (this.f5431A) {
            textView = this.f5432u;
            i = R.string.loading;
        } else if (this.f5437z) {
            this.f5432u.setText(R.string.searching);
            if (this.f5435x >= 0) {
                Resources resources = this.f5433v.getResources();
                int i2 = this.f5435x;
                str2 = resources.getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i2, Integer.valueOf(i2));
            }
            this.f5433v.setText(str2);
        } else if (this.f5435x != 0) {
            this.f5432u.setText("");
            Resources resources2 = this.f5433v.getResources();
            int i3 = this.f5435x;
            this.f5433v.setText(resources2.getQuantityString(R.plurals.showing_x_of_y_items3_item_count, i3, Integer.valueOf(i3)));
            return;
        } else {
            textView = this.f5432u;
            i = R.string.nothing_to_show;
        }
        textView.setText(i);
        this.f5433v.setText(str2);
    }

    @Override // com.daaw.wc0.InterfaceC3420a
    /* renamed from: a */
    public void mo6190a(String str) {
        this.f5434w = str;
        m25652Q();
    }

    @Override // com.daaw.wc0.InterfaceC3420a
    /* renamed from: b */
    public void mo6189b(int i, int i2, boolean z, boolean z2) {
        this.f5435x = i;
        this.f5436y = i2;
        this.f5437z = z;
        this.f5431A = z2;
        m25652Q();
    }
}

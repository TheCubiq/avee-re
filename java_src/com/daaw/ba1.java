package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.ir1;
import com.daaw.wc0;
/* loaded from: classes.dex */
public class ba1 extends AbstractC1172eb implements wc0.InterfaceC3420a {

    /* renamed from: t */
    public ImageButton f4572t;

    /* renamed from: u */
    public TextView f4573u;

    /* renamed from: com.daaw.ba1$a */
    /* loaded from: classes.dex */
    public class C0829a implements ir1.InterfaceC1750b<String> {
        public C0829a() {
        }

        @Override // com.daaw.ir1.InterfaceC1750b
        /* renamed from: b */
        public void mo15140a(String str, boolean z) {
            if (z) {
                return;
            }
            ba1.this.f4573u.setText(str);
        }
    }

    /* renamed from: com.daaw.ba1$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0830b implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ wc0 f4575p;

        public View$OnClickListenerC0830b(wc0 wc0Var) {
            this.f4575p = wc0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wc0 wc0Var = this.f4575p;
            wc0Var.mo3671c(!wc0Var.mo3658z());
            ba1.this.m26317Q(this.f4575p.mo3658z());
        }
    }

    public ba1(Context context, ViewGroup viewGroup) {
        super(gr1.m21319p(context).inflate(R.layout.section_item, viewGroup, false));
        View view = this.f1947a;
        this.f4572t = (ImageButton) view.findViewById(R.id.btnCollapse);
        this.f4573u = (TextView) view.findViewById(R.id.txtTitle);
    }

    @Override // com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(wc0 wc0Var, int i) {
        wc0Var.mo3667l().mo8856a(new C0829a());
        m26317Q(wc0Var.mo3658z());
        this.f4572t.setOnClickListener(new View$OnClickListenerC0830b(wc0Var));
    }

    /* renamed from: Q */
    public void m26317Q(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.f4572t;
            i = R.drawable.ic_minus;
        } else {
            imageButton = this.f4572t;
            i = R.drawable.ic_expand2;
        }
        imageButton.setImageResource(i);
    }

    @Override // com.daaw.wc0.InterfaceC3420a
    /* renamed from: a */
    public void mo6190a(String str) {
    }

    @Override // com.daaw.wc0.InterfaceC3420a
    /* renamed from: b */
    public void mo6189b(int i, int i2, boolean z, boolean z2) {
    }
}

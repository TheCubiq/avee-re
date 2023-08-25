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
public class ba1 extends eb implements wc0.a {
    public ImageButton t;
    public TextView u;

    /* loaded from: classes.dex */
    public class a implements ir1.b<String> {
        public a() {
        }

        @Override // com.daaw.ir1.b
        /* renamed from: b */
        public void a(String str, boolean z) {
            if (z) {
                return;
            }
            ba1.this.u.setText(str);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ wc0 p;

        public b(wc0 wc0Var) {
            this.p = wc0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wc0 wc0Var = this.p;
            wc0Var.c(!wc0Var.z());
            ba1.this.Q(this.p.z());
        }
    }

    public ba1(Context context, ViewGroup viewGroup) {
        super(gr1.p(context).inflate(R.layout.section_item, viewGroup, false));
        View view = this.a;
        this.t = (ImageButton) view.findViewById(R.id.btnCollapse);
        this.u = (TextView) view.findViewById(R.id.txtTitle);
    }

    @Override // com.daaw.eb
    public void O(wc0 wc0Var, int i) {
        wc0Var.l().a(new a());
        Q(wc0Var.z());
        this.t.setOnClickListener(new b(wc0Var));
    }

    public void Q(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.t;
            i = R.drawable.ic_minus;
        } else {
            imageButton = this.t;
            i = R.drawable.ic_expand2;
        }
        imageButton.setImageResource(i);
    }

    @Override // com.daaw.wc0.a
    public void a(String str) {
    }

    @Override // com.daaw.wc0.a
    public void b(int i, int i2, boolean z, boolean z2) {
    }
}

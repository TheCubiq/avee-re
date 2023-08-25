package com.daaw;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class po {
    public ViewGroup a;
    public ViewGroup b;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.i();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            po.this.a.setVisibility(8);
        }
    }

    public void b(ho hoVar) {
        this.a.animate().alpha(0.0f).setDuration(hoVar.p).withEndAction(new b());
    }

    public boolean c() {
        return this.a.getVisibility() == 0;
    }

    public boolean d() {
        return this.b != null;
    }

    public void e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Activity activity) {
        this.a = (ViewGroup) viewGroup.findViewById(R.id.propertyViewRoot);
        this.b = (ViewGroup) viewGroup.findViewById(R.id.layoutPropertyContent);
        ((ImageButton) viewGroup.findViewById(R.id.btnClose)).setOnClickListener(new a());
    }

    public void f(ho hoVar) {
        this.a.setVisibility(0);
        this.a.animate().alpha(1.0f).setDuration(hoVar.p);
    }

    public void g(un unVar, String str, w40<e0<Object>> w40Var) {
        ho k = ho.k();
        if (k != null && k.p() && d()) {
            LayoutInflater from = LayoutInflater.from(k.getActivity());
            if (unVar == null || str == null) {
                this.b.removeAllViews();
                b(k);
                return;
            }
            this.b.removeAllViews();
            this.a.setAlpha(0.0f);
            f(k);
            unVar.q(str);
            no.l(k, from, unVar, this.b, str, true, w40Var);
        }
    }
}

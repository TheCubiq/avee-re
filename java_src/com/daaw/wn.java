package com.daaw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class wn extends RecyclerView.g<yn> {
    public final Context c;
    public List<lo1<String, String>> d;
    public c e;
    public d f;
    public ViewGroup g;
    public int h = -1;
    public boolean i = false;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ yn p;

        public a(yn ynVar) {
            this.p = ynVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wn.this.f.a(this.p.l(), this.p.a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ yn p;

        public b(yn ynVar) {
            this.p = ynVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wn.this.f.a(this.p.l(), this.p.a);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(View view);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(int i, View view);
    }

    public wn(Context context, List<lo1<String, String>> list, ViewGroup viewGroup) {
        this.c = context;
        if (list != null) {
            this.d = list;
        } else {
            this.d = new ArrayList();
        }
        this.g = viewGroup;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: A */
    public yn o(ViewGroup viewGroup, int i) {
        return new yn(LayoutInflater.from(this.c).inflate(R.layout.custom_simple_item, viewGroup, false), this.e, this.g);
    }

    public void B(List<lo1<String, String>> list) {
        this.d = list;
        i();
    }

    public void C(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        i();
    }

    public void D(int i, lo1<String, String> lo1Var) {
        if (i < 0 || i >= this.d.size()) {
            return;
        }
        this.d.set(i, lo1Var);
    }

    public void E(c cVar) {
        this.e = cVar;
    }

    public void F(d dVar) {
        this.f = dVar;
    }

    public void G(int i, View view) {
        if (view != null) {
            view.setSelected(true);
        } else {
            int i2 = this.h;
            if (i2 >= 0) {
                j(i2);
            }
        }
        this.h = i;
        if (i >= 0) {
            j(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int d() {
        return this.d.size();
    }

    public boolean y() {
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: z */
    public void m(yn ynVar, int i) {
        ynVar.P();
        lo1<String, String> lo1Var = this.d.get(i);
        ynVar.u.setText(lo1Var.a);
        ynVar.R(lo1Var.b);
        ynVar.x.setVisibility(this.i ? 8 : 0);
        ynVar.a.setOnClickListener(new a(ynVar));
        ynVar.w.setOnClickListener(new b(ynVar));
        ynVar.a.setSelected(ynVar.y == this.h);
    }
}

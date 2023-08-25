package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.a21;
import com.daaw.h21;
import com.daaw.id;
import com.daaw.jd;
import com.daaw.oq1;
import com.google.android.material.datepicker.a;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes2.dex */
public class e extends RecyclerView.g<b> {
    public final com.google.android.material.datepicker.a<?> c;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int p;

        public a(int i) {
            this.p = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.c.Z1(e.this.c.R1().h(Month.b(this.p, e.this.c.T1().q)));
            e.this.c.a2(a.k.DAY);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.c0 {
        public final TextView t;

        public b(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    public e(com.google.android.material.datepicker.a<?> aVar) {
        this.c = aVar;
    }

    public int A(int i) {
        return this.c.R1().t().r + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: B */
    public void m(b bVar, int i) {
        int A = A(i);
        String string = bVar.t.getContext().getString(h21.mtrl_picker_navigate_to_year_description);
        bVar.t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(A)));
        bVar.t.setContentDescription(String.format(string, Integer.valueOf(A)));
        jd S1 = this.c.S1();
        Calendar i2 = oq1.i();
        id idVar = i2.get(1) == A ? S1.f : S1.d;
        for (Long l : this.c.U1().n()) {
            i2.setTimeInMillis(l.longValue());
            if (i2.get(1) == A) {
                idVar = S1.e;
            }
        }
        idVar.d(bVar.t);
        bVar.t.setOnClickListener(y(A));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: C */
    public b o(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a21.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int d() {
        return this.c.R1().u();
    }

    public final View.OnClickListener y(int i) {
        return new a(i);
    }

    public int z(int i) {
        return i - this.c.R1().t().r;
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.a21;
import com.daaw.m11;
import com.daaw.xs1;
import com.google.android.material.datepicker.a;
/* loaded from: classes2.dex */
public class d extends RecyclerView.g<b> {
    public final Context c;
    public final CalendarConstraints d;
    public final DateSelector<?> e;
    public final a.l f;
    public final int g;

    /* loaded from: classes2.dex */
    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView p;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.p = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.p.getAdapter2().n(i)) {
                d.this.f.a(this.p.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.c0 {
        public final TextView t;
        public final MaterialCalendarGridView u;

        public b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(m11.month_title);
            this.t = textView;
            xs1.s0(textView, true);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(m11.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public d(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, a.l lVar) {
        Month t = calendarConstraints.t();
        Month l = calendarConstraints.l();
        Month s = calendarConstraints.s();
        if (t.compareTo(s) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (s.compareTo(l) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int V1 = c.u * com.google.android.material.datepicker.a.V1(context);
        int V12 = com.google.android.material.datepicker.b.k2(context) ? com.google.android.material.datepicker.a.V1(context) : 0;
        this.c = context;
        this.g = V1 + V12;
        this.d = calendarConstraints;
        this.e = dateSelector;
        this.f = lVar;
        v(true);
    }

    public int A(Month month) {
        return this.d.t().u(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: B */
    public void m(b bVar, int i) {
        Month t = this.d.t().t(i);
        bVar.t.setText(t.q(bVar.a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.u.findViewById(m11.month_grid);
        if (materialCalendarGridView.getAdapter2() == null || !t.equals(materialCalendarGridView.getAdapter2().p)) {
            c cVar = new c(t, this.e, this.d);
            materialCalendarGridView.setNumColumns(t.s);
            materialCalendarGridView.setAdapter((ListAdapter) cVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: C */
    public b o(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(a21.mtrl_calendar_month_labeled, viewGroup, false);
        if (com.google.android.material.datepicker.b.k2(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.g));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int d() {
        return this.d.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long e(int i) {
        return this.d.t().t(i).s();
    }

    public Month y(int i) {
        return this.d.t().t(i);
    }

    public CharSequence z(int i) {
        return y(i).q(this.c);
    }
}

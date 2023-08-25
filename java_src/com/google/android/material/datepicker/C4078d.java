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
import com.google.android.material.datepicker.C4059a;
/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes2.dex */
public class C4078d extends RecyclerView.AbstractC0380g<C4080b> {

    /* renamed from: c */
    public final Context f37508c;

    /* renamed from: d */
    public final CalendarConstraints f37509d;

    /* renamed from: e */
    public final DateSelector<?> f37510e;

    /* renamed from: f */
    public final C4059a.InterfaceC4071l f37511f;

    /* renamed from: g */
    public final int f37512g;

    /* renamed from: com.google.android.material.datepicker.d$a */
    /* loaded from: classes2.dex */
    public class C4079a implements AdapterView.OnItemClickListener {

        /* renamed from: p */
        public final /* synthetic */ MaterialCalendarGridView f37513p;

        public C4079a(MaterialCalendarGridView materialCalendarGridView) {
            this.f37513p = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f37513p.getAdapter2().m508n(i)) {
                C4078d.this.f37511f.mo550a(this.f37513p.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.d$b */
    /* loaded from: classes2.dex */
    public static class C4080b extends RecyclerView.AbstractC0376c0 {

        /* renamed from: t */
        public final TextView f37515t;

        /* renamed from: u */
        public final MaterialCalendarGridView f37516u;

        public C4080b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(m11.month_title);
            this.f37515t = textView;
            xs1.m4700s0(textView, true);
            this.f37516u = (MaterialCalendarGridView) linearLayout.findViewById(m11.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public C4078d(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, C4059a.InterfaceC4071l interfaceC4071l) {
        Month m610t = calendarConstraints.m610t();
        Month m613l = calendarConstraints.m613l();
        Month m611s = calendarConstraints.m611s();
        if (m610t.compareTo(m611s) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (m611s.compareTo(m613l) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int m561V1 = C4077c.f37502u * C4059a.m561V1(context);
        int m561V12 = C4072b.m530k2(context) ? C4059a.m561V1(context) : 0;
        this.f37508c = context;
        this.f37512g = m561V1 + m561V12;
        this.f37509d = calendarConstraints;
        this.f37510e = dateSelector;
        this.f37511f = interfaceC4071l;
        m28704v(true);
    }

    /* renamed from: A */
    public int m507A(Month month) {
        return this.f37509d.m610t().m578u(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: B */
    public void mo496m(C4080b c4080b, int i) {
        Month m579t = this.f37509d.m610t().m579t(i);
        c4080b.f37515t.setText(m579t.m581q(c4080b.f1947a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c4080b.f37516u.findViewById(m11.month_grid);
        if (materialCalendarGridView.getAdapter2() == null || !m579t.equals(materialCalendarGridView.getAdapter2().f37503p)) {
            C4077c c4077c = new C4077c(m579t, this.f37510e, this.f37509d);
            materialCalendarGridView.setNumColumns(m579t.f37439s);
            materialCalendarGridView.setAdapter((ListAdapter) c4077c);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m509m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C4079a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: C */
    public C4080b mo495o(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(a21.mtrl_calendar_month_labeled, viewGroup, false);
        if (C4072b.m530k2(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.C0396p(-1, this.f37512g));
            return new C4080b(linearLayout, true);
        }
        return new C4080b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: d */
    public int mo497d() {
        return this.f37509d.m612q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: e */
    public long mo504e(int i) {
        return this.f37509d.m610t().m579t(i).m580s();
    }

    /* renamed from: y */
    public Month m502y(int i) {
        return this.f37509d.m610t().m579t(i);
    }

    /* renamed from: z */
    public CharSequence m501z(int i) {
        return m502y(i).m581q(this.f37508c);
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.daaw.id;
import com.daaw.jd;
import com.daaw.oq1;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class c extends BaseAdapter {
    public static final int u = oq1.k().getMaximum(4);
    public final Month p;
    public final DateSelector<?> q;
    public Collection<Long> r;
    public jd s;
    public final CalendarConstraints t;

    public c(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.p = month;
        this.q = dateSelector;
        this.t = calendarConstraints;
        this.r = dateSelector.n();
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.p.h();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.p.h() || i > i()) {
            return null;
        }
        return Long.valueOf(this.p.i(j(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.daaw.a21.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L72
            com.google.android.material.datepicker.Month r8 = r5.p
            int r2 = r8.t
            if (r7 < r2) goto L2d
            goto L72
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.p
            long r7 = r8.i(r7)
            com.google.android.material.datepicker.Month r3 = r5.p
            int r3 = r3.r
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.g()
            int r4 = r4.r
            if (r3 != r4) goto L64
            java.lang.String r7 = com.daaw.tp.a(r7)
            goto L68
        L64:
            java.lang.String r7 = com.daaw.tp.d(r7)
        L68:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7a
        L72:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7a:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L81
            return r0
        L81:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.c.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void e(Context context) {
        if (this.s == null) {
            this.s = new jd(context);
        }
    }

    public boolean f(int i) {
        return i % this.p.s == 0;
    }

    public boolean g(int i) {
        return (i + 1) % this.p.s == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.p.t + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.p.s;
    }

    public final boolean h(long j) {
        Iterator<Long> it = this.q.n().iterator();
        while (it.hasNext()) {
            if (oq1.a(j) == oq1.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public int i() {
        return (this.p.h() + this.p.t) - 1;
    }

    public int j(int i) {
        return (i - this.p.h()) + 1;
    }

    public final void k(TextView textView, long j) {
        id idVar;
        if (textView == null) {
            return;
        }
        if (this.t.i().k(j)) {
            textView.setEnabled(true);
            if (h(j)) {
                idVar = this.s.b;
            } else {
                int i = (oq1.i().getTimeInMillis() > j ? 1 : (oq1.i().getTimeInMillis() == j ? 0 : -1));
                jd jdVar = this.s;
                idVar = i == 0 ? jdVar.c : jdVar.a;
            }
        } else {
            textView.setEnabled(false);
            idVar = this.s.g;
        }
        idVar.d(textView);
    }

    public final void l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.c(j).equals(this.p)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(this.p.l(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.r) {
            l(materialCalendarGridView, l.longValue());
        }
        DateSelector<?> dateSelector = this.q;
        if (dateSelector != null) {
            for (Long l2 : dateSelector.n()) {
                l(materialCalendarGridView, l2.longValue());
            }
            this.r = this.q.n();
        }
    }

    public boolean n(int i) {
        return i >= b() && i <= i();
    }
}

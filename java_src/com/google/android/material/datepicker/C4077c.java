package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.daaw.C1683id;
import com.daaw.C1820jd;
import com.daaw.C3106tp;
import com.daaw.a21;
import com.daaw.oq1;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes2.dex */
public class C4077c extends BaseAdapter {

    /* renamed from: u */
    public static final int f37502u = oq1.m14076k().getMaximum(4);

    /* renamed from: p */
    public final Month f37503p;

    /* renamed from: q */
    public final DateSelector<?> f37504q;

    /* renamed from: r */
    public Collection<Long> f37505r;

    /* renamed from: s */
    public C1820jd f37506s;

    /* renamed from: t */
    public final CalendarConstraints f37507t;

    public C4077c(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f37503p = month;
        this.f37504q = dateSelector;
        this.f37507t = calendarConstraints;
        this.f37505r = dateSelector.m600n();
    }

    /* renamed from: a */
    public int m521a(int i) {
        return m520b() + (i - 1);
    }

    /* renamed from: b */
    public int m520b() {
        return this.f37503p.m584h();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f37503p.m584h() || i > m513i()) {
            return null;
        }
        return Long.valueOf(this.f37503p.m583i(m512j(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        Long item;
        m517e(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a21.mtrl_calendar_day, viewGroup, false);
        }
        int m520b = i - m520b();
        if (m520b >= 0) {
            Month month = this.f37503p;
            if (m520b < month.f37440t) {
                int i2 = m520b + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                long m583i = this.f37503p.m583i(i2);
                textView.setContentDescription(this.f37503p.f37438r == Month.m585g().f37438r ? C3106tp.m8894a(m583i) : C3106tp.m8891d(m583i));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    return textView;
                }
                m511k(textView, item.longValue());
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        item = getItem(i);
        if (item != null) {
        }
    }

    /* renamed from: e */
    public final void m517e(Context context) {
        if (this.f37506s == null) {
            this.f37506s = new C1820jd(context);
        }
    }

    /* renamed from: f */
    public boolean m516f(int i) {
        return i % this.f37503p.f37439s == 0;
    }

    /* renamed from: g */
    public boolean m515g(int i) {
        return (i + 1) % this.f37503p.f37439s == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f37503p.f37440t + m520b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f37503p.f37439s;
    }

    /* renamed from: h */
    public final boolean m514h(long j) {
        Iterator<Long> it = this.f37504q.m600n().iterator();
        while (it.hasNext()) {
            if (oq1.m14086a(j) == oq1.m14086a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public int m513i() {
        return (this.f37503p.m584h() + this.f37503p.f37440t) - 1;
    }

    /* renamed from: j */
    public int m512j(int i) {
        return (i - this.f37503p.m584h()) + 1;
    }

    /* renamed from: k */
    public final void m511k(TextView textView, long j) {
        C1683id c1683id;
        if (textView == null) {
            return;
        }
        if (this.f37507t.m614i().mo595k(j)) {
            textView.setEnabled(true);
            if (m514h(j)) {
                c1683id = this.f37506s.f14992b;
            } else {
                int i = (oq1.m14078i().getTimeInMillis() > j ? 1 : (oq1.m14078i().getTimeInMillis() == j ? 0 : -1));
                C1820jd c1820jd = this.f37506s;
                c1683id = i == 0 ? c1820jd.f14993c : c1820jd.f14991a;
            }
        } else {
            textView.setEnabled(false);
            c1683id = this.f37506s.f14997g;
        }
        c1683id.m19923d(textView);
    }

    /* renamed from: l */
    public final void m510l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m586c(j).equals(this.f37503p)) {
            m511k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().m521a(this.f37503p.m582l(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* renamed from: m */
    public void m509m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.f37505r) {
            m510l(materialCalendarGridView, l.longValue());
        }
        DateSelector<?> dateSelector = this.f37504q;
        if (dateSelector != null) {
            for (Long l2 : dateSelector.m600n()) {
                m510l(materialCalendarGridView, l2.longValue());
            }
            this.f37505r = this.f37504q.m600n();
        }
    }

    /* renamed from: n */
    public boolean m508n(int i) {
        return i >= m520b() && i <= m513i();
    }
}

package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C1683id;
import com.daaw.C1820jd;
import com.daaw.a21;
import com.daaw.h21;
import com.daaw.oq1;
import com.google.android.material.datepicker.C4059a;
import java.util.Calendar;
import java.util.Locale;
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes2.dex */
public class C4081e extends RecyclerView.AbstractC0380g<C4083b> {

    /* renamed from: c */
    public final C4059a<?> f37517c;

    /* renamed from: com.google.android.material.datepicker.e$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4082a implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ int f37518p;

        public View$OnClickListenerC4082a(int i) {
            this.f37518p = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4081e.this.f37517c.m557Z1(C4081e.this.f37517c.m565R1().m615h(Month.m587b(this.f37518p, C4081e.this.f37517c.m563T1().f37437q)));
            C4081e.this.f37517c.m556a2(C4059a.EnumC4070k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$b */
    /* loaded from: classes2.dex */
    public static class C4083b extends RecyclerView.AbstractC0376c0 {

        /* renamed from: t */
        public final TextView f37520t;

        public C4083b(TextView textView) {
            super(textView);
            this.f37520t = textView;
        }
    }

    public C4081e(C4059a<?> c4059a) {
        this.f37517c = c4059a;
    }

    /* renamed from: A */
    public int m500A(int i) {
        return this.f37517c.m565R1().m610t().f37438r + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: B */
    public void mo496m(C4083b c4083b, int i) {
        int m500A = m500A(i);
        String string = c4083b.f37520t.getContext().getString(h21.mtrl_picker_navigate_to_year_description);
        c4083b.f37520t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m500A)));
        c4083b.f37520t.setContentDescription(String.format(string, Integer.valueOf(m500A)));
        C1820jd m564S1 = this.f37517c.m564S1();
        Calendar m14078i = oq1.m14078i();
        C1683id c1683id = m14078i.get(1) == m500A ? m564S1.f14996f : m564S1.f14994d;
        for (Long l : this.f37517c.m562U1().m600n()) {
            m14078i.setTimeInMillis(l.longValue());
            if (m14078i.get(1) == m500A) {
                c1683id = m564S1.f14995e;
            }
        }
        c1683id.m19923d(c4083b.f37520t);
        c4083b.f37520t.setOnClickListener(m493y(m500A));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: C */
    public C4083b mo495o(ViewGroup viewGroup, int i) {
        return new C4083b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a21.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
    /* renamed from: d */
    public int mo497d() {
        return this.f37517c.m565R1().m609u();
    }

    /* renamed from: y */
    public final View.OnClickListener m493y(int i) {
        return new View$OnClickListenerC4082a(i);
    }

    /* renamed from: z */
    public int m492z(int i) {
        return i - this.f37517c.m565R1().m610t().f37438r;
    }
}

package com.daaw;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class pn0<S> extends qw0<S> {
    public int r0;
    public DateSelector<S> s0;
    public CalendarConstraints t0;

    /* loaded from: classes2.dex */
    public class a extends ju0<S> {
        public a() {
        }

        @Override // com.daaw.ju0
        public void a(S s) {
            Iterator<ju0<S>> it = pn0.this.q0.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    public static <T> pn0<T> I1(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        pn0<T> pn0Var = new pn0<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        pn0Var.w1(bundle);
        return pn0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public void K0(Bundle bundle) {
        super.K0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.r0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.s0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.t0);
    }

    @Override // androidx.fragment.app.Fragment
    public void o0(Bundle bundle) {
        super.o0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.r0 = bundle.getInt("THEME_RES_ID_KEY");
        this.s0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.t0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.s0.p(layoutInflater.cloneInContext(new ContextThemeWrapper(u(), this.r0)), viewGroup, bundle, this.t0, new a());
    }
}

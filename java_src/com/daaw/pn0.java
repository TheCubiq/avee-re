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

    /* renamed from: r0 */
    public int f23067r0;

    /* renamed from: s0 */
    public DateSelector<S> f23068s0;

    /* renamed from: t0 */
    public CalendarConstraints f23069t0;

    /* renamed from: com.daaw.pn0$a */
    /* loaded from: classes2.dex */
    public class C2565a extends ju0<S> {
        public C2565a() {
        }

        @Override // com.daaw.ju0
        /* renamed from: a */
        public void mo522a(S s) {
            Iterator<ju0<S>> it = pn0.this.f24537q0.iterator();
            while (it.hasNext()) {
                it.next().mo522a(s);
            }
        }
    }

    /* renamed from: I1 */
    public static <T> pn0<T> m13282I1(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        pn0<T> pn0Var = new pn0<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        pn0Var.m29400w1(bundle);
        return pn0Var;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: K0 */
    public void mo549K0(Bundle bundle) {
        super.mo549K0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f23067r0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f23068s0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f23069t0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: o0 */
    public void mo526o0(Bundle bundle) {
        super.mo526o0(bundle);
        if (bundle == null) {
            bundle = m29410s();
        }
        this.f23067r0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f23068s0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f23069t0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s0 */
    public View mo523s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f23068s0.m598p(layoutInflater.cloneInContext(new ContextThemeWrapper(m29406u(), this.f23067r0)), viewGroup, bundle, this.f23069t0, new C2565a());
    }
}

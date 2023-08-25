package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C0449j;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C1820jd;
import com.daaw.C3250up;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.a21;
import com.daaw.f11;
import com.daaw.h21;
import com.daaw.ju0;
import com.daaw.m11;
import com.daaw.oq1;
import com.daaw.ov0;
import com.daaw.qw0;
import com.daaw.xs1;
import com.daaw.y11;
import com.daaw.zd1;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes2.dex */
public final class C4059a<S> extends qw0<S> {

    /* renamed from: B0 */
    public static final Object f37443B0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: C0 */
    public static final Object f37444C0 = "NAVIGATION_PREV_TAG";

    /* renamed from: D0 */
    public static final Object f37445D0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: E0 */
    public static final Object f37446E0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: A0 */
    public View f37447A0;

    /* renamed from: r0 */
    public int f37448r0;

    /* renamed from: s0 */
    public DateSelector<S> f37449s0;

    /* renamed from: t0 */
    public CalendarConstraints f37450t0;

    /* renamed from: u0 */
    public Month f37451u0;

    /* renamed from: v0 */
    public EnumC4070k f37452v0;

    /* renamed from: w0 */
    public C1820jd f37453w0;

    /* renamed from: x0 */
    public RecyclerView f37454x0;

    /* renamed from: y0 */
    public RecyclerView f37455y0;

    /* renamed from: z0 */
    public View f37456z0;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC4060a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ int f37457p;

        public RunnableC4060a(int i) {
            this.f37457p = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4059a.this.f37455y0.m28792r1(this.f37457p);
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    /* loaded from: classes2.dex */
    public class C4061b extends C3388w {
        public C4061b() {
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            c3654y.m4331d0(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    /* loaded from: classes2.dex */
    public class C4062c extends zd1 {

        /* renamed from: I */
        public final /* synthetic */ int f37460I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4062c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f37460I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: M1 */
        public void mo554M1(RecyclerView.C0409z c0409z, int[] iArr) {
            if (this.f37460I == 0) {
                iArr[0] = C4059a.this.f37455y0.getWidth();
                iArr[1] = C4059a.this.f37455y0.getWidth();
                return;
            }
            iArr[0] = C4059a.this.f37455y0.getHeight();
            iArr[1] = C4059a.this.f37455y0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$d */
    /* loaded from: classes2.dex */
    public class C4063d implements InterfaceC4071l {
        public C4063d() {
        }

        @Override // com.google.android.material.datepicker.C4059a.InterfaceC4071l
        /* renamed from: a */
        public void mo550a(long j) {
            if (C4059a.this.f37450t0.m614i().mo595k(j)) {
                C4059a.this.f37449s0.m597r(j);
                Iterator<ju0<S>> it = C4059a.this.f24537q0.iterator();
                while (it.hasNext()) {
                    it.next().mo522a((S) C4059a.this.f37449s0.m599o());
                }
                C4059a.this.f37455y0.getAdapter().m28714i();
                if (C4059a.this.f37454x0 != null) {
                    C4059a.this.f37454x0.getAdapter().m28714i();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$e */
    /* loaded from: classes2.dex */
    public class C4064e extends RecyclerView.AbstractC0390n {

        /* renamed from: a */
        public final Calendar f37463a = oq1.m14076k();

        /* renamed from: b */
        public final Calendar f37464b = oq1.m14076k();

        public C4064e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0390n
        /* renamed from: g */
        public void mo553g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0409z c0409z) {
            if ((recyclerView.getAdapter() instanceof C4081e) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C4081e c4081e = (C4081e) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (ov0<Long, Long> ov0Var : C4059a.this.f37449s0.m603e()) {
                    Long l = ov0Var.f22030a;
                    if (l != null && ov0Var.f22031b != null) {
                        this.f37463a.setTimeInMillis(l.longValue());
                        this.f37464b.setTimeInMillis(ov0Var.f22031b.longValue());
                        int m492z = c4081e.m492z(this.f37463a.get(1));
                        int m492z2 = c4081e.m492z(this.f37464b.get(1));
                        View mo28671C = gridLayoutManager.mo28671C(m492z);
                        View mo28671C2 = gridLayoutManager.mo28671C(m492z2);
                        int m28983X2 = m492z / gridLayoutManager.m28983X2();
                        int m28983X22 = m492z2 / gridLayoutManager.m28983X2();
                        int i = m28983X2;
                        while (i <= m28983X22) {
                            View mo28671C3 = gridLayoutManager.mo28671C(gridLayoutManager.m28983X2() * i);
                            if (mo28671C3 != null) {
                                canvas.drawRect(i == m28983X2 ? mo28671C.getLeft() + (mo28671C.getWidth() / 2) : 0, mo28671C3.getTop() + C4059a.this.f37453w0.f14994d.m19924c(), i == m28983X22 ? mo28671C2.getLeft() + (mo28671C2.getWidth() / 2) : recyclerView.getWidth(), mo28671C3.getBottom() - C4059a.this.f37453w0.f14994d.m19925b(), C4059a.this.f37453w0.f14998h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$f */
    /* loaded from: classes2.dex */
    public class C4065f extends C3388w {
        public C4065f() {
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            C4059a c4059a;
            int i;
            super.mo161g(view, c3654y);
            if (C4059a.this.f37447A0.getVisibility() == 0) {
                c4059a = C4059a.this;
                i = h21.mtrl_picker_toggle_to_year_selection;
            } else {
                c4059a = C4059a.this;
                i = h21.mtrl_picker_toggle_to_day_selection;
            }
            c3654y.m4315l0(c4059a.m29463T(i));
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$g */
    /* loaded from: classes2.dex */
    public class C4066g extends RecyclerView.AbstractC0400t {

        /* renamed from: a */
        public final /* synthetic */ C4078d f37467a;

        /* renamed from: b */
        public final /* synthetic */ MaterialButton f37468b;

        public C4066g(C4078d c4078d, MaterialButton materialButton) {
            this.f37467a = c4078d;
            this.f37468b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0400t
        /* renamed from: a */
        public void mo552a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f37468b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0400t
        /* renamed from: b */
        public void mo551b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager m560W1 = C4059a.this.m560W1();
            int m28939Z1 = i < 0 ? m560W1.m28939Z1() : m560W1.m28936c2();
            C4059a.this.f37451u0 = this.f37467a.m502y(m28939Z1);
            this.f37468b.setText(this.f37467a.m501z(m28939Z1));
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$h */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4067h implements View.OnClickListener {
        public View$OnClickListenerC4067h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4059a.this.m555b2();
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$i */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4068i implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C4078d f37471p;

        public View$OnClickListenerC4068i(C4078d c4078d) {
            this.f37471p = c4078d;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m28939Z1 = C4059a.this.m560W1().m28939Z1() + 1;
            if (m28939Z1 < C4059a.this.f37455y0.getAdapter().mo497d()) {
                C4059a.this.m557Z1(this.f37471p.m502y(m28939Z1));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$j */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4069j implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C4078d f37473p;

        public View$OnClickListenerC4069j(C4078d c4078d) {
            this.f37473p = c4078d;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m28936c2 = C4059a.this.m560W1().m28936c2() - 1;
            if (m28936c2 >= 0) {
                C4059a.this.m557Z1(this.f37473p.m502y(m28936c2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$k */
    /* loaded from: classes2.dex */
    public enum EnumC4070k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.a$l */
    /* loaded from: classes2.dex */
    public interface InterfaceC4071l {
        /* renamed from: a */
        void mo550a(long j);
    }

    /* renamed from: V1 */
    public static int m561V1(Context context) {
        return context.getResources().getDimensionPixelSize(f11.mtrl_calendar_day_height);
    }

    /* renamed from: X1 */
    public static <T> C4059a<T> m559X1(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        C4059a<T> c4059a = new C4059a<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m611s());
        c4059a.m29400w1(bundle);
        return c4059a;
    }

    @Override // com.daaw.qw0
    /* renamed from: G1 */
    public boolean mo575G1(ju0<S> ju0Var) {
        return super.mo575G1(ju0Var);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: K0 */
    public void mo549K0(Bundle bundle) {
        super.mo549K0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f37448r0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f37449s0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f37450t0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f37451u0);
    }

    /* renamed from: P1 */
    public final void m567P1(View view, C4078d c4078d) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(m11.month_navigation_fragment_toggle);
        materialButton.setTag(f37446E0);
        xs1.m4702r0(materialButton, new C4065f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(m11.month_navigation_previous);
        materialButton2.setTag(f37444C0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(m11.month_navigation_next);
        materialButton3.setTag(f37445D0);
        this.f37456z0 = view.findViewById(m11.mtrl_calendar_year_selector_frame);
        this.f37447A0 = view.findViewById(m11.mtrl_calendar_day_selector_frame);
        m556a2(EnumC4070k.DAY);
        materialButton.setText(this.f37451u0.m581q(view.getContext()));
        this.f37455y0.m28815k(new C4066g(c4078d, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC4067h());
        materialButton3.setOnClickListener(new View$OnClickListenerC4068i(c4078d));
        materialButton2.setOnClickListener(new View$OnClickListenerC4069j(c4078d));
    }

    /* renamed from: Q1 */
    public final RecyclerView.AbstractC0390n m566Q1() {
        return new C4064e();
    }

    /* renamed from: R1 */
    public CalendarConstraints m565R1() {
        return this.f37450t0;
    }

    /* renamed from: S1 */
    public C1820jd m564S1() {
        return this.f37453w0;
    }

    /* renamed from: T1 */
    public Month m563T1() {
        return this.f37451u0;
    }

    /* renamed from: U1 */
    public DateSelector<S> m562U1() {
        return this.f37449s0;
    }

    /* renamed from: W1 */
    public LinearLayoutManager m560W1() {
        return (LinearLayoutManager) this.f37455y0.getLayoutManager();
    }

    /* renamed from: Y1 */
    public final void m558Y1(int i) {
        this.f37455y0.post(new RunnableC4060a(i));
    }

    /* renamed from: Z1 */
    public void m557Z1(Month month) {
        RecyclerView recyclerView;
        int i;
        C4078d c4078d = (C4078d) this.f37455y0.getAdapter();
        int m507A = c4078d.m507A(month);
        int m507A2 = m507A - c4078d.m507A(this.f37451u0);
        boolean z = Math.abs(m507A2) > 3;
        boolean z2 = m507A2 > 0;
        this.f37451u0 = month;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.f37455y0;
                i = m507A + 3;
            }
            m558Y1(m507A);
        }
        recyclerView = this.f37455y0;
        i = m507A - 3;
        recyclerView.m28816j1(i);
        m558Y1(m507A);
    }

    /* renamed from: a2 */
    public void m556a2(EnumC4070k enumC4070k) {
        this.f37452v0 = enumC4070k;
        if (enumC4070k == EnumC4070k.YEAR) {
            this.f37454x0.getLayoutManager().mo28397x1(((C4081e) this.f37454x0.getAdapter()).m492z(this.f37451u0.f37438r));
            this.f37456z0.setVisibility(0);
            this.f37447A0.setVisibility(8);
        } else if (enumC4070k == EnumC4070k.DAY) {
            this.f37456z0.setVisibility(8);
            this.f37447A0.setVisibility(0);
            m557Z1(this.f37451u0);
        }
    }

    /* renamed from: b2 */
    public void m555b2() {
        EnumC4070k enumC4070k = this.f37452v0;
        EnumC4070k enumC4070k2 = EnumC4070k.YEAR;
        if (enumC4070k == enumC4070k2) {
            m556a2(EnumC4070k.DAY);
        } else if (enumC4070k == EnumC4070k.DAY) {
            m556a2(enumC4070k2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: o0 */
    public void mo526o0(Bundle bundle) {
        super.mo526o0(bundle);
        if (bundle == null) {
            bundle = m29410s();
        }
        this.f37448r0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f37449s0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f37450t0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f37451u0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s0 */
    public View mo523s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m29406u(), this.f37448r0);
        this.f37453w0 = new C1820jd(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month m610t = this.f37450t0.m610t();
        if (C4072b.m530k2(contextThemeWrapper)) {
            i = a21.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = a21.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(m11.mtrl_calendar_days_of_week);
        xs1.m4702r0(gridView, new C4061b());
        gridView.setAdapter((ListAdapter) new C3250up());
        gridView.setNumColumns(m610t.f37439s);
        gridView.setEnabled(false);
        this.f37455y0 = (RecyclerView) inflate.findViewById(m11.mtrl_calendar_months);
        this.f37455y0.setLayoutManager(new C4062c(m29406u(), i2, false, i2));
        this.f37455y0.setTag(f37443B0);
        C4078d c4078d = new C4078d(contextThemeWrapper, this.f37449s0, this.f37450t0, new C4063d());
        this.f37455y0.setAdapter(c4078d);
        int integer = contextThemeWrapper.getResources().getInteger(y11.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(m11.mtrl_calendar_year_selector_frame);
        this.f37454x0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f37454x0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f37454x0.setAdapter(new C4081e(this));
            this.f37454x0.m28824h(m566Q1());
        }
        if (inflate.findViewById(m11.month_navigation_fragment_toggle) != null) {
            m567P1(inflate, c4078d);
        }
        if (!C4072b.m530k2(contextThemeWrapper)) {
            new C0449j().m28138b(this.f37455y0);
        }
        this.f37455y0.m28816j1(c4078d.m507A(this.f37451u0));
        return inflate;
    }
}

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.a21;
import com.daaw.f11;
import com.daaw.h21;
import com.daaw.jd;
import com.daaw.ju0;
import com.daaw.m11;
import com.daaw.oq1;
import com.daaw.ov0;
import com.daaw.qw0;
import com.daaw.up;
import com.daaw.w;
import com.daaw.xs1;
import com.daaw.y;
import com.daaw.y11;
import com.daaw.zd1;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class a<S> extends qw0<S> {
    public static final Object B0 = "MONTHS_VIEW_GROUP_TAG";
    public static final Object C0 = "NAVIGATION_PREV_TAG";
    public static final Object D0 = "NAVIGATION_NEXT_TAG";
    public static final Object E0 = "SELECTOR_TOGGLE_TAG";
    public View A0;
    public int r0;
    public DateSelector<S> s0;
    public CalendarConstraints t0;
    public Month u0;
    public k v0;
    public jd w0;
    public RecyclerView x0;
    public RecyclerView y0;
    public View z0;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0099a implements Runnable {
        public final /* synthetic */ int p;

        public RunnableC0099a(int i) {
            this.p = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.y0.r1(this.p);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends w {
        public b() {
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.d0(null);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends zd1 {
        public final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void M1(RecyclerView.z zVar, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = a.this.y0.getWidth();
                iArr[1] = a.this.y0.getWidth();
                return;
            }
            iArr[0] = a.this.y0.getHeight();
            iArr[1] = a.this.y0.getHeight();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements l {
        public d() {
        }

        @Override // com.google.android.material.datepicker.a.l
        public void a(long j) {
            if (a.this.t0.i().k(j)) {
                a.this.s0.r(j);
                Iterator<ju0<S>> it = a.this.q0.iterator();
                while (it.hasNext()) {
                    it.next().a((S) a.this.s0.o());
                }
                a.this.y0.getAdapter().i();
                if (a.this.x0 != null) {
                    a.this.x0.getAdapter().i();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e extends RecyclerView.n {
        public final Calendar a = oq1.k();
        public final Calendar b = oq1.k();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof com.google.android.material.datepicker.e) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                com.google.android.material.datepicker.e eVar = (com.google.android.material.datepicker.e) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (ov0<Long, Long> ov0Var : a.this.s0.e()) {
                    Long l = ov0Var.a;
                    if (l != null && ov0Var.b != null) {
                        this.a.setTimeInMillis(l.longValue());
                        this.b.setTimeInMillis(ov0Var.b.longValue());
                        int z = eVar.z(this.a.get(1));
                        int z2 = eVar.z(this.b.get(1));
                        View C = gridLayoutManager.C(z);
                        View C2 = gridLayoutManager.C(z2);
                        int X2 = z / gridLayoutManager.X2();
                        int X22 = z2 / gridLayoutManager.X2();
                        int i = X2;
                        while (i <= X22) {
                            View C3 = gridLayoutManager.C(gridLayoutManager.X2() * i);
                            if (C3 != null) {
                                canvas.drawRect(i == X2 ? C.getLeft() + (C.getWidth() / 2) : 0, C3.getTop() + a.this.w0.d.c(), i == X22 ? C2.getLeft() + (C2.getWidth() / 2) : recyclerView.getWidth(), C3.getBottom() - a.this.w0.d.b(), a.this.w0.h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f extends w {
        public f() {
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            a aVar;
            int i;
            super.g(view, yVar);
            if (a.this.A0.getVisibility() == 0) {
                aVar = a.this;
                i = h21.mtrl_picker_toggle_to_year_selection;
            } else {
                aVar = a.this;
                i = h21.mtrl_picker_toggle_to_day_selection;
            }
            yVar.l0(aVar.T(i));
        }
    }

    /* loaded from: classes2.dex */
    public class g extends RecyclerView.t {
        public final /* synthetic */ com.google.android.material.datepicker.d a;
        public final /* synthetic */ MaterialButton b;

        public g(com.google.android.material.datepicker.d dVar, MaterialButton materialButton) {
            this.a = dVar;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager W1 = a.this.W1();
            int Z1 = i < 0 ? W1.Z1() : W1.c2();
            a.this.u0 = this.a.y(Z1);
            this.b.setText(this.a.z(Z1));
        }
    }

    /* loaded from: classes2.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.b2();
        }
    }

    /* loaded from: classes2.dex */
    public class i implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.d p;

        public i(com.google.android.material.datepicker.d dVar) {
            this.p = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int Z1 = a.this.W1().Z1() + 1;
            if (Z1 < a.this.y0.getAdapter().d()) {
                a.this.Z1(this.p.y(Z1));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.d p;

        public j(com.google.android.material.datepicker.d dVar) {
            this.p = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int c2 = a.this.W1().c2() - 1;
            if (c2 >= 0) {
                a.this.Z1(this.p.y(c2));
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* loaded from: classes2.dex */
    public interface l {
        void a(long j);
    }

    public static int V1(Context context) {
        return context.getResources().getDimensionPixelSize(f11.mtrl_calendar_day_height);
    }

    public static <T> a<T> X1(DateSelector<T> dateSelector, int i2, CalendarConstraints calendarConstraints) {
        a<T> aVar = new a<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.s());
        aVar.w1(bundle);
        return aVar;
    }

    @Override // com.daaw.qw0
    public boolean G1(ju0<S> ju0Var) {
        return super.G1(ju0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void K0(Bundle bundle) {
        super.K0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.r0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.s0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.t0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.u0);
    }

    public final void P1(View view, com.google.android.material.datepicker.d dVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(m11.month_navigation_fragment_toggle);
        materialButton.setTag(E0);
        xs1.r0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(m11.month_navigation_previous);
        materialButton2.setTag(C0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(m11.month_navigation_next);
        materialButton3.setTag(D0);
        this.z0 = view.findViewById(m11.mtrl_calendar_year_selector_frame);
        this.A0 = view.findViewById(m11.mtrl_calendar_day_selector_frame);
        a2(k.DAY);
        materialButton.setText(this.u0.q(view.getContext()));
        this.y0.k(new g(dVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(dVar));
        materialButton2.setOnClickListener(new j(dVar));
    }

    public final RecyclerView.n Q1() {
        return new e();
    }

    public CalendarConstraints R1() {
        return this.t0;
    }

    public jd S1() {
        return this.w0;
    }

    public Month T1() {
        return this.u0;
    }

    public DateSelector<S> U1() {
        return this.s0;
    }

    public LinearLayoutManager W1() {
        return (LinearLayoutManager) this.y0.getLayoutManager();
    }

    public final void Y1(int i2) {
        this.y0.post(new RunnableC0099a(i2));
    }

    public void Z1(Month month) {
        RecyclerView recyclerView;
        int i2;
        com.google.android.material.datepicker.d dVar = (com.google.android.material.datepicker.d) this.y0.getAdapter();
        int A = dVar.A(month);
        int A2 = A - dVar.A(this.u0);
        boolean z = Math.abs(A2) > 3;
        boolean z2 = A2 > 0;
        this.u0 = month;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.y0;
                i2 = A + 3;
            }
            Y1(A);
        }
        recyclerView = this.y0;
        i2 = A - 3;
        recyclerView.j1(i2);
        Y1(A);
    }

    public void a2(k kVar) {
        this.v0 = kVar;
        if (kVar == k.YEAR) {
            this.x0.getLayoutManager().x1(((com.google.android.material.datepicker.e) this.x0.getAdapter()).z(this.u0.r));
            this.z0.setVisibility(0);
            this.A0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.z0.setVisibility(8);
            this.A0.setVisibility(0);
            Z1(this.u0);
        }
    }

    public void b2() {
        k kVar = this.v0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            a2(k.DAY);
        } else if (kVar == k.DAY) {
            a2(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void o0(Bundle bundle) {
        super.o0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.r0 = bundle.getInt("THEME_RES_ID_KEY");
        this.s0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.t0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.u0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(u(), this.r0);
        this.w0 = new jd(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month t = this.t0.t();
        if (com.google.android.material.datepicker.b.k2(contextThemeWrapper)) {
            i2 = a21.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = a21.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(m11.mtrl_calendar_days_of_week);
        xs1.r0(gridView, new b());
        gridView.setAdapter((ListAdapter) new up());
        gridView.setNumColumns(t.s);
        gridView.setEnabled(false);
        this.y0 = (RecyclerView) inflate.findViewById(m11.mtrl_calendar_months);
        this.y0.setLayoutManager(new c(u(), i3, false, i3));
        this.y0.setTag(B0);
        com.google.android.material.datepicker.d dVar = new com.google.android.material.datepicker.d(contextThemeWrapper, this.s0, this.t0, new d());
        this.y0.setAdapter(dVar);
        int integer = contextThemeWrapper.getResources().getInteger(y11.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(m11.mtrl_calendar_year_selector_frame);
        this.x0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.x0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.x0.setAdapter(new com.google.android.material.datepicker.e(this));
            this.x0.h(Q1());
        }
        if (inflate.findViewById(m11.month_navigation_fragment_toggle) != null) {
            P1(inflate, dVar);
        }
        if (!com.google.android.material.datepicker.b.k2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.y0);
        }
        this.y0.j1(dVar.A(this.u0));
        return inflate;
    }
}

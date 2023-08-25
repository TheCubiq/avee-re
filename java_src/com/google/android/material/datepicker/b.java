package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.j;
import com.daaw.a21;
import com.daaw.en0;
import com.daaw.f11;
import com.daaw.fg0;
import com.daaw.h21;
import com.daaw.j11;
import com.daaw.ju0;
import com.daaw.k21;
import com.daaw.kn0;
import com.daaw.m11;
import com.daaw.nn0;
import com.daaw.ot;
import com.daaw.pn0;
import com.daaw.qw0;
import com.daaw.r4;
import com.daaw.w01;
import com.daaw.xs1;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public final class b<S> extends ot {
    public static final Object X0 = "CONFIRM_BUTTON_TAG";
    public static final Object Y0 = "CANCEL_BUTTON_TAG";
    public static final Object Z0 = "TOGGLE_BUTTON_TAG";
    public final LinkedHashSet<kn0<? super S>> G0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> H0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> I0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> J0 = new LinkedHashSet<>();
    public int K0;
    public DateSelector<S> L0;
    public qw0<S> M0;
    public CalendarConstraints N0;
    public com.google.android.material.datepicker.a<S> O0;
    public int P0;
    public CharSequence Q0;
    public boolean R0;
    public int S0;
    public TextView T0;
    public CheckableImageButton U0;
    public nn0 V0;
    public Button W0;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = b.this.G0.iterator();
            while (it.hasNext()) {
                ((kn0) it.next()).a(b.this.h2());
            }
            b.this.J1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0100b implements View.OnClickListener {
        public View$OnClickListenerC0100b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = b.this.H0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            b.this.J1();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends ju0<S> {
        public c() {
        }

        @Override // com.daaw.ju0
        public void a(S s) {
            b.this.o2();
            b.this.W0.setEnabled(b.this.L0.m());
        }
    }

    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.W0.setEnabled(b.this.L0.m());
            b.this.U0.toggle();
            b bVar = b.this;
            bVar.p2(bVar.U0);
            b.this.n2();
        }
    }

    public static Drawable d2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, r4.b(context, j11.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], r4.b(context, j11.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    public static int e2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(f11.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(f11.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(f11.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(f11.mtrl_calendar_days_of_week_height);
        int i = com.google.android.material.datepicker.c.u;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(f11.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(f11.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(f11.mtrl_calendar_bottom_padding);
    }

    public static int g2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(f11.mtrl_calendar_content_padding);
        int i = Month.g().s;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(f11.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(f11.mtrl_calendar_month_horizontal_padding));
    }

    public static boolean k2(Context context) {
        return m2(context, 16843277);
    }

    public static boolean l2(Context context) {
        return m2(context, w01.nestedScrollable);
    }

    public static boolean m2(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(en0.c(context, w01.materialCalendarStyle, com.google.android.material.datepicker.a.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // com.daaw.ot, androidx.fragment.app.Fragment
    public final void K0(Bundle bundle) {
        super.K0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.K0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.L0);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.N0);
        if (this.O0.T1() != null) {
            bVar.b(this.O0.T1().u);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.P0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.Q0);
    }

    @Override // com.daaw.ot, androidx.fragment.app.Fragment
    public void L0() {
        super.L0();
        Window window = R1().getWindow();
        if (this.R0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.V0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = N().getDimensionPixelOffset(f11.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.V0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new fg0(R1(), rect));
        }
        n2();
    }

    @Override // com.daaw.ot, androidx.fragment.app.Fragment
    public void M0() {
        this.M0.H1();
        super.M0();
    }

    @Override // com.daaw.ot
    public final Dialog N1(Bundle bundle) {
        Dialog dialog = new Dialog(o1(), i2(o1()));
        Context context = dialog.getContext();
        this.R0 = k2(context);
        int c2 = en0.c(context, w01.colorSurface, b.class.getCanonicalName());
        nn0 nn0Var = new nn0(context, null, w01.materialCalendarStyle, k21.Widget_MaterialComponents_MaterialCalendar);
        this.V0 = nn0Var;
        nn0Var.M(context);
        this.V0.W(ColorStateList.valueOf(c2));
        this.V0.V(xs1.y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String f2() {
        return this.L0.d(u());
    }

    public final S h2() {
        return this.L0.o();
    }

    public final int i2(Context context) {
        int i = this.K0;
        return i != 0 ? i : this.L0.j(context);
    }

    public final void j2(Context context) {
        this.U0.setTag(Z0);
        this.U0.setImageDrawable(d2(context));
        this.U0.setChecked(this.S0 != 0);
        xs1.r0(this.U0, null);
        p2(this.U0);
        this.U0.setOnClickListener(new d());
    }

    public final void n2() {
        int i2 = i2(o1());
        this.O0 = com.google.android.material.datepicker.a.X1(this.L0, i2, this.N0);
        this.M0 = this.U0.isChecked() ? pn0.I1(this.L0, i2, this.N0) : this.O0;
        o2();
        j l = t().l();
        l.m(m11.mtrl_calendar_frame, this.M0);
        l.h();
        this.M0.G1(new c());
    }

    @Override // com.daaw.ot, androidx.fragment.app.Fragment
    public final void o0(Bundle bundle) {
        super.o0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.K0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.L0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.N0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.P0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.Q0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.S0 = bundle.getInt("INPUT_MODE_KEY");
    }

    public final void o2() {
        String f2 = f2();
        this.T0.setContentDescription(String.format(T(h21.mtrl_picker_announce_current_selection), f2));
        this.T0.setText(f2);
    }

    @Override // com.daaw.ot, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.I0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // com.daaw.ot, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.J0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) V();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void p2(CheckableImageButton checkableImageButton) {
        this.U0.setContentDescription(checkableImageButton.getContext().getString(this.U0.isChecked() ? h21.mtrl_picker_toggle_to_calendar_input_mode : h21.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.Fragment
    public final View s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.R0 ? a21.mtrl_picker_fullscreen : a21.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.R0) {
            inflate.findViewById(m11.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(g2(context), -2));
        } else {
            View findViewById = inflate.findViewById(m11.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(m11.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(g2(context), -1));
            findViewById2.setMinimumHeight(e2(o1()));
        }
        TextView textView = (TextView) inflate.findViewById(m11.mtrl_picker_header_selection_text);
        this.T0 = textView;
        xs1.t0(textView, 1);
        this.U0 = (CheckableImageButton) inflate.findViewById(m11.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(m11.mtrl_picker_title_text);
        CharSequence charSequence = this.Q0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.P0);
        }
        j2(context);
        this.W0 = (Button) inflate.findViewById(m11.confirm_button);
        if (this.L0.m()) {
            this.W0.setEnabled(true);
        } else {
            this.W0.setEnabled(false);
        }
        this.W0.setTag(X0);
        this.W0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(m11.cancel_button);
        button.setTag(Y0);
        button.setOnClickListener(new View$OnClickListenerC0100b());
        return inflate;
    }
}

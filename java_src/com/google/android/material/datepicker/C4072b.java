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
import androidx.fragment.app.AbstractC0314j;
import com.daaw.C2818r4;
import com.daaw.DialogInterface$OnCancelListenerC2470ot;
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
import com.daaw.pn0;
import com.daaw.qw0;
import com.daaw.w01;
import com.daaw.xs1;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes2.dex */
public final class C4072b<S> extends DialogInterface$OnCancelListenerC2470ot {

    /* renamed from: X0 */
    public static final Object f37478X0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: Y0 */
    public static final Object f37479Y0 = "CANCEL_BUTTON_TAG";

    /* renamed from: Z0 */
    public static final Object f37480Z0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: G0 */
    public final LinkedHashSet<kn0<? super S>> f37481G0 = new LinkedHashSet<>();

    /* renamed from: H0 */
    public final LinkedHashSet<View.OnClickListener> f37482H0 = new LinkedHashSet<>();

    /* renamed from: I0 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f37483I0 = new LinkedHashSet<>();

    /* renamed from: J0 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f37484J0 = new LinkedHashSet<>();

    /* renamed from: K0 */
    public int f37485K0;

    /* renamed from: L0 */
    public DateSelector<S> f37486L0;

    /* renamed from: M0 */
    public qw0<S> f37487M0;

    /* renamed from: N0 */
    public CalendarConstraints f37488N0;

    /* renamed from: O0 */
    public C4059a<S> f37489O0;

    /* renamed from: P0 */
    public int f37490P0;

    /* renamed from: Q0 */
    public CharSequence f37491Q0;

    /* renamed from: R0 */
    public boolean f37492R0;

    /* renamed from: S0 */
    public int f37493S0;

    /* renamed from: T0 */
    public TextView f37494T0;

    /* renamed from: U0 */
    public CheckableImageButton f37495U0;

    /* renamed from: V0 */
    public nn0 f37496V0;

    /* renamed from: W0 */
    public Button f37497W0;

    /* renamed from: com.google.android.material.datepicker.b$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4073a implements View.OnClickListener {
        public View$OnClickListenerC4073a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C4072b.this.f37481G0.iterator();
            while (it.hasNext()) {
                ((kn0) it.next()).m17647a(C4072b.this.m533h2());
            }
            C4072b.this.m14000J1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$b */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4074b implements View.OnClickListener {
        public View$OnClickListenerC4074b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C4072b.this.f37482H0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C4072b.this.m14000J1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$c */
    /* loaded from: classes2.dex */
    public class C4075c extends ju0<S> {
        public C4075c() {
        }

        @Override // com.daaw.ju0
        /* renamed from: a */
        public void mo522a(S s) {
            C4072b.this.m525o2();
            C4072b.this.f37497W0.setEnabled(C4072b.this.f37486L0.m601m());
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$d */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4076d implements View.OnClickListener {
        public View$OnClickListenerC4076d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4072b.this.f37497W0.setEnabled(C4072b.this.f37486L0.m601m());
            C4072b.this.f37495U0.toggle();
            C4072b c4072b = C4072b.this;
            c4072b.m524p2(c4072b.f37495U0);
            C4072b.this.m527n2();
        }
    }

    /* renamed from: d2 */
    public static Drawable m537d2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C2818r4.m11783b(context, j11.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C2818r4.m11783b(context, j11.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: e2 */
    public static int m536e2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(f11.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(f11.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(f11.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(f11.mtrl_calendar_days_of_week_height);
        int i = C4077c.f37502u;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(f11.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(f11.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(f11.mtrl_calendar_bottom_padding);
    }

    /* renamed from: g2 */
    public static int m534g2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(f11.mtrl_calendar_content_padding);
        int i = Month.m585g().f37439s;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(f11.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(f11.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: k2 */
    public static boolean m530k2(Context context) {
        return m528m2(context, 16843277);
    }

    /* renamed from: l2 */
    public static boolean m529l2(Context context) {
        return m528m2(context, w01.nestedScrollable);
    }

    /* renamed from: m2 */
    public static boolean m528m2(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(en0.m23356c(context, w01.materialCalendarStyle, C4059a.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot, androidx.fragment.app.Fragment
    /* renamed from: K0 */
    public final void mo549K0(Bundle bundle) {
        super.mo549K0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f37485K0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f37486L0);
        CalendarConstraints.C4055b c4055b = new CalendarConstraints.C4055b(this.f37488N0);
        if (this.f37489O0.m563T1() != null) {
            c4055b.m605b(this.f37489O0.m563T1().f37441u);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4055b.m606a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f37490P0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f37491Q0);
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot, androidx.fragment.app.Fragment
    /* renamed from: L0 */
    public void mo548L0() {
        super.mo548L0();
        Window window = m13992R1().getWindow();
        if (this.f37492R0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f37496V0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m29473N().getDimensionPixelOffset(f11.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f37496V0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new fg0(m13992R1(), rect));
        }
        m527n2();
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot, androidx.fragment.app.Fragment
    /* renamed from: M0 */
    public void mo547M0() {
        this.f37487M0.m12019H1();
        super.mo547M0();
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot
    /* renamed from: N1 */
    public final Dialog mo546N1(Bundle bundle) {
        Dialog dialog = new Dialog(m29420o1(), m532i2(m29420o1()));
        Context context = dialog.getContext();
        this.f37492R0 = m530k2(context);
        int m23356c = en0.m23356c(context, w01.colorSurface, C4072b.class.getCanonicalName());
        nn0 nn0Var = new nn0(context, null, w01.materialCalendarStyle, k21.Widget_MaterialComponents_MaterialCalendar);
        this.f37496V0 = nn0Var;
        nn0Var.m15007M(context);
        this.f37496V0.m14997W(ColorStateList.valueOf(m23356c));
        this.f37496V0.m14998V(xs1.m4689y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    /* renamed from: f2 */
    public String m535f2() {
        return this.f37486L0.m604d(m29406u());
    }

    /* renamed from: h2 */
    public final S m533h2() {
        return this.f37486L0.m599o();
    }

    /* renamed from: i2 */
    public final int m532i2(Context context) {
        int i = this.f37485K0;
        return i != 0 ? i : this.f37486L0.m602j(context);
    }

    /* renamed from: j2 */
    public final void m531j2(Context context) {
        this.f37495U0.setTag(f37480Z0);
        this.f37495U0.setImageDrawable(m537d2(context));
        this.f37495U0.setChecked(this.f37493S0 != 0);
        xs1.m4702r0(this.f37495U0, null);
        m524p2(this.f37495U0);
        this.f37495U0.setOnClickListener(new View$OnClickListenerC4076d());
    }

    /* renamed from: n2 */
    public final void m527n2() {
        int m532i2 = m532i2(m29420o1());
        this.f37489O0 = C4059a.m559X1(this.f37486L0, m532i2, this.f37488N0);
        this.f37487M0 = this.f37495U0.isChecked() ? pn0.m13282I1(this.f37486L0, m532i2, this.f37488N0) : this.f37489O0;
        m525o2();
        AbstractC0314j m29305l = m29408t().m29305l();
        m29305l.m29140m(m11.mtrl_calendar_frame, this.f37487M0);
        m29305l.mo29145h();
        this.f37487M0.mo575G1(new C4075c());
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot, androidx.fragment.app.Fragment
    /* renamed from: o0 */
    public final void mo526o0(Bundle bundle) {
        super.mo526o0(bundle);
        if (bundle == null) {
            bundle = m29410s();
        }
        this.f37485K0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f37486L0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f37488N0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f37490P0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f37491Q0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f37493S0 = bundle.getInt("INPUT_MODE_KEY");
    }

    /* renamed from: o2 */
    public final void m525o2() {
        String m535f2 = m535f2();
        this.f37494T0.setContentDescription(String.format(m29463T(h21.mtrl_picker_announce_current_selection), m535f2));
        this.f37494T0.setText(m535f2);
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f37483I0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f37484J0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) m29459V();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: p2 */
    public final void m524p2(CheckableImageButton checkableImageButton) {
        this.f37495U0.setContentDescription(checkableImageButton.getContext().getString(this.f37495U0.isChecked() ? h21.mtrl_picker_toggle_to_calendar_input_mode : h21.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s0 */
    public final View mo523s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f37492R0 ? a21.mtrl_picker_fullscreen : a21.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f37492R0) {
            inflate.findViewById(m11.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m534g2(context), -2));
        } else {
            View findViewById = inflate.findViewById(m11.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(m11.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m534g2(context), -1));
            findViewById2.setMinimumHeight(m536e2(m29420o1()));
        }
        TextView textView = (TextView) inflate.findViewById(m11.mtrl_picker_header_selection_text);
        this.f37494T0 = textView;
        xs1.m4698t0(textView, 1);
        this.f37495U0 = (CheckableImageButton) inflate.findViewById(m11.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(m11.mtrl_picker_title_text);
        CharSequence charSequence = this.f37491Q0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f37490P0);
        }
        m531j2(context);
        this.f37497W0 = (Button) inflate.findViewById(m11.confirm_button);
        if (this.f37486L0.m601m()) {
            this.f37497W0.setEnabled(true);
        } else {
            this.f37497W0.setEnabled(false);
        }
        this.f37497W0.setTag(f37478X0);
        this.f37497W0.setOnClickListener(new View$OnClickListenerC4073a());
        Button button = (Button) inflate.findViewById(m11.cancel_button);
        button.setTag(f37479Y0);
        button.setOnClickListener(new View$OnClickListenerC4074b());
        return inflate;
    }
}

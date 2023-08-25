package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.daaw.avee.R;
import com.shawnlin.numberpicker.NumberPicker;
import java.util.Calendar;
import java.util.Date;
/* loaded from: classes.dex */
public class xd1 extends DialogFragment {
    public NumberPicker p;
    public NumberPicker q;
    public ImageButton r;
    public TextView s;
    public int t = 0;
    public Date u = new Date();
    public int v;
    public Runnable w;
    public static tw1<Boolean, Integer, Date, Boolean> x = new tw1<>();
    public static vw1<ud1> y = new vw1<>();
    public static vw1<Integer> z = new vw1<>();
    public static vw1<lo1<Date, Boolean>> A = new vw1<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xd1.this.t = (int) ((xd1.this.u.getTime() - new Date().getTime()) / 1000);
            xd1.this.i();
            xd1.this.s.postDelayed(xd1.this.w, 1000L);
        }
    }

    /* loaded from: classes.dex */
    public class b implements NumberPicker.e {
        public b() {
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.e
        public void a(NumberPicker numberPicker, int i, int i2) {
            xd1.this.f(true, true);
        }
    }

    /* loaded from: classes.dex */
    public class c implements NumberPicker.e {
        public c() {
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.e
        public void a(NumberPicker numberPicker, int i, int i2) {
            xd1.this.f(true, true);
        }
    }

    /* loaded from: classes.dex */
    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            xd1.this.e(true);
        }
    }

    /* loaded from: classes.dex */
    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            xd1.this.e(false);
        }
    }

    public static xd1 g(al alVar) {
        xd1 xd1Var = new xd1();
        gr1.x(xd1Var, "SleepTimerDialog", alVar);
        return xd1Var;
    }

    public void e(boolean z2) {
        f(z2, false);
    }

    public void f(boolean z2, boolean z3) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, this.q.getValue());
        calendar2.set(12, this.p.getValue());
        calendar2.set(13, 0);
        if (calendar2.before(calendar)) {
            calendar2.add(11, 24);
        }
        this.u = new Date(calendar2.getTimeInMillis());
        if (z3) {
            return;
        }
        x.a(Boolean.valueOf(z2), Integer.valueOf(h()), this.u, Boolean.FALSE);
    }

    public int h() {
        return this.p.getValue() + (this.q.getValue() * 60);
    }

    public void i() {
        TextView textView = this.s;
        textView.setText(((Object) this.s.getResources().getText(R.string.dialog_timer_remaining)) + " " + br1.n(this.t, false));
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_sleep_timer, null);
        builder.setView(inflate);
        builder.setTitle(R.string.dialog_sleep_timer_title);
        this.p = (NumberPicker) inflate.findViewById(R.id.numberPickerM);
        this.q = (NumberPicker) inflate.findViewById(R.id.numberPickerH);
        this.r = null;
        TextView textView = (TextView) inflate.findViewById(R.id.txtStatus);
        this.s = textView;
        this.v = textView.getCurrentTextColor();
        this.u = A.a(new lo1<>(new Date(), Boolean.FALSE)).a;
        this.w = new a();
        if (y.a(null) == null) {
            new ud1();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.u);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        this.p.setMaxValue(59);
        this.p.setMinValue(0);
        this.p.setValue(i2);
        this.q.setMaxValue(23);
        this.q.setMinValue(0);
        this.q.setValue(i);
        this.q.setDividerColor(this.v);
        this.p.setDividerColor(this.v);
        this.q.setSelectedTextColor(this.v);
        this.p.setSelectedTextColor(this.v);
        this.q.setTextColor(this.v);
        this.p.setTextColor(this.v);
        this.p.setOnValueChangedListener(new b());
        this.q.setOnValueChangedListener(new c());
        builder.setPositiveButton(R.string.dialog_set_timer, new d());
        builder.setNegativeButton(R.string.dialog_cancel_timer, new e());
        this.s.postDelayed(this.w, 0L);
        return builder.create();
    }
}

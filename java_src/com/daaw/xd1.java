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

    /* renamed from: p */
    public NumberPicker f32580p;

    /* renamed from: q */
    public NumberPicker f32581q;

    /* renamed from: r */
    public ImageButton f32582r;

    /* renamed from: s */
    public TextView f32583s;

    /* renamed from: t */
    public int f32584t = 0;

    /* renamed from: u */
    public Date f32585u = new Date();

    /* renamed from: v */
    public int f32586v;

    /* renamed from: w */
    public Runnable f32587w;

    /* renamed from: x */
    public static tw1<Boolean, Integer, Date, Boolean> f32577x = new tw1<>();

    /* renamed from: y */
    public static vw1<ud1> f32578y = new vw1<>();

    /* renamed from: z */
    public static vw1<Integer> f32579z = new vw1<>();

    /* renamed from: A */
    public static vw1<lo1<Date, Boolean>> f32576A = new vw1<>();

    /* renamed from: com.daaw.xd1$a */
    /* loaded from: classes.dex */
    public class RunnableC3526a implements Runnable {
        public RunnableC3526a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xd1.this.f32584t = (int) ((xd1.this.f32585u.getTime() - new Date().getTime()) / 1000);
            xd1.this.m5215i();
            xd1.this.f32583s.postDelayed(xd1.this.f32587w, 1000L);
        }
    }

    /* renamed from: com.daaw.xd1$b */
    /* loaded from: classes.dex */
    public class C3527b implements NumberPicker.InterfaceC4183e {
        public C3527b() {
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.InterfaceC4183e
        /* renamed from: a */
        public void mo18a(NumberPicker numberPicker, int i, int i2) {
            xd1.this.m5218f(true, true);
        }
    }

    /* renamed from: com.daaw.xd1$c */
    /* loaded from: classes.dex */
    public class C3528c implements NumberPicker.InterfaceC4183e {
        public C3528c() {
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.InterfaceC4183e
        /* renamed from: a */
        public void mo18a(NumberPicker numberPicker, int i, int i2) {
            xd1.this.m5218f(true, true);
        }
    }

    /* renamed from: com.daaw.xd1$d */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC3529d implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC3529d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            xd1.this.m5219e(true);
        }
    }

    /* renamed from: com.daaw.xd1$e */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC3530e implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC3530e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            xd1.this.m5219e(false);
        }
    }

    /* renamed from: g */
    public static xd1 m5217g(C0645al c0645al) {
        xd1 xd1Var = new xd1();
        gr1.m21311x(xd1Var, "SleepTimerDialog", c0645al);
        return xd1Var;
    }

    /* renamed from: e */
    public void m5219e(boolean z) {
        m5218f(z, false);
    }

    /* renamed from: f */
    public void m5218f(boolean z, boolean z2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, this.f32581q.getValue());
        calendar2.set(12, this.f32580p.getValue());
        calendar2.set(13, 0);
        if (calendar2.before(calendar)) {
            calendar2.add(11, 24);
        }
        this.f32585u = new Date(calendar2.getTimeInMillis());
        if (z2) {
            return;
        }
        f32577x.m8756a(Boolean.valueOf(z), Integer.valueOf(m5216h()), this.f32585u, Boolean.FALSE);
    }

    /* renamed from: h */
    public int m5216h() {
        return this.f32580p.getValue() + (this.f32581q.getValue() * 60);
    }

    /* renamed from: i */
    public void m5215i() {
        TextView textView = this.f32583s;
        textView.setText(((Object) this.f32583s.getResources().getText(R.string.dialog_timer_remaining)) + " " + br1.m25895n(this.f32584t, false));
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_sleep_timer, null);
        builder.setView(inflate);
        builder.setTitle(R.string.dialog_sleep_timer_title);
        this.f32580p = (NumberPicker) inflate.findViewById(R.id.numberPickerM);
        this.f32581q = (NumberPicker) inflate.findViewById(R.id.numberPickerH);
        this.f32582r = null;
        TextView textView = (TextView) inflate.findViewById(R.id.txtStatus);
        this.f32583s = textView;
        this.f32586v = textView.getCurrentTextColor();
        this.f32585u = f32576A.m6692a(new lo1<>(new Date(), Boolean.FALSE)).f17576a;
        this.f32587w = new RunnableC3526a();
        if (f32578y.m6692a(null) == null) {
            new ud1();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.f32585u);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        this.f32580p.setMaxValue(59);
        this.f32580p.setMinValue(0);
        this.f32580p.setValue(i2);
        this.f32581q.setMaxValue(23);
        this.f32581q.setMinValue(0);
        this.f32581q.setValue(i);
        this.f32581q.setDividerColor(this.f32586v);
        this.f32580p.setDividerColor(this.f32586v);
        this.f32581q.setSelectedTextColor(this.f32586v);
        this.f32580p.setSelectedTextColor(this.f32586v);
        this.f32581q.setTextColor(this.f32586v);
        this.f32580p.setTextColor(this.f32586v);
        this.f32580p.setOnValueChangedListener(new C3527b());
        this.f32581q.setOnValueChangedListener(new C3528c());
        builder.setPositiveButton(R.string.dialog_set_timer, new DialogInterface$OnClickListenerC3529d());
        builder.setNegativeButton(R.string.dialog_cancel_timer, new DialogInterface$OnClickListenerC3530e());
        this.f32583s.postDelayed(this.f32587w, 0L);
        return builder.create();
    }
}

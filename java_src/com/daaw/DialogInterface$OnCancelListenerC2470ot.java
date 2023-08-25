package com.daaw;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractC0314j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
/* renamed from: com.daaw.ot */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC2470ot extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: B0 */
    public Dialog f21929B0;

    /* renamed from: C0 */
    public boolean f21930C0;

    /* renamed from: D0 */
    public boolean f21931D0;

    /* renamed from: E0 */
    public boolean f21932E0;

    /* renamed from: q0 */
    public Handler f21934q0;

    /* renamed from: z0 */
    public boolean f21943z0;

    /* renamed from: r0 */
    public Runnable f21935r0 = new RunnableC2471a();

    /* renamed from: s0 */
    public DialogInterface.OnCancelListener f21936s0 = new DialogInterface$OnCancelListenerC2472b();

    /* renamed from: t0 */
    public DialogInterface.OnDismissListener f21937t0 = new DialogInterface$OnDismissListenerC2473c();

    /* renamed from: u0 */
    public int f21938u0 = 0;

    /* renamed from: v0 */
    public int f21939v0 = 0;

    /* renamed from: w0 */
    public boolean f21940w0 = true;

    /* renamed from: x0 */
    public boolean f21941x0 = true;

    /* renamed from: y0 */
    public int f21942y0 = -1;

    /* renamed from: A0 */
    public qt0<sj0> f21928A0 = new C2474d();

    /* renamed from: F0 */
    public boolean f21933F0 = false;

    /* renamed from: com.daaw.ot$a */
    /* loaded from: classes.dex */
    public class RunnableC2471a implements Runnable {
        public RunnableC2471a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogInterface$OnCancelListenerC2470ot.this.f21937t0.onDismiss(DialogInterface$OnCancelListenerC2470ot.this.f21929B0);
        }
    }

    /* renamed from: com.daaw.ot$b */
    /* loaded from: classes.dex */
    public class DialogInterface$OnCancelListenerC2472b implements DialogInterface.OnCancelListener {
        public DialogInterface$OnCancelListenerC2472b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC2470ot.this.f21929B0 != null) {
                DialogInterface$OnCancelListenerC2470ot dialogInterface$OnCancelListenerC2470ot = DialogInterface$OnCancelListenerC2470ot.this;
                dialogInterface$OnCancelListenerC2470ot.onCancel(dialogInterface$OnCancelListenerC2470ot.f21929B0);
            }
        }
    }

    /* renamed from: com.daaw.ot$c */
    /* loaded from: classes.dex */
    public class DialogInterface$OnDismissListenerC2473c implements DialogInterface.OnDismissListener {
        public DialogInterface$OnDismissListenerC2473c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC2470ot.this.f21929B0 != null) {
                DialogInterface$OnCancelListenerC2470ot dialogInterface$OnCancelListenerC2470ot = DialogInterface$OnCancelListenerC2470ot.this;
                dialogInterface$OnCancelListenerC2470ot.onDismiss(dialogInterface$OnCancelListenerC2470ot.f21929B0);
            }
        }
    }

    /* renamed from: com.daaw.ot$d */
    /* loaded from: classes.dex */
    public class C2474d implements qt0<sj0> {
        public C2474d() {
        }

        @Override // com.daaw.qt0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo12225a(sj0 sj0Var) {
            if (sj0Var == null || !DialogInterface$OnCancelListenerC2470ot.this.f21941x0) {
                return;
            }
            View m29417p1 = DialogInterface$OnCancelListenerC2470ot.this.m29417p1();
            if (m29417p1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterface$OnCancelListenerC2470ot.this.f21929B0 != null) {
                if (FragmentManager.m29381E0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DialogFragment ");
                    sb.append(this);
                    sb.append(" setting the content view on ");
                    sb.append(DialogInterface$OnCancelListenerC2470ot.this.f21929B0);
                }
                DialogInterface$OnCancelListenerC2470ot.this.f21929B0.setContentView(m29417p1);
            }
        }
    }

    /* renamed from: com.daaw.ot$e */
    /* loaded from: classes.dex */
    public class C2475e extends r30 {

        /* renamed from: a */
        public final /* synthetic */ r30 f21948a;

        public C2475e(r30 r30Var) {
            this.f21948a = r30Var;
        }

        @Override // com.daaw.r30
        /* renamed from: f */
        public View mo11810f(int i) {
            return this.f21948a.mo11809h() ? this.f21948a.mo11810f(i) : DialogInterface$OnCancelListenerC2470ot.this.m13995O1(i);
        }

        @Override // com.daaw.r30
        /* renamed from: h */
        public boolean mo11809h() {
            return this.f21948a.mo11809h() || DialogInterface$OnCancelListenerC2470ot.this.m13994P1();
        }
    }

    /* renamed from: J1 */
    public void m14000J1() {
        m13999K1(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: K0 */
    public void mo549K0(Bundle bundle) {
        super.mo549K0(bundle);
        Dialog dialog = this.f21929B0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f21938u0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f21939v0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f21940w0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f21941x0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f21942y0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: K1 */
    public final void m13999K1(boolean z, boolean z2) {
        if (this.f21931D0) {
            return;
        }
        this.f21931D0 = true;
        this.f21932E0 = false;
        Dialog dialog = this.f21929B0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f21929B0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f21934q0.getLooper()) {
                    onDismiss(this.f21929B0);
                } else {
                    this.f21934q0.post(this.f21935r0);
                }
            }
        }
        this.f21930C0 = true;
        if (this.f21942y0 >= 0) {
            m29481H().m29351T0(this.f21942y0, 1);
            this.f21942y0 = -1;
            return;
        }
        AbstractC0314j m29305l = m29481H().m29305l();
        m29305l.mo29141l(this);
        if (z) {
            m29305l.mo29146g();
        } else {
            m29305l.mo29147f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L0 */
    public void mo548L0() {
        super.mo548L0();
        Dialog dialog = this.f21929B0;
        if (dialog != null) {
            this.f21930C0 = false;
            dialog.show();
            View decorView = this.f21929B0.getWindow().getDecorView();
            bu1.m25826a(decorView, this);
            eu1.m23179a(decorView, this);
            du1.m23947a(decorView, this);
        }
    }

    /* renamed from: L1 */
    public Dialog m13998L1() {
        return this.f21929B0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: M0 */
    public void mo547M0() {
        super.mo547M0();
        Dialog dialog = this.f21929B0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: M1 */
    public int m13997M1() {
        return this.f21939v0;
    }

    /* renamed from: N1 */
    public Dialog mo546N1(Bundle bundle) {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new Dialog(m29420o1(), m13997M1());
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: O0 */
    public void mo13996O0(Bundle bundle) {
        Bundle bundle2;
        super.mo13996O0(bundle);
        if (this.f21929B0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f21929B0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: O1 */
    public View m13995O1(int i) {
        Dialog dialog = this.f21929B0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* renamed from: P1 */
    public boolean m13994P1() {
        return this.f21933F0;
    }

    /* renamed from: Q1 */
    public final void m13993Q1(Bundle bundle) {
        if (this.f21941x0 && !this.f21933F0) {
            try {
                this.f21943z0 = true;
                Dialog mo546N1 = mo546N1(bundle);
                this.f21929B0 = mo546N1;
                if (this.f21941x0) {
                    m13990T1(mo546N1, this.f21938u0);
                    Context m29406u = m29406u();
                    if (m29406u instanceof Activity) {
                        this.f21929B0.setOwnerActivity((Activity) m29406u);
                    }
                    this.f21929B0.setCancelable(this.f21940w0);
                    this.f21929B0.setOnCancelListener(this.f21936s0);
                    this.f21929B0.setOnDismissListener(this.f21937t0);
                    this.f21933F0 = true;
                } else {
                    this.f21929B0 = null;
                }
            } finally {
                this.f21943z0 = false;
            }
        }
    }

    /* renamed from: R1 */
    public final Dialog m13992R1() {
        Dialog m13998L1 = m13998L1();
        if (m13998L1 != null) {
            return m13998L1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: S1 */
    public void m13991S1(boolean z) {
        this.f21941x0 = z;
    }

    /* renamed from: T1 */
    public void m13990T1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: U1 */
    public void mo13989U1(FragmentManager fragmentManager, String str) {
        this.f21931D0 = false;
        this.f21932E0 = true;
        AbstractC0314j m29305l = fragmentManager.m29305l();
        m29305l.m29149d(this, str);
        m29305l.mo29147f();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V0 */
    public void mo13988V0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo13988V0(layoutInflater, viewGroup, bundle);
        if (this.f1376W != null || this.f21929B0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f21929B0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: j */
    public r30 mo13987j() {
        return new C2475e(super.mo13987j());
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: l0 */
    public void mo13986l0(Context context) {
        super.mo13986l0(context);
        m29458W().m29068e(this.f21928A0);
        if (this.f21932E0) {
            return;
        }
        this.f21931D0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: o0 */
    public void mo526o0(Bundle bundle) {
        super.mo526o0(bundle);
        this.f21934q0 = new Handler();
        this.f21941x0 = this.f1366M == 0;
        if (bundle != null) {
            this.f21938u0 = bundle.getInt("android:style", 0);
            this.f21939v0 = bundle.getInt("android:theme", 0);
            this.f21940w0 = bundle.getBoolean("android:cancelable", true);
            this.f21941x0 = bundle.getBoolean("android:showsDialog", this.f21941x0);
            this.f21942y0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f21930C0) {
            return;
        }
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDismiss called for DialogFragment ");
            sb.append(this);
        }
        m13999K1(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: v0 */
    public void mo13985v0() {
        super.mo13985v0();
        Dialog dialog = this.f21929B0;
        if (dialog != null) {
            this.f21930C0 = true;
            dialog.setOnDismissListener(null);
            this.f21929B0.dismiss();
            if (!this.f21931D0) {
                onDismiss(this.f21929B0);
            }
            this.f21929B0 = null;
            this.f21933F0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo13984w0() {
        super.mo13984w0();
        if (!this.f21932E0 && !this.f21931D0) {
            this.f21931D0 = true;
        }
        m29458W().mo15134i(this.f21928A0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: x0 */
    public LayoutInflater mo13983x0(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater mo13983x0 = super.mo13983x0(bundle);
        if (this.f21941x0 && !this.f21943z0) {
            m13993Q1(bundle);
            if (FragmentManager.m29381E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("get layout inflater for DialogFragment ");
                sb2.append(this);
                sb2.append(" from dialog context");
            }
            Dialog dialog = this.f21929B0;
            return dialog != null ? mo13983x0.cloneInContext(dialog.getContext()) : mo13983x0;
        }
        if (FragmentManager.m29381E0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f21941x0) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
        }
        return mo13983x0;
    }
}

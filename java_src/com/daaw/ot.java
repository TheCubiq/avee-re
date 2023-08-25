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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
/* loaded from: classes.dex */
public class ot extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Dialog B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public Handler q0;
    public boolean z0;
    public Runnable r0 = new a();
    public DialogInterface.OnCancelListener s0 = new b();
    public DialogInterface.OnDismissListener t0 = new c();
    public int u0 = 0;
    public int v0 = 0;
    public boolean w0 = true;
    public boolean x0 = true;
    public int y0 = -1;
    public qt0<sj0> A0 = new d();
    public boolean F0 = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            ot.this.t0.onDismiss(ot.this.B0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (ot.this.B0 != null) {
                ot otVar = ot.this;
                otVar.onCancel(otVar.B0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (ot.this.B0 != null) {
                ot otVar = ot.this;
                otVar.onDismiss(otVar.B0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements qt0<sj0> {
        public d() {
        }

        @Override // com.daaw.qt0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(sj0 sj0Var) {
            if (sj0Var == null || !ot.this.x0) {
                return;
            }
            View p1 = ot.this.p1();
            if (p1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (ot.this.B0 != null) {
                if (FragmentManager.E0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DialogFragment ");
                    sb.append(this);
                    sb.append(" setting the content view on ");
                    sb.append(ot.this.B0);
                }
                ot.this.B0.setContentView(p1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends r30 {
        public final /* synthetic */ r30 a;

        public e(r30 r30Var) {
            this.a = r30Var;
        }

        @Override // com.daaw.r30
        public View f(int i) {
            return this.a.h() ? this.a.f(i) : ot.this.O1(i);
        }

        @Override // com.daaw.r30
        public boolean h() {
            return this.a.h() || ot.this.P1();
        }
    }

    public void J1() {
        K1(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void K0(Bundle bundle) {
        super.K0(bundle);
        Dialog dialog = this.B0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.u0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.v0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.w0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.x0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.y0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public final void K1(boolean z, boolean z2) {
        if (this.D0) {
            return;
        }
        this.D0 = true;
        this.E0 = false;
        Dialog dialog = this.B0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.B0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.q0.getLooper()) {
                    onDismiss(this.B0);
                } else {
                    this.q0.post(this.r0);
                }
            }
        }
        this.C0 = true;
        if (this.y0 >= 0) {
            H().T0(this.y0, 1);
            this.y0 = -1;
            return;
        }
        androidx.fragment.app.j l = H().l();
        l.l(this);
        if (z) {
            l.g();
        } else {
            l.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void L0() {
        super.L0();
        Dialog dialog = this.B0;
        if (dialog != null) {
            this.C0 = false;
            dialog.show();
            View decorView = this.B0.getWindow().getDecorView();
            bu1.a(decorView, this);
            eu1.a(decorView, this);
            du1.a(decorView, this);
        }
    }

    public Dialog L1() {
        return this.B0;
    }

    @Override // androidx.fragment.app.Fragment
    public void M0() {
        super.M0();
        Dialog dialog = this.B0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public int M1() {
        return this.v0;
    }

    public Dialog N1(Bundle bundle) {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new Dialog(o1(), M1());
    }

    @Override // androidx.fragment.app.Fragment
    public void O0(Bundle bundle) {
        Bundle bundle2;
        super.O0(bundle);
        if (this.B0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.B0.onRestoreInstanceState(bundle2);
    }

    public View O1(int i) {
        Dialog dialog = this.B0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean P1() {
        return this.F0;
    }

    public final void Q1(Bundle bundle) {
        if (this.x0 && !this.F0) {
            try {
                this.z0 = true;
                Dialog N1 = N1(bundle);
                this.B0 = N1;
                if (this.x0) {
                    T1(N1, this.u0);
                    Context u = u();
                    if (u instanceof Activity) {
                        this.B0.setOwnerActivity((Activity) u);
                    }
                    this.B0.setCancelable(this.w0);
                    this.B0.setOnCancelListener(this.s0);
                    this.B0.setOnDismissListener(this.t0);
                    this.F0 = true;
                } else {
                    this.B0 = null;
                }
            } finally {
                this.z0 = false;
            }
        }
    }

    public final Dialog R1() {
        Dialog L1 = L1();
        if (L1 != null) {
            return L1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void S1(boolean z) {
        this.x0 = z;
    }

    public void T1(Dialog dialog, int i) {
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

    public void U1(FragmentManager fragmentManager, String str) {
        this.D0 = false;
        this.E0 = true;
        androidx.fragment.app.j l = fragmentManager.l();
        l.d(this, str);
        l.f();
    }

    @Override // androidx.fragment.app.Fragment
    public void V0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.V0(layoutInflater, viewGroup, bundle);
        if (this.W != null || this.B0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.B0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public r30 j() {
        return new e(super.j());
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Context context) {
        super.l0(context);
        W().e(this.A0);
        if (this.E0) {
            return;
        }
        this.D0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void o0(Bundle bundle) {
        super.o0(bundle);
        this.q0 = new Handler();
        this.x0 = this.M == 0;
        if (bundle != null) {
            this.u0 = bundle.getInt("android:style", 0);
            this.v0 = bundle.getInt("android:theme", 0);
            this.w0 = bundle.getBoolean("android:cancelable", true);
            this.x0 = bundle.getBoolean("android:showsDialog", this.x0);
            this.y0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.C0) {
            return;
        }
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDismiss called for DialogFragment ");
            sb.append(this);
        }
        K1(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void v0() {
        super.v0();
        Dialog dialog = this.B0;
        if (dialog != null) {
            this.C0 = true;
            dialog.setOnDismissListener(null);
            this.B0.dismiss();
            if (!this.D0) {
                onDismiss(this.B0);
            }
            this.B0 = null;
            this.F0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void w0() {
        super.w0();
        if (!this.E0 && !this.D0) {
            this.D0 = true;
        }
        W().i(this.A0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater x0(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater x0 = super.x0(bundle);
        if (this.x0 && !this.z0) {
            Q1(bundle);
            if (FragmentManager.E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("get layout inflater for DialogFragment ");
                sb2.append(this);
                sb2.append(" from dialog context");
            }
            Dialog dialog = this.B0;
            return dialog != null ? x0.cloneInContext(dialog.getContext()) : x0;
        }
        if (FragmentManager.E0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.x0) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
        }
        return x0;
    }
}

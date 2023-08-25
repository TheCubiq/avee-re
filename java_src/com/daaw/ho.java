package com.daaw;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.rw1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class ho extends DialogFragment {
    public static sw1<al, Integer, vn> E = new sw1<>();
    public static uw1<al, Integer, Integer, vn, String> F = new uw1<>();
    public static tw1<Integer, vn, Integer, rw1<Integer, vn>> G = new tw1<>();
    public static sw1<Integer, vn, Integer> H = new sw1<>();
    public static sw1<Integer, Integer, Boolean> I = new sw1<>();
    public static uw1<Fragment, TextView, List<String>, String, String> J = new uw1<>();
    public static sw1<ho, Integer, Intent> K = new sw1<>();
    public static pw1 L = new pw1();
    public static pw1 M = new pw1();
    public static sw1<ho, String, String> N = new sw1<>();
    public static yw1<ho, String, String, lo1<String[], String>> O = new yw1<>();
    public static ww1<ho, Boolean> P = new ww1<>();
    public static sw1<Context, Integer, vn> Q = new sw1<>();
    public static sw1<Context, Integer, vn> R = new sw1<>();
    public static tw1<ho, vn, un, String> S = new tw1<>();
    public static ww1<String, Boolean> T = new ww1<>();
    public static WeakReference<ho> U = new WeakReference<>(null);
    public io s;
    public no t;
    public po u;
    public int x;
    public vn y;
    public int z;
    public int p = 0;
    public int q = 268435455;
    public boolean r = false;
    public rw1<Integer, vn> v = new rw1<>();
    public List<Object> w = new LinkedList();
    public boolean A = false;
    public g31 B = new g31(80);
    public ArrayList<String> C = null;
    public String D = null;

    /* loaded from: classes.dex */
    public class a implements w40<e0<Object>> {
        public a() {
        }

        @Override // com.daaw.w40
        /* renamed from: b */
        public e0<Object> a() {
            ho hoVar = ho.this;
            return hoVar.t.f(hoVar.C, ho.this.D);
        }
    }

    /* loaded from: classes.dex */
    public class b implements rw1.a<Integer, vn> {
        public b() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, vn vnVar) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements rw1.a<Context, Integer> {
        public c() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Context context, Integer num) {
            ho.R.a(context, num, ho.this.y);
        }
    }

    /* loaded from: classes.dex */
    public class d implements rw1.a<Context, Integer> {
        public d() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Context context, Integer num) {
            ho.Q.a(context, num, ho.this.y);
        }
    }

    /* loaded from: classes.dex */
    public class e extends Dialog {
        public e(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (ho.P.a(ho.k(), Boolean.FALSE).booleanValue()) {
                return;
            }
            super.onBackPressed();
        }
    }

    /* loaded from: classes.dex */
    public class f implements w40<e0<Object>> {
        public f() {
        }

        @Override // com.daaw.w40
        /* renamed from: b */
        public e0<Object> a() {
            ho hoVar = ho.this;
            return hoVar.t.f(hoVar.C, ho.this.D);
        }
    }

    /* loaded from: classes.dex */
    public class g implements h0 {
        public g() {
        }

        @Override // com.daaw.h0
        public void a() {
            tw1<Integer, vn, Integer, rw1<Integer, vn>> tw1Var = ho.G;
            Integer valueOf = Integer.valueOf(ho.this.z);
            ho hoVar = ho.this;
            tw1Var.a(valueOf, hoVar.y, Integer.valueOf(hoVar.x), null);
        }
    }

    /* loaded from: classes.dex */
    public class h implements w40<e0<Object>> {
        public h() {
        }

        @Override // com.daaw.w40
        /* renamed from: b */
        public e0<Object> a() {
            ho hoVar = ho.this;
            return hoVar.t.f(hoVar.C, ho.this.D);
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public String a;
        public int b;
        public rn c;
        public un d;

        public i(String str, rn rnVar, int i, boolean z) {
            this.a = str;
            this.b = i;
            this.c = rnVar;
        }

        public i(String str, un unVar, int i) {
            this.a = str;
            this.b = i;
            this.d = unVar;
        }

        public rn a() {
            return this.c;
        }

        public un b() {
            return this.d;
        }

        public String c() {
            un unVar = this.d;
            return unVar == null ? "" : unVar.A();
        }

        public boolean d() {
            return this.c != null;
        }
    }

    public ho() {
        setStyle(2, 0);
        U = new WeakReference<>(this);
        this.s = new io();
        this.t = new no();
        this.u = new po();
    }

    public static ho j(al alVar, Integer num, vn vnVar, String[] strArr) {
        ho hoVar = new ho();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", num.intValue());
        bundle.putStringArray("arg2", strArr);
        bundle.putString("arg3", vnVar.o());
        hoVar.setArguments(bundle);
        gr1.x(hoVar, "CustomizeVisDialog", alVar);
        return hoVar;
    }

    public static ho k() {
        return U.get();
    }

    public static boolean o(FragmentManager fragmentManager) {
        fragmentManager.executePendingTransactions();
        return (k() == null || fragmentManager.findFragmentByTag("CustomizeVisDialog") == null) ? false : true;
    }

    public void A(un unVar, String str, e0<Object> e0Var) {
        this.t.e(unVar, str, e0Var);
    }

    public void a(AdapterView<?> adapterView) {
        TextView textView = (TextView) adapterView.getChildAt(0);
        if (textView != null) {
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(this.q);
        }
    }

    public void b(Spinner spinner) {
        TextView textView = (TextView) spinner.getSelectedView();
        if (textView != null) {
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(this.q);
        }
    }

    public void c(un unVar, String str) {
        ho k = k();
        if (k == null) {
            return;
        }
        S.a(k, this.y, unVar, str);
    }

    public void d(String str, String str2) {
        ho k = k();
        if (k == null) {
            return;
        }
        N.a(k, str, str2);
    }

    public lo1<String[], String> e(String str, String str2) {
        return O.a(k(), str, str2, new lo1<>(new String[0], ""));
    }

    public boolean i() {
        boolean z = false;
        boolean z2 = this.r || this.s.k();
        if (this.u.c() && z2) {
            z = true;
        }
        v(null, null, null, null);
        return z;
    }

    public i l(int i2) {
        return this.s.j(i2);
    }

    public boolean m(int i2) {
        boolean z = false;
        boolean z2 = i2 == 1 && !this.r;
        boolean z3 = z2 != this.s.k();
        this.s.x(z2);
        if (!z2 && !this.r) {
            z = true;
        }
        this.t.I(z);
        i();
        return z3;
    }

    public boolean n(String str) {
        return T.a(str, Boolean.TRUE).booleanValue();
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1) {
            K.a(k(), Integer.valueOf(i2), intent);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
        this.v.b(new b(), this.w);
        tn.b.b(new c(), this.w);
        tn.a.b(new d(), this.w);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new e(getActivity(), getTheme());
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.p = getResources().getInteger(17694720);
        this.q = zk.c(getActivity(), R.color.white_alpha_2);
        this.r = getResources().getBoolean(R.bool.screenWidthAtLeastX00);
        Bundle arguments = getArguments();
        this.z = arguments.getInt("arg1");
        String[] stringArray = arguments.getStringArray("arg2");
        this.y = vn.g(arguments.getString("arg3"));
        this.x = 0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.dialog_customize_vis, viewGroup, false);
        this.u.e(layoutInflater, viewGroup2, bundle, getActivity());
        if (bundle != null) {
            this.s.r(bundle.getInt("arg4", -1));
            this.C = bundle.getStringArrayList("arg5");
            this.D = bundle.getString("arg6");
            this.u.g(this.y.i(this.C), this.D, new f());
        }
        this.s.m(layoutInflater, viewGroup2, bundle, getActivity(), stringArray);
        this.A = false;
        io ioVar = this.s;
        ioVar.y(ioVar.l);
        this.A = true;
        this.t.E(layoutInflater, viewGroup2, bundle);
        this.A = false;
        io ioVar2 = this.s;
        ioVar2.r(ioVar2.l);
        this.A = false;
        this.s.q(this.y);
        this.A = true;
        return viewGroup2;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.v.c(this.w);
        tn.b.c(this.w);
        tn.a.c(this.w);
        this.w.clear();
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        if (this.y != null) {
            getArguments().putString("arg3", this.y.o());
        }
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        s();
        M.a();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        ho k = k();
        if (k == null || !k.equals(this)) {
            return;
        }
        L.a();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("arg4", this.s.l);
        bundle.putStringArrayList("arg5", this.C);
        bundle.putString("arg6", this.D);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
        }
    }

    public boolean p() {
        return getActivity() != null;
    }

    public void q() {
        if (this.A && this.y != null) {
            G.a(Integer.valueOf(this.z), this.y, Integer.valueOf(this.x), this.v);
        }
    }

    public void r(boolean z) {
        if (this.A && this.y != null) {
            lz1.c("onCompositionChanged invoke");
            G.a(Integer.valueOf(this.z), this.y, Integer.valueOf(this.x), z ? this.v : null);
        }
    }

    public void s() {
        H.a(Integer.valueOf(this.z), this.y, Integer.valueOf(this.x));
    }

    public void t(TextView textView, List<String> list, String str, String str2) {
        this.t.F(textView, list, str, str2);
        io ioVar = this.s;
        ioVar.r(ioVar.l);
        e0<Object> f2 = this.t.f(list, str);
        if (f2 != null) {
            f2.a(null);
        }
    }

    public void u() {
        if (this.A && this.y != null) {
            this.B.a(new g());
            io ioVar = this.s;
            ioVar.E(ioVar.l);
        }
    }

    public void v(un unVar, String str, View view, e0<Object> e0Var) {
        this.C = unVar != null ? unVar.j() : null;
        this.D = str;
        this.u.g(unVar, str, new h());
    }

    public void w(int i2, boolean z) {
        i l = l(i2);
        I.a(Integer.valueOf(this.z), Integer.valueOf(l != null ? l.b : -1), Boolean.valueOf(z));
    }

    public void x(vn vnVar, boolean z, int i2) {
        this.y = vnVar;
        this.A = false;
        this.s.q(vnVar);
        io ioVar = this.s;
        ioVar.r(ioVar.l);
        this.u.g(vnVar.i(this.C), this.D, new a());
        this.A = true;
        if (z) {
            this.s.v();
        } else if (i2 > -1) {
            this.s.w(i2);
        }
    }

    public void y(un unVar) {
        this.t.H(unVar);
    }

    public void z(int i2) {
        this.s.u(i2);
    }
}

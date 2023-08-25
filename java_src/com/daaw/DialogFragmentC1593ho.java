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
/* renamed from: com.daaw.ho */
/* loaded from: classes.dex */
public class DialogFragmentC1593ho extends DialogFragment {

    /* renamed from: E */
    public static sw1<C0645al, Integer, C3355vn> f12697E = new sw1<>();

    /* renamed from: F */
    public static uw1<C0645al, Integer, Integer, C3355vn, String> f12698F = new uw1<>();

    /* renamed from: G */
    public static tw1<Integer, C3355vn, Integer, rw1<Integer, C3355vn>> f12699G = new tw1<>();

    /* renamed from: H */
    public static sw1<Integer, C3355vn, Integer> f12700H = new sw1<>();

    /* renamed from: I */
    public static sw1<Integer, Integer, Boolean> f12701I = new sw1<>();

    /* renamed from: J */
    public static uw1<Fragment, TextView, List<String>, String, String> f12702J = new uw1<>();

    /* renamed from: K */
    public static sw1<DialogFragmentC1593ho, Integer, Intent> f12703K = new sw1<>();

    /* renamed from: L */
    public static pw1 f12704L = new pw1();

    /* renamed from: M */
    public static pw1 f12705M = new pw1();

    /* renamed from: N */
    public static sw1<DialogFragmentC1593ho, String, String> f12706N = new sw1<>();

    /* renamed from: O */
    public static yw1<DialogFragmentC1593ho, String, String, lo1<String[], String>> f12707O = new yw1<>();

    /* renamed from: P */
    public static ww1<DialogFragmentC1593ho, Boolean> f12708P = new ww1<>();

    /* renamed from: Q */
    public static sw1<Context, Integer, C3355vn> f12709Q = new sw1<>();

    /* renamed from: R */
    public static sw1<Context, Integer, C3355vn> f12710R = new sw1<>();

    /* renamed from: S */
    public static tw1<DialogFragmentC1593ho, C3355vn, C3239un, String> f12711S = new tw1<>();

    /* renamed from: T */
    public static ww1<String, Boolean> f12712T = new ww1<>();

    /* renamed from: U */
    public static WeakReference<DialogFragmentC1593ho> f12713U = new WeakReference<>(null);

    /* renamed from: s */
    public C1730io f12721s;

    /* renamed from: t */
    public C2323no f12722t;

    /* renamed from: u */
    public C2566po f12723u;

    /* renamed from: x */
    public int f12726x;

    /* renamed from: y */
    public C3355vn f12727y;

    /* renamed from: z */
    public int f12728z;

    /* renamed from: p */
    public int f12718p = 0;

    /* renamed from: q */
    public int f12719q = 268435455;

    /* renamed from: r */
    public boolean f12720r = false;

    /* renamed from: v */
    public rw1<Integer, C3355vn> f12724v = new rw1<>();

    /* renamed from: w */
    public List<Object> f12725w = new LinkedList();

    /* renamed from: A */
    public boolean f12714A = false;

    /* renamed from: B */
    public g31 f12715B = new g31(80);

    /* renamed from: C */
    public ArrayList<String> f12716C = null;

    /* renamed from: D */
    public String f12717D = null;

    /* renamed from: com.daaw.ho$a */
    /* loaded from: classes.dex */
    public class C1594a implements w40<InterfaceC1153e0<Object>> {
        public C1594a() {
        }

        @Override // com.daaw.w40
        /* renamed from: b */
        public InterfaceC1153e0<Object> mo3478a() {
            DialogFragmentC1593ho dialogFragmentC1593ho = DialogFragmentC1593ho.this;
            return dialogFragmentC1593ho.f12722t.m14930f(dialogFragmentC1593ho.f12716C, DialogFragmentC1593ho.this.f12717D);
        }
    }

    /* renamed from: com.daaw.ho$b */
    /* loaded from: classes.dex */
    public class C1595b implements rw1.InterfaceC2894a<Integer, C3355vn> {
        public C1595b() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, C3355vn c3355vn) {
        }
    }

    /* renamed from: com.daaw.ho$c */
    /* loaded from: classes.dex */
    public class C1596c implements rw1.InterfaceC2894a<Context, Integer> {
        public C1596c() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Context context, Integer num) {
            DialogFragmentC1593ho.f12710R.m9795a(context, num, DialogFragmentC1593ho.this.f12727y);
        }
    }

    /* renamed from: com.daaw.ho$d */
    /* loaded from: classes.dex */
    public class C1597d implements rw1.InterfaceC2894a<Context, Integer> {
        public C1597d() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Context context, Integer num) {
            DialogFragmentC1593ho.f12709Q.m9795a(context, num, DialogFragmentC1593ho.this.f12727y);
        }
    }

    /* renamed from: com.daaw.ho$e */
    /* loaded from: classes.dex */
    public class DialogC1598e extends Dialog {
        public DialogC1598e(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (DialogFragmentC1593ho.f12708P.m5753a(DialogFragmentC1593ho.m20595k(), Boolean.FALSE).booleanValue()) {
                return;
            }
            super.onBackPressed();
        }
    }

    /* renamed from: com.daaw.ho$f */
    /* loaded from: classes.dex */
    public class C1599f implements w40<InterfaceC1153e0<Object>> {
        public C1599f() {
        }

        @Override // com.daaw.w40
        /* renamed from: b */
        public InterfaceC1153e0<Object> mo3478a() {
            DialogFragmentC1593ho dialogFragmentC1593ho = DialogFragmentC1593ho.this;
            return dialogFragmentC1593ho.f12722t.m14930f(dialogFragmentC1593ho.f12716C, DialogFragmentC1593ho.this.f12717D);
        }
    }

    /* renamed from: com.daaw.ho$g */
    /* loaded from: classes.dex */
    public class C1600g implements InterfaceC1492h0 {
        public C1600g() {
        }

        @Override // com.daaw.InterfaceC1492h0
        /* renamed from: a */
        public void mo3002a() {
            tw1<Integer, C3355vn, Integer, rw1<Integer, C3355vn>> tw1Var = DialogFragmentC1593ho.f12699G;
            Integer valueOf = Integer.valueOf(DialogFragmentC1593ho.this.f12728z);
            DialogFragmentC1593ho dialogFragmentC1593ho = DialogFragmentC1593ho.this;
            tw1Var.m8756a(valueOf, dialogFragmentC1593ho.f12727y, Integer.valueOf(dialogFragmentC1593ho.f12726x), null);
        }
    }

    /* renamed from: com.daaw.ho$h */
    /* loaded from: classes.dex */
    public class C1601h implements w40<InterfaceC1153e0<Object>> {
        public C1601h() {
        }

        @Override // com.daaw.w40
        /* renamed from: b */
        public InterfaceC1153e0<Object> mo3478a() {
            DialogFragmentC1593ho dialogFragmentC1593ho = DialogFragmentC1593ho.this;
            return dialogFragmentC1593ho.f12722t.m14930f(dialogFragmentC1593ho.f12716C, DialogFragmentC1593ho.this.f12717D);
        }
    }

    /* renamed from: com.daaw.ho$i */
    /* loaded from: classes.dex */
    public static class C1602i {

        /* renamed from: a */
        public String f12737a;

        /* renamed from: b */
        public int f12738b;

        /* renamed from: c */
        public C2872rn f12739c;

        /* renamed from: d */
        public C3239un f12740d;

        public C1602i(String str, C2872rn c2872rn, int i, boolean z) {
            this.f12737a = str;
            this.f12738b = i;
            this.f12739c = c2872rn;
        }

        public C1602i(String str, C3239un c3239un, int i) {
            this.f12737a = str;
            this.f12738b = i;
            this.f12740d = c3239un;
        }

        /* renamed from: a */
        public C2872rn m20573a() {
            return this.f12739c;
        }

        /* renamed from: b */
        public C3239un m20572b() {
            return this.f12740d;
        }

        /* renamed from: c */
        public String m20571c() {
            C3239un c3239un = this.f12740d;
            return c3239un == null ? "" : c3239un.m8004A();
        }

        /* renamed from: d */
        public boolean m20570d() {
            return this.f12739c != null;
        }
    }

    public DialogFragmentC1593ho() {
        setStyle(2, 0);
        f12713U = new WeakReference<>(this);
        this.f12721s = new C1730io();
        this.f12722t = new C2323no();
        this.f12723u = new C2566po();
    }

    /* renamed from: j */
    public static DialogFragmentC1593ho m20596j(C0645al c0645al, Integer num, C3355vn c3355vn, String[] strArr) {
        DialogFragmentC1593ho dialogFragmentC1593ho = new DialogFragmentC1593ho();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", num.intValue());
        bundle.putStringArray("arg2", strArr);
        bundle.putString("arg3", c3355vn.m7005o());
        dialogFragmentC1593ho.setArguments(bundle);
        gr1.m21311x(dialogFragmentC1593ho, "CustomizeVisDialog", c0645al);
        return dialogFragmentC1593ho;
    }

    /* renamed from: k */
    public static DialogFragmentC1593ho m20595k() {
        return f12713U.get();
    }

    /* renamed from: o */
    public static boolean m20591o(FragmentManager fragmentManager) {
        fragmentManager.executePendingTransactions();
        return (m20595k() == null || fragmentManager.findFragmentByTag("CustomizeVisDialog") == null) ? false : true;
    }

    /* renamed from: A */
    public void m20606A(C3239un c3239un, String str, InterfaceC1153e0<Object> interfaceC1153e0) {
        this.f12722t.m14931e(c3239un, str, interfaceC1153e0);
    }

    /* renamed from: a */
    public void m20605a(AdapterView<?> adapterView) {
        TextView textView = (TextView) adapterView.getChildAt(0);
        if (textView != null) {
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(this.f12719q);
        }
    }

    /* renamed from: b */
    public void m20604b(Spinner spinner) {
        TextView textView = (TextView) spinner.getSelectedView();
        if (textView != null) {
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(this.f12719q);
        }
    }

    /* renamed from: c */
    public void m20603c(C3239un c3239un, String str) {
        DialogFragmentC1593ho m20595k = m20595k();
        if (m20595k == null) {
            return;
        }
        f12711S.m8756a(m20595k, this.f12727y, c3239un, str);
    }

    /* renamed from: d */
    public void m20602d(String str, String str2) {
        DialogFragmentC1593ho m20595k = m20595k();
        if (m20595k == null) {
            return;
        }
        f12706N.m9795a(m20595k, str, str2);
    }

    /* renamed from: e */
    public lo1<String[], String> m20601e(String str, String str2) {
        return f12707O.m3155a(m20595k(), str, str2, new lo1<>(new String[0], ""));
    }

    /* renamed from: i */
    public boolean m20597i() {
        boolean z = false;
        boolean z2 = this.f12720r || this.f12721s.m19572k();
        if (this.f12723u.m13267c() && z2) {
            z = true;
        }
        m20584v(null, null, null, null);
        return z;
    }

    /* renamed from: l */
    public C1602i m20594l(int i) {
        return this.f12721s.m19573j(i);
    }

    /* renamed from: m */
    public boolean m20593m(int i) {
        boolean z = false;
        boolean z2 = i == 1 && !this.f12720r;
        boolean z3 = z2 != this.f12721s.m19572k();
        this.f12721s.m19559x(z2);
        if (!z2 && !this.f12720r) {
            z = true;
        }
        this.f12722t.m14936I(z);
        m20597i();
        return z3;
    }

    /* renamed from: n */
    public boolean m20592n(String str) {
        return f12712T.m5753a(str, Boolean.TRUE).booleanValue();
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            f12703K.m9795a(m20595k(), Integer.valueOf(i), intent);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
        this.f12724v.m10861b(new C1595b(), this.f12725w);
        C3097tn.f27883b.m10861b(new C1596c(), this.f12725w);
        C3097tn.f27882a.m10861b(new C1597d(), this.f12725w);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC1598e(getActivity(), getTheme());
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f12718p = getResources().getInteger(17694720);
        this.f12719q = C3866zk.m2180c(getActivity(), R.color.white_alpha_2);
        this.f12720r = getResources().getBoolean(R.bool.screenWidthAtLeastX00);
        Bundle arguments = getArguments();
        this.f12728z = arguments.getInt("arg1");
        String[] stringArray = arguments.getStringArray("arg2");
        this.f12727y = C3355vn.m7013g(arguments.getString("arg3"));
        this.f12726x = 0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.dialog_customize_vis, viewGroup, false);
        this.f12723u.m13265e(layoutInflater, viewGroup2, bundle, getActivity());
        if (bundle != null) {
            this.f12721s.m19565r(bundle.getInt("arg4", -1));
            this.f12716C = bundle.getStringArrayList("arg5");
            this.f12717D = bundle.getString("arg6");
            this.f12723u.m13263g(this.f12727y.m7011i(this.f12716C), this.f12717D, new C1599f());
        }
        this.f12721s.m19570m(layoutInflater, viewGroup2, bundle, getActivity(), stringArray);
        this.f12714A = false;
        C1730io c1730io = this.f12721s;
        c1730io.m19558y(c1730io.f13863l);
        this.f12714A = true;
        this.f12722t.m14940E(layoutInflater, viewGroup2, bundle);
        this.f12714A = false;
        C1730io c1730io2 = this.f12721s;
        c1730io2.m19565r(c1730io2.f13863l);
        this.f12714A = false;
        this.f12721s.m19566q(this.f12727y);
        this.f12714A = true;
        return viewGroup2;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f12724v.m10860c(this.f12725w);
        C3097tn.f27883b.m10860c(this.f12725w);
        C3097tn.f27882a.m10860c(this.f12725w);
        this.f12725w.clear();
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        if (this.f12727y != null) {
            getArguments().putString("arg3", this.f12727y.m7005o());
        }
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        m20587s();
        f12705M.m12990a();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        DialogFragmentC1593ho m20595k = m20595k();
        if (m20595k == null || !m20595k.equals(this)) {
            return;
        }
        f12704L.m12990a();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("arg4", this.f12721s.f13863l);
        bundle.putStringArrayList("arg5", this.f12716C);
        bundle.putString("arg6", this.f12717D);
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

    /* renamed from: p */
    public boolean m20590p() {
        return getActivity() != null;
    }

    /* renamed from: q */
    public void m20589q() {
        if (this.f12714A && this.f12727y != null) {
            f12699G.m8756a(Integer.valueOf(this.f12728z), this.f12727y, Integer.valueOf(this.f12726x), this.f12724v);
        }
    }

    /* renamed from: r */
    public void m20588r(boolean z) {
        if (this.f12714A && this.f12727y != null) {
            lz1.m16363c("onCompositionChanged invoke");
            f12699G.m8756a(Integer.valueOf(this.f12728z), this.f12727y, Integer.valueOf(this.f12726x), z ? this.f12724v : null);
        }
    }

    /* renamed from: s */
    public void m20587s() {
        f12700H.m9795a(Integer.valueOf(this.f12728z), this.f12727y, Integer.valueOf(this.f12726x));
    }

    /* renamed from: t */
    public void m20586t(TextView textView, List<String> list, String str, String str2) {
        this.f12722t.m14939F(textView, list, str, str2);
        C1730io c1730io = this.f12721s;
        c1730io.m19565r(c1730io.f13863l);
        InterfaceC1153e0<Object> m14930f = this.f12722t.m14930f(list, str);
        if (m14930f != null) {
            m14930f.mo7884a(null);
        }
    }

    /* renamed from: u */
    public void m20585u() {
        if (this.f12714A && this.f12727y != null) {
            this.f12715B.m22052a(new C1600g());
            C1730io c1730io = this.f12721s;
            c1730io.m19583E(c1730io.f13863l);
        }
    }

    /* renamed from: v */
    public void m20584v(C3239un c3239un, String str, View view, InterfaceC1153e0<Object> interfaceC1153e0) {
        this.f12716C = c3239un != null ? c3239un.m7963j() : null;
        this.f12717D = str;
        this.f12723u.m13263g(c3239un, str, new C1601h());
    }

    /* renamed from: w */
    public void m20583w(int i, boolean z) {
        C1602i m20594l = m20594l(i);
        f12701I.m9795a(Integer.valueOf(this.f12728z), Integer.valueOf(m20594l != null ? m20594l.f12738b : -1), Boolean.valueOf(z));
    }

    /* renamed from: x */
    public void m20582x(C3355vn c3355vn, boolean z, int i) {
        this.f12727y = c3355vn;
        this.f12714A = false;
        this.f12721s.m19566q(c3355vn);
        C1730io c1730io = this.f12721s;
        c1730io.m19565r(c1730io.f13863l);
        this.f12723u.m13263g(c3355vn.m7011i(this.f12716C), this.f12717D, new C1594a());
        this.f12714A = true;
        if (z) {
            this.f12721s.m19561v();
        } else if (i > -1) {
            this.f12721s.m19560w(i);
        }
    }

    /* renamed from: y */
    public void m20581y(C3239un c3239un) {
        this.f12722t.m14937H(c3239un);
    }

    /* renamed from: z */
    public void m20580z(int i) {
        this.f12721s.m19562u(i);
    }
}

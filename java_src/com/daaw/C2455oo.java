package com.daaw;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.wn0;
import java.util.Locale;
/* renamed from: com.daaw.oo */
/* loaded from: classes.dex */
public class C2455oo extends C2323no {

    /* renamed from: com.daaw.oo$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2456a implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3239un f21693p;

        /* renamed from: q */
        public final /* synthetic */ String f21694q;

        /* renamed from: r */
        public final /* synthetic */ dm0 f21695r;

        /* renamed from: s */
        public final /* synthetic */ float f21696s;

        /* renamed from: t */
        public final /* synthetic */ DialogFragmentC1593ho f21697t;

        public View$OnClickListenerC2456a(C3239un c3239un, String str, dm0 dm0Var, float f, DialogFragmentC1593ho dialogFragmentC1593ho) {
            this.f21693p = c3239un;
            this.f21694q = str;
            this.f21695r = dm0Var;
            this.f21696s = f;
            this.f21697t = dialogFragmentC1593ho;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dm0 m7945s = this.f21693p.m7945s(this.f21694q, new dm0(this.f21695r));
            float f = this.f21696s;
            this.f21693p.m7978a0(this.f21694q, new dm0(m7945s, new xn0("Constant", f, f)));
            this.f21697t.m20589q();
        }
    }

    /* renamed from: com.daaw.oo$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2457b implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3239un f21698p;

        /* renamed from: q */
        public final /* synthetic */ String f21699q;

        /* renamed from: r */
        public final /* synthetic */ dm0 f21700r;

        /* renamed from: s */
        public final /* synthetic */ DialogFragmentC1593ho f21701s;

        public View$OnClickListenerC2457b(C3239un c3239un, String str, dm0 dm0Var, DialogFragmentC1593ho dialogFragmentC1593ho) {
            this.f21698p = c3239un;
            this.f21699q = str;
            this.f21700r = dm0Var;
            this.f21701s = dialogFragmentC1593ho;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dm0 m7945s = this.f21698p.m7945s(this.f21699q, new dm0(this.f21700r));
            if (m7945s.m24225h() > 1) {
                this.f21698p.m7978a0(this.f21699q, new dm0(m7945s, 0, m7945s.m24225h() - 1));
                this.f21701s.m20589q();
            }
        }
    }

    /* renamed from: com.daaw.oo$c */
    /* loaded from: classes.dex */
    public class C2458c implements InterfaceC1153e0<Object> {

        /* renamed from: a */
        public final /* synthetic */ boolean[] f21702a;

        /* renamed from: b */
        public final /* synthetic */ C3239un f21703b;

        /* renamed from: c */
        public final /* synthetic */ String f21704c;

        /* renamed from: d */
        public final /* synthetic */ dm0 f21705d;

        /* renamed from: e */
        public final /* synthetic */ boolean f21706e;

        /* renamed from: f */
        public final /* synthetic */ TextView f21707f;

        /* renamed from: g */
        public final /* synthetic */ ViewGroup f21708g;

        /* renamed from: h */
        public final /* synthetic */ View f21709h;

        /* renamed from: i */
        public final /* synthetic */ View f21710i;

        /* renamed from: j */
        public final /* synthetic */ float f21711j;

        /* renamed from: k */
        public final /* synthetic */ float f21712k;

        /* renamed from: l */
        public final /* synthetic */ float f21713l;

        /* renamed from: m */
        public final /* synthetic */ boolean f21714m;

        /* renamed from: n */
        public final /* synthetic */ int f21715n;

        /* renamed from: o */
        public final /* synthetic */ SeekBar[] f21716o;

        /* renamed from: p */
        public final /* synthetic */ SeekBar[] f21717p;

        /* renamed from: q */
        public final /* synthetic */ EditText[] f21718q;

        /* renamed from: r */
        public final /* synthetic */ EditText[] f21719r;

        /* renamed from: s */
        public final /* synthetic */ Spinner[] f21720s;

        /* renamed from: t */
        public final /* synthetic */ String[] f21721t;

        /* renamed from: u */
        public final /* synthetic */ TextView[] f21722u;

        /* renamed from: v */
        public final /* synthetic */ TextView[] f21723v;

        public C2458c(boolean[] zArr, C3239un c3239un, String str, dm0 dm0Var, boolean z, TextView textView, ViewGroup viewGroup, View view, View view2, float f, float f2, float f3, boolean z2, int i, SeekBar[] seekBarArr, SeekBar[] seekBarArr2, EditText[] editTextArr, EditText[] editTextArr2, Spinner[] spinnerArr, String[] strArr, TextView[] textViewArr, TextView[] textViewArr2) {
            this.f21702a = zArr;
            this.f21703b = c3239un;
            this.f21704c = str;
            this.f21705d = dm0Var;
            this.f21706e = z;
            this.f21707f = textView;
            this.f21708g = viewGroup;
            this.f21709h = view;
            this.f21710i = view2;
            this.f21711j = f;
            this.f21712k = f2;
            this.f21713l = f3;
            this.f21714m = z2;
            this.f21715n = i;
            this.f21716o = seekBarArr;
            this.f21717p = seekBarArr2;
            this.f21718q = editTextArr;
            this.f21719r = editTextArr2;
            this.f21720s = spinnerArr;
            this.f21721t = strArr;
            this.f21722u = textViewArr;
            this.f21723v = textViewArr2;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01a0 A[SYNTHETIC] */
        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo7884a(Object obj) {
            TextView textView;
            String m24228e;
            EditText editText;
            String format;
            String str;
            TextView textView2;
            boolean[] zArr = this.f21702a;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            dm0 m7945s = this.f21703b.m7945s(this.f21704c, new dm0(this.f21705d));
            if (this.f21706e) {
                textView = this.f21707f;
                m24228e = m7945s.m24229d(this.f21708g.getContext());
            } else {
                textView = this.f21707f;
                m24228e = m7945s.m24228e(this.f21708g.getContext());
            }
            textView.setText(m24228e);
            nd1.m15220a(this.f21709h, this.f21710i, (this.f21711j - this.f21712k) / this.f21713l, (m7945s.m24227f() - this.f21712k) / this.f21713l);
            if (this.f21714m) {
                for (int i = 0; i < this.f21715n; i++) {
                    xn0 m24226g = m7945s.m24226g(i);
                    wn0.C3455a m5941e = wn0.m5941e(m24226g.m4968e());
                    boolean z = m5941e == null || this.f21706e || m5941e.f31389d;
                    if (z) {
                        bs1 m4966g = m24226g.m4966g();
                        if (!this.f21716o[i].equals(obj)) {
                            this.f21716o[i].setProgress((int) ((m4966g.f5090a - this.f21712k) / this.f21713l));
                        }
                        if (!this.f21717p[i].equals(obj)) {
                            this.f21717p[i].setProgress((int) ((m4966g.f5091b - this.f21712k) / this.f21713l));
                        }
                        if (!this.f21718q[i].equals(obj)) {
                            this.f21718q[i].setText(String.format(Locale.US, "%.3f", Float.valueOf(m4966g.f5090a)));
                        }
                        if (!this.f21719r[i].equals(obj)) {
                            editText = this.f21719r[i];
                            format = String.format(Locale.US, "%.3f", Float.valueOf(m4966g.f5091b));
                            editText.setText(format);
                        }
                        if (!this.f21720s[i].equals(obj)) {
                            this.f21720s[i].setSelection(br1.m25904e(this.f21721t, m24226g.m4968e()), false);
                        }
                        TextView[] textViewArr = this.f21722u;
                        if (m5941e == null) {
                            textViewArr[i].setText(C2455oo.m14120L(m5941e.f31387b, this.f21708g.getContext()));
                            textView2 = this.f21723v[i];
                            str = C2455oo.m14120L(m5941e.f31388c, this.f21708g.getContext());
                        } else {
                            str = "";
                            textViewArr[i].setText("");
                            textView2 = this.f21723v[i];
                        }
                        textView2.setText(str);
                        int i2 = 8;
                        this.f21717p[i].setVisibility(!z ? 0 : 8);
                        this.f21719r[i].setVisibility(!z ? 0 : 8);
                        TextView textView3 = this.f21723v[i];
                        if (!z) {
                            i2 = 0;
                        }
                        textView3.setVisibility(i2);
                    } else {
                        float m4967f = m24226g.m4967f();
                        if (!this.f21716o[i].equals(obj)) {
                            this.f21716o[i].setProgress((int) ((m4967f - this.f21712k) / this.f21713l));
                        }
                        if (!this.f21718q[i].equals(obj)) {
                            editText = this.f21718q[i];
                            format = String.format(Locale.US, "%.3f", Float.valueOf(m4967f));
                            editText.setText(format);
                        }
                        if (!this.f21720s[i].equals(obj)) {
                        }
                        TextView[] textViewArr2 = this.f21722u;
                        if (m5941e == null) {
                        }
                        textView2.setText(str);
                        int i22 = 8;
                        this.f21717p[i].setVisibility(!z ? 0 : 8);
                        this.f21719r[i].setVisibility(!z ? 0 : 8);
                        TextView textView32 = this.f21723v[i];
                        if (!z) {
                        }
                        textView32.setVisibility(i22);
                    }
                }
            }
            this.f21702a[0] = false;
        }
    }

    /* renamed from: com.daaw.oo$d */
    /* loaded from: classes.dex */
    public class C2459d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ boolean[] f21724a;

        /* renamed from: b */
        public final /* synthetic */ float f21725b;

        /* renamed from: c */
        public final /* synthetic */ float f21726c;

        /* renamed from: d */
        public final /* synthetic */ C3239un f21727d;

        /* renamed from: e */
        public final /* synthetic */ String f21728e;

        /* renamed from: f */
        public final /* synthetic */ dm0 f21729f;

        /* renamed from: g */
        public final /* synthetic */ int f21730g;

        /* renamed from: h */
        public final /* synthetic */ DialogFragmentC1593ho f21731h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC1153e0 f21732i;

        /* renamed from: j */
        public final /* synthetic */ SeekBar[] f21733j;

        /* renamed from: k */
        public final /* synthetic */ w40 f21734k;

        public C2459d(boolean[] zArr, float f, float f2, C3239un c3239un, String str, dm0 dm0Var, int i, DialogFragmentC1593ho dialogFragmentC1593ho, InterfaceC1153e0 interfaceC1153e0, SeekBar[] seekBarArr, w40 w40Var) {
            this.f21724a = zArr;
            this.f21725b = f;
            this.f21726c = f2;
            this.f21727d = c3239un;
            this.f21728e = str;
            this.f21729f = dm0Var;
            this.f21730g = i;
            this.f21731h = dialogFragmentC1593ho;
            this.f21732i = interfaceC1153e0;
            this.f21733j = seekBarArr;
            this.f21734k = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (!this.f21724a[0] && z) {
                float f = (i * this.f21725b) + this.f21726c;
                dm0 m7945s = this.f21727d.m7945s(this.f21728e, new dm0(this.f21729f));
                if (this.f21730g >= m7945s.m24225h()) {
                    return;
                }
                xn0 m24226g = m7945s.m24226g(this.f21730g);
                m7945s.m24222k(this.f21730g, new xn0(m24226g.m4968e(), f, m24226g.m4966g().f5091b));
                this.f21727d.m7978a0(this.f21728e, m7945s);
                this.f21731h.m20585u();
                this.f21732i.mo7884a(this.f21733j[this.f21730g]);
                InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f21734k.mo3478a();
                if (interfaceC1153e0 != null) {
                    interfaceC1153e0.mo7884a(null);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.daaw.oo$e */
    /* loaded from: classes.dex */
    public class C2460e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ boolean[] f21735a;

        /* renamed from: b */
        public final /* synthetic */ float f21736b;

        /* renamed from: c */
        public final /* synthetic */ float f21737c;

        /* renamed from: d */
        public final /* synthetic */ C3239un f21738d;

        /* renamed from: e */
        public final /* synthetic */ String f21739e;

        /* renamed from: f */
        public final /* synthetic */ dm0 f21740f;

        /* renamed from: g */
        public final /* synthetic */ int f21741g;

        /* renamed from: h */
        public final /* synthetic */ DialogFragmentC1593ho f21742h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC1153e0 f21743i;

        /* renamed from: j */
        public final /* synthetic */ SeekBar[] f21744j;

        /* renamed from: k */
        public final /* synthetic */ w40 f21745k;

        public C2460e(boolean[] zArr, float f, float f2, C3239un c3239un, String str, dm0 dm0Var, int i, DialogFragmentC1593ho dialogFragmentC1593ho, InterfaceC1153e0 interfaceC1153e0, SeekBar[] seekBarArr, w40 w40Var) {
            this.f21735a = zArr;
            this.f21736b = f;
            this.f21737c = f2;
            this.f21738d = c3239un;
            this.f21739e = str;
            this.f21740f = dm0Var;
            this.f21741g = i;
            this.f21742h = dialogFragmentC1593ho;
            this.f21743i = interfaceC1153e0;
            this.f21744j = seekBarArr;
            this.f21745k = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (!this.f21735a[0] && z) {
                float f = (i * this.f21736b) + this.f21737c;
                dm0 m7945s = this.f21738d.m7945s(this.f21739e, new dm0(this.f21740f));
                if (this.f21741g >= m7945s.m24225h()) {
                    return;
                }
                xn0 m24226g = m7945s.m24226g(this.f21741g);
                m7945s.m24222k(this.f21741g, new xn0(m24226g.m4968e(), m24226g.m4966g().f5090a, f));
                this.f21738d.m7978a0(this.f21739e, m7945s);
                this.f21742h.m20585u();
                this.f21743i.mo7884a(this.f21744j[this.f21741g]);
                InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f21745k.mo3478a();
                if (interfaceC1153e0 != null) {
                    interfaceC1153e0.mo7884a(null);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.daaw.oo$f */
    /* loaded from: classes.dex */
    public class C2461f implements TextWatcher {

        /* renamed from: p */
        public final /* synthetic */ boolean[] f21746p;

        /* renamed from: q */
        public final /* synthetic */ float f21747q;

        /* renamed from: r */
        public final /* synthetic */ float f21748r;

        /* renamed from: s */
        public final /* synthetic */ C3239un f21749s;

        /* renamed from: t */
        public final /* synthetic */ String f21750t;

        /* renamed from: u */
        public final /* synthetic */ dm0 f21751u;

        /* renamed from: v */
        public final /* synthetic */ int f21752v;

        /* renamed from: w */
        public final /* synthetic */ DialogFragmentC1593ho f21753w;

        /* renamed from: x */
        public final /* synthetic */ InterfaceC1153e0 f21754x;

        /* renamed from: y */
        public final /* synthetic */ EditText[] f21755y;

        /* renamed from: z */
        public final /* synthetic */ w40 f21756z;

        public C2461f(boolean[] zArr, float f, float f2, C3239un c3239un, String str, dm0 dm0Var, int i, DialogFragmentC1593ho dialogFragmentC1593ho, InterfaceC1153e0 interfaceC1153e0, EditText[] editTextArr, w40 w40Var) {
            this.f21746p = zArr;
            this.f21747q = f;
            this.f21748r = f2;
            this.f21749s = c3239un;
            this.f21750t = str;
            this.f21751u = dm0Var;
            this.f21752v = i;
            this.f21753w = dialogFragmentC1593ho;
            this.f21754x = interfaceC1153e0;
            this.f21755y = editTextArr;
            this.f21756z = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.f21746p[0]) {
                return;
            }
            float m25887v = br1.m25887v(editable.toString(), this.f21747q + (this.f21748r * 0.5f));
            dm0 m7945s = this.f21749s.m7945s(this.f21750t, new dm0(this.f21751u));
            if (this.f21752v >= m7945s.m24225h()) {
                return;
            }
            xn0 m24226g = m7945s.m24226g(this.f21752v);
            m7945s.m24222k(this.f21752v, new xn0(m24226g.m4968e(), m25887v, m24226g.m4966g().f5091b));
            this.f21749s.m7978a0(this.f21750t, m7945s);
            this.f21753w.m20585u();
            this.f21754x.mo7884a(this.f21755y[this.f21752v]);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f21756z.mo3478a();
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.daaw.oo$g */
    /* loaded from: classes.dex */
    public class C2462g implements TextWatcher {

        /* renamed from: p */
        public final /* synthetic */ boolean[] f21757p;

        /* renamed from: q */
        public final /* synthetic */ float f21758q;

        /* renamed from: r */
        public final /* synthetic */ float f21759r;

        /* renamed from: s */
        public final /* synthetic */ C3239un f21760s;

        /* renamed from: t */
        public final /* synthetic */ String f21761t;

        /* renamed from: u */
        public final /* synthetic */ dm0 f21762u;

        /* renamed from: v */
        public final /* synthetic */ int f21763v;

        /* renamed from: w */
        public final /* synthetic */ DialogFragmentC1593ho f21764w;

        /* renamed from: x */
        public final /* synthetic */ InterfaceC1153e0 f21765x;

        /* renamed from: y */
        public final /* synthetic */ EditText[] f21766y;

        /* renamed from: z */
        public final /* synthetic */ w40 f21767z;

        public C2462g(boolean[] zArr, float f, float f2, C3239un c3239un, String str, dm0 dm0Var, int i, DialogFragmentC1593ho dialogFragmentC1593ho, InterfaceC1153e0 interfaceC1153e0, EditText[] editTextArr, w40 w40Var) {
            this.f21757p = zArr;
            this.f21758q = f;
            this.f21759r = f2;
            this.f21760s = c3239un;
            this.f21761t = str;
            this.f21762u = dm0Var;
            this.f21763v = i;
            this.f21764w = dialogFragmentC1593ho;
            this.f21765x = interfaceC1153e0;
            this.f21766y = editTextArr;
            this.f21767z = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.f21757p[0]) {
                return;
            }
            float m25887v = br1.m25887v(editable.toString(), this.f21758q + (this.f21759r * 0.5f));
            dm0 m7945s = this.f21760s.m7945s(this.f21761t, new dm0(this.f21762u));
            if (this.f21763v >= m7945s.m24225h()) {
                return;
            }
            xn0 m24226g = m7945s.m24226g(this.f21763v);
            m7945s.m24222k(this.f21763v, new xn0(m24226g.m4968e(), m24226g.m4966g().f5090a, m25887v));
            this.f21760s.m7978a0(this.f21761t, m7945s);
            this.f21764w.m20585u();
            this.f21765x.mo7884a(this.f21766y[this.f21763v]);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f21767z.mo3478a();
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.daaw.oo$h */
    /* loaded from: classes.dex */
    public class C2463h implements AdapterView.OnItemSelectedListener {

        /* renamed from: p */
        public final /* synthetic */ DialogFragmentC1593ho f21768p;

        /* renamed from: q */
        public final /* synthetic */ String[] f21769q;

        /* renamed from: r */
        public final /* synthetic */ C3239un f21770r;

        /* renamed from: s */
        public final /* synthetic */ String f21771s;

        /* renamed from: t */
        public final /* synthetic */ dm0 f21772t;

        /* renamed from: u */
        public final /* synthetic */ int f21773u;

        /* renamed from: v */
        public final /* synthetic */ InterfaceC1153e0 f21774v;

        /* renamed from: w */
        public final /* synthetic */ Spinner[] f21775w;

        /* renamed from: x */
        public final /* synthetic */ w40 f21776x;

        public C2463h(DialogFragmentC1593ho dialogFragmentC1593ho, String[] strArr, C3239un c3239un, String str, dm0 dm0Var, int i, InterfaceC1153e0 interfaceC1153e0, Spinner[] spinnerArr, w40 w40Var) {
            this.f21768p = dialogFragmentC1593ho;
            this.f21769q = strArr;
            this.f21770r = c3239un;
            this.f21771s = str;
            this.f21772t = dm0Var;
            this.f21773u = i;
            this.f21774v = interfaceC1153e0;
            this.f21775w = spinnerArr;
            this.f21776x = w40Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            dm0 m7945s;
            this.f21768p.m20605a(adapterView);
            if (i >= 0) {
                String[] strArr = this.f21769q;
                if (i < strArr.length) {
                    str = strArr[i];
                    m7945s = this.f21770r.m7945s(this.f21771s, new dm0(this.f21772t));
                    if (this.f21773u < m7945s.m24225h()) {
                        return;
                    }
                    m7945s.m24222k(this.f21773u, new xn0(str, m7945s.m24226g(this.f21773u).m4966g()));
                    this.f21770r.m7978a0(this.f21771s, m7945s);
                    this.f21768p.m20585u();
                    this.f21774v.mo7884a(this.f21775w[this.f21773u]);
                    InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f21776x.mo3478a();
                    if (interfaceC1153e0 != null) {
                        interfaceC1153e0.mo7884a(null);
                        return;
                    }
                    return;
                }
            }
            str = "Constant";
            m7945s = this.f21770r.m7945s(this.f21771s, new dm0(this.f21772t));
            if (this.f21773u < m7945s.m24225h()) {
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: K */
    public static void m14121K(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, boolean z, w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, boolean z2, String str, String str2, float f, float f2, float f3) {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        EditText[] editTextArr;
        EditText[] editTextArr2;
        SeekBar[] seekBarArr;
        SeekBar[] seekBarArr2;
        View view;
        dm0 dm0Var = new dm0(new xn0("Constant", f, f));
        String[] strArr = z2 ? wn0.f31383b : wn0.f31382a;
        dm0 m7945s = c3239un.m7945s(str2, new dm0(dm0Var));
        if (m7945s.m24225h() == 0) {
            m7945s = new dm0(dm0Var);
            c3239un.m7978a0(str2, m7945s);
        }
        dm0 dm0Var2 = m7945s;
        View inflate = View.inflate(dialogFragmentC1593ho.getActivity(), z ? R.layout.dialog_customize_vis_elementdetail_var_bar : R.layout.dialog_customize_vis_element_var_bar, null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        View findViewById = inflate.findViewById(R.id.lineBarBg);
        View findViewById2 = inflate.findViewById(R.id.lineBarValue);
        int m24225h = dm0Var2.m24225h();
        SeekBar[] seekBarArr3 = new SeekBar[m24225h];
        SeekBar[] seekBarArr4 = new SeekBar[m24225h];
        EditText[] editTextArr3 = new EditText[m24225h];
        EditText[] editTextArr4 = new EditText[m24225h];
        TextView[] textViewArr3 = new TextView[m24225h];
        TextView[] textViewArr4 = new TextView[m24225h];
        Spinner[] spinnerArr = new Spinner[m24225h];
        String[] strArr2 = strArr;
        if (z) {
            Button button = (Button) inflate.findViewById(R.id.btnRemove);
            view = inflate;
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.varContainer);
            textViewArr = textViewArr4;
            textViewArr2 = textViewArr3;
            editTextArr = editTextArr4;
            editTextArr2 = editTextArr3;
            seekBarArr = seekBarArr4;
            seekBarArr2 = seekBarArr3;
            ((Button) inflate.findViewById(R.id.btnAdd)).setOnClickListener(new View$OnClickListenerC2456a(c3239un, str2, dm0Var, f, dialogFragmentC1593ho));
            button.setOnClickListener(new View$OnClickListenerC2457b(c3239un, str2, dm0Var, dialogFragmentC1593ho));
            int i = 0;
            while (i < m24225h) {
                xn0 m24226g = dm0Var2.m24226g(i);
                View inflate2 = View.inflate(dialogFragmentC1593ho.getActivity(), R.layout.dialog_customize_vis_element_var_bar_elem, null);
                seekBarArr2[i] = (SeekBar) inflate2.findViewById(R.id.seekBar);
                seekBarArr[i] = (SeekBar) inflate2.findViewById(R.id.seekBar2);
                editTextArr2[i] = (EditText) inflate2.findViewById(R.id.editTxt);
                editTextArr[i] = (EditText) inflate2.findViewById(R.id.editTxt2);
                textViewArr2[i] = (TextView) inflate2.findViewById(R.id.hintA);
                textViewArr[i] = (TextView) inflate2.findViewById(R.id.hintB);
                spinnerArr[i] = (Spinner) inflate2.findViewById(R.id.spinnerType);
                ViewGroup viewGroup3 = viewGroup2;
                viewGroup3.addView(inflate2);
                int i2 = (int) ((f2 - f) / f3);
                seekBarArr2[i].setMax(i2);
                seekBarArr[i].setMax(i2);
                String[] strArr3 = strArr2;
                int m25904e = br1.m25904e(strArr3, m24226g.m4968e());
                String[] strArr4 = new String[strArr3.length];
                for (int i3 = 0; i3 < strArr3.length; i3++) {
                    int m5945a = wn0.m5945a(strArr3[i3]);
                    if (m5945a > 0) {
                        strArr4[i3] = inflate2.getContext().getString(m5945a);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("missing t ");
                        sb.append(strArr3[i3]);
                        strArr4[i3] = strArr3[i3];
                    }
                }
                spinnerArr[i].setAdapter((SpinnerAdapter) new ArrayAdapter(dialogFragmentC1593ho.getActivity(), 17367048, strArr4));
                if (m25904e >= 0) {
                    spinnerArr[i].setSelection(m25904e, false);
                }
                dialogFragmentC1593ho.m20604b(spinnerArr[i]);
                i++;
                viewGroup2 = viewGroup3;
                strArr2 = strArr3;
            }
        } else {
            textViewArr = textViewArr4;
            textViewArr2 = textViewArr3;
            editTextArr = editTextArr4;
            editTextArr2 = editTextArr3;
            seekBarArr = seekBarArr4;
            seekBarArr2 = seekBarArr3;
            view = inflate;
        }
        String[] strArr5 = strArr2;
        int i4 = m24225h;
        boolean[] zArr = {false};
        View view2 = view;
        C2458c c2458c = new C2458c(zArr, c3239un, str2, dm0Var, z2, textView, viewGroup, findViewById, findViewById2, f2, f, f3, z, i4, seekBarArr2, seekBarArr, editTextArr2, editTextArr, spinnerArr, strArr5, textViewArr2, textViewArr);
        View view3 = view2;
        InterfaceC1153e0<Object> m14925k = C2323no.m14925k(dialogFragmentC1593ho, c3239un, z, view2, str2, c2458c);
        if (z) {
            int i5 = 0;
            while (i5 < i4) {
                String[] strArr6 = strArr5;
                int i6 = i5;
                dm0 dm0Var3 = dm0Var;
                boolean[] zArr2 = zArr;
                seekBarArr2[i5].setOnSeekBarChangeListener(new C2459d(zArr, f3, f, c3239un, str2, dm0Var, i6, dialogFragmentC1593ho, m14925k, seekBarArr2, w40Var));
                seekBarArr[i5].setOnSeekBarChangeListener(new C2460e(zArr2, f3, f, c3239un, str2, dm0Var3, i6, dialogFragmentC1593ho, m14925k, seekBarArr, w40Var));
                editTextArr2[i5].addTextChangedListener(new C2461f(zArr2, f, f2, c3239un, str2, dm0Var3, i6, dialogFragmentC1593ho, m14925k, editTextArr2, w40Var));
                editTextArr[i5].addTextChangedListener(new C2462g(zArr2, f, f2, c3239un, str2, dm0Var3, i6, dialogFragmentC1593ho, m14925k, editTextArr, w40Var));
                spinnerArr[i5].setOnItemSelectedListener(new C2463h(dialogFragmentC1593ho, strArr6, c3239un, str2, dm0Var3, i5, m14925k, spinnerArr, w40Var));
                i5++;
                i4 = i4;
                strArr5 = strArr6;
                view3 = view3;
                dm0Var = dm0Var3;
                zArr = zArr2;
            }
        }
        viewGroup.addView(view3);
    }

    /* renamed from: L */
    public static String m14120L(String str, Context context) {
        int m14914v = C2323no.m14914v(str);
        return (m14914v <= 0 || context == null) ? str : context.getString(m14914v);
    }
}

package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TimePicker;
import com.daaw.C1148dx;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.PrControls.PrEditText;
import com.daaw.dv1;
import com.daaw.qw1;
import com.daaw.ww1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class dv1 extends DialogFragment {

    /* renamed from: M */
    public static tw1<Fragment, C0645al, C1143d, Boolean> f7838M = new tw1<>();

    /* renamed from: N */
    public static pw1 f7839N = new pw1();

    /* renamed from: O */
    public static sw1<Fragment, C0645al, String> f7840O = new sw1<>();

    /* renamed from: P */
    public static sw1<dv1, Integer, Intent> f7841P = new sw1<>();

    /* renamed from: Q */
    public static pw1 f7842Q = new pw1();

    /* renamed from: R */
    public static vw1<C1143d> f7843R = new vw1<>();

    /* renamed from: S */
    public static final qw1<String> f7844S = new qw1<>();

    /* renamed from: T */
    public static final qw1<C1145f> f7845T = new qw1<>();

    /* renamed from: A */
    public PrEditText f7846A;

    /* renamed from: B */
    public CheckBox f7847B;

    /* renamed from: C */
    public CheckBox f7848C;

    /* renamed from: D */
    public CheckBox f7849D;

    /* renamed from: E */
    public CheckBox f7850E;

    /* renamed from: F */
    public PrEditText f7851F;

    /* renamed from: G */
    public CheckBox f7852G;

    /* renamed from: H */
    public Button f7853H;

    /* renamed from: I */
    public Button f7854I;

    /* renamed from: q */
    public fv1 f7859q;

    /* renamed from: r */
    public ViewGroup f7860r;

    /* renamed from: s */
    public Button f7861s;

    /* renamed from: t */
    public EditText f7862t;

    /* renamed from: u */
    public Spinner f7863u;

    /* renamed from: v */
    public Spinner f7864v;

    /* renamed from: w */
    public Spinner f7865w;

    /* renamed from: x */
    public PrEditText f7866x;

    /* renamed from: y */
    public PrEditText f7867y;

    /* renamed from: z */
    public PrEditText f7868z;

    /* renamed from: p */
    public C1143d f7858p = null;

    /* renamed from: J */
    public int f7855J = 0;

    /* renamed from: K */
    public int f7856K = 0;

    /* renamed from: L */
    public final List<Object> f7857L = new LinkedList();

    /* renamed from: com.daaw.dv1$a */
    /* loaded from: classes.dex */
    public class C1140a implements AdapterView.OnItemSelectedListener {
        public C1140a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            dv1.this.m23902o();
            dv1.this.m23921H();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.daaw.dv1$b */
    /* loaded from: classes.dex */
    public class C1141b implements AdapterView.OnItemSelectedListener {

        /* renamed from: p */
        public final /* synthetic */ C1143d f7870p;

        public C1141b(C1143d c1143d) {
            this.f7870p = c1143d;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i - 1;
            if (i2 >= 0) {
                dv1.this.m23925D(this.f7870p.m23888c(i2));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.daaw.dv1$c */
    /* loaded from: classes.dex */
    public class C1142c implements AdapterView.OnItemSelectedListener {
        public C1142c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            dv1.this.m23902o();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.daaw.dv1$d */
    /* loaded from: classes.dex */
    public static class C1143d {

        /* renamed from: a */
        public C1144e[] f7873a;

        /* renamed from: b */
        public int f7874b;

        /* renamed from: c */
        public C1144e f7875c;

        /* renamed from: d */
        public List<C1148dx.C1149a> f7876d;

        /* renamed from: e */
        public int f7877e;

        /* renamed from: f */
        public String f7878f;

        /* renamed from: g */
        public String f7879g;

        /* renamed from: h */
        public boolean f7880h;

        /* renamed from: i */
        public int f7881i;

        /* renamed from: j */
        public int f7882j;

        /* renamed from: k */
        public boolean f7883k;

        /* renamed from: l */
        public boolean f7884l;

        /* renamed from: m */
        public boolean f7885m;

        /* renamed from: b */
        public void m23889b(String str) {
            String[] m23252a = er1.m23252a(";", str);
            if (m23252a.length != 9) {
                return;
            }
            this.f7874b = br1.m25885x(m23252a[0], this.f7874b);
            this.f7877e = br1.m25885x(m23252a[1], this.f7877e);
            this.f7878f = br1.m25916A(m23252a[2], this.f7878f);
            this.f7880h = br1.m25889t(m23252a[4], this.f7880h);
            this.f7883k = br1.m25889t(m23252a[7], this.f7883k);
            this.f7884l = br1.m25889t(m23252a[8], this.f7884l);
        }

        /* renamed from: c */
        public C1144e m23888c(int i) {
            if (i >= 0) {
                C1144e[] c1144eArr = this.f7873a;
                if (i >= c1144eArr.length) {
                    return null;
                }
                return c1144eArr[i];
            }
            return null;
        }

        /* renamed from: d */
        public C1144e m23887d(int i) {
            C1144e m23888c = m23888c(i);
            if (m23888c != null) {
                return m23888c.clone();
            }
            return null;
        }

        /* renamed from: e */
        public final String[] m23886e(String str) {
            int i = 1;
            int i2 = 0;
            String[] strArr = new String[this.f7873a.length + (str != null ? 1 : 0)];
            if (str != null) {
                strArr[0] = str;
            } else {
                i = 0;
            }
            while (true) {
                C1144e[] c1144eArr = this.f7873a;
                if (i2 >= c1144eArr.length) {
                    return strArr;
                }
                strArr[i2 + i] = c1144eArr[i2].f7887b;
                i2++;
            }
        }

        /* renamed from: f */
        public C1148dx.C1149a m23885f(int i) {
            List<C1148dx.C1149a> list = this.f7876d;
            if (list != null && i >= 0 && i < list.size()) {
                return this.f7876d.get(i);
            }
            return null;
        }

        /* renamed from: g */
        public String m23884g() {
            return this.f7874b + ";" + this.f7877e + ";" + er1.m23250c(';', '_', this.f7878f) + ";" + er1.m23250c(';', '_', this.f7879g) + ";" + this.f7880h + ";" + this.f7881i + ";" + this.f7882j + ";" + this.f7883k + ";" + this.f7884l;
        }
    }

    /* renamed from: com.daaw.dv1$e */
    /* loaded from: classes.dex */
    public static class C1144e {

        /* renamed from: a */
        public int f7886a;

        /* renamed from: b */
        public String f7887b;

        /* renamed from: c */
        public int f7888c;

        /* renamed from: d */
        public int f7889d;

        /* renamed from: e */
        public int f7890e;

        /* renamed from: f */
        public float f7891f;

        /* renamed from: g */
        public int f7892g;

        /* renamed from: h */
        public float f7893h;

        /* renamed from: i */
        public int f7894i;

        public C1144e(int i, int i2, int i3, int i4, float f, int i5, float f2, int i6) {
            this.f7886a = i;
            this.f7888c = i2;
            this.f7889d = i3;
            this.f7890e = i4;
            this.f7891f = f;
            this.f7892g = i5;
            this.f7893h = f2;
            this.f7894i = i6;
            this.f7887b = m23879e();
        }

        public C1144e(int i, int i2, int i3, int i4, float f, boolean z, int i5) {
            this.f7886a = i;
            this.f7888c = i2;
            this.f7889d = i3;
            this.f7890e = i4;
            this.f7891f = f;
            this.f7892g = 2;
            this.f7893h = z ? 384.0f : 256.0f;
            this.f7894i = i5;
            this.f7887b = m23879e();
        }

        /* renamed from: d */
        public static C1144e m23880d(C1144e[] c1144eArr) {
            if (c1144eArr == null || c1144eArr.length <= 0) {
                return new C1144e(0, 0, 0, 0, 0.0f, 0, 0.0f, 0);
            }
            C1144e clone = c1144eArr[0].clone();
            for (C1144e c1144e : c1144eArr) {
                clone.f7888c = Math.max(clone.f7888c, c1144e.f7888c);
                clone.f7889d = Math.max(clone.f7889d, c1144e.f7889d);
                clone.f7890e = Math.max(clone.f7890e, c1144e.f7890e);
                clone.f7891f = Math.max(clone.f7891f, c1144e.f7891f);
                clone.f7892g = Math.max(clone.f7892g, c1144e.f7892g);
                clone.f7893h = Math.max(clone.f7893h, c1144e.f7893h);
                clone.f7894i = Math.max(clone.f7894i, c1144e.f7894i);
            }
            clone.f7887b = clone.m23879e();
            return clone;
        }

        /* renamed from: a */
        public C1144e clone() {
            try {
                super.clone();
            } catch (Exception unused) {
            }
            return new C1144e(this.f7886a, this.f7888c, this.f7889d, this.f7890e, this.f7891f, this.f7892g, this.f7893h, this.f7894i);
        }

        /* renamed from: b */
        public void m23882b(String str) {
            String[] m23252a = er1.m23252a(";", str);
            if (m23252a.length != 9) {
                return;
            }
            this.f7886a = br1.m25885x(m23252a[0], this.f7886a);
            this.f7887b = br1.m25916A(m23252a[1], this.f7887b);
            this.f7888c = br1.m25885x(m23252a[2], this.f7888c);
            this.f7889d = br1.m25885x(m23252a[3], this.f7889d);
            this.f7890e = br1.m25885x(m23252a[4], this.f7890e);
            this.f7891f = br1.m25887v(m23252a[5], this.f7891f);
            this.f7892g = br1.m25885x(m23252a[6], this.f7892g);
            this.f7893h = br1.m25887v(m23252a[7], this.f7893h);
            this.f7894i = br1.m25885x(m23252a[8], this.f7894i);
        }

        /* renamed from: c */
        public void m23881c(C1144e c1144e) {
            int max = Math.max(c1144e.f7888c, c1144e.f7889d);
            ww1<Integer, Boolean> ww1Var = oy0.f22099c;
            Integer valueOf = Integer.valueOf((int) R.id.editTxtWidth);
            Boolean bool = Boolean.FALSE;
            if (!ww1Var.m5753a(valueOf, bool).booleanValue()) {
                this.f7888c = Math.min(this.f7888c, max);
            }
            if (!ww1Var.m5753a(Integer.valueOf((int) R.id.editTxtHeight), bool).booleanValue()) {
                this.f7889d = Math.min(this.f7889d, max);
            }
            if (!ww1Var.m5753a(Integer.valueOf((int) R.id.editTxtFramerate), bool).booleanValue()) {
                this.f7890e = Math.min(this.f7890e, c1144e.f7890e);
            }
            if (!ww1Var.m5753a(Integer.valueOf((int) R.id.editTxtBitrate), bool).booleanValue()) {
                this.f7891f = Math.min(this.f7891f, c1144e.f7891f);
            }
            this.f7892g = Math.min(this.f7892g, c1144e.f7892g);
            if (!ww1Var.m5753a(Integer.valueOf((int) R.id.editAudioBitrate), bool).booleanValue()) {
                this.f7893h = Math.min(this.f7893h, c1144e.f7893h);
            }
            this.f7894i = Math.min(this.f7894i, c1144e.f7894i);
            this.f7887b = m23879e();
        }

        /* renamed from: e */
        public String m23879e() {
            int i = this.f7886a;
            return String.format(Locale.US, "%s%dp @%d %.1fMbps%s %.1fKbps %s", i == 1 ? " " : i == 2 ? "  " : i == 3 ? "   " : i == 4 ? "    " : "", Integer.valueOf(this.f7889d), Integer.valueOf(this.f7890e), Float.valueOf(this.f7891f), "", Float.valueOf(this.f7893h), this.f7894i == 0 ? "L" : "H");
        }

        /* renamed from: f */
        public String m23878f() {
            return this.f7886a + ";" + er1.m23250c(';', '_', this.f7887b) + ";" + this.f7888c + ";" + this.f7889d + ";" + this.f7890e + ";" + this.f7891f + ";" + this.f7892g + ";" + this.f7893h + ";" + this.f7894i;
        }
    }

    /* renamed from: com.daaw.dv1$f */
    /* loaded from: classes.dex */
    public static class C1145f {

        /* renamed from: a */
        public boolean f7895a;

        /* renamed from: b */
        public boolean f7896b;

        /* renamed from: c */
        public int f7897c;

        /* renamed from: d */
        public int f7898d;

        /* renamed from: e */
        public String f7899e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m23928A(TimePicker timePicker, int i, int i2) {
        m23923F((i2 + (i * 60)) * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m23927B(View view) {
        Activity activity = getActivity();
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.daaw.su1
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                dv1.this.m23928A(timePicker, i, i2);
            }
        };
        int i = this.f7856K;
        new TimePickerDialog(activity, onTimeSetListener, i / 60000, (i % 60000) / 1000, true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ Boolean m23926C(Boolean bool) {
        if (!nc0.f19989g.m6692a(Boolean.FALSE).booleanValue()) {
            m23919J(f7843R.m6692a(null));
        } else if (!new az0().m26590d()) {
            m23917L();
        }
        return Boolean.TRUE;
    }

    /* renamed from: I */
    public static void m23920I(String str) {
        f7844S.m12018a(str);
    }

    /* renamed from: K */
    public static void m23918K(C1145f c1145f) {
        f7845T.m12018a(c1145f);
    }

    /* renamed from: p */
    public static void m23901p(C0645al c0645al) {
        gr1.m21311x(new dv1(), "VisExportDialog", c0645al);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m23896u() {
        getDialog().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m23895v(View view) {
        f7838M.m8756a(this, new C0645al(view), m23900q(), Boolean.FALSE);
        this.f7852G.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m23894w(View view) {
        f7838M.m8756a(this, new C0645al(view), m23900q(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m23893x(View view) {
        f7840O.m9795a(this, new C0645al(view), this.f7861s.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m23892y(TimePicker timePicker, int i, int i2) {
        m23922G((i2 + (i * 60)) * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m23891z(View view) {
        Activity activity = getActivity();
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.daaw.uu1
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                dv1.this.m23892y(timePicker, i, i2);
            }
        };
        int i = this.f7855J;
        new TimePickerDialog(activity, onTimeSetListener, i / 60000, (i % 60000) / 1000, true).show();
    }

    /* renamed from: D */
    public final void m23925D(C1144e c1144e) {
        if (this.f7860r == null) {
            return;
        }
        m23921H();
        int i = c1144e.f7894i;
        if (i < 0 || i >= this.f7864v.getAdapter().getCount()) {
            this.f7864v.setSelection(0, false);
        } else {
            this.f7864v.setSelection(i, false);
        }
        this.f7864v.setOnItemSelectedListener(new C1142c());
        PrEditText prEditText = this.f7866x;
        prEditText.setText("" + c1144e.f7888c);
        PrEditText prEditText2 = this.f7867y;
        prEditText2.setText("" + c1144e.f7889d);
        PrEditText prEditText3 = this.f7868z;
        prEditText3.setText("" + c1144e.f7890e);
        PrEditText prEditText4 = this.f7846A;
        prEditText4.setText("" + c1144e.f7891f);
        this.f7850E.setChecked(c1144e.f7892g > 1);
        PrEditText prEditText5 = this.f7851F;
        prEditText5.setText("" + c1144e.f7893h);
    }

    /* renamed from: E */
    public final void m23924E(C1144e c1144e) {
        this.f7866x.setLimit(Integer.valueOf(c1144e.f7888c));
        this.f7867y.setLimit(Integer.valueOf(c1144e.f7889d));
        this.f7846A.setLimit(Integer.valueOf((int) c1144e.f7891f));
        this.f7868z.setLimit(Integer.valueOf(c1144e.f7890e));
        this.f7851F.setLimit(Integer.valueOf((int) c1144e.f7893h));
    }

    /* renamed from: F */
    public final void m23923F(int i) {
        int min = Math.min(this.f7858p.f7882j, Math.max(0, i));
        this.f7856K = min;
        this.f7854I.setText(br1.m25894o(min / 1000));
    }

    /* renamed from: G */
    public final void m23922G(int i) {
        int min = Math.min(this.f7858p.f7882j, Math.max(0, i));
        this.f7855J = min;
        this.f7853H.setText(br1.m25894o(min / 1000));
    }

    /* renamed from: H */
    public final void m23921H() {
        C1148dx.C1149a c1149a = this.f7858p.f7876d.get((int) this.f7863u.getSelectedItemId());
        boolean z = c1149a != null && c1149a.m23842c();
        ArrayList<String> m23846b = C1148dx.m23846b();
        if (z) {
            m23846b.add("High");
        }
        if (this.f7864v.getAdapter() == null || this.f7864v.getAdapter().getCount() != m23846b.size()) {
            int selectedItemPosition = this.f7864v.getSelectedItemPosition();
            this.f7864v.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), 17367048, m23846b));
            if (selectedItemPosition < 0 || selectedItemPosition >= m23846b.size()) {
                return;
            }
            this.f7864v.setSelection(selectedItemPosition, false);
        }
    }

    /* renamed from: J */
    public void m23919J(C1143d c1143d) {
        Activity activity;
        if (this.f7860r == null) {
            return;
        }
        this.f7858p = c1143d;
        if (c1143d == null || (activity = getActivity()) == null) {
            return;
        }
        this.f7861s.setText(c1143d.f7878f);
        this.f7862t.setText(c1143d.f7879g);
        int i = c1143d.f7877e;
        List<C1148dx.C1149a> list = c1143d.f7876d;
        String[] m23845c = list != null ? C1148dx.m23845c(list) : new String[]{"<empty>"};
        this.f7863u.setAdapter((SpinnerAdapter) new ArrayAdapter(activity, 17367048, m23845c));
        if (i < 0 || i >= m23845c.length) {
            this.f7863u.setSelection(0, false);
        } else {
            this.f7863u.setSelection(i, false);
        }
        this.f7863u.setOnItemSelectedListener(new C1140a());
        int i2 = c1143d.f7874b;
        this.f7865w.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), 17367048, c1143d.m23886e(this.f7865w.getResources().getString(R.string.vis_export_choose_preset))));
        this.f7865w.setSelection(i2, false);
        this.f7865w.setOnItemSelectedListener(new C1141b(c1143d));
        this.f7847B.setChecked(c1143d.f7884l);
        this.f7848C.setChecked(c1143d.f7883k);
        this.f7849D.setChecked(c1143d.f7880h);
        m23925D(c1143d.f7875c);
        m23922G(c1143d.f7881i);
        m23923F(c1143d.f7882j);
        vw1<Boolean> vw1Var = nc0.f19989g;
        Boolean bool = Boolean.FALSE;
        if (vw1Var.m6692a(bool).booleanValue()) {
            return;
        }
        m23924E(C1144e.m23880d(c1143d.f7873a));
        m23925D(c1143d.m23888c(Math.max(c1143d.f7874b, 0)));
        m23917L();
        Button button = this.f7854I;
        button.setEnabled(oy0.f22099c.m5753a(Integer.valueOf(button.getId()), bool).booleanValue());
    }

    /* renamed from: L */
    public void m23917L() {
        if (oy0.f22099c.m5753a(Integer.valueOf(this.f7852G.getId()), Boolean.FALSE).booleanValue()) {
            this.f7852G.setEnabled(true);
            return;
        }
        this.f7852G.setEnabled(false);
        this.f7852G.setChecked(false);
    }

    /* renamed from: o */
    public final void m23902o() {
        boolean z;
        boolean z2;
        int selectedItemId;
        boolean z3 = Build.VERSION.SDK_INT > 23;
        if (z3 && this.f7858p.f7876d != null) {
            long selectedItemId2 = this.f7863u.getSelectedItemId();
            if (selectedItemId2 >= 0 && selectedItemId2 < this.f7858p.f7876d.size()) {
                C1148dx.C1149a c1149a = this.f7858p.f7876d.get((int) selectedItemId2);
                z = "video/avc".equals(c1149a.m23844a());
                z2 = c1149a.m23842c();
                selectedItemId = (int) this.f7864v.getSelectedItemId();
                if ((selectedItemId == 2 && !z2) || (selectedItemId > 0 && !z)) {
                    this.f7864v.setSelection(0, false);
                }
                this.f7864v.setEnabled(z);
            }
        }
        z = z3;
        z2 = false;
        selectedItemId = (int) this.f7864v.getSelectedItemId();
        if (selectedItemId == 2) {
            this.f7864v.setSelection(0, false);
            this.f7864v.setEnabled(z);
        }
        this.f7864v.setSelection(0, false);
        this.f7864v.setEnabled(z);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            f7841P.m9795a(this, Integer.valueOf(i), intent);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f7844S.m12017b(new qw1.InterfaceC2788a() { // from class: com.daaw.bv1
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                dv1.this.m23899r((String) obj);
            }
        }, this.f7857L);
        f7845T.m12017b(new qw1.InterfaceC2788a() { // from class: com.daaw.av1
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                dv1.this.m23898s((dv1.C1145f) obj);
            }
        }, this.f7857L);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        try {
            View inflate = View.inflate(getActivity(), R.layout.dialog_export_vis, null);
            builder.setView(inflate);
            this.f7860r = (ViewGroup) inflate.findViewById(R.id.layoutContent);
            Button button = (Button) inflate.findViewById(R.id.btnExport);
            button.setTextColor(gr1.m21321n(button, R.attr.colorAccent));
            button.setSelected(true);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.yu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.m23895v(view);
                }
            });
            Button button2 = (Button) inflate.findViewById(R.id.btnExportPreview);
            button2.setTextColor(gr1.m21321n(button, R.attr.colorAccent));
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.wu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.m23894w(view);
                }
            });
            Button button3 = (Button) inflate.findViewById(R.id.btnDestDir);
            this.f7861s = button3;
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.xu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.m23893x(view);
                }
            });
            this.f7862t = (EditText) inflate.findViewById(R.id.editTxtFilename);
            this.f7865w = (Spinner) inflate.findViewById(R.id.spinnerProfile);
            this.f7863u = (Spinner) inflate.findViewById(R.id.spinnerVideoCodec);
            this.f7864v = (Spinner) inflate.findViewById(R.id.spinnerVideoCodecProfile);
            this.f7866x = (PrEditText) inflate.findViewById(R.id.editTxtWidth);
            this.f7867y = (PrEditText) inflate.findViewById(R.id.editTxtHeight);
            this.f7868z = (PrEditText) inflate.findViewById(R.id.editTxtFramerate);
            this.f7846A = (PrEditText) inflate.findViewById(R.id.editTxtBitrate);
            this.f7847B = (CheckBox) inflate.findViewById(R.id.chkForceCompatibleWh);
            this.f7848C = (CheckBox) inflate.findViewById(R.id.chkBlurQuality);
            this.f7849D = (CheckBox) inflate.findViewById(R.id.chkExportAudio);
            this.f7850E = (CheckBox) inflate.findViewById(R.id.chkAudioStereo);
            this.f7851F = (PrEditText) inflate.findViewById(R.id.editAudioBitrate);
            this.f7852G = (CheckBox) inflate.findViewById(R.id.chkHideAppLogo);
            az0 az0Var = new az0();
            if (nc0.f19989g.m6692a(Boolean.FALSE).booleanValue() && az0Var.m26593a()) {
                this.f7852G.setVisibility(8);
                inflate.findViewById(R.id.txtHideAppLogo).setVisibility(8);
                inflate.findViewById(R.id.app_logo_ad_icon).setVisibility(8);
            }
            this.f7853H = (Button) inflate.findViewById(R.id.btnStartTime);
            this.f7854I = (Button) inflate.findViewById(R.id.btnEndTime);
            this.f7853H.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.zu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.m23891z(view);
                }
            });
            this.f7854I.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.vu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.m23927B(view);
                }
            });
            AlertDialog create = builder.create();
            create.setCancelable(false);
            create.setCanceledOnTouchOutside(false);
            m23919J(f7843R.m6692a(null));
            nc0.f19996n.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.cv1
                @Override // com.daaw.ww1.InterfaceC3477a
                /* renamed from: b */
                public final Object mo5751b(Object obj) {
                    Boolean m23926C;
                    m23926C = dv1.this.m23926C((Boolean) obj);
                    return m23926C;
                }
            }, this.f7857L);
            return create;
        } catch (Exception e) {
            lz1.m16364b(e, "Dialog inflation error");
            return null;
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        f7844S.m12016c(this.f7857L);
        f7845T.m12016c(this.f7857L);
        this.f7857L.clear();
        this.f7860r = null;
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f7839N.m12990a();
        f7842Q.m12990a();
    }

    /* renamed from: q */
    public final C1143d m23900q() {
        C1143d c1143d = new C1143d();
        c1143d.f7875c = new C1144e(0, br1.m25886w(this.f7866x.getText().toString()), br1.m25886w(this.f7867y.getText().toString()), br1.m25886w(this.f7868z.getText().toString()), br1.m25888u(this.f7846A.getText().toString()), this.f7850E.isChecked() ? 2 : 1, br1.m25888u(this.f7851F.getText().toString()), this.f7864v.getSelectedItemPosition());
        c1143d.f7876d = this.f7858p.f7876d;
        c1143d.f7877e = this.f7863u.getSelectedItemPosition();
        c1143d.f7878f = this.f7861s.getText().toString();
        c1143d.f7879g = this.f7862t.getText().toString();
        c1143d.f7884l = this.f7847B.isChecked();
        c1143d.f7880h = this.f7849D.isChecked();
        c1143d.f7881i = this.f7855J;
        c1143d.f7882j = this.f7856K;
        c1143d.f7883k = this.f7848C.isChecked();
        c1143d.f7885m = this.f7852G.isChecked();
        return c1143d;
    }

    /* renamed from: r */
    public final void m23899r(String str) {
        if (m23897t()) {
            this.f7861s.setText(str);
        }
    }

    /* renamed from: s */
    public final void m23898s(C1145f c1145f) {
        if (m23897t()) {
            if (!c1145f.f7895a) {
                fv1 fv1Var = this.f7859q;
                if (fv1Var == null || !fv1Var.isVisible()) {
                    return;
                }
                this.f7859q.dismissAllowingStateLoss();
                this.f7860r.post(new Runnable() { // from class: com.daaw.tu1
                    @Override // java.lang.Runnable
                    public final void run() {
                        dv1.this.m23896u();
                    }
                });
                return;
            }
            if (this.f7859q == null) {
                this.f7859q = fv1.m22244g();
            }
            if (!this.f7859q.isVisible()) {
                this.f7859q.show(getActivity().getFragmentManager(), "progress");
            }
            getDialog().hide();
            this.f7859q.m22243h(c1145f);
        }
    }

    /* renamed from: t */
    public boolean m23897t() {
        return this.f7860r != null;
    }
}

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
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.PrControls.PrEditText;
import com.daaw.dv1;
import com.daaw.dx;
import com.daaw.qw1;
import com.daaw.ww1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class dv1 extends DialogFragment {
    public static tw1<Fragment, al, d, Boolean> M = new tw1<>();
    public static pw1 N = new pw1();
    public static sw1<Fragment, al, String> O = new sw1<>();
    public static sw1<dv1, Integer, Intent> P = new sw1<>();
    public static pw1 Q = new pw1();
    public static vw1<d> R = new vw1<>();
    public static final qw1<String> S = new qw1<>();
    public static final qw1<f> T = new qw1<>();
    public PrEditText A;
    public CheckBox B;
    public CheckBox C;
    public CheckBox D;
    public CheckBox E;
    public PrEditText F;
    public CheckBox G;
    public Button H;
    public Button I;
    public fv1 q;
    public ViewGroup r;
    public Button s;
    public EditText t;
    public Spinner u;
    public Spinner v;
    public Spinner w;
    public PrEditText x;
    public PrEditText y;
    public PrEditText z;
    public d p = null;
    public int J = 0;
    public int K = 0;
    public final List<Object> L = new LinkedList();

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            dv1.this.o();
            dv1.this.H();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ d p;

        public b(d dVar) {
            this.p = dVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i - 1;
            if (i2 >= 0) {
                dv1.this.D(this.p.c(i2));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            dv1.this.o();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public e[] a;
        public int b;
        public e c;
        public List<dx.a> d;
        public int e;
        public String f;
        public String g;
        public boolean h;
        public int i;
        public int j;
        public boolean k;
        public boolean l;
        public boolean m;

        public void b(String str) {
            String[] a = er1.a(";", str);
            if (a.length != 9) {
                return;
            }
            this.b = br1.x(a[0], this.b);
            this.e = br1.x(a[1], this.e);
            this.f = br1.A(a[2], this.f);
            this.h = br1.t(a[4], this.h);
            this.k = br1.t(a[7], this.k);
            this.l = br1.t(a[8], this.l);
        }

        public e c(int i) {
            if (i >= 0) {
                e[] eVarArr = this.a;
                if (i >= eVarArr.length) {
                    return null;
                }
                return eVarArr[i];
            }
            return null;
        }

        public e d(int i) {
            e c = c(i);
            if (c != null) {
                return c.clone();
            }
            return null;
        }

        public final String[] e(String str) {
            int i = 1;
            int i2 = 0;
            String[] strArr = new String[this.a.length + (str != null ? 1 : 0)];
            if (str != null) {
                strArr[0] = str;
            } else {
                i = 0;
            }
            while (true) {
                e[] eVarArr = this.a;
                if (i2 >= eVarArr.length) {
                    return strArr;
                }
                strArr[i2 + i] = eVarArr[i2].b;
                i2++;
            }
        }

        public dx.a f(int i) {
            List<dx.a> list = this.d;
            if (list != null && i >= 0 && i < list.size()) {
                return this.d.get(i);
            }
            return null;
        }

        public String g() {
            return this.b + ";" + this.e + ";" + er1.c(';', '_', this.f) + ";" + er1.c(';', '_', this.g) + ";" + this.h + ";" + this.i + ";" + this.j + ";" + this.k + ";" + this.l;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public int a;
        public String b;
        public int c;
        public int d;
        public int e;
        public float f;
        public int g;
        public float h;
        public int i;

        public e(int i, int i2, int i3, int i4, float f, int i5, float f2, int i6) {
            this.a = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = f;
            this.g = i5;
            this.h = f2;
            this.i = i6;
            this.b = e();
        }

        public e(int i, int i2, int i3, int i4, float f, boolean z, int i5) {
            this.a = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = f;
            this.g = 2;
            this.h = z ? 384.0f : 256.0f;
            this.i = i5;
            this.b = e();
        }

        public static e d(e[] eVarArr) {
            if (eVarArr == null || eVarArr.length <= 0) {
                return new e(0, 0, 0, 0, 0.0f, 0, 0.0f, 0);
            }
            e clone = eVarArr[0].clone();
            for (e eVar : eVarArr) {
                clone.c = Math.max(clone.c, eVar.c);
                clone.d = Math.max(clone.d, eVar.d);
                clone.e = Math.max(clone.e, eVar.e);
                clone.f = Math.max(clone.f, eVar.f);
                clone.g = Math.max(clone.g, eVar.g);
                clone.h = Math.max(clone.h, eVar.h);
                clone.i = Math.max(clone.i, eVar.i);
            }
            clone.b = clone.e();
            return clone;
        }

        /* renamed from: a */
        public e clone() {
            try {
                super.clone();
            } catch (Exception unused) {
            }
            return new e(this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public void b(String str) {
            String[] a = er1.a(";", str);
            if (a.length != 9) {
                return;
            }
            this.a = br1.x(a[0], this.a);
            this.b = br1.A(a[1], this.b);
            this.c = br1.x(a[2], this.c);
            this.d = br1.x(a[3], this.d);
            this.e = br1.x(a[4], this.e);
            this.f = br1.v(a[5], this.f);
            this.g = br1.x(a[6], this.g);
            this.h = br1.v(a[7], this.h);
            this.i = br1.x(a[8], this.i);
        }

        public void c(e eVar) {
            int max = Math.max(eVar.c, eVar.d);
            ww1<Integer, Boolean> ww1Var = oy0.c;
            Integer valueOf = Integer.valueOf((int) R.id.editTxtWidth);
            Boolean bool = Boolean.FALSE;
            if (!ww1Var.a(valueOf, bool).booleanValue()) {
                this.c = Math.min(this.c, max);
            }
            if (!ww1Var.a(Integer.valueOf((int) R.id.editTxtHeight), bool).booleanValue()) {
                this.d = Math.min(this.d, max);
            }
            if (!ww1Var.a(Integer.valueOf((int) R.id.editTxtFramerate), bool).booleanValue()) {
                this.e = Math.min(this.e, eVar.e);
            }
            if (!ww1Var.a(Integer.valueOf((int) R.id.editTxtBitrate), bool).booleanValue()) {
                this.f = Math.min(this.f, eVar.f);
            }
            this.g = Math.min(this.g, eVar.g);
            if (!ww1Var.a(Integer.valueOf((int) R.id.editAudioBitrate), bool).booleanValue()) {
                this.h = Math.min(this.h, eVar.h);
            }
            this.i = Math.min(this.i, eVar.i);
            this.b = e();
        }

        public String e() {
            int i = this.a;
            return String.format(Locale.US, "%s%dp @%d %.1fMbps%s %.1fKbps %s", i == 1 ? " " : i == 2 ? "  " : i == 3 ? "   " : i == 4 ? "    " : "", Integer.valueOf(this.d), Integer.valueOf(this.e), Float.valueOf(this.f), "", Float.valueOf(this.h), this.i == 0 ? "L" : "H");
        }

        public String f() {
            return this.a + ";" + er1.c(';', '_', this.b) + ";" + this.c + ";" + this.d + ";" + this.e + ";" + this.f + ";" + this.g + ";" + this.h + ";" + this.i;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public String e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(TimePicker timePicker, int i, int i2) {
        F((i2 + (i * 60)) * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        Activity activity = getActivity();
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.daaw.su1
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                dv1.this.A(timePicker, i, i2);
            }
        };
        int i = this.K;
        new TimePickerDialog(activity, onTimeSetListener, i / 60000, (i % 60000) / 1000, true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean C(Boolean bool) {
        if (!nc0.g.a(Boolean.FALSE).booleanValue()) {
            J(R.a(null));
        } else if (!new az0().d()) {
            L();
        }
        return Boolean.TRUE;
    }

    public static void I(String str) {
        S.a(str);
    }

    public static void K(f fVar) {
        T.a(fVar);
    }

    public static void p(al alVar) {
        gr1.x(new dv1(), "VisExportDialog", alVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        getDialog().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(View view) {
        M.a(this, new al(view), q(), Boolean.FALSE);
        this.G.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        M.a(this, new al(view), q(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(View view) {
        O.a(this, new al(view), this.s.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(TimePicker timePicker, int i, int i2) {
        G((i2 + (i * 60)) * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view) {
        Activity activity = getActivity();
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.daaw.uu1
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                dv1.this.y(timePicker, i, i2);
            }
        };
        int i = this.J;
        new TimePickerDialog(activity, onTimeSetListener, i / 60000, (i % 60000) / 1000, true).show();
    }

    public final void D(e eVar) {
        if (this.r == null) {
            return;
        }
        H();
        int i = eVar.i;
        if (i < 0 || i >= this.v.getAdapter().getCount()) {
            this.v.setSelection(0, false);
        } else {
            this.v.setSelection(i, false);
        }
        this.v.setOnItemSelectedListener(new c());
        PrEditText prEditText = this.x;
        prEditText.setText("" + eVar.c);
        PrEditText prEditText2 = this.y;
        prEditText2.setText("" + eVar.d);
        PrEditText prEditText3 = this.z;
        prEditText3.setText("" + eVar.e);
        PrEditText prEditText4 = this.A;
        prEditText4.setText("" + eVar.f);
        this.E.setChecked(eVar.g > 1);
        PrEditText prEditText5 = this.F;
        prEditText5.setText("" + eVar.h);
    }

    public final void E(e eVar) {
        this.x.setLimit(Integer.valueOf(eVar.c));
        this.y.setLimit(Integer.valueOf(eVar.d));
        this.A.setLimit(Integer.valueOf((int) eVar.f));
        this.z.setLimit(Integer.valueOf(eVar.e));
        this.F.setLimit(Integer.valueOf((int) eVar.h));
    }

    public final void F(int i) {
        int min = Math.min(this.p.j, Math.max(0, i));
        this.K = min;
        this.I.setText(br1.o(min / 1000));
    }

    public final void G(int i) {
        int min = Math.min(this.p.j, Math.max(0, i));
        this.J = min;
        this.H.setText(br1.o(min / 1000));
    }

    public final void H() {
        dx.a aVar = this.p.d.get((int) this.u.getSelectedItemId());
        boolean z = aVar != null && aVar.c();
        ArrayList<String> b2 = dx.b();
        if (z) {
            b2.add("High");
        }
        if (this.v.getAdapter() == null || this.v.getAdapter().getCount() != b2.size()) {
            int selectedItemPosition = this.v.getSelectedItemPosition();
            this.v.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), 17367048, b2));
            if (selectedItemPosition < 0 || selectedItemPosition >= b2.size()) {
                return;
            }
            this.v.setSelection(selectedItemPosition, false);
        }
    }

    public void J(d dVar) {
        Activity activity;
        if (this.r == null) {
            return;
        }
        this.p = dVar;
        if (dVar == null || (activity = getActivity()) == null) {
            return;
        }
        this.s.setText(dVar.f);
        this.t.setText(dVar.g);
        int i = dVar.e;
        List<dx.a> list = dVar.d;
        String[] c2 = list != null ? dx.c(list) : new String[]{"<empty>"};
        this.u.setAdapter((SpinnerAdapter) new ArrayAdapter(activity, 17367048, c2));
        if (i < 0 || i >= c2.length) {
            this.u.setSelection(0, false);
        } else {
            this.u.setSelection(i, false);
        }
        this.u.setOnItemSelectedListener(new a());
        int i2 = dVar.b;
        this.w.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), 17367048, dVar.e(this.w.getResources().getString(R.string.vis_export_choose_preset))));
        this.w.setSelection(i2, false);
        this.w.setOnItemSelectedListener(new b(dVar));
        this.B.setChecked(dVar.l);
        this.C.setChecked(dVar.k);
        this.D.setChecked(dVar.h);
        D(dVar.c);
        G(dVar.i);
        F(dVar.j);
        vw1<Boolean> vw1Var = nc0.g;
        Boolean bool = Boolean.FALSE;
        if (vw1Var.a(bool).booleanValue()) {
            return;
        }
        E(e.d(dVar.a));
        D(dVar.c(Math.max(dVar.b, 0)));
        L();
        Button button = this.I;
        button.setEnabled(oy0.c.a(Integer.valueOf(button.getId()), bool).booleanValue());
    }

    public void L() {
        if (oy0.c.a(Integer.valueOf(this.G.getId()), Boolean.FALSE).booleanValue()) {
            this.G.setEnabled(true);
            return;
        }
        this.G.setEnabled(false);
        this.G.setChecked(false);
    }

    public final void o() {
        boolean z;
        boolean z2;
        int selectedItemId;
        boolean z3 = Build.VERSION.SDK_INT > 23;
        if (z3 && this.p.d != null) {
            long selectedItemId2 = this.u.getSelectedItemId();
            if (selectedItemId2 >= 0 && selectedItemId2 < this.p.d.size()) {
                dx.a aVar = this.p.d.get((int) selectedItemId2);
                z = "video/avc".equals(aVar.a());
                z2 = aVar.c();
                selectedItemId = (int) this.v.getSelectedItemId();
                if ((selectedItemId == 2 && !z2) || (selectedItemId > 0 && !z)) {
                    this.v.setSelection(0, false);
                }
                this.v.setEnabled(z);
            }
        }
        z = z3;
        z2 = false;
        selectedItemId = (int) this.v.getSelectedItemId();
        if (selectedItemId == 2) {
            this.v.setSelection(0, false);
            this.v.setEnabled(z);
        }
        this.v.setSelection(0, false);
        this.v.setEnabled(z);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            P.a(this, Integer.valueOf(i), intent);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        S.b(new qw1.a() { // from class: com.daaw.bv1
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                dv1.this.r((String) obj);
            }
        }, this.L);
        T.b(new qw1.a() { // from class: com.daaw.av1
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                dv1.this.s((dv1.f) obj);
            }
        }, this.L);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        try {
            View inflate = View.inflate(getActivity(), R.layout.dialog_export_vis, null);
            builder.setView(inflate);
            this.r = (ViewGroup) inflate.findViewById(R.id.layoutContent);
            Button button = (Button) inflate.findViewById(R.id.btnExport);
            button.setTextColor(gr1.n(button, R.attr.colorAccent));
            button.setSelected(true);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.yu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.v(view);
                }
            });
            Button button2 = (Button) inflate.findViewById(R.id.btnExportPreview);
            button2.setTextColor(gr1.n(button, R.attr.colorAccent));
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.wu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.w(view);
                }
            });
            Button button3 = (Button) inflate.findViewById(R.id.btnDestDir);
            this.s = button3;
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.xu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.x(view);
                }
            });
            this.t = (EditText) inflate.findViewById(R.id.editTxtFilename);
            this.w = (Spinner) inflate.findViewById(R.id.spinnerProfile);
            this.u = (Spinner) inflate.findViewById(R.id.spinnerVideoCodec);
            this.v = (Spinner) inflate.findViewById(R.id.spinnerVideoCodecProfile);
            this.x = (PrEditText) inflate.findViewById(R.id.editTxtWidth);
            this.y = (PrEditText) inflate.findViewById(R.id.editTxtHeight);
            this.z = (PrEditText) inflate.findViewById(R.id.editTxtFramerate);
            this.A = (PrEditText) inflate.findViewById(R.id.editTxtBitrate);
            this.B = (CheckBox) inflate.findViewById(R.id.chkForceCompatibleWh);
            this.C = (CheckBox) inflate.findViewById(R.id.chkBlurQuality);
            this.D = (CheckBox) inflate.findViewById(R.id.chkExportAudio);
            this.E = (CheckBox) inflate.findViewById(R.id.chkAudioStereo);
            this.F = (PrEditText) inflate.findViewById(R.id.editAudioBitrate);
            this.G = (CheckBox) inflate.findViewById(R.id.chkHideAppLogo);
            az0 az0Var = new az0();
            if (nc0.g.a(Boolean.FALSE).booleanValue() && az0Var.a()) {
                this.G.setVisibility(8);
                inflate.findViewById(R.id.txtHideAppLogo).setVisibility(8);
                inflate.findViewById(R.id.app_logo_ad_icon).setVisibility(8);
            }
            this.H = (Button) inflate.findViewById(R.id.btnStartTime);
            this.I = (Button) inflate.findViewById(R.id.btnEndTime);
            this.H.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.zu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.z(view);
                }
            });
            this.I.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.vu1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dv1.this.B(view);
                }
            });
            AlertDialog create = builder.create();
            create.setCancelable(false);
            create.setCanceledOnTouchOutside(false);
            J(R.a(null));
            nc0.n.b(new ww1.a() { // from class: com.daaw.cv1
                @Override // com.daaw.ww1.a
                public final Object b(Object obj) {
                    Boolean C;
                    C = dv1.this.C((Boolean) obj);
                    return C;
                }
            }, this.L);
            return create;
        } catch (Exception e2) {
            lz1.b(e2, "Dialog inflation error");
            return null;
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        S.c(this.L);
        T.c(this.L);
        this.L.clear();
        this.r = null;
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        N.a();
        Q.a();
    }

    public final d q() {
        d dVar = new d();
        dVar.c = new e(0, br1.w(this.x.getText().toString()), br1.w(this.y.getText().toString()), br1.w(this.z.getText().toString()), br1.u(this.A.getText().toString()), this.E.isChecked() ? 2 : 1, br1.u(this.F.getText().toString()), this.v.getSelectedItemPosition());
        dVar.d = this.p.d;
        dVar.e = this.u.getSelectedItemPosition();
        dVar.f = this.s.getText().toString();
        dVar.g = this.t.getText().toString();
        dVar.l = this.B.isChecked();
        dVar.h = this.D.isChecked();
        dVar.i = this.J;
        dVar.j = this.K;
        dVar.k = this.C.isChecked();
        dVar.m = this.G.isChecked();
        return dVar;
    }

    public final void r(String str) {
        if (t()) {
            this.s.setText(str);
        }
    }

    public final void s(f fVar) {
        if (t()) {
            if (!fVar.a) {
                fv1 fv1Var = this.q;
                if (fv1Var == null || !fv1Var.isVisible()) {
                    return;
                }
                this.q.dismissAllowingStateLoss();
                this.r.post(new Runnable() { // from class: com.daaw.tu1
                    @Override // java.lang.Runnable
                    public final void run() {
                        dv1.this.u();
                    }
                });
                return;
            }
            if (this.q == null) {
                this.q = fv1.g();
            }
            if (!this.q.isVisible()) {
                this.q.show(getActivity().getFragmentManager(), "progress");
            }
            getDialog().hide();
            this.q.h(fVar);
        }
    }

    public boolean t() {
        return this.r != null;
    }
}

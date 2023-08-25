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
/* loaded from: classes.dex */
public class oo extends no {

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ un p;
        public final /* synthetic */ String q;
        public final /* synthetic */ dm0 r;
        public final /* synthetic */ float s;
        public final /* synthetic */ ho t;

        public a(un unVar, String str, dm0 dm0Var, float f, ho hoVar) {
            this.p = unVar;
            this.q = str;
            this.r = dm0Var;
            this.s = f;
            this.t = hoVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dm0 s = this.p.s(this.q, new dm0(this.r));
            float f = this.s;
            this.p.a0(this.q, new dm0(s, new xn0("Constant", f, f)));
            this.t.q();
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ un p;
        public final /* synthetic */ String q;
        public final /* synthetic */ dm0 r;
        public final /* synthetic */ ho s;

        public b(un unVar, String str, dm0 dm0Var, ho hoVar) {
            this.p = unVar;
            this.q = str;
            this.r = dm0Var;
            this.s = hoVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dm0 s = this.p.s(this.q, new dm0(this.r));
            if (s.h() > 1) {
                this.p.a0(this.q, new dm0(s, 0, s.h() - 1));
                this.s.q();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements e0<Object> {
        public final /* synthetic */ boolean[] a;
        public final /* synthetic */ un b;
        public final /* synthetic */ String c;
        public final /* synthetic */ dm0 d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ TextView f;
        public final /* synthetic */ ViewGroup g;
        public final /* synthetic */ View h;
        public final /* synthetic */ View i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;
        public final /* synthetic */ float l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ int n;
        public final /* synthetic */ SeekBar[] o;
        public final /* synthetic */ SeekBar[] p;
        public final /* synthetic */ EditText[] q;
        public final /* synthetic */ EditText[] r;
        public final /* synthetic */ Spinner[] s;
        public final /* synthetic */ String[] t;
        public final /* synthetic */ TextView[] u;
        public final /* synthetic */ TextView[] v;

        public c(boolean[] zArr, un unVar, String str, dm0 dm0Var, boolean z, TextView textView, ViewGroup viewGroup, View view, View view2, float f, float f2, float f3, boolean z2, int i, SeekBar[] seekBarArr, SeekBar[] seekBarArr2, EditText[] editTextArr, EditText[] editTextArr2, Spinner[] spinnerArr, String[] strArr, TextView[] textViewArr, TextView[] textViewArr2) {
            this.a = zArr;
            this.b = unVar;
            this.c = str;
            this.d = dm0Var;
            this.e = z;
            this.f = textView;
            this.g = viewGroup;
            this.h = view;
            this.i = view2;
            this.j = f;
            this.k = f2;
            this.l = f3;
            this.m = z2;
            this.n = i;
            this.o = seekBarArr;
            this.p = seekBarArr2;
            this.q = editTextArr;
            this.r = editTextArr2;
            this.s = spinnerArr;
            this.t = strArr;
            this.u = textViewArr;
            this.v = textViewArr2;
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
        @Override // com.daaw.e0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.oo.c.a(java.lang.Object):void");
        }
    }

    /* loaded from: classes.dex */
    public class d implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ boolean[] a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ un d;
        public final /* synthetic */ String e;
        public final /* synthetic */ dm0 f;
        public final /* synthetic */ int g;
        public final /* synthetic */ ho h;
        public final /* synthetic */ e0 i;
        public final /* synthetic */ SeekBar[] j;
        public final /* synthetic */ w40 k;

        public d(boolean[] zArr, float f, float f2, un unVar, String str, dm0 dm0Var, int i, ho hoVar, e0 e0Var, SeekBar[] seekBarArr, w40 w40Var) {
            this.a = zArr;
            this.b = f;
            this.c = f2;
            this.d = unVar;
            this.e = str;
            this.f = dm0Var;
            this.g = i;
            this.h = hoVar;
            this.i = e0Var;
            this.j = seekBarArr;
            this.k = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (!this.a[0] && z) {
                float f = (i * this.b) + this.c;
                dm0 s = this.d.s(this.e, new dm0(this.f));
                if (this.g >= s.h()) {
                    return;
                }
                xn0 g = s.g(this.g);
                s.k(this.g, new xn0(g.e(), f, g.g().b));
                this.d.a0(this.e, s);
                this.h.u();
                this.i.a(this.j[this.g]);
                e0 e0Var = (e0) this.k.a();
                if (e0Var != null) {
                    e0Var.a(null);
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

    /* loaded from: classes.dex */
    public class e implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ boolean[] a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ un d;
        public final /* synthetic */ String e;
        public final /* synthetic */ dm0 f;
        public final /* synthetic */ int g;
        public final /* synthetic */ ho h;
        public final /* synthetic */ e0 i;
        public final /* synthetic */ SeekBar[] j;
        public final /* synthetic */ w40 k;

        public e(boolean[] zArr, float f, float f2, un unVar, String str, dm0 dm0Var, int i, ho hoVar, e0 e0Var, SeekBar[] seekBarArr, w40 w40Var) {
            this.a = zArr;
            this.b = f;
            this.c = f2;
            this.d = unVar;
            this.e = str;
            this.f = dm0Var;
            this.g = i;
            this.h = hoVar;
            this.i = e0Var;
            this.j = seekBarArr;
            this.k = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (!this.a[0] && z) {
                float f = (i * this.b) + this.c;
                dm0 s = this.d.s(this.e, new dm0(this.f));
                if (this.g >= s.h()) {
                    return;
                }
                xn0 g = s.g(this.g);
                s.k(this.g, new xn0(g.e(), g.g().a, f));
                this.d.a0(this.e, s);
                this.h.u();
                this.i.a(this.j[this.g]);
                e0 e0Var = (e0) this.k.a();
                if (e0Var != null) {
                    e0Var.a(null);
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

    /* loaded from: classes.dex */
    public class f implements TextWatcher {
        public final /* synthetic */ boolean[] p;
        public final /* synthetic */ float q;
        public final /* synthetic */ float r;
        public final /* synthetic */ un s;
        public final /* synthetic */ String t;
        public final /* synthetic */ dm0 u;
        public final /* synthetic */ int v;
        public final /* synthetic */ ho w;
        public final /* synthetic */ e0 x;
        public final /* synthetic */ EditText[] y;
        public final /* synthetic */ w40 z;

        public f(boolean[] zArr, float f, float f2, un unVar, String str, dm0 dm0Var, int i, ho hoVar, e0 e0Var, EditText[] editTextArr, w40 w40Var) {
            this.p = zArr;
            this.q = f;
            this.r = f2;
            this.s = unVar;
            this.t = str;
            this.u = dm0Var;
            this.v = i;
            this.w = hoVar;
            this.x = e0Var;
            this.y = editTextArr;
            this.z = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.p[0]) {
                return;
            }
            float v = br1.v(editable.toString(), this.q + (this.r * 0.5f));
            dm0 s = this.s.s(this.t, new dm0(this.u));
            if (this.v >= s.h()) {
                return;
            }
            xn0 g = s.g(this.v);
            s.k(this.v, new xn0(g.e(), v, g.g().b));
            this.s.a0(this.t, s);
            this.w.u();
            this.x.a(this.y[this.v]);
            e0 e0Var = (e0) this.z.a();
            if (e0Var != null) {
                e0Var.a(null);
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

    /* loaded from: classes.dex */
    public class g implements TextWatcher {
        public final /* synthetic */ boolean[] p;
        public final /* synthetic */ float q;
        public final /* synthetic */ float r;
        public final /* synthetic */ un s;
        public final /* synthetic */ String t;
        public final /* synthetic */ dm0 u;
        public final /* synthetic */ int v;
        public final /* synthetic */ ho w;
        public final /* synthetic */ e0 x;
        public final /* synthetic */ EditText[] y;
        public final /* synthetic */ w40 z;

        public g(boolean[] zArr, float f, float f2, un unVar, String str, dm0 dm0Var, int i, ho hoVar, e0 e0Var, EditText[] editTextArr, w40 w40Var) {
            this.p = zArr;
            this.q = f;
            this.r = f2;
            this.s = unVar;
            this.t = str;
            this.u = dm0Var;
            this.v = i;
            this.w = hoVar;
            this.x = e0Var;
            this.y = editTextArr;
            this.z = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.p[0]) {
                return;
            }
            float v = br1.v(editable.toString(), this.q + (this.r * 0.5f));
            dm0 s = this.s.s(this.t, new dm0(this.u));
            if (this.v >= s.h()) {
                return;
            }
            xn0 g = s.g(this.v);
            s.k(this.v, new xn0(g.e(), g.g().a, v));
            this.s.a0(this.t, s);
            this.w.u();
            this.x.a(this.y[this.v]);
            e0 e0Var = (e0) this.z.a();
            if (e0Var != null) {
                e0Var.a(null);
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

    /* loaded from: classes.dex */
    public class h implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ ho p;
        public final /* synthetic */ String[] q;
        public final /* synthetic */ un r;
        public final /* synthetic */ String s;
        public final /* synthetic */ dm0 t;
        public final /* synthetic */ int u;
        public final /* synthetic */ e0 v;
        public final /* synthetic */ Spinner[] w;
        public final /* synthetic */ w40 x;

        public h(ho hoVar, String[] strArr, un unVar, String str, dm0 dm0Var, int i, e0 e0Var, Spinner[] spinnerArr, w40 w40Var) {
            this.p = hoVar;
            this.q = strArr;
            this.r = unVar;
            this.s = str;
            this.t = dm0Var;
            this.u = i;
            this.v = e0Var;
            this.w = spinnerArr;
            this.x = w40Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            /*
                r0 = this;
                com.daaw.ho r2 = r0.p
                r2.a(r1)
                if (r3 < 0) goto Lf
                java.lang.String[] r1 = r0.q
                int r2 = r1.length
                if (r3 >= r2) goto Lf
                r1 = r1[r3]
                goto L11
            Lf:
                java.lang.String r1 = "Constant"
            L11:
                com.daaw.un r2 = r0.r
                java.lang.String r3 = r0.s
                com.daaw.dm0 r4 = new com.daaw.dm0
                com.daaw.dm0 r5 = r0.t
                r4.<init>(r5)
                com.daaw.dm0 r2 = r2.s(r3, r4)
                int r3 = r0.u
                int r4 = r2.h()
                if (r3 < r4) goto L29
                return
            L29:
                int r3 = r0.u
                com.daaw.xn0 r3 = r2.g(r3)
                int r4 = r0.u
                com.daaw.xn0 r5 = new com.daaw.xn0
                com.daaw.bs1 r3 = r3.g()
                r5.<init>(r1, r3)
                r2.k(r4, r5)
                com.daaw.un r1 = r0.r
                java.lang.String r3 = r0.s
                r1.a0(r3, r2)
                com.daaw.ho r1 = r0.p
                r1.u()
                com.daaw.e0 r1 = r0.v
                android.widget.Spinner[] r2 = r0.w
                int r3 = r0.u
                r2 = r2[r3]
                r1.a(r2)
                com.daaw.w40 r1 = r0.x
                java.lang.Object r1 = r1.a()
                com.daaw.e0 r1 = (com.daaw.e0) r1
                if (r1 == 0) goto L62
                r2 = 0
                r1.a(r2)
            L62:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.oo.h.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static void K(ho hoVar, LayoutInflater layoutInflater, un unVar, boolean z, w40<e0<Object>> w40Var, ViewGroup viewGroup, boolean z2, String str, String str2, float f2, float f3, float f4) {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        EditText[] editTextArr;
        EditText[] editTextArr2;
        SeekBar[] seekBarArr;
        SeekBar[] seekBarArr2;
        View view;
        dm0 dm0Var = new dm0(new xn0("Constant", f2, f2));
        String[] strArr = z2 ? wn0.b : wn0.a;
        dm0 s = unVar.s(str2, new dm0(dm0Var));
        if (s.h() == 0) {
            s = new dm0(dm0Var);
            unVar.a0(str2, s);
        }
        dm0 dm0Var2 = s;
        View inflate = View.inflate(hoVar.getActivity(), z ? R.layout.dialog_customize_vis_elementdetail_var_bar : R.layout.dialog_customize_vis_element_var_bar, null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        View findViewById = inflate.findViewById(R.id.lineBarBg);
        View findViewById2 = inflate.findViewById(R.id.lineBarValue);
        int h2 = dm0Var2.h();
        SeekBar[] seekBarArr3 = new SeekBar[h2];
        SeekBar[] seekBarArr4 = new SeekBar[h2];
        EditText[] editTextArr3 = new EditText[h2];
        EditText[] editTextArr4 = new EditText[h2];
        TextView[] textViewArr3 = new TextView[h2];
        TextView[] textViewArr4 = new TextView[h2];
        Spinner[] spinnerArr = new Spinner[h2];
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
            ((Button) inflate.findViewById(R.id.btnAdd)).setOnClickListener(new a(unVar, str2, dm0Var, f2, hoVar));
            button.setOnClickListener(new b(unVar, str2, dm0Var, hoVar));
            int i = 0;
            while (i < h2) {
                xn0 g2 = dm0Var2.g(i);
                View inflate2 = View.inflate(hoVar.getActivity(), R.layout.dialog_customize_vis_element_var_bar_elem, null);
                seekBarArr2[i] = (SeekBar) inflate2.findViewById(R.id.seekBar);
                seekBarArr[i] = (SeekBar) inflate2.findViewById(R.id.seekBar2);
                editTextArr2[i] = (EditText) inflate2.findViewById(R.id.editTxt);
                editTextArr[i] = (EditText) inflate2.findViewById(R.id.editTxt2);
                textViewArr2[i] = (TextView) inflate2.findViewById(R.id.hintA);
                textViewArr[i] = (TextView) inflate2.findViewById(R.id.hintB);
                spinnerArr[i] = (Spinner) inflate2.findViewById(R.id.spinnerType);
                ViewGroup viewGroup3 = viewGroup2;
                viewGroup3.addView(inflate2);
                int i2 = (int) ((f3 - f2) / f4);
                seekBarArr2[i].setMax(i2);
                seekBarArr[i].setMax(i2);
                String[] strArr3 = strArr2;
                int e2 = br1.e(strArr3, g2.e());
                String[] strArr4 = new String[strArr3.length];
                for (int i3 = 0; i3 < strArr3.length; i3++) {
                    int a2 = wn0.a(strArr3[i3]);
                    if (a2 > 0) {
                        strArr4[i3] = inflate2.getContext().getString(a2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("missing t ");
                        sb.append(strArr3[i3]);
                        strArr4[i3] = strArr3[i3];
                    }
                }
                spinnerArr[i].setAdapter((SpinnerAdapter) new ArrayAdapter(hoVar.getActivity(), 17367048, strArr4));
                if (e2 >= 0) {
                    spinnerArr[i].setSelection(e2, false);
                }
                hoVar.b(spinnerArr[i]);
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
        int i4 = h2;
        boolean[] zArr = {false};
        View view2 = view;
        c cVar = new c(zArr, unVar, str2, dm0Var, z2, textView, viewGroup, findViewById, findViewById2, f3, f2, f4, z, i4, seekBarArr2, seekBarArr, editTextArr2, editTextArr, spinnerArr, strArr5, textViewArr2, textViewArr);
        View view3 = view2;
        e0<Object> k = no.k(hoVar, unVar, z, view2, str2, cVar);
        if (z) {
            int i5 = 0;
            while (i5 < i4) {
                String[] strArr6 = strArr5;
                int i6 = i5;
                dm0 dm0Var3 = dm0Var;
                boolean[] zArr2 = zArr;
                seekBarArr2[i5].setOnSeekBarChangeListener(new d(zArr, f4, f2, unVar, str2, dm0Var, i6, hoVar, k, seekBarArr2, w40Var));
                seekBarArr[i5].setOnSeekBarChangeListener(new e(zArr2, f4, f2, unVar, str2, dm0Var3, i6, hoVar, k, seekBarArr, w40Var));
                editTextArr2[i5].addTextChangedListener(new f(zArr2, f2, f3, unVar, str2, dm0Var3, i6, hoVar, k, editTextArr2, w40Var));
                editTextArr[i5].addTextChangedListener(new g(zArr2, f2, f3, unVar, str2, dm0Var3, i6, hoVar, k, editTextArr, w40Var));
                spinnerArr[i5].setOnItemSelectedListener(new h(hoVar, strArr6, unVar, str2, dm0Var3, i5, k, spinnerArr, w40Var));
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

    public static String L(String str, Context context) {
        int v = no.v(str);
        return (v <= 0 || context == null) ? str : context.getString(v);
    }
}

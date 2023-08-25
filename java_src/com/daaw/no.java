package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.daaw.avee.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class no {
    public TextView a;
    public View b;
    public ViewGroup c;
    public Spinner d;
    public AdapterView.OnItemSelectedListener e;
    public int f = -1;
    public Map<String, Boolean> g = new HashMap();
    public Map<String, com.daaw.e0<Object>> h = new HashMap();
    public un i;

    /* loaded from: classes.dex */
    public class a implements com.daaw.e0<Object> {
        public final /* synthetic */ un a;
        public final /* synthetic */ String b;
        public final /* synthetic */ CheckBox c;

        public a(un unVar, String str, CheckBox checkBox) {
            this.a = unVar;
            this.b = str;
            this.c = checkBox;
        }

        @Override // com.daaw.e0
        public void a(Object obj) {
            this.c.setChecked(this.a.n(this.b, false));
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements View.OnClickListener {
        public a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            vy.a.a(view.getResources().getString(R.string.vis_customization_hold_to_reset_element));
        }
    }

    /* loaded from: classes.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ un a;
        public final /* synthetic */ String b;
        public final /* synthetic */ w40 c;

        public b(un unVar, String str, w40 w40Var) {
            this.a = unVar;
            this.b = str;
            this.c = w40Var;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.M(this.b, z);
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            com.daaw.e0 e0Var = (com.daaw.e0) this.c.a();
            if (e0Var != null) {
                e0Var.a(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements View.OnLongClickListener {
        public b0() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (no.this.i != null) {
                ho k = ho.k();
                if (k == null) {
                    return false;
                }
                k.c(no.this.i, null);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c implements com.daaw.e0<Object> {
        public boolean a = false;
        public final /* synthetic */ un b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ TextView e;
        public final /* synthetic */ View f;
        public final /* synthetic */ View g;
        public final /* synthetic */ int h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ SeekBar[] j;
        public final /* synthetic */ EditText[] k;

        public c(un unVar, String str, int i, TextView textView, View view, View view2, int i2, boolean z, SeekBar[] seekBarArr, EditText[] editTextArr) {
            this.b = unVar;
            this.c = str;
            this.d = i;
            this.e = textView;
            this.f = view;
            this.g = view2;
            this.h = i2;
            this.i = z;
            this.j = seekBarArr;
            this.k = editTextArr;
        }

        @Override // com.daaw.e0
        public void a(Object obj) {
            if (this.a) {
                return;
            }
            this.a = true;
            int r = this.b.r(this.c, this.d);
            TextView textView = this.e;
            textView.setText("" + r);
            View view = this.f;
            View view2 = this.g;
            int i = this.h;
            int i2 = this.d;
            nd1.a(view, view2, i - i2, r - i2);
            if (this.i) {
                if (!this.j[0].equals(obj)) {
                    this.j[0].setProgress(r - this.d);
                }
                if (!this.k[0].equals(obj)) {
                    EditText editText = this.k[0];
                    editText.setText("" + r);
                }
            }
            this.a = false;
        }
    }

    /* loaded from: classes.dex */
    public class c0 implements AdapterView.OnItemSelectedListener {
        public c0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.a(adapterView);
            if (no.this.i != null) {
                String i2 = no.this.i.i();
                String D = no.this.i.D();
                lo1<String[], String> e = k.e(i2, D);
                String[] strArr = e.a;
                String str = e.b;
                if (i >= 0 && i < strArr.length) {
                    str = strArr[i];
                }
                if (sv1.b(D, str)) {
                    return;
                }
                no.this.i.r0(str);
                k.q();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class d implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ un a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ com.daaw.e0 d;
        public final /* synthetic */ SeekBar[] e;
        public final /* synthetic */ w40 f;

        public d(un unVar, String str, int i, com.daaw.e0 e0Var, SeekBar[] seekBarArr, w40 w40Var) {
            this.a = unVar;
            this.b = str;
            this.c = i;
            this.d = e0Var;
            this.e = seekBarArr;
            this.f = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                this.a.Y(this.b, i + this.c);
                ho k = ho.k();
                if (k == null) {
                    return;
                }
                k.u();
                this.d.a(this.e[0]);
                com.daaw.e0 e0Var = (com.daaw.e0) this.f.a();
                if (e0Var != null) {
                    e0Var.a(this);
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
    public class d0 implements View.OnClickListener {
        public final /* synthetic */ ViewGroup p;
        public final /* synthetic */ View q;
        public final /* synthetic */ String r;

        public d0(ViewGroup viewGroup, View view, String str) {
            this.p = viewGroup;
            this.q = view;
            this.r = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Map map;
            String str;
            Boolean bool;
            if (this.p.getVisibility() == 0) {
                this.q.animate().rotation(0.0f);
                this.p.setVisibility(8);
                map = no.this.g;
                str = this.r;
                bool = Boolean.FALSE;
            } else {
                this.q.animate().rotation(-90.0f);
                this.p.setVisibility(0);
                map = no.this.g;
                str = this.r;
                bool = Boolean.TRUE;
            }
            map.put(str, bool);
        }
    }

    /* loaded from: classes.dex */
    public class e implements TextWatcher {
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;
        public final /* synthetic */ un r;
        public final /* synthetic */ String s;
        public final /* synthetic */ com.daaw.e0 t;
        public final /* synthetic */ EditText[] u;
        public final /* synthetic */ w40 v;

        public e(int i, int i2, un unVar, String str, com.daaw.e0 e0Var, EditText[] editTextArr, w40 w40Var) {
            this.p = i;
            this.q = i2;
            this.r = unVar;
            this.s = str;
            this.t = e0Var;
            this.u = editTextArr;
            this.v = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.r.Y(this.s, br1.x(editable.toString(), this.p + (this.q / 2)));
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.t.a(this.u[0]);
            com.daaw.e0 e0Var = (com.daaw.e0) this.v.a();
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
    public class e0 implements w40<com.daaw.e0<Object>> {
        @Override // com.daaw.w40
        /* renamed from: b */
        public com.daaw.e0<Object> a() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class f implements com.daaw.e0<Object> {
        public boolean a = false;
        public final /* synthetic */ un b;
        public final /* synthetic */ String c;
        public final /* synthetic */ float d;
        public final /* synthetic */ TextView e;
        public final /* synthetic */ View f;
        public final /* synthetic */ View g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ SeekBar[] k;
        public final /* synthetic */ EditText[] l;

        public f(un unVar, String str, float f, TextView textView, View view, View view2, float f2, float f3, boolean z, SeekBar[] seekBarArr, EditText[] editTextArr) {
            this.b = unVar;
            this.c = str;
            this.d = f;
            this.e = textView;
            this.f = view;
            this.g = view2;
            this.h = f2;
            this.i = f3;
            this.j = z;
            this.k = seekBarArr;
            this.l = editTextArr;
        }

        @Override // com.daaw.e0
        public void a(Object obj) {
            if (this.a) {
                return;
            }
            this.a = true;
            float o = this.b.o(this.c, this.d);
            TextView textView = this.e;
            Locale locale = Locale.US;
            textView.setText(String.format(locale, "%.3f", Float.valueOf(o)));
            View view = this.f;
            View view2 = this.g;
            float f = this.h;
            float f2 = this.d;
            float f3 = this.i;
            nd1.a(view, view2, (f - f2) / f3, (o - f2) / f3);
            if (this.j) {
                if (!this.k[0].equals(obj)) {
                    this.k[0].setProgress((int) ((o - this.d) / this.i));
                }
                if (!this.l[0].equals(obj)) {
                    this.l[0].setText(String.format(locale, "%.3f", Float.valueOf(o)));
                }
            }
            this.a = false;
        }
    }

    /* loaded from: classes.dex */
    public class f0 implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ boolean[] p;
        public final /* synthetic */ String[] q;
        public final /* synthetic */ boolean r;
        public final /* synthetic */ un s;
        public final /* synthetic */ String t;
        public final /* synthetic */ w40 u;
        public final /* synthetic */ un v;

        public f0(boolean[] zArr, String[] strArr, boolean z, un unVar, String str, w40 w40Var, un unVar2) {
            this.p = zArr;
            this.q = strArr;
            this.r = z;
            this.s = unVar;
            this.t = str;
            this.u = w40Var;
            this.v = unVar2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.a(adapterView);
            if (!this.p[0] || i < 0 || i >= this.q.length) {
                return;
            }
            if (!this.r) {
                if (this.v.B().equals(this.q[i])) {
                    return;
                }
                this.v.E(this.q[i]);
                k.q();
            } else if (this.s.u(this.t, "").equals(this.q[i])) {
            } else {
                this.s.c0(this.t, this.q[i]);
                k.q();
                com.daaw.e0 e0Var = (com.daaw.e0) this.u.a();
                if (e0Var != null) {
                    e0Var.a(this);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class g implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ un c;
        public final /* synthetic */ String d;
        public final /* synthetic */ com.daaw.e0 e;
        public final /* synthetic */ SeekBar[] f;
        public final /* synthetic */ w40 g;

        public g(float f, float f2, un unVar, String str, com.daaw.e0 e0Var, SeekBar[] seekBarArr, w40 w40Var) {
            this.a = f;
            this.b = f2;
            this.c = unVar;
            this.d = str;
            this.e = e0Var;
            this.f = seekBarArr;
            this.g = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                this.c.Q(this.d, (i * this.a) + this.b);
                ho k = ho.k();
                if (k == null) {
                    return;
                }
                k.u();
                this.e.a(this.f[0]);
                com.daaw.e0 e0Var = (com.daaw.e0) this.g.a();
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
    public class g0 implements View.OnClickListener {
        public final /* synthetic */ un p;
        public final /* synthetic */ String q;
        public final /* synthetic */ View r;
        public final /* synthetic */ com.daaw.e0 s;

        public g0(un unVar, String str, View view, com.daaw.e0 e0Var) {
            this.p = unVar;
            this.q = str;
            this.r = view;
            this.s = e0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.v(this.p, this.q, this.r, this.s);
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextWatcher {
        public final /* synthetic */ float p;
        public final /* synthetic */ float q;
        public final /* synthetic */ un r;
        public final /* synthetic */ String s;
        public final /* synthetic */ com.daaw.e0 t;
        public final /* synthetic */ EditText[] u;
        public final /* synthetic */ w40 v;

        public h(float f, float f2, un unVar, String str, com.daaw.e0 e0Var, EditText[] editTextArr, w40 w40Var) {
            this.p = f;
            this.q = f2;
            this.r = unVar;
            this.s = str;
            this.t = e0Var;
            this.u = editTextArr;
            this.v = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.r.Q(this.s, br1.v(editable.toString(), this.p + (this.q * 0.5f)));
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.t.a(this.u[0]);
            com.daaw.e0 e0Var = (com.daaw.e0) this.v.a();
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
    public class i implements com.daaw.e0<Object> {
        public boolean a = false;
        public final /* synthetic */ un b;
        public final /* synthetic */ String c;
        public final /* synthetic */ float d;
        public final /* synthetic */ TextView e;
        public final /* synthetic */ View f;
        public final /* synthetic */ View g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ View j;
        public final /* synthetic */ View k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ SeekBar[] m;
        public final /* synthetic */ SeekBar[] n;
        public final /* synthetic */ EditText[] o;
        public final /* synthetic */ EditText[] p;

        public i(un unVar, String str, float f, TextView textView, View view, View view2, float f2, float f3, View view3, View view4, boolean z, SeekBar[] seekBarArr, SeekBar[] seekBarArr2, EditText[] editTextArr, EditText[] editTextArr2) {
            this.b = unVar;
            this.c = str;
            this.d = f;
            this.e = textView;
            this.f = view;
            this.g = view2;
            this.h = f2;
            this.i = f3;
            this.j = view3;
            this.k = view4;
            this.l = z;
            this.m = seekBarArr;
            this.n = seekBarArr2;
            this.o = editTextArr;
            this.p = editTextArr2;
        }

        @Override // com.daaw.e0
        public void a(Object obj) {
            if (this.a) {
                return;
            }
            this.a = true;
            un unVar = this.b;
            String str = this.c;
            float f = this.d;
            bs1 z = unVar.z(str, new bs1(f, f));
            TextView textView = this.e;
            Locale locale = Locale.US;
            textView.setText(String.format(locale, "%.3f   %.3f", Float.valueOf(z.a), Float.valueOf(z.b)));
            View view = this.f;
            View view2 = this.g;
            float f2 = this.h;
            float f3 = this.d;
            float f4 = this.i;
            nd1.a(view, view2, (f2 - f3) / f4, (z.a - f3) / f4);
            View view3 = this.j;
            View view4 = this.k;
            float f5 = this.h;
            float f6 = this.d;
            float f7 = this.i;
            nd1.a(view3, view4, (f5 - f6) / f7, (z.b - f6) / f7);
            if (this.l) {
                if (!this.m[0].equals(obj)) {
                    this.m[0].setProgress((int) ((z.a - this.d) / this.i));
                }
                if (!this.n[0].equals(obj)) {
                    this.n[0].setProgress((int) ((z.b - this.d) / this.i));
                }
                if (!this.o[0].equals(obj)) {
                    this.o[0].setText(String.format(locale, "%.3f", Float.valueOf(z.a)));
                }
                if (!this.p[0].equals(obj)) {
                    this.p[0].setText(String.format(locale, "%.3f", Float.valueOf(z.b)));
                }
            }
            this.a = false;
        }
    }

    /* loaded from: classes.dex */
    public class j implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ un a;
        public final /* synthetic */ String b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ com.daaw.e0 e;
        public final /* synthetic */ SeekBar[] f;
        public final /* synthetic */ w40 g;

        public j(un unVar, String str, float f, float f2, com.daaw.e0 e0Var, SeekBar[] seekBarArr, w40 w40Var) {
            this.a = unVar;
            this.b = str;
            this.c = f;
            this.d = f2;
            this.e = e0Var;
            this.f = seekBarArr;
            this.g = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                un unVar = this.a;
                String str = this.b;
                float f = this.c;
                this.a.l0(this.b, new bs1((i * this.d) + this.c, unVar.z(str, new bs1(f, f)).b));
                ho k = ho.k();
                if (k == null) {
                    return;
                }
                k.u();
                this.e.a(this.f[0]);
                com.daaw.e0 e0Var = (com.daaw.e0) this.g.a();
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
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.m(0);
        }
    }

    /* loaded from: classes.dex */
    public class l implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ un a;
        public final /* synthetic */ String b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ com.daaw.e0 e;
        public final /* synthetic */ SeekBar[] f;
        public final /* synthetic */ w40 g;

        public l(un unVar, String str, float f, float f2, com.daaw.e0 e0Var, SeekBar[] seekBarArr, w40 w40Var) {
            this.a = unVar;
            this.b = str;
            this.c = f;
            this.d = f2;
            this.e = e0Var;
            this.f = seekBarArr;
            this.g = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                un unVar = this.a;
                String str = this.b;
                float f = this.c;
                this.a.l0(this.b, new bs1(unVar.z(str, new bs1(f, f)).a, (i * this.d) + this.c));
                ho k = ho.k();
                if (k == null) {
                    return;
                }
                k.u();
                this.e.a(this.f[0]);
                com.daaw.e0 e0Var = (com.daaw.e0) this.g.a();
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
    public class m implements TextWatcher {
        public final /* synthetic */ float p;
        public final /* synthetic */ float q;
        public final /* synthetic */ un r;
        public final /* synthetic */ String s;
        public final /* synthetic */ com.daaw.e0 t;
        public final /* synthetic */ EditText[] u;
        public final /* synthetic */ w40 v;

        public m(float f, float f2, un unVar, String str, com.daaw.e0 e0Var, EditText[] editTextArr, w40 w40Var) {
            this.p = f;
            this.q = f2;
            this.r = unVar;
            this.s = str;
            this.t = e0Var;
            this.u = editTextArr;
            this.v = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            float v = br1.v(editable.toString(), this.p + (this.q * 0.5f));
            un unVar = this.r;
            String str = this.s;
            float f = this.p;
            this.r.l0(this.s, new bs1(v, unVar.z(str, new bs1(f, f)).b));
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.t.a(this.u[0]);
            com.daaw.e0 e0Var = (com.daaw.e0) this.v.a();
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
    public class n implements TextWatcher {
        public final /* synthetic */ float p;
        public final /* synthetic */ float q;
        public final /* synthetic */ un r;
        public final /* synthetic */ String s;
        public final /* synthetic */ com.daaw.e0 t;
        public final /* synthetic */ EditText[] u;
        public final /* synthetic */ w40 v;

        public n(float f, float f2, un unVar, String str, com.daaw.e0 e0Var, EditText[] editTextArr, w40 w40Var) {
            this.p = f;
            this.q = f2;
            this.r = unVar;
            this.s = str;
            this.t = e0Var;
            this.u = editTextArr;
            this.v = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            float v = br1.v(editable.toString(), this.p + (this.q * 0.5f));
            un unVar = this.r;
            String str = this.s;
            float f = this.p;
            this.r.l0(this.s, new bs1(unVar.z(str, new bs1(f, f)).a, v));
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.t.a(this.u[0]);
            com.daaw.e0 e0Var = (com.daaw.e0) this.v.a();
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
    public class o implements com.daaw.e0<Object> {
        public final /* synthetic */ un a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TextView c;

        public o(un unVar, String str, TextView textView) {
            this.a = unVar;
            this.b = str;
            this.c = textView;
        }

        @Override // com.daaw.e0
        public void a(Object obj) {
            this.c.setText(this.a.w(this.b, ""));
        }
    }

    /* loaded from: classes.dex */
    public class p implements TextWatcher {
        public final /* synthetic */ TextView p;
        public final /* synthetic */ un q;
        public final /* synthetic */ String r;
        public final /* synthetic */ w40 s;

        public p(TextView textView, un unVar, String str, w40 w40Var) {
            this.p = textView;
            this.q = unVar;
            this.r = str;
            this.s = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            this.p.setText(obj);
            this.q.i0(this.r, obj);
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            com.daaw.e0 e0Var = (com.daaw.e0) this.s.a();
            if (e0Var != null) {
                e0Var.a(this);
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
    public class q implements com.daaw.e0<Object> {
        public final /* synthetic */ un a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TextView c;
        public final /* synthetic */ ImageButton d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ TextView[] g;

        public q(un unVar, String str, TextView textView, ImageButton imageButton, boolean z, boolean z2, TextView[] textViewArr) {
            this.a = unVar;
            this.b = str;
            this.c = textView;
            this.d = imageButton;
            this.e = z;
            this.f = z2;
            this.g = textViewArr;
        }

        @Override // com.daaw.e0
        public void a(Object obj) {
            ImageButton imageButton;
            int i;
            String w = this.a.w(this.b, "");
            int a = qg0.a(w);
            if (a <= 0) {
                int i0 = xi.i0(w);
                if (i0 >= 0) {
                    this.c.setVisibility(0);
                    TextView textView = this.c;
                    textView.setText("" + i0);
                    imageButton = this.d;
                    i = R.drawable.ic_visual1;
                } else if (w == null || w.length() <= 0) {
                    this.c.setVisibility(8);
                    this.d.setImageResource(0);
                } else {
                    this.c.setVisibility(8);
                    imageButton = this.d;
                    i = R.drawable.ic_visual3;
                }
                imageButton.setImageResource(i);
            } else {
                this.c.setVisibility(8);
                this.d.setImageResource(a);
            }
            if (!this.e || this.f) {
                return;
            }
            if (!this.g[0].equals(obj)) {
                this.g[0].setText(w);
            }
            if (w == null) {
                this.g[1].setText("");
                return;
            }
            Matcher matcher = Pattern.compile("composition:((\\d*))").matcher(w);
            Integer E = matcher.find() ? br1.E(matcher.group(1)) : null;
            TextView[] textViewArr = this.g;
            textViewArr[1].setText(E != null ? textViewArr[1].getContext().getResources().getQuantityString(R.plurals.vis_customization_composition_x, E.intValue(), E) : "");
        }
    }

    /* loaded from: classes.dex */
    public class r implements View.OnClickListener {
        public final /* synthetic */ un p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;
        public final /* synthetic */ com.daaw.e0 s;
        public final /* synthetic */ ImageButton t;
        public final /* synthetic */ w40 u;

        public r(un unVar, String str, String str2, com.daaw.e0 e0Var, ImageButton imageButton, w40 w40Var) {
            this.p = unVar;
            this.q = str;
            this.r = str2;
            this.s = e0Var;
            this.t = imageButton;
            this.u = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.p.i0(this.q, this.r);
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.s.a(this.t);
            com.daaw.e0 e0Var = (com.daaw.e0) this.u.a();
            if (e0Var != null) {
                e0Var.a(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class s implements View.OnClickListener {
        public final /* synthetic */ un p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;
        public final /* synthetic */ com.daaw.e0 s;
        public final /* synthetic */ ImageButton t;
        public final /* synthetic */ w40 u;

        public s(un unVar, String str, String str2, com.daaw.e0 e0Var, ImageButton imageButton, w40 w40Var) {
            this.p = unVar;
            this.q = str;
            this.r = str2;
            this.s = e0Var;
            this.t = imageButton;
            this.u = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.p.i0(this.q, this.r);
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.s.a(this.t);
            com.daaw.e0 e0Var = (com.daaw.e0) this.u.a();
            if (e0Var != null) {
                e0Var.a(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class t implements View.OnClickListener {
        public final /* synthetic */ TextView p;
        public final /* synthetic */ un q;
        public final /* synthetic */ String r;
        public final /* synthetic */ String s;

        public t(TextView textView, un unVar, String str, String str2) {
            this.p = textView;
            this.q = unVar;
            this.r = str;
            this.s = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ho k = ho.k();
            if (k == null) {
                return;
            }
            ho.J.a(k, this.p, this.q.j(), this.r, this.s);
        }
    }

    /* loaded from: classes.dex */
    public class u implements View.OnClickListener {
        public final /* synthetic */ TextView p;
        public final /* synthetic */ un q;
        public final /* synthetic */ String r;
        public final /* synthetic */ com.daaw.e0 s;
        public final /* synthetic */ Button t;
        public final /* synthetic */ w40 u;

        public u(TextView textView, un unVar, String str, com.daaw.e0 e0Var, Button button, w40 w40Var) {
            this.p = textView;
            this.q = unVar;
            this.r = str;
            this.s = e0Var;
            this.t = button;
            this.u = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView = this.p;
            if (textView != null) {
                textView.setText("");
            }
            this.q.i0(this.r, "");
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.s.a(this.t);
            com.daaw.e0 e0Var = (com.daaw.e0) this.u.a();
            if (e0Var != null) {
                e0Var.a(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class v implements View.OnClickListener {
        public v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (no.this.i != null) {
                String B = no.this.i.B();
                String D = no.this.i.D();
                ho k = ho.k();
                if (k == null) {
                    return;
                }
                k.d(B, D);
            }
        }
    }

    /* loaded from: classes.dex */
    public class w implements TextWatcher {
        public final /* synthetic */ un p;
        public final /* synthetic */ String q;
        public final /* synthetic */ com.daaw.e0 r;
        public final /* synthetic */ TextView[] s;
        public final /* synthetic */ w40 t;

        public w(un unVar, String str, com.daaw.e0 e0Var, TextView[] textViewArr, w40 w40Var) {
            this.p = unVar;
            this.q = str;
            this.r = e0Var;
            this.s = textViewArr;
            this.t = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.p.i0(this.q, editable.toString());
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.r.a(this.s[0]);
            com.daaw.e0 e0Var = (com.daaw.e0) this.t.a();
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
    public class x implements com.daaw.e0<Object> {
        public final /* synthetic */ un a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String[] c;
        public final /* synthetic */ TextView d;
        public final /* synthetic */ ImageButton e;

        public x(un unVar, String str, String[] strArr, TextView textView, ImageButton imageButton) {
            this.a = unVar;
            this.b = str;
            this.c = strArr;
            this.d = textView;
            this.e = imageButton;
        }

        @Override // com.daaw.e0
        public void a(Object obj) {
            int i;
            String w = this.a.w(this.b, "");
            int i2 = 0;
            while (true) {
                String[] strArr = this.c;
                if (i2 >= strArr.length) {
                    i = -1;
                    break;
                }
                String[] strArr2 = new String[2];
                br1.B(strArr[i2], 58, strArr2);
                if (w.equals(strArr2[0])) {
                    i = br1.x(strArr2[1], 0);
                    break;
                }
                i2++;
            }
            if (i <= 0) {
                this.d.setVisibility(8);
                this.e.setImageResource(0);
                return;
            }
            this.d.setVisibility(8);
            this.e.setImageResource(i);
        }
    }

    /* loaded from: classes.dex */
    public class y implements View.OnClickListener {
        public final /* synthetic */ un p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String[] r;
        public final /* synthetic */ ImageButton s;
        public final /* synthetic */ int t;
        public final /* synthetic */ TextView u;
        public final /* synthetic */ w40 v;

        public y(un unVar, String str, String[] strArr, ImageButton imageButton, int i, TextView textView, w40 w40Var) {
            this.p = unVar;
            this.q = str;
            this.r = strArr;
            this.s = imageButton;
            this.t = i;
            this.u = textView;
            this.v = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.p.i0(this.q, this.r[0]);
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.s.setImageResource(this.t);
            this.u.setVisibility(8);
            com.daaw.e0 e0Var = (com.daaw.e0) this.v.a();
            if (e0Var != null) {
                e0Var.a(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class z implements View.OnClickListener {
        public final /* synthetic */ TextView p;
        public final /* synthetic */ un q;
        public final /* synthetic */ String r;
        public final /* synthetic */ ImageButton s;
        public final /* synthetic */ TextView t;
        public final /* synthetic */ w40 u;

        public z(TextView textView, un unVar, String str, ImageButton imageButton, TextView textView2, w40 w40Var) {
            this.p = textView;
            this.q = unVar;
            this.r = str;
            this.s = imageButton;
            this.t = textView2;
            this.u = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView = this.p;
            if (textView != null) {
                textView.setText("");
            }
            this.q.i0(this.r, "");
            ho k = ho.k();
            if (k == null) {
                return;
            }
            k.u();
            this.s.setImageResource(0);
            this.t.setVisibility(8);
            com.daaw.e0 e0Var = (com.daaw.e0) this.u.a();
            if (e0Var != null) {
                e0Var.a(this);
            }
        }
    }

    public static /* synthetic */ void A(un unVar, String str, boolean z2, boolean z3, m2[] m2VarArr, xg[] xgVarArr, TextView textView, View view, Object obj) {
        int k2 = f80.k(unVar.m(str, new float[]{1.0f, 1.0f, 1.0f, 1.0f}));
        if (z2) {
            if (z3) {
                m2VarArr[0].setVisibility(0);
            } else {
                m2VarArr[0].setVisibility(8);
            }
            if (!xgVarArr[0].equals(obj)) {
                xgVarArr[0].h(k2, true);
            }
        }
        textView.setText(br1.q(k2));
        view.setBackgroundColor(k2);
    }

    public static /* synthetic */ void B(un unVar, String str, boolean z2, boolean z3, m2[] m2VarArr, xg[] xgVarArr, TextView textView, View view, Object obj) {
        int r2 = unVar.r(str, -1);
        if (z2) {
            if (z3) {
                m2VarArr[0].setVisibility(0);
            } else {
                m2VarArr[0].setVisibility(8);
            }
            if (!xgVarArr[0].equals(obj)) {
                xgVarArr[0].h(r2, true);
            }
        }
        textView.setText(br1.q(r2));
        view.setBackgroundColor(r2);
    }

    public static /* synthetic */ void C(boolean z2, un unVar, String str, ho hoVar, com.daaw.e0 e0Var, xg[] xgVarArr, w40 w40Var, int i2) {
        if (z2) {
            float[] fArr = new float[4];
            f80.p(fArr, i2);
            unVar.K(str, fArr);
        } else {
            unVar.Y(str, i2);
        }
        hoVar.u();
        e0Var.a(xgVarArr[0]);
        com.daaw.e0 e0Var2 = (com.daaw.e0) w40Var.a();
        if (e0Var2 != null) {
            e0Var2.a(null);
        }
    }

    public static /* synthetic */ void D(boolean z2, un unVar, String str, ho hoVar, com.daaw.e0 e0Var, xg[] xgVarArr, w40 w40Var, int i2) {
        if (z2) {
            float[] fArr = new float[4];
            f80.p(fArr, i2);
            unVar.K(str, fArr);
        } else {
            unVar.Y(str, i2);
        }
        hoVar.u();
        e0Var.a(xgVarArr[0]);
        com.daaw.e0 e0Var2 = (com.daaw.e0) w40Var.a();
        if (e0Var2 != null) {
            e0Var2.a(null);
        }
    }

    public static int G(ho hoVar, LayoutInflater layoutInflater, un unVar, ViewGroup viewGroup, Iterator<String> it) {
        e0 e0Var = new e0();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            if (!l(hoVar, layoutInflater, unVar, viewGroup, it.next(), false, e0Var)) {
                i3--;
            }
            i2 = i3;
        }
        return i2;
    }

    public static String i(String str) {
        StringBuilder sb;
        char charAt = str.charAt(0);
        String str2 = "" + Character.toLowerCase(charAt);
        for (int i2 = 1; i2 < str.length(); i2++) {
            char charAt2 = str.charAt(i2);
            if (Character.isUpperCase(charAt2)) {
                sb = new StringBuilder();
                sb.append(str2 + '_');
                sb.append(Character.toLowerCase(charAt2));
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(charAt2);
            }
            str2 = sb.toString();
        }
        return str2;
    }

    public static void j(boolean z2, ho hoVar, LayoutInflater layoutInflater, un unVar, boolean z3, w40<com.daaw.e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, String[] strArr) {
        View view;
        un unVar2;
        String str3;
        ViewGroup viewGroup2;
        String str4;
        String str5 = str2;
        String str6 = "";
        if (z2) {
            str3 = unVar.u(str5, "");
            unVar2 = null;
            viewGroup2 = null;
            view = layoutInflater.inflate(R.layout.dialog_customize_vis_element_sel, (ViewGroup) null);
        } else {
            un h2 = unVar.h(str5);
            String B = h2.B();
            View inflate = layoutInflater.inflate(R.layout.dialog_customize_vis_element_child, (ViewGroup) null);
            view = inflate;
            unVar2 = h2;
            str3 = B;
            viewGroup2 = (ViewGroup) inflate.findViewById(R.id.linearLayoutContent);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(str);
        boolean[] zArr = {false};
        Spinner spinner = (Spinner) view.findViewById(R.id.spinnerType);
        int i2 = 0;
        while (true) {
            if (i2 >= strArr.length) {
                i2 = -1;
                break;
            } else if (str3.equals(strArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        String[] strArr2 = new String[strArr.length];
        int i3 = 0;
        while (i3 < strArr.length) {
            String str7 = strArr[i3];
            int u2 = u(str7);
            if (u2 > 0) {
                strArr2[i3] = layoutInflater.getContext().getString(u2);
                str4 = str6;
            } else {
                String replace = i(str5 + str7).replace(" ", str6);
                StringBuilder sb = new StringBuilder();
                str4 = str6;
                sb.append("<string name=\"");
                sb.append(replace);
                sb.append("\">");
                sb.append(str7);
                sb.append("</string> =|=|= case \"");
                sb.append(str7);
                sb.append("\": return R.string.");
                sb.append(replace);
                sb.append(";");
                strArr2[i3] = str7;
            }
            i3++;
            str5 = str2;
            str6 = str4;
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(hoVar.getActivity(), 17367048, strArr2));
        if (i2 >= 0) {
            spinner.setSelection(i2, false);
        }
        hoVar.b(spinner);
        zArr[0] = true;
        ViewGroup viewGroup3 = viewGroup2;
        spinner.setOnItemSelectedListener(new f0(zArr, strArr, z2, unVar, str2, w40Var, unVar2));
        if (strArr.length > 0) {
            spinner.setVisibility(0);
        } else {
            spinner.setVisibility(8);
            textView.setTextColor(textView.getResources().getColor(R.color.white_alpha_25));
        }
        if (z2) {
            viewGroup.addView(view);
            return;
        }
        int G = G(hoVar, layoutInflater, unVar2, viewGroup3, unVar2.e());
        if (strArr.length > 0 || G > 0) {
            viewGroup.addView(view);
        }
        if (G <= 0) {
            viewGroup3.setVisibility(8);
        }
    }

    public static com.daaw.e0<Object> k(ho hoVar, un unVar, boolean z2, View view, String str, com.daaw.e0<Object> e0Var) {
        if (!z2) {
            hoVar.A(unVar, str, e0Var);
        }
        if (z2) {
            View findViewById = view.findViewById(R.id.elementDetailContent);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            view.findViewById(R.id.elementRoot).setOnClickListener(new g0(unVar, str, view, e0Var));
        }
        if (e0Var != null) {
            e0Var.a(null);
        }
        return e0Var;
    }

    public static boolean l(ho hoVar, LayoutInflater layoutInflater, un unVar, ViewGroup viewGroup, String str, boolean z2, w40<com.daaw.e0<Object>> w40Var) {
        String x2;
        boolean z3;
        float v2;
        float v3;
        boolean z4;
        boolean z5;
        boolean z6;
        String x3;
        boolean z7;
        String x4 = unVar.x(str);
        String q2 = unVar.q(str);
        String[] y2 = un.y(x4);
        if (!y2[0].equals("i") || y2.length < 3) {
            if (y2[0].equals("pb")) {
                x3 = x(str, q2, layoutInflater.getContext());
                z7 = true;
            } else if (y2[0].equals("b")) {
                x3 = x(str, q2, layoutInflater.getContext());
                z7 = false;
            } else {
                if (!y2[0].equals("crgb")) {
                    if (y2[0].equals("crgba")) {
                        z5 = true;
                        z6 = false;
                        r(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, z5, z6, x(str, q2, layoutInflater.getContext()), str);
                    } else if (!y2[0].equals("crgb_hl")) {
                        if (y2[0].equals("chsl4f")) {
                            z5 = false;
                        } else if (y2[0].equals("chsla4f")) {
                            z5 = true;
                        } else if (y2[0].equals("f") && y2.length >= 3) {
                            float v4 = br1.v(y2[1], 0.0f);
                            float v5 = br1.v(y2[2], 100.0f);
                            o(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x(str, q2, layoutInflater.getContext()), str, v4, v5, (v5 - v4) / 40.0f);
                        } else if (!y2[0].equals("f2") || y2.length < 3) {
                            if (y2[0].equals("mvarf") && y2.length >= 3) {
                                v2 = br1.v(y2[1], 0.0f);
                                v3 = br1.v(y2[2], 100.0f);
                                z4 = false;
                            } else if (!y2[0].equals("mvarf2") || y2.length < 3) {
                                if (y2[0].equals("txt")) {
                                    x2 = x(str, q2, layoutInflater.getContext());
                                    z3 = false;
                                } else if (y2[0].equals("ptxt")) {
                                    x2 = x(str, q2, layoutInflater.getContext());
                                    z3 = true;
                                } else if (y2[0].equals("img")) {
                                    int length = y2.length - 1;
                                    String[] strArr = new String[length];
                                    System.arraycopy(y2, 1, strArr, 0, length);
                                    p(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x(str, q2, layoutInflater.getContext()), str, strArr, false);
                                } else if (y2[0].equals("pimg")) {
                                    int length2 = y2.length - 1;
                                    String[] strArr2 = new String[length2];
                                    System.arraycopy(y2, 1, strArr2, 0, length2);
                                    p(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x(str, q2, layoutInflater.getContext()), str, strArr2, true);
                                } else if (y2[0].equals("asset")) {
                                    int length3 = y2.length - 1;
                                    String[] strArr3 = new String[length3];
                                    System.arraycopy(y2, 1, strArr3, 0, length3);
                                    m(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x(str, q2, layoutInflater.getContext()), str, strArr3, false);
                                } else if (y2[0].equals("passet")) {
                                    int length4 = y2.length - 1;
                                    String[] strArr4 = new String[length4];
                                    System.arraycopy(y2, 1, strArr4, 0, length4);
                                    m(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x(str, q2, layoutInflater.getContext()), str, strArr4, true);
                                } else if (y2[0].equals("sel")) {
                                    int length5 = y2.length - 1;
                                    String[] strArr5 = new String[length5];
                                    System.arraycopy(y2, 1, strArr5, 0, length5);
                                    j(true, hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x(str, q2, layoutInflater.getContext()), str, strArr5);
                                } else if (!y2[0].equals("_child")) {
                                    return false;
                                } else {
                                    int length6 = y2.length - 1;
                                    String[] strArr6 = new String[length6];
                                    System.arraycopy(y2, 1, strArr6, 0, length6);
                                    j(false, hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x(str, q2, layoutInflater.getContext()), str, strArr6);
                                }
                                s(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x2, str, z3);
                            } else {
                                v2 = br1.v(y2[1], 0.0f);
                                v3 = br1.v(y2[2], 100.0f);
                                z4 = true;
                            }
                            oo.K(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, z4, x(str, q2, layoutInflater.getContext()), str, v2, v3, (v3 - v2) / 40.0f);
                        } else {
                            float v6 = br1.v(y2[1], 0.0f);
                            float v7 = br1.v(y2[2], 100.0f);
                            t(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x(str, q2, layoutInflater.getContext()), str, v6, v7, (v7 - v6) / 40.0f);
                        }
                        z6 = true;
                        r(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, z5, z6, x(str, q2, layoutInflater.getContext()), str);
                    }
                }
                z5 = false;
                z6 = false;
                r(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, z5, z6, x(str, q2, layoutInflater.getContext()), str);
            }
            n(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x3, str, z7);
        } else {
            q(hoVar, layoutInflater, unVar, z2, w40Var, viewGroup, x(str, q2, layoutInflater.getContext()), str, br1.x(y2[1], 0), br1.x(y2[2], 100));
        }
        return true;
    }

    public static void m(ho hoVar, LayoutInflater layoutInflater, un unVar, boolean z2, w40<com.daaw.e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, String[] strArr, boolean z3) {
        View view;
        LayoutInflater layoutInflater2 = layoutInflater;
        unVar.w(str2, "");
        ViewGroup viewGroup2 = null;
        View inflate = layoutInflater2.inflate(z3 ? z2 ? R.layout.dialog_customize_vis_elementdetail_image_pr : R.layout.dialog_customize_vis_element_image_pr : z2 ? R.layout.dialog_customize_vis_elementdetail_image : R.layout.dialog_customize_vis_element_image, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        View findViewById = inflate.findViewById(R.id.elemValue);
        int i2 = R.id.btn0;
        ImageButton imageButton = (ImageButton) findViewById.findViewById(R.id.btn0);
        TextView textView = (TextView) findViewById.findViewById(R.id.txt0);
        int i3 = 0;
        imageButton.setClickable(false);
        k(hoVar, unVar, z2, inflate, str2, new x(unVar, str2, strArr, textView, imageButton));
        if (z2) {
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layoutContent);
            Button button = (Button) inflate.findViewById(R.id.btnResetValue);
            ((Button) inflate.findViewById(R.id.btnValue)).setVisibility(8);
            int i4 = 0;
            while (i4 < strArr.length) {
                String[] strArr2 = new String[2];
                br1.B(strArr[i4], 58, strArr2);
                int x2 = br1.x(strArr2[1], i3);
                View inflate2 = layoutInflater2.inflate(z3 ? R.layout.dialog_customize_vis_element_asset_pr_elem : R.layout.dialog_customize_vis_element_asset_elem, viewGroup2);
                ImageButton imageButton2 = (ImageButton) inflate2.findViewById(i2);
                imageButton2.setImageResource(x2);
                ImageButton imageButton3 = imageButton;
                imageButton2.setOnClickListener(new y(unVar, str2, strArr2, imageButton3, x2, textView, w40Var));
                linearLayout.addView(inflate2);
                i4++;
                layoutInflater2 = layoutInflater;
                button = button;
                inflate = inflate;
                imageButton = imageButton3;
                viewGroup2 = viewGroup2;
                i3 = 0;
                i2 = R.id.btn0;
            }
            view = inflate;
            button.setOnClickListener(new z(null, unVar, str2, imageButton, textView, w40Var));
        } else {
            view = inflate;
        }
        viewGroup.addView(view);
    }

    public static void n(ho hoVar, LayoutInflater layoutInflater, un unVar, boolean z2, w40<com.daaw.e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, boolean z3) {
        View inflate = layoutInflater.inflate(z3 ? z2 ? R.layout.dialog_customize_vis_elementdetail_toggle_pr : R.layout.dialog_customize_vis_element_toggle_pr : z2 ? R.layout.dialog_customize_vis_elementdetail_toggle : R.layout.dialog_customize_vis_element_toggle, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(null);
        k(hoVar, unVar, z2, inflate, str2, new a(unVar, str2, checkBox));
        checkBox.setOnCheckedChangeListener(new b(unVar, str2, w40Var));
        viewGroup.addView(inflate);
    }

    public static void o(ho hoVar, LayoutInflater layoutInflater, un unVar, boolean z2, w40<com.daaw.e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, float f2, float f3, float f4) {
        View inflate = layoutInflater.inflate(z2 ? R.layout.dialog_customize_vis_elementdetail_bar : R.layout.dialog_customize_vis_element_bar, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        View findViewById = inflate.findViewById(R.id.lineBarBg);
        View findViewById2 = inflate.findViewById(R.id.lineBarValue);
        SeekBar[] seekBarArr = {null};
        EditText[] editTextArr = {null};
        if (z2) {
            seekBarArr[0] = (SeekBar) inflate.findViewById(R.id.seekBar);
            editTextArr[0] = (EditText) inflate.findViewById(R.id.editTxt);
            seekBarArr[0].setMax((int) ((f3 - f2) / f4));
        }
        com.daaw.e0<Object> k2 = k(hoVar, unVar, z2, inflate, str2, new f(unVar, str2, f2, textView, findViewById, findViewById2, f3, f4, z2, seekBarArr, editTextArr));
        if (z2) {
            seekBarArr[0].setOnSeekBarChangeListener(new g(f4, f2, unVar, str2, k2, seekBarArr, w40Var));
            editTextArr[0].addTextChangedListener(new h(f2, f3, unVar, str2, k2, editTextArr, w40Var));
        }
        viewGroup.addView(inflate);
    }

    public static void p(ho hoVar, LayoutInflater layoutInflater, un unVar, boolean z2, w40<com.daaw.e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, String[] strArr, boolean z3) {
        ViewGroup viewGroup2;
        View view;
        int i2;
        int i3;
        Button button;
        Button button2;
        View view2;
        LinearLayout linearLayout;
        LayoutInflater layoutInflater2 = layoutInflater;
        String[] strArr2 = strArr;
        vn vnVar = hoVar.y;
        int c2 = vnVar != null ? vnVar.c() : 0;
        String w2 = unVar.w(str2, "");
        View inflate = layoutInflater2.inflate(z3 ? z2 ? R.layout.dialog_customize_vis_elementdetail_image_pr : R.layout.dialog_customize_vis_element_image_pr : z2 ? R.layout.dialog_customize_vis_elementdetail_image : R.layout.dialog_customize_vis_element_image, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        View findViewById = inflate.findViewById(R.id.elemValue);
        ImageButton imageButton = (ImageButton) findViewById.findViewById(R.id.btn0);
        TextView textView = (TextView) findViewById.findViewById(R.id.txt0);
        imageButton.setClickable(false);
        TextView[] textViewArr = {null, null};
        if (z2 && !z3) {
            textViewArr[0] = (EditText) inflate.findViewById(R.id.editTxt);
            textViewArr[1] = (TextView) inflate.findViewById(R.id.txtV);
        }
        ViewGroup viewGroup3 = null;
        com.daaw.e0<Object> k2 = k(hoVar, unVar, z2, inflate, str2, new q(unVar, str2, textView, imageButton, z2, z3, textViewArr));
        if (z2) {
            View view3 = inflate;
            LinearLayout linearLayout2 = (LinearLayout) view3.findViewById(R.id.layoutContent);
            Button button3 = (Button) view3.findViewById(R.id.btnValue);
            Button button4 = (Button) view3.findViewById(R.id.btnResetValue);
            int i4 = 0;
            boolean z4 = false;
            while (true) {
                int length = strArr2.length;
                i2 = R.layout.dialog_customize_vis_element_asset_elem;
                if (i4 >= length) {
                    break;
                }
                String str3 = strArr2[i4];
                int a2 = qg0.a(str3);
                if (a2 <= 0) {
                    int i0 = xi.i0(str3);
                    i3 = i4;
                    button = button4;
                    button2 = button3;
                    view2 = view3;
                    if (i0 >= 0) {
                        z4 = true;
                    }
                    linearLayout = linearLayout2;
                } else {
                    View inflate2 = layoutInflater2.inflate(R.layout.dialog_customize_vis_element_asset_elem, viewGroup3);
                    ImageButton imageButton2 = (ImageButton) inflate2.findViewById(R.id.btn0);
                    imageButton2.setImageResource(a2);
                    i3 = i4;
                    button = button4;
                    button2 = button3;
                    view2 = view3;
                    linearLayout = linearLayout2;
                    imageButton2.setOnClickListener(new r(unVar, str2, str3, k2, imageButton2, w40Var));
                    linearLayout.addView(inflate2);
                }
                i4 = i3 + 1;
                button4 = button;
                button3 = button2;
                linearLayout2 = linearLayout;
                view3 = view2;
                viewGroup3 = null;
                strArr2 = strArr;
            }
            Button button5 = button4;
            Button button6 = button3;
            View view4 = view3;
            LinearLayout linearLayout3 = linearLayout2;
            if (z4) {
                int i5 = 1;
                while (i5 < c2) {
                    String n0 = xi.n0(i5);
                    View inflate3 = layoutInflater2.inflate(i2, (ViewGroup) null);
                    TextView textView2 = (TextView) inflate3.findViewById(R.id.txt0);
                    textView2.setVisibility(0);
                    textView2.setText("" + i5);
                    ImageButton imageButton3 = (ImageButton) inflate3.findViewById(R.id.btn0);
                    imageButton3.setImageResource(R.drawable.ic_visual1);
                    imageButton3.setOnClickListener(new s(unVar, str2, n0, k2, imageButton3, w40Var));
                    linearLayout3.addView(inflate3);
                    i5++;
                    layoutInflater2 = layoutInflater;
                    i2 = R.layout.dialog_customize_vis_element_asset_elem;
                }
            }
            button6.setOnClickListener(new t(null, unVar, str2, w2));
            button5.setOnClickListener(new u(null, unVar, str2, k2, button5, w40Var));
            if (!z3) {
                textViewArr[0].addTextChangedListener(new w(unVar, str2, k2, textViewArr, w40Var));
            }
            viewGroup2 = viewGroup;
            view = view4;
        } else {
            viewGroup2 = viewGroup;
            view = inflate;
        }
        viewGroup2.addView(view);
    }

    public static void q(ho hoVar, LayoutInflater layoutInflater, un unVar, boolean z2, w40<com.daaw.e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, int i2, int i3) {
        unVar.r(str2, i2);
        View inflate = layoutInflater.inflate(z2 ? R.layout.dialog_customize_vis_elementdetail_bar : R.layout.dialog_customize_vis_element_bar, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        View findViewById = inflate.findViewById(R.id.lineBarBg);
        View findViewById2 = inflate.findViewById(R.id.lineBarValue);
        SeekBar[] seekBarArr = {null};
        EditText[] editTextArr = {null};
        if (z2) {
            seekBarArr[0] = (SeekBar) inflate.findViewById(R.id.seekBar);
            editTextArr[0] = (EditText) inflate.findViewById(R.id.editTxt);
            seekBarArr[0].setMax(i3 - i2);
        }
        com.daaw.e0<Object> k2 = k(hoVar, unVar, z2, inflate, str2, new c(unVar, str2, i2, textView, findViewById, findViewById2, i3, z2, seekBarArr, editTextArr));
        if (z2) {
            seekBarArr[0].setOnSeekBarChangeListener(new d(unVar, str2, i2, k2, seekBarArr, w40Var));
            editTextArr[0].addTextChangedListener(new e(i2, i3, unVar, str2, k2, editTextArr, w40Var));
        }
        viewGroup.addView(inflate);
    }

    public static void r(final ho hoVar, LayoutInflater layoutInflater, final un unVar, final boolean z2, final w40<com.daaw.e0<Object>> w40Var, ViewGroup viewGroup, final boolean z3, final boolean z4, String str, final String str2) {
        com.daaw.e0 e0Var;
        final un unVar2;
        View inflate = layoutInflater.inflate(z2 ? R.layout.dialog_customize_vis_elementdetail_crgba : R.layout.dialog_customize_vis_element_crgba, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        final TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        final View findViewById = inflate.findViewById(R.id.solidValue);
        final xg[] xgVarArr = {null};
        vj0[] vj0VarArr = {null};
        final m2[] m2VarArr = {null};
        if (z2) {
            xgVarArr[0] = (xg) inflate.findViewById(R.id.colorPicker);
            vj0VarArr[0] = (vj0) inflate.findViewById(R.id.lightnessSlider);
            m2VarArr[0] = (m2) inflate.findViewById(R.id.alphaSlider);
            xgVarArr[0].setLightnessSlider(vj0VarArr[0]);
            xgVarArr[0].setAlphaSlider(m2VarArr[0]);
        }
        if (z4) {
            unVar2 = unVar;
            e0Var = new com.daaw.e0() { // from class: com.daaw.ko
                @Override // com.daaw.e0
                public final void a(Object obj) {
                    no.A(un.this, str2, z2, z3, m2VarArr, xgVarArr, textView, findViewById, obj);
                }
            };
        } else {
            unVar2 = unVar;
            e0Var = new com.daaw.e0() { // from class: com.daaw.jo
                @Override // com.daaw.e0
                public final void a(Object obj) {
                    no.B(un.this, str2, z2, z3, m2VarArr, xgVarArr, textView, findViewById, obj);
                }
            };
        }
        final com.daaw.e0<Object> k2 = k(hoVar, unVar2, z2, inflate, str2, e0Var);
        if (z2) {
            xgVarArr[0].a(new au0() { // from class: com.daaw.lo
                @Override // com.daaw.au0
                public final void a(int i2) {
                    no.C(z4, unVar, str2, hoVar, k2, xgVarArr, w40Var, i2);
                }
            });
            xgVarArr[0].b(new bu0() { // from class: com.daaw.mo
                @Override // com.daaw.bu0
                public final void a(int i2) {
                    no.D(z4, unVar, str2, hoVar, k2, xgVarArr, w40Var, i2);
                }
            });
        }
        viewGroup.addView(inflate);
    }

    public static void s(ho hoVar, LayoutInflater layoutInflater, un unVar, boolean z2, w40<com.daaw.e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, boolean z3) {
        String w2 = unVar.w(str2, "");
        View inflate = layoutInflater.inflate(z3 ? z2 ? R.layout.dialog_customize_vis_elementdetail_txt_pr : R.layout.dialog_customize_vis_element_txt_pr : z2 ? R.layout.dialog_customize_vis_elementdetail_txt : R.layout.dialog_customize_vis_element_txt, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        k(hoVar, unVar, z2, inflate, str2, new o(unVar, str2, textView));
        if (z2) {
            EditText editText = (EditText) inflate.findViewById(R.id.editTxt);
            editText.setText(w2);
            editText.addTextChangedListener(new p(textView, unVar, str2, w40Var));
        }
        viewGroup.addView(inflate);
    }

    public static void t(ho hoVar, LayoutInflater layoutInflater, un unVar, boolean z2, w40<com.daaw.e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, float f2, float f3, float f4) {
        unVar.z(str2, new bs1(f2, f2));
        View inflate = layoutInflater.inflate(z2 ? R.layout.dialog_customize_vis_elementdetail_bar_xy : R.layout.dialog_customize_vis_element_bar_xy, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        View findViewById = inflate.findViewById(R.id.lineBarBgX);
        View findViewById2 = inflate.findViewById(R.id.lineBarValueX);
        View findViewById3 = inflate.findViewById(R.id.lineBarBgY);
        View findViewById4 = inflate.findViewById(R.id.lineBarValueY);
        SeekBar[] seekBarArr = {null};
        SeekBar[] seekBarArr2 = {null};
        EditText[] editTextArr = {null};
        EditText[] editTextArr2 = {null};
        if (z2) {
            seekBarArr[0] = (SeekBar) inflate.findViewById(R.id.seekBarX);
            seekBarArr2[0] = (SeekBar) inflate.findViewById(R.id.seekBarY);
            editTextArr[0] = (EditText) inflate.findViewById(R.id.editTxtX);
            editTextArr2[0] = (EditText) inflate.findViewById(R.id.editTxtY);
            int i2 = (int) ((f3 - f2) / f4);
            seekBarArr[0].setMax(i2);
            seekBarArr2[0].setMax(i2);
        }
        com.daaw.e0<Object> k2 = k(hoVar, unVar, z2, inflate, str2, new i(unVar, str2, f2, textView, findViewById, findViewById2, f3, f4, findViewById3, findViewById4, z2, seekBarArr, seekBarArr2, editTextArr, editTextArr2));
        if (z2) {
            seekBarArr[0].setOnSeekBarChangeListener(new j(unVar, str2, f2, f4, k2, seekBarArr, w40Var));
            seekBarArr2[0].setOnSeekBarChangeListener(new l(unVar, str2, f2, f4, k2, seekBarArr2, w40Var));
            editTextArr[0].addTextChangedListener(new m(f2, f3, unVar, str2, k2, editTextArr, w40Var));
            editTextArr2[0].addTextChangedListener(new n(f2, f3, unVar, str2, k2, editTextArr2, w40Var));
        }
        viewGroup.addView(inflate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int u(String str) {
        char c2;
        str.hashCode();
        switch (str.hashCode()) {
            case -2067891215:
                if (str.equals("Spectrum")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -2022305722:
                if (str.equals("Letter")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1997548570:
                if (str.equals("Manual")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1970646622:
                if (str.equals("ConstantShake")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1919497322:
                if (str.equals("Vertical")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1823822708:
                if (str.equals("Screen")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1808097416:
                if (str.equals("Transparency")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1726838578:
                if (str.equals("Vortex")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1274453993:
                if (str.equals("ConstantShakeMore")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1199117987:
                if (str.equals("AddAlpha")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1169699505:
                if (str.equals("Rectangle")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1137728652:
                if (str.equals("TrackPosition")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -1037027930:
                if (str.equals("BeatCamShakeLess")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -1036988574:
                if (str.equals("BeatCamShakeMore")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -913872828:
                if (str.equals("Horizontal")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -831910124:
                if (str.equals("TotalTimeBackward")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case -521561331:
                if (str.equals("InvertedTransparency")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case -500990035:
                if (str.equals("Nothing")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -269505853:
                if (str.equals("TotalTimeWhenPlaying")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case -147734627:
                if (str.equals("PreMulAlpha")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 65665:
                if (str.equals("Add")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 2063072:
                if (str.equals("Bars")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 2066390:
                if (str.equals("Beat")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 2368532:
                if (str.equals("Line")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 2433880:
                if (str.equals("None")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 63357246:
                if (str.equals("Alpha")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 111442729:
                if (str.equals("unset")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case 319881825:
                if (str.equals("Spectrum2")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 361054323:
                if (str.equals("TransparencyAndBlacks")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            case 395745294:
                if (str.equals("ConstantShakeRotLess")) {
                    c2 = ' ';
                    break;
                }
                c2 = 65535;
                break;
            case 395784650:
                if (str.equals("ConstantShakeRotMore")) {
                    c2 = '!';
                    break;
                }
                c2 = 65535;
                break;
            case 431547818:
                if (str.equals("SharpBars")) {
                    c2 = '\"';
                    break;
                }
                c2 = 65535;
                break;
            case 668852061:
                if (str.equals("Waveform")) {
                    c2 = '#';
                    break;
                }
                c2 = 65535;
                break;
            case 916906211:
                if (str.equals("BeatCamShakeRotLess")) {
                    c2 = '$';
                    break;
                }
                c2 = 65535;
                break;
            case 916945567:
                if (str.equals("BeatCamShakeRotMore")) {
                    c2 = '%';
                    break;
                }
                c2 = 65535;
                break;
            case 958826889:
                if (str.equals("TransparencyAndWhites")) {
                    c2 = '&';
                    break;
                }
                c2 = 65535;
                break;
            case 1080667017:
                if (str.equals("HorizontalAndVertical")) {
                    c2 = '\'';
                    break;
                }
                c2 = 65535;
                break;
            case 1135983803:
                if (str.equals("EffectTransform")) {
                    c2 = '(';
                    break;
                }
                c2 = 65535;
                break;
            case 1258639580:
                if (str.equals("TotalTimeAndBeat")) {
                    c2 = ')';
                    break;
                }
                c2 = 65535;
                break;
            case 1426685969:
                if (str.equals("TotalTime")) {
                    c2 = '*';
                    break;
                }
                c2 = 65535;
                break;
            case 1536319149:
                if (str.equals("SidedPolygon")) {
                    c2 = '+';
                    break;
                }
                c2 = 65535;
                break;
            case 1547631181:
                if (str.equals("BeatRandomShake")) {
                    c2 = ',';
                    break;
                }
                c2 = 65535;
                break;
            case 1577119283:
                if (str.equals("BeatTriggerAnim")) {
                    c2 = '-';
                    break;
                }
                c2 = 65535;
                break;
            case 1802881624:
                if (str.equals("HorizontalLine")) {
                    c2 = '.';
                    break;
                }
                c2 = 65535;
                break;
            case 1998378318:
                if (str.equals("RoundBars")) {
                    c2 = '/';
                    break;
                }
                c2 = 65535;
                break;
            case 2018617584:
                if (str.equals("Circle")) {
                    c2 = '0';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return R.string.sample_provider_spectrum;
            case 1:
                return R.string.shape_path_letter;
            case 2:
                return R.string.motion_source_manual;
            case 3:
                return R.string.measure_constant_shake;
            case 4:
                return R.string.mirror_mode_vertical;
            case 5:
                return R.string.blend_mode_screen;
            case 6:
                return R.string.mask_mode_transparency;
            case 7:
                return R.string.force_field_vortex;
            case '\b':
                return R.string.anchor_center;
            case '\t':
                return R.string.measure_constant_shake_more;
            case '\n':
                return R.string.intro_blend_mode_add_alpha;
            case 11:
                return R.string.spawn_area_rectangle;
            case '\f':
                return R.string.measure_track_position;
            case '\r':
                return R.string.measure_beat_cam_shake_less;
            case 14:
                return R.string.measure_beat_cam_shake_more;
            case 15:
                return R.string.mirror_mode_horizontal;
            case 16:
                return R.string.measure_total_time_backward;
            case 17:
                return R.string.mask_mode_inverted_transparency;
            case 18:
                return R.string.measure_nothing;
            case 19:
                return R.string.measure_total_time_when_playing;
            case 20:
                return R.string.blend_mode_pre_mul_alpha;
            case 21:
                return R.string.blend_mode_add;
            case 22:
                return R.string.anchor_end;
            case 23:
                return R.string.segment_bars;
            case 24:
                return R.string.measure_beat;
            case 25:
                return R.string.segment_line;
            case 26:
                return R.string.shape_none;
            case 27:
                return R.string.intro_blend_mode_alpha;
            case 28:
                return R.string.anchor_start;
            case 29:
                return R.string.anchor_unset;
            case 30:
                return R.string.sample_provider_spectrum2;
            case 31:
                return R.string.mask_mode_transparency_and_blacks;
            case ' ':
                return R.string.measure_constant_shake_rot_less;
            case '!':
                return R.string.measure_constant_shake_rot_more;
            case '\"':
                return R.string.segment_sharp_bars;
            case '#':
                return R.string.sample_provider_waveform;
            case '$':
                return R.string.measure_beat_cam_shake_rot_less;
            case '%':
                return R.string.measure_beat_cam_shake_rot_more;
            case '&':
                return R.string.mask_mode_transparency_and_whites;
            case '\'':
                return R.string.mirror_mode_horizontal_and_vertical;
            case '(':
                return R.string.motion_source_effect_transform;
            case ')':
                return R.string.measure_total_time_and_beat;
            case '*':
                return R.string.measure_total_time;
            case '+':
                return R.string.shape_sided_polygon;
            case ',':
                return R.string.measure_beat_random_shake;
            case '-':
                return R.string.measure_beat_trigger_anim;
            case '.':
                return R.string.shape_path_horizontal_line;
            case '/':
                return R.string.segment_round_bars;
            case '0':
                return R.string.shape_circle;
            default:
                return -1;
        }
    }

    public static int v(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1620329056:
                if (str.equals("Y Speed")) {
                    c2 = 0;
                    break;
                }
                break;
            case -951185088:
                if (str.equals("X Amount")) {
                    c2 = 1;
                    break;
                }
                break;
            case 88:
                if (str.equals("X")) {
                    c2 = 2;
                    break;
                }
                break;
            case 89:
                if (str.equals("Y")) {
                    c2 = 3;
                    break;
                }
                break;
            case 80089127:
                if (str.equals("Speed")) {
                    c2 = 4;
                    break;
                }
                break;
            case 365740034:
                if (str.equals("Beat Amount")) {
                    c2 = 5;
                    break;
                }
                break;
            case 457725221:
                if (str.equals("Smoothness")) {
                    c2 = 6;
                    break;
                }
                break;
            case 791625247:
                if (str.equals("Y Amount")) {
                    c2 = 7;
                    break;
                }
                break;
            case 870470476:
                if (str.equals("AppLogo")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1787134559:
                if (str.equals("X Speed")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1964981368:
                if (str.equals("Amount")) {
                    c2 = '\n';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return R.string.hint_y_speed;
            case 1:
                return R.string.hint_x_amount;
            case 2:
                return R.string.hint_x;
            case 3:
                return R.string.hint_y;
            case 4:
                return R.string.hint_speed;
            case 5:
                return R.string.hint_beat_amount;
            case 6:
                return R.string.hint_smoothness;
            case 7:
                return R.string.hint_y_amount;
            case '\b':
                return R.string.hint_app_logo;
            case '\t':
                return R.string.hint_x_speed;
            case '\n':
                return R.string.hint_amount;
            default:
                return 0;
        }
    }

    public static int w(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2132535343:
                if (str.equals("spectrum")) {
                    c2 = 0;
                    break;
                }
                break;
            case -2129324157:
                if (str.equals("startSize")) {
                    c2 = 1;
                    break;
                }
                break;
            case -2105107894:
                if (str.equals("targetImage")) {
                    c2 = 2;
                    break;
                }
                break;
            case -2092502904:
                if (str.equals("introBlendMode")) {
                    c2 = 3;
                    break;
                }
                break;
            case -2054882410:
                if (str.equals("blurredBorder")) {
                    c2 = 4;
                    break;
                }
                break;
            case -2032518305:
                if (str.equals("endSizeRandom")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1894434088:
                if (str.equals("sideSineWaveFreqRandom")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1830662607:
                if (str.equals("preSmooth")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1813453502:
                if (str.equals("measureWhat")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1798067094:
                if (str.equals("customImage")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -1762437773:
                if (str.equals("barWidth")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -1754072813:
                if (str.equals("posBlurAmount")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1749172349:
                if (str.equals("sourceCompositionIndex")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -1745709637:
                if (str.equals("sampleProvider")) {
                    c2 = '\r';
                    break;
                }
                break;
            case -1684743359:
                if (str.equals("higherHz")) {
                    c2 = 14;
                    break;
                }
                break;
            case -1680767714:
                if (str.equals("ColorTo")) {
                    c2 = 15;
                    break;
                }
                break;
            case -1672355622:
                if (str.equals("reactionDelay")) {
                    c2 = 16;
                    break;
                }
                break;
            case -1665280139:
                if (str.equals("useRandomVectorInstead")) {
                    c2 = 17;
                    break;
                }
                break;
            case -1607272580:
                if (str.equals("endSize")) {
                    c2 = 18;
                    break;
                }
                break;
            case -1523994363:
                if (str.equals("3layerColor")) {
                    c2 = 19;
                    break;
                }
                break;
            case -1519214023:
                if (str.equals("aWeight")) {
                    c2 = 20;
                    break;
                }
                break;
            case -1519052026:
                if (str.equals("hzLinearFactor")) {
                    c2 = 21;
                    break;
                }
                break;
            case -1509586196:
                if (str.equals("3layerScale")) {
                    c2 = 22;
                    break;
                }
                break;
            case -1435535992:
                if (str.equals("blurMultiplier")) {
                    c2 = 23;
                    break;
                }
                break;
            case -1428201511:
                if (str.equals("blurRadius")) {
                    c2 = 24;
                    break;
                }
                break;
            case -1416471601:
                if (str.equals("generatedAlbumArtHintForceGen")) {
                    c2 = 25;
                    break;
                }
                break;
            case -1411102829:
                if (str.equals("showUnblurredContentUnder")) {
                    c2 = 26;
                    break;
                }
                break;
            case -1356966249:
                if (str.equals("beatRangeValueLower")) {
                    c2 = 27;
                    break;
                }
                break;
            case -1330973839:
                if (str.equals("motionSource")) {
                    c2 = 28;
                    break;
                }
                break;
            case -1298315851:
                if (str.equals("sideSineWaveFreq")) {
                    c2 = 29;
                    break;
                }
                break;
            case -1279931764:
                if (str.equals("MeasureColorBlend")) {
                    c2 = 30;
                    break;
                }
                break;
            case -1218263876:
                if (str.equals("introFadeDuration")) {
                    c2 = 31;
                    break;
                }
                break;
            case -1216111997:
                if (str.equals("barWidthAffectedByShape")) {
                    c2 = ' ';
                    break;
                }
                break;
            case -1164928614:
                if (str.equals("sampleOutCountPower")) {
                    c2 = '!';
                    break;
                }
                break;
            case -1122059559:
                if (str.equals("sideSineWaveMagRandom")) {
                    c2 = '\"';
                    break;
                }
                break;
            case -1091298227:
                if (str.equals("overall")) {
                    c2 = '#';
                    break;
                }
                break;
            case -1073910849:
                if (str.equals("mirror")) {
                    c2 = '$';
                    break;
                }
                break;
            case -1043912605:
                if (str.equals("heightScale")) {
                    c2 = '%';
                    break;
                }
                break;
            case -967112229:
                if (str.equals("outroFadeDuration")) {
                    c2 = '&';
                    break;
                }
                break;
            case -954021426:
                if (str.equals("keepAspectRatio")) {
                    c2 = '\'';
                    break;
                }
                break;
            case -938578798:
                if (str.equals("radius")) {
                    c2 = '(';
                    break;
                }
                break;
            case -934025771:
                if (str.equals("fftSize")) {
                    c2 = ')';
                    break;
                }
                break;
            case -898533970:
                if (str.equals("smooth")) {
                    c2 = '*';
                    break;
                }
                break;
            case -869451088:
                if (str.equals("AudioCapture")) {
                    c2 = '+';
                    break;
                }
                break;
            case -862612413:
                if (str.equals("anchorX")) {
                    c2 = ',';
                    break;
                }
                break;
            case -862612412:
                if (str.equals("anchorY")) {
                    c2 = '-';
                    break;
                }
                break;
            case -858480819:
                if (str.equals("endSizeZFactor")) {
                    c2 = '.';
                    break;
                }
                break;
            case -729767381:
                if (str.equals("sampleOutCount")) {
                    c2 = '/';
                    break;
                }
                break;
            case -721446595:
                if (str.equals("motionBlur")) {
                    c2 = '0';
                    break;
                }
                break;
            case -691194386:
                if (str.equals("repeatSamples")) {
                    c2 = '1';
                    break;
                }
                break;
            case -676746057:
                if (str.equals("typeFace")) {
                    c2 = '2';
                    break;
                }
                break;
            case -667062077:
                if (str.equals("spectrumHz")) {
                    c2 = '3';
                    break;
                }
                break;
            case -628844548:
                if (str.equals("colorKey")) {
                    c2 = '4';
                    break;
                }
                break;
            case -619083598:
                if (str.equals("blurDivider")) {
                    c2 = '5';
                    break;
                }
                break;
            case -614537171:
                if (str.equals("highQualityAudioCapture")) {
                    c2 = '6';
                    break;
                }
                break;
            case -574382843:
                if (str.equals("fadeInAndOutTime")) {
                    c2 = '7';
                    break;
                }
                break;
            case -564200420:
                if (str.equals("ColorKey")) {
                    c2 = '8';
                    break;
                }
                break;
            case -509460392:
                if (str.equals("MeasureOverallSpeed")) {
                    c2 = '9';
                    break;
                }
                break;
            case -499975028:
                if (str.equals("trailLength")) {
                    c2 = ':';
                    break;
                }
                break;
            case -437239254:
                if (str.equals("TargetImage")) {
                    c2 = ';';
                    break;
                }
                break;
            case -420344778:
                if (str.equals("MeasurePos")) {
                    c2 = '<';
                    break;
                }
                break;
            case -406349635:
                if (str.equals("behaviour")) {
                    c2 = '=';
                    break;
                }
                break;
            case -387029296:
                if (str.equals("audioDurationMs")) {
                    c2 = '>';
                    break;
                }
                break;
            case -386326900:
                if (str.equals("measureScale")) {
                    c2 = '?';
                    break;
                }
                break;
            case -372996888:
                if (str.equals("spawnTime")) {
                    c2 = '@';
                    break;
                }
                break;
            case -342338300:
                if (str.equals("beatSmooth")) {
                    c2 = 'A';
                    break;
                }
                break;
            case -310480499:
                if (str.equals("ColorFrom")) {
                    c2 = 'B';
                    break;
                }
                break;
            case -248684892:
                if (str.equals("beatRangeBarFirst")) {
                    c2 = 'C';
                    break;
                }
                break;
            case -230491182:
                if (str.equals("saturation")) {
                    c2 = 'D';
                    break;
                }
                break;
            case -101338902:
                if (str.equals("freqShift")) {
                    c2 = 'E';
                    break;
                }
                break;
            case -80148248:
                if (str.equals("general")) {
                    c2 = 'F';
                    break;
                }
                break;
            case -76472197:
                if (str.equals("barHeightMultiplier")) {
                    c2 = 'G';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = 'H';
                    break;
                }
                break;
            case -2608886:
                if (str.equals("vectorAngleZ")) {
                    c2 = 'I';
                    break;
                }
                break;
            case 65:
                if (str.equals("A")) {
                    c2 = 'J';
                    break;
                }
                break;
            case 66:
                if (str.equals("B")) {
                    c2 = 'K';
                    break;
                }
                break;
            case 102102:
                if (str.equals("gap")) {
                    c2 = 'L';
                    break;
                }
                break;
            case 114586:
                if (str.equals("tag")) {
                    c2 = 'M';
                    break;
                }
                break;
            case 3016384:
                if (str.equals("bars")) {
                    c2 = 'N';
                    break;
                }
                break;
            case 3019702:
                if (str.equals("beat")) {
                    c2 = 'O';
                    break;
                }
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c2 = 'P';
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c2 = 'Q';
                    break;
                }
                break;
            case 19321079:
                if (str.equals("lowerFreqMagnitude")) {
                    c2 = 'R';
                    break;
                }
                break;
            case 65290051:
                if (str.equals("Color")) {
                    c2 = 'S';
                    break;
                }
                break;
            case 79847297:
                if (str.equals("Shape")) {
                    c2 = 'T';
                    break;
                }
                break;
            case 80089127:
                if (str.equals("Speed")) {
                    c2 = 'U';
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c2 = 'V';
                    break;
                }
                break;
            case 96672374:
                if (str.equals("sideSineWaveMag")) {
                    c2 = 'W';
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c2 = 'X';
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c2 = 'Y';
                    break;
                }
                break;
            case 109432316:
                if (str.equals("sides")) {
                    c2 = 'Z';
                    break;
                }
                break;
            case 143930394:
                if (str.equals("nearCameraFadeOutDistance")) {
                    c2 = '[';
                    break;
                }
                break;
            case 187480080:
                if (str.equals("Performance")) {
                    c2 = '\\';
                    break;
                }
                break;
            case 243901696:
                if (str.equals("generatedAlbumArtColor")) {
                    c2 = ']';
                    break;
                }
                break;
            case 272956996:
                if (str.equals("2layerColor")) {
                    c2 = '^';
                    break;
                }
                break;
            case 274882223:
                if (str.equals("maskMode")) {
                    c2 = '_';
                    break;
                }
                break;
            case 280051645:
                if (str.equals("keepAspectRatioAndCropToFit")) {
                    c2 = '`';
                    break;
                }
                break;
            case 280523342:
                if (str.equals("gravity")) {
                    c2 = 'a';
                    break;
                }
                break;
            case 287365163:
                if (str.equals("2layerScale")) {
                    c2 = 'b';
                    break;
                }
                break;
            case 316345088:
                if (str.equals("scaleIsUniform")) {
                    c2 = 'c';
                    break;
                }
                break;
            case 331178053:
                if (str.equals("blendModeContent")) {
                    c2 = 'd';
                    break;
                }
                break;
            case 357005299:
                if (str.equals("lowerHz")) {
                    c2 = 'e';
                    break;
                }
                break;
            case 364547910:
                if (str.equals("ShapePath")) {
                    c2 = 'f';
                    break;
                }
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    c2 = 'g';
                    break;
                }
                break;
            case 391971034:
                if (str.equals("blurEnabled")) {
                    c2 = 'h';
                    break;
                }
                break;
            case 396904763:
                if (str.equals("introFadeColor")) {
                    c2 = 'i';
                    break;
                }
                break;
            case 411341961:
                if (str.equals("scaleBlurAmount")) {
                    c2 = 'j';
                    break;
                }
                break;
            case 446220202:
                if (str.equals("reactionAccumulatedDelay")) {
                    c2 = 'k';
                    break;
                }
                break;
            case 463539320:
                if (str.equals("generatedAlbumArtHintNoText")) {
                    c2 = 'l';
                    break;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    c2 = 'm';
                    break;
                }
                break;
            case 491175137:
                if (str.equals("colorBlendOffset")) {
                    c2 = 'n';
                    break;
                }
                break;
            case 505030585:
                if (str.equals("transparencyStrength")) {
                    c2 = 'o';
                    break;
                }
                break;
            case 526636965:
                if (str.equals("colorKeyEnabled")) {
                    c2 = 'p';
                    break;
                }
                break;
            case 554105168:
                if (str.equals("vectorAngle")) {
                    c2 = 'q';
                    break;
                }
                break;
            case 668852061:
                if (str.equals("Waveform")) {
                    c2 = 'r';
                    break;
                }
                break;
            case 713328458:
                if (str.equals("mirrorSamples")) {
                    c2 = 's';
                    break;
                }
                break;
            case 718630340:
                if (str.equals("waveBehaviour")) {
                    c2 = 't';
                    break;
                }
                break;
            case 731484812:
                if (str.equals("flipMirror")) {
                    c2 = 'u';
                    break;
                }
                break;
            case 733347259:
                if (str.equals("fixedHeight")) {
                    c2 = 'v';
                    break;
                }
                break;
            case 747804969:
                if (str.equals("position")) {
                    c2 = 'w';
                    break;
                }
                break;
            case 747912225:
                if (str.equals("measureAnimationSpeed")) {
                    c2 = 'x';
                    break;
                }
                break;
            case 763187449:
                if (str.equals("beatRangeValueHigher")) {
                    c2 = 'y';
                    break;
                }
                break;
            case 798415995:
                if (str.equals("splitMultiplier")) {
                    c2 = 'z';
                    break;
                }
                break;
            case 869786304:
                if (str.equals("blurAmountMultiplier")) {
                    c2 = '{';
                    break;
                }
                break;
            case 895597972:
                if (str.equals("blendMode")) {
                    c2 = '|';
                    break;
                }
                break;
            case 916991557:
                if (str.equals("showUnblurredContent")) {
                    c2 = '}';
                    break;
                }
                break;
            case 940455948:
                if (str.equals("CountLimit")) {
                    c2 = '~';
                    break;
                }
                break;
            case 949546302:
                if (str.equals("colorTo")) {
                    c2 = 127;
                    break;
                }
                break;
            case 960570313:
                if (str.equals("lifetime")) {
                    c2 = 128;
                    break;
                }
                break;
            case 1068502137:
                if (str.equals("mirrorX")) {
                    c2 = 129;
                    break;
                }
                break;
            case 1068502138:
                if (str.equals("mirrorY")) {
                    c2 = 130;
                    break;
                }
                break;
            case 1092734564:
                if (str.equals("particleScale")) {
                    c2 = 131;
                    break;
                }
                break;
            case 1100527650:
                if (str.equals("beatRangeBarLast")) {
                    c2 = 132;
                    break;
                }
                break;
            case 1120049792:
                if (str.equals("starAndEndGap")) {
                    c2 = 133;
                    break;
                }
                break;
            case 1120512894:
                if (str.equals("Segment1")) {
                    c2 = 134;
                    break;
                }
                break;
            case 1120512895:
                if (str.equals("Segment2")) {
                    c2 = 135;
                    break;
                }
                break;
            case 1242558207:
                if (str.equals("introOutro")) {
                    c2 = 136;
                    break;
                }
                break;
            case 1267377247:
                if (str.equals("maxHeightScale")) {
                    c2 = 137;
                    break;
                }
                break;
            case 1296698412:
                if (str.equals("alignmentPosition")) {
                    c2 = 138;
                    break;
                }
                break;
            case 1310696935:
                if (str.equals("perspectiveDepth")) {
                    c2 = 139;
                    break;
                }
                break;
            case 1319065985:
                if (str.equals("softness")) {
                    c2 = 140;
                    break;
                }
                break;
            case 1331946914:
                if (str.equals("outputMultiplier")) {
                    c2 = 141;
                    break;
                }
                break;
            case 1406691941:
                if (str.equals("relativeMotionMode")) {
                    c2 = 142;
                    break;
                }
                break;
            case 1485446162:
                if (str.equals("splitAmount")) {
                    c2 = 143;
                    break;
                }
                break;
            case 1502785490:
                if (str.equals("sizeAspectRatio")) {
                    c2 = 144;
                    break;
                }
                break;
            case 1540100218:
                if (str.equals("verticalOrientation")) {
                    c2 = 145;
                    break;
                }
                break;
            case 1544069981:
                if (str.equals("flipInput")) {
                    c2 = 146;
                    break;
                }
                break;
            case 1544456423:
                if (str.equals("splitColor0")) {
                    c2 = 147;
                    break;
                }
                break;
            case 1544456424:
                if (str.equals("splitColor1")) {
                    c2 = 148;
                    break;
                }
                break;
            case 1544456425:
                if (str.equals("splitColor2")) {
                    c2 = 149;
                    break;
                }
                break;
            case 1575556722:
                if (str.equals("Behavior")) {
                    c2 = 150;
                    break;
                }
                break;
            case 1581341518:
                if (str.equals("autoDetectColorKey")) {
                    c2 = 151;
                    break;
                }
                break;
            case 1589741529:
                if (str.equals("filterStrength")) {
                    c2 = 152;
                    break;
                }
                break;
            case 1593214283:
                if (str.equals("splitEffect")) {
                    c2 = 153;
                    break;
                }
                break;
            case 1630413448:
                if (str.equals("SpawnArea")) {
                    c2 = 154;
                    break;
                }
                break;
            case 1706931947:
                if (str.equals("inputSize")) {
                    c2 = 155;
                    break;
                }
                break;
            case 1720742252:
                if (str.equals("opacityStrength")) {
                    c2 = 156;
                    break;
                }
                break;
            case 1744314882:
                if (str.equals("mirrorMode")) {
                    c2 = 157;
                    break;
                }
                break;
            case 1747046655:
                if (str.equals("vectorRelativeToCenter")) {
                    c2 = 158;
                    break;
                }
                break;
            case 1757102379:
                if (str.equals("audioProviderIndex")) {
                    c2 = 159;
                    break;
                }
                break;
            case 1796717668:
                if (str.equals("appearance")) {
                    c2 = 160;
                    break;
                }
                break;
            case 1859598371:
                if (str.equals("generatedAlbumArt")) {
                    c2 = 161;
                    break;
                }
                break;
            case 1881159577:
                if (str.equals("measureRot")) {
                    c2 = 162;
                    break;
                }
                break;
            case 1888191616:
                if (str.equals("generatedAlbumArtHintShiftHue")) {
                    c2 = 163;
                    break;
                }
                break;
            case 1916128758:
                if (str.equals("velocityAngle")) {
                    c2 = 164;
                    break;
                }
                break;
            case 1924293297:
                if (str.equals("minHeightScale")) {
                    c2 = 165;
                    break;
                }
                break;
            case 1931625903:
                if (str.equals("MaskImage")) {
                    c2 = 166;
                    break;
                }
                break;
            case 1980518829:
                if (str.equals("colorFrom")) {
                    c2 = 167;
                    break;
                }
                break;
            case 1984810242:
                if (str.equals("flipEveryOther")) {
                    c2 = 168;
                    break;
                }
                break;
            case 2012537073:
                if (str.equals("perspectiveFov")) {
                    c2 = 169;
                    break;
                }
                break;
            case 2026060898:
                if (str.equals("fadeInSize")) {
                    c2 = 170;
                    break;
                }
                break;
            case 2031828970:
                if (str.equals("speedRandom")) {
                    c2 = 171;
                    break;
                }
                break;
            case 2069908355:
                if (str.equals("1layerColor")) {
                    c2 = 172;
                    break;
                }
                break;
            case 2084316522:
                if (str.equals("1layerScale")) {
                    c2 = 173;
                    break;
                }
                break;
            case 2086906410:
                if (str.equals("filterRadius")) {
                    c2 = 174;
                    break;
                }
                break;
            case 2104827119:
                if (str.equals("ForceField")) {
                    c2 = 175;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return R.string.spectrum;
            case 1:
                return R.string.start_size;
            case 2:
            case ';':
                return R.string.target_image;
            case 3:
                return R.string.intro_blend_mode;
            case 4:
                return R.string.blurred_border;
            case 5:
                return R.string.end_size_random;
            case 6:
                return R.string.side_sine_wave_freq_random;
            case 7:
                return R.string.pre_smooth;
            case '\b':
                return R.string.measure_what;
            case '\t':
                return R.string.custom_image;
            case '\n':
                return R.string.bar_width;
            case 11:
                return R.string.pos_blur_amount;
            case '\f':
                return R.string.source_composition_index;
            case '\r':
                return R.string.sample_provider;
            case 14:
                return R.string.higher_hz;
            case 15:
            case 127:
                return R.string.color_to;
            case 16:
                return R.string.reaction_delay;
            case 17:
                return R.string.use_random_vector_instead;
            case 18:
                return R.string.end_size;
            case 19:
                return R.string._3layer_color;
            case 20:
                return R.string.aweight;
            case 21:
                return R.string.hz_linear_factor;
            case 22:
                return R.string._3layer_scale;
            case 23:
                return R.string.blur_multiplier;
            case 24:
                return R.string.blur_radius;
            case 25:
                return R.string.generated_album_art_hint_force_gen;
            case 26:
                return R.string.show_unblurred_content_under;
            case 27:
                return R.string.beat_range_value_lower;
            case 28:
                return R.string.motion_source;
            case 29:
                return R.string.side_sine_wave_freq;
            case 30:
                return R.string.measure_color_blend;
            case 31:
                return R.string.intro_fade_duration;
            case ' ':
                return R.string.bar_width_affected_by_shape;
            case '!':
                return R.string.sample_out_count_power;
            case '\"':
                return R.string.side_sine_wave_mag_random;
            case '#':
                return R.string.overall;
            case '$':
                return R.string.mirror;
            case '%':
                return R.string.height_scale;
            case '&':
                return R.string.outro_fade_duration;
            case '\'':
                return R.string.keep_aspect_ratio;
            case '(':
                return R.string.radius;
            case ')':
                return R.string.fft_size;
            case '*':
                return R.string.smooth;
            case '+':
                return R.string.audio_capture;
            case ',':
                return R.string.anchor_x;
            case '-':
                return R.string.anchor_y;
            case '.':
                return R.string.end_size_zfactor;
            case '/':
                return R.string.sample_out_count;
            case '0':
                return R.string.motion_blur;
            case '1':
                return R.string.repeat_samples;
            case '2':
                return R.string.type_face;
            case '3':
                return R.string.spectrum_hz;
            case '4':
            case '8':
                return R.string.color_key;
            case '5':
                return R.string.blur_divider;
            case '6':
                return R.string.high_quality_audio_capture;
            case '7':
                return R.string.fade_in_and_out_time;
            case '9':
                return R.string.measure_overall_speed;
            case ':':
                return R.string.trail_length;
            case '<':
                return R.string.measure_pos;
            case '=':
                return R.string.behaviour;
            case '>':
                return R.string.audio_duration_ms;
            case '?':
                return R.string.measure_scale;
            case '@':
                return R.string.spawn_time;
            case 'A':
                return R.string.beat_smooth;
            case 'B':
            case 167:
                return R.string.color_from;
            case 'C':
                return R.string.beat_range_bar_first;
            case 'D':
                return R.string.saturation;
            case 'E':
                return R.string.freq_shift;
            case 'F':
                return R.string.general;
            case 'G':
                return R.string.bar_height_multiplier;
            case 'H':
                return R.string.rotation;
            case 'I':
                return R.string.vector_angle_z;
            case 'J':
                return R.string.a;
            case 'K':
                return R.string.b;
            case 'L':
                return R.string.gap;
            case 'M':
                return R.string.tag;
            case 'N':
                return R.string.bars;
            case 'O':
                return R.string.beat;
            case 'P':
                return R.string.blur;
            case 'Q':
                return R.string.text;
            case 'R':
                return R.string.lower_freq_magnitude;
            case 'S':
            case 'V':
                return R.string.color;
            case 'T':
                return R.string.shape;
            case 'U':
                return R.string.speed;
            case 'W':
                return R.string.side_sine_wave_mag;
            case 'X':
                return R.string.image;
            case 'Y':
                return R.string.scale;
            case 'Z':
                return R.string.sides;
            case p21.J0 /* 91 */:
                return R.string.near_camera_fade_out_distance;
            case p21.K0 /* 92 */:
                return R.string.performance;
            case p21.L0 /* 93 */:
                return R.string.generated_album_art_color;
            case p21.M0 /* 94 */:
                return R.string._2layer_color;
            case p21.N0 /* 95 */:
                return R.string.mask_mode;
            case p21.O0 /* 96 */:
                return R.string.keep_aspect_ratio_and_crop_to_fit;
            case p21.P0 /* 97 */:
                return R.string.gravity;
            case p21.Q0 /* 98 */:
                return R.string._2layer_scale;
            case p21.R0 /* 99 */:
                return R.string.scale_is_uniform;
            case p21.S0 /* 100 */:
                return R.string.blend_mode_content;
            case p21.T0 /* 101 */:
                return R.string.lower_hz;
            case p21.U0 /* 102 */:
                return R.string.shape_path;
            case p21.V0 /* 103 */:
                return R.string.font_size;
            case p21.W0 /* 104 */:
                return R.string.blur_enabled;
            case 'i':
                return R.string.intro_fade_color;
            case p21.X0 /* 106 */:
                return R.string.scale_blur_amount;
            case p21.Y0 /* 107 */:
                return R.string.reaction_accumulated_delay;
            case p21.Z0 /* 108 */:
                return R.string.generated_album_art_hint_no_text;
            case 'm':
                return R.string.visible;
            case 'n':
                return R.string.color_blend_offset;
            case 'o':
                return R.string.transparency_strength;
            case 'p':
                return R.string.color_key_enabled;
            case 'q':
                return R.string.vector_angle;
            case 'r':
                return R.string.waveform;
            case 's':
                return R.string.mirror_samples;
            case x21.C0 /* 116 */:
                return R.string.wave_behaviour;
            case x21.D0 /* 117 */:
                return R.string.flip_mirror;
            case x21.E0 /* 118 */:
                return R.string.fixed_height;
            case x21.F0 /* 119 */:
                return R.string.position;
            case x21.G0 /* 120 */:
                return R.string.measure_animation_speed;
            case x21.H0 /* 121 */:
                return R.string.beat_range_value_higher;
            case x21.I0 /* 122 */:
                return R.string.split_multiplier;
            case x21.J0 /* 123 */:
                return R.string.blur_amount_multiplier;
            case x21.K0 /* 124 */:
                return R.string.blend_mode;
            case x21.L0 /* 125 */:
                return R.string.show_unblurred_content;
            case x21.M0 /* 126 */:
                return R.string.count_limit;
            case 128:
                return R.string.lifetime;
            case 129:
                return R.string.mirror_x;
            case 130:
                return R.string.mirror_y;
            case 131:
                return R.string.particle_scale;
            case 132:
                return R.string.beat_range_bar_last;
            case 133:
                return R.string.star_and_end_gap;
            case 134:
                return R.string.segment_1;
            case 135:
                return R.string.segment_2;
            case 136:
                return R.string.intro_outro;
            case 137:
                return R.string.max_height_scale;
            case 138:
                return R.string.alignment_position;
            case 139:
                return R.string.perspective_depth;
            case 140:
                return R.string.softness;
            case 141:
                return R.string.output_multiplier;
            case 142:
                return R.string.relative_motion_mode;
            case 143:
                return R.string.split_amount;
            case 144:
                return R.string.size_aspect_ratio;
            case 145:
                return R.string.vertical_orientation;
            case 146:
                return R.string.flip_input;
            case 147:
                return R.string.split_color_0;
            case 148:
                return R.string.split_color_1;
            case 149:
                return R.string.split_color_2;
            case 150:
                return R.string.behavior;
            case 151:
                return R.string.auto_detect_color_key;
            case 152:
                return R.string.filter_strength;
            case 153:
                return R.string.split_effect;
            case 154:
                return R.string.spawn_area;
            case 155:
                return R.string.input_size;
            case 156:
                return R.string.opacity_strength;
            case 157:
                return R.string.mirror_mode;
            case 158:
                return R.string.vector_relative_to_center;
            case 159:
                return R.string.audio_provider_index;
            case 160:
                return R.string.appearance;
            case 161:
                return R.string.generated_album_art;
            case 162:
                return R.string.measure_rot;
            case 163:
                return R.string.generated_album_art_hint_shift_hue;
            case 164:
                return R.string.velocity_angle;
            case 165:
                return R.string.min_height_scale;
            case 166:
                return R.string.mask_image;
            case 168:
                return R.string.flip_every_other;
            case 169:
                return R.string.perspective_fov;
            case 170:
                return R.string.fade_in_size;
            case 171:
                return R.string.speed_random;
            case 172:
                return R.string._1layer_color;
            case 173:
                return R.string._1layer_scale;
            case 174:
                return R.string.filter_radius;
            case 175:
                return R.string.force_field;
            default:
                return 0;
        }
    }

    public static String x(String str, String str2, Context context) {
        String str3;
        boolean z2;
        if (str2 == null || str2.length() <= 0) {
            str3 = null;
        } else {
            int v2 = v(str2);
            if (v2 > 0) {
                str3 = context.getString(v2);
            } else {
                String replace = ("hint_" + i(str2)).replace(" ", "");
                StringBuilder sb = new StringBuilder();
                sb.append("<string name=\"");
                sb.append(replace);
                sb.append("\">");
                sb.append(str2);
                sb.append("</string> =|=|= case \"");
                sb.append(str2);
                sb.append("\": return R.string.");
                sb.append(replace);
                sb.append(";");
                str3 = str2;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int w2 = w(str);
        if (w2 > 0) {
            sb2.append(context.getString(w2));
            if (str3 != null) {
                sb2.append(" (");
                sb2.append(str3);
                sb2.append(")");
            }
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (str.length() > 0) {
            char upperCase = Character.toUpperCase(str.charAt(0));
            sb2.append(upperCase);
            sb3.append(Character.toLowerCase(upperCase));
            z2 = Character.isDigit(upperCase);
        } else {
            z2 = false;
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            boolean z3 = Character.isUpperCase(charAt) || Character.isDigit(charAt);
            if (z2 && z3) {
                sb2.append(' ');
                sb3.append("_");
            }
            sb2.append(charAt);
            sb3.append(Character.toLowerCase(charAt));
            z2 = !z3;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("<string name=\"");
        sb4.append((Object) sb3);
        sb4.append("\">");
        sb4.append((Object) sb2);
        sb4.append("</string> =|=|= case \"");
        sb4.append(str);
        sb4.append("\": return R.string.");
        sb4.append((Object) sb3);
        sb4.append(";");
        if (str2 != null && str2.length() > 0) {
            sb2.append(" (");
            sb2.append(str2);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public static String y(String str, String str2, Context context) {
        return x(br1.D(str, 95, str), null, context);
    }

    public void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b = viewGroup.findViewById(R.id.view1RootView);
        this.c = (ViewGroup) viewGroup.findViewById(R.id.linearLayoutContent);
        this.a = (TextView) viewGroup.findViewById(R.id.txtElementTitle);
        ((ImageButton) viewGroup.findViewById(R.id.btnBack)).setOnClickListener(new k());
        ((ImageButton) viewGroup.findViewById(R.id.btnInfo)).setOnClickListener(new v());
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.btnResetElement);
        imageButton.setOnClickListener(new a0());
        imageButton.setOnLongClickListener(new b0());
        this.d = (Spinner) viewGroup.findViewById(R.id.spinnerVersion);
        this.e = new c0();
        this.h.clear();
    }

    public void F(TextView textView, List<String> list, String str, String str2) {
        ho k2;
        Iterator<String> it;
        lz1.a("hierarchyPath" + list + " propertyName: " + str + " value: " + str2);
        String str3 = "";
        if (this.c != null && textView != null) {
            textView.setText(str2 != null ? str2 : "");
        }
        if (list == null || str == null || (k2 = ho.k()) == null) {
            return;
        }
        un i2 = k2.y.i(list);
        if (i2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            i2.i0(str, str2);
            k2.s();
            return;
        }
        while (list.iterator().hasNext()) {
            str3 = str3 + it.next();
        }
        lz1.c("invalid hierarchyPath: [" + str3 + "]");
    }

    public void H(un unVar) {
        String str;
        ho k2 = ho.k();
        if (k2 != null && k2.p() && z()) {
            LayoutInflater from = LayoutInflater.from(k2.getActivity());
            this.i = unVar;
            if (unVar == null) {
                this.a.setText(R.string.nothing_to_show);
                this.c.removeAllViews();
                this.h.clear();
                return;
            }
            this.a.setText(unVar.i());
            this.f = -2;
            this.d.setOnItemSelectedListener(null);
            un unVar2 = this.i;
            String str2 = "";
            if (unVar2 != null) {
                str2 = unVar2.i();
                str = this.i.D();
            } else {
                str = "";
            }
            lo1<String[], String> e2 = k2.e(str2, str);
            if (e2.a.length > 1) {
                this.d.setVisibility(0);
                int e3 = br1.e(e2.a, str);
                int length = e2.a.length;
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = k2.getResources().getString(R.string.vis_customization_ver_x, e2.a[i2]);
                }
                this.d.setAdapter((SpinnerAdapter) new ArrayAdapter(k2.getActivity(), 17367048, strArr));
                this.f = e3;
                if (e3 >= 0) {
                    this.d.setSelection(e3, false);
                }
                k2.b(this.d);
                this.d.setOnItemSelectedListener(this.e);
            } else {
                this.d.setVisibility(4);
            }
            this.c.removeAllViews();
            this.h.clear();
            Map<String, er0<String, Integer>> d2 = unVar.d();
            for (String str3 : d2.keySet()) {
                View inflate = from.inflate(R.layout.dialog_customize_vis_element_group, (ViewGroup) null);
                ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.linearLayoutContent);
                TextView textView = (TextView) inflate.findViewById(R.id.groupTitle);
                View findViewById = inflate.findViewById(R.id.btnExpand);
                ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.groupHeader);
                if (G(k2, from, unVar, viewGroup, d2.get(str3).q()) > 0) {
                    textView.setText(y(str3, null, from.getContext()));
                    this.c.addView(inflate);
                    viewGroup2.setOnClickListener(new d0(viewGroup, findViewById, str3));
                    Boolean bool = this.g.get(str3);
                    if (bool != null && !bool.booleanValue()) {
                        findViewById.setRotation(0.0f);
                        viewGroup.setVisibility(8);
                    } else if (bool != null && bool.booleanValue()) {
                        findViewById.setRotation(-90.0f);
                        viewGroup.setVisibility(0);
                    }
                }
            }
        }
    }

    public void I(boolean z2) {
        this.b.setVisibility(z2 ? 8 : 0);
    }

    public void e(un unVar, String str, com.daaw.e0<Object> e0Var) {
        this.h.put(un.f(unVar.j(), str), e0Var);
    }

    public com.daaw.e0<Object> f(List<String> list, String str) {
        if (list == null || str == null) {
            return null;
        }
        return this.h.get(un.f(list, str));
    }

    public boolean z() {
        return this.a != null;
    }
}

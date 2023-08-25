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
/* renamed from: com.daaw.no */
/* loaded from: classes.dex */
public class C2323no {

    /* renamed from: a */
    public TextView f20336a;

    /* renamed from: b */
    public View f20337b;

    /* renamed from: c */
    public ViewGroup f20338c;

    /* renamed from: d */
    public Spinner f20339d;

    /* renamed from: e */
    public AdapterView.OnItemSelectedListener f20340e;

    /* renamed from: f */
    public int f20341f = -1;

    /* renamed from: g */
    public Map<String, Boolean> f20342g = new HashMap();

    /* renamed from: h */
    public Map<String, InterfaceC1153e0<Object>> f20343h = new HashMap();

    /* renamed from: i */
    public C3239un f20344i;

    /* renamed from: com.daaw.no$a */
    /* loaded from: classes.dex */
    public class C2324a implements InterfaceC1153e0<Object> {

        /* renamed from: a */
        public final /* synthetic */ C3239un f20345a;

        /* renamed from: b */
        public final /* synthetic */ String f20346b;

        /* renamed from: c */
        public final /* synthetic */ CheckBox f20347c;

        public C2324a(C3239un c3239un, String str, CheckBox checkBox) {
            this.f20345a = c3239un;
            this.f20346b = str;
            this.f20347c = checkBox;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: a */
        public void mo7884a(Object obj) {
            this.f20347c.setChecked(this.f20345a.m7955n(this.f20346b, false));
        }
    }

    /* renamed from: com.daaw.no$a0 */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2325a0 implements View.OnClickListener {
        public View$OnClickListenerC2325a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3385vy.f30703a.m12018a(view.getResources().getString(R.string.vis_customization_hold_to_reset_element));
        }
    }

    /* renamed from: com.daaw.no$b */
    /* loaded from: classes.dex */
    public class C2326b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C3239un f20349a;

        /* renamed from: b */
        public final /* synthetic */ String f20350b;

        /* renamed from: c */
        public final /* synthetic */ w40 f20351c;

        public C2326b(C3239un c3239un, String str, w40 w40Var) {
            this.f20349a = c3239un;
            this.f20350b = str;
            this.f20351c = w40Var;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f20349a.m7992M(this.f20350b, z);
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20351c.mo3478a();
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(this);
            }
        }
    }

    /* renamed from: com.daaw.no$b0 */
    /* loaded from: classes.dex */
    public class View$OnLongClickListenerC2327b0 implements View.OnLongClickListener {
        public View$OnLongClickListenerC2327b0() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (C2323no.this.f20344i != null) {
                DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
                if (m20595k == null) {
                    return false;
                }
                m20595k.m20603c(C2323no.this.f20344i, null);
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.daaw.no$c */
    /* loaded from: classes.dex */
    public class C2328c implements InterfaceC1153e0<Object> {

        /* renamed from: a */
        public boolean f20353a = false;

        /* renamed from: b */
        public final /* synthetic */ C3239un f20354b;

        /* renamed from: c */
        public final /* synthetic */ String f20355c;

        /* renamed from: d */
        public final /* synthetic */ int f20356d;

        /* renamed from: e */
        public final /* synthetic */ TextView f20357e;

        /* renamed from: f */
        public final /* synthetic */ View f20358f;

        /* renamed from: g */
        public final /* synthetic */ View f20359g;

        /* renamed from: h */
        public final /* synthetic */ int f20360h;

        /* renamed from: i */
        public final /* synthetic */ boolean f20361i;

        /* renamed from: j */
        public final /* synthetic */ SeekBar[] f20362j;

        /* renamed from: k */
        public final /* synthetic */ EditText[] f20363k;

        public C2328c(C3239un c3239un, String str, int i, TextView textView, View view, View view2, int i2, boolean z, SeekBar[] seekBarArr, EditText[] editTextArr) {
            this.f20354b = c3239un;
            this.f20355c = str;
            this.f20356d = i;
            this.f20357e = textView;
            this.f20358f = view;
            this.f20359g = view2;
            this.f20360h = i2;
            this.f20361i = z;
            this.f20362j = seekBarArr;
            this.f20363k = editTextArr;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: a */
        public void mo7884a(Object obj) {
            if (this.f20353a) {
                return;
            }
            this.f20353a = true;
            int m7947r = this.f20354b.m7947r(this.f20355c, this.f20356d);
            TextView textView = this.f20357e;
            textView.setText("" + m7947r);
            View view = this.f20358f;
            View view2 = this.f20359g;
            int i = this.f20360h;
            int i2 = this.f20356d;
            nd1.m15220a(view, view2, i - i2, m7947r - i2);
            if (this.f20361i) {
                if (!this.f20362j[0].equals(obj)) {
                    this.f20362j[0].setProgress(m7947r - this.f20356d);
                }
                if (!this.f20363k[0].equals(obj)) {
                    EditText editText = this.f20363k[0];
                    editText.setText("" + m7947r);
                }
            }
            this.f20353a = false;
        }
    }

    /* renamed from: com.daaw.no$c0 */
    /* loaded from: classes.dex */
    public class C2329c0 implements AdapterView.OnItemSelectedListener {
        public C2329c0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20605a(adapterView);
            if (C2323no.this.f20344i != null) {
                String m7965i = C2323no.this.f20344i.m7965i();
                String m8001D = C2323no.this.f20344i.m8001D();
                lo1<String[], String> m20601e = m20595k.m20601e(m7965i, m8001D);
                String[] strArr = m20601e.f17576a;
                String str = m20601e.f17577b;
                if (i >= 0 && i < strArr.length) {
                    str = strArr[i];
                }
                if (sv1.m9823b(m8001D, str)) {
                    return;
                }
                C2323no.this.f20344i.m7946r0(str);
                m20595k.m20589q();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.daaw.no$d */
    /* loaded from: classes.dex */
    public class C2330d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C3239un f20365a;

        /* renamed from: b */
        public final /* synthetic */ String f20366b;

        /* renamed from: c */
        public final /* synthetic */ int f20367c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC1153e0 f20368d;

        /* renamed from: e */
        public final /* synthetic */ SeekBar[] f20369e;

        /* renamed from: f */
        public final /* synthetic */ w40 f20370f;

        public C2330d(C3239un c3239un, String str, int i, InterfaceC1153e0 interfaceC1153e0, SeekBar[] seekBarArr, w40 w40Var) {
            this.f20365a = c3239un;
            this.f20366b = str;
            this.f20367c = i;
            this.f20368d = interfaceC1153e0;
            this.f20369e = seekBarArr;
            this.f20370f = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                this.f20365a.m7980Y(this.f20366b, i + this.f20367c);
                DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
                if (m20595k == null) {
                    return;
                }
                m20595k.m20585u();
                this.f20368d.mo7884a(this.f20369e[0]);
                InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20370f.mo3478a();
                if (interfaceC1153e0 != null) {
                    interfaceC1153e0.mo7884a(this);
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

    /* renamed from: com.daaw.no$d0 */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2331d0 implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ ViewGroup f20371p;

        /* renamed from: q */
        public final /* synthetic */ View f20372q;

        /* renamed from: r */
        public final /* synthetic */ String f20373r;

        public View$OnClickListenerC2331d0(ViewGroup viewGroup, View view, String str) {
            this.f20371p = viewGroup;
            this.f20372q = view;
            this.f20373r = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Map map;
            String str;
            Boolean bool;
            if (this.f20371p.getVisibility() == 0) {
                this.f20372q.animate().rotation(0.0f);
                this.f20371p.setVisibility(8);
                map = C2323no.this.f20342g;
                str = this.f20373r;
                bool = Boolean.FALSE;
            } else {
                this.f20372q.animate().rotation(-90.0f);
                this.f20371p.setVisibility(0);
                map = C2323no.this.f20342g;
                str = this.f20373r;
                bool = Boolean.TRUE;
            }
            map.put(str, bool);
        }
    }

    /* renamed from: com.daaw.no$e */
    /* loaded from: classes.dex */
    public class C2332e implements TextWatcher {

        /* renamed from: p */
        public final /* synthetic */ int f20375p;

        /* renamed from: q */
        public final /* synthetic */ int f20376q;

        /* renamed from: r */
        public final /* synthetic */ C3239un f20377r;

        /* renamed from: s */
        public final /* synthetic */ String f20378s;

        /* renamed from: t */
        public final /* synthetic */ InterfaceC1153e0 f20379t;

        /* renamed from: u */
        public final /* synthetic */ EditText[] f20380u;

        /* renamed from: v */
        public final /* synthetic */ w40 f20381v;

        public C2332e(int i, int i2, C3239un c3239un, String str, InterfaceC1153e0 interfaceC1153e0, EditText[] editTextArr, w40 w40Var) {
            this.f20375p = i;
            this.f20376q = i2;
            this.f20377r = c3239un;
            this.f20378s = str;
            this.f20379t = interfaceC1153e0;
            this.f20380u = editTextArr;
            this.f20381v = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f20377r.m7980Y(this.f20378s, br1.m25885x(editable.toString(), this.f20375p + (this.f20376q / 2)));
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20379t.mo7884a(this.f20380u[0]);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20381v.mo3478a();
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

    /* renamed from: com.daaw.no$e0 */
    /* loaded from: classes.dex */
    public class C2333e0 implements w40<InterfaceC1153e0<Object>> {
        @Override // com.daaw.w40
        /* renamed from: b */
        public InterfaceC1153e0<Object> mo3478a() {
            return null;
        }
    }

    /* renamed from: com.daaw.no$f */
    /* loaded from: classes.dex */
    public class C2334f implements InterfaceC1153e0<Object> {

        /* renamed from: a */
        public boolean f20382a = false;

        /* renamed from: b */
        public final /* synthetic */ C3239un f20383b;

        /* renamed from: c */
        public final /* synthetic */ String f20384c;

        /* renamed from: d */
        public final /* synthetic */ float f20385d;

        /* renamed from: e */
        public final /* synthetic */ TextView f20386e;

        /* renamed from: f */
        public final /* synthetic */ View f20387f;

        /* renamed from: g */
        public final /* synthetic */ View f20388g;

        /* renamed from: h */
        public final /* synthetic */ float f20389h;

        /* renamed from: i */
        public final /* synthetic */ float f20390i;

        /* renamed from: j */
        public final /* synthetic */ boolean f20391j;

        /* renamed from: k */
        public final /* synthetic */ SeekBar[] f20392k;

        /* renamed from: l */
        public final /* synthetic */ EditText[] f20393l;

        public C2334f(C3239un c3239un, String str, float f, TextView textView, View view, View view2, float f2, float f3, boolean z, SeekBar[] seekBarArr, EditText[] editTextArr) {
            this.f20383b = c3239un;
            this.f20384c = str;
            this.f20385d = f;
            this.f20386e = textView;
            this.f20387f = view;
            this.f20388g = view2;
            this.f20389h = f2;
            this.f20390i = f3;
            this.f20391j = z;
            this.f20392k = seekBarArr;
            this.f20393l = editTextArr;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: a */
        public void mo7884a(Object obj) {
            if (this.f20382a) {
                return;
            }
            this.f20382a = true;
            float m7953o = this.f20383b.m7953o(this.f20384c, this.f20385d);
            TextView textView = this.f20386e;
            Locale locale = Locale.US;
            textView.setText(String.format(locale, "%.3f", Float.valueOf(m7953o)));
            View view = this.f20387f;
            View view2 = this.f20388g;
            float f = this.f20389h;
            float f2 = this.f20385d;
            float f3 = this.f20390i;
            nd1.m15220a(view, view2, (f - f2) / f3, (m7953o - f2) / f3);
            if (this.f20391j) {
                if (!this.f20392k[0].equals(obj)) {
                    this.f20392k[0].setProgress((int) ((m7953o - this.f20385d) / this.f20390i));
                }
                if (!this.f20393l[0].equals(obj)) {
                    this.f20393l[0].setText(String.format(locale, "%.3f", Float.valueOf(m7953o)));
                }
            }
            this.f20382a = false;
        }
    }

    /* renamed from: com.daaw.no$f0 */
    /* loaded from: classes.dex */
    public class C2335f0 implements AdapterView.OnItemSelectedListener {

        /* renamed from: p */
        public final /* synthetic */ boolean[] f20394p;

        /* renamed from: q */
        public final /* synthetic */ String[] f20395q;

        /* renamed from: r */
        public final /* synthetic */ boolean f20396r;

        /* renamed from: s */
        public final /* synthetic */ C3239un f20397s;

        /* renamed from: t */
        public final /* synthetic */ String f20398t;

        /* renamed from: u */
        public final /* synthetic */ w40 f20399u;

        /* renamed from: v */
        public final /* synthetic */ C3239un f20400v;

        public C2335f0(boolean[] zArr, String[] strArr, boolean z, C3239un c3239un, String str, w40 w40Var, C3239un c3239un2) {
            this.f20394p = zArr;
            this.f20395q = strArr;
            this.f20396r = z;
            this.f20397s = c3239un;
            this.f20398t = str;
            this.f20399u = w40Var;
            this.f20400v = c3239un2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20605a(adapterView);
            if (!this.f20394p[0] || i < 0 || i >= this.f20395q.length) {
                return;
            }
            if (!this.f20396r) {
                if (this.f20400v.m8003B().equals(this.f20395q[i])) {
                    return;
                }
                this.f20400v.m8000E(this.f20395q[i]);
                m20595k.m20589q();
            } else if (this.f20397s.m7942u(this.f20398t, "").equals(this.f20395q[i])) {
            } else {
                this.f20397s.m7976c0(this.f20398t, this.f20395q[i]);
                m20595k.m20589q();
                InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20399u.mo3478a();
                if (interfaceC1153e0 != null) {
                    interfaceC1153e0.mo7884a(this);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.daaw.no$g */
    /* loaded from: classes.dex */
    public class C2336g implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ float f20401a;

        /* renamed from: b */
        public final /* synthetic */ float f20402b;

        /* renamed from: c */
        public final /* synthetic */ C3239un f20403c;

        /* renamed from: d */
        public final /* synthetic */ String f20404d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC1153e0 f20405e;

        /* renamed from: f */
        public final /* synthetic */ SeekBar[] f20406f;

        /* renamed from: g */
        public final /* synthetic */ w40 f20407g;

        public C2336g(float f, float f2, C3239un c3239un, String str, InterfaceC1153e0 interfaceC1153e0, SeekBar[] seekBarArr, w40 w40Var) {
            this.f20401a = f;
            this.f20402b = f2;
            this.f20403c = c3239un;
            this.f20404d = str;
            this.f20405e = interfaceC1153e0;
            this.f20406f = seekBarArr;
            this.f20407g = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                this.f20403c.m7988Q(this.f20404d, (i * this.f20401a) + this.f20402b);
                DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
                if (m20595k == null) {
                    return;
                }
                m20595k.m20585u();
                this.f20405e.mo7884a(this.f20406f[0]);
                InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20407g.mo3478a();
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

    /* renamed from: com.daaw.no$g0 */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2337g0 implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3239un f20408p;

        /* renamed from: q */
        public final /* synthetic */ String f20409q;

        /* renamed from: r */
        public final /* synthetic */ View f20410r;

        /* renamed from: s */
        public final /* synthetic */ InterfaceC1153e0 f20411s;

        public View$OnClickListenerC2337g0(C3239un c3239un, String str, View view, InterfaceC1153e0 interfaceC1153e0) {
            this.f20408p = c3239un;
            this.f20409q = str;
            this.f20410r = view;
            this.f20411s = interfaceC1153e0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20584v(this.f20408p, this.f20409q, this.f20410r, this.f20411s);
        }
    }

    /* renamed from: com.daaw.no$h */
    /* loaded from: classes.dex */
    public class C2338h implements TextWatcher {

        /* renamed from: p */
        public final /* synthetic */ float f20412p;

        /* renamed from: q */
        public final /* synthetic */ float f20413q;

        /* renamed from: r */
        public final /* synthetic */ C3239un f20414r;

        /* renamed from: s */
        public final /* synthetic */ String f20415s;

        /* renamed from: t */
        public final /* synthetic */ InterfaceC1153e0 f20416t;

        /* renamed from: u */
        public final /* synthetic */ EditText[] f20417u;

        /* renamed from: v */
        public final /* synthetic */ w40 f20418v;

        public C2338h(float f, float f2, C3239un c3239un, String str, InterfaceC1153e0 interfaceC1153e0, EditText[] editTextArr, w40 w40Var) {
            this.f20412p = f;
            this.f20413q = f2;
            this.f20414r = c3239un;
            this.f20415s = str;
            this.f20416t = interfaceC1153e0;
            this.f20417u = editTextArr;
            this.f20418v = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f20414r.m7988Q(this.f20415s, br1.m25887v(editable.toString(), this.f20412p + (this.f20413q * 0.5f)));
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20416t.mo7884a(this.f20417u[0]);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20418v.mo3478a();
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

    /* renamed from: com.daaw.no$i */
    /* loaded from: classes.dex */
    public class C2339i implements InterfaceC1153e0<Object> {

        /* renamed from: a */
        public boolean f20419a = false;

        /* renamed from: b */
        public final /* synthetic */ C3239un f20420b;

        /* renamed from: c */
        public final /* synthetic */ String f20421c;

        /* renamed from: d */
        public final /* synthetic */ float f20422d;

        /* renamed from: e */
        public final /* synthetic */ TextView f20423e;

        /* renamed from: f */
        public final /* synthetic */ View f20424f;

        /* renamed from: g */
        public final /* synthetic */ View f20425g;

        /* renamed from: h */
        public final /* synthetic */ float f20426h;

        /* renamed from: i */
        public final /* synthetic */ float f20427i;

        /* renamed from: j */
        public final /* synthetic */ View f20428j;

        /* renamed from: k */
        public final /* synthetic */ View f20429k;

        /* renamed from: l */
        public final /* synthetic */ boolean f20430l;

        /* renamed from: m */
        public final /* synthetic */ SeekBar[] f20431m;

        /* renamed from: n */
        public final /* synthetic */ SeekBar[] f20432n;

        /* renamed from: o */
        public final /* synthetic */ EditText[] f20433o;

        /* renamed from: p */
        public final /* synthetic */ EditText[] f20434p;

        public C2339i(C3239un c3239un, String str, float f, TextView textView, View view, View view2, float f2, float f3, View view3, View view4, boolean z, SeekBar[] seekBarArr, SeekBar[] seekBarArr2, EditText[] editTextArr, EditText[] editTextArr2) {
            this.f20420b = c3239un;
            this.f20421c = str;
            this.f20422d = f;
            this.f20423e = textView;
            this.f20424f = view;
            this.f20425g = view2;
            this.f20426h = f2;
            this.f20427i = f3;
            this.f20428j = view3;
            this.f20429k = view4;
            this.f20430l = z;
            this.f20431m = seekBarArr;
            this.f20432n = seekBarArr2;
            this.f20433o = editTextArr;
            this.f20434p = editTextArr2;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: a */
        public void mo7884a(Object obj) {
            if (this.f20419a) {
                return;
            }
            this.f20419a = true;
            C3239un c3239un = this.f20420b;
            String str = this.f20421c;
            float f = this.f20422d;
            bs1 m7937z = c3239un.m7937z(str, new bs1(f, f));
            TextView textView = this.f20423e;
            Locale locale = Locale.US;
            textView.setText(String.format(locale, "%.3f   %.3f", Float.valueOf(m7937z.f5090a), Float.valueOf(m7937z.f5091b)));
            View view = this.f20424f;
            View view2 = this.f20425g;
            float f2 = this.f20426h;
            float f3 = this.f20422d;
            float f4 = this.f20427i;
            nd1.m15220a(view, view2, (f2 - f3) / f4, (m7937z.f5090a - f3) / f4);
            View view3 = this.f20428j;
            View view4 = this.f20429k;
            float f5 = this.f20426h;
            float f6 = this.f20422d;
            float f7 = this.f20427i;
            nd1.m15220a(view3, view4, (f5 - f6) / f7, (m7937z.f5091b - f6) / f7);
            if (this.f20430l) {
                if (!this.f20431m[0].equals(obj)) {
                    this.f20431m[0].setProgress((int) ((m7937z.f5090a - this.f20422d) / this.f20427i));
                }
                if (!this.f20432n[0].equals(obj)) {
                    this.f20432n[0].setProgress((int) ((m7937z.f5091b - this.f20422d) / this.f20427i));
                }
                if (!this.f20433o[0].equals(obj)) {
                    this.f20433o[0].setText(String.format(locale, "%.3f", Float.valueOf(m7937z.f5090a)));
                }
                if (!this.f20434p[0].equals(obj)) {
                    this.f20434p[0].setText(String.format(locale, "%.3f", Float.valueOf(m7937z.f5091b)));
                }
            }
            this.f20419a = false;
        }
    }

    /* renamed from: com.daaw.no$j */
    /* loaded from: classes.dex */
    public class C2340j implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C3239un f20435a;

        /* renamed from: b */
        public final /* synthetic */ String f20436b;

        /* renamed from: c */
        public final /* synthetic */ float f20437c;

        /* renamed from: d */
        public final /* synthetic */ float f20438d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC1153e0 f20439e;

        /* renamed from: f */
        public final /* synthetic */ SeekBar[] f20440f;

        /* renamed from: g */
        public final /* synthetic */ w40 f20441g;

        public C2340j(C3239un c3239un, String str, float f, float f2, InterfaceC1153e0 interfaceC1153e0, SeekBar[] seekBarArr, w40 w40Var) {
            this.f20435a = c3239un;
            this.f20436b = str;
            this.f20437c = f;
            this.f20438d = f2;
            this.f20439e = interfaceC1153e0;
            this.f20440f = seekBarArr;
            this.f20441g = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C3239un c3239un = this.f20435a;
                String str = this.f20436b;
                float f = this.f20437c;
                this.f20435a.m7958l0(this.f20436b, new bs1((i * this.f20438d) + this.f20437c, c3239un.m7937z(str, new bs1(f, f)).f5091b));
                DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
                if (m20595k == null) {
                    return;
                }
                m20595k.m20585u();
                this.f20439e.mo7884a(this.f20440f[0]);
                InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20441g.mo3478a();
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

    /* renamed from: com.daaw.no$k */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2341k implements View.OnClickListener {
        public View$OnClickListenerC2341k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20593m(0);
        }
    }

    /* renamed from: com.daaw.no$l */
    /* loaded from: classes.dex */
    public class C2342l implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C3239un f20443a;

        /* renamed from: b */
        public final /* synthetic */ String f20444b;

        /* renamed from: c */
        public final /* synthetic */ float f20445c;

        /* renamed from: d */
        public final /* synthetic */ float f20446d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC1153e0 f20447e;

        /* renamed from: f */
        public final /* synthetic */ SeekBar[] f20448f;

        /* renamed from: g */
        public final /* synthetic */ w40 f20449g;

        public C2342l(C3239un c3239un, String str, float f, float f2, InterfaceC1153e0 interfaceC1153e0, SeekBar[] seekBarArr, w40 w40Var) {
            this.f20443a = c3239un;
            this.f20444b = str;
            this.f20445c = f;
            this.f20446d = f2;
            this.f20447e = interfaceC1153e0;
            this.f20448f = seekBarArr;
            this.f20449g = w40Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C3239un c3239un = this.f20443a;
                String str = this.f20444b;
                float f = this.f20445c;
                this.f20443a.m7958l0(this.f20444b, new bs1(c3239un.m7937z(str, new bs1(f, f)).f5090a, (i * this.f20446d) + this.f20445c));
                DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
                if (m20595k == null) {
                    return;
                }
                m20595k.m20585u();
                this.f20447e.mo7884a(this.f20448f[0]);
                InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20449g.mo3478a();
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

    /* renamed from: com.daaw.no$m */
    /* loaded from: classes.dex */
    public class C2343m implements TextWatcher {

        /* renamed from: p */
        public final /* synthetic */ float f20450p;

        /* renamed from: q */
        public final /* synthetic */ float f20451q;

        /* renamed from: r */
        public final /* synthetic */ C3239un f20452r;

        /* renamed from: s */
        public final /* synthetic */ String f20453s;

        /* renamed from: t */
        public final /* synthetic */ InterfaceC1153e0 f20454t;

        /* renamed from: u */
        public final /* synthetic */ EditText[] f20455u;

        /* renamed from: v */
        public final /* synthetic */ w40 f20456v;

        public C2343m(float f, float f2, C3239un c3239un, String str, InterfaceC1153e0 interfaceC1153e0, EditText[] editTextArr, w40 w40Var) {
            this.f20450p = f;
            this.f20451q = f2;
            this.f20452r = c3239un;
            this.f20453s = str;
            this.f20454t = interfaceC1153e0;
            this.f20455u = editTextArr;
            this.f20456v = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            float m25887v = br1.m25887v(editable.toString(), this.f20450p + (this.f20451q * 0.5f));
            C3239un c3239un = this.f20452r;
            String str = this.f20453s;
            float f = this.f20450p;
            this.f20452r.m7958l0(this.f20453s, new bs1(m25887v, c3239un.m7937z(str, new bs1(f, f)).f5091b));
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20454t.mo7884a(this.f20455u[0]);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20456v.mo3478a();
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

    /* renamed from: com.daaw.no$n */
    /* loaded from: classes.dex */
    public class C2344n implements TextWatcher {

        /* renamed from: p */
        public final /* synthetic */ float f20457p;

        /* renamed from: q */
        public final /* synthetic */ float f20458q;

        /* renamed from: r */
        public final /* synthetic */ C3239un f20459r;

        /* renamed from: s */
        public final /* synthetic */ String f20460s;

        /* renamed from: t */
        public final /* synthetic */ InterfaceC1153e0 f20461t;

        /* renamed from: u */
        public final /* synthetic */ EditText[] f20462u;

        /* renamed from: v */
        public final /* synthetic */ w40 f20463v;

        public C2344n(float f, float f2, C3239un c3239un, String str, InterfaceC1153e0 interfaceC1153e0, EditText[] editTextArr, w40 w40Var) {
            this.f20457p = f;
            this.f20458q = f2;
            this.f20459r = c3239un;
            this.f20460s = str;
            this.f20461t = interfaceC1153e0;
            this.f20462u = editTextArr;
            this.f20463v = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            float m25887v = br1.m25887v(editable.toString(), this.f20457p + (this.f20458q * 0.5f));
            C3239un c3239un = this.f20459r;
            String str = this.f20460s;
            float f = this.f20457p;
            this.f20459r.m7958l0(this.f20460s, new bs1(c3239un.m7937z(str, new bs1(f, f)).f5090a, m25887v));
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20461t.mo7884a(this.f20462u[0]);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20463v.mo3478a();
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

    /* renamed from: com.daaw.no$o */
    /* loaded from: classes.dex */
    public class C2345o implements InterfaceC1153e0<Object> {

        /* renamed from: a */
        public final /* synthetic */ C3239un f20464a;

        /* renamed from: b */
        public final /* synthetic */ String f20465b;

        /* renamed from: c */
        public final /* synthetic */ TextView f20466c;

        public C2345o(C3239un c3239un, String str, TextView textView) {
            this.f20464a = c3239un;
            this.f20465b = str;
            this.f20466c = textView;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: a */
        public void mo7884a(Object obj) {
            this.f20466c.setText(this.f20464a.m7940w(this.f20465b, ""));
        }
    }

    /* renamed from: com.daaw.no$p */
    /* loaded from: classes.dex */
    public class C2346p implements TextWatcher {

        /* renamed from: p */
        public final /* synthetic */ TextView f20467p;

        /* renamed from: q */
        public final /* synthetic */ C3239un f20468q;

        /* renamed from: r */
        public final /* synthetic */ String f20469r;

        /* renamed from: s */
        public final /* synthetic */ w40 f20470s;

        public C2346p(TextView textView, C3239un c3239un, String str, w40 w40Var) {
            this.f20467p = textView;
            this.f20468q = c3239un;
            this.f20469r = str;
            this.f20470s = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            this.f20467p.setText(obj);
            this.f20468q.m7964i0(this.f20469r, obj);
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20470s.mo3478a();
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(this);
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

    /* renamed from: com.daaw.no$q */
    /* loaded from: classes.dex */
    public class C2347q implements InterfaceC1153e0<Object> {

        /* renamed from: a */
        public final /* synthetic */ C3239un f20471a;

        /* renamed from: b */
        public final /* synthetic */ String f20472b;

        /* renamed from: c */
        public final /* synthetic */ TextView f20473c;

        /* renamed from: d */
        public final /* synthetic */ ImageButton f20474d;

        /* renamed from: e */
        public final /* synthetic */ boolean f20475e;

        /* renamed from: f */
        public final /* synthetic */ boolean f20476f;

        /* renamed from: g */
        public final /* synthetic */ TextView[] f20477g;

        public C2347q(C3239un c3239un, String str, TextView textView, ImageButton imageButton, boolean z, boolean z2, TextView[] textViewArr) {
            this.f20471a = c3239un;
            this.f20472b = str;
            this.f20473c = textView;
            this.f20474d = imageButton;
            this.f20475e = z;
            this.f20476f = z2;
            this.f20477g = textViewArr;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: a */
        public void mo7884a(Object obj) {
            ImageButton imageButton;
            int i;
            String m7940w = this.f20471a.m7940w(this.f20472b, "");
            int m12555a = qg0.m12555a(m7940w);
            if (m12555a <= 0) {
                int m5082i0 = C3543xi.m5082i0(m7940w);
                if (m5082i0 >= 0) {
                    this.f20473c.setVisibility(0);
                    TextView textView = this.f20473c;
                    textView.setText("" + m5082i0);
                    imageButton = this.f20474d;
                    i = R.drawable.ic_visual1;
                } else if (m7940w == null || m7940w.length() <= 0) {
                    this.f20473c.setVisibility(8);
                    this.f20474d.setImageResource(0);
                } else {
                    this.f20473c.setVisibility(8);
                    imageButton = this.f20474d;
                    i = R.drawable.ic_visual3;
                }
                imageButton.setImageResource(i);
            } else {
                this.f20473c.setVisibility(8);
                this.f20474d.setImageResource(m12555a);
            }
            if (!this.f20475e || this.f20476f) {
                return;
            }
            if (!this.f20477g[0].equals(obj)) {
                this.f20477g[0].setText(m7940w);
            }
            if (m7940w == null) {
                this.f20477g[1].setText("");
                return;
            }
            Matcher matcher = Pattern.compile("composition:((\\d*))").matcher(m7940w);
            Integer m25912E = matcher.find() ? br1.m25912E(matcher.group(1)) : null;
            TextView[] textViewArr = this.f20477g;
            textViewArr[1].setText(m25912E != null ? textViewArr[1].getContext().getResources().getQuantityString(R.plurals.vis_customization_composition_x, m25912E.intValue(), m25912E) : "");
        }
    }

    /* renamed from: com.daaw.no$r */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2348r implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3239un f20478p;

        /* renamed from: q */
        public final /* synthetic */ String f20479q;

        /* renamed from: r */
        public final /* synthetic */ String f20480r;

        /* renamed from: s */
        public final /* synthetic */ InterfaceC1153e0 f20481s;

        /* renamed from: t */
        public final /* synthetic */ ImageButton f20482t;

        /* renamed from: u */
        public final /* synthetic */ w40 f20483u;

        public View$OnClickListenerC2348r(C3239un c3239un, String str, String str2, InterfaceC1153e0 interfaceC1153e0, ImageButton imageButton, w40 w40Var) {
            this.f20478p = c3239un;
            this.f20479q = str;
            this.f20480r = str2;
            this.f20481s = interfaceC1153e0;
            this.f20482t = imageButton;
            this.f20483u = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20478p.m7964i0(this.f20479q, this.f20480r);
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20481s.mo7884a(this.f20482t);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20483u.mo3478a();
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(this);
            }
        }
    }

    /* renamed from: com.daaw.no$s */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2349s implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3239un f20484p;

        /* renamed from: q */
        public final /* synthetic */ String f20485q;

        /* renamed from: r */
        public final /* synthetic */ String f20486r;

        /* renamed from: s */
        public final /* synthetic */ InterfaceC1153e0 f20487s;

        /* renamed from: t */
        public final /* synthetic */ ImageButton f20488t;

        /* renamed from: u */
        public final /* synthetic */ w40 f20489u;

        public View$OnClickListenerC2349s(C3239un c3239un, String str, String str2, InterfaceC1153e0 interfaceC1153e0, ImageButton imageButton, w40 w40Var) {
            this.f20484p = c3239un;
            this.f20485q = str;
            this.f20486r = str2;
            this.f20487s = interfaceC1153e0;
            this.f20488t = imageButton;
            this.f20489u = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20484p.m7964i0(this.f20485q, this.f20486r);
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20487s.mo7884a(this.f20488t);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20489u.mo3478a();
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(this);
            }
        }
    }

    /* renamed from: com.daaw.no$t */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2350t implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ TextView f20490p;

        /* renamed from: q */
        public final /* synthetic */ C3239un f20491q;

        /* renamed from: r */
        public final /* synthetic */ String f20492r;

        /* renamed from: s */
        public final /* synthetic */ String f20493s;

        public View$OnClickListenerC2350t(TextView textView, C3239un c3239un, String str, String str2) {
            this.f20490p = textView;
            this.f20491q = c3239un;
            this.f20492r = str;
            this.f20493s = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            DialogFragmentC1593ho.f12702J.m7667a(m20595k, this.f20490p, this.f20491q.m7963j(), this.f20492r, this.f20493s);
        }
    }

    /* renamed from: com.daaw.no$u */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2351u implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ TextView f20494p;

        /* renamed from: q */
        public final /* synthetic */ C3239un f20495q;

        /* renamed from: r */
        public final /* synthetic */ String f20496r;

        /* renamed from: s */
        public final /* synthetic */ InterfaceC1153e0 f20497s;

        /* renamed from: t */
        public final /* synthetic */ Button f20498t;

        /* renamed from: u */
        public final /* synthetic */ w40 f20499u;

        public View$OnClickListenerC2351u(TextView textView, C3239un c3239un, String str, InterfaceC1153e0 interfaceC1153e0, Button button, w40 w40Var) {
            this.f20494p = textView;
            this.f20495q = c3239un;
            this.f20496r = str;
            this.f20497s = interfaceC1153e0;
            this.f20498t = button;
            this.f20499u = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView = this.f20494p;
            if (textView != null) {
                textView.setText("");
            }
            this.f20495q.m7964i0(this.f20496r, "");
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20497s.mo7884a(this.f20498t);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20499u.mo3478a();
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(this);
            }
        }
    }

    /* renamed from: com.daaw.no$v */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2352v implements View.OnClickListener {
        public View$OnClickListenerC2352v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C2323no.this.f20344i != null) {
                String m8003B = C2323no.this.f20344i.m8003B();
                String m8001D = C2323no.this.f20344i.m8001D();
                DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
                if (m20595k == null) {
                    return;
                }
                m20595k.m20602d(m8003B, m8001D);
            }
        }
    }

    /* renamed from: com.daaw.no$w */
    /* loaded from: classes.dex */
    public class C2353w implements TextWatcher {

        /* renamed from: p */
        public final /* synthetic */ C3239un f20501p;

        /* renamed from: q */
        public final /* synthetic */ String f20502q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC1153e0 f20503r;

        /* renamed from: s */
        public final /* synthetic */ TextView[] f20504s;

        /* renamed from: t */
        public final /* synthetic */ w40 f20505t;

        public C2353w(C3239un c3239un, String str, InterfaceC1153e0 interfaceC1153e0, TextView[] textViewArr, w40 w40Var) {
            this.f20501p = c3239un;
            this.f20502q = str;
            this.f20503r = interfaceC1153e0;
            this.f20504s = textViewArr;
            this.f20505t = w40Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f20501p.m7964i0(this.f20502q, editable.toString());
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20503r.mo7884a(this.f20504s[0]);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20505t.mo3478a();
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

    /* renamed from: com.daaw.no$x */
    /* loaded from: classes.dex */
    public class C2354x implements InterfaceC1153e0<Object> {

        /* renamed from: a */
        public final /* synthetic */ C3239un f20506a;

        /* renamed from: b */
        public final /* synthetic */ String f20507b;

        /* renamed from: c */
        public final /* synthetic */ String[] f20508c;

        /* renamed from: d */
        public final /* synthetic */ TextView f20509d;

        /* renamed from: e */
        public final /* synthetic */ ImageButton f20510e;

        public C2354x(C3239un c3239un, String str, String[] strArr, TextView textView, ImageButton imageButton) {
            this.f20506a = c3239un;
            this.f20507b = str;
            this.f20508c = strArr;
            this.f20509d = textView;
            this.f20510e = imageButton;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: a */
        public void mo7884a(Object obj) {
            int i;
            String m7940w = this.f20506a.m7940w(this.f20507b, "");
            int i2 = 0;
            while (true) {
                String[] strArr = this.f20508c;
                if (i2 >= strArr.length) {
                    i = -1;
                    break;
                }
                String[] strArr2 = new String[2];
                br1.m25915B(strArr[i2], 58, strArr2);
                if (m7940w.equals(strArr2[0])) {
                    i = br1.m25885x(strArr2[1], 0);
                    break;
                }
                i2++;
            }
            if (i <= 0) {
                this.f20509d.setVisibility(8);
                this.f20510e.setImageResource(0);
                return;
            }
            this.f20509d.setVisibility(8);
            this.f20510e.setImageResource(i);
        }
    }

    /* renamed from: com.daaw.no$y */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2355y implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3239un f20511p;

        /* renamed from: q */
        public final /* synthetic */ String f20512q;

        /* renamed from: r */
        public final /* synthetic */ String[] f20513r;

        /* renamed from: s */
        public final /* synthetic */ ImageButton f20514s;

        /* renamed from: t */
        public final /* synthetic */ int f20515t;

        /* renamed from: u */
        public final /* synthetic */ TextView f20516u;

        /* renamed from: v */
        public final /* synthetic */ w40 f20517v;

        public View$OnClickListenerC2355y(C3239un c3239un, String str, String[] strArr, ImageButton imageButton, int i, TextView textView, w40 w40Var) {
            this.f20511p = c3239un;
            this.f20512q = str;
            this.f20513r = strArr;
            this.f20514s = imageButton;
            this.f20515t = i;
            this.f20516u = textView;
            this.f20517v = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20511p.m7964i0(this.f20512q, this.f20513r[0]);
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20514s.setImageResource(this.f20515t);
            this.f20516u.setVisibility(8);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20517v.mo3478a();
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(this);
            }
        }
    }

    /* renamed from: com.daaw.no$z */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2356z implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ TextView f20518p;

        /* renamed from: q */
        public final /* synthetic */ C3239un f20519q;

        /* renamed from: r */
        public final /* synthetic */ String f20520r;

        /* renamed from: s */
        public final /* synthetic */ ImageButton f20521s;

        /* renamed from: t */
        public final /* synthetic */ TextView f20522t;

        /* renamed from: u */
        public final /* synthetic */ w40 f20523u;

        public View$OnClickListenerC2356z(TextView textView, C3239un c3239un, String str, ImageButton imageButton, TextView textView2, w40 w40Var) {
            this.f20518p = textView;
            this.f20519q = c3239un;
            this.f20520r = str;
            this.f20521s = imageButton;
            this.f20522t = textView2;
            this.f20523u = w40Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView = this.f20518p;
            if (textView != null) {
                textView.setText("");
            }
            this.f20519q.m7964i0(this.f20520r, "");
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20585u();
            this.f20521s.setImageResource(0);
            this.f20522t.setVisibility(8);
            InterfaceC1153e0 interfaceC1153e0 = (InterfaceC1153e0) this.f20523u.mo3478a();
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(this);
            }
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m14944A(C3239un c3239un, String str, boolean z, boolean z2, C2146m2[] c2146m2Arr, C3538xg[] c3538xgArr, TextView textView, View view, Object obj) {
        int m22863k = f80.m22863k(c3239un.m7957m(str, new float[]{1.0f, 1.0f, 1.0f, 1.0f}));
        if (z) {
            if (z2) {
                c2146m2Arr[0].setVisibility(0);
            } else {
                c2146m2Arr[0].setVisibility(8);
            }
            if (!c3538xgArr[0].equals(obj)) {
                c3538xgArr[0].m5144h(m22863k, true);
            }
        }
        textView.setText(br1.m25892q(m22863k));
        view.setBackgroundColor(m22863k);
    }

    /* renamed from: B */
    public static /* synthetic */ void m14943B(C3239un c3239un, String str, boolean z, boolean z2, C2146m2[] c2146m2Arr, C3538xg[] c3538xgArr, TextView textView, View view, Object obj) {
        int m7947r = c3239un.m7947r(str, -1);
        if (z) {
            if (z2) {
                c2146m2Arr[0].setVisibility(0);
            } else {
                c2146m2Arr[0].setVisibility(8);
            }
            if (!c3538xgArr[0].equals(obj)) {
                c3538xgArr[0].m5144h(m7947r, true);
            }
        }
        textView.setText(br1.m25892q(m7947r));
        view.setBackgroundColor(m7947r);
    }

    /* renamed from: C */
    public static /* synthetic */ void m14942C(boolean z, C3239un c3239un, String str, DialogFragmentC1593ho dialogFragmentC1593ho, InterfaceC1153e0 interfaceC1153e0, C3538xg[] c3538xgArr, w40 w40Var, int i) {
        if (z) {
            float[] fArr = new float[4];
            f80.m22858p(fArr, i);
            c3239un.m7994K(str, fArr);
        } else {
            c3239un.m7980Y(str, i);
        }
        dialogFragmentC1593ho.m20585u();
        interfaceC1153e0.mo7884a(c3538xgArr[0]);
        InterfaceC1153e0 interfaceC1153e02 = (InterfaceC1153e0) w40Var.mo3478a();
        if (interfaceC1153e02 != null) {
            interfaceC1153e02.mo7884a(null);
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m14941D(boolean z, C3239un c3239un, String str, DialogFragmentC1593ho dialogFragmentC1593ho, InterfaceC1153e0 interfaceC1153e0, C3538xg[] c3538xgArr, w40 w40Var, int i) {
        if (z) {
            float[] fArr = new float[4];
            f80.m22858p(fArr, i);
            c3239un.m7994K(str, fArr);
        } else {
            c3239un.m7980Y(str, i);
        }
        dialogFragmentC1593ho.m20585u();
        interfaceC1153e0.mo7884a(c3538xgArr[0]);
        InterfaceC1153e0 interfaceC1153e02 = (InterfaceC1153e0) w40Var.mo3478a();
        if (interfaceC1153e02 != null) {
            interfaceC1153e02.mo7884a(null);
        }
    }

    /* renamed from: G */
    public static int m14938G(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, ViewGroup viewGroup, Iterator<String> it) {
        C2333e0 c2333e0 = new C2333e0();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (!m14924l(dialogFragmentC1593ho, layoutInflater, c3239un, viewGroup, it.next(), false, c2333e0)) {
                i2--;
            }
            i = i2;
        }
        return i;
    }

    /* renamed from: i */
    public static String m14927i(String str) {
        StringBuilder sb;
        char charAt = str.charAt(0);
        String str2 = "" + Character.toLowerCase(charAt);
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
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

    /* renamed from: j */
    public static void m14926j(boolean z, DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, boolean z2, w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, String[] strArr) {
        View view;
        C3239un c3239un2;
        String str3;
        ViewGroup viewGroup2;
        String str4;
        String str5 = str2;
        String str6 = "";
        if (z) {
            str3 = c3239un.m7942u(str5, "");
            c3239un2 = null;
            viewGroup2 = null;
            view = layoutInflater.inflate(R.layout.dialog_customize_vis_element_sel, (ViewGroup) null);
        } else {
            C3239un m7967h = c3239un.m7967h(str5);
            String m8003B = m7967h.m8003B();
            View inflate = layoutInflater.inflate(R.layout.dialog_customize_vis_element_child, (ViewGroup) null);
            view = inflate;
            c3239un2 = m7967h;
            str3 = m8003B;
            viewGroup2 = (ViewGroup) inflate.findViewById(R.id.linearLayoutContent);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(str);
        boolean[] zArr = {false};
        Spinner spinner = (Spinner) view.findViewById(R.id.spinnerType);
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = -1;
                break;
            } else if (str3.equals(strArr[i])) {
                break;
            } else {
                i++;
            }
        }
        String[] strArr2 = new String[strArr.length];
        int i2 = 0;
        while (i2 < strArr.length) {
            String str7 = strArr[i2];
            int m14915u = m14915u(str7);
            if (m14915u > 0) {
                strArr2[i2] = layoutInflater.getContext().getString(m14915u);
                str4 = str6;
            } else {
                String replace = m14927i(str5 + str7).replace(" ", str6);
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
                strArr2[i2] = str7;
            }
            i2++;
            str5 = str2;
            str6 = str4;
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(dialogFragmentC1593ho.getActivity(), 17367048, strArr2));
        if (i >= 0) {
            spinner.setSelection(i, false);
        }
        dialogFragmentC1593ho.m20604b(spinner);
        zArr[0] = true;
        ViewGroup viewGroup3 = viewGroup2;
        spinner.setOnItemSelectedListener(new C2335f0(zArr, strArr, z, c3239un, str2, w40Var, c3239un2));
        if (strArr.length > 0) {
            spinner.setVisibility(0);
        } else {
            spinner.setVisibility(8);
            textView.setTextColor(textView.getResources().getColor(R.color.white_alpha_25));
        }
        if (z) {
            viewGroup.addView(view);
            return;
        }
        int m14938G = m14938G(dialogFragmentC1593ho, layoutInflater, c3239un2, viewGroup3, c3239un2.m7973e());
        if (strArr.length > 0 || m14938G > 0) {
            viewGroup.addView(view);
        }
        if (m14938G <= 0) {
            viewGroup3.setVisibility(8);
        }
    }

    /* renamed from: k */
    public static InterfaceC1153e0<Object> m14925k(DialogFragmentC1593ho dialogFragmentC1593ho, C3239un c3239un, boolean z, View view, String str, InterfaceC1153e0<Object> interfaceC1153e0) {
        if (!z) {
            dialogFragmentC1593ho.m20606A(c3239un, str, interfaceC1153e0);
        }
        if (z) {
            View findViewById = view.findViewById(R.id.elementDetailContent);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            view.findViewById(R.id.elementRoot).setOnClickListener(new View$OnClickListenerC2337g0(c3239un, str, view, interfaceC1153e0));
        }
        if (interfaceC1153e0 != null) {
            interfaceC1153e0.mo7884a(null);
        }
        return interfaceC1153e0;
    }

    /* renamed from: l */
    public static boolean m14924l(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, ViewGroup viewGroup, String str, boolean z, w40<InterfaceC1153e0<Object>> w40Var) {
        String m14912x;
        boolean z2;
        float m25887v;
        float m25887v2;
        boolean z3;
        boolean z4;
        boolean z5;
        String m14912x2;
        boolean z6;
        String m7939x = c3239un.m7939x(str);
        String m7949q = c3239un.m7949q(str);
        String[] m7938y = C3239un.m7938y(m7939x);
        if (!m7938y[0].equals("i") || m7938y.length < 3) {
            if (m7938y[0].equals("pb")) {
                m14912x2 = m14912x(str, m7949q, layoutInflater.getContext());
                z6 = true;
            } else if (m7938y[0].equals("b")) {
                m14912x2 = m14912x(str, m7949q, layoutInflater.getContext());
                z6 = false;
            } else {
                if (!m7938y[0].equals("crgb")) {
                    if (m7938y[0].equals("crgba")) {
                        z4 = true;
                        z5 = false;
                        m14918r(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, z4, z5, m14912x(str, m7949q, layoutInflater.getContext()), str);
                    } else if (!m7938y[0].equals("crgb_hl")) {
                        if (m7938y[0].equals("chsl4f")) {
                            z4 = false;
                        } else if (m7938y[0].equals("chsla4f")) {
                            z4 = true;
                        } else if (m7938y[0].equals("f") && m7938y.length >= 3) {
                            float m25887v3 = br1.m25887v(m7938y[1], 0.0f);
                            float m25887v4 = br1.m25887v(m7938y[2], 100.0f);
                            m14921o(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x(str, m7949q, layoutInflater.getContext()), str, m25887v3, m25887v4, (m25887v4 - m25887v3) / 40.0f);
                        } else if (!m7938y[0].equals("f2") || m7938y.length < 3) {
                            if (m7938y[0].equals("mvarf") && m7938y.length >= 3) {
                                m25887v = br1.m25887v(m7938y[1], 0.0f);
                                m25887v2 = br1.m25887v(m7938y[2], 100.0f);
                                z3 = false;
                            } else if (!m7938y[0].equals("mvarf2") || m7938y.length < 3) {
                                if (m7938y[0].equals("txt")) {
                                    m14912x = m14912x(str, m7949q, layoutInflater.getContext());
                                    z2 = false;
                                } else if (m7938y[0].equals("ptxt")) {
                                    m14912x = m14912x(str, m7949q, layoutInflater.getContext());
                                    z2 = true;
                                } else if (m7938y[0].equals("img")) {
                                    int length = m7938y.length - 1;
                                    String[] strArr = new String[length];
                                    System.arraycopy(m7938y, 1, strArr, 0, length);
                                    m14920p(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x(str, m7949q, layoutInflater.getContext()), str, strArr, false);
                                } else if (m7938y[0].equals("pimg")) {
                                    int length2 = m7938y.length - 1;
                                    String[] strArr2 = new String[length2];
                                    System.arraycopy(m7938y, 1, strArr2, 0, length2);
                                    m14920p(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x(str, m7949q, layoutInflater.getContext()), str, strArr2, true);
                                } else if (m7938y[0].equals("asset")) {
                                    int length3 = m7938y.length - 1;
                                    String[] strArr3 = new String[length3];
                                    System.arraycopy(m7938y, 1, strArr3, 0, length3);
                                    m14923m(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x(str, m7949q, layoutInflater.getContext()), str, strArr3, false);
                                } else if (m7938y[0].equals("passet")) {
                                    int length4 = m7938y.length - 1;
                                    String[] strArr4 = new String[length4];
                                    System.arraycopy(m7938y, 1, strArr4, 0, length4);
                                    m14923m(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x(str, m7949q, layoutInflater.getContext()), str, strArr4, true);
                                } else if (m7938y[0].equals("sel")) {
                                    int length5 = m7938y.length - 1;
                                    String[] strArr5 = new String[length5];
                                    System.arraycopy(m7938y, 1, strArr5, 0, length5);
                                    m14926j(true, dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x(str, m7949q, layoutInflater.getContext()), str, strArr5);
                                } else if (!m7938y[0].equals("_child")) {
                                    return false;
                                } else {
                                    int length6 = m7938y.length - 1;
                                    String[] strArr6 = new String[length6];
                                    System.arraycopy(m7938y, 1, strArr6, 0, length6);
                                    m14926j(false, dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x(str, m7949q, layoutInflater.getContext()), str, strArr6);
                                }
                                m14917s(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x, str, z2);
                            } else {
                                m25887v = br1.m25887v(m7938y[1], 0.0f);
                                m25887v2 = br1.m25887v(m7938y[2], 100.0f);
                                z3 = true;
                            }
                            C2455oo.m14121K(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, z3, m14912x(str, m7949q, layoutInflater.getContext()), str, m25887v, m25887v2, (m25887v2 - m25887v) / 40.0f);
                        } else {
                            float m25887v5 = br1.m25887v(m7938y[1], 0.0f);
                            float m25887v6 = br1.m25887v(m7938y[2], 100.0f);
                            m14916t(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x(str, m7949q, layoutInflater.getContext()), str, m25887v5, m25887v6, (m25887v6 - m25887v5) / 40.0f);
                        }
                        z5 = true;
                        m14918r(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, z4, z5, m14912x(str, m7949q, layoutInflater.getContext()), str);
                    }
                }
                z4 = false;
                z5 = false;
                m14918r(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, z4, z5, m14912x(str, m7949q, layoutInflater.getContext()), str);
            }
            m14922n(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x2, str, z6);
        } else {
            m14919q(dialogFragmentC1593ho, layoutInflater, c3239un, z, w40Var, viewGroup, m14912x(str, m7949q, layoutInflater.getContext()), str, br1.m25885x(m7938y[1], 0), br1.m25885x(m7938y[2], 100));
        }
        return true;
    }

    /* renamed from: m */
    public static void m14923m(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, boolean z, w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, String[] strArr, boolean z2) {
        View view;
        LayoutInflater layoutInflater2 = layoutInflater;
        c3239un.m7940w(str2, "");
        ViewGroup viewGroup2 = null;
        View inflate = layoutInflater2.inflate(z2 ? z ? R.layout.dialog_customize_vis_elementdetail_image_pr : R.layout.dialog_customize_vis_element_image_pr : z ? R.layout.dialog_customize_vis_elementdetail_image : R.layout.dialog_customize_vis_element_image, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        View findViewById = inflate.findViewById(R.id.elemValue);
        int i = R.id.btn0;
        ImageButton imageButton = (ImageButton) findViewById.findViewById(R.id.btn0);
        TextView textView = (TextView) findViewById.findViewById(R.id.txt0);
        int i2 = 0;
        imageButton.setClickable(false);
        m14925k(dialogFragmentC1593ho, c3239un, z, inflate, str2, new C2354x(c3239un, str2, strArr, textView, imageButton));
        if (z) {
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layoutContent);
            Button button = (Button) inflate.findViewById(R.id.btnResetValue);
            ((Button) inflate.findViewById(R.id.btnValue)).setVisibility(8);
            int i3 = 0;
            while (i3 < strArr.length) {
                String[] strArr2 = new String[2];
                br1.m25915B(strArr[i3], 58, strArr2);
                int m25885x = br1.m25885x(strArr2[1], i2);
                View inflate2 = layoutInflater2.inflate(z2 ? R.layout.dialog_customize_vis_element_asset_pr_elem : R.layout.dialog_customize_vis_element_asset_elem, viewGroup2);
                ImageButton imageButton2 = (ImageButton) inflate2.findViewById(i);
                imageButton2.setImageResource(m25885x);
                ImageButton imageButton3 = imageButton;
                imageButton2.setOnClickListener(new View$OnClickListenerC2355y(c3239un, str2, strArr2, imageButton3, m25885x, textView, w40Var));
                linearLayout.addView(inflate2);
                i3++;
                layoutInflater2 = layoutInflater;
                button = button;
                inflate = inflate;
                imageButton = imageButton3;
                viewGroup2 = viewGroup2;
                i2 = 0;
                i = R.id.btn0;
            }
            view = inflate;
            button.setOnClickListener(new View$OnClickListenerC2356z(null, c3239un, str2, imageButton, textView, w40Var));
        } else {
            view = inflate;
        }
        viewGroup.addView(view);
    }

    /* renamed from: n */
    public static void m14922n(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, boolean z, w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, boolean z2) {
        View inflate = layoutInflater.inflate(z2 ? z ? R.layout.dialog_customize_vis_elementdetail_toggle_pr : R.layout.dialog_customize_vis_element_toggle_pr : z ? R.layout.dialog_customize_vis_elementdetail_toggle : R.layout.dialog_customize_vis_element_toggle, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(null);
        m14925k(dialogFragmentC1593ho, c3239un, z, inflate, str2, new C2324a(c3239un, str2, checkBox));
        checkBox.setOnCheckedChangeListener(new C2326b(c3239un, str2, w40Var));
        viewGroup.addView(inflate);
    }

    /* renamed from: o */
    public static void m14921o(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, boolean z, w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, float f, float f2, float f3) {
        View inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_bar : R.layout.dialog_customize_vis_element_bar, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        View findViewById = inflate.findViewById(R.id.lineBarBg);
        View findViewById2 = inflate.findViewById(R.id.lineBarValue);
        SeekBar[] seekBarArr = {null};
        EditText[] editTextArr = {null};
        if (z) {
            seekBarArr[0] = (SeekBar) inflate.findViewById(R.id.seekBar);
            editTextArr[0] = (EditText) inflate.findViewById(R.id.editTxt);
            seekBarArr[0].setMax((int) ((f2 - f) / f3));
        }
        InterfaceC1153e0<Object> m14925k = m14925k(dialogFragmentC1593ho, c3239un, z, inflate, str2, new C2334f(c3239un, str2, f, textView, findViewById, findViewById2, f2, f3, z, seekBarArr, editTextArr));
        if (z) {
            seekBarArr[0].setOnSeekBarChangeListener(new C2336g(f3, f, c3239un, str2, m14925k, seekBarArr, w40Var));
            editTextArr[0].addTextChangedListener(new C2338h(f, f2, c3239un, str2, m14925k, editTextArr, w40Var));
        }
        viewGroup.addView(inflate);
    }

    /* renamed from: p */
    public static void m14920p(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, boolean z, w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, String[] strArr, boolean z2) {
        ViewGroup viewGroup2;
        View view;
        int i;
        int i2;
        Button button;
        Button button2;
        View view2;
        LinearLayout linearLayout;
        LayoutInflater layoutInflater2 = layoutInflater;
        String[] strArr2 = strArr;
        C3355vn c3355vn = dialogFragmentC1593ho.f12727y;
        int mo7017c = c3355vn != null ? c3355vn.mo7017c() : 0;
        String m7940w = c3239un.m7940w(str2, "");
        View inflate = layoutInflater2.inflate(z2 ? z ? R.layout.dialog_customize_vis_elementdetail_image_pr : R.layout.dialog_customize_vis_element_image_pr : z ? R.layout.dialog_customize_vis_elementdetail_image : R.layout.dialog_customize_vis_element_image, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        View findViewById = inflate.findViewById(R.id.elemValue);
        ImageButton imageButton = (ImageButton) findViewById.findViewById(R.id.btn0);
        TextView textView = (TextView) findViewById.findViewById(R.id.txt0);
        imageButton.setClickable(false);
        TextView[] textViewArr = {null, null};
        if (z && !z2) {
            textViewArr[0] = (EditText) inflate.findViewById(R.id.editTxt);
            textViewArr[1] = (TextView) inflate.findViewById(R.id.txtV);
        }
        ViewGroup viewGroup3 = null;
        InterfaceC1153e0<Object> m14925k = m14925k(dialogFragmentC1593ho, c3239un, z, inflate, str2, new C2347q(c3239un, str2, textView, imageButton, z, z2, textViewArr));
        if (z) {
            View view3 = inflate;
            LinearLayout linearLayout2 = (LinearLayout) view3.findViewById(R.id.layoutContent);
            Button button3 = (Button) view3.findViewById(R.id.btnValue);
            Button button4 = (Button) view3.findViewById(R.id.btnResetValue);
            int i3 = 0;
            boolean z3 = false;
            while (true) {
                int length = strArr2.length;
                i = R.layout.dialog_customize_vis_element_asset_elem;
                if (i3 >= length) {
                    break;
                }
                String str3 = strArr2[i3];
                int m12555a = qg0.m12555a(str3);
                if (m12555a <= 0) {
                    int m5082i0 = C3543xi.m5082i0(str3);
                    i2 = i3;
                    button = button4;
                    button2 = button3;
                    view2 = view3;
                    if (m5082i0 >= 0) {
                        z3 = true;
                    }
                    linearLayout = linearLayout2;
                } else {
                    View inflate2 = layoutInflater2.inflate(R.layout.dialog_customize_vis_element_asset_elem, viewGroup3);
                    ImageButton imageButton2 = (ImageButton) inflate2.findViewById(R.id.btn0);
                    imageButton2.setImageResource(m12555a);
                    i2 = i3;
                    button = button4;
                    button2 = button3;
                    view2 = view3;
                    linearLayout = linearLayout2;
                    imageButton2.setOnClickListener(new View$OnClickListenerC2348r(c3239un, str2, str3, m14925k, imageButton2, w40Var));
                    linearLayout.addView(inflate2);
                }
                i3 = i2 + 1;
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
            if (z3) {
                int i4 = 1;
                while (i4 < mo7017c) {
                    String m5077n0 = C3543xi.m5077n0(i4);
                    View inflate3 = layoutInflater2.inflate(i, (ViewGroup) null);
                    TextView textView2 = (TextView) inflate3.findViewById(R.id.txt0);
                    textView2.setVisibility(0);
                    textView2.setText("" + i4);
                    ImageButton imageButton3 = (ImageButton) inflate3.findViewById(R.id.btn0);
                    imageButton3.setImageResource(R.drawable.ic_visual1);
                    imageButton3.setOnClickListener(new View$OnClickListenerC2349s(c3239un, str2, m5077n0, m14925k, imageButton3, w40Var));
                    linearLayout3.addView(inflate3);
                    i4++;
                    layoutInflater2 = layoutInflater;
                    i = R.layout.dialog_customize_vis_element_asset_elem;
                }
            }
            button6.setOnClickListener(new View$OnClickListenerC2350t(null, c3239un, str2, m7940w));
            button5.setOnClickListener(new View$OnClickListenerC2351u(null, c3239un, str2, m14925k, button5, w40Var));
            if (!z2) {
                textViewArr[0].addTextChangedListener(new C2353w(c3239un, str2, m14925k, textViewArr, w40Var));
            }
            viewGroup2 = viewGroup;
            view = view4;
        } else {
            viewGroup2 = viewGroup;
            view = inflate;
        }
        viewGroup2.addView(view);
    }

    /* renamed from: q */
    public static void m14919q(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, boolean z, w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, int i, int i2) {
        c3239un.m7947r(str2, i);
        View inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_bar : R.layout.dialog_customize_vis_element_bar, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        View findViewById = inflate.findViewById(R.id.lineBarBg);
        View findViewById2 = inflate.findViewById(R.id.lineBarValue);
        SeekBar[] seekBarArr = {null};
        EditText[] editTextArr = {null};
        if (z) {
            seekBarArr[0] = (SeekBar) inflate.findViewById(R.id.seekBar);
            editTextArr[0] = (EditText) inflate.findViewById(R.id.editTxt);
            seekBarArr[0].setMax(i2 - i);
        }
        InterfaceC1153e0<Object> m14925k = m14925k(dialogFragmentC1593ho, c3239un, z, inflate, str2, new C2328c(c3239un, str2, i, textView, findViewById, findViewById2, i2, z, seekBarArr, editTextArr));
        if (z) {
            seekBarArr[0].setOnSeekBarChangeListener(new C2330d(c3239un, str2, i, m14925k, seekBarArr, w40Var));
            editTextArr[0].addTextChangedListener(new C2332e(i, i2, c3239un, str2, m14925k, editTextArr, w40Var));
        }
        viewGroup.addView(inflate);
    }

    /* renamed from: r */
    public static void m14918r(final DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, final C3239un c3239un, final boolean z, final w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, final boolean z2, final boolean z3, String str, final String str2) {
        InterfaceC1153e0 interfaceC1153e0;
        final C3239un c3239un2;
        View inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_crgba : R.layout.dialog_customize_vis_element_crgba, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        final TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        final View findViewById = inflate.findViewById(R.id.solidValue);
        final C3538xg[] c3538xgArr = {null};
        vj0[] vj0VarArr = {null};
        final C2146m2[] c2146m2Arr = {null};
        if (z) {
            c3538xgArr[0] = (C3538xg) inflate.findViewById(R.id.colorPicker);
            vj0VarArr[0] = (vj0) inflate.findViewById(R.id.lightnessSlider);
            c2146m2Arr[0] = (C2146m2) inflate.findViewById(R.id.alphaSlider);
            c3538xgArr[0].setLightnessSlider(vj0VarArr[0]);
            c3538xgArr[0].setAlphaSlider(c2146m2Arr[0]);
        }
        if (z3) {
            c3239un2 = c3239un;
            interfaceC1153e0 = new InterfaceC1153e0() { // from class: com.daaw.ko
                @Override // com.daaw.InterfaceC1153e0
                /* renamed from: a */
                public final void mo7884a(Object obj) {
                    C2323no.m14944A(C3239un.this, str2, z, z2, c2146m2Arr, c3538xgArr, textView, findViewById, obj);
                }
            };
        } else {
            c3239un2 = c3239un;
            interfaceC1153e0 = new InterfaceC1153e0() { // from class: com.daaw.jo
                @Override // com.daaw.InterfaceC1153e0
                /* renamed from: a */
                public final void mo7884a(Object obj) {
                    C2323no.m14943B(C3239un.this, str2, z, z2, c2146m2Arr, c3538xgArr, textView, findViewById, obj);
                }
            };
        }
        final InterfaceC1153e0<Object> m14925k = m14925k(dialogFragmentC1593ho, c3239un2, z, inflate, str2, interfaceC1153e0);
        if (z) {
            c3538xgArr[0].m5151a(new au0() { // from class: com.daaw.lo
                @Override // com.daaw.au0
                /* renamed from: a */
                public final void mo16705a(int i) {
                    C2323no.m14942C(z3, c3239un, str2, dialogFragmentC1593ho, m14925k, c3538xgArr, w40Var, i);
                }
            });
            c3538xgArr[0].m5150b(new bu0() { // from class: com.daaw.mo
                @Override // com.daaw.bu0
                /* renamed from: a */
                public final void mo15889a(int i) {
                    C2323no.m14941D(z3, c3239un, str2, dialogFragmentC1593ho, m14925k, c3538xgArr, w40Var, i);
                }
            });
        }
        viewGroup.addView(inflate);
    }

    /* renamed from: s */
    public static void m14917s(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, boolean z, w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, boolean z2) {
        String m7940w = c3239un.m7940w(str2, "");
        View inflate = layoutInflater.inflate(z2 ? z ? R.layout.dialog_customize_vis_elementdetail_txt_pr : R.layout.dialog_customize_vis_element_txt_pr : z ? R.layout.dialog_customize_vis_elementdetail_txt : R.layout.dialog_customize_vis_element_txt, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        m14925k(dialogFragmentC1593ho, c3239un, z, inflate, str2, new C2345o(c3239un, str2, textView));
        if (z) {
            EditText editText = (EditText) inflate.findViewById(R.id.editTxt);
            editText.setText(m7940w);
            editText.addTextChangedListener(new C2346p(textView, c3239un, str2, w40Var));
        }
        viewGroup.addView(inflate);
    }

    /* renamed from: t */
    public static void m14916t(DialogFragmentC1593ho dialogFragmentC1593ho, LayoutInflater layoutInflater, C3239un c3239un, boolean z, w40<InterfaceC1153e0<Object>> w40Var, ViewGroup viewGroup, String str, String str2, float f, float f2, float f3) {
        c3239un.m7937z(str2, new bs1(f, f));
        View inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_bar_xy : R.layout.dialog_customize_vis_element_bar_xy, (ViewGroup) null);
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
        if (z) {
            seekBarArr[0] = (SeekBar) inflate.findViewById(R.id.seekBarX);
            seekBarArr2[0] = (SeekBar) inflate.findViewById(R.id.seekBarY);
            editTextArr[0] = (EditText) inflate.findViewById(R.id.editTxtX);
            editTextArr2[0] = (EditText) inflate.findViewById(R.id.editTxtY);
            int i = (int) ((f2 - f) / f3);
            seekBarArr[0].setMax(i);
            seekBarArr2[0].setMax(i);
        }
        InterfaceC1153e0<Object> m14925k = m14925k(dialogFragmentC1593ho, c3239un, z, inflate, str2, new C2339i(c3239un, str2, f, textView, findViewById, findViewById2, f2, f3, findViewById3, findViewById4, z, seekBarArr, seekBarArr2, editTextArr, editTextArr2));
        if (z) {
            seekBarArr[0].setOnSeekBarChangeListener(new C2340j(c3239un, str2, f, f3, m14925k, seekBarArr, w40Var));
            seekBarArr2[0].setOnSeekBarChangeListener(new C2342l(c3239un, str2, f, f3, m14925k, seekBarArr2, w40Var));
            editTextArr[0].addTextChangedListener(new C2343m(f, f2, c3239un, str2, m14925k, editTextArr, w40Var));
            editTextArr2[0].addTextChangedListener(new C2344n(f, f2, c3239un, str2, m14925k, editTextArr2, w40Var));
        }
        viewGroup.addView(inflate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: u */
    public static int m14915u(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2067891215:
                if (str.equals("Spectrum")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2022305722:
                if (str.equals("Letter")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1997548570:
                if (str.equals("Manual")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1970646622:
                if (str.equals("ConstantShake")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1919497322:
                if (str.equals("Vertical")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1823822708:
                if (str.equals("Screen")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1808097416:
                if (str.equals("Transparency")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1726838578:
                if (str.equals("Vortex")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1274453993:
                if (str.equals("ConstantShakeMore")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1199117987:
                if (str.equals("AddAlpha")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1169699505:
                if (str.equals("Rectangle")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1137728652:
                if (str.equals("TrackPosition")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1037027930:
                if (str.equals("BeatCamShakeLess")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1036988574:
                if (str.equals("BeatCamShakeMore")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -913872828:
                if (str.equals("Horizontal")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -831910124:
                if (str.equals("TotalTimeBackward")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -521561331:
                if (str.equals("InvertedTransparency")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -500990035:
                if (str.equals("Nothing")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -269505853:
                if (str.equals("TotalTimeWhenPlaying")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -147734627:
                if (str.equals("PreMulAlpha")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 65665:
                if (str.equals("Add")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2063072:
                if (str.equals("Bars")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 2066390:
                if (str.equals("Beat")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2368532:
                if (str.equals("Line")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 2433880:
                if (str.equals("None")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 63357246:
                if (str.equals("Alpha")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 111442729:
                if (str.equals("unset")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 319881825:
                if (str.equals("Spectrum2")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 361054323:
                if (str.equals("TransparencyAndBlacks")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 395745294:
                if (str.equals("ConstantShakeRotLess")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 395784650:
                if (str.equals("ConstantShakeRotMore")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 431547818:
                if (str.equals("SharpBars")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 668852061:
                if (str.equals("Waveform")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 916906211:
                if (str.equals("BeatCamShakeRotLess")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 916945567:
                if (str.equals("BeatCamShakeRotMore")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 958826889:
                if (str.equals("TransparencyAndWhites")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1080667017:
                if (str.equals("HorizontalAndVertical")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 1135983803:
                if (str.equals("EffectTransform")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 1258639580:
                if (str.equals("TotalTimeAndBeat")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 1426685969:
                if (str.equals("TotalTime")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 1536319149:
                if (str.equals("SidedPolygon")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 1547631181:
                if (str.equals("BeatRandomShake")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 1577119283:
                if (str.equals("BeatTriggerAnim")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 1802881624:
                if (str.equals("HorizontalLine")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 1998378318:
                if (str.equals("RoundBars")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 2018617584:
                if (str.equals("Circle")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
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

    /* renamed from: v */
    public static int m14914v(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1620329056:
                if (str.equals("Y Speed")) {
                    c = 0;
                    break;
                }
                break;
            case -951185088:
                if (str.equals("X Amount")) {
                    c = 1;
                    break;
                }
                break;
            case 88:
                if (str.equals("X")) {
                    c = 2;
                    break;
                }
                break;
            case 89:
                if (str.equals("Y")) {
                    c = 3;
                    break;
                }
                break;
            case 80089127:
                if (str.equals("Speed")) {
                    c = 4;
                    break;
                }
                break;
            case 365740034:
                if (str.equals("Beat Amount")) {
                    c = 5;
                    break;
                }
                break;
            case 457725221:
                if (str.equals("Smoothness")) {
                    c = 6;
                    break;
                }
                break;
            case 791625247:
                if (str.equals("Y Amount")) {
                    c = 7;
                    break;
                }
                break;
            case 870470476:
                if (str.equals("AppLogo")) {
                    c = '\b';
                    break;
                }
                break;
            case 1787134559:
                if (str.equals("X Speed")) {
                    c = '\t';
                    break;
                }
                break;
            case 1964981368:
                if (str.equals("Amount")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
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

    /* renamed from: w */
    public static int m14913w(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2132535343:
                if (str.equals("spectrum")) {
                    c = 0;
                    break;
                }
                break;
            case -2129324157:
                if (str.equals("startSize")) {
                    c = 1;
                    break;
                }
                break;
            case -2105107894:
                if (str.equals("targetImage")) {
                    c = 2;
                    break;
                }
                break;
            case -2092502904:
                if (str.equals("introBlendMode")) {
                    c = 3;
                    break;
                }
                break;
            case -2054882410:
                if (str.equals("blurredBorder")) {
                    c = 4;
                    break;
                }
                break;
            case -2032518305:
                if (str.equals("endSizeRandom")) {
                    c = 5;
                    break;
                }
                break;
            case -1894434088:
                if (str.equals("sideSineWaveFreqRandom")) {
                    c = 6;
                    break;
                }
                break;
            case -1830662607:
                if (str.equals("preSmooth")) {
                    c = 7;
                    break;
                }
                break;
            case -1813453502:
                if (str.equals("measureWhat")) {
                    c = '\b';
                    break;
                }
                break;
            case -1798067094:
                if (str.equals("customImage")) {
                    c = '\t';
                    break;
                }
                break;
            case -1762437773:
                if (str.equals("barWidth")) {
                    c = '\n';
                    break;
                }
                break;
            case -1754072813:
                if (str.equals("posBlurAmount")) {
                    c = 11;
                    break;
                }
                break;
            case -1749172349:
                if (str.equals("sourceCompositionIndex")) {
                    c = '\f';
                    break;
                }
                break;
            case -1745709637:
                if (str.equals("sampleProvider")) {
                    c = '\r';
                    break;
                }
                break;
            case -1684743359:
                if (str.equals("higherHz")) {
                    c = 14;
                    break;
                }
                break;
            case -1680767714:
                if (str.equals("ColorTo")) {
                    c = 15;
                    break;
                }
                break;
            case -1672355622:
                if (str.equals("reactionDelay")) {
                    c = 16;
                    break;
                }
                break;
            case -1665280139:
                if (str.equals("useRandomVectorInstead")) {
                    c = 17;
                    break;
                }
                break;
            case -1607272580:
                if (str.equals("endSize")) {
                    c = 18;
                    break;
                }
                break;
            case -1523994363:
                if (str.equals("3layerColor")) {
                    c = 19;
                    break;
                }
                break;
            case -1519214023:
                if (str.equals("aWeight")) {
                    c = 20;
                    break;
                }
                break;
            case -1519052026:
                if (str.equals("hzLinearFactor")) {
                    c = 21;
                    break;
                }
                break;
            case -1509586196:
                if (str.equals("3layerScale")) {
                    c = 22;
                    break;
                }
                break;
            case -1435535992:
                if (str.equals("blurMultiplier")) {
                    c = 23;
                    break;
                }
                break;
            case -1428201511:
                if (str.equals("blurRadius")) {
                    c = 24;
                    break;
                }
                break;
            case -1416471601:
                if (str.equals("generatedAlbumArtHintForceGen")) {
                    c = 25;
                    break;
                }
                break;
            case -1411102829:
                if (str.equals("showUnblurredContentUnder")) {
                    c = 26;
                    break;
                }
                break;
            case -1356966249:
                if (str.equals("beatRangeValueLower")) {
                    c = 27;
                    break;
                }
                break;
            case -1330973839:
                if (str.equals("motionSource")) {
                    c = 28;
                    break;
                }
                break;
            case -1298315851:
                if (str.equals("sideSineWaveFreq")) {
                    c = 29;
                    break;
                }
                break;
            case -1279931764:
                if (str.equals("MeasureColorBlend")) {
                    c = 30;
                    break;
                }
                break;
            case -1218263876:
                if (str.equals("introFadeDuration")) {
                    c = 31;
                    break;
                }
                break;
            case -1216111997:
                if (str.equals("barWidthAffectedByShape")) {
                    c = ' ';
                    break;
                }
                break;
            case -1164928614:
                if (str.equals("sampleOutCountPower")) {
                    c = '!';
                    break;
                }
                break;
            case -1122059559:
                if (str.equals("sideSineWaveMagRandom")) {
                    c = '\"';
                    break;
                }
                break;
            case -1091298227:
                if (str.equals("overall")) {
                    c = '#';
                    break;
                }
                break;
            case -1073910849:
                if (str.equals("mirror")) {
                    c = '$';
                    break;
                }
                break;
            case -1043912605:
                if (str.equals("heightScale")) {
                    c = '%';
                    break;
                }
                break;
            case -967112229:
                if (str.equals("outroFadeDuration")) {
                    c = '&';
                    break;
                }
                break;
            case -954021426:
                if (str.equals("keepAspectRatio")) {
                    c = '\'';
                    break;
                }
                break;
            case -938578798:
                if (str.equals("radius")) {
                    c = '(';
                    break;
                }
                break;
            case -934025771:
                if (str.equals("fftSize")) {
                    c = ')';
                    break;
                }
                break;
            case -898533970:
                if (str.equals("smooth")) {
                    c = '*';
                    break;
                }
                break;
            case -869451088:
                if (str.equals("AudioCapture")) {
                    c = '+';
                    break;
                }
                break;
            case -862612413:
                if (str.equals("anchorX")) {
                    c = ',';
                    break;
                }
                break;
            case -862612412:
                if (str.equals("anchorY")) {
                    c = '-';
                    break;
                }
                break;
            case -858480819:
                if (str.equals("endSizeZFactor")) {
                    c = '.';
                    break;
                }
                break;
            case -729767381:
                if (str.equals("sampleOutCount")) {
                    c = '/';
                    break;
                }
                break;
            case -721446595:
                if (str.equals("motionBlur")) {
                    c = '0';
                    break;
                }
                break;
            case -691194386:
                if (str.equals("repeatSamples")) {
                    c = '1';
                    break;
                }
                break;
            case -676746057:
                if (str.equals("typeFace")) {
                    c = '2';
                    break;
                }
                break;
            case -667062077:
                if (str.equals("spectrumHz")) {
                    c = '3';
                    break;
                }
                break;
            case -628844548:
                if (str.equals("colorKey")) {
                    c = '4';
                    break;
                }
                break;
            case -619083598:
                if (str.equals("blurDivider")) {
                    c = '5';
                    break;
                }
                break;
            case -614537171:
                if (str.equals("highQualityAudioCapture")) {
                    c = '6';
                    break;
                }
                break;
            case -574382843:
                if (str.equals("fadeInAndOutTime")) {
                    c = '7';
                    break;
                }
                break;
            case -564200420:
                if (str.equals("ColorKey")) {
                    c = '8';
                    break;
                }
                break;
            case -509460392:
                if (str.equals("MeasureOverallSpeed")) {
                    c = '9';
                    break;
                }
                break;
            case -499975028:
                if (str.equals("trailLength")) {
                    c = ':';
                    break;
                }
                break;
            case -437239254:
                if (str.equals("TargetImage")) {
                    c = ';';
                    break;
                }
                break;
            case -420344778:
                if (str.equals("MeasurePos")) {
                    c = '<';
                    break;
                }
                break;
            case -406349635:
                if (str.equals("behaviour")) {
                    c = '=';
                    break;
                }
                break;
            case -387029296:
                if (str.equals("audioDurationMs")) {
                    c = '>';
                    break;
                }
                break;
            case -386326900:
                if (str.equals("measureScale")) {
                    c = '?';
                    break;
                }
                break;
            case -372996888:
                if (str.equals("spawnTime")) {
                    c = '@';
                    break;
                }
                break;
            case -342338300:
                if (str.equals("beatSmooth")) {
                    c = 'A';
                    break;
                }
                break;
            case -310480499:
                if (str.equals("ColorFrom")) {
                    c = 'B';
                    break;
                }
                break;
            case -248684892:
                if (str.equals("beatRangeBarFirst")) {
                    c = 'C';
                    break;
                }
                break;
            case -230491182:
                if (str.equals("saturation")) {
                    c = 'D';
                    break;
                }
                break;
            case -101338902:
                if (str.equals("freqShift")) {
                    c = 'E';
                    break;
                }
                break;
            case -80148248:
                if (str.equals("general")) {
                    c = 'F';
                    break;
                }
                break;
            case -76472197:
                if (str.equals("barHeightMultiplier")) {
                    c = 'G';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 'H';
                    break;
                }
                break;
            case -2608886:
                if (str.equals("vectorAngleZ")) {
                    c = 'I';
                    break;
                }
                break;
            case 65:
                if (str.equals("A")) {
                    c = 'J';
                    break;
                }
                break;
            case 66:
                if (str.equals("B")) {
                    c = 'K';
                    break;
                }
                break;
            case 102102:
                if (str.equals("gap")) {
                    c = 'L';
                    break;
                }
                break;
            case 114586:
                if (str.equals("tag")) {
                    c = 'M';
                    break;
                }
                break;
            case 3016384:
                if (str.equals("bars")) {
                    c = 'N';
                    break;
                }
                break;
            case 3019702:
                if (str.equals("beat")) {
                    c = 'O';
                    break;
                }
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c = 'P';
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 'Q';
                    break;
                }
                break;
            case 19321079:
                if (str.equals("lowerFreqMagnitude")) {
                    c = 'R';
                    break;
                }
                break;
            case 65290051:
                if (str.equals("Color")) {
                    c = 'S';
                    break;
                }
                break;
            case 79847297:
                if (str.equals("Shape")) {
                    c = 'T';
                    break;
                }
                break;
            case 80089127:
                if (str.equals("Speed")) {
                    c = 'U';
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 'V';
                    break;
                }
                break;
            case 96672374:
                if (str.equals("sideSineWaveMag")) {
                    c = 'W';
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 'X';
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c = 'Y';
                    break;
                }
                break;
            case 109432316:
                if (str.equals("sides")) {
                    c = 'Z';
                    break;
                }
                break;
            case 143930394:
                if (str.equals("nearCameraFadeOutDistance")) {
                    c = '[';
                    break;
                }
                break;
            case 187480080:
                if (str.equals("Performance")) {
                    c = '\\';
                    break;
                }
                break;
            case 243901696:
                if (str.equals("generatedAlbumArtColor")) {
                    c = ']';
                    break;
                }
                break;
            case 272956996:
                if (str.equals("2layerColor")) {
                    c = '^';
                    break;
                }
                break;
            case 274882223:
                if (str.equals("maskMode")) {
                    c = '_';
                    break;
                }
                break;
            case 280051645:
                if (str.equals("keepAspectRatioAndCropToFit")) {
                    c = '`';
                    break;
                }
                break;
            case 280523342:
                if (str.equals("gravity")) {
                    c = 'a';
                    break;
                }
                break;
            case 287365163:
                if (str.equals("2layerScale")) {
                    c = 'b';
                    break;
                }
                break;
            case 316345088:
                if (str.equals("scaleIsUniform")) {
                    c = 'c';
                    break;
                }
                break;
            case 331178053:
                if (str.equals("blendModeContent")) {
                    c = 'd';
                    break;
                }
                break;
            case 357005299:
                if (str.equals("lowerHz")) {
                    c = 'e';
                    break;
                }
                break;
            case 364547910:
                if (str.equals("ShapePath")) {
                    c = 'f';
                    break;
                }
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    c = 'g';
                    break;
                }
                break;
            case 391971034:
                if (str.equals("blurEnabled")) {
                    c = 'h';
                    break;
                }
                break;
            case 396904763:
                if (str.equals("introFadeColor")) {
                    c = 'i';
                    break;
                }
                break;
            case 411341961:
                if (str.equals("scaleBlurAmount")) {
                    c = 'j';
                    break;
                }
                break;
            case 446220202:
                if (str.equals("reactionAccumulatedDelay")) {
                    c = 'k';
                    break;
                }
                break;
            case 463539320:
                if (str.equals("generatedAlbumArtHintNoText")) {
                    c = 'l';
                    break;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    c = 'm';
                    break;
                }
                break;
            case 491175137:
                if (str.equals("colorBlendOffset")) {
                    c = 'n';
                    break;
                }
                break;
            case 505030585:
                if (str.equals("transparencyStrength")) {
                    c = 'o';
                    break;
                }
                break;
            case 526636965:
                if (str.equals("colorKeyEnabled")) {
                    c = 'p';
                    break;
                }
                break;
            case 554105168:
                if (str.equals("vectorAngle")) {
                    c = 'q';
                    break;
                }
                break;
            case 668852061:
                if (str.equals("Waveform")) {
                    c = 'r';
                    break;
                }
                break;
            case 713328458:
                if (str.equals("mirrorSamples")) {
                    c = 's';
                    break;
                }
                break;
            case 718630340:
                if (str.equals("waveBehaviour")) {
                    c = 't';
                    break;
                }
                break;
            case 731484812:
                if (str.equals("flipMirror")) {
                    c = 'u';
                    break;
                }
                break;
            case 733347259:
                if (str.equals("fixedHeight")) {
                    c = 'v';
                    break;
                }
                break;
            case 747804969:
                if (str.equals("position")) {
                    c = 'w';
                    break;
                }
                break;
            case 747912225:
                if (str.equals("measureAnimationSpeed")) {
                    c = 'x';
                    break;
                }
                break;
            case 763187449:
                if (str.equals("beatRangeValueHigher")) {
                    c = 'y';
                    break;
                }
                break;
            case 798415995:
                if (str.equals("splitMultiplier")) {
                    c = 'z';
                    break;
                }
                break;
            case 869786304:
                if (str.equals("blurAmountMultiplier")) {
                    c = '{';
                    break;
                }
                break;
            case 895597972:
                if (str.equals("blendMode")) {
                    c = '|';
                    break;
                }
                break;
            case 916991557:
                if (str.equals("showUnblurredContent")) {
                    c = '}';
                    break;
                }
                break;
            case 940455948:
                if (str.equals("CountLimit")) {
                    c = '~';
                    break;
                }
                break;
            case 949546302:
                if (str.equals("colorTo")) {
                    c = 127;
                    break;
                }
                break;
            case 960570313:
                if (str.equals("lifetime")) {
                    c = 128;
                    break;
                }
                break;
            case 1068502137:
                if (str.equals("mirrorX")) {
                    c = 129;
                    break;
                }
                break;
            case 1068502138:
                if (str.equals("mirrorY")) {
                    c = 130;
                    break;
                }
                break;
            case 1092734564:
                if (str.equals("particleScale")) {
                    c = 131;
                    break;
                }
                break;
            case 1100527650:
                if (str.equals("beatRangeBarLast")) {
                    c = 132;
                    break;
                }
                break;
            case 1120049792:
                if (str.equals("starAndEndGap")) {
                    c = 133;
                    break;
                }
                break;
            case 1120512894:
                if (str.equals("Segment1")) {
                    c = 134;
                    break;
                }
                break;
            case 1120512895:
                if (str.equals("Segment2")) {
                    c = 135;
                    break;
                }
                break;
            case 1242558207:
                if (str.equals("introOutro")) {
                    c = 136;
                    break;
                }
                break;
            case 1267377247:
                if (str.equals("maxHeightScale")) {
                    c = 137;
                    break;
                }
                break;
            case 1296698412:
                if (str.equals("alignmentPosition")) {
                    c = 138;
                    break;
                }
                break;
            case 1310696935:
                if (str.equals("perspectiveDepth")) {
                    c = 139;
                    break;
                }
                break;
            case 1319065985:
                if (str.equals("softness")) {
                    c = 140;
                    break;
                }
                break;
            case 1331946914:
                if (str.equals("outputMultiplier")) {
                    c = 141;
                    break;
                }
                break;
            case 1406691941:
                if (str.equals("relativeMotionMode")) {
                    c = 142;
                    break;
                }
                break;
            case 1485446162:
                if (str.equals("splitAmount")) {
                    c = 143;
                    break;
                }
                break;
            case 1502785490:
                if (str.equals("sizeAspectRatio")) {
                    c = 144;
                    break;
                }
                break;
            case 1540100218:
                if (str.equals("verticalOrientation")) {
                    c = 145;
                    break;
                }
                break;
            case 1544069981:
                if (str.equals("flipInput")) {
                    c = 146;
                    break;
                }
                break;
            case 1544456423:
                if (str.equals("splitColor0")) {
                    c = 147;
                    break;
                }
                break;
            case 1544456424:
                if (str.equals("splitColor1")) {
                    c = 148;
                    break;
                }
                break;
            case 1544456425:
                if (str.equals("splitColor2")) {
                    c = 149;
                    break;
                }
                break;
            case 1575556722:
                if (str.equals("Behavior")) {
                    c = 150;
                    break;
                }
                break;
            case 1581341518:
                if (str.equals("autoDetectColorKey")) {
                    c = 151;
                    break;
                }
                break;
            case 1589741529:
                if (str.equals("filterStrength")) {
                    c = 152;
                    break;
                }
                break;
            case 1593214283:
                if (str.equals("splitEffect")) {
                    c = 153;
                    break;
                }
                break;
            case 1630413448:
                if (str.equals("SpawnArea")) {
                    c = 154;
                    break;
                }
                break;
            case 1706931947:
                if (str.equals("inputSize")) {
                    c = 155;
                    break;
                }
                break;
            case 1720742252:
                if (str.equals("opacityStrength")) {
                    c = 156;
                    break;
                }
                break;
            case 1744314882:
                if (str.equals("mirrorMode")) {
                    c = 157;
                    break;
                }
                break;
            case 1747046655:
                if (str.equals("vectorRelativeToCenter")) {
                    c = 158;
                    break;
                }
                break;
            case 1757102379:
                if (str.equals("audioProviderIndex")) {
                    c = 159;
                    break;
                }
                break;
            case 1796717668:
                if (str.equals("appearance")) {
                    c = 160;
                    break;
                }
                break;
            case 1859598371:
                if (str.equals("generatedAlbumArt")) {
                    c = 161;
                    break;
                }
                break;
            case 1881159577:
                if (str.equals("measureRot")) {
                    c = 162;
                    break;
                }
                break;
            case 1888191616:
                if (str.equals("generatedAlbumArtHintShiftHue")) {
                    c = 163;
                    break;
                }
                break;
            case 1916128758:
                if (str.equals("velocityAngle")) {
                    c = 164;
                    break;
                }
                break;
            case 1924293297:
                if (str.equals("minHeightScale")) {
                    c = 165;
                    break;
                }
                break;
            case 1931625903:
                if (str.equals("MaskImage")) {
                    c = 166;
                    break;
                }
                break;
            case 1980518829:
                if (str.equals("colorFrom")) {
                    c = 167;
                    break;
                }
                break;
            case 1984810242:
                if (str.equals("flipEveryOther")) {
                    c = 168;
                    break;
                }
                break;
            case 2012537073:
                if (str.equals("perspectiveFov")) {
                    c = 169;
                    break;
                }
                break;
            case 2026060898:
                if (str.equals("fadeInSize")) {
                    c = 170;
                    break;
                }
                break;
            case 2031828970:
                if (str.equals("speedRandom")) {
                    c = 171;
                    break;
                }
                break;
            case 2069908355:
                if (str.equals("1layerColor")) {
                    c = 172;
                    break;
                }
                break;
            case 2084316522:
                if (str.equals("1layerScale")) {
                    c = 173;
                    break;
                }
                break;
            case 2086906410:
                if (str.equals("filterRadius")) {
                    c = 174;
                    break;
                }
                break;
            case 2104827119:
                if (str.equals("ForceField")) {
                    c = 175;
                    break;
                }
                break;
        }
        switch (c) {
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
            case p21.f22268J0 /* 91 */:
                return R.string.near_camera_fade_out_distance;
            case p21.f22274K0 /* 92 */:
                return R.string.performance;
            case p21.f22280L0 /* 93 */:
                return R.string.generated_album_art_color;
            case p21.f22286M0 /* 94 */:
                return R.string._2layer_color;
            case p21.f22292N0 /* 95 */:
                return R.string.mask_mode;
            case p21.f22298O0 /* 96 */:
                return R.string.keep_aspect_ratio_and_crop_to_fit;
            case p21.f22304P0 /* 97 */:
                return R.string.gravity;
            case p21.f22310Q0 /* 98 */:
                return R.string._2layer_scale;
            case p21.f22316R0 /* 99 */:
                return R.string.scale_is_uniform;
            case p21.f22322S0 /* 100 */:
                return R.string.blend_mode_content;
            case p21.f22328T0 /* 101 */:
                return R.string.lower_hz;
            case p21.f22334U0 /* 102 */:
                return R.string.shape_path;
            case p21.f22340V0 /* 103 */:
                return R.string.font_size;
            case p21.f22346W0 /* 104 */:
                return R.string.blur_enabled;
            case 'i':
                return R.string.intro_fade_color;
            case p21.f22352X0 /* 106 */:
                return R.string.scale_blur_amount;
            case p21.f22358Y0 /* 107 */:
                return R.string.reaction_accumulated_delay;
            case p21.f22364Z0 /* 108 */:
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
            case x21.f31769C0 /* 116 */:
                return R.string.wave_behaviour;
            case x21.f31774D0 /* 117 */:
                return R.string.flip_mirror;
            case x21.f31779E0 /* 118 */:
                return R.string.fixed_height;
            case x21.f31784F0 /* 119 */:
                return R.string.position;
            case x21.f31789G0 /* 120 */:
                return R.string.measure_animation_speed;
            case x21.f31794H0 /* 121 */:
                return R.string.beat_range_value_higher;
            case x21.f31799I0 /* 122 */:
                return R.string.split_multiplier;
            case x21.f31804J0 /* 123 */:
                return R.string.blur_amount_multiplier;
            case x21.f31809K0 /* 124 */:
                return R.string.blend_mode;
            case x21.f31814L0 /* 125 */:
                return R.string.show_unblurred_content;
            case x21.f31819M0 /* 126 */:
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

    /* renamed from: x */
    public static String m14912x(String str, String str2, Context context) {
        String str3;
        boolean z;
        if (str2 == null || str2.length() <= 0) {
            str3 = null;
        } else {
            int m14914v = m14914v(str2);
            if (m14914v > 0) {
                str3 = context.getString(m14914v);
            } else {
                String replace = ("hint_" + m14927i(str2)).replace(" ", "");
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
        int m14913w = m14913w(str);
        if (m14913w > 0) {
            sb2.append(context.getString(m14913w));
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
            z = Character.isDigit(upperCase);
        } else {
            z = false;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            boolean z2 = Character.isUpperCase(charAt) || Character.isDigit(charAt);
            if (z && z2) {
                sb2.append(' ');
                sb3.append("_");
            }
            sb2.append(charAt);
            sb3.append(Character.toLowerCase(charAt));
            z = !z2;
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

    /* renamed from: y */
    public static String m14911y(String str, String str2, Context context) {
        return m14912x(br1.m25913D(str, 95, str), null, context);
    }

    /* renamed from: E */
    public void m14940E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20337b = viewGroup.findViewById(R.id.view1RootView);
        this.f20338c = (ViewGroup) viewGroup.findViewById(R.id.linearLayoutContent);
        this.f20336a = (TextView) viewGroup.findViewById(R.id.txtElementTitle);
        ((ImageButton) viewGroup.findViewById(R.id.btnBack)).setOnClickListener(new View$OnClickListenerC2341k());
        ((ImageButton) viewGroup.findViewById(R.id.btnInfo)).setOnClickListener(new View$OnClickListenerC2352v());
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.btnResetElement);
        imageButton.setOnClickListener(new View$OnClickListenerC2325a0());
        imageButton.setOnLongClickListener(new View$OnLongClickListenerC2327b0());
        this.f20339d = (Spinner) viewGroup.findViewById(R.id.spinnerVersion);
        this.f20340e = new C2329c0();
        this.f20343h.clear();
    }

    /* renamed from: F */
    public void m14939F(TextView textView, List<String> list, String str, String str2) {
        DialogFragmentC1593ho m20595k;
        Iterator<String> it;
        lz1.m16365a("hierarchyPath" + list + " propertyName: " + str + " value: " + str2);
        String str3 = "";
        if (this.f20338c != null && textView != null) {
            textView.setText(str2 != null ? str2 : "");
        }
        if (list == null || str == null || (m20595k = DialogFragmentC1593ho.m20595k()) == null) {
            return;
        }
        C3239un m7011i = m20595k.f12727y.m7011i(list);
        if (m7011i != null) {
            if (str2 == null) {
                str2 = "";
            }
            m7011i.m7964i0(str, str2);
            m20595k.m20587s();
            return;
        }
        while (list.iterator().hasNext()) {
            str3 = str3 + it.next();
        }
        lz1.m16363c("invalid hierarchyPath: [" + str3 + "]");
    }

    /* renamed from: H */
    public void m14937H(C3239un c3239un) {
        String str;
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k != null && m20595k.m20590p() && m14910z()) {
            LayoutInflater from = LayoutInflater.from(m20595k.getActivity());
            this.f20344i = c3239un;
            if (c3239un == null) {
                this.f20336a.setText(R.string.nothing_to_show);
                this.f20338c.removeAllViews();
                this.f20343h.clear();
                return;
            }
            this.f20336a.setText(c3239un.m7965i());
            this.f20341f = -2;
            this.f20339d.setOnItemSelectedListener(null);
            C3239un c3239un2 = this.f20344i;
            String str2 = "";
            if (c3239un2 != null) {
                str2 = c3239un2.m7965i();
                str = this.f20344i.m8001D();
            } else {
                str = "";
            }
            lo1<String[], String> m20601e = m20595k.m20601e(str2, str);
            if (m20601e.f17576a.length > 1) {
                this.f20339d.setVisibility(0);
                int m25904e = br1.m25904e(m20601e.f17576a, str);
                int length = m20601e.f17576a.length;
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = m20595k.getResources().getString(R.string.vis_customization_ver_x, m20601e.f17576a[i]);
                }
                this.f20339d.setAdapter((SpinnerAdapter) new ArrayAdapter(m20595k.getActivity(), 17367048, strArr));
                this.f20341f = m25904e;
                if (m25904e >= 0) {
                    this.f20339d.setSelection(m25904e, false);
                }
                m20595k.m20604b(this.f20339d);
                this.f20339d.setOnItemSelectedListener(this.f20340e);
            } else {
                this.f20339d.setVisibility(4);
            }
            this.f20338c.removeAllViews();
            this.f20343h.clear();
            Map<String, er0<String, Integer>> m7975d = c3239un.m7975d();
            for (String str3 : m7975d.keySet()) {
                View inflate = from.inflate(R.layout.dialog_customize_vis_element_group, (ViewGroup) null);
                ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.linearLayoutContent);
                TextView textView = (TextView) inflate.findViewById(R.id.groupTitle);
                View findViewById = inflate.findViewById(R.id.btnExpand);
                ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.groupHeader);
                if (m14938G(m20595k, from, c3239un, viewGroup, m7975d.get(str3).m23266q()) > 0) {
                    textView.setText(m14911y(str3, null, from.getContext()));
                    this.f20338c.addView(inflate);
                    viewGroup2.setOnClickListener(new View$OnClickListenerC2331d0(viewGroup, findViewById, str3));
                    Boolean bool = this.f20342g.get(str3);
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

    /* renamed from: I */
    public void m14936I(boolean z) {
        this.f20337b.setVisibility(z ? 8 : 0);
    }

    /* renamed from: e */
    public void m14931e(C3239un c3239un, String str, InterfaceC1153e0<Object> interfaceC1153e0) {
        this.f20343h.put(C3239un.m7971f(c3239un.m7963j(), str), interfaceC1153e0);
    }

    /* renamed from: f */
    public InterfaceC1153e0<Object> m14930f(List<String> list, String str) {
        if (list == null || str == null) {
            return null;
        }
        return this.f20343h.get(C3239un.m7971f(list, str));
    }

    /* renamed from: z */
    public boolean m14910z() {
        return this.f20336a != null;
    }
}

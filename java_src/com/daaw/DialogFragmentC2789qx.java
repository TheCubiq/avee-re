package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.daaw.C2120lv;
import com.daaw.avee.Common.VerticalSeekBar;
import com.daaw.avee.R;
import com.daaw.qw1;
import com.triggertrap.seekarc.SeekArc;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
/* renamed from: com.daaw.qx */
/* loaded from: classes.dex */
public class DialogFragmentC2789qx extends DialogFragment {

    /* renamed from: K */
    public static qw1<C2895rx> f24569K = new qw1<>();

    /* renamed from: L */
    public static rw1<C2988sx, C2895rx> f24570L = new rw1<>();

    /* renamed from: M */
    public static vw1<C2895rx> f24571M = new vw1<>();

    /* renamed from: N */
    public static int f24572N = 30;

    /* renamed from: A */
    public TextView f24573A;

    /* renamed from: B */
    public SeekBar f24574B;

    /* renamed from: G */
    public float f24579G;

    /* renamed from: H */
    public float f24580H;

    /* renamed from: q */
    public SwitchCompat f24584q;

    /* renamed from: r */
    public Spinner f24585r;

    /* renamed from: s */
    public ScrollView f24586s;

    /* renamed from: t */
    public HorizontalScrollView f24587t;

    /* renamed from: u */
    public ViewGroup f24588u;

    /* renamed from: v */
    public VerticalSeekBar[] f24589v;

    /* renamed from: w */
    public TextView[] f24590w;

    /* renamed from: x */
    public SeekArc f24591x;

    /* renamed from: y */
    public SeekArc f24592y;

    /* renamed from: z */
    public TextView f24593z;

    /* renamed from: p */
    public List<Object> f24583p = new LinkedList();

    /* renamed from: C */
    public boolean f24575C = false;

    /* renamed from: D */
    public C2895rx f24576D = null;

    /* renamed from: E */
    public int f24577E = 30;

    /* renamed from: F */
    public C2120lv f24578F = C2120lv.m16498a(C2120lv.f17807c);

    /* renamed from: I */
    public boolean f24581I = false;

    /* renamed from: J */
    public View.OnTouchListener f24582J = new View$OnTouchListenerC2790a();

    /* renamed from: com.daaw.qx$a */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC2790a implements View.OnTouchListener {
        public View$OnTouchListenerC2790a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                DialogFragmentC2789qx.this.f24586s.requestDisallowInterceptTouchEvent(true);
                DialogFragmentC2789qx.this.f24587t.requestDisallowInterceptTouchEvent(true);
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: com.daaw.qx$b */
    /* loaded from: classes.dex */
    public class C2791b implements CompoundButton.OnCheckedChangeListener {
        public C2791b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            DialogFragmentC2789qx.this.m11979v();
        }
    }

    /* renamed from: com.daaw.qx$c */
    /* loaded from: classes.dex */
    public class C2792c implements SeekArc.InterfaceC4185a {
        public C2792c() {
        }

        @Override // com.triggertrap.seekarc.SeekArc.InterfaceC4185a
        /* renamed from: a */
        public void mo2a(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.InterfaceC4185a
        /* renamed from: b */
        public void mo1b(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.InterfaceC4185a
        /* renamed from: c */
        public void mo0c(SeekArc seekArc, int i, boolean z) {
            if (z) {
                DialogFragmentC2789qx.this.f24585r.setSelection(0, false);
                DialogFragmentC2789qx.this.f24579G = (i - (DialogFragmentC2789qx.f24572N / 2)) / (DialogFragmentC2789qx.f24572N / 2.0f);
                DialogFragmentC2789qx dialogFragmentC2789qx = DialogFragmentC2789qx.this;
                dialogFragmentC2789qx.m11980u(dialogFragmentC2789qx.f24579G, DialogFragmentC2789qx.this.f24580H, true, true);
                DialogFragmentC2789qx.this.m11979v();
            }
        }
    }

    /* renamed from: com.daaw.qx$d */
    /* loaded from: classes.dex */
    public class C2793d implements SeekArc.InterfaceC4185a {
        public C2793d() {
        }

        @Override // com.triggertrap.seekarc.SeekArc.InterfaceC4185a
        /* renamed from: a */
        public void mo2a(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.InterfaceC4185a
        /* renamed from: b */
        public void mo1b(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.InterfaceC4185a
        /* renamed from: c */
        public void mo0c(SeekArc seekArc, int i, boolean z) {
            if (z) {
                DialogFragmentC2789qx.this.f24585r.setSelection(0, false);
                DialogFragmentC2789qx.this.f24580H = (i - (DialogFragmentC2789qx.f24572N / 2)) / (DialogFragmentC2789qx.f24572N / 2.0f);
                DialogFragmentC2789qx dialogFragmentC2789qx = DialogFragmentC2789qx.this;
                dialogFragmentC2789qx.m11980u(dialogFragmentC2789qx.f24579G, DialogFragmentC2789qx.this.f24580H, true, true);
                DialogFragmentC2789qx.this.m11979v();
            }
        }
    }

    /* renamed from: com.daaw.qx$e */
    /* loaded from: classes.dex */
    public class C2794e implements SeekBar.OnSeekBarChangeListener {
        public C2794e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            DialogFragmentC2789qx.this.m11978w(i / 100.0f, true);
            DialogFragmentC2789qx.this.m11979v();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.daaw.qx$f */
    /* loaded from: classes.dex */
    public class C2795f implements qw1.InterfaceC2788a<C2895rx> {
        public C2795f() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C2895rx c2895rx) {
            DialogFragmentC2789qx.this.m12001A(c2895rx);
        }
    }

    /* renamed from: com.daaw.qx$g */
    /* loaded from: classes.dex */
    public class C2796g implements AdapterView.OnItemSelectedListener {
        public C2796g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i - 1;
            if (i2 >= 0 && i2 < DialogFragmentC2789qx.this.f24576D.f25682e.length) {
                C2650px.m12962c(DialogFragmentC2789qx.this.f24576D.f25682e[i2], DialogFragmentC2789qx.this.f24578F);
                DialogFragmentC2789qx.this.m11980u(0.0f, 0.0f, false, true);
            }
            DialogFragmentC2789qx.this.m11979v();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.daaw.qx$h */
    /* loaded from: classes.dex */
    public class C2797h implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ int f24601a;

        public C2797h(int i) {
            this.f24601a = i;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                DialogFragmentC2789qx.this.f24585r.setSelection(0, false);
                DialogFragmentC2789qx dialogFragmentC2789qx = DialogFragmentC2789qx.this;
                dialogFragmentC2789qx.m11977x(this.f24601a, i - (dialogFragmentC2789qx.f24577E / 2), true);
                DialogFragmentC2789qx dialogFragmentC2789qx2 = DialogFragmentC2789qx.this;
                dialogFragmentC2789qx2.m11975z(dialogFragmentC2789qx2.f24578F);
                DialogFragmentC2789qx.this.m11980u(0.0f, 0.0f, false, false);
                DialogFragmentC2789qx.this.m11979v();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: q */
    public static DialogFragmentC2789qx m11984q(C0645al c0645al) {
        DialogFragmentC2789qx dialogFragmentC2789qx = new DialogFragmentC2789qx();
        gr1.m21311x(dialogFragmentC2789qx, "EqualizerDialog", c0645al);
        return dialogFragmentC2789qx;
    }

    /* renamed from: r */
    public static String m11983r(float f) {
        return m11982s((int) (f * 1000.0f));
    }

    /* renamed from: s */
    public static String m11982s(int i) {
        if (i < 1000) {
            return String.format(Locale.US, "%.1fHz", Float.valueOf(i * 0.001f));
        }
        if (i < 1000000) {
            return "" + (i / 1000) + "Hz";
        }
        return String.format(Locale.US, "%.1fkHz", Float.valueOf(i * 1.0E-6f));
    }

    /* renamed from: A */
    public final void m12001A(C2895rx c2895rx) {
        if (getActivity() != null && m11981t()) {
            this.f24581I = true;
            if (c2895rx == null) {
                c2895rx = C2895rx.f25677k;
            }
            this.f24576D = c2895rx;
            this.f24584q.setChecked(c2895rx.f25680c);
            this.f24578F = C2120lv.m16498a(this.f24576D.f25679b);
            C2895rx c2895rx2 = this.f24576D;
            int length = c2895rx2.f25679b.f17809b.length;
            int i = this.f24577E;
            if (i % 2 != 0) {
                this.f24577E = i + 1;
            }
            this.f24575C = false;
            int length2 = c2895rx2.f25682e.length + 1;
            String[] strArr = new String[length2];
            strArr[0] = getResources().getString(R.string.audio_eqcustom);
            int i2 = 0;
            while (true) {
                C2120lv[] c2120lvArr = this.f24576D.f25682e;
                if (i2 >= c2120lvArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                strArr[i3] = c2120lvArr[i2].f17808a;
                i2 = i3;
            }
            this.f24585r.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), 17367048, strArr));
            int i4 = this.f24576D.f25681d;
            int i5 = i4 >= 0 ? i4 + 1 : 0;
            this.f24585r.setSelection((i5 < 0 || i5 >= length2) ? 0 : 0, false);
            this.f24585r.setOnItemSelectedListener(new C2796g());
            this.f24575C = true;
            this.f24589v = new VerticalSeekBar[length];
            this.f24590w = new TextView[length];
            this.f24588u.removeAllViews();
            for (int i6 = 0; i6 < length; i6++) {
                View inflate = View.inflate(getActivity(), R.layout.dialog_equalizer_bar, null);
                this.f24589v[i6] = (VerticalSeekBar) inflate.findViewById(R.id.seekBarVolume);
                this.f24590w[i6] = (TextView) inflate.findViewById(R.id.txtBarTop);
                ((TextView) inflate.findViewById(R.id.txtBarBottom)).setText(m11983r(this.f24576D.f25679b.f17809b[i6].f17810a));
                this.f24589v[i6].setMax(this.f24577E);
                this.f24589v[i6].setOnTouchListener(this.f24582J);
                this.f24589v[i6].setOnSeekBarChangeFromUserListener(new C2797h(i6));
                this.f24588u.addView(inflate);
            }
            C2895rx c2895rx3 = this.f24576D;
            m11980u(c2895rx3.f25683f, c2895rx3.f25685h, false, true);
            m11978w(this.f24576D.f25687j, false);
            this.f24581I = false;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f24569K.m12017b(new C2795f(), this.f24583p);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_equalizer, null);
        builder.setView(inflate);
        SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.switchEnable);
        this.f24584q = switchCompat;
        switchCompat.setOnCheckedChangeListener(new C2791b());
        this.f24585r = (Spinner) inflate.findViewById(R.id.spinnerPresets);
        this.f24586s = (ScrollView) inflate.findViewById(R.id.scrollView1);
        this.f24587t = (HorizontalScrollView) inflate.findViewById(R.id.scrollView2);
        this.f24588u = (ViewGroup) inflate.findViewById(R.id.linearLayoutBars);
        this.f24593z = (TextView) inflate.findViewById(R.id.textBass);
        SeekArc seekArc = (SeekArc) inflate.findViewById(R.id.seekArcBass);
        this.f24591x = seekArc;
        seekArc.setOnTouchListener(this.f24582J);
        this.f24591x.setOnSeekArcChangeListener(new C2792c());
        this.f24573A = (TextView) inflate.findViewById(R.id.textTreble);
        SeekArc seekArc2 = (SeekArc) inflate.findViewById(R.id.seekArcTreble);
        this.f24592y = seekArc2;
        seekArc2.setOnTouchListener(this.f24582J);
        this.f24592y.setOnSeekArcChangeListener(new C2793d());
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.seekBarVirtualizer);
        this.f24574B = seekBar;
        seekBar.setMax(100);
        this.f24574B.setOnTouchListener(this.f24582J);
        this.f24574B.setOnSeekBarChangeListener(new C2794e());
        AlertDialog create = builder.create();
        create.setCancelable(true);
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        f24569K.m12016c(this.f24583p);
        this.f24583p.clear();
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        m12001A(f24571M.m6692a(null));
    }

    /* renamed from: t */
    public boolean m11981t() {
        return this.f24584q != null;
    }

    /* renamed from: u */
    public final void m11980u(float f, float f2, boolean z, boolean z2) {
        this.f24579G = f;
        this.f24580H = f2;
        if (!z) {
            this.f24591x.setProgress(Math.round((f24572N / 2) * f) + (f24572N / 2));
            this.f24592y.setProgress(Math.round((f24572N / 2) * f2) + (f24572N / 2));
        }
        int round = Math.round((f24572N / 2) * f);
        TextView textView = this.f24593z;
        textView.setText(textView.getResources().getQuantityString(R.plurals.audio_bass_x, round, Integer.valueOf(round)));
        int round2 = Math.round((f24572N / 2) * f2);
        TextView textView2 = this.f24573A;
        textView2.setText(textView2.getResources().getQuantityString(R.plurals.audio_treble_x, round2, Integer.valueOf(round2)));
        C2120lv.C2121a[] c2121aArr = this.f24578F.f17809b;
        float[] fArr = new float[c2121aArr.length];
        int length = c2121aArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = this.f24578F.f17809b[i].f17810a;
        }
        if (z2) {
            C2120lv c2120lv = this.f24578F;
            C2895rx c2895rx = this.f24576D;
            C2650px.m12963b(c2120lv, c2895rx.f25684g, c2895rx.f25686i, f, f2, fArr, fArr2);
            m11976y(fArr);
        }
    }

    /* renamed from: v */
    public final void m11979v() {
        VerticalSeekBar[] verticalSeekBarArr;
        C2895rx c2895rx;
        if (this.f24581I || (verticalSeekBarArr = this.f24589v) == null || (c2895rx = this.f24576D) == null) {
            return;
        }
        if (verticalSeekBarArr.length != c2895rx.f25679b.f17809b.length) {
            lz1.m16363c("equalizerUIDesc bands count doesnt match ");
            return;
        }
        C2988sx c2988sx = new C2988sx();
        c2988sx.f26727a = this.f24584q.isChecked();
        c2988sx.f26728b = this.f24585r.getSelectedItemPosition() - 1;
        c2988sx.f26732f = new C2120lv("Default", this.f24589v.length);
        c2988sx.f26730d = this.f24579G;
        c2988sx.f26731e = this.f24580H;
        c2988sx.f26729c = this.f24578F;
        c2988sx.f26733g = this.f24574B.getProgress() / this.f24574B.getMax();
        m11975z(c2988sx.f26732f);
        f24570L.m10862a(c2988sx, this.f24576D);
    }

    /* renamed from: w */
    public final void m11978w(float f, boolean z) {
        if (z) {
            return;
        }
        this.f24574B.setProgress((int) (f * 100.0f));
    }

    /* renamed from: x */
    public final void m11977x(int i, int i2, boolean z) {
        int i3 = this.f24577E;
        int m25898k = br1.m25898k(i2, -(i3 / 2), i3 / 2);
        if (!z) {
            this.f24589v[i].setProgress((this.f24577E / 2) + m25898k);
            this.f24589v[i].m26952a();
        }
        TextView textView = this.f24590w[i];
        textView.setText("" + m25898k);
    }

    /* renamed from: y */
    public final void m11976y(float[] fArr) {
        if (fArr.length != this.f24589v.length) {
            return;
        }
        for (int i = 0; i < fArr.length; i++) {
            m11977x(i, Math.round((this.f24577E / 2) * fArr[i]), false);
        }
    }

    /* renamed from: z */
    public void m11975z(C2120lv c2120lv) {
        VerticalSeekBar[] verticalSeekBarArr = this.f24589v;
        int i = 0;
        int max = (verticalSeekBarArr.length > 0 ? verticalSeekBarArr[0].getMax() : 2) / 2;
        int length = c2120lv.f17809b.length;
        VerticalSeekBar[] verticalSeekBarArr2 = this.f24589v;
        if (length != verticalSeekBarArr2.length) {
            c2120lv.m16495d(verticalSeekBarArr2.length);
        }
        while (true) {
            VerticalSeekBar[] verticalSeekBarArr3 = this.f24589v;
            if (i >= verticalSeekBarArr3.length) {
                return;
            }
            c2120lv.f17809b[i] = new C2120lv.C2121a(this.f24576D.f25679b.f17809b[i].f17810a, (verticalSeekBarArr3[i].getProgress() - max) / max);
            i++;
        }
    }
}

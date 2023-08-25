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
import com.daaw.avee.Common.VerticalSeekBar;
import com.daaw.avee.R;
import com.daaw.lv;
import com.daaw.qw1;
import com.triggertrap.seekarc.SeekArc;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class qx extends DialogFragment {
    public static qw1<rx> K = new qw1<>();
    public static rw1<sx, rx> L = new rw1<>();
    public static vw1<rx> M = new vw1<>();
    public static int N = 30;
    public TextView A;
    public SeekBar B;
    public float G;
    public float H;
    public SwitchCompat q;
    public Spinner r;
    public ScrollView s;
    public HorizontalScrollView t;
    public ViewGroup u;
    public VerticalSeekBar[] v;
    public TextView[] w;
    public SeekArc x;
    public SeekArc y;
    public TextView z;
    public List<Object> p = new LinkedList();
    public boolean C = false;
    public rx D = null;
    public int E = 30;
    public lv F = lv.a(lv.c);
    public boolean I = false;
    public View.OnTouchListener J = new a();

    /* loaded from: classes.dex */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                qx.this.s.requestDisallowInterceptTouchEvent(true);
                qx.this.t.requestDisallowInterceptTouchEvent(true);
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            qx.this.v();
        }
    }

    /* loaded from: classes.dex */
    public class c implements SeekArc.a {
        public c() {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void a(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void b(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void c(SeekArc seekArc, int i, boolean z) {
            if (z) {
                qx.this.r.setSelection(0, false);
                qx.this.G = (i - (qx.N / 2)) / (qx.N / 2.0f);
                qx qxVar = qx.this;
                qxVar.u(qxVar.G, qx.this.H, true, true);
                qx.this.v();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements SeekArc.a {
        public d() {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void a(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void b(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void c(SeekArc seekArc, int i, boolean z) {
            if (z) {
                qx.this.r.setSelection(0, false);
                qx.this.H = (i - (qx.N / 2)) / (qx.N / 2.0f);
                qx qxVar = qx.this;
                qxVar.u(qxVar.G, qx.this.H, true, true);
                qx.this.v();
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements SeekBar.OnSeekBarChangeListener {
        public e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            qx.this.w(i / 100.0f, true);
            qx.this.v();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: classes.dex */
    public class f implements qw1.a<rx> {
        public f() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(rx rxVar) {
            qx.this.A(rxVar);
        }
    }

    /* loaded from: classes.dex */
    public class g implements AdapterView.OnItemSelectedListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i - 1;
            if (i2 >= 0 && i2 < qx.this.D.e.length) {
                px.c(qx.this.D.e[i2], qx.this.F);
                qx.this.u(0.0f, 0.0f, false, true);
            }
            qx.this.v();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class h implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ int a;

        public h(int i) {
            this.a = i;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                qx.this.r.setSelection(0, false);
                qx qxVar = qx.this;
                qxVar.x(this.a, i - (qxVar.E / 2), true);
                qx qxVar2 = qx.this;
                qxVar2.z(qxVar2.F);
                qx.this.u(0.0f, 0.0f, false, false);
                qx.this.v();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public static qx q(al alVar) {
        qx qxVar = new qx();
        gr1.x(qxVar, "EqualizerDialog", alVar);
        return qxVar;
    }

    public static String r(float f2) {
        return s((int) (f2 * 1000.0f));
    }

    public static String s(int i) {
        if (i < 1000) {
            return String.format(Locale.US, "%.1fHz", Float.valueOf(i * 0.001f));
        }
        if (i < 1000000) {
            return "" + (i / 1000) + "Hz";
        }
        return String.format(Locale.US, "%.1fkHz", Float.valueOf(i * 1.0E-6f));
    }

    public final void A(rx rxVar) {
        if (getActivity() != null && t()) {
            this.I = true;
            if (rxVar == null) {
                rxVar = rx.k;
            }
            this.D = rxVar;
            this.q.setChecked(rxVar.c);
            this.F = lv.a(this.D.b);
            rx rxVar2 = this.D;
            int length = rxVar2.b.b.length;
            int i = this.E;
            if (i % 2 != 0) {
                this.E = i + 1;
            }
            this.C = false;
            int length2 = rxVar2.e.length + 1;
            String[] strArr = new String[length2];
            strArr[0] = getResources().getString(R.string.audio_eqcustom);
            int i2 = 0;
            while (true) {
                lv[] lvVarArr = this.D.e;
                if (i2 >= lvVarArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                strArr[i3] = lvVarArr[i2].a;
                i2 = i3;
            }
            this.r.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), 17367048, strArr));
            int i4 = this.D.d;
            int i5 = i4 >= 0 ? i4 + 1 : 0;
            this.r.setSelection((i5 < 0 || i5 >= length2) ? 0 : 0, false);
            this.r.setOnItemSelectedListener(new g());
            this.C = true;
            this.v = new VerticalSeekBar[length];
            this.w = new TextView[length];
            this.u.removeAllViews();
            for (int i6 = 0; i6 < length; i6++) {
                View inflate = View.inflate(getActivity(), R.layout.dialog_equalizer_bar, null);
                this.v[i6] = (VerticalSeekBar) inflate.findViewById(R.id.seekBarVolume);
                this.w[i6] = (TextView) inflate.findViewById(R.id.txtBarTop);
                ((TextView) inflate.findViewById(R.id.txtBarBottom)).setText(r(this.D.b.b[i6].a));
                this.v[i6].setMax(this.E);
                this.v[i6].setOnTouchListener(this.J);
                this.v[i6].setOnSeekBarChangeFromUserListener(new h(i6));
                this.u.addView(inflate);
            }
            rx rxVar3 = this.D;
            u(rxVar3.f, rxVar3.h, false, true);
            w(this.D.j, false);
            this.I = false;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        K.b(new f(), this.p);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_equalizer, null);
        builder.setView(inflate);
        SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.switchEnable);
        this.q = switchCompat;
        switchCompat.setOnCheckedChangeListener(new b());
        this.r = (Spinner) inflate.findViewById(R.id.spinnerPresets);
        this.s = (ScrollView) inflate.findViewById(R.id.scrollView1);
        this.t = (HorizontalScrollView) inflate.findViewById(R.id.scrollView2);
        this.u = (ViewGroup) inflate.findViewById(R.id.linearLayoutBars);
        this.z = (TextView) inflate.findViewById(R.id.textBass);
        SeekArc seekArc = (SeekArc) inflate.findViewById(R.id.seekArcBass);
        this.x = seekArc;
        seekArc.setOnTouchListener(this.J);
        this.x.setOnSeekArcChangeListener(new c());
        this.A = (TextView) inflate.findViewById(R.id.textTreble);
        SeekArc seekArc2 = (SeekArc) inflate.findViewById(R.id.seekArcTreble);
        this.y = seekArc2;
        seekArc2.setOnTouchListener(this.J);
        this.y.setOnSeekArcChangeListener(new d());
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.seekBarVirtualizer);
        this.B = seekBar;
        seekBar.setMax(100);
        this.B.setOnTouchListener(this.J);
        this.B.setOnSeekBarChangeListener(new e());
        AlertDialog create = builder.create();
        create.setCancelable(true);
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        K.c(this.p);
        this.p.clear();
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        A(M.a(null));
    }

    public boolean t() {
        return this.q != null;
    }

    public final void u(float f2, float f3, boolean z, boolean z2) {
        this.G = f2;
        this.H = f3;
        if (!z) {
            this.x.setProgress(Math.round((N / 2) * f2) + (N / 2));
            this.y.setProgress(Math.round((N / 2) * f3) + (N / 2));
        }
        int round = Math.round((N / 2) * f2);
        TextView textView = this.z;
        textView.setText(textView.getResources().getQuantityString(R.plurals.audio_bass_x, round, Integer.valueOf(round)));
        int round2 = Math.round((N / 2) * f3);
        TextView textView2 = this.A;
        textView2.setText(textView2.getResources().getQuantityString(R.plurals.audio_treble_x, round2, Integer.valueOf(round2)));
        lv.a[] aVarArr = this.F.b;
        float[] fArr = new float[aVarArr.length];
        int length = aVarArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = this.F.b[i].a;
        }
        if (z2) {
            lv lvVar = this.F;
            rx rxVar = this.D;
            px.b(lvVar, rxVar.g, rxVar.i, f2, f3, fArr, fArr2);
            y(fArr);
        }
    }

    public final void v() {
        VerticalSeekBar[] verticalSeekBarArr;
        rx rxVar;
        if (this.I || (verticalSeekBarArr = this.v) == null || (rxVar = this.D) == null) {
            return;
        }
        if (verticalSeekBarArr.length != rxVar.b.b.length) {
            lz1.c("equalizerUIDesc bands count doesnt match ");
            return;
        }
        sx sxVar = new sx();
        sxVar.a = this.q.isChecked();
        sxVar.b = this.r.getSelectedItemPosition() - 1;
        sxVar.f = new lv("Default", this.v.length);
        sxVar.d = this.G;
        sxVar.e = this.H;
        sxVar.c = this.F;
        sxVar.g = this.B.getProgress() / this.B.getMax();
        z(sxVar.f);
        L.a(sxVar, this.D);
    }

    public final void w(float f2, boolean z) {
        if (z) {
            return;
        }
        this.B.setProgress((int) (f2 * 100.0f));
    }

    public final void x(int i, int i2, boolean z) {
        int i3 = this.E;
        int k = br1.k(i2, -(i3 / 2), i3 / 2);
        if (!z) {
            this.v[i].setProgress((this.E / 2) + k);
            this.v[i].a();
        }
        TextView textView = this.w[i];
        textView.setText("" + k);
    }

    public final void y(float[] fArr) {
        if (fArr.length != this.v.length) {
            return;
        }
        for (int i = 0; i < fArr.length; i++) {
            x(i, Math.round((this.E / 2) * fArr[i]), false);
        }
    }

    public void z(lv lvVar) {
        VerticalSeekBar[] verticalSeekBarArr = this.v;
        int i = 0;
        int max = (verticalSeekBarArr.length > 0 ? verticalSeekBarArr[0].getMax() : 2) / 2;
        int length = lvVar.b.length;
        VerticalSeekBar[] verticalSeekBarArr2 = this.v;
        if (length != verticalSeekBarArr2.length) {
            lvVar.d(verticalSeekBarArr2.length);
        }
        while (true) {
            VerticalSeekBar[] verticalSeekBarArr3 = this.v;
            if (i >= verticalSeekBarArr3.length) {
                return;
            }
            lvVar.b[i] = new lv.a(this.D.b.b[i].a, (verticalSeekBarArr3[i].getProgress() - max) / max);
            i++;
        }
    }
}

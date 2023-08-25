package com.daaw;

import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class wv1 extends PopupWindow {
    public Handler a;
    public ImageButton b;
    public ImageButton c;
    public View d;
    public SeekBar e;
    public TextView f;
    public SeekBar g;
    public TextView h;
    public float i;
    public float j;
    public SeekBar k;
    public TextView l;
    public ImageButton m;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.Y.a();
            wv1.this.a.sendEmptyMessageDelayed(0, 900L);
        }
    }

    /* loaded from: classes.dex */
    public class c implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ lo1 a;

        public c(lo1 lo1Var) {
            this.a = lo1Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            wv1.this.h(i, ((Integer) this.a.b).intValue(), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            wv1.this.a.removeMessages(0);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            wv1.this.a.sendEmptyMessageDelayed(0, 900L);
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qw1<Boolean> qw1Var;
            Boolean bool;
            if (wv1.this.d.getVisibility() == 0) {
                wv1.this.l(false, false);
                qw1Var = ko0.X;
                bool = Boolean.FALSE;
            } else {
                wv1.this.l(true, false);
                qw1Var = ko0.X;
                bool = Boolean.TRUE;
            }
            qw1Var.a(bool);
        }
    }

    /* loaded from: classes.dex */
    public class e implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ lo1 a;

        public e(lo1 lo1Var) {
            this.a = lo1Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            wv1.this.g(i, ((Integer) this.a.b).intValue(), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: classes.dex */
    public class f implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ mo1 a;

        public f(mo1 mo1Var) {
            this.a = mo1Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            wv1.this.i(i, ((Integer) this.a.b).intValue(), ((Float) this.a.c).floatValue(), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wv1.this.a.sendEmptyMessageDelayed(0, 900L);
            ko0.Z.a(new al(view));
        }
    }

    public wv1(LayoutInflater layoutInflater, View view) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.a = new Handler(new a());
        View inflate = View.inflate(view.getContext(), R.layout.popup_media_controls_volume, null);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.btnVolumeMute);
        this.b = imageButton;
        imageButton.setOnClickListener(new b());
        this.k = (SeekBar) inflate.findViewById(R.id.seekBarVolume);
        this.l = (TextView) inflate.findViewById(R.id.txtVolume);
        lo1<Integer, Integer> a2 = ko0.P.a(new lo1<>(0, 0));
        h(a2.a.intValue(), a2.b.intValue(), false);
        this.k.setOnSeekBarChangeListener(new c(a2));
        vw1<Boolean> vw1Var = ko0.W;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = vw1Var.a(bool).booleanValue();
        this.d = inflate.findViewById(R.id.layoutExpandable);
        this.c = (ImageButton) inflate.findViewById(R.id.btnExpand);
        l(booleanValue, true);
        this.c.setOnClickListener(new d());
        this.e = (SeekBar) inflate.findViewById(R.id.seekBarVolumeBalance);
        this.f = (TextView) inflate.findViewById(R.id.txtVolumeBalanceStatus);
        lo1<Integer, Integer> a3 = ko0.Q.a(new lo1<>(0, 0));
        g(a3.a.intValue(), a3.b.intValue(), false);
        this.e.setOnSeekBarChangeListener(new e(a3));
        this.g = (SeekBar) inflate.findViewById(R.id.seekBarCrossfade);
        this.h = (TextView) inflate.findViewById(R.id.txtCrossfadeStatus);
        this.i = layoutInflater.getContext().getResources().getDimensionPixelSize(R.dimen.textSizeM3);
        this.j = this.h.getTextSize();
        mo1<Integer, Integer, Float> a4 = ko0.S.a(new mo1<>(0, 0, Float.valueOf(1.0f)));
        i(a4.a.intValue(), a4.b.intValue(), a4.c.floatValue(), false);
        this.g.setOnSeekBarChangeListener(new f(a4));
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.btnEq);
        this.m = imageButton2;
        imageButton2.setOnClickListener(new g());
        setContentView(inflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        k(ko0.F.a(bool).booleanValue(), ko0.G.a(bool).booleanValue());
        j(ko0.a0.a(bool).booleanValue());
        Point point = new Point();
        view.getLocationInWindow(r9);
        view.getDisplay().getRealSize(point);
        int[] iArr = {0, point.y - iArr[1]};
        showAtLocation(view, 8388691, iArr[0], iArr[1]);
    }

    public final void g(int i, int i2, boolean z) {
        int i3 = i2 / 2;
        int round = Math.round(((i - i3) / i3) * 100.0f);
        TextView textView = this.f;
        textView.setText(textView.getResources().getQuantityString(R.plurals.audio_stereo_balance_x, round, Integer.valueOf(round)));
        if (z) {
            ko0.U.a(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        this.e.setMax(i2);
        this.e.setProgress(i);
    }

    public final void h(int i, int i2, boolean z) {
        int round = Math.round((i / i2) * 100.0f);
        TextView textView = this.l;
        textView.setText(textView.getResources().getQuantityString(R.plurals.audio_volume_x, round, Integer.valueOf(round)));
        if (z) {
            ko0.T.a(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        this.k.setMax(i2);
        this.k.setProgress(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r7, int r8, float r9, boolean r10) {
        /*
            r6 = this;
            if (r7 != 0) goto Lb
            android.widget.TextView r9 = r6.h
            r0 = 2131755493(0x7f1001e5, float:1.9141867E38)
        L7:
            r9.setText(r0)
            goto L33
        Lb:
            r0 = 1
            if (r7 != r0) goto L14
            android.widget.TextView r9 = r6.h
            r0 = 2131755494(0x7f1001e6, float:1.9141869E38)
            goto L7
        L14:
            int r1 = r7 + (-1)
            float r1 = (float) r1
            float r1 = r1 * r9
            android.widget.TextView r9 = r6.h
            android.content.res.Resources r2 = r9.getResources()
            r3 = 2131623942(0x7f0e0006, float:1.887505E38)
            int r4 = (int) r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0[r5] = r1
            java.lang.String r0 = r2.getQuantityString(r3, r4, r0)
            r9.setText(r0)
        L33:
            if (r10 != 0) goto L40
            android.widget.SeekBar r9 = r6.g
            r9.setMax(r8)
            android.widget.SeekBar r8 = r6.g
            r8.setProgress(r7)
            goto L4d
        L40:
            com.daaw.rw1<java.lang.Integer, java.lang.Integer> r9 = com.daaw.ko0.V
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.a(r7, r8)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.wv1.i(int, int, float, boolean):void");
    }

    public void j(boolean z) {
        ImageButton imageButton;
        ImageButton imageButton2;
        int i;
        if (z) {
            imageButton = this.m;
            imageButton2 = this.b;
            i = R.attr.mediaControlsHighLight;
        } else {
            imageButton = this.m;
            imageButton2 = this.b;
            i = R.attr.mediaControlsFG;
        }
        imageButton.setColorFilter(gr1.n(imageButton2, i));
    }

    public void k(boolean z, boolean z2) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.b;
            i = R.attr.mediaControlsHighLight;
        } else {
            imageButton = this.b;
            i = R.attr.mediaControlsFG;
        }
        imageButton.setColorFilter(gr1.n(imageButton, i));
    }

    public final void l(boolean z, boolean z2) {
        View view;
        int i;
        if (z) {
            ViewPropertyAnimator rotation = this.c.animate().rotation(90.0f);
            if (z2) {
                rotation.setDuration(0L);
            }
            view = this.d;
            i = 0;
        } else {
            ViewPropertyAnimator rotation2 = this.c.animate().rotation(0.0f);
            if (z2) {
                rotation2.setDuration(0L);
            }
            view = this.d;
            i = 8;
        }
        view.setVisibility(i);
    }
}

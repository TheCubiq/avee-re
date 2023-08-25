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

    /* renamed from: a */
    public Handler f31555a;

    /* renamed from: b */
    public ImageButton f31556b;

    /* renamed from: c */
    public ImageButton f31557c;

    /* renamed from: d */
    public View f31558d;

    /* renamed from: e */
    public SeekBar f31559e;

    /* renamed from: f */
    public TextView f31560f;

    /* renamed from: g */
    public SeekBar f31561g;

    /* renamed from: h */
    public TextView f31562h;

    /* renamed from: i */
    public float f31563i;

    /* renamed from: j */
    public float f31564j;

    /* renamed from: k */
    public SeekBar f31565k;

    /* renamed from: l */
    public TextView f31566l;

    /* renamed from: m */
    public ImageButton f31567m;

    /* renamed from: com.daaw.wv1$a */
    /* loaded from: classes.dex */
    public class C3468a implements Handler.Callback {
        public C3468a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            return false;
        }
    }

    /* renamed from: com.daaw.wv1$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3469b implements View.OnClickListener {
        public View$OnClickListenerC3469b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.f16519Y.m12990a();
            wv1.this.f31555a.sendEmptyMessageDelayed(0, 900L);
        }
    }

    /* renamed from: com.daaw.wv1$c */
    /* loaded from: classes.dex */
    public class C3470c implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ lo1 f31570a;

        public C3470c(lo1 lo1Var) {
            this.f31570a = lo1Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            wv1.this.m5769h(i, ((Integer) this.f31570a.f17577b).intValue(), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            wv1.this.f31555a.removeMessages(0);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            wv1.this.f31555a.sendEmptyMessageDelayed(0, 900L);
        }
    }

    /* renamed from: com.daaw.wv1$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3471d implements View.OnClickListener {
        public View$OnClickListenerC3471d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qw1<Boolean> qw1Var;
            Boolean bool;
            if (wv1.this.f31558d.getVisibility() == 0) {
                wv1.this.m5765l(false, false);
                qw1Var = ko0.f16518X;
                bool = Boolean.FALSE;
            } else {
                wv1.this.m5765l(true, false);
                qw1Var = ko0.f16518X;
                bool = Boolean.TRUE;
            }
            qw1Var.m12018a(bool);
        }
    }

    /* renamed from: com.daaw.wv1$e */
    /* loaded from: classes.dex */
    public class C3472e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ lo1 f31573a;

        public C3472e(lo1 lo1Var) {
            this.f31573a = lo1Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            wv1.this.m5770g(i, ((Integer) this.f31573a.f17577b).intValue(), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.daaw.wv1$f */
    /* loaded from: classes.dex */
    public class C3473f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ mo1 f31575a;

        public C3473f(mo1 mo1Var) {
            this.f31575a = mo1Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            wv1.this.m5768i(i, ((Integer) this.f31575a.f19023b).intValue(), ((Float) this.f31575a.f19024c).floatValue(), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.daaw.wv1$g */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3474g implements View.OnClickListener {
        public View$OnClickListenerC3474g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            wv1.this.f31555a.sendEmptyMessageDelayed(0, 900L);
            ko0.f16520Z.m12018a(new C0645al(view));
        }
    }

    public wv1(LayoutInflater layoutInflater, View view) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.f31555a = new Handler(new C3468a());
        View inflate = View.inflate(view.getContext(), R.layout.popup_media_controls_volume, null);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.btnVolumeMute);
        this.f31556b = imageButton;
        imageButton.setOnClickListener(new View$OnClickListenerC3469b());
        this.f31565k = (SeekBar) inflate.findViewById(R.id.seekBarVolume);
        this.f31566l = (TextView) inflate.findViewById(R.id.txtVolume);
        lo1<Integer, Integer> m6692a = ko0.f16510P.m6692a(new lo1<>(0, 0));
        m5769h(m6692a.f17576a.intValue(), m6692a.f17577b.intValue(), false);
        this.f31565k.setOnSeekBarChangeListener(new C3470c(m6692a));
        vw1<Boolean> vw1Var = ko0.f16517W;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = vw1Var.m6692a(bool).booleanValue();
        this.f31558d = inflate.findViewById(R.id.layoutExpandable);
        this.f31557c = (ImageButton) inflate.findViewById(R.id.btnExpand);
        m5765l(booleanValue, true);
        this.f31557c.setOnClickListener(new View$OnClickListenerC3471d());
        this.f31559e = (SeekBar) inflate.findViewById(R.id.seekBarVolumeBalance);
        this.f31560f = (TextView) inflate.findViewById(R.id.txtVolumeBalanceStatus);
        lo1<Integer, Integer> m6692a2 = ko0.f16511Q.m6692a(new lo1<>(0, 0));
        m5770g(m6692a2.f17576a.intValue(), m6692a2.f17577b.intValue(), false);
        this.f31559e.setOnSeekBarChangeListener(new C3472e(m6692a2));
        this.f31561g = (SeekBar) inflate.findViewById(R.id.seekBarCrossfade);
        this.f31562h = (TextView) inflate.findViewById(R.id.txtCrossfadeStatus);
        this.f31563i = layoutInflater.getContext().getResources().getDimensionPixelSize(R.dimen.textSizeM3);
        this.f31564j = this.f31562h.getTextSize();
        mo1<Integer, Integer, Float> m6692a3 = ko0.f16513S.m6692a(new mo1<>(0, 0, Float.valueOf(1.0f)));
        m5768i(m6692a3.f19022a.intValue(), m6692a3.f19023b.intValue(), m6692a3.f19024c.floatValue(), false);
        this.f31561g.setOnSeekBarChangeListener(new C3473f(m6692a3));
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.btnEq);
        this.f31567m = imageButton2;
        imageButton2.setOnClickListener(new View$OnClickListenerC3474g());
        setContentView(inflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        m5766k(ko0.f16500F.m6692a(bool).booleanValue(), ko0.f16501G.m6692a(bool).booleanValue());
        m5767j(ko0.f16521a0.m6692a(bool).booleanValue());
        Point point = new Point();
        view.getLocationInWindow(r9);
        view.getDisplay().getRealSize(point);
        int[] iArr = {0, point.y - iArr[1]};
        showAtLocation(view, 8388691, iArr[0], iArr[1]);
    }

    /* renamed from: g */
    public final void m5770g(int i, int i2, boolean z) {
        int i3 = i2 / 2;
        int round = Math.round(((i - i3) / i3) * 100.0f);
        TextView textView = this.f31560f;
        textView.setText(textView.getResources().getQuantityString(R.plurals.audio_stereo_balance_x, round, Integer.valueOf(round)));
        if (z) {
            ko0.f16515U.m10862a(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        this.f31559e.setMax(i2);
        this.f31559e.setProgress(i);
    }

    /* renamed from: h */
    public final void m5769h(int i, int i2, boolean z) {
        int round = Math.round((i / i2) * 100.0f);
        TextView textView = this.f31566l;
        textView.setText(textView.getResources().getQuantityString(R.plurals.audio_volume_x, round, Integer.valueOf(round)));
        if (z) {
            ko0.f16514T.m10862a(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        this.f31565k.setMax(i2);
        this.f31565k.setProgress(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5768i(int i, int i2, float f, boolean z) {
        TextView textView;
        int i3;
        if (i == 0) {
            textView = this.f31562h;
            i3 = R.string.playback_crossfade_off;
        } else if (i != 1) {
            float f2 = (i - 1) * f;
            TextView textView2 = this.f31562h;
            textView2.setText(textView2.getResources().getQuantityString(R.plurals.playback_crossFade_x_sec, (int) f2, Float.valueOf(f2)));
            if (!z) {
                ko0.f16516V.m10862a(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            this.f31561g.setMax(i2);
            this.f31561g.setProgress(i);
            return;
        } else {
            textView = this.f31562h;
            i3 = R.string.playback_gapless;
        }
        textView.setText(i3);
        if (!z) {
        }
    }

    /* renamed from: j */
    public void m5767j(boolean z) {
        ImageButton imageButton;
        ImageButton imageButton2;
        int i;
        if (z) {
            imageButton = this.f31567m;
            imageButton2 = this.f31556b;
            i = R.attr.mediaControlsHighLight;
        } else {
            imageButton = this.f31567m;
            imageButton2 = this.f31556b;
            i = R.attr.mediaControlsFG;
        }
        imageButton.setColorFilter(gr1.m21321n(imageButton2, i));
    }

    /* renamed from: k */
    public void m5766k(boolean z, boolean z2) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.f31556b;
            i = R.attr.mediaControlsHighLight;
        } else {
            imageButton = this.f31556b;
            i = R.attr.mediaControlsFG;
        }
        imageButton.setColorFilter(gr1.m21321n(imageButton, i));
    }

    /* renamed from: l */
    public final void m5765l(boolean z, boolean z2) {
        View view;
        int i;
        if (z) {
            ViewPropertyAnimator rotation = this.f31557c.animate().rotation(90.0f);
            if (z2) {
                rotation.setDuration(0L);
            }
            view = this.f31558d;
            i = 0;
        } else {
            ViewPropertyAnimator rotation2 = this.f31557c.animate().rotation(0.0f);
            if (z2) {
                rotation2.setDuration(0L);
            }
            view = this.f31558d;
            i = 8;
        }
        view.setVisibility(i);
    }
}

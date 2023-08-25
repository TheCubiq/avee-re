package com.daaw;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.tx0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class ko0 {
    public static vw1<Boolean> F = new vw1<>();
    public static vw1<Boolean> G = new vw1<>();
    public static vw1<Integer> H = new vw1<>();
    public static pw1 I = new pw1();
    public static pw1 J = new pw1();
    public static pw1 K = new pw1();
    public static vw1<Long> L = new vw1<>();
    public static vw1<lo1<tx0.b, hx0>> M = new vw1<>();
    public static vw1<lo1<Boolean, Boolean>> N = new vw1<>();
    public static qw1<Long> O = new qw1<>();
    public static vw1<lo1<Integer, Integer>> P = new vw1<>();
    public static vw1<lo1<Integer, Integer>> Q = new vw1<>();
    public static vw1<lo1<Integer, Integer>> R = new vw1<>();
    public static vw1<mo1<Integer, Integer, Float>> S = new vw1<>();
    public static rw1<Integer, Integer> T = new rw1<>();
    public static rw1<Integer, Integer> U = new rw1<>();
    public static rw1<Integer, Integer> V = new rw1<>();
    public static vw1<Boolean> W = new vw1<>();
    public static qw1<Boolean> X = new qw1<>();
    public static pw1 Y = new pw1();
    public static qw1<al> Z = new qw1<>();
    public static vw1<Boolean> a0 = new vw1<>();
    public static vw1<Integer> b0 = new vw1<>();
    public static qw1<Integer> c0 = new qw1<>();
    public static vw1<Integer> d0 = new vw1<>();
    public static qw1<Integer> e0 = new qw1<>();
    public static vw1<Integer> f0 = new vw1<>();
    public static qw1<Integer> g0 = new qw1<>();
    public static qw1<al> h0 = new qw1<>();
    public static vw1<Integer> i0 = new vw1<>();
    public static pw1 j0 = new pw1();
    public static pw1 k0 = new pw1();
    public static final Object l0 = new Object();
    public static ko0 m0 = null;
    public RotateAnimation A;
    public RotateAnimation B;
    public final Handler a;
    public ImageButton d;
    public ImageButton e;
    public ImageButton f;
    public ImageView g;
    public TextView h;
    public TextView i;
    public SeekBar j;
    public TextView k;
    public TextView l;
    public TextView m;
    public ImageView n;
    public ImageButton o;
    public ImageButton p;
    public SeekBar q;
    public TextView r;
    public long u;
    public float w;
    public View x;
    public View y;
    public View z;
    public WeakReference<wv1> b = new WeakReference<>(null);
    public WeakReference<gl1> c = new WeakReference<>(null);
    public long s = 1000;
    public long t = -1;
    public int v = -1;
    public Runnable C = new a();
    public Runnable D = new b();
    public SeekBar.OnSeekBarChangeListener E = new c();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ko0.this.x.setVisibility(4);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ko0.this.z != null) {
                ko0.this.z.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements SeekBar.OnSeekBarChangeListener {
        public c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                ko0 ko0Var = ko0.this;
                ko0Var.t = (ko0Var.s * i) / 1000;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - ko0.this.u > 250) {
                    ko0.this.u = elapsedRealtime;
                    ko0.O.a(Long.valueOf(ko0.this.t));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ko0.this.u = 0L;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ko0.O.a(Long.valueOf(ko0.this.t));
            ko0.this.t = -1L;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Handler.Callback {
        public d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ko0.this.C(ko0.this.D());
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LayoutInflater d = new al(view).d();
            gr1.k((wv1) ko0.this.b.get());
            ko0.this.b = new WeakReference(new wv1(d, view));
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            gr1.k((gl1) ko0.this.c.get());
            ko0.this.c = new WeakReference(new gl1(view));
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.K.a();
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.K.a();
        }
    }

    public ko0() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.A = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.A.setDuration(6000L);
        this.A.setRepeatCount(-1);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.B = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.B.setDuration(6000L);
        this.B.setRepeatCount(-1);
        this.a = new Handler(new d());
    }

    public static ko0 q() {
        ko0 ko0Var;
        ko0 ko0Var2 = m0;
        if (ko0Var2 != null) {
            return ko0Var2;
        }
        synchronized (l0) {
            if (m0 == null) {
                m0 = new ko0();
            }
            ko0Var = m0;
        }
        return ko0Var;
    }

    public static /* synthetic */ void s(View view) {
        I.a();
    }

    public static /* synthetic */ void t(View view) {
        J.a();
    }

    public void A(boolean z) {
        if (r()) {
            B(z, G.a(Boolean.FALSE).booleanValue());
        }
    }

    public final void B(boolean z, boolean z2) {
        wv1 wv1Var = this.b.get();
        if (wv1Var != null && wv1Var.isShowing()) {
            wv1Var.k(z, z2);
        }
        E(z, z2);
    }

    public final void C(long j) {
        Message obtainMessage = this.a.obtainMessage(1);
        this.a.removeMessages(1);
        this.a.sendMessageDelayed(obtainMessage, j);
    }

    public final long D() {
        long longValue = L.a(-1L).longValue();
        vw1<lo1<Boolean, Boolean>> vw1Var = N;
        Boolean bool = Boolean.FALSE;
        lo1<Boolean, Boolean> a2 = vw1Var.a(new lo1<>(bool, bool));
        if (longValue < 0) {
            return 500L;
        }
        try {
            long j = this.t;
            if (j >= 0) {
                longValue = j;
            }
            if (longValue < 0 || this.s < 0) {
                this.h.setText("--:--");
                this.j.setProgress(1000);
                SeekBar seekBar = this.q;
                if (seekBar != null) {
                    seekBar.setProgress(1000);
                }
            } else {
                this.h.setText(br1.o((int) (longValue / 1000)));
                int i = (int) ((longValue * 1000) / this.s);
                this.j.setProgress(i);
                SeekBar seekBar2 = this.q;
                if (seekBar2 != null) {
                    seekBar2.setProgress(i);
                }
                int i2 = 0;
                if (!a2.a.booleanValue()) {
                    int visibility = this.h.getVisibility();
                    TextView textView = this.h;
                    if (visibility != 4) {
                        i2 = 4;
                    }
                    textView.setVisibility(i2);
                    return 500L;
                }
                this.h.setVisibility(0);
            }
            long j2 = 1000 - (longValue % 1000);
            int width = this.j.getWidth();
            if (width == 0) {
                width = 320;
            }
            long j3 = this.s / width;
            if (j3 > j2) {
                return j2;
            }
            if (j3 < 20) {
                return 20L;
            }
            return j3;
        } catch (Exception unused) {
            return 500L;
        }
    }

    public final void E(boolean z, boolean z2) {
        int i;
        ImageButton imageButton;
        int n = gr1.n(this.e, R.attr.mediaControlsFG);
        if (z) {
            int n2 = gr1.n(this.e, R.attr.mediaControlsHighLight);
            this.e.setImageResource(R.drawable.ic_mute_s);
            this.e.setColorFilter(n2);
            ImageButton imageButton2 = this.p;
            if (imageButton2 != null) {
                imageButton2.setImageResource(R.drawable.ic_mute_s);
                this.p.setColorFilter(n2);
                return;
            }
            return;
        }
        ImageButton imageButton3 = this.e;
        if (z2) {
            i = R.drawable.ic_speaker_asterisk_s;
            imageButton3.setImageResource(R.drawable.ic_speaker_asterisk_s);
            this.e.setColorFilter(n);
            imageButton = this.p;
            if (imageButton == null) {
                return;
            }
        } else {
            i = R.drawable.ic_speaker_s;
            imageButton3.setImageResource(R.drawable.ic_speaker_s);
            this.e.setColorFilter(n);
            imageButton = this.p;
            if (imageButton == null) {
                return;
            }
        }
        imageButton.setImageResource(i);
        this.p.setColorFilter(n);
    }

    public final void F(boolean z, boolean z2) {
        int i;
        ImageButton imageButton;
        if (z2) {
            ImageView imageView = this.g;
            if (imageView != null && this.d != null) {
                if (!z) {
                    imageView.clearAnimation();
                } else if (imageView.getAnimation() == null || !this.g.getAnimation().hasStarted()) {
                    this.g.startAnimation(this.A);
                }
                this.g.setVisibility(0);
                this.d.setImageResource(R.drawable.ic_ctrl_pause_s);
            }
            ImageView imageView2 = this.n;
            if (imageView2 == null || this.o == null) {
                return;
            }
            if (!z) {
                imageView2.clearAnimation();
            } else if (imageView2.getAnimation() == null || !this.n.getAnimation().hasStarted()) {
                this.n.startAnimation(this.B);
            }
            this.n.setVisibility(0);
            imageButton = this.o;
            i = R.drawable.ic_ctrl_pause_vs;
        } else {
            ImageView imageView3 = this.g;
            i = R.drawable.ic_ctrl_play_s;
            if (imageView3 != null && this.d != null) {
                imageView3.clearAnimation();
                this.g.setVisibility(4);
                this.d.setImageResource(R.drawable.ic_ctrl_play_s);
            }
            ImageView imageView4 = this.n;
            if (imageView4 == null || this.o == null) {
                return;
            }
            imageView4.clearAnimation();
            this.n.setVisibility(4);
            imageButton = this.o;
        }
        imageButton.setImageResource(i);
    }

    public final void G() {
        ImageView imageView = this.g;
        if (imageView != null && imageView.getAnimation() != null && this.g.getAnimation().hasStarted()) {
            this.g.clearAnimation();
            this.g.startAnimation(this.A);
        }
        ImageView imageView2 = this.n;
        if (imageView2 == null || imageView2.getAnimation() == null || !this.n.getAnimation().hasStarted()) {
            return;
        }
        this.n.clearAnimation();
        this.n.startAnimation(this.B);
    }

    public void H(boolean z, boolean z2) {
        if (r()) {
            F(z, z2);
        }
    }

    public void I(tx0.b bVar, hx0 hx0Var) {
        if (r()) {
            long j = hx0Var.a;
            this.s = j;
            this.i.setText(br1.o((int) (j / 1000)));
            this.k.setText(bVar.e);
            this.k.setSelected(true);
            this.k.setEllipsize(TextUtils.TruncateAt.END);
            this.k.setClickable(false);
            this.k.setLongClickable(false);
            TextView textView = this.r;
            if (textView != null) {
                textView.setText(bVar.e);
                this.r.setSelected(true);
                this.r.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                this.r.setMovementMethod(new qr0());
                this.r.setClickable(false);
                this.r.setLongClickable(false);
            }
            TextView textView2 = this.l;
            if (textView2 != null) {
                textView2.setText("");
            }
            TextView textView3 = this.m;
            if (textView3 != null) {
                textView3.setText(bVar.i() ? bVar.h : "");
            }
            C(100L);
            G();
        }
    }

    public void J(int i) {
        gl1 gl1Var = this.c.get();
        if (gl1Var == null || !gl1Var.isShowing()) {
            return;
        }
        gl1Var.d(i);
    }

    public void p(int i) {
        long j;
        ViewPropertyAnimator animate;
        float f2;
        ViewPropertyAnimator alpha;
        if (r()) {
            if (i == 1 && this.z == null) {
                i = 2;
            }
            if (this.v != i) {
                wv1 wv1Var = this.b.get();
                if (wv1Var != null) {
                    gr1.k(wv1Var);
                    this.b.clear();
                }
                gl1 gl1Var = this.c.get();
                if (gl1Var != null) {
                    gr1.k(gl1Var);
                    this.c.clear();
                }
            }
            this.v = i;
            View view = this.x;
            int integer = view.getResources().getInteger(17694720);
            float dimension = this.y.getResources().getDimension(R.dimen.player_controls_height);
            if (i == 0) {
                this.y.animate().cancel();
                j = integer;
                this.y.animate().translationY(dimension).alpha(0.0f).setDuration(j);
                view.animate().cancel();
                view.animate().withEndAction(this.C).translationY(dimension).alpha(0.0f).setDuration(j);
                View view2 = this.z;
                if (view2 == null) {
                    return;
                }
                view2.animate().cancel();
                animate = this.z.animate().withEndAction(this.D);
                f2 = this.w;
            } else if (i == 1) {
                j = integer;
                this.y.animate().translationY(dimension - this.w).alpha(1.0f).setDuration(j);
                view.animate().cancel();
                view.animate().withEndAction(this.C);
                view.animate().translationY(dimension).alpha(0.0f).setDuration(j);
                View view3 = this.z;
                if (view3 != null) {
                    view3.animate().cancel();
                    this.z.animate().withEndAction(null);
                    this.z.setVisibility(0);
                    alpha = this.z.animate().translationY(0.0f).alpha(1.0f);
                    alpha.setDuration(j);
                }
                return;
            } else if (i != 2) {
                return;
            } else {
                j = integer;
                this.y.animate().translationY(0.0f).alpha(1.0f).setDuration(j);
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().withEndAction(null);
                view.animate().translationY(0.0f).alpha(1.0f).setDuration(j);
                View view4 = this.z;
                if (view4 == null) {
                    return;
                }
                view4.animate().cancel();
                this.z.animate().withEndAction(this.D);
                animate = this.z.animate();
                f2 = -this.w;
            }
            alpha = animate.translationY(f2).alpha(0.0f);
            alpha.setDuration(j);
        }
    }

    public final boolean r() {
        return this.y != null;
    }

    public void u(boolean z) {
        if (r()) {
            B(F.a(Boolean.FALSE).booleanValue(), z);
        }
    }

    public void v(View view, View view2, View view3) {
        e eVar = new e();
        f fVar = new f();
        this.w = view.getResources().getDimension(R.dimen.design_height_0);
        this.x = view;
        this.y = view3;
        if (view.getResources().getConfiguration().orientation == 2) {
            this.z = null;
            view2.setVisibility(8);
        } else {
            this.z = view2;
        }
        View view4 = this.x;
        gr1.i(view4, view4.getParent());
        this.h = (TextView) view.findViewById(R.id.txtSongCurrentTime);
        this.i = (TextView) view.findViewById(R.id.txtSongDuration);
        this.j = (SeekBar) view.findViewById(R.id.seekBarSongProgress);
        this.k = (TextView) view.findViewById(R.id.txtSongTitle);
        this.j.setOnSeekBarChangeListener(this.E);
        view.findViewById(R.id.btnPrev).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.io0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                ko0.s(view5);
            }
        });
        view.findViewById(R.id.btnNext).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.jo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                ko0.t(view5);
            }
        });
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnPause);
        this.d = imageButton;
        if (imageButton != null) {
            imageButton.setOnClickListener(new g());
        }
        this.g = (ImageView) view.findViewById(R.id.viewOverlayPause);
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.btnVolume);
        this.e = imageButton2;
        imageButton2.setOnClickListener(eVar);
        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.btnMediaControlsOverflow);
        this.f = imageButton3;
        imageButton3.setOnClickListener(fVar);
        this.l = (TextView) view.findViewById(R.id.txtSongDetailInfo);
        this.m = (TextView) view.findViewById(R.id.txtSongDetailInfo0);
        View view5 = this.z;
        if (view5 != null) {
            this.q = (SeekBar) view5.findViewById(R.id.seekBarSongProgress);
            this.r = (TextView) this.z.findViewById(R.id.txtSongTitle);
            this.q.setOnSeekBarChangeListener(this.E);
            ImageButton imageButton4 = (ImageButton) this.z.findViewById(R.id.btnVolume);
            this.p = imageButton4;
            imageButton4.setOnClickListener(eVar);
            ((ImageButton) this.z.findViewById(R.id.btnMediaControlsOverflow)).setOnClickListener(fVar);
        }
        View view6 = this.z;
        if (view6 == null) {
            view6 = this.x;
        }
        ImageButton imageButton5 = (ImageButton) view6.findViewById(R.id.btnPauseS);
        this.o = imageButton5;
        if (imageButton5 != null) {
            imageButton5.setOnClickListener(new h());
        }
        this.n = (ImageView) view6.findViewById(R.id.viewOverlayPauseS);
        int intValue = H.a(2).intValue();
        this.v = -1;
        p(intValue);
        vw1<lo1<Boolean, Boolean>> vw1Var = N;
        Boolean bool = Boolean.FALSE;
        lo1<Boolean, Boolean> a2 = vw1Var.a(new lo1<>(bool, bool));
        H(a2.a.booleanValue(), a2.b.booleanValue());
        lo1<tx0.b, hx0> a3 = M.a(new lo1<>(tx0.h, hx0.c));
        I(a3.a, a3.b);
        B(F.a(bool).booleanValue(), G.a(bool).booleanValue());
        C(100L);
    }

    public void w(boolean z) {
        wv1 wv1Var = this.b.get();
        if (wv1Var == null || !wv1Var.isShowing()) {
            return;
        }
        wv1Var.j(z);
    }

    public void x(int i) {
        gl1 gl1Var = this.c.get();
        if (gl1Var == null || !gl1Var.isShowing()) {
            return;
        }
        gl1Var.a(i);
    }

    public void y(int i) {
        gl1 gl1Var = this.c.get();
        if (gl1Var == null || !gl1Var.isShowing()) {
            return;
        }
        gl1Var.b(i);
    }

    public void z(int i) {
        gl1 gl1Var = this.c.get();
        if (gl1Var == null || !gl1Var.isShowing()) {
            return;
        }
        gl1Var.c(i);
    }
}

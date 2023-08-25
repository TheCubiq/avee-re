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

    /* renamed from: F */
    public static vw1<Boolean> f16500F = new vw1<>();

    /* renamed from: G */
    public static vw1<Boolean> f16501G = new vw1<>();

    /* renamed from: H */
    public static vw1<Integer> f16502H = new vw1<>();

    /* renamed from: I */
    public static pw1 f16503I = new pw1();

    /* renamed from: J */
    public static pw1 f16504J = new pw1();

    /* renamed from: K */
    public static pw1 f16505K = new pw1();

    /* renamed from: L */
    public static vw1<Long> f16506L = new vw1<>();

    /* renamed from: M */
    public static vw1<lo1<tx0.C3143b, hx0>> f16507M = new vw1<>();

    /* renamed from: N */
    public static vw1<lo1<Boolean, Boolean>> f16508N = new vw1<>();

    /* renamed from: O */
    public static qw1<Long> f16509O = new qw1<>();

    /* renamed from: P */
    public static vw1<lo1<Integer, Integer>> f16510P = new vw1<>();

    /* renamed from: Q */
    public static vw1<lo1<Integer, Integer>> f16511Q = new vw1<>();

    /* renamed from: R */
    public static vw1<lo1<Integer, Integer>> f16512R = new vw1<>();

    /* renamed from: S */
    public static vw1<mo1<Integer, Integer, Float>> f16513S = new vw1<>();

    /* renamed from: T */
    public static rw1<Integer, Integer> f16514T = new rw1<>();

    /* renamed from: U */
    public static rw1<Integer, Integer> f16515U = new rw1<>();

    /* renamed from: V */
    public static rw1<Integer, Integer> f16516V = new rw1<>();

    /* renamed from: W */
    public static vw1<Boolean> f16517W = new vw1<>();

    /* renamed from: X */
    public static qw1<Boolean> f16518X = new qw1<>();

    /* renamed from: Y */
    public static pw1 f16519Y = new pw1();

    /* renamed from: Z */
    public static qw1<C0645al> f16520Z = new qw1<>();

    /* renamed from: a0 */
    public static vw1<Boolean> f16521a0 = new vw1<>();

    /* renamed from: b0 */
    public static vw1<Integer> f16522b0 = new vw1<>();

    /* renamed from: c0 */
    public static qw1<Integer> f16523c0 = new qw1<>();

    /* renamed from: d0 */
    public static vw1<Integer> f16524d0 = new vw1<>();

    /* renamed from: e0 */
    public static qw1<Integer> f16525e0 = new qw1<>();

    /* renamed from: f0 */
    public static vw1<Integer> f16526f0 = new vw1<>();

    /* renamed from: g0 */
    public static qw1<Integer> f16527g0 = new qw1<>();

    /* renamed from: h0 */
    public static qw1<C0645al> f16528h0 = new qw1<>();

    /* renamed from: i0 */
    public static vw1<Integer> f16529i0 = new vw1<>();

    /* renamed from: j0 */
    public static pw1 f16530j0 = new pw1();

    /* renamed from: k0 */
    public static pw1 f16531k0 = new pw1();

    /* renamed from: l0 */
    public static final Object f16532l0 = new Object();

    /* renamed from: m0 */
    public static ko0 f16533m0 = null;

    /* renamed from: A */
    public RotateAnimation f16534A;

    /* renamed from: B */
    public RotateAnimation f16535B;

    /* renamed from: a */
    public final Handler f16539a;

    /* renamed from: d */
    public ImageButton f16542d;

    /* renamed from: e */
    public ImageButton f16543e;

    /* renamed from: f */
    public ImageButton f16544f;

    /* renamed from: g */
    public ImageView f16545g;

    /* renamed from: h */
    public TextView f16546h;

    /* renamed from: i */
    public TextView f16547i;

    /* renamed from: j */
    public SeekBar f16548j;

    /* renamed from: k */
    public TextView f16549k;

    /* renamed from: l */
    public TextView f16550l;

    /* renamed from: m */
    public TextView f16551m;

    /* renamed from: n */
    public ImageView f16552n;

    /* renamed from: o */
    public ImageButton f16553o;

    /* renamed from: p */
    public ImageButton f16554p;

    /* renamed from: q */
    public SeekBar f16555q;

    /* renamed from: r */
    public TextView f16556r;

    /* renamed from: u */
    public long f16559u;

    /* renamed from: w */
    public float f16561w;

    /* renamed from: x */
    public View f16562x;

    /* renamed from: y */
    public View f16563y;

    /* renamed from: z */
    public View f16564z;

    /* renamed from: b */
    public WeakReference<wv1> f16540b = new WeakReference<>(null);

    /* renamed from: c */
    public WeakReference<gl1> f16541c = new WeakReference<>(null);

    /* renamed from: s */
    public long f16557s = 1000;

    /* renamed from: t */
    public long f16558t = -1;

    /* renamed from: v */
    public int f16560v = -1;

    /* renamed from: C */
    public Runnable f16536C = new RunnableC1963a();

    /* renamed from: D */
    public Runnable f16537D = new RunnableC1964b();

    /* renamed from: E */
    public SeekBar.OnSeekBarChangeListener f16538E = new C1965c();

    /* renamed from: com.daaw.ko0$a */
    /* loaded from: classes.dex */
    public class RunnableC1963a implements Runnable {
        public RunnableC1963a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ko0.this.f16562x.setVisibility(4);
        }
    }

    /* renamed from: com.daaw.ko0$b */
    /* loaded from: classes.dex */
    public class RunnableC1964b implements Runnable {
        public RunnableC1964b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ko0.this.f16564z != null) {
                ko0.this.f16564z.setVisibility(4);
            }
        }
    }

    /* renamed from: com.daaw.ko0$c */
    /* loaded from: classes.dex */
    public class C1965c implements SeekBar.OnSeekBarChangeListener {
        public C1965c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                ko0 ko0Var = ko0.this;
                ko0Var.f16558t = (ko0Var.f16557s * i) / 1000;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - ko0.this.f16559u > 250) {
                    ko0.this.f16559u = elapsedRealtime;
                    ko0.f16509O.m12018a(Long.valueOf(ko0.this.f16558t));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ko0.this.f16559u = 0L;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ko0.f16509O.m12018a(Long.valueOf(ko0.this.f16558t));
            ko0.this.f16558t = -1L;
        }
    }

    /* renamed from: com.daaw.ko0$d */
    /* loaded from: classes.dex */
    public class C1966d implements Handler.Callback {
        public C1966d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ko0.this.m17634C(ko0.this.m17633D());
            return false;
        }
    }

    /* renamed from: com.daaw.ko0$e */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1967e implements View.OnClickListener {
        public View$OnClickListenerC1967e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LayoutInflater m27375d = new C0645al(view).m27375d();
            gr1.m21324k((wv1) ko0.this.f16540b.get());
            ko0.this.f16540b = new WeakReference(new wv1(m27375d, view));
        }
    }

    /* renamed from: com.daaw.ko0$f */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1968f implements View.OnClickListener {
        public View$OnClickListenerC1968f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            gr1.m21324k((gl1) ko0.this.f16541c.get());
            ko0.this.f16541c = new WeakReference(new gl1(view));
        }
    }

    /* renamed from: com.daaw.ko0$g */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1969g implements View.OnClickListener {
        public View$OnClickListenerC1969g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.f16505K.m12990a();
        }
    }

    /* renamed from: com.daaw.ko0$h */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1970h implements View.OnClickListener {
        public View$OnClickListenerC1970h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.f16505K.m12990a();
        }
    }

    public ko0() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f16534A = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f16534A.setDuration(6000L);
        this.f16534A.setRepeatCount(-1);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f16535B = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.f16535B.setDuration(6000L);
        this.f16535B.setRepeatCount(-1);
        this.f16539a = new Handler(new C1966d());
    }

    /* renamed from: q */
    public static ko0 m17610q() {
        ko0 ko0Var;
        ko0 ko0Var2 = f16533m0;
        if (ko0Var2 != null) {
            return ko0Var2;
        }
        synchronized (f16532l0) {
            if (f16533m0 == null) {
                f16533m0 = new ko0();
            }
            ko0Var = f16533m0;
        }
        return ko0Var;
    }

    /* renamed from: s */
    public static /* synthetic */ void m17608s(View view) {
        f16503I.m12990a();
    }

    /* renamed from: t */
    public static /* synthetic */ void m17607t(View view) {
        f16504J.m12990a();
    }

    /* renamed from: A */
    public void m17636A(boolean z) {
        if (m17609r()) {
            m17635B(z, f16501G.m6692a(Boolean.FALSE).booleanValue());
        }
    }

    /* renamed from: B */
    public final void m17635B(boolean z, boolean z2) {
        wv1 wv1Var = this.f16540b.get();
        if (wv1Var != null && wv1Var.isShowing()) {
            wv1Var.m5766k(z, z2);
        }
        m17632E(z, z2);
    }

    /* renamed from: C */
    public final void m17634C(long j) {
        Message obtainMessage = this.f16539a.obtainMessage(1);
        this.f16539a.removeMessages(1);
        this.f16539a.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: D */
    public final long m17633D() {
        long longValue = f16506L.m6692a(-1L).longValue();
        vw1<lo1<Boolean, Boolean>> vw1Var = f16508N;
        Boolean bool = Boolean.FALSE;
        lo1<Boolean, Boolean> m6692a = vw1Var.m6692a(new lo1<>(bool, bool));
        if (longValue < 0) {
            return 500L;
        }
        try {
            long j = this.f16558t;
            if (j >= 0) {
                longValue = j;
            }
            if (longValue < 0 || this.f16557s < 0) {
                this.f16546h.setText("--:--");
                this.f16548j.setProgress(1000);
                SeekBar seekBar = this.f16555q;
                if (seekBar != null) {
                    seekBar.setProgress(1000);
                }
            } else {
                this.f16546h.setText(br1.m25894o((int) (longValue / 1000)));
                int i = (int) ((longValue * 1000) / this.f16557s);
                this.f16548j.setProgress(i);
                SeekBar seekBar2 = this.f16555q;
                if (seekBar2 != null) {
                    seekBar2.setProgress(i);
                }
                int i2 = 0;
                if (!m6692a.f17576a.booleanValue()) {
                    int visibility = this.f16546h.getVisibility();
                    TextView textView = this.f16546h;
                    if (visibility != 4) {
                        i2 = 4;
                    }
                    textView.setVisibility(i2);
                    return 500L;
                }
                this.f16546h.setVisibility(0);
            }
            long j2 = 1000 - (longValue % 1000);
            int width = this.f16548j.getWidth();
            if (width == 0) {
                width = 320;
            }
            long j3 = this.f16557s / width;
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

    /* renamed from: E */
    public final void m17632E(boolean z, boolean z2) {
        int i;
        ImageButton imageButton;
        int m21321n = gr1.m21321n(this.f16543e, R.attr.mediaControlsFG);
        if (z) {
            int m21321n2 = gr1.m21321n(this.f16543e, R.attr.mediaControlsHighLight);
            this.f16543e.setImageResource(R.drawable.ic_mute_s);
            this.f16543e.setColorFilter(m21321n2);
            ImageButton imageButton2 = this.f16554p;
            if (imageButton2 != null) {
                imageButton2.setImageResource(R.drawable.ic_mute_s);
                this.f16554p.setColorFilter(m21321n2);
                return;
            }
            return;
        }
        ImageButton imageButton3 = this.f16543e;
        if (z2) {
            i = R.drawable.ic_speaker_asterisk_s;
            imageButton3.setImageResource(R.drawable.ic_speaker_asterisk_s);
            this.f16543e.setColorFilter(m21321n);
            imageButton = this.f16554p;
            if (imageButton == null) {
                return;
            }
        } else {
            i = R.drawable.ic_speaker_s;
            imageButton3.setImageResource(R.drawable.ic_speaker_s);
            this.f16543e.setColorFilter(m21321n);
            imageButton = this.f16554p;
            if (imageButton == null) {
                return;
            }
        }
        imageButton.setImageResource(i);
        this.f16554p.setColorFilter(m21321n);
    }

    /* renamed from: F */
    public final void m17631F(boolean z, boolean z2) {
        int i;
        ImageButton imageButton;
        if (z2) {
            ImageView imageView = this.f16545g;
            if (imageView != null && this.f16542d != null) {
                if (!z) {
                    imageView.clearAnimation();
                } else if (imageView.getAnimation() == null || !this.f16545g.getAnimation().hasStarted()) {
                    this.f16545g.startAnimation(this.f16534A);
                }
                this.f16545g.setVisibility(0);
                this.f16542d.setImageResource(R.drawable.ic_ctrl_pause_s);
            }
            ImageView imageView2 = this.f16552n;
            if (imageView2 == null || this.f16553o == null) {
                return;
            }
            if (!z) {
                imageView2.clearAnimation();
            } else if (imageView2.getAnimation() == null || !this.f16552n.getAnimation().hasStarted()) {
                this.f16552n.startAnimation(this.f16535B);
            }
            this.f16552n.setVisibility(0);
            imageButton = this.f16553o;
            i = R.drawable.ic_ctrl_pause_vs;
        } else {
            ImageView imageView3 = this.f16545g;
            i = R.drawable.ic_ctrl_play_s;
            if (imageView3 != null && this.f16542d != null) {
                imageView3.clearAnimation();
                this.f16545g.setVisibility(4);
                this.f16542d.setImageResource(R.drawable.ic_ctrl_play_s);
            }
            ImageView imageView4 = this.f16552n;
            if (imageView4 == null || this.f16553o == null) {
                return;
            }
            imageView4.clearAnimation();
            this.f16552n.setVisibility(4);
            imageButton = this.f16553o;
        }
        imageButton.setImageResource(i);
    }

    /* renamed from: G */
    public final void m17630G() {
        ImageView imageView = this.f16545g;
        if (imageView != null && imageView.getAnimation() != null && this.f16545g.getAnimation().hasStarted()) {
            this.f16545g.clearAnimation();
            this.f16545g.startAnimation(this.f16534A);
        }
        ImageView imageView2 = this.f16552n;
        if (imageView2 == null || imageView2.getAnimation() == null || !this.f16552n.getAnimation().hasStarted()) {
            return;
        }
        this.f16552n.clearAnimation();
        this.f16552n.startAnimation(this.f16535B);
    }

    /* renamed from: H */
    public void m17629H(boolean z, boolean z2) {
        if (m17609r()) {
            m17631F(z, z2);
        }
    }

    /* renamed from: I */
    public void m17628I(tx0.C3143b c3143b, hx0 hx0Var) {
        if (m17609r()) {
            long j = hx0Var.f13044a;
            this.f16557s = j;
            this.f16547i.setText(br1.m25894o((int) (j / 1000)));
            this.f16549k.setText(c3143b.f28207e);
            this.f16549k.setSelected(true);
            this.f16549k.setEllipsize(TextUtils.TruncateAt.END);
            this.f16549k.setClickable(false);
            this.f16549k.setLongClickable(false);
            TextView textView = this.f16556r;
            if (textView != null) {
                textView.setText(c3143b.f28207e);
                this.f16556r.setSelected(true);
                this.f16556r.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                this.f16556r.setMovementMethod(new qr0());
                this.f16556r.setClickable(false);
                this.f16556r.setLongClickable(false);
            }
            TextView textView2 = this.f16550l;
            if (textView2 != null) {
                textView2.setText("");
            }
            TextView textView3 = this.f16551m;
            if (textView3 != null) {
                textView3.setText(c3143b.m8724i() ? c3143b.f28210h : "");
            }
            m17634C(100L);
            m17630G();
        }
    }

    /* renamed from: J */
    public void m17627J(int i) {
        gl1 gl1Var = this.f16541c.get();
        if (gl1Var == null || !gl1Var.isShowing()) {
            return;
        }
        gl1Var.m21493d(i);
    }

    /* renamed from: p */
    public void m17611p(int i) {
        long j;
        ViewPropertyAnimator animate;
        float f;
        ViewPropertyAnimator alpha;
        if (m17609r()) {
            if (i == 1 && this.f16564z == null) {
                i = 2;
            }
            if (this.f16560v != i) {
                wv1 wv1Var = this.f16540b.get();
                if (wv1Var != null) {
                    gr1.m21324k(wv1Var);
                    this.f16540b.clear();
                }
                gl1 gl1Var = this.f16541c.get();
                if (gl1Var != null) {
                    gr1.m21324k(gl1Var);
                    this.f16541c.clear();
                }
            }
            this.f16560v = i;
            View view = this.f16562x;
            int integer = view.getResources().getInteger(17694720);
            float dimension = this.f16563y.getResources().getDimension(R.dimen.player_controls_height);
            if (i == 0) {
                this.f16563y.animate().cancel();
                j = integer;
                this.f16563y.animate().translationY(dimension).alpha(0.0f).setDuration(j);
                view.animate().cancel();
                view.animate().withEndAction(this.f16536C).translationY(dimension).alpha(0.0f).setDuration(j);
                View view2 = this.f16564z;
                if (view2 == null) {
                    return;
                }
                view2.animate().cancel();
                animate = this.f16564z.animate().withEndAction(this.f16537D);
                f = this.f16561w;
            } else if (i == 1) {
                j = integer;
                this.f16563y.animate().translationY(dimension - this.f16561w).alpha(1.0f).setDuration(j);
                view.animate().cancel();
                view.animate().withEndAction(this.f16536C);
                view.animate().translationY(dimension).alpha(0.0f).setDuration(j);
                View view3 = this.f16564z;
                if (view3 != null) {
                    view3.animate().cancel();
                    this.f16564z.animate().withEndAction(null);
                    this.f16564z.setVisibility(0);
                    alpha = this.f16564z.animate().translationY(0.0f).alpha(1.0f);
                    alpha.setDuration(j);
                }
                return;
            } else if (i != 2) {
                return;
            } else {
                j = integer;
                this.f16563y.animate().translationY(0.0f).alpha(1.0f).setDuration(j);
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().withEndAction(null);
                view.animate().translationY(0.0f).alpha(1.0f).setDuration(j);
                View view4 = this.f16564z;
                if (view4 == null) {
                    return;
                }
                view4.animate().cancel();
                this.f16564z.animate().withEndAction(this.f16537D);
                animate = this.f16564z.animate();
                f = -this.f16561w;
            }
            alpha = animate.translationY(f).alpha(0.0f);
            alpha.setDuration(j);
        }
    }

    /* renamed from: r */
    public final boolean m17609r() {
        return this.f16563y != null;
    }

    /* renamed from: u */
    public void m17606u(boolean z) {
        if (m17609r()) {
            m17635B(f16500F.m6692a(Boolean.FALSE).booleanValue(), z);
        }
    }

    /* renamed from: v */
    public void m17605v(View view, View view2, View view3) {
        View$OnClickListenerC1967e view$OnClickListenerC1967e = new View$OnClickListenerC1967e();
        View$OnClickListenerC1968f view$OnClickListenerC1968f = new View$OnClickListenerC1968f();
        this.f16561w = view.getResources().getDimension(R.dimen.design_height_0);
        this.f16562x = view;
        this.f16563y = view3;
        if (view.getResources().getConfiguration().orientation == 2) {
            this.f16564z = null;
            view2.setVisibility(8);
        } else {
            this.f16564z = view2;
        }
        View view4 = this.f16562x;
        gr1.m21326i(view4, view4.getParent());
        this.f16546h = (TextView) view.findViewById(R.id.txtSongCurrentTime);
        this.f16547i = (TextView) view.findViewById(R.id.txtSongDuration);
        this.f16548j = (SeekBar) view.findViewById(R.id.seekBarSongProgress);
        this.f16549k = (TextView) view.findViewById(R.id.txtSongTitle);
        this.f16548j.setOnSeekBarChangeListener(this.f16538E);
        view.findViewById(R.id.btnPrev).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.io0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                ko0.m17608s(view5);
            }
        });
        view.findViewById(R.id.btnNext).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.jo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                ko0.m17607t(view5);
            }
        });
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnPause);
        this.f16542d = imageButton;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View$OnClickListenerC1969g());
        }
        this.f16545g = (ImageView) view.findViewById(R.id.viewOverlayPause);
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.btnVolume);
        this.f16543e = imageButton2;
        imageButton2.setOnClickListener(view$OnClickListenerC1967e);
        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.btnMediaControlsOverflow);
        this.f16544f = imageButton3;
        imageButton3.setOnClickListener(view$OnClickListenerC1968f);
        this.f16550l = (TextView) view.findViewById(R.id.txtSongDetailInfo);
        this.f16551m = (TextView) view.findViewById(R.id.txtSongDetailInfo0);
        View view5 = this.f16564z;
        if (view5 != null) {
            this.f16555q = (SeekBar) view5.findViewById(R.id.seekBarSongProgress);
            this.f16556r = (TextView) this.f16564z.findViewById(R.id.txtSongTitle);
            this.f16555q.setOnSeekBarChangeListener(this.f16538E);
            ImageButton imageButton4 = (ImageButton) this.f16564z.findViewById(R.id.btnVolume);
            this.f16554p = imageButton4;
            imageButton4.setOnClickListener(view$OnClickListenerC1967e);
            ((ImageButton) this.f16564z.findViewById(R.id.btnMediaControlsOverflow)).setOnClickListener(view$OnClickListenerC1968f);
        }
        View view6 = this.f16564z;
        if (view6 == null) {
            view6 = this.f16562x;
        }
        ImageButton imageButton5 = (ImageButton) view6.findViewById(R.id.btnPauseS);
        this.f16553o = imageButton5;
        if (imageButton5 != null) {
            imageButton5.setOnClickListener(new View$OnClickListenerC1970h());
        }
        this.f16552n = (ImageView) view6.findViewById(R.id.viewOverlayPauseS);
        int intValue = f16502H.m6692a(2).intValue();
        this.f16560v = -1;
        m17611p(intValue);
        vw1<lo1<Boolean, Boolean>> vw1Var = f16508N;
        Boolean bool = Boolean.FALSE;
        lo1<Boolean, Boolean> m6692a = vw1Var.m6692a(new lo1<>(bool, bool));
        m17629H(m6692a.f17576a.booleanValue(), m6692a.f17577b.booleanValue());
        lo1<tx0.C3143b, hx0> m6692a2 = f16507M.m6692a(new lo1<>(tx0.f28188h, hx0.f13043c));
        m17628I(m6692a2.f17576a, m6692a2.f17577b);
        m17635B(f16500F.m6692a(bool).booleanValue(), f16501G.m6692a(bool).booleanValue());
        m17634C(100L);
    }

    /* renamed from: w */
    public void m17604w(boolean z) {
        wv1 wv1Var = this.f16540b.get();
        if (wv1Var == null || !wv1Var.isShowing()) {
            return;
        }
        wv1Var.m5767j(z);
    }

    /* renamed from: x */
    public void m17603x(int i) {
        gl1 gl1Var = this.f16541c.get();
        if (gl1Var == null || !gl1Var.isShowing()) {
            return;
        }
        gl1Var.m21496a(i);
    }

    /* renamed from: y */
    public void m17602y(int i) {
        gl1 gl1Var = this.f16541c.get();
        if (gl1Var == null || !gl1Var.isShowing()) {
            return;
        }
        gl1Var.m21495b(i);
    }

    /* renamed from: z */
    public void m17601z(int i) {
        gl1 gl1Var = this.f16541c.get();
        if (gl1Var == null || !gl1Var.isShowing()) {
            return;
        }
        gl1Var.m21494c(i);
    }
}

package com.daaw.avee.comp.playback;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import com.daaw.C1652i2;
import com.daaw.C2668pz;
import com.daaw.C3265uy;
import com.daaw.C3385vy;
import com.daaw.SharedPreferences$OnSharedPreferenceChangeListenerC1788j5;
import com.daaw.SurfaceHolder$CallbackC2495oz;
import com.daaw.af0;
import com.daaw.avee.R;
import com.daaw.avee.comp.playback.AbstractC0738b;
import com.daaw.avee.comp.playback.C0729a;
import com.daaw.avee.comp.playback.InterfaceC0771e;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.view.MediaAppWidgetProvider;
import com.daaw.df0;
import com.daaw.dp0;
import com.daaw.dx0;
import com.daaw.gr1;
import com.daaw.hx0;
import com.daaw.l01;
import com.daaw.lo1;
import com.daaw.lz1;
import com.daaw.mo0;
import com.daaw.mr0;
import com.daaw.p21;
import com.daaw.pw1;
import com.daaw.q01;
import com.daaw.qw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.uw1;
import com.daaw.vd0;
import com.daaw.vr0;
import com.daaw.vw1;
import com.daaw.w40;
import com.daaw.wo0;
import com.daaw.ww1;
import com.daaw.zo0;
/* loaded from: classes.dex */
public class MediaPlaybackService extends mr0 implements zo0, AudioManager.OnAudioFocusChangeListener {

    /* renamed from: A */
    public af0 f3883A;

    /* renamed from: B */
    public boolean f3884B;

    /* renamed from: C */
    public lo1<tx0, vd0> f3885C;

    /* renamed from: D */
    public boolean f3886D;

    /* renamed from: E */
    public boolean f3887E;

    /* renamed from: F */
    public boolean f3888F;

    /* renamed from: G */
    public boolean f3889G;

    /* renamed from: H */
    public int f3890H;

    /* renamed from: I */
    public boolean f3891I;

    /* renamed from: J */
    public RunnableC0728p f3892J;

    /* renamed from: K */
    public int f3893K;

    /* renamed from: L */
    public boolean f3894L;

    /* renamed from: M */
    public boolean f3895M;

    /* renamed from: N */
    public C0768d f3896N;

    /* renamed from: O */
    public int f3897O;

    /* renamed from: P */
    public int f3898P;

    /* renamed from: Q */
    public AudioManager f3899Q;

    /* renamed from: R */
    public AbstractC0738b.C0740b f3900R;

    /* renamed from: S */
    public dx0 f3901S;

    /* renamed from: T */
    public Object f3902T;

    /* renamed from: U */
    public String f3903U;

    /* renamed from: V */
    public Runnable f3904V;

    /* renamed from: W */
    public Runnable f3905W;

    /* renamed from: X */
    public InterfaceC0771e.InterfaceC0773b f3906X;

    /* renamed from: Y */
    public final Runnable f3907Y;

    /* renamed from: Z */
    public final Runnable f3908Z;

    /* renamed from: a0 */
    public tx0 f3909a0;

    /* renamed from: t */
    public final boolean[] f3910t;

    /* renamed from: u */
    public final boolean[] f3911u;

    /* renamed from: v */
    public boolean f3912v;

    /* renamed from: w */
    public int f3913w;

    /* renamed from: x */
    public mo0 f3914x;

    /* renamed from: y */
    public ComponentName f3915y;

    /* renamed from: z */
    public RemoteControlClient f3916z;

    /* renamed from: b0 */
    public static qw1<Context> f3858b0 = new qw1<>();

    /* renamed from: c0 */
    public static qw1<Context> f3859c0 = new qw1<>();

    /* renamed from: d0 */
    public static qw1<Context> f3860d0 = new qw1<>();

    /* renamed from: e0 */
    public static vw1<Integer> f3861e0 = new vw1<>();

    /* renamed from: f0 */
    public static vw1<Boolean> f3862f0 = new vw1<>();

    /* renamed from: g0 */
    public static uw1<Boolean, Boolean, Integer, String, tx0> f3863g0 = new uw1<>();

    /* renamed from: h0 */
    public static tw1<tx0, vd0, tx0.C3143b, hx0> f3864h0 = new tw1<>();

    /* renamed from: i0 */
    public static qw1<Integer> f3865i0 = new qw1<>();

    /* renamed from: j0 */
    public static qw1<Integer> f3866j0 = new qw1<>();

    /* renamed from: k0 */
    public static qw1<Boolean> f3867k0 = new qw1<>();

    /* renamed from: l0 */
    public static vw1<Boolean> f3868l0 = new vw1<>();

    /* renamed from: m0 */
    public static vw1<Float> f3869m0 = new vw1<>();

    /* renamed from: n0 */
    public static vw1<Float> f3870n0 = new vw1<>();

    /* renamed from: o0 */
    public static pw1 f3871o0 = new pw1();

    /* renamed from: p0 */
    public static uw1<Integer, Boolean, Long, Boolean, tx0> f3872p0 = new uw1<>();

    /* renamed from: q0 */
    public static pw1 f3873q0 = new pw1();

    /* renamed from: r0 */
    public static pw1 f3874r0 = new pw1();

    /* renamed from: s0 */
    public static qw1<Long> f3875s0 = new qw1<>();

    /* renamed from: t0 */
    public static sw1<Integer, Integer, Float> f3876t0 = new sw1<>();

    /* renamed from: u0 */
    public static vw1<SurfaceHolder> f3877u0 = new vw1<>();

    /* renamed from: v0 */
    public static vw1<Integer> f3878v0 = new vw1<>();

    /* renamed from: w0 */
    public static ww1<String, AbstractC0738b.C0741c> f3879w0 = new ww1<>();

    /* renamed from: x0 */
    public static ww1<String, Boolean> f3880x0 = new ww1<>();

    /* renamed from: y0 */
    public static qw1<AbstractC0738b.C0740b> f3881y0 = new qw1<>();

    /* renamed from: z0 */
    public static uw1<Context, C1652i2, af0, Integer, Integer> f3882z0 = new uw1<>();

    /* renamed from: A0 */
    public static pw1 f3855A0 = new pw1();

    /* renamed from: B0 */
    public static qw1<C2668pz> f3856B0 = new qw1<>();

    /* renamed from: C0 */
    public static MediaPlaybackService f3857C0 = null;

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$a */
    /* loaded from: classes.dex */
    public class RunnableC0713a implements Runnable {
        public RunnableC0713a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m26769m0();
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$b */
    /* loaded from: classes.dex */
    public class C0714b implements af0 {

        /* renamed from: a */
        public Object f3918a;

        public C0714b() {
        }

        @Override // com.daaw.af0
        /* renamed from: a */
        public void mo5908a(Object obj) {
            this.f3918a = obj;
        }

        @Override // com.daaw.af0
        /* renamed from: b */
        public void mo5907b(df0 df0Var, String str, String str2) {
            MediaPlaybackService.this.m26749w0(gr1.m21327h(df0.m24431g(df0Var)));
            df0.m24433c(df0Var);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$c */
    /* loaded from: classes.dex */
    public class RunnableC0715c implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ Bitmap f3920p;

        public RunnableC0715c(Bitmap bitmap) {
            this.f3920p = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m26751v0(this.f3920p);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$d */
    /* loaded from: classes.dex */
    public class RunnableC0716d implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ SurfaceHolder f3922p;

        public RunnableC0716d(SurfaceHolder surfaceHolder) {
            this.f3922p = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m26830B0(this.f3922p);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$e */
    /* loaded from: classes.dex */
    public class RunnableC0717e implements Runnable {
        public RunnableC0717e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m26777i0();
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$f */
    /* loaded from: classes.dex */
    public class RunnableC0718f implements Runnable {
        public RunnableC0718f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0771e m26821G = MediaPlaybackService.this.m26821G();
            if (m26821G != null) {
                m26821G.mo6873p();
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$g */
    /* loaded from: classes.dex */
    public class RunnableC0719g implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ AbstractC0738b.C0741c f3926p;

        public RunnableC0719g(AbstractC0738b.C0741c c0741c) {
            this.f3926p = c0741c;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m26755t0(this.f3926p);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$h */
    /* loaded from: classes.dex */
    public class RunnableC0720h implements Runnable {
        public RunnableC0720h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m26814J0();
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$i */
    /* loaded from: classes.dex */
    public class RunnableC0721i implements Runnable {
        public RunnableC0721i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.f3875s0.m12018a(Long.valueOf(MediaPlaybackService.this.m26787d0()));
            MediaPlaybackService.this.m26785e0(100L);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$j */
    /* loaded from: classes.dex */
    public class C0722j implements InterfaceC0771e.InterfaceC0773b {
        public C0722j() {
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: a */
        public void mo26657a(boolean z, String str) {
            MediaPlaybackService.this.m26795X(z, str);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: b */
        public void mo26656b() {
            MediaPlaybackService.f3855A0.m12990a();
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: c */
        public void mo26655c(AbstractC0738b.C0740b c0740b) {
            MediaPlaybackService.this.f3900R = c0740b;
            MediaPlaybackService.f3881y0.m12018a(c0740b);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: d */
        public AbstractC0738b.C0741c mo26654d(String str) {
            return MediaPlaybackService.f3879w0.m5753a(str, null);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: e */
        public boolean mo26653e(String str) {
            return MediaPlaybackService.f3880x0.m5753a(str, Boolean.FALSE).booleanValue();
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: f */
        public void mo26652f(boolean z) {
            MediaPlaybackService.f3867k0.m12018a(Boolean.valueOf(z));
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: g */
        public void mo26651g(boolean z) {
            MediaPlaybackService.this.m26799T(z);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: h */
        public boolean mo26650h() {
            return MediaPlaybackService.this.m26781g0();
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: i */
        public void mo26649i(int i, int i2, float f) {
            MediaPlaybackService.f3876t0.m9795a(Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f));
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: j */
        public void mo26648j(boolean z, int i) {
            MediaPlaybackService.this.m26797V(z, i);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: k */
        public void mo26647k(C2668pz c2668pz) {
            MediaPlaybackService.f3856B0.m12018a(c2668pz);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: l */
        public int mo26646l() {
            return MediaPlaybackService.f3878v0.m6692a(0).intValue();
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: m */
        public void mo26645m(long j) {
            MediaPlaybackService.this.m26800S(j);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: n */
        public SurfaceHolder mo26644n() {
            return MediaPlaybackService.f3877u0.m6692a(null);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: o */
        public void mo26643o() {
            MediaPlaybackService.this.m26798U();
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$k */
    /* loaded from: classes.dex */
    public class RunnableC0723k implements Runnable {
        public RunnableC0723k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                MediaPlaybackService.this.m26805O();
                notifyAll();
                MediaPlaybackService.this.f3910t[0] = true;
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$l */
    /* loaded from: classes.dex */
    public class RunnableC0724l implements Runnable {
        public RunnableC0724l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                MediaPlaybackService.this.m26746y();
                notifyAll();
                MediaPlaybackService.this.f3911u[0] = true;
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$m */
    /* loaded from: classes.dex */
    public class RunnableC0725m implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ boolean f3933p;

        public RunnableC0725m(boolean z) {
            this.f3933p = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m26745y0(this.f3933p);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$n */
    /* loaded from: classes.dex */
    public class RunnableC0726n implements Runnable {
        public RunnableC0726n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m26773k0();
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$o */
    /* loaded from: classes.dex */
    public class RunnableC0727o implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ int f3936p;

        public RunnableC0727o(int i) {
            this.f3936p = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m26763p0(this.f3936p);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.MediaPlaybackService$p */
    /* loaded from: classes.dex */
    public class RunnableC0728p implements Runnable {

        /* renamed from: p */
        public final long f3938p;

        /* renamed from: q */
        public final boolean f3939q;

        /* renamed from: r */
        public tx0 f3940r;

        public RunnableC0728p(long j, boolean z, tx0 tx0Var) {
            this.f3938p = j;
            this.f3939q = z;
            this.f3940r = tx0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MediaPlaybackService.this.f3912v) {
                MediaPlaybackService.f3872p0.m7667a(Integer.valueOf(MediaPlaybackService.this.f3897O), Boolean.valueOf(MediaPlaybackService.this.f3891I), Long.valueOf(this.f3938p), Boolean.valueOf(this.f3939q), this.f3940r);
            }
        }
    }

    public MediaPlaybackService() {
        super("MediaPlaybackService");
        this.f3910t = new boolean[1];
        this.f3911u = new boolean[1];
        this.f3912v = false;
        this.f3913w = -1;
        this.f3884B = false;
        this.f3885C = null;
        this.f3886D = false;
        this.f3887E = false;
        this.f3888F = false;
        this.f3889G = false;
        this.f3890H = -1;
        this.f3891I = false;
        this.f3892J = new RunnableC0728p(0L, false, null);
        this.f3893K = 4;
        this.f3894L = false;
        this.f3895M = true;
        this.f3897O = -1;
        this.f3898P = 0;
        this.f3900R = null;
        this.f3901S = null;
        this.f3903U = null;
        this.f3904V = new RunnableC0720h();
        this.f3905W = new RunnableC0721i();
        this.f3906X = new C0722j();
        this.f3907Y = new RunnableC0723k();
        this.f3908Z = new RunnableC0724l();
        this.f3909a0 = null;
        m15822b(false);
        this.f3896N = new C0768d(InterfaceC0771e.f4044f, this.f3906X, 0L);
    }

    /* renamed from: A */
    public static int m26833A(Context context) {
        Cursor m24109e = dp0.m24109e(context.getContentResolver(), Uri.parse("content://media/external/fs_id"), null, null, null, null);
        if (m24109e != null) {
            m24109e.moveToFirst();
            int i = m24109e.getInt(0);
            m24109e.close();
            return i;
        }
        return -1;
    }

    /* renamed from: D */
    public static MediaPlaybackService m26827D() {
        return f3857C0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ Handler m26802Q() {
        if (this.f3912v) {
            return this.f19091q;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ Handler m26801R() {
        if (this.f3912v) {
            return this.f19091q;
        }
        return null;
    }

    /* renamed from: A0 */
    public void m26832A0(int i) {
        this.f3896N.m26665s().mo6868u(i);
        if (m26819H() == 1) {
            m26773k0();
        }
    }

    /* renamed from: B */
    public tx0 m26831B() {
        lo1<tx0, vd0> lo1Var = this.f3885C;
        if (lo1Var == null) {
            return null;
        }
        return lo1Var.f17576a;
    }

    /* renamed from: B0 */
    public final void m26830B0(SurfaceHolder surfaceHolder) {
        this.f3896N.m26665s().mo6876m(surfaceHolder);
    }

    /* renamed from: C */
    public AbstractC0738b.C0740b m26829C() {
        this.f19091q.post(new RunnableC0718f());
        return this.f3900R;
    }

    /* renamed from: C0 */
    public void m26828C0(SurfaceHolder surfaceHolder) {
        this.f19091q.post(new RunnableC0716d(surfaceHolder));
    }

    /* renamed from: D0 */
    public void m26826D0(int i) {
        this.f3899Q.setStreamVolume(3, i, 0);
    }

    /* renamed from: E */
    public tx0 m26825E() {
        lo1<tx0, vd0> m26823F = m26823F();
        return m26823F != null ? m26823F.f17576a : tx0.f28191k;
    }

    /* renamed from: E0 */
    public void m26824E0(boolean z) {
        if (m26821G() != null) {
            m26821G().mo6884e(z);
        }
    }

    /* renamed from: F */
    public lo1<tx0, vd0> m26823F() {
        lo1<tx0, vd0> lo1Var = this.f3885C;
        if (lo1Var != null) {
            return lo1Var;
        }
        return null;
    }

    /* renamed from: F0 */
    public void m26822F0(float f) {
        this.f3899Q.setStreamVolume(3, (int) (this.f3899Q.getStreamMaxVolume(3) * f), 0);
    }

    /* renamed from: G */
    public final InterfaceC0771e m26821G() {
        return this.f3896N.m26665s();
    }

    /* renamed from: G0 */
    public void m26820G0(float f) {
        if (m26821G() != null) {
            m26821G().mo6865x(f);
        }
    }

    /* renamed from: H */
    public int m26819H() {
        InterfaceC0771e m26665s = this.f3896N.m26665s();
        if (m26665s instanceof vr0) {
            return 0;
        }
        return m26665s instanceof SurfaceHolder$CallbackC2495oz ? 1 : -1;
    }

    /* renamed from: H0 */
    public final void m26818H0(boolean z) {
        this.f3891I = z;
        f3863g0.m7667a(Boolean.valueOf(m26803P()), Boolean.valueOf(m26804O0()), Integer.valueOf(this.f3890H), null, null);
    }

    /* renamed from: I */
    public C0729a m26817I(C0729a c0729a, C0729a.C0736g c0736g) {
        InterfaceC0771e m26821G = m26821G();
        if (m26821G != null) {
            return m26821G.mo6880i(c0729a, c0736g);
        }
        return null;
    }

    /* renamed from: I0 */
    public void m26816I0() {
        m26818H0(false);
        this.f3887E = false;
        this.f3888F = false;
        if (SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.f3896N.m26684H();
        } else {
            this.f3896N.m26686F();
        }
    }

    /* renamed from: J */
    public int m26815J() {
        return this.f3899Q.getStreamVolume(3);
    }

    /* renamed from: J0 */
    public final void m26814J0() {
        if (m26821G() != null) {
            m26821G().stop();
        }
        stopSelf(this.f3913w);
        this.f3894L = false;
    }

    /* renamed from: K */
    public int m26813K() {
        return this.f3899Q.getStreamMaxVolume(3);
    }

    /* renamed from: K0 */
    public void m26812K0() {
        if (m26804O0()) {
            m26791b0(false);
        } else {
            m26789c0();
        }
    }

    /* renamed from: L */
    public float m26811L() {
        return this.f3899Q.getStreamVolume(3) / this.f3899Q.getStreamMaxVolume(3);
    }

    /* renamed from: L0 */
    public void m26810L0() {
        if (m26821G() != null) {
            m26821G().mo6884e(!m26821G().mo6883f());
        }
    }

    /* renamed from: M */
    public boolean m26809M() {
        if (this.f3894L) {
            return false;
        }
        lz1.m16365a("active state");
        this.f19091q.removeCallbacks(this.f3904V);
        tx0.C3143b m8742j = m26825E().m8742j(getApplicationContext());
        if (this.f3903U == null) {
            this.f3903U = wo0.m5917d(this);
        }
        startForeground(1, wo0.m5915f(this, 1, this.f3903U, m8742j, m26803P(), m26804O0(), MediaPlaybackService.class, 0, new w40() { // from class: com.daaw.yo0
            @Override // com.daaw.w40
            /* renamed from: a */
            public final Object mo3478a() {
                Handler m26802Q;
                m26802Q = MediaPlaybackService.this.m26802Q();
                return m26802Q;
            }
        }));
        this.f3894L = true;
        return true;
    }

    /* renamed from: M0 */
    public final boolean m26808M0() {
        return m26806N0(false);
    }

    /* renamed from: N */
    public void m26807N(boolean z) {
        if (z) {
            lz1.m16365a("idle state");
            this.f3894L = false;
            this.f19091q.removeCallbacks(this.f3904V);
            this.f19091q.postDelayed(this.f3904V, getResources().getInteger(R.integer.service_idle_timeout));
            stopForeground(z);
            if (z) {
                wo0.m5918c(this, 1);
            }
        }
    }

    /* renamed from: N0 */
    public final boolean m26806N0(boolean z) {
        boolean z2 = true;
        boolean z3 = this.f3887E && SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getApplicationContext(), "pref_resumePlayingAfterAudioFocusGained", true);
        if (this.f3895M && ((m26821G() == null || !m26821G().mo6864y()) && !z3)) {
            z2 = false;
        }
        if (!z2 || z) {
            if (!z) {
                m26779h0();
            }
            m26807N(z);
            return false;
        }
        if (m26821G() == null || !m26821G().mo6864y()) {
            m26779h0();
        }
        return m26809M();
    }

    /* renamed from: O */
    public void m26805O() {
        this.f3894L = false;
        f3858b0.m12018a(this);
        m26763p0(f3861e0.m6692a(-1).intValue());
        this.f3899Q = (AudioManager) getSystemService("audio");
        this.f3914x = new mo0();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        if (Build.VERSION.SDK_INT >= 21) {
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        }
        registerReceiver(this.f3914x, intentFilter);
        ComponentName componentName = new ComponentName(this, MediaButtonEventReceiver.class);
        this.f3915y = componentName;
        try {
            this.f3899Q.registerMediaButtonEventReceiver(componentName);
        } catch (Exception e) {
            lz1.m16363c("registerMediaButtonEventReceiver failed: " + e.getMessage());
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(this.f3915y);
            RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 67108864));
            this.f3916z = remoteControlClient;
            this.f3899Q.registerRemoteControlClient(remoteControlClient);
            this.f3916z.setTransportControlFlags(189);
        } catch (Exception e2) {
            lz1.m16363c("remoteControlClient failed: " + e2.getMessage());
        }
        f3866j0.m12018a(Integer.valueOf(m26813K()));
        this.f3898P = m26833A(this);
        m26747x0(0, false);
        this.f3912v = true;
        m26783f0();
        m26808M0();
        m26795X(true, null);
        f3867k0.m12018a(Boolean.valueOf(m26821G().mo6883f()));
        m26745y0(f3862f0.m6692a(Boolean.TRUE).booleanValue());
        this.f3902T = l01.m17249c();
    }

    /* renamed from: O0 */
    public boolean m26804O0() {
        return this.f3891I;
    }

    /* renamed from: P */
    public boolean m26803P() {
        return m26821G().mo6864y();
    }

    /* renamed from: S */
    public void m26800S(long j) {
        this.f19091q.removeCallbacksAndMessages(Integer.valueOf(this.f3893K));
        this.f19091q.postAtTime(new RunnableC0728p(j, false, null), Integer.valueOf(this.f3893K), 0L);
    }

    /* renamed from: T */
    public void m26799T(boolean z) {
        this.f19091q.removeCallbacksAndMessages(Integer.valueOf(this.f3893K));
        this.f19091q.postAtTime(new RunnableC0728p(0L, z, m26831B()), Integer.valueOf(this.f3893K), SystemClock.uptimeMillis() + 1000);
    }

    /* renamed from: U */
    public void m26798U() {
        this.f19091q.removeCallbacksAndMessages(Integer.valueOf(this.f3893K));
        this.f19091q.postAtTime(this.f3892J, Integer.valueOf(this.f3893K), 0L);
    }

    /* renamed from: V */
    public final void m26797V(boolean z, int i) {
        this.f3889G = z;
        this.f3890H = i;
        if (!z) {
            this.f3890H = p21.f22328T0;
        }
        f3863g0.m7667a(Boolean.valueOf(m26803P()), Boolean.valueOf(m26804O0()), Integer.valueOf(this.f3890H), null, null);
    }

    /* renamed from: W */
    public final void m26796W(int i) {
        Context m23840b = dx0.m23840b();
        C3385vy.f30703a.m12018a(m23840b == null ? getString(i) : m23840b.getString(i));
    }

    /* renamed from: X */
    public final void m26795X(boolean z, String str) {
        tx0.C3143b c3143b;
        boolean m26808M0 = m26808M0();
        tx0 tx0Var = tx0.f28191k;
        lo1<tx0, vd0> m26823F = m26823F();
        if (m26823F != null) {
            tx0Var = m26823F.f17576a;
        }
        tx0 tx0Var2 = tx0Var;
        tx0 tx0Var3 = this.f3909a0;
        boolean z2 = tx0Var3 == null || !tx0Var3.equals(tx0Var2);
        if (z) {
            this.f3909a0 = tx0Var2;
        }
        if (m26808M0) {
            c3143b = null;
        } else {
            c3143b = tx0Var2.m8742j(getApplicationContext());
            wo0.m5911j(this, 1, this.f3903U, c3143b, m26803P(), m26804O0(), MediaPlaybackService.class, 0, new w40() { // from class: com.daaw.xo0
                @Override // com.daaw.w40
                /* renamed from: a */
                public final Object mo3478a() {
                    Handler m26801R;
                    m26801R = MediaPlaybackService.this.m26801R();
                    return m26801R;
                }
            });
        }
        if (c3143b == null) {
            c3143b = tx0Var2.m8742j(getApplicationContext());
        }
        MediaAppWidgetProvider.m26640c().m26638e(this, c3143b, m26803P(), m26804O0(), MediaPlaybackService.class);
        if (c3143b == null) {
            c3143b = tx0Var2.m8742j(getApplicationContext());
        }
        tx0.C3143b c3143b2 = c3143b;
        if (c3143b2 != tx0.f28188h) {
            Intent intent = new Intent("com.android.music.metachanged");
            intent.putExtra("playing", m26803P());
            intent.putExtra("track", c3143b2.f28207e);
            intent.putExtra("album", c3143b2.f28208f);
            intent.putExtra("artist", c3143b2.f28210h);
            intent.putExtra("songid", c3143b2.f28206d);
            intent.putExtra("albumid", c3143b2.f28209g);
            intent.putExtra("id", c3143b2.f28209g);
            sendBroadcast(intent);
        }
        RemoteControlClient remoteControlClient = this.f3916z;
        if (remoteControlClient != null) {
            remoteControlClient.setPlaybackState(m26803P() ? 3 : 2);
            if (z && z2) {
                if (c3143b2 == null) {
                    c3143b2 = tx0Var2.m8742j(getApplicationContext());
                }
                tx0.C3143b c3143b3 = c3143b2;
                RemoteControlClient.MetadataEditor editMetadata = this.f3916z.editMetadata(false);
                editMetadata.putString(7, c3143b3.f28207e);
                editMetadata.putString(1, c3143b3.f28208f);
                editMetadata.putString(2, c3143b3.f28210h);
                editMetadata.putLong(9, m26744z());
                editMetadata.apply();
                this.f3883A = new C0714b();
                f3882z0.m7667a(this, new C1652i2(c3143b3.f28203a, c3143b3.m8729d(), c3143b3.m8731b()), this.f3883A, 700, 700);
                c3143b2 = c3143b3;
            }
        }
        if (z) {
            if (c3143b2 == null) {
                c3143b2 = tx0Var2.m8742j(getApplicationContext());
            }
            vd0 vd0Var = m26823F != null ? m26823F.f17577b : null;
            hx0 mo6881h = m26821G().mo6881h();
            if (mo6881h == null) {
                mo6881h = hx0.f13043c;
            }
            f3864h0.m8756a(tx0Var2, vd0Var, c3143b2, mo6881h);
        }
        f3863g0.m7667a(Boolean.valueOf(m26803P()), Boolean.valueOf(m26804O0()), Integer.valueOf(this.f3890H), str, tx0Var2);
    }

    /* renamed from: Y */
    public void m26794Y(lo1<tx0, vd0> lo1Var) {
        m26792a0(lo1Var, 0L, 0L);
    }

    /* renamed from: Z */
    public void m26793Z(lo1<tx0, vd0> lo1Var, long j) {
        m26792a0(lo1Var, j, 0L);
    }

    @Override // com.daaw.mr0
    /* renamed from: a */
    public void mo15823a(Intent intent) {
        pw1 pw1Var;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            char c = 65535;
            switch (action.hashCode()) {
                case -2097438802:
                    if (action.equals("REPEAT_MODE_ACTION")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1938038665:
                    if (action.equals("EXIT_ACTION")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1752305187:
                    if (action.equals("SEEK_ACTION")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1676449846:
                    if (action.equals("TOGGLE_PAUSE_ACTION")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1322125647:
                    if (action.equals("TOGGLE_MUTE_ACTION")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1175598829:
                    if (action.equals("STOP_ACTION")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1158831722:
                    if (action.equals("VIDEO_SCALING_MODE_ACTION")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1067871585:
                    if (action.equals("SET_MUTE_ACTION")) {
                        c = 7;
                        break;
                    }
                    break;
                case -925317648:
                    if (action.equals("PLAY_DATA_SOURCE_ACTION")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -493826641:
                    if (action.equals("HEADSET_ASSIST_ACTION")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -467621471:
                    if (action.equals("PLAY_ACTION")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -315510936:
                    if (action.equals("CROSS_FADE_VALUE_ACTION")) {
                        c = 11;
                        break;
                    }
                    break;
                case 98687563:
                    if (action.equals("TIMEOUT_DISABLE_ACTION")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 507578587:
                    if (action.equals("VOLUME_STEREO_BALANCE_ACTION")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 560451710:
                    if (action.equals("PREVIOUS_ACTION")) {
                        c = 14;
                        break;
                    }
                    break;
                case 905399829:
                    if (action.equals("ACTIVITY_AND_SERVICE_EXIT_ACTION")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1439154582:
                    if (action.equals("VOLUME_PERCENTAGE_ACTION")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1461011714:
                    if (action.equals("NEXT_ACTION")) {
                        c = 17;
                        break;
                    }
                    break;
                case 1956224089:
                    if (action.equals("AUDIO_BECOMING_NOISY_ACTION")) {
                        c = 18;
                        break;
                    }
                    break;
                case 2013996223:
                    if (action.equals("PAUSE_ACTION")) {
                        c = 19;
                        break;
                    }
                    break;
                case 2051860114:
                    if (action.equals("ACTION_HEADSET_PLUGGED_IN")) {
                        c = 20;
                        break;
                    }
                    break;
                case 2090255099:
                    if (action.equals("VOLUME_ACTION")) {
                        c = 21;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m26747x0(intent.getIntExtra("EXTRA_ARG_1", 0), true);
                    return;
                case 1:
                    m26814J0();
                    return;
                case 2:
                    m26765o0(intent.getLongExtra("EXTRA_ARG_1", 0L));
                    return;
                case 3:
                    m26812K0();
                    return;
                case 4:
                    m26810L0();
                    return;
                case 5:
                    m26816I0();
                    return;
                case 6:
                    m26832A0(intent.getIntExtra("EXTRA_ARG_1", 0));
                    return;
                case 7:
                    m26824E0(intent.getBooleanExtra("EXTRA_ARG_1", false));
                    return;
                case '\b':
                    String stringExtra = intent.getStringExtra("EXTRA_ARG_1");
                    tx0 tx0Var = stringExtra != null ? new tx0(stringExtra) : null;
                    boolean booleanExtra = intent.getBooleanExtra("EXTRA_ARG_2", false);
                    long longExtra = intent.getLongExtra("EXTRA_ARG_3", 0L);
                    long longExtra2 = intent.getLongExtra("EXTRA_ARG_4", 0L);
                    lo1<tx0, vd0> lo1Var = tx0Var != null ? new lo1<>(tx0Var, null) : null;
                    m26818H0(booleanExtra);
                    m26792a0(lo1Var, longExtra, longExtra2);
                    return;
                case '\t':
                    pw1Var = f3871o0;
                    pw1Var.m12990a();
                    return;
                case '\n':
                    m26789c0();
                    return;
                case 11:
                    m26757s0(intent.getFloatExtra("EXTRA_ARG_1", -1.0f));
                    return;
                case '\f':
                    m26745y0(false);
                    return;
                case '\r':
                    m26820G0(intent.getFloatExtra("EXTRA_ARG_1", 0.0f));
                    return;
                case 14:
                    pw1Var = f3874r0;
                    pw1Var.m12990a();
                    return;
                case 15:
                    C3265uy.f29609a.m12990a();
                    m26814J0();
                    return;
                case 16:
                    m26822F0(intent.getFloatExtra("EXTRA_ARG_1", 20.0f));
                    return;
                case 17:
                    pw1Var = f3873q0;
                    pw1Var.m12990a();
                    return;
                case 18:
                    m26791b0(true);
                    return;
                case 19:
                    m26791b0(false);
                    return;
                case 20:
                    boolean m18952K = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getApplicationContext(), "pref_resumeWhenHeadsetPluggedIn", true);
                    if (!this.f3888F || !m18952K) {
                        return;
                    }
                    m26789c0();
                    return;
                case 21:
                    m26826D0(intent.getIntExtra("EXTRA_ARG_1", 0));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a0 */
    public void m26792a0(lo1<tx0, vd0> lo1Var, long j, long j2) {
        m26785e0(100L);
        this.f3887E = false;
        this.f3888F = false;
        this.f19091q.removeCallbacksAndMessages(Integer.valueOf(this.f3893K));
        this.f3884B = false;
        this.f3885C = lo1Var;
        tx0 m26831B = m26831B();
        if (m26831B == null) {
            this.f3896N.m26686F();
            return;
        }
        if (j2 <= 0) {
            this.f3896N.m26660x(m26831B.m8738n(), this.f3891I, j);
        } else {
            this.f3896N.m26659y(m26831B.m8738n(), this.f3891I, j, j2);
        }
        m26795X(true, null);
    }

    /* renamed from: b0 */
    public void m26791b0(boolean z) {
        this.f3888F = z && m26804O0();
        m26818H0(false);
        m26785e0(100L);
        this.f3887E = false;
        if (SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.f3896N.m26661w();
        } else {
            m26821G().mo6887b();
        }
    }

    /* renamed from: c0 */
    public void m26789c0() {
        m26818H0(true);
        m26785e0(100L);
        this.f3887E = false;
        this.f3888F = false;
        if (!m26821G().mo6870s()) {
            m26794Y(this.f3885C);
        }
        if (SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.f3896N.m26688D();
        } else {
            m26821G().start();
        }
    }

    /* renamed from: d0 */
    public long m26787d0() {
        if (m26821G() == null) {
            return 0L;
        }
        return m26821G().mo6878k();
    }

    /* renamed from: e */
    public void m26786e(boolean z) {
        RemoteControlClient remoteControlClient;
        lz1.m16365a("abandonAudioFocus");
        if (!z && (remoteControlClient = this.f3916z) != null) {
            remoteControlClient.setPlaybackState(2);
        }
        this.f3886D = false;
        this.f3899Q.abandonAudioFocus(this);
    }

    /* renamed from: e0 */
    public final void m26785e0(long j) {
        this.f19091q.removeCallbacks(this.f3905W);
        if (this.f3912v) {
            this.f19091q.postDelayed(this.f3905W, j);
        }
    }

    /* renamed from: f0 */
    public final void m26783f0() {
        SharedPreferences m18910p = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18910p(getApplicationContext());
        int m18950M = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18950M(m18910p, "repeatmode", 0);
        if (m18950M != 2 && m18950M != 1) {
            m18950M = 0;
        }
        m26747x0(m18950M, false);
        long m18949N = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18949N(m18910p, "seekpos", 0L);
        lo1<tx0, vd0> lo1Var = new lo1<>(new tx0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18947P(m18910p, "openedPath", "")), new q01());
        if (this.f3884B) {
            return;
        }
        m26818H0(false);
        m26793Z(lo1Var, m18949N);
    }

    /* renamed from: g0 */
    public boolean m26781g0() {
        if (this.f3899Q.requestAudioFocus(this, 3, 1) == 1) {
            this.f3886D = true;
            return true;
        }
        lz1.m16363c("requestAudioFocus failed");
        this.f3886D = false;
        return false;
    }

    /* renamed from: h0 */
    public void m26779h0() {
        if (!this.f3886D || this.f3887E) {
            return;
        }
        lz1.m16365a("requestAudioLowerFocus, haveAudioFocus: " + this.f3886D + "; lostAudioFocusWhilePlaying: " + this.f3887E);
        if (this.f3899Q.requestAudioFocus(this, 3, 3) == 1) {
            return;
        }
        lz1.m16363c("requestAudioLowerFocus failed");
    }

    /* renamed from: i0 */
    public final void m26777i0() {
        InterfaceC0771e m26821G = m26821G();
        if (m26821G != null) {
            m26821G.mo6874o();
        }
    }

    /* renamed from: j0 */
    public void m26775j0() {
        this.f19091q.post(new RunnableC0717e());
    }

    /* renamed from: k0 */
    public void m26773k0() {
        m26761q0(m26819H(), true);
    }

    /* renamed from: l0 */
    public void m26771l0() {
        this.f19091q.post(new RunnableC0726n());
    }

    /* renamed from: m0 */
    public final void m26769m0() {
        tx0 tx0Var;
        SharedPreferences.Editor edit = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18910p(getApplicationContext()).edit();
        edit.putInt("cardid", this.f3898P);
        edit.putLong("seekpos", m26821G().mo6878k());
        edit.putInt("repeatmode", this.f3897O);
        lo1<tx0, vd0> lo1Var = this.f3885C;
        edit.putString("openedPath", (lo1Var == null || (tx0Var = lo1Var.f17576a) == null) ? "" : tx0Var.m8745g());
        edit.apply();
    }

    /* renamed from: n0 */
    public void m26767n0() {
        this.f19091q.post(new RunnableC0713a());
    }

    /* renamed from: o0 */
    public void m26765o0(long j) {
        this.f3887E = false;
        this.f3888F = false;
        if (m26821G() == null) {
            return;
        }
        if (j < 0) {
            j = 0;
        }
        if (j > m26821G().mo6877l()) {
            j = m26821G().mo6877l();
        }
        m26821G().mo6882g(j);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == -2 || i == -1) {
            if (m26821G() != null) {
                boolean m18952K = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getApplicationContext(), "pref_fadePlayPause", true);
                this.f3887E = m26821G().mo6864y();
                if (m18952K) {
                    this.f3896N.m26661w();
                } else {
                    m26821G().mo6887b();
                }
            } else {
                this.f3887E = false;
            }
            m26808M0();
        } else if (i != 1) {
        } else {
            boolean m18952K2 = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getApplicationContext(), "pref_resumePlayingAfterAudioFocusGained", true);
            if (this.f3887E && m18952K2) {
                if (m26821G() != null) {
                    if (SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getApplicationContext(), "pref_fadePlayPause", true)) {
                        this.f3896N.m26688D();
                    } else {
                        m26821G().start();
                    }
                }
                this.f3887E = false;
            }
        }
    }

    @Override // com.daaw.mr0, android.app.Service
    public void onCreate() {
        super.onCreate();
        f3857C0 = this;
        this.f3901S = dx0.m23834h();
        this.f3894L = false;
        m26809M();
        this.f3910t[0] = false;
        this.f19091q.post(this.f3907Y);
        synchronized (this.f3907Y) {
            if (!this.f3910t[0]) {
                try {
                    this.f3907Y.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.daaw.mr0, android.app.Service
    public void onDestroy() {
        this.f3912v = false;
        f3859c0.m12018a(this);
        this.f3911u[0] = false;
        this.f19091q.post(this.f3908Z);
        synchronized (this.f3908Z) {
            if (!this.f3911u[0]) {
                try {
                    this.f3908Z.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        super.onDestroy();
        this.f3901S = null;
    }

    @Override // com.daaw.mr0, android.app.Service
    public void onStart(Intent intent, int i) {
        this.f3913w = i;
        super.onStart(intent, i);
    }

    @Override // com.daaw.mr0, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        m26809M();
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: p0 */
    public final void m26763p0(int i) {
        m26761q0(i, false);
    }

    /* renamed from: q0 */
    public final void m26761q0(int i, boolean z) {
        int m26819H;
        if (z || (m26819H = m26819H()) < 0 || m26819H != i) {
            boolean booleanValue = f3868l0.m6692a(Boolean.FALSE).booleanValue();
            float floatValue = f3869m0.m6692a(Float.valueOf(0.0f)).floatValue();
            float floatValue2 = f3870n0.m6692a(Float.valueOf(-1.0f)).floatValue();
            long mo6878k = this.f3896N.m26665s().mo6878k();
            this.f3896N.m26658z();
            this.f3896N = i == 1 ? new C0768d(new SurfaceHolder$CallbackC2495oz(this, getResources().getString(R.string.musicSys_exo), this.f3906X), this.f3906X, floatValue2 * 1000.0f) : new C0768d(new vr0(this, getResources().getString(R.string.musicSys_native), this.f3906X), this.f3906X, floatValue2 * 1000.0f);
            this.f3896N.m26665s().mo6884e(booleanValue);
            this.f3896N.m26665s().mo6865x(floatValue);
            m26793Z(this.f3885C, mo6878k);
        }
    }

    /* renamed from: r0 */
    public void m26759r0(int i) {
        this.f19091q.post(new RunnableC0727o(i));
    }

    /* renamed from: s0 */
    public void m26757s0(float f) {
        this.f3896N.m26691A(f * 1000.0f);
    }

    /* renamed from: t0 */
    public final void m26755t0(AbstractC0738b.C0741c c0741c) {
        InterfaceC0771e m26821G = m26821G();
        if (m26821G != null) {
            m26821G.mo6875n(c0741c);
        }
    }

    /* renamed from: u0 */
    public void m26753u0(AbstractC0738b.C0741c c0741c) {
        this.f19091q.post(new RunnableC0719g(c0741c));
    }

    /* renamed from: v0 */
    public final void m26751v0(Bitmap bitmap) {
        RemoteControlClient.MetadataEditor editMetadata = this.f3916z.editMetadata(false);
        editMetadata.putBitmap(100, bitmap);
        editMetadata.apply();
    }

    /* renamed from: w0 */
    public final void m26749w0(Bitmap bitmap) {
        this.f19091q.post(new RunnableC0715c(bitmap));
    }

    /* renamed from: x0 */
    public void m26747x0(int i, boolean z) {
        int i2;
        if (this.f3897O == i) {
            return;
        }
        this.f3897O = i;
        if (z) {
            if (i == 0) {
                i2 = R.string.playback_repeat_off;
            } else if (i == 1) {
                i2 = R.string.playback_repeat_current;
            } else if (i == 2) {
                i2 = R.string.playback_repeat_all;
            }
            m26796W(i2);
        }
        f3865i0.m12018a(Integer.valueOf(this.f3897O));
    }

    /* renamed from: y */
    public void m26746y() {
        m26806N0(true);
        this.f3912v = false;
        f3857C0 = null;
        m26769m0();
        f3860d0.m12018a(this);
        m26786e(true);
        RemoteControlClient remoteControlClient = this.f3916z;
        if (remoteControlClient != null) {
            try {
                this.f3899Q.unregisterRemoteControlClient(remoteControlClient);
            } catch (Exception e) {
                lz1.m16363c("unregisterRemoteControlClient failed: " + e.getMessage());
                e.printStackTrace();
            }
            try {
                this.f3899Q.unregisterMediaButtonEventReceiver(this.f3915y);
            } catch (IllegalArgumentException e2) {
                lz1.m16363c("unregisterMediaButtonEventReceiver failed: " + e2.getMessage());
            }
        }
        try {
            unregisterReceiver(this.f3914x);
        } catch (IllegalArgumentException unused) {
        }
        this.f3896N.m26658z();
        this.f3896N = new C0768d(InterfaceC0771e.f4044f, this.f3906X, 0L);
        MediaAppWidgetProvider.m26640c().m26638e(this, m26825E().m8744h(), false, false, MediaPlaybackService.class);
    }

    /* renamed from: y0 */
    public final void m26745y0(boolean z) {
        this.f3895M = z;
        m26808M0();
    }

    /* renamed from: z */
    public long m26744z() {
        InterfaceC0771e m26821G = m26821G();
        if (m26821G == null) {
            return 0L;
        }
        return m26821G.mo6877l();
    }

    /* renamed from: z0 */
    public void m26743z0(boolean z) {
        this.f19091q.post(new RunnableC0725m(z));
    }
}

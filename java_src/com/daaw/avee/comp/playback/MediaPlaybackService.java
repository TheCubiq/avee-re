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
import com.daaw.af0;
import com.daaw.avee.R;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.a;
import com.daaw.avee.comp.playback.b;
import com.daaw.avee.comp.playback.e;
import com.daaw.avee.comp.playback.view.MediaAppWidgetProvider;
import com.daaw.df0;
import com.daaw.dp0;
import com.daaw.dx0;
import com.daaw.gr1;
import com.daaw.hx0;
import com.daaw.i2;
import com.daaw.j5;
import com.daaw.l01;
import com.daaw.lo1;
import com.daaw.lz1;
import com.daaw.mo0;
import com.daaw.mr0;
import com.daaw.oz;
import com.daaw.p21;
import com.daaw.pw1;
import com.daaw.pz;
import com.daaw.q01;
import com.daaw.qw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.uw1;
import com.daaw.uy;
import com.daaw.vd0;
import com.daaw.vr0;
import com.daaw.vw1;
import com.daaw.vy;
import com.daaw.w40;
import com.daaw.wo0;
import com.daaw.ww1;
import com.daaw.zo0;
/* loaded from: classes.dex */
public class MediaPlaybackService extends mr0 implements zo0, AudioManager.OnAudioFocusChangeListener {
    public af0 A;
    public boolean B;
    public lo1<tx0, vd0> C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public p J;
    public int K;
    public boolean L;
    public boolean M;
    public com.daaw.avee.comp.playback.d N;
    public int O;
    public int P;
    public AudioManager Q;
    public b.C0042b R;
    public dx0 S;
    public Object T;
    public String U;
    public Runnable V;
    public Runnable W;
    public e.b X;
    public final Runnable Y;
    public final Runnable Z;
    public tx0 a0;
    public final boolean[] t;
    public final boolean[] u;
    public boolean v;
    public int w;
    public mo0 x;
    public ComponentName y;
    public RemoteControlClient z;
    public static qw1<Context> b0 = new qw1<>();
    public static qw1<Context> c0 = new qw1<>();
    public static qw1<Context> d0 = new qw1<>();
    public static vw1<Integer> e0 = new vw1<>();
    public static vw1<Boolean> f0 = new vw1<>();
    public static uw1<Boolean, Boolean, Integer, String, tx0> g0 = new uw1<>();
    public static tw1<tx0, vd0, tx0.b, hx0> h0 = new tw1<>();
    public static qw1<Integer> i0 = new qw1<>();
    public static qw1<Integer> j0 = new qw1<>();
    public static qw1<Boolean> k0 = new qw1<>();
    public static vw1<Boolean> l0 = new vw1<>();
    public static vw1<Float> m0 = new vw1<>();
    public static vw1<Float> n0 = new vw1<>();
    public static pw1 o0 = new pw1();
    public static uw1<Integer, Boolean, Long, Boolean, tx0> p0 = new uw1<>();
    public static pw1 q0 = new pw1();
    public static pw1 r0 = new pw1();
    public static qw1<Long> s0 = new qw1<>();
    public static sw1<Integer, Integer, Float> t0 = new sw1<>();
    public static vw1<SurfaceHolder> u0 = new vw1<>();
    public static vw1<Integer> v0 = new vw1<>();
    public static ww1<String, b.c> w0 = new ww1<>();
    public static ww1<String, Boolean> x0 = new ww1<>();
    public static qw1<b.C0042b> y0 = new qw1<>();
    public static uw1<Context, i2, af0, Integer, Integer> z0 = new uw1<>();
    public static pw1 A0 = new pw1();
    public static qw1<pz> B0 = new qw1<>();
    public static MediaPlaybackService C0 = null;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.m0();
        }
    }

    /* loaded from: classes.dex */
    public class b implements af0 {
        public Object a;

        public b() {
        }

        @Override // com.daaw.af0
        public void a(Object obj) {
            this.a = obj;
        }

        @Override // com.daaw.af0
        public void b(df0 df0Var, String str, String str2) {
            MediaPlaybackService.this.w0(gr1.h(df0.g(df0Var)));
            df0.c(df0Var);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ Bitmap p;

        public c(Bitmap bitmap) {
            this.p = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.v0(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public final /* synthetic */ SurfaceHolder p;

        public d(SurfaceHolder surfaceHolder) {
            this.p = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.B0(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.i0();
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.daaw.avee.comp.playback.e G = MediaPlaybackService.this.G();
            if (G != null) {
                G.p();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public final /* synthetic */ b.c p;

        public g(b.c cVar) {
            this.p = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.t0(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.J0();
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.s0.a(Long.valueOf(MediaPlaybackService.this.d0()));
            MediaPlaybackService.this.e0(100L);
        }
    }

    /* loaded from: classes.dex */
    public class j implements e.b {
        public j() {
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void a(boolean z, String str) {
            MediaPlaybackService.this.X(z, str);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void b() {
            MediaPlaybackService.A0.a();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void c(b.C0042b c0042b) {
            MediaPlaybackService.this.R = c0042b;
            MediaPlaybackService.y0.a(c0042b);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public b.c d(String str) {
            return MediaPlaybackService.w0.a(str, null);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public boolean e(String str) {
            return MediaPlaybackService.x0.a(str, Boolean.FALSE).booleanValue();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void f(boolean z) {
            MediaPlaybackService.k0.a(Boolean.valueOf(z));
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void g(boolean z) {
            MediaPlaybackService.this.T(z);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public boolean h() {
            return MediaPlaybackService.this.g0();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void i(int i, int i2, float f) {
            MediaPlaybackService.t0.a(Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f));
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void j(boolean z, int i) {
            MediaPlaybackService.this.V(z, i);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void k(pz pzVar) {
            MediaPlaybackService.B0.a(pzVar);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public int l() {
            return MediaPlaybackService.v0.a(0).intValue();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void m(long j) {
            MediaPlaybackService.this.S(j);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public SurfaceHolder n() {
            return MediaPlaybackService.u0.a(null);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void o() {
            MediaPlaybackService.this.U();
        }
    }

    /* loaded from: classes.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                MediaPlaybackService.this.O();
                notifyAll();
                MediaPlaybackService.this.t[0] = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                MediaPlaybackService.this.y();
                notifyAll();
                MediaPlaybackService.this.u[0] = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class m implements Runnable {
        public final /* synthetic */ boolean p;

        public m(boolean z) {
            this.p = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.y0(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.k0();
        }
    }

    /* loaded from: classes.dex */
    public class o implements Runnable {
        public final /* synthetic */ int p;

        public o(int i) {
            this.p = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlaybackService.this.p0(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class p implements Runnable {
        public final long p;
        public final boolean q;
        public tx0 r;

        public p(long j, boolean z, tx0 tx0Var) {
            this.p = j;
            this.q = z;
            this.r = tx0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MediaPlaybackService.this.v) {
                MediaPlaybackService.p0.a(Integer.valueOf(MediaPlaybackService.this.O), Boolean.valueOf(MediaPlaybackService.this.I), Long.valueOf(this.p), Boolean.valueOf(this.q), this.r);
            }
        }
    }

    public MediaPlaybackService() {
        super("MediaPlaybackService");
        this.t = new boolean[1];
        this.u = new boolean[1];
        this.v = false;
        this.w = -1;
        this.B = false;
        this.C = null;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = -1;
        this.I = false;
        this.J = new p(0L, false, null);
        this.K = 4;
        this.L = false;
        this.M = true;
        this.O = -1;
        this.P = 0;
        this.R = null;
        this.S = null;
        this.U = null;
        this.V = new h();
        this.W = new i();
        this.X = new j();
        this.Y = new k();
        this.Z = new l();
        this.a0 = null;
        b(false);
        this.N = new com.daaw.avee.comp.playback.d(com.daaw.avee.comp.playback.e.f, this.X, 0L);
    }

    public static int A(Context context) {
        Cursor e2 = dp0.e(context.getContentResolver(), Uri.parse("content://media/external/fs_id"), null, null, null, null);
        if (e2 != null) {
            e2.moveToFirst();
            int i2 = e2.getInt(0);
            e2.close();
            return i2;
        }
        return -1;
    }

    public static MediaPlaybackService D() {
        return C0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Handler Q() {
        if (this.v) {
            return this.q;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Handler R() {
        if (this.v) {
            return this.q;
        }
        return null;
    }

    public void A0(int i2) {
        this.N.s().u(i2);
        if (H() == 1) {
            k0();
        }
    }

    public tx0 B() {
        lo1<tx0, vd0> lo1Var = this.C;
        if (lo1Var == null) {
            return null;
        }
        return lo1Var.a;
    }

    public final void B0(SurfaceHolder surfaceHolder) {
        this.N.s().m(surfaceHolder);
    }

    public b.C0042b C() {
        this.q.post(new f());
        return this.R;
    }

    public void C0(SurfaceHolder surfaceHolder) {
        this.q.post(new d(surfaceHolder));
    }

    public void D0(int i2) {
        this.Q.setStreamVolume(3, i2, 0);
    }

    public tx0 E() {
        lo1<tx0, vd0> F = F();
        return F != null ? F.a : tx0.k;
    }

    public void E0(boolean z) {
        if (G() != null) {
            G().e(z);
        }
    }

    public lo1<tx0, vd0> F() {
        lo1<tx0, vd0> lo1Var = this.C;
        if (lo1Var != null) {
            return lo1Var;
        }
        return null;
    }

    public void F0(float f2) {
        this.Q.setStreamVolume(3, (int) (this.Q.getStreamMaxVolume(3) * f2), 0);
    }

    public final com.daaw.avee.comp.playback.e G() {
        return this.N.s();
    }

    public void G0(float f2) {
        if (G() != null) {
            G().x(f2);
        }
    }

    public int H() {
        com.daaw.avee.comp.playback.e s = this.N.s();
        if (s instanceof vr0) {
            return 0;
        }
        return s instanceof oz ? 1 : -1;
    }

    public final void H0(boolean z) {
        this.I = z;
        g0.a(Boolean.valueOf(P()), Boolean.valueOf(O0()), Integer.valueOf(this.H), null, null);
    }

    public com.daaw.avee.comp.playback.a I(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
        com.daaw.avee.comp.playback.e G = G();
        if (G != null) {
            return G.i(aVar, gVar);
        }
        return null;
    }

    public void I0() {
        H0(false);
        this.E = false;
        this.F = false;
        if (j5.e().K(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.N.H();
        } else {
            this.N.F();
        }
    }

    public int J() {
        return this.Q.getStreamVolume(3);
    }

    public final void J0() {
        if (G() != null) {
            G().stop();
        }
        stopSelf(this.w);
        this.L = false;
    }

    public int K() {
        return this.Q.getStreamMaxVolume(3);
    }

    public void K0() {
        if (O0()) {
            b0(false);
        } else {
            c0();
        }
    }

    public float L() {
        return this.Q.getStreamVolume(3) / this.Q.getStreamMaxVolume(3);
    }

    public void L0() {
        if (G() != null) {
            G().e(!G().f());
        }
    }

    public boolean M() {
        if (this.L) {
            return false;
        }
        lz1.a("active state");
        this.q.removeCallbacks(this.V);
        tx0.b j2 = E().j(getApplicationContext());
        if (this.U == null) {
            this.U = wo0.d(this);
        }
        startForeground(1, wo0.f(this, 1, this.U, j2, P(), O0(), MediaPlaybackService.class, 0, new w40() { // from class: com.daaw.yo0
            @Override // com.daaw.w40
            public final Object a() {
                Handler Q;
                Q = MediaPlaybackService.this.Q();
                return Q;
            }
        }));
        this.L = true;
        return true;
    }

    public final boolean M0() {
        return N0(false);
    }

    public void N(boolean z) {
        if (z) {
            lz1.a("idle state");
            this.L = false;
            this.q.removeCallbacks(this.V);
            this.q.postDelayed(this.V, getResources().getInteger(R.integer.service_idle_timeout));
            stopForeground(z);
            if (z) {
                wo0.c(this, 1);
            }
        }
    }

    public final boolean N0(boolean z) {
        boolean z2 = true;
        boolean z3 = this.E && j5.e().K(getApplicationContext(), "pref_resumePlayingAfterAudioFocusGained", true);
        if (this.M && ((G() == null || !G().y()) && !z3)) {
            z2 = false;
        }
        if (!z2 || z) {
            if (!z) {
                h0();
            }
            N(z);
            return false;
        }
        if (G() == null || !G().y()) {
            h0();
        }
        return M();
    }

    public void O() {
        this.L = false;
        b0.a(this);
        p0(e0.a(-1).intValue());
        this.Q = (AudioManager) getSystemService("audio");
        this.x = new mo0();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        if (Build.VERSION.SDK_INT >= 21) {
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        }
        registerReceiver(this.x, intentFilter);
        ComponentName componentName = new ComponentName(this, MediaButtonEventReceiver.class);
        this.y = componentName;
        try {
            this.Q.registerMediaButtonEventReceiver(componentName);
        } catch (Exception e2) {
            lz1.c("registerMediaButtonEventReceiver failed: " + e2.getMessage());
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(this.y);
            RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 67108864));
            this.z = remoteControlClient;
            this.Q.registerRemoteControlClient(remoteControlClient);
            this.z.setTransportControlFlags(189);
        } catch (Exception e3) {
            lz1.c("remoteControlClient failed: " + e3.getMessage());
        }
        j0.a(Integer.valueOf(K()));
        this.P = A(this);
        x0(0, false);
        this.v = true;
        f0();
        M0();
        X(true, null);
        k0.a(Boolean.valueOf(G().f()));
        y0(f0.a(Boolean.TRUE).booleanValue());
        this.T = l01.c();
    }

    public boolean O0() {
        return this.I;
    }

    public boolean P() {
        return G().y();
    }

    public void S(long j2) {
        this.q.removeCallbacksAndMessages(Integer.valueOf(this.K));
        this.q.postAtTime(new p(j2, false, null), Integer.valueOf(this.K), 0L);
    }

    public void T(boolean z) {
        this.q.removeCallbacksAndMessages(Integer.valueOf(this.K));
        this.q.postAtTime(new p(0L, z, B()), Integer.valueOf(this.K), SystemClock.uptimeMillis() + 1000);
    }

    public void U() {
        this.q.removeCallbacksAndMessages(Integer.valueOf(this.K));
        this.q.postAtTime(this.J, Integer.valueOf(this.K), 0L);
    }

    public final void V(boolean z, int i2) {
        this.G = z;
        this.H = i2;
        if (!z) {
            this.H = p21.T0;
        }
        g0.a(Boolean.valueOf(P()), Boolean.valueOf(O0()), Integer.valueOf(this.H), null, null);
    }

    public final void W(int i2) {
        Context b2 = dx0.b();
        vy.a.a(b2 == null ? getString(i2) : b2.getString(i2));
    }

    public final void X(boolean z, String str) {
        tx0.b bVar;
        boolean M0 = M0();
        tx0 tx0Var = tx0.k;
        lo1<tx0, vd0> F = F();
        if (F != null) {
            tx0Var = F.a;
        }
        tx0 tx0Var2 = tx0Var;
        tx0 tx0Var3 = this.a0;
        boolean z2 = tx0Var3 == null || !tx0Var3.equals(tx0Var2);
        if (z) {
            this.a0 = tx0Var2;
        }
        if (M0) {
            bVar = null;
        } else {
            bVar = tx0Var2.j(getApplicationContext());
            wo0.j(this, 1, this.U, bVar, P(), O0(), MediaPlaybackService.class, 0, new w40() { // from class: com.daaw.xo0
                @Override // com.daaw.w40
                public final Object a() {
                    Handler R;
                    R = MediaPlaybackService.this.R();
                    return R;
                }
            });
        }
        if (bVar == null) {
            bVar = tx0Var2.j(getApplicationContext());
        }
        MediaAppWidgetProvider.c().e(this, bVar, P(), O0(), MediaPlaybackService.class);
        if (bVar == null) {
            bVar = tx0Var2.j(getApplicationContext());
        }
        tx0.b bVar2 = bVar;
        if (bVar2 != tx0.h) {
            Intent intent = new Intent("com.android.music.metachanged");
            intent.putExtra("playing", P());
            intent.putExtra("track", bVar2.e);
            intent.putExtra("album", bVar2.f);
            intent.putExtra("artist", bVar2.h);
            intent.putExtra("songid", bVar2.d);
            intent.putExtra("albumid", bVar2.g);
            intent.putExtra("id", bVar2.g);
            sendBroadcast(intent);
        }
        RemoteControlClient remoteControlClient = this.z;
        if (remoteControlClient != null) {
            remoteControlClient.setPlaybackState(P() ? 3 : 2);
            if (z && z2) {
                if (bVar2 == null) {
                    bVar2 = tx0Var2.j(getApplicationContext());
                }
                tx0.b bVar3 = bVar2;
                RemoteControlClient.MetadataEditor editMetadata = this.z.editMetadata(false);
                editMetadata.putString(7, bVar3.e);
                editMetadata.putString(1, bVar3.f);
                editMetadata.putString(2, bVar3.h);
                editMetadata.putLong(9, z());
                editMetadata.apply();
                this.A = new b();
                z0.a(this, new i2(bVar3.a, bVar3.d(), bVar3.b()), this.A, 700, 700);
                bVar2 = bVar3;
            }
        }
        if (z) {
            if (bVar2 == null) {
                bVar2 = tx0Var2.j(getApplicationContext());
            }
            vd0 vd0Var = F != null ? F.b : null;
            hx0 h2 = G().h();
            if (h2 == null) {
                h2 = hx0.c;
            }
            h0.a(tx0Var2, vd0Var, bVar2, h2);
        }
        g0.a(Boolean.valueOf(P()), Boolean.valueOf(O0()), Integer.valueOf(this.H), str, tx0Var2);
    }

    public void Y(lo1<tx0, vd0> lo1Var) {
        a0(lo1Var, 0L, 0L);
    }

    public void Z(lo1<tx0, vd0> lo1Var, long j2) {
        a0(lo1Var, j2, 0L);
    }

    @Override // com.daaw.mr0
    public void a(Intent intent) {
        pw1 pw1Var;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            char c2 = 65535;
            switch (action.hashCode()) {
                case -2097438802:
                    if (action.equals("REPEAT_MODE_ACTION")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1938038665:
                    if (action.equals("EXIT_ACTION")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1752305187:
                    if (action.equals("SEEK_ACTION")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1676449846:
                    if (action.equals("TOGGLE_PAUSE_ACTION")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1322125647:
                    if (action.equals("TOGGLE_MUTE_ACTION")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1175598829:
                    if (action.equals("STOP_ACTION")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1158831722:
                    if (action.equals("VIDEO_SCALING_MODE_ACTION")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -1067871585:
                    if (action.equals("SET_MUTE_ACTION")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -925317648:
                    if (action.equals("PLAY_DATA_SOURCE_ACTION")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case -493826641:
                    if (action.equals("HEADSET_ASSIST_ACTION")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case -467621471:
                    if (action.equals("PLAY_ACTION")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case -315510936:
                    if (action.equals("CROSS_FADE_VALUE_ACTION")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 98687563:
                    if (action.equals("TIMEOUT_DISABLE_ACTION")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case 507578587:
                    if (action.equals("VOLUME_STEREO_BALANCE_ACTION")) {
                        c2 = '\r';
                        break;
                    }
                    break;
                case 560451710:
                    if (action.equals("PREVIOUS_ACTION")) {
                        c2 = 14;
                        break;
                    }
                    break;
                case 905399829:
                    if (action.equals("ACTIVITY_AND_SERVICE_EXIT_ACTION")) {
                        c2 = 15;
                        break;
                    }
                    break;
                case 1439154582:
                    if (action.equals("VOLUME_PERCENTAGE_ACTION")) {
                        c2 = 16;
                        break;
                    }
                    break;
                case 1461011714:
                    if (action.equals("NEXT_ACTION")) {
                        c2 = 17;
                        break;
                    }
                    break;
                case 1956224089:
                    if (action.equals("AUDIO_BECOMING_NOISY_ACTION")) {
                        c2 = 18;
                        break;
                    }
                    break;
                case 2013996223:
                    if (action.equals("PAUSE_ACTION")) {
                        c2 = 19;
                        break;
                    }
                    break;
                case 2051860114:
                    if (action.equals("ACTION_HEADSET_PLUGGED_IN")) {
                        c2 = 20;
                        break;
                    }
                    break;
                case 2090255099:
                    if (action.equals("VOLUME_ACTION")) {
                        c2 = 21;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    x0(intent.getIntExtra("EXTRA_ARG_1", 0), true);
                    return;
                case 1:
                    J0();
                    return;
                case 2:
                    o0(intent.getLongExtra("EXTRA_ARG_1", 0L));
                    return;
                case 3:
                    K0();
                    return;
                case 4:
                    L0();
                    return;
                case 5:
                    I0();
                    return;
                case 6:
                    A0(intent.getIntExtra("EXTRA_ARG_1", 0));
                    return;
                case 7:
                    E0(intent.getBooleanExtra("EXTRA_ARG_1", false));
                    return;
                case '\b':
                    String stringExtra = intent.getStringExtra("EXTRA_ARG_1");
                    tx0 tx0Var = stringExtra != null ? new tx0(stringExtra) : null;
                    boolean booleanExtra = intent.getBooleanExtra("EXTRA_ARG_2", false);
                    long longExtra = intent.getLongExtra("EXTRA_ARG_3", 0L);
                    long longExtra2 = intent.getLongExtra("EXTRA_ARG_4", 0L);
                    lo1<tx0, vd0> lo1Var = tx0Var != null ? new lo1<>(tx0Var, null) : null;
                    H0(booleanExtra);
                    a0(lo1Var, longExtra, longExtra2);
                    return;
                case '\t':
                    pw1Var = o0;
                    pw1Var.a();
                    return;
                case '\n':
                    c0();
                    return;
                case 11:
                    s0(intent.getFloatExtra("EXTRA_ARG_1", -1.0f));
                    return;
                case '\f':
                    y0(false);
                    return;
                case '\r':
                    G0(intent.getFloatExtra("EXTRA_ARG_1", 0.0f));
                    return;
                case 14:
                    pw1Var = r0;
                    pw1Var.a();
                    return;
                case 15:
                    uy.a.a();
                    J0();
                    return;
                case 16:
                    F0(intent.getFloatExtra("EXTRA_ARG_1", 20.0f));
                    return;
                case 17:
                    pw1Var = q0;
                    pw1Var.a();
                    return;
                case 18:
                    b0(true);
                    return;
                case 19:
                    b0(false);
                    return;
                case 20:
                    boolean K = j5.e().K(getApplicationContext(), "pref_resumeWhenHeadsetPluggedIn", true);
                    if (!this.F || !K) {
                        return;
                    }
                    c0();
                    return;
                case 21:
                    D0(intent.getIntExtra("EXTRA_ARG_1", 0));
                    return;
                default:
                    return;
            }
        }
    }

    public void a0(lo1<tx0, vd0> lo1Var, long j2, long j3) {
        e0(100L);
        this.E = false;
        this.F = false;
        this.q.removeCallbacksAndMessages(Integer.valueOf(this.K));
        this.B = false;
        this.C = lo1Var;
        tx0 B = B();
        if (B == null) {
            this.N.F();
            return;
        }
        if (j3 <= 0) {
            this.N.x(B.n(), this.I, j2);
        } else {
            this.N.y(B.n(), this.I, j2, j3);
        }
        X(true, null);
    }

    public void b0(boolean z) {
        this.F = z && O0();
        H0(false);
        e0(100L);
        this.E = false;
        if (j5.e().K(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.N.w();
        } else {
            G().b();
        }
    }

    public void c0() {
        H0(true);
        e0(100L);
        this.E = false;
        this.F = false;
        if (!G().s()) {
            Y(this.C);
        }
        if (j5.e().K(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.N.D();
        } else {
            G().start();
        }
    }

    public long d0() {
        if (G() == null) {
            return 0L;
        }
        return G().k();
    }

    public void e(boolean z) {
        RemoteControlClient remoteControlClient;
        lz1.a("abandonAudioFocus");
        if (!z && (remoteControlClient = this.z) != null) {
            remoteControlClient.setPlaybackState(2);
        }
        this.D = false;
        this.Q.abandonAudioFocus(this);
    }

    public final void e0(long j2) {
        this.q.removeCallbacks(this.W);
        if (this.v) {
            this.q.postDelayed(this.W, j2);
        }
    }

    public final void f0() {
        SharedPreferences p2 = j5.e().p(getApplicationContext());
        int M = j5.M(p2, "repeatmode", 0);
        if (M != 2 && M != 1) {
            M = 0;
        }
        x0(M, false);
        long N = j5.N(p2, "seekpos", 0L);
        lo1<tx0, vd0> lo1Var = new lo1<>(new tx0(j5.P(p2, "openedPath", "")), new q01());
        if (this.B) {
            return;
        }
        H0(false);
        Z(lo1Var, N);
    }

    public boolean g0() {
        if (this.Q.requestAudioFocus(this, 3, 1) == 1) {
            this.D = true;
            return true;
        }
        lz1.c("requestAudioFocus failed");
        this.D = false;
        return false;
    }

    public void h0() {
        if (!this.D || this.E) {
            return;
        }
        lz1.a("requestAudioLowerFocus, haveAudioFocus: " + this.D + "; lostAudioFocusWhilePlaying: " + this.E);
        if (this.Q.requestAudioFocus(this, 3, 3) == 1) {
            return;
        }
        lz1.c("requestAudioLowerFocus failed");
    }

    public final void i0() {
        com.daaw.avee.comp.playback.e G = G();
        if (G != null) {
            G.o();
        }
    }

    public void j0() {
        this.q.post(new e());
    }

    public void k0() {
        q0(H(), true);
    }

    public void l0() {
        this.q.post(new n());
    }

    public final void m0() {
        tx0 tx0Var;
        SharedPreferences.Editor edit = j5.e().p(getApplicationContext()).edit();
        edit.putInt("cardid", this.P);
        edit.putLong("seekpos", G().k());
        edit.putInt("repeatmode", this.O);
        lo1<tx0, vd0> lo1Var = this.C;
        edit.putString("openedPath", (lo1Var == null || (tx0Var = lo1Var.a) == null) ? "" : tx0Var.g());
        edit.apply();
    }

    public void n0() {
        this.q.post(new a());
    }

    public void o0(long j2) {
        this.E = false;
        this.F = false;
        if (G() == null) {
            return;
        }
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 > G().l()) {
            j2 = G().l();
        }
        G().g(j2);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i2) {
        if (i2 == -2 || i2 == -1) {
            if (G() != null) {
                boolean K = j5.e().K(getApplicationContext(), "pref_fadePlayPause", true);
                this.E = G().y();
                if (K) {
                    this.N.w();
                } else {
                    G().b();
                }
            } else {
                this.E = false;
            }
            M0();
        } else if (i2 != 1) {
        } else {
            boolean K2 = j5.e().K(getApplicationContext(), "pref_resumePlayingAfterAudioFocusGained", true);
            if (this.E && K2) {
                if (G() != null) {
                    if (j5.e().K(getApplicationContext(), "pref_fadePlayPause", true)) {
                        this.N.D();
                    } else {
                        G().start();
                    }
                }
                this.E = false;
            }
        }
    }

    @Override // com.daaw.mr0, android.app.Service
    public void onCreate() {
        super.onCreate();
        C0 = this;
        this.S = dx0.h();
        this.L = false;
        M();
        this.t[0] = false;
        this.q.post(this.Y);
        synchronized (this.Y) {
            if (!this.t[0]) {
                try {
                    this.Y.wait();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.daaw.mr0, android.app.Service
    public void onDestroy() {
        this.v = false;
        c0.a(this);
        this.u[0] = false;
        this.q.post(this.Z);
        synchronized (this.Z) {
            if (!this.u[0]) {
                try {
                    this.Z.wait();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
        super.onDestroy();
        this.S = null;
    }

    @Override // com.daaw.mr0, android.app.Service
    public void onStart(Intent intent, int i2) {
        this.w = i2;
        super.onStart(intent, i2);
    }

    @Override // com.daaw.mr0, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        M();
        return super.onStartCommand(intent, i2, i3);
    }

    public final void p0(int i2) {
        q0(i2, false);
    }

    public final void q0(int i2, boolean z) {
        int H;
        if (z || (H = H()) < 0 || H != i2) {
            boolean booleanValue = l0.a(Boolean.FALSE).booleanValue();
            float floatValue = m0.a(Float.valueOf(0.0f)).floatValue();
            float floatValue2 = n0.a(Float.valueOf(-1.0f)).floatValue();
            long k2 = this.N.s().k();
            this.N.z();
            this.N = i2 == 1 ? new com.daaw.avee.comp.playback.d(new oz(this, getResources().getString(R.string.musicSys_exo), this.X), this.X, floatValue2 * 1000.0f) : new com.daaw.avee.comp.playback.d(new vr0(this, getResources().getString(R.string.musicSys_native), this.X), this.X, floatValue2 * 1000.0f);
            this.N.s().e(booleanValue);
            this.N.s().x(floatValue);
            Z(this.C, k2);
        }
    }

    public void r0(int i2) {
        this.q.post(new o(i2));
    }

    public void s0(float f2) {
        this.N.A(f2 * 1000.0f);
    }

    public final void t0(b.c cVar) {
        com.daaw.avee.comp.playback.e G = G();
        if (G != null) {
            G.n(cVar);
        }
    }

    public void u0(b.c cVar) {
        this.q.post(new g(cVar));
    }

    public final void v0(Bitmap bitmap) {
        RemoteControlClient.MetadataEditor editMetadata = this.z.editMetadata(false);
        editMetadata.putBitmap(100, bitmap);
        editMetadata.apply();
    }

    public final void w0(Bitmap bitmap) {
        this.q.post(new c(bitmap));
    }

    public void x0(int i2, boolean z) {
        int i3;
        if (this.O == i2) {
            return;
        }
        this.O = i2;
        if (z) {
            if (i2 == 0) {
                i3 = R.string.playback_repeat_off;
            } else if (i2 == 1) {
                i3 = R.string.playback_repeat_current;
            } else if (i2 == 2) {
                i3 = R.string.playback_repeat_all;
            }
            W(i3);
        }
        i0.a(Integer.valueOf(this.O));
    }

    public void y() {
        N0(true);
        this.v = false;
        C0 = null;
        m0();
        d0.a(this);
        e(true);
        RemoteControlClient remoteControlClient = this.z;
        if (remoteControlClient != null) {
            try {
                this.Q.unregisterRemoteControlClient(remoteControlClient);
            } catch (Exception e2) {
                lz1.c("unregisterRemoteControlClient failed: " + e2.getMessage());
                e2.printStackTrace();
            }
            try {
                this.Q.unregisterMediaButtonEventReceiver(this.y);
            } catch (IllegalArgumentException e3) {
                lz1.c("unregisterMediaButtonEventReceiver failed: " + e3.getMessage());
            }
        }
        try {
            unregisterReceiver(this.x);
        } catch (IllegalArgumentException unused) {
        }
        this.N.z();
        this.N = new com.daaw.avee.comp.playback.d(com.daaw.avee.comp.playback.e.f, this.X, 0L);
        MediaAppWidgetProvider.c().e(this, E().h(), false, false, MediaPlaybackService.class);
    }

    public final void y0(boolean z) {
        this.M = z;
        M0();
    }

    public long z() {
        com.daaw.avee.comp.playback.e G = G();
        if (G == null) {
            return 0L;
        }
        return G.l();
    }

    public void z0(boolean z) {
        this.q.post(new m(z));
    }
}

package com.daaw;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.daaw.avee.comp.playback.AbstractC0738b;
import com.daaw.avee.comp.playback.C0729a;
import com.daaw.avee.comp.playback.InterfaceC0771e;
import com.daaw.pw1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class vr0 implements InterfaceC0771e, AbstractC0738b.InterfaceC0742d, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback {

    /* renamed from: q */
    public Context f30497q;

    /* renamed from: r */
    public InterfaceC0771e.InterfaceC0773b f30498r;

    /* renamed from: p */
    public final Object f30496p = new Object();

    /* renamed from: s */
    public int f30499s = 0;

    /* renamed from: t */
    public int f30500t = 1;

    /* renamed from: u */
    public Uri f30501u = null;

    /* renamed from: v */
    public float f30502v = 1.0f;

    /* renamed from: w */
    public boolean f30503w = false;

    /* renamed from: x */
    public long f30504x = 0;

    /* renamed from: y */
    public zr0 f30505y = null;

    /* renamed from: z */
    public ur0 f30506z = new ur0(this);

    /* renamed from: A */
    public WeakReference<SurfaceHolder> f30493A = new WeakReference<>(null);

    /* renamed from: B */
    public List<Object> f30494B = new LinkedList();

    /* renamed from: C */
    public C3364b[] f30495C = new C3364b[2];

    /* renamed from: com.daaw.vr0$a */
    /* loaded from: classes.dex */
    public class C3363a implements pw1.InterfaceC2649a {
        public C3363a() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            vr0.this.m6898B();
        }
    }

    /* renamed from: com.daaw.vr0$b */
    /* loaded from: classes.dex */
    public class C3364b implements MediaPlayer.OnPreparedListener {

        /* renamed from: p */
        public MediaPlayer f30510p = null;

        /* renamed from: q */
        public boolean f30511q = false;

        /* renamed from: r */
        public float f30512r = 1.0f;

        /* renamed from: s */
        public long f30513s = 0;

        /* renamed from: t */
        public float f30514t = 1.0f;

        /* renamed from: u */
        public float f30515u = 1.0f;

        /* renamed from: v */
        public float f30516v = 0.0f;

        /* renamed from: w */
        public volatile C3365a f30517w = new C3365a();

        /* renamed from: x */
        public int f30518x = -1;

        /* renamed from: y */
        public int f30519y = -1;

        /* renamed from: z */
        public int f30520z = -1;

        /* renamed from: A */
        public int f30508A = -1;

        /* renamed from: com.daaw.vr0$b$a */
        /* loaded from: classes.dex */
        public class C3365a {

            /* renamed from: a */
            public int f30521a = -1;

            /* renamed from: b */
            public boolean f30522b = false;

            /* renamed from: c */
            public int f30523c = 0;

            public C3365a() {
            }
        }

        public C3364b() {
        }

        /* renamed from: a */
        public boolean m6862a() {
            if (this.f30510p != null && m6861b() >= 2) {
                try {
                    for (MediaPlayer.TrackInfo trackInfo : this.f30510p.getTrackInfo()) {
                        if (trackInfo.getTrackType() == 1) {
                            return true;
                        }
                    }
                } catch (Exception e) {
                    lz1.m16363c(e.getMessage());
                }
                return false;
            }
            return false;
        }

        /* renamed from: b */
        public int m6861b() {
            return this.f30518x;
        }

        /* renamed from: c */
        public boolean m6860c() {
            return this.f30518x > 0;
        }

        /* renamed from: d */
        public boolean m6859d() {
            int i = this.f30518x;
            return ((i == 1 || i == 3) && this.f30511q) || i == 5;
        }

        /* renamed from: e */
        public void m6858e(long j) {
            this.f30513s = j;
            this.f30510p.prepareAsync();
        }

        /* renamed from: f */
        public void m6857f() {
            vr0.this.mo6876m(null);
            if (this.f30510p != null) {
                if (m6861b() > 2) {
                    this.f30510p.stop();
                }
                this.f30510p.release();
            }
            this.f30510p = null;
        }

        /* renamed from: g */
        public void m6856g(float f) {
            this.f30515u = f;
            m6848o();
        }

        /* renamed from: h */
        public boolean m6855h(float f) {
            boolean z = true;
            if (this.f30518x < 0) {
                return true;
            }
            boolean z2 = false;
            float f2 = this.f30515u + f;
            this.f30515u = f2;
            if (f2 <= 0.0f) {
                this.f30515u = 0.0f;
                z2 = true;
            }
            if (this.f30515u >= 1.0f) {
                this.f30515u = 1.0f;
            } else {
                z = z2;
            }
            m6848o();
            return z;
        }

        /* renamed from: i */
        public void m6854i(float f) {
            this.f30512r = f;
        }

        /* renamed from: j */
        public void m6853j(int i) {
            this.f30518x = i;
            C3365a c3365a = new C3365a();
            c3365a.f30521a = i;
            c3365a.f30522b = m6859d();
            MediaPlayer mediaPlayer = this.f30510p;
            c3365a.f30523c = mediaPlayer != null ? mediaPlayer.getAudioSessionId() : 0;
            this.f30517w = c3365a;
        }

        /* renamed from: k */
        public void m6852k(int i) {
            if (this.f30510p != null && m6861b() >= 2) {
                try {
                    this.f30510p.setVideoScalingMode(vr0.m6863z(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: l */
        public void m6851l(Surface surface) {
            if (this.f30510p == null) {
                return;
            }
            if (surface == null || !surface.isValid()) {
                this.f30510p.setSurface(null);
            } else {
                this.f30510p.setSurface(surface);
            }
        }

        /* renamed from: m */
        public void m6850m(float f) {
            this.f30514t = f;
            m6848o();
        }

        /* renamed from: n */
        public void m6849n(float f) {
            this.f30516v = f;
            m6848o();
        }

        /* renamed from: o */
        public void m6848o() {
            if (this.f30518x < 0) {
                return;
            }
            float min = Math.min(1.0f - this.f30516v, 1.0f);
            float min2 = Math.min(this.f30516v + 1.0f, 1.0f);
            MediaPlayer mediaPlayer = this.f30510p;
            float f = this.f30515u;
            float f2 = this.f30514t;
            mediaPlayer.setVolume(min * f * f2, min2 * f * f2);
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            m6853j(3);
            mediaPlayer.seekTo((int) this.f30513s);
            m6856g(this.f30512r);
            if (this.f30511q) {
                vr0.this.m6889K(false);
            }
            vr0.this.f30498r.mo26657a(true, null);
        }
    }

    public vr0(Context context, String str, InterfaceC0771e.InterfaceC0773b interfaceC0773b) {
        int i = 0;
        this.f30497q = context;
        this.f30498r = interfaceC0773b;
        while (true) {
            C3364b[] c3364bArr = this.f30495C;
            if (i >= c3364bArr.length) {
                C3146ty.f28246b.m12989b(new C3363a(), this.f30494B);
                return;
            } else {
                c3364bArr[i] = new C3364b();
                i++;
            }
        }
    }

    /* renamed from: z */
    public static int m6863z(int i) {
        return (i != 1 && i == 2) ? 2 : 1;
    }

    /* renamed from: B */
    public void m6898B() {
        synchronized (this.f30496p) {
            zr0 zr0Var = this.f30505y;
            if (zr0Var != null && SystemClock.elapsedRealtime() - this.f30504x > 8000) {
                zr0Var.m1971c();
                this.f30505y = null;
            }
        }
    }

    /* renamed from: C */
    public void m6897C(int i) {
        C3364b[] c3364bArr = this.f30495C;
        if (c3364bArr[i] == null) {
            c3364bArr[i] = new C3364b();
        }
        if (this.f30495C[i].f30510p == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnPreparedListener(this.f30495C[i]);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setWakeMode(this.f30497q, 1);
            this.f30495C[i].f30510p = mediaPlayer;
        }
        this.f30495C[i].f30510p.reset();
        m6891I(i, 0);
        this.f30495C[i].f30511q = false;
    }

    /* renamed from: D */
    public void m6896D() {
        int i = this.f30499s;
        this.f30499s = this.f30500t;
        this.f30500t = i;
    }

    /* renamed from: E */
    public void m6895E(int i) {
        if (i == 0) {
            lz1.m16363c("trying to destroy currentPlayer");
            return;
        }
        int i2 = this.f30499s;
        int i3 = this.f30500t;
        if (i2 == i3) {
            return;
        }
        m6893G(i3);
    }

    /* renamed from: F */
    public void m6894F(int i, Uri uri, float f, long j) {
        C3364b c3364b;
        m6897C(i);
        try {
            this.f30495C[i].f30510p.setDataSource(this.f30497q, uri);
            m6891I(i, 1);
            this.f30495C[i].f30510p.setAudioStreamType(3);
            this.f30495C[i].m6852k(this.f30498r.mo26646l());
            mo6876m(this.f30498r.mo26644n());
            this.f30495C[this.f30499s].m6856g(f);
            this.f30495C[this.f30499s].m6854i(f);
            this.f30495C[i].m6858e(j);
        } catch (IOException e) {
            this.f30498r.mo26657a(true, "Failed open media source");
            lz1.m16363c(e.getMessage());
            m6891I(i, -1);
            c3364b = this.f30495C[i];
            onCompletion(c3364b.f30510p);
        } catch (IllegalArgumentException e2) {
            this.f30498r.mo26657a(true, "Invalid media source");
            lz1.m16363c(e2.getMessage());
            m6891I(i, -1);
            c3364b = this.f30495C[i];
            onCompletion(c3364b.f30510p);
        }
    }

    /* renamed from: G */
    public void m6893G(int i) {
        m6892H(i, false);
    }

    /* renamed from: H */
    public void m6892H(int i, boolean z) {
        C3364b[] c3364bArr = this.f30495C;
        if (i >= c3364bArr.length) {
            return;
        }
        c3364bArr[i].m6857f();
        m6891I(i, -2);
        this.f30495C[i].f30511q = false;
    }

    /* renamed from: I */
    public void m6891I(int i, int i2) {
        this.f30495C[i].m6853j(i2);
        ur0 ur0Var = this.f30506z;
        if (ur0Var == null || i != this.f30499s) {
            return;
        }
        ur0Var.m26722h(this.f30495C[i].f30517w.f30523c);
        this.f30506z.m26721i();
    }

    /* renamed from: J */
    public void m6890J(boolean z, float f) {
        this.f30503w = z;
        this.f30502v = f;
        int i = 0;
        if (z) {
            C3364b[] c3364bArr = this.f30495C;
            int length = c3364bArr.length;
            while (i < length) {
                C3364b c3364b = c3364bArr[i];
                if (c3364b != null) {
                    c3364b.m6850m(0.0f);
                }
                i++;
            }
            return;
        }
        C3364b[] c3364bArr2 = this.f30495C;
        int length2 = c3364bArr2.length;
        while (i < length2) {
            C3364b c3364b2 = c3364bArr2[i];
            if (c3364b2 != null) {
                c3364b2.m6850m(this.f30502v);
            }
            i++;
        }
    }

    /* renamed from: K */
    public final void m6889K(boolean z) {
        if (this.f30495C[this.f30499s].m6861b() < 2) {
            this.f30495C[this.f30499s].f30511q = true;
        } else if (this.f30495C[this.f30499s].m6861b() < 3) {
            C3364b[] c3364bArr = this.f30495C;
            int i = this.f30499s;
            c3364bArr[i].f30511q = true;
            try {
                c3364bArr[i].f30510p.prepareAsync();
            } catch (IllegalStateException | Exception unused) {
                m6891I(this.f30499s, -1);
            }
        } else {
            if (this.f30498r.mo26650h()) {
                this.f30495C[this.f30499s].f30510p.start();
                m6891I(this.f30499s, 5);
            }
            if (z) {
                this.f30498r.mo26657a(false, null);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: a */
    public void mo6888a() {
        ur0 ur0Var = this.f30506z;
        if (ur0Var != null) {
            ur0Var.m26720j();
            this.f30506z = null;
        }
        SurfaceHolder surfaceHolder = this.f30493A.get();
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            this.f30493A = new WeakReference<>(null);
        }
        m6893G(this.f30499s);
        m6893G(this.f30500t);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: b */
    public void mo6887b() {
        if (this.f30495C[this.f30499s].m6861b() < 4) {
            return;
        }
        this.f30495C[this.f30499s].f30510p.pause();
        m6891I(this.f30499s, 4);
        this.f30498r.mo26657a(false, null);
    }

    @Override // com.daaw.avee.comp.playback.AbstractC0738b.InterfaceC0742d
    /* renamed from: c */
    public void mo6886c(AbstractC0738b.C0740b c0740b) {
        this.f30498r.mo26655c(c0740b);
    }

    @Override // com.daaw.avee.comp.playback.AbstractC0738b.InterfaceC0742d
    /* renamed from: d */
    public AbstractC0738b.C0741c mo6885d(String str) {
        return this.f30498r.mo26654d(str);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: e */
    public void mo6884e(boolean z) {
        m6890J(z, this.f30502v);
        this.f30498r.mo26652f(z);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: f */
    public boolean mo6883f() {
        return this.f30503w;
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: g */
    public void mo6882g(long j) {
        if (this.f30495C[this.f30499s].m6861b() < 3) {
            return;
        }
        this.f30495C[this.f30499s].m6856g(1.0f);
        this.f30495C[this.f30499s].f30510p.seekTo((int) j);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: h */
    public hx0 mo6881h() {
        if (this.f30495C[this.f30499s].m6861b() < 2) {
            return null;
        }
        return new hx0(this.f30495C[this.f30499s].f30510p.getDuration(), this.f30495C[this.f30499s].m6862a());
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: i */
    public C0729a mo6880i(C0729a c0729a, C0729a.C0736g c0736g) {
        long j;
        C0729a m1973a;
        if (c0729a == null) {
            return null;
        }
        C3364b.C3365a c3365a = this.f30495C[this.f30499s].f30517w;
        if (!c0736g.f3977f) {
            if (c3365a.f30521a < 3) {
                return null;
            }
            if (!c3365a.f30522b) {
                return c0729a;
            }
        }
        int i = c3365a.f30523c;
        synchronized (this.f30496p) {
            zr0 zr0Var = this.f30505y;
            if (zr0Var == null) {
                zr0Var = new zr0();
            }
            this.f30504x = SystemClock.elapsedRealtime();
            boolean z = true;
            if (c0736g.f3978g < 0) {
                j = 0;
                if (!c0736g.f3976e && !c0736g.f3977f) {
                    z = false;
                }
            } else {
                lz1.m16363c("overridePositionUs not supported on Native");
                j = 0;
                if (!c0736g.f3976e && !c0736g.f3977f) {
                    z = false;
                }
            }
            m1973a = zr0Var.m1973a(j, c0736g, c0729a, i, z);
            this.f30505y = zr0Var;
        }
        return m1973a;
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: j */
    public void mo6879j(boolean z, boolean z2, float f, long j) {
        if (z) {
            int i = this.f30499s;
            int i2 = this.f30500t;
            if (i != i2) {
                m6893G(i2);
            }
        } else if (this.f30495C[this.f30499s].m6860c()) {
            m6896D();
        }
        Uri uri = this.f30501u;
        if (uri == null || uri.equals(Uri.EMPTY)) {
            lz1.m16363c("nextDataSource is null");
            if (z2) {
                m6889K(true);
                return;
            } else {
                mo6887b();
                return;
            }
        }
        m6894F(this.f30499s, this.f30501u, f, j);
        if (z2) {
            m6889K(true);
        } else {
            mo6887b();
        }
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: k */
    public long mo6878k() {
        if (this.f30495C[this.f30499s].m6861b() < 2) {
            return 0L;
        }
        return this.f30495C[this.f30499s].f30510p.getCurrentPosition();
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: l */
    public long mo6877l() {
        if (this.f30495C[this.f30499s].m6861b() < 2) {
            return 0L;
        }
        return this.f30495C[this.f30499s].f30510p.getDuration();
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: m */
    public void mo6876m(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f30493A = new WeakReference<>(surfaceHolder);
            surfaceHolder.addCallback(this);
            surfaceCreated(surfaceHolder);
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f30493A.get();
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this);
            this.f30493A = new WeakReference<>(null);
        }
        surfaceDestroyed(null);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: n */
    public void mo6875n(AbstractC0738b.C0741c c0741c) {
        ur0 ur0Var = this.f30506z;
        if (ur0Var != null) {
            ur0Var.m26717m(c0741c);
        }
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: o */
    public void mo6874o() {
        synchronized (this.f30496p) {
            zr0 zr0Var = this.f30505y;
            if (zr0Var == null) {
                return;
            }
            zr0Var.m1970d();
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (this.f30495C[this.f30499s].f30510p == mediaPlayer) {
            this.f30498r.mo26648j(true, i);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        C3364b[] c3364bArr = this.f30495C;
        int i = this.f30499s;
        if (c3364bArr[i].f30510p == mediaPlayer) {
            if (c3364bArr[i].m6861b() < 0) {
                this.f30498r.mo26651g(true);
            } else {
                this.f30498r.mo26643o();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C3364b[] c3364bArr = this.f30495C;
        int i3 = this.f30499s;
        if (c3364bArr[i3].f30510p != mediaPlayer) {
            i3 = this.f30500t;
            if (c3364bArr[i3].f30510p != mediaPlayer) {
                C2691q6.m12748j();
                this.f30498r.mo26657a(false, "Error: " + i + "," + i2);
                return false;
            }
        }
        m6891I(i3, -1);
        this.f30498r.mo26657a(false, "Error: " + i + "," + i2);
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.f30498r.mo26649i(i, i2, (i * 1.0f) / i2);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: p */
    public AbstractC0738b.C0740b mo6873p() {
        ur0 ur0Var = this.f30506z;
        if (ur0Var != null) {
            return ur0Var.m26726d();
        }
        return null;
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: q */
    public void mo6872q(InterfaceC0771e.InterfaceC0773b interfaceC0773b) {
        this.f30498r = interfaceC0773b;
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: r */
    public void mo6871r(wd0 wd0Var) {
        this.f30501u = wd0Var.mo6166a();
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: s */
    public boolean mo6870s() {
        return this.f30495C[this.f30499s].m6860c();
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    public void start() {
        m6889K(true);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    public void stop() {
        if (this.f30495C[this.f30499s].m6861b() < 2) {
            return;
        }
        this.f30495C[this.f30499s].f30510p.stop();
        m6891I(this.f30499s, 2);
        this.f30498r.mo26657a(false, null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f30495C[this.f30500t].m6851l(null);
            this.f30495C[this.f30499s].m6851l(surfaceHolder.getSurface());
            return;
        }
        this.f30495C[this.f30500t].m6851l(null);
        this.f30495C[this.f30499s].m6851l(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i = this.f30499s;
        int i2 = this.f30500t;
        if (i != i2) {
            this.f30495C[i2].m6851l(null);
        }
        this.f30495C[this.f30499s].m6851l(null);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: t */
    public boolean mo6869t(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f30499s;
        } else {
            i2 = this.f30500t;
            if (this.f30499s == i2) {
                return true;
            }
        }
        C3364b[] c3364bArr = this.f30495C;
        return c3364bArr[i2] == null || c3364bArr[i2].m6855h(f);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: u */
    public void mo6868u(int i) {
        this.f30495C[this.f30499s].m6852k(i);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: v */
    public void mo6867v() {
        if (this.f30499s == this.f30500t) {
            return;
        }
        m6895E(1);
    }

    @Override // com.daaw.avee.comp.playback.AbstractC0738b.InterfaceC0742d
    /* renamed from: w */
    public boolean mo6866w(String str) {
        return this.f30498r.mo26653e(str);
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: x */
    public void mo6865x(float f) {
        C3364b[] c3364bArr;
        for (C3364b c3364b : this.f30495C) {
            if (c3364b != null) {
                c3364b.m6849n(f);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.InterfaceC0771e
    /* renamed from: y */
    public boolean mo6864y() {
        return this.f30495C[this.f30499s].m6859d();
    }
}

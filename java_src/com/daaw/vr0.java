package com.daaw;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.daaw.avee.comp.playback.a;
import com.daaw.avee.comp.playback.b;
import com.daaw.avee.comp.playback.e;
import com.daaw.pw1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class vr0 implements com.daaw.avee.comp.playback.e, b.d, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback {
    public Context q;
    public e.b r;
    public final Object p = new Object();
    public int s = 0;
    public int t = 1;
    public Uri u = null;
    public float v = 1.0f;
    public boolean w = false;
    public long x = 0;
    public zr0 y = null;
    public ur0 z = new ur0(this);
    public WeakReference<SurfaceHolder> A = new WeakReference<>(null);
    public List<Object> B = new LinkedList();
    public b[] C = new b[2];

    /* loaded from: classes.dex */
    public class a implements pw1.a {
        public a() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            vr0.this.B();
        }
    }

    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnPreparedListener {
        public MediaPlayer p = null;
        public boolean q = false;
        public float r = 1.0f;
        public long s = 0;
        public float t = 1.0f;
        public float u = 1.0f;
        public float v = 0.0f;
        public volatile a w = new a();
        public int x = -1;
        public int y = -1;
        public int z = -1;
        public int A = -1;

        /* loaded from: classes.dex */
        public class a {
            public int a = -1;
            public boolean b = false;
            public int c = 0;

            public a() {
            }
        }

        public b() {
        }

        public boolean a() {
            if (this.p != null && b() >= 2) {
                try {
                    for (MediaPlayer.TrackInfo trackInfo : this.p.getTrackInfo()) {
                        if (trackInfo.getTrackType() == 1) {
                            return true;
                        }
                    }
                } catch (Exception e) {
                    lz1.c(e.getMessage());
                }
                return false;
            }
            return false;
        }

        public int b() {
            return this.x;
        }

        public boolean c() {
            return this.x > 0;
        }

        public boolean d() {
            int i = this.x;
            return ((i == 1 || i == 3) && this.q) || i == 5;
        }

        public void e(long j) {
            this.s = j;
            this.p.prepareAsync();
        }

        public void f() {
            vr0.this.m(null);
            if (this.p != null) {
                if (b() > 2) {
                    this.p.stop();
                }
                this.p.release();
            }
            this.p = null;
        }

        public void g(float f) {
            this.u = f;
            o();
        }

        public boolean h(float f) {
            boolean z = true;
            if (this.x < 0) {
                return true;
            }
            boolean z2 = false;
            float f2 = this.u + f;
            this.u = f2;
            if (f2 <= 0.0f) {
                this.u = 0.0f;
                z2 = true;
            }
            if (this.u >= 1.0f) {
                this.u = 1.0f;
            } else {
                z = z2;
            }
            o();
            return z;
        }

        public void i(float f) {
            this.r = f;
        }

        public void j(int i) {
            this.x = i;
            a aVar = new a();
            aVar.a = i;
            aVar.b = d();
            MediaPlayer mediaPlayer = this.p;
            aVar.c = mediaPlayer != null ? mediaPlayer.getAudioSessionId() : 0;
            this.w = aVar;
        }

        public void k(int i) {
            if (this.p != null && b() >= 2) {
                try {
                    this.p.setVideoScalingMode(vr0.z(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void l(Surface surface) {
            if (this.p == null) {
                return;
            }
            if (surface == null || !surface.isValid()) {
                this.p.setSurface(null);
            } else {
                this.p.setSurface(surface);
            }
        }

        public void m(float f) {
            this.t = f;
            o();
        }

        public void n(float f) {
            this.v = f;
            o();
        }

        public void o() {
            if (this.x < 0) {
                return;
            }
            float min = Math.min(1.0f - this.v, 1.0f);
            float min2 = Math.min(this.v + 1.0f, 1.0f);
            MediaPlayer mediaPlayer = this.p;
            float f = this.u;
            float f2 = this.t;
            mediaPlayer.setVolume(min * f * f2, min2 * f * f2);
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            j(3);
            mediaPlayer.seekTo((int) this.s);
            g(this.r);
            if (this.q) {
                vr0.this.K(false);
            }
            vr0.this.r.a(true, null);
        }
    }

    public vr0(Context context, String str, e.b bVar) {
        int i = 0;
        this.q = context;
        this.r = bVar;
        while (true) {
            b[] bVarArr = this.C;
            if (i >= bVarArr.length) {
                ty.b.b(new a(), this.B);
                return;
            } else {
                bVarArr[i] = new b();
                i++;
            }
        }
    }

    public static int z(int i) {
        return (i != 1 && i == 2) ? 2 : 1;
    }

    public void B() {
        synchronized (this.p) {
            zr0 zr0Var = this.y;
            if (zr0Var != null && SystemClock.elapsedRealtime() - this.x > 8000) {
                zr0Var.c();
                this.y = null;
            }
        }
    }

    public void C(int i) {
        b[] bVarArr = this.C;
        if (bVarArr[i] == null) {
            bVarArr[i] = new b();
        }
        if (this.C[i].p == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnPreparedListener(this.C[i]);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setWakeMode(this.q, 1);
            this.C[i].p = mediaPlayer;
        }
        this.C[i].p.reset();
        I(i, 0);
        this.C[i].q = false;
    }

    public void D() {
        int i = this.s;
        this.s = this.t;
        this.t = i;
    }

    public void E(int i) {
        if (i == 0) {
            lz1.c("trying to destroy currentPlayer");
            return;
        }
        int i2 = this.s;
        int i3 = this.t;
        if (i2 == i3) {
            return;
        }
        G(i3);
    }

    public void F(int i, Uri uri, float f, long j) {
        b bVar;
        C(i);
        try {
            this.C[i].p.setDataSource(this.q, uri);
            I(i, 1);
            this.C[i].p.setAudioStreamType(3);
            this.C[i].k(this.r.l());
            m(this.r.n());
            this.C[this.s].g(f);
            this.C[this.s].i(f);
            this.C[i].e(j);
        } catch (IOException e) {
            this.r.a(true, "Failed open media source");
            lz1.c(e.getMessage());
            I(i, -1);
            bVar = this.C[i];
            onCompletion(bVar.p);
        } catch (IllegalArgumentException e2) {
            this.r.a(true, "Invalid media source");
            lz1.c(e2.getMessage());
            I(i, -1);
            bVar = this.C[i];
            onCompletion(bVar.p);
        }
    }

    public void G(int i) {
        H(i, false);
    }

    public void H(int i, boolean z) {
        b[] bVarArr = this.C;
        if (i >= bVarArr.length) {
            return;
        }
        bVarArr[i].f();
        I(i, -2);
        this.C[i].q = false;
    }

    public void I(int i, int i2) {
        this.C[i].j(i2);
        ur0 ur0Var = this.z;
        if (ur0Var == null || i != this.s) {
            return;
        }
        ur0Var.h(this.C[i].w.c);
        this.z.i();
    }

    public void J(boolean z, float f) {
        this.w = z;
        this.v = f;
        int i = 0;
        if (z) {
            b[] bVarArr = this.C;
            int length = bVarArr.length;
            while (i < length) {
                b bVar = bVarArr[i];
                if (bVar != null) {
                    bVar.m(0.0f);
                }
                i++;
            }
            return;
        }
        b[] bVarArr2 = this.C;
        int length2 = bVarArr2.length;
        while (i < length2) {
            b bVar2 = bVarArr2[i];
            if (bVar2 != null) {
                bVar2.m(this.v);
            }
            i++;
        }
    }

    public final void K(boolean z) {
        if (this.C[this.s].b() < 2) {
            this.C[this.s].q = true;
        } else if (this.C[this.s].b() < 3) {
            b[] bVarArr = this.C;
            int i = this.s;
            bVarArr[i].q = true;
            try {
                bVarArr[i].p.prepareAsync();
            } catch (IllegalStateException | Exception unused) {
                I(this.s, -1);
            }
        } else {
            if (this.r.h()) {
                this.C[this.s].p.start();
                I(this.s, 5);
            }
            if (z) {
                this.r.a(false, null);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void a() {
        ur0 ur0Var = this.z;
        if (ur0Var != null) {
            ur0Var.j();
            this.z = null;
        }
        SurfaceHolder surfaceHolder = this.A.get();
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            this.A = new WeakReference<>(null);
        }
        G(this.s);
        G(this.t);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void b() {
        if (this.C[this.s].b() < 4) {
            return;
        }
        this.C[this.s].p.pause();
        I(this.s, 4);
        this.r.a(false, null);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public void c(b.C0042b c0042b) {
        this.r.c(c0042b);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public b.c d(String str) {
        return this.r.d(str);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void e(boolean z) {
        J(z, this.v);
        this.r.f(z);
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean f() {
        return this.w;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void g(long j) {
        if (this.C[this.s].b() < 3) {
            return;
        }
        this.C[this.s].g(1.0f);
        this.C[this.s].p.seekTo((int) j);
    }

    @Override // com.daaw.avee.comp.playback.e
    public hx0 h() {
        if (this.C[this.s].b() < 2) {
            return null;
        }
        return new hx0(this.C[this.s].p.getDuration(), this.C[this.s].a());
    }

    @Override // com.daaw.avee.comp.playback.e
    public com.daaw.avee.comp.playback.a i(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
        long j;
        com.daaw.avee.comp.playback.a a2;
        if (aVar == null) {
            return null;
        }
        b.a aVar2 = this.C[this.s].w;
        if (!gVar.f) {
            if (aVar2.a < 3) {
                return null;
            }
            if (!aVar2.b) {
                return aVar;
            }
        }
        int i = aVar2.c;
        synchronized (this.p) {
            zr0 zr0Var = this.y;
            if (zr0Var == null) {
                zr0Var = new zr0();
            }
            this.x = SystemClock.elapsedRealtime();
            boolean z = true;
            if (gVar.g < 0) {
                j = 0;
                if (!gVar.e && !gVar.f) {
                    z = false;
                }
            } else {
                lz1.c("overridePositionUs not supported on Native");
                j = 0;
                if (!gVar.e && !gVar.f) {
                    z = false;
                }
            }
            a2 = zr0Var.a(j, gVar, aVar, i, z);
            this.y = zr0Var;
        }
        return a2;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void j(boolean z, boolean z2, float f, long j) {
        if (z) {
            int i = this.s;
            int i2 = this.t;
            if (i != i2) {
                G(i2);
            }
        } else if (this.C[this.s].c()) {
            D();
        }
        Uri uri = this.u;
        if (uri == null || uri.equals(Uri.EMPTY)) {
            lz1.c("nextDataSource is null");
            if (z2) {
                K(true);
                return;
            } else {
                b();
                return;
            }
        }
        F(this.s, this.u, f, j);
        if (z2) {
            K(true);
        } else {
            b();
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public long k() {
        if (this.C[this.s].b() < 2) {
            return 0L;
        }
        return this.C[this.s].p.getCurrentPosition();
    }

    @Override // com.daaw.avee.comp.playback.e
    public long l() {
        if (this.C[this.s].b() < 2) {
            return 0L;
        }
        return this.C[this.s].p.getDuration();
    }

    @Override // com.daaw.avee.comp.playback.e
    public void m(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.A = new WeakReference<>(surfaceHolder);
            surfaceHolder.addCallback(this);
            surfaceCreated(surfaceHolder);
            return;
        }
        SurfaceHolder surfaceHolder2 = this.A.get();
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this);
            this.A = new WeakReference<>(null);
        }
        surfaceDestroyed(null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void n(b.c cVar) {
        ur0 ur0Var = this.z;
        if (ur0Var != null) {
            ur0Var.m(cVar);
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void o() {
        synchronized (this.p) {
            zr0 zr0Var = this.y;
            if (zr0Var == null) {
                return;
            }
            zr0Var.d();
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (this.C[this.s].p == mediaPlayer) {
            this.r.j(true, i);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        b[] bVarArr = this.C;
        int i = this.s;
        if (bVarArr[i].p == mediaPlayer) {
            if (bVarArr[i].b() < 0) {
                this.r.g(true);
            } else {
                this.r.o();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        b[] bVarArr = this.C;
        int i3 = this.s;
        if (bVarArr[i3].p != mediaPlayer) {
            i3 = this.t;
            if (bVarArr[i3].p != mediaPlayer) {
                q6.j();
                this.r.a(false, "Error: " + i + "," + i2);
                return false;
            }
        }
        I(i3, -1);
        this.r.a(false, "Error: " + i + "," + i2);
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
        this.r.i(i, i2, (i * 1.0f) / i2);
    }

    @Override // com.daaw.avee.comp.playback.e
    public b.C0042b p() {
        ur0 ur0Var = this.z;
        if (ur0Var != null) {
            return ur0Var.d();
        }
        return null;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void q(e.b bVar) {
        this.r = bVar;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void r(wd0 wd0Var) {
        this.u = wd0Var.a();
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean s() {
        return this.C[this.s].c();
    }

    @Override // com.daaw.avee.comp.playback.e
    public void start() {
        K(true);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void stop() {
        if (this.C[this.s].b() < 2) {
            return;
        }
        this.C[this.s].p.stop();
        I(this.s, 2);
        this.r.a(false, null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.C[this.t].l(null);
            this.C[this.s].l(surfaceHolder.getSurface());
            return;
        }
        this.C[this.t].l(null);
        this.C[this.s].l(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i = this.s;
        int i2 = this.t;
        if (i != i2) {
            this.C[i2].l(null);
        }
        this.C[this.s].l(null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean t(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.s;
        } else {
            i2 = this.t;
            if (this.s == i2) {
                return true;
            }
        }
        b[] bVarArr = this.C;
        return bVarArr[i2] == null || bVarArr[i2].h(f);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void u(int i) {
        this.C[this.s].k(i);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void v() {
        if (this.s == this.t) {
            return;
        }
        E(1);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public boolean w(String str) {
        return this.r.e(str);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void x(float f) {
        b[] bVarArr;
        for (b bVar : this.C) {
            if (bVar != null) {
                bVar.n(f);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean y() {
        return this.C[this.s].d();
    }
}

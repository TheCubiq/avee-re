package com.daaw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbei;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c24 extends e24 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final Map I;
    public int A;
    public int B;
    public w24 C;
    public final boolean D;
    public int E;
    public d24 F;
    public boolean G;
    public Integer H;
    public final y24 s;
    public final z24 t;
    public final boolean u;
    public int v;
    public int w;
    public MediaPlayer x;
    public Uri y;
    public int z;

    static {
        HashMap hashMap = new HashMap();
        I = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public c24(Context context, y24 y24Var, boolean z, boolean z2, x24 x24Var, z24 z24Var, Integer num) {
        super(context, num);
        this.v = 0;
        this.w = 0;
        this.G = false;
        this.H = null;
        setSurfaceTextureListener(this);
        this.s = y24Var;
        this.t = z24Var;
        this.D = z;
        this.u = z2;
        z24Var.a(this);
    }

    public static /* bridge */ /* synthetic */ void I(c24 c24Var, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        String string;
        String str;
        MediaFormat format;
        if (!((Boolean) zzba.zzc().b(g93.F1)).booleanValue() || c24Var.s == null || mediaPlayer == null || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
            if (trackInfo2 != null) {
                int trackType = trackInfo2.getTrackType();
                if (trackType == 1) {
                    MediaFormat format2 = trackInfo2.getFormat();
                    if (format2 != null) {
                        if (format2.containsKey("frame-rate")) {
                            try {
                                hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                            } catch (ClassCastException unused) {
                                hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                            }
                        }
                        if (format2.containsKey("bitrate")) {
                            Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                            c24Var.H = valueOf;
                            hashMap.put("bitRate", String.valueOf(valueOf));
                        }
                        if (format2.containsKey("width") && format2.containsKey("height")) {
                            hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                        }
                        if (format2.containsKey("mime")) {
                            hashMap.put("videoMime", format2.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                            string = format2.getString("codecs-string");
                            str = "videoCodec";
                            hashMap.put(str, string);
                        }
                    }
                } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                    if (format.containsKey("mime")) {
                        hashMap.put("audioMime", format.getString("mime"));
                    }
                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                        string = format.getString("codecs-string");
                        str = "audioCodec";
                        hashMap.put(str, string);
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        c24Var.s.T("onMetadataEvent", hashMap);
    }

    public final void B() {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.y == null || surfaceTexture == null) {
            return;
        }
        C(false);
        try {
            zzt.zzk();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.x = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.x.setOnCompletionListener(this);
            this.x.setOnErrorListener(this);
            this.x.setOnInfoListener(this);
            this.x.setOnPreparedListener(this);
            this.x.setOnVideoSizeChangedListener(this);
            this.B = 0;
            if (this.D) {
                w24 w24Var = new w24(getContext());
                this.C = w24Var;
                w24Var.c(surfaceTexture, getWidth(), getHeight());
                this.C.start();
                SurfaceTexture a = this.C.a();
                if (a != null) {
                    surfaceTexture = a;
                } else {
                    this.C.d();
                    this.C = null;
                }
            }
            this.x.setDataSource(getContext(), this.y);
            zzt.zzl();
            this.x.setSurface(new Surface(surfaceTexture));
            this.x.setAudioStreamType(3);
            this.x.setScreenOnWhilePlaying(true);
            this.x.prepareAsync();
            D(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            k04.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.y)), e);
            onError(this.x, 1, 0);
        }
    }

    public final void C(boolean z) {
        zze.zza("AdMediaPlayerView release");
        w24 w24Var = this.C;
        if (w24Var != null) {
            w24Var.d();
            this.C = null;
        }
        MediaPlayer mediaPlayer = this.x;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.x.release();
            this.x = null;
            D(0);
            if (z) {
                this.w = 0;
            }
        }
    }

    public final void D(int i) {
        if (i == 3) {
            this.t.c();
            this.q.b();
        } else if (this.v == 3) {
            this.t.e();
            this.q.c();
        }
        this.v = i;
    }

    public final void E(float f) {
        MediaPlayer mediaPlayer = this.x;
        if (mediaPlayer == null) {
            k04.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
        try {
            mediaPlayer.setVolume(f, f);
        } catch (IllegalStateException unused) {
        }
    }

    public final boolean F() {
        int i;
        return (this.x == null || (i = this.v) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final /* synthetic */ void c(int i) {
        d24 d24Var = this.F;
        if (d24Var != null) {
            d24Var.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.daaw.e24
    public final int h() {
        if (F()) {
            return this.x.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.daaw.e24
    public final int i() {
        if (Build.VERSION.SDK_INT < 26 || !F()) {
            return -1;
        }
        return this.x.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.daaw.e24
    public final int j() {
        if (F()) {
            return this.x.getDuration();
        }
        return -1;
    }

    @Override // com.daaw.e24
    public final int k() {
        MediaPlayer mediaPlayer = this.x;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.daaw.e24
    public final int l() {
        MediaPlayer mediaPlayer = this.x;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.daaw.e24
    public final long m() {
        return 0L;
    }

    @Override // com.daaw.e24
    public final long n() {
        if (this.H != null) {
            return (o() * this.B) / 100;
        }
        return -1L;
    }

    @Override // com.daaw.e24
    public final long o() {
        if (this.H != null) {
            return j() * this.H.intValue();
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.B = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        D(5);
        this.w = 5;
        zzs.zza.post(new s14(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = I;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        k04.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        D(-1);
        this.w = -1;
        zzs.zza.post(new t14(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = I;
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r1 > r6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.z
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.A
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.z
            if (r2 <= 0) goto L7e
            int r2 = r5.A
            if (r2 <= 0) goto L7e
            com.daaw.w24 r2 = r5.C
            if (r2 != 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L41
            int r0 = r5.z
            int r1 = r0 * r7
            int r2 = r5.A
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7e
        L3c:
            if (r1 <= r3) goto L63
            int r1 = r3 / r0
            goto L54
        L41:
            r0 = 1073741824(0x40000000, float:2.0)
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.A
            int r0 = r0 * r6
            int r2 = r5.z
            int r0 = r0 / r2
            if (r1 != r3) goto L53
            if (r0 <= r7) goto L53
            goto L63
        L53:
            r1 = r0
        L54:
            r0 = r6
            goto L7e
        L56:
            if (r1 != r2) goto L67
            int r1 = r5.z
            int r1 = r1 * r7
            int r2 = r5.A
            int r1 = r1 / r2
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
        L63:
            r0 = r6
            goto L3a
        L65:
            r0 = r1
            goto L3a
        L67:
            int r2 = r5.z
            int r4 = r5.A
            if (r1 != r3) goto L73
            if (r4 <= r7) goto L73
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L75
        L73:
            r1 = r2
            r7 = r4
        L75:
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L54
        L7e:
            r5.setMeasuredDimension(r0, r1)
            com.daaw.w24 r6 = r5.C
            if (r6 == 0) goto L88
            r6.b(r0, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.c24.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView prepared");
        D(2);
        this.t.b();
        zzs.zza.post(new r14(this, mediaPlayer));
        this.z = mediaPlayer.getVideoWidth();
        this.A = mediaPlayer.getVideoHeight();
        int i = this.E;
        if (i != 0) {
            s(i);
        }
        if (this.u && F() && this.x.getCurrentPosition() > 0 && this.w != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            E(0.0f);
            this.x.start();
            int currentPosition = this.x.getCurrentPosition();
            long a = zzt.zzB().a();
            while (F() && this.x.getCurrentPosition() == currentPosition && zzt.zzB().a() - a <= 250) {
            }
            this.x.pause();
            zzn();
        }
        int i2 = this.z;
        int i3 = this.A;
        k04.zzi("AdMediaPlayerView stream dimensions: " + i2 + " x " + i3);
        if (this.w == 3) {
            r();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface created");
        B();
        zzs.zza.post(new u14(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.x;
        if (mediaPlayer != null && this.E == 0) {
            this.E = mediaPlayer.getCurrentPosition();
        }
        w24 w24Var = this.C;
        if (w24Var != null) {
            w24Var.d();
        }
        zzs.zza.post(new w14(this));
        C(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.w;
        boolean z = false;
        if (this.z == i && this.A == i2) {
            z = true;
        }
        if (this.x != null && i3 == 3 && z) {
            int i4 = this.E;
            if (i4 != 0) {
                s(i4);
            }
            r();
        }
        w24 w24Var = this.C;
        if (w24Var != null) {
            w24Var.b(i, i2);
        }
        zzs.zza.post(new v14(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.t.f(this);
        this.p.a(surfaceTexture, this.F);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.z = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.A = videoHeight;
        if (this.z == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        zze.zza("AdMediaPlayerView window visibility changed to " + i);
        zzs.zza.post(new Runnable() { // from class: com.daaw.q14
            @Override // java.lang.Runnable
            public final void run() {
                c24.this.c(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.daaw.e24
    public final String p() {
        return "MediaPlayer".concat(true != this.D ? "" : " spherical");
    }

    @Override // com.daaw.e24
    public final void q() {
        zze.zza("AdMediaPlayerView pause");
        if (F() && this.x.isPlaying()) {
            this.x.pause();
            D(4);
            zzs.zza.post(new b24(this));
        }
        this.w = 4;
    }

    @Override // com.daaw.e24
    public final void r() {
        zze.zza("AdMediaPlayerView play");
        if (F()) {
            this.x.start();
            D(3);
            this.p.b();
            zzs.zza.post(new x14(this));
        }
        this.w = 3;
    }

    @Override // com.daaw.e24
    public final void s(int i) {
        zze.zza("AdMediaPlayerView seek " + i);
        if (!F()) {
            this.E = i;
            return;
        }
        this.x.seekTo(i);
        this.E = 0;
    }

    @Override // com.daaw.e24
    public final void t(d24 d24Var) {
        this.F = d24Var;
    }

    @Override // android.view.View
    public final String toString() {
        String name = c24.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    @Override // com.daaw.e24
    public final void u(String str) {
        Uri parse = Uri.parse(str);
        zzbei h = zzbei.h(parse);
        if (h == null || h.p != null) {
            if (h != null) {
                parse = Uri.parse(h.p);
            }
            this.y = parse;
            this.E = 0;
            B();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.daaw.e24
    public final void v() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.x;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.x.release();
            this.x = null;
            D(0);
            this.w = 0;
        }
        this.t.d();
    }

    @Override // com.daaw.e24
    public final void w(float f, float f2) {
        w24 w24Var = this.C;
        if (w24Var != null) {
            w24Var.e(f, f2);
        }
    }

    @Override // com.daaw.e24, com.daaw.e34
    public final void zzn() {
        E(this.q.a());
    }
}

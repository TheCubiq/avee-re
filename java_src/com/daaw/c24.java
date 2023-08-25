package com.daaw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
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

    /* renamed from: I */
    public static final Map f5381I;

    /* renamed from: A */
    public int f5382A;

    /* renamed from: B */
    public int f5383B;

    /* renamed from: C */
    public w24 f5384C;

    /* renamed from: D */
    public final boolean f5385D;

    /* renamed from: E */
    public int f5386E;

    /* renamed from: F */
    public d24 f5387F;

    /* renamed from: G */
    public boolean f5388G;

    /* renamed from: H */
    public Integer f5389H;

    /* renamed from: s */
    public final y24 f5390s;

    /* renamed from: t */
    public final z24 f5391t;

    /* renamed from: u */
    public final boolean f5392u;

    /* renamed from: v */
    public int f5393v;

    /* renamed from: w */
    public int f5394w;

    /* renamed from: x */
    public MediaPlayer f5395x;

    /* renamed from: y */
    public Uri f5396y;

    /* renamed from: z */
    public int f5397z;

    static {
        HashMap hashMap = new HashMap();
        f5381I = hashMap;
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
        this.f5393v = 0;
        this.f5394w = 0;
        this.f5388G = false;
        this.f5389H = null;
        setSurfaceTextureListener(this);
        this.f5390s = y24Var;
        this.f5391t = z24Var;
        this.f5385D = z;
        this.f5392u = z2;
        z24Var.m2964a(this);
    }

    /* renamed from: I */
    public static /* bridge */ /* synthetic */ void m25676I(c24 c24Var, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        String string;
        String str;
        MediaFormat format;
        if (!((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue() || c24Var.f5390s == null || mediaPlayer == null || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
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
                            c24Var.f5389H = valueOf;
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
        c24Var.f5390s.mo6434T("onMetadataEvent", hashMap);
    }

    /* renamed from: B */
    public final void m25683B() {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f5396y == null || surfaceTexture == null) {
            return;
        }
        m25682C(false);
        try {
            zzt.zzk();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f5395x = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f5395x.setOnCompletionListener(this);
            this.f5395x.setOnErrorListener(this);
            this.f5395x.setOnInfoListener(this);
            this.f5395x.setOnPreparedListener(this);
            this.f5395x.setOnVideoSizeChangedListener(this);
            this.f5383B = 0;
            if (this.f5385D) {
                w24 w24Var = new w24(getContext());
                this.f5384C = w24Var;
                w24Var.m6577c(surfaceTexture, getWidth(), getHeight());
                this.f5384C.start();
                SurfaceTexture m6579a = this.f5384C.m6579a();
                if (m6579a != null) {
                    surfaceTexture = m6579a;
                } else {
                    this.f5384C.m6576d();
                    this.f5384C = null;
                }
            }
            this.f5395x.setDataSource(getContext(), this.f5396y);
            zzt.zzl();
            this.f5395x.setSurface(new Surface(surfaceTexture));
            this.f5395x.setAudioStreamType(3);
            this.f5395x.setScreenOnWhilePlaying(true);
            this.f5395x.prepareAsync();
            m25681D(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            k04.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f5396y)), e);
            onError(this.f5395x, 1, 0);
        }
    }

    /* renamed from: C */
    public final void m25682C(boolean z) {
        zze.zza("AdMediaPlayerView release");
        w24 w24Var = this.f5384C;
        if (w24Var != null) {
            w24Var.m6576d();
            this.f5384C = null;
        }
        MediaPlayer mediaPlayer = this.f5395x;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f5395x.release();
            this.f5395x = null;
            m25681D(0);
            if (z) {
                this.f5394w = 0;
            }
        }
    }

    /* renamed from: D */
    public final void m25681D(int i) {
        if (i == 3) {
            this.f5391t.m2962c();
            this.f8053q.m22941b();
        } else if (this.f5393v == 3) {
            this.f5391t.m2960e();
            this.f8053q.m22940c();
        }
        this.f5393v = i;
    }

    /* renamed from: E */
    public final void m25680E(float f) {
        MediaPlayer mediaPlayer = this.f5395x;
        if (mediaPlayer == null) {
            k04.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
        try {
            mediaPlayer.setVolume(f, f);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: F */
    public final boolean m25679F() {
        int i;
        return (this.f5395x == null || (i = this.f5393v) == -1 || i == 0 || i == 1) ? false : true;
    }

    /* renamed from: c */
    public final /* synthetic */ void m25674c(int i) {
        d24 d24Var = this.f5387F;
        if (d24Var != null) {
            d24Var.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.daaw.e24
    /* renamed from: h */
    public final int mo9565h() {
        if (m25679F()) {
            return this.f5395x.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.daaw.e24
    /* renamed from: i */
    public final int mo9564i() {
        if (Build.VERSION.SDK_INT < 26 || !m25679F()) {
            return -1;
        }
        return this.f5395x.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.daaw.e24
    /* renamed from: j */
    public final int mo9563j() {
        if (m25679F()) {
            return this.f5395x.getDuration();
        }
        return -1;
    }

    @Override // com.daaw.e24
    /* renamed from: k */
    public final int mo9562k() {
        MediaPlayer mediaPlayer = this.f5395x;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.daaw.e24
    /* renamed from: l */
    public final int mo9561l() {
        MediaPlayer mediaPlayer = this.f5395x;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.daaw.e24
    /* renamed from: m */
    public final long mo9560m() {
        return 0L;
    }

    @Override // com.daaw.e24
    /* renamed from: n */
    public final long mo9559n() {
        if (this.f5389H != null) {
            return (mo9558o() * this.f5383B) / 100;
        }
        return -1L;
    }

    @Override // com.daaw.e24
    /* renamed from: o */
    public final long mo9558o() {
        if (this.f5389H != null) {
            return mo9563j() * this.f5389H.intValue();
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f5383B = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        m25681D(5);
        this.f5394w = 5;
        zzs.zza.post(new s14(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f5381I;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        k04.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        m25681D(-1);
        this.f5394w = -1;
        zzs.zza.post(new t14(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f5381I;
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r1 > r6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = TextureView.getDefaultSize(this.f5397z, i);
        int defaultSize2 = TextureView.getDefaultSize(this.f5382A, i2);
        if (this.f5397z > 0 && this.f5382A > 0 && this.f5384C == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i4 = this.f5397z;
                    int i5 = i4 * size2;
                    int i6 = this.f5382A;
                    int i7 = size * i6;
                    if (i5 < i7) {
                        defaultSize = i5 / i6;
                        defaultSize2 = size2;
                    } else {
                        if (i5 > i7) {
                            defaultSize2 = i7 / i4;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else {
                    mode = 1073741824;
                }
            }
            if (mode == 1073741824) {
                int i8 = (this.f5382A * size) / this.f5397z;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.f5397z * size2) / this.f5382A;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i9 = this.f5397z;
                    int i10 = this.f5382A;
                    if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                        i3 = i9;
                        size2 = i10;
                    } else {
                        i3 = (size2 * i9) / i10;
                    }
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize2 = (i10 * size) / i9;
                        defaultSize = size;
                    }
                }
                defaultSize = i3;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        w24 w24Var = this.f5384C;
        if (w24Var != null) {
            w24Var.m6578b(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView prepared");
        m25681D(2);
        this.f5391t.m2963b();
        zzs.zza.post(new r14(this, mediaPlayer));
        this.f5397z = mediaPlayer.getVideoWidth();
        this.f5382A = mediaPlayer.getVideoHeight();
        int i = this.f5386E;
        if (i != 0) {
            mo9554s(i);
        }
        if (this.f5392u && m25679F() && this.f5395x.getCurrentPosition() > 0 && this.f5394w != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            m25680E(0.0f);
            this.f5395x.start();
            int currentPosition = this.f5395x.getCurrentPosition();
            long mo15860a = zzt.zzB().mo15860a();
            while (m25679F() && this.f5395x.getCurrentPosition() == currentPosition && zzt.zzB().mo15860a() - mo15860a <= 250) {
            }
            this.f5395x.pause();
            zzn();
        }
        int i2 = this.f5397z;
        int i3 = this.f5382A;
        k04.zzi("AdMediaPlayerView stream dimensions: " + i2 + " x " + i3);
        if (this.f5394w == 3) {
            mo9555r();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface created");
        m25683B();
        zzs.zza.post(new u14(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f5395x;
        if (mediaPlayer != null && this.f5386E == 0) {
            this.f5386E = mediaPlayer.getCurrentPosition();
        }
        w24 w24Var = this.f5384C;
        if (w24Var != null) {
            w24Var.m6576d();
        }
        zzs.zza.post(new w14(this));
        m25682C(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.f5394w;
        boolean z = false;
        if (this.f5397z == i && this.f5382A == i2) {
            z = true;
        }
        if (this.f5395x != null && i3 == 3 && z) {
            int i4 = this.f5386E;
            if (i4 != 0) {
                mo9554s(i4);
            }
            mo9555r();
        }
        w24 w24Var = this.f5384C;
        if (w24Var != null) {
            w24Var.m6578b(i, i2);
        }
        zzs.zza.post(new v14(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f5391t.m2959f(this);
        this.f8052p.m10750a(surfaceTexture, this.f5387F);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.f5397z = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f5382A = videoHeight;
        if (this.f5397z == 0 || videoHeight == 0) {
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
                c24.this.m25674c(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.daaw.e24
    /* renamed from: p */
    public final String mo9557p() {
        return "MediaPlayer".concat(true != this.f5385D ? "" : " spherical");
    }

    @Override // com.daaw.e24
    /* renamed from: q */
    public final void mo9556q() {
        zze.zza("AdMediaPlayerView pause");
        if (m25679F() && this.f5395x.isPlaying()) {
            this.f5395x.pause();
            m25681D(4);
            zzs.zza.post(new b24(this));
        }
        this.f5394w = 4;
    }

    @Override // com.daaw.e24
    /* renamed from: r */
    public final void mo9555r() {
        zze.zza("AdMediaPlayerView play");
        if (m25679F()) {
            this.f5395x.start();
            m25681D(3);
            this.f8052p.m10749b();
            zzs.zza.post(new x14(this));
        }
        this.f5394w = 3;
    }

    @Override // com.daaw.e24
    /* renamed from: s */
    public final void mo9554s(int i) {
        zze.zza("AdMediaPlayerView seek " + i);
        if (!m25679F()) {
            this.f5386E = i;
            return;
        }
        this.f5395x.seekTo(i);
        this.f5386E = 0;
    }

    @Override // com.daaw.e24
    /* renamed from: t */
    public final void mo9553t(d24 d24Var) {
        this.f5387F = d24Var;
    }

    @Override // android.view.View
    public final String toString() {
        String name = c24.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    @Override // com.daaw.e24
    /* renamed from: u */
    public final void mo9552u(String str) {
        Uri parse = Uri.parse(str);
        zzbei m1106h = zzbei.m1106h(parse);
        if (m1106h == null || m1106h.f36833p != null) {
            if (m1106h != null) {
                parse = Uri.parse(m1106h.f36833p);
            }
            this.f5396y = parse;
            this.f5386E = 0;
            m25683B();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.daaw.e24
    /* renamed from: v */
    public final void mo9551v() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f5395x;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f5395x.release();
            this.f5395x = null;
            m25681D(0);
            this.f5394w = 0;
        }
        this.f5391t.m2961d();
    }

    @Override // com.daaw.e24
    /* renamed from: w */
    public final void mo9550w(float f, float f2) {
        w24 w24Var = this.f5384C;
        if (w24Var != null) {
            w24Var.m6575e(f, f2);
        }
    }

    @Override // com.daaw.e24, com.daaw.e34
    public final void zzn() {
        m25680E(this.f8053q.m22942a());
    }
}

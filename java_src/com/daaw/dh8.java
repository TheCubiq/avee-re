package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class dh8 implements ob8, fh8 {
    public jn3 C;
    public bh8 D;
    public bh8 E;
    public bh8 F;
    public f92 G;
    public f92 H;
    public f92 I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public final Context p;
    public final hh8 q;
    public final PlaybackSession r;
    public String x;
    public PlaybackMetrics.Builder y;
    public int z;
    public final i54 t = new i54();
    public final d34 u = new d34();
    public final HashMap w = new HashMap();
    public final HashMap v = new HashMap();
    public final long s = SystemClock.elapsedRealtime();
    public int A = 0;
    public int B = 0;

    public dh8(Context context, PlaybackSession playbackSession) {
        this.p = context.getApplicationContext();
        this.r = playbackSession;
        zg8 zg8Var = new zg8(zg8.h);
        this.q = zg8Var;
        zg8Var.d(this);
    }

    public static dh8 f(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new dh8(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    public static int g(int i) {
        switch (it5.V(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Override // com.daaw.fh8
    public final void a(ib8 ib8Var, String str, boolean z) {
        pr8 pr8Var = ib8Var.d;
        if ((pr8Var == null || !pr8Var.b()) && str.equals(this.x)) {
            h();
        }
        this.v.remove(str);
        this.w.remove(str);
    }

    @Override // com.daaw.ob8
    public final void b(ib8 ib8Var, int i, long j, long j2) {
        pr8 pr8Var = ib8Var.d;
        if (pr8Var != null) {
            String a = this.q.a(ib8Var.b, pr8Var);
            Long l = (Long) this.w.get(a);
            Long l2 = (Long) this.v.get(a);
            this.w.put(a, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.v.put(a, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.daaw.fh8
    public final void c(ib8 ib8Var, String str) {
        pr8 pr8Var = ib8Var.d;
        if (pr8Var == null || !pr8Var.b()) {
            h();
            this.x = str;
            this.y = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
            m(ib8Var.b, ib8Var.d);
        }
    }

    public final LogSessionId d() {
        return this.r.getSessionId();
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void e(ib8 ib8Var, f92 f92Var, tm7 tm7Var) {
    }

    public final void h() {
        PlaybackMetrics.Builder builder = this.y;
        if (builder != null && this.O) {
            builder.setAudioUnderrunCount(this.N);
            this.y.setVideoFramesDropped(this.L);
            this.y.setVideoFramesPlayed(this.M);
            Long l = (Long) this.v.get(this.x);
            this.y.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.w.get(this.x);
            this.y.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.y.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.r.reportPlaybackMetrics(this.y.build());
        }
        this.y = null;
        this.x = null;
        this.N = 0;
        this.L = 0;
        this.M = 0;
        this.G = null;
        this.H = null;
        this.I = null;
        this.O = false;
    }

    public final void i(long j, f92 f92Var, int i) {
        if (it5.t(this.H, f92Var)) {
            return;
        }
        int i2 = this.H == null ? 1 : 0;
        this.H = f92Var;
        v(0, j, f92Var, i2);
    }

    @Override // com.daaw.ob8
    public final void j(ib8 ib8Var, ql7 ql7Var) {
        this.L += ql7Var.g;
        this.M += ql7Var.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    @Override // com.daaw.ob8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.daaw.ty3 r21, com.daaw.lb8 r22) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dh8.k(com.daaw.ty3, com.daaw.lb8):void");
    }

    public final void l(long j, f92 f92Var, int i) {
        if (it5.t(this.I, f92Var)) {
            return;
        }
        int i2 = this.I == null ? 1 : 0;
        this.I = f92Var;
        v(2, j, f92Var, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    public final void m(l64 l64Var, pr8 pr8Var) {
        int a;
        PlaybackMetrics.Builder builder = this.y;
        if (pr8Var == null || (a = l64Var.a(pr8Var.a)) == -1) {
            return;
        }
        int i = 0;
        l64Var.d(a, this.u, false);
        l64Var.e(this.u.c, this.t, 0L);
        jv2 jv2Var = this.t.b.b;
        if (jv2Var != null) {
            int Z = it5.Z(jv2Var.a);
            i = Z != 0 ? Z != 1 ? Z != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        i54 i54Var = this.t;
        if (i54Var.l != -9223372036854775807L && !i54Var.j && !i54Var.g && !i54Var.b()) {
            builder.setMediaDurationMillis(it5.j0(this.t.l));
        }
        builder.setPlaybackType(true != this.t.b() ? 1 : 2);
        this.O = true;
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void n(ib8 ib8Var, Object obj, long j) {
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void o(ib8 ib8Var, f92 f92Var, tm7 tm7Var) {
    }

    @Override // com.daaw.ob8
    public final void p(ib8 ib8Var, nx3 nx3Var, nx3 nx3Var2, int i) {
        if (i == 1) {
            this.J = true;
            i = 1;
        }
        this.z = i;
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void q(ib8 ib8Var, int i, long j) {
    }

    @Override // com.daaw.ob8
    public final void r(ib8 ib8Var, ll4 ll4Var) {
        bh8 bh8Var = this.D;
        if (bh8Var != null) {
            f92 f92Var = bh8Var.a;
            if (f92Var.r == -1) {
                b72 b = f92Var.b();
                b.x(ll4Var.a);
                b.f(ll4Var.b);
                this.D = new bh8(b.y(), 0, bh8Var.c);
            }
        }
    }

    @Override // com.daaw.ob8
    public final void s(ib8 ib8Var, ar8 ar8Var, lr8 lr8Var, IOException iOException, boolean z) {
    }

    public final void t(long j, f92 f92Var, int i) {
        if (it5.t(this.G, f92Var)) {
            return;
        }
        int i2 = this.G == null ? 1 : 0;
        this.G = f92Var;
        v(1, j, f92Var, i2);
    }

    @Override // com.daaw.ob8
    public final /* synthetic */ void u(ib8 ib8Var, int i) {
    }

    public final void v(int i, long j, f92 f92Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.s);
        if (f92Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = f92Var.k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = f92Var.l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = f92Var.i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = f92Var.h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = f92Var.q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = f92Var.r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = f92Var.y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = f92Var.z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = f92Var.c;
            if (str4 != null) {
                String[] H = it5.H(str4, "-");
                Pair create = Pair.create(H[0], H.length >= 2 ? H[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = f92Var.s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.O = true;
        this.r.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = um0.a)
    public final boolean w(bh8 bh8Var) {
        return bh8Var != null && bh8Var.c.equals(this.q.zzd());
    }

    @Override // com.daaw.ob8
    public final void x(ib8 ib8Var, jn3 jn3Var) {
        this.C = jn3Var;
    }

    @Override // com.daaw.ob8
    public final void y(ib8 ib8Var, lr8 lr8Var) {
        pr8 pr8Var = ib8Var.d;
        if (pr8Var == null) {
            return;
        }
        f92 f92Var = lr8Var.b;
        Objects.requireNonNull(f92Var);
        bh8 bh8Var = new bh8(f92Var, 0, this.q.a(ib8Var.b, pr8Var));
        int i = lr8Var.a;
        if (i != 0) {
            if (i == 1) {
                this.E = bh8Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.F = bh8Var;
                return;
            }
        }
        this.D = bh8Var;
    }
}

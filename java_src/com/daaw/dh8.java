package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class dh8 implements ob8, fh8 {

    /* renamed from: C */
    public jn3 f7097C;

    /* renamed from: D */
    public bh8 f7098D;

    /* renamed from: E */
    public bh8 f7099E;

    /* renamed from: F */
    public bh8 f7100F;

    /* renamed from: G */
    public f92 f7101G;

    /* renamed from: H */
    public f92 f7102H;

    /* renamed from: I */
    public f92 f7103I;

    /* renamed from: J */
    public boolean f7104J;

    /* renamed from: K */
    public boolean f7105K;

    /* renamed from: L */
    public int f7106L;

    /* renamed from: M */
    public int f7107M;

    /* renamed from: N */
    public int f7108N;

    /* renamed from: O */
    public boolean f7109O;

    /* renamed from: p */
    public final Context f7110p;

    /* renamed from: q */
    public final hh8 f7111q;

    /* renamed from: r */
    public final PlaybackSession f7112r;

    /* renamed from: x */
    public String f7118x;

    /* renamed from: y */
    public PlaybackMetrics.Builder f7119y;

    /* renamed from: z */
    public int f7120z;

    /* renamed from: t */
    public final i54 f7114t = new i54();

    /* renamed from: u */
    public final d34 f7115u = new d34();

    /* renamed from: w */
    public final HashMap f7117w = new HashMap();

    /* renamed from: v */
    public final HashMap f7116v = new HashMap();

    /* renamed from: s */
    public final long f7113s = SystemClock.elapsedRealtime();

    /* renamed from: A */
    public int f7095A = 0;

    /* renamed from: B */
    public int f7096B = 0;

    public dh8(Context context, PlaybackSession playbackSession) {
        this.f7110p = context.getApplicationContext();
        this.f7112r = playbackSession;
        zg8 zg8Var = new zg8(zg8.f35044h);
        this.f7111q = zg8Var;
        zg8Var.mo2336d(this);
    }

    /* renamed from: f */
    public static dh8 m24375f(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new dh8(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: g */
    public static int m24374g(int i) {
        switch (it5.m19410V(i)) {
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
    /* renamed from: a */
    public final void mo22635a(ib8 ib8Var, String str, boolean z) {
        pr8 pr8Var = ib8Var.f13444d;
        if ((pr8Var == null || !pr8Var.m16079b()) && str.equals(this.f7118x)) {
            m24373h();
        }
        this.f7116v.remove(str);
        this.f7117w.remove(str);
    }

    @Override // com.daaw.ob8
    /* renamed from: b */
    public final void mo14403b(ib8 ib8Var, int i, long j, long j2) {
        pr8 pr8Var = ib8Var.f13444d;
        if (pr8Var != null) {
            String mo2339a = this.f7111q.mo2339a(ib8Var.f13442b, pr8Var);
            Long l = (Long) this.f7117w.get(mo2339a);
            Long l2 = (Long) this.f7116v.get(mo2339a);
            this.f7117w.put(mo2339a, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.f7116v.put(mo2339a, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.daaw.fh8
    /* renamed from: c */
    public final void mo22634c(ib8 ib8Var, String str) {
        pr8 pr8Var = ib8Var.f13444d;
        if (pr8Var == null || !pr8Var.m16079b()) {
            m24373h();
            this.f7118x = str;
            this.f7119y = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
            m24370m(ib8Var.f13442b, ib8Var.f13444d);
        }
    }

    /* renamed from: d */
    public final LogSessionId m24376d() {
        return this.f7112r.getSessionId();
    }

    @Override // com.daaw.ob8
    /* renamed from: e */
    public final /* synthetic */ void mo14402e(ib8 ib8Var, f92 f92Var, tm7 tm7Var) {
    }

    /* renamed from: h */
    public final void m24373h() {
        PlaybackMetrics.Builder builder = this.f7119y;
        if (builder != null && this.f7109O) {
            builder.setAudioUnderrunCount(this.f7108N);
            this.f7119y.setVideoFramesDropped(this.f7106L);
            this.f7119y.setVideoFramesPlayed(this.f7107M);
            Long l = (Long) this.f7116v.get(this.f7118x);
            this.f7119y.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.f7117w.get(this.f7118x);
            this.f7119y.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f7119y.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f7112r.reportPlaybackMetrics(this.f7119y.build());
        }
        this.f7119y = null;
        this.f7118x = null;
        this.f7108N = 0;
        this.f7106L = 0;
        this.f7107M = 0;
        this.f7101G = null;
        this.f7102H = null;
        this.f7103I = null;
        this.f7109O = false;
    }

    /* renamed from: i */
    public final void m24372i(long j, f92 f92Var, int i) {
        if (it5.m19376t(this.f7102H, f92Var)) {
            return;
        }
        int i2 = this.f7102H == null ? 1 : 0;
        this.f7102H = f92Var;
        m24368v(0, j, f92Var, i2);
    }

    @Override // com.daaw.ob8
    /* renamed from: j */
    public final void mo14401j(ib8 ib8Var, ql7 ql7Var) {
        this.f7106L += ql7Var.f24156g;
        this.f7107M += ql7Var.f24154e;
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
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo14400k(ty3 ty3Var, lb8 lb8Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        zzx zzxVar;
        int i5;
        int i6;
        if (lb8Var.m17061b() == 0) {
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < lb8Var.m17061b(); i8++) {
            int m17062a = lb8Var.m17062a(i8);
            ib8 m17060c = lb8Var.m17060c(m17062a);
            if (m17062a == 0) {
                this.f7111q.mo2335e(m17060c);
            } else if (m17062a == 11) {
                this.f7111q.mo2334f(m17060c, this.f7120z);
            } else {
                this.f7111q.mo2337c(m17060c);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (lb8Var.m17059d(0)) {
            ib8 m17060c2 = lb8Var.m17060c(0);
            if (this.f7119y != null) {
                m24370m(m17060c2.f13442b, m17060c2.f13444d);
            }
        }
        if (lb8Var.m17059d(2) && this.f7119y != null) {
            y17 m15163a = ty3Var.zzo().m15163a();
            int size = m15163a.size();
            int i9 = 0;
            loop1: while (true) {
                if (i9 >= size) {
                    zzxVar = null;
                    break;
                }
                kh4 kh4Var = (kh4) m15163a.get(i9);
                int i10 = 0;
                while (true) {
                    int i11 = kh4Var.f16373a;
                    i6 = i9 + 1;
                    if (i10 <= 0) {
                        if (kh4Var.m17746d(i10) && (zzxVar = kh4Var.m17748b(i10).f9278o) != null) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                i9 = i6;
            }
            if (zzxVar != null) {
                PlaybackMetrics.Builder builder = this.f7119y;
                int i12 = it5.f13991a;
                int i13 = 0;
                while (true) {
                    if (i13 >= zzxVar.f37035s) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = zzxVar.m1090a(i13).f37028q;
                    if (uuid.equals(ak8.f3284d)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(ak8.f3285e)) {
                        i5 = 2;
                        break;
                    } else if (uuid.equals(ak8.f3283c)) {
                        i5 = 6;
                        break;
                    } else {
                        i13++;
                    }
                }
                builder.setDrmType(i5);
            }
        }
        if (lb8Var.m17059d(1011)) {
            this.f7108N++;
        }
        jn3 jn3Var = this.f7097C;
        if (jn3Var != null) {
            Context context = this.f7110p;
            int i14 = 23;
            if (jn3Var.f15230p == 1001) {
                i14 = 20;
            } else {
                vu7 vu7Var = (vu7) jn3Var;
                boolean z2 = vu7Var.f30607s == 1;
                int i15 = vu7Var.f30611w;
                Throwable cause = jn3Var.getCause();
                Objects.requireNonNull(cause);
                if (cause instanceof IOException) {
                    if (cause instanceof hs6) {
                        i7 = ((hs6) cause).f12907s;
                        i14 = 5;
                    } else if (cause instanceof dl3) {
                        i7 = 0;
                        i14 = 11;
                    } else {
                        boolean z3 = cause instanceof cq6;
                        if (z3 || (cause instanceof d17)) {
                            if (bi5.m26143b(context).m26144a() == 1) {
                                i7 = 0;
                                i14 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i7 = 0;
                                    i14 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    i7 = 0;
                                    i14 = 7;
                                } else if (z3 && ((cq6) cause).f6088r == 1) {
                                    i7 = 0;
                                    i14 = 4;
                                } else {
                                    i7 = 0;
                                    i14 = 8;
                                }
                            }
                        } else if (jn3Var.f15230p == 1002) {
                            i7 = 0;
                            i14 = 21;
                        } else if (cause instanceof fn8) {
                            Throwable cause3 = cause.getCause();
                            Objects.requireNonNull(cause3);
                            int i16 = it5.f13991a;
                            if (i16 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                i7 = it5.m19409W(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                i14 = m24374g(i7);
                            } else if (i16 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                i7 = 0;
                                i14 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i7 = 0;
                                i14 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i7 = 0;
                                i14 = 29;
                            } else {
                                if (!(cause3 instanceof bo8)) {
                                    i7 = 0;
                                    i14 = 30;
                                }
                                i7 = 0;
                            }
                        } else if ((cause instanceof rl6) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            Objects.requireNonNull(cause4);
                            Throwable cause5 = cause4.getCause();
                            if (it5.f13991a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i7 = 0;
                                i14 = 32;
                            } else {
                                i7 = 0;
                                i14 = 31;
                            }
                        } else {
                            i7 = 0;
                            i14 = 9;
                        }
                    }
                } else if (z2 && (i15 == 0 || i15 == 1)) {
                    i7 = 0;
                    i14 = 35;
                } else if (z2 && i15 == 3) {
                    i7 = 0;
                    i14 = 15;
                } else {
                    if (!z2 || i15 != 2) {
                        if (cause instanceof gp8) {
                            i7 = it5.m19409W(((gp8) cause).f11562s);
                            i14 = 13;
                        } else {
                            if (cause instanceof cp8) {
                                i7 = it5.m19409W(((cp8) cause).f6069q);
                            } else if (cause instanceof OutOfMemoryError) {
                                i7 = 0;
                            } else if (cause instanceof jj8) {
                                i7 = ((jj8) cause).f15139p;
                                i14 = 17;
                            } else if (cause instanceof pj8) {
                                i7 = ((pj8) cause).f22995p;
                                i14 = 18;
                            } else {
                                int i17 = it5.f13991a;
                                if (cause instanceof MediaCodec.CryptoException) {
                                    i7 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    i14 = m24374g(i7);
                                } else {
                                    i7 = 0;
                                    i14 = 22;
                                }
                            }
                            i14 = 14;
                        }
                    }
                    i7 = 0;
                }
            }
            this.f7112r.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.f7113s).setErrorCode(i14).setSubErrorCode(i7).setException(jn3Var).build());
            this.f7109O = true;
            this.f7097C = null;
        }
        if (lb8Var.m17059d(2)) {
            ni4 zzo = ty3Var.zzo();
            boolean m15162b = zzo.m15162b(2);
            boolean m15162b2 = zzo.m15162b(1);
            boolean m15162b3 = zzo.m15162b(3);
            if (!m15162b && !m15162b2) {
                if (m15162b3) {
                    m15162b3 = true;
                }
            }
            if (m15162b) {
                i4 = 0;
            } else {
                i4 = 0;
                m24369t(elapsedRealtime, null, 0);
            }
            if (!m15162b2) {
                m24372i(elapsedRealtime, null, i4);
            }
            if (!m15162b3) {
                m24371l(elapsedRealtime, null, i4);
            }
        }
        if (m24367w(this.f7098D)) {
            f92 f92Var = this.f7098D.f4812a;
            if (f92Var.f9281r != -1) {
                i = 0;
                m24369t(elapsedRealtime, f92Var, 0);
                this.f7098D = null;
                if (m24367w(this.f7099E)) {
                    m24372i(elapsedRealtime, this.f7099E.f4812a, i);
                    this.f7099E = null;
                }
                if (m24367w(this.f7100F)) {
                    m24371l(elapsedRealtime, this.f7100F.f4812a, i);
                    this.f7100F = null;
                }
                switch (bi5.m26143b(this.f7110p).m26144a()) {
                    case 0:
                        i2 = 0;
                        break;
                    case 1:
                        i2 = 9;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                    case 8:
                    default:
                        i2 = 1;
                        break;
                    case 7:
                        i2 = 3;
                        break;
                    case 9:
                        i2 = 8;
                        break;
                    case 10:
                        i2 = 7;
                        break;
                }
                if (i2 != this.f7096B) {
                    this.f7096B = i2;
                    this.f7112r.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i2).setTimeSinceCreatedMillis(elapsedRealtime - this.f7113s).build());
                }
                if (ty3Var.zzh() == 2) {
                    z = false;
                    this.f7104J = false;
                } else {
                    z = false;
                }
                if (((ga8) ty3Var).m21838k() != null) {
                    this.f7105K = z;
                } else if (lb8Var.m17059d(10)) {
                    this.f7105K = true;
                }
                int zzh = ty3Var.zzh();
                if (!this.f7104J) {
                    i3 = 5;
                } else if (this.f7105K) {
                    i3 = 13;
                } else {
                    i3 = 4;
                    if (zzh == 4) {
                        i3 = 11;
                    } else if (zzh == 2) {
                        int i18 = this.f7095A;
                        i3 = (i18 == 0 || i18 == 2) ? 2 : !ty3Var.zzq() ? 7 : ty3Var.zzi() != 0 ? 10 : 6;
                    } else if (zzh != 3) {
                        i3 = (zzh != 1 || this.f7095A == 0) ? this.f7095A : 12;
                    } else if (ty3Var.zzq()) {
                        i3 = ty3Var.zzi() != 0 ? 9 : 3;
                    }
                }
                if (this.f7095A != i3) {
                    this.f7095A = i3;
                    this.f7109O = true;
                    this.f7112r.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f7095A).setTimeSinceCreatedMillis(elapsedRealtime - this.f7113s).build());
                }
                if (lb8Var.m17059d(1028)) {
                    return;
                }
                this.f7111q.mo2338b(lb8Var.m17060c(1028));
                return;
            }
        }
        i = 0;
        if (m24367w(this.f7099E)) {
        }
        if (m24367w(this.f7100F)) {
        }
        switch (bi5.m26143b(this.f7110p).m26144a()) {
        }
        if (i2 != this.f7096B) {
        }
        if (ty3Var.zzh() == 2) {
        }
        if (((ga8) ty3Var).m21838k() != null) {
        }
        int zzh2 = ty3Var.zzh();
        if (!this.f7104J) {
        }
        if (this.f7095A != i3) {
        }
        if (lb8Var.m17059d(1028)) {
        }
    }

    /* renamed from: l */
    public final void m24371l(long j, f92 f92Var, int i) {
        if (it5.m19376t(this.f7103I, f92Var)) {
            return;
        }
        int i2 = this.f7103I == null ? 1 : 0;
        this.f7103I = f92Var;
        m24368v(2, j, f92Var, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    /* renamed from: m */
    public final void m24370m(l64 l64Var, pr8 pr8Var) {
        int mo4511a;
        PlaybackMetrics.Builder builder = this.f7119y;
        if (pr8Var == null || (mo4511a = l64Var.mo4511a(pr8Var.f18805a)) == -1) {
            return;
        }
        int i = 0;
        l64Var.mo1924d(mo4511a, this.f7115u, false);
        l64Var.mo1923e(this.f7115u.f6450c, this.f7114t, 0L);
        jv2 jv2Var = this.f7114t.f13268b.f9119b;
        if (jv2Var != null) {
            int m19406Z = it5.m19406Z(jv2Var.f15455a);
            i = m19406Z != 0 ? m19406Z != 1 ? m19406Z != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        i54 i54Var = this.f7114t;
        if (i54Var.f13278l != -9223372036854775807L && !i54Var.f13276j && !i54Var.f13273g && !i54Var.m20119b()) {
            builder.setMediaDurationMillis(it5.m19386j0(this.f7114t.f13278l));
        }
        builder.setPlaybackType(true != this.f7114t.m20119b() ? 1 : 2);
        this.f7109O = true;
    }

    @Override // com.daaw.ob8
    /* renamed from: n */
    public final /* synthetic */ void mo14399n(ib8 ib8Var, Object obj, long j) {
    }

    @Override // com.daaw.ob8
    /* renamed from: o */
    public final /* synthetic */ void mo14398o(ib8 ib8Var, f92 f92Var, tm7 tm7Var) {
    }

    @Override // com.daaw.ob8
    /* renamed from: p */
    public final void mo14397p(ib8 ib8Var, nx3 nx3Var, nx3 nx3Var2, int i) {
        if (i == 1) {
            this.f7104J = true;
            i = 1;
        }
        this.f7120z = i;
    }

    @Override // com.daaw.ob8
    /* renamed from: q */
    public final /* synthetic */ void mo14396q(ib8 ib8Var, int i, long j) {
    }

    @Override // com.daaw.ob8
    /* renamed from: r */
    public final void mo14395r(ib8 ib8Var, ll4 ll4Var) {
        bh8 bh8Var = this.f7098D;
        if (bh8Var != null) {
            f92 f92Var = bh8Var.f4812a;
            if (f92Var.f9281r == -1) {
                b72 m22830b = f92Var.m22830b();
                m22830b.m26367x(ll4Var.f17522a);
                m22830b.m26388f(ll4Var.f17523b);
                this.f7098D = new bh8(m22830b.m26366y(), 0, bh8Var.f4814c);
            }
        }
    }

    @Override // com.daaw.ob8
    /* renamed from: s */
    public final void mo14394s(ib8 ib8Var, ar8 ar8Var, lr8 lr8Var, IOException iOException, boolean z) {
    }

    /* renamed from: t */
    public final void m24369t(long j, f92 f92Var, int i) {
        if (it5.m19376t(this.f7101G, f92Var)) {
            return;
        }
        int i2 = this.f7101G == null ? 1 : 0;
        this.f7101G = f92Var;
        m24368v(1, j, f92Var, i2);
    }

    @Override // com.daaw.ob8
    /* renamed from: u */
    public final /* synthetic */ void mo14393u(ib8 ib8Var, int i) {
    }

    /* renamed from: v */
    public final void m24368v(int i, long j, f92 f92Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f7113s);
        if (f92Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = f92Var.f9274k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = f92Var.f9275l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = f92Var.f9272i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = f92Var.f9271h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = f92Var.f9280q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = f92Var.f9281r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = f92Var.f9288y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = f92Var.f9289z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = f92Var.f9266c;
            if (str4 != null) {
                String[] m19424H = it5.m19424H(str4, "-");
                Pair create = Pair.create(m19424H[0], m19424H.length >= 2 ? m19424H[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = f92Var.f9282s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f7109O = true;
        this.f7112r.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = um0.f29183a)
    /* renamed from: w */
    public final boolean m24367w(bh8 bh8Var) {
        return bh8Var != null && bh8Var.f4814c.equals(this.f7111q.zzd());
    }

    @Override // com.daaw.ob8
    /* renamed from: x */
    public final void mo14392x(ib8 ib8Var, jn3 jn3Var) {
        this.f7097C = jn3Var;
    }

    @Override // com.daaw.ob8
    /* renamed from: y */
    public final void mo14391y(ib8 ib8Var, lr8 lr8Var) {
        pr8 pr8Var = ib8Var.f13444d;
        if (pr8Var == null) {
            return;
        }
        f92 f92Var = lr8Var.f17671b;
        Objects.requireNonNull(f92Var);
        bh8 bh8Var = new bh8(f92Var, 0, this.f7111q.mo2339a(ib8Var.f13442b, pr8Var));
        int i = lr8Var.f17670a;
        if (i != 0) {
            if (i == 1) {
                this.f7099E = bh8Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f7100F = bh8Var;
                return;
            }
        }
        this.f7098D = bh8Var;
    }
}

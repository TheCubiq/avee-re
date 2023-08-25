package com.daaw;

import android.os.SystemClock;
import android.view.Surface;
import com.daaw.cp0;
import com.daaw.nl1;
import com.daaw.x2;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.b;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
/* loaded from: classes.dex */
public class cy implements x2 {
    public static final NumberFormat e;
    public final com.google.android.exoplayer2.trackselection.b a;
    public final nl1.c b = new nl1.c();
    public final nl1.b c = new nl1.b();
    public final long d = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public cy(com.google.android.exoplayer2.trackselection.b bVar) {
        this.a = bVar;
    }

    public static String D(int i, int i2) {
        return i < 2 ? "N/A" : i2 != 0 ? i2 != 8 ? i2 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO";
    }

    public static String E(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION";
    }

    public static String I(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    public static String J(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    public static String K(long j) {
        return j == -9223372036854775807L ? "?" : e.format(((float) j) / 1000.0f);
    }

    public static String L(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED";
    }

    public static String M(com.google.android.exoplayer2.trackselection.c cVar, TrackGroup trackGroup, int i) {
        return N((cVar == null || cVar.a() != trackGroup || cVar.p(i) == -1) ? false : true);
    }

    public static String N(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    public static String O(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i >= 10000) {
                                    return "custom (" + i + ")";
                                }
                                return "?";
                            }
                            return "none";
                        }
                        return "metadata";
                    }
                    return "text";
                }
                return "video";
            }
            return "audio";
        }
        return "default";
    }

    @Override // com.daaw.x2
    public void A(x2.a aVar, cp0.b bVar, cp0.c cVar) {
    }

    @Override // com.daaw.x2
    public void B(x2.a aVar) {
        P(aVar, "mediaPeriodReleased");
    }

    @Override // com.daaw.x2
    public void C(x2.a aVar, int i) {
        int h = aVar.b.h();
        int n = aVar.b.n();
        R("timelineChanged [" + H(aVar) + ", periodCount=" + h + ", windowCount=" + n + ", reason=" + L(i));
        for (int i2 = 0; i2 < Math.min(h, 3); i2++) {
            aVar.b.f(i2, this.c);
            R("  period [" + K(this.c.h()) + "]");
        }
        if (h > 3) {
            R("  ...");
        }
        for (int i3 = 0; i3 < Math.min(n, 3); i3++) {
            aVar.b.k(i3, this.b);
            R("  window [" + K(this.b.c()) + ", " + this.b.d + ", " + this.b.e + "]");
        }
        if (n > 3) {
            R("  ...");
        }
        R("]");
    }

    public final String F(x2.a aVar, String str) {
        return str + " [" + H(aVar) + "]";
    }

    public final String G(x2.a aVar, String str, String str2) {
        return str + " [" + H(aVar) + ", " + str2 + "]";
    }

    public final String H(x2.a aVar) {
        String str = "window=" + aVar.c;
        if (aVar.d != null) {
            str = str + ", period=" + aVar.d.a;
            if (aVar.d.b()) {
                str = (str + ", adGroup=" + aVar.d.b) + ", ad=" + aVar.d.c;
            }
        }
        return K(aVar.a - this.d) + ", " + K(aVar.f) + ", " + str;
    }

    public final void P(x2.a aVar, String str) {
        R(F(aVar, str));
    }

    public final void Q(x2.a aVar, String str, String str2) {
        R(G(aVar, str, str2));
    }

    public void R(String str) {
    }

    public final void S(x2.a aVar, String str, String str2, Throwable th) {
        U(G(aVar, str, str2), th);
    }

    public final void T(x2.a aVar, String str, Throwable th) {
        U(F(aVar, str), th);
    }

    public void U(String str, Throwable th) {
    }

    public final void V(x2.a aVar, String str, Exception exc) {
        S(aVar, "internalError", str, exc);
    }

    public final void W(Metadata metadata, String str) {
        for (int i = 0; i < metadata.b(); i++) {
            R(str + metadata.a(i));
        }
    }

    @Override // com.daaw.x2
    public void a(x2.a aVar, cp0.c cVar) {
        Q(aVar, "upstreamDiscarded", Format.M(cVar.c));
    }

    @Override // com.daaw.x2
    public void b(x2.a aVar, cp0.c cVar) {
        Q(aVar, "downstreamFormatChanged", Format.M(cVar.c));
    }

    @Override // com.daaw.x2
    public void c(x2.a aVar, int i, long j) {
        Q(aVar, "droppedFrames", Integer.toString(i));
    }

    @Override // com.daaw.x2
    public void d(x2.a aVar, cp0.b bVar, cp0.c cVar) {
    }

    @Override // com.daaw.x2
    public void e(x2.a aVar, int i) {
        Q(aVar, "audioSessionId", Integer.toString(i));
    }

    @Override // com.daaw.x2
    public void f(x2.a aVar) {
        P(aVar, "seekStarted");
    }

    @Override // com.daaw.x2
    public void g(x2.a aVar, boolean z, int i) {
        Q(aVar, "state", z + ", " + J(i));
    }

    @Override // com.daaw.x2
    public void h(x2.a aVar, int i) {
        Q(aVar, "positionDiscontinuity", E(i));
    }

    @Override // com.daaw.x2
    public void i(x2.a aVar, int i, fq fqVar) {
        Q(aVar, "decoderDisabled", O(i));
    }

    @Override // com.daaw.x2
    public void j(x2.a aVar, boolean z) {
        Q(aVar, "loading", Boolean.toString(z));
    }

    @Override // com.daaw.x2
    public void k(x2.a aVar, int i, Format format) {
        Q(aVar, "decoderInputFormatChanged", O(i) + ", " + Format.M(format));
    }

    @Override // com.daaw.x2
    public void l(x2.a aVar, Metadata metadata) {
        R("metadata [" + H(aVar) + ", ");
        W(metadata, "  ");
        R("]");
    }

    @Override // com.daaw.x2
    public void m(x2.a aVar, Surface surface) {
        Q(aVar, "renderedFirstFrame", surface.toString());
    }

    @Override // com.daaw.x2
    public void n(x2.a aVar, TrackGroupArray trackGroupArray, um1 um1Var) {
        int i;
        com.google.android.exoplayer2.trackselection.b bVar = this.a;
        b.a e2 = bVar != null ? bVar.e() : null;
        if (e2 == null) {
            Q(aVar, "tracksChanged", "[]");
            return;
        }
        R("tracksChanged [" + H(aVar) + ", ");
        int c = e2.c();
        int i2 = 0;
        while (true) {
            String str = "  ]";
            String str2 = " [";
            if (i2 >= c) {
                break;
            }
            TrackGroupArray e3 = e2.e(i2);
            com.google.android.exoplayer2.trackselection.c a = um1Var.a(i2);
            if (e3.p > 0) {
                StringBuilder sb = new StringBuilder();
                i = c;
                sb.append("  Renderer:");
                sb.append(i2);
                sb.append(" [");
                R(sb.toString());
                int i3 = 0;
                while (i3 < e3.p) {
                    TrackGroup a2 = e3.a(i3);
                    TrackGroupArray trackGroupArray2 = e3;
                    String str3 = str;
                    String D = D(a2.p, e2.a(i2, i3, false));
                    R("    Group:" + i3 + ", adaptive_supported=" + D + str2);
                    int i4 = 0;
                    while (i4 < a2.p) {
                        String M = M(a, a2, i4);
                        String I = I(e2.f(i2, i3, i4));
                        String str4 = str2;
                        R("      " + M + " Track:" + i4 + ", " + Format.M(a2.a(i4)) + ", supported=" + I);
                        i4++;
                        str2 = str4;
                    }
                    R("    ]");
                    i3++;
                    e3 = trackGroupArray2;
                    str = str3;
                }
                String str5 = str;
                if (a != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= a.length()) {
                            break;
                        }
                        Metadata metadata = a.d(i5).s;
                        if (metadata != null) {
                            R("    Metadata [");
                            W(metadata, "      ");
                            R("    ]");
                            break;
                        }
                        i5++;
                    }
                }
                R(str5);
            } else {
                i = c;
            }
            i2++;
            c = i;
        }
        String str6 = " [";
        TrackGroupArray g = e2.g();
        if (g.p > 0) {
            R("  Renderer:None [");
            int i6 = 0;
            while (i6 < g.p) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("    Group:");
                sb2.append(i6);
                String str7 = str6;
                sb2.append(str7);
                R(sb2.toString());
                TrackGroup a3 = g.a(i6);
                for (int i7 = 0; i7 < a3.p; i7++) {
                    String N = N(false);
                    String I2 = I(0);
                    R("      " + N + " Track:" + i7 + ", " + Format.M(a3.a(i7)) + ", supported=" + I2);
                }
                R("    ]");
                i6++;
                str6 = str7;
            }
            R("  ]");
        }
        R("]");
    }

    @Override // com.daaw.x2
    public void o(x2.a aVar, cp0.b bVar, cp0.c cVar) {
    }

    @Override // com.daaw.x2
    public void p(x2.a aVar) {
        P(aVar, "mediaPeriodCreated");
    }

    @Override // com.daaw.x2
    public void q(x2.a aVar, cp0.b bVar, cp0.c cVar, IOException iOException, boolean z) {
        V(aVar, "loadError", iOException);
    }

    @Override // com.daaw.x2
    public void r(x2.a aVar, int i, long j, long j2) {
        S(aVar, "audioTrackUnderrun", i + ", " + j + ", " + j2 + "]", null);
    }

    @Override // com.daaw.x2
    public void s(x2.a aVar, int i, fq fqVar) {
        Q(aVar, "decoderEnabled", O(i));
    }

    @Override // com.daaw.x2
    public void t(x2.a aVar, zw0 zw0Var) {
        Q(aVar, "playbackParameters", sq1.o("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(zw0Var.a), Float.valueOf(zw0Var.b), Boolean.valueOf(zw0Var.c)));
    }

    @Override // com.daaw.x2
    public void u(x2.a aVar) {
        P(aVar, "mediaPeriodReadingStarted");
    }

    @Override // com.daaw.x2
    public void v(x2.a aVar, int i, String str, long j) {
        Q(aVar, "decoderInitialized", O(i) + ", " + str);
    }

    @Override // com.daaw.x2
    public void w(x2.a aVar, int i, long j, long j2) {
    }

    @Override // com.daaw.x2
    public void x(x2.a aVar, int i, int i2, int i3, float f) {
        Q(aVar, "videoSizeChanged", i + ", " + i2);
    }

    @Override // com.daaw.x2
    public void y(x2.a aVar, qz qzVar) {
        T(aVar, "playerFailed", qzVar);
    }

    @Override // com.daaw.x2
    public void z(x2.a aVar) {
        P(aVar, "seekProcessed");
    }
}

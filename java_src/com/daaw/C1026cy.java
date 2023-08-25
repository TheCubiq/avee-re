package com.daaw;

import android.os.SystemClock;
import android.view.Surface;
import com.daaw.InterfaceC3494x2;
import com.daaw.cp0;
import com.daaw.nl1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AbstractC3968b;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
/* renamed from: com.daaw.cy */
/* loaded from: classes.dex */
public class C1026cy implements InterfaceC3494x2 {

    /* renamed from: e */
    public static final NumberFormat f6261e;

    /* renamed from: a */
    public final AbstractC3968b f6262a;

    /* renamed from: b */
    public final nl1.C2315c f6263b = new nl1.C2315c();

    /* renamed from: c */
    public final nl1.C2314b f6264c = new nl1.C2314b();

    /* renamed from: d */
    public final long f6265d = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f6261e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public C1026cy(AbstractC3968b abstractC3968b) {
        this.f6262a = abstractC3968b;
    }

    /* renamed from: D */
    public static String m24905D(int i, int i2) {
        return i < 2 ? "N/A" : i2 != 0 ? i2 != 8 ? i2 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO";
    }

    /* renamed from: E */
    public static String m24904E(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION";
    }

    /* renamed from: I */
    public static String m24900I(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    /* renamed from: J */
    public static String m24899J(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    /* renamed from: K */
    public static String m24898K(long j) {
        return j == -9223372036854775807L ? "?" : f6261e.format(((float) j) / 1000.0f);
    }

    /* renamed from: L */
    public static String m24897L(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED";
    }

    /* renamed from: M */
    public static String m24896M(InterfaceC3970c interfaceC3970c, TrackGroup trackGroup, int i) {
        return m24895N((interfaceC3970c == null || interfaceC3970c.mo1534a() != trackGroup || interfaceC3970c.mo1519p(i) == -1) ? false : true);
    }

    /* renamed from: N */
    public static String m24895N(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    /* renamed from: O */
    public static String m24894O(int i) {
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

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: A */
    public void mo5644A(InterfaceC3494x2.C3495a c3495a, cp0.C0986b c0986b, cp0.C0987c c0987c) {
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: B */
    public void mo5643B(InterfaceC3494x2.C3495a c3495a) {
        m24893P(c3495a, "mediaPeriodReleased");
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: C */
    public void mo5642C(InterfaceC3494x2.C3495a c3495a, int i) {
        int mo14377h = c3495a.f31746b.mo14377h();
        int mo14375n = c3495a.f31746b.mo14375n();
        m24891R("timelineChanged [" + m24901H(c3495a) + ", periodCount=" + mo14377h + ", windowCount=" + mo14375n + ", reason=" + m24897L(i));
        for (int i2 = 0; i2 < Math.min(mo14377h, 3); i2++) {
            c3495a.f31746b.m15078f(i2, this.f6264c);
            m24891R("  period [" + m24898K(this.f6264c.m15064h()) + "]");
        }
        if (mo14377h > 3) {
            m24891R("  ...");
        }
        for (int i3 = 0; i3 < Math.min(mo14375n, 3); i3++) {
            c3495a.f31746b.m15075k(i3, this.f6263b);
            m24891R("  window [" + m24898K(this.f6263b.m15053c()) + ", " + this.f6263b.f20225d + ", " + this.f6263b.f20226e + "]");
        }
        if (mo14375n > 3) {
            m24891R("  ...");
        }
        m24891R("]");
    }

    /* renamed from: F */
    public final String m24903F(InterfaceC3494x2.C3495a c3495a, String str) {
        return str + " [" + m24901H(c3495a) + "]";
    }

    /* renamed from: G */
    public final String m24902G(InterfaceC3494x2.C3495a c3495a, String str, String str2) {
        return str + " [" + m24901H(c3495a) + ", " + str2 + "]";
    }

    /* renamed from: H */
    public final String m24901H(InterfaceC3494x2.C3495a c3495a) {
        String str = "window=" + c3495a.f31747c;
        if (c3495a.f31748d != null) {
            str = str + ", period=" + c3495a.f31748d.f5022a;
            if (c3495a.f31748d.m25954b()) {
                str = (str + ", adGroup=" + c3495a.f31748d.f5023b) + ", ad=" + c3495a.f31748d.f5024c;
            }
        }
        return m24898K(c3495a.f31745a - this.f6265d) + ", " + m24898K(c3495a.f31750f) + ", " + str;
    }

    /* renamed from: P */
    public final void m24893P(InterfaceC3494x2.C3495a c3495a, String str) {
        m24891R(m24903F(c3495a, str));
    }

    /* renamed from: Q */
    public final void m24892Q(InterfaceC3494x2.C3495a c3495a, String str, String str2) {
        m24891R(m24902G(c3495a, str, str2));
    }

    /* renamed from: R */
    public void m24891R(String str) {
    }

    /* renamed from: S */
    public final void m24890S(InterfaceC3494x2.C3495a c3495a, String str, String str2, Throwable th) {
        m24888U(m24902G(c3495a, str, str2), th);
    }

    /* renamed from: T */
    public final void m24889T(InterfaceC3494x2.C3495a c3495a, String str, Throwable th) {
        m24888U(m24903F(c3495a, str), th);
    }

    /* renamed from: U */
    public void m24888U(String str, Throwable th) {
    }

    /* renamed from: V */
    public final void m24887V(InterfaceC3494x2.C3495a c3495a, String str, Exception exc) {
        m24890S(c3495a, "internalError", str, exc);
    }

    /* renamed from: W */
    public final void m24886W(Metadata metadata, String str) {
        for (int i = 0; i < metadata.m1648b(); i++) {
            m24891R(str + metadata.m1649a(i));
        }
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: a */
    public void mo5641a(InterfaceC3494x2.C3495a c3495a, cp0.C0987c c0987c) {
        m24892Q(c3495a, "upstreamDiscarded", Format.m1733M(c0987c.f6060c));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: b */
    public void mo5640b(InterfaceC3494x2.C3495a c3495a, cp0.C0987c c0987c) {
        m24892Q(c3495a, "downstreamFormatChanged", Format.m1733M(c0987c.f6060c));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: c */
    public void mo5639c(InterfaceC3494x2.C3495a c3495a, int i, long j) {
        m24892Q(c3495a, "droppedFrames", Integer.toString(i));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: d */
    public void mo5638d(InterfaceC3494x2.C3495a c3495a, cp0.C0986b c0986b, cp0.C0987c c0987c) {
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: e */
    public void mo5637e(InterfaceC3494x2.C3495a c3495a, int i) {
        m24892Q(c3495a, "audioSessionId", Integer.toString(i));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: f */
    public void mo5636f(InterfaceC3494x2.C3495a c3495a) {
        m24893P(c3495a, "seekStarted");
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: g */
    public void mo5635g(InterfaceC3494x2.C3495a c3495a, boolean z, int i) {
        m24892Q(c3495a, "state", z + ", " + m24899J(i));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: h */
    public void mo5634h(InterfaceC3494x2.C3495a c3495a, int i) {
        m24892Q(c3495a, "positionDiscontinuity", m24904E(i));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: i */
    public void mo5633i(InterfaceC3494x2.C3495a c3495a, int i, C1321fq c1321fq) {
        m24892Q(c3495a, "decoderDisabled", m24894O(i));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: j */
    public void mo5632j(InterfaceC3494x2.C3495a c3495a, boolean z) {
        m24892Q(c3495a, "loading", Boolean.toString(z));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: k */
    public void mo5631k(InterfaceC3494x2.C3495a c3495a, int i, Format format) {
        m24892Q(c3495a, "decoderInputFormatChanged", m24894O(i) + ", " + Format.m1733M(format));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: l */
    public void mo5630l(InterfaceC3494x2.C3495a c3495a, Metadata metadata) {
        m24891R("metadata [" + m24901H(c3495a) + ", ");
        m24886W(metadata, "  ");
        m24891R("]");
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: m */
    public void mo5629m(InterfaceC3494x2.C3495a c3495a, Surface surface) {
        m24892Q(c3495a, "renderedFirstFrame", surface.toString());
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: n */
    public void mo5628n(InterfaceC3494x2.C3495a c3495a, TrackGroupArray trackGroupArray, um1 um1Var) {
        int i;
        AbstractC3968b abstractC3968b = this.f6262a;
        AbstractC3968b.C3969a m1545e = abstractC3968b != null ? abstractC3968b.m1545e() : null;
        if (m1545e == null) {
            m24892Q(c3495a, "tracksChanged", "[]");
            return;
        }
        m24891R("tracksChanged [" + m24901H(c3495a) + ", ");
        int m1539c = m1545e.m1539c();
        int i2 = 0;
        while (true) {
            String str = "  ]";
            String str2 = " [";
            if (i2 >= m1539c) {
                break;
            }
            TrackGroupArray m1537e = m1545e.m1537e(i2);
            InterfaceC3970c m8019a = um1Var.m8019a(i2);
            if (m1537e.f35848p > 0) {
                StringBuilder sb = new StringBuilder();
                i = m1539c;
                sb.append("  Renderer:");
                sb.append(i2);
                sb.append(" [");
                m24891R(sb.toString());
                int i3 = 0;
                while (i3 < m1537e.f35848p) {
                    TrackGroup m1594a = m1537e.m1594a(i3);
                    TrackGroupArray trackGroupArray2 = m1537e;
                    String str3 = str;
                    String m24905D = m24905D(m1594a.f35844p, m1545e.m1541a(i2, i3, false));
                    m24891R("    Group:" + i3 + ", adaptive_supported=" + m24905D + str2);
                    int i4 = 0;
                    while (i4 < m1594a.f35844p) {
                        String m24896M = m24896M(m8019a, m1594a, i4);
                        String m24900I = m24900I(m1545e.m1536f(i2, i3, i4));
                        String str4 = str2;
                        m24891R("      " + m24896M + " Track:" + i4 + ", " + Format.m1733M(m1594a.m1598a(i4)) + ", supported=" + m24900I);
                        i4++;
                        str2 = str4;
                    }
                    m24891R("    ]");
                    i3++;
                    m1537e = trackGroupArray2;
                    str = str3;
                }
                String str5 = str;
                if (m8019a != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= m8019a.length()) {
                            break;
                        }
                        Metadata metadata = m8019a.mo1531d(i5).f35719s;
                        if (metadata != null) {
                            m24891R("    Metadata [");
                            m24886W(metadata, "      ");
                            m24891R("    ]");
                            break;
                        }
                        i5++;
                    }
                }
                m24891R(str5);
            } else {
                i = m1539c;
            }
            i2++;
            m1539c = i;
        }
        String str6 = " [";
        TrackGroupArray m1535g = m1545e.m1535g();
        if (m1535g.f35848p > 0) {
            m24891R("  Renderer:None [");
            int i6 = 0;
            while (i6 < m1535g.f35848p) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("    Group:");
                sb2.append(i6);
                String str7 = str6;
                sb2.append(str7);
                m24891R(sb2.toString());
                TrackGroup m1594a2 = m1535g.m1594a(i6);
                for (int i7 = 0; i7 < m1594a2.f35844p; i7++) {
                    String m24895N = m24895N(false);
                    String m24900I2 = m24900I(0);
                    m24891R("      " + m24895N + " Track:" + i7 + ", " + Format.m1733M(m1594a2.m1598a(i7)) + ", supported=" + m24900I2);
                }
                m24891R("    ]");
                i6++;
                str6 = str7;
            }
            m24891R("  ]");
        }
        m24891R("]");
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: o */
    public void mo5627o(InterfaceC3494x2.C3495a c3495a, cp0.C0986b c0986b, cp0.C0987c c0987c) {
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: p */
    public void mo5626p(InterfaceC3494x2.C3495a c3495a) {
        m24893P(c3495a, "mediaPeriodCreated");
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: q */
    public void mo5625q(InterfaceC3494x2.C3495a c3495a, cp0.C0986b c0986b, cp0.C0987c c0987c, IOException iOException, boolean z) {
        m24887V(c3495a, "loadError", iOException);
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: r */
    public void mo5624r(InterfaceC3494x2.C3495a c3495a, int i, long j, long j2) {
        m24890S(c3495a, "audioTrackUnderrun", i + ", " + j + ", " + j2 + "]", null);
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: s */
    public void mo5623s(InterfaceC3494x2.C3495a c3495a, int i, C1321fq c1321fq) {
        m24892Q(c3495a, "decoderEnabled", m24894O(i));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: t */
    public void mo5622t(InterfaceC3494x2.C3495a c3495a, zw0 zw0Var) {
        m24892Q(c3495a, "playbackParameters", sq1.m10001o("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(zw0Var.f35605a), Float.valueOf(zw0Var.f35606b), Boolean.valueOf(zw0Var.f35607c)));
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: u */
    public void mo5621u(InterfaceC3494x2.C3495a c3495a) {
        m24893P(c3495a, "mediaPeriodReadingStarted");
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: v */
    public void mo5620v(InterfaceC3494x2.C3495a c3495a, int i, String str, long j) {
        m24892Q(c3495a, "decoderInitialized", m24894O(i) + ", " + str);
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: w */
    public void mo5619w(InterfaceC3494x2.C3495a c3495a, int i, long j, long j2) {
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: x */
    public void mo5618x(InterfaceC3494x2.C3495a c3495a, int i, int i2, int i3, float f) {
        m24892Q(c3495a, "videoSizeChanged", i + ", " + i2);
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: y */
    public void mo5617y(InterfaceC3494x2.C3495a c3495a, C2802qz c2802qz) {
        m24889T(c3495a, "playerFailed", c2802qz);
    }

    @Override // com.daaw.InterfaceC3494x2
    /* renamed from: z */
    public void mo5616z(InterfaceC3494x2.C3495a c3495a) {
        m24893P(c3495a, "seekProcessed");
    }
}

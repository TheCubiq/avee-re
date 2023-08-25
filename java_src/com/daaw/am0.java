package com.daaw;

import com.daaw.gx0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class am0 implements pe1 {

    /* renamed from: a */
    public static final C3445wk[] f3309a;

    static {
        gx0.EnumC1483a enumC1483a = gx0.EnumC1483a.WINAMP;
        gx0.EnumC1483a enumC1483a2 = gx0.EnumC1483a.MEDIA_PLAYER_CLASSIC;
        gx0.EnumC1483a enumC1483a3 = gx0.EnumC1483a.FOOBAR2000;
        gx0.EnumC1483a enumC1483a4 = gx0.EnumC1483a.REALPLAYER;
        f3309a = new C3445wk[]{new C3445wk(new String[]{".m3u"}, new String[]{"audio/x-mpegurl", "audio/mpegurl"}, new gx0[]{new gx0(enumC1483a, true, null), new gx0(gx0.EnumC1483a.VLC_MEDIA_PLAYER, true, null), new gx0(gx0.EnumC1483a.WINDOWS_MEDIA_PLAYER, true, null), new gx0(enumC1483a2, true, null), new gx0(enumC1483a3, true, null), new gx0(gx0.EnumC1483a.MPLAYER, true, null), new gx0(gx0.EnumC1483a.QUICKTIME, true, null), new gx0(gx0.EnumC1483a.ITUNES, true, null), new gx0(enumC1483a4, false, null)}, "Winamp M3U"), new C3445wk(new String[]{".m3u8"}, new String[]{"audio/x-mpegurl", "audio/mpegurl"}, new gx0[]{new gx0(enumC1483a, true, null), new gx0(enumC1483a3, true, null)}, "Winamp M3U8"), new C3445wk(new String[]{".m4u"}, new String[]{"video/x-mpegurl"}, new gx0[0], "M4U Playlist"), new C3445wk(new String[]{".ram"}, new String[]{"audio/vnd.rn-realaudio", "audio/x-pn-realaudio"}, new gx0[]{new gx0(enumC1483a2, false, null), new gx0(enumC1483a4, false, null)}, "Real Audio Metadata (RAM)")};
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        r3 = new com.daaw.a51();
        r3.m27605e(r2);
        r3.m27604f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        r3.m27606d(java.lang.Long.parseLong(r1));
     */
    @Override // com.daaw.pe1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oe1 mo13427a(InputStream inputStream, String str, bl0 bl0Var) {
        a51 a51Var;
        if (str == null) {
            str = "UTF-8";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        zl0 zl0Var = new zl0();
        zl0Var.m2133e(this);
        loop0: while (true) {
            String str2 = null;
            String str3 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return zl0Var;
                }
                String trim = readLine.trim();
                if (trim.length() > 0) {
                    char charAt = trim.charAt(0);
                    if (charAt != '<' && charAt != '[') {
                        if (charAt != '#') {
                            break;
                        } else if (trim.toUpperCase(Locale.ENGLISH).startsWith("#EXTINF")) {
                            int indexOf = trim.indexOf(44, 0);
                            if (indexOf >= 0) {
                                str2 = trim.substring(indexOf + 1, trim.length());
                            }
                            int indexOf2 = trim.indexOf(58, 0);
                            if (indexOf2 >= 0 && indexOf2 < indexOf) {
                                str3 = trim.substring(indexOf2 + 1, indexOf).trim();
                            }
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            zl0Var.m2135c().add(a51Var);
        }
        throw new IllegalArgumentException("Doesn't seem to be a M3U playlist (and related ones)");
    }

    @Override // com.daaw.pe1
    /* renamed from: b */
    public C3445wk[] mo13426b() {
        return (C3445wk[]) f3309a.clone();
    }

    @Override // com.daaw.pe1
    /* renamed from: c */
    public oe1 mo13425c(ix0 ix0Var) {
        zl0 zl0Var = new zl0();
        zl0Var.m2133e(this);
        m27343d(zl0Var.m2135c(), ix0Var.m19301a());
        return zl0Var;
    }

    /* renamed from: d */
    public final void m27343d(List<a51> list, AbstractC2227n abstractC2227n) {
        if (!(abstractC2227n instanceof fb1)) {
            if (abstractC2227n instanceof yn0) {
                yn0 yn0Var = (yn0) abstractC2227n;
                if (yn0Var.m3487b() != null) {
                    throw new IllegalArgumentException("A M3U playlist cannot handle a timed media");
                }
                if (yn0Var.m15649a() < 0) {
                    throw new IllegalArgumentException("A M3U playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.m3486c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) abstractC2227n;
        if (fb1Var.m15649a() < 0) {
            throw new IllegalArgumentException("A M3U playlist cannot handle a sequence repeated indefinitely");
        }
        AbstractC2227n[] m13789b = fb1Var.m13789b();
        for (int i = 0; i < fb1Var.m15649a(); i++) {
            for (AbstractC2227n abstractC2227n2 : m13789b) {
                m27343d(list, abstractC2227n2);
            }
        }
    }

    @Override // com.daaw.pe1
    public String getId() {
        return "m3u";
    }
}

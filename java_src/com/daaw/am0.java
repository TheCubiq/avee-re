package com.daaw;

import com.daaw.gx0;
import java.util.List;
/* loaded from: classes.dex */
public class am0 implements pe1 {
    public static final wk[] a;

    static {
        gx0.a aVar = gx0.a.WINAMP;
        gx0.a aVar2 = gx0.a.MEDIA_PLAYER_CLASSIC;
        gx0.a aVar3 = gx0.a.FOOBAR2000;
        gx0.a aVar4 = gx0.a.REALPLAYER;
        a = new wk[]{new wk(new String[]{".m3u"}, new String[]{"audio/x-mpegurl", "audio/mpegurl"}, new gx0[]{new gx0(aVar, true, null), new gx0(gx0.a.VLC_MEDIA_PLAYER, true, null), new gx0(gx0.a.WINDOWS_MEDIA_PLAYER, true, null), new gx0(aVar2, true, null), new gx0(aVar3, true, null), new gx0(gx0.a.MPLAYER, true, null), new gx0(gx0.a.QUICKTIME, true, null), new gx0(gx0.a.ITUNES, true, null), new gx0(aVar4, false, null)}, "Winamp M3U"), new wk(new String[]{".m3u8"}, new String[]{"audio/x-mpegurl", "audio/mpegurl"}, new gx0[]{new gx0(aVar, true, null), new gx0(aVar3, true, null)}, "Winamp M3U8"), new wk(new String[]{".m4u"}, new String[]{"video/x-mpegurl"}, new gx0[0], "M4U Playlist"), new wk(new String[]{".ram"}, new String[]{"audio/vnd.rn-realaudio", "audio/x-pn-realaudio"}, new gx0[]{new gx0(aVar2, false, null), new gx0(aVar4, false, null)}, "Real Audio Metadata (RAM)")};
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        r3 = new com.daaw.a51();
        r3.e(r2);
        r3.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        r3.d(java.lang.Long.parseLong(r1));
     */
    @Override // com.daaw.pe1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.daaw.oe1 a(java.io.InputStream r7, java.lang.String r8, com.daaw.bl0 r9) {
        /*
            r6 = this;
            if (r8 != 0) goto L4
            java.lang.String r8 = "UTF-8"
        L4:
            java.io.BufferedReader r9 = new java.io.BufferedReader
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r7, r8)
            r9.<init>(r0)
            com.daaw.zl0 r7 = new com.daaw.zl0
            r7.<init>()
            r7.e(r6)
            r8 = 0
        L17:
            r0 = r8
            r1 = r0
        L19:
            java.lang.String r2 = r9.readLine()
            if (r2 == 0) goto L93
            java.lang.String r2 = r2.trim()
            int r3 = r2.length()
            if (r3 <= 0) goto L19
            r3 = 0
            char r4 = r2.charAt(r3)
            r5 = 60
            if (r4 == r5) goto L8b
            r5 = 91
            if (r4 == r5) goto L8b
            r5 = 35
            if (r4 != r5) goto L6f
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.String r4 = r2.toUpperCase(r4)
            java.lang.String r5 = "#EXTINF"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L19
            r4 = 44
            int r4 = r2.indexOf(r4, r3)
            if (r4 < 0) goto L5a
            int r0 = r4 + 1
            int r5 = r2.length()
            java.lang.String r0 = r2.substring(r0, r5)
        L5a:
            r5 = 58
            int r3 = r2.indexOf(r5, r3)
            if (r3 < 0) goto L19
            if (r3 >= r4) goto L19
            int r3 = r3 + 1
            java.lang.String r1 = r2.substring(r3, r4)
            java.lang.String r1 = r1.trim()
            goto L19
        L6f:
            com.daaw.a51 r3 = new com.daaw.a51
            r3.<init>()
            r3.e(r2)
            r3.f(r0)
            if (r1 == 0) goto L83
            long r0 = java.lang.Long.parseLong(r1)
            r3.d(r0)
        L83:
            java.util.List r0 = r7.c()
            r0.add(r3)
            goto L17
        L8b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Doesn't seem to be a M3U playlist (and related ones)"
            r7.<init>(r8)
            throw r7
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.am0.a(java.io.InputStream, java.lang.String, com.daaw.bl0):com.daaw.oe1");
    }

    @Override // com.daaw.pe1
    public wk[] b() {
        return (wk[]) a.clone();
    }

    @Override // com.daaw.pe1
    public oe1 c(ix0 ix0Var) {
        zl0 zl0Var = new zl0();
        zl0Var.e(this);
        d(zl0Var.c(), ix0Var.a());
        return zl0Var;
    }

    public final void d(List<a51> list, n nVar) {
        if (!(nVar instanceof fb1)) {
            if (nVar instanceof yn0) {
                yn0 yn0Var = (yn0) nVar;
                if (yn0Var.b() != null) {
                    throw new IllegalArgumentException("A M3U playlist cannot handle a timed media");
                }
                if (yn0Var.a() < 0) {
                    throw new IllegalArgumentException("A M3U playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) nVar;
        if (fb1Var.a() < 0) {
            throw new IllegalArgumentException("A M3U playlist cannot handle a sequence repeated indefinitely");
        }
        n[] b = fb1Var.b();
        for (int i = 0; i < fb1Var.a(); i++) {
            for (n nVar2 : b) {
                d(list, nVar2);
            }
        }
    }

    @Override // com.daaw.pe1
    public String getId() {
        return "m3u";
    }
}

package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
/* loaded from: classes.dex */
public final class zp0 {
    public static final int a = sq1.v("nam");
    public static final int b = sq1.v("trk");
    public static final int c = sq1.v("cmt");
    public static final int d = sq1.v("day");
    public static final int e = sq1.v("ART");
    public static final int f = sq1.v("too");
    public static final int g = sq1.v("alb");
    public static final int h = sq1.v("com");
    public static final int i = sq1.v("wrt");
    public static final int j = sq1.v("lyr");
    public static final int k = sq1.v("gen");
    public static final int l = sq1.v("covr");
    public static final int m = sq1.v("gnre");
    public static final int n = sq1.v("grp");
    public static final int o = sq1.v("disk");
    public static final int p = sq1.v("trkn");
    public static final int q = sq1.v("tmpo");
    public static final int r = sq1.v("cpil");
    public static final int s = sq1.v("aART");
    public static final int t = sq1.v("sonm");
    public static final int u = sq1.v("soal");
    public static final int v = sq1.v("soar");
    public static final int w = sq1.v("soaa");
    public static final int x = sq1.v("soco");
    public static final int y = sq1.v("rtng");
    public static final int z = sq1.v("pgap");
    public static final int A = sq1.v("sosn");
    public static final int B = sq1.v("tvsh");
    public static final int C = sq1.v("----");
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static CommentFrame a(int i2, rv0 rv0Var) {
        int i3 = rv0Var.i();
        if (rv0Var.i() == b7.G0) {
            rv0Var.K(8);
            String s2 = rv0Var.s(i3 - 16);
            return new CommentFrame("und", s2, s2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse comment attribute: ");
        sb.append(b7.a(i2));
        return null;
    }

    public static ApicFrame b(rv0 rv0Var) {
        int i2 = rv0Var.i();
        if (rv0Var.i() == b7.G0) {
            int b2 = b7.b(rv0Var.i());
            String str = b2 == 13 ? "image/jpeg" : b2 == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized cover art flags: ");
                sb.append(b2);
                return null;
            }
            rv0Var.K(4);
            int i3 = i2 - 16;
            byte[] bArr = new byte[i3];
            rv0Var.g(bArr, 0, i3);
            return new ApicFrame(str, null, 3, bArr);
        }
        return null;
    }

    public static Metadata.Entry c(rv0 rv0Var) {
        int c2 = rv0Var.c() + rv0Var.i();
        int i2 = rv0Var.i();
        int i3 = (i2 >> 24) & 255;
        try {
            if (i3 == 169 || i3 == 65533) {
                int i4 = 16777215 & i2;
                if (i4 == c) {
                    return a(i2, rv0Var);
                }
                if (i4 != a && i4 != b) {
                    if (i4 != h && i4 != i) {
                        if (i4 == d) {
                            return g(i2, "TDRC", rv0Var);
                        }
                        if (i4 == e) {
                            return g(i2, "TPE1", rv0Var);
                        }
                        if (i4 == f) {
                            return g(i2, "TSSE", rv0Var);
                        }
                        if (i4 == g) {
                            return g(i2, "TALB", rv0Var);
                        }
                        if (i4 == j) {
                            return g(i2, "USLT", rv0Var);
                        }
                        if (i4 == k) {
                            return g(i2, "TCON", rv0Var);
                        }
                        if (i4 == n) {
                            return g(i2, "TIT1", rv0Var);
                        }
                    }
                    return g(i2, "TCOM", rv0Var);
                }
                return g(i2, "TIT2", rv0Var);
            } else if (i2 == m) {
                return f(rv0Var);
            } else {
                if (i2 == o) {
                    return d(i2, "TPOS", rv0Var);
                }
                if (i2 == p) {
                    return d(i2, "TRCK", rv0Var);
                }
                if (i2 == q) {
                    return h(i2, "TBPM", rv0Var, true, false);
                }
                if (i2 == r) {
                    return h(i2, "TCMP", rv0Var, true, true);
                }
                if (i2 == l) {
                    return b(rv0Var);
                }
                if (i2 == s) {
                    return g(i2, "TPE2", rv0Var);
                }
                if (i2 == t) {
                    return g(i2, "TSOT", rv0Var);
                }
                if (i2 == u) {
                    return g(i2, "TSO2", rv0Var);
                }
                if (i2 == v) {
                    return g(i2, "TSOA", rv0Var);
                }
                if (i2 == w) {
                    return g(i2, "TSOP", rv0Var);
                }
                if (i2 == x) {
                    return g(i2, "TSOC", rv0Var);
                }
                if (i2 == y) {
                    return h(i2, "ITUNESADVISORY", rv0Var, false, false);
                }
                if (i2 == z) {
                    return h(i2, "ITUNESGAPLESS", rv0Var, false, true);
                }
                if (i2 == A) {
                    return g(i2, "TVSHOWSORT", rv0Var);
                }
                if (i2 == B) {
                    return g(i2, "TVSHOW", rv0Var);
                }
                if (i2 == C) {
                    return e(rv0Var, c2);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Skipped unknown metadata entry: ");
            sb.append(b7.a(i2));
            return null;
        } finally {
            rv0Var.J(c2);
        }
    }

    public static TextInformationFrame d(int i2, String str, rv0 rv0Var) {
        int i3 = rv0Var.i();
        if (rv0Var.i() == b7.G0 && i3 >= 22) {
            rv0Var.K(10);
            int D2 = rv0Var.D();
            if (D2 > 0) {
                String str2 = "" + D2;
                int D3 = rv0Var.D();
                if (D3 > 0) {
                    str2 = str2 + "/" + D3;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse index/count attribute: ");
        sb.append(b7.a(i2));
        return null;
    }

    public static Id3Frame e(rv0 rv0Var, int i2) {
        String str = null;
        String str2 = null;
        int i3 = -1;
        int i4 = -1;
        while (rv0Var.c() < i2) {
            int c2 = rv0Var.c();
            int i5 = rv0Var.i();
            int i6 = rv0Var.i();
            rv0Var.K(4);
            if (i6 == b7.E0) {
                str = rv0Var.s(i5 - 12);
            } else if (i6 == b7.F0) {
                str2 = rv0Var.s(i5 - 12);
            } else {
                if (i6 == b7.G0) {
                    i3 = c2;
                    i4 = i5;
                }
                rv0Var.K(i5 - 12);
            }
        }
        if ("com.apple.iTunes".equals(str) && "iTunSMPB".equals(str2) && i3 != -1) {
            rv0Var.J(i3);
            rv0Var.K(16);
            return new CommentFrame("und", str2, rv0Var.s(i4 - 16));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.TextInformationFrame f(com.daaw.rv0 r3) {
        /*
            int r3 = i(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.daaw.zp0.D
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zp0.f(com.daaw.rv0):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    public static TextInformationFrame g(int i2, String str, rv0 rv0Var) {
        int i3 = rv0Var.i();
        if (rv0Var.i() == b7.G0) {
            rv0Var.K(8);
            return new TextInformationFrame(str, null, rv0Var.s(i3 - 16));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse text attribute: ");
        sb.append(b7.a(i2));
        return null;
    }

    public static Id3Frame h(int i2, String str, rv0 rv0Var, boolean z2, boolean z3) {
        int i3 = i(rv0Var);
        if (z3) {
            i3 = Math.min(1, i3);
        }
        if (i3 >= 0) {
            return z2 ? new TextInformationFrame(str, null, Integer.toString(i3)) : new CommentFrame("und", str, Integer.toString(i3));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse uint8 attribute: ");
        sb.append(b7.a(i2));
        return null;
    }

    public static int i(rv0 rv0Var) {
        rv0Var.K(4);
        if (rv0Var.i() == b7.G0) {
            rv0Var.K(8);
            return rv0Var.x();
        }
        return -1;
    }
}

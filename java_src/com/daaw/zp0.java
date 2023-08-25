package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
/* loaded from: classes.dex */
public final class zp0 {

    /* renamed from: a */
    public static final int f35339a = sq1.m9994v("nam");

    /* renamed from: b */
    public static final int f35340b = sq1.m9994v("trk");

    /* renamed from: c */
    public static final int f35341c = sq1.m9994v("cmt");

    /* renamed from: d */
    public static final int f35342d = sq1.m9994v("day");

    /* renamed from: e */
    public static final int f35343e = sq1.m9994v("ART");

    /* renamed from: f */
    public static final int f35344f = sq1.m9994v("too");

    /* renamed from: g */
    public static final int f35345g = sq1.m9994v("alb");

    /* renamed from: h */
    public static final int f35346h = sq1.m9994v("com");

    /* renamed from: i */
    public static final int f35347i = sq1.m9994v("wrt");

    /* renamed from: j */
    public static final int f35348j = sq1.m9994v("lyr");

    /* renamed from: k */
    public static final int f35349k = sq1.m9994v("gen");

    /* renamed from: l */
    public static final int f35350l = sq1.m9994v("covr");

    /* renamed from: m */
    public static final int f35351m = sq1.m9994v("gnre");

    /* renamed from: n */
    public static final int f35352n = sq1.m9994v("grp");

    /* renamed from: o */
    public static final int f35353o = sq1.m9994v("disk");

    /* renamed from: p */
    public static final int f35354p = sq1.m9994v("trkn");

    /* renamed from: q */
    public static final int f35355q = sq1.m9994v("tmpo");

    /* renamed from: r */
    public static final int f35356r = sq1.m9994v("cpil");

    /* renamed from: s */
    public static final int f35357s = sq1.m9994v("aART");

    /* renamed from: t */
    public static final int f35358t = sq1.m9994v("sonm");

    /* renamed from: u */
    public static final int f35359u = sq1.m9994v("soal");

    /* renamed from: v */
    public static final int f35360v = sq1.m9994v("soar");

    /* renamed from: w */
    public static final int f35361w = sq1.m9994v("soaa");

    /* renamed from: x */
    public static final int f35362x = sq1.m9994v("soco");

    /* renamed from: y */
    public static final int f35363y = sq1.m9994v("rtng");

    /* renamed from: z */
    public static final int f35364z = sq1.m9994v("pgap");

    /* renamed from: A */
    public static final int f35335A = sq1.m9994v("sosn");

    /* renamed from: B */
    public static final int f35336B = sq1.m9994v("tvsh");

    /* renamed from: C */
    public static final int f35337C = sq1.m9994v("----");

    /* renamed from: D */
    public static final String[] f35338D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    public static CommentFrame m2019a(int i, rv0 rv0Var) {
        int m10911i = rv0Var.m10911i();
        if (rv0Var.m10911i() == AbstractC0821b7.f4391G0) {
            rv0Var.m10920K(8);
            String m10901s = rv0Var.m10901s(m10911i - 16);
            return new CommentFrame("und", m10901s, m10901s);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse comment attribute: ");
        sb.append(AbstractC0821b7.m26448a(i));
        return null;
    }

    /* renamed from: b */
    public static ApicFrame m2018b(rv0 rv0Var) {
        int m10911i = rv0Var.m10911i();
        if (rv0Var.m10911i() == AbstractC0821b7.f4391G0) {
            int m26447b = AbstractC0821b7.m26447b(rv0Var.m10911i());
            String str = m26447b == 13 ? "image/jpeg" : m26447b == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized cover art flags: ");
                sb.append(m26447b);
                return null;
            }
            rv0Var.m10920K(4);
            int i = m10911i - 16;
            byte[] bArr = new byte[i];
            rv0Var.m10913g(bArr, 0, i);
            return new ApicFrame(str, null, 3, bArr);
        }
        return null;
    }

    /* renamed from: c */
    public static Metadata.Entry m2017c(rv0 rv0Var) {
        int m10917c = rv0Var.m10917c() + rv0Var.m10911i();
        int m10911i = rv0Var.m10911i();
        int i = (m10911i >> 24) & 255;
        try {
            if (i == 169 || i == 65533) {
                int i2 = 16777215 & m10911i;
                if (i2 == f35341c) {
                    return m2019a(m10911i, rv0Var);
                }
                if (i2 != f35339a && i2 != f35340b) {
                    if (i2 != f35346h && i2 != f35347i) {
                        if (i2 == f35342d) {
                            return m2013g(m10911i, "TDRC", rv0Var);
                        }
                        if (i2 == f35343e) {
                            return m2013g(m10911i, "TPE1", rv0Var);
                        }
                        if (i2 == f35344f) {
                            return m2013g(m10911i, "TSSE", rv0Var);
                        }
                        if (i2 == f35345g) {
                            return m2013g(m10911i, "TALB", rv0Var);
                        }
                        if (i2 == f35348j) {
                            return m2013g(m10911i, "USLT", rv0Var);
                        }
                        if (i2 == f35349k) {
                            return m2013g(m10911i, "TCON", rv0Var);
                        }
                        if (i2 == f35352n) {
                            return m2013g(m10911i, "TIT1", rv0Var);
                        }
                    }
                    return m2013g(m10911i, "TCOM", rv0Var);
                }
                return m2013g(m10911i, "TIT2", rv0Var);
            } else if (m10911i == f35351m) {
                return m2014f(rv0Var);
            } else {
                if (m10911i == f35353o) {
                    return m2016d(m10911i, "TPOS", rv0Var);
                }
                if (m10911i == f35354p) {
                    return m2016d(m10911i, "TRCK", rv0Var);
                }
                if (m10911i == f35355q) {
                    return m2012h(m10911i, "TBPM", rv0Var, true, false);
                }
                if (m10911i == f35356r) {
                    return m2012h(m10911i, "TCMP", rv0Var, true, true);
                }
                if (m10911i == f35350l) {
                    return m2018b(rv0Var);
                }
                if (m10911i == f35357s) {
                    return m2013g(m10911i, "TPE2", rv0Var);
                }
                if (m10911i == f35358t) {
                    return m2013g(m10911i, "TSOT", rv0Var);
                }
                if (m10911i == f35359u) {
                    return m2013g(m10911i, "TSO2", rv0Var);
                }
                if (m10911i == f35360v) {
                    return m2013g(m10911i, "TSOA", rv0Var);
                }
                if (m10911i == f35361w) {
                    return m2013g(m10911i, "TSOP", rv0Var);
                }
                if (m10911i == f35362x) {
                    return m2013g(m10911i, "TSOC", rv0Var);
                }
                if (m10911i == f35363y) {
                    return m2012h(m10911i, "ITUNESADVISORY", rv0Var, false, false);
                }
                if (m10911i == f35364z) {
                    return m2012h(m10911i, "ITUNESGAPLESS", rv0Var, false, true);
                }
                if (m10911i == f35335A) {
                    return m2013g(m10911i, "TVSHOWSORT", rv0Var);
                }
                if (m10911i == f35336B) {
                    return m2013g(m10911i, "TVSHOW", rv0Var);
                }
                if (m10911i == f35337C) {
                    return m2015e(rv0Var, m10917c);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Skipped unknown metadata entry: ");
            sb.append(AbstractC0821b7.m26448a(m10911i));
            return null;
        } finally {
            rv0Var.m10921J(m10917c);
        }
    }

    /* renamed from: d */
    public static TextInformationFrame m2016d(int i, String str, rv0 rv0Var) {
        int m10911i = rv0Var.m10911i();
        if (rv0Var.m10911i() == AbstractC0821b7.f4391G0 && m10911i >= 22) {
            rv0Var.m10920K(10);
            int m10927D = rv0Var.m10927D();
            if (m10927D > 0) {
                String str2 = "" + m10927D;
                int m10927D2 = rv0Var.m10927D();
                if (m10927D2 > 0) {
                    str2 = str2 + "/" + m10927D2;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse index/count attribute: ");
        sb.append(AbstractC0821b7.m26448a(i));
        return null;
    }

    /* renamed from: e */
    public static Id3Frame m2015e(rv0 rv0Var, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (rv0Var.m10917c() < i) {
            int m10917c = rv0Var.m10917c();
            int m10911i = rv0Var.m10911i();
            int m10911i2 = rv0Var.m10911i();
            rv0Var.m10920K(4);
            if (m10911i2 == AbstractC0821b7.f4387E0) {
                str = rv0Var.m10901s(m10911i - 12);
            } else if (m10911i2 == AbstractC0821b7.f4389F0) {
                str2 = rv0Var.m10901s(m10911i - 12);
            } else {
                if (m10911i2 == AbstractC0821b7.f4391G0) {
                    i2 = m10917c;
                    i3 = m10911i;
                }
                rv0Var.m10920K(m10911i - 12);
            }
        }
        if ("com.apple.iTunes".equals(str) && "iTunSMPB".equals(str2) && i2 != -1) {
            rv0Var.m10921J(i2);
            rv0Var.m10920K(16);
            return new CommentFrame("und", str2, rv0Var.m10901s(i3 - 16));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TextInformationFrame m2014f(rv0 rv0Var) {
        String str;
        int m2011i = m2011i(rv0Var);
        if (m2011i > 0) {
            String[] strArr = f35338D;
            if (m2011i <= strArr.length) {
                str = strArr[m2011i - 1];
                if (str == null) {
                    return new TextInformationFrame("TCON", null, str);
                }
                return null;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    /* renamed from: g */
    public static TextInformationFrame m2013g(int i, String str, rv0 rv0Var) {
        int m10911i = rv0Var.m10911i();
        if (rv0Var.m10911i() == AbstractC0821b7.f4391G0) {
            rv0Var.m10920K(8);
            return new TextInformationFrame(str, null, rv0Var.m10901s(m10911i - 16));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse text attribute: ");
        sb.append(AbstractC0821b7.m26448a(i));
        return null;
    }

    /* renamed from: h */
    public static Id3Frame m2012h(int i, String str, rv0 rv0Var, boolean z, boolean z2) {
        int m2011i = m2011i(rv0Var);
        if (z2) {
            m2011i = Math.min(1, m2011i);
        }
        if (m2011i >= 0) {
            return z ? new TextInformationFrame(str, null, Integer.toString(m2011i)) : new CommentFrame("und", str, Integer.toString(m2011i));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse uint8 attribute: ");
        sb.append(AbstractC0821b7.m26448a(i));
        return null;
    }

    /* renamed from: i */
    public static int m2011i(rv0 rv0Var) {
        rv0Var.m10920K(4);
        if (rv0Var.m10911i() == AbstractC0821b7.f4391G0) {
            rv0Var.m10920K(8);
            return rv0Var.m10896x();
        }
        return -1;
    }
}

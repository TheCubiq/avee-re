package com.daaw;

import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzacx;
import com.google.android.gms.internal.ads.zzade;
import com.google.android.gms.internal.ads.zzadg;
import com.google.android.gms.internal.ads.zzadm;
import com.google.android.gms.internal.ads.zzbp;
/* loaded from: classes.dex */
public final class y92 {

    /* renamed from: a */
    public static final String[] f33436a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b */
    public static final /* synthetic */ int f33437b = 0;

    /* renamed from: a */
    public static zzbp m3988a(ik5 ik5Var) {
        String str;
        String str2;
        int m19711k = ik5Var.m19711k() + ik5Var.m19709m();
        int m19709m = ik5Var.m19709m();
        int i = (m19709m >> 24) & 255;
        zzbp zzbpVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = m19709m & 16777215;
                if (i2 == 6516084) {
                    int m19709m2 = ik5Var.m19709m();
                    if (ik5Var.m19709m() == 1684108385) {
                        ik5Var.m19715g(8);
                        String m19725E = ik5Var.m19725E(m19709m2 - 16);
                        zzbpVar = new zzacx("und", m19725E, m19725E);
                    } else {
                        s95.m10493e("MetadataUtil", "Failed to parse comment attribute: ".concat(c92.m25487b(m19709m)));
                    }
                    return zzbpVar;
                } else if (i2 == 7233901 || i2 == 7631467) {
                    return m3984e(m19709m, "TIT2", ik5Var);
                } else {
                    if (i2 == 6516589 || i2 == 7828084) {
                        return m3984e(m19709m, "TCOM", ik5Var);
                    }
                    if (i2 == 6578553) {
                        return m3984e(m19709m, "TDRC", ik5Var);
                    }
                    if (i2 == 4280916) {
                        return m3984e(m19709m, "TPE1", ik5Var);
                    }
                    if (i2 == 7630703) {
                        return m3984e(m19709m, "TSSE", ik5Var);
                    }
                    if (i2 == 6384738) {
                        return m3984e(m19709m, "TALB", ik5Var);
                    }
                    if (i2 == 7108978) {
                        return m3984e(m19709m, "USLT", ik5Var);
                    }
                    if (i2 == 6776174) {
                        return m3984e(m19709m, "TCON", ik5Var);
                    }
                    if (i2 == 6779504) {
                        return m3984e(m19709m, "TIT1", ik5Var);
                    }
                }
            } else if (m19709m == 1735291493) {
                int m3987b = m3987b(ik5Var);
                String str3 = (m3987b <= 0 || m3987b > 192) ? null : f33436a[m3987b - 1];
                if (str3 != null) {
                    zzbpVar = new zzadm("TCON", null, str3);
                } else {
                    s95.m10493e("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzbpVar;
            } else if (m19709m == 1684632427) {
                return m3985d(1684632427, "TPOS", ik5Var);
            } else {
                if (m19709m == 1953655662) {
                    return m3985d(1953655662, "TRCK", ik5Var);
                }
                if (m19709m == 1953329263) {
                    return m3986c(1953329263, "TBPM", ik5Var, true, false);
                }
                if (m19709m == 1668311404) {
                    return m3986c(1668311404, "TCMP", ik5Var, true, true);
                }
                if (m19709m == 1668249202) {
                    int m19709m3 = ik5Var.m19709m();
                    if (ik5Var.m19709m() == 1684108385) {
                        int m19709m4 = ik5Var.m19709m() & 16777215;
                        if (m19709m4 == 13) {
                            str2 = "image/jpeg";
                        } else if (m19709m4 == 14) {
                            str2 = "image/png";
                            m19709m4 = 14;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            ik5Var.m19715g(4);
                            int i3 = m19709m3 - 16;
                            byte[] bArr = new byte[i3];
                            ik5Var.m19720b(bArr, 0, i3);
                            zzbpVar = new zzacp(str2, null, 3, bArr);
                            return zzbpVar;
                        }
                        str = "Unrecognized cover art flags: " + m19709m4;
                    } else {
                        str = "Failed to parse cover art attribute";
                    }
                    s95.m10493e("MetadataUtil", str);
                    return zzbpVar;
                } else if (m19709m == 1631670868) {
                    return m3984e(1631670868, "TPE2", ik5Var);
                } else {
                    if (m19709m == 1936682605) {
                        return m3984e(1936682605, "TSOT", ik5Var);
                    }
                    if (m19709m == 1936679276) {
                        return m3984e(1936679276, "TSO2", ik5Var);
                    }
                    if (m19709m == 1936679282) {
                        return m3984e(1936679282, "TSOA", ik5Var);
                    }
                    if (m19709m == 1936679265) {
                        return m3984e(1936679265, "TSOP", ik5Var);
                    }
                    if (m19709m == 1936679791) {
                        return m3984e(1936679791, "TSOC", ik5Var);
                    }
                    if (m19709m == 1920233063) {
                        return m3986c(1920233063, "ITUNESADVISORY", ik5Var, false, false);
                    }
                    if (m19709m == 1885823344) {
                        return m3986c(1885823344, "ITUNESGAPLESS", ik5Var, false, true);
                    }
                    if (m19709m == 1936683886) {
                        return m3984e(1936683886, "TVSHOWSORT", ik5Var);
                    }
                    if (m19709m == 1953919848) {
                        return m3984e(1953919848, "TVSHOW", ik5Var);
                    }
                    if (m19709m == 757935405) {
                        String str4 = null;
                        String str5 = null;
                        int i4 = -1;
                        int i5 = -1;
                        while (ik5Var.m19711k() < m19711k) {
                            int m19711k2 = ik5Var.m19711k();
                            int m19709m5 = ik5Var.m19709m();
                            int m19709m6 = ik5Var.m19709m();
                            ik5Var.m19715g(4);
                            if (m19709m6 == 1835360622) {
                                str4 = ik5Var.m19725E(m19709m5 - 12);
                            } else if (m19709m6 == 1851878757) {
                                str5 = ik5Var.m19725E(m19709m5 - 12);
                            } else {
                                if (m19709m6 == 1684108385) {
                                    i5 = m19709m5;
                                }
                                if (m19709m6 == 1684108385) {
                                    i4 = m19711k2;
                                }
                                ik5Var.m19715g(m19709m5 - 12);
                            }
                        }
                        if (str4 != null && str5 != null && i4 != -1) {
                            ik5Var.m19716f(i4);
                            ik5Var.m19715g(16);
                            zzbpVar = new zzadg(str4, str5, ik5Var.m19725E(i5 - 16));
                        }
                        return zzbpVar;
                    }
                }
            }
            s95.m10497a("MetadataUtil", "Skipped unknown metadata entry: " + c92.m25487b(m19709m));
            return null;
        } finally {
            ik5Var.m19716f(m19711k);
        }
    }

    /* renamed from: b */
    public static int m3987b(ik5 ik5Var) {
        ik5Var.m19715g(4);
        if (ik5Var.m19709m() == 1684108385) {
            ik5Var.m19715g(8);
            return ik5Var.m19703s();
        }
        s95.m10493e("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: c */
    public static zzade m3986c(int i, String str, ik5 ik5Var, boolean z, boolean z2) {
        int m3987b = m3987b(ik5Var);
        if (z2) {
            m3987b = Math.min(1, m3987b);
        }
        if (m3987b >= 0) {
            return z ? new zzadm(str, null, Integer.toString(m3987b)) : new zzacx("und", str, Integer.toString(m3987b));
        }
        s95.m10493e("MetadataUtil", "Failed to parse uint8 attribute: ".concat(c92.m25487b(i)));
        return null;
    }

    /* renamed from: d */
    public static zzadm m3985d(int i, String str, ik5 ik5Var) {
        int m19709m = ik5Var.m19709m();
        if (ik5Var.m19709m() == 1684108385 && m19709m >= 22) {
            ik5Var.m19715g(10);
            int m19699w = ik5Var.m19699w();
            if (m19699w > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(m19699w);
                String sb2 = sb.toString();
                int m19699w2 = ik5Var.m19699w();
                if (m19699w2 > 0) {
                    sb2 = sb2 + "/" + m19699w2;
                }
                return new zzadm(str, null, sb2);
            }
        }
        s95.m10493e("MetadataUtil", "Failed to parse index/count attribute: ".concat(c92.m25487b(i)));
        return null;
    }

    /* renamed from: e */
    public static zzadm m3984e(int i, String str, ik5 ik5Var) {
        int m19709m = ik5Var.m19709m();
        if (ik5Var.m19709m() == 1684108385) {
            ik5Var.m19715g(8);
            return new zzadm(str, null, ik5Var.m19725E(m19709m - 16));
        }
        s95.m10493e("MetadataUtil", "Failed to parse text attribute: ".concat(c92.m25487b(i)));
        return null;
    }
}

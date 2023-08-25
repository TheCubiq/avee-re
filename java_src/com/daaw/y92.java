package com.daaw;

import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzacx;
import com.google.android.gms.internal.ads.zzade;
import com.google.android.gms.internal.ads.zzadg;
import com.google.android.gms.internal.ads.zzadm;
import com.google.android.gms.internal.ads.zzbp;
/* loaded from: classes.dex */
public final class y92 {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int b = 0;

    public static zzbp a(ik5 ik5Var) {
        String str;
        String str2;
        int k = ik5Var.k() + ik5Var.m();
        int m = ik5Var.m();
        int i = (m >> 24) & 255;
        zzbp zzbpVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = m & 16777215;
                if (i2 == 6516084) {
                    int m2 = ik5Var.m();
                    if (ik5Var.m() == 1684108385) {
                        ik5Var.g(8);
                        String E = ik5Var.E(m2 - 16);
                        zzbpVar = new zzacx("und", E, E);
                    } else {
                        s95.e("MetadataUtil", "Failed to parse comment attribute: ".concat(c92.b(m)));
                    }
                    return zzbpVar;
                } else if (i2 == 7233901 || i2 == 7631467) {
                    return e(m, "TIT2", ik5Var);
                } else {
                    if (i2 == 6516589 || i2 == 7828084) {
                        return e(m, "TCOM", ik5Var);
                    }
                    if (i2 == 6578553) {
                        return e(m, "TDRC", ik5Var);
                    }
                    if (i2 == 4280916) {
                        return e(m, "TPE1", ik5Var);
                    }
                    if (i2 == 7630703) {
                        return e(m, "TSSE", ik5Var);
                    }
                    if (i2 == 6384738) {
                        return e(m, "TALB", ik5Var);
                    }
                    if (i2 == 7108978) {
                        return e(m, "USLT", ik5Var);
                    }
                    if (i2 == 6776174) {
                        return e(m, "TCON", ik5Var);
                    }
                    if (i2 == 6779504) {
                        return e(m, "TIT1", ik5Var);
                    }
                }
            } else if (m == 1735291493) {
                int b2 = b(ik5Var);
                String str3 = (b2 <= 0 || b2 > 192) ? null : a[b2 - 1];
                if (str3 != null) {
                    zzbpVar = new zzadm("TCON", null, str3);
                } else {
                    s95.e("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzbpVar;
            } else if (m == 1684632427) {
                return d(1684632427, "TPOS", ik5Var);
            } else {
                if (m == 1953655662) {
                    return d(1953655662, "TRCK", ik5Var);
                }
                if (m == 1953329263) {
                    return c(1953329263, "TBPM", ik5Var, true, false);
                }
                if (m == 1668311404) {
                    return c(1668311404, "TCMP", ik5Var, true, true);
                }
                if (m == 1668249202) {
                    int m3 = ik5Var.m();
                    if (ik5Var.m() == 1684108385) {
                        int m4 = ik5Var.m() & 16777215;
                        if (m4 == 13) {
                            str2 = "image/jpeg";
                        } else if (m4 == 14) {
                            str2 = "image/png";
                            m4 = 14;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            ik5Var.g(4);
                            int i3 = m3 - 16;
                            byte[] bArr = new byte[i3];
                            ik5Var.b(bArr, 0, i3);
                            zzbpVar = new zzacp(str2, null, 3, bArr);
                            return zzbpVar;
                        }
                        str = "Unrecognized cover art flags: " + m4;
                    } else {
                        str = "Failed to parse cover art attribute";
                    }
                    s95.e("MetadataUtil", str);
                    return zzbpVar;
                } else if (m == 1631670868) {
                    return e(1631670868, "TPE2", ik5Var);
                } else {
                    if (m == 1936682605) {
                        return e(1936682605, "TSOT", ik5Var);
                    }
                    if (m == 1936679276) {
                        return e(1936679276, "TSO2", ik5Var);
                    }
                    if (m == 1936679282) {
                        return e(1936679282, "TSOA", ik5Var);
                    }
                    if (m == 1936679265) {
                        return e(1936679265, "TSOP", ik5Var);
                    }
                    if (m == 1936679791) {
                        return e(1936679791, "TSOC", ik5Var);
                    }
                    if (m == 1920233063) {
                        return c(1920233063, "ITUNESADVISORY", ik5Var, false, false);
                    }
                    if (m == 1885823344) {
                        return c(1885823344, "ITUNESGAPLESS", ik5Var, false, true);
                    }
                    if (m == 1936683886) {
                        return e(1936683886, "TVSHOWSORT", ik5Var);
                    }
                    if (m == 1953919848) {
                        return e(1953919848, "TVSHOW", ik5Var);
                    }
                    if (m == 757935405) {
                        String str4 = null;
                        String str5 = null;
                        int i4 = -1;
                        int i5 = -1;
                        while (ik5Var.k() < k) {
                            int k2 = ik5Var.k();
                            int m5 = ik5Var.m();
                            int m6 = ik5Var.m();
                            ik5Var.g(4);
                            if (m6 == 1835360622) {
                                str4 = ik5Var.E(m5 - 12);
                            } else if (m6 == 1851878757) {
                                str5 = ik5Var.E(m5 - 12);
                            } else {
                                if (m6 == 1684108385) {
                                    i5 = m5;
                                }
                                if (m6 == 1684108385) {
                                    i4 = k2;
                                }
                                ik5Var.g(m5 - 12);
                            }
                        }
                        if (str4 != null && str5 != null && i4 != -1) {
                            ik5Var.f(i4);
                            ik5Var.g(16);
                            zzbpVar = new zzadg(str4, str5, ik5Var.E(i5 - 16));
                        }
                        return zzbpVar;
                    }
                }
            }
            s95.a("MetadataUtil", "Skipped unknown metadata entry: " + c92.b(m));
            return null;
        } finally {
            ik5Var.f(k);
        }
    }

    public static int b(ik5 ik5Var) {
        ik5Var.g(4);
        if (ik5Var.m() == 1684108385) {
            ik5Var.g(8);
            return ik5Var.s();
        }
        s95.e("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static zzade c(int i, String str, ik5 ik5Var, boolean z, boolean z2) {
        int b2 = b(ik5Var);
        if (z2) {
            b2 = Math.min(1, b2);
        }
        if (b2 >= 0) {
            return z ? new zzadm(str, null, Integer.toString(b2)) : new zzacx("und", str, Integer.toString(b2));
        }
        s95.e("MetadataUtil", "Failed to parse uint8 attribute: ".concat(c92.b(i)));
        return null;
    }

    public static zzadm d(int i, String str, ik5 ik5Var) {
        int m = ik5Var.m();
        if (ik5Var.m() == 1684108385 && m >= 22) {
            ik5Var.g(10);
            int w = ik5Var.w();
            if (w > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(w);
                String sb2 = sb.toString();
                int w2 = ik5Var.w();
                if (w2 > 0) {
                    sb2 = sb2 + "/" + w2;
                }
                return new zzadm(str, null, sb2);
            }
        }
        s95.e("MetadataUtil", "Failed to parse index/count attribute: ".concat(c92.b(i)));
        return null;
    }

    public static zzadm e(int i, String str, ik5 ik5Var) {
        int m = ik5Var.m();
        if (ik5Var.m() == 1684108385) {
            ik5Var.g(8);
            return new zzadm(str, null, ik5Var.E(m - 16));
        }
        s95.e("MetadataUtil", "Failed to parse text attribute: ".concat(c92.b(i)));
        return null;
    }
}

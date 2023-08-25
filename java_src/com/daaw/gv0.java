package com.daaw;

import com.daaw.gx0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
/* loaded from: classes.dex */
public class gv0 implements pe1 {

    /* renamed from: a */
    public static final C3445wk[] f11745a = {new C3445wk(new String[]{".pls"}, new String[]{"audio/x-scpls"}, new gx0[]{new gx0(gx0.EnumC1483a.WINAMP, true, null), new gx0(gx0.EnumC1483a.VLC_MEDIA_PLAYER, false, null), new gx0(gx0.EnumC1483a.MEDIA_PLAYER_CLASSIC, true, null), new gx0(gx0.EnumC1483a.FOOBAR2000, false, null), new gx0(gx0.EnumC1483a.MPLAYER, true, null), new gx0(gx0.EnumC1483a.QUICKTIME, true, null), new gx0(gx0.EnumC1483a.ITUNES, true, null), new gx0(gx0.EnumC1483a.REALPLAYER, false, null)}, "Winamp PLSv2 Playlist")};

    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    @Override // com.daaw.pe1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oe1 mo13427a(InputStream inputStream, String str, bl0 bl0Var) {
        String str2;
        if (str == null) {
            str = "UTF-8";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        fv0 fv0Var = new fv0();
        fv0Var.m22251d(this);
        int i = -1;
        boolean z = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            String trim = readLine.trim();
            if (trim.length() > 0) {
                if (z) {
                    int indexOf = trim.indexOf(61);
                    if (indexOf <= 0) {
                        str2 = "Malformed PLS playlist";
                        break;
                    }
                    String lowerCase = trim.substring(0, indexOf).trim().toLowerCase();
                    String trim2 = trim.substring(indexOf + 1).trim();
                    if ("numberofentries".equals(lowerCase)) {
                        try {
                            int parseInt = Integer.parseInt(trim2);
                            if (parseInt < 0) {
                                bl0Var.mo23393e("Invalid NumberOfEntries in PLS playlist: " + parseInt);
                                break;
                            }
                            if (i >= 0 && i != parseInt) {
                                str2 = "PLS playlist number of entries already specified with a different value";
                                break;
                            }
                            i = parseInt;
                        } catch (NumberFormatException e) {
                            str2 = e.toString();
                        }
                    } else if (lowerCase.startsWith("file")) {
                        int parseInt2 = Integer.parseInt(lowerCase.substring(4)) - 1;
                        for (int size = fv0Var.m22252c().size(); size < parseInt2 + 1; size++) {
                            fv0Var.m22252c().add(new a51());
                        }
                        fv0Var.m22252c().get(parseInt2).m27605e(trim2);
                    } else if (lowerCase.startsWith("title")) {
                        int parseInt3 = Integer.parseInt(lowerCase.substring(5)) - 1;
                        for (int size2 = fv0Var.m22252c().size(); size2 < parseInt3 + 1; size2++) {
                            fv0Var.m22252c().add(new a51());
                        }
                        fv0Var.m22252c().get(parseInt3).m27604f(trim2);
                    } else if (lowerCase.startsWith("length")) {
                        int parseInt4 = Integer.parseInt(lowerCase.substring(6)) - 1;
                        for (int size3 = fv0Var.m22252c().size(); size3 < parseInt4 + 1; size3++) {
                            fv0Var.m22252c().add(new a51());
                        }
                        fv0Var.m22252c().get(parseInt4).m27606d(Long.parseLong(trim2));
                    } else if (!"version".equals(lowerCase)) {
                        bl0Var.mo23393e("Unknown PLS keyword " + lowerCase);
                    } else if (!"2".equals(trim2)) {
                        str2 = "Unknown PLS version " + trim2;
                        break;
                    }
                } else if (!trim.equalsIgnoreCase("[playlist]")) {
                    throw new IllegalArgumentException("Not a PLS playlist format");
                } else {
                    z = true;
                }
            }
        }
        fv0Var = null;
        if (fv0Var != null) {
            if (i < 0) {
                bl0Var.mo23393e("No number of entries in PLS playlist");
            } else {
                int size4 = fv0Var.m22252c().size() - i;
                if (size4 > 0) {
                    bl0Var.mo23393e("Ignoring " + size4 + " extra resources according to the specified number of entries " + i);
                }
                for (int i2 = 0; i2 < size4; i2++) {
                    fv0Var.m22252c().remove(i);
                }
            }
        }
        return fv0Var;
        bl0Var.mo23392f(str2);
        fv0Var = null;
        if (fv0Var != null) {
        }
        return fv0Var;
    }

    @Override // com.daaw.pe1
    /* renamed from: b */
    public C3445wk[] mo13426b() {
        return (C3445wk[]) f11745a.clone();
    }

    @Override // com.daaw.pe1
    /* renamed from: c */
    public oe1 mo13425c(ix0 ix0Var) {
        fv0 fv0Var = new fv0();
        fv0Var.m22251d(this);
        m21208d(fv0Var.m22252c(), ix0Var.m19301a());
        return fv0Var;
    }

    /* renamed from: d */
    public final void m21208d(List<a51> list, AbstractC2227n abstractC2227n) {
        if (!(abstractC2227n instanceof fb1)) {
            if (abstractC2227n instanceof yn0) {
                yn0 yn0Var = (yn0) abstractC2227n;
                if (yn0Var.m3487b() != null) {
                    throw new IllegalArgumentException("A PLS playlist cannot handle a timed media");
                }
                if (yn0Var.m15649a() < 0) {
                    throw new IllegalArgumentException("A PLS playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.m3486c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) abstractC2227n;
        if (fb1Var.m15649a() < 0) {
            throw new IllegalArgumentException("A PLS playlist cannot handle a sequence repeated indefinitely");
        }
        AbstractC2227n[] m13789b = fb1Var.m13789b();
        for (int i = 0; i < fb1Var.m15649a(); i++) {
            for (AbstractC2227n abstractC2227n2 : m13789b) {
                m21208d(list, abstractC2227n2);
            }
        }
    }

    @Override // com.daaw.pe1
    public String getId() {
        return "pls";
    }
}

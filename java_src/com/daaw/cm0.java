package com.daaw;

import com.daaw.gx0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
/* loaded from: classes.dex */
public class cm0 implements pe1 {

    /* renamed from: a */
    public static final C3445wk[] f5951a = {new C3445wk(new String[]{".mpcpl"}, new String[]{"text/plain"}, new gx0[]{new gx0(gx0.EnumC1483a.MEDIA_PLAYER_CLASSIC, true, null)}, "Media Player Classic Playlist")};

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        r10.append("Malformed MPCPL playlist entry ");
        r10.append(r3);
        r10 = r10.toString();
     */
    @Override // com.daaw.pe1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oe1 mo13427a(InputStream inputStream, String str, bl0 bl0Var) {
        StringBuilder sb;
        if (str == null) {
            str = "UTF-8";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        bm0 bm0Var = new bm0();
        bm0Var.m25998d(this);
        boolean z = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return bm0Var;
            }
            String trim = readLine.trim();
            if (trim.length() > 0) {
                if (z) {
                    int indexOf = trim.indexOf(44);
                    if (indexOf <= 0) {
                        sb = new StringBuilder();
                        break;
                    }
                    String trim2 = trim.substring(0, indexOf).trim();
                    trim = trim.substring(indexOf + 1);
                    int indexOf2 = trim.indexOf(44);
                    if (indexOf2 <= 0) {
                        sb = new StringBuilder();
                        break;
                    }
                    String lowerCase = trim.substring(0, indexOf2).trim().toLowerCase();
                    String trim3 = trim.substring(indexOf2 + 1).trim();
                    try {
                        int parseInt = Integer.parseInt(trim2) - 1;
                        for (int size = bm0Var.m25999c().size(); size < parseInt + 1; size++) {
                            bm0Var.m25999c().add(new y41());
                        }
                        y41 y41Var = bm0Var.m25999c().get(parseInt);
                        if ("filename".equals(lowerCase)) {
                            y41Var.m4132d(trim3);
                        } else if ("type".equals(lowerCase)) {
                            y41Var.m4130f(trim3);
                        } else if ("subtitle".equals(lowerCase)) {
                            y41Var.m4131e(trim3);
                        } else {
                            bl0Var.mo23393e("Unknown MPCPL keyword " + lowerCase);
                        }
                    } catch (NumberFormatException e) {
                        String sb2 = e.toString();
                        bl0Var.mo23392f(sb2);
                        return null;
                    }
                } else if (!trim.equalsIgnoreCase("MPCPLAYLIST")) {
                    throw new IllegalArgumentException("Not a MPCPL playlist format");
                } else {
                    z = true;
                }
            }
        }
    }

    @Override // com.daaw.pe1
    /* renamed from: b */
    public C3445wk[] mo13426b() {
        return (C3445wk[]) f5951a.clone();
    }

    @Override // com.daaw.pe1
    /* renamed from: c */
    public oe1 mo13425c(ix0 ix0Var) {
        bm0 bm0Var = new bm0();
        bm0Var.m25998d(this);
        m25242d(bm0Var.m25999c(), ix0Var.m19301a());
        return bm0Var;
    }

    /* renamed from: d */
    public final void m25242d(List<y41> list, AbstractC2227n abstractC2227n) {
        if (!(abstractC2227n instanceof fb1)) {
            if (abstractC2227n instanceof yn0) {
                yn0 yn0Var = (yn0) abstractC2227n;
                if (yn0Var.m3487b() != null) {
                    throw new IllegalArgumentException("A MPCPL playlist cannot handle a timed media");
                }
                if (yn0Var.m15649a() < 0) {
                    throw new IllegalArgumentException("A MPCPL playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.m3486c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) abstractC2227n;
        if (fb1Var.m15649a() < 0) {
            throw new IllegalArgumentException("A MPCPL playlist cannot handle a sequence repeated indefinitely");
        }
        AbstractC2227n[] m13789b = fb1Var.m13789b();
        for (int i = 0; i < fb1Var.m15649a(); i++) {
            for (AbstractC2227n abstractC2227n2 : m13789b) {
                m25242d(list, abstractC2227n2);
            }
        }
    }

    @Override // com.daaw.pe1
    public String getId() {
        return "mpcpl";
    }
}

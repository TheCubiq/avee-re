package com.daaw;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
/* loaded from: classes.dex */
public class ev0 implements pe1 {

    /* renamed from: a */
    public static final C3445wk[] f8836a = {new C3445wk(new String[]{".plp"}, new String[]{"text/plain"}, new gx0[0], "Sansa Playlist File")};

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        r12.mo23392f(r10);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        r10.m23930d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
        return r10;
     */
    @Override // com.daaw.pe1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oe1 mo13427a(InputStream inputStream, String str, bl0 bl0Var) {
        String str2;
        if (str == null) {
            str = "UTF-16LE";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        dv0 dv0Var = new dv0();
        dv0Var.m23929e(this);
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            String trim = readLine.trim();
            if (trim.length() > 0) {
                if (z) {
                    if (z2) {
                        int indexOf = trim.indexOf(44);
                        if (indexOf <= 0) {
                            str2 = "Malformed PLP playlist (playlist entry line format)";
                            break;
                        }
                        String trim2 = trim.substring(0, indexOf).trim();
                        if (str3 != null) {
                            if (!str3.equals(trim2)) {
                                str2 = "Malformed PLP playlist (inconsistent disk specifier)";
                                break;
                            }
                        } else {
                            str3 = trim2;
                        }
                        dv0Var.m23931c().add(trim.substring(indexOf + 1).trim());
                    } else if (!"VERSION 1.20".equals(trim)) {
                        str2 = "Malformed PLP playlist (no version information)";
                        break;
                    } else {
                        z2 = true;
                    }
                } else if (!"PLP PLAYLIST".equals(trim)) {
                    throw new IllegalArgumentException("Not a PLP playlist format");
                } else {
                    z = true;
                }
            }
        }
    }

    @Override // com.daaw.pe1
    /* renamed from: b */
    public C3445wk[] mo13426b() {
        return (C3445wk[]) f8836a.clone();
    }

    @Override // com.daaw.pe1
    /* renamed from: c */
    public oe1 mo13425c(ix0 ix0Var) {
        dv0 dv0Var = new dv0();
        dv0Var.m23929e(this);
        m23175d(dv0Var.m23931c(), ix0Var.m19301a());
        return dv0Var;
    }

    /* renamed from: d */
    public final void m23175d(List<String> list, AbstractC2227n abstractC2227n) {
        if (!(abstractC2227n instanceof fb1)) {
            if (abstractC2227n instanceof yn0) {
                yn0 yn0Var = (yn0) abstractC2227n;
                if (yn0Var.m3487b() != null) {
                    throw new IllegalArgumentException("A PLP playlist cannot handle a timed media");
                }
                if (yn0Var.m15649a() < 0) {
                    throw new IllegalArgumentException("A PLP playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.m3486c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) abstractC2227n;
        if (fb1Var.m15649a() < 0) {
            throw new IllegalArgumentException("A PLP playlist cannot handle a sequence repeated indefinitely");
        }
        AbstractC2227n[] m13789b = fb1Var.m13789b();
        for (int i = 0; i < fb1Var.m15649a(); i++) {
            for (AbstractC2227n abstractC2227n2 : m13789b) {
                m23175d(list, abstractC2227n2);
            }
        }
    }

    @Override // com.daaw.pe1
    public String getId() {
        return "plp";
    }
}

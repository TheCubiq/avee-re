package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public class ev0 implements pe1 {
    public static final wk[] a = {new wk(new String[]{".plp"}, new String[]{"text/plain"}, new gx0[0], "Sansa Playlist File")};

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        r12.f(r10);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        r10.d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
        return r10;
     */
    @Override // com.daaw.pe1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.daaw.oe1 a(java.io.InputStream r10, java.lang.String r11, com.daaw.bl0 r12) {
        /*
            r9 = this;
            if (r11 != 0) goto L4
            java.lang.String r11 = "UTF-16LE"
        L4:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r10, r11)
            r0.<init>(r1)
            com.daaw.dv0 r10 = new com.daaw.dv0
            r10.<init>()
            r10.e(r9)
            r11 = 1
            r1 = 0
            r2 = 0
            r5 = r2
            r3 = 0
            r4 = 0
        L1c:
            java.lang.String r6 = r0.readLine()
            if (r6 == 0) goto L85
            java.lang.String r6 = r6.trim()
            int r7 = r6.length()
            if (r7 <= 0) goto L1c
            if (r3 != 0) goto L40
            java.lang.String r3 = "PLP PLAYLIST"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L38
            r3 = 1
            goto L1c
        L38:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Not a PLP playlist format"
            r10.<init>(r11)
            throw r10
        L40:
            if (r4 != 0) goto L4f
            java.lang.String r4 = "VERSION 1.20"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L4d
            java.lang.String r10 = "Malformed PLP playlist (no version information)"
            goto L59
        L4d:
            r4 = 1
            goto L1c
        L4f:
            r7 = 44
            int r7 = r6.indexOf(r7)
            if (r7 > 0) goto L5e
            java.lang.String r10 = "Malformed PLP playlist (playlist entry line format)"
        L59:
            r12.f(r10)
            r10 = r2
            goto L85
        L5e:
            java.lang.String r8 = r6.substring(r1, r7)
            java.lang.String r8 = r8.trim()
            if (r5 != 0) goto L6a
            r5 = r8
            goto L73
        L6a:
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L73
            java.lang.String r10 = "Malformed PLP playlist (inconsistent disk specifier)"
            goto L59
        L73:
            java.util.List r8 = r10.c()
            int r7 = r7 + 1
            java.lang.String r6 = r6.substring(r7)
            java.lang.String r6 = r6.trim()
            r8.add(r6)
            goto L1c
        L85:
            if (r10 == 0) goto L8c
            if (r5 == 0) goto L8c
            r10.d(r5)
        L8c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ev0.a(java.io.InputStream, java.lang.String, com.daaw.bl0):com.daaw.oe1");
    }

    @Override // com.daaw.pe1
    public wk[] b() {
        return (wk[]) a.clone();
    }

    @Override // com.daaw.pe1
    public oe1 c(ix0 ix0Var) {
        dv0 dv0Var = new dv0();
        dv0Var.e(this);
        d(dv0Var.c(), ix0Var.a());
        return dv0Var;
    }

    public final void d(List<String> list, n nVar) {
        if (!(nVar instanceof fb1)) {
            if (nVar instanceof yn0) {
                yn0 yn0Var = (yn0) nVar;
                if (yn0Var.b() != null) {
                    throw new IllegalArgumentException("A PLP playlist cannot handle a timed media");
                }
                if (yn0Var.a() < 0) {
                    throw new IllegalArgumentException("A PLP playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) nVar;
        if (fb1Var.a() < 0) {
            throw new IllegalArgumentException("A PLP playlist cannot handle a sequence repeated indefinitely");
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
        return "plp";
    }
}

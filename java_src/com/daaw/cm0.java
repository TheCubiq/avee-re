package com.daaw;

import com.daaw.gx0;
import java.util.List;
/* loaded from: classes.dex */
public class cm0 implements pe1 {
    public static final wk[] a = {new wk(new String[]{".mpcpl"}, new String[]{"text/plain"}, new gx0[]{new gx0(gx0.a.MEDIA_PLAYER_CLASSIC, true, null)}, "Media Player Classic Playlist")};

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        r10.append("Malformed MPCPL playlist entry ");
        r10.append(r3);
        r10 = r10.toString();
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
            java.lang.String r11 = "UTF-8"
        L4:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r10, r11)
            r0.<init>(r1)
            com.daaw.bm0 r10 = new com.daaw.bm0
            r10.<init>()
            r10.d(r9)
            r11 = 0
            r1 = 1
            r2 = 0
        L19:
            java.lang.String r3 = r0.readLine()
            r4 = 0
            if (r3 == 0) goto Lfb
            java.lang.String r3 = r3.trim()
            int r5 = r3.length()
            if (r5 <= 0) goto L19
            if (r2 != 0) goto L3e
            java.lang.String r2 = "MPCPLAYLIST"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L36
            r2 = 1
            goto L19
        L36:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Not a MPCPL playlist format"
            r10.<init>(r11)
            throw r10
        L3e:
            r5 = 44
            int r6 = r3.indexOf(r5)
            java.lang.String r7 = "Malformed MPCPL playlist entry "
            if (r6 > 0) goto L5d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
        L4d:
            r10.append(r7)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
        L57:
            r12.f(r10)
            r10 = r4
            goto Lfb
        L5d:
            java.lang.String r8 = r3.substring(r11, r6)
            java.lang.String r8 = r8.trim()
            int r6 = r6 + 1
            java.lang.String r3 = r3.substring(r6)
            int r5 = r3.indexOf(r5)
            if (r5 > 0) goto L77
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            goto L4d
        L77:
            java.lang.String r6 = r3.substring(r11, r5)
            java.lang.String r6 = r6.trim()
            java.lang.String r6 = r6.toLowerCase()
            int r5 = r5 + 1
            java.lang.String r3 = r3.substring(r5)
            java.lang.String r3 = r3.trim()
            int r4 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> Lf4
            int r4 = r4 - r1
            java.util.List r5 = r10.c()
            int r5 = r5.size()
        L9a:
            int r7 = r4 + 1
            if (r5 >= r7) goto Lad
            java.util.List r7 = r10.c()
            com.daaw.y41 r8 = new com.daaw.y41
            r8.<init>()
            r7.add(r8)
            int r5 = r5 + 1
            goto L9a
        Lad:
            java.util.List r5 = r10.c()
            java.lang.Object r4 = r5.get(r4)
            com.daaw.y41 r4 = (com.daaw.y41) r4
            java.lang.String r5 = "filename"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lc4
            r4.d(r3)
            goto L19
        Lc4:
            java.lang.String r5 = "type"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Ld1
            r4.f(r3)
            goto L19
        Ld1:
            java.lang.String r5 = "subtitle"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lde
            r4.e(r3)
            goto L19
        Lde:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown MPCPL keyword "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r12.e(r3)
            goto L19
        Lf4:
            r10 = move-exception
            java.lang.String r10 = r10.toString()
            goto L57
        Lfb:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.cm0.a(java.io.InputStream, java.lang.String, com.daaw.bl0):com.daaw.oe1");
    }

    @Override // com.daaw.pe1
    public wk[] b() {
        return (wk[]) a.clone();
    }

    @Override // com.daaw.pe1
    public oe1 c(ix0 ix0Var) {
        bm0 bm0Var = new bm0();
        bm0Var.d(this);
        d(bm0Var.c(), ix0Var.a());
        return bm0Var;
    }

    public final void d(List<y41> list, n nVar) {
        if (!(nVar instanceof fb1)) {
            if (nVar instanceof yn0) {
                yn0 yn0Var = (yn0) nVar;
                if (yn0Var.b() != null) {
                    throw new IllegalArgumentException("A MPCPL playlist cannot handle a timed media");
                }
                if (yn0Var.a() < 0) {
                    throw new IllegalArgumentException("A MPCPL playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) nVar;
        if (fb1Var.a() < 0) {
            throw new IllegalArgumentException("A MPCPL playlist cannot handle a sequence repeated indefinitely");
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
        return "mpcpl";
    }
}

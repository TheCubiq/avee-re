package com.daaw;

import com.daaw.jx0;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class lx0 {
    public static lx0 c;
    public final bl0 a = el0.a(getClass());
    public Iterable<pe1> b;

    public lx0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cv0());
        arrayList.add(new gv0());
        arrayList.add(new cm0());
        arrayList.add(new ev0());
        arrayList.add(new am0());
        this.b = arrayList;
    }

    public static String f(String str, String str2, kx0 kx0Var) {
        if (str == null || str.length() <= 0) {
            str = "//";
        } else if (str.charAt(str.length() - 1) != '/') {
            str = str + "/";
        }
        return str + str2 + "." + kx0Var.b;
    }

    public static lx0 h() {
        if (c == null) {
            c = new lx0();
        }
        return c;
    }

    public int a(wf1 wf1Var, String str, List<String> list, boolean z, boolean z2) {
        return b(wf1Var, str, tx0.q(list), z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(com.daaw.wf1 r8, java.lang.String r9, java.util.List<com.daaw.tx0> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.lx0.b(com.daaw.wf1, java.lang.String, java.util.List, boolean, boolean):int");
    }

    public int c(wf1 wf1Var, String str, kx0 kx0Var, List<String> list, boolean z) {
        return a(wf1Var, str, list, true, z);
    }

    public final pe1 d(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        pe1 pe1Var = null;
        for (pe1 pe1Var2 : this.b) {
            wk[] b = pe1Var2.b();
            int length = b.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (b[i].a(lowerCase)) {
                    pe1Var = pe1Var2;
                    continue;
                    break;
                } else {
                    i++;
                }
            }
            if (pe1Var != null) {
                break;
            }
        }
        return pe1Var;
    }

    public List<tx0> e(String str) {
        URL url;
        File file;
        oe1 oe1Var;
        ArrayList arrayList = null;
        try {
            url = new URL("file://" + str);
            file = new File(str);
        } catch (MalformedURLException unused) {
        }
        if (dx0.e() == null) {
            return null;
        }
        try {
            oe1Var = g(url);
        } catch (IOException e) {
            lz1.c(e.getMessage());
            oe1Var = null;
        }
        if (oe1Var == null) {
            return null;
        }
        arrayList = new ArrayList();
        if (file.exists()) {
            jx0.a aVar = new jx0.a();
            try {
                aVar.a = file.getCanonicalPath();
            } catch (Exception unused2) {
                aVar.a = file.getAbsolutePath();
            }
            jx0.k(oe1Var, aVar, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|14|15|(2:17|18)(2:20|(2:22|23)(1:24))|19) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r8.a.d() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        r4 = r8.a;
        r4.b("Playlist provider " + r1.getId() + " cannot unmarshal <" + r9 + ">", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r8.a.c() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        r4 = r8.a;
        r4.a("Playlist provider " + r1.getId() + " cannot unmarshal <" + r9 + ">: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
        r9 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.oe1 g(java.net.URL r9) {
        /*
            r8 = this;
            java.lang.Iterable<com.daaw.pe1> r0 = r8.b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            com.daaw.pe1 r1 = (com.daaw.pe1) r1
            java.net.URLConnection r2 = r9.openConnection()
            r3 = 0
            r2.setAllowUserInteraction(r3)
            r4 = 10000(0x2710, float:1.4013E-41)
            r2.setConnectTimeout(r4)
            r4 = 1
            r2.setDoInput(r4)
            r2.setDoOutput(r3)
            r3 = 60000(0xea60, float:8.4078E-41)
            r2.setReadTimeout(r3)
            r2.setUseCaches(r4)
            r2.connect()
            java.lang.String r3 = r2.getContentEncoding()
            java.io.InputStream r2 = r2.getInputStream()
            com.daaw.bl0 r4 = r8.a     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            com.daaw.oe1 r9 = r1.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r2.close()
            goto Laf
        L44:
            r9 = move-exception
            goto Laa
        L46:
            r3 = move-exception
            com.daaw.bl0 r4 = r8.a     // Catch: java.lang.Throwable -> L44
            boolean r4 = r4.d()     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = " cannot unmarshal <"
            java.lang.String r6 = "Playlist provider "
            if (r4 == 0) goto L77
            com.daaw.bl0 r4 = r8.a     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r7.<init>()     // Catch: java.lang.Throwable -> L44
            r7.append(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.getId()     // Catch: java.lang.Throwable -> L44
            r7.append(r1)     // Catch: java.lang.Throwable -> L44
            r7.append(r5)     // Catch: java.lang.Throwable -> L44
            r7.append(r9)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = ">"
            r7.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L44
            r4.b(r1, r3)     // Catch: java.lang.Throwable -> L44
            goto La5
        L77:
            com.daaw.bl0 r4 = r8.a     // Catch: java.lang.Throwable -> L44
            boolean r4 = r4.c()     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto La5
            com.daaw.bl0 r4 = r8.a     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r7.<init>()     // Catch: java.lang.Throwable -> L44
            r7.append(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.getId()     // Catch: java.lang.Throwable -> L44
            r7.append(r1)     // Catch: java.lang.Throwable -> L44
            r7.append(r5)     // Catch: java.lang.Throwable -> L44
            r7.append(r9)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = ">: "
            r7.append(r1)     // Catch: java.lang.Throwable -> L44
            r7.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L44
            r4.a(r1)     // Catch: java.lang.Throwable -> L44
        La5:
            r2.close()
            goto L6
        Laa:
            r2.close()
            throw r9
        Lae:
            r9 = 0
        Laf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.lx0.g(java.net.URL):com.daaw.oe1");
    }
}

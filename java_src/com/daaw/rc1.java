package com.daaw;

import com.daaw.uc1;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class rc1<T, V extends List<T>, G, GList extends List<G>> {
    public static final Object d = new Object();
    public static rc1 e;
    public String a = "";
    public final String b;
    public final uc1<G, GList, T, V> c;

    public rc1(String str, uc1.c<G> cVar, r40<G, GList> r40Var, uc1.d<T> dVar, w40<V> w40Var) {
        this.c = new uc1<>(cVar, r40Var, dVar, w40Var);
        this.b = str;
    }

    public static <T, V extends List<T>, G, GList extends List<G>> rc1<T, V, G, GList> d(String str, uc1.c<G> cVar, r40<G, GList> r40Var, uc1.d<T> dVar, w40<V> w40Var) {
        rc1<T, V, G, GList> rc1Var;
        rc1<T, V, G, GList> rc1Var2 = e;
        if (rc1Var2 != null) {
            return rc1Var2;
        }
        synchronized (d) {
            if (e == null) {
                e = new rc1(str, cVar, r40Var, dVar, w40Var);
            }
            rc1Var = e;
        }
        return rc1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ com.daaw.lo1 g(java.io.File r4, java.lang.Boolean[] r5) {
        /*
            r3 = this;
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L7
            r1.<init>(r4)     // Catch: java.io.IOException -> L7
            goto L8
        L7:
            r1 = r0
        L8:
            com.daaw.wf1 r4 = new com.daaw.wf1
            r4.<init>()
            if (r1 != 0) goto L1a
            java.lang.String r5 = "Network error"
            r4.a(r5)
            com.daaw.lo1 r5 = new com.daaw.lo1
            r5.<init>(r0, r4)
            return r5
        L1a:
            com.daaw.uc1<G, GList extends java.util.List<G>, T, V extends java.util.List<T>> r2 = r3.c     // Catch: java.io.IOException -> L21 org.xmlpull.v1.XmlPullParserException -> L25
            java.util.List r0 = r2.c(r1, r4)     // Catch: java.io.IOException -> L21 org.xmlpull.v1.XmlPullParserException -> L25
            goto L2b
        L21:
            r1 = move-exception
            java.lang.String r2 = "io"
            goto L28
        L25:
            r1 = move-exception
            java.lang.String r2 = "xml parser"
        L28:
            r4.b(r2, r1)
        L2b:
            r1 = 0
            if (r0 == 0) goto L36
            int r2 = r0.size()
            if (r2 <= 0) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5[r1] = r2
            com.daaw.lo1 r5 = new com.daaw.lo1
            r5.<init>(r0, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.rc1.g(java.io.File, java.lang.Boolean[]):com.daaw.lo1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ com.daaw.lo1 h(java.io.File r4, java.lang.Boolean[] r5) {
        /*
            r3 = this;
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L7
            r1.<init>(r4)     // Catch: java.io.IOException -> L7
            goto L8
        L7:
            r1 = r0
        L8:
            com.daaw.wf1 r4 = new com.daaw.wf1
            r4.<init>()
            if (r1 != 0) goto L1a
            java.lang.String r5 = "Network error"
            r4.a(r5)
            com.daaw.lo1 r5 = new com.daaw.lo1
            r5.<init>(r0, r4)
            return r5
        L1a:
            com.daaw.uc1<G, GList extends java.util.List<G>, T, V extends java.util.List<T>> r2 = r3.c     // Catch: java.io.IOException -> L21 org.xmlpull.v1.XmlPullParserException -> L25
            java.util.List r0 = r2.d(r1, r4)     // Catch: java.io.IOException -> L21 org.xmlpull.v1.XmlPullParserException -> L25
            goto L2b
        L21:
            r1 = move-exception
            java.lang.String r2 = "io"
            goto L28
        L25:
            r1 = move-exception
            java.lang.String r2 = "xml parser"
        L28:
            r4.b(r2, r1)
        L2b:
            r1 = 0
            if (r0 == 0) goto L36
            int r2 = r0.size()
            if (r2 <= 0) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5[r1] = r2
            com.daaw.lo1 r5 = new com.daaw.lo1
            r5.<init>(r0, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.rc1.h(java.io.File, java.lang.Boolean[]):com.daaw.lo1");
    }

    public static /* synthetic */ List i(File file, Boolean[] boolArr) {
        List<tx0> e2 = lx0.h().e(file.getAbsolutePath());
        boolArr[0] = Boolean.valueOf(e2 != null && e2.size() > 0);
        return e2;
    }

    public ir1<lo1<List<G>, wf1>> e(String str) {
        return tc1.g("https://api.shoutcast.com/genre/secondary?parentid=" + str + "&k=" + tc1.f() + "&f=xml", this.b + "_genres_sec_" + str, new s40() { // from class: com.daaw.pc1
            @Override // com.daaw.s40
            public final Object a(Object obj, Object obj2) {
                lo1 g;
                g = rc1.this.g((File) obj, (Boolean[]) obj2);
                return g;
            }
        }, 720);
    }

    public ir1<lo1<V, wf1>> f(String str) {
        return tc1.g("https://api.shoutcast.com/station/advancedsearch?genre_id=" + str + "&limit=200&f=xml&k=" + tc1.f(), this.b + "_stations_" + str, new s40() { // from class: com.daaw.oc1
            @Override // com.daaw.s40
            public final Object a(Object obj, Object obj2) {
                lo1 h;
                h = rc1.this.h((File) obj, (Boolean[]) obj2);
                return h;
            }
        }, 720);
    }

    public ir1<List<tx0>> j(String str, String str2) {
        return tc1.g("https://yp.shoutcast.com/" + str + "?id=" + str2, this.b + "_station_" + str2, new s40() { // from class: com.daaw.qc1
            @Override // com.daaw.s40
            public final Object a(Object obj, Object obj2) {
                List i;
                i = rc1.i((File) obj, (Boolean[]) obj2);
                return i;
            }
        }, 720);
    }
}

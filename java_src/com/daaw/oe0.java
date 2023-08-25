package com.daaw;

import com.daaw.gz1;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class oe0<T, V extends List<T>> {
    public String a;
    public final String b;
    public gz1<T, V> c;
    public w40<V> d;

    /* loaded from: classes.dex */
    public class a implements s40<File, Boolean[], lo1<V, wf1>> {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
        @Override // com.daaw.s40
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.daaw.lo1<V, com.daaw.wf1> a(java.io.File r4, java.lang.Boolean[] r5) {
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
                com.daaw.oe0 r2 = com.daaw.oe0.this     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L27
                com.daaw.gz1<T, V extends java.util.List<T>> r2 = r2.c     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L27
                java.util.List r0 = r2.a(r1, r4)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L27
                goto L2d
            L23:
                r1 = move-exception
                java.lang.String r2 = "io"
                goto L2a
            L27:
                r1 = move-exception
                java.lang.String r2 = "xml parser"
            L2a:
                r4.b(r2, r1)
            L2d:
                r1 = 0
                if (r0 == 0) goto L38
                int r2 = r0.size()
                if (r2 <= 0) goto L38
                r2 = 1
                goto L39
            L38:
                r2 = 0
            L39:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r5[r1] = r2
                com.daaw.lo1 r5 = new com.daaw.lo1
                r5.<init>(r0, r4)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.oe0.a.a(java.io.File, java.lang.Boolean[]):com.daaw.lo1");
        }
    }

    public oe0(String str, String str2, gz1.a<T> aVar, w40<V> w40Var) {
        this.c = new gz1<>(aVar, w40Var);
        this.d = w40Var;
        this.a = str;
        this.b = str2;
    }

    public ir1<lo1<V, wf1>> a() {
        return tc1.g(this.a, this.b, new a(), 720);
    }
}

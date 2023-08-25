package com.daaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class jg2 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jg2(java.lang.String r14, com.daaw.ve2 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.b
            long r3 = r15.c
            long r5 = r15.d
            long r7 = r15.e
            long r9 = r15.f
            java.util.List r0 = r15.h
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map r15 = r15.g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.daaw.ef2 r11 = new com.daaw.ef2
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.jg2.<init>(java.lang.String, com.daaw.ve2):void");
    }

    public jg2(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    public static jg2 a(kg2 kg2Var) {
        if (rg2.c(kg2Var) == 538247942) {
            String f = rg2.f(kg2Var);
            String f2 = rg2.f(kg2Var);
            long d = rg2.d(kg2Var);
            long d2 = rg2.d(kg2Var);
            long d3 = rg2.d(kg2Var);
            long d4 = rg2.d(kg2Var);
            int c = rg2.c(kg2Var);
            if (c < 0) {
                throw new IOException("readHeaderList size=" + c);
            }
            List emptyList = c == 0 ? Collections.emptyList() : new ArrayList();
            for (int i = 0; i < c; i++) {
                emptyList.add(new ef2(rg2.f(kg2Var).intern(), rg2.f(kg2Var).intern()));
            }
            return new jg2(f, f2, d, d2, d3, d4, emptyList);
        }
        throw new IOException();
    }
}

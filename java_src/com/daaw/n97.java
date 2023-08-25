package com.daaw;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class n97 {
    public final Class a;
    public o97 c;
    public ConcurrentMap b = new ConcurrentHashMap();
    public oh7 d = oh7.b;

    public /* synthetic */ n97(Class cls, m97 m97Var) {
        this.a = cls;
    }

    public final n97 a(Object obj, cn7 cn7Var) {
        e(obj, cn7Var, true);
        return this;
    }

    public final n97 b(Object obj, cn7 cn7Var) {
        e(obj, cn7Var, false);
        return this;
    }

    public final n97 c(oh7 oh7Var) {
        if (this.b != null) {
            this.d = oh7Var;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final s97 d() {
        ConcurrentMap concurrentMap = this.b;
        if (concurrentMap != null) {
            s97 s97Var = new s97(concurrentMap, this.c, this.d, this.a, null);
            this.b = null;
            return s97Var;
        }
        throw new IllegalStateException("build cannot be called twice");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.n97 e(java.lang.Object r15, com.daaw.cn7 r16, boolean r17) {
        /*
            r14 = this;
            r0 = r14
            java.util.concurrent.ConcurrentMap r1 = r0.b
            if (r1 == 0) goto Le7
            int r1 = r16.U()
            r2 = 3
            if (r1 != r2) goto Ldf
            java.util.concurrent.ConcurrentMap r1 = r0.b
            int r3 = r16.L()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.daaw.zn7 r4 = r16.P()
            com.daaw.zn7 r5 = com.daaw.zn7.RAW
            r6 = 0
            if (r4 != r5) goto L20
            r3 = r6
        L20:
            com.daaw.qe7 r4 = com.daaw.qe7.b()
            com.daaw.nm7 r5 = r16.M()
            java.lang.String r5 = r5.Q()
            com.daaw.nm7 r7 = r16.M()
            com.daaw.yq7 r7 = r7.P()
            com.daaw.nm7 r8 = r16.M()
            com.daaw.mm7 r8 = r8.M()
            com.daaw.zn7 r9 = r16.P()
            com.daaw.ef7 r3 = com.daaw.ef7.a(r5, r7, r8, r9, r3)
            com.daaw.x97 r5 = com.daaw.x97.a()
            com.daaw.m87 r13 = r4.a(r3, r5)
            com.daaw.o97 r3 = new com.daaw.o97
            com.daaw.zn7 r4 = r16.P()
            int r4 = r4.ordinal()
            r5 = 5
            r7 = 1
            if (r4 == r7) goto L78
            r7 = 2
            if (r4 == r7) goto L6e
            if (r4 == r2) goto L6b
            r2 = 4
            if (r4 != r2) goto L63
            goto L6e
        L63:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unknown output prefix type"
            r1.<init>(r2)
            throw r1
        L6b:
            byte[] r2 = com.daaw.i87.a
            goto L8c
        L6e:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)
            r4 = 0
            java.nio.ByteBuffer r2 = r2.put(r4)
            goto L80
        L78:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteBuffer r2 = r2.put(r7)
        L80:
            int r4 = r16.L()
            java.nio.ByteBuffer r2 = r2.putInt(r4)
            byte[] r2 = r2.array()
        L8c:
            r9 = r2
            int r10 = r16.U()
            com.daaw.zn7 r11 = r16.P()
            int r12 = r16.L()
            r7 = r3
            r8 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r3)
            com.daaw.q97 r4 = new com.daaw.q97
            byte[] r5 = r3.f()
            r4.<init>(r5, r6)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.Object r2 = r1.put(r4, r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto Lcd
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.addAll(r2)
            r5.add(r3)
            java.util.List r2 = java.util.Collections.unmodifiableList(r5)
            r1.put(r4, r2)
        Lcd:
            if (r17 == 0) goto Lde
            com.daaw.o97 r1 = r0.c
            if (r1 != 0) goto Ld6
            r0.c = r3
            goto Lde
        Ld6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "you cannot set two primary primitives"
            r1.<init>(r2)
            throw r1
        Lde:
            return r0
        Ldf:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "only ENABLED key is allowed"
            r1.<init>(r2)
            throw r1
        Le7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "addPrimitive cannot be called after build"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.n97.e(java.lang.Object, com.daaw.cn7, boolean):com.daaw.n97");
    }
}

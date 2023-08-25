package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class gc8 extends zc8 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ gc8(dc8 dc8Var) {
        super(null);
    }

    @Override // com.daaw.zc8
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) ih8.k(obj, j);
        if (list instanceof ac8) {
            unmodifiableList = ((ac8) list).zze();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof ne8) && (list instanceof db8)) {
                db8 db8Var = (db8) list;
                if (db8Var.zzc()) {
                    db8Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        ih8.x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // com.daaw.zc8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.daaw.ih8.k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.daaw.ih8.k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L39
            boolean r2 = r1 instanceof com.daaw.ac8
            if (r2 == 0) goto L20
            com.daaw.xb8 r1 = new com.daaw.xb8
            r1.<init>(r0)
            goto L35
        L20:
            boolean r2 = r1 instanceof com.daaw.ne8
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof com.daaw.db8
            if (r2 == 0) goto L30
            com.daaw.db8 r1 = (com.daaw.db8) r1
            com.daaw.db8 r0 = r1.b(r0)
            r1 = r0
            goto L35
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L35:
            com.daaw.ih8.x(r5, r7, r1)
            goto L8a
        L39:
            java.lang.Class r2 = com.daaw.gc8.c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L52:
            com.daaw.ih8.x(r5, r7, r2)
            r1 = r2
            goto L8a
        L57:
            boolean r2 = r1 instanceof com.daaw.yg8
            if (r2 == 0) goto L6f
            com.daaw.xb8 r2 = new com.daaw.xb8
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            com.daaw.yg8 r1 = (com.daaw.yg8) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L52
        L6f:
            boolean r2 = r1 instanceof com.daaw.ne8
            if (r2 == 0) goto L8a
            boolean r2 = r1 instanceof com.daaw.db8
            if (r2 == 0) goto L8a
            r2 = r1
            com.daaw.db8 r2 = (com.daaw.db8) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L8a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.daaw.db8 r1 = r2.b(r1)
            goto L35
        L8a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L99
            if (r2 <= 0) goto L99
            r1.addAll(r6)
        L99:
            if (r0 > 0) goto L9c
            goto L9d
        L9c:
            r6 = r1
        L9d:
            com.daaw.ih8.x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gc8.b(java.lang.Object, java.lang.Object, long):void");
    }
}

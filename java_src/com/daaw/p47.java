package com.daaw;

import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class p47 extends i67 implements Runnable {
    @CheckForNull
    public f77 w;
    @CheckForNull
    public Class x;
    @CheckForNull
    public Object y;

    public p47(f77 f77Var, Class cls, Object obj) {
        Objects.requireNonNull(f77Var);
        this.w = f77Var;
        this.x = cls;
        Objects.requireNonNull(obj);
        this.y = obj;
    }

    public abstract Object E(Object obj, Throwable th);

    public abstract void F(Object obj);

    @Override // com.daaw.c57
    @CheckForNull
    public final String e() {
        String str;
        f77 f77Var = this.w;
        Class cls = this.x;
        Object obj = this.y;
        String e = super.e();
        if (f77Var != null) {
            str = "inputFuture=[" + f77Var.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (e != null) {
                return str.concat(e);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.daaw.c57
    public final void g() {
        v(this.w);
        this.w = null;
        this.x = null;
        this.y = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            com.daaw.f77 r0 = r9.w
            java.lang.Class r1 = r9.x
            java.lang.Object r2 = r9.y
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto La7
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L22
            goto La7
        L22:
            r3 = 0
            r9.w = r3
            boolean r4 = r0 instanceof com.daaw.y77     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            if (r4 == 0) goto L31
            r4 = r0
            com.daaw.y77 r4 = (com.daaw.y77) r4     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            java.lang.Throwable r4 = r4.a()     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.daaw.s67.p(r0)     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3e
            goto L7a
        L39:
            r4 = move-exception
            goto L3c
        L3b:
            r4 = move-exception
        L3c:
            r5 = r3
            goto L7a
        L3e:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L78
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Future type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L78:
            r4 = r5
            goto L3c
        L7a:
            if (r4 != 0) goto L80
            r9.h(r5)
            return
        L80:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto La4
            java.lang.Object r0 = r9.E(r2, r4)     // Catch: java.lang.Throwable -> L92
            r9.x = r3
            r9.y = r3
            r9.F(r0)
            return
        L92:
            r0 = move-exception
            com.daaw.n77.a(r0)     // Catch: java.lang.Throwable -> L9e
            r9.i(r0)     // Catch: java.lang.Throwable -> L9e
            r9.x = r3
            r9.y = r3
            return
        L9e:
            r0 = move-exception
            r9.x = r3
            r9.y = r3
            throw r0
        La4:
            r9.w(r0)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.p47.run():void");
    }
}

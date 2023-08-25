package com.daaw;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public class if0<A> implements mq0<A, jf0> {
    public final mq0<A, InputStream> a;
    public final mq0<A, ParcelFileDescriptor> b;

    /* loaded from: classes.dex */
    public static class a implements ip<jf0> {
        public final ip<InputStream> a;
        public final ip<ParcelFileDescriptor> b;

        public a(ip<InputStream> ipVar, ip<ParcelFileDescriptor> ipVar2) {
            this.a = ipVar;
            this.b = ipVar2;
        }

        @Override // com.daaw.ip
        public void b() {
            ip<InputStream> ipVar = this.a;
            if (ipVar != null) {
                ipVar.b();
            }
            ip<ParcelFileDescriptor> ipVar2 = this.b;
            if (ipVar2 != null) {
                ipVar2.b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.daaw.ip
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.daaw.jf0 a(com.daaw.dz0 r4) {
            /*
                r3 = this;
                com.daaw.ip<java.io.InputStream> r0 = r3.a
                r1 = 0
                if (r0 == 0) goto L13
                java.lang.Object r0 = r0.a(r4)     // Catch: java.lang.Exception -> Lc
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.Exception -> Lc
                goto L14
            Lc:
                r0 = move-exception
                com.daaw.ip<android.os.ParcelFileDescriptor> r2 = r3.b
                if (r2 == 0) goto L12
                goto L13
            L12:
                throw r0
            L13:
                r0 = r1
            L14:
                com.daaw.ip<android.os.ParcelFileDescriptor> r2 = r3.b
                if (r2 == 0) goto L25
                java.lang.Object r4 = r2.a(r4)     // Catch: java.lang.Exception -> L20
                android.os.ParcelFileDescriptor r4 = (android.os.ParcelFileDescriptor) r4     // Catch: java.lang.Exception -> L20
                r1 = r4
                goto L25
            L20:
                r4 = move-exception
                if (r0 == 0) goto L24
                goto L25
            L24:
                throw r4
            L25:
                com.daaw.jf0 r4 = new com.daaw.jf0
                r4.<init>(r0, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.if0.a.a(com.daaw.dz0):com.daaw.jf0");
        }

        @Override // com.daaw.ip
        public void cancel() {
            ip<InputStream> ipVar = this.a;
            if (ipVar != null) {
                ipVar.cancel();
            }
            ip<ParcelFileDescriptor> ipVar2 = this.b;
            if (ipVar2 != null) {
                ipVar2.cancel();
            }
        }

        @Override // com.daaw.ip
        public String getId() {
            ip<InputStream> ipVar = this.a;
            return ipVar != null ? ipVar.getId() : this.b.getId();
        }
    }

    public if0(mq0<A, InputStream> mq0Var, mq0<A, ParcelFileDescriptor> mq0Var2) {
        if (mq0Var == null) {
            Objects.requireNonNull(mq0Var2, "At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.a = mq0Var;
        this.b = mq0Var2;
    }

    @Override // com.daaw.mq0
    public ip<jf0> a(A a2, int i, int i2) {
        mq0<A, InputStream> mq0Var = this.a;
        ip<InputStream> a3 = mq0Var != null ? mq0Var.a(a2, i, i2) : null;
        mq0<A, ParcelFileDescriptor> mq0Var2 = this.b;
        ip<ParcelFileDescriptor> a4 = mq0Var2 != null ? mq0Var2.a(a2, i, i2) : null;
        if (a3 == null && a4 == null) {
            return null;
        }
        return new a(a3, a4);
    }
}

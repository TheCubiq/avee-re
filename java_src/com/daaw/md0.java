package com.daaw;

import java.util.Arrays;
/* loaded from: classes2.dex */
public class md0 extends k {
    public String b;
    public byte c;
    public xw d;
    public byte[] e;

    public md0(boolean z, byte[] bArr) {
        super(z);
        a(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    @Override // com.daaw.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(byte[] r6) {
        /*
            r5 = this;
            r0 = 1
            int r1 = com.daaw.wc.f(r6, r0, r0)
            java.lang.String r2 = "image/unknown"
            if (r1 < 0) goto L12
            int r3 = r1 + (-1)
            java.lang.String r0 = com.daaw.wc.a(r6, r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L12
            r5.b = r0     // Catch: java.io.UnsupportedEncodingException -> L12
            goto L14
        L12:
            r5.b = r2
        L14:
            int r0 = r1 + 1
            r0 = r6[r0]
            r5.c = r0
            int r1 = r1 + 2
            r0 = 0
            r2 = r6[r0]
            int r2 = com.daaw.wc.g(r6, r1, r2)
            if (r2 < 0) goto L3c
            com.daaw.xw r3 = new com.daaw.xw
            r0 = r6[r0]
            int r4 = r2 - r1
            byte[] r1 = com.daaw.wc.e(r6, r1, r4)
            r3.<init>(r0, r1)
            r5.d = r3
            byte[] r0 = r3.e()
            int r0 = r0.length
            int r1 = r2 + r0
            goto L47
        L3c:
            com.daaw.xw r2 = new com.daaw.xw
            r0 = r6[r0]
            java.lang.String r3 = ""
            r2.<init>(r0, r3)
            r5.d = r2
        L47:
            int r0 = r6.length
            int r0 = r0 - r1
            byte[] r6 = com.daaw.wc.e(r6, r1, r0)
            r5.e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.md0.b(byte[]):void");
    }

    public byte[] c() {
        return this.e;
    }

    @Override // com.daaw.k
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            md0 md0Var = (md0) obj;
            xw xwVar = this.d;
            if (xwVar == null) {
                if (md0Var.d != null) {
                    return false;
                }
            } else if (!xwVar.equals(md0Var.d)) {
                return false;
            }
            if (Arrays.equals(this.e, md0Var.e)) {
                String str = this.b;
                if (str == null) {
                    if (md0Var.b != null) {
                        return false;
                    }
                } else if (!str.equals(md0Var.b)) {
                    return false;
                }
                return this.c == md0Var.c;
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.k
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        xw xwVar = this.d;
        int hashCode2 = (((hashCode + (xwVar == null ? 0 : xwVar.hashCode())) * 31) + Arrays.hashCode(this.e)) * 31;
        String str = this.b;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.c;
    }
}

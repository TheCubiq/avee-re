package com.daaw;
/* loaded from: classes.dex */
public final class ec2 {
    public final m42 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public ec2(m42 m42Var) {
        this.a = m42Var;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = i3 + (i2 - i);
                return;
            }
            this.d = ((bArr[i4] & 192) >> 6) == 0;
            this.c = false;
        }
    }

    public final void b(long j, int i, boolean z) {
        if (this.e == 182 && z && this.b) {
            long j2 = this.h;
            if (j2 != -9223372036854775807L) {
                long j3 = this.g;
                this.a.b(j2, this.d ? 1 : 0, (int) (j - j3), i, null);
            }
        }
        if (this.e != 179) {
            this.g = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r5, long r6) {
        /*
            r4 = this;
            r4.e = r5
            r0 = 0
            r4.d = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L13
            if (r5 != r1) goto L11
            r5 = 179(0xb3, float:2.51E-43)
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            r4.b = r1
            if (r5 != r2) goto L19
            goto L1a
        L19:
            r3 = 0
        L1a:
            r4.c = r3
            r4.f = r0
            r4.h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ec2.c(int, long):void");
    }

    public final void d() {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = -1;
    }
}

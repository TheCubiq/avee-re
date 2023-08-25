package com.daaw;
/* loaded from: classes2.dex */
public final class e78 extends k78 {
    public final byte[] b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ e78(byte[] bArr, int i, int i2, boolean z, b78 b78Var) {
        super(null);
        this.e = Integer.MAX_VALUE;
        this.b = bArr;
        this.c = 0;
    }

    public final int c(int i) {
        int i2 = this.e;
        this.e = 0;
        int i3 = this.c + this.d;
        this.c = i3;
        if (i3 > 0) {
            this.d = i3;
            this.c = i3 - i3;
        } else {
            this.d = 0;
        }
        return i2;
    }
}

package com.daaw;
/* loaded from: classes2.dex */
public final class e78 extends k78 {

    /* renamed from: b */
    public final byte[] f8230b;

    /* renamed from: c */
    public int f8231c;

    /* renamed from: d */
    public int f8232d;

    /* renamed from: e */
    public int f8233e;

    public /* synthetic */ e78(byte[] bArr, int i, int i2, boolean z, b78 b78Var) {
        super(null);
        this.f8233e = Integer.MAX_VALUE;
        this.f8230b = bArr;
        this.f8231c = 0;
    }

    /* renamed from: c */
    public final int m23671c(int i) {
        int i2 = this.f8233e;
        this.f8233e = 0;
        int i3 = this.f8231c + this.f8232d;
        this.f8231c = i3;
        if (i3 > 0) {
            this.f8232d = i3;
            this.f8231c = i3 - i3;
        } else {
            this.f8232d = 0;
        }
        return i2;
    }
}

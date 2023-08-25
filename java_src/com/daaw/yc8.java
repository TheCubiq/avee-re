package com.daaw;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class yc8 extends l68 {
    public static final WeakReference r = new WeakReference(null);
    public WeakReference q;

    public yc8(byte[] bArr) {
        super(bArr);
        this.q = r;
    }

    @Override // com.daaw.l68
    public final byte[] g3() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.q.get();
            if (bArr == null) {
                bArr = h3();
                this.q = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] h3();
}

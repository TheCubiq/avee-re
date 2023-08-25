package com.daaw;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class yc8 extends l68 {

    /* renamed from: r */
    public static final WeakReference f33520r = new WeakReference(null);

    /* renamed from: q */
    public WeakReference f33521q;

    public yc8(byte[] bArr) {
        super(bArr);
        this.f33521q = f33520r;
    }

    @Override // com.daaw.l68
    /* renamed from: g3 */
    public final byte[] mo3860g3() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f33521q.get();
            if (bArr == null) {
                bArr = mo3859h3();
                this.f33521q = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: h3 */
    public abstract byte[] mo3859h3();
}

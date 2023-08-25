package com.daaw;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class r44 {

    /* renamed from: a */
    public long f24842a;

    /* renamed from: a */
    public final long m11755a(ByteBuffer byteBuffer) {
        lh2 lh2Var;
        kh2 kh2Var;
        long j = this.f24842a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new gh2(new q44(duplicate), t44.f26997c).m20313u().iterator();
            while (true) {
                lh2Var = null;
                if (!it.hasNext()) {
                    kh2Var = null;
                    break;
                }
                ih2 ih2Var = (ih2) it.next();
                if (ih2Var instanceof kh2) {
                    kh2Var = (kh2) ih2Var;
                    break;
                }
            }
            Iterator it2 = kh2Var.m20313u().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ih2 ih2Var2 = (ih2) it2.next();
                if (ih2Var2 instanceof lh2) {
                    lh2Var = (lh2) ih2Var2;
                    break;
                }
            }
            long m16955g = (lh2Var.m16955g() * 1000) / lh2Var.m16954h();
            this.f24842a = m16955g;
            return m16955g;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}

package com.daaw;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class r44 {
    public long a;

    public final long a(ByteBuffer byteBuffer) {
        lh2 lh2Var;
        kh2 kh2Var;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new gh2(new q44(duplicate), t44.c).u().iterator();
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
            Iterator it2 = kh2Var.u().iterator();
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
            long g = (lh2Var.g() * 1000) / lh2Var.h();
            this.a = g;
            return g;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}

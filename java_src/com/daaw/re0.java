package com.daaw;

import com.daaw.qe0;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class re0 {
    public final rv0 a = new rv0(10);

    public Metadata a(a00 a00Var, qe0.b bVar) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                a00Var.k(this.a.a, 0, 10);
                this.a.J(0);
                if (this.a.A() != qe0.c) {
                    break;
                }
                this.a.K(3);
                int w = this.a.w();
                int i2 = w + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    a00Var.k(bArr, 10, w);
                    metadata = new qe0(bVar).c(bArr, i2);
                } else {
                    a00Var.g(w);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        a00Var.i();
        a00Var.g(i);
        return metadata;
    }
}

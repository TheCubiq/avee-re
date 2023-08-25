package com.daaw;

import com.daaw.qe0;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class re0 {

    /* renamed from: a */
    public final rv0 f25212a = new rv0(10);

    /* renamed from: a */
    public Metadata m11368a(a00 a00Var, qe0.InterfaceC2708b interfaceC2708b) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                a00Var.mo5856k(this.f25212a.f25637a, 0, 10);
                this.f25212a.m10921J(0);
                if (this.f25212a.m10930A() != qe0.f23885c) {
                    break;
                }
                this.f25212a.m10920K(3);
                int m10897w = this.f25212a.m10897w();
                int i2 = m10897w + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f25212a.f25637a, 0, bArr, 0, 10);
                    a00Var.mo5856k(bArr, 10, m10897w);
                    metadata = new qe0(interfaceC2708b).m12600c(bArr, i2);
                } else {
                    a00Var.mo5860g(m10897w);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        a00Var.mo5858i();
        a00Var.mo5860g(i);
        return metadata;
    }
}

package com.daaw;

import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class ev implements sm1 {
    @Override // com.daaw.sm1
    public void a(long j, int i, int i2, int i3, sm1.a aVar) {
    }

    @Override // com.daaw.sm1
    public int b(a00 a00Var, int i, boolean z) {
        int a = a00Var.a(i);
        if (a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return a;
    }

    @Override // com.daaw.sm1
    public void c(rv0 rv0Var, int i) {
        rv0Var.K(i);
    }

    @Override // com.daaw.sm1
    public void d(Format format) {
    }
}

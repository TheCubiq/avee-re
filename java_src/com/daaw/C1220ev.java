package com.daaw;

import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
/* renamed from: com.daaw.ev */
/* loaded from: classes.dex */
public final class C1220ev implements sm1 {
    @Override // com.daaw.sm1
    /* renamed from: a */
    public void mo10159a(long j, int i, int i2, int i3, sm1.C2956a c2956a) {
    }

    @Override // com.daaw.sm1
    /* renamed from: b */
    public int mo10158b(a00 a00Var, int i, boolean z) {
        int mo5866a = a00Var.mo5866a(i);
        if (mo5866a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return mo5866a;
    }

    @Override // com.daaw.sm1
    /* renamed from: c */
    public void mo10157c(rv0 rv0Var, int i) {
        rv0Var.m10920K(i);
    }

    @Override // com.daaw.sm1
    /* renamed from: d */
    public void mo10156d(Format format) {
    }
}

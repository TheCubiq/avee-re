package com.daaw;

import com.daaw.gb1;
import com.google.android.exoplayer2.source.TrackGroupArray;
/* loaded from: classes.dex */
public interface qo0 extends gb1 {

    /* loaded from: classes.dex */
    public interface a extends gb1.a<qo0> {
        void j(qo0 qo0Var);
    }

    @Override // com.daaw.gb1
    long b();

    @Override // com.daaw.gb1
    boolean c(long j);

    long e(long j, ea1 ea1Var);

    @Override // com.daaw.gb1
    long f();

    @Override // com.daaw.gb1
    void g(long j);

    long i(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j);

    void l();

    long m(long j);

    void p(a aVar, long j);

    long q();

    TrackGroupArray s();

    void t(long j, boolean z);
}

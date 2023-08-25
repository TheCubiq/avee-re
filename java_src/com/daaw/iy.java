package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class iy implements rp0 {
    @Override // com.daaw.rp0
    public Metadata a(tp0 tp0Var) {
        ByteBuffer byteBuffer = tp0Var.r;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        rv0 rv0Var = new rv0(array, limit);
        String r = rv0Var.r();
        String r2 = rv0Var.r();
        long z = rv0Var.z();
        return new Metadata(new EventMessage(r, r2, sq1.T(rv0Var.z(), 1000L, z), rv0Var.z(), Arrays.copyOfRange(array, rv0Var.c(), limit), sq1.T(rv0Var.z(), 1000000L, z)));
    }
}

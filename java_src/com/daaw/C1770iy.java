package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* renamed from: com.daaw.iy */
/* loaded from: classes.dex */
public final class C1770iy implements rp0 {
    @Override // com.daaw.rp0
    /* renamed from: a */
    public Metadata mo11098a(tp0 tp0Var) {
        ByteBuffer byteBuffer = tp0Var.f11565r;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        rv0 rv0Var = new rv0(array, limit);
        String m10902r = rv0Var.m10902r();
        String m10902r2 = rv0Var.m10902r();
        long m10894z = rv0Var.m10894z();
        return new Metadata(new EventMessage(m10902r, m10902r2, sq1.m10025T(rv0Var.m10894z(), 1000L, m10894z), rv0Var.m10894z(), Arrays.copyOfRange(array, rv0Var.m10917c(), limit), sq1.m10025T(rv0Var.m10894z(), 1000000L, m10894z)));
    }
}

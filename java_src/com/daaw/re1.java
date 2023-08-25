package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class re1 implements rp0 {
    public final rv0 a = new rv0();
    public final qv0 b = new qv0();
    public ol1 c;

    @Override // com.daaw.rp0
    public Metadata a(tp0 tp0Var) {
        ol1 ol1Var = this.c;
        if (ol1Var == null || tp0Var.u != ol1Var.e()) {
            ol1 ol1Var2 = new ol1(tp0Var.s);
            this.c = ol1Var2;
            ol1Var2.a(tp0Var.s - tp0Var.u);
        }
        ByteBuffer byteBuffer = tp0Var.r;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.H(array, limit);
        this.b.l(array, limit);
        this.b.o(39);
        long h = (this.b.h(1) << 32) | this.b.h(32);
        this.b.o(20);
        int h2 = this.b.h(12);
        int h3 = this.b.h(8);
        Metadata.Entry entry = null;
        this.a.K(14);
        if (h3 == 0) {
            entry = new SpliceNullCommand();
        } else if (h3 == 255) {
            entry = PrivateCommand.a(this.a, h2, h);
        } else if (h3 == 4) {
            entry = SpliceScheduleCommand.a(this.a);
        } else if (h3 == 5) {
            entry = SpliceInsertCommand.a(this.a, h, this.c);
        } else if (h3 == 6) {
            entry = TimeSignalCommand.a(this.a, h, this.c);
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}

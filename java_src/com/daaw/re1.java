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

    /* renamed from: a */
    public final rv0 f25213a = new rv0();

    /* renamed from: b */
    public final qv0 f25214b = new qv0();

    /* renamed from: c */
    public ol1 f25215c;

    @Override // com.daaw.rp0
    /* renamed from: a */
    public Metadata mo11098a(tp0 tp0Var) {
        ol1 ol1Var = this.f25215c;
        if (ol1Var == null || tp0Var.f27939u != ol1Var.m14184e()) {
            ol1 ol1Var2 = new ol1(tp0Var.f11566s);
            this.f25215c = ol1Var2;
            ol1Var2.m14188a(tp0Var.f11566s - tp0Var.f27939u);
        }
        ByteBuffer byteBuffer = tp0Var.f11565r;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f25213a.m10923H(array, limit);
        this.f25214b.m12121l(array, limit);
        this.f25214b.m12118o(39);
        long m12125h = (this.f25214b.m12125h(1) << 32) | this.f25214b.m12125h(32);
        this.f25214b.m12118o(20);
        int m12125h2 = this.f25214b.m12125h(12);
        int m12125h3 = this.f25214b.m12125h(8);
        Metadata.Entry entry = null;
        this.f25213a.m10920K(14);
        if (m12125h3 == 0) {
            entry = new SpliceNullCommand();
        } else if (m12125h3 == 255) {
            entry = PrivateCommand.m1625a(this.f25213a, m12125h2, m12125h);
        } else if (m12125h3 == 4) {
            entry = SpliceScheduleCommand.m1615a(this.f25213a);
        } else if (m12125h3 == 5) {
            entry = SpliceInsertCommand.m1622a(this.f25213a, m12125h, this.f25215c);
        } else if (m12125h3 == 6) {
            entry = TimeSignalCommand.m1602a(this.f25213a, m12125h, this.f25215c);
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}

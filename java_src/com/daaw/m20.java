package com.daaw;

import com.google.android.exoplayer2.source.TrackGroup;
/* loaded from: classes.dex */
public final class m20 extends AbstractC3823za {

    /* renamed from: g */
    public final int f18005g;

    /* renamed from: h */
    public final Object f18006h;

    public m20(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0, null);
    }

    public m20(TrackGroup trackGroup, int i, int i2, Object obj) {
        super(trackGroup, i);
        this.f18005g = i2;
        this.f18006h = obj;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: b */
    public int mo1533b() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: l */
    public int mo1523l() {
        return this.f18005g;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: n */
    public void mo1521n(long j, long j2, long j3) {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: o */
    public Object mo1520o() {
        return this.f18006h;
    }
}

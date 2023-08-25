package com.google.android.exoplayer2.trackselection;

import com.daaw.zn0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public interface a {
        c a(TrackGroup trackGroup, int... iArr);
    }

    TrackGroup a();

    int b();

    boolean c(int i, long j);

    Format d(int i);

    void e();

    int f(int i);

    void g();

    int h(long j, List<? extends zn0> list);

    int i(Format format);

    int j();

    Format k();

    int l();

    int length();

    void m(float f);

    void n(long j, long j2, long j3);

    Object o();

    int p(int i);
}

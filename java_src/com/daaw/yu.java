package com.daaw;

import android.annotation.TargetApi;
import android.os.Looper;
import com.daaw.nz;
import com.google.android.exoplayer2.drm.DrmInitData;
@TargetApi(16)
/* loaded from: classes.dex */
public interface yu<T extends nz> {
    com.google.android.exoplayer2.drm.d<T> a(Looper looper, DrmInitData drmInitData);

    boolean d(DrmInitData drmInitData);

    void f(com.google.android.exoplayer2.drm.d<T> dVar);
}

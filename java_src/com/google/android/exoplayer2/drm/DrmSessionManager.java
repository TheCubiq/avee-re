package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
/* loaded from: classes.dex */
public interface DrmSessionManager<T extends ExoMediaCrypto> {
    DrmSession<T> acquireSession(Looper looper, DrmInitData drmInitData);

    boolean canAcquireSession(DrmInitData drmInitData);

    void releaseSession(DrmSession<T> drmSession);
}

package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import com.daaw.nz;
import java.util.Map;
@TargetApi(16)
/* loaded from: classes.dex */
public interface d<T extends nz> {

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    Map<String, String> a();

    T b();

    a c();

    int getState();
}

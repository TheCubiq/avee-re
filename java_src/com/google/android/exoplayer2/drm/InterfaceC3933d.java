package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import com.daaw.InterfaceC2376nz;
import java.util.Map;
@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.drm.d */
/* loaded from: classes.dex */
public interface InterfaceC3933d<T extends InterfaceC2376nz> {

    /* renamed from: com.google.android.exoplayer2.drm.d$a */
    /* loaded from: classes.dex */
    public static class C3934a extends Exception {
        public C3934a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    Map<String, String> mo1665a();

    /* renamed from: b */
    T mo1664b();

    /* renamed from: c */
    C3934a mo1663c();

    int getState();
}

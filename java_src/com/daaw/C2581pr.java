package com.daaw;

import android.os.Handler;
import android.os.Looper;
/* renamed from: com.daaw.pr */
/* loaded from: classes.dex */
public class C2581pr implements m61 {

    /* renamed from: a */
    public final Handler f23193a = q80.m12710a(Looper.getMainLooper());

    @Override // com.daaw.m61
    /* renamed from: a */
    public void mo13205a(long j, Runnable runnable) {
        this.f23193a.postDelayed(runnable, j);
    }

    @Override // com.daaw.m61
    /* renamed from: b */
    public void mo13204b(Runnable runnable) {
        this.f23193a.removeCallbacks(runnable);
    }
}

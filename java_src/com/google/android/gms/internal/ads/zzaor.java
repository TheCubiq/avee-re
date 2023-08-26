package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
@zzadh
/* loaded from: classes2.dex */
public final class zzaor {
    public static void zza(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new zzaos(view, onGlobalLayoutListener).attach();
    }

    public static void zza(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new zzaot(view, onScrollChangedListener).attach();
    }
}

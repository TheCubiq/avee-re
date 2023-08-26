package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes2.dex */
public class zzakz extends zzakx {
    @Override // com.google.android.gms.internal.ads.zzakx, com.google.android.gms.internal.ads.zzakq
    public final boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final ViewGroup.LayoutParams zzro() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}

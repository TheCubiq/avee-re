package com.google.android.gms.internal.ads;

import android.content.Context;
@zzadh
/* loaded from: classes2.dex */
public final class zzami extends zzajx {
    private final String zzag;
    private final zzanf zzctw;

    public zzami(Context context, String str, String str2) {
        this(str2, com.google.android.gms.ads.internal.zzbv.zzek().zzm(context, str));
    }

    private zzami(String str, String str2) {
        this.zzctw = new zzanf(str2);
        this.zzag = str;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        this.zzctw.zzcz(this.zzag);
    }
}

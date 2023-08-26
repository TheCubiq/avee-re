package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakk;
@zzadh
/* loaded from: classes.dex */
public final class zzl {
    public static void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzbyu == 4 && adOverlayInfoParcel.zzbyn == null) {
            if (adOverlayInfoParcel.zzbym != null) {
                adOverlayInfoParcel.zzbym.onAdClicked();
            }
            zzbv.zzeh();
            zza.zza(context, adOverlayInfoParcel.zzbyl, adOverlayInfoParcel.zzbyt);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzacr.zzcvg);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent, adOverlayInfoParcel);
        if (!PlatformVersion.isAtLeastLollipop()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        zzbv.zzek();
        zzakk.zza(context, intent);
    }
}

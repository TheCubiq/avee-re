package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
@zzadh
/* loaded from: classes2.dex */
public final class zzamm {
    public static boolean zzo(zzjj zzjjVar) {
        Bundle bundle = zzjjVar.zzaqg != null ? zzjjVar.zzaqg : new Bundle();
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }
}

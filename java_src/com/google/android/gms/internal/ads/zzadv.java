package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
@zzadh
/* loaded from: classes2.dex */
public final class zzadv {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzc(Context context, boolean z) {
        if (z) {
            int remoteVersion = DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID);
            return remoteVersion != 0 && remoteVersion <= DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID);
        }
        return true;
    }
}

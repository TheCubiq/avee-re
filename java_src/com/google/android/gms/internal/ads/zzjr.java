package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
@zzadh
/* loaded from: classes2.dex */
public class zzjr {
    private final Object mLock = new Object();
    private zzld zzari;
    private final zzjh zzarj;
    private final zzjg zzark;
    private final zzme zzarl;
    private final zzrv zzarm;
    private final zzahi zzarn;
    private final zzaao zzaro;
    private final zzrw zzarp;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class zza<T> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public zza() {
        }

        protected abstract T zza(zzld zzldVar) throws RemoteException;

        protected abstract T zzib() throws RemoteException;

        protected final T zzic() {
            zzld zzia = zzjr.this.zzia();
            if (zzia == null) {
                zzane.zzdk("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return zza(zzia);
            } catch (RemoteException e) {
                zzane.zzc("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        protected final T zzid() {
            try {
                return zzib();
            } catch (RemoteException e) {
                zzane.zzc("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public zzjr(zzjh zzjhVar, zzjg zzjgVar, zzme zzmeVar, zzrv zzrvVar, zzahi zzahiVar, zzaao zzaaoVar, zzrw zzrwVar) {
        this.zzarj = zzjhVar;
        this.zzark = zzjgVar;
        this.zzarl = zzmeVar;
        this.zzarm = zzrvVar;
        this.zzarn = zzahiVar;
        this.zzaro = zzaaoVar;
        this.zzarp = zzrwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zza(Context context, boolean z, zza<T> zzaVar) {
        if (!z) {
            zzkb.zzif();
            if (!zzamu.zzbe(context)) {
                zzane.zzck("Google Play Services is not available");
                z = true;
            }
        }
        zzkb.zzif();
        int zzbg = zzamu.zzbg(context);
        zzkb.zzif();
        boolean z2 = zzbg <= zzamu.zzbf(context) ? z : true;
        zznk.initialize(context);
        if (((Boolean) zzkb.zzik().zzd(zznk.zzber)).booleanValue()) {
            z2 = false;
        }
        if (z2) {
            T zzic = zzaVar.zzic();
            return zzic == null ? zzaVar.zzid() : zzic;
        }
        T zzid = zzaVar.zzid();
        return zzid == null ? zzaVar.zzic() : zzid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzkb.zzif().zza(context, (String) null, "gmob-apps", bundle, true);
    }

    private static zzld zzhz() {
        try {
            Object newInstance = zzjr.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return zzle.asInterface((IBinder) newInstance);
            }
            zzane.zzdk("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Exception e) {
            zzane.zzc("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzld zzia() {
        zzld zzldVar;
        synchronized (this.mLock) {
            if (this.zzari == null) {
                this.zzari = zzhz();
            }
            zzldVar = this.zzari;
        }
        return zzldVar;
    }

    public final zzqa zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzqa) zza(context, false, (zza<Object>) new zzjx(this, frameLayout, frameLayout2, context));
    }

    public final zzqf zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (zzqf) zza(view.getContext(), false, (zza<Object>) new zzjy(this, view, hashMap, hashMap2));
    }

    public final zzaap zzb(Activity activity) {
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzane.e("useClientJar flag not found in activity intent extras.");
        }
        return (zzaap) zza(activity, z, new zzka(this, activity));
    }

    public final zzkn zzb(Context context, String str, zzxn zzxnVar) {
        return (zzkn) zza(context, false, (zza<Object>) new zzjv(this, context, str, zzxnVar));
    }
}

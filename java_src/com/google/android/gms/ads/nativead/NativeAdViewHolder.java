package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.daaw.fd3;
import com.daaw.k04;
import com.daaw.nt0;
import com.daaw.ry0;
import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class NativeAdViewHolder {
    public static WeakHashMap zza = new WeakHashMap();
    @NotOnlyInitialized

    /* renamed from: a */
    public fd3 f36471a;

    /* renamed from: b */
    public WeakReference f36472b;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        ry0.m10829k(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            k04.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zza.get(view) != null) {
            k04.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zza.put(view, this);
            this.f36472b = new WeakReference(view);
            this.f36471a = zzay.zza().zzi(view, m1281a(map), m1281a(map2));
        }
    }

    /* renamed from: a */
    public static final HashMap m1281a(Map map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f36471a.zzb(nt0.m14830g3(view));
        } catch (RemoteException e) {
            k04.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, com.daaw.yd0] */
    public void setNativeAd(NativeAd nativeAd) {
        ?? mo1296a = nativeAd.mo1296a();
        WeakReference weakReference = this.f36472b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            k04.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zza.containsKey(view)) {
            zza.put(view, this);
        }
        fd3 fd3Var = this.f36471a;
        if (fd3Var != 0) {
            try {
                fd3Var.zzc(mo1296a);
            } catch (RemoteException e) {
                k04.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void unregisterNativeAd() {
        fd3 fd3Var = this.f36471a;
        if (fd3Var != null) {
            try {
                fd3Var.zzd();
            } catch (RemoteException e) {
                k04.zzh("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference weakReference = this.f36472b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}

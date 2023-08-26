package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes2.dex */
public final class zzlx {
    private String zzaqr;
    private String zzaqt;
    private String zzaqx;
    private boolean zzaqz;
    private Date zzhl;
    private Location zzhp;
    private final HashSet<String> zzasp = new HashSet<>();
    private final Bundle zzask = new Bundle();
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzasq = new HashMap<>();
    private final HashSet<String> zzasr = new HashSet<>();
    private final Bundle zzaqv = new Bundle();
    private final HashSet<String> zzass = new HashSet<>();
    private int zzaqn = -1;
    private boolean zzvm = false;
    private int zzaqq = -1;

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzvm = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void zza(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zza(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzasq.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zza(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.zzask.putBundle(cls.getName(), bundle);
    }

    public final void zza(Date date) {
        this.zzhl = date;
    }

    public final void zzac(String str) {
        this.zzasp.add(str);
    }

    public final void zzad(String str) {
        this.zzasr.add(str);
    }

    public final void zzae(String str) {
        this.zzasr.remove(str);
    }

    public final void zzaf(String str) {
        this.zzaqt = str;
    }

    public final void zzag(String str) {
        this.zzaqr = str;
    }

    public final void zzah(String str) {
        this.zzaqx = str;
    }

    public final void zzai(String str) {
        this.zzass.add(str);
    }

    public final void zzb(Location location) {
        this.zzhp = location;
    }

    public final void zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzask.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzask.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.zzask.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void zzc(String str, String str2) {
        this.zzaqv.putString(str, str2);
    }

    public final void zzj(boolean z) {
        this.zzaqq = z ? 1 : 0;
    }

    public final void zzk(boolean z) {
        this.zzaqz = z;
    }

    public final void zzt(int i) {
        this.zzaqn = i;
    }
}

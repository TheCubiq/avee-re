package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@zzadh
/* loaded from: classes2.dex */
public final class zzlw {
    private final int zzaqn;
    private final int zzaqq;
    private final String zzaqr;
    private final String zzaqt;
    private final Bundle zzaqv;
    private final String zzaqx;
    private final boolean zzaqz;
    private final Bundle zzask;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> zzasl;
    private final SearchAdRequest zzasm;
    private final Set<String> zzasn;
    private final Set<String> zzaso;
    private final Date zzhl;
    private final Set<String> zzhn;
    private final Location zzhp;
    private final boolean zzvm;

    public zzlw(zzlx zzlxVar) {
        this(zzlxVar, null);
    }

    public zzlw(zzlx zzlxVar, SearchAdRequest searchAdRequest) {
        Date date;
        String str;
        int i;
        HashSet hashSet;
        Location location;
        boolean z;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i2;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z2;
        date = zzlxVar.zzhl;
        this.zzhl = date;
        str = zzlxVar.zzaqt;
        this.zzaqt = str;
        i = zzlxVar.zzaqn;
        this.zzaqn = i;
        hashSet = zzlxVar.zzasp;
        this.zzhn = Collections.unmodifiableSet(hashSet);
        location = zzlxVar.zzhp;
        this.zzhp = location;
        z = zzlxVar.zzvm;
        this.zzvm = z;
        bundle = zzlxVar.zzask;
        this.zzask = bundle;
        hashMap = zzlxVar.zzasq;
        this.zzasl = Collections.unmodifiableMap(hashMap);
        str2 = zzlxVar.zzaqr;
        this.zzaqr = str2;
        str3 = zzlxVar.zzaqx;
        this.zzaqx = str3;
        this.zzasm = searchAdRequest;
        i2 = zzlxVar.zzaqq;
        this.zzaqq = i2;
        hashSet2 = zzlxVar.zzasr;
        this.zzasn = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzlxVar.zzaqv;
        this.zzaqv = bundle2;
        hashSet3 = zzlxVar.zzass;
        this.zzaso = Collections.unmodifiableSet(hashSet3);
        z2 = zzlxVar.zzaqz;
        this.zzaqz = z2;
    }

    public final Date getBirthday() {
        return this.zzhl;
    }

    public final String getContentUrl() {
        return this.zzaqt;
    }

    public final Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.zzask.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle getCustomTargeting() {
        return this.zzaqv;
    }

    public final int getGender() {
        return this.zzaqn;
    }

    public final Set<String> getKeywords() {
        return this.zzhn;
    }

    public final Location getLocation() {
        return this.zzhp;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzvm;
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzasl.get(cls);
    }

    public final Bundle getNetworkExtrasBundle(Class<? extends MediationAdapter> cls) {
        return this.zzask.getBundle(cls.getName());
    }

    public final String getPublisherProvidedId() {
        return this.zzaqr;
    }

    public final boolean isDesignedForFamilies() {
        return this.zzaqz;
    }

    public final boolean isTestDevice(Context context) {
        Set<String> set = this.zzasn;
        zzkb.zzif();
        return set.contains(zzamu.zzbc(context));
    }

    public final String zzip() {
        return this.zzaqx;
    }

    public final SearchAdRequest zziq() {
        return this.zzasm;
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> zzir() {
        return this.zzasl;
    }

    public final Bundle zzis() {
        return this.zzask;
    }

    public final int zzit() {
        return this.zzaqq;
    }

    public final Set<String> zziu() {
        return this.zzaso;
    }
}

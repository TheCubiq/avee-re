package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.daaw.d04;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class zzdx {
    public final Date a;
    public final String b;
    public final List c;
    public final int d;
    public final Set e;
    public final Bundle f;
    public final Map g;
    public final String h;
    public final String i;
    @NotOnlyInitialized
    public final SearchAdRequest j;
    public final int k;
    public final Set l;
    public final Bundle m;
    public final Set n;
    public final boolean o;
    public final AdInfo p;
    public final String q;
    public final int r;

    public zzdx(zzdw zzdwVar, SearchAdRequest searchAdRequest) {
        Date date;
        String str;
        List list;
        int i;
        HashSet hashSet;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i2;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z;
        AdInfo adInfo;
        String str4;
        int i3;
        date = zzdwVar.g;
        this.a = date;
        str = zzdwVar.h;
        this.b = str;
        list = zzdwVar.i;
        this.c = list;
        i = zzdwVar.j;
        this.d = i;
        hashSet = zzdwVar.a;
        this.e = Collections.unmodifiableSet(hashSet);
        bundle = zzdwVar.b;
        this.f = bundle;
        hashMap = zzdwVar.c;
        this.g = Collections.unmodifiableMap(hashMap);
        str2 = zzdwVar.k;
        this.h = str2;
        str3 = zzdwVar.l;
        this.i = str3;
        this.j = searchAdRequest;
        i2 = zzdwVar.m;
        this.k = i2;
        hashSet2 = zzdwVar.d;
        this.l = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzdwVar.e;
        this.m = bundle2;
        hashSet3 = zzdwVar.f;
        this.n = Collections.unmodifiableSet(hashSet3);
        z = zzdwVar.n;
        this.o = z;
        adInfo = zzdwVar.o;
        this.p = adInfo;
        str4 = zzdwVar.p;
        this.q = str4;
        i3 = zzdwVar.q;
        this.r = i3;
    }

    @Deprecated
    public final int zza() {
        return this.d;
    }

    public final int zzb() {
        return this.r;
    }

    public final int zzc() {
        return this.k;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.f.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.m;
    }

    public final Bundle zzf(Class cls) {
        return this.f.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.f;
    }

    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.g.get(cls);
    }

    public final AdInfo zzi() {
        return this.p;
    }

    public final SearchAdRequest zzj() {
        return this.j;
    }

    public final String zzk() {
        return this.q;
    }

    public final String zzl() {
        return this.b;
    }

    public final String zzm() {
        return this.h;
    }

    public final String zzn() {
        return this.i;
    }

    @Deprecated
    public final Date zzo() {
        return this.a;
    }

    public final List zzp() {
        return new ArrayList(this.c);
    }

    public final Set zzq() {
        return this.n;
    }

    public final Set zzr() {
        return this.e;
    }

    @Deprecated
    public final boolean zzs() {
        return this.o;
    }

    public final boolean zzt(Context context) {
        RequestConfiguration zzc = zzej.zzf().zzc();
        zzay.zzb();
        String E = d04.E(context);
        return this.l.contains(E) || zzc.getTestDeviceIds().contains(E);
    }
}

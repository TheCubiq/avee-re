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

    /* renamed from: a */
    public final Date f36128a;

    /* renamed from: b */
    public final String f36129b;

    /* renamed from: c */
    public final List f36130c;

    /* renamed from: d */
    public final int f36131d;

    /* renamed from: e */
    public final Set f36132e;

    /* renamed from: f */
    public final Bundle f36133f;

    /* renamed from: g */
    public final Map f36134g;

    /* renamed from: h */
    public final String f36135h;

    /* renamed from: i */
    public final String f36136i;
    @NotOnlyInitialized

    /* renamed from: j */
    public final SearchAdRequest f36137j;

    /* renamed from: k */
    public final int f36138k;

    /* renamed from: l */
    public final Set f36139l;

    /* renamed from: m */
    public final Bundle f36140m;

    /* renamed from: n */
    public final Set f36141n;

    /* renamed from: o */
    public final boolean f36142o;

    /* renamed from: p */
    public final AdInfo f36143p;

    /* renamed from: q */
    public final String f36144q;

    /* renamed from: r */
    public final int f36145r;

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
        date = zzdwVar.f36117g;
        this.f36128a = date;
        str = zzdwVar.f36118h;
        this.f36129b = str;
        list = zzdwVar.f36119i;
        this.f36130c = list;
        i = zzdwVar.f36120j;
        this.f36131d = i;
        hashSet = zzdwVar.f36111a;
        this.f36132e = Collections.unmodifiableSet(hashSet);
        bundle = zzdwVar.f36112b;
        this.f36133f = bundle;
        hashMap = zzdwVar.f36113c;
        this.f36134g = Collections.unmodifiableMap(hashMap);
        str2 = zzdwVar.f36121k;
        this.f36135h = str2;
        str3 = zzdwVar.f36122l;
        this.f36136i = str3;
        this.f36137j = searchAdRequest;
        i2 = zzdwVar.f36123m;
        this.f36138k = i2;
        hashSet2 = zzdwVar.f36114d;
        this.f36139l = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzdwVar.f36115e;
        this.f36140m = bundle2;
        hashSet3 = zzdwVar.f36116f;
        this.f36141n = Collections.unmodifiableSet(hashSet3);
        z = zzdwVar.f36124n;
        this.f36142o = z;
        adInfo = zzdwVar.f36125o;
        this.f36143p = adInfo;
        str4 = zzdwVar.f36126p;
        this.f36144q = str4;
        i3 = zzdwVar.f36127q;
        this.f36145r = i3;
    }

    @Deprecated
    public final int zza() {
        return this.f36131d;
    }

    public final int zzb() {
        return this.f36145r;
    }

    public final int zzc() {
        return this.f36138k;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.f36133f.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.f36140m;
    }

    public final Bundle zzf(Class cls) {
        return this.f36133f.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.f36133f;
    }

    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.f36134g.get(cls);
    }

    public final AdInfo zzi() {
        return this.f36143p;
    }

    public final SearchAdRequest zzj() {
        return this.f36137j;
    }

    public final String zzk() {
        return this.f36144q;
    }

    public final String zzl() {
        return this.f36129b;
    }

    public final String zzm() {
        return this.f36135h;
    }

    public final String zzn() {
        return this.f36136i;
    }

    @Deprecated
    public final Date zzo() {
        return this.f36128a;
    }

    public final List zzp() {
        return new ArrayList(this.f36130c);
    }

    public final Set zzq() {
        return this.f36141n;
    }

    public final Set zzr() {
        return this.f36132e;
    }

    @Deprecated
    public final boolean zzs() {
        return this.f36142o;
    }

    public final boolean zzt(Context context) {
        RequestConfiguration zzc = zzej.zzf().zzc();
        zzay.zzb();
        String m24832E = d04.m24832E(context);
        return this.f36139l.contains(m24832E) || zzc.getTestDeviceIds().contains(m24832E);
    }
}

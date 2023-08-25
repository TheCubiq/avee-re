package com.daaw;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.internal.ads.zzblz;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class ho3 implements NativeMediationAdRequest {
    public final Date a;
    public final int b;
    public final Set c;
    public final boolean d;
    public final Location e;
    public final int f;
    public final zzblz g;
    public final boolean i;
    public final String k;
    public final List h = new ArrayList();
    public final Map j = new HashMap();

    public ho3(Date date, int i, Set set, Location location, boolean z, int i2, zzblz zzblzVar, List list, boolean z2, int i3, String str) {
        Map map;
        String str2;
        Boolean bool;
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = zzblzVar;
        this.i = z2;
        this.k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.startsWith("custom:")) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.j;
                            str2 = split[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(split[2])) {
                            map = this.j;
                            str2 = split[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.h.add(str3);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzej.zzf().zza();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        zzblz zzblzVar = this.g;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzblzVar != null) {
            int i = zzblzVar.p;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        builder.setRequestCustomMuteThisAd(zzblzVar.v);
                        builder.setMediaAspectRatio(zzblzVar.w);
                    }
                    builder.setReturnUrlsForImageAssets(zzblzVar.q);
                    builder.setImageOrientation(zzblzVar.r);
                    builder.setRequestMultipleImages(zzblzVar.s);
                }
                zzfl zzflVar = zzblzVar.u;
                if (zzflVar != null) {
                    builder.setVideoOptions(new VideoOptions(zzflVar));
                }
            }
            builder.setAdChoicesPlacement(zzblzVar.t);
            builder.setReturnUrlsForImageAssets(zzblzVar.q);
            builder.setImageOrientation(zzblzVar.r);
            builder.setRequestMultipleImages(zzblzVar.s);
        }
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzblz.h(this.g);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzej.zzf().zzx();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.h.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.j;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.h.contains("3");
    }
}

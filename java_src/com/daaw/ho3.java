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

    /* renamed from: a */
    public final Date f12756a;

    /* renamed from: b */
    public final int f12757b;

    /* renamed from: c */
    public final Set f12758c;

    /* renamed from: d */
    public final boolean f12759d;

    /* renamed from: e */
    public final Location f12760e;

    /* renamed from: f */
    public final int f12761f;

    /* renamed from: g */
    public final zzblz f12762g;

    /* renamed from: i */
    public final boolean f12764i;

    /* renamed from: k */
    public final String f12766k;

    /* renamed from: h */
    public final List f12763h = new ArrayList();

    /* renamed from: j */
    public final Map f12765j = new HashMap();

    public ho3(Date date, int i, Set set, Location location, boolean z, int i2, zzblz zzblzVar, List list, boolean z2, int i3, String str) {
        Map map;
        String str2;
        Boolean bool;
        this.f12756a = date;
        this.f12757b = i;
        this.f12758c = set;
        this.f12760e = location;
        this.f12759d = z;
        this.f12761f = i2;
        this.f12762g = zzblzVar;
        this.f12764i = z2;
        this.f12766k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.startsWith("custom:")) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.f12765j;
                            str2 = split[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(split[2])) {
                            map = this.f12765j;
                            str2 = split[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.f12763h.add(str3);
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
        return this.f12756a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f12757b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f12758c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f12760e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        zzblz zzblzVar = this.f12762g;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzblzVar != null) {
            int i = zzblzVar.f36843p;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        builder.setRequestCustomMuteThisAd(zzblzVar.f36849v);
                        builder.setMediaAspectRatio(zzblzVar.f36850w);
                    }
                    builder.setReturnUrlsForImageAssets(zzblzVar.f36844q);
                    builder.setImageOrientation(zzblzVar.f36845r);
                    builder.setRequestMultipleImages(zzblzVar.f36846s);
                }
                zzfl zzflVar = zzblzVar.f36848u;
                if (zzflVar != null) {
                    builder.setVideoOptions(new VideoOptions(zzflVar));
                }
            }
            builder.setAdChoicesPlacement(zzblzVar.f36847t);
            builder.setReturnUrlsForImageAssets(zzblzVar.f36844q);
            builder.setImageOrientation(zzblzVar.f36845r);
            builder.setRequestMultipleImages(zzblzVar.f36846s);
        }
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzblz.m1105h(this.f12762g);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzej.zzf().zzx();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f12764i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f12759d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.f12763h.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f12761f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.f12765j;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.f12763h.contains("3");
    }
}

package com.daaw;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;
/* loaded from: classes.dex */
public final class vn3 implements MediationAdRequest {

    /* renamed from: a */
    public final Date f30349a;

    /* renamed from: b */
    public final int f30350b;

    /* renamed from: c */
    public final Set f30351c;

    /* renamed from: d */
    public final boolean f30352d;

    /* renamed from: e */
    public final Location f30353e;

    /* renamed from: f */
    public final int f30354f;

    /* renamed from: g */
    public final boolean f30355g;

    /* renamed from: h */
    public final String f30356h;

    public vn3(Date date, int i, Set set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f30349a = date;
        this.f30350b = i;
        this.f30351c = set;
        this.f30353e = location;
        this.f30352d = z;
        this.f30354f = i2;
        this.f30355g = z2;
        this.f30356h = str;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.f30349a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f30350b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f30351c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f30353e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f30355g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f30352d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f30354f;
    }
}

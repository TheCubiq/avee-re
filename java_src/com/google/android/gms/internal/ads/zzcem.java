package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ax3;
import com.daaw.z71;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzcem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcem> CREATOR = new ax3();

    /* renamed from: p */
    public final String f36981p;

    /* renamed from: q */
    public final String f36982q;

    /* renamed from: r */
    public final boolean f36983r;

    /* renamed from: s */
    public final boolean f36984s;

    /* renamed from: t */
    public final List f36985t;

    /* renamed from: u */
    public final boolean f36986u;

    /* renamed from: v */
    public final boolean f36987v;

    /* renamed from: w */
    public final List f36988w;

    public zzcem(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.f36981p = str;
        this.f36982q = str2;
        this.f36983r = z;
        this.f36984s = z2;
        this.f36985t = list;
        this.f36986u = z3;
        this.f36987v = z4;
        this.f36988w = list2 == null ? new ArrayList() : list2;
    }

    /* renamed from: h */
    public static zzcem m1094h(JSONObject jSONObject) {
        return new zzcem(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzbu.zzc(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzbu.zzc(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 2, this.f36981p, false);
        z71.m2717q(parcel, 3, this.f36982q, false);
        z71.m2731c(parcel, 4, this.f36983r);
        z71.m2731c(parcel, 5, this.f36984s);
        z71.m2715s(parcel, 6, this.f36985t, false);
        z71.m2731c(parcel, 7, this.f36986u);
        z71.m2731c(parcel, 8, this.f36987v);
        z71.m2715s(parcel, 9, this.f36988w, false);
        z71.m2732b(parcel, m2733a);
    }
}

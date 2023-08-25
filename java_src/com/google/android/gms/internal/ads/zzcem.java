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
    public final String p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final List t;
    public final boolean u;
    public final boolean v;
    public final List w;

    public zzcem(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.p = str;
        this.q = str2;
        this.r = z;
        this.s = z2;
        this.t = list;
        this.u = z3;
        this.v = z4;
        this.w = list2 == null ? new ArrayList() : list2;
    }

    public static zzcem h(JSONObject jSONObject) {
        return new zzcem(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzbu.zzc(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzbu.zzc(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 2, this.p, false);
        z71.q(parcel, 3, this.q, false);
        z71.c(parcel, 4, this.r);
        z71.c(parcel, 5, this.s);
        z71.s(parcel, 6, this.t, false);
        z71.c(parcel, 7, this.u);
        z71.c(parcel, 8, this.v);
        z71.s(parcel, 9, this.w, false);
        z71.b(parcel, a);
    }
}

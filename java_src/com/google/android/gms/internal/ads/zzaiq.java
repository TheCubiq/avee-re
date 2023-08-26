package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzaiq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaiq> CREATOR = new zzair();
    public final String zzcnd;
    public final String zzcne;
    public final boolean zzcnf;
    public final boolean zzcng;
    public final List<String> zzcnh;
    public final boolean zzcni;
    public final boolean zzcnj;
    public final List<String> zzcnk;

    public zzaiq(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.zzcnd = str;
        this.zzcne = str2;
        this.zzcnf = z;
        this.zzcng = z2;
        this.zzcnh = list;
        this.zzcni = z3;
        this.zzcnj = z4;
        this.zzcnk = list2 == null ? new ArrayList<>() : list2;
    }

    public static zzaiq zzo(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzaiq(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzamd.zza(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzamd.zza(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzcnd, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzcne, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzcnf);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzcng);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzcnh, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzcni);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzcnj);
        SafeParcelWriter.writeStringList(parcel, 9, this.zzcnk, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

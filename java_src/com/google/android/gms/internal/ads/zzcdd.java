package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ot0;
import com.daaw.qv3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class zzcdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdd> CREATOR = new qv3();

    /* renamed from: p */
    public final String f36977p;

    /* renamed from: q */
    public final int f36978q;

    public zzcdd(String str, int i) {
        this.f36977p = str;
        this.f36978q = i;
    }

    /* renamed from: h */
    public static zzcdd m1095h(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcdd(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcdd)) {
            zzcdd zzcddVar = (zzcdd) obj;
            if (ot0.m13981a(this.f36977p, zzcddVar.f36977p) && ot0.m13981a(Integer.valueOf(this.f36978q), Integer.valueOf(zzcddVar.f36978q))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ot0.m13980b(this.f36977p, Integer.valueOf(this.f36978q));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 2, this.f36977p, false);
        z71.m2723k(parcel, 3, this.f36978q);
        z71.m2732b(parcel, m2733a);
    }
}

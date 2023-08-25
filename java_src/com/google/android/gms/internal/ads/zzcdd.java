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
    public final String p;
    public final int q;

    public zzcdd(String str, int i) {
        this.p = str;
        this.q = i;
    }

    public static zzcdd h(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcdd(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcdd)) {
            zzcdd zzcddVar = (zzcdd) obj;
            if (ot0.a(this.p, zzcddVar.p) && ot0.a(Integer.valueOf(this.q), Integer.valueOf(zzcddVar.q))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ot0.b(this.p, Integer.valueOf(this.q));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 2, this.p, false);
        z71.k(parcel, 3, this.q);
        z71.b(parcel, a);
    }
}

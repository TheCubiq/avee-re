package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONArray;
import org.json.JSONException;
@zzadh
/* loaded from: classes2.dex */
public final class zzaig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaig> CREATOR = new zzaih();
    public final String type;
    public final int zzcmk;

    public zzaig(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public zzaig(String str, int i) {
        this.type = str;
        this.zzcmk = i;
    }

    public static zzaig zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzaig(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public static zzaig zzce(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return zza(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaig)) {
            zzaig zzaigVar = (zzaig) obj;
            if (Objects.equal(this.type, zzaigVar.type) && Objects.equal(Integer.valueOf(this.zzcmk), Integer.valueOf(zzaigVar.zzcmk))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.type, Integer.valueOf(this.zzcmk));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.type, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzcmk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

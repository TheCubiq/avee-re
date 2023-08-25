package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.cs2;
import com.daaw.jp2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzavc implements Comparator<zzavb>, Parcelable {
    public static final Parcelable.Creator<zzavc> CREATOR = new cs2();
    public final zzavb[] p;
    public int q;
    public final int r;

    public zzavc(Parcel parcel) {
        zzavb[] zzavbVarArr = (zzavb[]) parcel.createTypedArray(zzavb.CREATOR);
        this.p = zzavbVarArr;
        this.r = zzavbVarArr.length;
    }

    public zzavc(List list) {
        this(false, (zzavb[]) list.toArray(new zzavb[list.size()]));
    }

    public zzavc(boolean z, zzavb... zzavbVarArr) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        zzavbVarArr = z ? (zzavb[]) zzavbVarArr.clone() : zzavbVarArr;
        Arrays.sort(zzavbVarArr, this);
        int i = 1;
        while (true) {
            int length = zzavbVarArr.length;
            if (i >= length) {
                this.p = zzavbVarArr;
                this.r = length;
                return;
            }
            uuid = zzavbVarArr[i - 1].q;
            uuid2 = zzavbVarArr[i].q;
            if (uuid.equals(uuid2)) {
                uuid3 = zzavbVarArr[i].q;
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(uuid3)));
            }
            i++;
        }
    }

    public zzavc(zzavb... zzavbVarArr) {
        this(true, zzavbVarArr);
    }

    public final zzavb a(int i) {
        return this.p[i];
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzavb zzavbVar, zzavb zzavbVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        zzavb zzavbVar3 = zzavbVar;
        zzavb zzavbVar4 = zzavbVar2;
        UUID uuid5 = jp2.b;
        uuid = zzavbVar3.q;
        if (uuid5.equals(uuid)) {
            uuid4 = zzavbVar4.q;
            return !uuid5.equals(uuid4) ? 1 : 0;
        }
        uuid2 = zzavbVar3.q;
        uuid3 = zzavbVar4.q;
        return uuid2.compareTo(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzavc.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.p, ((zzavc) obj).p);
    }

    public final int hashCode() {
        int i = this.q;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.p);
            this.q = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.p, 0);
    }
}

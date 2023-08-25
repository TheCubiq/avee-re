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

    /* renamed from: p */
    public final zzavb[] f36805p;

    /* renamed from: q */
    public int f36806q;

    /* renamed from: r */
    public final int f36807r;

    public zzavc(Parcel parcel) {
        zzavb[] zzavbVarArr = (zzavb[]) parcel.createTypedArray(zzavb.CREATOR);
        this.f36805p = zzavbVarArr;
        this.f36807r = zzavbVarArr.length;
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
                this.f36805p = zzavbVarArr;
                this.f36807r = length;
                return;
            }
            uuid = zzavbVarArr[i - 1].f36801q;
            uuid2 = zzavbVarArr[i].f36801q;
            if (uuid.equals(uuid2)) {
                uuid3 = zzavbVarArr[i].f36801q;
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(uuid3)));
            }
            i++;
        }
    }

    public zzavc(zzavb... zzavbVarArr) {
        this(true, zzavbVarArr);
    }

    /* renamed from: a */
    public final zzavb m1118a(int i) {
        return this.f36805p[i];
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzavb zzavbVar, zzavb zzavbVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        zzavb zzavbVar3 = zzavbVar;
        zzavb zzavbVar4 = zzavbVar2;
        UUID uuid5 = jp2.f15306b;
        uuid = zzavbVar3.f36801q;
        if (uuid5.equals(uuid)) {
            uuid4 = zzavbVar4.f36801q;
            return !uuid5.equals(uuid4) ? 1 : 0;
        }
        uuid2 = zzavbVar3.f36801q;
        uuid3 = zzavbVar4.f36801q;
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
        return Arrays.equals(this.f36805p, ((zzavc) obj).f36805p);
    }

    public final int hashCode() {
        int i = this.f36806q;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f36805p);
            this.f36806q = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f36805p, 0);
    }
}

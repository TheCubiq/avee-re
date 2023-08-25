package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.dd;
import com.daaw.s6;
import com.daaw.sq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();
    public final SchemeData[] p;
    public int q;
    public final String r;
    public final int s;

    /* loaded from: classes.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();
        public int p;
        public final UUID q;
        public final String r;
        public final byte[] s;
        public final boolean t;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(Parcel parcel) {
            this.q = new UUID(parcel.readLong(), parcel.readLong());
            this.r = parcel.readString();
            this.s = parcel.createByteArray();
            this.t = parcel.readByte() != 0;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this.q = (UUID) s6.e(uuid);
            this.r = (String) s6.e(str);
            this.s = bArr;
            this.t = z;
        }

        public boolean b(SchemeData schemeData) {
            return c() && !schemeData.c() && g(schemeData.q);
        }

        public boolean c() {
            return this.s != null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SchemeData) {
                if (obj == this) {
                    return true;
                }
                SchemeData schemeData = (SchemeData) obj;
                return this.r.equals(schemeData.r) && sq1.b(this.q, schemeData.q) && Arrays.equals(this.s, schemeData.s);
            }
            return false;
        }

        public boolean g(UUID uuid) {
            return dd.b.equals(this.q) || uuid.equals(this.q);
        }

        public int hashCode() {
            if (this.p == 0) {
                this.p = (((this.q.hashCode() * 31) + this.r.hashCode()) * 31) + Arrays.hashCode(this.s);
            }
            return this.p;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.q.getMostSignificantBits());
            parcel.writeLong(this.q.getLeastSignificantBits());
            parcel.writeString(this.r);
            parcel.writeByteArray(this.s);
            parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(Parcel parcel) {
        this.r = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.p = schemeDataArr;
        this.s = schemeDataArr.length;
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.r = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        Arrays.sort(schemeDataArr, this);
        this.p = schemeDataArr;
        this.s = schemeDataArr.length;
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public static boolean b(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).q.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static DrmInitData g(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        SchemeData[] schemeDataArr;
        SchemeData[] schemeDataArr2;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.r;
            for (SchemeData schemeData : drmInitData.p) {
                if (schemeData.c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.r;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.p) {
                if (schemeData2.c() && !b(arrayList, size, schemeData2.q)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = dd.b;
        return uuid.equals(schemeData.q) ? uuid.equals(schemeData2.q) ? 0 : 1 : schemeData.q.compareTo(schemeData2.q);
    }

    public DrmInitData c(String str) {
        return sq1.b(this.r, str) ? this : new DrmInitData(str, false, this.p);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return sq1.b(this.r, drmInitData.r) && Arrays.equals(this.p, drmInitData.p);
    }

    public SchemeData h(int i) {
        return this.p[i];
    }

    public int hashCode() {
        if (this.q == 0) {
            String str = this.r;
            this.q = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.p);
        }
        return this.q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.r);
        parcel.writeTypedArray(this.p, 0);
    }
}

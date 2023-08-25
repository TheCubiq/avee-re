package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C1075dd;
import com.daaw.C2914s6;
import com.daaw.sq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C3922a();

    /* renamed from: p */
    public final SchemeData[] f35727p;

    /* renamed from: q */
    public int f35728q;

    /* renamed from: r */
    public final String f35729r;

    /* renamed from: s */
    public final int f35730s;

    /* loaded from: classes.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C3921a();

        /* renamed from: p */
        public int f35731p;

        /* renamed from: q */
        public final UUID f35732q;

        /* renamed from: r */
        public final String f35733r;

        /* renamed from: s */
        public final byte[] f35734s;

        /* renamed from: t */
        public final boolean f35735t;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$a */
        /* loaded from: classes.dex */
        public static class C3921a implements Parcelable.Creator<SchemeData> {
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
            this.f35732q = new UUID(parcel.readLong(), parcel.readLong());
            this.f35733r = parcel.readString();
            this.f35734s = parcel.createByteArray();
            this.f35735t = parcel.readByte() != 0;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f35732q = (UUID) C2914s6.m10686e(uuid);
            this.f35733r = (String) C2914s6.m10686e(str);
            this.f35734s = bArr;
            this.f35735t = z;
        }

        /* renamed from: b */
        public boolean m1708b(SchemeData schemeData) {
            return m1707c() && !schemeData.m1707c() && m1706g(schemeData.f35732q);
        }

        /* renamed from: c */
        public boolean m1707c() {
            return this.f35734s != null;
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
                return this.f35733r.equals(schemeData.f35733r) && sq1.m10016b(this.f35732q, schemeData.f35732q) && Arrays.equals(this.f35734s, schemeData.f35734s);
            }
            return false;
        }

        /* renamed from: g */
        public boolean m1706g(UUID uuid) {
            return C1075dd.f6942b.equals(this.f35732q) || uuid.equals(this.f35732q);
        }

        public int hashCode() {
            if (this.f35731p == 0) {
                this.f35731p = (((this.f35732q.hashCode() * 31) + this.f35733r.hashCode()) * 31) + Arrays.hashCode(this.f35734s);
            }
            return this.f35731p;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f35732q.getMostSignificantBits());
            parcel.writeLong(this.f35732q.getLeastSignificantBits());
            parcel.writeString(this.f35733r);
            parcel.writeByteArray(this.f35734s);
            parcel.writeByte(this.f35735t ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$a */
    /* loaded from: classes.dex */
    public static class C3922a implements Parcelable.Creator<DrmInitData> {
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
        this.f35729r = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.f35727p = schemeDataArr;
        this.f35730s = schemeDataArr.length;
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.f35729r = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        Arrays.sort(schemeDataArr, this);
        this.f35727p = schemeDataArr;
        this.f35730s = schemeDataArr.length;
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

    /* renamed from: b */
    public static boolean m1713b(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f35732q.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static DrmInitData m1711g(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        SchemeData[] schemeDataArr;
        SchemeData[] schemeDataArr2;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f35729r;
            for (SchemeData schemeData : drmInitData.f35727p) {
                if (schemeData.m1707c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f35729r;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f35727p) {
                if (schemeData2.m1707c() && !m1713b(arrayList, size, schemeData2.f35732q)) {
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
        UUID uuid = C1075dd.f6942b;
        return uuid.equals(schemeData.f35732q) ? uuid.equals(schemeData2.f35732q) ? 0 : 1 : schemeData.f35732q.compareTo(schemeData2.f35732q);
    }

    /* renamed from: c */
    public DrmInitData m1712c(String str) {
        return sq1.m10016b(this.f35729r, str) ? this : new DrmInitData(str, false, this.f35727p);
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
        return sq1.m10016b(this.f35729r, drmInitData.f35729r) && Arrays.equals(this.f35727p, drmInitData.f35727p);
    }

    /* renamed from: h */
    public SchemeData m1710h(int i) {
        return this.f35727p[i];
    }

    public int hashCode() {
        if (this.f35728q == 0) {
            String str = this.f35729r;
            this.f35728q = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f35727p);
        }
        return this.f35728q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35729r);
        parcel.writeTypedArray(this.f35727p, 0);
    }
}

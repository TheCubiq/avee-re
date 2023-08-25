package android.support.p000v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0013a();

    /* renamed from: p */
    public int f39p;

    /* renamed from: q */
    public int f40q;

    /* renamed from: r */
    public int f41r;

    /* renamed from: s */
    public int f42s;

    /* renamed from: t */
    public int f43t;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    public static class C0013a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f39p = parcel.readInt();
        this.f41r = parcel.readInt();
        this.f42s = parcel.readInt();
        this.f43t = parcel.readInt();
        this.f40q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f39p);
        parcel.writeInt(this.f41r);
        parcel.writeInt(this.f42s);
        parcel.writeInt(this.f43t);
        parcel.writeInt(this.f40q);
    }
}

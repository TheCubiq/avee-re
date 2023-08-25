package android.support.p000v4.media;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: classes3.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0004a();

    /* renamed from: p */
    public final int f25p;

    /* renamed from: q */
    public final float f26q;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    /* loaded from: classes3.dex */
    public static class C0004a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f25p = i;
        this.f26q = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f25p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f25p);
        sb.append(" rating=");
        float f = this.f26q;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25p);
        parcel.writeFloat(this.f26q);
    }
}

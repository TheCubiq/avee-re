package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
/* loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C3951a();

    /* renamed from: q */
    public final String f35807q;

    /* renamed from: r */
    public final String f35808r;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$a */
    /* loaded from: classes.dex */
    public static class C3951a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.f35807q = parcel.readString();
        this.f35808r = parcel.readString();
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f35807q = str2;
        this.f35808r = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f35802p.equals(urlLinkFrame.f35802p) && sq1.m10016b(this.f35807q, urlLinkFrame.f35807q) && sq1.m10016b(this.f35808r, urlLinkFrame.f35808r);
    }

    public int hashCode() {
        int hashCode = (527 + this.f35802p.hashCode()) * 31;
        String str = this.f35807q;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35808r;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f35802p + ": url=" + this.f35808r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35802p);
        parcel.writeString(this.f35807q);
        parcel.writeString(this.f35808r);
    }
}

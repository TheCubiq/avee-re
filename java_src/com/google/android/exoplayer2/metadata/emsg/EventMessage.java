package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final long t;
    public final byte[] u;
    public int v;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(Parcel parcel) {
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.s = parcel.readLong();
        this.r = parcel.readLong();
        this.t = parcel.readLong();
        this.u = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.p = str;
        this.q = str2;
        this.r = j;
        this.t = j2;
        this.u = bArr;
        this.s = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.s == eventMessage.s && this.r == eventMessage.r && this.t == eventMessage.t && sq1.b(this.p, eventMessage.p) && sq1.b(this.q, eventMessage.q) && Arrays.equals(this.u, eventMessage.u);
    }

    public int hashCode() {
        if (this.v == 0) {
            String str = this.p;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.q;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.s;
            long j2 = this.r;
            long j3 = this.t;
            this.v = ((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.u);
        }
        return this.v;
    }

    public String toString() {
        return "EMSG: scheme=" + this.p + ", id=" + this.t + ", value=" + this.q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeLong(this.s);
        parcel.writeLong(this.r);
        parcel.writeLong(this.t);
        parcel.writeByteArray(this.u);
    }
}

package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new C3942a();

    /* renamed from: p */
    public final String f35772p;

    /* renamed from: q */
    public final String f35773q;

    /* renamed from: r */
    public final long f35774r;

    /* renamed from: s */
    public final long f35775s;

    /* renamed from: t */
    public final long f35776t;

    /* renamed from: u */
    public final byte[] f35777u;

    /* renamed from: v */
    public int f35778v;

    /* renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage$a */
    /* loaded from: classes.dex */
    public static class C3942a implements Parcelable.Creator<EventMessage> {
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
        this.f35772p = parcel.readString();
        this.f35773q = parcel.readString();
        this.f35775s = parcel.readLong();
        this.f35774r = parcel.readLong();
        this.f35776t = parcel.readLong();
        this.f35777u = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.f35772p = str;
        this.f35773q = str2;
        this.f35774r = j;
        this.f35776t = j2;
        this.f35777u = bArr;
        this.f35775s = j3;
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
        return this.f35775s == eventMessage.f35775s && this.f35774r == eventMessage.f35774r && this.f35776t == eventMessage.f35776t && sq1.m10016b(this.f35772p, eventMessage.f35772p) && sq1.m10016b(this.f35773q, eventMessage.f35773q) && Arrays.equals(this.f35777u, eventMessage.f35777u);
    }

    public int hashCode() {
        if (this.f35778v == 0) {
            String str = this.f35772p;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f35773q;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f35775s;
            long j2 = this.f35774r;
            long j3 = this.f35776t;
            this.f35778v = ((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f35777u);
        }
        return this.f35778v;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f35772p + ", id=" + this.f35776t + ", value=" + this.f35773q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35772p);
        parcel.writeString(this.f35773q);
        parcel.writeLong(this.f35775s);
        parcel.writeLong(this.f35774r);
        parcel.writeLong(this.f35776t);
        parcel.writeByteArray(this.f35777u);
    }
}

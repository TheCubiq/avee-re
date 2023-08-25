package com.google.android.exoplayer2.metadata.id3;

import com.daaw.C2914s6;
import com.google.android.exoplayer2.metadata.Metadata;
/* loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: p */
    public final String f35802p;

    public Id3Frame(String str) {
        this.f35802p = (String) C2914s6.m10686e(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f35802p;
    }
}

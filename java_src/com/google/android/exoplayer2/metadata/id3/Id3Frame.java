package com.google.android.exoplayer2.metadata.id3;

import com.daaw.s6;
import com.google.android.exoplayer2.metadata.Metadata;
/* loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String p;

    public Id3Frame(String str) {
        this.p = (String) s6.e(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.p;
    }
}

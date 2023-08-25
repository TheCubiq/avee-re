package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes.dex */
public abstract class zzaxu implements zzaxn {
    public final String p;

    public zzaxu(String str) {
        Objects.requireNonNull(str);
        this.p = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}

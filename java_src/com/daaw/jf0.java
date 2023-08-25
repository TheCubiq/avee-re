package com.daaw;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
/* loaded from: classes.dex */
public class jf0 {
    public final InputStream a;
    public final ParcelFileDescriptor b;

    public jf0(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = inputStream;
        this.b = parcelFileDescriptor;
    }

    public ParcelFileDescriptor a() {
        return this.b;
    }

    public InputStream b() {
        return this.a;
    }
}

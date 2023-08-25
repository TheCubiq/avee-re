package com.daaw;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
/* loaded from: classes.dex */
public class jf0 {

    /* renamed from: a */
    public final InputStream f15069a;

    /* renamed from: b */
    public final ParcelFileDescriptor f15070b;

    public jf0(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f15069a = inputStream;
        this.f15070b = parcelFileDescriptor;
    }

    /* renamed from: a */
    public ParcelFileDescriptor m18541a() {
        return this.f15070b;
    }

    /* renamed from: b */
    public InputStream m18540b() {
        return this.f15069a;
    }
}

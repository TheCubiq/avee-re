package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {
    public final int p;

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.p = i;
    }
}

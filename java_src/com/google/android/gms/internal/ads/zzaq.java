package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzaq {
    private final int zzce;
    private final List<zzl> zzcf;
    private final int zzcg;
    private final InputStream zzch;

    public zzaq(int i, List<zzl> list) {
        this(i, list, -1, null);
    }

    public zzaq(int i, List<zzl> list, int i2, InputStream inputStream) {
        this.zzce = i;
        this.zzcf = list;
        this.zzcg = i2;
        this.zzch = inputStream;
    }

    public final InputStream getContent() {
        return this.zzch;
    }

    public final int getContentLength() {
        return this.zzcg;
    }

    public final int getStatusCode() {
        return this.zzce;
    }

    public final List<zzl> zzq() {
        return Collections.unmodifiableList(this.zzcf);
    }
}

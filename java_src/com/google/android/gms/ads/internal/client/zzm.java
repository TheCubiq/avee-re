package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzm {

    /* renamed from: a */
    public Bundle f36193a = new Bundle();

    /* renamed from: b */
    public List f36194b = new ArrayList();

    /* renamed from: c */
    public boolean f36195c = false;

    /* renamed from: d */
    public int f36196d = -1;

    /* renamed from: e */
    public final Bundle f36197e = new Bundle();

    /* renamed from: f */
    public final Bundle f36198f = new Bundle();

    /* renamed from: g */
    public final List f36199g = new ArrayList();

    /* renamed from: h */
    public int f36200h = -1;

    /* renamed from: i */
    public String f36201i = null;

    /* renamed from: j */
    public final List f36202j = new ArrayList();

    /* renamed from: k */
    public int f36203k = 60000;

    public final zzl zza() {
        return new zzl(8, -1L, this.f36193a, -1, this.f36194b, this.f36195c, this.f36196d, false, null, null, null, null, this.f36197e, this.f36198f, this.f36199g, null, null, false, null, this.f36200h, this.f36201i, this.f36202j, this.f36203k, null);
    }

    public final zzm zzb(Bundle bundle) {
        this.f36193a = bundle;
        return this;
    }

    public final zzm zzc(int i) {
        this.f36203k = i;
        return this;
    }

    public final zzm zzd(boolean z) {
        this.f36195c = z;
        return this;
    }

    public final zzm zze(List list) {
        this.f36194b = list;
        return this;
    }

    public final zzm zzf(String str) {
        this.f36201i = str;
        return this;
    }

    public final zzm zzg(int i) {
        this.f36196d = i;
        return this;
    }

    public final zzm zzh(int i) {
        this.f36200h = i;
        return this;
    }
}

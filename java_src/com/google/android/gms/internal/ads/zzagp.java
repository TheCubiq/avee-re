package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;
@zzadh
/* loaded from: classes2.dex */
public final class zzagp extends zzagv {
    private final String zzclb;
    private final int zzclc;

    public zzagp(String str, int i) {
        this.zzclb = str;
        this.zzclc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzagp)) {
            zzagp zzagpVar = (zzagp) obj;
            if (Objects.equal(this.zzclb, zzagpVar.zzclb) && Objects.equal(Integer.valueOf(this.zzclc), Integer.valueOf(zzagpVar.zzclc))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final int getAmount() {
        return this.zzclc;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final String getType() {
        return this.zzclb;
    }
}

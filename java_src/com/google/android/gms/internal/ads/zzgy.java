package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzgy {
    final long value;
    final String zzajf;
    final int zzajg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgy(long j, String str, int i) {
        this.value = j;
        this.zzajf = str;
        this.zzajg = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzgy)) {
            zzgy zzgyVar = (zzgy) obj;
            if (zzgyVar.value == this.value && zzgyVar.zzajg == this.zzajg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.value;
    }
}

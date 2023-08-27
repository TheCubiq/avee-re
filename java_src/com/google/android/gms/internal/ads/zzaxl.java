package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public enum zzaxl implements zzbbr {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private static final zzbbs<zzaxl> zzall = new zzbbs<zzaxl>() { // from class: com.google.android.gms.internal.ads.zzaxm
        @Override // com.google.android.gms.internal.ads.zzbbs
        public final /* synthetic */ zzaxl zzq(int i) {
            return zzaxl.zzax(i);
        }
    };
    private final int value;

    zzaxl(int i) {
        this.value = i;
    }

    public static zzaxl zzax(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

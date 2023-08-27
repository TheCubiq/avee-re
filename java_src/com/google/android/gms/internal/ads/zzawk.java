package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public enum zzawk implements zzbbr {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    
    private static final zzbbs<zzawk> zzall = new zzbbs<zzawk>() { // from class: com.google.android.gms.internal.ads.zzawl
        @Override // com.google.android.gms.internal.ads.zzbbs
        public final /* synthetic */ zzawk zzq(int i) {
            return zzawk.zzaq(i);
        }
    };
    private final int value;

    zzawk(int i) {
        this.value = i;
    }

    public static zzawk zzaq(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return COMPRESSED;
            }
            return UNCOMPRESSED;
        }
        return UNKNOWN_FORMAT;
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

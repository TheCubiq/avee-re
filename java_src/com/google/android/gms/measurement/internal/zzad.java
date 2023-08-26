package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzad {
    public static final zzad zza = new zzad(null, null);
    private final Boolean zzb;
    private final Boolean zzc;

    public zzad(Boolean bool, Boolean bool2) {
        this.zzb = bool;
        this.zzc = bool2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(int i, int i2) {
        return i <= i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzad) {
            zzad zzadVar = (zzad) obj;
            return zza(this.zzb) == zza(zzadVar.zzb) && zza(this.zzc) == zza(zzadVar.zzc);
        }
        return false;
    }

    private static int zza(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public final int hashCode() {
        return ((zza(this.zzb) + 527) * 31) + zza(this.zzc);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.zzb;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool.booleanValue() ? "granted" : "denied");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.zzc;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }

    public static String zza(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string == null || zzb(string) != null) {
            String string2 = bundle.getString("analytics_storage");
            if (string2 == null || zzb(string2) != null) {
                return null;
            }
            return string2;
        }
        return string;
    }

    public static zzad zzb(Bundle bundle) {
        if (bundle == null) {
            return zza;
        }
        return new zzad(zzb(bundle.getString("ad_storage")), zzb(bundle.getString("analytics_storage")));
    }

    public static zzad zza(String str) {
        Boolean bool;
        if (str != null) {
            Boolean zza2 = str.length() >= 3 ? zza(str.charAt(2)) : null;
            bool = str.length() >= 4 ? zza(str.charAt(3)) : null;
            r0 = zza2;
        } else {
            bool = null;
        }
        return new zzad(r0, bool);
    }

    private static Boolean zzb(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static Boolean zza(char c) {
        if (c != '0') {
            if (c != '1') {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private static char zzb(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public final String zza() {
        return "G1" + zzb(this.zzb) + zzb(this.zzc);
    }

    public final Boolean zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        Boolean bool = this.zzb;
        return bool == null || bool.booleanValue();
    }

    public final Boolean zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        Boolean bool = this.zzc;
        return bool == null || bool.booleanValue();
    }

    public final boolean zza(zzad zzadVar) {
        if (this.zzb != Boolean.FALSE || zzadVar.zzb == Boolean.FALSE) {
            return this.zzc == Boolean.FALSE && zzadVar.zzc != Boolean.FALSE;
        }
        return true;
    }

    private static Boolean zza(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return (bool2 == null || bool2.booleanValue()) ? null : false;
        } else if (bool.booleanValue()) {
            return bool2;
        } else {
            return false;
        }
    }

    public final zzad zzb(zzad zzadVar) {
        return new zzad(zza(this.zzb, zzadVar.zzb), zza(this.zzc, zzadVar.zzc));
    }

    public final zzad zzc(zzad zzadVar) {
        Boolean bool = this.zzb;
        if (bool == null) {
            bool = zzadVar.zzb;
        }
        Boolean bool2 = this.zzc;
        if (bool2 == null) {
            bool2 = zzadVar.zzc;
        }
        return new zzad(bool, bool2);
    }
}

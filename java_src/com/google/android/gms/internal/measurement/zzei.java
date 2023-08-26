package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzei {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 != null) {
        } else {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }
}

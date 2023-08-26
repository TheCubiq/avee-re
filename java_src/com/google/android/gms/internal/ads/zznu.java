package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* loaded from: classes2.dex */
final class zznu extends zznr {
    private static String zzam(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final String zzd(String str, String str2) {
        String zzam = zzam(str);
        String zzam2 = zzam(str2);
        if (TextUtils.isEmpty(zzam)) {
            return zzam2;
        }
        if (TextUtils.isEmpty(zzam2)) {
            return zzam;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzam).length() + 1 + String.valueOf(zzam2).length());
        sb.append(zzam);
        sb.append(",");
        sb.append(zzam2);
        return sb.toString();
    }
}

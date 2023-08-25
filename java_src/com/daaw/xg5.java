package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class xg5 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final uf5 a;

    public xg5(uf5 uf5Var) {
        this.a = uf5Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        ry0.j(strArr);
        ry0.j(strArr2);
        ry0.j(atomicReference);
        ry0.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String b2 = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (b2 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(b2);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (this.a.zza()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bundle[{");
            for (String str : bundle.keySet()) {
                if (sb.length() != 8) {
                    sb.append(", ");
                }
                sb.append(e(str));
                sb.append("=");
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
            sb.append("}]");
            return sb.toString();
        }
        return bundle.toString();
    }

    public final String c(zzaw zzawVar) {
        if (this.a.zza()) {
            StringBuilder sb = new StringBuilder();
            sb.append("origin=");
            sb.append(zzawVar.r);
            sb.append(",name=");
            sb.append(d(zzawVar.p));
            sb.append(",params=");
            zzau zzauVar = zzawVar.q;
            sb.append(zzauVar == null ? null : !this.a.zza() ? zzauVar.toString() : b(zzauVar.q()));
            return sb.toString();
        }
        return zzawVar.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.zza() ? str : g(str, dh7.c, dh7.a, b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.zza() ? str : g(str, gi7.b, gi7.a, c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.zza()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return g(str, jj7.b, jj7.a, d);
        }
        return str;
    }
}

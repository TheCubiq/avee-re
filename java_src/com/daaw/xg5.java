package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class xg5 {

    /* renamed from: b */
    public static final AtomicReference f32702b = new AtomicReference();

    /* renamed from: c */
    public static final AtomicReference f32703c = new AtomicReference();

    /* renamed from: d */
    public static final AtomicReference f32704d = new AtomicReference();

    /* renamed from: a */
    public final uf5 f32705a;

    public xg5(uf5 uf5Var) {
        this.f32705a = uf5Var;
    }

    /* renamed from: g */
    public static final String m5130g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        ry0.m10830j(strArr);
        ry0.m10830j(strArr2);
        ry0.m10830j(atomicReference);
        ry0.m10839a(strArr.length == strArr2.length);
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

    /* renamed from: a */
    public final String m5136a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String m5135b = obj instanceof Bundle ? m5135b((Bundle) obj) : String.valueOf(obj);
            if (m5135b != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(m5135b);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final String m5135b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (this.f32705a.zza()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bundle[{");
            for (String str : bundle.keySet()) {
                if (sb.length() != 8) {
                    sb.append(", ");
                }
                sb.append(m5132e(str));
                sb.append("=");
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? m5136a(new Object[]{obj}) : obj instanceof Object[] ? m5136a((Object[]) obj) : obj instanceof ArrayList ? m5136a(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
            sb.append("}]");
            return sb.toString();
        }
        return bundle.toString();
    }

    /* renamed from: c */
    public final String m5134c(zzaw zzawVar) {
        if (this.f32705a.zza()) {
            StringBuilder sb = new StringBuilder();
            sb.append("origin=");
            sb.append(zzawVar.f37070r);
            sb.append(",name=");
            sb.append(m5133d(zzawVar.f37068p));
            sb.append(",params=");
            zzau zzauVar = zzawVar.f37069q;
            sb.append(zzauVar == null ? null : !this.f32705a.zza() ? zzauVar.toString() : m5135b(zzauVar.m1078q()));
            return sb.toString();
        }
        return zzawVar.toString();
    }

    /* renamed from: d */
    public final String m5133d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f32705a.zza() ? str : m5130g(str, dh7.f7093c, dh7.f7091a, f32702b);
    }

    /* renamed from: e */
    public final String m5132e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f32705a.zza() ? str : m5130g(str, gi7.f11334b, gi7.f11333a, f32703c);
    }

    /* renamed from: f */
    public final String m5131f(String str) {
        if (str == null) {
            return null;
        }
        if (this.f32705a.zza()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return m5130g(str, jj7.f15138b, jj7.f15137a, f32704d);
        }
        return str;
    }
}

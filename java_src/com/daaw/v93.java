package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class v93 {
    public final List a = new LinkedList();
    public final Map b;
    public final Object c;

    public v93(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final s93 f() {
        return new s93(zzt.zzB().b(), null, null);
    }

    public final u93 a() {
        u93 u93Var;
        boolean booleanValue = ((Boolean) zzba.zzc().b(g93.F1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.c) {
            for (s93 s93Var : this.a) {
                long a = s93Var.a();
                String c = s93Var.c();
                s93 b = s93Var.b();
                if (b != null && a > 0) {
                    sb.append(c);
                    sb.append('.');
                    sb.append(a - b.a());
                    sb.append(',');
                    if (booleanValue) {
                        if (hashMap.containsKey(Long.valueOf(b.a()))) {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b.a()));
                            sb2.append('+');
                            sb2.append(c);
                        } else {
                            hashMap.put(Long.valueOf(b.a()), new StringBuilder(c));
                        }
                    }
                }
            }
            this.a.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(zzt.zzB().a() + (((Long) entry.getKey()).longValue() - zzt.zzB().b()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            u93Var = new u93(sb.toString(), str);
        }
        return u93Var;
    }

    public final Map b() {
        Map map;
        synchronized (this.c) {
            zzt.zzo().f();
            map = this.b;
        }
        return map;
    }

    public final void c(v93 v93Var) {
        synchronized (this.c) {
        }
    }

    public final void d(String str, String str2) {
        l93 f;
        if (TextUtils.isEmpty(str2) || (f = zzt.zzo().f()) == null) {
            return;
        }
        synchronized (this.c) {
            r93 a = f.a(str);
            Map map = this.b;
            map.put(str, a.a((String) map.get(str), str2));
        }
    }

    public final boolean e(s93 s93Var, long j, String... strArr) {
        synchronized (this.c) {
            for (int i = 0; i <= 0; i++) {
                this.a.add(new s93(j, strArr[i], s93Var));
            }
        }
        return true;
    }
}

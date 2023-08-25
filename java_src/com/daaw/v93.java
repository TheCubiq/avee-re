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

    /* renamed from: a */
    public final List f30053a = new LinkedList();

    /* renamed from: b */
    public final Map f30054b;

    /* renamed from: c */
    public final Object f30055c;

    public v93(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f30054b = linkedHashMap;
        this.f30055c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    /* renamed from: f */
    public static final s93 m7312f() {
        return new s93(zzt.zzB().mo15859b(), null, null);
    }

    /* renamed from: a */
    public final u93 m7317a() {
        u93 u93Var;
        boolean booleanValue = ((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f30055c) {
            for (s93 s93Var : this.f30053a) {
                long m10500a = s93Var.m10500a();
                String m10498c = s93Var.m10498c();
                s93 m10499b = s93Var.m10499b();
                if (m10499b != null && m10500a > 0) {
                    sb.append(m10498c);
                    sb.append('.');
                    sb.append(m10500a - m10499b.m10500a());
                    sb.append(',');
                    if (booleanValue) {
                        if (hashMap.containsKey(Long.valueOf(m10499b.m10500a()))) {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(m10499b.m10500a()));
                            sb2.append('+');
                            sb2.append(m10498c);
                        } else {
                            hashMap.put(Long.valueOf(m10499b.m10500a()), new StringBuilder(m10498c));
                        }
                    }
                }
            }
            this.f30053a.clear();
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
                    sb3.append(zzt.zzB().mo15860a() + (((Long) entry.getKey()).longValue() - zzt.zzB().mo15859b()));
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

    /* renamed from: b */
    public final Map m7316b() {
        Map map;
        synchronized (this.f30055c) {
            zzt.zzo().m11917f();
            map = this.f30054b;
        }
        return map;
    }

    /* renamed from: c */
    public final void m7315c(v93 v93Var) {
        synchronized (this.f30055c) {
        }
    }

    /* renamed from: d */
    public final void m7314d(String str, String str2) {
        l93 m11917f;
        if (TextUtils.isEmpty(str2) || (m11917f = zzt.zzo().m11917f()) == null) {
            return;
        }
        synchronized (this.f30055c) {
            r93 m17086a = m11917f.m17086a(str);
            Map map = this.f30054b;
            map.put(str, m17086a.mo11550a((String) map.get(str), str2));
        }
    }

    /* renamed from: e */
    public final boolean m7313e(s93 s93Var, long j, String... strArr) {
        synchronized (this.f30055c) {
            for (int i = 0; i <= 0; i++) {
                this.f30053a.add(new s93(j, strArr[i], s93Var));
            }
        }
        return true;
    }
}

package com.daaw;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zi0 implements ra0 {

    /* renamed from: c */
    public final Map<String, List<yi0>> f35108c;

    /* renamed from: d */
    public volatile Map<String, String> f35109d;

    /* renamed from: com.daaw.zi0$a */
    /* loaded from: classes.dex */
    public static final class C3843a {

        /* renamed from: e */
        public static final String f35110e;

        /* renamed from: f */
        public static final Map<String, List<yi0>> f35111f;

        /* renamed from: a */
        public boolean f35112a = true;

        /* renamed from: b */
        public Map<String, List<yi0>> f35113b = f35111f;

        /* renamed from: c */
        public boolean f35114c = true;

        /* renamed from: d */
        public boolean f35115d = true;

        static {
            String property = System.getProperty("http.agent");
            f35110e = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new C3844b(property)));
            }
            hashMap.put("Accept-Encoding", Collections.singletonList(new C3844b("identity")));
            f35111f = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: a */
        public zi0 m2281a() {
            this.f35112a = true;
            return new zi0(this.f35113b);
        }
    }

    /* renamed from: com.daaw.zi0$b */
    /* loaded from: classes.dex */
    public static final class C3844b implements yi0 {

        /* renamed from: a */
        public final String f35116a;

        public C3844b(String str) {
            this.f35116a = str;
        }

        @Override // com.daaw.yi0
        /* renamed from: a */
        public String mo2280a() {
            return this.f35116a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3844b) {
                return this.f35116a.equals(((C3844b) obj).f35116a);
            }
            return false;
        }

        public int hashCode() {
            return this.f35116a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f35116a + "'}";
        }
    }

    public zi0(Map<String, List<yi0>> map) {
        this.f35108c = Collections.unmodifiableMap(map);
    }

    @Override // com.daaw.ra0
    /* renamed from: a */
    public Map<String, String> mo2283a() {
        if (this.f35109d == null) {
            synchronized (this) {
                if (this.f35109d == null) {
                    this.f35109d = Collections.unmodifiableMap(m2282b());
                }
            }
        }
        return this.f35109d;
    }

    /* renamed from: b */
    public final Map<String, String> m2282b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<yi0>> entry : this.f35108c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List<yi0> value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                sb.append(value.get(i).mo2280a());
                if (i != value.size() - 1) {
                    sb.append(',');
                }
            }
            hashMap.put(entry.getKey(), sb.toString());
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof zi0) {
            return this.f35108c.equals(((zi0) obj).f35108c);
        }
        return false;
    }

    public int hashCode() {
        return this.f35108c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f35108c + '}';
    }
}

package com.daaw;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zi0 implements ra0 {
    public final Map<String, List<yi0>> c;
    public volatile Map<String, String> d;

    /* loaded from: classes.dex */
    public static final class a {
        public static final String e;
        public static final Map<String, List<yi0>> f;
        public boolean a = true;
        public Map<String, List<yi0>> b = f;
        public boolean c = true;
        public boolean d = true;

        static {
            String property = System.getProperty("http.agent");
            e = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            hashMap.put("Accept-Encoding", Collections.singletonList(new b("identity")));
            f = Collections.unmodifiableMap(hashMap);
        }

        public zi0 a() {
            this.a = true;
            return new zi0(this.b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements yi0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.daaw.yi0
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }
    }

    public zi0(Map<String, List<yi0>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    @Override // com.daaw.ra0
    public Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.d;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<yi0>> entry : this.c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List<yi0> value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                sb.append(value.get(i).a());
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
            return this.c.equals(((zi0) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.c + '}';
    }
}

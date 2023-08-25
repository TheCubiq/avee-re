package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
@TargetApi(19)
/* loaded from: classes.dex */
public class rd1 implements xl0 {

    /* renamed from: d */
    public static final Bitmap.Config[] f25152d = {Bitmap.Config.ARGB_8888, null};

    /* renamed from: e */
    public static final Bitmap.Config[] f25153e = {Bitmap.Config.RGB_565};

    /* renamed from: f */
    public static final Bitmap.Config[] f25154f = {Bitmap.Config.ARGB_4444};

    /* renamed from: g */
    public static final Bitmap.Config[] f25155g = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    public final C2853c f25156a = new C2853c();

    /* renamed from: b */
    public final i80<C2852b, Bitmap> f25157b = new i80<>();

    /* renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f25158c = new HashMap();

    /* renamed from: com.daaw.rd1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2851a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25159a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f25159a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25159a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25159a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25159a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.daaw.rd1$b */
    /* loaded from: classes.dex */
    public static final class C2852b implements ay0 {

        /* renamed from: a */
        public final C2853c f25160a;

        /* renamed from: b */
        public int f25161b;

        /* renamed from: c */
        public Bitmap.Config f25162c;

        public C2852b(C2853c c2853c) {
            this.f25160a = c2853c;
        }

        @Override // com.daaw.ay0
        /* renamed from: a */
        public void mo11401a() {
            this.f25160a.m11547c(this);
        }

        /* renamed from: c */
        public void m11399c(int i, Bitmap.Config config) {
            this.f25161b = i;
            this.f25162c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2852b) {
                C2852b c2852b = (C2852b) obj;
                if (this.f25161b == c2852b.f25161b) {
                    Bitmap.Config config = this.f25162c;
                    Bitmap.Config config2 = c2852b.f25162c;
                    if (config == null) {
                        if (config2 != null) {
                            return false;
                        }
                    } else if (!config.equals(config2)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f25161b * 31;
            Bitmap.Config config = this.f25162c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return rd1.m11404j(this.f25161b, this.f25162c);
        }
    }

    /* renamed from: com.daaw.rd1$c */
    /* loaded from: classes.dex */
    public static class C2853c extends AbstractC2840ra<C2852b> {
        @Override // com.daaw.AbstractC2840ra
        /* renamed from: d */
        public C2852b mo11398a() {
            return new C2852b(this);
        }

        /* renamed from: e */
        public C2852b m11396e(int i, Bitmap.Config config) {
            C2852b m11548b = m11548b();
            m11548b.m11399c(i, config);
            return m11548b;
        }
    }

    /* renamed from: j */
    public static String m11404j(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: k */
    public static Bitmap.Config[] m11403k(Bitmap.Config config) {
        int i = C2851a.f25159a[config.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new Bitmap.Config[]{config} : f25155g : f25154f : f25153e : f25152d;
    }

    @Override // com.daaw.xl0
    /* renamed from: a */
    public void mo5016a(Bitmap bitmap) {
        C2852b m11396e = this.f25156a.m11396e(tq1.m8865f(bitmap), bitmap.getConfig());
        this.f25157b.m20040d(m11396e, bitmap);
        NavigableMap<Integer, Integer> m11402l = m11402l(bitmap.getConfig());
        Integer num = (Integer) m11402l.get(Integer.valueOf(m11396e.f25161b));
        m11402l.put(Integer.valueOf(m11396e.f25161b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.daaw.xl0
    /* renamed from: b */
    public Bitmap mo5015b(int i, int i2, Bitmap.Config config) {
        int m8866e = tq1.m8866e(i, i2, config);
        Bitmap m20043a = this.f25157b.m20043a(m11405i(this.f25156a.m11396e(m8866e, config), m8866e, config));
        if (m20043a != null) {
            m11406h(Integer.valueOf(tq1.m8865f(m20043a)), m20043a.getConfig());
            m20043a.reconfigure(i, i2, m20043a.getConfig() != null ? m20043a.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return m20043a;
    }

    @Override // com.daaw.xl0
    /* renamed from: c */
    public Bitmap mo5014c() {
        Bitmap m20038f = this.f25157b.m20038f();
        if (m20038f != null) {
            m11406h(Integer.valueOf(tq1.m8865f(m20038f)), m20038f.getConfig());
        }
        return m20038f;
    }

    @Override // com.daaw.xl0
    /* renamed from: d */
    public String mo5013d(int i, int i2, Bitmap.Config config) {
        return m11404j(tq1.m8866e(i, i2, config), config);
    }

    @Override // com.daaw.xl0
    /* renamed from: e */
    public int mo5012e(Bitmap bitmap) {
        return tq1.m8865f(bitmap);
    }

    @Override // com.daaw.xl0
    /* renamed from: f */
    public String mo5011f(Bitmap bitmap) {
        return m11404j(tq1.m8865f(bitmap), bitmap.getConfig());
    }

    /* renamed from: h */
    public final void m11406h(Integer num, Bitmap.Config config) {
        NavigableMap<Integer, Integer> m11402l = m11402l(config);
        Integer num2 = (Integer) m11402l.get(num);
        if (num2.intValue() == 1) {
            m11402l.remove(num);
        } else {
            m11402l.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: i */
    public final C2852b m11405i(C2852b c2852b, int i, Bitmap.Config config) {
        Bitmap.Config[] m11403k;
        for (Bitmap.Config config2 : m11403k(config)) {
            Integer ceilingKey = m11402l(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return c2852b;
                        }
                    } else if (config2.equals(config)) {
                        return c2852b;
                    }
                }
                this.f25156a.m11547c(c2852b);
                return this.f25156a.m11396e(ceilingKey.intValue(), config2);
            }
        }
        return c2852b;
    }

    /* renamed from: l */
    public final NavigableMap<Integer, Integer> m11402l(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f25158c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f25158c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f25157b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f25158c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f25158c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}

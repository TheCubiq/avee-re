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
    public static final Bitmap.Config[] d = {Bitmap.Config.ARGB_8888, null};
    public static final Bitmap.Config[] e = {Bitmap.Config.RGB_565};
    public static final Bitmap.Config[] f = {Bitmap.Config.ARGB_4444};
    public static final Bitmap.Config[] g = {Bitmap.Config.ALPHA_8};
    public final c a = new c();
    public final i80<b, Bitmap> b = new i80<>();
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ay0 {
        public final c a;
        public int b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.daaw.ay0
        public void a() {
            this.a.c(this);
        }

        public void c(int i, Bitmap.Config config) {
            this.b = i;
            this.c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b) {
                    Bitmap.Config config = this.c;
                    Bitmap.Config config2 = bVar.c;
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
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return rd1.j(this.b, this.c);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ra<b> {
        @Override // com.daaw.ra
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b b = b();
            b.c(i, config);
            return b;
        }
    }

    public static String j(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public static Bitmap.Config[] k(Bitmap.Config config) {
        int i = a.a[config.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new Bitmap.Config[]{config} : g : f : e : d;
    }

    @Override // com.daaw.xl0
    public void a(Bitmap bitmap) {
        b e2 = this.a.e(tq1.f(bitmap), bitmap.getConfig());
        this.b.d(e2, bitmap);
        NavigableMap<Integer, Integer> l = l(bitmap.getConfig());
        Integer num = (Integer) l.get(Integer.valueOf(e2.b));
        l.put(Integer.valueOf(e2.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.daaw.xl0
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        int e2 = tq1.e(i, i2, config);
        Bitmap a2 = this.b.a(i(this.a.e(e2, config), e2, config));
        if (a2 != null) {
            h(Integer.valueOf(tq1.f(a2)), a2.getConfig());
            a2.reconfigure(i, i2, a2.getConfig() != null ? a2.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return a2;
    }

    @Override // com.daaw.xl0
    public Bitmap c() {
        Bitmap f2 = this.b.f();
        if (f2 != null) {
            h(Integer.valueOf(tq1.f(f2)), f2.getConfig());
        }
        return f2;
    }

    @Override // com.daaw.xl0
    public String d(int i, int i2, Bitmap.Config config) {
        return j(tq1.e(i, i2, config), config);
    }

    @Override // com.daaw.xl0
    public int e(Bitmap bitmap) {
        return tq1.f(bitmap);
    }

    @Override // com.daaw.xl0
    public String f(Bitmap bitmap) {
        return j(tq1.f(bitmap), bitmap.getConfig());
    }

    public final void h(Integer num, Bitmap.Config config) {
        NavigableMap<Integer, Integer> l = l(config);
        Integer num2 = (Integer) l.get(num);
        if (num2.intValue() == 1) {
            l.remove(num);
        } else {
            l.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final b i(b bVar, int i, Bitmap.Config config) {
        Bitmap.Config[] k;
        for (Bitmap.Config config2 : k(config)) {
            Integer ceilingKey = l(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVar;
                        }
                    } else if (config2.equals(config)) {
                        return bVar;
                    }
                }
                this.a.c(bVar);
                return this.a.e(ceilingKey.intValue(), config2);
            }
        }
        return bVar;
    }

    public final NavigableMap<Integer, Integer> l(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}

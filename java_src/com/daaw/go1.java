package com.daaw;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class go1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final jo1 f;
    public final String g;
    public final String[] h;
    public final HashMap<String, Integer> i;
    public final HashMap<String, Integer> j;
    public List<go1> k;

    public go1(String str, String str2, long j, long j2, jo1 jo1Var, String[] strArr, String str3) {
        this.a = str;
        this.b = str2;
        this.f = jo1Var;
        this.h = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.g = (String) s6.e(str3);
        this.i = new HashMap<>();
        this.j = new HashMap<>();
    }

    public static go1 c(String str, long j, long j2, jo1 jo1Var, String[] strArr, String str2) {
        return new go1(str, null, j, j2, jo1Var, strArr, str2);
    }

    public static go1 d(String str) {
        return new go1(null, io1.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "");
    }

    public static SpannableStringBuilder k(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    public void a(go1 go1Var) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(go1Var);
    }

    public final void b(Map<String, jo1> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        jo1 d = io1.d(this.f, this.h, map);
        if (d != null) {
            io1.a(spannableStringBuilder, i, i2, d);
        }
    }

    public final SpannableStringBuilder e(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2;
        int length = spannableStringBuilder.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                    i6++;
                }
                int i7 = i6 - i5;
                if (i7 > 0) {
                    spannableStringBuilder.delete(i4, i4 + i7);
                    length -= i7;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i8 = 0;
        while (true) {
            i = length - 1;
            if (i8 >= i) {
                break;
            }
            if (spannableStringBuilder.charAt(i8) == '\n') {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    spannableStringBuilder.delete(i9, i8 + 2);
                    length--;
                }
            }
            i8++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
            spannableStringBuilder.delete(i, length);
            length--;
        }
        while (true) {
            i2 = length - 1;
            if (i3 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i3) == ' ') {
                int i10 = i3 + 1;
                if (spannableStringBuilder.charAt(i10) == '\n') {
                    spannableStringBuilder.delete(i3, i10);
                    length--;
                }
            }
            i3++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == '\n') {
            spannableStringBuilder.delete(i2, length);
        }
        return spannableStringBuilder;
    }

    public go1 f(int i) {
        List<go1> list = this.k;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<go1> list = this.k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<ln> h(long j, Map<String, jo1> map, Map<String, ho1> map2) {
        TreeMap treeMap = new TreeMap();
        n(j, false, this.g, treeMap);
        m(j, map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            ho1 ho1Var = map2.get(entry.getKey());
            arrayList.add(new ln(e((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, ho1Var.c, ho1Var.d, ho1Var.e, ho1Var.b, Integer.MIN_VALUE, ho1Var.f, ho1Var.g, ho1Var.h));
        }
        return arrayList;
    }

    public final void i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        if (z || equals) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.k == null) {
            return;
        }
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).i(treeSet, z || equals);
        }
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public boolean l(long j) {
        long j2 = this.d;
        return (j2 == -9223372036854775807L && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.e) || (j2 <= j && j < this.e));
    }

    public final void m(long j, Map<String, jo1> map, Map<String, SpannableStringBuilder> map2) {
        int i;
        if (l(j)) {
            Iterator<Map.Entry<String, Integer>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                i = this.i.containsKey(key) ? this.i.get(key).intValue() : 0;
                int intValue = next.getValue().intValue();
                if (i != intValue) {
                    b(map, map2.get(key), i, intValue);
                }
            }
            while (i < g()) {
                f(i).m(j, map, map2);
                i++;
            }
        }
    }

    public final void n(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.i.clear();
        this.j.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.g)) {
            str = this.g;
        }
        if (this.c && z) {
            k(str, map).append((CharSequence) this.b);
        } else if ("br".equals(this.a) && z) {
            k(str, map).append('\n');
        } else if (l(j)) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                this.i.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
            }
            boolean equals = "p".equals(this.a);
            for (int i = 0; i < g(); i++) {
                f(i).n(j, z || equals, str, map);
            }
            if (equals) {
                io1.c(k(str, map));
            }
            for (Map.Entry<String, SpannableStringBuilder> entry2 : map.entrySet()) {
                this.j.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
            }
        }
    }
}

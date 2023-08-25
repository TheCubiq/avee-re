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

    /* renamed from: a */
    public final String f11528a;

    /* renamed from: b */
    public final String f11529b;

    /* renamed from: c */
    public final boolean f11530c;

    /* renamed from: d */
    public final long f11531d;

    /* renamed from: e */
    public final long f11532e;

    /* renamed from: f */
    public final jo1 f11533f;

    /* renamed from: g */
    public final String f11534g;

    /* renamed from: h */
    public final String[] f11535h;

    /* renamed from: i */
    public final HashMap<String, Integer> f11536i;

    /* renamed from: j */
    public final HashMap<String, Integer> f11537j;

    /* renamed from: k */
    public List<go1> f11538k;

    public go1(String str, String str2, long j, long j2, jo1 jo1Var, String[] strArr, String str3) {
        this.f11528a = str;
        this.f11529b = str2;
        this.f11533f = jo1Var;
        this.f11535h = strArr;
        this.f11530c = str2 != null;
        this.f11531d = j;
        this.f11532e = j2;
        this.f11534g = (String) C2914s6.m10686e(str3);
        this.f11536i = new HashMap<>();
        this.f11537j = new HashMap<>();
    }

    /* renamed from: c */
    public static go1 m21384c(String str, long j, long j2, jo1 jo1Var, String[] strArr, String str2) {
        return new go1(str, null, j, j2, jo1Var, strArr, str2);
    }

    /* renamed from: d */
    public static go1 m21383d(String str) {
        return new go1(null, io1.m19554b(str), -9223372036854775807L, -9223372036854775807L, null, null, "");
    }

    /* renamed from: k */
    public static SpannableStringBuilder m21376k(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    /* renamed from: a */
    public void m21386a(go1 go1Var) {
        if (this.f11538k == null) {
            this.f11538k = new ArrayList();
        }
        this.f11538k.add(go1Var);
    }

    /* renamed from: b */
    public final void m21385b(Map<String, jo1> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        jo1 m19552d = io1.m19552d(this.f11533f, this.f11535h, map);
        if (m19552d != null) {
            io1.m19555a(spannableStringBuilder, i, i2, m19552d);
        }
    }

    /* renamed from: e */
    public final SpannableStringBuilder m21382e(SpannableStringBuilder spannableStringBuilder) {
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

    /* renamed from: f */
    public go1 m21381f(int i) {
        List<go1> list = this.f11538k;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m21380g() {
        List<go1> list = this.f11538k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<C2099ln> m21379h(long j, Map<String, jo1> map, Map<String, ho1> map2) {
        TreeMap treeMap = new TreeMap();
        m21373n(j, false, this.f11534g, treeMap);
        m21374m(j, map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            ho1 ho1Var = map2.get(entry.getKey());
            arrayList.add(new C2099ln(m21382e((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, ho1Var.f12748c, ho1Var.f12749d, ho1Var.f12750e, ho1Var.f12747b, Integer.MIN_VALUE, ho1Var.f12751f, ho1Var.f12752g, ho1Var.f12753h));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void m21378i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f11528a);
        if (z || equals) {
            long j = this.f11531d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f11532e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f11538k == null) {
            return;
        }
        for (int i = 0; i < this.f11538k.size(); i++) {
            this.f11538k.get(i).m21378i(treeSet, z || equals);
        }
    }

    /* renamed from: j */
    public long[] m21377j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        m21378i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: l */
    public boolean m21375l(long j) {
        long j2 = this.f11531d;
        return (j2 == -9223372036854775807L && this.f11532e == -9223372036854775807L) || (j2 <= j && this.f11532e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f11532e) || (j2 <= j && j < this.f11532e));
    }

    /* renamed from: m */
    public final void m21374m(long j, Map<String, jo1> map, Map<String, SpannableStringBuilder> map2) {
        int i;
        if (m21375l(j)) {
            Iterator<Map.Entry<String, Integer>> it = this.f11537j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                i = this.f11536i.containsKey(key) ? this.f11536i.get(key).intValue() : 0;
                int intValue = next.getValue().intValue();
                if (i != intValue) {
                    m21385b(map, map2.get(key), i, intValue);
                }
            }
            while (i < m21380g()) {
                m21381f(i).m21374m(j, map, map2);
                i++;
            }
        }
    }

    /* renamed from: n */
    public final void m21373n(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.f11536i.clear();
        this.f11537j.clear();
        if ("metadata".equals(this.f11528a)) {
            return;
        }
        if (!"".equals(this.f11534g)) {
            str = this.f11534g;
        }
        if (this.f11530c && z) {
            m21376k(str, map).append((CharSequence) this.f11529b);
        } else if ("br".equals(this.f11528a) && z) {
            m21376k(str, map).append('\n');
        } else if (m21375l(j)) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                this.f11536i.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
            }
            boolean equals = "p".equals(this.f11528a);
            for (int i = 0; i < m21380g(); i++) {
                m21381f(i).m21373n(j, z || equals, str, map);
            }
            if (equals) {
                io1.m19553c(m21376k(str, map));
            }
            for (Map.Entry<String, SpannableStringBuilder> entry2 : map.entrySet()) {
                this.f11537j.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
            }
        }
    }
}

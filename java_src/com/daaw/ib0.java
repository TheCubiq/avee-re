package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ib0 extends nb0 {

    /* renamed from: c */
    public final List<C1674a> f13424c;

    /* renamed from: d */
    public final List<C1674a> f13425d;

    /* renamed from: e */
    public final List<C1674a> f13426e;

    /* renamed from: f */
    public final Format f13427f;

    /* renamed from: g */
    public final List<Format> f13428g;

    /* renamed from: com.daaw.ib0$a */
    /* loaded from: classes.dex */
    public static final class C1674a {

        /* renamed from: a */
        public final String f13429a;

        /* renamed from: b */
        public final Format f13430b;

        public C1674a(String str, Format format) {
            this.f13429a = str;
            this.f13430b = format;
        }

        /* renamed from: a */
        public static C1674a m19987a(String str) {
            return new C1674a(str, Format.m1721v("0", "application/x-mpegURL", null, null, -1, 0, null));
        }
    }

    public ib0(String str, List<String> list, List<C1674a> list2, List<C1674a> list3, List<C1674a> list4, Format format, List<Format> list5) {
        super(str, list);
        this.f13424c = Collections.unmodifiableList(list2);
        this.f13425d = Collections.unmodifiableList(list3);
        this.f13426e = Collections.unmodifiableList(list4);
        this.f13427f = format;
        this.f13428g = list5 != null ? Collections.unmodifiableList(list5) : null;
    }

    /* renamed from: c */
    public static List<C1674a> m19989c(List<C1674a> list, int i, List<f41> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1674a c1674a = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    f41 f41Var = list2.get(i3);
                    if (f41Var.f9091p == i && f41Var.f9092q == i2) {
                        arrayList.add(c1674a);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static ib0 m19988d(String str) {
        List singletonList = Collections.singletonList(C1674a.m19987a(str));
        List emptyList = Collections.emptyList();
        return new ib0(null, Collections.emptyList(), singletonList, emptyList, emptyList, null, null);
    }

    @Override // com.daaw.o10
    /* renamed from: b */
    public ib0 mo5189a(List<f41> list) {
        return new ib0(this.f19774a, this.f19775b, m19989c(this.f13424c, 0, list), m19989c(this.f13425d, 1, list), m19989c(this.f13426e, 2, list), this.f13427f, this.f13428g);
    }
}

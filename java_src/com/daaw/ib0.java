package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ib0 extends nb0 {
    public final List<a> c;
    public final List<a> d;
    public final List<a> e;
    public final Format f;
    public final List<Format> g;

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final Format b;

        public a(String str, Format format) {
            this.a = str;
            this.b = format;
        }

        public static a a(String str) {
            return new a(str, Format.v("0", "application/x-mpegURL", null, null, -1, 0, null));
        }
    }

    public ib0(String str, List<String> list, List<a> list2, List<a> list3, List<a> list4, Format format, List<Format> list5) {
        super(str, list);
        this.c = Collections.unmodifiableList(list2);
        this.d = Collections.unmodifiableList(list3);
        this.e = Collections.unmodifiableList(list4);
        this.f = format;
        this.g = list5 != null ? Collections.unmodifiableList(list5) : null;
    }

    public static List<a> c(List<a> list, int i, List<f41> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            a aVar = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    f41 f41Var = list2.get(i3);
                    if (f41Var.p == i && f41Var.q == i2) {
                        arrayList.add(aVar);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    public static ib0 d(String str) {
        List singletonList = Collections.singletonList(a.a(str));
        List emptyList = Collections.emptyList();
        return new ib0(null, Collections.emptyList(), singletonList, emptyList, emptyList, null, null);
    }

    @Override // com.daaw.o10
    /* renamed from: b */
    public ib0 a(List<f41> list) {
        return new ib0(this.a, this.b, c(this.c, 0, list), c(this.d, 1, list), c(this.e, 2, list), this.f, this.g);
    }
}

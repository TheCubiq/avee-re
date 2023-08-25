package com.daaw;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.daaw.wo */
/* loaded from: classes.dex */
public class C3456wo implements o10<C3456wo, k41> {

    /* renamed from: a */
    public final long f31401a;

    /* renamed from: b */
    public final long f31402b;

    /* renamed from: c */
    public final long f31403c;

    /* renamed from: d */
    public final boolean f31404d;

    /* renamed from: e */
    public final long f31405e;

    /* renamed from: f */
    public final long f31406f;

    /* renamed from: g */
    public final long f31407g;

    /* renamed from: h */
    public final long f31408h;

    /* renamed from: i */
    public final pq1 f31409i;

    /* renamed from: j */
    public final Uri f31410j;

    /* renamed from: k */
    public final List<gw0> f31411k;

    public C3456wo(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, pq1 pq1Var, Uri uri, List<gw0> list) {
        this.f31401a = j;
        this.f31402b = j2;
        this.f31403c = j3;
        this.f31404d = z;
        this.f31405e = j4;
        this.f31406f = j5;
        this.f31407g = j6;
        this.f31408h = j7;
        this.f31409i = pq1Var;
        this.f31410j = uri;
        this.f31411k = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    public static ArrayList<C1154e1> m5925c(List<C1154e1> list, LinkedList<k41> linkedList) {
        k41 poll = linkedList.poll();
        int i = poll.f15657p;
        ArrayList<C1154e1> arrayList = new ArrayList<>();
        do {
            int i2 = poll.f15658q;
            C1154e1 c1154e1 = list.get(i2);
            List<j41> list2 = c1154e1.f8023c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f15659r));
                poll = linkedList.poll();
                if (poll.f15657p != i) {
                    break;
                }
            } while (poll.f15658q == i2);
            arrayList.add(new C1154e1(c1154e1.f8021a, c1154e1.f8022b, arrayList2, c1154e1.f8024d, c1154e1.f8025e));
        } while (poll.f15657p == i);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // com.daaw.o10
    /* renamed from: b */
    public final C3456wo mo5189a(List<k41> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new k41(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= m5923e()) {
                break;
            }
            if (((k41) linkedList.peek()).f15657p != i) {
                long m5922f = m5922f(i);
                if (m5922f != -9223372036854775807L) {
                    j += m5922f;
                }
            } else {
                gw0 m5924d = m5924d(i);
                arrayList.add(new gw0(m5924d.f11772a, m5924d.f11773b - j, m5925c(m5924d.f11774c, linkedList), m5924d.f11775d));
            }
            i++;
        }
        long j2 = this.f31402b;
        return new C3456wo(this.f31401a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.f31403c, this.f31404d, this.f31405e, this.f31406f, this.f31407g, this.f31408h, this.f31409i, this.f31410j, arrayList);
    }

    /* renamed from: d */
    public final gw0 m5924d(int i) {
        return this.f31411k.get(i);
    }

    /* renamed from: e */
    public final int m5923e() {
        return this.f31411k.size();
    }

    /* renamed from: f */
    public final long m5922f(int i) {
        long j;
        if (i == this.f31411k.size() - 1) {
            long j2 = this.f31402b;
            if (j2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j = j2 - this.f31411k.get(i).f11773b;
        } else {
            j = this.f31411k.get(i + 1).f11773b - this.f31411k.get(i).f11773b;
        }
        return j;
    }

    /* renamed from: g */
    public final long m5921g(int i) {
        return C1075dd.m24527a(m5922f(i));
    }
}

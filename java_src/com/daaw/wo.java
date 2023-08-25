package com.daaw;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class wo implements o10<wo, k41> {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final pq1 i;
    public final Uri j;
    public final List<gw0> k;

    public wo(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, pq1 pq1Var, Uri uri, List<gw0> list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = pq1Var;
        this.j = uri;
        this.k = list == null ? Collections.emptyList() : list;
    }

    public static ArrayList<e1> c(List<e1> list, LinkedList<k41> linkedList) {
        k41 poll = linkedList.poll();
        int i = poll.p;
        ArrayList<e1> arrayList = new ArrayList<>();
        do {
            int i2 = poll.q;
            e1 e1Var = list.get(i2);
            List<j41> list2 = e1Var.c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.r));
                poll = linkedList.poll();
                if (poll.p != i) {
                    break;
                }
            } while (poll.q == i2);
            arrayList.add(new e1(e1Var.a, e1Var.b, arrayList2, e1Var.d, e1Var.e));
        } while (poll.p == i);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // com.daaw.o10
    /* renamed from: b */
    public final wo a(List<k41> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new k41(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= e()) {
                break;
            }
            if (((k41) linkedList.peek()).p != i) {
                long f = f(i);
                if (f != -9223372036854775807L) {
                    j += f;
                }
            } else {
                gw0 d = d(i);
                arrayList.add(new gw0(d.a, d.b - j, c(d.c, linkedList), d.d));
            }
            i++;
        }
        long j2 = this.b;
        return new wo(this.a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, arrayList);
    }

    public final gw0 d(int i) {
        return this.k.get(i);
    }

    public final int e() {
        return this.k.size();
    }

    public final long f(int i) {
        long j;
        if (i == this.k.size() - 1) {
            long j2 = this.b;
            if (j2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j = j2 - this.k.get(i).b;
        } else {
            j = this.k.get(i + 1).b - this.k.get(i).b;
        }
        return j;
    }

    public final long g(int i) {
        return dd.a(f(i));
    }
}

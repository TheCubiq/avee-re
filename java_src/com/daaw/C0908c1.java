package com.daaw;

import android.net.Uri;
import java.util.Arrays;
/* renamed from: com.daaw.c1 */
/* loaded from: classes.dex */
public final class C0908c1 {

    /* renamed from: f */
    public static final C0908c1 f5360f = new C0908c1(new long[0]);

    /* renamed from: a */
    public final int f5361a;

    /* renamed from: b */
    public final long[] f5362b;

    /* renamed from: c */
    public final C0909a[] f5363c;

    /* renamed from: d */
    public final long f5364d;

    /* renamed from: e */
    public final long f5365e;

    /* renamed from: com.daaw.c1$a */
    /* loaded from: classes.dex */
    public static final class C0909a {

        /* renamed from: a */
        public final int f5366a;

        /* renamed from: b */
        public final Uri[] f5367b;

        /* renamed from: c */
        public final int[] f5368c;

        /* renamed from: d */
        public final long[] f5369d;

        public C0909a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        public C0909a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C2914s6.m10690a(iArr.length == uriArr.length);
            this.f5366a = i;
            this.f5368c = iArr;
            this.f5367b = uriArr;
            this.f5369d = jArr;
        }

        /* renamed from: a */
        public int m25688a() {
            return m25687b(-1);
        }

        /* renamed from: b */
        public int m25687b(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f5368c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    break;
                }
                i2++;
            }
            return i2;
        }

        /* renamed from: c */
        public boolean m25686c() {
            return this.f5366a == -1 || m25688a() < this.f5366a;
        }
    }

    public C0908c1(long... jArr) {
        int length = jArr.length;
        this.f5361a = length;
        this.f5362b = Arrays.copyOf(jArr, length);
        this.f5363c = new C0909a[length];
        for (int i = 0; i < length; i++) {
            this.f5363c[i] = new C0909a();
        }
        this.f5364d = 0L;
        this.f5365e = -9223372036854775807L;
    }

    /* renamed from: a */
    public int m25690a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.f5362b;
            if (i >= jArr.length || jArr[i] == Long.MIN_VALUE || (j < jArr[i] && this.f5363c[i].m25686c())) {
                break;
            }
            i++;
        }
        if (i < this.f5362b.length) {
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public int m25689b(long j) {
        int length = this.f5362b.length - 1;
        while (length >= 0) {
            long[] jArr = this.f5362b;
            if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.f5363c[length].m25686c()) {
            return -1;
        }
        return length;
    }
}

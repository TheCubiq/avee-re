package com.daaw;

import android.util.Pair;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class bi8 {

    /* renamed from: c */
    public static final bi8 f4841c = new bi8(new int[]{2}, 8);

    /* renamed from: d */
    public static final bi8 f4842d = new bi8(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    public static final b27 f4843e;

    /* renamed from: a */
    public final int[] f4844a;

    /* renamed from: b */
    public final int f4845b;

    static {
        a27 a27Var = new a27();
        a27Var.m27748a(5, 6);
        a27Var.m27748a(17, 6);
        a27Var.m27748a(7, 6);
        a27Var.m27748a(18, 6);
        a27Var.m27748a(6, 8);
        a27Var.m27748a(8, 8);
        a27Var.m27748a(14, 8);
        f4843e = a27Var.m27746c();
    }

    public bi8(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f4844a = copyOf;
        Arrays.sort(copyOf);
        this.f4845b = 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
        if (r7 != 5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair m26138a(f92 f92Var) {
        int m19412T;
        String str = f92Var.f9275l;
        Objects.requireNonNull(str);
        int m27389a = ak3.m27389a(str, f92Var.f9272i);
        b27 b27Var = f4843e;
        if (!b27Var.containsKey(Integer.valueOf(m27389a))) {
            return null;
        }
        int i = 6;
        if (m27389a == 18) {
            if (m26136c(18)) {
                m27389a = 18;
            } else {
                m27389a = 6;
                if (m26136c(m27389a)) {
                    return null;
                }
                int i2 = f92Var.f9288y;
                if (i2 == -1 || m27389a == 18) {
                    int i3 = f92Var.f9289z;
                    if (i3 == -1) {
                        i3 = 48000;
                    }
                    if (it5.f13991a >= 29) {
                        i2 = zh8.m2285a(m27389a, i3);
                    } else {
                        Integer num = (Integer) b27Var.getOrDefault(Integer.valueOf(m27389a), 0);
                        Objects.requireNonNull(num);
                        i2 = num.intValue();
                    }
                } else if (i2 > 8) {
                    return null;
                }
                int i4 = it5.f13991a;
                if (i4 <= 28) {
                    if (i2 == 7) {
                        i = 8;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                        }
                    }
                    if (i4 <= 26 && "fugu".equals(it5.f13992b) && i == 1) {
                        i = 2;
                    }
                    m19412T = it5.m19412T(i);
                    if (m19412T != 0) {
                        return null;
                    }
                    return Pair.create(Integer.valueOf(m27389a), Integer.valueOf(m19412T));
                }
                i = i2;
                if (i4 <= 26) {
                    i = 2;
                }
                m19412T = it5.m19412T(i);
                if (m19412T != 0) {
                }
            }
        }
        if (m27389a == 8 && !m26136c(8)) {
            m27389a = 7;
        }
        if (m26136c(m27389a)) {
        }
    }

    /* renamed from: c */
    public final boolean m26136c(int i) {
        return Arrays.binarySearch(this.f4844a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi8) && Arrays.equals(this.f4844a, ((bi8) obj).f4844a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f4844a) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f4844a);
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + arrays + "]";
    }
}

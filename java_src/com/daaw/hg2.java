package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public final class hg2 {

    /* renamed from: d */
    public static final Comparator f12526d = new gg2();

    /* renamed from: a */
    public final List f12527a = new ArrayList();

    /* renamed from: b */
    public final List f12528b = new ArrayList(64);

    /* renamed from: c */
    public int f12529c = 0;

    public hg2(int i) {
    }

    /* renamed from: a */
    public final synchronized void m20802a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f12527a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f12528b, bArr, f12526d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f12528b.add(binarySearch, bArr);
                this.f12529c += length;
                m20800c();
            }
        }
    }

    /* renamed from: b */
    public final synchronized byte[] m20801b(int i) {
        for (int i2 = 0; i2 < this.f12528b.size(); i2++) {
            byte[] bArr = (byte[]) this.f12528b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f12529c -= length;
                this.f12528b.remove(i2);
                this.f12527a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* renamed from: c */
    public final synchronized void m20800c() {
        while (this.f12529c > 4096) {
            byte[] bArr = (byte[]) this.f12527a.remove(0);
            this.f12528b.remove(bArr);
            this.f12529c -= bArr.length;
        }
    }
}

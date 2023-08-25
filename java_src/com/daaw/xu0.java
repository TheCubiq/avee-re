package com.daaw;

import com.daaw.rg1;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class xu0 extends rg1 {
    public static final int o = sq1.v("Opus");
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public boolean n;

    public static boolean n(rv0 rv0Var) {
        int a = rv0Var.a();
        byte[] bArr = p;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        rv0Var.g(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.daaw.rg1
    public long e(rv0 rv0Var) {
        return b(l(rv0Var.a));
    }

    @Override // com.daaw.rg1
    public boolean h(rv0 rv0Var, long j, rg1.b bVar) {
        if (this.n) {
            boolean z = rv0Var.i() == o;
            rv0Var.J(0);
            return z;
        }
        byte[] copyOf = Arrays.copyOf(rv0Var.a, rv0Var.d());
        int i = copyOf[9] & 255;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(copyOf);
        m(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
        m(arrayList, 3840);
        bVar.a = Format.u(null, "audio/opus", null, -1, -1, i, 48000, arrayList, null, 0, null);
        this.n = true;
        return true;
    }

    @Override // com.daaw.rg1
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = false;
        }
    }

    public final long l(byte[] bArr) {
        int i = bArr[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = bArr[1] & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5);
    }

    public final void m(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }
}

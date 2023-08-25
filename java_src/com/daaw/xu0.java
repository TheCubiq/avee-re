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

    /* renamed from: o */
    public static final int f32957o = sq1.m9994v("Opus");

    /* renamed from: p */
    public static final byte[] f32958p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f32959n;

    /* renamed from: n */
    public static boolean m4503n(rv0 rv0Var) {
        int m10919a = rv0Var.m10919a();
        byte[] bArr = f32958p;
        if (m10919a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        rv0Var.m10913g(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.daaw.rg1
    /* renamed from: e */
    public long mo3177e(rv0 rv0Var) {
        return m11347b(m4505l(rv0Var.f25637a));
    }

    @Override // com.daaw.rg1
    /* renamed from: h */
    public boolean mo3176h(rv0 rv0Var, long j, rg1.C2860b c2860b) {
        if (this.f32959n) {
            boolean z = rv0Var.m10911i() == f32957o;
            rv0Var.m10921J(0);
            return z;
        }
        byte[] copyOf = Arrays.copyOf(rv0Var.f25637a, rv0Var.m10916d());
        int i = copyOf[9] & 255;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(copyOf);
        m4504m(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
        m4504m(arrayList, 3840);
        c2860b.f25265a = Format.m1722u(null, "audio/opus", null, -1, -1, i, 48000, arrayList, null, 0, null);
        this.f32959n = true;
        return true;
    }

    @Override // com.daaw.rg1
    /* renamed from: j */
    public void mo3175j(boolean z) {
        super.mo3175j(z);
        if (z) {
            this.f32959n = false;
        }
    }

    /* renamed from: l */
    public final long m4505l(byte[] bArr) {
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

    /* renamed from: m */
    public final void m4504m(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }
}

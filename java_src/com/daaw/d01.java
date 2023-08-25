package com.daaw;

import java.nio.ByteBuffer;
import java.util.UUID;
/* loaded from: classes.dex */
public final class d01 {

    /* renamed from: com.daaw.d01$a */
    /* loaded from: classes.dex */
    public static class C1033a {

        /* renamed from: a */
        public final UUID f6334a;

        /* renamed from: b */
        public final int f6335b;

        /* renamed from: c */
        public final byte[] f6336c;

        public C1033a(UUID uuid, int i, byte[] bArr) {
            this.f6334a = uuid;
            this.f6335b = i;
            this.f6336c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m24845a(UUID uuid, byte[] bArr) {
        return m24844b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m24844b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        boolean z = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        if (z) {
            i += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.putInt(AbstractC0821b7.f4415V);
        allocate.putInt(z ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (z) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static C1033a m24843c(byte[] bArr) {
        rv0 rv0Var = new rv0(bArr);
        if (rv0Var.m10916d() < 32) {
            return null;
        }
        rv0Var.m10921J(0);
        if (rv0Var.m10911i() == rv0Var.m10919a() + 4 && rv0Var.m10911i() == AbstractC0821b7.f4415V) {
            int m26446c = AbstractC0821b7.m26446c(rv0Var.m10911i());
            if (m26446c > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported pssh version: ");
                sb.append(m26446c);
                return null;
            }
            UUID uuid = new UUID(rv0Var.m10903q(), rv0Var.m10903q());
            if (m26446c == 1) {
                rv0Var.m10920K(rv0Var.m10929B() * 16);
            }
            int m10929B = rv0Var.m10929B();
            if (m10929B != rv0Var.m10919a()) {
                return null;
            }
            byte[] bArr2 = new byte[m10929B];
            rv0Var.m10913g(bArr2, 0, m10929B);
            return new C1033a(uuid, m26446c, bArr2);
        }
        return null;
    }

    /* renamed from: d */
    public static byte[] m24842d(byte[] bArr, UUID uuid) {
        C1033a m24843c = m24843c(bArr);
        if (m24843c == null) {
            return null;
        }
        if (uuid == null || uuid.equals(m24843c.f6334a)) {
            return m24843c.f6336c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UUID mismatch. Expected: ");
        sb.append(uuid);
        sb.append(", got: ");
        sb.append(m24843c.f6334a);
        sb.append(".");
        return null;
    }

    /* renamed from: e */
    public static UUID m24841e(byte[] bArr) {
        C1033a m24843c = m24843c(bArr);
        if (m24843c == null) {
            return null;
        }
        return m24843c.f6334a;
    }

    /* renamed from: f */
    public static int m24840f(byte[] bArr) {
        C1033a m24843c = m24843c(bArr);
        if (m24843c == null) {
            return -1;
        }
        return m24843c.f6335b;
    }
}

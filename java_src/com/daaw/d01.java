package com.daaw;

import java.nio.ByteBuffer;
import java.util.UUID;
/* loaded from: classes.dex */
public final class d01 {

    /* loaded from: classes.dex */
    public static class a {
        public final UUID a;
        public final int b;
        public final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        boolean z = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        if (z) {
            i += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.putInt(b7.V);
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

    public static a c(byte[] bArr) {
        rv0 rv0Var = new rv0(bArr);
        if (rv0Var.d() < 32) {
            return null;
        }
        rv0Var.J(0);
        if (rv0Var.i() == rv0Var.a() + 4 && rv0Var.i() == b7.V) {
            int c = b7.c(rv0Var.i());
            if (c > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported pssh version: ");
                sb.append(c);
                return null;
            }
            UUID uuid = new UUID(rv0Var.q(), rv0Var.q());
            if (c == 1) {
                rv0Var.K(rv0Var.B() * 16);
            }
            int B = rv0Var.B();
            if (B != rv0Var.a()) {
                return null;
            }
            byte[] bArr2 = new byte[B];
            rv0Var.g(bArr2, 0, B);
            return new a(uuid, c, bArr2);
        }
        return null;
    }

    public static byte[] d(byte[] bArr, UUID uuid) {
        a c = c(bArr);
        if (c == null) {
            return null;
        }
        if (uuid == null || uuid.equals(c.a)) {
            return c.c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UUID mismatch. Expected: ");
        sb.append(uuid);
        sb.append(", got: ");
        sb.append(c.a);
        sb.append(".");
        return null;
    }

    public static UUID e(byte[] bArr) {
        a c = c(bArr);
        if (c == null) {
            return null;
        }
        return c.a;
    }

    public static int f(byte[] bArr) {
        a c = c(bArr);
        if (c == null) {
            return -1;
        }
        return c.b;
    }
}

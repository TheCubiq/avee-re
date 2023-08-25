package com.daaw;

import java.util.Iterator;
/* loaded from: classes2.dex */
public final class wp2 implements Iterable, gl2 {
    public final String p;

    public wp2(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.p = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    @Override // com.daaw.gl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.gl2 d(java.lang.String r22, com.daaw.w07 r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.wp2.d(java.lang.String, com.daaw.w07, java.util.List):com.daaw.gl2");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wp2) {
            return this.p.equals(((wp2) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new so2(this);
    }

    public final String toString() {
        String str = this.p;
        return "\"" + str + "\"";
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return new wp2(this.p);
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        return Boolean.valueOf(!this.p.isEmpty());
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        double d;
        if (this.p.isEmpty()) {
            d = 0.0d;
        } else {
            try {
                return Double.valueOf(this.p);
            } catch (NumberFormatException unused) {
                d = Double.NaN;
            }
        }
        return Double.valueOf(d);
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        return this.p;
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return new nn2(this);
    }
}

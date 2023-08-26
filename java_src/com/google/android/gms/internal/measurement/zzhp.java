package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public enum zzhp {
    DOUBLE(0, zzhr.SCALAR, zzii.DOUBLE),
    FLOAT(1, zzhr.SCALAR, zzii.FLOAT),
    INT64(2, zzhr.SCALAR, zzii.LONG),
    UINT64(3, zzhr.SCALAR, zzii.LONG),
    INT32(4, zzhr.SCALAR, zzii.INT),
    FIXED64(5, zzhr.SCALAR, zzii.LONG),
    FIXED32(6, zzhr.SCALAR, zzii.INT),
    BOOL(7, zzhr.SCALAR, zzii.BOOLEAN),
    STRING(8, zzhr.SCALAR, zzii.STRING),
    MESSAGE(9, zzhr.SCALAR, zzii.MESSAGE),
    BYTES(10, zzhr.SCALAR, zzii.BYTE_STRING),
    UINT32(11, zzhr.SCALAR, zzii.INT),
    ENUM(12, zzhr.SCALAR, zzii.ENUM),
    SFIXED32(13, zzhr.SCALAR, zzii.INT),
    SFIXED64(14, zzhr.SCALAR, zzii.LONG),
    SINT32(15, zzhr.SCALAR, zzii.INT),
    SINT64(16, zzhr.SCALAR, zzii.LONG),
    GROUP(17, zzhr.SCALAR, zzii.MESSAGE),
    DOUBLE_LIST(18, zzhr.VECTOR, zzii.DOUBLE),
    FLOAT_LIST(19, zzhr.VECTOR, zzii.FLOAT),
    INT64_LIST(20, zzhr.VECTOR, zzii.LONG),
    UINT64_LIST(21, zzhr.VECTOR, zzii.LONG),
    INT32_LIST(22, zzhr.VECTOR, zzii.INT),
    FIXED64_LIST(23, zzhr.VECTOR, zzii.LONG),
    FIXED32_LIST(24, zzhr.VECTOR, zzii.INT),
    BOOL_LIST(25, zzhr.VECTOR, zzii.BOOLEAN),
    STRING_LIST(26, zzhr.VECTOR, zzii.STRING),
    MESSAGE_LIST(27, zzhr.VECTOR, zzii.MESSAGE),
    BYTES_LIST(28, zzhr.VECTOR, zzii.BYTE_STRING),
    UINT32_LIST(29, zzhr.VECTOR, zzii.INT),
    ENUM_LIST(30, zzhr.VECTOR, zzii.ENUM),
    SFIXED32_LIST(31, zzhr.VECTOR, zzii.INT),
    SFIXED64_LIST(32, zzhr.VECTOR, zzii.LONG),
    SINT32_LIST(33, zzhr.VECTOR, zzii.INT),
    SINT64_LIST(34, zzhr.VECTOR, zzii.LONG),
    DOUBLE_LIST_PACKED(35, zzhr.PACKED_VECTOR, zzii.DOUBLE),
    FLOAT_LIST_PACKED(36, zzhr.PACKED_VECTOR, zzii.FLOAT),
    INT64_LIST_PACKED(37, zzhr.PACKED_VECTOR, zzii.LONG),
    UINT64_LIST_PACKED(38, zzhr.PACKED_VECTOR, zzii.LONG),
    INT32_LIST_PACKED(39, zzhr.PACKED_VECTOR, zzii.INT),
    FIXED64_LIST_PACKED(40, zzhr.PACKED_VECTOR, zzii.LONG),
    FIXED32_LIST_PACKED(41, zzhr.PACKED_VECTOR, zzii.INT),
    BOOL_LIST_PACKED(42, zzhr.PACKED_VECTOR, zzii.BOOLEAN),
    UINT32_LIST_PACKED(43, zzhr.PACKED_VECTOR, zzii.INT),
    ENUM_LIST_PACKED(44, zzhr.PACKED_VECTOR, zzii.ENUM),
    SFIXED32_LIST_PACKED(45, zzhr.PACKED_VECTOR, zzii.INT),
    SFIXED64_LIST_PACKED(46, zzhr.PACKED_VECTOR, zzii.LONG),
    SINT32_LIST_PACKED(47, zzhr.PACKED_VECTOR, zzii.INT),
    SINT64_LIST_PACKED(48, zzhr.PACKED_VECTOR, zzii.LONG),
    GROUP_LIST(49, zzhr.VECTOR, zzii.MESSAGE),
    MAP(50, zzhr.MAP, zzii.VOID);
    
    private static final zzhp[] zzbe;
    private static final Type[] zzbf = new Type[0];
    private final zzii zzaz;
    private final int zzba;
    private final zzhr zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    zzhp(int i, zzhr zzhrVar, zzii zziiVar) {
        int i2;
        this.zzba = i;
        this.zzbb = zzhrVar;
        this.zzaz = zziiVar;
        int i3 = zzhs.zza[zzhrVar.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.zzbc = zziiVar.zza();
        } else if (i3 == 2) {
            this.zzbc = zziiVar.zza();
        } else {
            this.zzbc = null;
        }
        this.zzbd = (zzhrVar != zzhr.SCALAR || (i2 = zzhs.zzb[zziiVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : false;
    }

    public final int zza() {
        return this.zzba;
    }

    static {
        zzhp[] values = values();
        zzbe = new zzhp[values.length];
        for (zzhp zzhpVar : values) {
            zzbe[zzhpVar.zzba] = zzhpVar;
        }
    }
}

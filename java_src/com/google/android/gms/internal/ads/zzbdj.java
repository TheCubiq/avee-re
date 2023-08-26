package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
/* loaded from: classes2.dex */
final class zzbdj {
    private final int flags;
    private final Object[] zzdwh;
    private final int zzdwi;
    private final int zzdwj;
    private final int zzdwk;
    private final int[] zzdwq;
    private final zzbdk zzdxf;
    private Class<?> zzdxg;
    private final int zzdxh;
    private final int zzdxi;
    private final int zzdxj;
    private final int zzdxk;
    private final int zzdxl;
    private final int zzdxm;
    private int zzdxn;
    private int zzdxo;
    private int zzdxp = Integer.MAX_VALUE;
    private int zzdxq = Integer.MIN_VALUE;
    private int zzdxr = 0;
    private int zzdxs = 0;
    private int zzdxt = 0;
    private int zzdxu = 0;
    private int zzdxv = 0;
    private int zzdxw;
    private int zzdxx;
    private int zzdxy;
    private int zzdxz;
    private int zzdya;
    private Field zzdyb;
    private Object zzdyc;
    private Object zzdyd;
    private Object zzdye;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdj(Class<?> cls, String str, Object[] objArr) {
        this.zzdxg = cls;
        zzbdk zzbdkVar = new zzbdk(str);
        this.zzdxf = zzbdkVar;
        this.zzdwh = objArr;
        this.flags = zzbdkVar.next();
        int next = this.zzdxf.next();
        this.zzdxh = next;
        if (next == 0) {
            this.zzdxi = 0;
            this.zzdxj = 0;
            this.zzdwi = 0;
            this.zzdwj = 0;
            this.zzdxk = 0;
            this.zzdxl = 0;
            this.zzdwk = 0;
            this.zzdxm = 0;
            this.zzdwq = null;
            return;
        }
        this.zzdxi = this.zzdxf.next();
        this.zzdxj = this.zzdxf.next();
        this.zzdwi = this.zzdxf.next();
        this.zzdwj = this.zzdxf.next();
        this.zzdxl = this.zzdxf.next();
        this.zzdwk = this.zzdxf.next();
        this.zzdxk = this.zzdxf.next();
        this.zzdxm = this.zzdxf.next();
        int next2 = this.zzdxf.next();
        this.zzdwq = next2 != 0 ? new int[next2] : null;
        this.zzdxn = (this.zzdxi << 1) + this.zzdxj;
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final Object zzaey() {
        Object[] objArr = this.zzdwh;
        int i = this.zzdxn;
        this.zzdxn = i + 1;
        return objArr[i];
    }

    private final boolean zzafa() {
        return (this.flags & 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
        if (zzafa() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
        r5.zzdyd = zzaey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0158, code lost:
        if (((r5.zzdxx & 2048) != 0) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
        if (zzafa() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean next() {
        int i;
        Object type;
        if (this.zzdxf.hasNext()) {
            this.zzdxw = this.zzdxf.next();
            int next = this.zzdxf.next();
            this.zzdxx = next;
            this.zzdxy = next & 255;
            int i2 = this.zzdxw;
            if (i2 < this.zzdxp) {
                this.zzdxp = i2;
            }
            int i3 = this.zzdxw;
            if (i3 > this.zzdxq) {
                this.zzdxq = i3;
            }
            if (this.zzdxy == zzbbj.MAP.id()) {
                this.zzdxr++;
            } else if (this.zzdxy >= zzbbj.DOUBLE_LIST.id() && this.zzdxy <= zzbbj.GROUP_LIST.id()) {
                this.zzdxs++;
            }
            int i4 = this.zzdxv + 1;
            this.zzdxv = i4;
            if (zzbdo.zze(this.zzdxp, this.zzdxw, i4)) {
                int i5 = this.zzdxw + 1;
                this.zzdxu = i5;
                i = i5 - this.zzdxp;
            } else {
                i = this.zzdxt + 1;
            }
            this.zzdxt = i;
            if ((this.zzdxx & 1024) != 0) {
                int[] iArr = this.zzdwq;
                int i6 = this.zzdxo;
                this.zzdxo = i6 + 1;
                iArr[i6] = this.zzdxw;
            }
            this.zzdyc = null;
            this.zzdyd = null;
            this.zzdye = null;
            if (zzafb()) {
                this.zzdxz = this.zzdxf.next();
                if (this.zzdxy != zzbbj.MESSAGE.id() + 51 && this.zzdxy != zzbbj.GROUP.id() + 51) {
                    if (this.zzdxy == zzbbj.ENUM.id() + 51) {
                    }
                    return true;
                }
                type = zzaey();
            } else {
                this.zzdyb = zza(this.zzdxg, (String) zzaey());
                if (zzaff()) {
                    this.zzdya = this.zzdxf.next();
                }
                if (this.zzdxy == zzbbj.MESSAGE.id() || this.zzdxy == zzbbj.GROUP.id()) {
                    type = this.zzdyb.getType();
                } else {
                    if (this.zzdxy != zzbbj.MESSAGE_LIST.id() && this.zzdxy != zzbbj.GROUP_LIST.id()) {
                        if (this.zzdxy != zzbbj.ENUM.id() && this.zzdxy != zzbbj.ENUM_LIST.id() && this.zzdxy != zzbbj.ENUM_LIST_PACKED.id()) {
                            if (this.zzdxy == zzbbj.MAP.id()) {
                                this.zzdye = zzaey();
                            }
                            return true;
                        }
                    }
                    type = zzaey();
                }
            }
            this.zzdyc = type;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzaci() {
        return this.zzdxw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzaez() {
        return this.zzdxy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzafb() {
        return this.zzdxy > zzbbj.MAP.id();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Field zzafc() {
        int i = this.zzdxz << 1;
        Object obj = this.zzdwh[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field zza = zza(this.zzdxg, (String) obj);
        this.zzdwh[i] = zza;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Field zzafd() {
        int i = (this.zzdxz << 1) + 1;
        Object obj = this.zzdwh[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field zza = zza(this.zzdxg, (String) obj);
        this.zzdwh[i] = zza;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Field zzafe() {
        return this.zzdyb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzaff() {
        return zzafa() && this.zzdxy <= zzbbj.GROUP.id();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Field zzafg() {
        int i = (this.zzdxi << 1) + (this.zzdya / 32);
        Object obj = this.zzdwh[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field zza = zza(this.zzdxg, (String) obj);
        this.zzdwh[i] = zza;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzafh() {
        return this.zzdya % 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzafi() {
        return (this.zzdxx & 256) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzafj() {
        return (this.zzdxx & 512) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zzafk() {
        return this.zzdyc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zzafl() {
        return this.zzdyd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zzafm() {
        return this.zzdye;
    }
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhv;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzjk<T> implements zzjv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzkt.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzjg zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzjo zzo;
    private final zziq zzp;
    private final zzkn<?, ?> zzq;
    private final zzhk<?> zzr;
    private final zziz zzs;

    private zzjk(int[] iArr, Object[] objArr, int i, int i2, zzjg zzjgVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzjo zzjoVar, zziq zziqVar, zzkn<?, ?> zzknVar, zzhk<?> zzhkVar, zziz zzizVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzjgVar instanceof zzhv;
        this.zzj = z;
        this.zzh = zzhkVar != null && zzhkVar.zza(zzjgVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzjoVar;
        this.zzp = zziqVar;
        this.zzq = zzknVar;
        this.zzr = zzhkVar;
        this.zzg = zzjgVar;
        this.zzs = zzizVar;
    }

    private static boolean zzf(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> zzjk<T> zza(Class<T> cls, zzje zzjeVar, zzjo zzjoVar, zziq zziqVar, zzkn<?, ?> zzknVar, zzhk<?> zzhkVar, zziz zzizVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int i2;
        int[] iArr;
        int i3;
        char charAt6;
        int i4;
        char charAt7;
        int i5;
        char charAt8;
        int i6;
        char charAt9;
        int i7;
        char charAt10;
        int i8;
        char charAt11;
        int i9;
        char charAt12;
        int i10;
        char charAt13;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int objectFieldOffset;
        String str;
        boolean z;
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        Field zza2;
        int i19;
        char charAt14;
        int i20;
        int i21;
        Field zza3;
        Field zza4;
        int i22;
        char charAt15;
        int i23;
        char charAt16;
        int i24;
        char charAt17;
        int i25;
        char charAt18;
        if (zzjeVar instanceof zzjt) {
            zzjt zzjtVar = (zzjt) zzjeVar;
            int i26 = 0;
            boolean z2 = zzjtVar.zza() == zzhv.zze.zzi;
            String zzd = zzjtVar.zzd();
            int length = zzd.length();
            if (zzd.charAt(0) >= 55296) {
                int i27 = 1;
                while (true) {
                    i = i27 + 1;
                    if (zzd.charAt(i27) < 55296) {
                        break;
                    }
                    i27 = i;
                }
            } else {
                i = 1;
            }
            int i28 = i + 1;
            int charAt19 = zzd.charAt(i);
            if (charAt19 >= 55296) {
                int i29 = charAt19 & 8191;
                int i30 = 13;
                while (true) {
                    i25 = i28 + 1;
                    charAt18 = zzd.charAt(i28);
                    if (charAt18 < 55296) {
                        break;
                    }
                    i29 |= (charAt18 & 8191) << i30;
                    i30 += 13;
                    i28 = i25;
                }
                charAt19 = i29 | (charAt18 << i30);
                i28 = i25;
            }
            if (charAt19 == 0) {
                iArr = zza;
                i2 = 0;
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                charAt4 = 0;
                charAt5 = 0;
            } else {
                int i31 = i28 + 1;
                int charAt20 = zzd.charAt(i28);
                if (charAt20 >= 55296) {
                    int i32 = charAt20 & 8191;
                    int i33 = 13;
                    while (true) {
                        i10 = i31 + 1;
                        charAt13 = zzd.charAt(i31);
                        if (charAt13 < 55296) {
                            break;
                        }
                        i32 |= (charAt13 & 8191) << i33;
                        i33 += 13;
                        i31 = i10;
                    }
                    charAt20 = i32 | (charAt13 << i33);
                    i31 = i10;
                }
                int i34 = i31 + 1;
                int charAt21 = zzd.charAt(i31);
                if (charAt21 >= 55296) {
                    int i35 = charAt21 & 8191;
                    int i36 = 13;
                    while (true) {
                        i9 = i34 + 1;
                        charAt12 = zzd.charAt(i34);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i35 |= (charAt12 & 8191) << i36;
                        i36 += 13;
                        i34 = i9;
                    }
                    charAt21 = i35 | (charAt12 << i36);
                    i34 = i9;
                }
                int i37 = i34 + 1;
                charAt = zzd.charAt(i34);
                if (charAt >= 55296) {
                    int i38 = charAt & 8191;
                    int i39 = 13;
                    while (true) {
                        i8 = i37 + 1;
                        charAt11 = zzd.charAt(i37);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i38 |= (charAt11 & 8191) << i39;
                        i39 += 13;
                        i37 = i8;
                    }
                    charAt = i38 | (charAt11 << i39);
                    i37 = i8;
                }
                int i40 = i37 + 1;
                charAt2 = zzd.charAt(i37);
                if (charAt2 >= 55296) {
                    int i41 = charAt2 & 8191;
                    int i42 = 13;
                    while (true) {
                        i7 = i40 + 1;
                        charAt10 = zzd.charAt(i40);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i41 |= (charAt10 & 8191) << i42;
                        i42 += 13;
                        i40 = i7;
                    }
                    charAt2 = i41 | (charAt10 << i42);
                    i40 = i7;
                }
                int i43 = i40 + 1;
                charAt3 = zzd.charAt(i40);
                if (charAt3 >= 55296) {
                    int i44 = charAt3 & 8191;
                    int i45 = 13;
                    while (true) {
                        i6 = i43 + 1;
                        charAt9 = zzd.charAt(i43);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i44 |= (charAt9 & 8191) << i45;
                        i45 += 13;
                        i43 = i6;
                    }
                    charAt3 = i44 | (charAt9 << i45);
                    i43 = i6;
                }
                int i46 = i43 + 1;
                charAt4 = zzd.charAt(i43);
                if (charAt4 >= 55296) {
                    int i47 = charAt4 & 8191;
                    int i48 = 13;
                    while (true) {
                        i5 = i46 + 1;
                        charAt8 = zzd.charAt(i46);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i47 |= (charAt8 & 8191) << i48;
                        i48 += 13;
                        i46 = i5;
                    }
                    charAt4 = i47 | (charAt8 << i48);
                    i46 = i5;
                }
                int i49 = i46 + 1;
                int charAt22 = zzd.charAt(i46);
                if (charAt22 >= 55296) {
                    int i50 = charAt22 & 8191;
                    int i51 = 13;
                    while (true) {
                        i4 = i49 + 1;
                        charAt7 = zzd.charAt(i49);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i50 |= (charAt7 & 8191) << i51;
                        i51 += 13;
                        i49 = i4;
                    }
                    charAt22 = i50 | (charAt7 << i51);
                    i49 = i4;
                }
                int i52 = i49 + 1;
                charAt5 = zzd.charAt(i49);
                if (charAt5 >= 55296) {
                    int i53 = charAt5 & 8191;
                    int i54 = i52;
                    int i55 = 13;
                    while (true) {
                        i3 = i54 + 1;
                        charAt6 = zzd.charAt(i54);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i53 |= (charAt6 & 8191) << i55;
                        i55 += 13;
                        i54 = i3;
                    }
                    charAt5 = i53 | (charAt6 << i55);
                    i52 = i3;
                }
                i2 = (charAt20 << 1) + charAt21;
                iArr = new int[charAt5 + charAt4 + charAt22];
                i26 = charAt20;
                i28 = i52;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzjtVar.zze();
            Class<?> cls2 = zzjtVar.zzc().getClass();
            int i56 = i28;
            int[] iArr2 = new int[charAt3 * 3];
            Object[] objArr2 = new Object[charAt3 << 1];
            int i57 = charAt5 + charAt4;
            int i58 = i2;
            int i59 = charAt5;
            int i60 = i56;
            int i61 = i57;
            int i62 = 0;
            int i63 = 0;
            while (i60 < length) {
                int i64 = i60 + 1;
                int charAt23 = zzd.charAt(i60);
                if (charAt23 >= 55296) {
                    int i65 = charAt23 & 8191;
                    int i66 = i64;
                    int i67 = 13;
                    while (true) {
                        i24 = i66 + 1;
                        charAt17 = zzd.charAt(i66);
                        i11 = length;
                        if (charAt17 < 55296) {
                            break;
                        }
                        i65 |= (charAt17 & 8191) << i67;
                        i67 += 13;
                        i66 = i24;
                        length = i11;
                    }
                    charAt23 = i65 | (charAt17 << i67);
                    i12 = i24;
                } else {
                    i11 = length;
                    i12 = i64;
                }
                int i68 = i12 + 1;
                int charAt24 = zzd.charAt(i12);
                if (charAt24 >= 55296) {
                    int i69 = charAt24 & 8191;
                    int i70 = i68;
                    int i71 = 13;
                    while (true) {
                        i23 = i70 + 1;
                        charAt16 = zzd.charAt(i70);
                        i13 = charAt5;
                        if (charAt16 < 55296) {
                            break;
                        }
                        i69 |= (charAt16 & 8191) << i71;
                        i71 += 13;
                        i70 = i23;
                        charAt5 = i13;
                    }
                    charAt24 = i69 | (charAt16 << i71);
                    i14 = i23;
                } else {
                    i13 = charAt5;
                    i14 = i68;
                }
                int i72 = charAt24 & 255;
                int i73 = charAt2;
                if ((charAt24 & 1024) != 0) {
                    iArr[i62] = i63;
                    i62++;
                }
                int i74 = charAt;
                if (i72 >= 51) {
                    int i75 = i14 + 1;
                    int charAt25 = zzd.charAt(i14);
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i76 = charAt25 & 8191;
                        int i77 = 13;
                        while (true) {
                            i22 = i75 + 1;
                            charAt15 = zzd.charAt(i75);
                            if (charAt15 < c) {
                                break;
                            }
                            i76 |= (charAt15 & 8191) << i77;
                            i77 += 13;
                            i75 = i22;
                            c = 55296;
                        }
                        charAt25 = i76 | (charAt15 << i77);
                        i75 = i22;
                    }
                    int i78 = i72 - 51;
                    int i79 = i75;
                    if (i78 == 9 || i78 == 17) {
                        i21 = 1;
                        objArr2[((i63 / 3) << 1) + 1] = zze[i58];
                        i58++;
                    } else {
                        if (i78 == 12 && !z2) {
                            objArr2[((i63 / 3) << 1) + 1] = zze[i58];
                            i58++;
                        }
                        i21 = 1;
                    }
                    int i80 = charAt25 << i21;
                    Object obj = zze[i80];
                    if (obj instanceof Field) {
                        zza3 = (Field) obj;
                    } else {
                        zza3 = zza(cls2, (String) obj);
                        zze[i80] = zza3;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza3);
                    int i81 = i80 + 1;
                    Object obj2 = zze[i81];
                    if (obj2 instanceof Field) {
                        zza4 = (Field) obj2;
                    } else {
                        zza4 = zza(cls2, (String) obj2);
                        zze[i81] = zza4;
                    }
                    str = zzd;
                    i16 = (int) unsafe.objectFieldOffset(zza4);
                    z = z2;
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i17 = i79;
                    i18 = 0;
                } else {
                    int i82 = i58 + 1;
                    Field zza5 = zza(cls2, (String) zze[i58]);
                    if (i72 == 9 || i72 == 17) {
                        objArr2[((i63 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i72 == 27 || i72 == 49) {
                            i20 = i82 + 1;
                            objArr2[((i63 / 3) << 1) + 1] = zze[i82];
                        } else {
                            if (i72 == 12 || i72 == 30 || i72 == 44) {
                                if (!z2) {
                                    i20 = i82 + 1;
                                    objArr2[((i63 / 3) << 1) + 1] = zze[i82];
                                }
                            } else if (i72 == 50) {
                                int i83 = i59 + 1;
                                iArr[i59] = i63;
                                int i84 = (i63 / 3) << 1;
                                i20 = i82 + 1;
                                objArr2[i84] = zze[i82];
                                if ((charAt24 & 2048) != 0) {
                                    i82 = i20 + 1;
                                    objArr2[i84 + 1] = zze[i20];
                                    i59 = i83;
                                } else {
                                    i59 = i83;
                                }
                            }
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                            int i85 = i15;
                            if ((charAt24 & 4096) == 4096 || i72 > 17) {
                                str = zzd;
                                z = z2;
                                objArr = objArr2;
                                i16 = 1048575;
                                i17 = i14;
                                i18 = 0;
                            } else {
                                int i86 = i14 + 1;
                                int charAt26 = zzd.charAt(i14);
                                if (charAt26 >= 55296) {
                                    int i87 = charAt26 & 8191;
                                    int i88 = 13;
                                    while (true) {
                                        i19 = i86 + 1;
                                        charAt14 = zzd.charAt(i86);
                                        if (charAt14 < 55296) {
                                            break;
                                        }
                                        i87 |= (charAt14 & 8191) << i88;
                                        i88 += 13;
                                        i86 = i19;
                                    }
                                    charAt26 = i87 | (charAt14 << i88);
                                    i86 = i19;
                                }
                                int i89 = (i26 << 1) + (charAt26 / 32);
                                Object obj3 = zze[i89];
                                str = zzd;
                                if (obj3 instanceof Field) {
                                    zza2 = (Field) obj3;
                                } else {
                                    zza2 = zza(cls2, (String) obj3);
                                    zze[i89] = zza2;
                                }
                                z = z2;
                                objArr = objArr2;
                                i18 = charAt26 % 32;
                                i17 = i86;
                                i16 = (int) unsafe.objectFieldOffset(zza2);
                            }
                            if (i72 >= 18 && i72 <= 49) {
                                iArr[i61] = objectFieldOffset;
                                i61++;
                            }
                            i58 = i85;
                        }
                        i15 = i20;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                        int i852 = i15;
                        if ((charAt24 & 4096) == 4096) {
                        }
                        str = zzd;
                        z = z2;
                        objArr = objArr2;
                        i16 = 1048575;
                        i17 = i14;
                        i18 = 0;
                        if (i72 >= 18) {
                            iArr[i61] = objectFieldOffset;
                            i61++;
                        }
                        i58 = i852;
                    }
                    i15 = i82;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    int i8522 = i15;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    z = z2;
                    objArr = objArr2;
                    i16 = 1048575;
                    i17 = i14;
                    i18 = 0;
                    if (i72 >= 18) {
                    }
                    i58 = i8522;
                }
                int i90 = i63 + 1;
                iArr2[i63] = charAt23;
                int i91 = i90 + 1;
                int i92 = i26;
                iArr2[i90] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i72 << 20) | objectFieldOffset;
                int i93 = i91 + 1;
                iArr2[i91] = (i18 << 20) | i16;
                i60 = i17;
                i26 = i92;
                charAt2 = i73;
                objArr2 = objArr;
                charAt5 = i13;
                charAt = i74;
                z2 = z;
                i63 = i93;
                length = i11;
                zzd = str;
            }
            return new zzjk<>(iArr2, objArr2, charAt, charAt2, zzjtVar.zzc(), z2, false, iArr, charAt5, i57, zzjoVar, zziqVar, zzknVar, zzhkVar, zzizVar);
        }
        ((zzkk) zzjeVar).zza();
        int i94 = zzhv.zze.zzi;
        throw new NoSuchMethodError();
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

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzkt.zze(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzkt.zze(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.zzjx.zza(com.google.android.gms.internal.measurement.zzkt.zzf(r10, r6), com.google.android.gms.internal.measurement.zzkt.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.zzjx.zza(com.google.android.gms.internal.measurement.zzkt.zzf(r10, r6), com.google.android.gms.internal.measurement.zzkt.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zza(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zza(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zza(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zza(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.zzjx.zza(com.google.android.gms.internal.measurement.zzkt.zzf(r10, r6), com.google.android.gms.internal.measurement.zzkt.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.zzjx.zza(com.google.android.gms.internal.measurement.zzkt.zzf(r10, r6), com.google.android.gms.internal.measurement.zzkt.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.zzjx.zza(com.google.android.gms.internal.measurement.zzkt.zzf(r10, r6), com.google.android.gms.internal.measurement.zzkt.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zza(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zza(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.zzkt.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzkt.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzkt.zzd(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzkt.zzd(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.measurement.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(T t, T t2) {
        int length = this.zzc.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int zzd = zzd(i);
                long j = zzd & 1048575;
                switch ((zzd & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z = zzjx.zza(zzkt.zzf(t, j), zzkt.zzf(t2, j));
                        break;
                    case 50:
                        z = zzjx.zza(zzkt.zzf(t, j), zzkt.zzf(t2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long zze = zze(i) & 1048575;
                        if (zzkt.zza(t, zze) == zzkt.zza(t2, zze)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else if (this.zzq.zzb(t).equals(this.zzq.zzb(t2))) {
                if (this.zzh) {
                    return this.zzr.zza(t).equals(this.zzr.zza(t2));
                }
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final int zza(T t) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzd = zzd(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzd;
            int i5 = 37;
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzhx.zza(Double.doubleToLongBits(zzkt.zze(t, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzkt.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzhx.zza(zzkt.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzhx.zza(zzkt.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzkt.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzhx.zza(zzkt.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzkt.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzhx.zza(zzkt.zzc(t, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzkt.zzf(t, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zzf = zzkt.zzf(t, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zzkt.zzf(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzkt.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzkt.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzkt.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzhx.zza(zzkt.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzkt.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzhx.zza(zzkt.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zzf2 = zzkt.zzf(t, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zza2 = zzkt.zzf(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 50:
                    i = i2 * 53;
                    zza2 = zzkt.zzf(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 51:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzhx.zza(Double.doubleToLongBits(zzb(t, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzc(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzhx.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzhx.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzhx.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzhx.zza(zzf(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzkt.zzf(t, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkt.zzf(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkt.zzf(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzhx.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzhx.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzjk<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzkt.zzf(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzq.zzb(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzr.zza(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final void zzb(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzd = zzd(i);
            long j = 1048575 & zzd;
            int i2 = this.zzc[i];
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza(t, j, zzkt.zze(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zzd(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zzb(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zzb(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zza(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zzb(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zza(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza(t, j, zzkt.zzc(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza(t, j, zzkt.zzf(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza(t, j, zzkt.zzf(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zza(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zza(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zza(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zzb(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zza(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzjk<T>) t2, i)) {
                        zzkt.zza((Object) t, j, zzkt.zzb(t2, j));
                        zzb((zzjk<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzp.zza(t, t2, j);
                    break;
                case 50:
                    zzjx.zza(this.zzs, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza((zzjk<T>) t2, i2, i)) {
                        zzkt.zza(t, j, zzkt.zzf(t2, j));
                        zzb((zzjk<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzjk<T>) t2, i2, i)) {
                        zzkt.zza(t, j, zzkt.zzf(t2, j));
                        zzb((zzjk<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzjx.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzjx.zza(this.zzr, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzd = zzd(i) & 1048575;
        if (zza((zzjk<T>) t2, i)) {
            Object zzf = zzkt.zzf(t, zzd);
            Object zzf2 = zzkt.zzf(t2, zzd);
            if (zzf != null && zzf2 != null) {
                zzkt.zza(t, zzd, zzhx.zza(zzf, zzf2));
                zzb((zzjk<T>) t, i);
            } else if (zzf2 != null) {
                zzkt.zza(t, zzd, zzf2);
                zzb((zzjk<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzd = zzd(i);
        int i2 = this.zzc[i];
        long j = zzd & 1048575;
        if (zza((zzjk<T>) t2, i2, i)) {
            Object zzf = zzkt.zzf(t, j);
            Object zzf2 = zzkt.zzf(t2, j);
            if (zzf != null && zzf2 != null) {
                zzkt.zza(t, j, zzhx.zza(zzf, zzf2));
                zzb((zzjk<T>) t, i2, i);
            } else if (zzf2 != null) {
                zzkt.zza(t, j, zzf2);
                zzb((zzjk<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzjv
    public final int zzb(T t) {
        int i;
        long j;
        int zzd;
        int zzb2;
        int zzj;
        int zzh;
        int zzi;
        int zze;
        int zzg;
        int zzb3;
        int zzi2;
        int zze2;
        int zzg2;
        int i2 = 267386880;
        int i3 = 1048575;
        int i4 = 1;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzc.length) {
                int zzd2 = zzd(i5);
                int i7 = (zzd2 & i2) >>> 20;
                int i8 = this.zzc[i5];
                long j2 = zzd2 & 1048575;
                if (i7 >= zzhp.DOUBLE_LIST_PACKED.zza() && i7 <= zzhp.SINT64_LIST_PACKED.zza()) {
                    int i9 = this.zzc[i5 + 2];
                }
                switch (i7) {
                    case 0:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 1:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 2:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzd(i8, zzkt.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 3:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zze(i8, zzkt.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 4:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzf(i8, zzkt.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 5:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 6:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzi(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 7:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 8:
                        if (zza((zzjk<T>) t, i5)) {
                            Object zzf = zzkt.zzf(t, j2);
                            if (zzf instanceof zzgm) {
                                zzb3 = zzhf.zzc(i8, (zzgm) zzf);
                                break;
                            } else {
                                zzb3 = zzhf.zzb(i8, (String) zzf);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 9:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzjx.zza(i8, zzkt.zzf(t, j2), zza(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 10:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzc(i8, (zzgm) zzkt.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 11:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzg(i8, zzkt.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 12:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzk(i8, zzkt.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 13:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 14:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 15:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzh(i8, zzkt.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 16:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzf(i8, zzkt.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 17:
                        if (zza((zzjk<T>) t, i5)) {
                            zzb3 = zzhf.zzc(i8, (zzjg) zzkt.zzf(t, j2), zza(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 18:
                        zzb3 = zzjx.zzi(i8, zza(t, j2), false);
                        break;
                    case 19:
                        zzb3 = zzjx.zzh(i8, zza(t, j2), false);
                        break;
                    case 20:
                        zzb3 = zzjx.zza(i8, (List<Long>) zza(t, j2), false);
                        break;
                    case 21:
                        zzb3 = zzjx.zzb(i8, (List<Long>) zza(t, j2), false);
                        break;
                    case 22:
                        zzb3 = zzjx.zze(i8, zza(t, j2), false);
                        break;
                    case 23:
                        zzb3 = zzjx.zzi(i8, zza(t, j2), false);
                        break;
                    case 24:
                        zzb3 = zzjx.zzh(i8, zza(t, j2), false);
                        break;
                    case 25:
                        zzb3 = zzjx.zzj(i8, zza(t, j2), false);
                        break;
                    case 26:
                        zzb3 = zzjx.zza(i8, zza(t, j2));
                        break;
                    case 27:
                        zzb3 = zzjx.zza(i8, zza(t, j2), zza(i5));
                        break;
                    case 28:
                        zzb3 = zzjx.zzb(i8, zza(t, j2));
                        break;
                    case 29:
                        zzb3 = zzjx.zzf(i8, zza(t, j2), false);
                        break;
                    case 30:
                        zzb3 = zzjx.zzd(i8, zza(t, j2), false);
                        break;
                    case 31:
                        zzb3 = zzjx.zzh(i8, zza(t, j2), false);
                        break;
                    case 32:
                        zzb3 = zzjx.zzi(i8, zza(t, j2), false);
                        break;
                    case 33:
                        zzb3 = zzjx.zzg(i8, zza(t, j2), false);
                        break;
                    case 34:
                        zzb3 = zzjx.zzc(i8, zza(t, j2), false);
                        break;
                    case 35:
                        zzi2 = zzjx.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 36:
                        zzi2 = zzjx.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 37:
                        zzi2 = zzjx.zza((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 38:
                        zzi2 = zzjx.zzb((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 39:
                        zzi2 = zzjx.zze((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 40:
                        zzi2 = zzjx.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 41:
                        zzi2 = zzjx.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 42:
                        zzi2 = zzjx.zzj((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 43:
                        zzi2 = zzjx.zzf((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 44:
                        zzi2 = zzjx.zzd((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 45:
                        zzi2 = zzjx.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 46:
                        zzi2 = zzjx.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 47:
                        zzi2 = zzjx.zzg((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 48:
                        zzi2 = zzjx.zzc((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzhf.zze(i8);
                            zzg2 = zzhf.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 49:
                        zzb3 = zzjx.zzb(i8, (List<zzjg>) zza(t, j2), zza(i5));
                        break;
                    case 50:
                        zzb3 = this.zzs.zza(i8, zzkt.zzf(t, j2), zzb(i5));
                        break;
                    case 51:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 52:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 53:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzd(i8, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 54:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zze(i8, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 55:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzf(i8, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 56:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 57:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzi(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 58:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 59:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            Object zzf2 = zzkt.zzf(t, j2);
                            if (zzf2 instanceof zzgm) {
                                zzb3 = zzhf.zzc(i8, (zzgm) zzf2);
                                break;
                            } else {
                                zzb3 = zzhf.zzb(i8, (String) zzf2);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 60:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzjx.zza(i8, zzkt.zzf(t, j2), zza(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 61:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzc(i8, (zzgm) zzkt.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 62:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzg(i8, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 63:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzk(i8, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 64:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 65:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 66:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzh(i8, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 67:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzf(i8, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 68:
                        if (zza((zzjk<T>) t, i8, i5)) {
                            zzb3 = zzhf.zzc(i8, (zzjg) zzkt.zzf(t, j2), zza(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    default:
                        i5 += 3;
                        i2 = 267386880;
                }
                i6 += zzb3;
                i5 += 3;
                i2 = 267386880;
            }
            return i6 + zza((zzkn) this.zzq, (Object) t);
        }
        Unsafe unsafe2 = zzb;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (i10 < this.zzc.length) {
            int zzd3 = zzd(i10);
            int[] iArr = this.zzc;
            int i14 = iArr[i10];
            int i15 = (zzd3 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i10 + 2];
                int i17 = i16 & i3;
                i = i4 << (i16 >>> 20);
                if (i17 != i12) {
                    i13 = unsafe2.getInt(t, i17);
                    i12 = i17;
                }
            } else {
                i = 0;
            }
            long j3 = zzd3 & i3;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzhf.zzb(i14, 0.0d);
                        continue;
                        i10 += 3;
                        i3 = 1048575;
                        i4 = 1;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzhf.zzb(i14, 0.0f);
                        break;
                    }
                    break;
                case 2:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzhf.zzd(i14, unsafe2.getLong(t, j3));
                        i11 += zzd;
                        break;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzhf.zze(i14, unsafe2.getLong(t, j3));
                        i11 += zzd;
                        break;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzhf.zzf(i14, unsafe2.getInt(t, j3));
                        i11 += zzd;
                        break;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i) != 0) {
                        zzd = zzhf.zzg(i14, 0L);
                        i11 += zzd;
                        break;
                    }
                    break;
                case 6:
                    if ((i13 & i) != 0) {
                        i11 += zzhf.zzi(i14, 0);
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 7:
                    if ((i13 & i) != 0) {
                        i11 += zzhf.zzb(i14, true);
                        j = 0;
                        i10 += 3;
                        i3 = 1048575;
                        i4 = 1;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 8:
                    if ((i13 & i) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzgm) {
                            zzb2 = zzhf.zzc(i14, (zzgm) object);
                        } else {
                            zzb2 = zzhf.zzb(i14, (String) object);
                        }
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 9:
                    if ((i13 & i) != 0) {
                        zzb2 = zzjx.zza(i14, unsafe2.getObject(t, j3), zza(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 10:
                    if ((i13 & i) != 0) {
                        zzb2 = zzhf.zzc(i14, (zzgm) unsafe2.getObject(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 11:
                    if ((i13 & i) != 0) {
                        zzb2 = zzhf.zzg(i14, unsafe2.getInt(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 12:
                    if ((i13 & i) != 0) {
                        zzb2 = zzhf.zzk(i14, unsafe2.getInt(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 13:
                    if ((i13 & i) != 0) {
                        zzj = zzhf.zzj(i14, 0);
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 14:
                    if ((i13 & i) != 0) {
                        zzb2 = zzhf.zzh(i14, 0L);
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 15:
                    if ((i13 & i) != 0) {
                        zzb2 = zzhf.zzh(i14, unsafe2.getInt(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 16:
                    if ((i13 & i) != 0) {
                        zzb2 = zzhf.zzf(i14, unsafe2.getLong(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 17:
                    if ((i13 & i) != 0) {
                        zzb2 = zzhf.zzc(i14, (zzjg) unsafe2.getObject(t, j3), zza(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 18:
                    zzb2 = zzjx.zzi(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzb2;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 19:
                    zzh = zzjx.zzh(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 20:
                    zzh = zzjx.zza(i14, (List<Long>) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 21:
                    zzh = zzjx.zzb(i14, (List<Long>) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 22:
                    zzh = zzjx.zze(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 23:
                    zzh = zzjx.zzi(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 24:
                    zzh = zzjx.zzh(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 25:
                    zzh = zzjx.zzj(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 26:
                    zzb2 = zzjx.zza(i14, (List) unsafe2.getObject(t, j3));
                    i11 += zzb2;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 27:
                    zzb2 = zzjx.zza(i14, (List<?>) unsafe2.getObject(t, j3), zza(i10));
                    i11 += zzb2;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 28:
                    zzb2 = zzjx.zzb(i14, (List) unsafe2.getObject(t, j3));
                    i11 += zzb2;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 29:
                    zzb2 = zzjx.zzf(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzb2;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 30:
                    zzh = zzjx.zzd(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 31:
                    zzh = zzjx.zzh(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 32:
                    zzh = zzjx.zzi(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 33:
                    zzh = zzjx.zzg(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 34:
                    zzh = zzjx.zzc(i14, (List) unsafe2.getObject(t, j3), false);
                    i11 += zzh;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 35:
                    zzi = zzjx.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 36:
                    zzi = zzjx.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 37:
                    zzi = zzjx.zza((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 38:
                    zzi = zzjx.zzb((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 39:
                    zzi = zzjx.zze((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 40:
                    zzi = zzjx.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 41:
                    zzi = zzjx.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 42:
                    zzi = zzjx.zzj((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 43:
                    zzi = zzjx.zzf((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 44:
                    zzi = zzjx.zzd((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 45:
                    zzi = zzjx.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 46:
                    zzi = zzjx.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 47:
                    zzi = zzjx.zzg((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 48:
                    zzi = zzjx.zzc((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzhf.zze(i14);
                        zzg = zzhf.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 49:
                    zzb2 = zzjx.zzb(i14, (List) unsafe2.getObject(t, j3), zza(i10));
                    i11 += zzb2;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 50:
                    zzb2 = this.zzs.zza(i14, unsafe2.getObject(t, j3), zzb(i10));
                    i11 += zzb2;
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 51:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzb(i14, 0.0d);
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 52:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzj = zzhf.zzb(i14, 0.0f);
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 53:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzd(i14, zze(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 54:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zze(i14, zze(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 55:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzf(i14, zzd(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 56:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzg(i14, 0L);
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 57:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzj = zzhf.zzi(i14, 0);
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 58:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzj = zzhf.zzb(i14, true);
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 59:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzgm) {
                            zzb2 = zzhf.zzc(i14, (zzgm) object2);
                        } else {
                            zzb2 = zzhf.zzb(i14, (String) object2);
                        }
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 60:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzjx.zza(i14, unsafe2.getObject(t, j3), zza(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 61:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzc(i14, (zzgm) unsafe2.getObject(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 62:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzg(i14, zzd(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 63:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzk(i14, zzd(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 64:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzj = zzhf.zzj(i14, 0);
                        i11 += zzj;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 65:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzh(i14, 0L);
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 66:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzh(i14, zzd(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 67:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzf(i14, zze(t, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                case 68:
                    if (zza((zzjk<T>) t, i14, i10)) {
                        zzb2 = zzhf.zzc(i14, (zzjg) unsafe2.getObject(t, j3), zza(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
                default:
                    j = 0;
                    i10 += 3;
                    i3 = 1048575;
                    i4 = 1;
            }
            i10 += 3;
            i3 = 1048575;
            i4 = 1;
        }
        int i18 = 0;
        int zza2 = i11 + zza((zzkn) this.zzq, (Object) t);
        if (this.zzh) {
            zzho<?> zza3 = this.zzr.zza(t);
            for (int i19 = 0; i19 < zza3.zza.zzc(); i19++) {
                Map.Entry<?, Object> zzb4 = zza3.zza.zzb(i19);
                i18 += zzho.zza((zzhq) zzb4.getKey(), zzb4.getValue());
            }
            for (Map.Entry<?, Object> entry : zza3.zza.zzd()) {
                i18 += zzho.zza((zzhq) entry.getKey(), entry.getValue());
            }
            return zza2 + i18;
        }
        return zza2;
    }

    private static <UT, UB> int zza(zzkn<UT, UB> zzknVar, T t) {
        return zzknVar.zzf(zzknVar.zzb(t));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zzkt.zzf(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // com.google.android.gms.internal.measurement.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzlk zzlkVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, Object> entry2;
        int length2;
        if (zzlkVar.zza() == zzhv.zze.zzk) {
            zza(this.zzq, t, zzlkVar);
            if (this.zzh) {
                zzho<?> zza2 = this.zzr.zza(t);
                if (!zza2.zza.isEmpty()) {
                    it2 = zza2.zze();
                    entry2 = it2.next();
                    for (length2 = this.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzd = zzd(length2);
                        int i2 = this.zzc[length2];
                        while (entry2 != null && this.zzr.zza(entry2) > i2) {
                            this.zzr.zza(zzlkVar, entry2);
                            entry2 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((zzd & 267386880) >>> 20) {
                            case 0:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zza(i2, zzkt.zze(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zza(i2, zzkt.zzd(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zza(i2, zzkt.zzb(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zzc(i2, zzkt.zzb(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zzc(i2, zzkt.zza(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zzd(i2, zzkt.zzb(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zzd(i2, zzkt.zza(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zza(i2, zzkt.zzc(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zza((zzjk<T>) t, length2)) {
                                    zza(i2, zzkt.zzf(t, zzd & 1048575), zzlkVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zza(i2, zzkt.zzf(t, zzd & 1048575), zza(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zza(i2, (zzgm) zzkt.zzf(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zze(i2, zzkt.zza(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zzb(i2, zzkt.zza(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zza(i2, zzkt.zza(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zzb(i2, zzkt.zzb(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zzf(i2, zzkt.zza(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zze(i2, zzkt.zzb(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zza((zzjk<T>) t, length2)) {
                                    zzlkVar.zzb(i2, zzkt.zzf(t, zzd & 1048575), zza(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzjx.zza(this.zzc[length2], (List<Double>) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 19:
                                zzjx.zzb(this.zzc[length2], (List<Float>) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 20:
                                zzjx.zzc(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 21:
                                zzjx.zzd(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 22:
                                zzjx.zzh(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 23:
                                zzjx.zzf(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 24:
                                zzjx.zzk(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 25:
                                zzjx.zzn(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 26:
                                zzjx.zza(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar);
                                break;
                            case 27:
                                zzjx.zza(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, zza(length2));
                                break;
                            case 28:
                                zzjx.zzb(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar);
                                break;
                            case 29:
                                zzjx.zzi(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 30:
                                zzjx.zzm(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 31:
                                zzjx.zzl(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 32:
                                zzjx.zzg(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 33:
                                zzjx.zzj(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 34:
                                zzjx.zze(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, false);
                                break;
                            case 35:
                                zzjx.zza(this.zzc[length2], (List<Double>) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 36:
                                zzjx.zzb(this.zzc[length2], (List<Float>) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 37:
                                zzjx.zzc(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 38:
                                zzjx.zzd(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 39:
                                zzjx.zzh(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 40:
                                zzjx.zzf(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 41:
                                zzjx.zzk(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 42:
                                zzjx.zzn(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 43:
                                zzjx.zzi(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 44:
                                zzjx.zzm(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 45:
                                zzjx.zzl(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 46:
                                zzjx.zzg(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 47:
                                zzjx.zzj(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 48:
                                zzjx.zze(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, true);
                                break;
                            case 49:
                                zzjx.zzb(this.zzc[length2], (List) zzkt.zzf(t, zzd & 1048575), zzlkVar, zza(length2));
                                break;
                            case 50:
                                zza(zzlkVar, i2, zzkt.zzf(t, zzd & 1048575), length2);
                                break;
                            case 51:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zza(i2, zzb(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zza(i2, zzc(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zza(i2, zze(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zzc(i2, zze(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zzc(i2, zzd(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zzd(i2, zze(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zzd(i2, zzd(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zza(i2, zzf(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zza(i2, zzkt.zzf(t, zzd & 1048575), zzlkVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zza(i2, zzkt.zzf(t, zzd & 1048575), zza(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zza(i2, (zzgm) zzkt.zzf(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zze(i2, zzd(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zzb(i2, zzd(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zza(i2, zzd(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zzb(i2, zze(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zzf(i2, zzd(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zze(i2, zze(t, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza((zzjk<T>) t, i2, length2)) {
                                    zzlkVar.zzb(i2, zzkt.zzf(t, zzd & 1048575), zza(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.zzr.zza(zzlkVar, entry2);
                        entry2 = it2.hasNext() ? it2.next() : null;
                    }
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
        } else if (this.zzj) {
            if (this.zzh) {
                zzho<?> zza3 = this.zzr.zza(t);
                if (!zza3.zza.isEmpty()) {
                    it = zza3.zzd();
                    entry = it.next();
                    length = this.zzc.length;
                    for (i = 0; i < length; i += 3) {
                        int zzd2 = zzd(i);
                        int i3 = this.zzc[i];
                        while (entry != null && this.zzr.zza(entry) <= i3) {
                            this.zzr.zza(zzlkVar, entry);
                            entry = it.hasNext() ? it.next() : null;
                        }
                        switch ((zzd2 & 267386880) >>> 20) {
                            case 0:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zza(i3, zzkt.zze(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zza(i3, zzkt.zzd(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zza(i3, zzkt.zzb(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zzc(i3, zzkt.zzb(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zzc(i3, zzkt.zza(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zzd(i3, zzkt.zzb(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zzd(i3, zzkt.zza(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zza(i3, zzkt.zzc(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zza((zzjk<T>) t, i)) {
                                    zza(i3, zzkt.zzf(t, zzd2 & 1048575), zzlkVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zza(i3, zzkt.zzf(t, zzd2 & 1048575), zza(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zza(i3, (zzgm) zzkt.zzf(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zze(i3, zzkt.zza(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zzb(i3, zzkt.zza(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zza(i3, zzkt.zza(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zzb(i3, zzkt.zzb(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zzf(i3, zzkt.zza(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zze(i3, zzkt.zzb(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zza((zzjk<T>) t, i)) {
                                    zzlkVar.zzb(i3, zzkt.zzf(t, zzd2 & 1048575), zza(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzjx.zza(this.zzc[i], (List<Double>) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 19:
                                zzjx.zzb(this.zzc[i], (List<Float>) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 20:
                                zzjx.zzc(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 21:
                                zzjx.zzd(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 22:
                                zzjx.zzh(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 23:
                                zzjx.zzf(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 24:
                                zzjx.zzk(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 25:
                                zzjx.zzn(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 26:
                                zzjx.zza(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar);
                                break;
                            case 27:
                                zzjx.zza(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, zza(i));
                                break;
                            case 28:
                                zzjx.zzb(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar);
                                break;
                            case 29:
                                zzjx.zzi(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 30:
                                zzjx.zzm(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 31:
                                zzjx.zzl(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 32:
                                zzjx.zzg(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 33:
                                zzjx.zzj(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 34:
                                zzjx.zze(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, false);
                                break;
                            case 35:
                                zzjx.zza(this.zzc[i], (List<Double>) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 36:
                                zzjx.zzb(this.zzc[i], (List<Float>) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 37:
                                zzjx.zzc(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 38:
                                zzjx.zzd(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 39:
                                zzjx.zzh(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 40:
                                zzjx.zzf(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 41:
                                zzjx.zzk(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 42:
                                zzjx.zzn(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 43:
                                zzjx.zzi(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 44:
                                zzjx.zzm(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 45:
                                zzjx.zzl(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 46:
                                zzjx.zzg(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 47:
                                zzjx.zzj(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 48:
                                zzjx.zze(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, true);
                                break;
                            case 49:
                                zzjx.zzb(this.zzc[i], (List) zzkt.zzf(t, zzd2 & 1048575), zzlkVar, zza(i));
                                break;
                            case 50:
                                zza(zzlkVar, i3, zzkt.zzf(t, zzd2 & 1048575), i);
                                break;
                            case 51:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zza(i3, zzb(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zza(i3, zzc(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zza(i3, zze(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zzc(i3, zze(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zzc(i3, zzd(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zzd(i3, zze(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zzd(i3, zzd(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zza(i3, zzf(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zza(i3, zzkt.zzf(t, zzd2 & 1048575), zzlkVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zza(i3, zzkt.zzf(t, zzd2 & 1048575), zza(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zza(i3, (zzgm) zzkt.zzf(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zze(i3, zzd(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zzb(i3, zzd(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zza(i3, zzd(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zzb(i3, zze(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zzf(i3, zzd(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zze(i3, zze(t, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza((zzjk<T>) t, i3, i)) {
                                    zzlkVar.zzb(i3, zzkt.zzf(t, zzd2 & 1048575), zza(i));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        this.zzr.zza(zzlkVar, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    zza(this.zzq, t, zzlkVar);
                }
            }
            it = null;
            entry = null;
            length = this.zzc.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            zza(this.zzq, t, zzlkVar);
        } else {
            zzb((zzjk<T>) t, zzlkVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0495  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(T t, zzlk zzlkVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        int i2;
        if (this.zzh) {
            zzho<?> zza2 = this.zzr.zza(t);
            if (!zza2.zza.isEmpty()) {
                it = zza2.zzd();
                entry = it.next();
                length = this.zzc.length;
                Unsafe unsafe = zzb;
                int i3 = 1048575;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int zzd = zzd(i);
                    int[] iArr = this.zzc;
                    int i5 = iArr[i];
                    int i6 = (zzd & 267386880) >>> 20;
                    if (this.zzj || i6 > 17) {
                        i2 = 0;
                    } else {
                        int i7 = iArr[i + 2];
                        int i8 = i7 & 1048575;
                        if (i8 != i3) {
                            i4 = unsafe.getInt(t, i8);
                            i3 = i8;
                        }
                        i2 = 1 << (i7 >>> 20);
                    }
                    while (entry != null && this.zzr.zza(entry) <= i5) {
                        this.zzr.zza(zzlkVar, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    long j = zzd & 1048575;
                    switch (i6) {
                        case 0:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zza(i5, zzkt.zze(t, j));
                                continue;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zza(i5, zzkt.zzd(t, j));
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zza(i5, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zzc(i5, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zzc(i5, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zzd(i5, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zzd(i5, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zza(i5, zzkt.zzc(t, j));
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                zza(i5, unsafe.getObject(t, j), zzlkVar);
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zza(i5, unsafe.getObject(t, j), zza(i));
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zza(i5, (zzgm) unsafe.getObject(t, j));
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zze(i5, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zzb(i5, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zza(i5, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zzb(i5, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zzf(i5, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zze(i5, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                zzlkVar.zzb(i5, unsafe.getObject(t, j), zza(i));
                            } else {
                                continue;
                            }
                        case 18:
                            zzjx.zza(this.zzc[i], (List<Double>) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 19:
                            zzjx.zzb(this.zzc[i], (List<Float>) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 20:
                            zzjx.zzc(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 21:
                            zzjx.zzd(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 22:
                            zzjx.zzh(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 23:
                            zzjx.zzf(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 24:
                            zzjx.zzk(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 25:
                            zzjx.zzn(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 26:
                            zzjx.zza(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar);
                            break;
                        case 27:
                            zzjx.zza(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, zza(i));
                            break;
                        case 28:
                            zzjx.zzb(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar);
                            break;
                        case 29:
                            zzjx.zzi(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 30:
                            zzjx.zzm(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 31:
                            zzjx.zzl(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 32:
                            zzjx.zzg(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 33:
                            zzjx.zzj(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 34:
                            zzjx.zze(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, false);
                            break;
                        case 35:
                            zzjx.zza(this.zzc[i], (List<Double>) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 36:
                            zzjx.zzb(this.zzc[i], (List<Float>) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 37:
                            zzjx.zzc(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 38:
                            zzjx.zzd(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 39:
                            zzjx.zzh(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 40:
                            zzjx.zzf(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 41:
                            zzjx.zzk(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 42:
                            zzjx.zzn(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 43:
                            zzjx.zzi(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 44:
                            zzjx.zzm(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 45:
                            zzjx.zzl(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 46:
                            zzjx.zzg(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 47:
                            zzjx.zzj(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 48:
                            zzjx.zze(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, true);
                            break;
                        case 49:
                            zzjx.zzb(this.zzc[i], (List) unsafe.getObject(t, j), zzlkVar, zza(i));
                            break;
                        case 50:
                            zza(zzlkVar, i5, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zza(i5, zzb(t, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zza(i5, zzc(t, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zza(i5, zze(t, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zzc(i5, zze(t, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zzc(i5, zzd(t, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zzd(i5, zze(t, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zzd(i5, zzd(t, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zza(i5, zzf(t, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zza(i5, unsafe.getObject(t, j), zzlkVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zza(i5, unsafe.getObject(t, j), zza(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zza(i5, (zzgm) unsafe.getObject(t, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zze(i5, zzd(t, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zzb(i5, zzd(t, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zza(i5, zzd(t, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zzb(i5, zze(t, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zzf(i5, zzd(t, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zze(i5, zze(t, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zza((zzjk<T>) t, i5, i)) {
                                zzlkVar.zzb(i5, unsafe.getObject(t, j), zza(i));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.zzr.zza(zzlkVar, entry);
                    entry = it.hasNext() ? it.next() : null;
                }
                zza(this.zzq, t, zzlkVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzc.length;
        Unsafe unsafe2 = zzb;
        int i32 = 1048575;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        zza(this.zzq, t, zzlkVar);
    }

    private final <K, V> void zza(zzlk zzlkVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzlkVar.zza(i, this.zzs.zzf(zzb(i2)), this.zzs.zzb(obj));
        }
    }

    private static <UT, UB> void zza(zzkn<UT, UB> zzknVar, T t, zzlk zzlkVar) throws IOException {
        zzknVar.zza((zzkn<UT, UB>) zzknVar.zzb(t), zzlkVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final void zza(T t, zzjw zzjwVar, zzhi zzhiVar) throws IOException {
        if (zzhiVar == null) {
            throw null;
        }
        zzkn zzknVar = this.zzq;
        zzhk<?> zzhkVar = this.zzr;
        zzho<?> zzhoVar = null;
        Object obj = null;
        while (true) {
            try {
                int zza2 = zzjwVar.zza();
                int zzg = zzg(zza2);
                if (zzg >= 0) {
                    int zzd = zzd(zzg);
                    switch ((267386880 & zzd) >>> 20) {
                        case 0:
                            zzkt.zza(t, zzd & 1048575, zzjwVar.zzd());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 1:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zze());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 2:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzg());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 3:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzf());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 4:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzh());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 5:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzi());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 6:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzj());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 7:
                            zzkt.zza(t, zzd & 1048575, zzjwVar.zzk());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 8:
                            zza(t, zzd, zzjwVar);
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 9:
                            if (zza((zzjk<T>) t, zzg)) {
                                long j = zzd & 1048575;
                                zzkt.zza(t, j, zzhx.zza(zzkt.zzf(t, j), zzjwVar.zza(zza(zzg), zzhiVar)));
                                break;
                            } else {
                                zzkt.zza(t, zzd & 1048575, zzjwVar.zza(zza(zzg), zzhiVar));
                                zzb((zzjk<T>) t, zzg);
                                continue;
                            }
                        case 10:
                            zzkt.zza(t, zzd & 1048575, zzjwVar.zzn());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 11:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzo());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 12:
                            int zzp = zzjwVar.zzp();
                            zzic zzc = zzc(zzg);
                            if (zzc != null && !zzc.zza(zzp)) {
                                obj = zzjx.zza(zza2, zzp, obj, zzknVar);
                                break;
                            }
                            zzkt.zza((Object) t, zzd & 1048575, zzp);
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 13:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzq());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 14:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzr());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 15:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzs());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 16:
                            zzkt.zza((Object) t, zzd & 1048575, zzjwVar.zzt());
                            zzb((zzjk<T>) t, zzg);
                            continue;
                        case 17:
                            if (zza((zzjk<T>) t, zzg)) {
                                long j2 = zzd & 1048575;
                                zzkt.zza(t, j2, zzhx.zza(zzkt.zzf(t, j2), zzjwVar.zzb(zza(zzg), zzhiVar)));
                                break;
                            } else {
                                zzkt.zza(t, zzd & 1048575, zzjwVar.zzb(zza(zzg), zzhiVar));
                                zzb((zzjk<T>) t, zzg);
                                continue;
                            }
                        case 18:
                            zzjwVar.zza(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 19:
                            zzjwVar.zzb(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 20:
                            zzjwVar.zzd(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 21:
                            zzjwVar.zzc(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 22:
                            zzjwVar.zze(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 23:
                            zzjwVar.zzf(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 24:
                            zzjwVar.zzg(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 25:
                            zzjwVar.zzh(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 26:
                            if (zzf(zzd)) {
                                zzjwVar.zzj(this.zzp.zza(t, zzd & 1048575));
                                break;
                            } else {
                                zzjwVar.zzi(this.zzp.zza(t, zzd & 1048575));
                                continue;
                            }
                        case 27:
                            zzjwVar.zza(this.zzp.zza(t, zzd & 1048575), zza(zzg), zzhiVar);
                            continue;
                        case 28:
                            zzjwVar.zzk(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 29:
                            zzjwVar.zzl(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 30:
                            List<Integer> zza3 = this.zzp.zza(t, zzd & 1048575);
                            zzjwVar.zzm(zza3);
                            obj = zzjx.zza(zza2, zza3, zzc(zzg), obj, zzknVar);
                            continue;
                        case 31:
                            zzjwVar.zzn(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 32:
                            zzjwVar.zzo(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 33:
                            zzjwVar.zzp(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 34:
                            zzjwVar.zzq(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 35:
                            zzjwVar.zza(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 36:
                            zzjwVar.zzb(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 37:
                            zzjwVar.zzd(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 38:
                            zzjwVar.zzc(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 39:
                            zzjwVar.zze(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 40:
                            zzjwVar.zzf(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 41:
                            zzjwVar.zzg(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 42:
                            zzjwVar.zzh(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 43:
                            zzjwVar.zzl(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 44:
                            List<Integer> zza4 = this.zzp.zza(t, zzd & 1048575);
                            zzjwVar.zzm(zza4);
                            obj = zzjx.zza(zza2, zza4, zzc(zzg), obj, zzknVar);
                            continue;
                        case 45:
                            zzjwVar.zzn(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 46:
                            zzjwVar.zzo(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 47:
                            zzjwVar.zzp(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 48:
                            zzjwVar.zzq(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 49:
                            zzjwVar.zzb(this.zzp.zza(t, zzd & 1048575), zza(zzg), zzhiVar);
                            continue;
                        case 50:
                            Object zzb2 = zzb(zzg);
                            long zzd2 = zzd(zzg) & 1048575;
                            Object zzf = zzkt.zzf(t, zzd2);
                            if (zzf == null) {
                                zzf = this.zzs.zze(zzb2);
                                zzkt.zza(t, zzd2, zzf);
                            } else if (this.zzs.zzc(zzf)) {
                                Object zze = this.zzs.zze(zzb2);
                                this.zzs.zza(zze, zzf);
                                zzkt.zza(t, zzd2, zze);
                                zzf = zze;
                            }
                            zzjwVar.zza(this.zzs.zza(zzf), this.zzs.zzf(zzb2), zzhiVar);
                            continue;
                        case 51:
                            zzkt.zza(t, zzd & 1048575, Double.valueOf(zzjwVar.zzd()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 52:
                            zzkt.zza(t, zzd & 1048575, Float.valueOf(zzjwVar.zze()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 53:
                            zzkt.zza(t, zzd & 1048575, Long.valueOf(zzjwVar.zzg()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 54:
                            zzkt.zza(t, zzd & 1048575, Long.valueOf(zzjwVar.zzf()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 55:
                            zzkt.zza(t, zzd & 1048575, Integer.valueOf(zzjwVar.zzh()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 56:
                            zzkt.zza(t, zzd & 1048575, Long.valueOf(zzjwVar.zzi()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 57:
                            zzkt.zza(t, zzd & 1048575, Integer.valueOf(zzjwVar.zzj()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 58:
                            zzkt.zza(t, zzd & 1048575, Boolean.valueOf(zzjwVar.zzk()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 59:
                            zza(t, zzd, zzjwVar);
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 60:
                            if (zza((zzjk<T>) t, zza2, zzg)) {
                                long j3 = zzd & 1048575;
                                zzkt.zza(t, j3, zzhx.zza(zzkt.zzf(t, j3), zzjwVar.zza(zza(zzg), zzhiVar)));
                            } else {
                                zzkt.zza(t, zzd & 1048575, zzjwVar.zza(zza(zzg), zzhiVar));
                                zzb((zzjk<T>) t, zzg);
                            }
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 61:
                            zzkt.zza(t, zzd & 1048575, zzjwVar.zzn());
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 62:
                            zzkt.zza(t, zzd & 1048575, Integer.valueOf(zzjwVar.zzo()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 63:
                            int zzp2 = zzjwVar.zzp();
                            zzic zzc2 = zzc(zzg);
                            if (zzc2 != null && !zzc2.zza(zzp2)) {
                                obj = zzjx.zza(zza2, zzp2, obj, zzknVar);
                                break;
                            }
                            zzkt.zza(t, zzd & 1048575, Integer.valueOf(zzp2));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 64:
                            zzkt.zza(t, zzd & 1048575, Integer.valueOf(zzjwVar.zzq()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 65:
                            zzkt.zza(t, zzd & 1048575, Long.valueOf(zzjwVar.zzr()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 66:
                            zzkt.zza(t, zzd & 1048575, Integer.valueOf(zzjwVar.zzs()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 67:
                            zzkt.zza(t, zzd & 1048575, Long.valueOf(zzjwVar.zzt()));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        case 68:
                            zzkt.zza(t, zzd & 1048575, zzjwVar.zzb(zza(zzg), zzhiVar));
                            zzb((zzjk<T>) t, zza2, zzg);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzknVar.zza();
                                } catch (zzif unused) {
                                    zzknVar.zza(zzjwVar);
                                    if (obj == null) {
                                        obj = zzknVar.zzc(t);
                                    }
                                    if (!zzknVar.zza((zzkn) obj, zzjwVar)) {
                                        for (int i = this.zzm; i < this.zzn; i++) {
                                            obj = zza((Object) t, this.zzl[i], (int) obj, (zzkn<UT, int>) zzknVar);
                                        }
                                        if (obj != null) {
                                            zzknVar.zzb((Object) t, (T) obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzknVar.zza((zzkn) obj, zzjwVar)) {
                                for (int i2 = this.zzm; i2 < this.zzn; i2++) {
                                    obj = zza((Object) t, this.zzl[i2], (int) obj, (zzkn<UT, int>) zzknVar);
                                }
                                if (obj != null) {
                                    zzknVar.zzb((Object) t, (T) obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zza2 == Integer.MAX_VALUE) {
                    for (int i3 = this.zzm; i3 < this.zzn; i3++) {
                        obj = zza((Object) t, this.zzl[i3], (int) obj, (zzkn<UT, int>) zzknVar);
                    }
                    if (obj != null) {
                        zzknVar.zzb((Object) t, (T) obj);
                        return;
                    }
                    return;
                } else {
                    Object zza5 = !this.zzh ? null : zzhkVar.zza(zzhiVar, this.zzg, zza2);
                    if (zza5 != null) {
                        if (zzhoVar == null) {
                            zzhoVar = zzhkVar.zzb(t);
                        }
                        zzho<?> zzhoVar2 = zzhoVar;
                        obj = zzhkVar.zza(zzjwVar, zza5, zzhiVar, zzhoVar2, obj, zzknVar);
                        zzhoVar = zzhoVar2;
                    } else {
                        zzknVar.zza(zzjwVar);
                        if (obj == null) {
                            obj = zzknVar.zzc(t);
                        }
                        if (!zzknVar.zza((zzkn) obj, zzjwVar)) {
                            for (int i4 = this.zzm; i4 < this.zzn; i4++) {
                                obj = zza((Object) t, this.zzl[i4], (int) obj, (zzkn<UT, int>) zzknVar);
                            }
                            if (obj != null) {
                                zzknVar.zzb((Object) t, (T) obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzm; i5 < this.zzn; i5++) {
                    obj = zza((Object) t, this.zzl[i5], (int) obj, (zzkn<UT, int>) zzknVar);
                }
                if (obj != null) {
                    zzknVar.zzb((Object) t, (T) obj);
                }
                throw th;
            }
        }
    }

    private static zzkq zze(Object obj) {
        zzhv zzhvVar = (zzhv) obj;
        zzkq zzkqVar = zzhvVar.zzb;
        if (zzkqVar == zzkq.zza()) {
            zzkq zzb2 = zzkq.zzb();
            zzhvVar.zzb = zzb2;
            return zzb2;
        }
        return zzkqVar;
    }

    private static int zza(byte[] bArr, int i, int i2, zzle zzleVar, Class<?> cls, zzgl zzglVar) throws IOException {
        switch (zzjj.zza[zzleVar.ordinal()]) {
            case 1:
                int zzb2 = zzgi.zzb(bArr, i, zzglVar);
                zzglVar.zzc = Boolean.valueOf(zzglVar.zzb != 0);
                return zzb2;
            case 2:
                return zzgi.zze(bArr, i, zzglVar);
            case 3:
                zzglVar.zzc = Double.valueOf(zzgi.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzglVar.zzc = Integer.valueOf(zzgi.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzglVar.zzc = Long.valueOf(zzgi.zzb(bArr, i));
                return i + 8;
            case 8:
                zzglVar.zzc = Float.valueOf(zzgi.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza2 = zzgi.zza(bArr, i, zzglVar);
                zzglVar.zzc = Integer.valueOf(zzglVar.zza);
                return zza2;
            case 12:
            case 13:
                int zzb3 = zzgi.zzb(bArr, i, zzglVar);
                zzglVar.zzc = Long.valueOf(zzglVar.zzb);
                return zzb3;
            case 14:
                return zzgi.zza(zzjr.zza().zza((Class) cls), bArr, i, i2, zzglVar);
            case 15:
                int zza3 = zzgi.zza(bArr, i, zzglVar);
                zzglVar.zzc = Integer.valueOf(zzgy.zze(zzglVar.zza));
                return zza3;
            case 16:
                int zzb4 = zzgi.zzb(bArr, i, zzglVar);
                zzglVar.zzc = Long.valueOf(zzgy.zza(zzglVar.zzb));
                return zzb4;
            case 17:
                return zzgi.zzd(bArr, i, zzglVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0236 -> B:116:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016e -> B:67:0x016f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e8 -> B:96:0x01e9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzgl zzglVar) throws IOException {
        int zza2;
        int i8;
        int i9 = i;
        zzid zzidVar = (zzid) zzb.getObject(t, j2);
        if (!zzidVar.zza()) {
            int size = zzidVar.size();
            zzidVar = zzidVar.zza(size == 0 ? 10 : size << 1);
            zzb.putObject(t, j2, zzidVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzhg zzhgVar = (zzhg) zzidVar;
                    int zza3 = zzgi.zza(bArr, i9, zzglVar);
                    int i10 = zzglVar.zza + zza3;
                    while (zza3 < i10) {
                        zzhgVar.zza(zzgi.zzc(bArr, zza3));
                        zza3 += 8;
                    }
                    if (zza3 == i10) {
                        return zza3;
                    }
                    throw zzig.zza();
                }
                if (i5 == 1) {
                    zzhg zzhgVar2 = (zzhg) zzidVar;
                    zzhgVar2.zza(zzgi.zzc(bArr, i));
                    while (true) {
                        int i11 = i9 + 8;
                        if (i11 >= i2) {
                            return i11;
                        }
                        i9 = zzgi.zza(bArr, i11, zzglVar);
                        if (i3 != zzglVar.zza) {
                            return i11;
                        }
                        zzhgVar2.zza(zzgi.zzc(bArr, i9));
                    }
                }
                return i9;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzhu zzhuVar = (zzhu) zzidVar;
                    int zza4 = zzgi.zza(bArr, i9, zzglVar);
                    int i12 = zzglVar.zza + zza4;
                    while (zza4 < i12) {
                        zzhuVar.zza(zzgi.zzd(bArr, zza4));
                        zza4 += 4;
                    }
                    if (zza4 == i12) {
                        return zza4;
                    }
                    throw zzig.zza();
                }
                if (i5 == 5) {
                    zzhu zzhuVar2 = (zzhu) zzidVar;
                    zzhuVar2.zza(zzgi.zzd(bArr, i));
                    while (true) {
                        int i13 = i9 + 4;
                        if (i13 >= i2) {
                            return i13;
                        }
                        i9 = zzgi.zza(bArr, i13, zzglVar);
                        if (i3 != zzglVar.zza) {
                            return i13;
                        }
                        zzhuVar2.zza(zzgi.zzd(bArr, i9));
                    }
                }
                return i9;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zziu zziuVar = (zziu) zzidVar;
                    int zza5 = zzgi.zza(bArr, i9, zzglVar);
                    int i14 = zzglVar.zza + zza5;
                    while (zza5 < i14) {
                        zza5 = zzgi.zzb(bArr, zza5, zzglVar);
                        zziuVar.zza(zzglVar.zzb);
                    }
                    if (zza5 == i14) {
                        return zza5;
                    }
                    throw zzig.zza();
                }
                if (i5 == 0) {
                    zziu zziuVar2 = (zziu) zzidVar;
                    int zzb2 = zzgi.zzb(bArr, i9, zzglVar);
                    zziuVar2.zza(zzglVar.zzb);
                    while (zzb2 < i2) {
                        int zza6 = zzgi.zza(bArr, zzb2, zzglVar);
                        if (i3 != zzglVar.zza) {
                            return zzb2;
                        }
                        zzb2 = zzgi.zzb(bArr, zza6, zzglVar);
                        zziuVar2.zza(zzglVar.zzb);
                    }
                    return zzb2;
                }
                return i9;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzgi.zza(bArr, i9, zzidVar, zzglVar);
                }
                if (i5 == 0) {
                    return zzgi.zza(i3, bArr, i, i2, zzidVar, zzglVar);
                }
                return i9;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zziu zziuVar3 = (zziu) zzidVar;
                    int zza7 = zzgi.zza(bArr, i9, zzglVar);
                    int i15 = zzglVar.zza + zza7;
                    while (zza7 < i15) {
                        zziuVar3.zza(zzgi.zzb(bArr, zza7));
                        zza7 += 8;
                    }
                    if (zza7 == i15) {
                        return zza7;
                    }
                    throw zzig.zza();
                }
                if (i5 == 1) {
                    zziu zziuVar4 = (zziu) zzidVar;
                    zziuVar4.zza(zzgi.zzb(bArr, i));
                    while (true) {
                        int i16 = i9 + 8;
                        if (i16 >= i2) {
                            return i16;
                        }
                        i9 = zzgi.zza(bArr, i16, zzglVar);
                        if (i3 != zzglVar.zza) {
                            return i16;
                        }
                        zziuVar4.zza(zzgi.zzb(bArr, i9));
                    }
                }
                return i9;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzhy zzhyVar = (zzhy) zzidVar;
                    int zza8 = zzgi.zza(bArr, i9, zzglVar);
                    int i17 = zzglVar.zza + zza8;
                    while (zza8 < i17) {
                        zzhyVar.zzd(zzgi.zza(bArr, zza8));
                        zza8 += 4;
                    }
                    if (zza8 == i17) {
                        return zza8;
                    }
                    throw zzig.zza();
                }
                if (i5 == 5) {
                    zzhy zzhyVar2 = (zzhy) zzidVar;
                    zzhyVar2.zzd(zzgi.zza(bArr, i));
                    while (true) {
                        int i18 = i9 + 4;
                        if (i18 >= i2) {
                            return i18;
                        }
                        i9 = zzgi.zza(bArr, i18, zzglVar);
                        if (i3 != zzglVar.zza) {
                            return i18;
                        }
                        zzhyVar2.zzd(zzgi.zza(bArr, i9));
                    }
                }
                return i9;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzgk zzgkVar = (zzgk) zzidVar;
                    zza2 = zzgi.zza(bArr, i9, zzglVar);
                    int i19 = zzglVar.zza + zza2;
                    while (zza2 < i19) {
                        zza2 = zzgi.zzb(bArr, zza2, zzglVar);
                        zzgkVar.zza(zzglVar.zzb != 0);
                    }
                    if (zza2 != i19) {
                        throw zzig.zza();
                    }
                    return zza2;
                }
                if (i5 == 0) {
                    zzgk zzgkVar2 = (zzgk) zzidVar;
                    i9 = zzgi.zzb(bArr, i9, zzglVar);
                    zzgkVar2.zza(zzglVar.zzb != 0);
                    while (i9 < i2) {
                        int zza9 = zzgi.zza(bArr, i9, zzglVar);
                        if (i3 == zzglVar.zza) {
                            i9 = zzgi.zzb(bArr, zza9, zzglVar);
                            zzgkVar2.zza(zzglVar.zzb != 0);
                        }
                    }
                }
                return i9;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i9 = zzgi.zza(bArr, i9, zzglVar);
                        int i20 = zzglVar.zza;
                        if (i20 < 0) {
                            throw zzig.zzb();
                        }
                        if (i20 == 0) {
                            zzidVar.add("");
                            while (i9 < i2) {
                                int zza10 = zzgi.zza(bArr, i9, zzglVar);
                                if (i3 == zzglVar.zza) {
                                    i9 = zzgi.zza(bArr, zza10, zzglVar);
                                    i20 = zzglVar.zza;
                                    if (i20 < 0) {
                                        throw zzig.zzb();
                                    }
                                    if (i20 == 0) {
                                        zzidVar.add("");
                                    } else {
                                        zzidVar.add(new String(bArr, i9, i20, zzhx.zza));
                                        i9 += i20;
                                        while (i9 < i2) {
                                        }
                                    }
                                }
                            }
                        } else {
                            zzidVar.add(new String(bArr, i9, i20, zzhx.zza));
                            i9 += i20;
                            while (i9 < i2) {
                            }
                        }
                    } else {
                        i9 = zzgi.zza(bArr, i9, zzglVar);
                        int i21 = zzglVar.zza;
                        if (i21 < 0) {
                            throw zzig.zzb();
                        }
                        if (i21 == 0) {
                            zzidVar.add("");
                            while (i9 < i2) {
                                int zza11 = zzgi.zza(bArr, i9, zzglVar);
                                if (i3 == zzglVar.zza) {
                                    i9 = zzgi.zza(bArr, zza11, zzglVar);
                                    int i22 = zzglVar.zza;
                                    if (i22 < 0) {
                                        throw zzig.zzb();
                                    }
                                    if (i22 == 0) {
                                        zzidVar.add("");
                                    } else {
                                        i8 = i9 + i22;
                                        if (!zzkw.zza(bArr, i9, i8)) {
                                            throw zzig.zzh();
                                        }
                                        zzidVar.add(new String(bArr, i9, i22, zzhx.zza));
                                        i9 = i8;
                                        while (i9 < i2) {
                                        }
                                    }
                                }
                            }
                        } else {
                            i8 = i9 + i21;
                            if (!zzkw.zza(bArr, i9, i8)) {
                                throw zzig.zzh();
                            }
                            zzidVar.add(new String(bArr, i9, i21, zzhx.zza));
                            i9 = i8;
                            while (i9 < i2) {
                            }
                        }
                    }
                }
                return i9;
            case 27:
                if (i5 == 2) {
                    return zzgi.zza(zza(i6), i3, bArr, i, i2, zzidVar, zzglVar);
                }
                return i9;
            case 28:
                if (i5 == 2) {
                    int zza12 = zzgi.zza(bArr, i9, zzglVar);
                    int i23 = zzglVar.zza;
                    if (i23 < 0) {
                        throw zzig.zzb();
                    }
                    if (i23 <= bArr.length - zza12) {
                        if (i23 == 0) {
                            zzidVar.add(zzgm.zza);
                            while (zza12 < i2) {
                                int zza13 = zzgi.zza(bArr, zza12, zzglVar);
                                if (i3 != zzglVar.zza) {
                                    return zza12;
                                }
                                zza12 = zzgi.zza(bArr, zza13, zzglVar);
                                i23 = zzglVar.zza;
                                if (i23 < 0) {
                                    throw zzig.zzb();
                                }
                                if (i23 > bArr.length - zza12) {
                                    throw zzig.zza();
                                }
                                if (i23 == 0) {
                                    zzidVar.add(zzgm.zza);
                                } else {
                                    zzidVar.add(zzgm.zza(bArr, zza12, i23));
                                    zza12 += i23;
                                    while (zza12 < i2) {
                                    }
                                }
                            }
                            return zza12;
                        }
                        zzidVar.add(zzgm.zza(bArr, zza12, i23));
                        zza12 += i23;
                        while (zza12 < i2) {
                        }
                        return zza12;
                    }
                    throw zzig.zza();
                }
                return i9;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zza2 = zzgi.zza(i3, bArr, i, i2, zzidVar, zzglVar);
                    }
                    return i9;
                }
                zza2 = zzgi.zza(bArr, i9, zzidVar, zzglVar);
                zzhv zzhvVar = (zzhv) t;
                zzkq zzkqVar = zzhvVar.zzb;
                if (zzkqVar == zzkq.zza()) {
                    zzkqVar = null;
                }
                zzkq zzkqVar2 = (zzkq) zzjx.zza(i4, zzidVar, zzc(i6), zzkqVar, this.zzq);
                if (zzkqVar2 != null) {
                    zzhvVar.zzb = zzkqVar2;
                }
                return zza2;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzhy zzhyVar3 = (zzhy) zzidVar;
                    int zza14 = zzgi.zza(bArr, i9, zzglVar);
                    int i24 = zzglVar.zza + zza14;
                    while (zza14 < i24) {
                        zza14 = zzgi.zza(bArr, zza14, zzglVar);
                        zzhyVar3.zzd(zzgy.zze(zzglVar.zza));
                    }
                    if (zza14 == i24) {
                        return zza14;
                    }
                    throw zzig.zza();
                }
                if (i5 == 0) {
                    zzhy zzhyVar4 = (zzhy) zzidVar;
                    int zza15 = zzgi.zza(bArr, i9, zzglVar);
                    zzhyVar4.zzd(zzgy.zze(zzglVar.zza));
                    while (zza15 < i2) {
                        int zza16 = zzgi.zza(bArr, zza15, zzglVar);
                        if (i3 != zzglVar.zza) {
                            return zza15;
                        }
                        zza15 = zzgi.zza(bArr, zza16, zzglVar);
                        zzhyVar4.zzd(zzgy.zze(zzglVar.zza));
                    }
                    return zza15;
                }
                return i9;
            case 34:
            case 48:
                if (i5 == 2) {
                    zziu zziuVar5 = (zziu) zzidVar;
                    int zza17 = zzgi.zza(bArr, i9, zzglVar);
                    int i25 = zzglVar.zza + zza17;
                    while (zza17 < i25) {
                        zza17 = zzgi.zzb(bArr, zza17, zzglVar);
                        zziuVar5.zza(zzgy.zza(zzglVar.zzb));
                    }
                    if (zza17 == i25) {
                        return zza17;
                    }
                    throw zzig.zza();
                }
                if (i5 == 0) {
                    zziu zziuVar6 = (zziu) zzidVar;
                    int zzb3 = zzgi.zzb(bArr, i9, zzglVar);
                    zziuVar6.zza(zzgy.zza(zzglVar.zzb));
                    while (zzb3 < i2) {
                        int zza18 = zzgi.zza(bArr, zzb3, zzglVar);
                        if (i3 != zzglVar.zza) {
                            return zzb3;
                        }
                        zzb3 = zzgi.zzb(bArr, zza18, zzglVar);
                        zziuVar6.zza(zzgy.zza(zzglVar.zzb));
                    }
                    return zzb3;
                }
                return i9;
            case 49:
                if (i5 == 3) {
                    zzjv zza19 = zza(i6);
                    int i26 = (i3 & (-8)) | 4;
                    i9 = zzgi.zza(zza19, bArr, i, i2, i26, zzglVar);
                    zzidVar.add(zzglVar.zzc);
                    while (i9 < i2) {
                        int zza20 = zzgi.zza(bArr, i9, zzglVar);
                        if (i3 == zzglVar.zza) {
                            i9 = zzgi.zza(zza19, bArr, zza20, i2, i26, zzglVar);
                            zzidVar.add(zzglVar.zzc);
                        }
                    }
                }
                return i9;
            default:
                return i9;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzgl zzglVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzb2 = zzb(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzs.zzc(object)) {
            Object zze = this.zzs.zze(zzb2);
            this.zzs.zza(zze, object);
            unsafe.putObject(t, j, zze);
            object = zze;
        }
        zzix<?, ?> zzf = this.zzs.zzf(zzb2);
        Map<?, ?> zza2 = this.zzs.zza(object);
        int zza3 = zzgi.zza(bArr, i, zzglVar);
        int i4 = zzglVar.zza;
        if (i4 < 0 || i4 > i2 - zza3) {
            throw zzig.zza();
        }
        int i5 = i4 + zza3;
        Object obj = (K) zzf.zzb;
        Object obj2 = (V) zzf.zzd;
        while (zza3 < i5) {
            int i6 = zza3 + 1;
            int i7 = bArr[zza3];
            if (i7 < 0) {
                i6 = zzgi.zza(i7, bArr, i6, zzglVar);
                i7 = zzglVar.zza;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzf.zza.zzb()) {
                    zza3 = zza(bArr, i8, i2, zzf.zza, (Class<?>) null, zzglVar);
                    obj = (K) zzglVar.zzc;
                } else {
                    zza3 = zzgi.zza(i7, bArr, i8, i2, zzglVar);
                }
            } else {
                if (i9 == 2 && i10 == zzf.zzc.zzb()) {
                    zza3 = zza(bArr, i8, i2, zzf.zzc, zzf.zzd.getClass(), zzglVar);
                    obj2 = zzglVar.zzc;
                }
                zza3 = zzgi.zza(i7, bArr, i8, i2, zzglVar);
            }
        }
        if (zza3 != i5) {
            throw zzig.zzg();
        }
        zza2.put(obj, obj2);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgl zzglVar) throws IOException {
        int zzb2;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzgi.zzc(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzgi.zzd(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb2 = zzgi.zzb(bArr, i, zzglVar);
                    unsafe.putObject(t, j, Long.valueOf(zzglVar.zzb));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb2 = zzgi.zza(bArr, i, zzglVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzglVar.zza));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzgi.zzb(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzgi.zza(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb2 = zzgi.zzb(bArr, i, zzglVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzglVar.zzb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza2 = zzgi.zza(bArr, i, zzglVar);
                    int i9 = zzglVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzkw.zza(bArr, zza2, zza2 + i9)) {
                        throw zzig.zzh();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zza2, i9, zzhx.zza));
                        zza2 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza3 = zzgi.zza(zza(i8), bArr, i, i2, zzglVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzglVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzhx.zza(object, zzglVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza3;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb2 = zzgi.zze(bArr, i, zzglVar);
                    unsafe.putObject(t, j, zzglVar.zzc);
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza4 = zzgi.zza(bArr, i, zzglVar);
                    int i10 = zzglVar.zza;
                    zzic zzc = zzc(i8);
                    if (zzc == null || zzc.zza(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        zzb2 = zza4;
                        unsafe.putInt(t, j2, i4);
                        return zzb2;
                    }
                    zze(t).zza(i3, Long.valueOf(i10));
                    return zza4;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb2 = zzgi.zza(bArr, i, zzglVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzgy.zze(zzglVar.zza)));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb2 = zzgi.zzb(bArr, i, zzglVar);
                    unsafe.putObject(t, j, Long.valueOf(zzgy.zza(zzglVar.zzb)));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb2 = zzgi.zza(zza(i8), bArr, i, i2, (i3 & (-8)) | 4, zzglVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzglVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzhx.zza(object2, zzglVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzjv zza(int i) {
        int i2 = (i / 3) << 1;
        zzjv zzjvVar = (zzjv) this.zzd[i2];
        if (zzjvVar != null) {
            return zzjvVar;
        }
        zzjv<T> zza2 = zzjr.zza().zza((Class) ((Class) this.zzd[i2 + 1]));
        this.zzd[i2] = zza2;
        return zza2;
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private final zzic zzc(int i) {
        return (zzic) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04da, code lost:
        if (r6 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04dc, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04e2, code lost:
        r1 = null;
        r2 = r9.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04e7, code lost:
        if (r2 >= r9.zzn) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04e9, code lost:
        r1 = (com.google.android.gms.internal.measurement.zzkq) r9.zza((java.lang.Object) r12, r9.zzl[r2], (int) r1, (com.google.android.gms.internal.measurement.zzkn<UT, int>) r9.zzq);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04f8, code lost:
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04fa, code lost:
        r9.zzq.zzb((java.lang.Object) r12, (T) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04ff, code lost:
        if (r7 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0503, code lost:
        if (r0 != r31) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x050a, code lost:
        throw com.google.android.gms.internal.measurement.zzig.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x050d, code lost:
        if (r0 > r31) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x050f, code lost:
        if (r3 != r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0511, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0517, code lost:
        throw com.google.android.gms.internal.measurement.zzig.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(T t, byte[] bArr, int i, int i2, int i3, zzgl zzglVar) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        zzjk<T> zzjkVar;
        int i5;
        byte b;
        int zzg;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        T t3;
        int i11;
        zzgl zzglVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        zzgl zzglVar3;
        zzgl zzglVar4;
        int zzb2;
        int i16;
        zzgl zzglVar5;
        int i17;
        int i18;
        int i19;
        zzjk<T> zzjkVar2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i20 = i2;
        int i21 = i3;
        zzgl zzglVar6 = zzglVar;
        Unsafe unsafe2 = zzb;
        int i22 = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (true) {
            if (i22 < i20) {
                int i28 = i22 + 1;
                byte b2 = bArr2[i22];
                if (b2 < 0) {
                    int zza2 = zzgi.zza(b2, bArr2, i28, zzglVar6);
                    b = zzglVar6.zza;
                    i28 = zza2;
                } else {
                    b = b2;
                }
                int i29 = b >>> 3;
                int i30 = b & 7;
                if (i29 > i23) {
                    zzg = zzjkVar2.zza(i29, i24 / 3);
                } else {
                    zzg = zzjkVar2.zzg(i29);
                }
                int i31 = zzg;
                if (i31 == -1) {
                    i6 = i29;
                    i7 = i28;
                    i8 = b;
                    i9 = i26;
                    unsafe = unsafe2;
                    i4 = i21;
                    i10 = 0;
                } else {
                    int[] iArr = zzjkVar2.zzc;
                    int i32 = iArr[i31 + 1];
                    int i33 = (i32 & 267386880) >>> 20;
                    int i34 = b;
                    long j = i32 & 1048575;
                    if (i33 <= 17) {
                        int i35 = iArr[i31 + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i27) {
                            if (i27 != 1048575) {
                                unsafe2.putInt(t4, i27, i26);
                            }
                            i26 = unsafe2.getInt(t4, i37);
                            i12 = i37;
                        } else {
                            i12 = i27;
                        }
                        int i38 = i26;
                        switch (i33) {
                            case 0:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzglVar4 = zzglVar;
                                if (i30 != 1) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    zzkt.zza(t4, j, zzgi.zzc(bArr2, i28));
                                    i22 = i28 + 8;
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzglVar6 = zzglVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                }
                            case 1:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzglVar4 = zzglVar;
                                if (i30 != 5) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    zzkt.zza((Object) t4, j, zzgi.zzd(bArr2, i28));
                                    i22 = i28 + 4;
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzglVar6 = zzglVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzglVar4 = zzglVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    zzb2 = zzgi.zzb(bArr2, i28, zzglVar4);
                                    unsafe2.putLong(t, j, zzglVar4.zzb);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i22 = zzb2;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzglVar6 = zzglVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzglVar4 = zzglVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzgi.zza(bArr2, i28, zzglVar4);
                                    unsafe2.putInt(t4, j, zzglVar4.zza);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzglVar6 = zzglVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzglVar4 = zzglVar;
                                if (i30 != 1) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    unsafe2.putLong(t, j, zzgi.zzb(bArr2, i28));
                                    i22 = i28 + 8;
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzglVar6 = zzglVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                i16 = i2;
                                zzglVar5 = zzglVar;
                                if (i30 != 5) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    unsafe2.putInt(t4, j, zzgi.zza(bArr2, i28));
                                    i22 = i28 + 4;
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    zzglVar6 = zzglVar5;
                                    i20 = i16;
                                    i24 = i14;
                                    i21 = i3;
                                    break;
                                }
                            case 7:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                i16 = i2;
                                zzglVar5 = zzglVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    int zzb3 = zzgi.zzb(bArr2, i28, zzglVar5);
                                    zzkt.zza(t4, j, zzglVar5.zzb != 0);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i22 = zzb3;
                                    i25 = i8;
                                    i23 = i13;
                                    zzglVar6 = zzglVar5;
                                    i20 = i16;
                                    i24 = i14;
                                    i21 = i3;
                                    break;
                                }
                            case 8:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                i16 = i2;
                                zzglVar5 = zzglVar;
                                if (i30 != 2) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    if ((i32 & 536870912) == 0) {
                                        i22 = zzgi.zzc(bArr2, i28, zzglVar5);
                                    } else {
                                        i22 = zzgi.zzd(bArr2, i28, zzglVar5);
                                    }
                                    unsafe2.putObject(t4, j, zzglVar5.zzc);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    zzglVar6 = zzglVar5;
                                    i20 = i16;
                                    i24 = i14;
                                    i21 = i3;
                                    break;
                                }
                            case 9:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzglVar5 = zzglVar;
                                if (i30 != 2) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i16 = i2;
                                    i22 = zzgi.zza(zzjkVar2.zza(i14), bArr2, i28, i16, zzglVar5);
                                    if ((i38 & i36) == 0) {
                                        unsafe2.putObject(t4, j, zzglVar5.zzc);
                                    } else {
                                        unsafe2.putObject(t4, j, zzhx.zza(unsafe2.getObject(t4, j), zzglVar5.zzc));
                                    }
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    zzglVar6 = zzglVar5;
                                    i20 = i16;
                                    i24 = i14;
                                    i21 = i3;
                                    break;
                                }
                            case 10:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzglVar4 = zzglVar;
                                if (i30 != 2) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzgi.zze(bArr2, i28, zzglVar4);
                                    unsafe2.putObject(t4, j, zzglVar4.zzc);
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzglVar6 = zzglVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                }
                            case 12:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzglVar4 = zzglVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzgi.zza(bArr2, i28, zzglVar4);
                                    int i39 = zzglVar4.zza;
                                    zzic zzc = zzjkVar2.zzc(i14);
                                    if (zzc == null || zzc.zza(i39)) {
                                        unsafe2.putInt(t4, j, i39);
                                        i26 = i38 | i36;
                                        i27 = i15;
                                        i25 = i8;
                                        i23 = i13;
                                        i24 = i14;
                                        zzglVar6 = zzglVar4;
                                        i20 = i2;
                                        i21 = i3;
                                        break;
                                    } else {
                                        zze(t).zza(i8, Long.valueOf(i39));
                                        i26 = i38;
                                        i25 = i8;
                                        i23 = i13;
                                        i24 = i14;
                                        zzglVar6 = zzglVar4;
                                        i27 = i15;
                                        i20 = i2;
                                        i21 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                bArr2 = bArr;
                                zzglVar4 = zzglVar;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzgi.zza(bArr2, i28, zzglVar4);
                                    unsafe2.putInt(t4, j, zzgy.zze(zzglVar4.zza));
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzglVar6 = zzglVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                }
                            case 16:
                                i13 = i29;
                                i14 = i31;
                                if (i30 != 0) {
                                    i15 = i12;
                                    i8 = i34;
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    zzb2 = zzgi.zzb(bArr2, i28, zzglVar);
                                    zzglVar4 = zzglVar;
                                    i15 = i12;
                                    i8 = i34;
                                    unsafe2.putLong(t, j, zzgy.zza(zzglVar.zzb));
                                    i26 = i38 | i36;
                                    i27 = i15;
                                    i22 = zzb2;
                                    i25 = i8;
                                    i23 = i13;
                                    i24 = i14;
                                    zzglVar6 = zzglVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                }
                            case 17:
                                if (i30 != 3) {
                                    i13 = i29;
                                    i14 = i31;
                                    i15 = i12;
                                    i8 = i34;
                                    i4 = i3;
                                    i7 = i28;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i10 = i14;
                                    i27 = i15;
                                    i6 = i13;
                                    break;
                                } else {
                                    i22 = zzgi.zza(zzjkVar2.zza(i31), bArr, i28, i2, (i29 << 3) | 4, zzglVar);
                                    if ((i38 & i36) == 0) {
                                        zzglVar3 = zzglVar;
                                        unsafe2.putObject(t4, j, zzglVar3.zzc);
                                    } else {
                                        zzglVar3 = zzglVar;
                                        unsafe2.putObject(t4, j, zzhx.zza(unsafe2.getObject(t4, j), zzglVar3.zzc));
                                    }
                                    i26 = i38 | i36;
                                    bArr2 = bArr;
                                    i20 = i2;
                                    i25 = i34;
                                    i27 = i12;
                                    i23 = i29;
                                    i24 = i31;
                                    i21 = i3;
                                    zzglVar6 = zzglVar3;
                                    break;
                                }
                            default:
                                i13 = i29;
                                i14 = i31;
                                i15 = i12;
                                i8 = i34;
                                i4 = i3;
                                i7 = i28;
                                i9 = i38;
                                unsafe = unsafe2;
                                i10 = i14;
                                i27 = i15;
                                i6 = i13;
                                break;
                        }
                    } else {
                        bArr2 = bArr;
                        zzgl zzglVar7 = zzglVar6;
                        if (i33 != 27) {
                            i10 = i31;
                            i9 = i26;
                            i17 = i27;
                            if (i33 <= 49) {
                                int i40 = i28;
                                i18 = i34;
                                i6 = i29;
                                unsafe = unsafe2;
                                i22 = zza((zzjk<T>) t, bArr, i28, i2, i34, i29, i30, i10, i32, i33, j, zzglVar);
                                if (i22 == i40) {
                                    i4 = i3;
                                    i7 = i22;
                                } else {
                                    zzjkVar2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i23 = i6;
                                    i20 = i2;
                                    i21 = i3;
                                    zzglVar6 = zzglVar;
                                    i24 = i10;
                                    i25 = i18;
                                    i26 = i9;
                                    i27 = i17;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i19 = i28;
                                i18 = i34;
                                i6 = i29;
                                unsafe = unsafe2;
                                if (i33 != 50) {
                                    i22 = zza((zzjk<T>) t, bArr, i19, i2, i18, i6, i30, i32, i33, j, i10, zzglVar);
                                    if (i22 != i19) {
                                        zzjkVar2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i20 = i2;
                                        zzglVar6 = zzglVar;
                                        i25 = i18;
                                        i23 = i6;
                                        i24 = i10;
                                        i26 = i9;
                                        i27 = i17;
                                        unsafe2 = unsafe;
                                        i21 = i3;
                                    }
                                } else if (i30 == 2) {
                                    i22 = zza((zzjk<T>) t, bArr, i19, i2, i10, j, zzglVar);
                                    if (i22 != i19) {
                                        zzjkVar2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i23 = i6;
                                        i20 = i2;
                                        i21 = i3;
                                        zzglVar6 = zzglVar;
                                        i24 = i10;
                                        i25 = i18;
                                        i26 = i9;
                                        i27 = i17;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i7 = i19;
                                }
                                i4 = i3;
                                i7 = i22;
                            }
                        } else if (i30 == 2) {
                            zzid zzidVar = (zzid) unsafe2.getObject(t4, j);
                            if (!zzidVar.zza()) {
                                int size = zzidVar.size();
                                zzidVar = zzidVar.zza(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j, zzidVar);
                            }
                            i22 = zzgi.zza(zzjkVar2.zza(i31), i34, bArr, i28, i2, zzidVar, zzglVar);
                            i21 = i3;
                            i25 = i34;
                            i23 = i29;
                            zzglVar6 = zzglVar7;
                            i24 = i31;
                            i26 = i26;
                            i27 = i27;
                            i20 = i2;
                        } else {
                            i10 = i31;
                            i9 = i26;
                            i17 = i27;
                            i19 = i28;
                            i18 = i34;
                            i6 = i29;
                            unsafe = unsafe2;
                            i4 = i3;
                            i7 = i19;
                        }
                        i8 = i18;
                        i27 = i17;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzglVar2 = zzglVar;
                        if (zzglVar2.zzd != zzhi.zza()) {
                            int i41 = i6;
                            if (zzglVar2.zzd.zza(this.zzg, i41) == null) {
                                i22 = zzgi.zza(i8, bArr, i7, i2, zze(t), zzglVar);
                                t4 = t;
                                bArr2 = bArr;
                                i20 = i2;
                                i25 = i8;
                                zzjkVar2 = this;
                                zzglVar6 = zzglVar2;
                                i23 = i41;
                                i24 = i10;
                                i26 = i9;
                                unsafe2 = unsafe;
                                i21 = i4;
                            } else {
                                zzhv.zzd zzdVar = (zzhv.zzd) t;
                                zzdVar.zza();
                                zzho<zzhv.zzc> zzhoVar = zzdVar.zzc;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            t3 = t;
                            i11 = i6;
                        }
                    } else {
                        t3 = t;
                        i11 = i6;
                        zzglVar2 = zzglVar;
                    }
                    i22 = zzgi.zza(i8, bArr, i7, i2, zze(t), zzglVar);
                    i20 = i2;
                    i25 = i8;
                    zzjkVar2 = this;
                    zzglVar6 = zzglVar2;
                    i23 = i11;
                    t4 = t3;
                    i24 = i10;
                    i26 = i9;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i21 = i4;
                } else {
                    i5 = 1048575;
                    zzjkVar = this;
                    t2 = t;
                    i22 = i7;
                    i25 = i8;
                    i26 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i21;
                t2 = t4;
                zzjkVar = zzjkVar2;
                i5 = 1048575;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02dc, code lost:
        if (r0 == r5) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e0, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0323, code lost:
        if (r0 == r15) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0346, code lost:
        if (r0 == r15) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0348, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzgl zzglVar) throws IOException {
        byte b;
        int i3;
        int zzg;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Unsafe unsafe;
        int i9;
        int i10;
        Unsafe unsafe2;
        int i11;
        int i12;
        Unsafe unsafe3;
        Unsafe unsafe4;
        zzjk<T> zzjkVar = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzgl zzglVar2 = zzglVar;
        if (zzjkVar.zzj) {
            Unsafe unsafe5 = zzb;
            int i14 = -1;
            int i15 = 1048575;
            int i16 = i;
            int i17 = -1;
            int i18 = 0;
            int i19 = 0;
            int i20 = 1048575;
            while (i16 < i13) {
                int i21 = i16 + 1;
                byte b2 = bArr2[i16];
                if (b2 < 0) {
                    i3 = zzgi.zza(b2, bArr2, i21, zzglVar2);
                    b = zzglVar2.zza;
                } else {
                    b = b2;
                    i3 = i21;
                }
                int i22 = b >>> 3;
                int i23 = b & 7;
                if (i22 > i17) {
                    zzg = zzjkVar.zza(i22, i18 / 3);
                } else {
                    zzg = zzjkVar.zzg(i22);
                }
                int i24 = zzg;
                if (i24 == i14) {
                    i10 = i3;
                    i4 = i22;
                    unsafe = unsafe5;
                    i6 = 0;
                } else {
                    int[] iArr = zzjkVar.zzc;
                    int i25 = iArr[i24 + 1];
                    int i26 = (i25 & 267386880) >>> 20;
                    Unsafe unsafe6 = unsafe5;
                    long j = i25 & i15;
                    if (i26 <= 17) {
                        int i27 = iArr[i24 + 2];
                        int i28 = 1 << (i27 >>> 20);
                        int i29 = i27 & 1048575;
                        if (i29 != i20) {
                            if (i20 != 1048575) {
                                long j2 = i20;
                                unsafe4 = unsafe6;
                                unsafe4.putInt(t2, j2, i19);
                            } else {
                                unsafe4 = unsafe6;
                            }
                            if (i29 != 1048575) {
                                i19 = unsafe4.getInt(t2, i29);
                            }
                            unsafe2 = unsafe4;
                            i20 = i29;
                        } else {
                            unsafe2 = unsafe6;
                        }
                        switch (i26) {
                            case 0:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 1) {
                                    zzkt.zza(t2, j, zzgi.zzc(bArr2, i11));
                                    i16 = i11 + 8;
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 1:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 5) {
                                    zzkt.zza((Object) t2, j, zzgi.zzd(bArr2, i11));
                                    i16 = i11 + 4;
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 2:
                            case 3:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    int zzb2 = zzgi.zzb(bArr2, i11, zzglVar2);
                                    unsafe3.putLong(t, j, zzglVar2.zzb);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    i16 = zzb2;
                                    break;
                                }
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 4:
                            case 11:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    i16 = zzgi.zza(bArr2, i11, zzglVar2);
                                    unsafe3.putInt(t2, j, zzglVar2.zza);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 5:
                            case 14:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 1) {
                                    unsafe3.putLong(t, j, zzgi.zzb(bArr2, i3));
                                    i16 = i3 + 8;
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 6:
                            case 13:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 5) {
                                    unsafe3.putInt(t2, j, zzgi.zza(bArr2, i3));
                                    i16 = i3 + 4;
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 7:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    i16 = zzgi.zzb(bArr2, i3, zzglVar2);
                                    zzkt.zza(t2, j, zzglVar2.zzb != 0);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 8:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 2) {
                                    if ((i25 & 536870912) == 0) {
                                        i16 = zzgi.zzc(bArr2, i3, zzglVar2);
                                    } else {
                                        i16 = zzgi.zzd(bArr2, i3, zzglVar2);
                                    }
                                    unsafe3.putObject(t2, j, zzglVar2.zzc);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 9:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 2) {
                                    i16 = zzgi.zza(zzjkVar.zza(i12), bArr2, i3, i13, zzglVar2);
                                    Object object = unsafe3.getObject(t2, j);
                                    if (object == null) {
                                        unsafe3.putObject(t2, j, zzglVar2.zzc);
                                    } else {
                                        unsafe3.putObject(t2, j, zzhx.zza(object, zzglVar2.zzc));
                                    }
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 10:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 2) {
                                    i16 = zzgi.zze(bArr2, i3, zzglVar2);
                                    unsafe3.putObject(t2, j, zzglVar2.zzc);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 12:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    i16 = zzgi.zza(bArr2, i3, zzglVar2);
                                    unsafe3.putInt(t2, j, zzglVar2.zza);
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 15:
                                i4 = i22;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                if (i23 == 0) {
                                    i16 = zzgi.zza(bArr2, i3, zzglVar2);
                                    unsafe3.putInt(t2, j, zzgy.zze(zzglVar2.zza));
                                    i19 |= i28;
                                    unsafe5 = unsafe3;
                                    i18 = i12;
                                    break;
                                }
                                i11 = i3;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                            case 16:
                                if (i23 != 0) {
                                    i4 = i22;
                                    i5 = i20;
                                    unsafe3 = unsafe2;
                                    i11 = i3;
                                    i12 = i24;
                                    i10 = i11;
                                    unsafe = unsafe3;
                                    i6 = i12;
                                    i20 = i5;
                                    break;
                                } else {
                                    int zzb3 = zzgi.zzb(bArr2, i3, zzglVar2);
                                    i5 = i20;
                                    i4 = i22;
                                    unsafe2.putLong(t, j, zzgy.zza(zzglVar2.zzb));
                                    i19 |= i28;
                                    unsafe5 = unsafe2;
                                    i18 = i24;
                                    i16 = zzb3;
                                    break;
                                }
                            default:
                                i4 = i22;
                                i11 = i3;
                                i12 = i24;
                                i5 = i20;
                                unsafe3 = unsafe2;
                                i10 = i11;
                                unsafe = unsafe3;
                                i6 = i12;
                                i20 = i5;
                                break;
                        }
                    } else {
                        i4 = i22;
                        int i30 = i3;
                        i5 = i20;
                        if (i26 != 27) {
                            i6 = i24;
                            if (i26 <= 49) {
                                i8 = i19;
                                i9 = i5;
                                unsafe = unsafe6;
                                i16 = zza((zzjk<T>) t, bArr, i30, i2, b, i4, i23, i6, i25, i26, j, zzglVar);
                            } else {
                                i7 = i30;
                                i8 = i19;
                                unsafe = unsafe6;
                                i9 = i5;
                                if (i26 != 50) {
                                    i16 = zza((zzjk<T>) t, bArr, i7, i2, b, i4, i23, i25, i26, j, i6, zzglVar);
                                } else if (i23 == 2) {
                                    i16 = zza((zzjk<T>) t, bArr, i7, i2, i6, j, zzglVar);
                                }
                            }
                            unsafe5 = unsafe;
                            i15 = 1048575;
                            i14 = -1;
                        } else if (i23 == 2) {
                            zzid zzidVar = (zzid) unsafe6.getObject(t2, j);
                            if (!zzidVar.zza()) {
                                int size = zzidVar.size();
                                zzidVar = zzidVar.zza(size == 0 ? 10 : size << 1);
                                unsafe6.putObject(t2, j, zzidVar);
                            }
                            i16 = zzgi.zza(zzjkVar.zza(i24), b, bArr, i30, i2, zzidVar, zzglVar);
                            unsafe5 = unsafe6;
                            i19 = i19;
                            i18 = i24;
                        } else {
                            i6 = i24;
                            i7 = i30;
                            i8 = i19;
                            unsafe = unsafe6;
                            i9 = i5;
                        }
                        i10 = i7;
                        i19 = i8;
                        i20 = i9;
                        i16 = zzgi.zza(b, bArr, i10, i2, zze(t), zzglVar);
                        zzjkVar = this;
                        t2 = t;
                        bArr2 = bArr;
                        i13 = i2;
                        zzglVar2 = zzglVar;
                        i18 = i6;
                        i17 = i4;
                        unsafe5 = unsafe;
                        i15 = 1048575;
                        i14 = -1;
                    }
                    i20 = i5;
                    i17 = i4;
                    i15 = 1048575;
                    i14 = -1;
                }
                i16 = zzgi.zza(b, bArr, i10, i2, zze(t), zzglVar);
                zzjkVar = this;
                t2 = t;
                bArr2 = bArr;
                i13 = i2;
                zzglVar2 = zzglVar;
                i18 = i6;
                i17 = i4;
                unsafe5 = unsafe;
                i15 = 1048575;
                i14 = -1;
            }
            int i31 = i19;
            Unsafe unsafe7 = unsafe5;
            if (i20 != 1048575) {
                unsafe7.putInt(t, i20, i31);
            }
            if (i16 != i2) {
                throw zzig.zzg();
            }
            return;
        }
        zza((zzjk<T>) t, bArr, i, i2, 0, zzglVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final void zzc(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long zzd = zzd(this.zzl[i2]) & 1048575;
            Object zzf = zzkt.zzf(t, zzd);
            if (zzf != null) {
                zzkt.zza(t, zzd, this.zzs.zzd(zzf));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zzb(t, this.zzl[i]);
            i++;
        }
        this.zzq.zzd(t);
        if (this.zzh) {
            this.zzr.zzc(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzkn<UT, UB> zzknVar) {
        zzic zzc;
        int i2 = this.zzc[i];
        Object zzf = zzkt.zzf(obj, zzd(i) & 1048575);
        return (zzf == null || (zzc = zzc(i)) == null) ? ub : (UB) zza(i, i2, this.zzs.zza(zzf), zzc, (zzic) ub, (zzkn<UT, zzic>) zzknVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzic zzicVar, UB ub, zzkn<UT, UB> zzknVar) {
        zzix<?, ?> zzf = this.zzs.zzf(zzb(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzicVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzknVar.zza();
                }
                zzgu zzc = zzgm.zzc(zziy.zza(zzf, next.getKey(), next.getValue()));
                try {
                    zziy.zza(zzc.zzb(), zzf, next.getKey(), next.getValue());
                    zzknVar.zza((zzkn<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.measurement.zzjv] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.zzjv] */
    @Override // com.google.android.gms.internal.measurement.zzjv
    public final boolean zzd(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.zzm) {
                return !this.zzh || this.zzr.zza(t).zzf();
            }
            int i6 = this.zzl[i5];
            int i7 = this.zzc[i6];
            int zzd = zzd(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if (((268435456 & zzd) != 0) && !zza((zzjk<T>) t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & zzd) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zza((zzjk<T>) t, i6, i, i2, i10) && !zza(t, zzd, zza(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zza((zzjk<T>) t, i7, i6) && !zza(t, zzd, zza(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzb2 = this.zzs.zzb(zzkt.zzf(t, zzd & 1048575));
                            if (!zzb2.isEmpty()) {
                                if (this.zzs.zzf(zzb(i6)).zzc.zza() == zzlh.MESSAGE) {
                                    zzjv<T> zzjvVar = 0;
                                    Iterator<?> it = zzb2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzjvVar == null) {
                                            zzjvVar = zzjr.zza().zza((Class) next.getClass());
                                        }
                                        boolean zzd2 = zzjvVar.zzd(next);
                                        zzjvVar = zzjvVar;
                                        if (!zzd2) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzkt.zzf(t, zzd & 1048575);
                if (!list.isEmpty()) {
                    ?? zza2 = zza(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!zza2.zzd(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzjv zzjvVar) {
        return zzjvVar.zzd(zzkt.zzf(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzlk zzlkVar) throws IOException {
        if (obj instanceof String) {
            zzlkVar.zza(i, (String) obj);
        } else {
            zzlkVar.zza(i, (zzgm) obj);
        }
    }

    private final void zza(Object obj, int i, zzjw zzjwVar) throws IOException {
        if (zzf(i)) {
            zzkt.zza(obj, i & 1048575, zzjwVar.zzm());
        } else if (this.zzi) {
            zzkt.zza(obj, i & 1048575, zzjwVar.zzl());
        } else {
            zzkt.zza(obj, i & 1048575, zzjwVar.zzn());
        }
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zzkt.zzf(t, j)).doubleValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zzkt.zzf(t, j)).floatValue();
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zzkt.zzf(t, j)).intValue();
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zzkt.zzf(t, j)).longValue();
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zzkt.zzf(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzjk<T>) t, i) == zza((zzjk<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zza((zzjk<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zza(T t, int i) {
        int zze = zze(i);
        long j = zze & 1048575;
        if (j != 1048575) {
            return (zzkt.zza(t, j) & (1 << (zze >>> 20))) != 0;
        }
        int zzd = zzd(i);
        long j2 = zzd & 1048575;
        switch ((zzd & 267386880) >>> 20) {
            case 0:
                return zzkt.zze(t, j2) != 0.0d;
            case 1:
                return zzkt.zzd(t, j2) != 0.0f;
            case 2:
                return zzkt.zzb(t, j2) != 0;
            case 3:
                return zzkt.zzb(t, j2) != 0;
            case 4:
                return zzkt.zza(t, j2) != 0;
            case 5:
                return zzkt.zzb(t, j2) != 0;
            case 6:
                return zzkt.zza(t, j2) != 0;
            case 7:
                return zzkt.zzc(t, j2);
            case 8:
                Object zzf = zzkt.zzf(t, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzgm) {
                    return !zzgm.zza.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzkt.zzf(t, j2) != null;
            case 10:
                return !zzgm.zza.equals(zzkt.zzf(t, j2));
            case 11:
                return zzkt.zza(t, j2) != 0;
            case 12:
                return zzkt.zza(t, j2) != 0;
            case 13:
                return zzkt.zza(t, j2) != 0;
            case 14:
                return zzkt.zzb(t, j2) != 0;
            case 15:
                return zzkt.zza(t, j2) != 0;
            case 16:
                return zzkt.zzb(t, j2) != 0;
            case 17:
                return zzkt.zzf(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzb(T t, int i) {
        int zze = zze(i);
        long j = 1048575 & zze;
        if (j == 1048575) {
            return;
        }
        zzkt.zza((Object) t, j, (1 << (zze >>> 20)) | zzkt.zza(t, j));
    }

    private final boolean zza(T t, int i, int i2) {
        return zzkt.zza(t, (long) (zze(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzkt.zza((Object) t, zze(i2) & 1048575, i);
    }

    private final int zzg(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, 0);
    }

    private final int zza(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, i2);
    }

    private final int zzb(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}

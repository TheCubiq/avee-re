package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
final class zzbcy<T> implements zzbdm<T> {
    private static final Unsafe zzdwf = zzbek.zzagh();
    private final int[] zzdwg;
    private final Object[] zzdwh;
    private final int zzdwi;
    private final int zzdwj;
    private final int zzdwk;
    private final zzbcu zzdwl;
    private final boolean zzdwm;
    private final boolean zzdwn;
    private final boolean zzdwo;
    private final boolean zzdwp;
    private final int[] zzdwq;
    private final int[] zzdwr;
    private final int[] zzdws;
    private final zzbdc zzdwt;
    private final zzbce zzdwu;
    private final zzbee<?, ?> zzdwv;
    private final zzbbd<?> zzdww;
    private final zzbcp zzdwx;

    private zzbcy(int[] iArr, Object[] objArr, int i, int i2, int i3, zzbcu zzbcuVar, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, zzbdc zzbdcVar, zzbce zzbceVar, zzbee<?, ?> zzbeeVar, zzbbd<?> zzbbdVar, zzbcp zzbcpVar) {
        this.zzdwg = iArr;
        this.zzdwh = objArr;
        this.zzdwi = i;
        this.zzdwj = i2;
        this.zzdwk = i3;
        this.zzdwn = zzbcuVar instanceof zzbbo;
        this.zzdwo = z;
        this.zzdwm = zzbbdVar != null && zzbbdVar.zzh(zzbcuVar);
        this.zzdwp = false;
        this.zzdwq = iArr2;
        this.zzdwr = iArr3;
        this.zzdws = iArr4;
        this.zzdwt = zzbdcVar;
        this.zzdwu = zzbceVar;
        this.zzdwv = zzbeeVar;
        this.zzdww = zzbbdVar;
        this.zzdwl = zzbcuVar;
        this.zzdwx = zzbcpVar;
    }

    private static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzbae zzbaeVar) throws IOException {
        return zzbad.zza(i, bArr, i2, i3, zzz(obj), zzbaeVar);
    }

    private static int zza(zzbdm<?> zzbdmVar, int i, byte[] bArr, int i2, int i3, zzbbt<?> zzbbtVar, zzbae zzbaeVar) throws IOException {
        int zza = zza((zzbdm) zzbdmVar, bArr, i2, i3, zzbaeVar);
        while (true) {
            zzbbtVar.add(zzbaeVar.zzdpn);
            if (zza >= i3) {
                break;
            }
            int zza2 = zzbad.zza(bArr, zza, zzbaeVar);
            if (i != zzbaeVar.zzdpl) {
                break;
            }
            zza = zza((zzbdm) zzbdmVar, bArr, zza2, i3, zzbaeVar);
        }
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzbdm zzbdmVar, byte[] bArr, int i, int i2, int i3, zzbae zzbaeVar) throws IOException {
        zzbcy zzbcyVar = (zzbcy) zzbdmVar;
        Object newInstance = zzbcyVar.newInstance();
        int zza = zzbcyVar.zza((zzbcy) newInstance, bArr, i, i2, i3, zzbaeVar);
        zzbcyVar.zzo(newInstance);
        zzbaeVar.zzdpn = newInstance;
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzbdm zzbdmVar, byte[] bArr, int i, int i2, zzbae zzbaeVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzbad.zza(i4, bArr, i3, zzbaeVar);
            i4 = zzbaeVar.zzdpl;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzbbu.zzadl();
        }
        Object newInstance = zzbdmVar.newInstance();
        int i6 = i4 + i5;
        zzbdmVar.zza(newInstance, bArr, i5, i6, zzbaeVar);
        zzbdmVar.zzo(newInstance);
        zzbaeVar.zzdpn = newInstance;
        return i6;
    }

    private static <UT, UB> int zza(zzbee<UT, UB> zzbeeVar, T t) {
        return zzbeeVar.zzy(zzbeeVar.zzac(t));
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzbae zzbaeVar) throws IOException {
        Object valueOf;
        Object valueOf2;
        int zzb;
        long j2;
        int i9;
        Object valueOf3;
        int i10;
        Unsafe unsafe = zzdwf;
        long j3 = this.zzdwg[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    valueOf = Double.valueOf(zzbad.zzg(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    zzb = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(zzbad.zzh(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    zzb = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = zzbad.zzb(bArr, i, zzbaeVar);
                    j2 = zzbaeVar.zzdpm;
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = zzbad.zza(bArr, i, zzbaeVar);
                    i9 = zzbaeVar.zzdpl;
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    valueOf = Long.valueOf(zzbad.zzf(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    zzb = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    valueOf2 = Integer.valueOf(zzbad.zze(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    zzb = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zzbad.zzb(bArr, i, zzbaeVar);
                    valueOf3 = Boolean.valueOf(zzbaeVar.zzdpm != 0);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    zzb = zzbad.zza(bArr, i, zzbaeVar);
                    i10 = zzbaeVar.zzdpl;
                    if (i10 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t, j, valueOf3);
                        unsafe.putInt(t, j3, i4);
                        return zzb;
                    } else if ((i6 & 536870912) == 0 || zzbem.zzf(bArr, zzb, zzb + i10)) {
                        unsafe.putObject(t, j, new String(bArr, zzb, i10, zzbbq.UTF_8));
                        zzb += i10;
                        unsafe.putInt(t, j3, i4);
                        return zzb;
                    } else {
                        throw zzbbu.zzads();
                    }
                }
                return i;
            case 60:
                if (i5 == 2) {
                    zzb = zza(zzcq(i8), bArr, i, i2, zzbaeVar);
                    Object object = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = zzbaeVar.zzdpn;
                    if (object != null) {
                        valueOf3 = zzbbq.zza(object, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = zzbad.zza(bArr, i, zzbaeVar);
                    i10 = zzbaeVar.zzdpl;
                    if (i10 == 0) {
                        valueOf3 = zzbah.zzdpq;
                        unsafe.putObject(t, j, valueOf3);
                        unsafe.putInt(t, j3, i4);
                        return zzb;
                    }
                    unsafe.putObject(t, j, zzbah.zzc(bArr, zzb, i10));
                    zzb += i10;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza = zzbad.zza(bArr, i, zzbaeVar);
                    int i11 = zzbaeVar.zzdpl;
                    zzbbs<?> zzcs = zzcs(i8);
                    if (zzcs != null && zzcs.zzq(i11) == null) {
                        zzz(t).zzb(i3, Long.valueOf(i11));
                        return zza;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i11));
                    zzb = zza;
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = zzbad.zza(bArr, i, zzbaeVar);
                    i9 = zzbaq.zzbu(zzbaeVar.zzdpl);
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = zzbad.zzb(bArr, i, zzbaeVar);
                    j2 = zzbaq.zzl(zzbaeVar.zzdpm);
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zza(zzcq(i8), bArr, i, i2, (i3 & (-8)) | 4, zzbaeVar);
                    Object object2 = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = zzbaeVar.zzdpn;
                    if (object2 != null) {
                        valueOf3 = zzbbq.zza(object2, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0232, code lost:
        if (r30.zzdpm != 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0234, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0236, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0237, code lost:
        r11.addBoolean(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023a, code lost:
        if (r4 >= r20) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023c, code lost:
        r6 = com.google.android.gms.internal.ads.zzbad.zza(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
        if (r21 != r30.zzdpl) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0244, code lost:
        r4 = com.google.android.gms.internal.ads.zzbad.zzb(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024c, code lost:
        if (r30.zzdpm == 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
        if (r4 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
        r11.add(com.google.android.gms.internal.ads.zzbah.zzdpq);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0142, code lost:
        r11.add(com.google.android.gms.internal.ads.zzbah.zzc(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
        if (r1 >= r20) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
        r4 = com.google.android.gms.internal.ads.zzbad.zza(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
        if (r21 != r30.zzdpl) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
        r1 = com.google.android.gms.internal.ads.zzbad.zza(r18, r4, r30);
        r4 = r30.zzdpl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
        if (r4 != 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01e1 -> B:91:0x01ba). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0236 -> B:127:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x024c -> B:125:0x0234). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0142 -> B:66:0x014a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x015a -> B:64:0x013c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0197 -> B:82:0x019b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01ab -> B:79:0x018c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01cd -> B:96:0x01d1). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzbae zzbaeVar) throws IOException {
        int zzb;
        int zza;
        int zza2;
        int zzb2;
        int i8 = i;
        zzbbt zzbbtVar = (zzbbt) zzdwf.getObject(t, j2);
        if (!zzbbtVar.zzaay()) {
            int size = zzbbtVar.size();
            zzbbtVar = zzbbtVar.zzbm(size == 0 ? 10 : size << 1);
            zzdwf.putObject(t, j2, zzbbtVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzbay zzbayVar = (zzbay) zzbbtVar;
                    int zza3 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i9 = zzbaeVar.zzdpl + zza3;
                    while (zza3 < i9) {
                        zzbayVar.zzd(zzbad.zzg(bArr, zza3));
                        zza3 += 8;
                    }
                    if (zza3 == i9) {
                        return zza3;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 1) {
                    zzbay zzbayVar2 = (zzbay) zzbbtVar;
                    zzbayVar2.zzd(zzbad.zzg(bArr, i));
                    while (true) {
                        int i10 = i8 + 8;
                        if (i10 >= i2) {
                            return i10;
                        }
                        i8 = zzbad.zza(bArr, i10, zzbaeVar);
                        if (i3 != zzbaeVar.zzdpl) {
                            return i10;
                        }
                        zzbayVar2.zzd(zzbad.zzg(bArr, i8));
                    }
                }
                return i8;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzbbm zzbbmVar = (zzbbm) zzbbtVar;
                    int zza4 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i11 = zzbaeVar.zzdpl + zza4;
                    while (zza4 < i11) {
                        zzbbmVar.zzd(zzbad.zzh(bArr, zza4));
                        zza4 += 4;
                    }
                    if (zza4 == i11) {
                        return zza4;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 5) {
                    zzbbm zzbbmVar2 = (zzbbm) zzbbtVar;
                    zzbbmVar2.zzd(zzbad.zzh(bArr, i));
                    while (true) {
                        int i12 = i8 + 4;
                        if (i12 >= i2) {
                            return i12;
                        }
                        i8 = zzbad.zza(bArr, i12, zzbaeVar);
                        if (i3 != zzbaeVar.zzdpl) {
                            return i12;
                        }
                        zzbbmVar2.zzd(zzbad.zzh(bArr, i8));
                    }
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzbci zzbciVar = (zzbci) zzbbtVar;
                    int zza5 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i13 = zzbaeVar.zzdpl + zza5;
                    while (zza5 < i13) {
                        zza5 = zzbad.zzb(bArr, zza5, zzbaeVar);
                        zzbciVar.zzw(zzbaeVar.zzdpm);
                    }
                    if (zza5 == i13) {
                        return zza5;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 0) {
                    zzbci zzbciVar2 = (zzbci) zzbbtVar;
                    do {
                        zzb = zzbad.zzb(bArr, i8, zzbaeVar);
                        zzbciVar2.zzw(zzbaeVar.zzdpm);
                        if (zzb >= i2) {
                            return zzb;
                        }
                        i8 = zzbad.zza(bArr, zzb, zzbaeVar);
                    } while (i3 == zzbaeVar.zzdpl);
                    return zzb;
                }
                return i8;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzbad.zza(bArr, i8, zzbbtVar, zzbaeVar);
                }
                if (i5 == 0) {
                    return zzbad.zza(i3, bArr, i, i2, zzbbtVar, zzbaeVar);
                }
                return i8;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzbci zzbciVar3 = (zzbci) zzbbtVar;
                    int zza6 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i14 = zzbaeVar.zzdpl + zza6;
                    while (zza6 < i14) {
                        zzbciVar3.zzw(zzbad.zzf(bArr, zza6));
                        zza6 += 8;
                    }
                    if (zza6 == i14) {
                        return zza6;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 1) {
                    zzbci zzbciVar4 = (zzbci) zzbbtVar;
                    zzbciVar4.zzw(zzbad.zzf(bArr, i));
                    while (true) {
                        int i15 = i8 + 8;
                        if (i15 >= i2) {
                            return i15;
                        }
                        i8 = zzbad.zza(bArr, i15, zzbaeVar);
                        if (i3 != zzbaeVar.zzdpl) {
                            return i15;
                        }
                        zzbciVar4.zzw(zzbad.zzf(bArr, i8));
                    }
                }
                return i8;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzbbp zzbbpVar = (zzbbp) zzbbtVar;
                    int zza7 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i16 = zzbaeVar.zzdpl + zza7;
                    while (zza7 < i16) {
                        zzbbpVar.zzco(zzbad.zze(bArr, zza7));
                        zza7 += 4;
                    }
                    if (zza7 == i16) {
                        return zza7;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 5) {
                    zzbbp zzbbpVar2 = (zzbbp) zzbbtVar;
                    zzbbpVar2.zzco(zzbad.zze(bArr, i));
                    while (true) {
                        int i17 = i8 + 4;
                        if (i17 >= i2) {
                            return i17;
                        }
                        i8 = zzbad.zza(bArr, i17, zzbaeVar);
                        if (i3 != zzbaeVar.zzdpl) {
                            return i17;
                        }
                        zzbbpVar2.zzco(zzbad.zze(bArr, i8));
                    }
                }
                return i8;
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzbaf zzbafVar = (zzbaf) zzbbtVar;
                        i8 = zzbad.zzb(bArr, i8, zzbaeVar);
                        break;
                    }
                    return i8;
                }
                zzbaf zzbafVar2 = (zzbaf) zzbbtVar;
                zza = zzbad.zza(bArr, i8, zzbaeVar);
                int i18 = zzbaeVar.zzdpl + zza;
                while (zza < i18) {
                    zza = zzbad.zzb(bArr, zza, zzbaeVar);
                    zzbafVar2.addBoolean(zzbaeVar.zzdpm != 0);
                }
                if (zza != i18) {
                    throw zzbbu.zzadl();
                }
                return zza;
            case 26:
                if (i5 == 2) {
                    int i19 = ((j & 536870912) > 0L ? 1 : ((j & 536870912) == 0L ? 0 : -1));
                    i8 = zzbad.zza(bArr, i8, zzbaeVar);
                    if (i19 == 0) {
                        int i20 = zzbaeVar.zzdpl;
                        if (i20 != 0) {
                            String str = new String(bArr, i8, i20, zzbbq.UTF_8);
                            zzbbtVar.add(str);
                            i8 += i20;
                            if (i8 < i2) {
                                int zza8 = zzbad.zza(bArr, i8, zzbaeVar);
                                if (i3 == zzbaeVar.zzdpl) {
                                    i8 = zzbad.zza(bArr, zza8, zzbaeVar);
                                    i20 = zzbaeVar.zzdpl;
                                    if (i20 != 0) {
                                        str = new String(bArr, i8, i20, zzbbq.UTF_8);
                                        zzbbtVar.add(str);
                                        i8 += i20;
                                        if (i8 < i2) {
                                        }
                                    }
                                }
                            }
                        }
                        zzbbtVar.add("");
                        if (i8 < i2) {
                        }
                    } else {
                        int i21 = zzbaeVar.zzdpl;
                        if (i21 != 0) {
                            int i22 = i8 + i21;
                            if (!zzbem.zzf(bArr, i8, i22)) {
                                throw zzbbu.zzads();
                            }
                            String str2 = new String(bArr, i8, i21, zzbbq.UTF_8);
                            zzbbtVar.add(str2);
                            i8 = i22;
                            if (i8 < i2) {
                                int zza9 = zzbad.zza(bArr, i8, zzbaeVar);
                                if (i3 == zzbaeVar.zzdpl) {
                                    i8 = zzbad.zza(bArr, zza9, zzbaeVar);
                                    int i23 = zzbaeVar.zzdpl;
                                    if (i23 != 0) {
                                        i22 = i8 + i23;
                                        if (!zzbem.zzf(bArr, i8, i22)) {
                                            throw zzbbu.zzads();
                                        }
                                        str2 = new String(bArr, i8, i23, zzbbq.UTF_8);
                                        zzbbtVar.add(str2);
                                        i8 = i22;
                                        if (i8 < i2) {
                                        }
                                    }
                                }
                            }
                        }
                        zzbbtVar.add("");
                        if (i8 < i2) {
                        }
                    }
                }
                return i8;
            case 27:
                if (i5 == 2) {
                    return zza(zzcq(i6), i3, bArr, i, i2, zzbbtVar, zzbaeVar);
                }
                return i8;
            case 28:
                if (i5 == 2) {
                    int zza10 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i24 = zzbaeVar.zzdpl;
                    break;
                }
                return i8;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zza = zzbad.zza(i3, bArr, i, i2, zzbbtVar, zzbaeVar);
                    }
                    return i8;
                }
                zza = zzbad.zza(bArr, i8, zzbbtVar, zzbaeVar);
                zzbbo zzbboVar = (zzbbo) t;
                zzbef zzbefVar = zzbboVar.zzdtt;
                if (zzbefVar == zzbef.zzagc()) {
                    zzbefVar = null;
                }
                zzbef zzbefVar2 = (zzbef) zzbdo.zza(i4, zzbbtVar, zzcs(i6), zzbefVar, this.zzdwv);
                if (zzbefVar2 != null) {
                    zzbboVar.zzdtt = zzbefVar2;
                }
                return zza;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzbbp zzbbpVar3 = (zzbbp) zzbbtVar;
                    int zza11 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i25 = zzbaeVar.zzdpl + zza11;
                    while (zza11 < i25) {
                        zza11 = zzbad.zza(bArr, zza11, zzbaeVar);
                        zzbbpVar3.zzco(zzbaq.zzbu(zzbaeVar.zzdpl));
                    }
                    if (zza11 == i25) {
                        return zza11;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 0) {
                    zzbbp zzbbpVar4 = (zzbbp) zzbbtVar;
                    do {
                        zza2 = zzbad.zza(bArr, i8, zzbaeVar);
                        zzbbpVar4.zzco(zzbaq.zzbu(zzbaeVar.zzdpl));
                        if (zza2 >= i2) {
                            return zza2;
                        }
                        i8 = zzbad.zza(bArr, zza2, zzbaeVar);
                    } while (i3 == zzbaeVar.zzdpl);
                    return zza2;
                }
                return i8;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzbci zzbciVar5 = (zzbci) zzbbtVar;
                    int zza12 = zzbad.zza(bArr, i8, zzbaeVar);
                    int i26 = zzbaeVar.zzdpl + zza12;
                    while (zza12 < i26) {
                        zza12 = zzbad.zzb(bArr, zza12, zzbaeVar);
                        zzbciVar5.zzw(zzbaq.zzl(zzbaeVar.zzdpm));
                    }
                    if (zza12 == i26) {
                        return zza12;
                    }
                    throw zzbbu.zzadl();
                }
                if (i5 == 0) {
                    zzbci zzbciVar6 = (zzbci) zzbbtVar;
                    do {
                        zzb2 = zzbad.zzb(bArr, i8, zzbaeVar);
                        zzbciVar6.zzw(zzbaq.zzl(zzbaeVar.zzdpm));
                        if (zzb2 >= i2) {
                            return zzb2;
                        }
                        i8 = zzbad.zza(bArr, zzb2, zzbaeVar);
                    } while (i3 == zzbaeVar.zzdpl);
                    return zzb2;
                }
                return i8;
            case 49:
                if (i5 == 3) {
                    zzbdm zzcq = zzcq(i6);
                    int i27 = (i3 & (-8)) | 4;
                    i8 = zza(zzcq, bArr, i, i2, i27, zzbaeVar);
                    while (true) {
                        zzbbtVar.add(zzbaeVar.zzdpn);
                        if (i8 < i2) {
                            int zza13 = zzbad.zza(bArr, i8, zzbaeVar);
                            if (i3 == zzbaeVar.zzdpl) {
                                i8 = zza(zzcq, bArr, zza13, i2, i27, zzbaeVar);
                            }
                        }
                    }
                }
                return i8;
            default:
                return i8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, long j, zzbae zzbaeVar) throws IOException {
        Unsafe unsafe = zzdwf;
        Object zzcr = zzcr(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzdwx.zzu(object)) {
            Object zzw = this.zzdwx.zzw(zzcr);
            this.zzdwx.zzb(zzw, object);
            unsafe.putObject(t, j, zzw);
            object = zzw;
        }
        zzbcn<?, ?> zzx = this.zzdwx.zzx(zzcr);
        Map<?, ?> zzs = this.zzdwx.zzs(object);
        int zza = zzbad.zza(bArr, i, zzbaeVar);
        int i5 = zzbaeVar.zzdpl;
        if (i5 < 0 || i5 > i2 - zza) {
            throw zzbbu.zzadl();
        }
        int i6 = i5 + zza;
        Object obj = (K) zzx.zzdvz;
        Object obj2 = (V) zzx.zzdwb;
        while (zza < i6) {
            int i7 = zza + 1;
            int i8 = bArr[zza];
            if (i8 < 0) {
                i7 = zzbad.zza(i8, bArr, i7, zzbaeVar);
                i8 = zzbaeVar.zzdpl;
            }
            int i9 = i7;
            int i10 = i8 >>> 3;
            int i11 = i8 & 7;
            if (i10 != 1) {
                if (i10 == 2 && i11 == zzx.zzdwa.zzagm()) {
                    zza = zza(bArr, i9, i2, zzx.zzdwa, zzx.zzdwb.getClass(), zzbaeVar);
                    obj2 = zzbaeVar.zzdpn;
                }
                zza = zzbad.zza(i8, bArr, i9, i2, zzbaeVar);
            } else if (i11 == zzx.zzdvy.zzagm()) {
                zza = zza(bArr, i9, i2, zzx.zzdvy, (Class<?>) null, zzbaeVar);
                obj = (K) zzbaeVar.zzdpn;
            } else {
                zza = zzbad.zza(i8, bArr, i9, i2, zzbaeVar);
            }
        }
        if (zza == i6) {
            zzs.put(obj, obj2);
            return i6;
        }
        throw zzbbu.zzadr();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0377 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, zzbae zzbaeVar) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        byte b;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzbae zzbaeVar2;
        int i12;
        int i13;
        long j;
        Object obj;
        zzbae zzbaeVar3;
        int zze;
        zzbcy<T> zzbcyVar = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i14 = i2;
        int i15 = i3;
        zzbae zzbaeVar4 = zzbaeVar;
        Unsafe unsafe2 = zzdwf;
        int i16 = -1;
        int i17 = i;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        while (true) {
            if (i17 < i14) {
                int i21 = i17 + 1;
                byte b2 = bArr2[i17];
                if (b2 < 0) {
                    i5 = zzbad.zza(b2, bArr2, i21, zzbaeVar4);
                    b = zzbaeVar4.zzdpl;
                } else {
                    b = b2;
                    i5 = i21;
                }
                int i22 = b >>> 3;
                int i23 = b & 7;
                int zzcw = zzbcyVar.zzcw(i22);
                if (zzcw != i16) {
                    int[] iArr = zzbcyVar.zzdwg;
                    int i24 = iArr[zzcw + 1];
                    int i25 = (i24 & 267386880) >>> 20;
                    int i26 = b;
                    long j2 = i24 & 1048575;
                    if (i25 <= 17) {
                        int i27 = iArr[zzcw + 2];
                        int i28 = 1 << (i27 >>> 20);
                        int i29 = i27 & 1048575;
                        if (i29 != i20) {
                            if (i20 != -1) {
                                unsafe2.putInt(t3, i20, i19);
                            }
                            i19 = unsafe2.getInt(t3, i29);
                            i20 = i29;
                        }
                        switch (i25) {
                            case 0:
                                i11 = i26;
                                zzbaeVar2 = zzbaeVar;
                                i12 = i5;
                                i13 = i20;
                                bArr2 = bArr;
                                i14 = i2;
                                if (i23 == 1) {
                                    zzbek.zza(t3, j2, zzbad.zzg(bArr2, i12));
                                    i17 = i12 + 8;
                                    i19 |= i28;
                                    i20 = i13;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar2;
                                    i16 = -1;
                                    i15 = i3;
                                    break;
                                } else {
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4 && i4 != 0) {
                                        i17 = i10;
                                        i18 = i11;
                                        break;
                                    } else {
                                        i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                        zzbcyVar = this;
                                        t3 = t;
                                        bArr2 = bArr;
                                        i14 = i2;
                                        i15 = i4;
                                        i18 = i11;
                                        unsafe2 = unsafe;
                                        i16 = -1;
                                        zzbaeVar4 = zzbaeVar;
                                        break;
                                    }
                                }
                            case 1:
                                i11 = i26;
                                zzbaeVar2 = zzbaeVar;
                                i12 = i5;
                                i13 = i20;
                                bArr2 = bArr;
                                i14 = i2;
                                if (i23 == 5) {
                                    zzbek.zza((Object) t3, j2, zzbad.zzh(bArr2, i12));
                                    i17 = i12 + 4;
                                    i19 |= i28;
                                    i20 = i13;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar2;
                                    i16 = -1;
                                    i15 = i3;
                                    break;
                                } else {
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                i11 = i26;
                                i12 = i5;
                                i13 = i20;
                                bArr2 = bArr;
                                i14 = i2;
                                if (i23 == 0) {
                                    int zzb = zzbad.zzb(bArr2, i12, zzbaeVar);
                                    unsafe2.putLong(t, j2, zzbaeVar.zzdpm);
                                    i19 |= i28;
                                    i20 = i13;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar;
                                    i17 = zzb;
                                    i16 = -1;
                                    i15 = i3;
                                    break;
                                } else {
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                i11 = i26;
                                zzbaeVar2 = zzbaeVar;
                                i12 = i5;
                                i13 = i20;
                                bArr2 = bArr;
                                i14 = i2;
                                if (i23 == 0) {
                                    i17 = zzbad.zza(bArr2, i12, zzbaeVar2);
                                    unsafe2.putInt(t3, j2, zzbaeVar2.zzdpl);
                                    i19 |= i28;
                                    i20 = i13;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar2;
                                    i16 = -1;
                                    i15 = i3;
                                    break;
                                } else {
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                i11 = i26;
                                zzbaeVar2 = zzbaeVar;
                                i13 = i20;
                                bArr2 = bArr;
                                i14 = i2;
                                if (i23 == 1) {
                                    unsafe2.putLong(t, j2, zzbad.zzf(bArr2, i5));
                                    i17 = i5 + 8;
                                    i19 |= i28;
                                    i20 = i13;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar2;
                                    i16 = -1;
                                    i15 = i3;
                                    break;
                                } else {
                                    i12 = i5;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                i11 = i26;
                                zzbaeVar2 = zzbaeVar;
                                i13 = i20;
                                bArr2 = bArr;
                                i14 = i2;
                                if (i23 == 5) {
                                    unsafe2.putInt(t3, j2, zzbad.zze(bArr2, i5));
                                    i17 = i5 + 4;
                                    i19 |= i28;
                                    i20 = i13;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar2;
                                    i16 = -1;
                                    i15 = i3;
                                    break;
                                } else {
                                    i12 = i5;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 7:
                                i11 = i26;
                                zzbaeVar2 = zzbaeVar;
                                i13 = i20;
                                bArr2 = bArr;
                                i14 = i2;
                                if (i23 == 0) {
                                    i17 = zzbad.zzb(bArr2, i5, zzbaeVar2);
                                    zzbek.zza(t3, j2, zzbaeVar2.zzdpm != 0);
                                    i19 |= i28;
                                    i20 = i13;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar2;
                                    i16 = -1;
                                    i15 = i3;
                                    break;
                                } else {
                                    i12 = i5;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 8:
                                i11 = i26;
                                zzbaeVar2 = zzbaeVar;
                                i13 = i20;
                                j = j2;
                                bArr2 = bArr;
                                i14 = i2;
                                if (i23 == 2) {
                                    i17 = (i24 & 536870912) == 0 ? zzbad.zzc(bArr2, i5, zzbaeVar2) : zzbad.zzd(bArr2, i5, zzbaeVar2);
                                    obj = zzbaeVar2.zzdpn;
                                    unsafe2.putObject(t3, j, obj);
                                    i19 |= i28;
                                    i20 = i13;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar2;
                                    i16 = -1;
                                    i15 = i3;
                                    break;
                                } else {
                                    i12 = i5;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 9:
                                i11 = i26;
                                zzbaeVar2 = zzbaeVar;
                                i13 = i20;
                                j = j2;
                                bArr2 = bArr;
                                if (i23 == 2) {
                                    i14 = i2;
                                    i17 = zza(zzbcyVar.zzcq(zzcw), bArr2, i5, i14, zzbaeVar2);
                                    obj = (i19 & i28) == 0 ? zzbaeVar2.zzdpn : zzbbq.zza(unsafe2.getObject(t3, j), zzbaeVar2.zzdpn);
                                    unsafe2.putObject(t3, j, obj);
                                    i19 |= i28;
                                    i20 = i13;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar2;
                                    i16 = -1;
                                    i15 = i3;
                                    break;
                                } else {
                                    i12 = i5;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 10:
                                i11 = i26;
                                zzbaeVar3 = zzbaeVar;
                                i16 = -1;
                                bArr2 = bArr;
                                if (i23 == 2) {
                                    zze = zzbad.zze(bArr2, i5, zzbaeVar3);
                                    unsafe2.putObject(t3, j2, zzbaeVar3.zzdpn);
                                    i19 |= i28;
                                    i14 = i2;
                                    i17 = zze;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar3;
                                    i15 = i3;
                                    break;
                                } else {
                                    i12 = i5;
                                    i13 = i20;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 12:
                                i11 = i26;
                                zzbaeVar3 = zzbaeVar;
                                i16 = -1;
                                bArr2 = bArr;
                                if (i23 == 0) {
                                    i17 = zzbad.zza(bArr2, i5, zzbaeVar3);
                                    int i30 = zzbaeVar3.zzdpl;
                                    zzbbs<?> zzcs = zzbcyVar.zzcs(zzcw);
                                    if (zzcs == null || zzcs.zzq(i30) != null) {
                                        unsafe2.putInt(t3, j2, i30);
                                        i19 |= i28;
                                    } else {
                                        zzz(t).zzb(i11, Long.valueOf(i30));
                                    }
                                    i14 = i2;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar3;
                                    i15 = i3;
                                    break;
                                } else {
                                    i12 = i5;
                                    i13 = i20;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 15:
                                i11 = i26;
                                zzbaeVar3 = zzbaeVar;
                                i16 = -1;
                                bArr2 = bArr;
                                if (i23 == 0) {
                                    zze = zzbad.zza(bArr2, i5, zzbaeVar3);
                                    unsafe2.putInt(t3, j2, zzbaq.zzbu(zzbaeVar3.zzdpl));
                                    i19 |= i28;
                                    i14 = i2;
                                    i17 = zze;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar3;
                                    i15 = i3;
                                    break;
                                } else {
                                    i12 = i5;
                                    i13 = i20;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 16:
                                i11 = i26;
                                i16 = -1;
                                if (i23 == 0) {
                                    bArr2 = bArr;
                                    int zzb2 = zzbad.zzb(bArr2, i5, zzbaeVar);
                                    unsafe2.putLong(t, j2, zzbaq.zzl(zzbaeVar.zzdpm));
                                    i19 |= i28;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar;
                                    i17 = zzb2;
                                    i14 = i2;
                                    i15 = i3;
                                    break;
                                } else {
                                    i12 = i5;
                                    i13 = i20;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            case 17:
                                if (i23 == 3) {
                                    i11 = i26;
                                    i16 = -1;
                                    i17 = zza(zzbcyVar.zzcq(zzcw), bArr, i5, i2, (i22 << 3) | 4, zzbaeVar);
                                    zzbaeVar3 = zzbaeVar;
                                    unsafe2.putObject(t3, j2, (i19 & i28) == 0 ? zzbaeVar3.zzdpn : zzbbq.zza(unsafe2.getObject(t3, j2), zzbaeVar3.zzdpn));
                                    i19 |= i28;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i18 = i11;
                                    zzbaeVar4 = zzbaeVar3;
                                    i15 = i3;
                                    break;
                                } else {
                                    i11 = i26;
                                    i12 = i5;
                                    i13 = i20;
                                    i20 = i13;
                                    i4 = i3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    if (i11 != i4) {
                                    }
                                    i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i4;
                                    i18 = i11;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                    zzbaeVar4 = zzbaeVar;
                                    break;
                                }
                                break;
                            default:
                                i11 = i26;
                                i12 = i5;
                                i13 = i20;
                                i20 = i13;
                                i4 = i3;
                                i10 = i12;
                                unsafe = unsafe2;
                                if (i11 != i4) {
                                }
                                i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                                zzbcyVar = this;
                                t3 = t;
                                bArr2 = bArr;
                                i14 = i2;
                                i15 = i4;
                                i18 = i11;
                                unsafe2 = unsafe;
                                i16 = -1;
                                zzbaeVar4 = zzbaeVar;
                                break;
                        }
                    } else {
                        int i31 = i5;
                        i9 = i20;
                        bArr2 = bArr;
                        i14 = i2;
                        if (i25 != 27) {
                            i8 = i19;
                            if (i25 <= 49) {
                                i7 = i26;
                                unsafe = unsafe2;
                                i17 = zza((zzbcy<T>) t, bArr, i31, i2, i26, i22, i23, zzcw, i24, i25, j2, zzbaeVar);
                                if (i17 == i31) {
                                    i4 = i3;
                                    i10 = i17;
                                    i20 = i9;
                                    i11 = i7;
                                    i19 = i8;
                                } else {
                                    zzbcyVar = this;
                                    t3 = t;
                                    bArr2 = bArr;
                                    i14 = i2;
                                    i15 = i3;
                                    zzbaeVar4 = zzbaeVar;
                                    i20 = i9;
                                    i18 = i7;
                                    i19 = i8;
                                    unsafe2 = unsafe;
                                    i16 = -1;
                                }
                            } else {
                                i6 = i31;
                                i7 = i26;
                                unsafe = unsafe2;
                                if (i25 != 50) {
                                    i17 = zza((zzbcy<T>) t, bArr, i6, i2, i7, i22, i23, i24, i25, j2, zzcw, zzbaeVar);
                                    if (i17 == i6) {
                                        i4 = i3;
                                        i10 = i17;
                                        i20 = i9;
                                        i11 = i7;
                                        i19 = i8;
                                    } else {
                                        zzbcyVar = this;
                                        t3 = t;
                                        bArr2 = bArr;
                                        i14 = i2;
                                        i15 = i3;
                                        zzbaeVar4 = zzbaeVar;
                                        i20 = i9;
                                        i18 = i7;
                                        i19 = i8;
                                        unsafe2 = unsafe;
                                        i16 = -1;
                                    }
                                } else if (i23 == 2) {
                                    i17 = zza(t, bArr, i6, i2, zzcw, i22, j2, zzbaeVar);
                                    if (i17 == i6) {
                                        i4 = i3;
                                        i10 = i17;
                                        i20 = i9;
                                        i11 = i7;
                                        i19 = i8;
                                    } else {
                                        zzbcyVar = this;
                                        t3 = t;
                                        bArr2 = bArr;
                                        i14 = i2;
                                        i15 = i3;
                                        zzbaeVar4 = zzbaeVar;
                                        i20 = i9;
                                        i18 = i7;
                                        i19 = i8;
                                        unsafe2 = unsafe;
                                        i16 = -1;
                                    }
                                } else {
                                    i4 = i3;
                                    i10 = i6;
                                    i20 = i9;
                                    i11 = i7;
                                    i19 = i8;
                                }
                            }
                            if (i11 != i4) {
                            }
                            i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                            zzbcyVar = this;
                            t3 = t;
                            bArr2 = bArr;
                            i14 = i2;
                            i15 = i4;
                            i18 = i11;
                            unsafe2 = unsafe;
                            i16 = -1;
                            zzbaeVar4 = zzbaeVar;
                        } else if (i23 == 2) {
                            zzbbt zzbbtVar = (zzbbt) unsafe2.getObject(t3, j2);
                            if (!zzbbtVar.zzaay()) {
                                int size = zzbbtVar.size();
                                zzbbtVar = zzbbtVar.zzbm(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t3, j2, zzbbtVar);
                            }
                            zzbbt zzbbtVar2 = zzbbtVar;
                            zzbdm zzcq = zzbcyVar.zzcq(zzcw);
                            i18 = i26;
                            i17 = zza(zzcq, i18, bArr, i31, i2, zzbbtVar2, zzbaeVar);
                            i15 = i3;
                            i20 = i9;
                            i19 = i19;
                            i16 = -1;
                            zzbaeVar4 = zzbaeVar;
                        } else {
                            i8 = i19;
                            i6 = i31;
                            i7 = i26;
                        }
                    }
                } else {
                    i6 = i5;
                    i7 = b;
                    i8 = i19;
                    i9 = i20;
                }
                unsafe = unsafe2;
                i4 = i3;
                i10 = i6;
                i20 = i9;
                i11 = i7;
                i19 = i8;
                if (i11 != i4) {
                }
                i17 = zza(i11, bArr, i10, i2, t, zzbaeVar);
                zzbcyVar = this;
                t3 = t;
                bArr2 = bArr;
                i14 = i2;
                i15 = i4;
                i18 = i11;
                unsafe2 = unsafe;
                i16 = -1;
                zzbaeVar4 = zzbaeVar;
            } else {
                unsafe = unsafe2;
                i4 = i15;
            }
        }
        if (i20 != -1) {
            t2 = t;
            unsafe.putInt(t2, i20, i19);
        } else {
            t2 = t;
        }
        int[] iArr2 = this.zzdwr;
        if (iArr2 != null) {
            zzbef zzbefVar = null;
            for (int i32 : iArr2) {
                zzbefVar = (zzbef) zza((Object) t2, i32, (int) zzbefVar, (zzbee<UT, int>) this.zzdwv);
            }
            if (zzbefVar != null) {
                this.zzdwv.zzf(t2, zzbefVar);
            }
        }
        if (i4 == 0) {
            if (i17 != i2) {
                throw zzbbu.zzadr();
            }
        } else if (i17 > i2 || i18 != i4) {
            throw zzbbu.zzadr();
        }
        return i17;
    }

    private static int zza(byte[] bArr, int i, int i2, zzbes zzbesVar, Class<?> cls, zzbae zzbaeVar) throws IOException {
        int zzb;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i3;
        long j;
        switch (zzbcz.zzdql[zzbesVar.ordinal()]) {
            case 1:
                zzb = zzbad.zzb(bArr, i, zzbaeVar);
                valueOf = Boolean.valueOf(zzbaeVar.zzdpm != 0);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 2:
                return zzbad.zze(bArr, i, zzbaeVar);
            case 3:
                valueOf2 = Double.valueOf(zzbad.zzg(bArr, i));
                zzbaeVar.zzdpn = valueOf2;
                return i + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(zzbad.zze(bArr, i));
                zzbaeVar.zzdpn = valueOf3;
                return i + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(zzbad.zzf(bArr, i));
                zzbaeVar.zzdpn = valueOf2;
                return i + 8;
            case 8:
                valueOf3 = Float.valueOf(zzbad.zzh(bArr, i));
                zzbaeVar.zzdpn = valueOf3;
                return i + 4;
            case 9:
            case 10:
            case 11:
                zzb = zzbad.zza(bArr, i, zzbaeVar);
                i3 = zzbaeVar.zzdpl;
                valueOf = Integer.valueOf(i3);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 12:
            case 13:
                zzb = zzbad.zzb(bArr, i, zzbaeVar);
                j = zzbaeVar.zzdpm;
                valueOf = Long.valueOf(j);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 14:
                return zza((zzbdm) zzbdg.zzaeo().zze(cls), bArr, i, i2, zzbaeVar);
            case 15:
                zzb = zzbad.zza(bArr, i, zzbaeVar);
                i3 = zzbaq.zzbu(zzbaeVar.zzdpl);
                valueOf = Integer.valueOf(i3);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 16:
                zzb = zzbad.zzb(bArr, i, zzbaeVar);
                j = zzbaq.zzl(zzbaeVar.zzdpm);
                valueOf = Long.valueOf(j);
                zzbaeVar.zzdpn = valueOf;
                return zzb;
            case 17:
                return zzbad.zzd(bArr, i, zzbaeVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzbcy<T> zza(Class<T> cls, zzbcs zzbcsVar, zzbdc zzbdcVar, zzbce zzbceVar, zzbee<?, ?> zzbeeVar, zzbbd<?> zzbbdVar, zzbcp zzbcpVar) {
        int zzaew;
        int i;
        int i2;
        int zza;
        int i3;
        int i4;
        if (!(zzbcsVar instanceof zzbdi)) {
            ((zzbdz) zzbcsVar).zzaeh();
            throw new NoSuchMethodError();
        }
        zzbdi zzbdiVar = (zzbdi) zzbcsVar;
        boolean z = zzbdiVar.zzaeh() == zzbbo.zze.zzduj;
        if (zzbdiVar.getFieldCount() == 0) {
            zzaew = 0;
            i = 0;
            i2 = 0;
        } else {
            int zzaer = zzbdiVar.zzaer();
            int zzaes = zzbdiVar.zzaes();
            zzaew = zzbdiVar.zzaew();
            i = zzaer;
            i2 = zzaes;
        }
        int[] iArr = new int[zzaew << 2];
        Object[] objArr = new Object[zzaew << 1];
        int[] iArr2 = zzbdiVar.zzaet() > 0 ? new int[zzbdiVar.zzaet()] : null;
        int[] iArr3 = zzbdiVar.zzaeu() > 0 ? new int[zzbdiVar.zzaeu()] : null;
        zzbdj zzaeq = zzbdiVar.zzaeq();
        if (zzaeq.next()) {
            int zzaci = zzaeq.zzaci();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (zzaci >= zzbdiVar.zzaex() || i5 >= ((zzaci - i) << 2)) {
                    if (zzaeq.zzafb()) {
                        zza = (int) zzbek.zza(zzaeq.zzafc());
                        i4 = (int) zzbek.zza(zzaeq.zzafd());
                        i3 = 0;
                    } else {
                        zza = (int) zzbek.zza(zzaeq.zzafe());
                        if (zzaeq.zzaff()) {
                            i4 = (int) zzbek.zza(zzaeq.zzafg());
                            i3 = zzaeq.zzafh();
                        } else {
                            i3 = 0;
                            i4 = 0;
                        }
                    }
                    iArr[i5] = zzaeq.zzaci();
                    int i8 = i5 + 1;
                    iArr[i8] = (zzaeq.zzafj() ? 536870912 : 0) | (zzaeq.zzafi() ? 268435456 : 0) | (zzaeq.zzaez() << 20) | zza;
                    iArr[i5 + 2] = (i3 << 20) | i4;
                    if (zzaeq.zzafm() != null) {
                        int i9 = (i5 / 4) << 1;
                        objArr[i9] = zzaeq.zzafm();
                        if (zzaeq.zzafk() != null) {
                            objArr[i9 + 1] = zzaeq.zzafk();
                        } else if (zzaeq.zzafl() != null) {
                            objArr[i9 + 1] = zzaeq.zzafl();
                        }
                    } else if (zzaeq.zzafk() != null) {
                        objArr[((i5 / 4) << 1) + 1] = zzaeq.zzafk();
                    } else if (zzaeq.zzafl() != null) {
                        objArr[((i5 / 4) << 1) + 1] = zzaeq.zzafl();
                    }
                    int zzaez = zzaeq.zzaez();
                    if (zzaez == zzbbj.MAP.ordinal()) {
                        iArr2[i6] = i5;
                        i6++;
                    } else if (zzaez >= 18 && zzaez <= 49) {
                        iArr3[i7] = iArr[i8] & 1048575;
                        i7++;
                    }
                    if (!zzaeq.next()) {
                        break;
                    }
                    zzaci = zzaeq.zzaci();
                } else {
                    for (int i10 = 0; i10 < 4; i10++) {
                        iArr[i5 + i10] = -1;
                    }
                }
                i5 += 4;
            }
        }
        return new zzbcy<>(iArr, objArr, i, i2, zzbdiVar.zzaex(), zzbdiVar.zzaej(), z, false, zzbdiVar.zzaev(), iArr2, iArr3, zzbdcVar, zzbceVar, zzbeeVar, zzbbdVar, zzbcpVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzbbs<?> zzbbsVar, UB ub, zzbee<UT, UB> zzbeeVar) {
        zzbcn<?, ?> zzx = this.zzdwx.zzx(zzcr(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (zzbbsVar.zzq(((Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = zzbeeVar.zzagb();
                }
                zzbam zzbo = zzbah.zzbo(zzbcm.zza(zzx, next.getKey(), next.getValue()));
                try {
                    zzbcm.zza(zzbo.zzabj(), zzx, next.getKey(), next.getValue());
                    zzbeeVar.zza((zzbee<UT, UB>) ub, i2, zzbo.zzabi());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzbee<UT, UB> zzbeeVar) {
        zzbbs<?> zzcs;
        int i2 = this.zzdwg[i];
        Object zzp = zzbek.zzp(obj, zzct(i) & 1048575);
        return (zzp == null || (zzcs = zzcs(i)) == null) ? ub : (UB) zza(i, i2, this.zzdwx.zzs(zzp), zzcs, (zzbbs<?>) ub, (zzbee<UT, zzbbs<?>>) zzbeeVar);
    }

    private static void zza(int i, Object obj, zzbey zzbeyVar) throws IOException {
        if (obj instanceof String) {
            zzbeyVar.zzf(i, (String) obj);
        } else {
            zzbeyVar.zza(i, (zzbah) obj);
        }
    }

    private static <UT, UB> void zza(zzbee<UT, UB> zzbeeVar, T t, zzbey zzbeyVar) throws IOException {
        zzbeeVar.zza((zzbee<UT, UB>) zzbeeVar.zzac(t), zzbeyVar);
    }

    private final <K, V> void zza(zzbey zzbeyVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzbeyVar.zza(i, this.zzdwx.zzx(zzcr(i2)), this.zzdwx.zzt(obj));
        }
    }

    private final void zza(Object obj, int i, zzbdl zzbdlVar) throws IOException {
        long j;
        Object zzabs;
        if (zzcv(i)) {
            j = i & 1048575;
            zzabs = zzbdlVar.zzabr();
        } else {
            int i2 = i & 1048575;
            if (this.zzdwn) {
                j = i2;
                zzabs = zzbdlVar.readString();
            } else {
                j = i2;
                zzabs = zzbdlVar.zzabs();
            }
        }
        zzbek.zza(obj, j, zzabs);
    }

    private final void zza(T t, T t2, int i) {
        long zzct = zzct(i) & 1048575;
        if (zza((zzbcy<T>) t2, i)) {
            Object zzp = zzbek.zzp(t, zzct);
            Object zzp2 = zzbek.zzp(t2, zzct);
            if (zzp != null && zzp2 != null) {
                zzbek.zza(t, zzct, zzbbq.zza(zzp, zzp2));
                zzb((zzbcy<T>) t, i);
            } else if (zzp2 != null) {
                zzbek.zza(t, zzct, zzp2);
                zzb((zzbcy<T>) t, i);
            }
        }
    }

    private final boolean zza(T t, int i) {
        if (!this.zzdwo) {
            int zzcu = zzcu(i);
            return (zzbek.zzk(t, (long) (zzcu & 1048575)) & (1 << (zzcu >>> 20))) != 0;
        }
        int zzct = zzct(i);
        long j = zzct & 1048575;
        switch ((zzct & 267386880) >>> 20) {
            case 0:
                return zzbek.zzo(t, j) != 0.0d;
            case 1:
                return zzbek.zzn(t, j) != 0.0f;
            case 2:
                return zzbek.zzl(t, j) != 0;
            case 3:
                return zzbek.zzl(t, j) != 0;
            case 4:
                return zzbek.zzk(t, j) != 0;
            case 5:
                return zzbek.zzl(t, j) != 0;
            case 6:
                return zzbek.zzk(t, j) != 0;
            case 7:
                return zzbek.zzm(t, j);
            case 8:
                Object zzp = zzbek.zzp(t, j);
                if (zzp instanceof String) {
                    return !((String) zzp).isEmpty();
                } else if (zzp instanceof zzbah) {
                    return !zzbah.zzdpq.equals(zzp);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzbek.zzp(t, j) != null;
            case 10:
                return !zzbah.zzdpq.equals(zzbek.zzp(t, j));
            case 11:
                return zzbek.zzk(t, j) != 0;
            case 12:
                return zzbek.zzk(t, j) != 0;
            case 13:
                return zzbek.zzk(t, j) != 0;
            case 14:
                return zzbek.zzl(t, j) != 0;
            case 15:
                return zzbek.zzk(t, j) != 0;
            case 16:
                return zzbek.zzl(t, j) != 0;
            case 17:
                return zzbek.zzp(t, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzbek.zzk(t, (long) (zzcu(i2) & 1048575)) == i;
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        return this.zzdwo ? zza((zzbcy<T>) t, i) : (i2 & i3) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzbdm zzbdmVar) {
        return zzbdmVar.zzaa(zzbek.zzp(obj, i & 1048575));
    }

    private final void zzb(T t, int i) {
        if (this.zzdwo) {
            return;
        }
        int zzcu = zzcu(i);
        long j = zzcu & 1048575;
        zzbek.zzb(t, j, zzbek.zzk(t, j) | (1 << (zzcu >>> 20)));
    }

    private final void zzb(T t, int i, int i2) {
        zzbek.zzb(t, zzcu(i2) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0494  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(T t, zzbey zzbeyVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        int i2;
        int i3;
        if (this.zzdwm) {
            zzbbg<?> zzm = this.zzdww.zzm(t);
            if (!zzm.isEmpty()) {
                it = zzm.iterator();
                entry = it.next();
                int i4 = -1;
                length = this.zzdwg.length;
                Unsafe unsafe = zzdwf;
                i = 0;
                int i5 = 0;
                while (i < length) {
                    int zzct = zzct(i);
                    int[] iArr = this.zzdwg;
                    int i6 = iArr[i];
                    int i7 = (267386880 & zzct) >>> 20;
                    if (this.zzdwo || i7 > 17) {
                        i2 = i;
                        i3 = 0;
                    } else {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & 1048575;
                        i2 = i;
                        if (i9 != i4) {
                            i5 = unsafe.getInt(t, i9);
                            i4 = i9;
                        }
                        i3 = 1 << (i8 >>> 20);
                    }
                    while (entry != null && this.zzdww.zza(entry) <= i6) {
                        this.zzdww.zza(zzbeyVar, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    long j = zzct & 1048575;
                    int i10 = i2;
                    switch (i7) {
                        case 0:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zza(i6, zzbek.zzo(t, j));
                                continue;
                            }
                            i = i10 + 4;
                        case 1:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zza(i6, zzbek.zzn(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 2:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzi(i6, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 3:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zza(i6, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 4:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzm(i6, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 5:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzc(i6, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 6:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzp(i6, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 7:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzf(i6, zzbek.zzm(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 8:
                            if ((i3 & i5) != 0) {
                                zza(i6, unsafe.getObject(t, j), zzbeyVar);
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 9:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zza(i6, unsafe.getObject(t, j), zzcq(i10));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 10:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zza(i6, (zzbah) unsafe.getObject(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 11:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzn(i6, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 12:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzx(i6, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 13:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzw(i6, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 14:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzj(i6, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 15:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzo(i6, unsafe.getInt(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 16:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzb(i6, unsafe.getLong(t, j));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 17:
                            if ((i3 & i5) != 0) {
                                zzbeyVar.zzb(i6, unsafe.getObject(t, j), zzcq(i10));
                            } else {
                                continue;
                            }
                            i = i10 + 4;
                        case 18:
                            zzbdo.zza(this.zzdwg[i10], (List<Double>) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 19:
                            zzbdo.zzb(this.zzdwg[i10], (List<Float>) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 20:
                            zzbdo.zzc(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 21:
                            zzbdo.zzd(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 22:
                            zzbdo.zzh(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 23:
                            zzbdo.zzf(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 24:
                            zzbdo.zzk(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 25:
                            zzbdo.zzn(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 26:
                            zzbdo.zza(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar);
                            break;
                        case 27:
                            zzbdo.zza(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, zzcq(i10));
                            break;
                        case 28:
                            zzbdo.zzb(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar);
                            break;
                        case 29:
                            zzbdo.zzi(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 30:
                            zzbdo.zzm(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 31:
                            zzbdo.zzl(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 32:
                            zzbdo.zzg(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 33:
                            zzbdo.zzj(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 34:
                            zzbdo.zze(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, false);
                            continue;
                            i = i10 + 4;
                        case 35:
                            zzbdo.zza(this.zzdwg[i10], (List<Double>) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 36:
                            zzbdo.zzb(this.zzdwg[i10], (List<Float>) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 37:
                            zzbdo.zzc(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 38:
                            zzbdo.zzd(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 39:
                            zzbdo.zzh(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 40:
                            zzbdo.zzf(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 41:
                            zzbdo.zzk(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 42:
                            zzbdo.zzn(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 43:
                            zzbdo.zzi(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 44:
                            zzbdo.zzm(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 45:
                            zzbdo.zzl(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 46:
                            zzbdo.zzg(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 47:
                            zzbdo.zzj(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 48:
                            zzbdo.zze(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, true);
                            break;
                        case 49:
                            zzbdo.zzb(this.zzdwg[i10], (List) unsafe.getObject(t, j), zzbeyVar, zzcq(i10));
                            break;
                        case 50:
                            zza(zzbeyVar, i6, unsafe.getObject(t, j), i10);
                            break;
                        case 51:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zza(i6, zzf(t, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zza(i6, zzg(t, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzi(i6, zzi(t, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zza(i6, zzi(t, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzm(i6, zzh(t, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzc(i6, zzi(t, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzp(i6, zzh(t, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzf(i6, zzj(t, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zza(i6, unsafe.getObject(t, j), zzbeyVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zza(i6, unsafe.getObject(t, j), zzcq(i10));
                                break;
                            }
                            break;
                        case 61:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zza(i6, (zzbah) unsafe.getObject(t, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzn(i6, zzh(t, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzx(i6, zzh(t, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzw(i6, zzh(t, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzj(i6, zzi(t, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzo(i6, zzh(t, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzb(i6, zzi(t, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zza((zzbcy<T>) t, i6, i10)) {
                                zzbeyVar.zzb(i6, unsafe.getObject(t, j), zzcq(i10));
                                break;
                            }
                            break;
                    }
                    i = i10 + 4;
                }
                while (entry != null) {
                    this.zzdww.zza(zzbeyVar, entry);
                    entry = it.hasNext() ? it.next() : null;
                }
                zza(this.zzdwv, t, zzbeyVar);
            }
        }
        it = null;
        entry = null;
        int i42 = -1;
        length = this.zzdwg.length;
        Unsafe unsafe2 = zzdwf;
        i = 0;
        int i52 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        zza(this.zzdwv, t, zzbeyVar);
    }

    private final void zzb(T t, T t2, int i) {
        int zzct = zzct(i);
        int i2 = this.zzdwg[i];
        long j = zzct & 1048575;
        if (zza((zzbcy<T>) t2, i2, i)) {
            Object zzp = zzbek.zzp(t, j);
            Object zzp2 = zzbek.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzbek.zza(t, j, zzbbq.zza(zzp, zzp2));
                zzb((zzbcy<T>) t, i2, i);
            } else if (zzp2 != null) {
                zzbek.zza(t, j, zzp2);
                zzb((zzbcy<T>) t, i2, i);
            }
        }
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzbcy<T>) t, i) == zza((zzbcy<T>) t2, i);
    }

    private final zzbdm zzcq(int i) {
        int i2 = (i / 4) << 1;
        zzbdm zzbdmVar = (zzbdm) this.zzdwh[i2];
        if (zzbdmVar != null) {
            return zzbdmVar;
        }
        zzbdm<T> zze = zzbdg.zzaeo().zze((Class) this.zzdwh[i2 + 1]);
        this.zzdwh[i2] = zze;
        return zze;
    }

    private final Object zzcr(int i) {
        return this.zzdwh[(i / 4) << 1];
    }

    private final zzbbs<?> zzcs(int i) {
        return (zzbbs) this.zzdwh[((i / 4) << 1) + 1];
    }

    private final int zzct(int i) {
        return this.zzdwg[i + 1];
    }

    private final int zzcu(int i) {
        return this.zzdwg[i + 2];
    }

    private static boolean zzcv(int i) {
        return (i & 536870912) != 0;
    }

    private final int zzcw(int i) {
        int i2 = this.zzdwi;
        if (i >= i2) {
            int i3 = this.zzdwk;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.zzdwg[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.zzdwj) {
                int i5 = i3 - i2;
                int length = (this.zzdwg.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.zzdwg[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private static <E> List<E> zze(Object obj, long j) {
        return (List) zzbek.zzp(obj, j);
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzbek.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzbek.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzbek.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzbek.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzbek.zzp(t, j)).booleanValue();
    }

    private static zzbef zzz(Object obj) {
        zzbbo zzbboVar = (zzbbo) obj;
        zzbef zzbefVar = zzbboVar.zzdtt;
        if (zzbefVar == zzbef.zzagc()) {
            zzbef zzagd = zzbef.zzagd();
            zzbboVar.zzdtt = zzagd;
            return zzagd;
        }
        return zzbefVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (com.google.android.gms.internal.ads.zzbdo.zzd(com.google.android.gms.internal.ads.zzbek.zzp(r10, r6), com.google.android.gms.internal.ads.zzbek.zzp(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzm(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzm(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0145, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0156, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0169, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017c, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzl(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
        if (com.google.android.gms.internal.ads.zzbek.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbek.zzk(r11, r6)) goto L84;
     */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(T t, T t2) {
        int length = this.zzdwg.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                if (this.zzdwv.zzac(t).equals(this.zzdwv.zzac(t2))) {
                    if (this.zzdwm) {
                        return this.zzdww.zzm(t).equals(this.zzdww.zzm(t2));
                    }
                    return true;
                }
                return false;
            }
            int zzct = zzct(i);
            long j = zzct & 1048575;
            switch ((zzct & 267386880) >>> 20) {
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
                case 50:
                    z = zzbdo.zzd(zzbek.zzp(t, j), zzbek.zzp(t2, j));
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
                    long zzcu = zzcu(i) & 1048575;
                    if (zzbek.zzk(t, zzcu) == zzbek.zzk(t2, zzcu)) {
                        break;
                    }
                    z = false;
                    break;
            }
            if (!z) {
                return false;
            }
            i += 4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode(T t) {
        int i;
        double zzo;
        float zzn;
        long zzl;
        int zzk;
        boolean zzm;
        Object zzp;
        Object zzp2;
        int length = this.zzdwg.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 4) {
            int zzct = zzct(i3);
            int i4 = this.zzdwg[i3];
            long j = 1048575 & zzct;
            int i5 = 37;
            switch ((zzct & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzo = zzbek.zzo(t, j);
                    zzl = Double.doubleToLongBits(zzo);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 1:
                    i = i2 * 53;
                    zzn = zzbek.zzn(t, j);
                    zzk = Float.floatToIntBits(zzn);
                    i2 = i + zzk;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    zzl = zzbek.zzl(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    zzk = zzbek.zzk(t, j);
                    i2 = i + zzk;
                    break;
                case 7:
                    i = i2 * 53;
                    zzm = zzbek.zzm(t, j);
                    zzk = zzbbq.zzar(zzm);
                    i2 = i + zzk;
                    break;
                case 8:
                    i = i2 * 53;
                    zzk = ((String) zzbek.zzp(t, j)).hashCode();
                    i2 = i + zzk;
                    break;
                case 9:
                    zzp = zzbek.zzp(t, j);
                    break;
                case 10:
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
                case 50:
                    i = i2 * 53;
                    zzp2 = zzbek.zzp(t, j);
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
                case 17:
                    zzp = zzbek.zzp(t, j);
                    break;
                case 51:
                    if (zza((zzbcy<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzo = zzf(t, j);
                        zzl = Double.doubleToLongBits(zzo);
                        zzk = zzbbq.zzv(zzl);
                        i2 = i + zzk;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzbcy<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzn = zzg(t, j);
                        zzk = Float.floatToIntBits(zzn);
                        i2 = i + zzk;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 54:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 55:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 56:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 57:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 58:
                    if (zza((zzbcy<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzm = zzj(t, j);
                        zzk = zzbbq.zzar(zzm);
                        i2 = i + zzk;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = ((String) zzbek.zzp(t, j)).hashCode();
                    i2 = i + zzk;
                    break;
                case 60:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    zzp2 = zzbek.zzp(t, j);
                    i = i2 * 53;
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
                case 61:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzp2 = zzbek.zzp(t, j);
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
                case 62:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 63:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 64:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 65:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 66:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 67:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzbbq.zzv(zzl);
                    i2 = i + zzk;
                    break;
                case 68:
                    if (!zza((zzbcy<T>) t, i4, i3)) {
                        break;
                    }
                    zzp2 = zzbek.zzp(t, j);
                    i = i2 * 53;
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
            }
        }
        int hashCode = (i2 * 53) + this.zzdwv.zzac(t).hashCode();
        return this.zzdwm ? (hashCode * 53) + this.zzdww.zzm(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final T newInstance() {
        return (T) this.zzdwt.newInstance(this.zzdwl);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza(T t, zzbdl zzbdlVar, zzbbb zzbbbVar) throws IOException {
        long j;
        Object zza;
        int zzabu;
        List<Double> zza2;
        List<Float> zza3;
        List<Long> zza4;
        List<Long> zza5;
        List<Integer> zza6;
        List<Long> zza7;
        List<Integer> zza8;
        List<Boolean> zza9;
        List<Integer> zza10;
        List<Integer> zza11;
        zzbbs<?> zzcs;
        List<Integer> zza12;
        List<Long> zza13;
        List<Integer> zza14;
        List<Long> zza15;
        if (zzbbbVar == null) {
            throw null;
        }
        zzbee zzbeeVar = this.zzdwv;
        zzbbd<?> zzbbdVar = this.zzdww;
        zzbbg<?> zzbbgVar = null;
        Object obj = null;
        while (true) {
            int i = 0;
            try {
                int zzaci = zzbdlVar.zzaci();
                int zzcw = zzcw(zzaci);
                if (zzcw >= 0) {
                    int zzct = zzct(zzcw);
                    switch ((267386880 & zzct) >>> 20) {
                        case 0:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.readDouble());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 1:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.readFloat());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 2:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzabm());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 3:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzabl());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 4:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabn());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 5:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzabo());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 6:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabp());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 7:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.zzabq());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 8:
                            zza(t, zzct, zzbdlVar);
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 9:
                            if (!zza((zzbcy<T>) t, zzcw)) {
                                zzbek.zza(t, zzct & 1048575, zzbdlVar.zza(zzcq(zzcw), zzbbbVar));
                                zzb((zzbcy<T>) t, zzcw);
                                break;
                            } else {
                                j = zzct & 1048575;
                                zza = zzbbq.zza(zzbek.zzp(t, j), zzbdlVar.zza(zzcq(zzcw), zzbbbVar));
                                zzbek.zza(t, j, zza);
                                break;
                            }
                        case 10:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.zzabs());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 11:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabt());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 12:
                            zzabu = zzbdlVar.zzabu();
                            zzbbs<?> zzcs2 = zzcs(zzcw);
                            if (zzcs2 != null && zzcs2.zzq(zzabu) == null) {
                                obj = zzbdo.zza(zzaci, zzabu, obj, zzbeeVar);
                                break;
                            } else {
                                zzbek.zzb(t, zzct & 1048575, zzabu);
                                zzb((zzbcy<T>) t, zzcw);
                                break;
                            }
                        case 13:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabv());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 14:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzabw());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 15:
                            zzbek.zzb(t, zzct & 1048575, zzbdlVar.zzabx());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 16:
                            zzbek.zza((Object) t, zzct & 1048575, zzbdlVar.zzaby());
                            zzb((zzbcy<T>) t, zzcw);
                            break;
                        case 17:
                            if (!zza((zzbcy<T>) t, zzcw)) {
                                zzbek.zza(t, zzct & 1048575, zzbdlVar.zzb(zzcq(zzcw), zzbbbVar));
                                zzb((zzbcy<T>) t, zzcw);
                                break;
                            } else {
                                j = zzct & 1048575;
                                zza = zzbbq.zza(zzbek.zzp(t, j), zzbdlVar.zzb(zzcq(zzcw), zzbbbVar));
                                zzbek.zza(t, j, zza);
                                break;
                            }
                        case 18:
                            zza2 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzp(zza2);
                            break;
                        case 19:
                            zza3 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzq(zza3);
                            break;
                        case 20:
                            zza4 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzs(zza4);
                            break;
                        case 21:
                            zza5 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzr(zza5);
                            break;
                        case 22:
                            zza6 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzt(zza6);
                            break;
                        case 23:
                            zza7 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzu(zza7);
                            break;
                        case 24:
                            zza8 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzv(zza8);
                            break;
                        case 25:
                            zza9 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzw(zza9);
                            break;
                        case 26:
                            if (!zzcv(zzct)) {
                                zzbdlVar.readStringList(this.zzdwu.zza(t, zzct & 1048575));
                                break;
                            } else {
                                zzbdlVar.zzx(this.zzdwu.zza(t, zzct & 1048575));
                                break;
                            }
                        case 27:
                            zzbdlVar.zza(this.zzdwu.zza(t, zzct & 1048575), zzcq(zzcw), zzbbbVar);
                            break;
                        case 28:
                            zzbdlVar.zzy(this.zzdwu.zza(t, zzct & 1048575));
                            break;
                        case 29:
                            zza10 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzz(zza10);
                            break;
                        case 30:
                            zza11 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzaa(zza11);
                            zzcs = zzcs(zzcw);
                            obj = zzbdo.zza(zzaci, zza11, zzcs, obj, zzbeeVar);
                            break;
                        case 31:
                            zza12 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzab(zza12);
                            break;
                        case 32:
                            zza13 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzac(zza13);
                            break;
                        case 33:
                            zza14 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzad(zza14);
                            break;
                        case 34:
                            zza15 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzae(zza15);
                            break;
                        case 35:
                            zza2 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzp(zza2);
                            break;
                        case 36:
                            zza3 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzq(zza3);
                            break;
                        case 37:
                            zza4 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzs(zza4);
                            break;
                        case 38:
                            zza5 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzr(zza5);
                            break;
                        case 39:
                            zza6 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzt(zza6);
                            break;
                        case 40:
                            zza7 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzu(zza7);
                            break;
                        case 41:
                            zza8 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzv(zza8);
                            break;
                        case 42:
                            zza9 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzw(zza9);
                            break;
                        case 43:
                            zza10 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzz(zza10);
                            break;
                        case 44:
                            zza11 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzaa(zza11);
                            zzcs = zzcs(zzcw);
                            obj = zzbdo.zza(zzaci, zza11, zzcs, obj, zzbeeVar);
                            break;
                        case 45:
                            zza12 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzab(zza12);
                            break;
                        case 46:
                            zza13 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzac(zza13);
                            break;
                        case 47:
                            zza14 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzad(zza14);
                            break;
                        case 48:
                            zza15 = this.zzdwu.zza(t, zzct & 1048575);
                            zzbdlVar.zzae(zza15);
                            break;
                        case 49:
                            zzbdlVar.zzb(this.zzdwu.zza(t, zzct & 1048575), zzcq(zzcw), zzbbbVar);
                            break;
                        case 50:
                            Object zzcr = zzcr(zzcw);
                            long zzct2 = zzct(zzcw) & 1048575;
                            Object zzp = zzbek.zzp(t, zzct2);
                            if (zzp == null) {
                                zzp = this.zzdwx.zzw(zzcr);
                                zzbek.zza(t, zzct2, zzp);
                            } else if (this.zzdwx.zzu(zzp)) {
                                Object zzw = this.zzdwx.zzw(zzcr);
                                this.zzdwx.zzb(zzw, zzp);
                                zzbek.zza(t, zzct2, zzw);
                                zzp = zzw;
                            }
                            zzbdlVar.zza(this.zzdwx.zzs(zzp), this.zzdwx.zzx(zzcr), zzbbbVar);
                            break;
                        case 51:
                            zzbek.zza(t, zzct & 1048575, Double.valueOf(zzbdlVar.readDouble()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 52:
                            zzbek.zza(t, zzct & 1048575, Float.valueOf(zzbdlVar.readFloat()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 53:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzabm()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 54:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzabl()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 55:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabn()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 56:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzabo()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 57:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabp()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 58:
                            zzbek.zza(t, zzct & 1048575, Boolean.valueOf(zzbdlVar.zzabq()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 59:
                            zza(t, zzct, zzbdlVar);
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 60:
                            int i2 = zzct & 1048575;
                            if (zza((zzbcy<T>) t, zzaci, zzcw)) {
                                long j2 = i2;
                                zzbek.zza(t, j2, zzbbq.zza(zzbek.zzp(t, j2), zzbdlVar.zza(zzcq(zzcw), zzbbbVar)));
                            } else {
                                zzbek.zza(t, i2, zzbdlVar.zza(zzcq(zzcw), zzbbbVar));
                                zzb((zzbcy<T>) t, zzcw);
                            }
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 61:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.zzabs());
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 62:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabt()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 63:
                            zzabu = zzbdlVar.zzabu();
                            zzbbs<?> zzcs3 = zzcs(zzcw);
                            if (zzcs3 != null && zzcs3.zzq(zzabu) == null) {
                                obj = zzbdo.zza(zzaci, zzabu, obj, zzbeeVar);
                                break;
                            }
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzabu));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 64:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabv()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 65:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzabw()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 66:
                            zzbek.zza(t, zzct & 1048575, Integer.valueOf(zzbdlVar.zzabx()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 67:
                            zzbek.zza(t, zzct & 1048575, Long.valueOf(zzbdlVar.zzaby()));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        case 68:
                            zzbek.zza(t, zzct & 1048575, zzbdlVar.zzb(zzcq(zzcw), zzbbbVar));
                            zzb((zzbcy<T>) t, zzaci, zzcw);
                            break;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzbeeVar.zzagb();
                                } catch (zzbbv unused) {
                                    zzbeeVar.zza(zzbdlVar);
                                    if (obj == null) {
                                        obj = zzbeeVar.zzad(t);
                                    }
                                    if (!zzbeeVar.zza((zzbee) obj, zzbdlVar)) {
                                        int[] iArr = this.zzdwr;
                                        if (iArr != null) {
                                            int length = iArr.length;
                                            while (i < length) {
                                                obj = zza((Object) t, iArr[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                                                i++;
                                            }
                                        }
                                        if (obj != null) {
                                            zzbeeVar.zzf(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzbeeVar.zza((zzbee) obj, zzbdlVar)) {
                                int[] iArr2 = this.zzdwr;
                                if (iArr2 != null) {
                                    int length2 = iArr2.length;
                                    while (i < length2) {
                                        obj = zza((Object) t, iArr2[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                                        i++;
                                    }
                                }
                                if (obj != null) {
                                    zzbeeVar.zzf(t, obj);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                } else if (zzaci == Integer.MAX_VALUE) {
                    int[] iArr3 = this.zzdwr;
                    if (iArr3 != null) {
                        int length3 = iArr3.length;
                        while (i < length3) {
                            obj = zza((Object) t, iArr3[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                            i++;
                        }
                    }
                    if (obj != null) {
                        zzbeeVar.zzf(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object zza16 = !this.zzdwm ? null : zzbbdVar.zza(zzbbbVar, this.zzdwl, zzaci);
                    if (zza16 != null) {
                        if (zzbbgVar == null) {
                            zzbbgVar = zzbbdVar.zzn(t);
                        }
                        zzbbg<?> zzbbgVar2 = zzbbgVar;
                        obj = zzbbdVar.zza(zzbdlVar, zza16, zzbbbVar, zzbbgVar2, obj, zzbeeVar);
                        zzbbgVar = zzbbgVar2;
                    } else {
                        zzbeeVar.zza(zzbdlVar);
                        if (obj == null) {
                            obj = zzbeeVar.zzad(t);
                        }
                        if (!zzbeeVar.zza((zzbee) obj, zzbdlVar)) {
                            int[] iArr4 = this.zzdwr;
                            if (iArr4 != null) {
                                int length4 = iArr4.length;
                                while (i < length4) {
                                    obj = zza((Object) t, iArr4[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                                    i++;
                                }
                            }
                            if (obj != null) {
                                zzbeeVar.zzf(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                int[] iArr5 = this.zzdwr;
                if (iArr5 != null) {
                    int length5 = iArr5.length;
                    while (i < length5) {
                        obj = zza((Object) t, iArr5[i], (int) obj, (zzbee<UT, int>) zzbeeVar);
                        i++;
                    }
                }
                if (obj != null) {
                    zzbeeVar.zzf(t, obj);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0976  */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzbey zzbeyVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        double zzo;
        float zzn;
        long zzl;
        long zzl2;
        int zzk;
        long zzl3;
        int zzk2;
        boolean zzm;
        int zzk3;
        int zzk4;
        int zzk5;
        long zzl4;
        int zzk6;
        long zzl5;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, Object> entry2;
        int length2;
        double zzo2;
        float zzn2;
        long zzl6;
        long zzl7;
        int zzk7;
        long zzl8;
        int zzk8;
        boolean zzm2;
        int zzk9;
        int zzk10;
        int zzk11;
        long zzl9;
        int zzk12;
        long zzl10;
        if (zzbeyVar.zzacn() == zzbbo.zze.zzdum) {
            zza(this.zzdwv, t, zzbeyVar);
            if (this.zzdwm) {
                zzbbg<?> zzm3 = this.zzdww.zzm(t);
                if (!zzm3.isEmpty()) {
                    it2 = zzm3.descendingIterator();
                    entry2 = it2.next();
                    for (length2 = this.zzdwg.length - 4; length2 >= 0; length2 -= 4) {
                        int zzct = zzct(length2);
                        int i2 = this.zzdwg[length2];
                        while (entry2 != null && this.zzdww.zza(entry2) > i2) {
                            this.zzdww.zza(zzbeyVar, entry2);
                            entry2 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((zzct & 267386880) >>> 20) {
                            case 0:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzo2 = zzbek.zzo(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzo2);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzn2 = zzbek.zzn(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzn2);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl6 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zzi(i2, zzl6);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl7 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzl7);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk7 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzm(i2, zzk7);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl8 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zzc(i2, zzl8);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk8 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzp(i2, zzk8);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzm2 = zzbek.zzm(t, zzct & 1048575);
                                    zzbeyVar.zzf(i2, zzm2);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!zza((zzbcy<T>) t, length2)) {
                                    break;
                                }
                                zza(i2, zzbek.zzp(t, zzct & 1048575), zzbeyVar);
                                break;
                            case 9:
                                if (!zza((zzbcy<T>) t, length2)) {
                                    break;
                                }
                                zzbeyVar.zza(i2, zzbek.zzp(t, zzct & 1048575), zzcq(length2));
                                break;
                            case 10:
                                if (!zza((zzbcy<T>) t, length2)) {
                                    break;
                                }
                                zzbeyVar.zza(i2, (zzbah) zzbek.zzp(t, zzct & 1048575));
                                break;
                            case 11:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk9 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzn(i2, zzk9);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk10 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzx(i2, zzk10);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk11 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzw(i2, zzk11);
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl9 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zzj(i2, zzl9);
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzk12 = zzbek.zzk(t, zzct & 1048575);
                                    zzbeyVar.zzo(i2, zzk12);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((zzbcy<T>) t, length2)) {
                                    zzl10 = zzbek.zzl(t, zzct & 1048575);
                                    zzbeyVar.zzb(i2, zzl10);
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (!zza((zzbcy<T>) t, length2)) {
                                    break;
                                }
                                zzbeyVar.zzb(i2, zzbek.zzp(t, zzct & 1048575), zzcq(length2));
                                break;
                            case 18:
                                zzbdo.zza(this.zzdwg[length2], (List<Double>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 19:
                                zzbdo.zzb(this.zzdwg[length2], (List<Float>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 20:
                                zzbdo.zzc(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 21:
                                zzbdo.zzd(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 22:
                                zzbdo.zzh(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 23:
                                zzbdo.zzf(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 24:
                                zzbdo.zzk(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 25:
                                zzbdo.zzn(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 26:
                                zzbdo.zza(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar);
                                break;
                            case 27:
                                zzbdo.zza(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, zzcq(length2));
                                break;
                            case 28:
                                zzbdo.zzb(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar);
                                break;
                            case 29:
                                zzbdo.zzi(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 30:
                                zzbdo.zzm(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 31:
                                zzbdo.zzl(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 32:
                                zzbdo.zzg(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 33:
                                zzbdo.zzj(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 34:
                                zzbdo.zze(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, false);
                                break;
                            case 35:
                                zzbdo.zza(this.zzdwg[length2], (List<Double>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 36:
                                zzbdo.zzb(this.zzdwg[length2], (List<Float>) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 37:
                                zzbdo.zzc(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 38:
                                zzbdo.zzd(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 39:
                                zzbdo.zzh(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 40:
                                zzbdo.zzf(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 41:
                                zzbdo.zzk(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 42:
                                zzbdo.zzn(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 43:
                                zzbdo.zzi(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 44:
                                zzbdo.zzm(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 45:
                                zzbdo.zzl(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 46:
                                zzbdo.zzg(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 47:
                                zzbdo.zzj(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 48:
                                zzbdo.zze(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, true);
                                break;
                            case 49:
                                zzbdo.zzb(this.zzdwg[length2], (List) zzbek.zzp(t, zzct & 1048575), zzbeyVar, zzcq(length2));
                                break;
                            case 50:
                                zza(zzbeyVar, i2, zzbek.zzp(t, zzct & 1048575), length2);
                                break;
                            case 51:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzo2 = zzf(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzo2);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzn2 = zzg(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzn2);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl6 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zzi(i2, zzl6);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl7 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zza(i2, zzl7);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk7 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzm(i2, zzk7);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl8 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zzc(i2, zzl8);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk8 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzp(i2, zzk8);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzm2 = zzj(t, zzct & 1048575);
                                    zzbeyVar.zzf(i2, zzm2);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!zza((zzbcy<T>) t, i2, length2)) {
                                    break;
                                }
                                zza(i2, zzbek.zzp(t, zzct & 1048575), zzbeyVar);
                                break;
                            case 60:
                                if (!zza((zzbcy<T>) t, i2, length2)) {
                                    break;
                                }
                                zzbeyVar.zza(i2, zzbek.zzp(t, zzct & 1048575), zzcq(length2));
                                break;
                            case 61:
                                if (!zza((zzbcy<T>) t, i2, length2)) {
                                    break;
                                }
                                zzbeyVar.zza(i2, (zzbah) zzbek.zzp(t, zzct & 1048575));
                                break;
                            case 62:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk9 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzn(i2, zzk9);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk10 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzx(i2, zzk10);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk11 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzw(i2, zzk11);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl9 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zzj(i2, zzl9);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzk12 = zzh(t, zzct & 1048575);
                                    zzbeyVar.zzo(i2, zzk12);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((zzbcy<T>) t, i2, length2)) {
                                    zzl10 = zzi(t, zzct & 1048575);
                                    zzbeyVar.zzb(i2, zzl10);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!zza((zzbcy<T>) t, i2, length2)) {
                                    break;
                                }
                                zzbeyVar.zzb(i2, zzbek.zzp(t, zzct & 1048575), zzcq(length2));
                                break;
                        }
                    }
                    while (entry2 != null) {
                        this.zzdww.zza(zzbeyVar, entry2);
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
        } else if (!this.zzdwo) {
            zzb((zzbcy<T>) t, zzbeyVar);
        } else {
            if (this.zzdwm) {
                zzbbg<?> zzm4 = this.zzdww.zzm(t);
                if (!zzm4.isEmpty()) {
                    it = zzm4.iterator();
                    entry = it.next();
                    length = this.zzdwg.length;
                    for (i = 0; i < length; i += 4) {
                        int zzct2 = zzct(i);
                        int i3 = this.zzdwg[i];
                        while (entry != null && this.zzdww.zza(entry) <= i3) {
                            this.zzdww.zza(zzbeyVar, entry);
                            entry = it.hasNext() ? it.next() : null;
                        }
                        switch ((zzct2 & 267386880) >>> 20) {
                            case 0:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzo = zzbek.zzo(t, zzct2 & 1048575);
                                    zzbeyVar.zza(i3, zzo);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzn = zzbek.zzn(t, zzct2 & 1048575);
                                    zzbeyVar.zza(i3, zzn);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzl = zzbek.zzl(t, zzct2 & 1048575);
                                    zzbeyVar.zzi(i3, zzl);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzl2 = zzbek.zzl(t, zzct2 & 1048575);
                                    zzbeyVar.zza(i3, zzl2);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzk = zzbek.zzk(t, zzct2 & 1048575);
                                    zzbeyVar.zzm(i3, zzk);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzl3 = zzbek.zzl(t, zzct2 & 1048575);
                                    zzbeyVar.zzc(i3, zzl3);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzk2 = zzbek.zzk(t, zzct2 & 1048575);
                                    zzbeyVar.zzp(i3, zzk2);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzm = zzbek.zzm(t, zzct2 & 1048575);
                                    zzbeyVar.zzf(i3, zzm);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!zza((zzbcy<T>) t, i)) {
                                    break;
                                }
                                zza(i3, zzbek.zzp(t, zzct2 & 1048575), zzbeyVar);
                                break;
                            case 9:
                                if (!zza((zzbcy<T>) t, i)) {
                                    break;
                                }
                                zzbeyVar.zza(i3, zzbek.zzp(t, zzct2 & 1048575), zzcq(i));
                                break;
                            case 10:
                                if (!zza((zzbcy<T>) t, i)) {
                                    break;
                                }
                                zzbeyVar.zza(i3, (zzbah) zzbek.zzp(t, zzct2 & 1048575));
                                break;
                            case 11:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzk3 = zzbek.zzk(t, zzct2 & 1048575);
                                    zzbeyVar.zzn(i3, zzk3);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzk4 = zzbek.zzk(t, zzct2 & 1048575);
                                    zzbeyVar.zzx(i3, zzk4);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzk5 = zzbek.zzk(t, zzct2 & 1048575);
                                    zzbeyVar.zzw(i3, zzk5);
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzl4 = zzbek.zzl(t, zzct2 & 1048575);
                                    zzbeyVar.zzj(i3, zzl4);
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzk6 = zzbek.zzk(t, zzct2 & 1048575);
                                    zzbeyVar.zzo(i3, zzk6);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((zzbcy<T>) t, i)) {
                                    zzl5 = zzbek.zzl(t, zzct2 & 1048575);
                                    zzbeyVar.zzb(i3, zzl5);
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (!zza((zzbcy<T>) t, i)) {
                                    break;
                                }
                                zzbeyVar.zzb(i3, zzbek.zzp(t, zzct2 & 1048575), zzcq(i));
                                break;
                            case 18:
                                zzbdo.zza(this.zzdwg[i], (List<Double>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 19:
                                zzbdo.zzb(this.zzdwg[i], (List<Float>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 20:
                                zzbdo.zzc(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 21:
                                zzbdo.zzd(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 22:
                                zzbdo.zzh(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 23:
                                zzbdo.zzf(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 24:
                                zzbdo.zzk(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 25:
                                zzbdo.zzn(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 26:
                                zzbdo.zza(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar);
                                break;
                            case 27:
                                zzbdo.zza(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, zzcq(i));
                                break;
                            case 28:
                                zzbdo.zzb(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar);
                                break;
                            case 29:
                                zzbdo.zzi(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 30:
                                zzbdo.zzm(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 31:
                                zzbdo.zzl(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 32:
                                zzbdo.zzg(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 33:
                                zzbdo.zzj(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 34:
                                zzbdo.zze(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, false);
                                break;
                            case 35:
                                zzbdo.zza(this.zzdwg[i], (List<Double>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 36:
                                zzbdo.zzb(this.zzdwg[i], (List<Float>) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 37:
                                zzbdo.zzc(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 38:
                                zzbdo.zzd(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 39:
                                zzbdo.zzh(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 40:
                                zzbdo.zzf(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 41:
                                zzbdo.zzk(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 42:
                                zzbdo.zzn(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 43:
                                zzbdo.zzi(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 44:
                                zzbdo.zzm(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 45:
                                zzbdo.zzl(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 46:
                                zzbdo.zzg(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 47:
                                zzbdo.zzj(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 48:
                                zzbdo.zze(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, true);
                                break;
                            case 49:
                                zzbdo.zzb(this.zzdwg[i], (List) zzbek.zzp(t, zzct2 & 1048575), zzbeyVar, zzcq(i));
                                break;
                            case 50:
                                zza(zzbeyVar, i3, zzbek.zzp(t, zzct2 & 1048575), i);
                                break;
                            case 51:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzo = zzf(t, zzct2 & 1048575);
                                    zzbeyVar.zza(i3, zzo);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzn = zzg(t, zzct2 & 1048575);
                                    zzbeyVar.zza(i3, zzn);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzl = zzi(t, zzct2 & 1048575);
                                    zzbeyVar.zzi(i3, zzl);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzl2 = zzi(t, zzct2 & 1048575);
                                    zzbeyVar.zza(i3, zzl2);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzk = zzh(t, zzct2 & 1048575);
                                    zzbeyVar.zzm(i3, zzk);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzl3 = zzi(t, zzct2 & 1048575);
                                    zzbeyVar.zzc(i3, zzl3);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzk2 = zzh(t, zzct2 & 1048575);
                                    zzbeyVar.zzp(i3, zzk2);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzm = zzj(t, zzct2 & 1048575);
                                    zzbeyVar.zzf(i3, zzm);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!zza((zzbcy<T>) t, i3, i)) {
                                    break;
                                }
                                zza(i3, zzbek.zzp(t, zzct2 & 1048575), zzbeyVar);
                                break;
                            case 60:
                                if (!zza((zzbcy<T>) t, i3, i)) {
                                    break;
                                }
                                zzbeyVar.zza(i3, zzbek.zzp(t, zzct2 & 1048575), zzcq(i));
                                break;
                            case 61:
                                if (!zza((zzbcy<T>) t, i3, i)) {
                                    break;
                                }
                                zzbeyVar.zza(i3, (zzbah) zzbek.zzp(t, zzct2 & 1048575));
                                break;
                            case 62:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzk3 = zzh(t, zzct2 & 1048575);
                                    zzbeyVar.zzn(i3, zzk3);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzk4 = zzh(t, zzct2 & 1048575);
                                    zzbeyVar.zzx(i3, zzk4);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzk5 = zzh(t, zzct2 & 1048575);
                                    zzbeyVar.zzw(i3, zzk5);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzl4 = zzi(t, zzct2 & 1048575);
                                    zzbeyVar.zzj(i3, zzl4);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzk6 = zzh(t, zzct2 & 1048575);
                                    zzbeyVar.zzo(i3, zzk6);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((zzbcy<T>) t, i3, i)) {
                                    zzl5 = zzi(t, zzct2 & 1048575);
                                    zzbeyVar.zzb(i3, zzl5);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!zza((zzbcy<T>) t, i3, i)) {
                                    break;
                                }
                                zzbeyVar.zzb(i3, zzbek.zzp(t, zzct2 & 1048575), zzcq(i));
                                break;
                        }
                    }
                    while (entry != null) {
                        this.zzdww.zza(zzbeyVar, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    zza(this.zzdwv, t, zzbeyVar);
                }
            }
            it = null;
            entry = null;
            length = this.zzdwg.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            zza(this.zzdwv, t, zzbeyVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a1, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzbae zzbaeVar) throws IOException {
        byte b;
        int i3;
        Unsafe unsafe;
        int i4;
        int zzb;
        long j;
        Object zza;
        int i5;
        zzbcy<T> zzbcyVar = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i6 = i2;
        zzbae zzbaeVar2 = zzbaeVar;
        if (!zzbcyVar.zzdwo) {
            zza((zzbcy<T>) t, bArr, i, i2, 0, zzbaeVar);
            return;
        }
        Unsafe unsafe2 = zzdwf;
        int i7 = i;
        while (i7 < i6) {
            int i8 = i7 + 1;
            byte b2 = bArr2[i7];
            if (b2 < 0) {
                i3 = zzbad.zza(b2, bArr2, i8, zzbaeVar2);
                b = zzbaeVar2.zzdpl;
            } else {
                b = b2;
                i3 = i8;
            }
            int i9 = b >>> 3;
            int i10 = b & 7;
            int zzcw = zzbcyVar.zzcw(i9);
            if (zzcw >= 0) {
                int i11 = zzbcyVar.zzdwg[zzcw + 1];
                int i12 = (267386880 & i11) >>> 20;
                long j2 = 1048575 & i11;
                if (i12 <= 17) {
                    switch (i12) {
                        case 0:
                            if (i10 != 1) {
                                break;
                            } else {
                                zzbek.zza(t2, j2, zzbad.zzg(bArr2, i3));
                                i7 = i3 + 8;
                                break;
                            }
                        case 1:
                            if (i10 != 5) {
                                break;
                            } else {
                                zzbek.zza((Object) t2, j2, zzbad.zzh(bArr2, i3));
                                i7 = i3 + 4;
                                break;
                            }
                        case 2:
                        case 3:
                            if (i10 != 0) {
                                break;
                            } else {
                                zzb = zzbad.zzb(bArr2, i3, zzbaeVar2);
                                j = zzbaeVar2.zzdpm;
                                unsafe2.putLong(t, j2, j);
                                i7 = zzb;
                                break;
                            }
                        case 4:
                        case 11:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = zzbad.zza(bArr2, i3, zzbaeVar2);
                                i5 = zzbaeVar2.zzdpl;
                                unsafe2.putInt(t2, j2, i5);
                                break;
                            }
                        case 5:
                        case 14:
                            if (i10 != 1) {
                                break;
                            } else {
                                unsafe2.putLong(t, j2, zzbad.zzf(bArr2, i3));
                                i7 = i3 + 8;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i10 != 5) {
                                break;
                            } else {
                                unsafe2.putInt(t2, j2, zzbad.zze(bArr2, i3));
                                i7 = i3 + 4;
                                break;
                            }
                        case 7:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = zzbad.zzb(bArr2, i3, zzbaeVar2);
                                zzbek.zza(t2, j2, zzbaeVar2.zzdpm != 0);
                                break;
                            }
                        case 8:
                            if (i10 != 2) {
                                break;
                            } else {
                                i7 = (536870912 & i11) == 0 ? zzbad.zzc(bArr2, i3, zzbaeVar2) : zzbad.zzd(bArr2, i3, zzbaeVar2);
                                zza = zzbaeVar2.zzdpn;
                                unsafe2.putObject(t2, j2, zza);
                                break;
                            }
                        case 9:
                            if (i10 != 2) {
                                break;
                            } else {
                                i7 = zza(zzbcyVar.zzcq(zzcw), bArr2, i3, i6, zzbaeVar2);
                                Object object = unsafe2.getObject(t2, j2);
                                if (object != null) {
                                    zza = zzbbq.zza(object, zzbaeVar2.zzdpn);
                                    unsafe2.putObject(t2, j2, zza);
                                    break;
                                }
                                zza = zzbaeVar2.zzdpn;
                                unsafe2.putObject(t2, j2, zza);
                            }
                        case 10:
                            if (i10 != 2) {
                                break;
                            } else {
                                i7 = zzbad.zze(bArr2, i3, zzbaeVar2);
                                zza = zzbaeVar2.zzdpn;
                                unsafe2.putObject(t2, j2, zza);
                                break;
                            }
                        case 12:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = zzbad.zza(bArr2, i3, zzbaeVar2);
                                i5 = zzbaeVar2.zzdpl;
                                unsafe2.putInt(t2, j2, i5);
                                break;
                            }
                        case 15:
                            if (i10 != 0) {
                                break;
                            } else {
                                i7 = zzbad.zza(bArr2, i3, zzbaeVar2);
                                i5 = zzbaq.zzbu(zzbaeVar2.zzdpl);
                                unsafe2.putInt(t2, j2, i5);
                                break;
                            }
                        case 16:
                            if (i10 != 0) {
                                break;
                            } else {
                                zzb = zzbad.zzb(bArr2, i3, zzbaeVar2);
                                j = zzbaq.zzl(zzbaeVar2.zzdpm);
                                unsafe2.putLong(t, j2, j);
                                i7 = zzb;
                                break;
                            }
                    }
                } else if (i12 != 27) {
                    if (i12 <= 49) {
                        unsafe = unsafe2;
                        int i13 = i3;
                        i7 = zza((zzbcy<T>) t, bArr, i3, i2, b, i9, i10, zzcw, i11, i12, j2, zzbaeVar);
                    } else {
                        unsafe = unsafe2;
                        i4 = i3;
                        if (i12 != 50) {
                            i7 = zza((zzbcy<T>) t, bArr, i4, i2, b, i9, i10, i11, i12, j2, zzcw, zzbaeVar);
                        } else if (i10 == 2) {
                            i7 = zza(t, bArr, i4, i2, zzcw, i9, j2, zzbaeVar);
                        }
                    }
                    zzbcyVar = this;
                    t2 = t;
                    bArr2 = bArr;
                    i6 = i2;
                    zzbaeVar2 = zzbaeVar;
                    unsafe2 = unsafe;
                } else if (i10 == 2) {
                    zzbbt zzbbtVar = (zzbbt) unsafe2.getObject(t2, j2);
                    if (!zzbbtVar.zzaay()) {
                        int size = zzbbtVar.size();
                        zzbbtVar = zzbbtVar.zzbm(size == 0 ? 10 : size << 1);
                        unsafe2.putObject(t2, j2, zzbbtVar);
                    }
                    i7 = zza(zzbcyVar.zzcq(zzcw), b, bArr, i3, i2, zzbbtVar, zzbaeVar);
                }
                int i14 = i4;
                i7 = zza(b, bArr, i14, i2, t, zzbaeVar);
                zzbcyVar = this;
                t2 = t;
                bArr2 = bArr;
                i6 = i2;
                zzbaeVar2 = zzbaeVar;
                unsafe2 = unsafe;
            }
            unsafe = unsafe2;
            i4 = i3;
            int i142 = i4;
            i7 = zza(b, bArr, i142, i2, t, zzbaeVar);
            zzbcyVar = this;
            t2 = t;
            bArr2 = bArr;
            i6 = i2;
            zzbaeVar2 = zzbaeVar;
            unsafe2 = unsafe;
        }
        if (i7 != i6) {
            throw zzbbu.zzadr();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.google.android.gms.internal.ads.zzbdm] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27, types: [com.google.android.gms.internal.ads.zzbdm] */
    /* JADX WARN: Type inference failed for: r7v30 */
    @Override // com.google.android.gms.internal.ads.zzbdm
    public final boolean zzaa(T t) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int[] iArr = this.zzdwq;
        if (iArr != null && iArr.length != 0) {
            int i3 = -1;
            int length = iArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5 = i + 1) {
                int i6 = iArr[i5];
                int zzcw = zzcw(i6);
                int zzct = zzct(zzcw);
                if (this.zzdwo) {
                    i = i5;
                    i2 = 0;
                } else {
                    int i7 = this.zzdwg[zzcw + 2];
                    int i8 = i7 & 1048575;
                    i2 = 1 << (i7 >>> 20);
                    if (i8 != i3) {
                        i = i5;
                        i4 = zzdwf.getInt(t, i8);
                        i3 = i8;
                    } else {
                        i = i5;
                    }
                }
                if (((268435456 & zzct) != 0) && !zza((zzbcy<T>) t, zzcw, i4, i2)) {
                    return false;
                }
                int i9 = (267386880 & zzct) >>> 20;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 == 60 || i9 == 68) {
                            if (zza((zzbcy<T>) t, i6, zzcw) && !zza(t, zzct, zzcq(zzcw))) {
                                return false;
                            }
                        } else if (i9 != 49) {
                            if (i9 != 50) {
                                continue;
                            } else {
                                Map<?, ?> zzt = this.zzdwx.zzt(zzbek.zzp(t, zzct & 1048575));
                                if (!zzt.isEmpty()) {
                                    if (this.zzdwx.zzx(zzcr(zzcw)).zzdwa.zzagl() == zzbex.MESSAGE) {
                                        zzbdm<T> zzbdmVar = 0;
                                        for (Object obj : zzt.values()) {
                                            if (zzbdmVar == null) {
                                                zzbdmVar = zzbdg.zzaeo().zze(obj.getClass());
                                            }
                                            boolean zzaa = zzbdmVar.zzaa(obj);
                                            zzbdmVar = zzbdmVar;
                                            if (!zzaa) {
                                                z2 = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                if (!z2) {
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) zzbek.zzp(t, zzct & 1048575);
                    if (!list.isEmpty()) {
                        ?? zzcq = zzcq(zzcw);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (!zzcq.zzaa(list.get(i10))) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                        return false;
                    }
                } else if (zza((zzbcy<T>) t, zzcw, i4, i2) && !zza(t, zzct, zzcq(zzcw))) {
                    return false;
                }
            }
            if (this.zzdwm && !this.zzdww.zzm(t).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzc(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.zzdwg.length; i += 4) {
            int zzct = zzct(i);
            long j = 1048575 & zzct;
            int i2 = this.zzdwg[i];
            switch ((zzct & 267386880) >>> 20) {
                case 0:
                    if (zza((zzbcy<T>) t2, i)) {
                        zzbek.zza(t, j, zzbek.zzo(t2, j));
                        zzb((zzbcy<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzbcy<T>) t2, i)) {
                        zzbek.zza((Object) t, j, zzbek.zzn(t2, j));
                        zzb((zzbcy<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 3:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 4:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 5:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 6:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 7:
                    if (zza((zzbcy<T>) t2, i)) {
                        zzbek.zza(t, j, zzbek.zzm(t2, j));
                        zzb((zzbcy<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza(t, j, zzbek.zzp(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 9:
                case 17:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza(t, j, zzbek.zzp(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 11:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 12:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 13:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 14:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 15:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zzb(t, j, zzbek.zzk(t2, j));
                    zzb((zzbcy<T>) t, i);
                    break;
                case 16:
                    if (!zza((zzbcy<T>) t2, i)) {
                        break;
                    }
                    zzbek.zza((Object) t, j, zzbek.zzl(t2, j));
                    zzb((zzbcy<T>) t, i);
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
                    this.zzdwu.zza(t, t2, j);
                    break;
                case 50:
                    zzbdo.zza(this.zzdwx, t, t2, j);
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
                    if (!zza((zzbcy<T>) t2, i2, i)) {
                        break;
                    }
                    zzbek.zza(t, j, zzbek.zzp(t2, j));
                    zzb((zzbcy<T>) t, i2, i);
                    break;
                case 60:
                case 68:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zza((zzbcy<T>) t2, i2, i)) {
                        break;
                    }
                    zzbek.zza(t, j, zzbek.zzp(t2, j));
                    zzb((zzbcy<T>) t, i2, i);
                    break;
            }
        }
        if (this.zzdwo) {
            return;
        }
        zzbdo.zza(this.zzdwv, t, t2);
        if (this.zzdwm) {
            zzbdo.zza(this.zzdww, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzo(T t) {
        int[] iArr = this.zzdwr;
        if (iArr != null) {
            for (int i : iArr) {
                long zzct = zzct(i) & 1048575;
                Object zzp = zzbek.zzp(t, zzct);
                if (zzp != null) {
                    zzbek.zza(t, zzct, this.zzdwx.zzv(zzp));
                }
            }
        }
        int[] iArr2 = this.zzdws;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.zzdwu.zzb(t, i2);
            }
        }
        this.zzdwv.zzo(t);
        if (this.zzdwm) {
            this.zzdww.zzo(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0181, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0193, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a5, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b6, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c7, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d8, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e9, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fa, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020b, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x020d, code lost:
        r2.putInt(r20, r14, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0211, code lost:
        r3 = (com.google.android.gms.internal.ads.zzbav.zzcd(r3) + com.google.android.gms.internal.ads.zzbav.zzcf(r5)) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0334, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.zzg(r3, (java.lang.String) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0414, code lost:
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r20, r15, r5) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0434, code lost:
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r20, r15, r5) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x043c, code lost:
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r20, r15, r5) != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x045c, code lost:
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r20, r15, r5) != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0464, code lost:
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r20, r15, r5) != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0474, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x047c, code lost:
        if (zza((com.google.android.gms.internal.ads.zzbcy<T>) r20, r15, r5) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0514, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0526, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0538, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x054a, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x055c, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x056e, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0580, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0592, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x05a3, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x05b4, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x05c5, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x05d6, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x05e7, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x05f8, code lost:
        if (r19.zzdwp != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x05fa, code lost:
        r2.putInt(r20, r9, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x05fe, code lost:
        r9 = (com.google.android.gms.internal.ads.zzbav.zzcd(r15) + com.google.android.gms.internal.ads.zzbav.zzcf(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x06b4, code lost:
        if ((r12 & r18) != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06b6, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.zzc(r15, (com.google.android.gms.internal.ads.zzbcu) r2.getObject(r20, r10), zzcq(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x06e1, code lost:
        if ((r12 & r18) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x06e3, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.zzh(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x06ec, code lost:
        if ((r12 & r18) != 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x06ee, code lost:
        r9 = com.google.android.gms.internal.ads.zzbav.zzu(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0711, code lost:
        if ((r12 & r18) != 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0713, code lost:
        r4 = r2.getObject(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0717, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.zzc(r15, (com.google.android.gms.internal.ads.zzbah) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0720, code lost:
        if ((r12 & r18) != 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0722, code lost:
        r4 = com.google.android.gms.internal.ads.zzbdo.zzc(r15, r2.getObject(r20, r10), zzcq(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x073a, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x073d, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.zzg(r15, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0747, code lost:
        if ((r12 & r18) != 0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0749, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.zzg(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0127, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014b, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015d, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016f, code lost:
        if (r19.zzdwp != false) goto L104;
     */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzy(T t) {
        int i;
        int i2;
        long j;
        int zzd;
        Object object;
        int i3;
        int i4;
        int i5;
        long j2;
        int zzw;
        int zzan;
        int zzcd;
        long zzl;
        long zzl2;
        int zzk;
        Object zzp;
        int zzk2;
        int zzk3;
        int zzk4;
        long zzl3;
        int zzw2;
        int zzan2;
        int i6 = 267386880;
        if (!this.zzdwo) {
            Unsafe unsafe = zzdwf;
            int i7 = -1;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < this.zzdwg.length) {
                int zzct = zzct(i8);
                int[] iArr = this.zzdwg;
                int i11 = iArr[i8];
                int i12 = (zzct & 267386880) >>> 20;
                if (i12 <= 17) {
                    int i13 = iArr[i8 + 2];
                    int i14 = i13 & 1048575;
                    i2 = 1 << (i13 >>> 20);
                    if (i14 != i7) {
                        i10 = unsafe.getInt(t, i14);
                        i7 = i14;
                    }
                    i = i13;
                } else {
                    i = (!this.zzdwp || i12 < zzbbj.DOUBLE_LIST_PACKED.id() || i12 > zzbbj.SINT64_LIST_PACKED.id()) ? 0 : this.zzdwg[i8 + 2] & 1048575;
                    i2 = 0;
                }
                long j3 = zzct & 1048575;
                switch (i12) {
                    case 0:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            i9 += zzbav.zzb(i11, 0.0d);
                            break;
                        }
                        break;
                    case 1:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            i9 += zzbav.zzb(i11, 0.0f);
                            break;
                        }
                    case 2:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzbav.zzd(i11, unsafe.getLong(t, j3));
                            i9 += zzd;
                        }
                        break;
                    case 3:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzbav.zze(i11, unsafe.getLong(t, j3));
                            i9 += zzd;
                        }
                        break;
                    case 4:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzbav.zzq(i11, unsafe.getInt(t, j3));
                            i9 += zzd;
                        }
                        break;
                    case 5:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzbav.zzg(i11, 0L);
                            i9 += zzd;
                        }
                        break;
                    case 6:
                        if ((i10 & i2) != 0) {
                            i9 += zzbav.zzt(i11, 0);
                            j = 0;
                            break;
                        }
                        j = 0;
                    case 7:
                        break;
                    case 8:
                        if ((i10 & i2) != 0) {
                            object = unsafe.getObject(t, j3);
                            break;
                        }
                        j = 0;
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        if ((i10 & i2) != 0) {
                            i3 = unsafe.getInt(t, j3);
                            zzw = zzbav.zzr(i11, i3);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 12:
                        if ((i10 & i2) != 0) {
                            i4 = unsafe.getInt(t, j3);
                            zzw = zzbav.zzv(i11, i4);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        if ((i10 & i2) != 0) {
                            i5 = unsafe.getInt(t, j3);
                            zzw = zzbav.zzs(i11, i5);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 16:
                        if ((i10 & i2) != 0) {
                            j2 = unsafe.getLong(t, j3);
                            zzw = zzbav.zzf(i11, j2);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 17:
                        break;
                    case 18:
                    case 23:
                    case 32:
                        zzw = zzbdo.zzw(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 19:
                    case 24:
                    case 31:
                        zzw = zzbdo.zzv(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 20:
                        zzw = zzbdo.zzo(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 21:
                        zzw = zzbdo.zzp(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 22:
                        zzw = zzbdo.zzs(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 25:
                        zzw = zzbdo.zzx(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 26:
                        zzw = zzbdo.zzc(i11, (List) unsafe.getObject(t, j3));
                        i9 += zzw;
                        j = 0;
                        break;
                    case 27:
                        zzw = zzbdo.zzc(i11, (List<?>) unsafe.getObject(t, j3), zzcq(i8));
                        i9 += zzw;
                        j = 0;
                        break;
                    case 28:
                        zzw = zzbdo.zzd(i11, (List) unsafe.getObject(t, j3));
                        i9 += zzw;
                        j = 0;
                        break;
                    case 29:
                        zzw = zzbdo.zzt(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 30:
                        zzw = zzbdo.zzr(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 33:
                        zzw = zzbdo.zzu(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 34:
                        zzw = zzbdo.zzq(i11, (List) unsafe.getObject(t, j3), false);
                        i9 += zzw;
                        j = 0;
                        break;
                    case 35:
                        zzan = zzbdo.zzan((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 36:
                        zzan = zzbdo.zzam((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 37:
                        zzan = zzbdo.zzaf((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 38:
                        zzan = zzbdo.zzag((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 39:
                        zzan = zzbdo.zzaj((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 40:
                        zzan = zzbdo.zzan((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 41:
                        zzan = zzbdo.zzam((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 42:
                        zzan = zzbdo.zzao((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 43:
                        zzan = zzbdo.zzak((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 44:
                        zzan = zzbdo.zzai((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 45:
                        zzan = zzbdo.zzam((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 46:
                        zzan = zzbdo.zzan((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 47:
                        zzan = zzbdo.zzal((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 48:
                        zzan = zzbdo.zzah((List) unsafe.getObject(t, j3));
                        if (zzan > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 49:
                        zzw = zzbdo.zzd(i11, (List) unsafe.getObject(t, j3), zzcq(i8));
                        i9 += zzw;
                        j = 0;
                        break;
                    case 50:
                        zzw = this.zzdwx.zzb(i11, unsafe.getObject(t, j3), zzcr(i8));
                        i9 += zzw;
                        j = 0;
                        break;
                    case 51:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            zzw = zzbav.zzb(i11, 0.0d);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 52:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            zzcd = zzbav.zzb(i11, 0.0f);
                            i9 += zzcd;
                        }
                        j = 0;
                        break;
                    case 53:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            zzw = zzbav.zzd(i11, zzi(t, j3));
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 54:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            zzw = zzbav.zze(i11, zzi(t, j3));
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 55:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            zzw = zzbav.zzq(i11, zzh(t, j3));
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 56:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            zzw = zzbav.zzg(i11, 0L);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 57:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            zzcd = zzbav.zzt(i11, 0);
                            i9 += zzcd;
                        }
                        j = 0;
                        break;
                    case 58:
                        break;
                    case 59:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            object = unsafe.getObject(t, j3);
                            break;
                        }
                        j = 0;
                        break;
                    case 60:
                        break;
                    case 61:
                        break;
                    case 62:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            i3 = zzh(t, j3);
                            zzw = zzbav.zzr(i11, i3);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 63:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            i4 = zzh(t, j3);
                            zzw = zzbav.zzv(i11, i4);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 64:
                        break;
                    case 65:
                        break;
                    case 66:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            i5 = zzh(t, j3);
                            zzw = zzbav.zzs(i11, i5);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 67:
                        if (zza((zzbcy<T>) t, i11, i8)) {
                            j2 = zzi(t, j3);
                            zzw = zzbav.zzf(i11, j2);
                            i9 += zzw;
                        }
                        j = 0;
                        break;
                    case 68:
                        break;
                    default:
                        j = 0;
                        break;
                }
                i8 += 4;
            }
            int zza = i9 + zza(this.zzdwv, t);
            return this.zzdwm ? zza + this.zzdww.zzm(t).zzacw() : zza;
        }
        Unsafe unsafe2 = zzdwf;
        int i15 = 0;
        int i16 = 0;
        while (i15 < this.zzdwg.length) {
            int zzct2 = zzct(i15);
            int i17 = (zzct2 & i6) >>> 20;
            int i18 = this.zzdwg[i15];
            long j4 = zzct2 & 1048575;
            int i19 = (i17 < zzbbj.DOUBLE_LIST_PACKED.id() || i17 > zzbbj.SINT64_LIST_PACKED.id()) ? 0 : this.zzdwg[i15 + 2] & 1048575;
            switch (i17) {
                case 0:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzb(i18, 0.0d);
                    break;
                case 1:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzb(i18, 0.0f);
                    break;
                case 2:
                    if (zza((zzbcy<T>) t, i15)) {
                        zzl = zzbek.zzl(t, j4);
                        zzw2 = zzbav.zzd(i18, zzl);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 3:
                    if (zza((zzbcy<T>) t, i15)) {
                        zzl2 = zzbek.zzl(t, j4);
                        zzw2 = zzbav.zze(i18, zzl2);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 4:
                    if (zza((zzbcy<T>) t, i15)) {
                        zzk = zzbek.zzk(t, j4);
                        zzw2 = zzbav.zzq(i18, zzk);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 5:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzg(i18, 0L);
                    break;
                case 6:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzt(i18, 0);
                    break;
                case 7:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzg(i18, true);
                    break;
                case 8:
                    if (zza((zzbcy<T>) t, i15)) {
                        zzp = zzbek.zzp(t, j4);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 9:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbdo.zzc(i18, zzbek.zzp(t, j4), zzcq(i15));
                    break;
                case 10:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzp = zzbek.zzp(t, j4);
                    zzw2 = zzbav.zzc(i18, (zzbah) zzp);
                    break;
                case 11:
                    if (zza((zzbcy<T>) t, i15)) {
                        zzk2 = zzbek.zzk(t, j4);
                        zzw2 = zzbav.zzr(i18, zzk2);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 12:
                    if (zza((zzbcy<T>) t, i15)) {
                        zzk3 = zzbek.zzk(t, j4);
                        zzw2 = zzbav.zzv(i18, zzk3);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 13:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzu(i18, 0);
                    break;
                case 14:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzh(i18, 0L);
                    break;
                case 15:
                    if (zza((zzbcy<T>) t, i15)) {
                        zzk4 = zzbek.zzk(t, j4);
                        zzw2 = zzbav.zzs(i18, zzk4);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 16:
                    if (zza((zzbcy<T>) t, i15)) {
                        zzl3 = zzbek.zzl(t, j4);
                        zzw2 = zzbav.zzf(i18, zzl3);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 17:
                    if (!zza((zzbcy<T>) t, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzc(i18, (zzbcu) zzbek.zzp(t, j4), zzcq(i15));
                    break;
                case 18:
                case 23:
                case 32:
                    zzw2 = zzbdo.zzw(i18, zze(t, j4), false);
                    break;
                case 19:
                case 24:
                case 31:
                    zzw2 = zzbdo.zzv(i18, zze(t, j4), false);
                    break;
                case 20:
                    zzw2 = zzbdo.zzo(i18, zze(t, j4), false);
                    break;
                case 21:
                    zzw2 = zzbdo.zzp(i18, zze(t, j4), false);
                    break;
                case 22:
                    zzw2 = zzbdo.zzs(i18, zze(t, j4), false);
                    break;
                case 25:
                    zzw2 = zzbdo.zzx(i18, zze(t, j4), false);
                    break;
                case 26:
                    zzw2 = zzbdo.zzc(i18, zze(t, j4));
                    break;
                case 27:
                    zzw2 = zzbdo.zzc(i18, (List<?>) zze(t, j4), zzcq(i15));
                    break;
                case 28:
                    zzw2 = zzbdo.zzd(i18, zze(t, j4));
                    break;
                case 29:
                    zzw2 = zzbdo.zzt(i18, zze(t, j4), false);
                    break;
                case 30:
                    zzw2 = zzbdo.zzr(i18, zze(t, j4), false);
                    break;
                case 33:
                    zzw2 = zzbdo.zzu(i18, zze(t, j4), false);
                    break;
                case 34:
                    zzw2 = zzbdo.zzq(i18, zze(t, j4), false);
                    break;
                case 35:
                    zzan2 = zzbdo.zzan((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 36:
                    zzan2 = zzbdo.zzam((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 37:
                    zzan2 = zzbdo.zzaf((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 38:
                    zzan2 = zzbdo.zzag((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 39:
                    zzan2 = zzbdo.zzaj((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 40:
                    zzan2 = zzbdo.zzan((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 41:
                    zzan2 = zzbdo.zzam((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 42:
                    zzan2 = zzbdo.zzao((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 43:
                    zzan2 = zzbdo.zzak((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 44:
                    zzan2 = zzbdo.zzai((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 45:
                    zzan2 = zzbdo.zzam((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 46:
                    zzan2 = zzbdo.zzan((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 47:
                    zzan2 = zzbdo.zzal((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 48:
                    zzan2 = zzbdo.zzah((List) unsafe2.getObject(t, j4));
                    if (zzan2 > 0) {
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 49:
                    zzw2 = zzbdo.zzd(i18, zze(t, j4), zzcq(i15));
                    break;
                case 50:
                    zzw2 = this.zzdwx.zzb(i18, zzbek.zzp(t, j4), zzcr(i15));
                    break;
                case 51:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzb(i18, 0.0d);
                    break;
                case 52:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzb(i18, 0.0f);
                    break;
                case 53:
                    if (zza((zzbcy<T>) t, i18, i15)) {
                        zzl = zzi(t, j4);
                        zzw2 = zzbav.zzd(i18, zzl);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 54:
                    if (zza((zzbcy<T>) t, i18, i15)) {
                        zzl2 = zzi(t, j4);
                        zzw2 = zzbav.zze(i18, zzl2);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 55:
                    if (zza((zzbcy<T>) t, i18, i15)) {
                        zzk = zzh(t, j4);
                        zzw2 = zzbav.zzq(i18, zzk);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 56:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzg(i18, 0L);
                    break;
                case 57:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzt(i18, 0);
                    break;
                case 58:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzg(i18, true);
                    break;
                case 59:
                    if (zza((zzbcy<T>) t, i18, i15)) {
                        zzp = zzbek.zzp(t, j4);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 60:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbdo.zzc(i18, zzbek.zzp(t, j4), zzcq(i15));
                    break;
                case 61:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzp = zzbek.zzp(t, j4);
                    zzw2 = zzbav.zzc(i18, (zzbah) zzp);
                    break;
                case 62:
                    if (zza((zzbcy<T>) t, i18, i15)) {
                        zzk2 = zzh(t, j4);
                        zzw2 = zzbav.zzr(i18, zzk2);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 63:
                    if (zza((zzbcy<T>) t, i18, i15)) {
                        zzk3 = zzh(t, j4);
                        zzw2 = zzbav.zzv(i18, zzk3);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 64:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzu(i18, 0);
                    break;
                case 65:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzh(i18, 0L);
                    break;
                case 66:
                    if (zza((zzbcy<T>) t, i18, i15)) {
                        zzk4 = zzh(t, j4);
                        zzw2 = zzbav.zzs(i18, zzk4);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 67:
                    if (zza((zzbcy<T>) t, i18, i15)) {
                        zzl3 = zzi(t, j4);
                        zzw2 = zzbav.zzf(i18, zzl3);
                        break;
                    } else {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                case 68:
                    if (!zza((zzbcy<T>) t, i18, i15)) {
                        continue;
                        i15 += 4;
                        i6 = 267386880;
                    }
                    zzw2 = zzbav.zzc(i18, (zzbcu) zzbek.zzp(t, j4), zzcq(i15));
                    break;
                default:
                    i15 += 4;
                    i6 = 267386880;
            }
            i16 += zzw2;
            i15 += 4;
            i6 = 267386880;
        }
        return i16 + zza(this.zzdwv, t);
    }
}

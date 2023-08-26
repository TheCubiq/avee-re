package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbff implements Cloneable {
    private Object value;
    private zzbfd<?, ?> zzebq;
    private List<zzbfk> zzebr = new ArrayList();

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zzr()];
        zza(zzbfa.zzu(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzagp */
    public final zzbff clone() {
        Object clone;
        zzbff zzbffVar = new zzbff();
        try {
            zzbffVar.zzebq = this.zzebq;
            if (this.zzebr == null) {
                zzbffVar.zzebr = null;
            } else {
                zzbffVar.zzebr.addAll(this.zzebr);
            }
            if (this.value != null) {
                if (this.value instanceof zzbfi) {
                    clone = (zzbfi) ((zzbfi) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    clone = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length];
                        zzbffVar.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        clone = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        clone = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        clone = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        clone = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        clone = ((double[]) this.value).clone();
                    } else if (this.value instanceof zzbfi[]) {
                        zzbfi[] zzbfiVarArr = (zzbfi[]) this.value;
                        zzbfi[] zzbfiVarArr2 = new zzbfi[zzbfiVarArr.length];
                        zzbffVar.value = zzbfiVarArr2;
                        while (i < zzbfiVarArr.length) {
                            zzbfiVarArr2[i] = (zzbfi) zzbfiVarArr[i].clone();
                            i++;
                        }
                    }
                }
                zzbffVar.value = clone;
            }
            return zzbffVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        List<zzbfk> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbff) {
            zzbff zzbffVar = (zzbff) obj;
            if (this.value == null || zzbffVar.value == null) {
                List<zzbfk> list2 = this.zzebr;
                if (list2 == null || (list = zzbffVar.zzebr) == null) {
                    try {
                        return Arrays.equals(toByteArray(), zzbffVar.toByteArray());
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
                return list2.equals(list);
            }
            zzbfd<?, ?> zzbfdVar = this.zzebq;
            if (zzbfdVar != zzbffVar.zzebq) {
                return false;
            }
            if (zzbfdVar.zzebl.isArray()) {
                Object obj2 = this.value;
                return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) zzbffVar.value) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) zzbffVar.value) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) zzbffVar.value) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) zzbffVar.value) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) zzbffVar.value) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) zzbffVar.value) : Arrays.deepEquals((Object[]) obj2, (Object[]) zzbffVar.value);
            }
            return this.value.equals(zzbffVar.value);
        }
        return false;
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.value != null) {
            throw new NoSuchMethodError();
        }
        for (zzbfk zzbfkVar : this.zzebr) {
            zzbfaVar.zzde(zzbfkVar.tag);
            zzbfaVar.zzw(zzbfkVar.zzdpw);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbfk zzbfkVar) throws IOException {
        List<zzbfk> list = this.zzebr;
        if (list != null) {
            list.add(zzbfkVar);
            return;
        }
        Object obj = this.value;
        if (!(obj instanceof zzbfi)) {
            boolean z = obj instanceof zzbfi[];
            Collections.singletonList(zzbfkVar);
            if (!z) {
                throw new NoSuchMethodError();
            }
            throw new NoSuchMethodError();
        }
        byte[] bArr = zzbfkVar.zzdpw;
        zzbez zzi = zzbez.zzi(bArr, 0, bArr.length);
        int zzacc = zzi.zzacc();
        if (zzacc != bArr.length - zzbfa.zzce(zzacc)) {
            throw zzbfh.zzagq();
        }
        zzbfi zza = ((zzbfi) this.value).zza(zzi);
        this.zzebq = this.zzebq;
        this.value = zza;
        this.zzebr = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzr() {
        if (this.value == null) {
            int i = 0;
            for (zzbfk zzbfkVar : this.zzebr) {
                i += zzbfa.zzcl(zzbfkVar.tag) + 0 + zzbfkVar.zzdpw.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }
}

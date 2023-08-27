package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
/* loaded from: classes2.dex */
public final class zzbfa {
    private final ByteBuffer zzebj;

    private zzbfa(ByteBuffer byteBuffer) {
        this.zzebj = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzbfa(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char charAt;
        int i3;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i4 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                char c = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        i3 = (charAt2 >>> 6) | 960;
                    } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i5 = i4 + 1;
                        if (i5 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i4 = i5;
                                i4++;
                            } else {
                                i4 = i5;
                            }
                        }
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unpaired surrogate at index ");
                        sb.append(i4 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    } else {
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        i3 = ((charAt2 >>> 6) & 63) | 128;
                    }
                    byteBuffer.put((byte) i3);
                    c = (charAt2 & '?') | 128;
                }
                byteBuffer.put((byte) c);
                i4++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i6 = remaining + arrayOffset;
            while (i4 < length2) {
                int i7 = i4 + arrayOffset;
                if (i7 >= i6 || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                array[i7] = (byte) charAt;
                i4++;
            }
            if (i4 == length2) {
                i = arrayOffset + length2;
            } else {
                i = arrayOffset + i4;
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128 || i >= i6) {
                        if (charAt4 < 2048 && i <= i6 - 2) {
                            int i8 = i + 1;
                            array[i] = (byte) ((charAt4 >>> 6) | 960);
                            i = i8 + 1;
                            array[i8] = (byte) ((charAt4 & '?') | 128);
                        } else if ((charAt4 >= 55296 && 57343 >= charAt4) || i > i6 - 3) {
                            if (i > i6 - 4) {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt4);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            int i9 = i4 + 1;
                            if (i9 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i9);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    int i10 = i + 1;
                                    array[i] = (byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    int i11 = i10 + 1;
                                    array[i10] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i12 = i11 + 1;
                                    array[i11] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i = i12 + 1;
                                    array[i12] = (byte) ((codePoint2 & 63) | 128);
                                    i4 = i9;
                                } else {
                                    i4 = i9;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i4 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        } else {
                            int i13 = i + 1;
                            array[i] = (byte) ((charAt4 >>> '\f') | 480);
                            int i14 = i13 + 1;
                            array[i13] = (byte) (((charAt4 >>> 6) & 63) | 128);
                            i2 = i14 + 1;
                            array[i14] = (byte) ((charAt4 & '?') | 128);
                        }
                        i4++;
                    } else {
                        i2 = i + 1;
                        array[i] = (byte) charAt4;
                    }
                    i = i2;
                    i4++;
                }
            }
            byteBuffer.position(i - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    public static int zzb(int i, zzbfi zzbfiVar) {
        int zzcd = zzcd(i);
        int zzacw = zzbfiVar.zzacw();
        return zzcd + zzcl(zzacw) + zzacw;
    }

    public static int zzb(int i, byte[] bArr) {
        return zzcd(i) + zzv(bArr);
    }

    public static int zzcd(int i) {
        return zzcl(i << 3);
    }

    public static int zzce(int i) {
        if (i >= 0) {
            return zzcl(i);
        }
        return 10;
    }

    public static int zzcl(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzd(int i, long j) {
        return zzcd(i) + zzy(j);
    }

    private final void zzdd(int i) throws IOException {
        byte b = (byte) i;
        if (!this.zzebj.hasRemaining()) {
            throw new zzbfb(this.zzebj.position(), this.zzebj.limit());
        }
        this.zzebj.put(b);
    }

    public static int zze(int i, long j) {
        return zzcd(i) + zzy(j);
    }

    public static int zzeo(String str) {
        int zza = zza(str);
        return zzcl(zza) + zza;
    }

    public static int zzg(int i, String str) {
        return zzcd(i) + zzeo(str);
    }

    public static zzbfa zzj(byte[] bArr, int i, int i2) {
        return new zzbfa(bArr, 0, i2);
    }

    public static int zzq(int i, int i2) {
        return zzcd(i) + zzce(i2);
    }

    public static zzbfa zzu(byte[] bArr) {
        return zzj(bArr, 0, bArr.length);
    }

    public static int zzv(byte[] bArr) {
        return zzcl(bArr.length) + bArr.length;
    }

    private final void zzx(long j) throws IOException {
        while (((-128) & j) != 0) {
            zzdd((((int) j) & 127) | 128);
            j >>>= 7;
        }
        zzdd((int) j);
    }

    public static int zzy(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public final void zza(int i, long j) throws IOException {
        zzl(i, 0);
        zzx(j);
    }

    public final void zza(int i, zzbfi zzbfiVar) throws IOException {
        zzl(i, 2);
        if (zzbfiVar.zzebt < 0) {
            zzbfiVar.zzacw();
        }
        zzde(zzbfiVar.zzebt);
        zzbfiVar.zza(this);
    }

    public final void zza(int i, byte[] bArr) throws IOException {
        zzl(i, 2);
        zzde(bArr.length);
        zzw(bArr);
    }

    public final void zzacl() {
        if (this.zzebj.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.zzebj.remaining())));
        }
    }

    public final void zzde(int i) throws IOException {
        while ((i & (-128)) != 0) {
            zzdd((i & 127) | 128);
            i >>>= 7;
        }
        zzdd(i);
    }

    public final void zzf(int i, String str) throws IOException {
        zzl(i, 2);
        try {
            int zzcl = zzcl(str.length());
            if (zzcl != zzcl(str.length() * 3)) {
                zzde(zza(str));
                zza(str, this.zzebj);
                return;
            }
            int position = this.zzebj.position();
            if (this.zzebj.remaining() < zzcl) {
                throw new zzbfb(position + zzcl, this.zzebj.limit());
            }
            this.zzebj.position(position + zzcl);
            zza(str, this.zzebj);
            int position2 = this.zzebj.position();
            this.zzebj.position(position);
            zzde((position2 - position) - zzcl);
            this.zzebj.position(position2);
        } catch (BufferOverflowException e) {
            zzbfb zzbfbVar = new zzbfb(this.zzebj.position(), this.zzebj.limit());
            zzbfbVar.initCause(e);
            throw zzbfbVar;
        }
    }

    public final void zzf(int i, boolean z) throws IOException {
        zzl(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        if (!this.zzebj.hasRemaining()) {
            throw new zzbfb(this.zzebj.position(), this.zzebj.limit());
        }
        this.zzebj.put(b);
    }

    public final void zzi(int i, long j) throws IOException {
        zzl(i, 0);
        zzx(j);
    }

    public final void zzl(int i, int i2) throws IOException {
        zzde((i << 3) | i2);
    }

    public final void zzm(int i, int i2) throws IOException {
        zzl(i, 0);
        if (i2 >= 0) {
            zzde(i2);
        } else {
            zzx(i2);
        }
    }

    public final void zzw(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.zzebj.remaining() < length) {
            throw new zzbfb(this.zzebj.position(), this.zzebj.limit());
        }
        this.zzebj.put(bArr, 0, length);
    }
}

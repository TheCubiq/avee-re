package com.daaw;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.EvpMdRef;
/* loaded from: classes.dex */
public final class se2 {
    /* renamed from: a */
    public static X509Certificate[][] m10443a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair m9222c = te2.m9222c(randomAccessFile);
            if (m9222c == null) {
                throw new pe2("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) m9222c.first;
            long longValue = ((Long) m9222c.second).longValue();
            long j = (-20) + longValue;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new pe2("ZIP64 APK not supported");
                }
            }
            long m9224a = te2.m9224a(byteBuffer);
            if (m9224a >= longValue) {
                throw new pe2("ZIP Central Directory offset out of range: " + m9224a + ". ZIP End of Central Directory offset: " + longValue);
            } else if (te2.m9223b(byteBuffer) + m9224a == longValue) {
                if (m9224a < 32) {
                    throw new pe2("APK too small for APK Signing Block. ZIP Central Directory offset: " + m9224a);
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                randomAccessFile.seek(m9224a - allocate.capacity());
                randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                    int i = 0;
                    long j2 = allocate.getLong(0);
                    if (j2 < allocate.capacity() || j2 > 2147483639) {
                        throw new pe2("APK Signing Block size out of range: " + j2);
                    }
                    int i2 = (int) (8 + j2);
                    long j3 = m9224a - i2;
                    if (j3 < 0) {
                        throw new pe2("APK Signing Block offset out of range: " + j3);
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                    allocate2.order(byteOrder);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 != j2) {
                        throw new pe2("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                    }
                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                    long longValue2 = ((Long) create.second).longValue();
                    if (byteBuffer2.order() == byteOrder) {
                        int capacity = byteBuffer2.capacity() - 24;
                        if (capacity < 8) {
                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                        }
                        int capacity2 = byteBuffer2.capacity();
                        if (capacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                        }
                        int limit = byteBuffer2.limit();
                        int position = byteBuffer2.position();
                        byteBuffer2.position(0);
                        byteBuffer2.limit(capacity);
                        byteBuffer2.position(8);
                        ByteBuffer slice = byteBuffer2.slice();
                        slice.order(byteBuffer2.order());
                        byteBuffer2.position(0);
                        byteBuffer2.limit(limit);
                        byteBuffer2.position(position);
                        while (slice.hasRemaining()) {
                            i++;
                            if (slice.remaining() < 8) {
                                throw new pe2("Insufficient data to read size of APK Signing Block entry #" + i);
                            }
                            long j5 = slice.getLong();
                            if (j5 < 4 || j5 > 2147483647L) {
                                throw new pe2("APK Signing Block entry #" + i + " size out of range: " + j5);
                            }
                            int i3 = (int) j5;
                            int position2 = slice.position() + i3;
                            if (i3 > slice.remaining()) {
                                throw new pe2("APK Signing Block entry #" + i + " size out of range: " + i3 + ", available: " + slice.remaining());
                            } else if (slice.getInt() == 1896449818) {
                                X509Certificate[][] m10432l = m10432l(randomAccessFile.getChannel(), new oe2(m10439e(slice, i3 - 4), longValue2, m9224a, longValue, byteBuffer, null));
                                randomAccessFile.close();
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused) {
                                }
                                return m10432l;
                            } else {
                                slice.position(position2);
                            }
                        }
                        throw new pe2("No APK Signature Scheme v2 block in APK Signing Block");
                    }
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                throw new pe2("No APK Signing Block before ZIP Central Directory");
            } else {
                throw new pe2("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static int m10442b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return 32;
    }

    /* renamed from: c */
    public static int m10441c(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: d */
    public static String m10440d(int i) {
        if (i != 1) {
            if (i == 2) {
                return EvpMdRef.SHA512.JCA_NAME;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return EvpMdRef.SHA256.JCA_NAME;
    }

    /* renamed from: e */
    public static ByteBuffer m10439e(ByteBuffer byteBuffer, int i) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: f */
    public static ByteBuffer m10438f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + remaining);
        }
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                return m10439e(byteBuffer, i);
            }
            int remaining2 = byteBuffer.remaining();
            throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + remaining2);
        }
        throw new IllegalArgumentException("Negative length");
    }

    /* renamed from: g */
    public static void m10437g(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* renamed from: h */
    public static void m10436h(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        me2 me2Var = new me2(fileChannel, 0L, j);
        me2 me2Var2 = new me2(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        te2.m9221d(duplicate, j);
        ke2 ke2Var = new ke2(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        int i = 0;
        for (Integer num : map.keySet()) {
            iArr[i] = num.intValue();
            i++;
        }
        try {
            byte[][] m10433k = m10433k(iArr, new le2[]{me2Var, me2Var2, ke2Var});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), m10433k[i2])) {
                    throw new SecurityException(m10440d(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    /* renamed from: i */
    public static byte[] m10435i(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            int remaining = byteBuffer.remaining();
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + remaining);
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = m10441c(r5);
        r12 = m10441c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f A[Catch: SignatureException -> 0x024f, InvalidAlgorithmParameterException -> 0x0251, InvalidKeyException -> 0x0253, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x0255, NoSuchAlgorithmException -> 0x0257, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x0255, blocks: (B:60:0x0119, B:62:0x012f, B:63:0x0132), top: B:131:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] m10434j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        String str;
        String str2;
        Pair pair;
        String str3;
        AlgorithmParameterSpec algorithmParameterSpec;
        Signature signature;
        PSSParameterSpec pSSParameterSpec;
        String str4;
        ByteBuffer m10438f = m10438f(byteBuffer);
        ByteBuffer m10438f2 = m10438f(byteBuffer);
        byte[] m10435i = m10435i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (m10438f2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer m10438f3 = m10438f(m10438f2);
                if (m10438f3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = m10438f3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = m10435i(m10438f3);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException("Failed to parse signature record #" + i2, e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        try {
            if (i == 513) {
                str2 = "SHA256withECDSA";
            } else if (i == 514) {
                str2 = "SHA512withECDSA";
            } else if (i != 769) {
                switch (i) {
                    case 257:
                        pSSParameterSpec = new PSSParameterSpec(EvpMdRef.SHA256.JCA_NAME, EvpMdRef.MGF1_ALGORITHM_NAME, MGF1ParameterSpec.SHA256, 32, 1);
                        str4 = "SHA256withRSA/PSS";
                        pair = Pair.create(str4, pSSParameterSpec);
                        break;
                    case 258:
                        pSSParameterSpec = new PSSParameterSpec(EvpMdRef.SHA512.JCA_NAME, EvpMdRef.MGF1_ALGORITHM_NAME, MGF1ParameterSpec.SHA512, 64, 1);
                        str4 = "SHA512withRSA/PSS";
                        pair = Pair.create(str4, pSSParameterSpec);
                        break;
                    case 259:
                        str2 = "SHA256withRSA";
                        break;
                    case 260:
                        str2 = "SHA512withRSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                }
                str3 = (String) pair.first;
                algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(m10435i));
                signature = Signature.getInstance(str3);
                signature.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    signature.setParameter(algorithmParameterSpec);
                }
                signature.update(m10438f);
                if (signature.verify(bArr2)) {
                    throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
                }
                m10438f.clear();
                ByteBuffer m10438f4 = m10438f(m10438f);
                ArrayList arrayList2 = new ArrayList();
                int i4 = 0;
                while (m10438f4.hasRemaining()) {
                    i4++;
                    try {
                        ByteBuffer m10438f5 = m10438f(m10438f4);
                        if (m10438f5.remaining() < 8) {
                            throw new IOException("Record too short");
                        }
                        int i5 = m10438f5.getInt();
                        arrayList2.add(Integer.valueOf(i5));
                        if (i5 == i) {
                            bArr = m10435i(m10438f5);
                        }
                    } catch (IOException | BufferUnderflowException e2) {
                        throw new IOException("Failed to parse digest record #" + i4, e2);
                    }
                }
                if (arrayList.equals(arrayList2)) {
                    int m10441c = m10441c(i);
                    byte[] bArr3 = (byte[]) map.put(Integer.valueOf(m10441c), bArr);
                    if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr)) {
                        ByteBuffer m10438f6 = m10438f(m10438f);
                        ArrayList arrayList3 = new ArrayList();
                        int i6 = 0;
                        while (m10438f6.hasRemaining()) {
                            i6++;
                            byte[] m10435i2 = m10435i(m10438f6);
                            try {
                                arrayList3.add(new qe2((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(m10435i2)), m10435i2));
                            } catch (CertificateException e3) {
                                throw new SecurityException("Failed to decode certificate #" + i6, e3);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            throw new SecurityException("No certificates listed");
                        }
                        if (Arrays.equals(m10435i, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    throw new SecurityException(m10440d(m10441c).concat(" contents digest does not match the digest specified by a preceding signer"));
                }
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            } else {
                str2 = "SHA256withDSA";
            }
            PublicKey generatePublic2 = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(m10435i));
            signature = Signature.getInstance(str3);
            signature.initVerify(generatePublic2);
            if (algorithmParameterSpec != null) {
            }
            signature.update(m10438f);
            if (signature.verify(bArr2)) {
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException("Failed to verify " + str3 + " signature", e4);
        }
        pair = Pair.create(str2, null);
        str3 = (String) pair.first;
        algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
    }

    /* renamed from: k */
    public static byte[][] m10433k(int[] iArr, le2[] le2VarArr) {
        long j;
        int i;
        int length;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            j3 += (le2VarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j3 >= 2097151) {
            throw new DigestException("Too many chunks: " + j3);
        }
        int i4 = (int) j3;
        byte[][] bArr = new byte[iArr.length];
        int i5 = 0;
        while (true) {
            length = iArr.length;
            if (i5 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(m10442b(iArr[i5]) * i4) + 5];
            bArr2[0] = 90;
            m10437g(i4, bArr2, 1);
            bArr[i5] = bArr2;
            i5++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            String m10440d = m10440d(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(m10440d);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(m10440d.concat(" digest not supported"), e);
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i7 < i; i = 3) {
            le2 le2Var = le2VarArr[i7];
            long j4 = j2;
            long zza = le2Var.zza();
            while (zza > j2) {
                int min = (int) Math.min(zza, j);
                m10437g(min, bArr3, 1);
                for (int i9 = 0; i9 < length; i9++) {
                    messageDigestArr[i9].update(bArr3);
                }
                long j5 = j4;
                try {
                    le2Var.mo16049a(messageDigestArr, j5, min);
                    byte[] bArr4 = bArr3;
                    int i10 = 0;
                    while (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        le2 le2Var2 = le2Var;
                        byte[] bArr5 = bArr[i10];
                        int m10442b = m10442b(i11);
                        int i12 = length;
                        MessageDigest messageDigest = messageDigestArr[i10];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i8 * m10442b) + 5, m10442b);
                        if (digest != m10442b) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i10++;
                        le2Var = le2Var2;
                        length = i12;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j6 = min;
                    long j7 = j5 + j6;
                    zza -= j6;
                    i8++;
                    bArr3 = bArr4;
                    j2 = 0;
                    j4 = j7;
                    j = 1048576;
                } catch (IOException e2) {
                    throw new DigestException("Failed to digest chunk #" + i8 + " of section #" + i2, e2);
                }
            }
            i2++;
            i7++;
            j2 = 0;
            j = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr7 = bArr[i13];
            String m10440d2 = m10440d(i14);
            try {
                bArr6[i13] = MessageDigest.getInstance(m10440d2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(m10440d2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    /* renamed from: l */
    public static X509Certificate[][] m10432l(FileChannel fileChannel, oe2 oe2Var) {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = oe2Var.f21519a;
                ByteBuffer m10438f = m10438f(byteBuffer);
                int i = 0;
                while (m10438f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m10434j(m10438f(m10438f), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i > 0) {
                    if (hashMap.isEmpty()) {
                        throw new SecurityException("No content digests found");
                    }
                    j = oe2Var.f21520b;
                    j2 = oe2Var.f21521c;
                    j3 = oe2Var.f21522d;
                    byteBuffer2 = oe2Var.f21523e;
                    m10436h(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No signers found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}

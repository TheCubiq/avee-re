package com.daaw;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
/* loaded from: classes.dex */
public final class kz1 {

    /* renamed from: com.daaw.kz1$a */
    /* loaded from: classes.dex */
    public static class C2002a {

        /* renamed from: a */
        public long f16893a;

        /* renamed from: b */
        public long f16894b;
    }

    /* renamed from: a */
    public static long m17299a(RandomAccessFile randomAccessFile, C2002a c2002a) {
        CRC32 crc32 = new CRC32();
        long j = c2002a.f16894b;
        randomAccessFile.seek(c2002a.f16893a);
        int min = (int) Math.min(16384L, j);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = randomAccessFile.read(bArr, 0, min);
            if (read == -1) {
                break;
            }
            crc32.update(bArr, 0, read);
            j -= read;
            if (j == 0) {
                break;
            }
            min = (int) Math.min(16384L, j);
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    public static C2002a m17298b(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j = length - 65536;
        long j2 = j >= 0 ? j : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C2002a c2002a = new C2002a();
                c2002a.f16894b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                c2002a.f16893a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return c2002a;
            }
            length--;
        } while (length >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* renamed from: c */
    public static long m17297c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m17299a(randomAccessFile, m17298b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}

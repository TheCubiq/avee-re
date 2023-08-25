package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* loaded from: classes.dex */
public final class dr0 implements Closeable {
    public final File p;
    public final long q;
    public final File r;
    public final RandomAccessFile s;
    public final FileChannel t;
    public final FileLock u;

    /* loaded from: classes.dex */
    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* loaded from: classes.dex */
    public static class b extends File {
        public long p;

        public b(File file, String str) {
            super(file, str);
            this.p = -1L;
        }
    }

    public dr0(File file, File file2) {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        this.p = file;
        this.r = file2;
        this.q = D(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.s = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.t = channel;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(file3.getPath());
                this.u = channel.lock();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file3.getPath());
                sb3.append(" locked");
            } catch (IOException e) {
                e = e;
                n(this.t);
                throw e;
            } catch (Error e2) {
                e = e2;
                n(this.t);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                n(this.t);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            n(this.s);
            throw e4;
        }
    }

    public static long D(File file) {
        long c = kz1.c(file);
        return c == -1 ? c - 1 : c;
    }

    public static boolean E(Context context, File file, long j, String str) {
        SharedPreferences u = u(context);
        if (u.getLong(str + "timestamp", -1L) == w(file)) {
            if (u.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    public static void P(Context context, String str, long j, long j2, List<b> list) {
        SharedPreferences.Editor edit = u(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (b bVar : list) {
            edit.putLong(str + "dex.crc." + i, bVar.p);
            edit.putLong(str + "dex.time." + i, bVar.lastModified());
            i++;
        }
        edit.commit();
    }

    public static void n(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void q(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        StringBuilder sb = new StringBuilder();
        sb.append("Extracting ");
        sb.append(createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (!createTempFile.setReadOnly()) {
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Renaming to ");
            sb2.append(file.getPath());
            if (createTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } finally {
            n(inputStream);
            createTempFile.delete();
        }
    }

    public static SharedPreferences u(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static long w(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    public List<? extends File> K(Context context, String str, boolean z) {
        List<b> list;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.p.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        if (this.u.isValid()) {
            if (!z && !E(context, this.p, this.q, str)) {
                try {
                    list = L(context, str);
                } catch (IOException unused) {
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("load found ");
                sb2.append(list.size());
                sb2.append(" secondary dex files");
                return list;
            }
            List<b> M = M();
            P(context, str, w(this.p), this.q, M);
            list = M;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("load found ");
            sb22.append(list.size());
            sb22.append(" secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public final List<b> L(Context context, String str) {
        String str2 = this.p.getName() + ".classes";
        SharedPreferences u = u(context);
        int i = u.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            b bVar = new b(this.r, str2 + i2 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.p = D(bVar);
            long j = u.getLong(str + "dex.crc." + i2, -1L);
            long j2 = u.getLong(str + "dex.time." + i2, -1L);
            long lastModified = bVar.lastModified();
            if (j2 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = u;
                if (j == bVar.p) {
                    arrayList.add(bVar);
                    i2++;
                    u = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.p);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x012c, code lost:
        throw new java.io.IOException("Could not create zip file " + r8.getAbsolutePath() + " for secondary dex (" + r5 + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.daaw.dr0.b> M() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dr0.M():java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.u.release();
        this.t.close();
        this.s.close();
    }

    public final void d() {
        StringBuilder sb;
        String str;
        File[] listFiles = this.r.listFiles(new a());
        if (listFiles == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to list secondary dex dir content (");
            sb2.append(this.r.getPath());
            sb2.append(").");
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Trying to delete old file ");
            sb3.append(file.getPath());
            sb3.append(" of size ");
            sb3.append(file.length());
            if (file.delete()) {
                sb = new StringBuilder();
                str = "Deleted old file ";
            } else {
                sb = new StringBuilder();
                str = "Failed to delete old file ";
            }
            sb.append(str);
            sb.append(file.getPath());
        }
    }
}

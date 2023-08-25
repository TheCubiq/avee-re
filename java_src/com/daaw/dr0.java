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

    /* renamed from: p */
    public final File f7642p;

    /* renamed from: q */
    public final long f7643q;

    /* renamed from: r */
    public final File f7644r;

    /* renamed from: s */
    public final RandomAccessFile f7645s;

    /* renamed from: t */
    public final FileChannel f7646t;

    /* renamed from: u */
    public final FileLock f7647u;

    /* renamed from: com.daaw.dr0$a */
    /* loaded from: classes.dex */
    public class C1129a implements FileFilter {
        public C1129a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: com.daaw.dr0$b */
    /* loaded from: classes.dex */
    public static class C1130b extends File {

        /* renamed from: p */
        public long f7649p;

        public C1130b(File file, String str) {
            super(file, str);
            this.f7649p = -1L;
        }
    }

    public dr0(File file, File file2) {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        this.f7642p = file;
        this.f7644r = file2;
        this.f7643q = m24076D(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f7645s = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f7646t = channel;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(file3.getPath());
                this.f7647u = channel.lock();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file3.getPath());
                sb3.append(" locked");
            } catch (IOException e) {
                e = e;
                m24069n(this.f7646t);
                throw e;
            } catch (Error e2) {
                e = e2;
                m24069n(this.f7646t);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                m24069n(this.f7646t);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m24069n(this.f7645s);
            throw e4;
        }
    }

    /* renamed from: D */
    public static long m24076D(File file) {
        long m17297c = kz1.m17297c(file);
        return m17297c == -1 ? m17297c - 1 : m17297c;
    }

    /* renamed from: E */
    public static boolean m24075E(Context context, File file, long j, String str) {
        SharedPreferences m24067u = m24067u(context);
        if (m24067u.getLong(str + "timestamp", -1L) == m24066w(file)) {
            if (m24067u.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P */
    public static void m24071P(Context context, String str, long j, long j2, List<C1130b> list) {
        SharedPreferences.Editor edit = m24067u(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C1130b c1130b : list) {
            edit.putLong(str + "dex.crc." + i, c1130b.f7649p);
            edit.putLong(str + "dex.time." + i, c1130b.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: n */
    public static void m24069n(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: q */
    public static void m24068q(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
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
            m24069n(inputStream);
            createTempFile.delete();
        }
    }

    /* renamed from: u */
    public static SharedPreferences m24067u(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* renamed from: w */
    public static long m24066w(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: K */
    public List<? extends File> m24074K(Context context, String str, boolean z) {
        List<C1130b> list;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.f7642p.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        if (this.f7647u.isValid()) {
            if (!z && !m24075E(context, this.f7642p, this.f7643q, str)) {
                try {
                    list = m24073L(context, str);
                } catch (IOException unused) {
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("load found ");
                sb2.append(list.size());
                sb2.append(" secondary dex files");
                return list;
            }
            List<C1130b> m24072M = m24072M();
            m24071P(context, str, m24066w(this.f7642p), this.f7643q, m24072M);
            list = m24072M;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("load found ");
            sb22.append(list.size());
            sb22.append(" secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: L */
    public final List<C1130b> m24073L(Context context, String str) {
        String str2 = this.f7642p.getName() + ".classes";
        SharedPreferences m24067u = m24067u(context);
        int i = m24067u.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            C1130b c1130b = new C1130b(this.f7644r, str2 + i2 + ".zip");
            if (!c1130b.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + c1130b.getPath() + "'");
            }
            c1130b.f7649p = m24076D(c1130b);
            long j = m24067u.getLong(str + "dex.crc." + i2, -1L);
            long j2 = m24067u.getLong(str + "dex.time." + i2, -1L);
            long lastModified = c1130b.lastModified();
            if (j2 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = m24067u;
                if (j == c1130b.f7649p) {
                    arrayList.add(c1130b);
                    i2++;
                    m24067u = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + c1130b + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + c1130b.f7649p);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x012c, code lost:
        throw new java.io.IOException("Could not create zip file " + r8.getAbsolutePath() + " for secondary dex (" + r5 + ")");
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C1130b> m24072M() {
        String str = this.f7642p.getName() + ".classes";
        m24070d();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f7642p);
        int i = 2;
        try {
            String str2 = "classes2.dex";
            while (true) {
                ZipEntry entry = zipFile.getEntry(str2);
                if (entry == null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                    return arrayList;
                }
                C1130b c1130b = new C1130b(this.f7644r, str + i + ".zip");
                arrayList.add(c1130b);
                StringBuilder sb = new StringBuilder();
                sb.append("Extraction is needed for file ");
                sb.append(c1130b);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    m24068q(zipFile, entry, c1130b, str);
                    try {
                        c1130b.f7649p = m24076D(c1130b);
                        z = true;
                    } catch (IOException unused2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to read crc from ");
                        sb2.append(c1130b.getAbsolutePath());
                        z = false;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Extraction ");
                    sb3.append(z ? "succeeded" : "failed");
                    sb3.append(" '");
                    sb3.append(c1130b.getAbsolutePath());
                    sb3.append("': length ");
                    sb3.append(c1130b.length());
                    sb3.append(" - crc: ");
                    sb3.append(c1130b.f7649p);
                    if (!z) {
                        c1130b.delete();
                        if (c1130b.exists()) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Failed to delete corrupted secondary dex '");
                            sb4.append(c1130b.getPath());
                            sb4.append("'");
                        }
                    }
                }
                if (!z) {
                    break;
                }
                i++;
                str2 = "classes" + i + ".dex";
            }
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7647u.release();
        this.f7646t.close();
        this.f7645s.close();
    }

    /* renamed from: d */
    public final void m24070d() {
        StringBuilder sb;
        String str;
        File[] listFiles = this.f7644r.listFiles(new C1129a());
        if (listFiles == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to list secondary dex dir content (");
            sb2.append(this.f7644r.getPath());
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

package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public final class zzam implements zzb {
    private final Map<String, zzan> zzbw;
    private long zzbx;
    private final File zzby;
    private final int zzbz;

    public zzam(File file) {
        this(file, 5242880);
    }

    private zzam(File file, int i) {
        this.zzbw = new LinkedHashMap(16, 0.75f, true);
        this.zzbx = 0L;
        this.zzby = file;
        this.zzbz = 5242880;
    }

    private final synchronized void remove(String str) {
        boolean delete = zze(str).delete();
        removeEntry(str);
        if (!delete) {
            zzaf.d("Could not delete cache entry for key=%s, filename=%s", str, zzd(str));
        }
    }

    private final void removeEntry(String str) {
        zzan remove = this.zzbw.remove(str);
        if (remove != null) {
            this.zzbx -= remove.zzca;
        }
    }

    private static int zza(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static InputStream zza(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzao zzaoVar) throws IOException {
        return new String(zza(zzaoVar, zzc(zzaoVar)), "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        zza(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void zza(String str, zzan zzanVar) {
        if (this.zzbw.containsKey(str)) {
            this.zzbx += zzanVar.zzca - this.zzbw.get(str).zzca;
        } else {
            this.zzbx += zzanVar.zzca;
        }
        this.zzbw.put(str, zzanVar);
    }

    private static byte[] zza(zzao zzaoVar, long j) throws IOException {
        long zzo = zzaoVar.zzo();
        if (j >= 0 && j <= zzo) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaoVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zzo);
        throw new IOException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(InputStream inputStream) throws IOException {
        return (zza(inputStream) << 24) | zza(inputStream) | 0 | (zza(inputStream) << 8) | (zza(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<zzl> zzb(zzao zzaoVar) throws IOException {
        int zzb = zzb((InputStream) zzaoVar);
        List<zzl> emptyList = zzb == 0 ? Collections.emptyList() : new ArrayList<>(zzb);
        for (int i = 0; i < zzb; i++) {
            emptyList.add(new zzl(zza(zzaoVar).intern(), zza(zzaoVar).intern()));
        }
        return emptyList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzc(InputStream inputStream) throws IOException {
        return (zza(inputStream) & 255) | 0 | ((zza(inputStream) & 255) << 8) | ((zza(inputStream) & 255) << 16) | ((zza(inputStream) & 255) << 24) | ((zza(inputStream) & 255) << 32) | ((zza(inputStream) & 255) << 40) | ((zza(inputStream) & 255) << 48) | ((255 & zza(inputStream)) << 56);
    }

    private static String zzd(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File zze(String str) {
        return new File(this.zzby, zzd(str));
    }

    @Override // com.google.android.gms.internal.ads.zzb
    public final synchronized zzc zza(String str) {
        zzan zzanVar = this.zzbw.get(str);
        if (zzanVar == null) {
            return null;
        }
        File zze = zze(str);
        try {
            zzao zzaoVar = new zzao(new BufferedInputStream(zza(zze)), zze.length());
            try {
                zzan zzc = zzan.zzc(zzaoVar);
                if (!TextUtils.equals(str, zzc.zzcb)) {
                    zzaf.d("%s: key=%s, found=%s", zze.getAbsolutePath(), str, zzc.zzcb);
                    removeEntry(str);
                    return null;
                }
                byte[] zza = zza(zzaoVar, zzaoVar.zzo());
                zzc zzcVar = new zzc();
                zzcVar.data = zza;
                zzcVar.zza = zzanVar.zza;
                zzcVar.zzb = zzanVar.zzb;
                zzcVar.zzc = zzanVar.zzc;
                zzcVar.zzd = zzanVar.zzd;
                zzcVar.zze = zzanVar.zze;
                List<zzl> list = zzanVar.zzg;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzl zzlVar : list) {
                    treeMap.put(zzlVar.getName(), zzlVar.getValue());
                }
                zzcVar.zzf = treeMap;
                zzcVar.zzg = Collections.unmodifiableList(zzanVar.zzg);
                return zzcVar;
            } finally {
                zzaoVar.close();
            }
        } catch (IOException e) {
            zzaf.d("%s: %s", zze.getAbsolutePath(), e.toString());
            remove(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzb
    public final synchronized void zza() {
        long length;
        zzao zzaoVar;
        if (!this.zzby.exists()) {
            if (!this.zzby.mkdirs()) {
                zzaf.e("Unable to create cache dir %s", this.zzby.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.zzby.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                zzaoVar = new zzao(new BufferedInputStream(zza(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                zzan zzc = zzan.zzc(zzaoVar);
                zzc.zzca = length;
                zza(zzc.zzcb, zzc);
                zzaoVar.close();
            } catch (Throwable th) {
                zzaoVar.close();
                throw th;
                break;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzb
    public final synchronized void zza(String str, zzc zzcVar) {
        long j;
        Iterator<Map.Entry<String, zzan>> it;
        long length = zzcVar.data.length;
        if (this.zzbx + length >= this.zzbz) {
            if (zzaf.DEBUG) {
                zzaf.v("Pruning old cache entries.", new Object[0]);
            }
            long j2 = this.zzbx;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, zzan>> it2 = this.zzbw.entrySet().iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    j = j2;
                    break;
                }
                zzan value = it2.next().getValue();
                j = j2;
                if (zze(value.zzcb).delete()) {
                    it = it2;
                    this.zzbx -= value.zzca;
                } else {
                    it = it2;
                    zzaf.d("Could not delete cache entry for key=%s, filename=%s", value.zzcb, zzd(value.zzcb));
                }
                it.remove();
                i++;
                if (((float) (this.zzbx + length)) < this.zzbz * 0.9f) {
                    break;
                }
                j2 = j;
                it2 = it;
            }
            if (zzaf.DEBUG) {
                zzaf.v("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.zzbx - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
        File zze = zze(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zze));
            zzan zzanVar = new zzan(str, zzcVar);
            if (!zzanVar.zza(bufferedOutputStream)) {
                bufferedOutputStream.close();
                zzaf.d("Failed to write header for %s", zze.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(zzcVar.data);
            bufferedOutputStream.close();
            zza(str, zzanVar);
        } catch (IOException unused) {
            if (zze.delete()) {
                return;
            }
            zzaf.d("Could not clean up file %s", zze.getAbsolutePath());
        }
    }
}

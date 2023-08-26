package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfe implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzfc zzc;
    private final String zzd;
    private final Map<String, String> zze;
    private final /* synthetic */ zzfa zzf;

    public zzfe(zzfa zzfaVar, String str, URL url, byte[] bArr, Map<String, String> map, zzfc zzfcVar) {
        this.zzf = zzfaVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfcVar);
        this.zza = url;
        this.zzb = bArr;
        this.zzc = zzfcVar;
        this.zzd = str;
        this.zze = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        Throwable th;
        IOException iOException;
        int i;
        int i2;
        byte[] zza;
        this.zzf.zzb();
        OutputStream outputStream = null;
        try {
            httpURLConnection = this.zzf.zza(this.zza);
            try {
                if (this.zze != null) {
                    for (Map.Entry<String, String> entry : this.zze.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                if (this.zzb != null) {
                    byte[] zzc = this.zzf.f_().zzc(this.zzb);
                    this.zzf.zzq().zzw().zza("Uploading data. size", Integer.valueOf(zzc.length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(zzc.length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(zzc);
                        outputStream2.close();
                    } catch (IOException e) {
                        map2 = null;
                        iOException = e;
                        outputStream = outputStream2;
                        i2 = 0;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.zzf.zzp().zza(new zzff(this.zzd, this.zzc, i2, iOException, null, map2));
                    } catch (Throwable th2) {
                        map = null;
                        th = th2;
                        outputStream = outputStream2;
                        i = 0;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.zzf.zzp().zza(new zzff(this.zzd, this.zzc, i, null, null, map));
                        throw th;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        zzfa zzfaVar = this.zzf;
                        zza = zzfa.zza(httpURLConnection);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zzf.zzp().zza(new zzff(this.zzd, this.zzc, responseCode, null, zza, headerFields));
                    } catch (IOException e2) {
                        e = e2;
                        i2 = responseCode;
                        map2 = headerFields;
                        iOException = e;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                this.zzf.zzq().zze().zza("Error closing HTTP compressed POST connection output stream. appId", zzex.zza(this.zzd), e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zzf.zzp().zza(new zzff(this.zzd, this.zzc, i2, iOException, null, map2));
                    } catch (Throwable th3) {
                        th = th3;
                        i = responseCode;
                        map = headerFields;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                                this.zzf.zzq().zze().zza("Error closing HTTP compressed POST connection output stream. appId", zzex.zza(this.zzd), e4);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zzf.zzp().zza(new zzff(this.zzd, this.zzc, i, null, null, map));
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    map2 = null;
                    i2 = responseCode;
                } catch (Throwable th4) {
                    map = null;
                    th = th4;
                    i = responseCode;
                }
            } catch (IOException e6) {
                e = e6;
                map2 = null;
                iOException = e;
                i2 = 0;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.zzf.zzp().zza(new zzff(this.zzd, this.zzc, i2, iOException, null, map2));
            } catch (Throwable th5) {
                th = th5;
                map = null;
                th = th;
                i = 0;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.zzf.zzp().zza(new zzff(this.zzd, this.zzc, i, null, null, map));
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            map = null;
        }
    }
}

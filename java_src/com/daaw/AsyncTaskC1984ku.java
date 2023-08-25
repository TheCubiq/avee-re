package com.daaw;

import android.os.AsyncTask;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
/* renamed from: com.daaw.ku */
/* loaded from: classes.dex */
public class AsyncTaskC1984ku extends AsyncTask<String, Integer, String> {

    /* renamed from: com.daaw.ku$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1985a {
        /* renamed from: a */
        FileOutputStream mo9327a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r12 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        r11.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m17433a(String str, InterfaceC1985a interfaceC1985a, w40<Boolean> w40Var, InterfaceC1153e0<Integer> interfaceC1153e0) {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream;
        FileOutputStream fileOutputStream = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            try {
                httpsURLConnection.connect();
                int contentLength = httpsURLConnection.getContentLength();
                inputStream = httpsURLConnection.getInputStream();
                try {
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String str2 = "Server returned HTTP " + responseCode + " " + httpsURLConnection.getResponseMessage();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        httpsURLConnection.disconnect();
                        return str2;
                    }
                    FileOutputStream mo9327a = interfaceC1985a.mo9327a();
                    try {
                        byte[] bArr = new byte[4096];
                        long j = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                if (mo9327a != null) {
                                    try {
                                        mo9327a.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                inputStream.close();
                                httpsURLConnection.disconnect();
                                return null;
                            } else if (w40Var != null && w40Var.mo3478a().booleanValue()) {
                                break;
                            } else {
                                j += read;
                                if (contentLength > 0 && interfaceC1153e0 != null) {
                                    interfaceC1153e0.mo7884a(Integer.valueOf((int) ((100 * j) / contentLength)));
                                }
                                mo9327a.write(bArr, 0, read);
                            }
                        }
                    } catch (Exception unused3) {
                        fileOutputStream = mo9327a;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused4) {
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                return "Network error";
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                        }
                        return "Network error";
                    } catch (Throwable th) {
                        fileOutputStream = mo9327a;
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused5) {
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                        }
                        throw th;
                    }
                } catch (Exception unused6) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception unused7) {
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Exception unused8) {
            httpsURLConnection = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
            inputStream = null;
        }
    }
}

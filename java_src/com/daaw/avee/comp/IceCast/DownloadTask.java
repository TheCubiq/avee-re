package com.daaw.avee.comp.IceCast;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Func.Func;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public class DownloadTask extends AsyncTask<String, Integer, String> {
    private Context context;
    private CreateFileFactory createFileFactory;
    private OnPostExecute onPostExecute;

    /* loaded from: classes.dex */
    public interface CreateFileFactory {
        FileOutputStream CreateFile() throws IOException;
    }

    /* loaded from: classes.dex */
    public interface OnPostExecute {
        void onPostExecute(String str);
    }

    public DownloadTask(Context context, CreateFileFactory createFileFactory, OnPostExecute onPostExecute) {
        this.context = context;
        this.createFileFactory = createFileFactory;
        this.onPostExecute = onPostExecute;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public String doInBackground(String... strArr) {
        return downloadResponseFile(strArr[0], this.createFileFactory, new Func<Boolean>() { // from class: com.daaw.avee.comp.IceCast.DownloadTask.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Func.Func
            public Boolean onInvoke() {
                return Boolean.valueOf(DownloadTask.this.isCancelled());
            }
        }, new Action1<Integer>() { // from class: com.daaw.avee.comp.IceCast.DownloadTask.2
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Integer num) {
                DownloadTask.this.publishProgress(num);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        this.onPostExecute.onPostExecute(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        if (r12 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r11 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        r11.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String downloadResponseFile(String str, CreateFileFactory createFileFactory, Func<Boolean> func, Action1<Integer> action1) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        FileOutputStream fileOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                inputStream = httpURLConnection.getInputStream();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String str2 = "Server returned HTTP " + responseCode + " " + httpURLConnection.getResponseMessage();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return str2;
                    }
                    FileOutputStream CreateFile = createFileFactory.CreateFile();
                    try {
                        byte[] bArr = new byte[4096];
                        long j = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                if (CreateFile != null) {
                                    try {
                                        CreateFile.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return null;
                            } else if (func != null && func.onInvoke().booleanValue()) {
                                break;
                            } else {
                                j += read;
                                if (contentLength > 0 && action1 != null) {
                                    action1.onInvoke(Integer.valueOf((int) ((100 * j) / contentLength)));
                                }
                                CreateFile.write(bArr, 0, read);
                            }
                        }
                    } catch (Exception unused3) {
                        fileOutputStream = CreateFile;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused4) {
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return "Network error";
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpURLConnection != null) {
                        }
                        return "Network error";
                    } catch (Throwable th) {
                        fileOutputStream = CreateFile;
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused5) {
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpURLConnection != null) {
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
            httpURLConnection = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            inputStream = null;
        }
    }
}

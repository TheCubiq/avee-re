package com.daaw.avee.Common;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class UtilsFileSys {
    static final char UNIX_SEPARATOR = '/';
    static final char WINDOWS_SEPARATOR = '\\';

    public static String fixToValidFilename(String str) {
        return str.replaceAll("[^a-zA-Z0-9(){}.-]", "_");
    }

    public static String extractFilenameExt(File file) {
        return extractFilenameExt(file.getName());
    }

    public static String extractFilenameExt(String str) {
        if (str != null) {
            try {
                return str.substring(str.lastIndexOf(".") + 1).toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static String extractFilenameExtWithDot(String str) {
        String str2 = "";
        if (str != null) {
            try {
                str2 = str.substring(str.lastIndexOf("."));
            } catch (Exception unused) {
            }
            return str2.toLowerCase();
        }
        return "";
    }

    public static String extractFilename(String str) {
        try {
            return str.substring(str.lastIndexOf("/") + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String extractFilenameAdditionalSeperator(String str, char c) {
        try {
            return str.substring(Math.max(str.lastIndexOf(47), Math.max(str.lastIndexOf(92), str.lastIndexOf(c))) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String extractFilenameWithoutExt(String str) {
        try {
            str = str.substring(str.lastIndexOf("/") + 1);
        } catch (Exception unused) {
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf > 0) {
            try {
                return str.substring(0, lastIndexOf);
            } catch (Exception unused2) {
                return str;
            }
        }
        return str;
    }

    public static boolean fileExists(String str) {
        return new File(str).exists();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        r1 = new java.io.File(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.exists() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        r10 = r1.isFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r10.endsWith(r11) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r2.length == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r10 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        r10 = (r2.length - r6) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        r10 = r2.length - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r5 >= r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
        r0.append("..");
        r0.append(r11);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        r0.append(r9.substring(r4.length()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        return r0.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getRelativePath(String str, String str2, String str3) {
        String separatorsToWindows;
        String separatorsToWindows2;
        if (str3.equals("/")) {
            separatorsToWindows = separatorsToUnix(str);
            separatorsToWindows2 = separatorsToUnix(str2);
        } else if (str3.equals("\\")) {
            separatorsToWindows = separatorsToWindows(str);
            separatorsToWindows2 = separatorsToWindows(str2);
        } else {
            throw new IllegalArgumentException("Unrecognised dir separator '" + str3 + "'");
        }
        String[] split = separatorsToWindows2.split(Pattern.quote(str3));
        String[] split2 = separatorsToWindows.split(Pattern.quote(str3));
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int i2 = 0;
        while (i2 < split2.length && i2 < split.length && split2[i2].equals(split[i2])) {
            stringBuffer.append(split2[i2] + str3);
            i2++;
        }
        throw new PathResolutionException("No common path element found for '" + separatorsToWindows + "' and '" + separatorsToWindows2 + "'");
    }

    public static String separatorsToUnix(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace(WINDOWS_SEPARATOR, UNIX_SEPARATOR);
    }

    public static String separatorsToWindows(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace(UNIX_SEPARATOR, WINDOWS_SEPARATOR);
    }

    public boolean isExternalStorageWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public boolean isExternalStorageReadable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    /* loaded from: classes.dex */
    static class PathResolutionException extends RuntimeException {
        PathResolutionException(String str) {
            super(str);
        }
    }

    public static FileDescriptor getFilePathFromDocumentUri(Context context, Uri uri) {
        return getFilePathFromDocumentUri(context, uri, "r");
    }

    public static FileDescriptor getFilePathFromDocumentUri(Context context, Uri uri, String str) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, str);
        } catch (Exception unused) {
            parcelFileDescriptor = null;
        }
        if (parcelFileDescriptor != null) {
            try {
                return parcelFileDescriptor.getFileDescriptor();
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static void scanFile(Context context, String str) {
        MediaScannerConnection.scanFile(context, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.daaw.avee.Common.UtilsFileSys.1
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str2, Uri uri) {
            }
        });
    }

    public static String readInputStreamAsString(InputStream inputStream) {
        try {
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder((int) DefaultOggSeeker.MATCH_BYTE_RANGE);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            while (true) {
                int read = inputStreamReader.read(cArr, 0, 1024);
                if (read >= 0) {
                    sb.append(cArr, 0, read);
                } else {
                    return sb.toString();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static void deleteCache(Context context) {
        try {
            deleteDir(context.getCacheDir());
        } catch (Exception unused) {
        }
    }

    public static boolean _deleteDir(File file) {
        if (file != null && file.isDirectory()) {
            for (String str : file.list()) {
                if (!deleteDir(new File(file, str))) {
                    return false;
                }
            }
            return file.delete();
        } else if (file == null || !file.isFile()) {
            return false;
        } else {
            return file.delete();
        }
    }

    public static boolean deleteDir(File file) {
        if (file != null && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (!deleteDir(file2)) {
                    return false;
                }
            }
            return file.delete();
        } else if (file == null || !file.isFile()) {
            return false;
        } else {
            return file.delete();
        }
    }

    public static String readResource(Resources resources, int i) {
        StringBuilder sb = new StringBuilder(128);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return sb.toString();
        }
    }

    public static void CopyFile(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public static void CopyFile(InputStream inputStream, File file) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    public static File GetUniqueFileName(File file, String str) {
        String _getUniqueFileName_getFileExtension = _getUniqueFileName_getFileExtension(str);
        String _getUniqueFileName_getFileName = _getUniqueFileName_getFileName(str);
        File file2 = new File(file, str);
        int i = 0;
        while (file2.exists()) {
            i++;
            file2 = new File(file, _getUniqueFileName_getFileName + " (" + i + ")" + _getUniqueFileName_getFileExtension);
        }
        return file2;
    }

    public static String _getUniqueFileName_getFileExtension(String str) {
        if (str == null || str.lastIndexOf(46) == -1) {
            return null;
        }
        return str.substring(str.lastIndexOf(46));
    }

    public static String _getUniqueFileName_getFileName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf >= 0 ? str.substring(0, lastIndexOf) : str;
    }
}

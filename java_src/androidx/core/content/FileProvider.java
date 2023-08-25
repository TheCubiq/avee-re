package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.daaw.C3866zk;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: r */
    public static final String[] f1161r = {"_display_name", "_size"};

    /* renamed from: s */
    public static final File f1162s = new File("/");

    /* renamed from: t */
    public static final HashMap<String, InterfaceC0202b> f1163t = new HashMap<>();

    /* renamed from: p */
    public InterfaceC0202b f1164p;

    /* renamed from: q */
    public int f1165q = 0;

    /* renamed from: androidx.core.content.FileProvider$a */
    /* loaded from: classes.dex */
    public static class C0201a {
        /* renamed from: a */
        public static File[] m29735a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0202b {
        /* renamed from: a */
        File mo29734a(Uri uri);
    }

    /* renamed from: androidx.core.content.FileProvider$c */
    /* loaded from: classes.dex */
    public static class C0203c implements InterfaceC0202b {

        /* renamed from: a */
        public final String f1166a;

        /* renamed from: b */
        public final HashMap<String, File> f1167b = new HashMap<>();

        public C0203c(String str) {
            this.f1166a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0202b
        /* renamed from: a */
        public File mo29734a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f1167b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        /* renamed from: b */
        public void m29733b(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f1167b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }
    }

    /* renamed from: a */
    public static File m29742a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    public static Object[] m29741b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: c */
    public static String[] m29740c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: d */
    public static XmlResourceParser m29739d(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* renamed from: e */
    public static InterfaceC0202b m29738e(Context context, String str, int i) {
        InterfaceC0202b interfaceC0202b;
        HashMap<String, InterfaceC0202b> hashMap = f1163t;
        synchronized (hashMap) {
            interfaceC0202b = hashMap.get(str);
            if (interfaceC0202b == null) {
                try {
                    try {
                        interfaceC0202b = m29736g(context, str, i);
                        hashMap.put(str, interfaceC0202b);
                    } catch (XmlPullParserException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC0202b;
    }

    /* renamed from: f */
    public static int m29737f(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: g */
    public static InterfaceC0202b m29736g(Context context, String str, int i) {
        C0203c c0203c = new C0203c(str);
        XmlResourceParser m29739d = m29739d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = m29739d.next();
            if (next == 1) {
                return c0203c;
            }
            if (next == 2) {
                String name = m29739d.getName();
                File file = null;
                String attributeValue = m29739d.getAttributeValue(null, "name");
                String attributeValue2 = m29739d.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f1162s;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] m2176g = C3866zk.m2176g(context, null);
                    if (m2176g.length > 0) {
                        file = m2176g[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] m2177f = C3866zk.m2177f(context);
                    if (m2177f.length > 0) {
                        file = m2177f[0];
                    }
                } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    File[] m29735a = C0201a.m29735a(context);
                    if (m29735a.length > 0) {
                        file = m29735a[0];
                    }
                }
                if (file != null) {
                    c0203c.m29733b(attributeValue, m29742a(file, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, InterfaceC0202b> hashMap = f1163t;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.f1164p = m29738e(context, str, this.f1165q);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f1164p.mo29734a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo29734a = this.f1164p.mo29734a(uri);
        int lastIndexOf = mo29734a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo29734a.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f1164p.mo29734a(uri), m29737f(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File mo29734a = this.f1164p.mo29734a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f1161r;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? mo29734a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(mo29734a.length());
            }
            i2 = i;
        }
        String[] m29740c = m29740c(strArr3, i2);
        Object[] m29741b = m29741b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(m29740c, 1);
        matrixCursor.addRow(m29741b);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

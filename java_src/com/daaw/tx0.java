package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.daaw.avee.R;
import com.daaw.tx0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class tx0 {

    /* renamed from: e */
    public static final String f28185e;

    /* renamed from: f */
    public static final List<String> f28186f;

    /* renamed from: g */
    public static final List<String> f28187g;

    /* renamed from: h */
    public static final C3143b f28188h;

    /* renamed from: i */
    public static final C3143b f28189i;

    /* renamed from: j */
    public static final C3143b f28190j;

    /* renamed from: k */
    public static final tx0 f28191k;

    /* renamed from: l */
    public static String f28192l;

    /* renamed from: m */
    public static String f28193m;

    /* renamed from: a */
    public Uri f28194a;

    /* renamed from: b */
    public String f28195b;

    /* renamed from: c */
    public volatile C3143b f28196c;

    /* renamed from: d */
    public volatile C3142a f28197d;

    /* renamed from: com.daaw.tx0$a */
    /* loaded from: classes.dex */
    public class C3142a {

        /* renamed from: a */
        public final InterfaceC3145d f28198a;

        /* renamed from: b */
        public final Object f28199b;

        /* renamed from: c */
        public final Object f28200c;

        public C3142a(InterfaceC3145d interfaceC3145d, Object obj, Object obj2) {
            this.f28198a = interfaceC3145d;
            this.f28199b = obj;
            this.f28200c = obj2;
        }
    }

    /* renamed from: com.daaw.tx0$b */
    /* loaded from: classes.dex */
    public static class C3143b {

        /* renamed from: r */
        public static final Uri f28202r = Uri.parse("content://media/external/audio/albumart");

        /* renamed from: a */
        public final Uri f28203a;

        /* renamed from: b */
        public String f28204b;

        /* renamed from: c */
        public boolean f28205c = false;

        /* renamed from: d */
        public long f28206d = 0;

        /* renamed from: e */
        public String f28207e = "";

        /* renamed from: f */
        public String f28208f = "";

        /* renamed from: g */
        public long f28209g = 0;

        /* renamed from: h */
        public String f28210h = "";

        /* renamed from: i */
        public long f28211i = -1;

        /* renamed from: j */
        public int f28212j = 0;

        /* renamed from: k */
        public int f28213k = 0;

        /* renamed from: l */
        public int f28214l = 0;

        /* renamed from: m */
        public int f28215m = 0;

        /* renamed from: n */
        public int f28216n = 0;

        /* renamed from: o */
        public int f28217o = 0;

        /* renamed from: p */
        public long f28218p = 0;

        /* renamed from: q */
        public String f28219q = "";

        public C3143b(Uri uri) {
            this.f28203a = uri;
        }

        /* renamed from: j */
        public static boolean m8723j(Uri uri) {
            return "http".equals(uri.getScheme()) || "https".equals(uri.getScheme());
        }

        /* renamed from: a */
        public void m8732a(ContentResolver contentResolver) {
            this.f28219q = "";
            if (contentResolver == null || !C1354g2.f10157a) {
                return;
            }
            Cursor m24109e = dp0.m24109e(contentResolver, MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album_art"}, "_id=?", new String[]{String.valueOf(this.f28209g)}, null);
            if (m24109e != null && m24109e.moveToFirst()) {
                this.f28219q = m24109e.getString(m24109e.getColumnIndex("album_art"));
            }
            if (m24109e != null) {
                m24109e.close();
            }
        }

        /* renamed from: b */
        public String m8731b() {
            if (!m8725h() || this.f28210h.length() <= 1) {
                int indexOf = this.f28207e.indexOf(45);
                if (indexOf < 3) {
                    indexOf = this.f28207e.indexOf("_-_");
                }
                if (indexOf < 3) {
                    boolean z = this.f28207e.indexOf(32) >= 0;
                    String str = this.f28207e;
                    indexOf = z ? str.indexOf(95) : str.indexOf("__");
                }
                if (indexOf < 3) {
                    return this.f28207e;
                }
                if (this.f28207e.charAt(indexOf - 1) == ' ') {
                    indexOf--;
                }
                return this.f28207e.substring(0, indexOf);
            }
            return this.f28210h;
        }

        /* renamed from: c */
        public String m8730c() {
            if (this.f28206d <= 0) {
                return null;
            }
            return "content://media/external/audio/media/" + this.f28206d + "/albumart";
        }

        /* renamed from: d */
        public String m8729d() {
            String m8728e = m8728e();
            return (m8728e == null || m8728e.length() <= 0) ? m8730c() : m8728e;
        }

        /* renamed from: e */
        public String m8728e() {
            return this.f28219q;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3143b) {
                return this.f28203a.equals(((C3143b) obj).f28203a);
            }
            return false;
        }

        /* renamed from: f */
        public int m8727f() {
            return this.f28212j / 1000;
        }

        /* renamed from: g */
        public boolean m8726g() {
            return this.f28211i > 0;
        }

        /* renamed from: h */
        public boolean m8725h() {
            return this.f28211i > 0;
        }

        /* renamed from: i */
        public boolean m8724i() {
            return m8725h() || this.f28211i == -2;
        }
    }

    /* renamed from: com.daaw.tx0$c */
    /* loaded from: classes.dex */
    public static class C3144c {

        /* renamed from: a */
        public final C3143b f28220a;

        /* renamed from: b */
        public boolean f28221b = false;

        /* renamed from: c */
        public String f28222c;

        /* renamed from: d */
        public String f28223d;

        /* renamed from: e */
        public String f28224e;

        /* renamed from: f */
        public String f28225f;

        /* renamed from: g */
        public String f28226g;

        /* renamed from: h */
        public String f28227h;

        /* renamed from: i */
        public int f28228i;

        /* renamed from: j */
        public int f28229j;

        /* renamed from: k */
        public int f28230k;

        /* renamed from: l */
        public int f28231l;

        /* renamed from: m */
        public int f28232m;

        /* renamed from: n */
        public int f28233n;

        /* renamed from: o */
        public int f28234o;

        /* renamed from: p */
        public String f28235p;

        public C3144c(C3143b c3143b) {
            this.f28220a = c3143b;
        }
    }

    /* renamed from: com.daaw.tx0$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3145d {
        /* renamed from: a */
        void mo8722a(C3143b c3143b, Object obj, Object obj2);
    }

    static {
        boolean z = br1.f5068a;
        f28185e = "duration";
        f28186f = Arrays.asList("_id", "artist", "album", "title", "duration", "mime_type");
        f28187g = Arrays.asList("album_id", "artist_id");
        C3143b c3143b = new C3143b(Uri.EMPTY);
        f28188h = c3143b;
        f28189i = new C3143b(Uri.EMPTY);
        f28190j = new C3143b(Uri.EMPTY);
        f28191k = new tx0(c3143b);
        f28192l = null;
        f28193m = null;
    }

    public tx0(long j, Uri uri) {
        this(uri, (String) null);
    }

    public tx0(long j, String str) {
        this(str == null ? Uri.EMPTY : Uri.parse(str), (String) null);
    }

    public tx0(long j, String str, String str2, String str3) {
        this(str == null ? Uri.EMPTY : Uri.parse(str), str2);
    }

    public tx0(Uri uri) {
        this(uri, (String) null);
    }

    public tx0(Uri uri, String str) {
        this.f28194a = Uri.EMPTY;
        this.f28197d = null;
        this.f28194a = uri == null ? Uri.EMPTY : uri;
        this.f28195b = str;
        this.f28196c = f28189i;
    }

    public tx0(C3143b c3143b) {
        this.f28194a = Uri.EMPTY;
        this.f28197d = null;
        this.f28196c = c3143b;
    }

    public tx0(File file) {
        this(Uri.fromFile(file), (String) null);
    }

    public tx0(String str) {
        this(str == null ? Uri.EMPTY : Uri.parse(str), (String) null);
    }

    /* renamed from: c */
    public static boolean m8749c(C3143b c3143b, Context context, Uri uri) {
        C3144c m5736d = wx0.m5736d(context, uri, null);
        if (m5736d.f28224e.isEmpty()) {
            return false;
        }
        c3143b.f28205c = m5736d.f28221b;
        c3143b.f28207e = m5736d.f28224e;
        c3143b.f28208f = m5736d.f28227h.isEmpty() ? f28193m : m5736d.f28225f;
        c3143b.f28210h = m5736d.f28226g.isEmpty() ? f28192l : m5736d.f28226g;
        c3143b.f28212j = m5736d.f28228i;
        c3143b.f28215m = m5736d.f28231l;
        c3143b.f28216n = m5736d.f28232m;
        c3143b.f28217o = m5736d.f28233n;
        return true;
    }

    /* renamed from: f */
    public static String[] m8746f(boolean z) {
        ArrayList arrayList = new ArrayList(f28186f);
        if (z) {
            arrayList.addAll(f28187g);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: o */
    public static boolean m8737o(Uri uri, ContentResolver contentResolver) {
        String mimeTypeFromExtension;
        if (Uri.EMPTY.equals(uri)) {
            return false;
        }
        if (!"content".equals(uri.getScheme())) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            if (fileExtensionFromUrl == null) {
                return false;
            }
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        } else if (dx0.m23837e() == null) {
            return false;
        } else {
            mimeTypeFromExtension = contentResolver.getType(uri);
        }
        if (mimeTypeFromExtension == null) {
            return false;
        }
        return mimeTypeFromExtension.startsWith("audio");
    }

    /* renamed from: q */
    public static List<tx0> m8735q(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(new tx0(-1L, str));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133 A[Catch: Exception -> 0x01cb, TryCatch #1 {Exception -> 0x01cb, blocks: (B:65:0x0129, B:67:0x0133, B:69:0x013b, B:71:0x0145, B:73:0x014b, B:75:0x0155, B:77:0x015b, B:79:0x0165, B:81:0x016c, B:83:0x0176, B:85:0x017c, B:87:0x0186, B:89:0x018d, B:91:0x0197, B:93:0x019d, B:95:0x01b1, B:96:0x01b9, B:98:0x01c1), top: B:132:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0145 A[Catch: Exception -> 0x01cb, TryCatch #1 {Exception -> 0x01cb, blocks: (B:65:0x0129, B:67:0x0133, B:69:0x013b, B:71:0x0145, B:73:0x014b, B:75:0x0155, B:77:0x015b, B:79:0x0165, B:81:0x016c, B:83:0x0176, B:85:0x017c, B:87:0x0186, B:89:0x018d, B:91:0x0197, B:93:0x019d, B:95:0x01b1, B:96:0x01b9, B:98:0x01c1), top: B:132:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0155 A[Catch: Exception -> 0x01cb, TryCatch #1 {Exception -> 0x01cb, blocks: (B:65:0x0129, B:67:0x0133, B:69:0x013b, B:71:0x0145, B:73:0x014b, B:75:0x0155, B:77:0x015b, B:79:0x0165, B:81:0x016c, B:83:0x0176, B:85:0x017c, B:87:0x0186, B:89:0x018d, B:91:0x0197, B:93:0x019d, B:95:0x01b1, B:96:0x01b9, B:98:0x01c1), top: B:132:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0165 A[Catch: Exception -> 0x01cb, TryCatch #1 {Exception -> 0x01cb, blocks: (B:65:0x0129, B:67:0x0133, B:69:0x013b, B:71:0x0145, B:73:0x014b, B:75:0x0155, B:77:0x015b, B:79:0x0165, B:81:0x016c, B:83:0x0176, B:85:0x017c, B:87:0x0186, B:89:0x018d, B:91:0x0197, B:93:0x019d, B:95:0x01b1, B:96:0x01b9, B:98:0x01c1), top: B:132:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0176 A[Catch: Exception -> 0x01cb, TryCatch #1 {Exception -> 0x01cb, blocks: (B:65:0x0129, B:67:0x0133, B:69:0x013b, B:71:0x0145, B:73:0x014b, B:75:0x0155, B:77:0x015b, B:79:0x0165, B:81:0x016c, B:83:0x0176, B:85:0x017c, B:87:0x0186, B:89:0x018d, B:91:0x0197, B:93:0x019d, B:95:0x01b1, B:96:0x01b9, B:98:0x01c1), top: B:132:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186 A[Catch: Exception -> 0x01cb, TryCatch #1 {Exception -> 0x01cb, blocks: (B:65:0x0129, B:67:0x0133, B:69:0x013b, B:71:0x0145, B:73:0x014b, B:75:0x0155, B:77:0x015b, B:79:0x0165, B:81:0x016c, B:83:0x0176, B:85:0x017c, B:87:0x0186, B:89:0x018d, B:91:0x0197, B:93:0x019d, B:95:0x01b1, B:96:0x01b9, B:98:0x01c1), top: B:132:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197 A[Catch: Exception -> 0x01cb, TryCatch #1 {Exception -> 0x01cb, blocks: (B:65:0x0129, B:67:0x0133, B:69:0x013b, B:71:0x0145, B:73:0x014b, B:75:0x0155, B:77:0x015b, B:79:0x0165, B:81:0x016c, B:83:0x0176, B:85:0x017c, B:87:0x0186, B:89:0x018d, B:91:0x0197, B:93:0x019d, B:95:0x01b1, B:96:0x01b9, B:98:0x01c1), top: B:132:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1 A[Catch: Exception -> 0x01cb, TryCatch #1 {Exception -> 0x01cb, blocks: (B:65:0x0129, B:67:0x0133, B:69:0x013b, B:71:0x0145, B:73:0x014b, B:75:0x0155, B:77:0x015b, B:79:0x0165, B:81:0x016c, B:83:0x0176, B:85:0x017c, B:87:0x0186, B:89:0x018d, B:91:0x0197, B:93:0x019d, B:95:0x01b1, B:96:0x01b9, B:98:0x01c1), top: B:132:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c1 A[Catch: Exception -> 0x01cb, TRY_LEAVE, TryCatch #1 {Exception -> 0x01cb, blocks: (B:65:0x0129, B:67:0x0133, B:69:0x013b, B:71:0x0145, B:73:0x014b, B:75:0x0155, B:77:0x015b, B:79:0x0165, B:81:0x016c, B:83:0x0176, B:85:0x017c, B:87:0x0186, B:89:0x018d, B:91:0x0197, B:93:0x019d, B:95:0x01b1, B:96:0x01b9, B:98:0x01c1), top: B:132:0x0129 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3143b m8751a(Context context, Uri uri, String str) {
        ContentResolver contentResolver;
        int i;
        Cursor cursor;
        String str2;
        String str3;
        boolean z;
        Cursor m24109e;
        String str4;
        try {
            if (f28193m == null) {
                f28192l = context.getResources().getString(R.string.unknown_artist_name);
                f28193m = context.getResources().getString(R.string.unknown_album_name);
            }
        } catch (Exception unused) {
            f28192l = "Unknown artist";
            f28193m = "Unknown album";
        }
        C3143b c3143b = new C3143b(uri);
        if (uri != null && uri != Uri.EMPTY) {
            c3143b.f28205c = C3143b.m8723j(uri);
            ContentResolver contentResolver2 = context != null ? context.getContentResolver() : null;
            if (contentResolver2 != null) {
                boolean m8737o = m8737o(uri, contentResolver2);
                String[] m8746f = m8746f(m8737o);
                if ("content".equals(uri.getScheme())) {
                    cursor = dp0.m24109e(contentResolver2, uri, m8746f, null, null, null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cursor is ");
                    sb.append(cursor);
                    contentResolver = contentResolver2;
                    str2 = null;
                    str3 = null;
                    i = 0;
                } else if (c3143b.f28205c) {
                    String m25910G = str != null ? str : br1.m25910G(uri);
                    str3 = uri.toString();
                    contentResolver = contentResolver2;
                    i = 0;
                    str2 = m25910G;
                    cursor = null;
                } else {
                    String path = uri.getPath();
                    if (path != null) {
                        Uri uri2 = m8737o ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr = {path};
                        i = 0;
                        contentResolver = contentResolver2;
                        Cursor m24109e2 = dp0.m24109e(contentResolver2, uri2, m8746f, "_data=?", strArr, null);
                        if (m24109e2 == null || m24109e2.getCount() <= 0) {
                            if (m24109e2 != null) {
                                m24109e2.close();
                            }
                            m24109e = dp0.m24109e(contentResolver, uri2, m8746f, "_data=? COLLATE NOCASE", strArr, null);
                        } else {
                            m24109e = m24109e2;
                        }
                        if ((m24109e == null || m24109e.getCount() <= 0) && ("file".equals(uri.getScheme()) || uri.getScheme() == null)) {
                            try {
                                str4 = new File(path).getCanonicalPath();
                            } catch (IOException unused2) {
                                str4 = null;
                            }
                            if (str4 != null) {
                                if (m24109e != null) {
                                    m24109e.close();
                                }
                                cursor = dp0.m24109e(contentResolver, uri2, m8746f, "_data=?", new String[]{str4}, null);
                                str2 = null;
                                str3 = null;
                            }
                        }
                        cursor = m24109e;
                        str2 = null;
                        str3 = null;
                    }
                }
                if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
                    try {
                        int columnIndex = cursor.getColumnIndex("_id");
                        c3143b.f28206d = columnIndex < 0 ? cursor.getLong(columnIndex) : 0L;
                        int columnIndex2 = cursor.getColumnIndex("title");
                        c3143b.f28207e = columnIndex2 < 0 ? cursor.getString(columnIndex2) : null;
                        int columnIndex3 = cursor.getColumnIndex("album");
                        c3143b.f28208f = columnIndex3 < 0 ? cursor.getString(columnIndex3) : null;
                        int columnIndex4 = cursor.getColumnIndex("album_id");
                        c3143b.f28209g = columnIndex4 < 0 ? cursor.getLong(columnIndex4) : -1L;
                        int columnIndex5 = cursor.getColumnIndex("artist");
                        c3143b.f28210h = columnIndex5 < 0 ? cursor.getString(columnIndex5) : null;
                        int columnIndex6 = cursor.getColumnIndex("artist_id");
                        c3143b.f28211i = columnIndex6 < 0 ? cursor.getLong(columnIndex6) : -1L;
                        int columnIndex7 = cursor.getColumnIndex(f28185e);
                        c3143b.f28212j = columnIndex7 < 0 ? cursor.getInt(columnIndex7) : 0;
                        c3143b.f28215m = i;
                        c3143b.f28216n = i;
                        c3143b.f28217o = i;
                        c3143b.f28218p = 0L;
                        c3143b.f28219q = "";
                        if ("<unknown>".equals(c3143b.f28210h)) {
                            c3143b.f28210h = f28192l;
                            c3143b.f28211i = -1L;
                        }
                        if ("<unknown>".equals(c3143b.f28208f)) {
                            c3143b.f28208f = f28193m;
                            c3143b.f28209g = -1L;
                        }
                        z = false;
                    } catch (Exception unused3) {
                    }
                    if (z && !m8749c(c3143b, context, uri)) {
                        if (str2 == null) {
                            str2 = uri.getLastPathSegment();
                        }
                        if (str2 == null) {
                            str2 = "unknown";
                        }
                        c3143b.f28206d = -1L;
                        c3143b.f28207e = str2;
                        c3143b.f28208f = f28193m;
                        c3143b.f28209g = -1L;
                        if (str3 != null) {
                            c3143b.f28210h = f28192l;
                            c3143b.f28211i = -1L;
                        } else {
                            c3143b.f28210h = str3;
                            c3143b.f28211i = -2L;
                        }
                    }
                    if (c3143b.f28204b == null) {
                        c3143b.f28204b = "";
                    }
                    if (c3143b.f28207e == null) {
                        c3143b.f28207e = "unknown";
                    }
                    if (c3143b.f28208f == null) {
                        c3143b.f28208f = f28193m;
                    }
                    if (c3143b.f28210h == null) {
                        c3143b.f28210h = f28192l;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    c3143b.m8732a(contentResolver);
                }
                z = true;
                if (z) {
                    if (str2 == null) {
                    }
                    if (str2 == null) {
                    }
                    c3143b.f28206d = -1L;
                    c3143b.f28207e = str2;
                    c3143b.f28208f = f28193m;
                    c3143b.f28209g = -1L;
                    if (str3 != null) {
                    }
                }
                if (c3143b.f28204b == null) {
                }
                if (c3143b.f28207e == null) {
                }
                if (c3143b.f28208f == null) {
                }
                if (c3143b.f28210h == null) {
                }
                if (cursor != null) {
                }
                c3143b.m8732a(contentResolver);
            }
            contentResolver = contentResolver2;
            i = 0;
            cursor = null;
            str2 = null;
            str3 = null;
            if (cursor != null) {
                int columnIndex8 = cursor.getColumnIndex("_id");
                c3143b.f28206d = columnIndex8 < 0 ? cursor.getLong(columnIndex8) : 0L;
                int columnIndex22 = cursor.getColumnIndex("title");
                c3143b.f28207e = columnIndex22 < 0 ? cursor.getString(columnIndex22) : null;
                int columnIndex32 = cursor.getColumnIndex("album");
                c3143b.f28208f = columnIndex32 < 0 ? cursor.getString(columnIndex32) : null;
                int columnIndex42 = cursor.getColumnIndex("album_id");
                c3143b.f28209g = columnIndex42 < 0 ? cursor.getLong(columnIndex42) : -1L;
                int columnIndex52 = cursor.getColumnIndex("artist");
                c3143b.f28210h = columnIndex52 < 0 ? cursor.getString(columnIndex52) : null;
                int columnIndex62 = cursor.getColumnIndex("artist_id");
                c3143b.f28211i = columnIndex62 < 0 ? cursor.getLong(columnIndex62) : -1L;
                int columnIndex72 = cursor.getColumnIndex(f28185e);
                c3143b.f28212j = columnIndex72 < 0 ? cursor.getInt(columnIndex72) : 0;
                c3143b.f28215m = i;
                c3143b.f28216n = i;
                c3143b.f28217o = i;
                c3143b.f28218p = 0L;
                c3143b.f28219q = "";
                if ("<unknown>".equals(c3143b.f28210h)) {
                }
                if ("<unknown>".equals(c3143b.f28208f)) {
                }
                z = false;
                if (z) {
                }
                if (c3143b.f28204b == null) {
                }
                if (c3143b.f28207e == null) {
                }
                if (c3143b.f28208f == null) {
                }
                if (c3143b.f28210h == null) {
                }
                if (cursor != null) {
                }
                c3143b.m8732a(contentResolver);
            }
            z = true;
            if (z) {
            }
            if (c3143b.f28204b == null) {
            }
            if (c3143b.f28207e == null) {
            }
            if (c3143b.f28208f == null) {
            }
            if (c3143b.f28210h == null) {
            }
            if (cursor != null) {
            }
            c3143b.m8732a(contentResolver);
        }
        return c3143b;
    }

    /* renamed from: b */
    public final C3143b m8750b(Context context, Uri uri, String str) {
        return m8751a(context, uri, str);
    }

    /* renamed from: d */
    public boolean m8748d(tx0 tx0Var) {
        return tx0Var != null && tx0Var.f28194a.equals(this.f28194a);
    }

    /* renamed from: e */
    public C3143b m8747e(Object... objArr) {
        return m8750b((Context) objArr[0], (Uri) objArr[1], (String) objArr[2]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof tx0) && m8748d((tx0) obj);
    }

    /* renamed from: g */
    public String m8745g() {
        return Uri.decode(this.f28194a.toString());
    }

    /* renamed from: h */
    public C3143b m8744h() {
        C3143b c3143b = this.f28196c;
        if (c3143b == f28189i) {
            this.f28197d = null;
            m8733s(null);
            return f28188h;
        }
        C3143b c3143b2 = f28190j;
        this.f28197d = null;
        return c3143b == c3143b2 ? f28188h : c3143b;
    }

    public int hashCode() {
        return this.f28194a.hashCode();
    }

    /* renamed from: i */
    public C3143b m8743i(Handler handler, InterfaceC3145d interfaceC3145d, Object obj, Object obj2) {
        C3143b c3143b = this.f28196c;
        if (c3143b == f28189i) {
            this.f28197d = new C3142a(interfaceC3145d, obj, obj2);
            m8733s(handler);
        } else if (c3143b != f28190j) {
            this.f28197d = null;
            return c3143b;
        } else {
            this.f28197d = new C3142a(interfaceC3145d, obj, obj2);
        }
        return f28188h;
    }

    /* renamed from: j */
    public C3143b m8742j(Context context) {
        C3143b c3143b = this.f28196c;
        return (c3143b == f28188h || c3143b == f28190j || c3143b == f28189i) ? m8750b(context, this.f28194a, this.f28195b) : c3143b;
    }

    /* renamed from: k */
    public C3144c m8741k(Context context) {
        return wx0.m5736d(context, this.f28194a, m8742j(context));
    }

    /* renamed from: l */
    public long m8740l() {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return 0L;
        }
        long j = m8742j(m23837e).f28206d;
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    /* renamed from: m */
    public String m8739m() {
        return Uri.decode(this.f28194a.toString());
    }

    /* renamed from: n */
    public wd0 m8738n() {
        return new lo0(this.f28194a);
    }

    /* renamed from: p */
    public boolean m8736p() {
        return C3143b.m8723j(this.f28194a);
    }

    /* renamed from: r */
    public void m8734r(C3143b c3143b) {
        C3142a c3142a = this.f28197d;
        this.f28197d = null;
        this.f28196c = c3143b;
        if (c3142a != null) {
            c3142a.f28198a.mo8722a(this.f28196c, c3142a.f28199b, c3142a.f28200c);
        }
    }

    /* renamed from: s */
    public final void m8733s(Handler handler) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        this.f28196c = f28190j;
        wx0.m5737c(m23837e, this, this.f28194a, this.f28195b, handler, new InterfaceC1153e0() { // from class: com.daaw.sx0
            @Override // com.daaw.InterfaceC1153e0
            /* renamed from: a */
            public final void mo7884a(Object obj) {
                tx0.this.m8734r((tx0.C3143b) obj);
            }
        });
    }
}

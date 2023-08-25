package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.daaw.tx0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class tx0 {
    public static final String e;
    public static final List<String> f;
    public static final List<String> g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final tx0 k;
    public static String l;
    public static String m;
    public Uri a;
    public String b;
    public volatile b c;
    public volatile a d;

    /* loaded from: classes.dex */
    public class a {
        public final d a;
        public final Object b;
        public final Object c;

        public a(d dVar, Object obj, Object obj2) {
            this.a = dVar;
            this.b = obj;
            this.c = obj2;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final Uri r = Uri.parse("content://media/external/audio/albumart");
        public final Uri a;
        public String b;
        public boolean c = false;
        public long d = 0;
        public String e = "";
        public String f = "";
        public long g = 0;
        public String h = "";
        public long i = -1;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public long p = 0;
        public String q = "";

        public b(Uri uri) {
            this.a = uri;
        }

        public static boolean j(Uri uri) {
            return "http".equals(uri.getScheme()) || "https".equals(uri.getScheme());
        }

        public void a(ContentResolver contentResolver) {
            this.q = "";
            if (contentResolver == null || !g2.a) {
                return;
            }
            Cursor e = dp0.e(contentResolver, MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album_art"}, "_id=?", new String[]{String.valueOf(this.g)}, null);
            if (e != null && e.moveToFirst()) {
                this.q = e.getString(e.getColumnIndex("album_art"));
            }
            if (e != null) {
                e.close();
            }
        }

        public String b() {
            if (!h() || this.h.length() <= 1) {
                int indexOf = this.e.indexOf(45);
                if (indexOf < 3) {
                    indexOf = this.e.indexOf("_-_");
                }
                if (indexOf < 3) {
                    boolean z = this.e.indexOf(32) >= 0;
                    String str = this.e;
                    indexOf = z ? str.indexOf(95) : str.indexOf("__");
                }
                if (indexOf < 3) {
                    return this.e;
                }
                if (this.e.charAt(indexOf - 1) == ' ') {
                    indexOf--;
                }
                return this.e.substring(0, indexOf);
            }
            return this.h;
        }

        public String c() {
            if (this.d <= 0) {
                return null;
            }
            return "content://media/external/audio/media/" + this.d + "/albumart";
        }

        public String d() {
            String e = e();
            return (e == null || e.length() <= 0) ? c() : e;
        }

        public String e() {
            return this.q;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int f() {
            return this.j / 1000;
        }

        public boolean g() {
            return this.i > 0;
        }

        public boolean h() {
            return this.i > 0;
        }

        public boolean i() {
            return h() || this.i == -2;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final b a;
        public boolean b = false;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public String p;

        public c(b bVar) {
            this.a = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(b bVar, Object obj, Object obj2);
    }

    static {
        boolean z = br1.a;
        e = "duration";
        f = Arrays.asList("_id", "artist", "album", "title", "duration", "mime_type");
        g = Arrays.asList("album_id", "artist_id");
        b bVar = new b(Uri.EMPTY);
        h = bVar;
        i = new b(Uri.EMPTY);
        j = new b(Uri.EMPTY);
        k = new tx0(bVar);
        l = null;
        m = null;
    }

    public tx0(long j2, Uri uri) {
        this(uri, (String) null);
    }

    public tx0(long j2, String str) {
        this(str == null ? Uri.EMPTY : Uri.parse(str), (String) null);
    }

    public tx0(long j2, String str, String str2, String str3) {
        this(str == null ? Uri.EMPTY : Uri.parse(str), str2);
    }

    public tx0(Uri uri) {
        this(uri, (String) null);
    }

    public tx0(Uri uri, String str) {
        this.a = Uri.EMPTY;
        this.d = null;
        this.a = uri == null ? Uri.EMPTY : uri;
        this.b = str;
        this.c = i;
    }

    public tx0(b bVar) {
        this.a = Uri.EMPTY;
        this.d = null;
        this.c = bVar;
    }

    public tx0(File file) {
        this(Uri.fromFile(file), (String) null);
    }

    public tx0(String str) {
        this(str == null ? Uri.EMPTY : Uri.parse(str), (String) null);
    }

    public static boolean c(b bVar, Context context, Uri uri) {
        c d2 = wx0.d(context, uri, null);
        if (d2.e.isEmpty()) {
            return false;
        }
        bVar.c = d2.b;
        bVar.e = d2.e;
        bVar.f = d2.h.isEmpty() ? m : d2.f;
        bVar.h = d2.g.isEmpty() ? l : d2.g;
        bVar.j = d2.i;
        bVar.m = d2.l;
        bVar.n = d2.m;
        bVar.o = d2.n;
        return true;
    }

    public static String[] f(boolean z) {
        ArrayList arrayList = new ArrayList(f);
        if (z) {
            arrayList.addAll(g);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static boolean o(Uri uri, ContentResolver contentResolver) {
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
        } else if (dx0.e() == null) {
            return false;
        } else {
            mimeTypeFromExtension = contentResolver.getType(uri);
        }
        if (mimeTypeFromExtension == null) {
            return false;
        }
        return mimeTypeFromExtension.startsWith("audio");
    }

    public static List<tx0> q(List<String> list) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.tx0.b a(android.content.Context r20, android.net.Uri r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.tx0.a(android.content.Context, android.net.Uri, java.lang.String):com.daaw.tx0$b");
    }

    public final b b(Context context, Uri uri, String str) {
        return a(context, uri, str);
    }

    public boolean d(tx0 tx0Var) {
        return tx0Var != null && tx0Var.a.equals(this.a);
    }

    public b e(Object... objArr) {
        return b((Context) objArr[0], (Uri) objArr[1], (String) objArr[2]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof tx0) && d((tx0) obj);
    }

    public String g() {
        return Uri.decode(this.a.toString());
    }

    public b h() {
        b bVar = this.c;
        if (bVar == i) {
            this.d = null;
            s(null);
            return h;
        }
        b bVar2 = j;
        this.d = null;
        return bVar == bVar2 ? h : bVar;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public b i(Handler handler, d dVar, Object obj, Object obj2) {
        b bVar = this.c;
        if (bVar == i) {
            this.d = new a(dVar, obj, obj2);
            s(handler);
        } else if (bVar != j) {
            this.d = null;
            return bVar;
        } else {
            this.d = new a(dVar, obj, obj2);
        }
        return h;
    }

    public b j(Context context) {
        b bVar = this.c;
        return (bVar == h || bVar == j || bVar == i) ? b(context, this.a, this.b) : bVar;
    }

    public c k(Context context) {
        return wx0.d(context, this.a, j(context));
    }

    public long l() {
        Context e2 = dx0.e();
        if (e2 == null) {
            return 0L;
        }
        long j2 = j(e2).d;
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    public String m() {
        return Uri.decode(this.a.toString());
    }

    public wd0 n() {
        return new lo0(this.a);
    }

    public boolean p() {
        return b.j(this.a);
    }

    public void r(b bVar) {
        a aVar = this.d;
        this.d = null;
        this.c = bVar;
        if (aVar != null) {
            aVar.a.a(this.c, aVar.b, aVar.c);
        }
    }

    public final void s(Handler handler) {
        Context e2 = dx0.e();
        if (e2 == null) {
            return;
        }
        this.c = j;
        wx0.c(e2, this, this.a, this.b, handler, new e0() { // from class: com.daaw.sx0
            @Override // com.daaw.e0
            public final void a(Object obj) {
                tx0.this.r((tx0.b) obj);
            }
        });
    }
}

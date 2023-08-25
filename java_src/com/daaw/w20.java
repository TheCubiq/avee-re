package com.daaw;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.daaw.b30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class w20 {

    /* renamed from: a */
    public static final Comparator<byte[]> f30798a = new Comparator() { // from class: com.daaw.v20
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m6582g;
            m6582g = w20.m6582g((byte[]) obj, (byte[]) obj2);
            return m6582g;
        }
    };

    /* renamed from: com.daaw.w20$a */
    /* loaded from: classes.dex */
    public static class C3395a {
        /* renamed from: a */
        public static Cursor m6580a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    public static List<byte[]> m6587b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m6586c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static List<List<byte[]>> m6585d(x20 x20Var, Resources resources) {
        return x20Var.m5614b() != null ? x20Var.m5614b() : a30.m27742c(resources, x20Var.m5613c());
    }

    /* renamed from: e */
    public static b30.C0804a m6584e(Context context, x20 x20Var, CancellationSignal cancellationSignal) {
        ProviderInfo m6583f = m6583f(context.getPackageManager(), x20Var, context.getResources());
        return m6583f == null ? b30.C0804a.m26510a(1, null) : b30.C0804a.m26510a(0, m6581h(context, x20Var, m6583f.authority, cancellationSignal));
    }

    /* renamed from: f */
    public static ProviderInfo m6583f(PackageManager packageManager, x20 x20Var, Resources resources) {
        String m5611e = x20Var.m5611e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m5611e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + m5611e);
        } else if (!resolveContentProvider.packageName.equals(x20Var.m5610f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + m5611e + ", but package was not " + x20Var.m5610f());
        } else {
            List<byte[]> m6587b = m6587b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(m6587b, f30798a);
            List<List<byte[]>> m6585d = m6585d(x20Var, resources);
            for (int i = 0; i < m6585d.size(); i++) {
                ArrayList arrayList = new ArrayList(m6585d.get(i));
                Collections.sort(arrayList, f30798a);
                if (m6586c(m6587b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static /* synthetic */ int m6582g(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        if (bArr.length == bArr2.length) {
            for (int i3 = 0; i3 < bArr.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    i = bArr[i3];
                    i2 = bArr2[i3];
                }
            }
            return 0;
        }
        i = bArr.length;
        i2 = bArr2.length;
        return i - i2;
    }

    /* renamed from: h */
    public static b30.C0805b[] m6581h(Context context, x20 x20Var, String str, CancellationSignal cancellationSignal) {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = C3395a.m6580a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{x20Var.m5609g()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    int i4 = i2;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i5 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i = i4;
                        z = false;
                    } else {
                        i = i4;
                        z = true;
                    }
                    arrayList2.add(b30.C0805b.m26507a(withAppendedId, i3, i5, z, i));
                }
                arrayList = arrayList2;
            }
            return (b30.C0805b[]) arrayList.toArray(new b30.C0805b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}

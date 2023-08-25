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
    public static final Comparator<byte[]> a = new Comparator() { // from class: com.daaw.v20
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g;
            g = w20.g((byte[]) obj, (byte[]) obj2);
            return g;
        }
    };

    /* loaded from: classes.dex */
    public static class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    public static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List<byte[]> list, List<byte[]> list2) {
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

    public static List<List<byte[]>> d(x20 x20Var, Resources resources) {
        return x20Var.b() != null ? x20Var.b() : a30.c(resources, x20Var.c());
    }

    public static b30.a e(Context context, x20 x20Var, CancellationSignal cancellationSignal) {
        ProviderInfo f = f(context.getPackageManager(), x20Var, context.getResources());
        return f == null ? b30.a.a(1, null) : b30.a.a(0, h(context, x20Var, f.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, x20 x20Var, Resources resources) {
        String e = x20Var.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (!resolveContentProvider.packageName.equals(x20Var.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + x20Var.f());
        } else {
            List<byte[]> b = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, a);
            List<List<byte[]>> d = d(x20Var, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList(d.get(i));
                Collections.sort(arrayList, a);
                if (c(b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
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

    public static b30.b[] h(Context context, x20 x20Var, String str, CancellationSignal cancellationSignal) {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{x20Var.g()}, null, cancellationSignal);
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
                    arrayList2.add(b30.b.a(withAppendedId, i3, i5, z, i));
                }
                arrayList = arrayList2;
            }
            return (b30.b[]) arrayList.toArray(new b30.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}

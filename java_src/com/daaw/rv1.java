package com.daaw;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.daaw.avee.R;
import com.daaw.dt0;
import com.daaw.rw1;
import com.daaw.sw1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class rv1 extends kt {
    public WeakReference<List<Integer>> b = new WeakReference<>(null);
    public final String c = ".txt";
    public final String d = ".zip";
    public final String e = ".viz";
    public final long f = 100000000;

    /* loaded from: classes.dex */
    public class a implements rw1.a<iv1, sv1> {
        public a() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(iv1 iv1Var, sv1 sv1Var) {
            if (sv1Var == null || iv1Var == null) {
                return;
            }
            Activity activity = iv1Var.getActivity();
            vn O = pv1.O(sv1Var.a, null);
            if (O == null) {
                return;
            }
            String p = O.p();
            String str = Environment.DIRECTORY_DOWNLOADS;
            String str2 = "visualizer_" + sv1Var.a;
            File a = j5.a(sv1Var.a);
            String d = rv1.this.d(iv1Var.getActivity(), str, str2, ".viz", p, Arrays.asList(a != null ? a.listFiles() : new File[0]));
            cr1.r(activity, d);
            String string = activity.getString(R.string.saved_viz_in);
            qv1.g0(2, activity, string, Uri.parse(d), cr1.g(d), "text/plain");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(d), "text/plain");
            PendingIntent activity2 = PendingIntent.getActivity(activity, 0, intent, 67108864);
            dt0.d dVar = new dt0.d(activity);
            dVar.i(cr1.g(d)).h(string).n(R.drawable.ic_save5).g(activity2).l(true).e(true);
            ((NotificationManager) activity.getSystemService("notification")).notify(2, dVar.b());
            vy.a.a(string);
        }
    }

    /* loaded from: classes.dex */
    public class b implements rw1.a<iv1, List<Integer>> {
        public b() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(iv1 iv1Var, List<Integer> list) {
            if (iv1Var == null) {
                return;
            }
            rv1.this.b = new WeakReference<>(list);
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            iv1Var.startActivityForResult(Intent.createChooser(intent, iv1Var.getResources().getString(R.string.vis_action_loadFromFile_title)), 64);
        }
    }

    /* loaded from: classes.dex */
    public class c implements sw1.a<iv1, Integer, Intent> {
        public c() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(iv1 iv1Var, Integer num, Intent intent) {
            List<Integer> list = rv1.this.b.get();
            if (list == null) {
                return;
            }
            Activity activity = iv1Var.getActivity();
            if (num.intValue() == 64) {
                if (intent == null) {
                    lz1.c("PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data");
                    return;
                }
                rv1.this.j(activity, intent.getData(), list);
            }
        }
    }

    public rv1() {
        iv1.D.b(new a(), this.a);
        iv1.E.b(new b(), this.a);
        iv1.x.b(new c(), this.a);
    }

    public static int a(Context context, Uri uri) {
        return k(context, uri, j5.e().o());
    }

    public static boolean b(ContentResolver contentResolver, Uri uri) {
        int read;
        byte[] bArr = new byte[2];
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            read = openInputStream != null ? openInputStream.read(bArr) : 0;
            if (openInputStream != null) {
                openInputStream.close();
            }
        } catch (IOException | Exception unused) {
        }
        return read == 2 && bArr[0] == 80 && bArr[1] == 75;
    }

    public static void c(int i) {
        File a2;
        File[] listFiles;
        if (i >= 0 && (a2 = j5.a(i)) != null) {
            String str = null;
            File file = null;
            File file2 = null;
            for (File file3 : a2.listFiles()) {
                if (".json".equals(cr1.k(file3.getName()))) {
                    file2 = file3;
                }
                if ("scene.json".equals(file3.getName())) {
                    file = file3;
                }
            }
            if (file == null) {
                file = file2;
            }
            if (file != null) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    str = cr1.p(fileInputStream);
                    fileInputStream.close();
                } catch (FileNotFoundException | IOException unused) {
                }
                try {
                    file.delete();
                } catch (Exception unused2) {
                }
            }
            if (str == null) {
                return;
            }
            j5.e().W(i, vn.g(str), false);
        }
    }

    public static void g(File file, ZipOutputStream zipOutputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
        byte[] bArr = new byte[NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read < 0) {
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            }
            zipOutputStream.write(bArr, 0, read);
        }
    }

    public static void h(String str, String str2, ZipOutputStream zipOutputStream) {
        zipOutputStream.putNextEntry(new ZipEntry(str2));
        zipOutputStream.write(str.getBytes());
        zipOutputStream.closeEntry();
    }

    public static int k(Context context, Uri uri, List<Integer> list) {
        int i;
        InputStream openInputStream;
        ZipInputStream zipInputStream;
        int i2 = -1;
        if (uri == null) {
            return -1;
        }
        byte[] bArr = new byte[NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV];
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
            zipInputStream = new ZipInputStream(openInputStream);
            i = pv1.J(vn.g(""), list, -1);
        } catch (FileNotFoundException | IOException unused) {
        }
        if (i < 0) {
            return -1;
        }
        try {
            File a2 = j5.a(i);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(a2, nextEntry.getName()));
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                fileOutputStream.close();
            }
            zipInputStream.close();
            openInputStream.close();
        } catch (FileNotFoundException | IOException unused2) {
            i2 = i;
            i = i2;
            c(i);
            return i;
        }
        c(i);
        return i;
    }

    public final String d(Context context, String str, String str2, String str3, String str4, List<File> list) {
        StringBuilder sb;
        File file = null;
        int i = 0;
        for (int i2 = 0; i2 < 100; i2++) {
            if (i == 0) {
                sb = new StringBuilder();
                sb.append(str2);
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append("(");
                sb.append(i);
                sb.append(")");
            }
            sb.append(str3);
            file = i(context, str, sb.toString());
            if (file != null && !file.exists()) {
                break;
            }
            i++;
        }
        if (file != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                h(str4, "scene.json", zipOutputStream);
                for (File file2 : list) {
                    if (!"scene.json".equals(file2.getName())) {
                        g(file2, zipOutputStream);
                    }
                }
                zipOutputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        }
        return null;
    }

    public final File i(Context context, String str, String str2) {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(str), cr1.n(str2));
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.isDirectory()) {
                parentFile.mkdirs();
            }
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void j(Context context, Uri uri, List<Integer> list) {
        String path = uri.getPath();
        int lastIndexOf = path.lastIndexOf(".txt");
        int lastIndexOf2 = path.lastIndexOf(".json");
        int max = Math.max(lastIndexOf, Math.max(lastIndexOf2, Math.max(path.lastIndexOf(".zip"), path.lastIndexOf(".viz"))));
        boolean z = false;
        if ((max == lastIndexOf || max == lastIndexOf2) && max != -1) {
            z = true;
        }
        if (z) {
            l(context, uri, list);
        } else {
            k(context, uri, list);
        }
    }

    public final void l(Context context, Uri uri, List<Integer> list) {
        if (uri == null) {
            return;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            String p = cr1.p(openInputStream);
            if (p == null) {
                return;
            }
            pv1.J(vn.g(p), list, -1);
            openInputStream.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }
}

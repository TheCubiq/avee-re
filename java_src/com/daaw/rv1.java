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
public class rv1 extends C1983kt {

    /* renamed from: b */
    public WeakReference<List<Integer>> f25640b = new WeakReference<>(null);

    /* renamed from: c */
    public final String f25641c = ".txt";

    /* renamed from: d */
    public final String f25642d = ".zip";

    /* renamed from: e */
    public final String f25643e = ".viz";

    /* renamed from: f */
    public final long f25644f = 100000000;

    /* renamed from: com.daaw.rv1$a */
    /* loaded from: classes.dex */
    public class C2890a implements rw1.InterfaceC2894a<iv1, sv1> {
        public C2890a() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(iv1 iv1Var, sv1 sv1Var) {
            if (sv1Var == null || iv1Var == null) {
                return;
            }
            Activity activity = iv1Var.getActivity();
            C3355vn m13102O = pv1.m13102O(sv1Var.f26665a, null);
            if (m13102O == null) {
                return;
            }
            String m7004p = m13102O.m7004p();
            String str = Environment.DIRECTORY_DOWNLOADS;
            String str2 = "visualizer_" + sv1Var.f26665a;
            File m18936a = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18936a(sv1Var.f26665a);
            String m10890d = rv1.this.m10890d(iv1Var.getActivity(), str, str2, ".viz", m7004p, Arrays.asList(m18936a != null ? m18936a.listFiles() : new File[0]));
            cr1.m25062r(activity, m10890d);
            String string = activity.getString(R.string.saved_viz_in);
            qv1.m12077g0(2, activity, string, Uri.parse(m10890d), cr1.m25073g(m10890d), "text/plain");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(m10890d), "text/plain");
            PendingIntent activity2 = PendingIntent.getActivity(activity, 0, intent, 67108864);
            dt0.C1136d c1136d = new dt0.C1136d(activity);
            c1136d.m23969i(cr1.m25073g(m10890d)).m23970h(string).m23964n(R.drawable.ic_save5).m23971g(activity2).m23966l(true).m23973e(true);
            ((NotificationManager) activity.getSystemService("notification")).notify(2, c1136d.m23976b());
            C3385vy.f30703a.m12018a(string);
        }
    }

    /* renamed from: com.daaw.rv1$b */
    /* loaded from: classes.dex */
    public class C2891b implements rw1.InterfaceC2894a<iv1, List<Integer>> {
        public C2891b() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(iv1 iv1Var, List<Integer> list) {
            if (iv1Var == null) {
                return;
            }
            rv1.this.f25640b = new WeakReference<>(list);
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            iv1Var.startActivityForResult(Intent.createChooser(intent, iv1Var.getResources().getString(R.string.vis_action_loadFromFile_title)), 64);
        }
    }

    /* renamed from: com.daaw.rv1$c */
    /* loaded from: classes.dex */
    public class C2892c implements sw1.InterfaceC2987a<iv1, Integer, Intent> {
        public C2892c() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(iv1 iv1Var, Integer num, Intent intent) {
            List<Integer> list = rv1.this.f25640b.get();
            if (list == null) {
                return;
            }
            Activity activity = iv1Var.getActivity();
            if (num.intValue() == 64) {
                if (intent == null) {
                    lz1.m16363c("PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data");
                    return;
                }
                rv1.this.m10884j(activity, intent.getData(), list);
            }
        }
    }

    public rv1() {
        iv1.f14027D.m10861b(new C2890a(), this.f16736a);
        iv1.f14028E.m10861b(new C2891b(), this.f16736a);
        iv1.f14031x.m9794b(new C2892c(), this.f16736a);
    }

    /* renamed from: a */
    public static int m10893a(Context context, Uri uri) {
        return m10883k(context, uri, SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18911o());
    }

    /* renamed from: b */
    public static boolean m10892b(ContentResolver contentResolver, Uri uri) {
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

    /* renamed from: c */
    public static void m10891c(int i) {
        File m18936a;
        File[] listFiles;
        if (i >= 0 && (m18936a = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18936a(i)) != null) {
            String str = null;
            File file = null;
            File file2 = null;
            for (File file3 : m18936a.listFiles()) {
                if (".json".equals(cr1.m25069k(file3.getName()))) {
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
                    str = cr1.m25064p(fileInputStream);
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
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18940W(i, C3355vn.m7013g(str), false);
        }
    }

    /* renamed from: g */
    public static void m10887g(File file, ZipOutputStream zipOutputStream) {
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

    /* renamed from: h */
    public static void m10886h(String str, String str2, ZipOutputStream zipOutputStream) {
        zipOutputStream.putNextEntry(new ZipEntry(str2));
        zipOutputStream.write(str.getBytes());
        zipOutputStream.closeEntry();
    }

    /* renamed from: k */
    public static int m10883k(Context context, Uri uri, List<Integer> list) {
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
            i = pv1.m13107J(C3355vn.m7013g(""), list, -1);
        } catch (FileNotFoundException | IOException unused) {
        }
        if (i < 0) {
            return -1;
        }
        try {
            File m18936a = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18936a(i);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(m18936a, nextEntry.getName()));
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
            m10891c(i);
            return i;
        }
        m10891c(i);
        return i;
    }

    /* renamed from: d */
    public final String m10890d(Context context, String str, String str2, String str3, String str4, List<File> list) {
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
            file = m10885i(context, str, sb.toString());
            if (file != null && !file.exists()) {
                break;
            }
            i++;
        }
        if (file != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                m10886h(str4, "scene.json", zipOutputStream);
                for (File file2 : list) {
                    if (!"scene.json".equals(file2.getName())) {
                        m10887g(file2, zipOutputStream);
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

    /* renamed from: i */
    public final File m10885i(Context context, String str, String str2) {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(str), cr1.m25066n(str2));
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

    /* renamed from: j */
    public final void m10884j(Context context, Uri uri, List<Integer> list) {
        String path = uri.getPath();
        int lastIndexOf = path.lastIndexOf(".txt");
        int lastIndexOf2 = path.lastIndexOf(".json");
        int max = Math.max(lastIndexOf, Math.max(lastIndexOf2, Math.max(path.lastIndexOf(".zip"), path.lastIndexOf(".viz"))));
        boolean z = false;
        if ((max == lastIndexOf || max == lastIndexOf2) && max != -1) {
            z = true;
        }
        if (z) {
            m10882l(context, uri, list);
        } else {
            m10883k(context, uri, list);
        }
    }

    /* renamed from: l */
    public final void m10882l(Context context, Uri uri, List<Integer> list) {
        if (uri == null) {
            return;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            String m25064p = cr1.m25064p(openInputStream);
            if (m25064p == null) {
                return;
            }
            pv1.m13107J(C3355vn.m7013g(m25064p), list, -1);
            openInputStream.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }
}

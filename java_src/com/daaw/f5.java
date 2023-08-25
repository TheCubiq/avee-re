package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.util.Xml;
import com.daaw.f5;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes.dex */
public class f5 {

    /* loaded from: classes.dex */
    public static class a implements Executor {
        public final Object p = new Object();
        public final Queue<Runnable> q = new ArrayDeque();
        public final Executor r;
        public Runnable s;

        public a(Executor executor) {
            this.r = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        public void c() {
            synchronized (this.p) {
                Runnable poll = this.q.poll();
                this.s = poll;
                if (poll != null) {
                    this.r.execute(poll);
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.p) {
                this.q.add(new Runnable() { // from class: com.daaw.e5
                    @Override // java.lang.Runnable
                    public final void run() {
                        f5.a.this.b(runnable);
                    }
                });
                if (this.s == null) {
                    c();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Storing App Locales : app-locales: ");
                    sb.append(str);
                    sb.append(" persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Exception unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Storing App Locales : Failed to persist app-locales: ");
                    sb2.append(str);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r2 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r8) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L67
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
        L15:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            r6 = 1
            if (r5 == r6) goto L3e
            r6 = 3
            if (r5 != r6) goto L25
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            if (r7 <= r4) goto L3e
        L25:
            if (r5 == r6) goto L15
            r6 = 4
            if (r5 != r6) goto L2b
            goto L15
        L2b:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            if (r5 == 0) goto L15
            r4 = 0
            java.lang.String r5 = "application_locales"
            java.lang.String r1 = r3.getAttributeValue(r4, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
        L3e:
            if (r2 == 0) goto L50
        L40:
            r2.close()     // Catch: java.io.IOException -> L44
            goto L50
        L44:
            goto L50
        L46:
            r8 = move-exception
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L4c
        L4c:
            throw r8
        L4d:
            if (r2 == 0) goto L50
            goto L40
        L50:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L64
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r8.append(r0)
            r8.append(r1)
            goto L67
        L64:
            r8.deleteFile(r0)
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.f5.b(android.content.Context):java.lang.String");
    }

    public static void c(Context context) {
        ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
        if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
            z3.N(context);
            if (z3.o().f()) {
                z3.O(rk0.c(b(context)));
            }
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        }
    }
}

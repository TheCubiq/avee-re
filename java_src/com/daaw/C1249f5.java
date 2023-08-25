package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.util.Xml;
import com.daaw.C1249f5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* renamed from: com.daaw.f5 */
/* loaded from: classes.dex */
public class C1249f5 {

    /* renamed from: com.daaw.f5$a */
    /* loaded from: classes.dex */
    public static class ExecutorC1250a implements Executor {

        /* renamed from: p */
        public final Object f9107p = new Object();

        /* renamed from: q */
        public final Queue<Runnable> f9108q = new ArrayDeque();

        /* renamed from: r */
        public final Executor f9109r;

        /* renamed from: s */
        public Runnable f9110s;

        public ExecutorC1250a(Executor executor) {
            this.f9109r = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22919b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                m22918c();
            }
        }

        /* renamed from: c */
        public void m22918c() {
            synchronized (this.f9107p) {
                Runnable poll = this.f9108q.poll();
                this.f9110s = poll;
                if (poll != null) {
                    this.f9109r.execute(poll);
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f9107p) {
                this.f9108q.add(new Runnable() { // from class: com.daaw.e5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1249f5.ExecutorC1250a.this.m22919b(runnable);
                    }
                });
                if (this.f9110s == null) {
                    m22918c();
                }
            }
        }
    }

    /* renamed from: com.daaw.f5$b */
    /* loaded from: classes.dex */
    public static class ExecutorC1251b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* renamed from: a */
    public static void m22923a(Context context, String str) {
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m22922b(Context context) {
        String str = "";
        try {
            FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int depth = newPullParser.getDepth();
                while (true) {
                    int next = newPullParser.next();
                    if (next == 1 || (next == 3 && newPullParser.getDepth() <= depth)) {
                        break;
                    } else if (next != 3 && next != 4 && newPullParser.getName().equals("locales")) {
                        break;
                    }
                }
            } catch (IOException | XmlPullParserException unused) {
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
        if (str.isEmpty()) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ");
            sb.append(str);
        }
        return str;
        return str;
    }

    /* renamed from: c */
    public static void m22921c(Context context) {
        ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
        if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
            AbstractC3800z3.m2945N(context);
            if (AbstractC3800z3.m2923o().m11222f()) {
                AbstractC3800z3.m2944O(rk0.m11225c(m22922b(context)));
            }
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        }
    }
}

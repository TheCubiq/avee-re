package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.C0232b;
import com.daaw.ty0;
import com.daaw.x20;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: androidx.emoji2.text.a */
/* loaded from: classes.dex */
public final class C0227a {

    /* renamed from: androidx.emoji2.text.a$a */
    /* loaded from: classes.dex */
    public static class C0228a {

        /* renamed from: a */
        public final C0229b f1274a;

        public C0228a(C0229b c0229b) {
            this.f1274a = c0229b == null ? m29583e() : c0229b;
        }

        /* renamed from: e */
        public static C0229b m29583e() {
            return Build.VERSION.SDK_INT >= 28 ? new C0231d() : new C0230c();
        }

        /* renamed from: a */
        public final C0232b.AbstractC0236c m29587a(Context context, x20 x20Var) {
            if (x20Var == null) {
                return null;
            }
            return new C0247d(context, x20Var);
        }

        /* renamed from: b */
        public final List<List<byte[]>> m29586b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: c */
        public C0232b.AbstractC0236c m29585c(Context context) {
            return m29587a(context, m29580h(context));
        }

        /* renamed from: d */
        public final x20 m29584d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new x20(str, str2, "emojicompat-emoji-font", m29586b(this.f1274a.mo29577b(packageManager, str2)));
        }

        /* renamed from: f */
        public final boolean m29582f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* renamed from: g */
        public final ProviderInfo m29581g(PackageManager packageManager) {
            for (ResolveInfo resolveInfo : this.f1274a.mo29578c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo mo29579a = this.f1274a.mo29579a(resolveInfo);
                if (m29582f(mo29579a)) {
                    return mo29579a;
                }
            }
            return null;
        }

        /* renamed from: h */
        public x20 m29580h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            ty0.m8698g(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo m29581g = m29581g(packageManager);
            if (m29581g == null) {
                return null;
            }
            try {
                return m29584d(m29581g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.a$b */
    /* loaded from: classes.dex */
    public static class C0229b {
        /* renamed from: a */
        public ProviderInfo mo29579a(ResolveInfo resolveInfo) {
            throw null;
        }

        /* renamed from: b */
        public Signature[] mo29577b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo29578c(PackageManager packageManager, Intent intent, int i) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.a$c */
    /* loaded from: classes.dex */
    public static class C0230c extends C0229b {
        @Override // androidx.emoji2.text.C0227a.C0229b
        /* renamed from: a */
        public ProviderInfo mo29579a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.C0227a.C0229b
        /* renamed from: c */
        public List<ResolveInfo> mo29578c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.a$d */
    /* loaded from: classes.dex */
    public static class C0231d extends C0230c {
        @Override // androidx.emoji2.text.C0227a.C0229b
        /* renamed from: b */
        public Signature[] mo29577b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C0247d m29588a(Context context) {
        return (C0247d) new C0228a(null).m29585c(context);
    }
}

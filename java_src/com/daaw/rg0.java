package com.daaw;

import android.content.Context;
import com.daaw.C3894zt;
import java.io.File;
/* loaded from: classes.dex */
public final class rg0 extends C3894zt {

    /* renamed from: com.daaw.rg0$a */
    /* loaded from: classes.dex */
    public class C2858a implements C3894zt.InterfaceC3895a {

        /* renamed from: a */
        public final /* synthetic */ Context f25250a;

        /* renamed from: b */
        public final /* synthetic */ String f25251b;

        public C2858a(Context context, String str) {
            this.f25250a = context;
            this.f25251b = str;
        }

        @Override // com.daaw.C3894zt.InterfaceC3895a
        /* renamed from: a */
        public File mo1921a() {
            File cacheDir = this.f25250a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f25251b != null ? new File(cacheDir, this.f25251b) : cacheDir;
        }
    }

    public rg0(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public rg0(Context context, String str, int i) {
        super(new C2858a(context, str), i);
    }
}

package com.daaw;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
public final class ky8 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ rs3 f16864a;

    /* renamed from: b */
    public final /* synthetic */ boolean f16865b;

    /* renamed from: c */
    public final /* synthetic */ zzac f16866c;

    public ky8(zzac zzacVar, rs3 rs3Var, boolean z) {
        this.f16866c = zzacVar;
        this.f16864a = rs3Var;
        this.f16865b = z;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri m1277D3;
        op6 op6Var;
        String uri;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f16864a.mo4545x0(arrayList);
            z = this.f16866c.f36480D;
            if (z || this.f16865b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri2 = (Uri) it.next();
                    if (this.f16866c.m1245v3(uri2)) {
                        str = this.f16866c.f36489M;
                        m1277D3 = zzac.m1277D3(uri2, str, "1");
                        op6Var = this.f16866c.f36479C;
                        uri = m1277D3.toString();
                    } else {
                        if (((Boolean) zzba.zzc().m23658b(g93.f10548S6)).booleanValue()) {
                            op6Var = this.f16866c.f36479C;
                            uri = uri2.toString();
                        }
                    }
                    op6Var.m14098c(uri, null);
                }
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        try {
            rs3 rs3Var = this.f16864a;
            String message = th.getMessage();
            rs3Var.mo4546a("Internal error: " + message);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}

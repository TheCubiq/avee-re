package com.daaw;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import java.util.List;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
public final class sz8 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ rs3 f26825a;

    /* renamed from: b */
    public final /* synthetic */ boolean f26826b;

    /* renamed from: c */
    public final /* synthetic */ zzac f26827c;

    public sz8(zzac zzacVar, rs3 rs3Var, boolean z) {
        this.f26827c = zzacVar;
        this.f26825a = rs3Var;
        this.f26826b = z;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri m1277D3;
        op6 op6Var;
        String uri;
        List<Uri> list = (List) obj;
        try {
            zzac.m1255l3(this.f26827c, list);
            this.f26825a.mo4545x0(list);
            z = this.f26827c.f36481E;
            if (z || this.f26826b) {
                for (Uri uri2 : list) {
                    if (this.f26827c.m1246u3(uri2)) {
                        str = this.f26827c.f36489M;
                        m1277D3 = zzac.m1277D3(uri2, str, "1");
                        op6Var = this.f26827c.f36479C;
                        uri = m1277D3.toString();
                    } else {
                        if (((Boolean) zzba.zzc().m23658b(g93.f10548S6)).booleanValue()) {
                            op6Var = this.f26827c.f36479C;
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
            rs3 rs3Var = this.f26825a;
            String message = th.getMessage();
            rs3Var.mo4546a("Internal error: " + message);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}

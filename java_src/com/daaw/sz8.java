package com.daaw;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import java.util.List;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
public final class sz8 implements o67 {
    public final /* synthetic */ rs3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzac c;

    public sz8(zzac zzacVar, rs3 rs3Var, boolean z) {
        this.c = zzacVar;
        this.a = rs3Var;
        this.b = z;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri D3;
        op6 op6Var;
        String uri;
        List<Uri> list = (List) obj;
        try {
            zzac.l3(this.c, list);
            this.a.x0(list);
            z = this.c.E;
            if (z || this.b) {
                for (Uri uri2 : list) {
                    if (this.c.u3(uri2)) {
                        str = this.c.M;
                        D3 = zzac.D3(uri2, str, "1");
                        op6Var = this.c.C;
                        uri = D3.toString();
                    } else {
                        if (((Boolean) zzba.zzc().b(g93.S6)).booleanValue()) {
                            op6Var = this.c.C;
                            uri = uri2.toString();
                        }
                    }
                    op6Var.c(uri, null);
                }
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        try {
            rs3 rs3Var = this.a;
            String message = th.getMessage();
            rs3Var.a("Internal error: " + message);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}

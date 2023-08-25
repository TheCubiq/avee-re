package com.daaw;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class gp5 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ boolean f11557a;

    /* renamed from: b */
    public final /* synthetic */ hp5 f11558b;

    public gp5(hp5 hp5Var, boolean z) {
        this.f11558b = hp5Var;
        this.f11557a = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // com.daaw.o67
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        List<String> emptyList;
        List asList;
        char c;
        Bundle bundle = (Bundle) obj;
        if (this.f11558b.m19529a()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else if (!(obj2 instanceof String[])) {
            emptyList = Collections.emptyList();
            final ArrayList arrayList = new ArrayList();
            for (String str : emptyList) {
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? y43.AD_FORMAT_TYPE_UNSPECIFIED : y43.REWARD_BASED_VIDEO_AD : y43.NATIVE_APP_INSTALL : y43.INTERSTITIAL : y43.BANNER);
            }
            final x63 m20544c = hp5.m20544c(this.f11558b, bundle);
            final o63 m20545b = hp5.m20545b(this.f11558b, bundle);
            so5 so5Var = this.f11558b.f13910b;
            final boolean z = this.f11557a;
            so5Var.m10115a(new em6() { // from class: com.daaw.fp5
                @Override // com.daaw.em6
                public final Object zza(Object obj3) {
                    zo5 zo5Var;
                    gp5 gp5Var = gp5.this;
                    boolean z2 = z;
                    ArrayList arrayList2 = arrayList;
                    o63 o63Var = m20545b;
                    x63 x63Var = m20544c;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (gp5Var.f11558b.m19529a()) {
                        return null;
                    }
                    byte[] m20541f = hp5.m20541f(gp5Var.f11558b, z2, arrayList2, o63Var, x63Var);
                    kp5.m17539g(sQLiteDatabase, z2, true);
                    zo5Var = gp5Var.f11558b.f12773f;
                    kp5.m17542d(sQLiteDatabase, zo5Var.m2036d(), m20541f);
                    return null;
                }
            });
        } else {
            asList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r0.hasNext()) {
        }
        final x63 m20544c2 = hp5.m20544c(this.f11558b, bundle);
        final o63 m20545b2 = hp5.m20545b(this.f11558b, bundle);
        so5 so5Var2 = this.f11558b.f13910b;
        final boolean z2 = this.f11557a;
        so5Var2.m10115a(new em6() { // from class: com.daaw.fp5
            @Override // com.daaw.em6
            public final Object zza(Object obj32) {
                zo5 zo5Var;
                gp5 gp5Var = gp5.this;
                boolean z22 = z2;
                ArrayList arrayList22 = arrayList3;
                o63 o63Var = m20545b2;
                x63 x63Var = m20544c2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (gp5Var.f11558b.m19529a()) {
                    return null;
                }
                byte[] m20541f = hp5.m20541f(gp5Var.f11558b, z22, arrayList22, o63Var, x63Var);
                kp5.m17539g(sQLiteDatabase, z22, true);
                zo5Var = gp5Var.f11558b.f12773f;
                kp5.m17542d(sQLiteDatabase, zo5Var.m2036d(), m20541f);
                return null;
            }
        });
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        k04.zzg("Failed to get signals bundle");
    }
}

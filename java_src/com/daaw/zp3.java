package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C3985R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class zp3 extends hq3 {

    /* renamed from: c */
    public final Map f35372c;

    /* renamed from: d */
    public final Context f35373d;

    /* renamed from: e */
    public final String f35374e;

    /* renamed from: f */
    public final long f35375f;

    /* renamed from: g */
    public final long f35376g;

    /* renamed from: h */
    public final String f35377h;

    /* renamed from: i */
    public final String f35378i;

    public zp3(a74 a74Var, Map map) {
        super(a74Var, "createCalendarEvent");
        this.f35372c = map;
        this.f35373d = a74Var.zzk();
        this.f35374e = m2006l("description");
        this.f35377h = m2006l("summary");
        this.f35375f = m2007k("start_ticks");
        this.f35376g = m2007k("end_ticks");
        this.f35378i = m2006l("location");
    }

    /* renamed from: i */
    public final Intent m2009i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f35374e);
        data.putExtra("eventLocation", this.f35378i);
        data.putExtra("description", this.f35377h);
        long j = this.f35375f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f35376g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: j */
    public final void m2008j() {
        if (this.f35373d == null) {
            m20488c("Activity context is not available.");
            return;
        }
        zzt.zzp();
        if (!new m83(this.f35373d).m16167b()) {
            m20488c("This feature is not available on the device.");
            return;
        }
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(this.f35373d);
        Resources m11919d = zzt.zzo().m11919d();
        zzG.setTitle(m11919d != null ? m11919d.getString(C3985R.string.s5) : "Create calendar event");
        zzG.setMessage(m11919d != null ? m11919d.getString(C3985R.string.s6) : "Allow Ad to create a calendar event?");
        zzG.setPositiveButton(m11919d != null ? m11919d.getString(C3985R.string.s3) : "Accept", new xp3(this));
        zzG.setNegativeButton(m11919d != null ? m11919d.getString(C3985R.string.s4) : "Decline", new yp3(this));
        zzG.create().show();
    }

    /* renamed from: k */
    public final long m2007k(String str) {
        String str2 = (String) this.f35372c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: l */
    public final String m2006l(String str) {
        return TextUtils.isEmpty((CharSequence) this.f35372c.get(str)) ? "" : (String) this.f35372c.get(str);
    }
}

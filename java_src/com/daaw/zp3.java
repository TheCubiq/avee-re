package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class zp3 extends hq3 {
    public final Map c;
    public final Context d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;

    public zp3(a74 a74Var, Map map) {
        super(a74Var, "createCalendarEvent");
        this.c = map;
        this.d = a74Var.zzk();
        this.e = l("description");
        this.h = l("summary");
        this.f = k("start_ticks");
        this.g = k("end_ticks");
        this.i = l("location");
    }

    public final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.e);
        data.putExtra("eventLocation", this.i);
        data.putExtra("description", this.h);
        long j = this.f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() {
        if (this.d == null) {
            c("Activity context is not available.");
            return;
        }
        zzt.zzp();
        if (!new m83(this.d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(this.d);
        Resources d = zzt.zzo().d();
        zzG.setTitle(d != null ? d.getString(R.string.s5) : "Create calendar event");
        zzG.setMessage(d != null ? d.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzG.setPositiveButton(d != null ? d.getString(R.string.s3) : "Accept", new xp3(this));
        zzG.setNegativeButton(d != null ? d.getString(R.string.s4) : "Decline", new yp3(this));
        zzG.create().show();
    }

    public final long k(String str) {
        String str2 = (String) this.c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final String l(String str) {
        return TextUtils.isEmpty((CharSequence) this.c.get(str)) ? "" : (String) this.c.get(str);
    }
}

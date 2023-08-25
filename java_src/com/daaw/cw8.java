package com.daaw;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class cw8 {

    /* renamed from: a */
    public it6 f6231a;

    /* renamed from: b */
    public Long f6232b;

    /* renamed from: c */
    public long f6233c;

    /* renamed from: d */
    public final /* synthetic */ u32 f6234d;

    public /* synthetic */ cw8(u32 u32Var, yu8 yu8Var) {
        this.f6234d = u32Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
        if (r14 == null) goto L64;
     */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01df: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:66:0x01df */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final it6 m24941a(String str, it6 it6Var) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Pair pair;
        Object obj;
        String m19362K = it6Var.m19362K();
        List m19361L = it6Var.m19361L();
        this.f6234d.f19771b.m3898g0();
        Long l = (Long) ec8.m23585n(it6Var, "_eid");
        if (l != null) {
            if (m19362K.equals("_ep")) {
                ry0.m10830j(l);
                this.f6234d.f19771b.m3898g0();
                String str2 = (String) ec8.m23585n(it6Var, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.f6234d.f25143a.mo3895i().m14158t().m20652b("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.f6231a == null || this.f6232b == null || l.longValue() != this.f6232b.longValue()) {
                    uh2 m3915W = this.f6234d.f19771b.m3915W();
                    m3915W.mo6991f();
                    m3915W.m13533g();
                    try {
                        try {
                            cursor2 = m3915W.m8168P().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursor2.moveToFirst()) {
                                    try {
                                        pair = Pair.create((it6) ((fs6) ec8.m23601C(it6.m19365H(), cursor2.getBlob(0))).m3975m(), Long.valueOf(cursor2.getLong(1)));
                                        cursor2.close();
                                    } catch (IOException e) {
                                        m3915W.f25143a.mo3895i().m14160q().m20650d("Failed to merge main event. appId, eventId", om5.m14152z(str), l, e);
                                        cursor2.close();
                                        pair = null;
                                        if (pair != null) {
                                        }
                                        this.f6234d.f25143a.mo3895i().m14158t().m20651c("Extra parameter without existing main event. eventName, eventId", str2, l);
                                        return null;
                                    }
                                } else {
                                    m3915W.f25143a.mo3895i().m14156v().m20653a("Main event not found");
                                    cursor2.close();
                                    pair = null;
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                m3915W.f25143a.mo3895i().m14160q().m20652b("Error selecting main event", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                    if (pair != null || (obj = pair.first) == null) {
                        this.f6234d.f25143a.mo3895i().m14158t().m20651c("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                    this.f6231a = (it6) obj;
                    this.f6233c = ((Long) pair.second).longValue();
                    this.f6234d.f19771b.m3898g0();
                    this.f6232b = (Long) ec8.m23585n(this.f6231a, "_eid");
                }
                long j = this.f6233c - 1;
                this.f6233c = j;
                if (j <= 0) {
                    uh2 m3915W2 = this.f6234d.f19771b.m3915W();
                    m3915W2.mo6991f();
                    m3915W2.f25143a.mo3895i().m14156v().m20652b("Clearing complex main event info. appId", str);
                    try {
                        m3915W2.m8168P().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        m3915W2.f25143a.mo3895i().m14160q().m20652b("Error clearing complex main event", e4);
                    }
                } else {
                    this.f6234d.f19771b.m3915W().m8139v(str, l, this.f6233c, this.f6231a);
                }
                ArrayList arrayList = new ArrayList();
                for (ix6 ix6Var : this.f6231a.m19361L()) {
                    this.f6234d.f19771b.m3898g0();
                    if (ec8.m23586m(it6Var, ix6Var.m19286J()) == null) {
                        arrayList.add(ix6Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f6234d.f25143a.mo3895i().m14158t().m20652b("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(m19361L);
                    m19361L = arrayList;
                }
                m19362K = str2;
            } else {
                this.f6232b = l;
                this.f6231a = it6Var;
                this.f6234d.f19771b.m3898g0();
                Object m23585n = ec8.m23585n(it6Var, "_epc");
                long longValue = ((Long) (m23585n != null ? m23585n : 0L)).longValue();
                this.f6233c = longValue;
                if (longValue <= 0) {
                    this.f6234d.f25143a.mo3895i().m14158t().m20652b("Complex event with zero extra param count. eventName", m19362K);
                } else {
                    this.f6234d.f19771b.m3915W().m8139v(str, (Long) ry0.m10830j(l), this.f6233c, it6Var);
                }
            }
        }
        fs6 fs6Var = (fs6) it6Var.m18675A();
        fs6Var.m22336A(m19362K);
        fs6Var.m22321y();
        fs6Var.m22324v(m19361L);
        return (it6) fs6Var.m3975m();
    }
}

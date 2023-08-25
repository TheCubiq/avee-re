package com.daaw;
/* loaded from: classes2.dex */
public final class vk8 implements tk8 {

    /* renamed from: a */
    public static final j38 f30291a;

    /* renamed from: b */
    public static final j38 f30292b;

    /* renamed from: c */
    public static final j38 f30293c;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11828a();
        f30291a = m11828a.m11823f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f30292b = m11828a.m11823f("measurement.client.sessions.check_on_startup", true);
        f30293c = m11828a.m11823f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.daaw.tk8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.tk8
    public final boolean zzb() {
        return ((Boolean) f30291a.m19095b()).booleanValue();
    }
}

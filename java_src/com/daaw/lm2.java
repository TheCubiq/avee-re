package com.daaw;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class lm2 extends ud7 {

    /* renamed from: c */
    public long f17534c;

    /* renamed from: d */
    public String f17535d;

    /* renamed from: e */
    public AccountManager f17536e;

    /* renamed from: f */
    public Boolean f17537f;

    /* renamed from: g */
    public long f17538g;

    public lm2(dr6 dr6Var) {
        super(dr6Var);
    }

    @Override // com.daaw.ud7
    /* renamed from: h */
    public final boolean mo6990h() {
        Calendar calendar = Calendar.getInstance();
        this.f17534c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f17535d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* renamed from: n */
    public final long m16726n() {
        mo6991f();
        return this.f17538g;
    }

    /* renamed from: o */
    public final long m16725o() {
        m8310j();
        return this.f17534c;
    }

    /* renamed from: p */
    public final String m16724p() {
        m8310j();
        return this.f17535d;
    }

    /* renamed from: q */
    public final void m16723q() {
        mo6991f();
        this.f17537f = null;
        this.f17538g = 0L;
    }

    /* renamed from: s */
    public final boolean m16722s() {
        mo6991f();
        long mo15860a = this.f25143a.mo3909b().mo15860a();
        if (mo15860a - this.f17538g > 86400000) {
            this.f17537f = null;
        }
        Boolean bool = this.f17537f;
        if (bool == null) {
            if (C3866zk.m2182a(this.f25143a.mo3905d(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f25143a.mo3895i().m14153y().m20653a("Permission error checking for dasher/unicorn accounts");
            } else {
                if (this.f17536e == null) {
                    this.f17536e = AccountManager.get(this.f25143a.mo3905d());
                }
                try {
                    Account[] result = this.f17536e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                    if (result != null && result.length > 0) {
                        this.f17537f = Boolean.TRUE;
                        this.f17538g = mo15860a;
                        return true;
                    }
                    Account[] result2 = this.f17536e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f17537f = Boolean.TRUE;
                        this.f17538g = mo15860a;
                        return true;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                    this.f25143a.mo3895i().m14158t().m20652b("Exception checking account types", e);
                }
            }
            this.f17538g = mo15860a;
            this.f17537f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}

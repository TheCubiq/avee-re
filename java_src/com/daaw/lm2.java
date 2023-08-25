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
    public long c;
    public String d;
    public AccountManager e;
    public Boolean f;
    public long g;

    public lm2(dr6 dr6Var) {
        super(dr6Var);
    }

    @Override // com.daaw.ud7
    public final boolean h() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = lowerCase + "-" + lowerCase2;
        return false;
    }

    public final long n() {
        f();
        return this.g;
    }

    public final long o() {
        j();
        return this.c;
    }

    public final String p() {
        j();
        return this.d;
    }

    public final void q() {
        f();
        this.f = null;
        this.g = 0L;
    }

    public final boolean s() {
        f();
        long a = this.a.b().a();
        if (a - this.g > 86400000) {
            this.f = null;
        }
        Boolean bool = this.f;
        if (bool == null) {
            if (zk.a(this.a.d(), "android.permission.GET_ACCOUNTS") != 0) {
                this.a.i().y().a("Permission error checking for dasher/unicorn accounts");
            } else {
                if (this.e == null) {
                    this.e = AccountManager.get(this.a.d());
                }
                try {
                    Account[] result = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                    if (result != null && result.length > 0) {
                        this.f = Boolean.TRUE;
                        this.g = a;
                        return true;
                    }
                    Account[] result2 = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f = Boolean.TRUE;
                        this.g = a;
                        return true;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                    this.a.i().t().b("Exception checking account types", e);
                }
            }
            this.g = a;
            this.f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}

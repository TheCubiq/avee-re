package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.hr3;
import com.daaw.k04;
import com.daaw.nt0;
import com.google.android.gms.ads.internal.client.zzay;
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public hr3 p;

    public final void a() {
        hr3 hr3Var = this.p;
        if (hr3Var != null) {
            try {
                hr3Var.zzv();
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzg(i, i2, intent);
            }
        } catch (Exception e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                if (!hr3Var.zzE()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            hr3 hr3Var2 = this.p;
            if (hr3Var2 != null) {
                hr3Var2.zzh();
            }
        } catch (RemoteException e2) {
            k04.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzj(nt0.g3(configuration));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hr3 zzo = zzay.zza().zzo(this);
        this.p = zzo;
        if (zzo != null) {
            try {
                zzo.zzk(bundle);
                return;
            } catch (RemoteException e) {
                e = e;
            }
        } else {
            e = null;
        }
        k04.zzl("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzl();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzn();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzo();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzp();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzq(bundle);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzr();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzs();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            hr3 hr3Var = this.p;
            if (hr3Var != null) {
                hr3Var.zzt();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}

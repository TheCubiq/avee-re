package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public interface zzpw extends IInterface {
    double getScale() throws RemoteException;

    Uri getUri() throws RemoteException;

    IObjectWrapper zzjy() throws RemoteException;
}

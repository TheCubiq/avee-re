package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* loaded from: classes2.dex */
public interface zzqs extends IInterface {
    void destroy() throws RemoteException;

    List<String> getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    zzlo getVideoController() throws RemoteException;

    void performClick(String str) throws RemoteException;

    void recordImpression() throws RemoteException;

    String zzao(String str) throws RemoteException;

    zzpw zzap(String str) throws RemoteException;

    boolean zzh(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzka() throws RemoteException;

    IObjectWrapper zzkh() throws RemoteException;
}

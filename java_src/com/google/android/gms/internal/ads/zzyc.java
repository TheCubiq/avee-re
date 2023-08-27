package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* loaded from: classes2.dex */
public interface zzyc extends IInterface {
    String getAdvertiser() throws RemoteException;

    String getBody() throws RemoteException;

    String getCallToAction() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getHeadline() throws RemoteException;

    List getImages() throws RemoteException;

    boolean getOverrideClickHandling() throws RemoteException;

    boolean getOverrideImpressionRecording() throws RemoteException;

    zzlo getVideoController() throws RemoteException;

    void recordImpression() throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzke() throws RemoteException;

    zzps zzkf() throws RemoteException;

    zzpw zzkg() throws RemoteException;

    void zzl(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzmv() throws RemoteException;

    IObjectWrapper zzmw() throws RemoteException;
}

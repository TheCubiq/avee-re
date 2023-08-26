package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public interface zzlo extends IInterface {
    float getAspectRatio() throws RemoteException;

    int getPlaybackState() throws RemoteException;

    boolean isClickToExpandEnabled() throws RemoteException;

    boolean isCustomControlsEnabled() throws RemoteException;

    boolean isMuted() throws RemoteException;

    void mute(boolean z) throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void zza(zzlr zzlrVar) throws RemoteException;

    float zzim() throws RemoteException;

    float zzin() throws RemoteException;

    zzlr zzio() throws RemoteException;
}

.class public abstract Lcom/google/android/gms/internal/ads/zzrs;
.super Lcom/google/android/gms/internal/ads/zzek;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzrr;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzek;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final dispatchTransaction(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->cancelUnconfirmedClick()V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string p2, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/ads/zzro;

    if-eqz p4, :cond_1

    move-object p1, p2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzro;

    goto :goto_0

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/ads/zzrq;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzrq;-><init>(Landroid/os/IBinder;)V

    move-object p1, p2

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzrs;->zza(Lcom/google/android/gms/internal/ads/zzro;)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/zzel;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto/16 :goto_4

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object p1

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->zzka()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object p1

    goto :goto_2

    :pswitch_5
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzel;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzrs;->reportTouchEvent(Landroid/os/Bundle;)V

    goto :goto_1

    :pswitch_6
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzel;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzrs;->recordImpression(Landroid/os/Bundle;)Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/zzel;->zza(Landroid/os/Parcel;Z)V

    goto/16 :goto_4

    :pswitch_7
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzel;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzrs;->performClick(Landroid/os/Bundle;)V

    goto :goto_1

    :pswitch_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->zzkf()Lcom/google/android/gms/internal/ads/zzps;

    move-result-object p1

    goto :goto_2

    :pswitch_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->destroy()V

    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_4

    :pswitch_a
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :pswitch_b
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object p1

    goto :goto_2

    :pswitch_c
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getPrice()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :pswitch_d
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getStore()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :pswitch_e
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getStarRating()D

    move-result-wide p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1, p2}, Landroid/os/Parcel;->writeDouble(D)V

    goto :goto_4

    :pswitch_f
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getAdvertiser()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :pswitch_10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getCallToAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :pswitch_11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->zzjz()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object p1

    :goto_2
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/zzel;->zza(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto :goto_4

    :pswitch_12
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getBody()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :pswitch_13
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getImages()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    goto :goto_4

    :pswitch_14
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrs;->getHeadline()Ljava/lang/String;

    move-result-object p1

    :goto_3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_4
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

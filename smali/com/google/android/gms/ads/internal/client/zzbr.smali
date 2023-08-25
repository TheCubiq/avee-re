.class public final Lcom/google/android/gms/ads/internal/client/zzbr;
.super Lcom/daaw/bp2;
.source ""


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator"

    invoke-direct {p0, p1, v0}, Lcom/daaw/bp2;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final zze(Lcom/daaw/yd0;Ljava/lang/String;Lcom/daaw/an3;I)Landroid/os/IBinder;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/bp2;->D()Landroid/os/Parcel;

    move-result-object p4

    invoke-static {p4, p1}, Lcom/daaw/dp2;->g(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {p4, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {p4, p3}, Lcom/daaw/dp2;->g(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const p1, 0xd601280

    invoke-virtual {p4, p1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p4}, Lcom/daaw/bp2;->I(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method

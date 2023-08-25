.class public final Lcom/daaw/so3;
.super Lcom/daaw/bp2;
.source ""

# interfaces
.implements Lcom/daaw/uo3;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"

    invoke-direct {p0, p1, v0}, Lcom/daaw/bp2;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bp2;->D()Landroid/os/Parcel;

    move-result-object p1

    const-string v0, "Adapter returned null."

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-virtual {p0, v0, p1}, Lcom/daaw/bp2;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bp2;->D()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/dp2;->e(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lcom/daaw/bp2;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final zzg()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/bp2;->D()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lcom/daaw/bp2;->M(ILandroid/os/Parcel;)V

    return-void
.end method

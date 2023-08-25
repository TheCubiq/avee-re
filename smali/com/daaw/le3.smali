.class public abstract Lcom/daaw/le3;
.super Lcom/daaw/cp2;
.source ""

# interfaces
.implements Lcom/daaw/me3;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener"

    invoke-direct {p0, v0}, Lcom/daaw/cp2;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static g3(Landroid/os/IBinder;)Lcom/daaw/me3;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/me3;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/me3;

    return-object v0

    :cond_1
    new-instance v0, Lcom/daaw/ke3;

    invoke-direct {v0, p0}, Lcom/daaw/ke3;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public final M(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2

    const/4 p4, 0x1

    if-ne p1, p4, :cond_2

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/ye3;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lcom/daaw/ye3;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/we3;

    invoke-direct {v0, p1}, Lcom/daaw/we3;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    invoke-static {p2}, Lcom/daaw/dp2;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/daaw/me3;->c2(Lcom/daaw/ye3;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return p4

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.class public final Lcom/daaw/er3;
.super Lcom/daaw/r31;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.AdOverlayCreatorImpl"

    invoke-direct {p0, v0}, Lcom/daaw/r31;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/kr3;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lcom/daaw/kr3;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/ir3;

    invoke-direct {v0, p1}, Lcom/daaw/ir3;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final c(Landroid/app/Activity;)Lcom/daaw/hr3;
    .locals 4

    const-string v0, "Could not create remote AdOverlay."

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v2

    invoke-virtual {p0, p1}, Lcom/daaw/r31;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/kr3;

    invoke-interface {p1, v2}, Lcom/daaw/kr3;->zze(Lcom/daaw/yd0;)Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay"

    invoke-interface {p1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v3, v2, Lcom/daaw/hr3;

    if-eqz v3, :cond_1

    check-cast v2, Lcom/daaw/hr3;

    :goto_0
    move-object v1, v2

    goto :goto_1

    :cond_1
    new-instance v2, Lcom/daaw/fr3;

    invoke-direct {v2, p1}, Lcom/daaw/fr3;-><init>(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/daaw/r31$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    return-object v1

    :catch_0
    move-exception p1

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :catch_1
    move-exception p1

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

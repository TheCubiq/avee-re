.class public final Lcom/daaw/iw3;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/an3;)Lcom/daaw/wv3;
    .locals 4

    invoke-static {p0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl"

    sget-object v3, Lcom/daaw/hw3;->a:Lcom/daaw/hw3;

    invoke-static {p0, v2, v3}, Lcom/daaw/o04;->b(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m04;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/aw3;

    const v2, 0xd601280

    invoke-virtual {p0, v0, p1, p2, v2}, Lcom/daaw/aw3;->zze(Lcom/daaw/yd0;Ljava/lang/String;Lcom/daaw/an3;I)Landroid/os/IBinder;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"

    invoke-interface {p0, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    instance-of p2, p1, Lcom/daaw/wv3;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/daaw/wv3;

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/daaw/uv3;

    invoke-direct {p1, p0}, Lcom/daaw/uv3;-><init>(Landroid/os/IBinder;)V
    :try_end_0
    .catch Lcom/daaw/n04; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    return-object v1

    :catch_0
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    :goto_2
    const-string p1, "#007 Could not call remote method."

    invoke-static {p1, p0}, Lcom/daaw/k04;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

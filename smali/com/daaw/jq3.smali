.class public final Lcom/daaw/jq3;
.super Lcom/google/android/gms/ads/nativead/NativeAd$AdChoicesInfo;
.source ""


# instance fields
.field public final a:Ljava/util/List;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/nc3;)V
    .locals 4

    const-string v0, ""

    invoke-direct {p0}, Lcom/google/android/gms/ads/nativead/NativeAd$AdChoicesInfo;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/daaw/jq3;->a:Ljava/util/List;

    :try_start_0
    invoke-interface {p1}, Lcom/daaw/nc3;->zzg()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/jq3;->b:Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v0, v1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v0, p0, Lcom/daaw/jq3;->b:Ljava/lang/String;

    :goto_0
    :try_start_1
    invoke-interface {p1}, Lcom/daaw/nc3;->zzh()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/os/IBinder;

    if-eqz v2, :cond_1

    check-cast v1, Landroid/os/IBinder;

    invoke-static {v1}, Lcom/daaw/uc3;->g3(Landroid/os/IBinder;)Lcom/daaw/vc3;

    move-result-object v1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/daaw/jq3;->a:Ljava/util/List;

    new-instance v3, Lcom/daaw/lq3;

    invoke-direct {v3, v1}, Lcom/daaw/lq3;-><init>(Lcom/daaw/vc3;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :cond_2
    return-void

    :catch_1
    move-exception p1

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/ads/nativead/NativeAd$Image;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/jq3;->a:Ljava/util/List;

    return-object v0
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jq3;->b:Ljava/lang/String;

    return-object v0
.end method

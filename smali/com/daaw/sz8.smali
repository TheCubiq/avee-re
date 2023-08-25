.class public final Lcom/daaw/sz8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/rs3;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;Lcom/daaw/rs3;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sz8;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    iput-object p2, p0, Lcom/daaw/sz8;->a:Lcom/daaw/rs3;

    iput-boolean p3, p0, Lcom/daaw/sz8;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    check-cast p1, Ljava/util/List;

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sz8;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v0, p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->l3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;Ljava/util/List;)V

    iget-object v0, p0, Lcom/daaw/sz8;->a:Lcom/daaw/rs3;

    invoke-interface {v0, p1}, Lcom/daaw/rs3;->x0(Ljava/util/List;)V

    iget-object v0, p0, Lcom/daaw/sz8;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v0}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->s3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/sz8;->b:Z

    if-eqz v0, :cond_3

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iget-object v1, p0, Lcom/daaw/sz8;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->u3(Landroid/net/Uri;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/sz8;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->R3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "1"

    invoke-static {v1, v0, v3, v4}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->G3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/sz8;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->N3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/op6;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0, v2}, Lcom/daaw/op6;->c(Ljava/lang/String;Lcom/daaw/to6;)V

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/daaw/g93;->S6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/sz8;->c:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->N3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/op6;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/sz8;->a:Lcom/daaw/rs3;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Internal error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/rs3;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.class public final Lcom/daaw/g16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/ya5;

.field public final c:Lcom/daaw/fg5;

.field public final d:Lcom/daaw/j16;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/ya5;Lcom/daaw/fg5;Lcom/daaw/j16;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g16;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/g16;->b:Lcom/daaw/ya5;

    iput-object p3, p0, Lcom/daaw/g16;->c:Lcom/daaw/fg5;

    iput-object p4, p0, Lcom/daaw/g16;->d:Lcom/daaw/j16;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/i16;
    .locals 7

    sget-object v0, Lcom/daaw/g93;->k1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_0
    iget-object v3, p0, Lcom/daaw/g16;->b:Lcom/daaw/ya5;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v3, v2, v4}, Lcom/daaw/ya5;->c(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/daaw/oj6;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/oj6;->c()Z

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
    :try_end_0
    .catch Lcom/daaw/wi6; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v3}, Lcom/daaw/oj6;->k()Lcom/google/android/gms/internal/ads/zzbye;

    move-result-object v5

    if-eqz v5, :cond_0

    const-string v6, "sdk_version"

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzbye;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/daaw/wi6; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_0
    :try_start_2
    invoke-virtual {v3}, Lcom/daaw/oj6;->j()Lcom/google/android/gms/internal/ads/zzbye;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v5, "adapter_version"

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbye;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v5, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/daaw/wi6; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_1
    :try_start_3
    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_3
    .catch Lcom/daaw/wi6; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    :catch_2
    nop

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/daaw/i16;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/i16;-><init>(Landroid/os/Bundle;Lcom/daaw/h16;)V

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 3

    sget-object v0, Lcom/daaw/g93;->k1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/hz6;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/g16;->d:Lcom/daaw/j16;

    invoke-virtual {v0}, Lcom/daaw/j16;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/g16;->c:Lcom/daaw/fg5;

    invoke-virtual {v0}, Lcom/daaw/fg5;->t()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/g16;->d:Lcom/daaw/j16;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/j16;->a(Z)V

    iget-object v0, p0, Lcom/daaw/g16;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/c16;

    invoke-direct {v1, p0}, Lcom/daaw/c16;-><init>(Lcom/daaw/g16;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Lcom/daaw/i16;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/i16;-><init>(Landroid/os/Bundle;Lcom/daaw/h16;)V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method

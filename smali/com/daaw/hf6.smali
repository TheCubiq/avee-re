.class public final Lcom/daaw/hf6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hf6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/hf6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/hf6;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/cf6;
    .locals 8

    iget-object v0, p0, Lcom/daaw/hf6;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/hf6;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bk6;

    iget-object v2, p0, Lcom/daaw/hf6;->c:Lcom/daaw/m08;

    invoke-interface {v2}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/vk6;

    sget-object v3, Lcom/daaw/g93;->M5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/ads/internal/util/zzg;->zzh()Lcom/daaw/kz3;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/ads/internal/util/zzg;->zzi()Lcom/daaw/kz3;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/daaw/kz3;->h()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v4, 0x1

    :cond_1
    sget-object v3, Lcom/daaw/g93;->O5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_3

    sget-object v3, Lcom/daaw/g93;->L5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    if-eqz v4, :cond_3

    :cond_2
    new-instance v3, Lcom/daaw/ae6;

    invoke-direct {v3}, Lcom/daaw/ae6;-><init>()V

    sget-object v4, Lcom/daaw/jk6;->p:Lcom/daaw/jk6;

    new-instance v5, Lcom/daaw/de6;

    invoke-direct {v5, v3}, Lcom/daaw/de6;-><init>(Lcom/daaw/cf6;)V

    invoke-virtual {v2, v4, v0, v1, v5}, Lcom/daaw/vk6;->a(Lcom/daaw/jk6;Landroid/content/Context;Lcom/daaw/bk6;Lcom/daaw/bl6;)Lcom/daaw/uk6;

    move-result-object v0

    new-instance v7, Lcom/daaw/fe6;

    new-instance v2, Lcom/daaw/pe6;

    new-instance v1, Lcom/daaw/oe6;

    invoke-direct {v1}, Lcom/daaw/oe6;-><init>()V

    invoke-direct {v2, v1}, Lcom/daaw/pe6;-><init>(Lcom/daaw/cf6;)V

    new-instance v3, Lcom/daaw/le6;

    iget-object v1, v0, Lcom/daaw/uk6;->a:Lcom/daaw/fk6;

    sget-object v6, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-direct {v3, v1, v6}, Lcom/daaw/le6;-><init>(Lcom/daaw/fk6;Ljava/util/concurrent/Executor;)V

    iget-object v4, v0, Lcom/daaw/uk6;->b:Lcom/daaw/dl6;

    iget-object v0, v0, Lcom/daaw/uk6;->a:Lcom/daaw/fk6;

    invoke-interface {v0}, Lcom/daaw/fk6;->zza()Lcom/google/android/gms/internal/ads/zzfkz;

    move-result-object v0

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzfkz;->w:Ljava/lang/String;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/daaw/fe6;-><init>(Lcom/daaw/cf6;Lcom/daaw/cf6;Lcom/daaw/dl6;Ljava/lang/String;Ljava/util/concurrent/Executor;)V

    goto :goto_1

    :cond_3
    new-instance v7, Lcom/daaw/oe6;

    invoke-direct {v7}, Lcom/daaw/oe6;-><init>()V

    :goto_1
    return-object v7
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/hf6;->a()Lcom/daaw/cf6;

    move-result-object v0

    return-object v0
.end method

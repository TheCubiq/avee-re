.class public final Lcom/daaw/fl5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/g77;

.field public final c:Lcom/daaw/dm5;

.field public final d:Lcom/daaw/qz7;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/g77;Lcom/daaw/dm5;Lcom/daaw/qz7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fl5;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/fl5;->b:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/fl5;->c:Lcom/daaw/dm5;

    iput-object p4, p0, Lcom/daaw/fl5;->d:Lcom/daaw/qz7;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/zzcbj;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/fl5;->c:Lcom/daaw/dm5;

    sget-object v1, Lcom/daaw/g93;->z9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/dm5;->c(Lcom/google/android/gms/internal/ads/zzcbj;J)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/zzcbj;ILcom/daaw/pk5;)Lcom/daaw/f77;
    .locals 0

    iget-object p3, p0, Lcom/daaw/fl5;->d:Lcom/daaw/qz7;

    invoke-interface {p3}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/mn5;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/mn5;->g3(Lcom/google/android/gms/internal/ads/zzcbj;I)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lcom/google/android/gms/internal/ads/zzcbj;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzcbj;->u:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzy(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/pk5;

    const/4 v1, 0x1

    const-string v2, "Ads service proxy force local"

    invoke-direct {v0, v1, v2}, Lcom/daaw/pk5;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/cl5;

    invoke-direct {v0, p0, p1}, Lcom/daaw/cl5;-><init>(Lcom/daaw/fl5;Lcom/google/android/gms/internal/ads/zzcbj;)V

    iget-object v1, p0, Lcom/daaw/fl5;->a:Lcom/daaw/g77;

    invoke-static {v0, v1}, Lcom/daaw/s67;->l(Lcom/daaw/v57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    const-class v1, Ljava/util/concurrent/ExecutionException;

    sget-object v2, Lcom/daaw/dl5;->a:Lcom/daaw/dl5;

    iget-object v3, p0, Lcom/daaw/fl5;->b:Lcom/daaw/g77;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    :goto_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    new-instance v2, Lcom/daaw/el5;

    invoke-direct {v2, p0, p1, v1}, Lcom/daaw/el5;-><init>(Lcom/daaw/fl5;Lcom/google/android/gms/internal/ads/zzcbj;I)V

    const-class p1, Lcom/daaw/pk5;

    iget-object v1, p0, Lcom/daaw/fl5;->b:Lcom/daaw/g77;

    invoke-static {v0, p1, v2, v1}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

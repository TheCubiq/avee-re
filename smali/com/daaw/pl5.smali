.class public final Lcom/daaw/pl5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/g77;

.field public final c:Lcom/daaw/gm5;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/g77;Lcom/daaw/gm5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pl5;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/pl5;->b:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/pl5;->c:Lcom/daaw/gm5;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/zzcbf;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/pl5;->c:Lcom/daaw/gm5;

    sget-object v1, Lcom/daaw/g93;->y9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/gm5;->c(Lcom/google/android/gms/internal/ads/zzcbf;J)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zzcbf;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzcbf;->q:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzy(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/daaw/pk5;

    const/4 v0, 0x1

    const-string v1, "Ads signal service force local"

    invoke-direct {p1, v0, v1}, Lcom/daaw/pk5;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/hl5;

    invoke-direct {v0, p0, p1}, Lcom/daaw/hl5;-><init>(Lcom/daaw/pl5;Lcom/google/android/gms/internal/ads/zzcbf;)V

    iget-object p1, p0, Lcom/daaw/pl5;->a:Lcom/daaw/g77;

    invoke-static {v0, p1}, Lcom/daaw/s67;->l(Lcom/daaw/v57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    const-class v0, Ljava/util/concurrent/ExecutionException;

    sget-object v1, Lcom/daaw/il5;->a:Lcom/daaw/il5;

    iget-object v2, p0, Lcom/daaw/pl5;->b:Lcom/daaw/g77;

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p1

    const-class v0, Lcom/daaw/pk5;

    sget-object v1, Lcom/daaw/nl5;->a:Lcom/daaw/nl5;

    iget-object v2, p0, Lcom/daaw/pl5;->b:Lcom/daaw/g77;

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    sget-object v0, Lcom/daaw/ol5;->a:Lcom/daaw/ol5;

    iget-object v1, p0, Lcom/daaw/pl5;->b:Lcom/daaw/g77;

    invoke-static {p1, v0, v1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

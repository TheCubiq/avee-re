.class public final Lcom/daaw/p96;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/qz3;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Lcom/daaw/g77;

.field public final e:Lcom/daaw/y23;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/y23;Lcom/daaw/qz3;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/g77;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p96;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/p96;->e:Lcom/daaw/y23;

    iput-object p3, p0, Lcom/daaw/p96;->a:Lcom/daaw/qz3;

    iput-object p4, p0, Lcom/daaw/p96;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p5, p0, Lcom/daaw/p96;->d:Lcom/daaw/g77;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Exception;)Lcom/daaw/q96;
    .locals 2

    iget-object v0, p0, Lcom/daaw/p96;->a:Lcom/daaw/qz3;

    const-string v1, "AppSetIdInfoGmscoreSignal"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/q96;

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-direct {p1, v0, v1}, Lcom/daaw/q96;-><init>(Ljava/lang/String;I)V

    return-object p1
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x2b

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 5

    sget-object v0, Lcom/daaw/g93;->p2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/daaw/g93;->u2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v1}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ov6;->a(Lcom/daaw/rj1;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/n96;->a:Lcom/daaw/n96;

    iget-object v2, p0, Lcom/daaw/p96;->d:Lcom/daaw/g77;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/pa3;->a:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/daaw/pa3;->b:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/p96;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v0

    :cond_0
    new-instance v1, Lcom/daaw/o96;

    invoke-direct {v1, p0}, Lcom/daaw/o96;-><init>(Lcom/daaw/p96;)V

    const-class v2, Ljava/lang/Exception;

    iget-object v3, p0, Lcom/daaw/p96;->d:Lcom/daaw/g77;

    invoke-static {v0, v2, v1, v3}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Lcom/daaw/q96;

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Lcom/daaw/q96;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/daaw/v96;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/qz3;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/lang/String;

.field public final f:Lcom/daaw/hz3;


# direct methods
.method public constructor <init>(Lcom/daaw/hz3;ILandroid/content/Context;Lcom/daaw/qz3;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Ljava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/v96;->f:Lcom/daaw/hz3;

    iput-object p3, p0, Lcom/daaw/v96;->a:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/v96;->b:Lcom/daaw/qz3;

    iput-object p5, p0, Lcom/daaw/v96;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Lcom/daaw/v96;->d:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lcom/daaw/v96;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Exception;)Lcom/daaw/w96;
    .locals 2

    iget-object v0, p0, Lcom/daaw/v96;->b:Lcom/daaw/qz3;

    const-string v1, "AttestationTokenSignal"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x2c

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 5

    new-instance v0, Lcom/daaw/s96;

    invoke-direct {v0, p0}, Lcom/daaw/s96;-><init>(Lcom/daaw/v96;)V

    iget-object v1, p0, Lcom/daaw/v96;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lcom/daaw/s67;->l(Lcom/daaw/v57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object v0

    sget-object v1, Lcom/daaw/t96;->a:Lcom/daaw/t96;

    iget-object v2, p0, Lcom/daaw/v96;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/g93;->P0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/v96;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v0

    check-cast v0, Lcom/daaw/j67;

    new-instance v1, Lcom/daaw/u96;

    invoke-direct {v1, p0}, Lcom/daaw/u96;-><init>(Lcom/daaw/v96;)V

    const-class v2, Ljava/lang/Exception;

    invoke-static {}, Lcom/daaw/m77;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method

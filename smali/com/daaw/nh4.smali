.class public final Lcom/daaw/nh4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q03;


# instance fields
.field public p:Lcom/daaw/a74;

.field public final q:Ljava/util/concurrent/Executor;

.field public final r:Lcom/daaw/wg4;

.field public final s:Lcom/daaw/ag;

.field public t:Z

.field public u:Z

.field public final v:Lcom/daaw/zg4;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/wg4;Lcom/daaw/ag;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/nh4;->t:Z

    iput-boolean v0, p0, Lcom/daaw/nh4;->u:Z

    new-instance v0, Lcom/daaw/zg4;

    invoke-direct {v0}, Lcom/daaw/zg4;-><init>()V

    iput-object v0, p0, Lcom/daaw/nh4;->v:Lcom/daaw/zg4;

    iput-object p1, p0, Lcom/daaw/nh4;->q:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/nh4;->r:Lcom/daaw/wg4;

    iput-object p3, p0, Lcom/daaw/nh4;->s:Lcom/daaw/ag;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/nh4;->t:Z

    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/nh4;->t:Z

    invoke-virtual {p0}, Lcom/daaw/nh4;->l()V

    return-void
.end method

.method public final synthetic e(Lorg/json/JSONObject;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nh4;->p:Lcom/daaw/a74;

    const-string v1, "AFMA_updateActiveView"

    invoke-interface {v0, v1, p1}, Lcom/daaw/kk3;->C0(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final e0(Lcom/daaw/p03;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/nh4;->v:Lcom/daaw/zg4;

    iget-boolean v1, p0, Lcom/daaw/nh4;->u:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p1, Lcom/daaw/p03;->j:Z

    :goto_0
    iput-boolean v1, v0, Lcom/daaw/zg4;->a:Z

    iget-object v1, p0, Lcom/daaw/nh4;->s:Lcom/daaw/ag;

    invoke-interface {v1}, Lcom/daaw/ag;->b()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/daaw/zg4;->d:J

    iget-object v0, p0, Lcom/daaw/nh4;->v:Lcom/daaw/zg4;

    iput-object p1, v0, Lcom/daaw/zg4;->f:Lcom/daaw/p03;

    iget-boolean p1, p0, Lcom/daaw/nh4;->t:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/nh4;->l()V

    :cond_1
    return-void
.end method

.method public final f(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/nh4;->u:Z

    return-void
.end method

.method public final k(Lcom/daaw/a74;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nh4;->p:Lcom/daaw/a74;

    return-void
.end method

.method public final l()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/nh4;->r:Lcom/daaw/wg4;

    iget-object v1, p0, Lcom/daaw/nh4;->v:Lcom/daaw/zg4;

    invoke-virtual {v0, v1}, Lcom/daaw/wg4;->b(Lcom/daaw/zg4;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/nh4;->p:Lcom/daaw/a74;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/nh4;->q:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/daaw/mh4;

    invoke-direct {v2, p0, v0}, Lcom/daaw/mh4;-><init>(Lcom/daaw/nh4;Lorg/json/JSONObject;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call video active view js"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

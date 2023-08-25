.class public final Lcom/daaw/gg5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;

.field public final h:Lcom/daaw/m08;

.field public final i:Lcom/daaw/m08;

.field public final j:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gg5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/gg5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/gg5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/gg5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/gg5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/gg5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/gg5;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/gg5;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/gg5;->i:Lcom/daaw/m08;

    iput-object p10, p0, Lcom/daaw/gg5;->j:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lcom/daaw/gg5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lcom/daaw/gg5;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/gg5;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/i94;

    invoke-virtual {v0}, Lcom/daaw/i94;->a()Ljava/lang/ref/WeakReference;

    move-result-object v4

    sget-object v5, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v5}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gg5;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/ya5;

    iget-object v0, p0, Lcom/daaw/gg5;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v0, p0, Lcom/daaw/gg5;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/td5;

    iget-object v0, p0, Lcom/daaw/gg5;->h:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v9

    iget-object v0, p0, Lcom/daaw/gg5;->i:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/xx4;

    invoke-virtual {v0}, Lcom/daaw/xx4;->a()Lcom/daaw/wx4;

    move-result-object v10

    iget-object v0, p0, Lcom/daaw/gg5;->j:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/daaw/vo6;

    new-instance v0, Lcom/daaw/fg5;

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/daaw/fg5;-><init>(Ljava/util/concurrent/Executor;Landroid/content/Context;Ljava/lang/ref/WeakReference;Ljava/util/concurrent/Executor;Lcom/daaw/ya5;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/td5;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/wx4;Lcom/daaw/vo6;)V

    return-object v0
.end method

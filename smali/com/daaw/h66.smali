.class public final Lcom/daaw/h66;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h66;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/h66;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/h66;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/h66;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/h66;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/h66;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/h66;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/h66;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/h66;->i:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 11

    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v1}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/h66;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v0, p0, Lcom/daaw/h66;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/h66;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/px5;

    iget-object v0, p0, Lcom/daaw/h66;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/h66;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/h66;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/lx5;

    iget-object v0, p0, Lcom/daaw/h66;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/ya5;

    iget-object v0, p0, Lcom/daaw/h66;->i:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/daaw/hg5;

    new-instance v10, Lcom/daaw/f66;

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/daaw/f66;-><init>(Lcom/daaw/g77;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/String;Lcom/daaw/px5;Landroid/content/Context;Lcom/daaw/ri6;Lcom/daaw/lx5;Lcom/daaw/ya5;Lcom/daaw/hg5;)V

    return-object v10
.end method

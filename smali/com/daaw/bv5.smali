.class public final Lcom/daaw/bv5;
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

.field public final k:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bv5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/bv5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/bv5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/bv5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/bv5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/bv5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/bv5;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/bv5;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/bv5;->i:Lcom/daaw/m08;

    iput-object p10, p0, Lcom/daaw/bv5;->j:Lcom/daaw/m08;

    iput-object p11, p0, Lcom/daaw/bv5;->k:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/av5;
    .locals 13

    iget-object v0, p0, Lcom/daaw/bv5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/bv5;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/en6;

    iget-object v0, p0, Lcom/daaw/bv5;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/vu5;

    iget-object v0, p0, Lcom/daaw/bv5;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/nq4;

    iget-object v0, p0, Lcom/daaw/bv5;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/kp6;

    iget-object v0, p0, Lcom/daaw/bv5;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/op6;

    iget-object v0, p0, Lcom/daaw/bv5;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/cm4;

    sget-object v9, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v9}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/bv5;->i:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v0, p0, Lcom/daaw/bv5;->j:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/daaw/vq5;

    iget-object v0, p0, Lcom/daaw/bv5;->k:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/daaw/to6;

    new-instance v0, Lcom/daaw/av5;

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lcom/daaw/av5;-><init>(Landroid/content/Context;Lcom/daaw/en6;Lcom/daaw/vu5;Lcom/daaw/nq4;Lcom/daaw/kp6;Lcom/daaw/op6;Lcom/daaw/cm4;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/vq5;Lcom/daaw/to6;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bv5;->a()Lcom/daaw/av5;

    move-result-object v0

    return-object v0
.end method

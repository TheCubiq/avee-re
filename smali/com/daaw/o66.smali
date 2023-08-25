.class public final Lcom/daaw/o66;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o66;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/o66;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/o66;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/o66;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/o66;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/o66;->f:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 8

    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v1}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/o66;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v0, p0, Lcom/daaw/o66;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/o66;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/o66;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/o66;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/b94;

    new-instance v7, Lcom/daaw/m66;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/m66;-><init>(Lcom/daaw/g77;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/String;Landroid/content/Context;Lcom/daaw/ri6;Lcom/daaw/b94;)V

    return-object v7
.end method

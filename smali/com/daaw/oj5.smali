.class public final Lcom/daaw/oj5;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oj5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/oj5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/oj5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/oj5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/oj5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/oj5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/oj5;->g:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/daaw/oj5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/oj5;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/oj5;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/li5;

    invoke-virtual {v0}, Lcom/daaw/li5;->a()Lcom/daaw/ki5;

    move-result-object v4

    sget-object v5, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v5}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/oj5;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v0, p0, Lcom/daaw/oj5;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/zo5;

    iget-object v0, p0, Lcom/daaw/oj5;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/to6;

    new-instance v0, Lcom/daaw/nj5;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/daaw/nj5;-><init>(Landroid/content/Context;Lcom/daaw/ri6;Lcom/daaw/ki5;Lcom/daaw/g77;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/zo5;Lcom/daaw/to6;)V

    return-object v0
.end method

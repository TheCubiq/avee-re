.class public final Lcom/daaw/x96;
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

    iput-object p1, p0, Lcom/daaw/x96;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/x96;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/x96;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/x96;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/x96;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/x96;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/x96;->g:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 10

    new-instance v1, Lcom/daaw/hz3;

    invoke-direct {v1}, Lcom/daaw/hz3;-><init>()V

    iget-object v0, p0, Lcom/daaw/x96;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/ya6;

    invoke-virtual {v0}, Lcom/daaw/ya6;->a()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v0, p0, Lcom/daaw/x96;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/x96;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/qz3;

    iget-object v0, p0, Lcom/daaw/x96;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v6, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v6}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/x96;->g:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/xa6;

    invoke-virtual {v0}, Lcom/daaw/xa6;->a()Ljava/lang/String;

    move-result-object v7

    new-instance v9, Lcom/daaw/v96;

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/daaw/v96;-><init>(Lcom/daaw/hz3;ILandroid/content/Context;Lcom/daaw/qz3;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Ljava/lang/String;[B)V

    return-object v9
.end method

.class public final Lcom/daaw/mb6;
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

    iput-object p1, p0, Lcom/daaw/mb6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/mb6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/mb6;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/mb6;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/mb6;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/mb6;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/mb6;->g:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/daaw/mb6;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/qz3;

    iget-object v0, p0, Lcom/daaw/mb6;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/ab6;

    invoke-virtual {v0}, Lcom/daaw/ab6;->a()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object v0, p0, Lcom/daaw/mb6;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/bb6;

    invoke-virtual {v0}, Lcom/daaw/bb6;->a()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    new-instance v5, Lcom/daaw/fz3;

    invoke-direct {v5}, Lcom/daaw/fz3;-><init>()V

    sget-object v6, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v6}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/mb6;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/xa6;

    invoke-virtual {v0}, Lcom/daaw/xa6;->a()Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/daaw/mb6;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/daaw/kb6;

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/daaw/kb6;-><init>(Lcom/daaw/qz3;ZZLcom/daaw/fz3;Lcom/daaw/g77;Ljava/lang/String;Ljava/util/concurrent/ScheduledExecutorService;[B)V

    return-object v0
.end method

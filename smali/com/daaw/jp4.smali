.class public final Lcom/daaw/jp4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jp4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/jp4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/jp4;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/jp4;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/jp4;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gr4;

    iget-object v1, p0, Lcom/daaw/jp4;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/sm4;

    invoke-virtual {v1}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/jp4;->c:Lcom/daaw/m08;

    invoke-interface {v2}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v3, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lcom/daaw/ip4;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/daaw/ip4;-><init>(Lcom/daaw/gr4;Lcom/daaw/th6;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v4
.end method

.class public final Lcom/daaw/ka3;
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

    iput-object p1, p0, Lcom/daaw/ka3;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/ka3;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/ka3;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/ka3;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/daaw/ka3;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/ka3;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v4, Lcom/daaw/la3;

    invoke-direct {v4}, Lcom/daaw/la3;-><init>()V

    iget-object v0, p0, Lcom/daaw/ka3;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/to6;

    new-instance v0, Lcom/daaw/ja3;

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/ja3;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/la3;Lcom/daaw/to6;[B)V

    return-object v0
.end method

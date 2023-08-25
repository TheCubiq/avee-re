.class public final Lcom/daaw/va6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/va6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/va6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/va6;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lcom/daaw/lr3;

    invoke-direct {v0}, Lcom/daaw/lr3;-><init>()V

    iget-object v1, p0, Lcom/daaw/va6;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/daaw/va6;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/h94;

    invoke-virtual {v2}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lcom/daaw/ta6;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/daaw/ta6;-><init>(Lcom/daaw/lr3;Ljava/util/concurrent/ScheduledExecutorService;Landroid/content/Context;[B)V

    return-object v3
.end method

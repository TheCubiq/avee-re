.class public final Lcom/daaw/q25;
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

    iput-object p1, p0, Lcom/daaw/q25;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/q25;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/q25;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/q25;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/daaw/q25;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/m03;

    iget-object v1, p0, Lcom/daaw/q25;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/daaw/q25;->c:Lcom/daaw/m08;

    invoke-interface {v2}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/q25;->d:Lcom/daaw/m08;

    invoke-interface {v3}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ag;

    new-instance v4, Lcom/daaw/nh4;

    new-instance v5, Lcom/daaw/wg4;

    invoke-direct {v5, v2, v0}, Lcom/daaw/wg4;-><init>(Landroid/content/Context;Lcom/daaw/m03;)V

    invoke-direct {v4, v1, v5, v3}, Lcom/daaw/nh4;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/wg4;Lcom/daaw/ag;)V

    return-object v4
.end method

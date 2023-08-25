.class public final Lcom/daaw/o75;
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

    iput-object p1, p0, Lcom/daaw/o75;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/o75;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/o75;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/o75;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/daaw/o75;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/nh4;

    iget-object v2, p0, Lcom/daaw/o75;->c:Lcom/daaw/m08;

    invoke-interface {v2}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ny4;

    new-instance v3, Lcom/daaw/j75;

    invoke-direct {v3, v0, v1, v2}, Lcom/daaw/j75;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/nh4;Lcom/daaw/ny4;)V

    return-object v3
.end method

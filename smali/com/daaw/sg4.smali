.class public final Lcom/daaw/sg4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final synthetic a:Lcom/daaw/vg4;


# direct methods
.method public constructor <init>(Lcom/daaw/vg4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sg4;->a:Lcom/daaw/vg4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/sg4;->a:Lcom/daaw/vg4;

    invoke-static {p1, p2}, Lcom/daaw/vg4;->g(Lcom/daaw/vg4;Ljava/util/Map;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/sg4;->a:Lcom/daaw/vg4;

    invoke-static {p1}, Lcom/daaw/vg4;->b(Lcom/daaw/vg4;)Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/daaw/rg4;

    invoke-direct {p2, p0}, Lcom/daaw/rg4;-><init>(Lcom/daaw/sg4;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

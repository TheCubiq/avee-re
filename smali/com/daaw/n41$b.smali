.class public Lcom/daaw/n41$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/n41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public p:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "TT;>;"
        }
    .end annotation
.end field

.field public q:Lcom/daaw/uj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uj<",
            "TT;>;"
        }
    .end annotation
.end field

.field public r:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;Lcom/daaw/uj;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;",
            "Lcom/daaw/uj<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/n41$b;->p:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lcom/daaw/n41$b;->q:Lcom/daaw/uj;

    iput-object p1, p0, Lcom/daaw/n41$b;->r:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/daaw/n41$b;->p:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/n41$b;->q:Lcom/daaw/uj;

    iget-object v2, p0, Lcom/daaw/n41$b;->r:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/n41$b$a;

    invoke-direct {v3, p0, v1, v0}, Lcom/daaw/n41$b$a;-><init>(Lcom/daaw/n41$b;Lcom/daaw/uj;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

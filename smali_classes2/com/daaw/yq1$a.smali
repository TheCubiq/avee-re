.class public Lcom/daaw/yq1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yq1;->f(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/util/concurrent/Callable;

.field public final synthetic q:Lcom/daaw/tj1;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Callable;Lcom/daaw/tj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yq1$a;->p:Ljava/util/concurrent/Callable;

    iput-object p2, p0, Lcom/daaw/yq1$a;->q:Lcom/daaw/tj1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TaskMainThread"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/daaw/yq1$a;->p:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/rj1;

    new-instance v1, Lcom/daaw/yq1$a$a;

    invoke-direct {v1, p0}, Lcom/daaw/yq1$a$a;-><init>(Lcom/daaw/yq1$a;)V

    invoke-virtual {v0, v1}, Lcom/daaw/rj1;->f(Lcom/daaw/hl;)Lcom/daaw/rj1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/yq1$a;->q:Lcom/daaw/tj1;

    invoke-virtual {v1, v0}, Lcom/daaw/tj1;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

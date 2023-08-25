.class public Lcom/daaw/jr1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jr1$b;,
        Lcom/daaw/jr1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public p:Lcom/daaw/jr1$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jr1$b<",
            "TResult;>;"
        }
    .end annotation
.end field

.field public q:Lcom/daaw/jr1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jr1$a<",
            "TResult;>;"
        }
    .end annotation
.end field

.field public volatile r:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TResult;"
        }
    .end annotation
.end field

.field public volatile s:Z


# direct methods
.method public constructor <init>(Lcom/daaw/jr1$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jr1$b<",
            "TResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/jr1;->r:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/jr1;->s:Z

    iput-object p1, p0, Lcom/daaw/jr1;->p:Lcom/daaw/jr1$b;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/jr1$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jr1$a<",
            "TResult;>;)V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/ir1;->j:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lcom/daaw/jr1;->q:Lcom/daaw/jr1$a;

    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/jr1;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/jr1;->s:Z

    return v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jr1;->p:Lcom/daaw/jr1$b;

    invoke-interface {v0}, Lcom/daaw/jr1$b;->a()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/jr1;->r:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/jr1;->s:Z

    iget-object v0, p0, Lcom/daaw/jr1;->q:Lcom/daaw/jr1$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/jr1;->r:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/daaw/jr1$a;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

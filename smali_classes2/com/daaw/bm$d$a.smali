.class public Lcom/daaw/bm$d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bm$d;->b(Ljava/lang/Boolean;)Lcom/daaw/rj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/daaw/rj1<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Boolean;

.field public final synthetic b:Lcom/daaw/bm$d;


# direct methods
.method public constructor <init>(Lcom/daaw/bm$d;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iput-object p2, p0, Lcom/daaw/bm$d$a;->a:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/bm$d$a;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Deleting cached crash reports..."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iget-object v0, v0, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    invoke-virtual {v0}, Lcom/daaw/bm;->J()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/bm;->d(Ljava/util/List;)V

    iget-object v0, p0, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iget-object v0, v0, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    invoke-static {v0}, Lcom/daaw/bm;->h(Lcom/daaw/bm;)Lcom/daaw/pb1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pb1;->u()V

    iget-object v0, p0, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iget-object v0, v0, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    iget-object v0, v0, Lcom/daaw/bm;->q:Lcom/daaw/tj1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    invoke-static {v1}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Sending cached crash reports..."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/bm$d$a;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iget-object v1, v1, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    invoke-static {v1}, Lcom/daaw/bm;->l(Lcom/daaw/bm;)Lcom/daaw/ep;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/ep;->c(Z)V

    iget-object v0, p0, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iget-object v0, v0, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    invoke-static {v0}, Lcom/daaw/bm;->m(Lcom/daaw/bm;)Lcom/daaw/zl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/zl;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iget-object v1, v1, Lcom/daaw/bm$d;->a:Lcom/daaw/rj1;

    new-instance v2, Lcom/daaw/bm$d$a$a;

    invoke-direct {v2, p0, v0}, Lcom/daaw/bm$d$a$a;-><init>(Lcom/daaw/bm$d$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v1, v0, v2}, Lcom/daaw/rj1;->p(Ljava/util/concurrent/Executor;Lcom/daaw/ai1;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bm$d$a;->a()Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method

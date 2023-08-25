.class public Lcom/daaw/jh0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jh0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/jh0;->b:Ljava/util/List;

    invoke-static {p1}, Lcom/daaw/q6;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/jh0;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/jh0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jh0$a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/jh0;->a:Ljava/lang/Object;

    invoke-static {p1}, Lcom/daaw/jh0$a;->a(Lcom/daaw/jh0$a;)Lcom/daaw/sd0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/jh0;->b:Ljava/util/List;

    invoke-static {p1}, Lcom/daaw/jh0$a;->b(Lcom/daaw/jh0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/jh0;->b:Ljava/util/List;

    invoke-static {p1}, Lcom/daaw/jh0$a;->b(Lcom/daaw/jh0$a;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/jh0;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c(Lcom/daaw/jh0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jh0$a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/jh0;->a:Ljava/lang/Object;

    invoke-static {p1}, Lcom/daaw/jh0$a;->a(Lcom/daaw/jh0$a;)Lcom/daaw/sd0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/jh0;->b:Ljava/util/List;

    invoke-static {p1}, Lcom/daaw/jh0$a;->b(Lcom/daaw/jh0$a;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

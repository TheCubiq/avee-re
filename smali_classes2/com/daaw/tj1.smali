.class public Lcom/daaw/tj1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/dw8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/dw8;

    invoke-direct {v0}, Lcom/daaw/dw8;-><init>()V

    iput-object v0, p0, Lcom/daaw/tj1;->a:Lcom/daaw/dw8;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/tj1;->a:Lcom/daaw/dw8;

    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tj1;->a:Lcom/daaw/dw8;

    invoke-virtual {v0, p1}, Lcom/daaw/dw8;->q(Ljava/lang/Exception;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/tj1;->a:Lcom/daaw/dw8;

    invoke-virtual {v0, p1}, Lcom/daaw/dw8;->r(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/tj1;->a:Lcom/daaw/dw8;

    invoke-virtual {v0, p1}, Lcom/daaw/dw8;->t(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/tj1;->a:Lcom/daaw/dw8;

    invoke-virtual {v0, p1}, Lcom/daaw/dw8;->u(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

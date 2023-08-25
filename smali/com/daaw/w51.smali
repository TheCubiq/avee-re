.class public Lcom/daaw/w51;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/w51;->a:Ljava/util/List;

    sget-object v0, Lcom/daaw/dj0;->B:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/w51$a;

    invoke-direct {v1, p0}, Lcom/daaw/w51$a;-><init>(Lcom/daaw/w51;)V

    iget-object v2, p0, Lcom/daaw/w51;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    return-void
.end method

.class public final Lcom/daaw/bh0;
.super Lcom/daaw/th0;
.source ""


# instance fields
.field public final t:Lcom/daaw/z40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/z40<",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/z40;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/th0;-><init>()V

    iput-object p1, p0, Lcom/daaw/bh0;->t:Lcom/daaw/z40;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/daaw/bh0;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lcom/daaw/lp1;->a:Lcom/daaw/lp1;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/bh0;->t:Lcom/daaw/z40;

    invoke-interface {v0, p1}, Lcom/daaw/z40;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.class public Lcom/daaw/j6$a;
.super Lcom/daaw/ym0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/j6;->h()Lcom/daaw/ym0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/ym0<",
        "TE;TE;>;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lcom/daaw/j6;


# direct methods
.method public constructor <init>(Lcom/daaw/j6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j6$a;->d:Lcom/daaw/j6;

    invoke-direct {p0}, Lcom/daaw/ym0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j6$a;->d:Lcom/daaw/j6;

    invoke-virtual {v0}, Lcom/daaw/j6;->clear()V

    return-void
.end method

.method public b(II)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lcom/daaw/j6$a;->d:Lcom/daaw/j6;

    iget-object p2, p2, Lcom/daaw/j6;->q:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TE;TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/j6$a;->d:Lcom/daaw/j6;

    iget v0, v0, Lcom/daaw/j6;->r:I

    return v0
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/j6$a;->d:Lcom/daaw/j6;

    invoke-virtual {v0, p1}, Lcom/daaw/j6;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/j6$a;->d:Lcom/daaw/j6;

    invoke-virtual {v0, p1}, Lcom/daaw/j6;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)V"
        }
    .end annotation

    iget-object p2, p0, Lcom/daaw/j6$a;->d:Lcom/daaw/j6;

    invoke-virtual {p2, p1}, Lcom/daaw/j6;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j6$a;->d:Lcom/daaw/j6;

    invoke-virtual {v0, p1}, Lcom/daaw/j6;->m(I)Ljava/lang/Object;

    return-void
.end method

.method public i(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "not a map"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

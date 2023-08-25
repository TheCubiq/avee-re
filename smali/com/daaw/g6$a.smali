.class public Lcom/daaw/g6$a;
.super Lcom/daaw/ym0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/g6;->n()Lcom/daaw/ym0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/ym0<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lcom/daaw/g6;


# direct methods
.method public constructor <init>(Lcom/daaw/g6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    invoke-direct {p0}, Lcom/daaw/ym0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    invoke-virtual {v0}, Lcom/daaw/cd1;->clear()V

    return-void
.end method

.method public b(II)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    iget-object v0, v0, Lcom/daaw/cd1;->q:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-object p1, v0, p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    iget v0, v0, Lcom/daaw/cd1;->r:I

    return v0
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->f(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->h(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->k(I)Ljava/lang/Object;

    return-void
.end method

.method public i(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/g6$a;->d:Lcom/daaw/g6;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/cd1;->l(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

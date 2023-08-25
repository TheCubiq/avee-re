.class public final Lcom/daaw/zs8;
.super Lcom/daaw/xq8;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/dt8;Lcom/daaw/l64;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/daaw/xq8;-><init>(Lcom/daaw/l64;)V

    return-void
.end method


# virtual methods
.method public final d(ILcom/daaw/d34;Z)Lcom/daaw/d34;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xq8;->c:Lcom/daaw/l64;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/l64;->d(ILcom/daaw/d34;Z)Lcom/daaw/d34;

    const/4 p1, 0x1

    iput-boolean p1, p2, Lcom/daaw/d34;->f:Z

    return-object p2
.end method

.method public final e(ILcom/daaw/i54;J)Lcom/daaw/i54;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xq8;->c:Lcom/daaw/l64;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    const/4 p1, 0x1

    iput-boolean p1, p2, Lcom/daaw/i54;->j:Z

    return-object p2
.end method

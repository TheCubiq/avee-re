.class public Lcom/daaw/do1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/z91;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/do1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/qv0;

.field public final synthetic b:Lcom/daaw/do1;


# direct methods
.method public constructor <init>(Lcom/daaw/do1;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/do1$b;->b:Lcom/daaw/do1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/daaw/qv0;

    const/4 v0, 0x4

    new-array v0, v0, [B

    invoke-direct {p1, v0}, Lcom/daaw/qv0;-><init>([B)V

    iput-object p1, p0, Lcom/daaw/do1$b;->a:Lcom/daaw/qv0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 9

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    const/4 v1, 0x4

    div-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    iget-object v4, p0, Lcom/daaw/do1$b;->a:Lcom/daaw/qv0;

    invoke-virtual {p1, v4, v1}, Lcom/daaw/rv0;->f(Lcom/daaw/qv0;I)V

    iget-object v4, p0, Lcom/daaw/do1$b;->a:Lcom/daaw/qv0;

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lcom/daaw/qv0;->h(I)I

    move-result v4

    iget-object v5, p0, Lcom/daaw/do1$b;->a:Lcom/daaw/qv0;

    const/4 v6, 0x3

    invoke-virtual {v5, v6}, Lcom/daaw/qv0;->o(I)V

    const/16 v5, 0xd

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/daaw/do1$b;->a:Lcom/daaw/qv0;

    invoke-virtual {v4, v5}, Lcom/daaw/qv0;->o(I)V

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lcom/daaw/do1$b;->a:Lcom/daaw/qv0;

    invoke-virtual {v4, v5}, Lcom/daaw/qv0;->h(I)I

    move-result v4

    iget-object v5, p0, Lcom/daaw/do1$b;->b:Lcom/daaw/do1;

    invoke-static {v5}, Lcom/daaw/do1;->b(Lcom/daaw/do1;)Landroid/util/SparseArray;

    move-result-object v5

    new-instance v6, Lcom/daaw/aa1;

    new-instance v7, Lcom/daaw/do1$c;

    iget-object v8, p0, Lcom/daaw/do1$b;->b:Lcom/daaw/do1;

    invoke-direct {v7, v8, v4}, Lcom/daaw/do1$c;-><init>(Lcom/daaw/do1;I)V

    invoke-direct {v6, v7}, Lcom/daaw/aa1;-><init>(Lcom/daaw/z91;)V

    invoke-virtual {v5, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v4, p0, Lcom/daaw/do1$b;->b:Lcom/daaw/do1;

    invoke-static {v4}, Lcom/daaw/do1;->j(Lcom/daaw/do1;)I

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/do1$b;->b:Lcom/daaw/do1;

    invoke-static {p1}, Lcom/daaw/do1;->l(Lcom/daaw/do1;)I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Lcom/daaw/do1$b;->b:Lcom/daaw/do1;

    invoke-static {p1}, Lcom/daaw/do1;->b(Lcom/daaw/do1;)Landroid/util/SparseArray;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    :cond_3
    return-void
.end method

.method public c(Lcom/daaw/ol1;Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 0

    return-void
.end method

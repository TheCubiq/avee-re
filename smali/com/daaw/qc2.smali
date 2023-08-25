.class public final Lcom/daaw/qc2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gd2;


# instance fields
.field public a:Lcom/daaw/f92;

.field public b:Lcom/daaw/cr5;

.field public c:Lcom/daaw/m42;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/b72;

    invoke-direct {v0}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v0, p1}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qc2;->a:Lcom/daaw/f92;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/qc2;->b:Lcom/daaw/cr5;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Lcom/daaw/it5;->a:I

    iget-object v0, p0, Lcom/daaw/qc2;->b:Lcom/daaw/cr5;

    invoke-virtual {v0}, Lcom/daaw/cr5;->d()J

    move-result-wide v2

    iget-object v0, p0, Lcom/daaw/qc2;->b:Lcom/daaw/cr5;

    invoke-virtual {v0}, Lcom/daaw/cr5;->e()J

    move-result-wide v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    cmp-long v6, v0, v4

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/daaw/qc2;->a:Lcom/daaw/f92;

    iget-wide v5, v4, Lcom/daaw/f92;->p:J

    cmp-long v7, v0, v5

    if-eqz v7, :cond_1

    invoke-virtual {v4}, Lcom/daaw/f92;->b()Lcom/daaw/b72;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Lcom/daaw/b72;->w(J)Lcom/daaw/b72;

    invoke-virtual {v4}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/qc2;->a:Lcom/daaw/f92;

    iget-object v1, p0, Lcom/daaw/qc2;->c:Lcom/daaw/m42;

    invoke-interface {v1, v0}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v5

    iget-object v0, p0, Lcom/daaw/qc2;->c:Lcom/daaw/m42;

    invoke-interface {v0, p1, v5}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iget-object v1, p0, Lcom/daaw/qc2;->c:Lcom/daaw/m42;

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final b(Lcom/daaw/cr5;Lcom/daaw/m09;Lcom/daaw/td2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qc2;->b:Lcom/daaw/cr5;

    invoke-virtual {p3}, Lcom/daaw/td2;->c()V

    invoke-virtual {p3}, Lcom/daaw/td2;->a()I

    move-result p1

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qc2;->c:Lcom/daaw/m42;

    iget-object p2, p0, Lcom/daaw/qc2;->a:Lcom/daaw/f92;

    invoke-interface {p1, p2}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    return-void
.end method

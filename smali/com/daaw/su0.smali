.class public Lcom/daaw/su0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:[Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lcom/daaw/su0;->a:[Z

    return-void
.end method

.method public static a(Lcom/daaw/rj;Lcom/daaw/ak0;Lcom/daaw/qj;)V
    .locals 6

    const/4 v0, -0x1

    iput v0, p2, Lcom/daaw/qj;->j:I

    iput v0, p2, Lcom/daaw/qj;->k:I

    iget-object v0, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, Lcom/daaw/qj$b;->q:Lcom/daaw/qj$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v0, v0, v1

    sget-object v1, Lcom/daaw/qj$b;->s:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p2, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    iget v0, v0, Lcom/daaw/lj;->e:I

    invoke-virtual {p0}, Lcom/daaw/qj;->N()I

    move-result v1

    iget-object v4, p2, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    iget v4, v4, Lcom/daaw/lj;->e:I

    sub-int/2addr v1, v4

    iget-object v4, p2, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {p1, v4}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v5

    iput-object v5, v4, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    iget-object v4, p2, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {p1, v4}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v5

    iput-object v5, v4, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    iget-object v4, p2, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    iget-object v4, v4, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    invoke-virtual {p1, v4, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v4, p2, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    iget-object v4, v4, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    invoke-virtual {p1, v4, v1}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iput v3, p2, Lcom/daaw/qj;->j:I

    invoke-virtual {p2, v0, v1}, Lcom/daaw/qj;->h0(II)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v0, v0, v1

    sget-object v1, Lcom/daaw/qj$b;->s:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_3

    iget-object v0, p2, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    iget v0, v0, Lcom/daaw/lj;->e:I

    invoke-virtual {p0}, Lcom/daaw/qj;->t()I

    move-result p0

    iget-object v1, p2, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    iget v1, v1, Lcom/daaw/lj;->e:I

    sub-int/2addr p0, v1

    iget-object v1, p2, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {p1, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v2

    iput-object v2, v1, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    iget-object v1, p2, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {p1, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v2

    iput-object v2, v1, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    iget-object v1, p2, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    iget-object v1, v1, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    invoke-virtual {p1, v1, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v1, p2, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    iget-object v1, v1, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    invoke-virtual {p1, v1, p0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget v1, p2, Lcom/daaw/qj;->Y:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, Lcom/daaw/qj;->M()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p2, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    invoke-virtual {p1, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v2

    iput-object v2, v1, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    iget-object v1, p2, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    iget-object v1, v1, Lcom/daaw/lj;->g:Lcom/daaw/de1;

    iget v2, p2, Lcom/daaw/qj;->Y:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    :cond_2
    iput v3, p2, Lcom/daaw/qj;->k:I

    invoke-virtual {p2, v0, p0}, Lcom/daaw/qj;->w0(II)V

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

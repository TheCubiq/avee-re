.class public final Lcom/daaw/lv8;
.super Lcom/daaw/nv8;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final A:I

.field public final B:Z

.field public final t:I

.field public final u:Z

.field public final v:Z

.field public final w:Z

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(ILcom/daaw/r84;ILcom/daaw/fv8;ILjava/lang/String;)V
    .locals 3

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/nv8;-><init>(ILcom/daaw/r84;I)V

    const/4 p1, 0x0

    invoke-static {p5, p1}, Lcom/daaw/rv8;->r(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/daaw/lv8;->u:Z

    iget-object p2, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget p2, p2, Lcom/daaw/f92;->d:I

    iget p3, p4, Lcom/daaw/de4;->u:I

    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    :cond_0
    const/4 p3, 0x1

    :goto_0
    iput-boolean p3, p0, Lcom/daaw/lv8;->v:Z

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    iput-boolean p2, p0, Lcom/daaw/lv8;->w:Z

    iget-object p2, p4, Lcom/daaw/de4;->s:Lcom/daaw/y17;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, ""

    invoke-static {p2}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object p2

    goto :goto_2

    :cond_2
    iget-object p2, p4, Lcom/daaw/de4;->s:Lcom/daaw/y17;

    :goto_2
    const/4 p3, 0x0

    :goto_3
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge p3, v1, :cond_4

    iget-object v1, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2, p1}, Lcom/daaw/rv8;->j(Lcom/daaw/f92;Ljava/lang/String;Z)I

    move-result v1

    if-lez v1, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_4
    const p3, 0x7fffffff

    const/4 v1, 0x0

    :goto_4
    iput p3, p0, Lcom/daaw/lv8;->x:I

    iput v1, p0, Lcom/daaw/lv8;->y:I

    iget-object p2, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget p2, p2, Lcom/daaw/f92;->e:I

    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    move-result p2

    iput p2, p0, Lcom/daaw/lv8;->z:I

    iget-object p3, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget p3, p3, Lcom/daaw/f92;->e:I

    iput-boolean p1, p0, Lcom/daaw/lv8;->B:Z

    invoke-static {p6}, Lcom/daaw/rv8;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_5

    const/4 p3, 0x1

    goto :goto_5

    :cond_5
    const/4 p3, 0x0

    :goto_5
    iget-object v2, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    invoke-static {v2, p6, p3}, Lcom/daaw/rv8;->j(Lcom/daaw/f92;Ljava/lang/String;Z)I

    move-result p3

    iput p3, p0, Lcom/daaw/lv8;->A:I

    if-gtz v1, :cond_8

    iget-object p6, p4, Lcom/daaw/de4;->s:Lcom/daaw/y17;

    invoke-virtual {p6}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p6

    if-eqz p6, :cond_6

    if-gtz p2, :cond_8

    :cond_6
    iget-boolean p2, p0, Lcom/daaw/lv8;->v:Z

    if-nez p2, :cond_8

    iget-boolean p2, p0, Lcom/daaw/lv8;->w:Z

    if-eqz p2, :cond_7

    if-lez p3, :cond_7

    goto :goto_6

    :cond_7
    const/4 p2, 0x0

    goto :goto_7

    :cond_8
    :goto_6
    const/4 p2, 0x1

    :goto_7
    iget-boolean p3, p4, Lcom/daaw/fv8;->N:Z

    invoke-static {p5, p3}, Lcom/daaw/rv8;->r(IZ)Z

    move-result p3

    if-eqz p3, :cond_9

    if-eqz p2, :cond_9

    const/4 p1, 0x1

    :cond_9
    iput p1, p0, Lcom/daaw/lv8;->t:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/lv8;->t:I

    return v0
.end method

.method public final bridge synthetic b(Lcom/daaw/nv8;)Z
    .locals 0

    check-cast p1, Lcom/daaw/lv8;

    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lcom/daaw/lv8;)I
    .locals 4

    invoke-static {}, Lcom/daaw/n17;->i()Lcom/daaw/n17;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/lv8;->u:Z

    iget-boolean v2, p1, Lcom/daaw/lv8;->u:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object v0

    iget v1, p0, Lcom/daaw/lv8;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Lcom/daaw/lv8;->x:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Lcom/daaw/l37;->c()Lcom/daaw/l37;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/l37;->a()Lcom/daaw/l37;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object v0

    iget v1, p0, Lcom/daaw/lv8;->y:I

    iget v2, p1, Lcom/daaw/lv8;->y:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/n17;->b(II)Lcom/daaw/n17;

    move-result-object v0

    iget v1, p0, Lcom/daaw/lv8;->z:I

    iget v2, p1, Lcom/daaw/lv8;->z:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/n17;->b(II)Lcom/daaw/n17;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/lv8;->v:Z

    iget-boolean v2, p1, Lcom/daaw/lv8;->v:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/lv8;->w:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p1, Lcom/daaw/lv8;->w:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget v3, p0, Lcom/daaw/lv8;->y:I

    if-nez v3, :cond_0

    invoke-static {}, Lcom/daaw/l37;->c()Lcom/daaw/l37;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/l37;->c()Lcom/daaw/l37;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/l37;->a()Lcom/daaw/l37;

    move-result-object v3

    :goto_0
    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object v0

    iget v1, p0, Lcom/daaw/lv8;->A:I

    iget p1, p1, Lcom/daaw/lv8;->A:I

    invoke-virtual {v0, v1, p1}, Lcom/daaw/n17;->b(II)Lcom/daaw/n17;

    move-result-object p1

    iget v0, p0, Lcom/daaw/lv8;->z:I

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Lcom/daaw/n17;->e(ZZ)Lcom/daaw/n17;

    move-result-object p1

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/n17;->a()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/lv8;

    invoke-virtual {p0, p1}, Lcom/daaw/lv8;->c(Lcom/daaw/lv8;)I

    move-result p1

    return p1
.end method

.class public final Lcom/daaw/tu8;
.super Lcom/daaw/nv8;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final A:I

.field public final B:Z

.field public final C:I

.field public final D:I

.field public final E:Z

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:I

.field public final J:Z

.field public final K:Z

.field public final t:I

.field public final u:Z

.field public final v:Ljava/lang/String;

.field public final w:Lcom/daaw/fv8;

.field public final x:Z

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(ILcom/daaw/r84;ILcom/daaw/fv8;IZLcom/daaw/ty6;)V
    .locals 3

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/nv8;-><init>(ILcom/daaw/r84;I)V

    iput-object p4, p0, Lcom/daaw/tu8;->w:Lcom/daaw/fv8;

    iget-object p1, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget-object p1, p1, Lcom/daaw/f92;->c:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/rv8;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/tu8;->v:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-static {p5, p1}, Lcom/daaw/rv8;->r(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/daaw/tu8;->x:Z

    const/4 p2, 0x0

    :goto_0
    iget-object p3, p4, Lcom/daaw/de4;->n:Lcom/daaw/y17;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    const v0, 0x7fffffff

    if-ge p2, p3, :cond_1

    iget-object p3, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget-object v1, p4, Lcom/daaw/de4;->n:Lcom/daaw/y17;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p3, v1, p1}, Lcom/daaw/rv8;->j(Lcom/daaw/f92;Ljava/lang/String;Z)I

    move-result p3

    if-lez p3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const p2, 0x7fffffff

    const/4 p3, 0x0

    :goto_1
    iput p2, p0, Lcom/daaw/tu8;->z:I

    iput p3, p0, Lcom/daaw/tu8;->y:I

    iget-object p2, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget p2, p2, Lcom/daaw/f92;->e:I

    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    move-result p2

    iput p2, p0, Lcom/daaw/tu8;->A:I

    iget-object p2, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget p3, p2, Lcom/daaw/f92;->e:I

    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/daaw/tu8;->B:Z

    iget v1, p2, Lcom/daaw/f92;->d:I

    and-int/2addr v1, p3

    if-eq p3, v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    :goto_2
    iput-boolean v1, p0, Lcom/daaw/tu8;->E:Z

    iget v1, p2, Lcom/daaw/f92;->y:I

    iput v1, p0, Lcom/daaw/tu8;->F:I

    iget v1, p2, Lcom/daaw/f92;->z:I

    iput v1, p0, Lcom/daaw/tu8;->G:I

    iget v1, p2, Lcom/daaw/f92;->h:I

    iput v1, p0, Lcom/daaw/tu8;->H:I

    invoke-interface {p7, p2}, Lcom/daaw/ty6;->zza(Ljava/lang/Object;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/daaw/tu8;->u:Z

    invoke-static {}, Lcom/daaw/it5;->G()[Ljava/lang/String;

    move-result-object p2

    const/4 p7, 0x0

    :goto_3
    array-length v1, p2

    if-ge p7, v1, :cond_4

    iget-object v1, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    aget-object v2, p2, p7

    invoke-static {v1, v2, p1}, Lcom/daaw/rv8;->j(Lcom/daaw/f92;Ljava/lang/String;Z)I

    move-result v1

    if-lez v1, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 p7, p7, 0x1

    goto :goto_3

    :cond_4
    const p7, 0x7fffffff

    const/4 v1, 0x0

    :goto_4
    iput p7, p0, Lcom/daaw/tu8;->C:I

    iput v1, p0, Lcom/daaw/tu8;->D:I

    const/4 p2, 0x0

    :goto_5
    iget-object p7, p4, Lcom/daaw/de4;->r:Lcom/daaw/y17;

    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    move-result p7

    if-ge p2, p7, :cond_6

    iget-object p7, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget-object p7, p7, Lcom/daaw/f92;->l:Ljava/lang/String;

    if-eqz p7, :cond_5

    iget-object v1, p4, Lcom/daaw/de4;->r:Lcom/daaw/y17;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p7

    if-eqz p7, :cond_5

    move v0, p2

    goto :goto_6

    :cond_5
    add-int/lit8 p2, p2, 0x1

    goto :goto_5

    :cond_6
    :goto_6
    iput v0, p0, Lcom/daaw/tu8;->I:I

    and-int/lit16 p2, p5, 0x180

    const/16 p4, 0x80

    if-ne p2, p4, :cond_7

    const/4 p2, 0x1

    goto :goto_7

    :cond_7
    const/4 p2, 0x0

    :goto_7
    iput-boolean p2, p0, Lcom/daaw/tu8;->J:Z

    and-int/lit8 p2, p5, 0x40

    const/16 p4, 0x40

    if-ne p2, p4, :cond_8

    const/4 p2, 0x1

    goto :goto_8

    :cond_8
    const/4 p2, 0x0

    :goto_8
    iput-boolean p2, p0, Lcom/daaw/tu8;->K:Z

    iget-object p2, p0, Lcom/daaw/tu8;->w:Lcom/daaw/fv8;

    iget-boolean p4, p2, Lcom/daaw/fv8;->N:Z

    invoke-static {p5, p4}, Lcom/daaw/rv8;->r(IZ)Z

    move-result p4

    const/4 p7, 0x2

    if-nez p4, :cond_9

    goto :goto_9

    :cond_9
    iget-boolean p4, p0, Lcom/daaw/tu8;->u:Z

    if-nez p4, :cond_a

    iget-boolean v0, p2, Lcom/daaw/fv8;->H:Z

    if-nez v0, :cond_a

    goto :goto_9

    :cond_a
    invoke-static {p5, p1}, Lcom/daaw/rv8;->r(IZ)Z

    move-result p1

    if-eqz p1, :cond_c

    if-eqz p4, :cond_c

    iget-object p1, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget p1, p1, Lcom/daaw/f92;->h:I

    const/4 p4, -0x1

    if-eq p1, p4, :cond_c

    iget-boolean p1, p2, Lcom/daaw/fv8;->P:Z

    if-nez p1, :cond_b

    if-nez p6, :cond_c

    :cond_b
    const/4 p1, 0x2

    goto :goto_9

    :cond_c
    const/4 p1, 0x1

    :goto_9
    iput p1, p0, Lcom/daaw/tu8;->t:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/tu8;->t:I

    return v0
.end method

.method public final bridge synthetic b(Lcom/daaw/nv8;)Z
    .locals 5

    check-cast p1, Lcom/daaw/tu8;

    iget-object v0, p0, Lcom/daaw/tu8;->w:Lcom/daaw/fv8;

    iget-boolean v0, v0, Lcom/daaw/fv8;->K:Z

    iget-object v0, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget v1, v0, Lcom/daaw/f92;->y:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget-object v3, p1, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget v4, v3, Lcom/daaw/f92;->y:I

    if-ne v1, v4, :cond_0

    iget-object v0, v0, Lcom/daaw/f92;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, v3, Lcom/daaw/f92;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/tu8;->w:Lcom/daaw/fv8;

    iget-boolean v0, v0, Lcom/daaw/fv8;->J:Z

    iget-object v0, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget v0, v0, Lcom/daaw/f92;->z:I

    if-eq v0, v2, :cond_0

    iget-object v1, p1, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    iget v1, v1, Lcom/daaw/f92;->z:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/daaw/tu8;->J:Z

    iget-boolean v1, p1, Lcom/daaw/tu8;->J:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/daaw/tu8;->K:Z

    iget-boolean p1, p1, Lcom/daaw/tu8;->K:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lcom/daaw/tu8;)I
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/tu8;->u:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/tu8;->x:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/rv8;->l()Lcom/daaw/l37;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/rv8;->l()Lcom/daaw/l37;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l37;->a()Lcom/daaw/l37;

    move-result-object v0

    :goto_0
    invoke-static {}, Lcom/daaw/n17;->i()Lcom/daaw/n17;

    move-result-object v1

    iget-boolean v2, p0, Lcom/daaw/tu8;->x:Z

    iget-boolean v3, p1, Lcom/daaw/tu8;->x:Z

    invoke-virtual {v1, v2, v3}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/daaw/tu8;->z:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/daaw/l37;->c()Lcom/daaw/l37;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/l37;->a()Lcom/daaw/l37;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->y:I

    iget v3, p1, Lcom/daaw/tu8;->y:I

    invoke-virtual {v1, v2, v3}, Lcom/daaw/n17;->b(II)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->A:I

    iget v3, p1, Lcom/daaw/tu8;->A:I

    invoke-virtual {v1, v2, v3}, Lcom/daaw/n17;->b(II)Lcom/daaw/n17;

    move-result-object v1

    iget-boolean v2, p0, Lcom/daaw/tu8;->E:Z

    iget-boolean v3, p1, Lcom/daaw/tu8;->E:Z

    invoke-virtual {v1, v2, v3}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v2}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->C:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/daaw/tu8;->C:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/daaw/l37;->c()Lcom/daaw/l37;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/l37;->a()Lcom/daaw/l37;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->D:I

    iget v3, p1, Lcom/daaw/tu8;->D:I

    invoke-virtual {v1, v2, v3}, Lcom/daaw/n17;->b(II)Lcom/daaw/n17;

    move-result-object v1

    iget-boolean v2, p0, Lcom/daaw/tu8;->u:Z

    iget-boolean v3, p1, Lcom/daaw/tu8;->u:Z

    invoke-virtual {v1, v2, v3}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->I:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/daaw/tu8;->I:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/daaw/l37;->c()Lcom/daaw/l37;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/l37;->a()Lcom/daaw/l37;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->H:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/daaw/tu8;->H:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/tu8;->w:Lcom/daaw/fv8;

    iget-boolean v4, v4, Lcom/daaw/de4;->w:Z

    invoke-static {}, Lcom/daaw/rv8;->m()Lcom/daaw/l37;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object v1

    iget-boolean v2, p0, Lcom/daaw/tu8;->J:Z

    iget-boolean v3, p1, Lcom/daaw/tu8;->J:Z

    invoke-virtual {v1, v2, v3}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object v1

    iget-boolean v2, p0, Lcom/daaw/tu8;->K:Z

    iget-boolean v3, p1, Lcom/daaw/tu8;->K:Z

    invoke-virtual {v1, v2, v3}, Lcom/daaw/n17;->d(ZZ)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->F:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/daaw/tu8;->F:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->G:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/daaw/tu8;->G:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object v1

    iget v2, p0, Lcom/daaw/tu8;->H:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/daaw/tu8;->H:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/tu8;->v:Ljava/lang/String;

    iget-object p1, p1, Lcom/daaw/tu8;->v:Ljava/lang/String;

    invoke-static {v4, p1}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/daaw/rv8;->m()Lcom/daaw/l37;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v2, v3, v0}, Lcom/daaw/n17;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/daaw/n17;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/n17;->a()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/tu8;

    invoke-virtual {p0, p1}, Lcom/daaw/tu8;->c(Lcom/daaw/tu8;)I

    move-result p1

    return p1
.end method

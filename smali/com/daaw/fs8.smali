.class public final Lcom/daaw/fs8;
.super Lcom/daaw/sq8;
.source ""


# static fields
.field public static final t:Lcom/daaw/f53;


# instance fields
.field public final k:[Lcom/daaw/rr8;

.field public final l:[Lcom/daaw/l64;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/Map;

.field public final o:Lcom/daaw/w27;

.field public p:I

.field public q:[[J

.field public r:Lcom/daaw/es8;

.field public final s:Lcom/daaw/uq8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ee2;

    invoke-direct {v0}, Lcom/daaw/ee2;-><init>()V

    const-string v1, "MergingMediaSource"

    invoke-virtual {v0, v1}, Lcom/daaw/ee2;->a(Ljava/lang/String;)Lcom/daaw/ee2;

    invoke-virtual {v0}, Lcom/daaw/ee2;->c()Lcom/daaw/f53;

    move-result-object v0

    sput-object v0, Lcom/daaw/fs8;->t:Lcom/daaw/f53;

    return-void
.end method

.method public varargs constructor <init>(ZZ[Lcom/daaw/rr8;)V
    .locals 0

    new-instance p1, Lcom/daaw/uq8;

    invoke-direct {p1}, Lcom/daaw/uq8;-><init>()V

    invoke-direct {p0}, Lcom/daaw/sq8;-><init>()V

    iput-object p3, p0, Lcom/daaw/fs8;->k:[Lcom/daaw/rr8;

    iput-object p1, p0, Lcom/daaw/fs8;->s:Lcom/daaw/uq8;

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/daaw/fs8;->m:Ljava/util/ArrayList;

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/fs8;->p:I

    array-length p1, p3

    new-array p1, p1, [Lcom/daaw/l64;

    iput-object p1, p0, Lcom/daaw/fs8;->l:[Lcom/daaw/l64;

    const/4 p1, 0x0

    new-array p1, p1, [[J

    iput-object p1, p0, Lcom/daaw/fs8;->q:[[J

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/fs8;->n:Ljava/util/Map;

    const/16 p1, 0x8

    invoke-static {p1}, Lcom/daaw/d37;->a(I)Lcom/daaw/c37;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/daaw/c37;->b(I)Lcom/daaw/a37;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/a37;->c()Lcom/daaw/m27;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/fs8;->o:Lcom/daaw/w27;

    return-void
.end method


# virtual methods
.method public final bridge synthetic D(Ljava/lang/Object;Lcom/daaw/pr8;)Lcom/daaw/pr8;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge synthetic E(Ljava/lang/Object;Lcom/daaw/rr8;Lcom/daaw/l64;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/fs8;->r:Lcom/daaw/es8;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lcom/daaw/fs8;->p:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    invoke-virtual {p3}, Lcom/daaw/l64;->b()I

    move-result v0

    iput v0, p0, Lcom/daaw/fs8;->p:I

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Lcom/daaw/l64;->b()I

    move-result v0

    iget v1, p0, Lcom/daaw/fs8;->p:I

    if-ne v0, v1, :cond_4

    move v0, v1

    :goto_0
    iget-object v1, p0, Lcom/daaw/fs8;->q:[[J

    array-length v1, v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/fs8;->l:[Lcom/daaw/l64;

    array-length v1, v1

    const/4 v3, 0x2

    new-array v3, v3, [I

    const/4 v4, 0x1

    aput v1, v3, v4

    aput v0, v3, v2

    const-class v0, J

    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[J

    iput-object v0, p0, Lcom/daaw/fs8;->q:[[J

    :cond_2
    iget-object v0, p0, Lcom/daaw/fs8;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Lcom/daaw/fs8;->l:[Lcom/daaw/l64;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aput-object p3, p2, p1

    iget-object p1, p0, Lcom/daaw/fs8;->m:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/fs8;->l:[Lcom/daaw/l64;

    aget-object p1, p1, v2

    invoke-virtual {p0, p1}, Lcom/daaw/lq8;->x(Lcom/daaw/l64;)V

    :cond_3
    :goto_1
    return-void

    :cond_4
    new-instance p1, Lcom/daaw/es8;

    invoke-direct {p1, v2}, Lcom/daaw/es8;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/fs8;->r:Lcom/daaw/es8;

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fs8;->r:Lcom/daaw/es8;

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/daaw/sq8;->e()V

    return-void

    :cond_0
    throw v0
.end method

.method public final h()Lcom/daaw/f53;
    .locals 2

    iget-object v0, p0, Lcom/daaw/fs8;->k:[Lcom/daaw/rr8;

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/daaw/rr8;->h()Lcom/daaw/f53;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/fs8;->t:Lcom/daaw/f53;

    :goto_0
    return-object v0
.end method

.method public final k(Lcom/daaw/pr8;Lcom/daaw/nw8;J)Lcom/daaw/nr8;
    .locals 9

    iget-object v0, p0, Lcom/daaw/fs8;->k:[Lcom/daaw/rr8;

    array-length v0, v0

    new-array v1, v0, [Lcom/daaw/nr8;

    iget-object v2, p0, Lcom/daaw/fs8;->l:[Lcom/daaw/l64;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    iget-object v4, p1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lcom/daaw/fs8;->l:[Lcom/daaw/l64;

    aget-object v4, v4, v3

    invoke-virtual {v4, v2}, Lcom/daaw/l64;->f(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/daaw/pr8;->c(Ljava/lang/Object;)Lcom/daaw/pr8;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/fs8;->k:[Lcom/daaw/rr8;

    aget-object v5, v5, v3

    iget-object v6, p0, Lcom/daaw/fs8;->q:[[J

    aget-object v6, v6, v2

    aget-wide v7, v6, v3

    sub-long v7, p3, v7

    invoke-interface {v5, v4, p2, v7, v8}, Lcom/daaw/rr8;->k(Lcom/daaw/pr8;Lcom/daaw/nw8;J)Lcom/daaw/nr8;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/ds8;

    iget-object p2, p0, Lcom/daaw/fs8;->s:Lcom/daaw/uq8;

    iget-object p3, p0, Lcom/daaw/fs8;->q:[[J

    aget-object p3, p3, v2

    const/4 p4, 0x0

    invoke-direct {p1, p2, p3, v1, p4}, Lcom/daaw/ds8;-><init>(Lcom/daaw/uq8;[J[Lcom/daaw/nr8;[B)V

    return-object p1
.end method

.method public final l(Lcom/daaw/nr8;)V
    .locals 3

    check-cast p1, Lcom/daaw/ds8;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/fs8;->k:[Lcom/daaw/rr8;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {p1, v0}, Lcom/daaw/ds8;->f(I)Lcom/daaw/nr8;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/daaw/rr8;->l(Lcom/daaw/nr8;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final w(Lcom/daaw/qz6;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/sq8;->w(Lcom/daaw/qz6;)V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/fs8;->k:[Lcom/daaw/rr8;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/fs8;->k:[Lcom/daaw/rr8;

    aget-object v1, v1, p1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/sq8;->A(Ljava/lang/Object;Lcom/daaw/rr8;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final y()V
    .locals 2

    invoke-super {p0}, Lcom/daaw/sq8;->y()V

    iget-object v0, p0, Lcom/daaw/fs8;->l:[Lcom/daaw/l64;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/fs8;->p:I

    iput-object v1, p0, Lcom/daaw/fs8;->r:Lcom/daaw/es8;

    iget-object v0, p0, Lcom/daaw/fs8;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/daaw/fs8;->m:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/fs8;->k:[Lcom/daaw/rr8;

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

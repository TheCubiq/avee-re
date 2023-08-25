.class public final Lcom/daaw/xb8;
.super Lcom/daaw/z48;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/daaw/ac8;


# static fields
.field public static final r:Lcom/daaw/xb8;

.field public static final s:Lcom/daaw/ac8;


# instance fields
.field public final q:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/xb8;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/daaw/xb8;-><init>(I)V

    sput-object v0, Lcom/daaw/xb8;->r:Lcom/daaw/xb8;

    invoke-virtual {v0}, Lcom/daaw/z48;->zzb()V

    sput-object v0, Lcom/daaw/xb8;->s:Lcom/daaw/ac8;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/daaw/xb8;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0}, Lcom/daaw/z48;-><init>()V

    iput-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/z48;-><init>()V

    iput-object p1, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    return-void
.end method

.method public static f(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/y68;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/daaw/y68;

    sget-object v0, Lcom/daaw/gb8;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Lcom/daaw/y68;->s(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    check-cast p0, [B

    invoke-static {p0}, Lcom/daaw/gb8;->g([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic add(ILjava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    instance-of v0, p2, Lcom/daaw/ac8;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/daaw/ac8;

    invoke-interface {p2}, Lcom/daaw/ac8;->zzh()Ljava/util/List;

    move-result-object p2

    :cond_0
    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    iget p2, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ljava/util/AbstractList;->modCount:I

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/xb8;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/daaw/z48;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic b(I)Lcom/daaw/db8;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/xb8;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object p1, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance p1, Lcom/daaw/xb8;

    invoke-direct {p1, v0}, Lcom/daaw/xb8;-><init>(Ljava/util/ArrayList;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final e(I)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    instance-of v1, v0, Lcom/daaw/y68;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/daaw/y68;

    sget-object v1, Lcom/daaw/gb8;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Lcom/daaw/y68;->s(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/y68;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v1

    :cond_2
    check-cast v0, [B

    invoke-static {v0}, Lcom/daaw/gb8;->g([B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/gb8;->h([B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v1
.end method

.method public final g(Lcom/daaw/y68;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/xb8;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic remove(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    invoke-static {p1}, Lcom/daaw/xb8;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/xb8;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()Lcom/daaw/ac8;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z48;->zzc()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/yg8;

    invoke-direct {v0, p0}, Lcom/daaw/yg8;-><init>(Lcom/daaw/ac8;)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xb8;->q:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/daaw/do1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/do1$c;,
        Lcom/daaw/do1$b;
    }
.end annotation


# static fields
.field public static final m:Lcom/daaw/e00;

.field public static final n:J

.field public static final o:J

.field public static final p:J


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/ol1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/rv0;

.field public final d:Landroid/util/SparseIntArray;

.field public final e:Lcom/daaw/eo1$c;

.field public final f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/eo1;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Landroid/util/SparseBooleanArray;

.field public h:Lcom/daaw/d00;

.field public i:I

.field public j:Z

.field public k:Lcom/daaw/eo1;

.field public l:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/do1$a;

    invoke-direct {v0}, Lcom/daaw/do1$a;-><init>()V

    sput-object v0, Lcom/daaw/do1;->m:Lcom/daaw/e00;

    const-string v0, "AC-3"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Lcom/daaw/do1;->n:J

    const-string v0, "EAC3"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Lcom/daaw/do1;->o:J

    const-string v0, "HEVC"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Lcom/daaw/do1;->p:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/do1;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/daaw/do1;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

    new-instance v0, Lcom/daaw/ol1;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/ol1;-><init>(J)V

    new-instance v1, Lcom/daaw/bs;

    invoke-direct {v1, p2}, Lcom/daaw/bs;-><init>(I)V

    invoke-direct {p0, p1, v0, v1}, Lcom/daaw/do1;-><init>(ILcom/daaw/ol1;Lcom/daaw/eo1$c;)V

    return-void
.end method

.method public constructor <init>(ILcom/daaw/ol1;Lcom/daaw/eo1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/eo1$c;

    iput-object p3, p0, Lcom/daaw/do1;->e:Lcom/daaw/eo1$c;

    iput p1, p0, Lcom/daaw/do1;->a:I

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    const/4 p3, 0x2

    if-ne p1, p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/do1;->b:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/do1;->b:Ljava/util/List;

    :goto_1
    new-instance p1, Lcom/daaw/rv0;

    const/16 p2, 0x24b8

    new-array p2, p2, [B

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lcom/daaw/rv0;-><init>([BI)V

    iput-object p1, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/do1;->g:Landroid/util/SparseBooleanArray;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/do1;->f:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/do1;->d:Landroid/util/SparseIntArray;

    invoke-virtual {p0}, Lcom/daaw/do1;->v()V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/do1;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Lcom/daaw/do1;->f:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static synthetic e(Lcom/daaw/do1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/do1;->i:I

    return p0
.end method

.method public static synthetic g()J
    .locals 2

    sget-wide v0, Lcom/daaw/do1;->o:J

    return-wide v0
.end method

.method public static synthetic h(Lcom/daaw/do1;I)I
    .locals 0

    iput p1, p0, Lcom/daaw/do1;->i:I

    return p1
.end method

.method public static synthetic j(Lcom/daaw/do1;)I
    .locals 2

    iget v0, p0, Lcom/daaw/do1;->i:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/do1;->i:I

    return v0
.end method

.method public static synthetic k()J
    .locals 2

    sget-wide v0, Lcom/daaw/do1;->p:J

    return-wide v0
.end method

.method public static synthetic l(Lcom/daaw/do1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/do1;->a:I

    return p0
.end method

.method public static synthetic m(Lcom/daaw/do1;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/do1;->b:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic n(Lcom/daaw/do1;)Lcom/daaw/eo1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/do1;->k:Lcom/daaw/eo1;

    return-object p0
.end method

.method public static synthetic o(Lcom/daaw/do1;Lcom/daaw/eo1;)Lcom/daaw/eo1;
    .locals 0

    iput-object p1, p0, Lcom/daaw/do1;->k:Lcom/daaw/eo1;

    return-object p1
.end method

.method public static synthetic p(Lcom/daaw/do1;)Lcom/daaw/eo1$c;
    .locals 0

    iget-object p0, p0, Lcom/daaw/do1;->e:Lcom/daaw/eo1$c;

    return-object p0
.end method

.method public static synthetic q(Lcom/daaw/do1;)Lcom/daaw/d00;
    .locals 0

    iget-object p0, p0, Lcom/daaw/do1;->h:Lcom/daaw/d00;

    return-object p0
.end method

.method public static synthetic r(Lcom/daaw/do1;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Lcom/daaw/do1;->g:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method public static synthetic s(Lcom/daaw/do1;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/do1;->j:Z

    return p0
.end method

.method public static synthetic t(Lcom/daaw/do1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/do1;->j:Z

    return p1
.end method

.method public static synthetic u()J
    .locals 2

    sget-wide v0, Lcom/daaw/do1;->n:J

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/16 v2, 0x3ac

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xbc

    if-ge v2, v3, :cond_2

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x5

    if-ne v3, v4, :cond_0

    invoke-interface {p1, v2}, Lcom/daaw/a00;->j(I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    mul-int/lit16 v4, v3, 0xbc

    add-int/2addr v4, v2

    aget-byte v4, v0, v4

    const/16 v5, 0x47

    if-eq v4, v5, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return v1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 9

    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    iget-object v0, p2, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p2}, Lcom/daaw/rv0;->c()I

    move-result p2

    rsub-int p2, p2, 0x24b8

    const/16 v1, 0xbc

    const/4 v2, 0x0

    if-ge p2, v1, :cond_1

    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->a()I

    move-result p2

    if-lez p2, :cond_0

    iget-object v3, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {v3}, Lcom/daaw/rv0;->c()I

    move-result v3

    invoke-static {v0, v3, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    iget-object v3, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {v3, v0, p2}, Lcom/daaw/rv0;->H([BI)V

    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->a()I

    move-result p2

    if-ge p2, v1, :cond_3

    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->d()I

    move-result p2

    rsub-int v3, p2, 0x24b8

    invoke-interface {p1, v0, p2, v3}, Lcom/daaw/a00;->b([BII)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    return v4

    :cond_2
    iget-object v4, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    add-int/2addr p2, v3

    invoke-virtual {v4, p2}, Lcom/daaw/rv0;->I(I)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->d()I

    move-result p1

    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->c()I

    move-result p2

    move v1, p2

    :goto_1
    if-ge v1, p1, :cond_4

    aget-byte v3, v0, v1

    const/16 v4, 0x47

    if-eq v3, v4, :cond_4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->J(I)V

    add-int/lit16 v0, v1, 0xbc

    const/4 v3, 0x2

    if-le v0, p1, :cond_7

    iget p1, p0, Lcom/daaw/do1;->l:I

    sub-int/2addr v1, p2

    add-int/2addr p1, v1

    iput p1, p0, Lcom/daaw/do1;->l:I

    iget p2, p0, Lcom/daaw/do1;->a:I

    if-ne p2, v3, :cond_6

    const/16 p2, 0x178

    if-gt p1, p2, :cond_5

    goto :goto_2

    :cond_5
    new-instance p1, Lcom/daaw/tv0;

    const-string p2, "Cannot find sync byte. Most likely not a Transport Stream."

    invoke-direct {p1, p2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    return v2

    :cond_7
    iput v2, p0, Lcom/daaw/do1;->l:I

    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->i()I

    move-result p2

    const/high16 v1, 0x800000

    and-int/2addr v1, p2

    if-eqz v1, :cond_8

    :goto_3
    iget-object p1, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->J(I)V

    return v2

    :cond_8
    const/high16 v1, 0x400000

    and-int/2addr v1, p2

    const/4 v4, 0x1

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    goto :goto_4

    :cond_9
    const/4 v1, 0x0

    :goto_4
    const v5, 0x1fff00

    and-int/2addr v5, p2

    shr-int/lit8 v5, v5, 0x8

    and-int/lit8 v6, p2, 0x20

    if-eqz v6, :cond_a

    const/4 v6, 0x1

    goto :goto_5

    :cond_a
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v7, p2, 0x10

    if-eqz v7, :cond_b

    const/4 v7, 0x1

    goto :goto_6

    :cond_b
    const/4 v7, 0x0

    :goto_6
    if-eqz v7, :cond_c

    iget-object v7, p0, Lcom/daaw/do1;->f:Landroid/util/SparseArray;

    invoke-virtual {v7, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/eo1;

    goto :goto_7

    :cond_c
    const/4 v7, 0x0

    :goto_7
    if-nez v7, :cond_d

    goto :goto_3

    :cond_d
    iget v8, p0, Lcom/daaw/do1;->a:I

    if-eq v8, v3, :cond_f

    and-int/lit8 p2, p2, 0xf

    iget-object v3, p0, Lcom/daaw/do1;->d:Landroid/util/SparseIntArray;

    add-int/lit8 v8, p2, -0x1

    invoke-virtual {v3, v5, v8}, Landroid/util/SparseIntArray;->get(II)I

    move-result v3

    iget-object v8, p0, Lcom/daaw/do1;->d:Landroid/util/SparseIntArray;

    invoke-virtual {v8, v5, p2}, Landroid/util/SparseIntArray;->put(II)V

    if-ne v3, p2, :cond_e

    goto :goto_3

    :cond_e
    add-int/2addr v3, v4

    and-int/lit8 v3, v3, 0xf

    if-eq p2, v3, :cond_f

    invoke-interface {v7}, Lcom/daaw/eo1;->b()V

    :cond_f
    if-eqz v6, :cond_10

    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->x()I

    move-result p2

    iget-object v3, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {v3, p2}, Lcom/daaw/rv0;->K(I)V

    :cond_10
    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2, v0}, Lcom/daaw/rv0;->I(I)V

    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-interface {v7, p2, v1}, Lcom/daaw/eo1;->a(Lcom/daaw/rv0;Z)V

    iget-object p2, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p2, p1}, Lcom/daaw/rv0;->I(I)V

    goto :goto_3
.end method

.method public f(JJ)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/do1;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p1, :cond_0

    iget-object p4, p0, Lcom/daaw/do1;->b:Ljava/util/List;

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/daaw/ol1;

    invoke-virtual {p4}, Lcom/daaw/ol1;->g()V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/do1;->c:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->F()V

    iget-object p1, p0, Lcom/daaw/do1;->d:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    invoke-virtual {p0}, Lcom/daaw/do1;->v()V

    iput p2, p0, Lcom/daaw/do1;->l:I

    return-void
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 3

    iput-object p1, p0, Lcom/daaw/do1;->h:Lcom/daaw/d00;

    new-instance v0, Lcom/daaw/da1$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lcom/daaw/da1$b;-><init>(J)V

    invoke-interface {p1, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    return-void
.end method

.method public final v()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/do1;->g:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->clear()V

    iget-object v0, p0, Lcom/daaw/do1;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    iget-object v0, p0, Lcom/daaw/do1;->e:Lcom/daaw/eo1$c;

    invoke-interface {v0}, Lcom/daaw/eo1$c;->b()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    iget-object v4, p0, Lcom/daaw/do1;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/do1;->f:Landroid/util/SparseArray;

    new-instance v1, Lcom/daaw/aa1;

    new-instance v3, Lcom/daaw/do1$b;

    invoke-direct {v3, p0}, Lcom/daaw/do1$b;-><init>(Lcom/daaw/do1;)V

    invoke-direct {v1, v3}, Lcom/daaw/aa1;-><init>(Lcom/daaw/z91;)V

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/do1;->k:Lcom/daaw/eo1;

    return-void
.end method

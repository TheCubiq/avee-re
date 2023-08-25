.class public final Lcom/daaw/nb2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j09;


# static fields
.field public static final d:Lcom/daaw/q09;


# instance fields
.field public final a:Lcom/daaw/ob2;

.field public final b:Lcom/daaw/ik5;

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/mb2;->b:Lcom/daaw/mb2;

    sput-object v0, Lcom/daaw/nb2;->d:Lcom/daaw/q09;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/ob2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/ob2;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/nb2;->a:Lcom/daaw/ob2;

    new-instance v0, Lcom/daaw/ik5;

    const/16 v1, 0x4000

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/nb2;->b:Lcom/daaw/ik5;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 15

    new-instance v0, Lcom/daaw/ik5;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v4

    move-object/from16 v5, p1

    check-cast v5, Lcom/daaw/rz8;

    invoke-virtual {v5, v4, v2, v1, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->u()I

    move-result v4

    const v6, 0x494433

    const/4 v7, 0x3

    if-eq v4, v6, :cond_7

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzj()V

    move-object/from16 v4, p1

    check-cast v4, Lcom/daaw/rz8;

    invoke-virtual {v4, v3, v2}, Lcom/daaw/rz8;->k(IZ)Z

    move v5, v3

    :goto_1
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v6

    const/4 v8, 0x7

    invoke-virtual {v4, v6, v2, v8, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->w()I

    move-result v6

    const v9, 0xac40

    const v10, 0xac41

    if-eq v6, v9, :cond_1

    if-eq v6, v10, :cond_1

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzj()V

    add-int/lit8 v5, v5, 0x1

    sub-int v1, v5, v3

    const/16 v6, 0x2000

    if-ge v1, v6, :cond_0

    invoke-virtual {v4, v5, v2}, Lcom/daaw/rz8;->k(IZ)Z

    goto :goto_1

    :cond_0
    return v2

    :cond_1
    const/4 v9, 0x1

    add-int/2addr v1, v9

    const/4 v11, 0x4

    if-lt v1, v11, :cond_2

    return v9

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v9

    sget v12, Lcom/daaw/fz8;->b:I

    array-length v12, v9

    const/4 v13, -0x1

    if-ge v12, v8, :cond_3

    const/4 v12, -0x1

    goto :goto_4

    :cond_3
    const/4 v12, 0x2

    aget-byte v12, v9, v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x8

    aget-byte v14, v9, v7

    and-int/lit16 v14, v14, 0xff

    or-int/2addr v12, v14

    const v14, 0xffff

    if-ne v12, v14, :cond_4

    aget-byte v11, v9, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x10

    const/4 v12, 0x5

    aget-byte v12, v9, v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x8

    or-int/2addr v11, v12

    const/4 v12, 0x6

    aget-byte v9, v9, v12

    and-int/lit16 v9, v9, 0xff

    or-int v12, v11, v9

    goto :goto_3

    :cond_4
    const/4 v8, 0x4

    :goto_3
    if-ne v6, v10, :cond_5

    add-int/lit8 v8, v8, 0x2

    :cond_5
    add-int/2addr v12, v8

    :goto_4
    if-ne v12, v13, :cond_6

    return v2

    :cond_6
    add-int/lit8 v12, v12, -0x7

    invoke-virtual {v4, v12, v2}, Lcom/daaw/rz8;->k(IZ)Z

    goto :goto_2

    :cond_7
    invoke-virtual {v0, v7}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->r()I

    move-result v4

    add-int/lit8 v6, v4, 0xa

    add-int/2addr v3, v6

    invoke-virtual {v5, v4, v2}, Lcom/daaw/rz8;->k(IZ)Z

    goto/16 :goto_0
.end method

.method public final c(Lcom/daaw/m09;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/nb2;->a:Lcom/daaw/ob2;

    new-instance v1, Lcom/daaw/td2;

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lcom/daaw/td2;-><init>(III)V

    invoke-virtual {v0, p1, v1}, Lcom/daaw/ob2;->b(Lcom/daaw/m09;Lcom/daaw/td2;)V

    invoke-interface {p1}, Lcom/daaw/m09;->zzC()V

    new-instance v0, Lcom/daaw/h42;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/h42;-><init>(JJ)V

    invoke-interface {p1, v0}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    return-void
.end method

.method public final d(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 3

    iget-object p2, p0, Lcom/daaw/nb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->h()[B

    move-result-object p2

    const/4 v0, 0x0

    const/16 v1, 0x4000

    invoke-interface {p1, p2, v0, v1}, Lcom/daaw/k09;->a([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p2, p0, Lcom/daaw/nb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, v0}, Lcom/daaw/ik5;->f(I)V

    iget-object p2, p0, Lcom/daaw/nb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, p1}, Lcom/daaw/ik5;->e(I)V

    iget-boolean p1, p0, Lcom/daaw/nb2;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/nb2;->a:Lcom/daaw/ob2;

    const-wide/16 v1, 0x0

    const/4 p2, 0x4

    invoke-virtual {p1, v1, v2, p2}, Lcom/daaw/ob2;->c(JI)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/nb2;->c:Z

    :cond_1
    iget-object p1, p0, Lcom/daaw/nb2;->a:Lcom/daaw/ob2;

    iget-object p2, p0, Lcom/daaw/nb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p1, p2}, Lcom/daaw/ob2;->a(Lcom/daaw/ik5;)V

    return v0
.end method

.method public final f(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/nb2;->c:Z

    iget-object p1, p0, Lcom/daaw/nb2;->a:Lcom/daaw/ob2;

    invoke-virtual {p1}, Lcom/daaw/ob2;->zze()V

    return-void
.end method

.class public final Lcom/daaw/qb2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j09;


# static fields
.field public static final j:Lcom/daaw/q09;


# instance fields
.field public final a:Lcom/daaw/rb2;

.field public final b:Lcom/daaw/ik5;

.field public final c:Lcom/daaw/ik5;

.field public final d:Lcom/daaw/cj5;

.field public e:Lcom/daaw/m09;

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/pb2;->b:Lcom/daaw/pb2;

    sput-object v0, Lcom/daaw/qb2;->j:Lcom/daaw/q09;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/daaw/rb2;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/rb2;-><init>(ZLjava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/qb2;->a:Lcom/daaw/rb2;

    new-instance p1, Lcom/daaw/ik5;

    const/16 v0, 0x800

    invoke-direct {p1, v0}, Lcom/daaw/ik5;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/qb2;->b:Lcom/daaw/ik5;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/daaw/qb2;->g:J

    new-instance p1, Lcom/daaw/ik5;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/daaw/ik5;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    new-instance v0, Lcom/daaw/cj5;

    invoke-virtual {p1}, Lcom/daaw/ik5;->h()[B

    move-result-object p1

    array-length v1, p1

    invoke-direct {v0, p1, v1}, Lcom/daaw/cj5;-><init>([BI)V

    iput-object v0, p0, Lcom/daaw/qb2;->d:Lcom/daaw/cj5;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lcom/daaw/rz8;

    const/16 v4, 0xa

    invoke-virtual {v3, v2, v0, v4, v0}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object v2, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    invoke-virtual {v2, v0}, Lcom/daaw/ik5;->f(I)V

    iget-object v2, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->u()I

    move-result v2

    const v4, 0x494433

    if-eq v2, v4, :cond_6

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    move-object v2, p1

    check-cast v2, Lcom/daaw/rz8;

    invoke-virtual {v2, v1, v0}, Lcom/daaw/rz8;->k(IZ)Z

    iget-wide v3, p0, Lcom/daaw/qb2;->g:J

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    int-to-long v3, v1

    iput-wide v3, p0, Lcom/daaw/qb2;->g:J

    :cond_0
    move v4, v1

    const/4 v3, 0x0

    const/4 v5, 0x0

    :cond_1
    iget-object v6, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    invoke-virtual {v6}, Lcom/daaw/ik5;->h()[B

    move-result-object v6

    const/4 v7, 0x2

    invoke-virtual {v2, v6, v0, v7, v0}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object v6, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    invoke-virtual {v6, v0}, Lcom/daaw/ik5;->f(I)V

    iget-object v6, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    invoke-virtual {v6}, Lcom/daaw/ik5;->w()I

    move-result v6

    invoke-static {v6}, Lcom/daaw/rb2;->d(I)Z

    move-result v6

    if-nez v6, :cond_2

    :goto_1
    add-int/lit8 v4, v4, 0x1

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    invoke-virtual {v2, v4, v0}, Lcom/daaw/rz8;->k(IZ)Z

    const/4 v3, 0x0

    const/4 v5, 0x0

    goto :goto_3

    :cond_2
    const/4 v6, 0x1

    add-int/2addr v3, v6

    const/4 v7, 0x4

    if-lt v3, v7, :cond_4

    const/16 v8, 0xbc

    if-gt v5, v8, :cond_3

    goto :goto_2

    :cond_3
    return v6

    :cond_4
    :goto_2
    iget-object v6, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    invoke-virtual {v6}, Lcom/daaw/ik5;->h()[B

    move-result-object v6

    invoke-virtual {v2, v6, v0, v7, v0}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object v6, p0, Lcom/daaw/qb2;->d:Lcom/daaw/cj5;

    const/16 v7, 0xe

    invoke-virtual {v6, v7}, Lcom/daaw/cj5;->h(I)V

    iget-object v6, p0, Lcom/daaw/qb2;->d:Lcom/daaw/cj5;

    const/16 v7, 0xd

    invoke-virtual {v6, v7}, Lcom/daaw/cj5;->c(I)I

    move-result v6

    const/4 v7, 0x6

    if-gt v6, v7, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v7, v6, -0x6

    invoke-virtual {v2, v7, v0}, Lcom/daaw/rz8;->k(IZ)Z

    add-int/2addr v5, v6

    :goto_3
    sub-int v6, v4, v1

    const/16 v7, 0x2000

    if-lt v6, v7, :cond_1

    return v0

    :cond_6
    iget-object v2, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    const/4 v4, 0x3

    invoke-virtual {v2, v4}, Lcom/daaw/ik5;->g(I)V

    iget-object v2, p0, Lcom/daaw/qb2;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->r()I

    move-result v2

    add-int/lit8 v4, v2, 0xa

    add-int/2addr v1, v4

    invoke-virtual {v3, v2, v0}, Lcom/daaw/rz8;->k(IZ)Z

    goto/16 :goto_0
.end method

.method public final c(Lcom/daaw/m09;)V
    .locals 5

    iput-object p1, p0, Lcom/daaw/qb2;->e:Lcom/daaw/m09;

    iget-object v0, p0, Lcom/daaw/qb2;->a:Lcom/daaw/rb2;

    new-instance v1, Lcom/daaw/td2;

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lcom/daaw/td2;-><init>(III)V

    invoke-virtual {v0, p1, v1}, Lcom/daaw/rb2;->b(Lcom/daaw/m09;Lcom/daaw/td2;)V

    invoke-interface {p1}, Lcom/daaw/m09;->zzC()V

    return-void
.end method

.method public final d(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 7

    iget-object p2, p0, Lcom/daaw/qb2;->e:Lcom/daaw/m09;

    invoke-static {p2}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/daaw/qb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->h()[B

    move-result-object p2

    const/4 v0, 0x0

    const/16 v1, 0x800

    invoke-interface {p1, p2, v0, v1}, Lcom/daaw/k09;->a([BII)I

    move-result p1

    iget-boolean p2, p0, Lcom/daaw/qb2;->i:Z

    const/4 v1, 0x1

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/qb2;->e:Lcom/daaw/m09;

    new-instance v2, Lcom/daaw/h42;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/daaw/h42;-><init>(JJ)V

    invoke-interface {p2, v2}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    iput-boolean v1, p0, Lcom/daaw/qb2;->i:Z

    :cond_0
    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    return p2

    :cond_1
    iget-object p2, p0, Lcom/daaw/qb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, v0}, Lcom/daaw/ik5;->f(I)V

    iget-object p2, p0, Lcom/daaw/qb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, p1}, Lcom/daaw/ik5;->e(I)V

    iget-boolean p1, p0, Lcom/daaw/qb2;->h:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/qb2;->a:Lcom/daaw/rb2;

    iget-wide v2, p0, Lcom/daaw/qb2;->f:J

    const/4 p2, 0x4

    invoke-virtual {p1, v2, v3, p2}, Lcom/daaw/rb2;->c(JI)V

    iput-boolean v1, p0, Lcom/daaw/qb2;->h:Z

    :cond_2
    iget-object p1, p0, Lcom/daaw/qb2;->a:Lcom/daaw/rb2;

    iget-object p2, p0, Lcom/daaw/qb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p1, p2}, Lcom/daaw/rb2;->a(Lcom/daaw/ik5;)V

    return v0
.end method

.method public final f(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/qb2;->h:Z

    iget-object p1, p0, Lcom/daaw/qb2;->a:Lcom/daaw/rb2;

    invoke-virtual {p1}, Lcom/daaw/rb2;->zze()V

    iput-wide p3, p0, Lcom/daaw/qb2;->f:J

    return-void
.end method

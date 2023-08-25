.class public final Lcom/daaw/kb2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j09;


# static fields
.field public static final d:Lcom/daaw/q09;


# instance fields
.field public final a:Lcom/daaw/lb2;

.field public final b:Lcom/daaw/ik5;

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/jb2;->b:Lcom/daaw/jb2;

    sput-object v0, Lcom/daaw/kb2;->d:Lcom/daaw/q09;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/lb2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/lb2;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/kb2;->a:Lcom/daaw/lb2;

    new-instance v0, Lcom/daaw/ik5;

    const/16 v1, 0xae2

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/kb2;->b:Lcom/daaw/ik5;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 8

    new-instance v0, Lcom/daaw/ik5;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v4

    move-object v5, p1

    check-cast v5, Lcom/daaw/rz8;

    invoke-virtual {v5, v4, v2, v1, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->u()I

    move-result v4

    const v6, 0x494433

    if-eq v4, v6, :cond_4

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    move-object v4, p1

    check-cast v4, Lcom/daaw/rz8;

    invoke-virtual {v4, v3, v2}, Lcom/daaw/rz8;->k(IZ)Z

    move v5, v3

    :goto_1
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v6

    const/4 v7, 0x6

    invoke-virtual {v4, v6, v2, v7, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->w()I

    move-result v6

    const/16 v7, 0xb77

    if-eq v6, v7, :cond_1

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    add-int/lit8 v5, v5, 0x1

    sub-int v1, v5, v3

    const/16 v6, 0x2000

    if-ge v1, v6, :cond_0

    invoke-virtual {v4, v5, v2}, Lcom/daaw/rz8;->k(IZ)Z

    goto :goto_1

    :cond_0
    return v2

    :cond_1
    const/4 v6, 0x1

    add-int/2addr v1, v6

    const/4 v7, 0x4

    if-lt v1, v7, :cond_2

    return v6

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/cz8;->b([B)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_3

    return v2

    :cond_3
    add-int/lit8 v6, v6, -0x6

    invoke-virtual {v4, v6, v2}, Lcom/daaw/rz8;->k(IZ)Z

    goto :goto_2

    :cond_4
    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->r()I

    move-result v4

    add-int/lit8 v6, v4, 0xa

    add-int/2addr v3, v6

    invoke-virtual {v5, v4, v2}, Lcom/daaw/rz8;->k(IZ)Z

    goto :goto_0
.end method

.method public final c(Lcom/daaw/m09;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/kb2;->a:Lcom/daaw/lb2;

    new-instance v1, Lcom/daaw/td2;

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lcom/daaw/td2;-><init>(III)V

    invoke-virtual {v0, p1, v1}, Lcom/daaw/lb2;->b(Lcom/daaw/m09;Lcom/daaw/td2;)V

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

    iget-object p2, p0, Lcom/daaw/kb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->h()[B

    move-result-object p2

    const/4 v0, 0x0

    const/16 v1, 0xae2

    invoke-interface {p1, p2, v0, v1}, Lcom/daaw/k09;->a([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p2, p0, Lcom/daaw/kb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, v0}, Lcom/daaw/ik5;->f(I)V

    iget-object p2, p0, Lcom/daaw/kb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, p1}, Lcom/daaw/ik5;->e(I)V

    iget-boolean p1, p0, Lcom/daaw/kb2;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/kb2;->a:Lcom/daaw/lb2;

    const-wide/16 v1, 0x0

    const/4 p2, 0x4

    invoke-virtual {p1, v1, v2, p2}, Lcom/daaw/lb2;->c(JI)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/kb2;->c:Z

    :cond_1
    iget-object p1, p0, Lcom/daaw/kb2;->a:Lcom/daaw/lb2;

    iget-object p2, p0, Lcom/daaw/kb2;->b:Lcom/daaw/ik5;

    invoke-virtual {p1, p2}, Lcom/daaw/lb2;->a(Lcom/daaw/ik5;)V

    return v0
.end method

.method public final f(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/kb2;->c:Z

    iget-object p1, p0, Lcom/daaw/kb2;->a:Lcom/daaw/lb2;

    invoke-virtual {p1}, Lcom/daaw/lb2;->zze()V

    return-void
.end method

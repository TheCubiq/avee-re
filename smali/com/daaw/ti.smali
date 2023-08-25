.class public Lcom/daaw/ti;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wc0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ti$c;,
        Lcom/daaw/ti$b;,
        Lcom/daaw/ti$a;
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/wc0$c;

.field public b:[Lcom/daaw/wc0;

.field public c:[Lcom/daaw/ti$b;

.field public d:Lcom/daaw/wc0$a;

.field public e:[Lcom/daaw/ti$c;

.field public f:Lcom/daaw/wc0$b;

.field public g:Lcom/daaw/me0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:I

.field public i:Lcom/daaw/ti$a;


# direct methods
.method public constructor <init>([Lcom/daaw/wc0;Lcom/daaw/me0;ILcom/daaw/ti$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/wc0;",
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;I",
            "Lcom/daaw/ti$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ti;->d:Lcom/daaw/wc0$a;

    iput-object v0, p0, Lcom/daaw/ti;->f:Lcom/daaw/wc0$b;

    iput-object p1, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    iput-object p2, p0, Lcom/daaw/ti;->g:Lcom/daaw/me0;

    iput p3, p0, Lcom/daaw/ti;->h:I

    iput-object p4, p0, Lcom/daaw/ti;->i:Lcom/daaw/ti$a;

    array-length p2, p1

    new-array p2, p2, [Lcom/daaw/ti$b;

    iput-object p2, p0, Lcom/daaw/ti;->c:[Lcom/daaw/ti$b;

    const/4 p2, 0x0

    const/4 p3, 0x0

    :goto_0
    iget-object p4, p0, Lcom/daaw/ti;->c:[Lcom/daaw/ti$b;

    array-length v0, p4

    if-ge p3, v0, :cond_0

    new-instance v0, Lcom/daaw/ti$b;

    invoke-direct {v0, p0}, Lcom/daaw/ti$b;-><init>(Lcom/daaw/ti;)V

    aput-object v0, p4, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    array-length p1, p1

    new-array p1, p1, [Lcom/daaw/ti$c;

    iput-object p1, p0, Lcom/daaw/ti;->e:[Lcom/daaw/ti$c;

    :goto_1
    iget-object p1, p0, Lcom/daaw/ti;->e:[Lcom/daaw/ti$c;

    array-length p3, p1

    if-ge p2, p3, :cond_1

    new-instance p3, Lcom/daaw/ti$c;

    invoke-direct {p3, p0, p2}, Lcom/daaw/ti$c;-><init>(Lcom/daaw/ti;I)V

    aput-object p3, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static synthetic f(Lcom/daaw/ti;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ti;->A()V

    return-void
.end method

.method public static synthetic j(Lcom/daaw/ti;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ti;->B()V

    return-void
.end method

.method public static synthetic k(Lcom/daaw/ti;)Lcom/daaw/wc0$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ti;->f:Lcom/daaw/wc0$b;

    return-object p0
.end method

.method public static v(I)Ljava/lang/String;
    .locals 3

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "%05d"

    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 10

    iget-object v0, p0, Lcom/daaw/ti;->d:Lcom/daaw/wc0$a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ti;->c:[Lcom/daaw/ti$b;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v7, v0, v2

    iget v8, v7, Lcom/daaw/ti$b;->a:I

    add-int/2addr v3, v8

    iget v8, v7, Lcom/daaw/ti$b;->b:I

    add-int/2addr v4, v8

    iget-boolean v8, v7, Lcom/daaw/ti$b;->c:Z

    const/4 v9, 0x1

    if-eqz v8, :cond_1

    const/4 v5, 0x1

    :cond_1
    iget-boolean v7, v7, Lcom/daaw/ti$b;->d:Z

    if-eqz v7, :cond_2

    const/4 v6, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/daaw/ti;->d:Lcom/daaw/wc0$a;

    invoke-interface {v0, v3, v4, v5, v6}, Lcom/daaw/wc0$a;->b(IIZZ)V

    return-void
.end method

.method public final B()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/ti;->d:Lcom/daaw/wc0$a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ti;->c:[Lcom/daaw/ti$b;

    array-length v1, v0

    const/4 v2, 0x0

    const-string v3, ""

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v4, Lcom/daaw/ti$b;->e:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/ti;->d:Lcom/daaw/wc0$a;

    invoke-interface {v0, v3}, Lcom/daaw/wc0$a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a()I
    .locals 5

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-interface {v4}, Lcom/daaw/wc0;->a()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/daaw/wc0;->b()Z

    move-result v0

    return v0
.end method

.method public c(Z)V
    .locals 0

    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v0, v1, v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/wc0;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "invalid prefix value "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "invalid relativeAddressItem <"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ">"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public e()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g(Lcom/daaw/al;I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3, p1, p2}, Lcom/daaw/wc0;->g(Lcom/daaw/al;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Z)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    array-length v4, v3

    if-ge v2, v4, :cond_1

    aget-object v3, v3, v2

    invoke-interface {v3, p1}, Lcom/daaw/wc0;->h(Z)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v1, 0x0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/daaw/ti;->h:I

    return v0
.end method

.method public l()Lcom/daaw/me0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ti;->g:Lcom/daaw/me0;

    return-object v0
.end method

.method public m(ILandroid/content/Context;)Z
    .locals 0

    invoke-static {}, Lcom/daaw/q6;->j()V

    const/4 p1, 0x0

    return p1
.end method

.method public n(Ljava/lang/ref/WeakReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/wc0$a;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/wc0$a;

    iput-object p1, p0, Lcom/daaw/ti;->d:Lcom/daaw/wc0$a;

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object v0, v0, p1

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/daaw/ti;->c:[Lcom/daaw/ti$b;

    aget-object v2, v2, p1

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lcom/daaw/wc0;->n(Ljava/lang/ref/WeakReference;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3, p1, p2}, Lcom/daaw/wc0;->o(Landroid/content/Context;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public p(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0, p1}, Lcom/daaw/wc0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public q(Ljava/lang/ref/WeakReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/wc0$b;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/wc0$b;

    iput-object p1, p0, Lcom/daaw/ti;->f:Lcom/daaw/wc0$b;

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object v0, v0, p1

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/daaw/ti;->e:[Lcom/daaw/ti$c;

    aget-object v2, v2, p1

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lcom/daaw/wc0;->q(Ljava/lang/ref/WeakReference;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r(Landroid/content/Context;)Lcom/daaw/ts1;
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ti;->t(Landroid/content/Context;I)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1
.end method

.method public s()Lcom/daaw/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/lo1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/daaw/wc0;->s()Lcom/daaw/lo1;

    move-result-object v0

    return-object v0
.end method

.method public t(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ti;->i:Lcom/daaw/ti$a;

    invoke-interface {v0, p1, p2, p0}, Lcom/daaw/ti$a;->a(Landroid/content/Context;ILcom/daaw/wc0;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1
.end method

.method public u()Lcom/daaw/wc0$c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ti;->a:Lcom/daaw/wc0$c;

    return-object v0
.end method

.method public w()Lcom/daaw/wc0$b;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/daaw/wc0;->w()Lcom/daaw/wc0$b;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public x(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/sd0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/wc0;->x(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/sd0;)V

    return-void
.end method

.method public y(Lcom/daaw/sd0;)Z
    .locals 5

    iget-object v0, p0, Lcom/daaw/ti;->b:[Lcom/daaw/wc0;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4, p1}, Lcom/daaw/wc0;->y(Lcom/daaw/sd0;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public z()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.class public Lcom/daaw/px1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/px1$a;,
        Lcom/daaw/px1$n;,
        Lcom/daaw/px1$m;,
        Lcom/daaw/px1$e;,
        Lcom/daaw/px1$d;,
        Lcom/daaw/px1$c;,
        Lcom/daaw/px1$f;,
        Lcom/daaw/px1$b;,
        Lcom/daaw/px1$k;,
        Lcom/daaw/px1$j;,
        Lcom/daaw/px1$i;,
        Lcom/daaw/px1$h;,
        Lcom/daaw/px1$g;,
        Lcom/daaw/px1$l;
    }
.end annotation


# static fields
.field public static final b:Lcom/daaw/px1;


# instance fields
.field public final a:Lcom/daaw/px1$l;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/daaw/px1$k;->q:Lcom/daaw/px1;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/px1$l;->b:Lcom/daaw/px1;

    :goto_0
    sput-object v0, Lcom/daaw/px1;->b:Lcom/daaw/px1;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/daaw/px1$k;

    invoke-direct {v0, p0, p1}, Lcom/daaw/px1$k;-><init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V

    :goto_0
    iput-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Lcom/daaw/px1$j;

    invoke-direct {v0, p0, p1}, Lcom/daaw/px1$j;-><init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    new-instance v0, Lcom/daaw/px1$i;

    invoke-direct {v0, p0, p1}, Lcom/daaw/px1$i;-><init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    new-instance v0, Lcom/daaw/px1$h;

    invoke-direct {v0, p0, p1}, Lcom/daaw/px1$h;-><init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_3
    const/16 v1, 0x14

    if-lt v0, v1, :cond_4

    new-instance v0, Lcom/daaw/px1$g;

    invoke-direct {v0, p0, p1}, Lcom/daaw/px1$g;-><init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_4
    new-instance p1, Lcom/daaw/px1$l;

    invoke-direct {p1, p0}, Lcom/daaw/px1$l;-><init>(Lcom/daaw/px1;)V

    iput-object p1, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    :goto_1
    return-void
.end method

.method public constructor <init>(Lcom/daaw/px1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    iget-object p1, p1, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, Lcom/daaw/px1$k;

    if-eqz v1, :cond_0

    new-instance v0, Lcom/daaw/px1$k;

    move-object v1, p1

    check-cast v1, Lcom/daaw/px1$k;

    invoke-direct {v0, p0, v1}, Lcom/daaw/px1$k;-><init>(Lcom/daaw/px1;Lcom/daaw/px1$k;)V

    :goto_0
    iput-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    instance-of v1, p1, Lcom/daaw/px1$j;

    if-eqz v1, :cond_1

    new-instance v0, Lcom/daaw/px1$j;

    move-object v1, p1

    check-cast v1, Lcom/daaw/px1$j;

    invoke-direct {v0, p0, v1}, Lcom/daaw/px1$j;-><init>(Lcom/daaw/px1;Lcom/daaw/px1$j;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    instance-of v1, p1, Lcom/daaw/px1$i;

    if-eqz v1, :cond_2

    new-instance v0, Lcom/daaw/px1$i;

    move-object v1, p1

    check-cast v1, Lcom/daaw/px1$i;

    invoke-direct {v0, p0, v1}, Lcom/daaw/px1$i;-><init>(Lcom/daaw/px1;Lcom/daaw/px1$i;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    instance-of v1, p1, Lcom/daaw/px1$h;

    if-eqz v1, :cond_3

    new-instance v0, Lcom/daaw/px1$h;

    move-object v1, p1

    check-cast v1, Lcom/daaw/px1$h;

    invoke-direct {v0, p0, v1}, Lcom/daaw/px1$h;-><init>(Lcom/daaw/px1;Lcom/daaw/px1$h;)V

    goto :goto_0

    :cond_3
    const/16 v1, 0x14

    if-lt v0, v1, :cond_4

    instance-of v0, p1, Lcom/daaw/px1$g;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/daaw/px1$g;

    move-object v1, p1

    check-cast v1, Lcom/daaw/px1$g;

    invoke-direct {v0, p0, v1}, Lcom/daaw/px1$g;-><init>(Lcom/daaw/px1;Lcom/daaw/px1$g;)V

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/daaw/px1$l;

    invoke-direct {v0, p0}, Lcom/daaw/px1$l;-><init>(Lcom/daaw/px1;)V

    goto :goto_0

    :goto_1
    invoke-virtual {p1, p0}, Lcom/daaw/px1$l;->e(Lcom/daaw/px1;)V

    goto :goto_2

    :cond_5
    new-instance p1, Lcom/daaw/px1$l;

    invoke-direct {p1, p0}, Lcom/daaw/px1$l;-><init>(Lcom/daaw/px1;)V

    iput-object p1, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    :goto_2
    return-void
.end method

.method public static o(Lcom/daaw/gg0;IIII)Lcom/daaw/gg0;
    .locals 5

    iget v0, p0, Lcom/daaw/gg0;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, Lcom/daaw/gg0;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lcom/daaw/gg0;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, Lcom/daaw/gg0;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, Lcom/daaw/gg0;->b(IIII)Lcom/daaw/gg0;

    move-result-object p0

    return-object p0
.end method

.method public static w(Landroid/view/WindowInsets;)Lcom/daaw/px1;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/daaw/px1;->x(Landroid/view/WindowInsets;Landroid/view/View;)Lcom/daaw/px1;

    move-result-object p0

    return-object p0
.end method

.method public static x(Landroid/view/WindowInsets;Landroid/view/View;)Lcom/daaw/px1;
    .locals 1

    new-instance v0, Lcom/daaw/px1;

    invoke-static {p0}, Lcom/daaw/ty0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, Lcom/daaw/px1;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/daaw/xs1;->U(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lcom/daaw/xs1;->L(Landroid/view/View;)Lcom/daaw/px1;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/daaw/px1;->t(Lcom/daaw/px1;)V

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/daaw/px1;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Lcom/daaw/px1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->a()Lcom/daaw/px1;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/px1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->b()Lcom/daaw/px1;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/daaw/px1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->c()Lcom/daaw/px1;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0, p1}, Lcom/daaw/px1$l;->d(Landroid/view/View;)V

    return-void
.end method

.method public e()Lcom/daaw/hu;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->f()Lcom/daaw/hu;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/daaw/px1;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/daaw/px1;

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    iget-object p1, p1, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-static {v0, p1}, Lcom/daaw/pt0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(I)Lcom/daaw/gg0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0, p1}, Lcom/daaw/px1$l;->g(I)Lcom/daaw/gg0;

    move-result-object p1

    return-object p1
.end method

.method public g()Lcom/daaw/gg0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->h()Lcom/daaw/gg0;

    move-result-object v0

    return-object v0
.end method

.method public h()Lcom/daaw/gg0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->i()Lcom/daaw/gg0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/px1$l;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->k()Lcom/daaw/gg0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/gg0;->d:I

    return v0
.end method

.method public j()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->k()Lcom/daaw/gg0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/gg0;->a:I

    return v0
.end method

.method public k()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->k()Lcom/daaw/gg0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/gg0;->c:I

    return v0
.end method

.method public l()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->k()Lcom/daaw/gg0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/gg0;->b:I

    return v0
.end method

.method public m()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->k()Lcom/daaw/gg0;

    move-result-object v0

    sget-object v1, Lcom/daaw/gg0;->e:Lcom/daaw/gg0;

    invoke-virtual {v0, v1}, Lcom/daaw/gg0;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public n(IIII)Lcom/daaw/px1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/px1$l;->m(IIII)Lcom/daaw/px1;

    move-result-object p1

    return-object p1
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0}, Lcom/daaw/px1$l;->n()Z

    move-result v0

    return v0
.end method

.method public q(IIII)Lcom/daaw/px1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/daaw/px1$b;

    invoke-direct {v0, p0}, Lcom/daaw/px1$b;-><init>(Lcom/daaw/px1;)V

    invoke-static {p1, p2, p3, p4}, Lcom/daaw/gg0;->b(IIII)Lcom/daaw/gg0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/px1$b;->c(Lcom/daaw/gg0;)Lcom/daaw/px1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/px1$b;->a()Lcom/daaw/px1;

    move-result-object p1

    return-object p1
.end method

.method public r([Lcom/daaw/gg0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0, p1}, Lcom/daaw/px1$l;->p([Lcom/daaw/gg0;)V

    return-void
.end method

.method public s(Lcom/daaw/gg0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0, p1}, Lcom/daaw/px1$l;->q(Lcom/daaw/gg0;)V

    return-void
.end method

.method public t(Lcom/daaw/px1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0, p1}, Lcom/daaw/px1$l;->r(Lcom/daaw/px1;)V

    return-void
.end method

.method public u(Lcom/daaw/gg0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    invoke-virtual {v0, p1}, Lcom/daaw/px1$l;->s(Lcom/daaw/gg0;)V

    return-void
.end method

.method public v()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, Lcom/daaw/px1;->a:Lcom/daaw/px1$l;

    instance-of v1, v0, Lcom/daaw/px1$g;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/px1$g;

    iget-object v0, v0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

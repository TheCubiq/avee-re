.class public final Lcom/daaw/dx1;
.super Lcom/daaw/jd1;
.source ""


# instance fields
.field public final o:Lcom/daaw/cx1;

.field public final p:Lcom/daaw/rv0;

.field public final q:Lcom/daaw/bx1$b;

.field public final r:Lcom/daaw/kn;

.field public final s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/ax1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "WebvttDecoder"

    invoke-direct {p0, v0}, Lcom/daaw/jd1;-><init>(Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/cx1;

    invoke-direct {v0}, Lcom/daaw/cx1;-><init>()V

    iput-object v0, p0, Lcom/daaw/dx1;->o:Lcom/daaw/cx1;

    new-instance v0, Lcom/daaw/rv0;

    invoke-direct {v0}, Lcom/daaw/rv0;-><init>()V

    iput-object v0, p0, Lcom/daaw/dx1;->p:Lcom/daaw/rv0;

    new-instance v0, Lcom/daaw/bx1$b;

    invoke-direct {v0}, Lcom/daaw/bx1$b;-><init>()V

    iput-object v0, p0, Lcom/daaw/dx1;->q:Lcom/daaw/bx1$b;

    new-instance v0, Lcom/daaw/kn;

    invoke-direct {v0}, Lcom/daaw/kn;-><init>()V

    iput-object v0, p0, Lcom/daaw/dx1;->r:Lcom/daaw/kn;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/dx1;->s:Ljava/util/List;

    return-void
.end method

.method public static D(Lcom/daaw/rv0;)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ne v2, v1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v3

    invoke-virtual {p0}, Lcom/daaw/rv0;->k()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const-string v4, "STYLE"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v2, 0x2

    goto :goto_0

    :cond_1
    const-string v4, "NOTE"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v3}, Lcom/daaw/rv0;->J(I)V

    return v2
.end method

.method public static E(Lcom/daaw/rv0;)V
    .locals 1

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/rv0;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public C([BIZ)Lcom/daaw/gx1;
    .locals 2

    iget-object p3, p0, Lcom/daaw/dx1;->p:Lcom/daaw/rv0;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/rv0;->H([BI)V

    iget-object p1, p0, Lcom/daaw/dx1;->q:Lcom/daaw/bx1$b;

    invoke-virtual {p1}, Lcom/daaw/bx1$b;->c()V

    iget-object p1, p0, Lcom/daaw/dx1;->s:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/daaw/dx1;->p:Lcom/daaw/rv0;

    invoke-static {p1}, Lcom/daaw/fx1;->d(Lcom/daaw/rv0;)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/dx1;->p:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->k()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    :goto_1
    iget-object p2, p0, Lcom/daaw/dx1;->p:Lcom/daaw/rv0;

    invoke-static {p2}, Lcom/daaw/dx1;->D(Lcom/daaw/rv0;)I

    move-result p2

    if-eqz p2, :cond_5

    const/4 p3, 0x1

    if-ne p2, p3, :cond_2

    iget-object p2, p0, Lcom/daaw/dx1;->p:Lcom/daaw/rv0;

    invoke-static {p2}, Lcom/daaw/dx1;->E(Lcom/daaw/rv0;)V

    goto :goto_1

    :cond_2
    const/4 p3, 0x2

    if-ne p2, p3, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/daaw/dx1;->p:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->k()Ljava/lang/String;

    iget-object p2, p0, Lcom/daaw/dx1;->r:Lcom/daaw/kn;

    iget-object p3, p0, Lcom/daaw/dx1;->p:Lcom/daaw/rv0;

    invoke-virtual {p2, p3}, Lcom/daaw/kn;->d(Lcom/daaw/rv0;)Lcom/daaw/ax1;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p3, p0, Lcom/daaw/dx1;->s:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance p1, Lcom/daaw/vh1;

    const-string p2, "A style block was found after the first cue."

    invoke-direct {p1, p2}, Lcom/daaw/vh1;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const/4 p3, 0x3

    if-ne p2, p3, :cond_1

    iget-object p2, p0, Lcom/daaw/dx1;->o:Lcom/daaw/cx1;

    iget-object p3, p0, Lcom/daaw/dx1;->p:Lcom/daaw/rv0;

    iget-object v0, p0, Lcom/daaw/dx1;->q:Lcom/daaw/bx1$b;

    iget-object v1, p0, Lcom/daaw/dx1;->s:Ljava/util/List;

    invoke-virtual {p2, p3, v0, v1}, Lcom/daaw/cx1;->h(Lcom/daaw/rv0;Lcom/daaw/bx1$b;Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/daaw/dx1;->q:Lcom/daaw/bx1$b;

    invoke-virtual {p2}, Lcom/daaw/bx1$b;->a()Lcom/daaw/bx1;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lcom/daaw/dx1;->q:Lcom/daaw/bx1$b;

    invoke-virtual {p2}, Lcom/daaw/bx1$b;->c()V

    goto :goto_1

    :cond_5
    new-instance p2, Lcom/daaw/gx1;

    invoke-direct {p2, p1}, Lcom/daaw/gx1;-><init>(Ljava/util/List;)V

    return-object p2
.end method

.method public bridge synthetic z([BIZ)Lcom/daaw/th1;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/dx1;->C([BIZ)Lcom/daaw/gx1;

    move-result-object p1

    return-object p1
.end method

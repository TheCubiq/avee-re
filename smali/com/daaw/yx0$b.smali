.class public Lcom/daaw/yx0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yx0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/uw1$a<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Ljava/util/List<",
        "Lcom/daaw/tx0;",
        ">;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yx0;


# direct methods
.method public constructor <init>(Lcom/daaw/yx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yx0$b;->a:Lcom/daaw/yx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/util/List;

    check-cast p4, Ljava/lang/Boolean;

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/yx0$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    new-instance p1, Lcom/daaw/wf1;

    invoke-direct {p1}, Lcom/daaw/wf1;-><init>()V

    invoke-static {}, Lcom/daaw/lx0;->h()Lcom/daaw/lx0;

    move-result-object v0

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/lx0;->b(Lcom/daaw/wf1;Ljava/lang/String;Ljava/util/List;ZZ)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/yx0$b;->a:Lcom/daaw/yx0;

    invoke-static {p3}, Lcom/daaw/yx0;->e(Lcom/daaw/yx0;)V

    invoke-static {}, Lcom/daaw/dx0;->b()Landroid/content/Context;

    move-result-object p3

    if-eqz p3, :cond_2

    if-lez p2, :cond_1

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 p4, 0x0

    const/4 p5, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0e0013

    new-array p5, p5, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p5, p4

    invoke-virtual {p1, p3, p2, p5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0e000e

    new-array p5, p5, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p5, p4

    invoke-virtual {p1, p3, p2, p5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    sget-object p2, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/wf1;->f()Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {p1}, Lcom/daaw/wf1;->e()Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-virtual {p2, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

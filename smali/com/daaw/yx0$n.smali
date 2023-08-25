.class public Lcom/daaw/yx0$n;
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
        "Lcom/daaw/kx0;",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yx0;


# direct methods
.method public constructor <init>(Lcom/daaw/yx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yx0$n;->a:Lcom/daaw/yx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lcom/daaw/kx0;

    check-cast p4, Ljava/util/List;

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/yx0$n;->b(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/kx0;Ljava/util/List;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/kx0;Ljava/util/List;Ljava/lang/Boolean;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/kx0;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/dx0;->b()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_2

    :cond_1
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/j5;->p(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v1, "pref_playlistDefaultPath"

    const-string v2, "\\Playlists\\"

    invoke-static {p1, v1, v2}, Lcom/daaw/j5;->P(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    new-instance v1, Lcom/daaw/wf1;

    invoke-direct {v1}, Lcom/daaw/wf1;-><init>()V

    invoke-static {p1, p2, p3}, Lcom/daaw/lx0;->f(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/kx0;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/daaw/lx0;->h()Lcom/daaw/lx0;

    move-result-object v2

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    move-object v3, v1

    move-object v4, p1

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/lx0;->c(Lcom/daaw/wf1;Ljava/lang/String;Lcom/daaw/kx0;Ljava/util/List;Z)I

    move-result p2

    const/4 p3, 0x1

    if-lez p2, :cond_3

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const p5, 0x7f0e0013

    new-array v1, p3, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p4, p5, p2, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    sget-object p4, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {p4, p2}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lcom/daaw/wf1;->f()Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {v1}, Lcom/daaw/wf1;->e()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_4
    :goto_0
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    invoke-virtual {p2, v0, p1, p3}, Lcom/daaw/j5;->E(Landroid/content/Context;Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/daaw/yx0$n;->a:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->e(Lcom/daaw/yx0;)V

    :cond_5
    return-void
.end method

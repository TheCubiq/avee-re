.class public Landroidx/fragment/app/b$l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# instance fields
.field public final a:Landroidx/fragment/app/l$e;

.field public final b:Lcom/daaw/wd;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/l$e;Lcom/daaw/wd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/l$e;

    iput-object p2, p0, Landroidx/fragment/app/b$l;->b:Lcom/daaw/wd;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/l$e;

    iget-object v1, p0, Landroidx/fragment/app/b$l;->b:Lcom/daaw/wd;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/l$e;->d(Lcom/daaw/wd;)V

    return-void
.end method

.method public b()Landroidx/fragment/app/l$e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/l$e;

    return-object v0
.end method

.method public c()Lcom/daaw/wd;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/b$l;->b:Lcom/daaw/wd;

    return-object v0
.end method

.method public d()Z
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/l$e;

    invoke-virtual {v0}, Landroidx/fragment/app/l$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->W:Landroid/view/View;

    invoke-static {v0}, Landroidx/fragment/app/l$e$c;->c(Landroid/view/View;)Landroidx/fragment/app/l$e$c;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/b$l;->a:Landroidx/fragment/app/l$e;

    invoke-virtual {v1}, Landroidx/fragment/app/l$e;->e()Landroidx/fragment/app/l$e$c;

    move-result-object v1

    if-eq v0, v1, :cond_1

    sget-object v2, Landroidx/fragment/app/l$e$c;->q:Landroidx/fragment/app/l$e$c;

    if-eq v0, v2, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

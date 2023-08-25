.class public Lcom/daaw/xn$a;
.super Landroidx/recyclerview/widget/RecyclerView$i;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xn;-><init>(Landroid/content/Context;IILcom/daaw/wn;Lcom/daaw/w40;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xn;


# direct methods
.method public constructor <init>(Lcom/daaw/xn;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xn$a;->a:Lcom/daaw/xn;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xn$a;->a:Lcom/daaw/xn;

    invoke-static {v0}, Lcom/daaw/xn;->z(Lcom/daaw/xn;)Lcom/daaw/wn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/wn;->d()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/xn;->y(Lcom/daaw/xn;Z)Z

    iget-object v0, p0, Lcom/daaw/xn$a;->a:Lcom/daaw/xn;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    return-void
.end method

.method public b(II)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xn$a;->a:Lcom/daaw/xn;

    invoke-static {v0}, Lcom/daaw/xn;->z(Lcom/daaw/xn;)Lcom/daaw/wn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/wn;->d()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/xn;->y(Lcom/daaw/xn;Z)Z

    iget-object v0, p0, Lcom/daaw/xn$a;->a:Lcom/daaw/xn;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->k(II)V

    return-void
.end method

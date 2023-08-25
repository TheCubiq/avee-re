.class public Lcom/daaw/cs0$h;
.super Landroidx/recyclerview/widget/k;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/cs0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field public final synthetic f:Lcom/daaw/cs0;


# direct methods
.method public constructor <init>(Lcom/daaw/cs0;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cs0$h;->f:Lcom/daaw/cs0;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/k;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;Lcom/daaw/y;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/k;->g(Landroid/view/View;Lcom/daaw/y;)V

    iget-object p1, p0, Lcom/daaw/cs0$h;->f:Lcom/daaw/cs0;

    iget-object p1, p1, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    invoke-virtual {p1}, Lcom/daaw/cs0$c;->A()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lcom/daaw/y$b;->a(IIZ)Lcom/daaw/y$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/y;->d0(Ljava/lang/Object;)V

    return-void
.end method

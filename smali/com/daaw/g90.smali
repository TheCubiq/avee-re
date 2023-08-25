.class public Lcom/daaw/g90;
.super Lcom/daaw/ma;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 2

    invoke-static {p1}, Lcom/daaw/gr1;->p(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c007f

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1, v1, v1}, Lcom/daaw/ma;-><init>(Landroid/view/View;IZ)V

    return-void
.end method


# virtual methods
.method public O(Lcom/daaw/wc0;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/ma;->O(Lcom/daaw/wc0;I)V

    return-void
.end method

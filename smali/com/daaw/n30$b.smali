.class public Lcom/daaw/n30$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lu$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/n30;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/n30;


# direct methods
.method public constructor <init>(Lcom/daaw/n30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n30$b;->a:Lcom/daaw/n30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/n30$b;->a:Lcom/daaw/n30;

    invoke-static {v1}, Lcom/daaw/n30;->l(Lcom/daaw/n30;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v1

    check-cast v1, Lcom/daaw/ts1;

    invoke-virtual {v1, p1, p2, v0}, Lcom/daaw/ts1;->A(IILjava/util/List;)V

    return-void
.end method

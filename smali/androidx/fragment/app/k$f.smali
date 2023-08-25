.class public Landroidx/fragment/app/k$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/k;->l(Lcom/daaw/a40;Landroid/view/ViewGroup;Landroid/view/View;Lcom/daaw/g6;Landroidx/fragment/app/k$h;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic A:Landroid/graphics/Rect;

.field public final synthetic p:Lcom/daaw/a40;

.field public final synthetic q:Lcom/daaw/g6;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Landroidx/fragment/app/k$h;

.field public final synthetic t:Ljava/util/ArrayList;

.field public final synthetic u:Landroid/view/View;

.field public final synthetic v:Landroidx/fragment/app/Fragment;

.field public final synthetic w:Landroidx/fragment/app/Fragment;

.field public final synthetic x:Z

.field public final synthetic y:Ljava/util/ArrayList;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/daaw/a40;Lcom/daaw/g6;Ljava/lang/Object;Landroidx/fragment/app/k$h;Ljava/util/ArrayList;Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/k$f;->p:Lcom/daaw/a40;

    iput-object p2, p0, Landroidx/fragment/app/k$f;->q:Lcom/daaw/g6;

    iput-object p3, p0, Landroidx/fragment/app/k$f;->r:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/fragment/app/k$f;->s:Landroidx/fragment/app/k$h;

    iput-object p5, p0, Landroidx/fragment/app/k$f;->t:Ljava/util/ArrayList;

    iput-object p6, p0, Landroidx/fragment/app/k$f;->u:Landroid/view/View;

    iput-object p7, p0, Landroidx/fragment/app/k$f;->v:Landroidx/fragment/app/Fragment;

    iput-object p8, p0, Landroidx/fragment/app/k$f;->w:Landroidx/fragment/app/Fragment;

    iput-boolean p9, p0, Landroidx/fragment/app/k$f;->x:Z

    iput-object p10, p0, Landroidx/fragment/app/k$f;->y:Ljava/util/ArrayList;

    iput-object p11, p0, Landroidx/fragment/app/k$f;->z:Ljava/lang/Object;

    iput-object p12, p0, Landroidx/fragment/app/k$f;->A:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/k$f;->p:Lcom/daaw/a40;

    iget-object v1, p0, Landroidx/fragment/app/k$f;->q:Lcom/daaw/g6;

    iget-object v2, p0, Landroidx/fragment/app/k$f;->r:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/fragment/app/k$f;->s:Landroidx/fragment/app/k$h;

    invoke-static {v0, v1, v2, v3}, Landroidx/fragment/app/k;->h(Lcom/daaw/a40;Lcom/daaw/g6;Ljava/lang/Object;Landroidx/fragment/app/k$h;)Lcom/daaw/g6;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/k$f;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/daaw/g6;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/fragment/app/k$f;->t:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/k$f;->u:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/k$f;->v:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Landroidx/fragment/app/k$f;->w:Landroidx/fragment/app/Fragment;

    iget-boolean v3, p0, Landroidx/fragment/app/k$f;->x:Z

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v0, v4}, Landroidx/fragment/app/k;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLcom/daaw/g6;Z)V

    iget-object v1, p0, Landroidx/fragment/app/k$f;->r:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v2, p0, Landroidx/fragment/app/k$f;->p:Lcom/daaw/a40;

    iget-object v3, p0, Landroidx/fragment/app/k$f;->y:Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/fragment/app/k$f;->t:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v3, v4}, Lcom/daaw/a40;->A(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    iget-object v1, p0, Landroidx/fragment/app/k$f;->s:Landroidx/fragment/app/k$h;

    iget-object v2, p0, Landroidx/fragment/app/k$f;->z:Ljava/lang/Object;

    iget-boolean v3, p0, Landroidx/fragment/app/k$f;->x:Z

    invoke-static {v0, v1, v2, v3}, Landroidx/fragment/app/k;->s(Lcom/daaw/g6;Landroidx/fragment/app/k$h;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/k$f;->p:Lcom/daaw/a40;

    iget-object v2, p0, Landroidx/fragment/app/k$f;->A:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/a40;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.class public Landroidx/fragment/app/k$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/k;->m(Lcom/daaw/a40;Landroid/view/ViewGroup;Landroid/view/View;Lcom/daaw/g6;Landroidx/fragment/app/k$h;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroidx/fragment/app/Fragment;

.field public final synthetic q:Landroidx/fragment/app/Fragment;

.field public final synthetic r:Z

.field public final synthetic s:Lcom/daaw/g6;

.field public final synthetic t:Landroid/view/View;

.field public final synthetic u:Lcom/daaw/a40;

.field public final synthetic v:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLcom/daaw/g6;Landroid/view/View;Lcom/daaw/a40;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/k$e;->p:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/k$e;->q:Landroidx/fragment/app/Fragment;

    iput-boolean p3, p0, Landroidx/fragment/app/k$e;->r:Z

    iput-object p4, p0, Landroidx/fragment/app/k$e;->s:Lcom/daaw/g6;

    iput-object p5, p0, Landroidx/fragment/app/k$e;->t:Landroid/view/View;

    iput-object p6, p0, Landroidx/fragment/app/k$e;->u:Lcom/daaw/a40;

    iput-object p7, p0, Landroidx/fragment/app/k$e;->v:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/k$e;->p:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Landroidx/fragment/app/k$e;->q:Landroidx/fragment/app/Fragment;

    iget-boolean v2, p0, Landroidx/fragment/app/k$e;->r:Z

    iget-object v3, p0, Landroidx/fragment/app/k$e;->s:Lcom/daaw/g6;

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/fragment/app/k;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLcom/daaw/g6;Z)V

    iget-object v0, p0, Landroidx/fragment/app/k$e;->t:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/k$e;->u:Lcom/daaw/a40;

    iget-object v2, p0, Landroidx/fragment/app/k$e;->v:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/a40;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method

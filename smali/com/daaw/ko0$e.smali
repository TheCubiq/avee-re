.class public Lcom/daaw/ko0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ko0;->v(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ko0;


# direct methods
.method public constructor <init>(Lcom/daaw/ko0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ko0$e;->p:Lcom/daaw/ko0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    new-instance v0, Lcom/daaw/al;

    invoke-direct {v0, p1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    invoke-virtual {v0}, Lcom/daaw/al;->d()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ko0$e;->p:Lcom/daaw/ko0;

    invoke-static {v1}, Lcom/daaw/ko0;->l(Lcom/daaw/ko0;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/wv1;

    invoke-static {v1}, Lcom/daaw/gr1;->k(Landroid/widget/PopupWindow;)V

    iget-object v1, p0, Lcom/daaw/ko0$e;->p:Lcom/daaw/ko0;

    new-instance v2, Ljava/lang/ref/WeakReference;

    new-instance v3, Lcom/daaw/wv1;

    invoke-direct {v3, v0, p1}, Lcom/daaw/wv1;-><init>(Landroid/view/LayoutInflater;Landroid/view/View;)V

    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lcom/daaw/ko0;->m(Lcom/daaw/ko0;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    return-void
.end method

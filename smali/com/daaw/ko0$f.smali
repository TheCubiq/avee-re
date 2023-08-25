.class public Lcom/daaw/ko0$f;
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

    iput-object p1, p0, Lcom/daaw/ko0$f;->p:Lcom/daaw/ko0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ko0$f;->p:Lcom/daaw/ko0;

    invoke-static {v0}, Lcom/daaw/ko0;->n(Lcom/daaw/ko0;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gl1;

    invoke-static {v0}, Lcom/daaw/gr1;->k(Landroid/widget/PopupWindow;)V

    iget-object v0, p0, Lcom/daaw/ko0$f;->p:Lcom/daaw/ko0;

    new-instance v1, Ljava/lang/ref/WeakReference;

    new-instance v2, Lcom/daaw/gl1;

    invoke-direct {v2, p1}, Lcom/daaw/gl1;-><init>(Landroid/view/View;)V

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/daaw/ko0;->o(Lcom/daaw/ko0;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    return-void
.end method

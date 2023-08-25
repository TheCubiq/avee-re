.class public Lcom/daaw/no$d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->H(Lcom/daaw/un;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/view/ViewGroup;

.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/daaw/no;


# direct methods
.method public constructor <init>(Lcom/daaw/no;Landroid/view/ViewGroup;Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$d0;->s:Lcom/daaw/no;

    iput-object p2, p0, Lcom/daaw/no$d0;->p:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/daaw/no$d0;->q:Landroid/view/View;

    iput-object p4, p0, Lcom/daaw/no$d0;->r:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/no$d0;->p:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/no$d0;->q:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    iget-object p1, p0, Lcom/daaw/no$d0;->p:Landroid/view/ViewGroup;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/no$d0;->s:Lcom/daaw/no;

    invoke-static {p1}, Lcom/daaw/no;->h(Lcom/daaw/no;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/no$d0;->r:Ljava/lang/String;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/no$d0;->q:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 v0, -0x3d4c0000    # -90.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    iget-object p1, p0, Lcom/daaw/no$d0;->p:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/no$d0;->s:Lcom/daaw/no;

    invoke-static {p1}, Lcom/daaw/no;->h(Lcom/daaw/no;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/no$d0;->r:Ljava/lang/String;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_0
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

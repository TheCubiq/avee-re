.class public Lcom/daaw/a4$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vt0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/a4;->j0()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/a4;


# direct methods
.method public constructor <init>(Lcom/daaw/a4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a4$c;->a:Lcom/daaw/a4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lcom/daaw/px1;)Lcom/daaw/px1;
    .locals 4

    invoke-virtual {p2}, Lcom/daaw/px1;->l()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/a4$c;->a:Lcom/daaw/a4;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Lcom/daaw/a4;->h1(Lcom/daaw/px1;Landroid/graphics/Rect;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/daaw/px1;->j()I

    move-result v0

    invoke-virtual {p2}, Lcom/daaw/px1;->k()I

    move-result v2

    invoke-virtual {p2}, Lcom/daaw/px1;->i()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Lcom/daaw/px1;->q(IIII)Lcom/daaw/px1;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, Lcom/daaw/xs1;->d0(Landroid/view/View;Lcom/daaw/px1;)Lcom/daaw/px1;

    move-result-object p1

    return-object p1
.end method

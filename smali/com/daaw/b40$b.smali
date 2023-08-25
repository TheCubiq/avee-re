.class public Lcom/daaw/b40$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/in1$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/b40;->r(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lcom/daaw/b40;


# direct methods
.method public constructor <init>(Lcom/daaw/b40;Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/b40$b;->c:Lcom/daaw/b40;

    iput-object p2, p0, Lcom/daaw/b40$b;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/daaw/b40$b;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/in1;)V
    .locals 3

    invoke-virtual {p1, p0}, Lcom/daaw/in1;->T(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    iget-object p1, p0, Lcom/daaw/b40$b;->a:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/b40$b;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    iget-object v2, p0, Lcom/daaw/b40$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Lcom/daaw/in1;)V
    .locals 0

    return-void
.end method

.method public c(Lcom/daaw/in1;)V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/in1;)V
    .locals 0

    return-void
.end method

.method public e(Lcom/daaw/in1;)V
    .locals 0

    return-void
.end method

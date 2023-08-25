.class public Lcom/daaw/iv1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/iv1;->i(ILjava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:Lcom/daaw/iv1;


# direct methods
.method public constructor <init>(Lcom/daaw/iv1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/iv1$f;->q:Lcom/daaw/iv1;

    iput-object p2, p0, Lcom/daaw/iv1$f;->p:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/iv1$f;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/iv1$f;->p:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/sv1;

    iget-object v1, p0, Lcom/daaw/iv1$f;->q:Lcom/daaw/iv1;

    iget-object v2, v1, Lcom/daaw/iv1;->w:[Landroid/view/View;

    invoke-static {v1, v2, p1, v0}, Lcom/daaw/iv1;->c(Lcom/daaw/iv1;[Landroid/view/View;Landroid/view/View;Lcom/daaw/sv1;)V

    sget-object p1, Lcom/daaw/iv1;->z:Lcom/daaw/qw1;

    invoke-virtual {p1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

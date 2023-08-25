.class public Lcom/daaw/nn0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hc1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/nn0;-><init>(Lcom/daaw/nn0$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nn0;


# direct methods
.method public constructor <init>(Lcom/daaw/nn0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nn0$a;->a:Lcom/daaw/nn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ic1;Landroid/graphics/Matrix;I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nn0$a;->a:Lcom/daaw/nn0;

    invoke-static {v0}, Lcom/daaw/nn0;->b(Lcom/daaw/nn0;)Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/ic1;->e()Z

    move-result v1

    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, Lcom/daaw/nn0$a;->a:Lcom/daaw/nn0;

    invoke-static {v0}, Lcom/daaw/nn0;->c(Lcom/daaw/nn0;)[Lcom/daaw/ic1$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lcom/daaw/ic1;->f(Landroid/graphics/Matrix;)Lcom/daaw/ic1$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

.method public b(Lcom/daaw/ic1;Landroid/graphics/Matrix;I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/nn0$a;->a:Lcom/daaw/nn0;

    invoke-static {v0}, Lcom/daaw/nn0;->b(Lcom/daaw/nn0;)Ljava/util/BitSet;

    move-result-object v0

    add-int/lit8 v1, p3, 0x4

    invoke-virtual {p1}, Lcom/daaw/ic1;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, Lcom/daaw/nn0$a;->a:Lcom/daaw/nn0;

    invoke-static {v0}, Lcom/daaw/nn0;->d(Lcom/daaw/nn0;)[Lcom/daaw/ic1$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lcom/daaw/ic1;->f(Landroid/graphics/Matrix;)Lcom/daaw/ic1$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

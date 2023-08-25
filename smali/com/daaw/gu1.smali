.class public Lcom/daaw/gu1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/nu1;

.field public static final b:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/daaw/mu1;

    invoke-direct {v0}, Lcom/daaw/mu1;-><init>()V

    :goto_0
    sput-object v0, Lcom/daaw/gu1;->a:Lcom/daaw/nu1;

    goto :goto_1

    :cond_0
    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    new-instance v0, Lcom/daaw/lu1;

    invoke-direct {v0}, Lcom/daaw/lu1;-><init>()V

    goto :goto_0

    :cond_1
    const/16 v1, 0x16

    if-lt v0, v1, :cond_2

    new-instance v0, Lcom/daaw/ku1;

    invoke-direct {v0}, Lcom/daaw/ku1;-><init>()V

    goto :goto_0

    :cond_2
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    new-instance v0, Lcom/daaw/ju1;

    invoke-direct {v0}, Lcom/daaw/ju1;-><init>()V

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/daaw/iu1;

    invoke-direct {v0}, Lcom/daaw/iu1;-><init>()V

    goto :goto_0

    :goto_1
    new-instance v0, Lcom/daaw/gu1$a;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    invoke-direct {v0, v1, v2}, Lcom/daaw/gu1$a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/gu1;->b:Landroid/util/Property;

    new-instance v0, Lcom/daaw/gu1$b;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    invoke-direct {v0, v1, v2}, Lcom/daaw/gu1$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/gu1;->c:Landroid/util/Property;

    return-void
.end method

.method public static a(Landroid/view/View;)V
    .locals 1

    sget-object v0, Lcom/daaw/gu1;->a:Lcom/daaw/nu1;

    invoke-virtual {v0, p0}, Lcom/daaw/nu1;->a(Landroid/view/View;)V

    return-void
.end method

.method public static b(Landroid/view/View;)Lcom/daaw/rt1;
    .locals 1

    new-instance v0, Lcom/daaw/qt1;

    invoke-direct {v0, p0}, Lcom/daaw/qt1;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public static c(Landroid/view/View;)F
    .locals 1

    sget-object v0, Lcom/daaw/gu1;->a:Lcom/daaw/nu1;

    invoke-virtual {v0, p0}, Lcom/daaw/nu1;->c(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static d(Landroid/view/View;)Lcom/daaw/ox1;
    .locals 1

    new-instance v0, Lcom/daaw/nx1;

    invoke-direct {v0, p0}, Lcom/daaw/nx1;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public static e(Landroid/view/View;)V
    .locals 1

    sget-object v0, Lcom/daaw/gu1;->a:Lcom/daaw/nu1;

    invoke-virtual {v0, p0}, Lcom/daaw/nu1;->d(Landroid/view/View;)V

    return-void
.end method

.method public static f(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, Lcom/daaw/gu1;->a:Lcom/daaw/nu1;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/nu1;->e(Landroid/view/View;IIII)V

    return-void
.end method

.method public static g(Landroid/view/View;F)V
    .locals 1

    sget-object v0, Lcom/daaw/gu1;->a:Lcom/daaw/nu1;

    invoke-virtual {v0, p0, p1}, Lcom/daaw/nu1;->f(Landroid/view/View;F)V

    return-void
.end method

.method public static h(Landroid/view/View;I)V
    .locals 1

    sget-object v0, Lcom/daaw/gu1;->a:Lcom/daaw/nu1;

    invoke-virtual {v0, p0, p1}, Lcom/daaw/nu1;->g(Landroid/view/View;I)V

    return-void
.end method

.method public static i(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, Lcom/daaw/gu1;->a:Lcom/daaw/nu1;

    invoke-virtual {v0, p0, p1}, Lcom/daaw/nu1;->h(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static j(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, Lcom/daaw/gu1;->a:Lcom/daaw/nu1;

    invoke-virtual {v0, p0, p1}, Lcom/daaw/nu1;->i(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

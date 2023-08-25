.class public Lcom/daaw/pv1$o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ww1$a<",
        "Landroid/content/Context;",
        "Lcom/daaw/om1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$o;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lcom/daaw/om1;
    .locals 2

    new-instance p1, Lcom/daaw/om1;

    invoke-direct {p1}, Lcom/daaw/om1;-><init>()V

    invoke-static {}, Lcom/daaw/b5;->d()J

    move-result-wide v0

    long-to-float v0, v0

    iput v0, p1, Lcom/daaw/om1;->a:F

    invoke-static {}, Lcom/daaw/b5;->c()J

    move-result-wide v0

    long-to-float v0, v0

    iput v0, p1, Lcom/daaw/om1;->b:F

    iget v1, p1, Lcom/daaw/om1;->a:F

    div-float/2addr v1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p1, Lcom/daaw/om1;->c:F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p1, Lcom/daaw/om1;->c:F

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/daaw/pv1$o;->a(Landroid/content/Context;)Lcom/daaw/om1;

    move-result-object p1

    return-object p1
.end method

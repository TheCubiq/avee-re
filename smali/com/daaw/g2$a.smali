.class public Lcom/daaw/g2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pj1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/g2;->s(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/af0;IIIIZLcom/daaw/ye0;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/pj1<",
        "Lcom/daaw/l70;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/af0;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/daaw/ye0;

.field public final synthetic t:I

.field public final synthetic u:I

.field public final synthetic v:Lcom/daaw/g2;


# direct methods
.method public constructor <init>(Lcom/daaw/g2;Lcom/daaw/af0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;II)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g2$a;->v:Lcom/daaw/g2;

    iput-object p2, p0, Lcom/daaw/g2$a;->p:Lcom/daaw/af0;

    iput-object p3, p0, Lcom/daaw/g2$a;->q:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/g2$a;->r:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/g2$a;->s:Lcom/daaw/ye0;

    iput p6, p0, Lcom/daaw/g2$a;->t:I

    iput p7, p0, Lcom/daaw/g2$a;->u:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lcom/daaw/l41;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Lcom/daaw/f70;)V
    .locals 0

    check-cast p1, Lcom/daaw/l70;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/g2$a;->d(Lcom/daaw/l70;Lcom/daaw/f70;)V

    return-void
.end method

.method public d(Lcom/daaw/l70;Lcom/daaw/f70;)V
    .locals 3

    iget-object p2, p0, Lcom/daaw/g2$a;->p:Lcom/daaw/af0;

    iget-object v0, p0, Lcom/daaw/g2$a;->q:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/g2$a;->r:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/g2$a;->s:Lcom/daaw/ye0;

    invoke-static {p2, p1, v0, v1, v2}, Lcom/daaw/g2;->i(Lcom/daaw/af0;Lcom/daaw/l70;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;)V

    return-void
.end method

.method public e(Lcom/daaw/sd1;)V
    .locals 2

    iget v0, p0, Lcom/daaw/g2$a;->t:I

    if-lez v0, :cond_0

    iget v1, p0, Lcom/daaw/g2$a;->u:I

    if-lez v1, :cond_0

    invoke-interface {p1, v0, v1}, Lcom/daaw/sd1;->f(II)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x100

    invoke-interface {p1, v0, v0}, Lcom/daaw/sd1;->f(II)V

    :goto_0
    return-void
.end method

.method public g(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/g2$a;->p:Lcom/daaw/af0;

    iget-object p2, p0, Lcom/daaw/g2$a;->q:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/g2$a;->r:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, v1, p2, v0}, Lcom/daaw/af0;->b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public j()Lcom/daaw/l41;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public k(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

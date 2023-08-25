.class public Lcom/daaw/pv1$u0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


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
        "Lcom/daaw/rw1$a<",
        "Ljava/lang/Float;",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 3

    iget-object p2, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-virtual {p2}, Lcom/daaw/pv1;->S()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p2, p1}, Lcom/daaw/pv1;->H(Lcom/daaw/pv1;F)F

    :cond_0
    iget-object p1, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-static {p1}, Lcom/daaw/pv1;->j(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-static {p2}, Lcom/daaw/pv1;->I(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/bs1;->f(Lcom/daaw/bs1;)F

    move-result p1

    const p2, 0x3dcccccd    # 0.1f

    cmpg-float p1, p1, p2

    if-gez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-static {p1}, Lcom/daaw/pv1;->I(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    iget-object p2, p2, Lcom/daaw/pv1;->k:Ljava/util/Random;

    invoke-virtual {p2}, Ljava/util/Random;->nextFloat()F

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p2, p2, v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr p2, v1

    iput p2, p1, Lcom/daaw/bs1;->a:F

    iget-object p1, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-static {p1}, Lcom/daaw/pv1;->I(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    iget-object p2, p2, Lcom/daaw/pv1;->k:Ljava/util/Random;

    invoke-virtual {p2}, Ljava/util/Random;->nextFloat()F

    move-result p2

    mul-float p2, p2, v0

    sub-float/2addr p2, v1

    iput p2, p1, Lcom/daaw/bs1;->b:F

    iget-object p1, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-static {p1}, Lcom/daaw/pv1;->I(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/bs1;->o()Lcom/daaw/bs1;

    :cond_1
    iget-object p1, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-static {p1}, Lcom/daaw/pv1;->j(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-static {p2}, Lcom/daaw/pv1;->j(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/pv1$u0;->a:Lcom/daaw/pv1;

    invoke-static {v0}, Lcom/daaw/pv1;->I(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object v0

    const-wide v1, 0x3fecccccc0000000L    # 0.8999999761581421

    invoke-static {p1, p2, v0, v1, v2}, Lcom/daaw/tg0;->b(Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bs1;D)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Float;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pv1$u0;->a(Ljava/lang/Float;Ljava/lang/Float;)V

    return-void
.end method

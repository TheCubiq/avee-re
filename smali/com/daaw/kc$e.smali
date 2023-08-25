.class public Lcom/daaw/kc$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/kc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g0<",
        "Lcom/daaw/y31;",
        "Lcom/daaw/sr1;",
        "Lcom/daaw/w31;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/kc;


# direct methods
.method public constructor <init>(Lcom/daaw/kc;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kc$e;->a:Lcom/daaw/kc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Lcom/daaw/sr1;

    check-cast p3, Lcom/daaw/w31;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/kc$e;->b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V

    return-void
.end method

.method public b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/y31;->K()[F

    move-result-object p1

    const-string v0, "u_projView"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, p1}, Lcom/daaw/sr1;->E(Ljava/lang/String;Z[F)V

    invoke-virtual {p3}, Lcom/daaw/w31;->f()Lcom/daaw/qc0;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/qc0;->getWidth()I

    move-result p3

    int-to-float p3, p3

    const/high16 v0, 0x3f800000    # 1.0f

    div-float p3, v0, p3

    invoke-interface {p1}, Lcom/daaw/qc0;->getHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v0, p1

    const-string p1, "resolution"

    invoke-virtual {p2, p1, p3, v0}, Lcom/daaw/dc1;->t(Ljava/lang/String;FF)V

    iget-object p1, p0, Lcom/daaw/kc$e;->a:Lcom/daaw/kc;

    invoke-static {p1}, Lcom/daaw/kc;->b0(Lcom/daaw/kc;)F

    move-result p1

    const/high16 p3, 0x40000000    # 2.0f

    mul-float p1, p1, p3

    const-string p3, "blurWH"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    return-void
.end method

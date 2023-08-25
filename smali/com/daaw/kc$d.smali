.class public Lcom/daaw/kc$d;
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

    iput-object p1, p0, Lcom/daaw/kc$d;->a:Lcom/daaw/kc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Lcom/daaw/sr1;

    check-cast p3, Lcom/daaw/w31;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/kc$d;->b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V

    return-void
.end method

.method public b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V
    .locals 8

    iget-object p1, p0, Lcom/daaw/kc$d;->a:Lcom/daaw/kc;

    invoke-static {p1}, Lcom/daaw/kc;->Z(Lcom/daaw/kc;)Lcom/daaw/pr1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/pr1;->a()[F

    move-result-object p1

    const-string v0, "u_projView"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, p1}, Lcom/daaw/sr1;->E(Ljava/lang/String;Z[F)V

    const/4 p1, 0x4

    new-array p1, p1, [F

    iget-object v0, p0, Lcom/daaw/kc$d;->a:Lcom/daaw/kc;

    invoke-static {v0}, Lcom/daaw/kc;->a0(Lcom/daaw/kc;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/daaw/f80;->n([FI)V

    aget v4, p1, v1

    const/4 v0, 0x1

    aget v5, p1, v0

    const/4 v2, 0x2

    aget v6, p1, v2

    const/4 v2, 0x3

    aget v7, p1, v2

    const-string v3, "Color2"

    move-object v2, p2

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/dc1;->v(Ljava/lang/String;FFFF)V

    const-string p1, "saturation"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p2, p1, v2}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    const-string p1, "maskadd"

    const/4 v3, 0x0

    invoke-virtual {p2, p1, v3}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    const-string p1, "maskmul"

    invoke-virtual {p2, p1, v2}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    const-string p1, "mask_l_add"

    invoke-virtual {p2, p1, v2}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    const-string p1, "mask_l_mul"

    invoke-virtual {p2, p1, v3}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p3, v1}, Lcom/daaw/w31;->e(I)Z

    move-result p1

    invoke-virtual {p3, v0}, Lcom/daaw/w31;->e(I)Z

    move-result p3

    const-string v0, "tex2_y_mul"

    const-string v1, "tex2_y_add"

    if-ne p1, p3, :cond_0

    invoke-virtual {p2, v1, v3}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v0, v2}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v1, v2}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    const/high16 p1, -0x40800000    # -1.0f

    invoke-virtual {p2, v0, p1}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    :goto_0
    return-void
.end method

.class public Lcom/daaw/ze0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ze0;
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
.field public final synthetic a:Lcom/daaw/ze0;


# direct methods
.method public constructor <init>(Lcom/daaw/ze0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ze0$e;->a:Lcom/daaw/ze0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Lcom/daaw/sr1;

    check-cast p3, Lcom/daaw/w31;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ze0$e;->b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V

    return-void
.end method

.method public b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V
    .locals 10

    iget-object v0, p0, Lcom/daaw/ze0$e;->a:Lcom/daaw/ze0;

    invoke-static {v0}, Lcom/daaw/ze0;->l0(Lcom/daaw/ze0;)Lcom/daaw/pr1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pr1;->a()[F

    move-result-object v0

    const-string v1, "u_projView"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2, v0}, Lcom/daaw/sr1;->E(Ljava/lang/String;Z[F)V

    const-string v4, "Color2"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p2

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/dc1;->v(Ljava/lang/String;FFFF)V

    iget-object v0, p0, Lcom/daaw/ze0$e;->a:Lcom/daaw/ze0;

    invoke-static {v0}, Lcom/daaw/ze0;->m0(Lcom/daaw/ze0;)Lcom/daaw/dm0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/dm0;->i(Lcom/daaw/aq0;)F

    move-result p1

    const-string v0, "saturation"

    invoke-virtual {p2, v0, p1}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/daaw/ze0$e;->a:Lcom/daaw/ze0;

    invoke-static {p1}, Lcom/daaw/ze0;->n0(Lcom/daaw/ze0;)I

    move-result p1

    const/4 v0, 0x1

    const/high16 v1, -0x40800000    # -1.0f

    const-string v3, "mask_l_mul"

    const-string v4, "mask_l_add"

    const-string v5, "maskmul"

    const-string v6, "maskadd"

    if-ne p1, v0, :cond_0

    invoke-virtual {p2, v6, v7}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v5, v8}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v4, v7}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v3, v8}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/daaw/ze0$e;->a:Lcom/daaw/ze0;

    invoke-static {p1}, Lcom/daaw/ze0;->n0(Lcom/daaw/ze0;)I

    move-result p1

    const/4 v9, 0x2

    if-ne p1, v9, :cond_1

    invoke-virtual {p2, v6, v7}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v5, v8}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v4, v8}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v3, v1}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/daaw/ze0$e;->a:Lcom/daaw/ze0;

    invoke-static {p1}, Lcom/daaw/ze0;->n0(Lcom/daaw/ze0;)I

    move-result p1

    const/4 v9, 0x3

    if-ne p1, v9, :cond_2

    invoke-virtual {p2, v6, v8}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v5, v1}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    goto :goto_0

    :cond_2
    invoke-virtual {p2, v6, v7}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v5, v8}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    :goto_0
    invoke-virtual {p2, v4, v8}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v3, v7}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    :goto_1
    invoke-virtual {p3, v2}, Lcom/daaw/w31;->e(I)Z

    move-result p1

    invoke-virtual {p3, v0}, Lcom/daaw/w31;->e(I)Z

    move-result p3

    const-string v0, "tex2_y_mul"

    const-string v2, "tex2_y_add"

    if-ne p1, p3, :cond_3

    invoke-virtual {p2, v2, v7}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v0, v8}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    goto :goto_2

    :cond_3
    invoke-virtual {p2, v2, v8}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    invoke-virtual {p2, v0, v1}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    :goto_2
    return-void
.end method

.class public Lcom/daaw/qk;
.super Lcom/daaw/n10;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/qk$s;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/n10<",
        "Lcom/daaw/lo1<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        ">;",
        "Lcom/daaw/er0<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        ">;>;"
    }
.end annotation


# static fields
.field public static O:Lcom/daaw/kw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/kw1<",
            "Lcom/daaw/uk;",
            "Lcom/daaw/tx0$b;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static P:Landroid/os/Handler;


# instance fields
.field public final K:Z

.field public L:[Lcom/daaw/l0;

.field public M:[Lcom/daaw/l0;

.field public N:[Lcom/daaw/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/kw1;

    invoke-direct {v0}, Lcom/daaw/kw1;-><init>()V

    sput-object v0, Lcom/daaw/qk;->O:Lcom/daaw/kw1;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/daaw/qk;->P:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/r40;Ljava/lang/String;Ljava/lang/String;IIZ)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/r40<",
            "Lcom/daaw/yj;",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIZ)V"
        }
    .end annotation

    move-object v9, p0

    new-instance v3, Lcom/daaw/er0$a;

    invoke-direct {v3}, Lcom/daaw/er0$a;-><init>()V

    new-instance v5, Lcom/daaw/tr1;

    move-object v0, p4

    invoke-direct {v5, p4}, Lcom/daaw/tr1;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/daaw/o91;

    move-object v1, p1

    invoke-direct {v7, p1}, Lcom/daaw/o91;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v2, p2

    move-object v4, p3

    move/from16 v6, p5

    move/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/daaw/n10;-><init>(Landroid/content/Context;Lcom/daaw/r40;Lcom/daaw/w40;Ljava/lang/String;Lcom/daaw/me0;ILcom/daaw/m10;I)V

    const/4 v0, 0x7

    new-array v1, v0, [Lcom/daaw/l0;

    new-instance v2, Lcom/daaw/qk$j;

    invoke-direct {v2, p0}, Lcom/daaw/qk$j;-><init>(Lcom/daaw/qk;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/qk$k;

    invoke-direct {v2, p0}, Lcom/daaw/qk$k;-><init>(Lcom/daaw/qk;)V

    const/4 v4, 0x1

    aput-object v2, v1, v4

    new-instance v2, Lcom/daaw/qk$l;

    invoke-direct {v2, p0}, Lcom/daaw/qk$l;-><init>(Lcom/daaw/qk;)V

    const/4 v5, 0x2

    aput-object v2, v1, v5

    new-instance v2, Lcom/daaw/qk$m;

    invoke-direct {v2, p0}, Lcom/daaw/qk$m;-><init>(Lcom/daaw/qk;)V

    const/4 v6, 0x3

    aput-object v2, v1, v6

    new-instance v2, Lcom/daaw/qk$n;

    invoke-direct {v2, p0}, Lcom/daaw/qk$n;-><init>(Lcom/daaw/qk;)V

    const/4 v7, 0x4

    aput-object v2, v1, v7

    new-instance v2, Lcom/daaw/qk$o;

    invoke-direct {v2, p0}, Lcom/daaw/qk$o;-><init>(Lcom/daaw/qk;)V

    const/4 v8, 0x5

    aput-object v2, v1, v8

    new-instance v2, Lcom/daaw/qk$p;

    invoke-direct {v2, p0}, Lcom/daaw/qk$p;-><init>(Lcom/daaw/qk;)V

    const/4 v10, 0x6

    aput-object v2, v1, v10

    iput-object v1, v9, Lcom/daaw/qk;->L:[Lcom/daaw/l0;

    new-array v1, v5, [Lcom/daaw/l0;

    new-instance v2, Lcom/daaw/qk$q;

    invoke-direct {v2, p0}, Lcom/daaw/qk$q;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/qk$r;

    invoke-direct {v2, p0}, Lcom/daaw/qk$r;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v4

    iput-object v1, v9, Lcom/daaw/qk;->M:[Lcom/daaw/l0;

    const/16 v1, 0x9

    new-array v1, v1, [Lcom/daaw/l0;

    new-instance v2, Lcom/daaw/qk$a;

    invoke-direct {v2, p0}, Lcom/daaw/qk$a;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/qk$b;

    invoke-direct {v2, p0}, Lcom/daaw/qk$b;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v4

    new-instance v2, Lcom/daaw/qk$c;

    invoke-direct {v2, p0}, Lcom/daaw/qk$c;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v5

    new-instance v2, Lcom/daaw/qk$d;

    invoke-direct {v2, p0}, Lcom/daaw/qk$d;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v6

    new-instance v2, Lcom/daaw/qk$e;

    invoke-direct {v2, p0}, Lcom/daaw/qk$e;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v7

    new-instance v2, Lcom/daaw/qk$f;

    invoke-direct {v2, p0}, Lcom/daaw/qk$f;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v8

    new-instance v2, Lcom/daaw/qk$g;

    invoke-direct {v2, p0}, Lcom/daaw/qk$g;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v10

    new-instance v2, Lcom/daaw/qk$h;

    invoke-direct {v2, p0}, Lcom/daaw/qk$h;-><init>(Lcom/daaw/qk;)V

    aput-object v2, v1, v0

    new-instance v0, Lcom/daaw/qk$i;

    invoke-direct {v0, p0}, Lcom/daaw/qk$i;-><init>(Lcom/daaw/qk;)V

    const/16 v2, 0x8

    aput-object v0, v1, v2

    iput-object v1, v9, Lcom/daaw/qk;->N:[Lcom/daaw/l0;

    move/from16 v0, p7

    iput-boolean v0, v9, Lcom/daaw/qk;->K:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/r40;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/r40<",
            "Lcom/daaw/yj;",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)V"
        }
    .end annotation

    new-instance v3, Lcom/daaw/er0$a;

    invoke-direct {v3}, Lcom/daaw/er0$a;-><init>()V

    new-instance v5, Lcom/daaw/tr1;

    invoke-direct {v5, p4}, Lcom/daaw/tr1;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/daaw/o91;

    invoke-direct {v7, p1}, Lcom/daaw/o91;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/daaw/n10;-><init>(Landroid/content/Context;Lcom/daaw/r40;Lcom/daaw/w40;Ljava/lang/String;Lcom/daaw/me0;ILcom/daaw/m10;I)V

    const/4 p1, 0x7

    new-array p2, p1, [Lcom/daaw/l0;

    new-instance p3, Lcom/daaw/qk$j;

    invoke-direct {p3, p0}, Lcom/daaw/qk$j;-><init>(Lcom/daaw/qk;)V

    const/4 p4, 0x0

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/qk$k;

    invoke-direct {p3, p0}, Lcom/daaw/qk$k;-><init>(Lcom/daaw/qk;)V

    const/4 p6, 0x1

    aput-object p3, p2, p6

    new-instance p3, Lcom/daaw/qk$l;

    invoke-direct {p3, p0}, Lcom/daaw/qk$l;-><init>(Lcom/daaw/qk;)V

    const/4 v0, 0x2

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/qk$m;

    invoke-direct {p3, p0}, Lcom/daaw/qk$m;-><init>(Lcom/daaw/qk;)V

    const/4 v1, 0x3

    aput-object p3, p2, v1

    new-instance p3, Lcom/daaw/qk$n;

    invoke-direct {p3, p0}, Lcom/daaw/qk$n;-><init>(Lcom/daaw/qk;)V

    const/4 v2, 0x4

    aput-object p3, p2, v2

    new-instance p3, Lcom/daaw/qk$o;

    invoke-direct {p3, p0}, Lcom/daaw/qk$o;-><init>(Lcom/daaw/qk;)V

    const/4 v3, 0x5

    aput-object p3, p2, v3

    new-instance p3, Lcom/daaw/qk$p;

    invoke-direct {p3, p0}, Lcom/daaw/qk$p;-><init>(Lcom/daaw/qk;)V

    const/4 v4, 0x6

    aput-object p3, p2, v4

    iput-object p2, p0, Lcom/daaw/qk;->L:[Lcom/daaw/l0;

    new-array p2, v0, [Lcom/daaw/l0;

    new-instance p3, Lcom/daaw/qk$q;

    invoke-direct {p3, p0}, Lcom/daaw/qk$q;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/qk$r;

    invoke-direct {p3, p0}, Lcom/daaw/qk$r;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, p6

    iput-object p2, p0, Lcom/daaw/qk;->M:[Lcom/daaw/l0;

    const/16 p2, 0x9

    new-array p2, p2, [Lcom/daaw/l0;

    new-instance p3, Lcom/daaw/qk$a;

    invoke-direct {p3, p0}, Lcom/daaw/qk$a;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/qk$b;

    invoke-direct {p3, p0}, Lcom/daaw/qk$b;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, p6

    new-instance p3, Lcom/daaw/qk$c;

    invoke-direct {p3, p0}, Lcom/daaw/qk$c;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/qk$d;

    invoke-direct {p3, p0}, Lcom/daaw/qk$d;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, v1

    new-instance p3, Lcom/daaw/qk$e;

    invoke-direct {p3, p0}, Lcom/daaw/qk$e;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, v2

    new-instance p3, Lcom/daaw/qk$f;

    invoke-direct {p3, p0}, Lcom/daaw/qk$f;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, v3

    new-instance p3, Lcom/daaw/qk$g;

    invoke-direct {p3, p0}, Lcom/daaw/qk$g;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, v4

    new-instance p3, Lcom/daaw/qk$h;

    invoke-direct {p3, p0}, Lcom/daaw/qk$h;-><init>(Lcom/daaw/qk;)V

    aput-object p3, p2, p1

    new-instance p1, Lcom/daaw/qk$i;

    invoke-direct {p1, p0}, Lcom/daaw/qk$i;-><init>(Lcom/daaw/qk;)V

    const/16 p3, 0x8

    aput-object p1, p2, p3

    iput-object p2, p0, Lcom/daaw/qk;->N:[Lcom/daaw/l0;

    iput-boolean p5, p0, Lcom/daaw/qk;->K:Z

    return-void
.end method

.method public static synthetic X(ZLcom/daaw/uk;Lcom/daaw/vd0;Lcom/daaw/tx0;Lcom/daaw/uk;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/daaw/qk;->h0(ZLcom/daaw/uk;Lcom/daaw/vd0;Lcom/daaw/tx0;Lcom/daaw/uk;)V

    return-void
.end method

.method public static synthetic Y(Lcom/daaw/uk;Lcom/daaw/tx0$b;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/qk;->i0(Lcom/daaw/uk;Lcom/daaw/tx0$b;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Z(Lcom/daaw/qk;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lcom/daaw/qk;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lcom/daaw/qk;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Lcom/daaw/qk;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lcom/daaw/qk;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static f0(Lcom/daaw/yj;Ljava/lang/Object;Lcom/daaw/tx0;Lcom/daaw/vd0;ILcom/daaw/uk;[Lcom/daaw/l0;I)V
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    invoke-static/range {v0 .. v9}, Lcom/daaw/qk;->g0(Lcom/daaw/yj;Ljava/lang/Object;Lcom/daaw/tx0;Lcom/daaw/vd0;ILcom/daaw/uk;[Lcom/daaw/l0;IZZ)V

    return-void
.end method

.method public static g0(Lcom/daaw/yj;Ljava/lang/Object;Lcom/daaw/tx0;Lcom/daaw/vd0;ILcom/daaw/uk;[Lcom/daaw/l0;IZZ)V
    .locals 10

    move-object v0, p2

    move-object v8, p5

    sget-object v1, Lcom/daaw/yj;->q:Lcom/daaw/vw1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v1

    move-object v4, p0

    move-object v3, p1

    invoke-virtual {p5, p0, p1, v1}, Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V

    invoke-virtual {p2}, Lcom/daaw/tx0;->g()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v8, Lcom/daaw/uk;->u:Ljava/lang/Object;

    sget-object v1, Lcom/daaw/yj;->x:Lcom/daaw/ww1;

    iget-object v3, v8, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    invoke-virtual {v1, v3, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, v8, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    new-instance v7, Lcom/daaw/ok;

    move-object v1, p3

    move/from16 v5, p8

    invoke-direct {v7, v5, p5, p3, p2}, Lcom/daaw/ok;-><init>(ZLcom/daaw/uk;Lcom/daaw/vd0;Lcom/daaw/tx0;)V

    move-object v1, p5

    move-object/from16 v2, p6

    move/from16 v3, p7

    move/from16 v6, p9

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/uk;->Y([Lcom/daaw/l0;ILcom/daaw/wc0;ZZLcom/daaw/e0;)V

    if-eqz p9, :cond_0

    const v1, 0x7f0800e7

    invoke-virtual {p5, v1}, Lcom/daaw/uk;->T(I)V

    :cond_0
    const/16 v1, 0x8

    const/4 v2, 0x0

    iget-object v3, v8, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    if-eqz v9, :cond_1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v3, v8, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    add-int/2addr v4, p4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v5, v2

    const-string v4, "%d."

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-virtual {p5}, Lcom/daaw/uk;->R()V

    sget-object v3, Lcom/daaw/qk;->P:Landroid/os/Handler;

    new-instance v4, Lcom/daaw/pk;

    invoke-direct {v4, p5}, Lcom/daaw/pk;-><init>(Lcom/daaw/uk;)V

    iget-object v5, v8, Lcom/daaw/uk;->u:Ljava/lang/Object;

    invoke-virtual {p2, v3, v4, p5, v5}, Lcom/daaw/tx0;->i(Landroid/os/Handler;Lcom/daaw/tx0$d;Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/tx0$b;

    move-result-object v0

    sget-object v3, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    if-ne v0, v3, :cond_3

    iget-object v0, v8, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    if-eqz v9, :cond_2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v0, -0x1

    invoke-virtual {p5, v0}, Lcom/daaw/uk;->V(I)V

    const v0, 0x7f08016c

    invoke-virtual {p5, v0}, Lcom/daaw/uk;->W(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v0, 0x0

    invoke-virtual {p5, v0}, Lcom/daaw/uk;->U(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    iget-object v0, v8, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    const-string v2, "..."

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p5, v1}, Lcom/daaw/uk;->d0(I)V

    iget-object v0, v8, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    sget-object v1, Lcom/daaw/qk;->O:Lcom/daaw/kw1;

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, p5, v0, v2}, Lcom/daaw/kw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h0(ZLcom/daaw/uk;Lcom/daaw/vd0;Lcom/daaw/tx0;Lcom/daaw/uk;)V
    .locals 0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/daaw/ww0;->c:Lcom/daaw/vd0;

    iget-object p1, p1, Lcom/daaw/uk;->w:Landroid/view/View;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p1, p0}, Landroid/view/View;->setActivated(Z)V

    goto :goto_1

    :cond_1
    iget-object p0, p1, Lcom/daaw/uk;->w:Landroid/view/View;

    sget-object p1, Lcom/daaw/ww0;->b:Lcom/daaw/tx0;

    invoke-virtual {p1, p3}, Lcom/daaw/tx0;->d(Lcom/daaw/tx0;)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setActivated(Z)V

    :goto_1
    return-void
.end method

.method public static synthetic i0(Lcom/daaw/uk;Lcom/daaw/tx0$b;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, Lcom/daaw/yj;->q:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    check-cast p2, Lcom/daaw/uk;

    iget-object p0, p0, Lcom/daaw/uk;->u:Ljava/lang/Object;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/daaw/qk;->O:Lcom/daaw/kw1;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p0, p2, p1, p3}, Lcom/daaw/kw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public E(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    const/4 p1, 0x1

    if-nez p2, :cond_0

    new-instance p2, Lcom/daaw/d90;

    const/16 v0, 0xa

    invoke-direct {p2, p0, p0, v0, p1}, Lcom/daaw/d90;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V

    new-instance p1, Lcom/daaw/ts1;

    invoke-direct {p1, p2, p0}, Lcom/daaw/ts1;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;)V

    return-object p1

    :cond_0
    if-ne p2, p1, :cond_1

    new-instance p1, Lcom/daaw/d90;

    const/4 p2, 0x4

    const/16 v0, 0xd

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/d90;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V

    new-instance p2, Lcom/daaw/ts1;

    invoke-direct {p2, p1, p0}, Lcom/daaw/ts1;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;)V

    return-object p2

    :cond_1
    invoke-static {}, Lcom/daaw/q6;->j()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public H(I)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public e0(Lcom/daaw/vd0;)I
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lcom/daaw/er0;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/er0;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {v0, v1}, Lcom/daaw/er0;->p(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/vd0;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public g(Lcom/daaw/al;I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qk;->M:[Lcom/daaw/l0;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    aget-object p2, v0, p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/l0;->a(Lcom/daaw/al;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public j(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/yj;->w:Lcom/daaw/sw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public o(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/o91;

    invoke-direct {v0, p1}, Lcom/daaw/o91;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/n10;->W(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m10;)V

    return-void
.end method

.method public v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 11

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lcom/daaw/er0;

    invoke-virtual {v0, p2}, Lcom/daaw/er0;->n(I)Lcom/daaw/lo1;

    move-result-object v0

    move-object v6, p1

    check-cast v6, Lcom/daaw/uk;

    iput p2, v6, Lcom/daaw/uk;->v:I

    iget-boolean p1, p0, Lcom/daaw/qk;->K:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lcom/daaw/er0;

    invoke-virtual {p1, p2}, Lcom/daaw/er0;->p(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/vd0;

    invoke-interface {p1}, Lcom/daaw/vd0;->a()I

    move-result v5

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lcom/daaw/er0;

    invoke-virtual {p1, p2}, Lcom/daaw/er0;->p(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/vd0;

    invoke-interface {p1}, Lcom/daaw/vd0;->c()I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v10, 0x0

    :goto_0
    new-instance v2, Lcom/daaw/qk$s;

    iget-object p1, v0, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/tx0;

    iget-object v1, v0, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/vd0;

    invoke-direct {v2, p1, v1, p2}, Lcom/daaw/qk$s;-><init>(Lcom/daaw/tx0;Lcom/daaw/vd0;I)V

    iget-object p1, v0, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/daaw/tx0;

    iget-object p1, v0, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lcom/daaw/vd0;

    iget-object v7, p0, Lcom/daaw/qk;->N:[Lcom/daaw/l0;

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v1, p0

    invoke-static/range {v1 .. v10}, Lcom/daaw/qk;->g0(Lcom/daaw/yj;Ljava/lang/Object;Lcom/daaw/tx0;Lcom/daaw/vd0;ILcom/daaw/uk;[Lcom/daaw/l0;IZZ)V

    goto :goto_1

    :cond_1
    new-instance v2, Lcom/daaw/qk$s;

    iget-object p1, v0, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/tx0;

    iget-object v1, v0, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/vd0;

    invoke-direct {v2, p1, v1, p2}, Lcom/daaw/qk$s;-><init>(Lcom/daaw/tx0;Lcom/daaw/vd0;I)V

    iget-object p1, v0, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/daaw/tx0;

    const/4 v4, 0x0

    iget-object v7, p0, Lcom/daaw/qk;->L:[Lcom/daaw/l0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v5, p2

    invoke-static/range {v1 .. v10}, Lcom/daaw/qk;->g0(Lcom/daaw/yj;Ljava/lang/Object;Lcom/daaw/tx0;Lcom/daaw/vd0;ILcom/daaw/uk;[Lcom/daaw/l0;IZZ)V

    :goto_1
    return-void
.end method

.method public x(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/sd0;)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/qk;->K:Z

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz v0, :cond_0

    const v0, 0x7f100142

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v1

    goto :goto_0

    :cond_0
    const v0, 0x7f100144

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v1

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    aput-object p1, p3, v1

    return-void
.end method

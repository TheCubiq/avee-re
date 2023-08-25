.class public Lcom/daaw/ww0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ww0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/uw1$a<",
        "Lcom/daaw/lo1<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        ">;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ww0;


# direct methods
.method public constructor <init>(Lcom/daaw/ww0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ww0$a;->a:Lcom/daaw/ww0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/lo1;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/ww0$a;->b(Lcom/daaw/lo1;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lcom/daaw/lo1;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/tx0;

    iget-object v1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/vd0;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lcom/daaw/tx0;->k:Lcom/daaw/tx0;

    :cond_1
    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/tx0;->j(Landroid/content/Context;)Lcom/daaw/tx0$b;

    move-result-object v2

    sput-object v1, Lcom/daaw/ww0;->c:Lcom/daaw/vd0;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sput p2, Lcom/daaw/ww0;->e:I

    sput-object v0, Lcom/daaw/ww0;->b:Lcom/daaw/tx0;

    sput-object v2, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    invoke-static {}, Lcom/daaw/avee/MainActivity;->o0()Lcom/daaw/m30;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/daaw/m30;->E()V

    :cond_2
    invoke-static {}, Lcom/daaw/avee/MainActivity;->p0()Lcom/daaw/n30;

    move-result-object p2

    if-eqz p2, :cond_3

    sget v1, Lcom/daaw/ww0;->e:I

    sget-object v3, Lcom/daaw/ww0;->c:Lcom/daaw/vd0;

    invoke-virtual {p2, v1, v0, v2, v3}, Lcom/daaw/n30;->u(ILcom/daaw/tx0;Lcom/daaw/tx0$b;Lcom/daaw/vd0;)V

    :cond_3
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_5

    if-eqz p1, :cond_4

    iget-object p1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    if-eqz p1, :cond_4

    check-cast p1, Lcom/daaw/tx0;

    invoke-virtual {p1}, Lcom/daaw/tx0;->g()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    const-string p1, ""

    :goto_1
    sget-object p2, Lcom/daaw/avee/comp/playback/c;->e:Lcom/daaw/lw1;

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    check-cast p5, Ljava/lang/Long;

    invoke-virtual {p2, p1, p3, p4, p5}, Lcom/daaw/lw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    sget-object p1, Lcom/daaw/avee/comp/playback/c;->f:Lcom/daaw/iw1;

    const/4 p2, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void
.end method

.class public Lcom/daaw/hj0$i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/hj0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Lcom/daaw/al;",
        "Ljava/lang/Integer;",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$i0;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Landroid/view/View;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/hj0$i0;->b(Lcom/daaw/al;Ljava/lang/Integer;Landroid/view/View;)V

    return-void
.end method

.method public b(Lcom/daaw/al;Ljava/lang/Integer;Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lcom/daaw/dx0;->b()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/al;->c()Landroid/app/FragmentManager;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 v2, 0x78

    const-string v3, ""

    if-eq p2, v2, :cond_3

    const/16 v2, 0x7d

    if-eq p2, v2, :cond_2

    const/16 p3, 0x456

    if-eq p2, p3, :cond_1

    packed-switch p2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget p2, Lcom/daaw/j5;->s:I

    goto :goto_0

    :pswitch_1
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget p2, Lcom/daaw/j5;->q:I

    :goto_0
    invoke-virtual {p1, p2}, Lcom/daaw/j5;->k0(I)V

    goto :goto_1

    :pswitch_2
    iget-object p1, p0, Lcom/daaw/hj0$i0;->a:Lcom/daaw/hj0;

    invoke-static {p1}, Lcom/daaw/hj0;->h(Lcom/daaw/hj0;)V

    goto :goto_1

    :pswitch_3
    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/daaw/l01;->l()Lcom/daaw/er0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/er0;->w()Ljava/util/List;

    move-result-object p2

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2, p3}, Lcom/daaw/ox0;->c(Lcom/daaw/al;Ljava/util/List;Ljava/lang/Boolean;)Lcom/daaw/ox0;

    goto :goto_1

    :pswitch_4
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f100121

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {p2, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    if-eqz v1, :cond_4

    invoke-static {p1}, Lcom/daaw/f1;->c(Lcom/daaw/al;)Lcom/daaw/f1;

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 p3, 0x0

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0, v0, p3}, Lcom/daaw/l01;->E(Ljava/util/List;IILcom/daaw/be0;)V

    goto :goto_1

    :cond_2
    if-eqz p3, :cond_4

    invoke-static {p1, p3, v3}, Lcom/daaw/zt1;->b(Lcom/daaw/al;Landroid/view/View;Ljava/lang/String;)Lcom/daaw/zt1;

    goto :goto_1

    :cond_3
    const p2, 0x7f10009b

    const-string p3, "libraryAddFolder"

    invoke-static {p1, p3, p2, v3}, Lcom/daaw/st;->g(Lcom/daaw/al;Ljava/lang/String;ILjava/lang/String;)Lcom/daaw/st;

    :cond_4
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6e
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public Lcom/daaw/pv1$s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$s;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->L:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v3

    sget v4, Lcom/daaw/j5;->L:I

    invoke-virtual {v3, v4, v0}, Lcom/daaw/j5;->c0(II)V

    invoke-static {}, Lcom/daaw/dx0;->b()Landroid/content/Context;

    move-result-object v3

    if-eqz v3, :cond_4

    if-ne v0, v2, :cond_2

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1002cd

    :goto_1
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    if-ne v0, v1, :cond_3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1002cc

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1002ce

    goto :goto_1

    :goto_2
    sget-object v1, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {v1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

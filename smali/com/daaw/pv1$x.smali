.class public Lcom/daaw/pv1$x;
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

    iput-object p1, p0, Lcom/daaw/pv1$x;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->I:I

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v2

    sget v3, Lcom/daaw/j5;->I:I

    invoke-virtual {v2, v3}, Lcom/daaw/j5;->k(I)I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/j5;->d0(IIZ)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->o:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k0(I)V

    invoke-static {}, Lcom/daaw/dx0;->b()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v1

    sget v2, Lcom/daaw/j5;->o:I

    invoke-virtual {v1, v2}, Lcom/daaw/j5;->h(I)Z

    move-result v1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v1, :cond_0

    const v1, 0x7f100297

    goto :goto_0

    :cond_0
    const v1, 0x7f100298

    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {v1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

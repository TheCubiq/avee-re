.class public Lcom/daaw/xw0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0;-><init>(Lcom/daaw/uf1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/uw1$a<",
        "Landroid/content/Context;",
        "Lcom/daaw/i2;",
        "Lcom/daaw/af0;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$h;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, Lcom/daaw/i2;

    check-cast p3, Lcom/daaw/af0;

    check-cast p4, Ljava/lang/Integer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/xw0$h;->b(Landroid/content/Context;Lcom/daaw/i2;Lcom/daaw/af0;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public b(Landroid/content/Context;Lcom/daaw/i2;Lcom/daaw/af0;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 7

    iget-object p1, p0, Lcom/daaw/xw0$h;->a:Lcom/daaw/xw0;

    invoke-static {p1}, Lcom/daaw/xw0;->b(Lcom/daaw/xw0;)Landroid/os/Handler;

    move-result-object p1

    new-instance v6, Lcom/daaw/xw0$h$a;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/daaw/xw0$h$a;-><init>(Lcom/daaw/xw0$h;Lcom/daaw/i2;Lcom/daaw/af0;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {p1, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

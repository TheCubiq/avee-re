.class public Lcom/daaw/xw0$h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0$h;->b(Landroid/content/Context;Lcom/daaw/i2;Lcom/daaw/af0;Ljava/lang/Integer;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/i2;

.field public final synthetic q:Lcom/daaw/af0;

.field public final synthetic r:Ljava/lang/Integer;

.field public final synthetic s:Ljava/lang/Integer;

.field public final synthetic t:Lcom/daaw/xw0$h;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0$h;Lcom/daaw/i2;Lcom/daaw/af0;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$h$a;->t:Lcom/daaw/xw0$h;

    iput-object p2, p0, Lcom/daaw/xw0$h$a;->p:Lcom/daaw/i2;

    iput-object p3, p0, Lcom/daaw/xw0$h$a;->q:Lcom/daaw/af0;

    iput-object p4, p0, Lcom/daaw/xw0$h$a;->r:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/daaw/xw0$h$a;->s:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    new-instance v0, Lcom/daaw/g2;

    invoke-direct {v0}, Lcom/daaw/g2;-><init>()V

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/daaw/xw0$h$a;->p:Lcom/daaw/i2;

    iget-object v3, v2, Lcom/daaw/i2;->a:Landroid/net/Uri;

    iget-object v4, v2, Lcom/daaw/i2;->b:Ljava/lang/String;

    iget-object v5, v2, Lcom/daaw/i2;->c:Ljava/lang/String;

    iget-object v6, p0, Lcom/daaw/xw0$h$a;->q:Lcom/daaw/af0;

    iget-object v2, p0, Lcom/daaw/xw0$h$a;->r:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v2, p0, Lcom/daaw/xw0$h$a;->s:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move-object v11, v12

    move-object v12, v13

    invoke-virtual/range {v0 .. v12}, Lcom/daaw/g2;->v(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/af0;IIIIZLcom/daaw/ye0;Ljava/lang/Object;)V

    return-void
.end method

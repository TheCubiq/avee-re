.class public Lcom/daaw/ix1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ix1;-><init>()V
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
.field public final synthetic a:Lcom/daaw/ix1;


# direct methods
.method public constructor <init>(Lcom/daaw/ix1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ix1$a;->a:Lcom/daaw/ix1;

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

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/ix1$a;->b(Landroid/content/Context;Lcom/daaw/i2;Lcom/daaw/af0;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public b(Landroid/content/Context;Lcom/daaw/i2;Lcom/daaw/af0;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 13

    move-object v0, p2

    new-instance v1, Lcom/daaw/g2;

    invoke-direct {v1}, Lcom/daaw/g2;-><init>()V

    const/4 v2, 0x0

    iget-object v3, v0, Lcom/daaw/i2;->a:Landroid/net/Uri;

    iget-object v4, v0, Lcom/daaw/i2;->b:Ljava/lang/String;

    iget-object v5, v0, Lcom/daaw/i2;->c:Ljava/lang/String;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, v1

    move v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v12}, Lcom/daaw/g2;->v(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/af0;IIIIZLcom/daaw/ye0;Ljava/lang/Object;)V

    return-void
.end method

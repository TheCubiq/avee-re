.class public Lcom/daaw/hj0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


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
        "Lcom/daaw/tw1$a<",
        "Lcom/daaw/i2;",
        "Landroid/widget/ImageView;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$d;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/i2;

    check-cast p2, Landroid/widget/ImageView;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/hj0$d;->b(Lcom/daaw/i2;Landroid/widget/ImageView;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Lcom/daaw/i2;Landroid/widget/ImageView;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 6

    new-instance v0, Lcom/daaw/g2;

    invoke-direct {v0}, Lcom/daaw/g2;-><init>()V

    iget-object v1, p1, Lcom/daaw/i2;->a:Landroid/net/Uri;

    iget-object v2, p1, Lcom/daaw/i2;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/daaw/i2;->c:Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v4, p2

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/g2;->t(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Z)V

    return-void
.end method

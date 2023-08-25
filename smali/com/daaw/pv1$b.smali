.class public Lcom/daaw/pv1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vw1$a<",
        "Lcom/daaw/i2;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$b;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pv1$b;->b()Lcom/daaw/i2;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/i2;
    .locals 4

    sget-object v0, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    sget-object v1, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lcom/daaw/i2;

    iget-object v2, v0, Lcom/daaw/tx0$b;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Lcom/daaw/tx0$b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/daaw/tx0$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lcom/daaw/i2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

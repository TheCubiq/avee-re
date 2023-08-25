.class public Lcom/daaw/sg1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/sg1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/nq0<",
        "Ljava/lang/Integer;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/daaw/d60;)Lcom/daaw/mq0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/d60;",
            ")",
            "Lcom/daaw/mq0<",
            "Ljava/lang/Integer;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/sg1;

    const-class v1, Landroid/net/Uri;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p2, v1, v2}, Lcom/daaw/d60;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/mq0;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lcom/daaw/sg1;-><init>(Landroid/content/Context;Lcom/daaw/mq0;)V

    return-object v0
.end method

.method public b()V
    .locals 0

    return-void
.end method

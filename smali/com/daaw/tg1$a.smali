.class public Lcom/daaw/tg1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tg1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/nq0<",
        "Ljava/lang/String;",
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
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/d60;",
            ")",
            "Lcom/daaw/mq0<",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/daaw/tg1;

    const-class v0, Landroid/net/Uri;

    const-class v1, Ljava/io/InputStream;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/d60;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/mq0;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/daaw/tg1;-><init>(Lcom/daaw/mq0;)V

    return-object p1
.end method

.method public b()V
    .locals 0

    return-void
.end method

.class public Lcom/daaw/lg1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lg1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/nq0<",
        "[B",
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
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/d60;",
            ")",
            "Lcom/daaw/mq0<",
            "[B",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/daaw/lg1;

    invoke-direct {p1}, Lcom/daaw/lg1;-><init>()V

    return-object p1
.end method

.method public b()V
    .locals 0

    return-void
.end method

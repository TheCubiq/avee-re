.class public Lcom/daaw/yb0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/nq0<",
        "Lcom/daaw/o70;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/lq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/lq0<",
            "Lcom/daaw/o70;",
            "Lcom/daaw/o70;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/lq0;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/daaw/lq0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/yb0$a;->a:Lcom/daaw/lq0;

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
            "Lcom/daaw/o70;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/daaw/yb0;

    iget-object p2, p0, Lcom/daaw/yb0$a;->a:Lcom/daaw/lq0;

    invoke-direct {p1, p2}, Lcom/daaw/yb0;-><init>(Lcom/daaw/lq0;)V

    return-object p1
.end method

.method public b()V
    .locals 0

    return-void
.end method

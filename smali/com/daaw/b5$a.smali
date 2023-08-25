.class public Lcom/daaw/b5$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/b5;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ww1$a<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/playback/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/b5;


# direct methods
.method public constructor <init>(Lcom/daaw/b5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/b5$a;->a:Lcom/daaw/b5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/a;
    .locals 3

    invoke-static {}, Lcom/daaw/qv1;->b0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/b5;->c:Lcom/daaw/xw1;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/b5;->d:Lcom/daaw/xw1;

    :goto_0
    iget-object v2, p0, Lcom/daaw/b5$a;->a:Lcom/daaw/b5;

    invoke-static {v2}, Lcom/daaw/b5;->a(Lcom/daaw/b5;)Lcom/daaw/avee/comp/playback/a;

    move-result-object v2

    invoke-virtual {v0, v2, p1, v1}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/a;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/b5$a;->a:Lcom/daaw/b5;

    invoke-static {v0, p1}, Lcom/daaw/b5;->b(Lcom/daaw/b5;Lcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;

    :cond_1
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/daaw/b5$a;->a(Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1
.end method

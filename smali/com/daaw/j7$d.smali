.class public Lcom/daaw/j7$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/j7;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vw1$a<",
        "Lcom/daaw/rx;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/j7;


# direct methods
.method public constructor <init>(Lcom/daaw/j7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j7$d;->a:Lcom/daaw/j7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/j7$d;->b()Lcom/daaw/rx;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/rx;
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/playback/c;->x:Lcom/daaw/mw1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/mw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/playback/b$b;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v1, p0, Lcom/daaw/j7$d;->a:Lcom/daaw/j7;

    invoke-static {v1, v0}, Lcom/daaw/j7;->a(Lcom/daaw/j7;Lcom/daaw/avee/comp/playback/b$b;)Lcom/daaw/rx;

    move-result-object v0

    return-object v0
.end method

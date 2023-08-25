.class public Lcom/daaw/j7$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


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
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/avee/comp/playback/b$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/j7;


# direct methods
.method public constructor <init>(Lcom/daaw/j7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j7$i;->a:Lcom/daaw/j7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/avee/comp/playback/b$b;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/j7$i;->a:Lcom/daaw/j7;

    invoke-static {v0}, Lcom/daaw/j7;->d(Lcom/daaw/j7;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/daaw/j7$i$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/j7$i$a;-><init>(Lcom/daaw/j7$i;Lcom/daaw/avee/comp/playback/b$b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/avee/comp/playback/b$b;

    invoke-virtual {p0, p1}, Lcom/daaw/j7$i;->a(Lcom/daaw/avee/comp/playback/b$b;)V

    return-void
.end method

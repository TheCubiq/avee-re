.class public Lcom/daaw/j7$i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/j7$i;->a(Lcom/daaw/avee/comp/playback/b$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/avee/comp/playback/b$b;

.field public final synthetic q:Lcom/daaw/j7$i;


# direct methods
.method public constructor <init>(Lcom/daaw/j7$i;Lcom/daaw/avee/comp/playback/b$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j7$i$a;->q:Lcom/daaw/j7$i;

    iput-object p2, p0, Lcom/daaw/j7$i$a;->p:Lcom/daaw/avee/comp/playback/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    sget-object v0, Lcom/daaw/qx;->K:Lcom/daaw/qw1;

    iget-object v1, p0, Lcom/daaw/j7$i$a;->q:Lcom/daaw/j7$i;

    iget-object v1, v1, Lcom/daaw/j7$i;->a:Lcom/daaw/j7;

    iget-object v2, p0, Lcom/daaw/j7$i$a;->p:Lcom/daaw/avee/comp/playback/b$b;

    invoke-static {v1, v2}, Lcom/daaw/j7;->a(Lcom/daaw/j7;Lcom/daaw/avee/comp/playback/b$b;)Lcom/daaw/rx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

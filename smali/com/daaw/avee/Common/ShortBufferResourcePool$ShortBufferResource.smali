.class public Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;
.super Ljava/lang/Object;
.source "ShortBufferResourcePool.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Common/ShortBufferResourcePool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ShortBufferResource"
.end annotation


# instance fields
.field public final obj:[S

.field final synthetic this$0:Lcom/daaw/avee/Common/ShortBufferResourcePool;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/ShortBufferResourcePool;[S)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;->this$0:Lcom/daaw/avee/Common/ShortBufferResourcePool;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p2, p0, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;->obj:[S

    return-void
.end method


# virtual methods
.method public recycle()V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;->this$0:Lcom/daaw/avee/Common/ShortBufferResourcePool;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/ShortBufferResourcePool;->recycle(Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;)V

    return-void
.end method

.class Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;
.super Landroid/os/Handler;
.source "AudioEncoderManager2B.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "EncoderHandler"
.end annotation


# instance fields
.field private mWeakEncoder:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;)V
    .locals 1

    .line 178
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 179
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;->mWeakEncoder:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 184
    iget v0, p1, Landroid/os/Message;->what:I

    .line 185
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 187
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;->mWeakEncoder:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;

    if-nez v1, :cond_0

    const-string p1, "AudioEncoderManager2B"

    const-string v0, "EncoderHandler.handleMessage: encoder is null"

    .line 189
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    .line 199
    check-cast p1, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;

    const/4 v0, 0x0

    invoke-static {v1, p1, v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->access$100(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;Z)Z

    move-result p1

    if-nez p1, :cond_3

    .line 200
    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->access$200(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    goto :goto_0

    .line 203
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unhandled msg what="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 195
    :cond_2
    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->access$000(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;)V

    .line 196
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->quit()V

    :cond_3
    :goto_0
    return-void
.end method

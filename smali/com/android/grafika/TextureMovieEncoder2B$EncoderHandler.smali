.class Lcom/android/grafika/TextureMovieEncoder2B$EncoderHandler;
.super Landroid/os/Handler;
.source "TextureMovieEncoder2B.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/grafika/TextureMovieEncoder2B;
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
            "Lcom/android/grafika/TextureMovieEncoder2B;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/grafika/TextureMovieEncoder2B;)V
    .locals 1

    .line 165
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 166
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2B$EncoderHandler;->mWeakEncoder:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 171
    iget v0, p1, Landroid/os/Message;->what:I

    .line 172
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 174
    iget-object p1, p0, Lcom/android/grafika/TextureMovieEncoder2B$EncoderHandler;->mWeakEncoder:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/grafika/TextureMovieEncoder2B;

    if-nez p1, :cond_0

    const-string p1, "TextureMovieEncoder2B"

    const-string v0, "EncoderHandler.handleMessage: encoder is null"

    .line 176
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 186
    invoke-static {p1}, Lcom/android/grafika/TextureMovieEncoder2B;->access$100(Lcom/android/grafika/TextureMovieEncoder2B;)V

    goto :goto_0

    .line 189
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

    .line 182
    :cond_2
    invoke-static {p1}, Lcom/android/grafika/TextureMovieEncoder2B;->access$000(Lcom/android/grafika/TextureMovieEncoder2B;)V

    .line 183
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->quit()V

    :goto_0
    return-void
.end method

.class public final Lcom/daaw/go0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x17
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/go0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/go0;


# direct methods
.method public constructor <init>(Lcom/daaw/go0;Landroid/media/MediaCodec;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/go0$c;->a:Lcom/daaw/go0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    invoke-virtual {p2, p0, p1}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/go0;Landroid/media/MediaCodec;Lcom/daaw/go0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/go0$c;-><init>(Lcom/daaw/go0;Landroid/media/MediaCodec;)V

    return-void
.end method


# virtual methods
.method public onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/go0$c;->a:Lcom/daaw/go0;

    iget-object p2, p1, Lcom/daaw/go0;->T0:Lcom/daaw/go0$c;

    if-eq p0, p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/go0;->O0()V

    return-void
.end method

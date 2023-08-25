.class public Lcom/daaw/kq$b;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/kq;->P()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/media/AudioTrack;

.field public final synthetic q:Lcom/daaw/kq;


# direct methods
.method public constructor <init>(Lcom/daaw/kq;Landroid/media/AudioTrack;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kq$b;->q:Lcom/daaw/kq;

    iput-object p2, p0, Lcom/daaw/kq$b;->p:Landroid/media/AudioTrack;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kq$b;->p:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    return-void
.end method

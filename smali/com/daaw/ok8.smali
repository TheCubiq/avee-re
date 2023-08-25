.class public final synthetic Lcom/daaw/ok8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/media/AudioTrack;

.field public final synthetic q:Lcom/daaw/ds4;


# direct methods
.method public synthetic constructor <init>(Landroid/media/AudioTrack;Lcom/daaw/ds4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ok8;->p:Landroid/media/AudioTrack;

    iput-object p2, p0, Lcom/daaw/ok8;->q:Lcom/daaw/ds4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ok8;->p:Landroid/media/AudioTrack;

    iget-object v1, p0, Lcom/daaw/ok8;->q:Lcom/daaw/ds4;

    invoke-static {v0, v1}, Lcom/daaw/sl8;->q(Landroid/media/AudioTrack;Lcom/daaw/ds4;)V

    return-void
.end method

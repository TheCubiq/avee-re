.class final Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive$1;
.super Ljava/lang/Object;
.source "ExoMediaPlayerCore.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakDelegate2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakDelegate2$Handler<",
        "Landroid/app/Activity;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/app/Activity;Ljava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 93
    check-cast p1, Landroid/app/Activity;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive$1;->invoke(Landroid/app/Activity;Ljava/lang/CharSequence;)V

    return-void
.end method

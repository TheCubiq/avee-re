.class final Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;
.super Ljava/lang/Object;
.source "MediaPlaybackNotification.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->createNotificationInternal(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)Landroid/app/Notification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action1<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$notificationBuilder:Landroid/app/Notification$Builder;

.field final synthetic val$notificationId:I

.field final synthetic val$serviceHandlerGet:Lcom/daaw/avee/Common/Func/Func;

.field final synthetic val$views:Landroid/widget/RemoteViews;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/Func/Func;Landroid/widget/RemoteViews;Landroid/app/Notification$Builder;Landroid/content/Context;I)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;->val$serviceHandlerGet:Lcom/daaw/avee/Common/Func/Func;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;->val$views:Landroid/widget/RemoteViews;

    iput-object p3, p0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;->val$notificationBuilder:Landroid/app/Notification$Builder;

    iput-object p4, p0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;->val$context:Landroid/content/Context;

    iput p5, p0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;->val$notificationId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;->val$serviceHandlerGet:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {v0}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 150
    new-instance v1, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1$1;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1$1;-><init>(Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)V
    .locals 0

    .line 142
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification$1;->onInvoke(Landroid/graphics/Bitmap;)V

    return-void
.end method

.class Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;
.super Ljava/lang/Object;
.source "MediaAppWidgetProvider.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->defaultAppWidget(Landroid/content/Context;[ILjava/lang/Class;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
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
.field final synthetic this$0:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

.field final synthetic val$appWidgetIds:[I

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$views:Landroid/widget/RemoteViews;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/widget/RemoteViews;Landroid/content/Context;[I)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->this$0:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->val$views:Landroid/widget/RemoteViews;

    iput-object p3, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->val$context:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->val$appWidgetIds:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Landroid/graphics/Bitmap;)V
    .locals 3

    const v0, 0x7f09011e

    if-eqz p1, :cond_0

    .line 66
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->val$views:Landroid/widget/RemoteViews;

    invoke-virtual {v1, v0, p1}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    goto :goto_0

    .line 68
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->val$views:Landroid/widget/RemoteViews;

    const v1, 0x7f080148

    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 70
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->this$0:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->val$appWidgetIds:[I

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->val$views:Landroid/widget/RemoteViews;

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->access$000(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/content/Context;[ILandroid/widget/RemoteViews;)V

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)V
    .locals 0

    .line 62
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$1;->onInvoke(Landroid/graphics/Bitmap;)V

    return-void
.end method

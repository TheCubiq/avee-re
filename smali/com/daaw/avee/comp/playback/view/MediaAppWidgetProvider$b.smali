.class public Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->f(Landroid/content/Context;[ILcom/daaw/tx0$b;ZZLjava/lang/Class;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/e0<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/widget/RemoteViews;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:[I

.field public final synthetic d:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/widget/RemoteViews;Landroid/content/Context;[I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->d:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->a:Landroid/widget/RemoteViews;

    iput-object p3, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->b:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->c:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->b(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public b(Landroid/graphics/Bitmap;)V
    .locals 3

    const v0, 0x7f090168

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->a:Landroid/widget/RemoteViews;

    invoke-virtual {v1, v0, p1}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->a:Landroid/widget/RemoteViews;

    const v1, 0x7f08016c

    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->d:Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->c:[I

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider$b;->a:Landroid/widget/RemoteViews;

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->a(Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;Landroid/content/Context;[ILandroid/widget/RemoteViews;)V

    return-void
.end method

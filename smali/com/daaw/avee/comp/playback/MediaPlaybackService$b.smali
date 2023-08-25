.class public Lcom/daaw/avee/comp/playback/MediaPlaybackService$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/af0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;->X(ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public final synthetic b:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$b;->b:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$b;->a:Ljava/lang/Object;

    return-void
.end method

.method public b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/df0;->g(Lcom/daaw/df0;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/gr1;->h(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$b;->b:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {p3, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->h(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Landroid/graphics/Bitmap;)V

    invoke-static {p1}, Lcom/daaw/df0;->c(Lcom/daaw/df0;)V

    return-void
.end method

.class public final synthetic Lcom/daaw/vo0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/graphics/Bitmap;

.field public final synthetic q:Landroid/widget/RemoteViews;

.field public final synthetic r:Landroid/content/Context;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:I


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vo0;->p:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/daaw/vo0;->q:Landroid/widget/RemoteViews;

    iput-object p3, p0, Lcom/daaw/vo0;->r:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/vo0;->s:Ljava/lang/String;

    iput p5, p0, Lcom/daaw/vo0;->t:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/vo0;->p:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/daaw/vo0;->q:Landroid/widget/RemoteViews;

    iget-object v2, p0, Lcom/daaw/vo0;->r:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/vo0;->s:Ljava/lang/String;

    iget v4, p0, Lcom/daaw/vo0;->t:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/wo0;->b(Landroid/graphics/Bitmap;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

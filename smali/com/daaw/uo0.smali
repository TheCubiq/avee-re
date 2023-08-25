.class public final synthetic Lcom/daaw/uo0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# instance fields
.field public final synthetic a:Lcom/daaw/w40;

.field public final synthetic b:Landroid/widget/RemoteViews;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/w40;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uo0;->a:Lcom/daaw/w40;

    iput-object p2, p0, Lcom/daaw/uo0;->b:Landroid/widget/RemoteViews;

    iput-object p3, p0, Lcom/daaw/uo0;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/uo0;->d:Ljava/lang/String;

    iput p5, p0, Lcom/daaw/uo0;->e:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/uo0;->a:Lcom/daaw/w40;

    iget-object v1, p0, Lcom/daaw/uo0;->b:Landroid/widget/RemoteViews;

    iget-object v2, p0, Lcom/daaw/uo0;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/uo0;->d:Ljava/lang/String;

    iget v4, p0, Lcom/daaw/uo0;->e:I

    move-object v5, p1

    check-cast v5, Landroid/graphics/Bitmap;

    invoke-static/range {v0 .. v5}, Lcom/daaw/wo0;->a(Lcom/daaw/w40;Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;ILandroid/graphics/Bitmap;)V

    return-void
.end method

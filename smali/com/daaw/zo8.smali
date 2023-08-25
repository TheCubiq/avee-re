.class public final Lcom/daaw/zo8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ep8;

.field public final b:Landroid/media/MediaFormat;

.field public final c:Lcom/daaw/f92;

.field public final d:Landroid/view/Surface;

.field public final e:Landroid/media/MediaCrypto;


# direct methods
.method public constructor <init>(Lcom/daaw/ep8;Landroid/media/MediaFormat;Lcom/daaw/f92;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zo8;->a:Lcom/daaw/ep8;

    iput-object p2, p0, Lcom/daaw/zo8;->b:Landroid/media/MediaFormat;

    iput-object p3, p0, Lcom/daaw/zo8;->c:Lcom/daaw/f92;

    iput-object p4, p0, Lcom/daaw/zo8;->d:Landroid/view/Surface;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/zo8;->e:Landroid/media/MediaCrypto;

    return-void
.end method

.method public static a(Lcom/daaw/ep8;Landroid/media/MediaFormat;Lcom/daaw/f92;Landroid/media/MediaCrypto;)Lcom/daaw/zo8;
    .locals 7

    new-instance p3, Lcom/daaw/zo8;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/daaw/zo8;-><init>(Lcom/daaw/ep8;Landroid/media/MediaFormat;Lcom/daaw/f92;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-object p3
.end method

.method public static b(Lcom/daaw/ep8;Landroid/media/MediaFormat;Lcom/daaw/f92;Landroid/view/Surface;Landroid/media/MediaCrypto;)Lcom/daaw/zo8;
    .locals 7

    new-instance p4, Lcom/daaw/zo8;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/daaw/zo8;-><init>(Lcom/daaw/ep8;Landroid/media/MediaFormat;Lcom/daaw/f92;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-object p4
.end method

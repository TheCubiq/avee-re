.class public Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageMask;
.super Ljava/lang/Object;
.source "ImageMask.java"


# static fields
.field public static final maskModes:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "Transparency"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "TransparencyAndBlacks"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "TransparencyAndWhites"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "InvertedTransparency"

    aput-object v2, v0, v1

    .line 9
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageMask;->maskModes:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

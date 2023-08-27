.class Lcom/daaw/avee/Design/HandheldMotion$Preset;
.super Ljava/lang/Object;
.source "HandheldMotion.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Design/HandheldMotion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Preset"
.end annotation


# instance fields
.field posX:Ljava/lang/String;

.field posY:Ljava/lang/String;

.field rot:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/daaw/avee/Design/HandheldMotion$Preset;->posX:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/daaw/avee/Design/HandheldMotion$Preset;->posY:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Lcom/daaw/avee/Design/HandheldMotion$Preset;->rot:Ljava/lang/String;

    return-void
.end method

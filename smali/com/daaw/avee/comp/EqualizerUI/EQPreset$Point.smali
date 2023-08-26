.class public Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;
.super Ljava/lang/Object;
.source "EQPreset.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/EqualizerUI/EQPreset;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Point"
.end annotation


# instance fields
.field public freq:F

.field public value:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    .line 60
    iput p2, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;
    .locals 3

    .line 71
    new-instance v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;-><init>(FF)V

    const-string v1, ":"

    .line 72
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v2, 0x0

    .line 74
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;)F

    move-result v2

    iput v2, v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    add-int/lit8 v1, v1, 0x1

    .line 75
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;)F

    move-result p0

    iput p0, v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .line 66
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->value:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "%.3f:%.3f"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

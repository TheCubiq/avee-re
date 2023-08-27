.class public Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;
.super Ljava/lang/Object;
.source "EqualizerUISettings.java"


# instance fields
.field public bandsFinal:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

.field public bassValue:F

.field public currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

.field public enabled:Z

.field public presetIndex:I

.field public trebleValue:F

.field public virtualizerStrength:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->presetIndex:I

    const/4 v1, 0x0

    .line 19
    iput-boolean v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->enabled:Z

    .line 20
    iput v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->presetIndex:I

    .line 21
    sget-object v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->empty:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    invoke-static {v0}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->clone(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bassValue:F

    .line 23
    iput v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->trebleValue:F

    .line 24
    sget-object v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->empty:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    invoke-static {v1}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->clone(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bandsFinal:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    .line 25
    iput v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->virtualizerStrength:F

    return-void
.end method

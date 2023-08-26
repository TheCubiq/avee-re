.class Lcom/daaw/avee/Design/AudioEffectsDesign$6;
.super Ljava/lang/Object;
.source "AudioEffectsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/AudioEffectsDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;",
        "Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AudioEffectsDesign;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$6;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V
    .locals 9

    .line 110
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_equalizerEnabled:I

    iget-boolean v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->enabled:Z

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    .line 111
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerPreset:I

    iget v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->presetIndex:I

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 112
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_equalizerBarsValues:I

    iget-object v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->currentBands:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    invoke-static {v1}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->serialize(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;)V

    .line 113
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerBassValue:I

    iget v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bassValue:F

    const/high16 v2, 0x447a0000    # 1000.0f

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 114
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerTrebleValue:I

    iget v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->trebleValue:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 115
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_virtualizerStrength:I

    iget v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->virtualizerStrength:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 118
    new-instance p2, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;

    invoke-direct {p2}, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;-><init>()V

    .line 120
    iget-object v0, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bandsFinal:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v0, v0, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v0, v0

    new-array v0, v0, [F

    .line 121
    iget-object v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bandsFinal:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v1, v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v1, v1

    new-array v7, v1, [F

    const/4 v8, 0x0

    const/4 v1, 0x0

    .line 123
    :goto_0
    iget-object v2, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bandsFinal:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v2, v2, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 124
    iget-object v2, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bandsFinal:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v2, v2, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    aput v2, v7, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 126
    :cond_0
    iget-object v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bandsFinal:Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    iget-object v2, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$6;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    .line 127
    invoke-static {v2}, Lcom/daaw/avee/Design/AudioEffectsDesign;->access$100(Lcom/daaw/avee/Design/AudioEffectsDesign;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$6;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/AudioEffectsDesign;->access$200(Lcom/daaw/avee/Design/AudioEffectsDesign;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v3

    iget v4, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->bassValue:F

    iget v5, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->trebleValue:F

    move-object v6, v0

    .line 126
    invoke-static/range {v1 .. v7}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->getEqBandsBassTrebleControl(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;FF[F[F)V

    .line 132
    iget-boolean v1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->enabled:Z

    iput-boolean v1, p2, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->enabled:Z

    .line 133
    iput-boolean v8, p2, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->usePreset:Z

    const/4 v1, -0x1

    .line 134
    iput v1, p2, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->preset:I

    .line 135
    iput-object v0, p2, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->bandLevels:[F

    .line 136
    iget p1, p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;->virtualizerStrength:F

    iput p1, p2, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->virtualizerStrength:F

    .line 138
    sget-object p1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setEqualizerSettings:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 106
    check-cast p1, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;

    check-cast p2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/AudioEffectsDesign$6;->invoke(Lcom/daaw/avee/comp/EqualizerUI/EqualizerUISettings;Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V

    return-void
.end method

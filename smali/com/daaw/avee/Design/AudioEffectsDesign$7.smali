.class Lcom/daaw/avee/Design/AudioEffectsDesign$7;
.super Ljava/lang/Object;
.source "AudioEffectsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEventR1$Handler<",
        "Ljava/lang/String;",
        "Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AudioEffectsDesign;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$7;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;
    .locals 10

    .line 147
    new-instance p1, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;

    invoke-direct {p1}, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;-><init>()V

    .line 150
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_equalizerBarsValues:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->deserialize(Ljava/lang/String;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v1

    .line 151
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerBassValue:I

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    int-to-float v0, v0

    const v8, 0x3a83126f    # 0.001f

    mul-float v4, v0, v8

    .line 152
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_equalizerTrebleValue:I

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    int-to-float v0, v0

    mul-float v5, v0, v8

    .line 154
    iget-object v0, v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v0, v0

    new-array v0, v0, [F

    .line 155
    iget-object v2, v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v2, v2

    new-array v7, v2, [F

    const/4 v9, 0x0

    const/4 v2, 0x0

    .line 157
    :goto_0
    iget-object v3, v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    array-length v3, v3

    if-ge v2, v3, :cond_0

    .line 158
    iget-object v3, v1, Lcom/daaw/avee/comp/EqualizerUI/EQPreset;->points:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;

    aget-object v3, v3, v2

    iget v3, v3, Lcom/daaw/avee/comp/EqualizerUI/EQPreset$Point;->freq:F

    aput v3, v7, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 160
    :cond_0
    iget-object v2, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$7;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/AudioEffectsDesign;->access$100(Lcom/daaw/avee/Design/AudioEffectsDesign;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$7;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/AudioEffectsDesign;->access$200(Lcom/daaw/avee/Design/AudioEffectsDesign;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object v3

    move-object v6, v0

    invoke-static/range {v1 .. v7}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->getEqBandsBassTrebleControl(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;FF[F[F)V

    .line 162
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_equalizerEnabled:I

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result v1

    iput-boolean v1, p1, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->enabled:Z

    .line 163
    iput-boolean v9, p1, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->usePreset:Z

    const/4 v1, -0x1

    .line 164
    iput v1, p1, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->preset:I

    .line 165
    iput-object v0, p1, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->bandLevels:[F

    .line 167
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_virtualizerStrength:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v8

    iput v0, p1, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;->virtualizerStrength:F

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 143
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/AudioEffectsDesign$7;->invoke(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;

    move-result-object p1

    return-object p1
.end method

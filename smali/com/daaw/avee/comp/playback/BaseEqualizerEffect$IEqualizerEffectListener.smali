.class public interface abstract Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$IEqualizerEffectListener;
.super Ljava/lang/Object;
.source "BaseEqualizerEffect.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IEqualizerEffectListener"
.end annotation


# virtual methods
.method public abstract getEqualizerSettings(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;
.end method

.method public abstract isEqualizerEnabled(Ljava/lang/String;)Z
.end method

.method public abstract onEqualizerDescChanged(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V
.end method

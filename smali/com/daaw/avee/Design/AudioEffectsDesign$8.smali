.class Lcom/daaw/avee/Design/AudioEffectsDesign$8;
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AudioEffectsDesign;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$8;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 176
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_equalizerEnabled:I

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 173
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/AudioEffectsDesign$8;->invoke(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

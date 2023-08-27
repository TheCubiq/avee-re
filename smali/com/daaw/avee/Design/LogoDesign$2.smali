.class Lcom/daaw/avee/Design/LogoDesign$2;
.super Ljava/lang/Object;
.source "LogoDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/LogoDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LogoDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LogoDesign;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/daaw/avee/Design/LogoDesign$2;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 5

    .line 52
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 58
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/Design/LogoDesign$2;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v2

    const/4 v3, 0x0

    const-string v4, "pref_alwaysHideAppLogo"

    invoke-virtual {v2, v0, v4, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v1, v0}, Lcom/daaw/avee/Design/LogoDesign;->access$102(Lcom/daaw/avee/Design/LogoDesign;Z)Z

    return-void
.end method

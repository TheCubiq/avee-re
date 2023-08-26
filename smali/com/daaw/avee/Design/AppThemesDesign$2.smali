.class Lcom/daaw/avee/Design/AppThemesDesign$2;
.super Ljava/lang/Object;
.source "AppThemesDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/AppThemesDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AppThemesDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AppThemesDesign;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/daaw/avee/Design/AppThemesDesign$2;->this$0:Lcom/daaw/avee/Design/AppThemesDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/app/Activity;)V
    .locals 3

    .line 39
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    const-string v1, "pref_appTheme"

    const-string v2, "0"

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 40
    invoke-static {v0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const v0, 0x7f11001b

    .line 64
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTheme(I)V

    goto :goto_0

    :pswitch_1
    const v0, 0x7f110019

    .line 61
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTheme(I)V

    goto :goto_0

    :pswitch_2
    const v0, 0x7f110017

    .line 58
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTheme(I)V

    goto :goto_0

    :pswitch_3
    const v0, 0x7f110015

    .line 55
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTheme(I)V

    goto :goto_0

    :pswitch_4
    const v0, 0x7f110013

    .line 52
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTheme(I)V

    goto :goto_0

    :pswitch_5
    const v0, 0x7f110011

    .line 49
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTheme(I)V

    goto :goto_0

    :pswitch_6
    const v0, 0x7f11000f

    .line 46
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTheme(I)V

    goto :goto_0

    :pswitch_7
    const v0, 0x7f11000d

    .line 43
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTheme(I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 35
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/AppThemesDesign$2;->invoke(Landroid/app/Activity;)V

    return-void
.end method

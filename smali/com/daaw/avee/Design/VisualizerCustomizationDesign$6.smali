.class Lcom/daaw/avee/Design/VisualizerCustomizationDesign$6;
.super Ljava/lang/Object;
.source "VisualizerCustomizationDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerCustomizationDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$6;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string p3, "AppLogo"

    .line 123
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 v0, 0x1

    const-string v1, ""

    const/4 v2, 0x0

    if-eqz p3, :cond_0

    .line 124
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f000f

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto/16 :goto_0

    :cond_0
    const-string p3, "AudioProvider"

    .line 125
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 126
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0010

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto/16 :goto_0

    :cond_1
    const-string p3, "BlurEffect"

    .line 127
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 128
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0011

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto/16 :goto_0

    :cond_2
    const-string p3, "Composition"

    .line 129
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 130
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0012

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    const-string p3, "Image"

    .line 131
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 132
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0013

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto/16 :goto_0

    :cond_4
    const-string p3, "MirrorEffect"

    .line 133
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 134
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0014

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto :goto_0

    :cond_5
    const-string p3, "MotionBlurEffect"

    .line 135
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 136
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0015

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto :goto_0

    :cond_6
    const-string p3, "Particles"

    .line 137
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    .line 138
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0016

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto :goto_0

    :cond_7
    const-string p3, "RgbSplitEffect"

    .line 139
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 140
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0017

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto :goto_0

    :cond_8
    const-string p3, "Bars"

    .line 141
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 142
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0018

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    goto :goto_0

    :cond_9
    const-string p3, "Text"

    .line 143
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    .line 144
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const p2, 0x7f0f0019

    invoke-static {p1, v0, p2, v2, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    :cond_a
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 114
    check-cast p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$6;->invoke(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

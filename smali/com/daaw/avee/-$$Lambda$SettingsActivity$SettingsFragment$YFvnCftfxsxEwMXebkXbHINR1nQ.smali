.class public final synthetic Lcom/daaw/avee/-$$Lambda$SettingsActivity$SettingsFragment$YFvnCftfxsxEwMXebkXbHINR1nQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/-$$Lambda$SettingsActivity$SettingsFragment$YFvnCftfxsxEwMXebkXbHINR1nQ;->f$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    return-void
.end method


# virtual methods
.method public final onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/-$$Lambda$SettingsActivity$SettingsFragment$YFvnCftfxsxEwMXebkXbHINR1nQ;->f$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->lambda$addMyResetListener$0$SettingsActivity$SettingsFragment(Landroid/preference/Preference;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.class public final synthetic Lcom/daaw/ub1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# instance fields
.field public final synthetic a:Lcom/daaw/avee/SettingsActivity$a;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/SettingsActivity$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ub1;->a:Lcom/daaw/avee/SettingsActivity$a;

    return-void
.end method


# virtual methods
.method public final onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ub1;->a:Lcom/daaw/avee/SettingsActivity$a;

    invoke-static {v0, p1, p2}, Lcom/daaw/avee/SettingsActivity$a;->a(Lcom/daaw/avee/SettingsActivity$a;Landroid/preference/Preference;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

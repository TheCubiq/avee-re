.class public Lcom/daaw/avee/Common/ListPreferenceLanguage;
.super Lcom/daaw/avee/Common/ListPreferenceCompat;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/avee/Common/ListPreferenceCompat;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Common/ListPreferenceCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "en"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/z3;->o()Lcom/daaw/rk0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rk0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/daaw/rk0;->c(Ljava/lang/String;)Lcom/daaw/rk0;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/z3;->O(Lcom/daaw/rk0;)V

    return-void
.end method


# virtual methods
.method public setValue(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/avee/Common/ListPreferenceCompat;->setValue(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/avee/Common/ListPreferenceLanguage;->a(Ljava/lang/String;)V

    return-void
.end method

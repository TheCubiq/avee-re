.class public Lcom/daaw/i5;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:I = 0x1

.field public static b:I = 0x2

.field public static c:I = 0x3

.field public static d:I = 0x4


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/app/Activity;)Z
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_6

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v4, "android.permission.RECORD_AUDIO"

    invoke-virtual {p0, v4}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    const/4 v5, 0x0

    if-nez v2, :cond_2

    if-nez p0, :cond_2

    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v5

    sget p0, Lcom/daaw/i5;->d:I

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v5

    sget p0, Lcom/daaw/i5;->a:I

    goto :goto_2

    :cond_3
    if-nez p0, :cond_4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v5

    sget p0, Lcom/daaw/i5;->b:I

    goto :goto_2

    :cond_4
    const/4 p0, 0x0

    :goto_2
    if-eqz v5, :cond_6

    if-eqz p1, :cond_5

    invoke-static {p1, v5, p0}, Lcom/daaw/q0;->o(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_5
    return v3

    :cond_6
    return v1
.end method

.method public static b(Landroid/content/Context;Landroid/app/Activity;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_2

    const-string v0, "android.permission.WRITE_SETTINGS"

    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_1

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object p0

    sget v0, Lcom/daaw/i5;->c:I

    invoke-static {p1, p0, v0}, Lcom/daaw/q0;->o(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    return v1
.end method

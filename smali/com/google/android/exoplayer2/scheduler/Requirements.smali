.class public final Lcom/google/android/exoplayer2/scheduler/Requirements;
.super Ljava/lang/Object;
.source "Requirements.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/scheduler/Requirements$NetworkType;
    }
.end annotation


# static fields
.field private static final DEVICE_CHARGING:I = 0x10

.field private static final DEVICE_IDLE:I = 0x8

.field public static final NETWORK_TYPE_ANY:I = 0x1

.field private static final NETWORK_TYPE_MASK:I = 0x7

.field public static final NETWORK_TYPE_METERED:I = 0x4

.field public static final NETWORK_TYPE_NONE:I = 0x0

.field public static final NETWORK_TYPE_NOT_ROAMING:I = 0x3

.field private static final NETWORK_TYPE_STRINGS:[Ljava/lang/String; = null

.field public static final NETWORK_TYPE_UNMETERED:I = 0x2

.field private static final TAG:Ljava/lang/String; = "Requirements"


# instance fields
.field private final requirements:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput p1, p0, Lcom/google/android/exoplayer2/scheduler/Requirements;->requirements:I

    return-void
.end method

.method public constructor <init>(IZZ)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/16 p2, 0x10

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p1, p2

    if-eqz p3, :cond_1

    const/16 v0, 0x8

    :cond_1
    or-int/2addr p1, v0

    .line 92
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/scheduler/Requirements;-><init>(I)V

    return-void
.end method

.method private checkChargingRequirement(Landroid/content/Context;)Z
    .locals 4

    .line 166
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/scheduler/Requirements;->isChargingRequired()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 169
    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 170
    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    const/4 v2, -0x1

    const-string v3, "status"

    .line 174
    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    const/4 v2, 0x5

    if-ne p1, v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1
.end method

.method private checkIdleRequirement(Landroid/content/Context;)Z
    .locals 4

    .line 180
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/scheduler/Requirements;->isIdleRequired()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v0, "power"

    .line 183
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    .line 184
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v2, 0x17

    const/4 v3, 0x0

    if-lt v0, v2, :cond_2

    .line 185
    invoke-virtual {p1}, Landroid/os/PowerManager;->isDeviceIdleMode()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v2, 0x14

    if-lt v0, v2, :cond_3

    .line 186
    invoke-virtual {p1}, Landroid/os/PowerManager;->isInteractive()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    return v1
.end method

.method private static checkInternetConnectivity(Landroid/net/ConnectivityManager;)Z
    .locals 3

    .line 190
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    return v1

    .line 195
    :cond_0
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const-string p0, "No active network."

    .line 197
    invoke-static {p0}, Lcom/google/android/exoplayer2/scheduler/Requirements;->logd(Ljava/lang/String;)V

    return v2

    .line 201
    :cond_1
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object p0

    if-eqz p0, :cond_2

    const/16 v0, 0x10

    .line 204
    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p0

    if-nez p0, :cond_3

    :cond_2
    const/4 v2, 0x1

    .line 205
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Network capability validated: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/exoplayer2/scheduler/Requirements;->logd(Ljava/lang/String;)V

    xor-int/lit8 p0, v2, 0x1

    return p0
.end method

.method private checkNetworkRequirements(Landroid/content/Context;)Z
    .locals 5

    .line 132
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/scheduler/Requirements;->getRequiredNetworkType()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v2, "connectivity"

    .line 137
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    .line 138
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    .line 139
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 143
    :cond_1
    invoke-static {p1}, Lcom/google/android/exoplayer2/scheduler/Requirements;->checkInternetConnectivity(Landroid/net/ConnectivityManager;)Z

    move-result v4

    if-nez v4, :cond_2

    return v3

    :cond_2
    if-ne v0, v1, :cond_3

    return v1

    :cond_3
    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    .line 150
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isRoaming()Z

    move-result p1

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Roaming: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/exoplayer2/scheduler/Requirements;->logd(Ljava/lang/String;)V

    xor-int/2addr p1, v1

    return p1

    .line 154
    :cond_4
    invoke-static {p1, v2}, Lcom/google/android/exoplayer2/scheduler/Requirements;->isActiveNetworkMetered(Landroid/net/ConnectivityManager;Landroid/net/NetworkInfo;)Z

    move-result p1

    .line 155
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Metered network: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/exoplayer2/scheduler/Requirements;->logd(Ljava/lang/String;)V

    const/4 v2, 0x2

    if-ne v0, v2, :cond_5

    xor-int/2addr p1, v1

    return p1

    :cond_5
    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    return p1

    .line 162
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_7
    :goto_0
    const-string p1, "No network info or no connection."

    .line 140
    invoke-static {p1}, Lcom/google/android/exoplayer2/scheduler/Requirements;->logd(Ljava/lang/String;)V

    return v3
.end method

.method private static isActiveNetworkMetered(Landroid/net/ConnectivityManager;Landroid/net/NetworkInfo;)Z
    .locals 2

    .line 211
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 212
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->isActiveNetworkMetered()Z

    move-result p0

    return p0

    .line 214
    :cond_0
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result p0

    const/4 p1, 0x1

    if-eq p0, p1, :cond_1

    const/4 v0, 0x7

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static logd(Ljava/lang/String;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public checkRequirements(Landroid/content/Context;)Z
    .locals 1

    .line 121
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/scheduler/Requirements;->checkNetworkRequirements(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/scheduler/Requirements;->checkChargingRequirement(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/scheduler/Requirements;->checkIdleRequirement(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getRequiredNetworkType()I
    .locals 1

    .line 102
    iget v0, p0, Lcom/google/android/exoplayer2/scheduler/Requirements;->requirements:I

    and-int/lit8 v0, v0, 0x7

    return v0
.end method

.method public getRequirementsData()I
    .locals 1

    .line 128
    iget v0, p0, Lcom/google/android/exoplayer2/scheduler/Requirements;->requirements:I

    return v0
.end method

.method public isChargingRequired()Z
    .locals 1

    .line 107
    iget v0, p0, Lcom/google/android/exoplayer2/scheduler/Requirements;->requirements:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isIdleRequired()Z
    .locals 1

    .line 112
    iget v0, p0, Lcom/google/android/exoplayer2/scheduler/Requirements;->requirements:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 229
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

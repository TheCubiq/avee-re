.class public final Lcom/daaw/qu3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:I

.field public final B:Ljava/lang/String;

.field public C:Z

.field public a:I

.field public b:Z

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:I

.field public m:D

.field public n:Z

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public final q:Z

.field public final r:Z

.field public final s:Ljava/lang/String;

.field public final t:Z

.field public final u:Z

.field public final v:Z

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public y:F

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/g93;->c(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/daaw/qu3;->c(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/daaw/qu3;->e(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/daaw/qu3;->d(Landroid/content/Context;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "geo:0,0?q=donuts"

    invoke-static {v0, v2}, Lcom/daaw/qu3;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Lcom/daaw/qu3;->q:Z

    const-string v2, "http://www.google.com"

    invoke-static {v0, v2}, Lcom/daaw/qu3;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    iput-boolean v3, p0, Lcom/daaw/qu3;->r:Z

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/qu3;->s:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zzb()Lcom/daaw/d04;

    invoke-static {}, Lcom/daaw/d04;->x()Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/qu3;->t:Z

    invoke-static {p1}, Lcom/daaw/nt;->c(Landroid/content/Context;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/qu3;->u:Z

    invoke-static {p1}, Lcom/daaw/nt;->d(Landroid/content/Context;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/qu3;->v:Z

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/qu3;->w:Ljava/lang/String;

    const-string v1, "market://details?id=com.google.android.gms.ads"

    invoke-static {v0, v1}, Lcom/daaw/qu3;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    const-string v1, "."

    const/4 v2, 0x0

    if-nez v0, :cond_3

    :catch_0
    :cond_2
    :goto_2
    move-object v0, v2

    goto :goto_3

    :cond_3
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    :try_start_0
    invoke-static {p1}, Lcom/daaw/ez1;->a(Landroid/content/Context;)Lcom/daaw/iv0;

    move-result-object v3

    iget-object v5, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v5, v4}, Lcom/daaw/iv0;->f(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    iput-object v0, p0, Lcom/daaw/qu3;->x:Ljava/lang/String;

    :try_start_1
    invoke-static {p1}, Lcom/daaw/ez1;->a(Landroid/content/Context;)Lcom/daaw/iv0;

    move-result-object v0

    const-string v3, "com.android.vending"

    const/16 v4, 0x80

    invoke-virtual {v0, v3, v4}, Lcom/daaw/iv0;->f(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_5

    iget v3, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    nop

    :cond_5
    :goto_4
    iput-object v2, p0, Lcom/daaw/qu3;->B:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-nez p1, :cond_6

    return-void

    :cond_6
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    if-nez p1, :cond_7

    return-void

    :cond_7
    iget v0, p1, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/daaw/qu3;->y:F

    iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/daaw/qu3;->z:I

    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    iput p1, p0, Lcom/daaw/qu3;->A:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ru3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/g93;->c(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/daaw/qu3;->c(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/daaw/qu3;->e(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/daaw/qu3;->d(Landroid/content/Context;)V

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/qu3;->o:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/qu3;->p:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ia3;->g(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/qu3;->C:Z

    iget-boolean p1, p2, Lcom/daaw/ru3;->a:Z

    iput-boolean p1, p0, Lcom/daaw/qu3;->q:Z

    iget-boolean p1, p2, Lcom/daaw/ru3;->b:Z

    iput-boolean p1, p0, Lcom/daaw/qu3;->r:Z

    iget-object p1, p2, Lcom/daaw/ru3;->d:Ljava/lang/String;

    iput-object p1, p0, Lcom/daaw/qu3;->s:Ljava/lang/String;

    iget-boolean p1, p2, Lcom/daaw/ru3;->e:Z

    iput-boolean p1, p0, Lcom/daaw/qu3;->t:Z

    iget-boolean p1, p2, Lcom/daaw/ru3;->f:Z

    iput-boolean p1, p0, Lcom/daaw/qu3;->u:Z

    iget-boolean p1, p2, Lcom/daaw/ru3;->g:Z

    iput-boolean p1, p0, Lcom/daaw/qu3;->v:Z

    iget-object p1, p2, Lcom/daaw/ru3;->h:Ljava/lang/String;

    iput-object p1, p0, Lcom/daaw/qu3;->w:Ljava/lang/String;

    iget-object p1, p2, Lcom/daaw/ru3;->i:Ljava/lang/String;

    iput-object p1, p0, Lcom/daaw/qu3;->x:Ljava/lang/String;

    iget-object p1, p2, Lcom/daaw/ru3;->j:Ljava/lang/String;

    iput-object p1, p0, Lcom/daaw/qu3;->B:Ljava/lang/String;

    iget p1, p2, Lcom/daaw/ru3;->m:F

    iput p1, p0, Lcom/daaw/qu3;->y:F

    iget p1, p2, Lcom/daaw/ru3;->n:I

    iput p1, p0, Lcom/daaw/qu3;->z:I

    iget p1, p2, Lcom/daaw/ru3;->o:I

    iput p1, p0, Lcom/daaw/qu3;->A:I

    return-void
.end method

.method public static b(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;
    .locals 2

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 p1, 0x10000

    invoke-virtual {p0, v0, p1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object p1

    const-string v0, "DeviceInfo.getResolveInfo"

    invoke-virtual {p1, p0, v0}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/daaw/ru3;
    .locals 35

    move-object/from16 v0, p0

    new-instance v32, Lcom/daaw/ru3;

    move-object/from16 v1, v32

    iget v2, v0, Lcom/daaw/qu3;->a:I

    iget-boolean v3, v0, Lcom/daaw/qu3;->q:Z

    iget-boolean v4, v0, Lcom/daaw/qu3;->r:Z

    iget-object v5, v0, Lcom/daaw/qu3;->g:Ljava/lang/String;

    iget-object v6, v0, Lcom/daaw/qu3;->s:Ljava/lang/String;

    iget-boolean v7, v0, Lcom/daaw/qu3;->t:Z

    iget-boolean v8, v0, Lcom/daaw/qu3;->u:Z

    iget-boolean v9, v0, Lcom/daaw/qu3;->v:Z

    iget-boolean v10, v0, Lcom/daaw/qu3;->b:Z

    iget-boolean v11, v0, Lcom/daaw/qu3;->c:Z

    iget-object v12, v0, Lcom/daaw/qu3;->w:Ljava/lang/String;

    iget-object v13, v0, Lcom/daaw/qu3;->x:Ljava/lang/String;

    iget-object v14, v0, Lcom/daaw/qu3;->B:Ljava/lang/String;

    iget v15, v0, Lcom/daaw/qu3;->d:I

    move-object/from16 v33, v1

    iget v1, v0, Lcom/daaw/qu3;->h:I

    move/from16 v16, v1

    iget v1, v0, Lcom/daaw/qu3;->i:I

    move/from16 v17, v1

    iget v1, v0, Lcom/daaw/qu3;->j:I

    move/from16 v18, v1

    iget v1, v0, Lcom/daaw/qu3;->e:I

    move/from16 v19, v1

    iget v1, v0, Lcom/daaw/qu3;->f:I

    move/from16 v20, v1

    iget v1, v0, Lcom/daaw/qu3;->y:F

    move/from16 v21, v1

    iget v1, v0, Lcom/daaw/qu3;->z:I

    move/from16 v22, v1

    iget v1, v0, Lcom/daaw/qu3;->A:I

    move/from16 v23, v1

    move/from16 v34, v2

    iget-wide v1, v0, Lcom/daaw/qu3;->m:D

    move-wide/from16 v24, v1

    iget-boolean v1, v0, Lcom/daaw/qu3;->n:Z

    move/from16 v26, v1

    iget-boolean v1, v0, Lcom/daaw/qu3;->k:Z

    move/from16 v27, v1

    iget v1, v0, Lcom/daaw/qu3;->l:I

    move/from16 v28, v1

    iget-object v1, v0, Lcom/daaw/qu3;->o:Ljava/lang/String;

    move-object/from16 v29, v1

    iget-boolean v1, v0, Lcom/daaw/qu3;->C:Z

    move/from16 v30, v1

    iget-object v1, v0, Lcom/daaw/qu3;->p:Ljava/lang/String;

    move-object/from16 v31, v1

    move-object/from16 v1, v33

    move/from16 v2, v34

    invoke-direct/range {v1 .. v31}, Lcom/daaw/ru3;-><init>(IZZLjava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFIIDZZILjava/lang/String;ZLjava/lang/String;)V

    return-object v32
.end method

.method public final c(Landroid/content/Context;)V
    .locals 3

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Landroid/media/AudioManager;->getMode()I

    move-result v1

    iput v1, p0, Lcom/daaw/qu3;->a:I

    invoke-virtual {p1}, Landroid/media/AudioManager;->isMusicActive()Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/qu3;->b:Z

    invoke-virtual {p1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/qu3;->c:Z

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v1

    iput v1, p0, Lcom/daaw/qu3;->d:I

    invoke-virtual {p1}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v1

    iput v1, p0, Lcom/daaw/qu3;->e:I

    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/qu3;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    const-string v2, "DeviceInfo.gatherAudioInfo"

    invoke-virtual {v1, p1, v2}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    const/4 p1, -0x2

    iput p1, p0, Lcom/daaw/qu3;->a:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/qu3;->b:Z

    iput-boolean p1, p0, Lcom/daaw/qu3;->c:Z

    iput p1, p0, Lcom/daaw/qu3;->d:I

    iput v0, p0, Lcom/daaw/qu3;->e:I

    iput p1, p0, Lcom/daaw/qu3;->f:I

    return-void
.end method

.method public final d(Landroid/content/Context;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnprotectedReceiver"
        }
    .end annotation

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/daaw/g93;->e9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v1, v3, :cond_0

    const/4 v1, 0x4

    invoke-virtual {p1, v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const-string v1, "status"

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "level"

    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    int-to-float v3, v3

    const-string v4, "scale"

    invoke-virtual {p1, v4, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v3, p1

    float-to-double v2, v3

    iput-wide v2, p0, Lcom/daaw/qu3;->m:D

    const/4 p1, 0x2

    const/4 v2, 0x1

    if-eq v1, p1, :cond_1

    const/4 p1, 0x5

    if-ne v1, p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    iput-boolean v0, p0, Lcom/daaw/qu3;->n:Z

    return-void

    :cond_3
    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    iput-wide v1, p0, Lcom/daaw/qu3;->m:D

    iput-boolean v0, p0, Lcom/daaw/qu3;->n:Z

    return-void
.end method

.method public final e(Landroid/content/Context;)V
    .locals 5

    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    const-string v1, "connectivity"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/qu3;->g:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/vw0;->k()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    sget-object v2, Lcom/daaw/g93;->F7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v2

    :goto_0
    iput v2, p0, Lcom/daaw/qu3;->i:I

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result v0

    iput v0, p0, Lcom/daaw/qu3;->j:I

    const/4 v0, -0x2

    iput v0, p0, Lcom/daaw/qu3;->h:I

    iput-boolean v3, p0, Lcom/daaw/qu3;->k:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/qu3;->l:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p1, v2}, Lcom/google/android/gms/ads/internal/util/zzs;->zzx(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    iput v0, p0, Lcom/daaw/qu3;->h:I

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getDetailedState()Landroid/net/NetworkInfo$DetailedState;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result p1

    iput p1, p0, Lcom/daaw/qu3;->l:I

    goto :goto_1

    :cond_1
    iput v0, p0, Lcom/daaw/qu3;->h:I

    :goto_1
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->isActiveNetworkMetered()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/qu3;->k:Z

    :cond_2
    return-void
.end method

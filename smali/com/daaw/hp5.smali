.class public final Lcom/daaw/hp5;
.super Lcom/daaw/ip5;
.source ""


# static fields
.field public static final h:Landroid/util/SparseArray;


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Lcom/daaw/op4;

.field public final e:Landroid/telephony/TelephonyManager;

.field public final f:Lcom/daaw/zo5;

.field public g:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/daaw/hp5;->h:Landroid/util/SparseArray;

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->CONNECTED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    sget-object v2, Lcom/daaw/x63;->s:Lcom/daaw/x63;

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->AUTHENTICATING:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    sget-object v2, Lcom/daaw/x63;->r:Lcom/daaw/x63;

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->CONNECTING:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->OBTAINING_IPADDR:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->DISCONNECTING:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    sget-object v3, Lcom/daaw/x63;->t:Lcom/daaw/x63;

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->BLOCKED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    sget-object v3, Lcom/daaw/x63;->u:Lcom/daaw/x63;

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->DISCONNECTED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->FAILED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->IDLE:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->SCANNING:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->SUSPENDED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    sget-object v3, Lcom/daaw/x63;->v:Lcom/daaw/x63;

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->CAPTIVE_PORTAL_CHECK:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->VERIFYING_POOR_LINK:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Landroid/net/NetworkInfo$DetailedState;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/op4;Lcom/daaw/zo5;Lcom/daaw/so5;Lcom/google/android/gms/ads/internal/util/zzg;)V
    .locals 0

    invoke-direct {p0, p4, p5}, Lcom/daaw/ip5;-><init>(Lcom/daaw/so5;Lcom/google/android/gms/ads/internal/util/zzg;)V

    iput-object p1, p0, Lcom/daaw/hp5;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/hp5;->d:Lcom/daaw/op4;

    iput-object p3, p0, Lcom/daaw/hp5;->f:Lcom/daaw/zo5;

    const-string p2, "phone"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    iput-object p1, p0, Lcom/daaw/hp5;->e:Landroid/telephony/TelephonyManager;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/hp5;Landroid/os/Bundle;)Lcom/daaw/o63;
    .locals 4

    invoke-static {}, Lcom/daaw/o63;->L()Lcom/daaw/c63;

    move-result-object v0

    const-string v1, "cnt"

    const/4 v2, -0x2

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "gnt"

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    const/4 v2, 0x2

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    iput v2, p0, Lcom/daaw/hp5;->g:I

    goto :goto_2

    :cond_0
    const/4 v3, 0x1

    iput v3, p0, Lcom/daaw/hp5;->g:I

    const/4 p0, 0x3

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    invoke-virtual {v0, v3}, Lcom/daaw/c63;->t(I)Lcom/daaw/c63;

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p0}, Lcom/daaw/c63;->t(I)Lcom/daaw/c63;

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v2}, Lcom/daaw/c63;->t(I)Lcom/daaw/c63;

    :goto_0
    packed-switch p1, :pswitch_data_0

    const/4 v2, 0x1

    goto :goto_1

    :pswitch_0
    const/4 v2, 0x5

    goto :goto_1

    :pswitch_1
    const/4 v2, 0x3

    :goto_1
    :pswitch_2
    invoke-virtual {v0, v2}, Lcom/daaw/c63;->s(I)Lcom/daaw/c63;

    :goto_2
    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/o63;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static bridge synthetic c(Lcom/daaw/hp5;Landroid/os/Bundle;)Lcom/daaw/x63;
    .locals 1

    const-string p0, "device"

    invoke-static {p1, p0}, Lcom/daaw/cj6;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "network"

    invoke-static {p0, p1}, Lcom/daaw/cj6;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "active_network_state"

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    sget-object p1, Lcom/daaw/hp5;->h:Landroid/util/SparseArray;

    sget-object v0, Lcom/daaw/x63;->q:Lcom/daaw/x63;

    invoke-virtual {p1, p0, v0}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/x63;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/hp5;)Lcom/daaw/zo5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/hp5;->f:Lcom/daaw/zo5;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/hp5;ZLjava/util/ArrayList;Lcom/daaw/o63;Lcom/daaw/x63;)[B
    .locals 5

    invoke-static {}, Lcom/daaw/t63;->T()Lcom/daaw/s63;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/s63;->s(Ljava/lang/Iterable;)Lcom/daaw/s63;

    iget-object p2, p0, Lcom/daaw/hp5;->c:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    const-string v1, "airplane_mode_on"

    const/4 v2, 0x0

    invoke-static {p2, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p2

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lcom/daaw/hp5;->g(Z)I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/daaw/s63;->A(I)Lcom/daaw/s63;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzq()Lcom/google/android/gms/ads/internal/util/zzaa;

    move-result-object p2

    iget-object v3, p0, Lcom/daaw/hp5;->c:Landroid/content/Context;

    iget-object v4, p0, Lcom/daaw/hp5;->e:Landroid/telephony/TelephonyManager;

    invoke-virtual {p2, v3, v4}, Lcom/google/android/gms/ads/internal/util/zzaa;->zzi(Landroid/content/Context;Landroid/telephony/TelephonyManager;)I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/daaw/s63;->B(I)Lcom/daaw/s63;

    iget-object p2, p0, Lcom/daaw/hp5;->f:Lcom/daaw/zo5;

    invoke-virtual {p2}, Lcom/daaw/zo5;->e()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/daaw/s63;->x(J)Lcom/daaw/s63;

    iget-object p2, p0, Lcom/daaw/hp5;->f:Lcom/daaw/zo5;

    invoke-virtual {p2}, Lcom/daaw/zo5;->b()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/daaw/s63;->w(J)Lcom/daaw/s63;

    iget-object p2, p0, Lcom/daaw/hp5;->f:Lcom/daaw/zo5;

    invoke-virtual {p2}, Lcom/daaw/zo5;->a()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/daaw/s63;->t(I)Lcom/daaw/s63;

    invoke-virtual {v0, p4}, Lcom/daaw/s63;->u(Lcom/daaw/x63;)Lcom/daaw/s63;

    invoke-virtual {v0, p3}, Lcom/daaw/s63;->v(Lcom/daaw/o63;)Lcom/daaw/s63;

    iget p2, p0, Lcom/daaw/hp5;->g:I

    invoke-virtual {v0, p2}, Lcom/daaw/s63;->C(I)Lcom/daaw/s63;

    invoke-static {p1}, Lcom/daaw/hp5;->g(Z)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/s63;->D(I)Lcom/daaw/s63;

    iget-object p1, p0, Lcom/daaw/hp5;->f:Lcom/daaw/zo5;

    invoke-virtual {p1}, Lcom/daaw/zo5;->d()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/s63;->z(J)Lcom/daaw/s63;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/ag;->a()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/s63;->y(J)Lcom/daaw/s63;

    iget-object p0, p0, Lcom/daaw/hp5;->c:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p1, "wifi_on"

    invoke-static {p0, p1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_1

    const/4 v2, 0x1

    :cond_1
    invoke-static {v2}, Lcom/daaw/hp5;->g(Z)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/daaw/s63;->E(I)Lcom/daaw/s63;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/t63;

    invoke-virtual {p0}, Lcom/daaw/hq7;->a()[B

    move-result-object p0

    return-object p0
.end method

.method public static final g(Z)I
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final e(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/hp5;->d:Lcom/daaw/op4;

    invoke-virtual {v0}, Lcom/daaw/op4;->b()Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/gp5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/gp5;-><init>(Lcom/daaw/hp5;Z)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method
